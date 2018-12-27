package com.bumptech.glide.load.p059b;

import com.bumptech.glide.load.C1194a;
import com.bumptech.glide.load.engine.p060a.C1230b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.t */
public class C3437t implements C1194a<InputStream> {
    /* renamed from: a */
    private final C1230b f14344a;

    public C3437t(C1230b c1230b) {
        this.f14344a = c1230b;
    }

    /* renamed from: a */
    public boolean m17484a(java.io.InputStream r4, java.io.File r5, com.bumptech.glide.load.C3452e r6) {
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
        r3 = this;
        r6 = r3.f14344a;
        r0 = byte[].class;
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r6 = r6.mo1011a(r1, r0);
        r6 = (byte[]) r6;
        r0 = 0;
        r1 = 0;
        r2 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x002e }
        r2.<init>(r5);	 Catch:{ IOException -> 0x002e }
    L_0x0013:
        r5 = r4.read(r6);	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
        r1 = -1;	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
        if (r5 == r1) goto L_0x001e;	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
    L_0x001a:
        r2.write(r6, r0, r5);	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
        goto L_0x0013;	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
    L_0x001e:
        r2.close();	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
        r0 = 1;
        r2.close();	 Catch:{ IOException -> 0x0044 }
        goto L_0x0044;
    L_0x0026:
        r4 = move-exception;
        r1 = r2;
        goto L_0x004a;
    L_0x0029:
        r4 = move-exception;
        r1 = r2;
        goto L_0x002f;
    L_0x002c:
        r4 = move-exception;
        goto L_0x004a;
    L_0x002e:
        r4 = move-exception;
    L_0x002f:
        r5 = "StreamEncoder";	 Catch:{ all -> 0x002c }
        r2 = 3;	 Catch:{ all -> 0x002c }
        r5 = android.util.Log.isLoggable(r5, r2);	 Catch:{ all -> 0x002c }
        if (r5 == 0) goto L_0x003f;	 Catch:{ all -> 0x002c }
    L_0x0038:
        r5 = "StreamEncoder";	 Catch:{ all -> 0x002c }
        r2 = "Failed to encode data onto the OutputStream";	 Catch:{ all -> 0x002c }
        android.util.Log.d(r5, r2, r4);	 Catch:{ all -> 0x002c }
    L_0x003f:
        if (r1 == 0) goto L_0x0044;
    L_0x0041:
        r1.close();	 Catch:{ IOException -> 0x0044 }
    L_0x0044:
        r4 = r3.f14344a;
        r4.mo1014a(r6);
        return r0;
    L_0x004a:
        if (r1 == 0) goto L_0x004f;
    L_0x004c:
        r1.close();	 Catch:{ IOException -> 0x004f }
    L_0x004f:
        r5 = r3.f14344a;
        r5.mo1014a(r6);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.b.t.a(java.io.InputStream, java.io.File, com.bumptech.glide.load.e):boolean");
    }
}
