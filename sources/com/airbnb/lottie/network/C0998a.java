package com.airbnb.lottie.network;

import android.content.Context;
import com.airbnb.lottie.C0949c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: com.airbnb.lottie.network.a */
class C0998a {
    /* renamed from: a */
    private final Context f3364a;
    /* renamed from: b */
    private final String f3365b;

    C0998a(Context context, String str) {
        this.f3364a = context.getApplicationContext();
        this.f3365b = str;
    }

    /* renamed from: a */
    android.support.v4.p017f.C0429j<com.airbnb.lottie.network.FileExtension, java.io.InputStream> m4307a() {
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
        r5 = this;
        r0 = 0;
        r1 = r5.f3365b;	 Catch:{ FileNotFoundException -> 0x0049 }
        r1 = r5.m4305a(r1);	 Catch:{ FileNotFoundException -> 0x0049 }
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r2 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0048 }
        r2.<init>(r1);	 Catch:{ FileNotFoundException -> 0x0048 }
        r0 = r1.getAbsolutePath();
        r3 = ".zip";
        r0 = r0.endsWith(r3);
        if (r0 == 0) goto L_0x001e;
    L_0x001b:
        r0 = com.airbnb.lottie.network.FileExtension.Zip;
        goto L_0x0020;
    L_0x001e:
        r0 = com.airbnb.lottie.network.FileExtension.Json;
    L_0x0020:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Cache hit for ";
        r3.append(r4);
        r4 = r5.f3365b;
        r3.append(r4);
        r4 = " at ";
        r3.append(r4);
        r1 = r1.getAbsolutePath();
        r3.append(r1);
        r1 = r3.toString();
        com.airbnb.lottie.C0949c.m4076a(r1);
        r1 = new android.support.v4.f.j;
        r1.<init>(r0, r2);
        return r1;
    L_0x0048:
        return r0;
    L_0x0049:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.network.a.a():android.support.v4.f.j<com.airbnb.lottie.network.FileExtension, java.io.InputStream>");
    }

    /* renamed from: a */
    File m4308a(InputStream inputStream, FileExtension fileExtension) {
        File file = new File(this.f3364a.getCacheDir(), C0998a.m4306a(this.f3365b, fileExtension, true));
        try {
            fileExtension = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileExtension.write(bArr, 0, read);
                } else {
                    fileExtension.flush();
                    fileExtension.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
        }
    }

    /* renamed from: a */
    void m4309a(FileExtension fileExtension) {
        File file = new File(this.f3364a.getCacheDir(), C0998a.m4306a(this.f3365b, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        fileExtension = file.renameTo(file2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Copying temp file to real file (");
        stringBuilder.append(file2);
        stringBuilder.append(")");
        C0949c.m4076a(stringBuilder.toString());
        if (fileExtension == null) {
            fileExtension = new StringBuilder();
            fileExtension.append("Unable to rename cache file ");
            fileExtension.append(file.getAbsolutePath());
            fileExtension.append(" to ");
            fileExtension.append(file2.getAbsolutePath());
            fileExtension.append(".");
            C0949c.m4077b(fileExtension.toString());
        }
    }

    /* renamed from: a */
    private File m4305a(String str) {
        File file = new File(this.f3364a.getCacheDir(), C0998a.m4306a(str, FileExtension.Json, false));
        if (file.exists()) {
            return file;
        }
        file = new File(this.f3364a.getCacheDir(), C0998a.m4306a(str, FileExtension.Zip, false));
        return file.exists() != null ? file : null;
    }

    /* renamed from: a */
    private static String m4306a(String str, FileExtension fileExtension, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lottie_cache_");
        stringBuilder.append(str.replaceAll("\\W+", ""));
        stringBuilder.append(z ? fileExtension.extension : fileExtension.m4304a());
        return stringBuilder.toString();
    }
}
