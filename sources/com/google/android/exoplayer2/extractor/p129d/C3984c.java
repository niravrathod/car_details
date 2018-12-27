package com.google.android.exoplayer2.extractor.p129d;

import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.p126c.C2175k;

/* renamed from: com.google.android.exoplayer2.extractor.d.c */
public class C3984c implements C2259f {
    /* renamed from: a */
    public static final C2262i f15943a = new C39831();
    /* renamed from: b */
    private C2233h f15944b;

    /* renamed from: com.google.android.exoplayer2.extractor.d.c$1 */
    static class C39831 implements C2262i {
        C39831() {
        }

        /* renamed from: a */
        public C2259f[] mo1564a() {
            return new C2259f[]{new C3984c()};
        }
    }

    /* renamed from: c */
    public void mo1577c() {
    }

    /* renamed from: a */
    public boolean mo1576a(com.google.android.exoplayer2.extractor.C2260g r6) {
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
        r1 = new com.google.android.exoplayer2.extractor.d.e;	 Catch:{ ParserException -> 0x005e }
        r1.<init>();	 Catch:{ ParserException -> 0x005e }
        r2 = 1;	 Catch:{ ParserException -> 0x005e }
        r3 = r1.m8210a(r6, r2);	 Catch:{ ParserException -> 0x005e }
        if (r3 == 0) goto L_0x005d;	 Catch:{ ParserException -> 0x005e }
    L_0x000d:
        r3 = r1.f7028b;	 Catch:{ ParserException -> 0x005e }
        r4 = 2;	 Catch:{ ParserException -> 0x005e }
        r3 = r3 & r4;	 Catch:{ ParserException -> 0x005e }
        if (r3 == r4) goto L_0x0014;	 Catch:{ ParserException -> 0x005e }
    L_0x0013:
        goto L_0x005d;	 Catch:{ ParserException -> 0x005e }
    L_0x0014:
        r1 = r1.f7035i;	 Catch:{ ParserException -> 0x005e }
        r3 = 8;	 Catch:{ ParserException -> 0x005e }
        r1 = java.lang.Math.min(r1, r3);	 Catch:{ ParserException -> 0x005e }
        r3 = new com.google.android.exoplayer2.c.k;	 Catch:{ ParserException -> 0x005e }
        r3.<init>(r1);	 Catch:{ ParserException -> 0x005e }
        r4 = r3.f6735a;	 Catch:{ ParserException -> 0x005e }
        r6.mo1591c(r4, r0, r1);	 Catch:{ ParserException -> 0x005e }
        r6 = com.google.android.exoplayer2.extractor.p129d.C3984c.m19897a(r3);	 Catch:{ ParserException -> 0x005e }
        r6 = com.google.android.exoplayer2.extractor.p129d.C3982b.m19890a(r6);	 Catch:{ ParserException -> 0x005e }
        if (r6 == 0) goto L_0x0038;	 Catch:{ ParserException -> 0x005e }
    L_0x0030:
        r6 = new com.google.android.exoplayer2.extractor.d.b;	 Catch:{ ParserException -> 0x005e }
        r6.<init>();	 Catch:{ ParserException -> 0x005e }
        r5.f15944b = r6;	 Catch:{ ParserException -> 0x005e }
        goto L_0x005b;	 Catch:{ ParserException -> 0x005e }
    L_0x0038:
        r6 = com.google.android.exoplayer2.extractor.p129d.C3984c.m19897a(r3);	 Catch:{ ParserException -> 0x005e }
        r6 = com.google.android.exoplayer2.extractor.p129d.C3987j.m19915a(r6);	 Catch:{ ParserException -> 0x005e }
        if (r6 == 0) goto L_0x004a;	 Catch:{ ParserException -> 0x005e }
    L_0x0042:
        r6 = new com.google.android.exoplayer2.extractor.d.j;	 Catch:{ ParserException -> 0x005e }
        r6.<init>();	 Catch:{ ParserException -> 0x005e }
        r5.f15944b = r6;	 Catch:{ ParserException -> 0x005e }
        goto L_0x005b;	 Catch:{ ParserException -> 0x005e }
    L_0x004a:
        r6 = com.google.android.exoplayer2.extractor.p129d.C3984c.m19897a(r3);	 Catch:{ ParserException -> 0x005e }
        r6 = com.google.android.exoplayer2.extractor.p129d.C3985g.m19905a(r6);	 Catch:{ ParserException -> 0x005e }
        if (r6 == 0) goto L_0x005c;	 Catch:{ ParserException -> 0x005e }
    L_0x0054:
        r6 = new com.google.android.exoplayer2.extractor.d.g;	 Catch:{ ParserException -> 0x005e }
        r6.<init>();	 Catch:{ ParserException -> 0x005e }
        r5.f15944b = r6;	 Catch:{ ParserException -> 0x005e }
    L_0x005b:
        return r2;
    L_0x005c:
        return r0;
    L_0x005d:
        return r0;
    L_0x005e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.d.c.a(com.google.android.exoplayer2.extractor.g):boolean");
    }

    /* renamed from: a */
    public void mo1575a(C2261h c2261h) {
        C2267n a = c2261h.mo4053a(0, 1);
        c2261h.mo4054a();
        this.f15944b.m8219a(c2261h, a);
    }

    /* renamed from: a */
    public void mo1574a(long j, long j2) {
        this.f15944b.m8218a(j, j2);
    }

    /* renamed from: a */
    public int mo1573a(C2260g c2260g, C2265l c2265l) {
        return this.f15944b.m8216a(c2260g, c2265l);
    }

    /* renamed from: a */
    private static C2175k m19897a(C2175k c2175k) {
        c2175k.m7979c(0);
        return c2175k;
    }
}
