package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.flv.C4017b;
import com.google.android.exoplayer2.extractor.p127a.C3964d;
import com.google.android.exoplayer2.extractor.p128c.C3975e;
import com.google.android.exoplayer2.extractor.p128c.C3977g;
import com.google.android.exoplayer2.extractor.p129d.C3984c;
import com.google.android.exoplayer2.extractor.p130e.C3990a;
import com.google.android.exoplayer2.extractor.p130e.C3993c;
import com.google.android.exoplayer2.extractor.p130e.C4005p;
import com.google.android.exoplayer2.extractor.p130e.C4011u;
import com.google.android.exoplayer2.extractor.p131f.C4014a;
import com.google.android.exoplayer2.extractor.p168b.C3968b;
import java.lang.reflect.Constructor;

/* renamed from: com.google.android.exoplayer2.extractor.c */
public final class C3978c implements C2262i {
    /* renamed from: a */
    private static final Constructor<? extends C2259f> f15917a;
    /* renamed from: b */
    private int f15918b;
    /* renamed from: c */
    private int f15919c;
    /* renamed from: d */
    private int f15920d;
    /* renamed from: e */
    private int f15921e = 1;
    /* renamed from: f */
    private int f15922f;

    static {
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
        r0 = "com.google.android.exoplayer2.ext.flac.FlacExtractor";	 Catch:{ ClassNotFoundException -> 0x0014, ClassNotFoundException -> 0x0014 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0014, ClassNotFoundException -> 0x0014 }
        r1 = com.google.android.exoplayer2.extractor.C2259f.class;	 Catch:{ ClassNotFoundException -> 0x0014, ClassNotFoundException -> 0x0014 }
        r0 = r0.asSubclass(r1);	 Catch:{ ClassNotFoundException -> 0x0014, ClassNotFoundException -> 0x0014 }
        r1 = 0;	 Catch:{ ClassNotFoundException -> 0x0014, ClassNotFoundException -> 0x0014 }
        r1 = new java.lang.Class[r1];	 Catch:{ ClassNotFoundException -> 0x0014, ClassNotFoundException -> 0x0014 }
        r0 = r0.getConstructor(r1);	 Catch:{ ClassNotFoundException -> 0x0014, ClassNotFoundException -> 0x0014 }
        goto L_0x0015;
    L_0x0014:
        r0 = 0;
    L_0x0015:
        f15917a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.c.<clinit>():void");
    }

    /* renamed from: a */
    public synchronized C2259f[] mo1564a() {
        C2259f[] c2259fArr;
        c2259fArr = new C2259f[(f15917a == null ? 11 : 12)];
        c2259fArr[0] = new C3964d(this.f15918b);
        c2259fArr[1] = new C3975e(this.f15919c);
        c2259fArr[2] = new C3977g();
        c2259fArr[3] = new C3968b(this.f15920d);
        c2259fArr[4] = new C3993c();
        c2259fArr[5] = new C3990a();
        c2259fArr[6] = new C4011u(this.f15921e, this.f15922f);
        c2259fArr[7] = new C4017b();
        c2259fArr[8] = new C3984c();
        c2259fArr[9] = new C4005p();
        c2259fArr[10] = new C4014a();
        if (f15917a != null) {
            try {
                c2259fArr[11] = (C2259f) f15917a.newInstance(new Object[0]);
            } catch (Throwable e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return c2259fArr;
    }
}
