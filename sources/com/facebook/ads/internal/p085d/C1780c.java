package com.facebook.ads.internal.p085d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p101q.p103b.C1941c;
import com.facebook.ads.internal.p101q.p104c.C1948d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.facebook.ads.internal.d.c */
public class C1780c {
    /* renamed from: a */
    private static final String f5369a = "c";
    /* renamed from: b */
    private static C1780c f5370b;
    /* renamed from: c */
    private final Context f5371c;

    private C1780c(Context context) {
        this.f5371c = context;
    }

    /* renamed from: a */
    private Bitmap m6691a(String str) {
        byte[] d = C1948d.m7354a(this.f5371c).m7087a(str, null).m7117d();
        return BitmapFactory.decodeByteArray(d, 0, d.length);
    }

    /* renamed from: a */
    public static C1780c m6692a(Context context) {
        if (f5370b == null) {
            context = context.getApplicationContext();
            synchronized (C1780c.class) {
                if (f5370b == null) {
                    f5370b = new C1780c(context);
                }
            }
        }
        return f5370b;
    }

    /* renamed from: a */
    private static void m6693a(java.io.Closeable r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        if (r0 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0.close();	 Catch:{ IOException -> 0x0006 }
    L_0x0006:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.d.c.a(java.io.Closeable):void");
    }

    /* renamed from: a */
    private void m6694a(String str, Bitmap bitmap) {
        Closeable fileOutputStream;
        Throwable e;
        String str2;
        StringBuilder stringBuilder;
        Closeable closeable;
        Throwable th;
        File cacheDir = this.f5371c.getCacheDir();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str.hashCode());
        stringBuilder2.append(".png");
        File file = new File(cacheDir, stringBuilder2.toString());
        Closeable closeable2 = null;
        try {
            Closeable byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
                if (byteArrayOutputStream.size() >= 3145728) {
                    Log.d(f5369a, "Bitmap size exceeds max size for storage");
                    C1780c.m6693a(byteArrayOutputStream);
                    C1780c.m6693a(null);
                    return;
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    byteArrayOutputStream.writeTo(fileOutputStream);
                    fileOutputStream.flush();
                    C1780c.m6693a(byteArrayOutputStream);
                } catch (FileNotFoundException e2) {
                    e = e2;
                    closeable2 = byteArrayOutputStream;
                    str2 = f5369a;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Bad output destination (file=");
                    stringBuilder.append(file.getAbsolutePath());
                    stringBuilder.append(").");
                    Log.e(str2, stringBuilder.toString(), e);
                    C1780c.m6693a(closeable2);
                    C1780c.m6693a(fileOutputStream);
                } catch (Throwable e3) {
                    closeable2 = byteArrayOutputStream;
                    Throwable th2 = e3;
                    closeable = fileOutputStream;
                    th = th2;
                    try {
                        str2 = f5369a;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unable to write bitmap to file (url=");
                        stringBuilder.append(str);
                        stringBuilder.append(").");
                        Log.e(str2, stringBuilder.toString(), th);
                        C1780c.m6693a(closeable2);
                        C1780c.m6693a(closeable);
                    } catch (Throwable th3) {
                        e = th3;
                        fileOutputStream = closeable;
                        C1780c.m6693a(closeable2);
                        C1780c.m6693a(fileOutputStream);
                        throw e;
                    }
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    closeable2 = byteArrayOutputStream;
                    try {
                        Log.e(f5369a, "Unable to write bitmap to output stream", e);
                        C1780c.m6693a(closeable2);
                        C1780c.m6693a(fileOutputStream);
                    } catch (Throwable th4) {
                        e = th4;
                        C1780c.m6693a(closeable2);
                        C1780c.m6693a(fileOutputStream);
                        throw e;
                    }
                } catch (Throwable th5) {
                    e = th5;
                    closeable2 = byteArrayOutputStream;
                    C1780c.m6693a(closeable2);
                    C1780c.m6693a(fileOutputStream);
                    throw e;
                }
                C1780c.m6693a(fileOutputStream);
            } catch (FileNotFoundException e5) {
                e = e5;
                fileOutputStream = null;
                closeable2 = byteArrayOutputStream;
                str2 = f5369a;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Bad output destination (file=");
                stringBuilder.append(file.getAbsolutePath());
                stringBuilder.append(").");
                Log.e(str2, stringBuilder.toString(), e);
                C1780c.m6693a(closeable2);
                C1780c.m6693a(fileOutputStream);
            } catch (IOException e6) {
                th = e6;
                closeable = null;
                closeable2 = byteArrayOutputStream;
                str2 = f5369a;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to write bitmap to file (url=");
                stringBuilder.append(str);
                stringBuilder.append(").");
                Log.e(str2, stringBuilder.toString(), th);
                C1780c.m6693a(closeable2);
                C1780c.m6693a(closeable);
            } catch (OutOfMemoryError e7) {
                e = e7;
                fileOutputStream = null;
                closeable2 = byteArrayOutputStream;
                Log.e(f5369a, "Unable to write bitmap to output stream", e);
                C1780c.m6693a(closeable2);
                C1780c.m6693a(fileOutputStream);
            } catch (Throwable th6) {
                e = th6;
                fileOutputStream = null;
                closeable2 = byteArrayOutputStream;
                C1780c.m6693a(closeable2);
                C1780c.m6693a(fileOutputStream);
                throw e;
            }
        } catch (FileNotFoundException e8) {
            e = e8;
            fileOutputStream = null;
            str2 = f5369a;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Bad output destination (file=");
            stringBuilder.append(file.getAbsolutePath());
            stringBuilder.append(").");
            Log.e(str2, stringBuilder.toString(), e);
            C1780c.m6693a(closeable2);
            C1780c.m6693a(fileOutputStream);
        } catch (IOException e9) {
            th = e9;
            closeable = null;
            str2 = f5369a;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to write bitmap to file (url=");
            stringBuilder.append(str);
            stringBuilder.append(").");
            Log.e(str2, stringBuilder.toString(), th);
            C1780c.m6693a(closeable2);
            C1780c.m6693a(closeable);
        } catch (OutOfMemoryError e10) {
            e = e10;
            fileOutputStream = null;
            Log.e(f5369a, "Unable to write bitmap to output stream", e);
            C1780c.m6693a(closeable2);
            C1780c.m6693a(fileOutputStream);
        } catch (Throwable th7) {
            e = th7;
            fileOutputStream = null;
            C1780c.m6693a(closeable2);
            C1780c.m6693a(fileOutputStream);
            throw e;
        }
    }

    /* renamed from: a */
    private boolean m6695a(int i, int i2) {
        return i > 0 && i2 > 0 && C1820a.m6849d(this.f5371c);
    }

    /* renamed from: b */
    private Bitmap m6696b(String str, int i, int i2) {
        try {
            Bitmap a = m6695a(i, i2) ? C1941c.m7342a(str.substring("file://".length()), i, i2) : BitmapFactory.decodeStream(new FileInputStream(str.substring("file://".length())), null, null);
            m6694a(str, a);
            return a;
        } catch (Throwable e) {
            String str2 = f5369a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to copy local image into cache (url=");
            stringBuilder.append(str);
            stringBuilder.append(").");
            Log.e(str2, stringBuilder.toString(), e);
            return null;
        }
    }

    /* renamed from: c */
    private android.graphics.Bitmap m6697c(java.lang.String r5, int r6, int r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = "asset:///";
        r0 = r5.startsWith(r0);
        if (r0 == 0) goto L_0x0045;
    L_0x0008:
        r0 = 0;
        r1 = r4.f5371c;	 Catch:{ IOException -> 0x003e, all -> 0x0037 }
        r1 = r1.getAssets();	 Catch:{ IOException -> 0x003e, all -> 0x0037 }
        r2 = 9;	 Catch:{ IOException -> 0x003e, all -> 0x0037 }
        r3 = r5.length();	 Catch:{ IOException -> 0x003e, all -> 0x0037 }
        r2 = r5.substring(r2, r3);	 Catch:{ IOException -> 0x003e, all -> 0x0037 }
        r1 = r1.open(r2);	 Catch:{ IOException -> 0x003e, all -> 0x0037 }
        r2 = r4.m6695a(r6, r7);	 Catch:{ IOException -> 0x0035, all -> 0x0032 }
        if (r2 == 0) goto L_0x0028;	 Catch:{ IOException -> 0x0035, all -> 0x0032 }
    L_0x0023:
        r6 = com.facebook.ads.internal.p101q.p103b.C1941c.m7341a(r1, r6, r7);	 Catch:{ IOException -> 0x0035, all -> 0x0032 }
        goto L_0x002c;	 Catch:{ IOException -> 0x0035, all -> 0x0032 }
    L_0x0028:
        r6 = android.graphics.BitmapFactory.decodeStream(r1);	 Catch:{ IOException -> 0x0035, all -> 0x0032 }
    L_0x002c:
        if (r1 == 0) goto L_0x0054;
    L_0x002e:
        com.facebook.ads.internal.p085d.C1780c.m6693a(r1);
        goto L_0x0054;
    L_0x0032:
        r5 = move-exception;
        r0 = r1;
        goto L_0x0038;
        goto L_0x003f;
    L_0x0037:
        r5 = move-exception;
    L_0x0038:
        if (r0 == 0) goto L_0x003d;
    L_0x003a:
        com.facebook.ads.internal.p085d.C1780c.m6693a(r0);
    L_0x003d:
        throw r5;
    L_0x003e:
        r1 = r0;
    L_0x003f:
        if (r1 == 0) goto L_0x0044;
    L_0x0041:
        com.facebook.ads.internal.p085d.C1780c.m6693a(r1);
    L_0x0044:
        return r0;
    L_0x0045:
        r0 = r4.m6695a(r6, r7);
        if (r0 == 0) goto L_0x0050;
    L_0x004b:
        r6 = r4.m6698d(r5, r6, r7);	 Catch:{ IOException -> 0x0050 }
        goto L_0x0054;
    L_0x0050:
        r6 = r4.m6691a(r5);
    L_0x0054:
        r4.m6694a(r5, r6);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.d.c.c(java.lang.String, int, int):android.graphics.Bitmap");
    }

    /* renamed from: d */
    private Bitmap m6698d(String str, int i, int i2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        Closeable inputStream = httpURLConnection.getInputStream();
        Bitmap a = C1941c.m7341a((InputStream) inputStream, i, i2);
        C1780c.m6693a(inputStream);
        return a;
    }

    /* renamed from: a */
    public Bitmap m6699a(String str, int i, int i2) {
        File cacheDir = this.f5371c.getCacheDir();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.hashCode());
        stringBuilder.append(".png");
        File file = new File(cacheDir, stringBuilder.toString());
        if (file.exists()) {
            return m6695a(i, i2) ? C1941c.m7342a(file.getAbsolutePath(), i, i2) : BitmapFactory.decodeFile(file.getAbsolutePath());
        }
        return str.startsWith("file://") ? m6696b(str, i, i2) : m6697c(str, i, i2);
    }
}
