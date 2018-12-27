package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class MultiDexExtractor implements Closeable {
    /* renamed from: a */
    private final File f843a;
    /* renamed from: b */
    private final long f844b;
    /* renamed from: c */
    private final File f845c;
    /* renamed from: d */
    private final RandomAccessFile f846d;
    /* renamed from: e */
    private final FileChannel f847e;
    /* renamed from: f */
    private final FileLock f848f;

    /* renamed from: android.support.multidex.MultiDexExtractor$1 */
    class C02231 implements FileFilter {
        /* renamed from: a */
        final /* synthetic */ MultiDexExtractor f842a;

        C02231(MultiDexExtractor multiDexExtractor) {
            this.f842a = multiDexExtractor;
        }

        public boolean accept(File file) {
            return file.getName().equals("MultiDex.lock") ^ 1;
        }
    }

    private static class ExtractedDex extends File {
        public long crc = -1;

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    MultiDexExtractor(File file, File file2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiDexExtractor(");
        stringBuilder.append(file.getPath());
        stringBuilder.append(", ");
        stringBuilder.append(file2.getPath());
        stringBuilder.append(")");
        Log.i("MultiDex", stringBuilder.toString());
        this.f843a = file;
        this.f845c = file2;
        this.f844b = m826b(file);
        file = new File(file2, "MultiDex.lock");
        this.f846d = new RandomAccessFile(file, "rw");
        try {
            this.f847e = this.f846d.getChannel();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Blocking on lock ");
            stringBuilder2.append(file.getPath());
            Log.i("MultiDex", stringBuilder2.toString());
            this.f848f = this.f847e.lock();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(file.getPath());
            stringBuilder2.append(" locked");
            Log.i("MultiDex", stringBuilder2.toString());
        } catch (File file3) {
            m823a(this.f847e);
            throw file3;
        } catch (File file32) {
            m823a(this.f846d);
            throw file32;
        }
    }

    /* renamed from: a */
    List<? extends File> m828a(Context context, String str, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiDexExtractor.load(");
        stringBuilder.append(this.f843a.getPath());
        stringBuilder.append(", ");
        stringBuilder.append(z);
        stringBuilder.append(", ");
        stringBuilder.append(str);
        stringBuilder.append(")");
        Log.i("MultiDex", stringBuilder.toString());
        if (this.f848f.isValid()) {
            if (z || m825a(context, this.f843a, this.f844b, str)) {
                if (z) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                z = m820a();
                m822a(context, str, m818a(this.f843a), this.f844b, z);
            } else {
                try {
                    z = m821a(context, str);
                } catch (boolean z2) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", z2);
                    z2 = m820a();
                    m822a(context, str, m818a(this.f843a), this.f844b, z2);
                }
            }
            str = new StringBuilder();
            str.append("load found ");
            str.append(z2.size());
            str.append(" secondary dex files");
            Log.i("MultiDex", str.toString());
            return z2;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public void close() {
        this.f848f.release();
        this.f847e.close();
        this.f846d.close();
    }

    /* renamed from: a */
    private List<ExtractedDex> m821a(Context context, String str) {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f843a.getName());
        stringBuilder.append(".classes");
        String stringBuilder2 = stringBuilder.toString();
        SharedPreferences a = m819a(context);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append("dex.number");
        int i = a.getInt(stringBuilder3.toString(), 1);
        List<ExtractedDex> arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append(i2);
            stringBuilder4.append(".zip");
            File extractedDex = new ExtractedDex(r0.f845c, stringBuilder4.toString());
            if (extractedDex.isFile()) {
                extractedDex.crc = m826b(extractedDex);
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append("dex.crc.");
                stringBuilder4.append(i2);
                long j = a.getLong(stringBuilder4.toString(), -1);
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append("dex.time.");
                stringBuilder4.append(i2);
                long j2 = a.getLong(stringBuilder4.toString(), -1);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified) {
                    String str3 = stringBuilder2;
                    SharedPreferences sharedPreferences = a;
                    if (j == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i2++;
                        stringBuilder2 = str3;
                        a = sharedPreferences;
                    }
                }
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("Invalid extracted dex: ");
                stringBuilder5.append(extractedDex);
                stringBuilder5.append(" (key \"");
                stringBuilder5.append(str2);
                stringBuilder5.append("\"), expected modification time: ");
                stringBuilder5.append(j2);
                stringBuilder5.append(", modification time: ");
                stringBuilder5.append(lastModified);
                stringBuilder5.append(", expected crc: ");
                stringBuilder5.append(j);
                stringBuilder5.append(", file crc: ");
                stringBuilder5.append(extractedDex.crc);
                throw new IOException(stringBuilder5.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Missing extracted secondary dex file '");
            stringBuilder.append(extractedDex.getPath());
            stringBuilder.append("'");
            throw new IOException(stringBuilder.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m825a(Context context, File file, long j, String str) {
        context = m819a(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("timestamp");
        if (context.getLong(stringBuilder.toString(), -1) == m818a(file)) {
            file = new StringBuilder();
            file.append(str);
            file.append("crc");
            if (context.getLong(file.toString(), -1) == j) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static long m818a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: b */
    private static long m826b(File file) {
        long a = C0230b.m850a(file);
        return a == -1 ? a - 1 : a;
    }

    /* renamed from: a */
    private List<ExtractedDex> m820a() {
        File extractedDex;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.f843a.getName());
        stringBuilder2.append(".classes");
        String stringBuilder3 = stringBuilder2.toString();
        m827b();
        List<ExtractedDex> arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f843a);
        int i = 2;
        Object obj;
        try {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("classes");
            stringBuilder4.append(2);
            stringBuilder4.append(".dex");
            ZipEntry entry = zipFile.getEntry(stringBuilder4.toString());
            while (entry != null) {
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(stringBuilder3);
                stringBuilder5.append(i);
                stringBuilder5.append(".zip");
                extractedDex = new ExtractedDex(this.f845c, stringBuilder5.toString());
                arrayList.add(extractedDex);
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append("Extraction is needed for file ");
                stringBuilder6.append(extractedDex);
                Log.i("MultiDex", stringBuilder6.toString());
                int i2 = 0;
                obj = null;
                while (i2 < 3 && obj == null) {
                    i2++;
                    m824a(zipFile, entry, extractedDex, stringBuilder3);
                    extractedDex.crc = m826b(extractedDex);
                    obj = 1;
                    String str = "MultiDex";
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Extraction ");
                    stringBuilder.append(obj != null ? "succeeded" : "failed");
                    stringBuilder.append(" '");
                    stringBuilder.append(extractedDex.getAbsolutePath());
                    stringBuilder.append("': length ");
                    stringBuilder.append(extractedDex.length());
                    stringBuilder.append(" - crc: ");
                    stringBuilder.append(extractedDex.crc);
                    Log.i(str, stringBuilder.toString());
                    if (obj == null) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Failed to delete corrupted secondary dex '");
                            stringBuilder.append(extractedDex.getPath());
                            stringBuilder.append("'");
                            Log.w("MultiDex", stringBuilder.toString());
                        }
                    }
                }
                if (obj != null) {
                    i++;
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("classes");
                    stringBuilder4.append(i);
                    stringBuilder4.append(".dex");
                    entry = zipFile.getEntry(stringBuilder4.toString());
                } else {
                    StringBuilder stringBuilder7 = new StringBuilder();
                    stringBuilder7.append("Could not create zip file ");
                    stringBuilder7.append(extractedDex.getAbsolutePath());
                    stringBuilder7.append(" for secondary dex (");
                    stringBuilder7.append(i);
                    stringBuilder7.append(")");
                    throw new IOException(stringBuilder7.toString());
                }
            }
            try {
                zipFile.close();
            } catch (Throwable e) {
                Log.w("MultiDex", "Failed to close resource", e);
            }
            return arrayList;
        } catch (Throwable e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to read crc from ");
            stringBuilder.append(extractedDex.getAbsolutePath());
            Log.w("MultiDex", stringBuilder.toString(), e2);
            obj = null;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (Throwable e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
        }
    }

    /* renamed from: a */
    private static void m822a(Context context, String str, long j, long j2, List<ExtractedDex> list) {
        context = m819a(context).edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("timestamp");
        context.putLong(stringBuilder.toString(), j);
        j = new StringBuilder();
        j.append(str);
        j.append("crc");
        context.putLong(j.toString(), j2);
        j = new StringBuilder();
        j.append(str);
        j.append("dex.number");
        context.putInt(j.toString(), list.size() + 1);
        int i = 2;
        for (ExtractedDex extractedDex : list) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("dex.crc.");
            stringBuilder2.append(i);
            context.putLong(stringBuilder2.toString(), extractedDex.crc);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("dex.time.");
            stringBuilder2.append(i);
            context.putLong(stringBuilder2.toString(), extractedDex.lastModified());
            i++;
        }
        context.commit();
    }

    /* renamed from: a */
    private static SharedPreferences m819a(Context context) {
        return context.getSharedPreferences("multidex.version", VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: b */
    private void m827b() {
        File[] listFiles = this.f845c.listFiles(new C02231(this));
        if (listFiles == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to list secondary dex dir content (");
            stringBuilder.append(this.f845c.getPath());
            stringBuilder.append(").");
            Log.w("MultiDex", stringBuilder.toString());
            return;
        }
        for (File file : listFiles) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Trying to delete old file ");
            stringBuilder2.append(file.getPath());
            stringBuilder2.append(" of size ");
            stringBuilder2.append(file.length());
            Log.i("MultiDex", stringBuilder2.toString());
            if (file.delete()) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Deleted old file ");
                stringBuilder2.append(file.getPath());
                Log.i("MultiDex", stringBuilder2.toString());
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Failed to delete old file ");
                stringBuilder2.append(file.getPath());
                Log.w("MultiDex", stringBuilder2.toString());
            }
        }
    }

    /* renamed from: a */
    private static void m824a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        Closeable inputStream = zipFile.getInputStream(zipEntry);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tmp-");
        stringBuilder.append(str);
        str = File.createTempFile(stringBuilder.toString(), ".zip", file.getParentFile());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Extracting ");
        stringBuilder2.append(str.getPath());
        Log.i("MultiDex", stringBuilder2.toString());
        ZipOutputStream zipOutputStream;
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            zipEntry = new byte[16384];
            for (int read = inputStream.read(zipEntry); read != -1; read = inputStream.read(zipEntry)) {
                zipOutputStream.write(zipEntry, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (str.setReadOnly() != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Renaming to ");
                stringBuilder.append(file.getPath());
                Log.i("MultiDex", stringBuilder.toString());
                if (str.renameTo(file) != null) {
                    m823a(inputStream);
                    str.delete();
                    return;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to rename \"");
                stringBuilder.append(str.getAbsolutePath());
                stringBuilder.append("\" to \"");
                stringBuilder.append(file.getAbsolutePath());
                stringBuilder.append("\"");
                throw new IOException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to mark readonly \"");
            stringBuilder.append(str.getAbsolutePath());
            stringBuilder.append("\" (tmp of \"");
            stringBuilder.append(file.getAbsolutePath());
            stringBuilder.append("\")");
            throw new IOException(stringBuilder.toString());
        } catch (Throwable th) {
            m823a(inputStream);
            str.delete();
        }
    }

    /* renamed from: a */
    private static void m823a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Closeable closeable2) {
            Log.w("MultiDex", "Failed to close resource", closeable2);
        }
    }
}
