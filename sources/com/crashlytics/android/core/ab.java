package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;

final class ab {
    /* renamed from: a */
    static byte[] m5461a(java.io.File r2) {
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
        r0 = 0;
        r1 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x001b, IOException -> 0x0016, all -> 0x0011 }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x001b, IOException -> 0x0016, all -> 0x0011 }
        r2 = m5463a(r1);	 Catch:{ FileNotFoundException -> 0x001c, IOException -> 0x0017, all -> 0x000e }
        io.fabric.sdk.android.services.common.CommonUtils.m13612a(r1);
        return r2;
    L_0x000e:
        r2 = move-exception;
        r0 = r1;
        goto L_0x0012;
    L_0x0011:
        r2 = move-exception;
    L_0x0012:
        io.fabric.sdk.android.services.common.CommonUtils.m13612a(r0);
        throw r2;
    L_0x0016:
        r1 = r0;
    L_0x0017:
        io.fabric.sdk.android.services.common.CommonUtils.m13612a(r1);
        return r0;
    L_0x001b:
        r1 = r0;
    L_0x001c:
        io.fabric.sdk.android.services.common.CommonUtils.m13612a(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.ab.a(java.io.File):byte[]");
    }

    /* renamed from: a */
    private static byte[] m5463a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    private static File m5459a(File file, String str) {
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: b */
    static byte[] m5464b(File file) {
        file = m5459a(file, ".dmp");
        return file == null ? new byte[null] : m5468d(file);
    }

    /* renamed from: d */
    private static byte[] m5468d(File file) {
        return m5461a(file);
    }

    /* renamed from: a */
    static byte[] m5462a(File file, Context context) {
        File a = m5459a(file, ".maps");
        if (a != null) {
            return m5467c(a, context);
        }
        file = m5459a(file, ".binary_libs");
        return file != null ? m5465b(file, context) : null;
    }

    /* renamed from: b */
    private static byte[] m5465b(File file, Context context) {
        file = m5461a(file);
        if (file != null) {
            if (file.length != 0) {
                return m5460a(context, new String(file));
            }
        }
        return null;
    }

    /* renamed from: c */
    private static byte[] m5467c(File file, Context context) {
        Closeable bufferedReader;
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                file = new C1356c(context, new ak()).m5531a((BufferedReader) bufferedReader);
                CommonUtils.m13612a(bufferedReader);
                return file;
            } catch (Throwable th) {
                file = th;
                CommonUtils.m13612a(bufferedReader);
                throw file;
            }
        } catch (Throwable th2) {
            file = th2;
            bufferedReader = null;
            CommonUtils.m13612a(bufferedReader);
            throw file;
        }
    }

    /* renamed from: c */
    static byte[] m5466c(File file) {
        file = m5459a(file, ".device_info");
        if (file == null) {
            return null;
        }
        return m5461a(file);
    }

    /* renamed from: a */
    private static byte[] m5460a(Context context, String str) {
        return new C1356c(context, new ak()).m5532a(str);
    }
}
