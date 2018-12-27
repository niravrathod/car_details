package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.C2274i;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2266m;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.C3969b;
import com.google.android.exoplayer2.extractor.C3988d;
import com.google.android.exoplayer2.extractor.C3988d.C2226c;
import com.google.android.exoplayer2.p124a.C3946e;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2166d;
import com.google.android.exoplayer2.p126c.C2170h;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.source.C2321d.C2320a;
import com.google.android.exoplayer2.source.C4036b.C2319a;
import com.google.android.exoplayer2.source.C4038c.C4037a;
import com.google.android.exoplayer2.upstream.C2364b;
import com.google.android.exoplayer2.upstream.C2368d;
import com.google.android.exoplayer2.upstream.C2369e;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.C2360a;
import com.google.android.exoplayer2.upstream.Loader.C2362c;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.a */
final class C4691a implements C2226c, C2261h, C4038c, C2360a<C4034a> {
    /* renamed from: A */
    private boolean f19436A;
    /* renamed from: B */
    private long f19437B;
    /* renamed from: C */
    private long f19438C;
    /* renamed from: D */
    private long f19439D;
    /* renamed from: E */
    private int f19440E;
    /* renamed from: F */
    private boolean f19441F;
    /* renamed from: G */
    private boolean f19442G;
    /* renamed from: a */
    private final Uri f19443a;
    /* renamed from: b */
    private final C2368d f19444b;
    /* renamed from: c */
    private final int f19445c;
    /* renamed from: d */
    private final Handler f19446d;
    /* renamed from: e */
    private final C2319a f19447e;
    /* renamed from: f */
    private final C2320a f19448f;
    /* renamed from: g */
    private final C2364b f19449g;
    /* renamed from: h */
    private final String f19450h;
    /* renamed from: i */
    private final Loader f19451i = new Loader("Loader:ExtractorMediaPeriod");
    /* renamed from: j */
    private final C2318b f19452j;
    /* renamed from: k */
    private final C2166d f19453k;
    /* renamed from: l */
    private final Runnable f19454l;
    /* renamed from: m */
    private final Runnable f19455m;
    /* renamed from: n */
    private final Handler f19456n;
    /* renamed from: o */
    private final SparseArray<C3988d> f19457o;
    /* renamed from: p */
    private C4037a f19458p;
    /* renamed from: q */
    private C2266m f19459q;
    /* renamed from: r */
    private boolean f19460r;
    /* renamed from: s */
    private boolean f19461s;
    /* renamed from: t */
    private boolean f19462t;
    /* renamed from: u */
    private boolean f19463u;
    /* renamed from: v */
    private int f19464v;
    /* renamed from: w */
    private C2327i f19465w;
    /* renamed from: x */
    private long f19466x;
    /* renamed from: y */
    private boolean[] f19467y;
    /* renamed from: z */
    private boolean[] f19468z;

    /* renamed from: com.google.android.exoplayer2.source.a$1 */
    class C23141 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C4691a f7283a;

        C23141(C4691a c4691a) {
            this.f7283a = c4691a;
        }

