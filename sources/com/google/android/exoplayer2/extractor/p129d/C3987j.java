package com.google.android.exoplayer2.extractor.p129d;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.p129d.C2233h.C2232a;
import com.google.android.exoplayer2.extractor.p129d.C2240k.C2237b;
import com.google.android.exoplayer2.extractor.p129d.C2240k.C2238c;
import com.google.android.exoplayer2.extractor.p129d.C2240k.C2239d;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.d.j */
final class C3987j extends C2233h {
    /* renamed from: a */
    private C2235a f15948a;
    /* renamed from: b */
    private int f15949b;
    /* renamed from: c */
    private boolean f15950c;
    /* renamed from: d */
    private C2239d f15951d;
    /* renamed from: e */
    private C2237b f15952e;

    /* renamed from: com.google.android.exoplayer2.extractor.d.j$a */
    static final class C2235a {
        /* renamed from: a */
        public final C2239d f7057a;
        /* renamed from: b */
        public final C2237b f7058b;
        /* renamed from: c */
        public final byte[] f7059c;
        /* renamed from: d */
        public final C2238c[] f7060d;
        /* renamed from: e */
        public final int f7061e;

        public C2235a(C2239d c2239d, C2237b c2237b, byte[] bArr, C2238c[] c2238cArr, int i) {
            this.f7057a = c2239d;
            this.f7058b = c2237b;
            this.f7059c = bArr;
            this.f7060d = c2238cArr;
            this.f7061e = i;
        }
    }

    /* renamed from: a */
    static int m19912a(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    C3987j() {
    }

    /* renamed from: a */
    public static boolean m19915a(com.google.android.exoplayer2.p126c.C2175k r1) {
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
        r0 = 1;
        r1 = com.google.android.exoplayer2.extractor.p129d.C2240k.m8233a(r0, r1, r0);	 Catch:{ ParserException -> 0x0006 }
        return r1;
    L_0x0006:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.d.j.a(com.google.android.exoplayer2.c.k):boolean");
    }

    /* renamed from: a */
    protected void mo1600a(boolean z) {
        super.mo1600a(z);
        if (z) {
            this.f15948a = null;
            this.f15951d = null;
            this.f15952e = null;
        }
        this.f15949b = 0;
        this.f15950c = false;
    }

    /* renamed from: c */
    protected void mo1603c(long j) {
        super.mo1603c(j);
        int i = 0;
        this.f15950c = j != 0 ? 1 : null;
        if (this.f15951d != null) {
            i = this.f15951d.f7080g;
        }
        this.f15949b = i;
    }

    /* renamed from: b */
    protected long mo1602b(C2175k c2175k) {
        int i = 0;
        if ((c2175k.f6735a[0] & 1) == 1) {
            return -1;
        }
        int a = C3987j.m19913a(c2175k.f6735a[0], this.f15948a);
        if (this.f15950c) {
            i = (this.f15949b + a) / 4;
        }
        long j = (long) i;
        C3987j.m19914a(c2175k, j);
        this.f15950c = true;
        this.f15949b = a;
        return j;
    }

    /* renamed from: a */
    protected boolean mo1601a(C2175k c2175k, long j, C2232a c2232a) {
        if (this.f15948a != null) {
            return null;
        }
        this.f15948a = m19919c(c2175k);
        if (this.f15948a == null) {
            return true;
        }
        List arrayList = new ArrayList();
        arrayList.add(this.f15948a.f7057a.f7083j);
        arrayList.add(this.f15948a.f7059c);
        c2232a.f7038a = Format.m7741a(null, "audio/vorbis", null, this.f15948a.f7057a.f7078e, -1, this.f15948a.f7057a.f7075b, (int) this.f15948a.f7057a.f7076c, arrayList, null, 0, null);
        return true;
    }

    /* renamed from: c */
    C2235a m19919c(C2175k c2175k) {
        if (this.f15951d == null) {
            this.f15951d = C2240k.m8231a(c2175k);
            return null;
        } else if (this.f15952e == null) {
            this.f15952e = C2240k.m8236b(c2175k);
            return null;
        } else {
            Object obj = new byte[c2175k.m7978c()];
            System.arraycopy(c2175k.f6735a, 0, obj, 0, c2175k.m7978c());
            C2238c[] a = C2240k.m8234a(c2175k, this.f15951d.f7075b);
            return new C2235a(this.f15951d, this.f15952e, obj, a, C2240k.m8229a(a.length - 1));
        }
    }

    /* renamed from: a */
    static void m19914a(C2175k c2175k, long j) {
        c2175k.m7977b(c2175k.m7978c() + 4);
        c2175k.f6735a[c2175k.m7978c() - 4] = (byte) ((int) (j & 255));
        c2175k.f6735a[c2175k.m7978c() - 3] = (byte) ((int) ((j >>> 8) & 255));
        c2175k.f6735a[c2175k.m7978c() - 2] = (byte) ((int) ((j >>> 16) & 255));
        c2175k.f6735a[c2175k.m7978c() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    /* renamed from: a */
    private static int m19913a(byte b, C2235a c2235a) {
        if (c2235a.f7060d[C3987j.m19912a(b, c2235a.f7061e, 1)].f7070a == (byte) 0) {
            return c2235a.f7057a.f7080g;
        }
        return c2235a.f7057a.f7081h;
    }
}
