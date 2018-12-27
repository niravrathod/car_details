package com.bumptech.glide.p050a;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.a.c */
final class C1127c {
    /* renamed from: a */
    static final Charset f3688a = Charset.forName("US-ASCII");
    /* renamed from: b */
    static final Charset f3689b = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m4692a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            file = listFiles.length;
            int i = 0;
            while (i < file) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    C1127c.m4692a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("failed to delete file: ");
                    stringBuilder.append(file2);
                    throw new IOException(stringBuilder.toString());
                }
            }
            return;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("not a readable directory: ");
        stringBuilder2.append(file);
        throw new IOException(stringBuilder2.toString());
    }

    /* renamed from: a */
    static void m4691a(java.io.Closeable r0) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        if (r0 == 0) goto L_0x0008;
    L_0x0002:
        r0.close();	 Catch:{ RuntimeException -> 0x0006, Exception -> 0x0008 }
        goto L_0x0008;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.c.a(java.io.Closeable):void");
    }
}