        public void run() {
            this.f7283a.m25849i();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.a$2 */
    class C23152 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C4691a f7284a;

        C23152(C4691a c4691a) {
            this.f7284a = c4691a;
        }

        public void run() {
            if (!this.f7284a.f19442G) {
                this.f7284a.f19458p.mo4049a(this.f7284a);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.a$b */
    private static final class C2318b {
        /* renamed from: a */
        private final C2259f[] f7289a;
        /* renamed from: b */
        private final C2261h f7290b;
        /* renamed from: c */
        private C2259f f7291c;

        public C2318b(C2259f[] c2259fArr, C2261h c2261h) {
            this.f7289a = c2259fArr;
            this.f7290b = c2261h;
        }

        /* renamed from: a */
        public com.google.android.exoplayer2.extractor.C2259f m8471a(com.google.android.exoplayer2.extractor.C2260g r6, android.net.Uri r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = r5.f7291c;
            if (r0 == 0) goto L_0x0007;
        L_0x0004:
            r6 = r5.f7291c;
            return r6;
        L_0x0007:
            r0 = r5.f7289a;
            r1 = r0.length;
            r2 = 0;
        L_0x000b:
            if (r2 >= r1) goto L_0x0026;
        L_0x000d:
            r3 = r0[r2];
            r4 = r3.mo1576a(r6);	 Catch:{ EOFException -> 0x0020, all -> 0x001b }
            if (r4 == 0) goto L_0x0020;	 Catch:{ EOFException -> 0x0020, all -> 0x001b }
        L_0x0015:
            r5.f7291c = r3;	 Catch:{ EOFException -> 0x0020, all -> 0x001b }
            r6.mo1583a();
            goto L_0x0026;
        L_0x001b:
            r7 = move-exception;
            r6.mo1583a();
            throw r7;
        L_0x0020:
            r6.mo1583a();
            r2 = r2 + 1;
            goto L_0x000b;
        L_0x0026:
            r6 = r5.f7291c;
            if (r6 == 0) goto L_0x0034;
        L_0x002a:
            r6 = r5.f7291c;
            r7 = r5.f7290b;
            r6.mo1575a(r7);
            r6 = r5.f7291c;
            return r6;
        L_0x0034:
            r6 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "None of the available extractors (";
            r0.append(r1);
            r1 = r5.f7289a;
            r1 = com.google.android.exoplayer2.p126c.C2186s.m8046a(r1);
            r0.append(r1);
            r1 = ") could read the stream.";
            r0.append(r1);
            r0 = r0.toString();
            r6.<init>(r0, r7);
            throw r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.a.b.a(com.google.android.exoplayer2.extractor.g, android.net.Uri):com.google.android.exoplayer2.extractor.f");
        }

        /* renamed from: a */
        public void m8472a() {
            if (this.f7291c != null) {
                this.f7291c.mo1577c();
                this.f7291c = null;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.a$a */
    final class C4034a implements C2362c {
        /* renamed from: a */
        final /* synthetic */ C4691a f16235a;
        /* renamed from: b */
        private final Uri f16236b;
        /* renamed from: c */
        private final C2368d f16237c;
        /* renamed from: d */
        private final C2318b f16238d;
        /* renamed from: e */
        private final C2166d f16239e;
        /* renamed from: f */
        private final C2265l f16240f = new C2265l();
        /* renamed from: g */
        private volatile boolean f16241g;
        /* renamed from: h */
        private boolean f16242h = true;
        /* renamed from: i */
        private long f16243i;
        /* renamed from: j */
        private long f16244j = -1;

        public C4034a(C4691a c4691a, Uri uri, C2368d c2368d, C2318b c2318b, C2166d c2166d) {
            this.f16235a = c4691a;
            this.f16236b = (Uri) C2163a.m7914a((Object) uri);
            this.f16237c = (C2368d) C2163a.m7914a((Object) c2368d);
            this.f16238d = (C2318b) C2163a.m7914a((Object) c2318b);
            this.f16239e = c2166d;
        }

        /* renamed from: a */
        public void m20256a(long j, long j2) {
            this.f16240f.f7191a = j;
            this.f16243i = j2;
            this.f16242h = 1;
        }

        /* renamed from: a */
        public void mo1665a() {
            this.f16241g = true;
        }

        /* renamed from: b */
        public boolean mo1666b() {
            return this.f16241g;
        }

        /* renamed from: c */
        public void mo1667c() {
            Throwable th;
            int i = 0;
            while (i == 0 && !this.f16241g) {
                try {
                    long j = this.f16240f.f7191a;
                    this.f16244j = this.f16237c.mo1685a(new C2369e(this.f16236b, j, -1, this.f16235a.f19450h));
                    if (this.f16244j != -1) {
                        this.f16244j += j;
                    }
                    C2260g c3969b = new C3969b(this.f16237c, j, this.f16244j);
                    try {
                        C2259f a = this.f16238d.m8471a(c3969b, this.f16237c.mo1686a());
                        if (this.f16242h) {
                            a.mo1574a(j, this.f16243i);
                            this.f16242h = false;
                        }
                        while (i == 0 && !this.f16241g) {
                            this.f16239e.m7932c();
                            int a2 = a.mo1573a(c3969b, this.f16240f);
                            try {
                                if (c3969b.mo1589c() > 1048576 + j) {
                                    j = c3969b.mo1589c();
                                    this.f16239e.m7931b();
                                    this.f16235a.f19456n.post(this.f16235a.f19455m);
                                }
                                i = a2;
                            } catch (Throwable th2) {
                                th = th2;
                                i = a2;
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f16240f.f7191a = c3969b.mo1589c();
                        }
                        C2186s.m8048a(this.f16237c);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    C2260g c2260g = null;
                }
            }
            return;
            if (!(i == 1 || c2260g == null)) {
                this.f16240f.f7191a = c2260g.mo1589c();
            }
            C2186s.m8048a(this.f16237c);
            throw th;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.a$c */
    private final class C4035c implements C2323e {
        /* renamed from: a */
        final /* synthetic */ C4691a f16245a;
        /* renamed from: b */
        private final int f16246b;

        public C4035c(C4691a c4691a, int i) {
            this.f16245a = c4691a;
            this.f16246b = i;
        }

        /* renamed from: a */
        public boolean mo1670a() {
            return this.f16245a.m25869a(this.f16246b);
        }

        /* renamed from: b */
        public void mo1671b() {
            this.f16245a.m25878h();
        }

        /* renamed from: a */
        public int mo1668a(C2274i c2274i, C3946e c3946e, boolean z) {
            return this.f16245a.m25854a(this.f16246b, c2274i, c3946e, z);
        }

        /* renamed from: a */
        public void mo1669a(long j) {
            this.f16245a.m25860a(this.f16246b, j);
        }
    }

    /* renamed from: a */
    public void mo4055a(long j) {
    }

    public C4691a(Uri uri, C2368d c2368d, C2259f[] c2259fArr, int i, Handler handler, C2319a c2319a, C2320a c2320a, C2364b c2364b, String str) {
        this.f19443a = uri;
        this.f19444b = c2368d;
        this.f19445c = i;
        this.f19446d = handler;
        this.f19447e = c2319a;
        this.f19448f = c2320a;
        this.f19449g = c2364b;
        this.f19450h = str;
        this.f19452j = new C2318b(c2259fArr, this);
        this.f19453k = new C2166d();
        this.f19454l = new C23141(this);
        this.f19455m = new C23152(this);
        this.f19456n = new Handler();
        this.f19439D = 1;
        this.f19457o = new SparseArray();
        this.f19437B = -1;
    }

    /* renamed from: b */
    public void m25870b() {
        final C2318b c2318b = this.f19452j;
        this.f19451i.m8686a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C4691a f7286b;

            public void run() {
                c2318b.m8472a();
                int size = this.f7286b.f19457o.size();
                for (int i = 0; i < size; i++) {
                    ((C3988d) this.f7286b.f19457o.valueAt(i)).m19939b();
                }
            }
        });
        this.f19456n.removeCallbacksAndMessages(null);
        this.f19442G = true;
    }

    /* renamed from: a */
    public void mo4058a(C4037a c4037a) {
        this.f19458p = c4037a;
        this.f19453k.m7930a();
        m25850j();
    }

    /* renamed from: c */
    public void mo4063c() {
        m25878h();
    }

    /* renamed from: d */
    public C2327i mo4064d() {
        return this.f19465w;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public long mo4052a(com.google.android.exoplayer2.p125b.C2157f[] r6, boolean[] r7, com.google.android.exoplayer2.source.C2323e[] r8, boolean[] r9, long r10) {
        /*
        r5 = this;
        r0 = r5.f19461s;
        com.google.android.exoplayer2.p126c.C2163a.m7918b(r0);
        r0 = 0;
        r1 = 0;
    L_0x0007:
        r2 = r6.length;
        r3 = 1;
        if (r1 >= r2) goto L_0x0040;
    L_0x000b:
        r2 = r8[r1];
        if (r2 == 0) goto L_0x003d;
    L_0x000f:
        r2 = r6[r1];
        if (r2 == 0) goto L_0x0017;
    L_0x0013:
        r2 = r7[r1];
        if (r2 != 0) goto L_0x003d;
    L_0x0017:
        r2 = r8[r1];
        r2 = (com.google.android.exoplayer2.source.C4691a.C4035c) r2;
        r2 = r2.f16246b;
        r4 = r5.f19467y;
        r4 = r4[r2];
        com.google.android.exoplayer2.p126c.C2163a.m7918b(r4);
        r4 = r5.f19464v;
        r4 = r4 - r3;
        r5.f19464v = r4;
        r3 = r5.f19467y;
        r3[r2] = r0;
        r3 = r5.f19457o;
        r2 = r3.valueAt(r2);
        r2 = (com.google.android.exoplayer2.extractor.C3988d) r2;
        r2.m19939b();
        r2 = 0;
        r8[r1] = r2;
    L_0x003d:
        r1 = r1 + 1;
        goto L_0x0007;
    L_0x0040:
        r7 = 0;
        r1 = 0;
    L_0x0042:
        r2 = r6.length;
        if (r7 >= r2) goto L_0x008f;
    L_0x0045:
        r2 = r8[r7];
        if (r2 != 0) goto L_0x008c;
    L_0x0049:
        r2 = r6[r7];
        if (r2 == 0) goto L_0x008c;
    L_0x004d:
        r1 = r6[r7];
        r2 = r1.mo1546b();
        if (r2 != r3) goto L_0x0057;
    L_0x0055:
        r2 = 1;
        goto L_0x0058;
    L_0x0057:
        r2 = 0;
    L_0x0058:
        com.google.android.exoplayer2.p126c.C2163a.m7918b(r2);
        r2 = r1.mo1547b(r0);
        if (r2 != 0) goto L_0x0063;
    L_0x0061:
        r2 = 1;
        goto L_0x0064;
    L_0x0063:
        r2 = 0;
    L_0x0064:
        com.google.android.exoplayer2.p126c.C2163a.m7918b(r2);
        r2 = r5.f19465w;
        r1 = r1.mo1545a();
        r1 = r2.m8490a(r1);
        r2 = r5.f19467y;
        r2 = r2[r1];
        r2 = r2 ^ r3;
        com.google.android.exoplayer2.p126c.C2163a.m7918b(r2);
        r2 = r5.f19464v;
        r2 = r2 + r3;
        r5.f19464v = r2;
        r2 = r5.f19467y;
        r2[r1] = r3;
        r2 = new com.google.android.exoplayer2.source.a$c;
        r2.<init>(r5, r1);
        r8[r7] = r2;
        r9[r7] = r3;
        r1 = 1;
    L_0x008c:
        r7 = r7 + 1;
        goto L_0x0042;
    L_0x008f:
        r6 = r5.f19462t;
        if (r6 != 0) goto L_0x00b0;
    L_0x0093:
        r6 = r5.f19457o;
        r6 = r6.size();
        r7 = 0;
    L_0x009a:
        if (r7 >= r6) goto L_0x00b0;
    L_0x009c:
        r2 = r5.f19467y;
        r2 = r2[r7];
        if (r2 != 0) goto L_0x00ad;
    L_0x00a2:
        r2 = r5.f19457o;
        r2 = r2.valueAt(r7);
        r2 = (com.google.android.exoplayer2.extractor.C3988d) r2;
        r2.m19939b();
    L_0x00ad:
        r7 = r7 + 1;
        goto L_0x009a;
    L_0x00b0:
        r6 = r5.f19464v;
        if (r6 != 0) goto L_0x00c4;
    L_0x00b4:
        r5.f19463u = r0;
        r6 = r5.f19451i;
        r6 = r6.m8687a();
        if (r6 == 0) goto L_0x00e1;
    L_0x00be:
        r6 = r5.f19451i;
        r6.m8688b();
        goto L_0x00e1;
    L_0x00c4:
        r6 = r5.f19462t;
        if (r6 == 0) goto L_0x00cb;
    L_0x00c8:
        if (r1 == 0) goto L_0x00e1;
    L_0x00ca:
        goto L_0x00d1;
    L_0x00cb:
        r6 = 0;
        r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r1 == 0) goto L_0x00e1;
    L_0x00d1:
        r10 = r5.mo4062c(r10);
    L_0x00d5:
        r6 = r8.length;
        if (r0 >= r6) goto L_0x00e1;
    L_0x00d8:
        r6 = r8[r0];
        if (r6 == 0) goto L_0x00de;
    L_0x00dc:
        r9[r0] = r3;
    L_0x00de:
        r0 = r0 + 1;
        goto L_0x00d5;
    L_0x00e1:
        r5.f19462t = r3;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.a.a(com.google.android.exoplayer2.b.f[], boolean[], com.google.android.exoplayer2.source.e[], boolean[], long):long");
    }

    /* renamed from: b */
    public boolean mo4061b(long j) {
        if (this.f19441F == null) {
            if (this.f19461s == null || this.f19464v != null) {
                j = this.f19453k.m7930a();
                if (!this.f19451i.m8687a()) {
                    m25850j();
                    j = 1;
                }
                return j;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public long mo4065e() {
        return this.f19464v == 0 ? Long.MIN_VALUE : mo4067g();
    }

    /* renamed from: f */
    public long mo4066f() {
        if (!this.f19463u) {
            return -9223372036854775807L;
        }
        this.f19463u = false;
        return this.f19438C;
    }

    /* renamed from: g */
    public long mo4067g() {
        if (this.f19441F) {
            return Long.MIN_VALUE;
        }
        if (m25853m()) {
            return this.f19439D;
        }
        long j;
        if (this.f19436A) {
            j = Long.MAX_VALUE;
            int size = this.f19457o.size();
            for (int i = 0; i < size; i++) {
                if (this.f19468z[i]) {
                    j = Math.min(j, ((C3988d) this.f19457o.valueAt(i)).m19942e());
                }
            }
        } else {
            j = m25852l();
        }
        if (j == Long.MIN_VALUE) {
            j = this.f19438C;
        }
        return j;
    }

    /* renamed from: c */
    public long mo4062c(long j) {
        if (!this.f19459q.mo1578a()) {
            j = 0;
        }
        this.f19438C = j;
        int size = this.f19457o.size();
        int m = m25853m() ^ 1;
        int i = 0;
        while (m != 0 && i < size) {
            if (this.f19467y[i]) {
                m = ((C3988d) this.f19457o.valueAt(i)).m19938a(j, false);
            }
            i++;
        }
        if (m == 0) {
            this.f19439D = j;
            this.f19441F = false;
            if (this.f19451i.m8687a()) {
                this.f19451i.m8688b();
            } else {
                for (m = 0; m < size; m++) {
                    ((C3988d) this.f19457o.valueAt(m)).m19937a(this.f19467y[m]);
                }
            }
        }
        this.f19463u = false;
        return j;
    }

    /* renamed from: a */
    boolean m25869a(int i) {
        if (!this.f19441F) {
            if (m25853m() || ((C3988d) this.f19457o.valueAt(i)).m19940c() != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    void m25878h() {
        this.f19451i.m8689c();
    }

    /* renamed from: a */
    int m25854a(int i, C2274i c2274i, C3946e c3946e, boolean z) {
        if (!this.f19463u) {
            if (!m25853m()) {
                return ((C3988d) this.f19457o.valueAt(i)).m19932a(c2274i, c3946e, z, this.f19441F, this.f19438C);
            }
        }
        return -3;
    }

    /* renamed from: a */
    void m25860a(int i, long j) {
        C3988d c3988d = (C3988d) this.f19457o.valueAt(i);
        if (!this.f19441F || j <= c3988d.m19942e()) {
            c3988d.m19938a(j, true);
        } else {
            c3988d.m19943f();
        }
    }

    /* renamed from: a */
    public void m25864a(C4034a c4034a, long j, long j2) {
        m25837a(c4034a);
        this.f19441F = true;
        if (this.f19466x == -9223372036854775807L) {
            c4034a = m25852l();
            this.f19466x = c4034a == Long.MIN_VALUE ? 0 : c4034a + 10000;
            this.f19448f.mo1675a(new C4039g(this.f19466x, this.f19459q.mo1578a()), null);
        }
        this.f19458p.mo4049a(this);
    }

    /* renamed from: a */
    public void m25865a(C4034a c4034a, long j, long j2, boolean z) {
        m25837a(c4034a);
        if (!z && this.f19464v > null) {
            c4034a = this.f19457o.size();
            for (j = null; j < c4034a; j++) {
                ((C3988d) this.f19457o.valueAt(j)).m19937a(this.f19467y[j]);
            }
            this.f19458p.mo4049a(this);
        }
    }

    /* renamed from: a */
    public int m25855a(C4034a c4034a, long j, long j2, IOException iOException) {
        m25837a(c4034a);
        m25841b(iOException);
        if (m25839a(iOException) != null) {
            return 3;
        }
        j = m25851k() > this.f19440E ? 1 : null;
        m25840b(c4034a);
        this.f19440E = m25851k();
        return j;
    }

    /* renamed from: a */
    public C2267n mo4053a(int i, int i2) {
        C3988d c3988d = (C3988d) this.f19457o.get(i);
        if (c3988d != null) {
            return c3988d;
        }
        i2 = new C3988d(this.f19449g);
        i2.m19936a((C2226c) this);
        this.f19457o.put(i, i2);
        return i2;
    }

    /* renamed from: a */
    public void mo4054a() {
        this.f19460r = true;
        this.f19456n.post(this.f19454l);
    }

    /* renamed from: a */
    public void mo4057a(C2266m c2266m) {
        this.f19459q = c2266m;
        this.f19456n.post(this.f19454l);
    }

    /* renamed from: a */
    public void mo4056a(Format format) {
        this.f19456n.post(this.f19454l);
    }

    /* renamed from: i */
    private void m25849i() {
        if (!(this.f19442G || this.f19461s || this.f19459q == null)) {
            if (this.f19460r) {
                int size = this.f19457o.size();
                int i = 0;
                while (i < size) {
                    if (((C3988d) this.f19457o.valueAt(i)).m19941d() != null) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f19453k.m7931b();
                C2326h[] c2326hArr = new C2326h[size];
                this.f19468z = new boolean[size];
                this.f19467y = new boolean[size];
                this.f19466x = this.f19459q.mo1579b();
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 < size) {
                        c2326hArr[i2] = new C2326h(((C3988d) this.f19457o.valueAt(i2)).m19941d());
                        String str = r5.f6489f;
                        if (!C2170h.m7943b(str)) {
                            if (!C2170h.m7942a(str)) {
                                z = false;
                            }
                        }
                        this.f19468z[i2] = z;
                        this.f19436A = z | this.f19436A;
                        i2++;
                    } else {
                        this.f19465w = new C2327i(c2326hArr);
                        this.f19461s = true;
                        this.f19448f.mo1675a(new C4039g(this.f19466x, this.f19459q.mo1578a()), null);
                        this.f19458p.mo4048a(this);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m25837a(C4034a c4034a) {
        if (this.f19437B == -1) {
            this.f19437B = c4034a.f16244j;
        }
    }

    /* renamed from: j */
    private void m25850j() {
        C2362c c4034a = new C4034a(this, this.f19443a, this.f19444b, this.f19452j, this.f19453k);
        if (this.f19461s) {
            C2163a.m7918b(m25853m());
            if (this.f19466x == -9223372036854775807L || this.f19439D < this.f19466x) {
                c4034a.m20256a(this.f19459q.mo1580b(this.f19439D), this.f19439D);
                this.f19439D = -9223372036854775807L;
            } else {
                this.f19441F = true;
                this.f19439D = -9223372036854775807L;
                return;
            }
        }
        this.f19440E = m25851k();
        int i = this.f19445c;
        if (i == -1) {
            if (this.f19461s && this.f19437B == -1) {
                if (this.f19459q == null || this.f19459q.mo1579b() == -9223372036854775807L) {
                    i = 6;
                }
            }
            i = 3;
        }
        this.f19451i.m8684a(c4034a, this, i);
    }

    /* renamed from: b */
    private void m25840b(C4034a c4034a) {
        if (this.f19437B != -1) {
            return;
        }
        if (this.f19459q == null || this.f19459q.mo1579b() == -9223372036854775807L) {
            this.f19438C = 0;
            this.f19463u = this.f19461s;
            int size = this.f19457o.size();
            for (int i = 0; i < size; i++) {
                boolean z;
                C3988d c3988d = (C3988d) this.f19457o.valueAt(i);
                if (this.f19461s) {
                    if (!this.f19467y[i]) {
                        z = false;
                        c3988d.m19937a(z);
                    }
                }
                z = true;
                c3988d.m19937a(z);
            }
            c4034a.m20256a(0, 0);
        }
    }

    /* renamed from: k */
    private int m25851k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f19457o.size(); i2++) {
            i += ((C3988d) this.f19457o.valueAt(i2)).m19930a();
        }
        return i;
    }

    /* renamed from: l */
    private long m25852l() {
        int size = this.f19457o.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((C3988d) this.f19457o.valueAt(i)).m19942e());
        }
        return j;
    }

    /* renamed from: m */
    private boolean m25853m() {
        return this.f19439D != -9223372036854775807L;
    }

    /* renamed from: a */
    private boolean m25839a(IOException iOException) {
        return iOException instanceof UnrecognizedInputFormatException;
    }

    /* renamed from: b */
    private void m25841b(final IOException iOException) {
        if (this.f19446d != null && this.f19447e != null) {
            this.f19446d.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C4691a f7288b;

                public void run() {
                    this.f7288b.f19447e.m8473a(iOException);
                }
            });
        }
    }
}
