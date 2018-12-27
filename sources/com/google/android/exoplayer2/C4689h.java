package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C2195e.C2194c;
import com.google.android.exoplayer2.C2313q.C2311a;
import com.google.android.exoplayer2.C2313q.C2312b;
import com.google.android.exoplayer2.p125b.C2157f;
import com.google.android.exoplayer2.p125b.C2158g;
import com.google.android.exoplayer2.p125b.C2160h;
import com.google.android.exoplayer2.p125b.C2160h.C2159a;
import com.google.android.exoplayer2.p125b.C2161i;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2169g;
import com.google.android.exoplayer2.p126c.C2184r;
import com.google.android.exoplayer2.p126c.C3957p;
import com.google.android.exoplayer2.source.C2321d;
import com.google.android.exoplayer2.source.C2321d.C2320a;
import com.google.android.exoplayer2.source.C2323e;
import com.google.android.exoplayer2.source.C2325f;
import com.google.android.exoplayer2.source.C4038c;
import com.google.android.exoplayer2.source.C4038c.C4037a;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.h */
final class C4689h implements Callback, C2159a, C4037a, C2320a {
    /* renamed from: A */
    private C2272c f19355A;
    /* renamed from: B */
    private long f19356B;
    /* renamed from: C */
    private C2270a f19357C;
    /* renamed from: D */
    private C2270a f19358D;
    /* renamed from: E */
    private C2270a f19359E;
    /* renamed from: F */
    private C2313q f19360F;
    /* renamed from: a */
    private final C4023l[] f19361a;
    /* renamed from: b */
    private final C2277m[] f19362b;
    /* renamed from: c */
    private final C2160h f19363c;
    /* renamed from: d */
    private final C2275j f19364d;
    /* renamed from: e */
    private final C3957p f19365e;
    /* renamed from: f */
    private final Handler f19366f;
    /* renamed from: g */
    private final HandlerThread f19367g;
    /* renamed from: h */
    private final Handler f19368h;
    /* renamed from: i */
    private final C2195e f19369i;
    /* renamed from: j */
    private final C2312b f19370j;
    /* renamed from: k */
    private final C2311a f19371k;
    /* renamed from: l */
    private C2271b f19372l;
    /* renamed from: m */
    private C2276k f19373m;
    /* renamed from: n */
    private C4023l f19374n;
    /* renamed from: o */
    private C2169g f19375o;
    /* renamed from: p */
    private C2321d f19376p;
    /* renamed from: q */
    private C4023l[] f19377q;
    /* renamed from: r */
    private boolean f19378r;
    /* renamed from: s */
    private boolean f19379s;
    /* renamed from: t */
    private boolean f19380t;
    /* renamed from: u */
    private boolean f19381u;
    /* renamed from: v */
    private int f19382v = 1;
    /* renamed from: w */
    private int f19383w;
    /* renamed from: x */
    private int f19384x;
    /* renamed from: y */
    private long f19385y;
    /* renamed from: z */
    private int f19386z;

    /* renamed from: com.google.android.exoplayer2.h$a */
    private static final class C2270a {
        /* renamed from: a */
        public final C4038c f7193a;
        /* renamed from: b */
        public final Object f7194b;
        /* renamed from: c */
        public final C2323e[] f7195c;
        /* renamed from: d */
        public final boolean[] f7196d;
        /* renamed from: e */
        public final long f7197e;
        /* renamed from: f */
        public int f7198f;
        /* renamed from: g */
        public long f7199g;
        /* renamed from: h */
        public boolean f7200h;
        /* renamed from: i */
        public boolean f7201i;
        /* renamed from: j */
        public boolean f7202j;
        /* renamed from: k */
        public C2270a f7203k;
        /* renamed from: l */
        public boolean f7204l;
        /* renamed from: m */
        public C2161i f7205m;
        /* renamed from: n */
        private final C4023l[] f7206n;
        /* renamed from: o */
        private final C2277m[] f7207o;
        /* renamed from: p */
        private final C2160h f7208p;
        /* renamed from: q */
        private final C2275j f7209q;
        /* renamed from: r */
        private final C2321d f7210r;
        /* renamed from: s */
        private C2161i f7211s;

        public C2270a(C4023l[] c4023lArr, C2277m[] c2277mArr, long j, C2160h c2160h, C2275j c2275j, C2321d c2321d, Object obj, int i, boolean z, long j2) {
            this.f7206n = c4023lArr;
            this.f7207o = c2277mArr;
            this.f7197e = j;
            this.f7208p = c2160h;
            this.f7209q = c2275j;
            this.f7210r = c2321d;
            this.f7194b = C2163a.m7914a(obj);
            this.f7198f = i;
            this.f7200h = z;
            this.f7199g = j2;
            this.f7195c = new C2323e[c4023lArr.length];
            this.f7196d = new boolean[c4023lArr.length];
            this.f7193a = c2321d.mo1672a(i, c2275j.mo1559d(), j2);
        }

        /* renamed from: a */
        public long m8343a(long j) {
            return j + m8342a();
        }

        /* renamed from: b */
        public long m8347b(long j) {
            return j - m8342a();
        }

        /* renamed from: a */
        public long m8342a() {
            return this.f7197e - this.f7199g;
        }

        /* renamed from: a */
        public void m8346a(int i, boolean z) {
            this.f7198f = i;
            this.f7200h = z;
        }

        /* renamed from: b */
        public boolean m8348b() {
            return this.f7201i && (!this.f7202j || this.f7193a.mo4067g() == Long.MIN_VALUE);
        }

        /* renamed from: c */
        public void m8349c() {
            this.f7201i = true;
            m8350d();
            this.f7199g = m8344a(this.f7199g, false);
        }

        /* renamed from: d */
        public boolean m8350d() {
            C2161i a = this.f7208p.mo1548a(this.f7207o, this.f7193a.mo4064d());
            if (a.m7909a(this.f7211s)) {
                return false;
            }
            this.f7205m = a;
            return true;
        }

        /* renamed from: a */
        public long m8344a(long j, boolean z) {
            return m8345a(j, z, new boolean[this.f7206n.length]);
        }

        /* renamed from: a */
        public long m8345a(long j, boolean z, boolean[] zArr) {
            C2158g c2158g = this.f7205m.f6688b;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= c2158g.f6683a) {
                    break;
                }
                boolean[] zArr2 = r0.f7196d;
                if (z || !r0.f7205m.m7910a(r0.f7211s, i)) {
                    z2 = false;
                }
                zArr2[i] = z2;
                i++;
            }
            long a = r0.f7193a.mo4052a(c2158g.m7905a(), r0.f7196d, r0.f7195c, zArr, j);
            r0.f7211s = r0.f7205m;
            r0.f7202j = false;
            for (int i2 = 0; i2 < r0.f7195c.length; i2++) {
                if (r0.f7195c[i2] != null) {
                    C2163a.m7918b(c2158g.m7904a(i2) != null);
                    r0.f7202j = true;
                } else {
                    C2163a.m7918b(c2158g.m7904a(i2) == null);
                }
            }
            r0.f7209q.mo1554a(r0.f7206n, r0.f7205m.f6687a, c2158g);
            return a;
        }

        /* renamed from: e */
        public void m8351e() {
            try {
                this.f7210r.mo1676a(this.f7193a);
            } catch (Throwable e) {
                Log.e("ExoPlayerImplInternal", "Period release failed.", e);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.h$b */
    public static final class C2271b {
        /* renamed from: a */
        public final int f7212a;
        /* renamed from: b */
        public final long f7213b;
        /* renamed from: c */
        public volatile long f7214c;
        /* renamed from: d */
        public volatile long f7215d;

        public C2271b(int i, long j) {
            this.f7212a = i;
            this.f7213b = j;
            this.f7214c = j;
            this.f7215d = j;
        }

        /* renamed from: a */
        public C2271b m8352a(int i) {
            C2271b c2271b = new C2271b(i, this.f7213b);
            c2271b.f7214c = this.f7214c;
            c2271b.f7215d = this.f7215d;
            return c2271b;
        }
    }

    /* renamed from: com.google.android.exoplayer2.h$c */
    private static final class C2272c {
        /* renamed from: a */
        public final C2313q f7216a;
        /* renamed from: b */
        public final int f7217b;
        /* renamed from: c */
        public final long f7218c;

        public C2272c(C2313q c2313q, int i, long j) {
            this.f7216a = c2313q;
            this.f7217b = i;
            this.f7218c = j;
        }
    }

    /* renamed from: com.google.android.exoplayer2.h$d */
    public static final class C2273d {
        /* renamed from: a */
        public final C2313q f7219a;
        /* renamed from: b */
        public final Object f7220b;
        /* renamed from: c */
        public final C2271b f7221c;
        /* renamed from: d */
        public final int f7222d;

        public C2273d(C2313q c2313q, Object obj, C2271b c2271b, int i) {
            this.f7219a = c2313q;
            this.f7220b = obj;
            this.f7221c = c2271b;
            this.f7222d = i;
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo4049a(C2325f c2325f) {
        m25830b((C4038c) c2325f);
    }

    public C4689h(C4023l[] c4023lArr, C2160h c2160h, C2275j c2275j, boolean z, Handler handler, C2271b c2271b, C2195e c2195e) {
        this.f19361a = c4023lArr;
        this.f19363c = c2160h;
        this.f19364d = c2275j;
        this.f19379s = z;
        this.f19368h = handler;
        this.f19372l = c2271b;
        this.f19369i = c2195e;
        this.f19362b = new C2277m[c4023lArr.length];
        for (int i = false; i < c4023lArr.length; i++) {
            c4023lArr[i].mo4029a(i);
            this.f19362b[i] = c4023lArr[i].mo4034b();
        }
        this.f19365e = new C3957p();
        this.f19377q = new C4023l[null];
        this.f19370j = new C2312b();
        this.f19371k = new C2311a();
        c2160h.m7907a((C2159a) this);
        this.f19373m = C2276k.f7224a;
        this.f19367g = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f19367g.start();
        this.f19366f = new Handler(this.f19367g.getLooper(), this);
    }

    /* renamed from: a */
    public void m25825a(C2321d c2321d, boolean z) {
        this.f19366f.obtainMessage(0, z, 0, c2321d).sendToTarget();
    }

    /* renamed from: a */
    public void m25827a(boolean z) {
        this.f19366f.obtainMessage(1, z, 0).sendToTarget();
    }

    /* renamed from: a */
    public void m25822a(C2313q c2313q, int i, long j) {
        this.f19366f.obtainMessage(3, new C2272c(c2313q, i, j)).sendToTarget();
    }

    /* renamed from: a */
    public void m25821a() {
        this.f19366f.sendEmptyMessage(5);
    }

    /* renamed from: a */
    public void m25828a(C2194c... c2194cArr) {
        if (this.f19378r) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.f19383w++;
        this.f19366f.obtainMessage(11, c2194cArr).sendToTarget();
    }

    /* renamed from: b */
    public synchronized void m25831b(com.google.android.exoplayer2.C2195e.C2194c... r4) {
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
        r3 = this;
        monitor-enter(r3);
        r0 = r3.f19378r;	 Catch:{ all -> 0x0031 }
        if (r0 == 0) goto L_0x000e;	 Catch:{ all -> 0x0031 }
    L_0x0005:
        r4 = "ExoPlayerImplInternal";	 Catch:{ all -> 0x0031 }
        r0 = "Ignoring messages sent after release.";	 Catch:{ all -> 0x0031 }
        android.util.Log.w(r4, r0);	 Catch:{ all -> 0x0031 }
        monitor-exit(r3);
        return;
    L_0x000e:
        r0 = r3.f19383w;	 Catch:{ all -> 0x0031 }
        r1 = r0 + 1;	 Catch:{ all -> 0x0031 }
        r3.f19383w = r1;	 Catch:{ all -> 0x0031 }
        r1 = r3.f19366f;	 Catch:{ all -> 0x0031 }
        r2 = 11;	 Catch:{ all -> 0x0031 }
        r4 = r1.obtainMessage(r2, r4);	 Catch:{ all -> 0x0031 }
        r4.sendToTarget();	 Catch:{ all -> 0x0031 }
    L_0x001f:
        r4 = r3.f19384x;	 Catch:{ all -> 0x0031 }
        if (r4 > r0) goto L_0x002f;
    L_0x0023:
        r3.wait();	 Catch:{ InterruptedException -> 0x0027 }
        goto L_0x001f;
    L_0x0027:
        r4 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0031 }
        r4.interrupt();	 Catch:{ all -> 0x0031 }
        goto L_0x001f;
    L_0x002f:
        monitor-exit(r3);
        return;
    L_0x0031:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.h.b(com.google.android.exoplayer2.e$c[]):void");
    }

    /* renamed from: b */
    public synchronized void m25829b() {
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
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f19378r;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r2);
        return;
    L_0x0007:
        r0 = r2.f19366f;	 Catch:{ all -> 0x0024 }
        r1 = 6;	 Catch:{ all -> 0x0024 }
        r0.sendEmptyMessage(r1);	 Catch:{ all -> 0x0024 }
    L_0x000d:
        r0 = r2.f19378r;	 Catch:{ all -> 0x0024 }
        if (r0 != 0) goto L_0x001d;
    L_0x0011:
        r2.wait();	 Catch:{ InterruptedException -> 0x0015 }
        goto L_0x000d;
    L_0x0015:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0024 }
        r0.interrupt();	 Catch:{ all -> 0x0024 }
        goto L_0x000d;	 Catch:{ all -> 0x0024 }
    L_0x001d:
        r0 = r2.f19367g;	 Catch:{ all -> 0x0024 }
        r0.quit();	 Catch:{ all -> 0x0024 }
        monitor-exit(r2);
        return;
    L_0x0024:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.h.b():void");
    }

    /* renamed from: a */
    public void mo1675a(C2313q c2313q, Object obj) {
        this.f19366f.obtainMessage(7, Pair.create(c2313q, obj)).sendToTarget();
    }

    /* renamed from: a */
    public void mo4048a(C4038c c4038c) {
        this.f19366f.obtainMessage(8, c4038c).sendToTarget();
    }

    /* renamed from: b */
    public void m25830b(C4038c c4038c) {
        this.f19366f.obtainMessage(9, c4038c).sendToTarget();
    }

    public boolean handleMessage(Message message) {
        try {
            boolean z = false;
            switch (message.what) {
                case 0:
                    C2321d c2321d = (C2321d) message.obj;
                    if (message.arg1 != null) {
                        z = true;
                    }
                    m25800b(c2321d, z);
                    return true;
                case 1:
                    if (message.arg1 != null) {
                        z = true;
                    }
                    m25806c(z);
                    return true;
                case 2:
                    m25813f();
                    return true;
                case 3:
                    m25791a((C2272c) message.obj);
                    return true;
                case 4:
                    m25792a((C2276k) message.obj);
                    return true;
                case 5:
                    m25814g();
                    return true;
                case 6:
                    m25815h();
                    return true;
                case 7:
                    m25789a((Pair) message.obj);
                    return true;
                case 8:
                    m25805c((C4038c) message.obj);
                    return true;
                case 9:
                    m25809d((C4038c) message.obj);
                    return true;
                case 10:
                    m25816i();
                    return true;
                case 11:
                    m25807c((C2194c[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (Message message2) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", message2);
            this.f19368h.obtainMessage(8, message2).sendToTarget();
            m25814g();
            return true;
        } catch (IOException e) {
            Log.e("ExoPlayerImplInternal", "Source error.", e);
            this.f19368h.obtainMessage(8, ExoPlaybackException.m7731a(e)).sendToTarget();
            m25814g();
            return true;
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e2);
            this.f19368h.obtainMessage(8, ExoPlaybackException.m7733a(e2)).sendToTarget();
            m25814g();
            return true;
        }
    }

    /* renamed from: a */
    private void m25786a(int i) {
        if (this.f19382v != i) {
            this.f19382v = i;
            this.f19368h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: b */
    private void m25802b(boolean z) {
        if (this.f19381u != z) {
            this.f19381u = z;
            this.f19368h.obtainMessage(2, z, 0).sendToTarget();
        }
    }

    /* renamed from: b */
    private void m25800b(C2321d c2321d, boolean z) {
        this.f19368h.sendEmptyMessage(0);
        m25810d(true);
        this.f19364d.mo1553a();
        if (z) {
            this.f19372l = new C2271b(0, -9223372036854775807L);
        }
        this.f19376p = c2321d;
        c2321d.mo1674a(this.f19369i, true, (C2320a) this);
        m25786a(2);
        this.f19366f.sendEmptyMessage(2);
    }

    /* renamed from: c */
    private void m25806c(boolean z) {
        this.f19380t = false;
        this.f19379s = z;
        if (!z) {
            m25808d();
            m25811e();
        } else if (this.f19382v) {
            m25804c();
            this.f19366f.sendEmptyMessage(2);
        } else if (this.f19382v) {
            this.f19366f.sendEmptyMessage(2);
        }
    }

    /* renamed from: c */
    private void m25804c() {
        int i = 0;
        this.f19380t = false;
        this.f19365e.m19690a();
        C4023l[] c4023lArr = this.f19377q;
        int length = c4023lArr.length;
        while (i < length) {
            c4023lArr[i].mo4037e();
            i++;
        }
    }

    /* renamed from: d */
    private void m25808d() {
        this.f19365e.m19693b();
        for (C4023l a : this.f19377q) {
            m25793a(a);
        }
    }

    /* renamed from: e */
    private void m25811e() {
        if (this.f19359E != null) {
            long j;
            long f = this.f19359E.f7193a.mo4066f();
            if (f != -9223372036854775807L) {
                m25787a(f);
            } else {
                if (this.f19374n == null || this.f19374n.mo4680u()) {
                    this.f19356B = this.f19365e.mo1551w();
                } else {
                    this.f19356B = this.f19375o.mo1551w();
                    this.f19365e.m19691a(this.f19356B);
                }
                f = this.f19359E.m8347b(this.f19356B);
            }
            this.f19372l.f7214c = f;
            this.f19385y = SystemClock.elapsedRealtime() * 1000;
            if (this.f19377q.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f19359E.f7193a.mo4067g();
            }
            C2271b c2271b = this.f19372l;
            if (j == Long.MIN_VALUE) {
                j = this.f19360F.m8463a(this.f19359E.f7198f, this.f19371k).m8455a();
            }
            c2271b.f7215d = j;
        }
    }

    /* renamed from: f */
    private void m25813f() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m25818k();
        if (this.f19359E == null) {
            m25817j();
            m25788a(elapsedRealtime, 10);
            return;
        }
        C2184r.m8036a("doSomeWork");
        m25811e();
        r0.f19359E.f7193a.mo4055a(r0.f19372l.f7214c);
        Object obj = 1;
        boolean z = true;
        for (C4023l c4023l : r0.f19377q) {
            Object obj2;
            c4023l.mo4673a(r0.f19356B, r0.f19385y);
            obj = (obj == null || !c4023l.mo4680u()) ? null : 1;
            if (!c4023l.mo4679t()) {
                if (!c4023l.mo4680u()) {
                    obj2 = null;
                    if (obj2 == null) {
                        c4023l.mo4042j();
                    }
                    z = z && obj2 != null;
                }
            }
            obj2 = 1;
            if (obj2 == null) {
                c4023l.mo4042j();
            }
            if (!z) {
            }
        }
        if (!z) {
            m25817j();
        }
        if (r0.f19375o != null) {
            C2276k x = r0.f19375o.mo1552x();
            if (!x.equals(r0.f19373m)) {
                r0.f19373m = x;
                r0.f19365e.m19692a(r0.f19375o);
                r0.f19368h.obtainMessage(7, x).sendToTarget();
            }
        }
        long a = r0.f19360F.m8463a(r0.f19359E.f7198f, r0.f19371k).m8455a();
        if (obj != null && ((a == -9223372036854775807L || a <= r0.f19372l.f7214c) && r0.f19359E.f7200h)) {
            m25786a(4);
            m25808d();
        } else if (r0.f19382v == 2) {
            boolean b = r0.f19377q.length > 0 ? z && m25812e(r0.f19380t) : m25803b(a);
            if (b) {
                m25786a(3);
                if (r0.f19379s) {
                    m25804c();
                }
            }
        } else if (r0.f19382v == 3) {
            if (r0.f19377q.length <= 0) {
                z = m25803b(a);
            }
            if (!z) {
                r0.f19380t = r0.f19379s;
                m25786a(2);
                m25808d();
            }
        }
        if (r0.f19382v == 2) {
            for (C4023l j : r0.f19377q) {
                j.mo4042j();
            }
        }
        if ((r0.f19379s && r0.f19382v == 3) || r0.f19382v == 2) {
            m25788a(elapsedRealtime, 10);
        } else if (r0.f19377q.length != 0) {
            m25788a(elapsedRealtime, 1000);
        } else {
            r0.f19366f.removeMessages(2);
        }
        C2184r.m8035a();
    }

    /* renamed from: a */
    private void m25788a(long j, long j2) {
        this.f19366f.removeMessages(2);
        j = (j + j2) - SystemClock.elapsedRealtime();
        if (j <= 0) {
            this.f19366f.sendEmptyMessage(2);
        } else {
            this.f19366f.sendEmptyMessageDelayed(2, j);
        }
    }

    /* renamed from: a */
    private void m25791a(C2272c c2272c) {
        int i = 1;
        if (this.f19360F == null) {
            this.f19386z++;
            this.f19355A = c2272c;
            return;
        }
        Pair b = m25797b(c2272c);
        if (b == null) {
            this.f19372l = new C2271b(0, 0);
            this.f19368h.obtainMessage(4, 1, 0, this.f19372l).sendToTarget();
            this.f19372l = new C2271b(0, -9223372036854775807L);
            m25786a(4);
            m25810d(false);
            return;
        }
        c2272c = c2272c.f7218c == -9223372036854775807L ? true : null;
        int intValue = ((Integer) b.first).intValue();
        long longValue = ((Long) b.second).longValue();
        try {
            if (intValue != this.f19372l.f7212a || longValue / 1000 != this.f19372l.f7214c / 1000) {
                long a = m25784a(intValue, longValue);
                c2272c |= longValue != a ? 1 : 0;
                this.f19372l = new C2271b(intValue, a);
                Handler handler = this.f19368h;
                if (c2272c == null) {
                    i = 0;
                }
                handler.obtainMessage(4, i, 0, this.f19372l).sendToTarget();
            }
        } finally {
            this.f19372l = new C2271b(intValue, longValue);
            this.f19368h.obtainMessage(4, c2272c, 0, this.f19372l).sendToTarget();
        }
    }

    /* renamed from: a */
    private long m25784a(int i, long j) {
        C2270a c2270a;
        m25808d();
        this.f19380t = false;
        m25786a(2);
        if (this.f19359E == null) {
            if (this.f19357C != 0) {
                this.f19357C.m8351e();
            }
            c2270a = null;
        } else {
            C2270a c2270a2 = this.f19359E;
            c2270a = null;
            while (c2270a2 != null) {
                if (c2270a2.f7198f == i && c2270a2.f7201i) {
                    c2270a = c2270a2;
                } else {
                    c2270a2.m8351e();
                }
                c2270a2 = c2270a2.f7203k;
            }
        }
        if (!(this.f19359E == c2270a && this.f19359E == this.f19358D)) {
            for (C4023l l : this.f19377q) {
                l.mo4044l();
            }
            this.f19377q = new C4023l[0];
            this.f19375o = null;
            this.f19374n = null;
            this.f19359E = null;
        }
        if (c2270a != null) {
            c2270a.f7203k = null;
            this.f19357C = c2270a;
            this.f19358D = c2270a;
            m25799b(c2270a);
            if (this.f19359E.f7202j != 0) {
                j = this.f19359E.f7193a.mo4062c(j);
            }
            m25787a(j);
            m25820m();
        } else {
            this.f19357C = null;
            this.f19358D = null;
            this.f19359E = null;
            m25787a(j);
        }
        this.f19366f.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: a */
    private void m25787a(long j) {
        if (this.f19359E == null) {
            j += 60000000;
        } else {
            j = this.f19359E.m8343a(j);
        }
        this.f19356B = j;
        this.f19365e.m19691a(this.f19356B);
        for (C4023l a : this.f19377q) {
            a.mo4031a(this.f19356B);
        }
    }

    /* renamed from: a */
    private void m25792a(C2276k c2276k) {
        if (this.f19375o != null) {
            c2276k = this.f19375o.mo1550a(c2276k);
        } else {
            c2276k = this.f19365e.mo1550a(c2276k);
        }
        this.f19373m = c2276k;
        this.f19368h.obtainMessage(7, c2276k).sendToTarget();
    }

    /* renamed from: g */
    private void m25814g() {
        m25810d(true);
        this.f19364d.mo1557b();
        m25786a(1);
    }

    /* renamed from: h */
    private void m25815h() {
        m25810d(true);
        this.f19364d.mo1558c();
        m25786a(1);
        synchronized (this) {
            this.f19378r = true;
            notifyAll();
        }
    }

    /* renamed from: d */
    private void m25810d(boolean z) {
        this.f19366f.removeMessages(2);
        this.f19380t = false;
        this.f19365e.m19693b();
        this.f19375o = null;
        this.f19374n = null;
        this.f19356B = 60000000;
        for (C4023l c4023l : this.f19377q) {
            try {
                m25793a(c4023l);
                c4023l.mo4044l();
            } catch (Throwable e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f19377q = new C4023l[0];
        m25790a(this.f19359E != null ? this.f19359E : this.f19357C);
        this.f19357C = null;
        this.f19358D = null;
        this.f19359E = null;
        m25802b(false);
        if (z) {
            if (this.f19376p) {
                this.f19376p.mo1677b();
                this.f19376p = null;
            }
            this.f19360F = null;
        }
    }

    /* renamed from: c */
    private void m25807c(C2194c[] c2194cArr) {
        try {
            for (C2194c c2194c : c2194cArr) {
                c2194c.f6778a.mo4030a(c2194c.f6779b, c2194c.f6780c);
            }
            if (this.f19376p != null) {
                this.f19366f.sendEmptyMessage(2);
            }
            synchronized (this) {
                this.f19384x++;
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f19384x++;
                notifyAll();
            }
        }
    }

    /* renamed from: a */
    private void m25793a(C4023l c4023l) {
        if (c4023l.mo4036d() == 2) {
            c4023l.mo4043k();
        }
    }

    /* renamed from: i */
    private void m25816i() {
        if (this.f19359E != null) {
            C2270a c2270a = this.f19359E;
            Object obj = 1;
            while (c2270a != null) {
                if (!c2270a.f7201i) {
                    break;
                } else if (c2270a.m8350d()) {
                    if (obj != null) {
                        boolean z = this.f19358D != this.f19359E;
                        m25790a(this.f19359E.f7203k);
                        this.f19359E.f7203k = null;
                        this.f19357C = this.f19359E;
                        this.f19358D = this.f19359E;
                        boolean[] zArr = new boolean[this.f19361a.length];
                        long a = this.f19359E.m8345a(this.f19372l.f7214c, z, zArr);
                        if (a != this.f19372l.f7214c) {
                            this.f19372l.f7214c = a;
                            m25787a(a);
                        }
                        boolean[] zArr2 = new boolean[this.f19361a.length];
                        int i = 0;
                        for (int i2 = 0; i2 < this.f19361a.length; i2++) {
                            C4023l c4023l = this.f19361a[i2];
                            zArr2[i2] = c4023l.mo4036d() != 0;
                            C2323e c2323e = this.f19359E.f7195c[i2];
                            if (c2323e != null) {
                                i++;
                            }
                            if (zArr2[i2]) {
                                if (c2323e != c4023l.mo4038f()) {
                                    if (c4023l == this.f19374n) {
                                        if (c2323e == null) {
                                            this.f19365e.m19692a(this.f19375o);
                                        }
                                        this.f19375o = null;
                                        this.f19374n = null;
                                    }
                                    m25793a(c4023l);
                                    c4023l.mo4044l();
                                } else if (zArr[i2]) {
                                    c4023l.mo4031a(this.f19356B);
                                }
                            }
                        }
                        this.f19368h.obtainMessage(3, c2270a.f7205m).sendToTarget();
                        m25795a(zArr2, i);
                    } else {
                        this.f19357C = c2270a;
                        for (c2270a = this.f19357C.f7203k; c2270a != null; c2270a = c2270a.f7203k) {
                            c2270a.m8351e();
                        }
                        this.f19357C.f7203k = null;
                        if (this.f19357C.f7201i) {
                            this.f19357C.m8344a(Math.max(this.f19357C.f7199g, this.f19357C.m8347b(this.f19356B)), false);
                        }
                    }
                    m25820m();
                    m25811e();
                    this.f19366f.sendEmptyMessage(2);
                    return;
                } else {
                    if (c2270a == this.f19358D) {
                        obj = null;
                    }
                    c2270a = c2270a.f7203k;
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m25803b(long j) {
        if (j != -9223372036854775807L && this.f19372l.f7214c >= j) {
            if (this.f19359E.f7203k == null || this.f19359E.f7203k.f7201i == null) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: e */
    private boolean m25812e(boolean z) {
        long g;
        if (this.f19357C.f7201i) {
            g = this.f19357C.f7193a.mo4067g();
        } else {
            g = this.f19357C.f7199g;
        }
        if (g == Long.MIN_VALUE) {
            if (this.f19357C.f7200h) {
                return true;
            }
            g = this.f19360F.m8463a(this.f19357C.f7198f, this.f19371k).m8455a();
        }
        return this.f19364d.mo1556a(g - this.f19357C.m8347b(this.f19356B), z);
    }

    /* renamed from: j */
    private void m25817j() {
        if (!(this.f19357C == null || this.f19357C.f7201i || (this.f19358D != null && this.f19358D.f7203k != this.f19357C))) {
            C4023l[] c4023lArr = this.f19377q;
            int length = c4023lArr.length;
            int i = 0;
            while (i < length) {
                if (c4023lArr[i].mo4039g()) {
                    i++;
                } else {
                    return;
                }
            }
            this.f19357C.f7193a.mo4063c();
        }
    }

    /* renamed from: a */
    private void m25789a(Pair<C2313q, Object> pair) {
        int i;
        C2270a c2270a;
        int a;
        int a2;
        int intValue;
        Object obj;
        C2270a c2270a2;
        boolean z;
        C2313q c2313q = this.f19360F;
        this.f19360F = (C2313q) pair.first;
        Object obj2 = pair.second;
        if (c2313q == null) {
            Pair b;
            if (this.f19386z > 0) {
                b = m25797b(this.f19355A);
                i = this.f19386z;
                this.f19386z = 0;
                this.f19355A = null;
                if (b == null) {
                    m25794a(obj2, i);
                    return;
                }
                this.f19372l = new C2271b(((Integer) b.first).intValue(), ((Long) b.second).longValue());
                c2270a = this.f19359E == null ? this.f19359E : this.f19357C;
                if (c2270a != null) {
                    m25801b(obj2, i);
                }
                a = this.f19360F.mo1660a(c2270a.f7194b);
                if (a != -1) {
                    a2 = m25783a(c2270a.f7198f, c2313q, this.f19360F);
                    if (a2 != -1) {
                        m25794a(obj2, i);
                        return;
                    }
                    Pair b2 = m25796b(this.f19360F.m8463a(a2, this.f19371k).f7268c, -9223372036854775807L);
                    intValue = ((Integer) b2.first).intValue();
                    long longValue = ((Long) b2.second).longValue();
                    this.f19360F.mo1661a(intValue, this.f19371k, true);
                    obj = this.f19371k.f7267b;
                    c2270a.f7198f = -1;
                    while (c2270a.f7203k != null) {
                        c2270a = c2270a.f7203k;
                        c2270a.f7198f = c2270a.f7194b.equals(obj) ? intValue : -1;
                    }
                    this.f19372l = new C2271b(intValue, m25784a(intValue, longValue));
                    m25801b(obj2, i);
                    return;
                }
                this.f19360F.m8463a(a, this.f19371k);
                boolean z2 = (a == this.f19360F.mo1664c() - 1 || this.f19360F.m8465a(this.f19371k.f7268c, this.f19370j).f7276e) ? false : true;
                c2270a.m8346a(a, z2);
                a2 = c2270a != this.f19358D ? 1 : 0;
                if (a != this.f19372l.f7212a) {
                    this.f19372l = this.f19372l.m8352a(a);
                }
                while (c2270a.f7203k != null) {
                    c2270a2 = c2270a.f7203k;
                    a++;
                    this.f19360F.mo1661a(a, this.f19371k, true);
                    z = (a == this.f19360F.mo1664c() - 1 || this.f19360F.m8465a(this.f19371k.f7268c, this.f19370j).f7276e) ? false : true;
                    if (c2270a2.f7194b.equals(this.f19371k.f7267b)) {
                        if (a2 != 0) {
                            a2 = this.f19359E.f7198f;
                            this.f19372l = new C2271b(a2, m25784a(a2, this.f19372l.f7214c));
                        } else {
                            this.f19357C = c2270a;
                            this.f19357C.f7203k = null;
                            m25790a(c2270a2);
                        }
                        m25801b(obj2, i);
                        return;
                    }
                    c2270a2.m8346a(a, z);
                    a2 |= c2270a2 != this.f19358D ? 1 : 0;
                    c2270a = c2270a2;
                }
                m25801b(obj2, i);
                return;
            } else if (this.f19372l.f7213b == -9223372036854775807L) {
                if (this.f19360F.m8468a()) {
                    m25794a(obj2, 0);
                    return;
                } else {
                    b = m25796b(0, -9223372036854775807L);
                    this.f19372l = new C2271b(((Integer) b.first).intValue(), ((Long) b.second).longValue());
                }
            }
        }
        i = 0;
        if (this.f19359E == null) {
        }
        if (c2270a != null) {
            a = this.f19360F.mo1660a(c2270a.f7194b);
            if (a != -1) {
                this.f19360F.m8463a(a, this.f19371k);
                if (a == this.f19360F.mo1664c() - 1) {
                }
                c2270a.m8346a(a, z2);
                if (c2270a != this.f19358D) {
                }
                if (a != this.f19372l.f7212a) {
                    this.f19372l = this.f19372l.m8352a(a);
                }
                while (c2270a.f7203k != null) {
                    c2270a2 = c2270a.f7203k;
                    a++;
                    this.f19360F.mo1661a(a, this.f19371k, true);
                    if (a == this.f19360F.mo1664c() - 1) {
                    }
                    if (c2270a2.f7194b.equals(this.f19371k.f7267b)) {
                        if (a2 != 0) {
                            this.f19357C = c2270a;
                            this.f19357C.f7203k = null;
                            m25790a(c2270a2);
                        } else {
                            a2 = this.f19359E.f7198f;
                            this.f19372l = new C2271b(a2, m25784a(a2, this.f19372l.f7214c));
                        }
                        m25801b(obj2, i);
                        return;
                    }
                    c2270a2.m8346a(a, z);
                    if (c2270a2 != this.f19358D) {
                    }
                    a2 |= c2270a2 != this.f19358D ? 1 : 0;
                    c2270a = c2270a2;
                }
                m25801b(obj2, i);
                return;
            }
            a2 = m25783a(c2270a.f7198f, c2313q, this.f19360F);
            if (a2 != -1) {
                Pair b22 = m25796b(this.f19360F.m8463a(a2, this.f19371k).f7268c, -9223372036854775807L);
                intValue = ((Integer) b22.first).intValue();
                long longValue2 = ((Long) b22.second).longValue();
                this.f19360F.mo1661a(intValue, this.f19371k, true);
                obj = this.f19371k.f7267b;
                c2270a.f7198f = -1;
                while (c2270a.f7203k != null) {
                    c2270a = c2270a.f7203k;
                    if (c2270a.f7194b.equals(obj)) {
                    }
                    c2270a.f7198f = c2270a.f7194b.equals(obj) ? intValue : -1;
                }
                this.f19372l = new C2271b(intValue, m25784a(intValue, longValue2));
                m25801b(obj2, i);
                return;
            }
            m25794a(obj2, i);
            return;
        }
        m25801b(obj2, i);
    }

    /* renamed from: a */
    private void m25794a(Object obj, int i) {
        this.f19372l = new C2271b(0, 0);
        m25801b(obj, i);
        this.f19372l = new C2271b(0, -9223372036854775807L);
        m25786a(4);
        m25810d(false);
    }

    /* renamed from: b */
    private void m25801b(Object obj, int i) {
        this.f19368h.obtainMessage(6, new C2273d(this.f19360F, obj, this.f19372l, i)).sendToTarget();
    }

    /* renamed from: a */
    private int m25783a(int i, C2313q c2313q, C2313q c2313q2) {
        int i2 = i;
        i = -1;
        while (i == -1 && i2 < c2313q.mo1664c() - 1) {
            i2++;
            i = c2313q2.mo1660a(c2313q.mo1661a(i2, this.f19371k, true).f7267b);
        }
        return i;
    }

    /* renamed from: b */
    private android.util.Pair<java.lang.Integer, java.lang.Long> m25797b(com.google.android.exoplayer2.C4689h.C2272c r6) {
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
        r5 = this;
        r0 = r6.f7216a;
        r1 = r0.m8468a();
        if (r1 == 0) goto L_0x000a;
    L_0x0008:
        r0 = r5.f19360F;
    L_0x000a:
        r1 = r6.f7217b;	 Catch:{ IndexOutOfBoundsException -> 0x0062 }
        r2 = r6.f7218c;	 Catch:{ IndexOutOfBoundsException -> 0x0062 }
        r1 = r5.m25798b(r0, r1, r2);	 Catch:{ IndexOutOfBoundsException -> 0x0062 }
        r6 = r5.f19360F;
        if (r6 != r0) goto L_0x0017;
    L_0x0016:
        return r1;
    L_0x0017:
        r6 = r5.f19360F;
        r2 = r1.first;
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r3 = r5.f19371k;
        r4 = 1;
        r2 = r0.mo1661a(r2, r3, r4);
        r2 = r2.f7267b;
        r6 = r6.mo1660a(r2);
        r2 = -1;
        if (r6 == r2) goto L_0x003c;
    L_0x0031:
        r6 = java.lang.Integer.valueOf(r6);
        r0 = r1.second;
        r6 = android.util.Pair.create(r6, r0);
        return r6;
    L_0x003c:
        r6 = r1.first;
        r6 = (java.lang.Integer) r6;
        r6 = r6.intValue();
        r1 = r5.f19360F;
        r6 = r5.m25783a(r6, r0, r1);
        if (r6 == r2) goto L_0x0060;
    L_0x004c:
        r0 = r5.f19360F;
        r1 = r5.f19371k;
        r6 = r0.m8463a(r6, r1);
        r6 = r6.f7268c;
        r0 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r6 = r5.m25796b(r6, r0);
        return r6;
    L_0x0060:
        r6 = 0;
        return r6;
    L_0x0062:
        r0 = new com.google.android.exoplayer2.IllegalSeekPositionException;
        r1 = r5.f19360F;
        r2 = r6.f7217b;
        r3 = r6.f7218c;
        r0.<init>(r1, r2, r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.h.b(com.google.android.exoplayer2.h$c):android.util.Pair<java.lang.Integer, java.lang.Long>");
    }

    /* renamed from: b */
    private Pair<Integer, Long> m25796b(int i, long j) {
        return m25798b(this.f19360F, i, j);
    }

    /* renamed from: b */
    private Pair<Integer, Long> m25798b(C2313q c2313q, int i, long j) {
        return m25785a(c2313q, i, j, 0);
    }

    /* renamed from: a */
    private Pair<Integer, Long> m25785a(C2313q c2313q, int i, long j, long j2) {
        C2163a.m7913a(i, 0, c2313q.mo1663b());
        c2313q.mo1662a(i, this.f19370j, false, j2);
        if (j == -9223372036854775807L) {
            j = this.f19370j.m8458a();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        i = this.f19370j.f7277f;
        long c = this.f19370j.m8461c() + j;
        j = c2313q.m8463a(i, this.f19371k).m8455a();
        while (j != -9223372036854775807L && c >= j && i < this.f19370j.f7278g) {
            c -= j;
            i++;
            j = c2313q.m8463a(i, this.f19371k).m8455a();
        }
        return Pair.create(Integer.valueOf(i), Long.valueOf(c));
    }

    /* renamed from: k */
    private void m25818k() {
        if (this.f19360F == null) {
            this.f19376p.mo1673a();
            return;
        }
        int i;
        C4023l c4023l;
        C2323e c2323e;
        C2161i c2161i;
        C2161i c2161i2;
        Object obj;
        int i2;
        C4023l c4023l2;
        C2157f a;
        C4023l c4023l3;
        m25819l();
        int i3 = 0;
        if (this.f19357C != null) {
            if (!this.f19357C.m8348b()) {
                if (this.f19357C != null && this.f19357C.f7204l) {
                    m25820m();
                }
                if (this.f19359E == null) {
                    while (this.f19359E != this.f19358D && this.f19356B >= this.f19359E.f7203k.f7197e) {
                        this.f19359E.m8351e();
                        m25799b(this.f19359E.f7203k);
                        this.f19372l = new C2271b(this.f19359E.f7198f, this.f19359E.f7199g);
                        m25811e();
                        this.f19368h.obtainMessage(5, this.f19372l).sendToTarget();
                    }
                    if (this.f19358D.f7200h) {
                        i = 0;
                        while (i < this.f19361a.length) {
                            c4023l = this.f19361a[i];
                            c2323e = this.f19358D.f7195c[i];
                            if (c4023l.mo4038f() != c2323e) {
                                if (c2323e != null || c4023l.mo4039g()) {
                                    i++;
                                }
                            }
                            return;
                        }
                        if (this.f19358D.f7203k != null && this.f19358D.f7203k.f7201i) {
                            c2161i = this.f19358D.f7205m;
                            this.f19358D = this.f19358D.f7203k;
                            c2161i2 = this.f19358D.f7205m;
                            obj = this.f19358D.f7193a.mo4066f() == -9223372036854775807L ? 1 : null;
                            for (i2 = 0; i2 < this.f19361a.length; i2++) {
                                c4023l2 = this.f19361a[i2];
                                if (c2161i.f6688b.m7904a(i2) == null) {
                                    if (obj != null) {
                                        c4023l2.mo4040h();
                                    } else if (!c4023l2.mo4041i()) {
                                        a = c2161i2.f6688b.m7904a(i2);
                                        Object obj2 = c2161i.f6690d[i2];
                                        C2307n c2307n = c2161i2.f6690d[i2];
                                        if (a == null && c2307n.equals(obj2)) {
                                            Format[] formatArr = new Format[a.mo1546b()];
                                            for (int i4 = 0; i4 < formatArr.length; i4++) {
                                                formatArr[i4] = a.mo1544a(i4);
                                            }
                                            c4023l2.mo4033a(formatArr, this.f19358D.f7195c[i2], this.f19358D.m8342a());
                                        } else {
                                            c4023l2.mo4040h();
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                    while (i3 < this.f19361a.length) {
                        c4023l3 = this.f19361a[i3];
                        C2323e c2323e2 = this.f19358D.f7195c[i3];
                        if (c2323e2 != null && c4023l3.mo4038f() == c2323e2 && c4023l3.mo4039g()) {
                            c4023l3.mo4040h();
                        }
                        i3++;
                    }
                }
            }
        }
        m25802b(false);
        if (this.f19359E == null) {
            while (this.f19359E != this.f19358D) {
                this.f19359E.m8351e();
                m25799b(this.f19359E.f7203k);
                this.f19372l = new C2271b(this.f19359E.f7198f, this.f19359E.f7199g);
                m25811e();
                this.f19368h.obtainMessage(5, this.f19372l).sendToTarget();
            }
            if (this.f19358D.f7200h) {
                i = 0;
                while (i < this.f19361a.length) {
                    c4023l = this.f19361a[i];
                    c2323e = this.f19358D.f7195c[i];
                    if (c4023l.mo4038f() != c2323e) {
                        if (c2323e != null) {
                        }
                        i++;
                    }
                    return;
                }
                c2161i = this.f19358D.f7205m;
                this.f19358D = this.f19358D.f7203k;
                c2161i2 = this.f19358D.f7205m;
                if (this.f19358D.f7193a.mo4066f() == -9223372036854775807L) {
                }
                while (i2 < this.f19361a.length) {
                    c4023l2 = this.f19361a[i2];
                    if (c2161i.f6688b.m7904a(i2) == null) {
                        if (obj != null) {
                            c4023l2.mo4040h();
                        } else if (!c4023l2.mo4041i()) {
                            a = c2161i2.f6688b.m7904a(i2);
                            Object obj22 = c2161i.f6690d[i2];
                            C2307n c2307n2 = c2161i2.f6690d[i2];
                            if (a == null) {
                            }
                            c4023l2.mo4040h();
                        }
                    }
                }
                return;
            }
            while (i3 < this.f19361a.length) {
                c4023l3 = this.f19361a[i3];
                C2323e c2323e22 = this.f19358D.f7195c[i3];
                c4023l3.mo4040h();
                i3++;
            }
        }
    }

    /* renamed from: l */
    private void m25819l() {
        int i;
        if (this.f19357C == null) {
            i = r7.f19372l.f7212a;
        } else {
            i = r7.f19357C.f7198f;
            if (!r7.f19357C.f7200h && r7.f19357C.m8348b()) {
                if (r7.f19360F.m8463a(i, r7.f19371k).m8455a() != -9223372036854775807L) {
                    if (r7.f19359E == null || i - r7.f19359E.f7198f != 100) {
                        i = r7.f19357C.f7198f + 1;
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        if (i >= r7.f19360F.mo1664c()) {
            r7.f19376p.mo1673a();
            return;
        }
        long j;
        long j2 = 0;
        if (r7.f19357C == null) {
            j2 = r7.f19372l.f7214c;
        } else {
            int i2 = r7.f19360F.m8463a(i, r7.f19371k).f7268c;
            if (i == r7.f19360F.m8465a(i2, r7.f19370j).f7277f) {
                Pair a = m25785a(r7.f19360F, i2, -9223372036854775807L, Math.max(0, (r7.f19357C.m8342a() + r7.f19360F.m8463a(r7.f19357C.f7198f, r7.f19371k).m8455a()) - r7.f19356B));
                if (a != null) {
                    int intValue = ((Integer) a.first).intValue();
                    j2 = ((Long) a.second).longValue();
                    i = intValue;
                } else {
                    return;
                }
            }
        }
        long j3 = j2;
        if (r7.f19357C == null) {
            j = j3 + 60000000;
        } else {
            j = r7.f19357C.m8342a() + r7.f19360F.m8463a(r7.f19357C.f7198f, r7.f19371k).m8455a();
        }
        long j4 = j;
        r7.f19360F.mo1661a(i, r7.f19371k, true);
        boolean z = i == r7.f19360F.mo1664c() - 1 && !r7.f19360F.m8465a(r7.f19371k.f7268c, r7.f19370j).f7276e;
        C2270a c2270a = new C2270a(r7.f19361a, r7.f19362b, j4, r7.f19363c, r7.f19364d, r7.f19376p, r7.f19371k.f7267b, i, z, j3);
        if (r7.f19357C != null) {
            r7.f19357C.f7203k = c2270a;
        }
        r7.f19357C = c2270a;
        r7.f19357C.f7193a.mo4058a(r7);
        m25802b(true);
    }

    /* renamed from: c */
    private void m25805c(C4038c c4038c) {
        if (this.f19357C != null) {
            if (this.f19357C.f7193a == c4038c) {
                this.f19357C.m8349c();
                if (this.f19359E == null) {
                    this.f19358D = this.f19357C;
                    m25787a(this.f19358D.f7199g);
                    m25799b(this.f19358D);
                }
                m25820m();
            }
        }
    }

    /* renamed from: d */
    private void m25809d(C4038c c4038c) {
        if (this.f19357C != null) {
            if (this.f19357C.f7193a == c4038c) {
                m25820m();
            }
        }
    }

    /* renamed from: m */
    private void m25820m() {
        long e;
        if (this.f19357C.f7201i) {
            e = this.f19357C.f7193a.mo4065e();
        } else {
            e = 0;
        }
        if (e == Long.MIN_VALUE) {
            m25802b(false);
            return;
        }
        long b = this.f19357C.m8347b(this.f19356B);
        boolean a = this.f19364d.mo1555a(e - b);
        m25802b(a);
        if (a) {
            this.f19357C.f7204l = false;
            this.f19357C.f7193a.mo4061b(b);
            return;
        }
        this.f19357C.f7204l = true;
    }

    /* renamed from: a */
    private void m25790a(C2270a c2270a) {
        while (c2270a != null) {
            c2270a.m8351e();
            c2270a = c2270a.f7203k;
        }
    }

    /* renamed from: b */
    private void m25799b(C2270a c2270a) {
        if (this.f19359E != c2270a) {
            boolean[] zArr = new boolean[this.f19361a.length];
            int i = 0;
            int i2 = 0;
            while (i < this.f19361a.length) {
                C4023l c4023l = this.f19361a[i];
                zArr[i] = c4023l.mo4036d() != 0;
                C2157f a = c2270a.f7205m.f6688b.m7904a(i);
                if (a != null) {
                    i2++;
                }
                if (zArr[i] && (a == null || (c4023l.mo4041i() && c4023l.mo4038f() == this.f19359E.f7195c[i]))) {
                    if (c4023l == this.f19374n) {
                        this.f19365e.m19692a(this.f19375o);
                        this.f19375o = null;
                        this.f19374n = null;
                    }
                    m25793a(c4023l);
                    c4023l.mo4044l();
                }
                i++;
            }
            this.f19359E = c2270a;
            this.f19368h.obtainMessage(3, c2270a.f7205m).sendToTarget();
            m25795a(zArr, i2);
        }
    }

    /* renamed from: a */
    private void m25795a(boolean[] zArr, int i) {
        this.f19377q = new C4023l[i];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f19361a.length; i3++) {
            C4023l c4023l = this.f19361a[i3];
            C2157f a = this.f19359E.f7205m.f6688b.m7904a(i3);
            if (a != null) {
                int i4 = i2 + 1;
                this.f19377q[i2] = c4023l;
                if (c4023l.mo4036d() == 0) {
                    C2307n c2307n = this.f19359E.f7205m.f6690d[i3];
                    Object obj = (this.f19379s && this.f19382v == 3) ? 1 : null;
                    boolean z = (zArr[i3] || obj == null) ? false : true;
                    Format[] formatArr = new Format[a.mo1546b()];
                    for (int i5 = 0; i5 < formatArr.length; i5++) {
                        formatArr[i5] = a.mo1544a(i5);
                    }
                    c4023l.mo4032a(c2307n, formatArr, this.f19359E.f7195c[i3], this.f19356B, z, this.f19359E.m8342a());
                    C2169g c = c4023l.mo4035c();
                    if (c != null) {
                        if (this.f19375o == null) {
                            this.f19375o = c;
                            this.f19374n = c4023l;
                            this.f19375o.mo1550a(this.f19373m);
                        } else {
                            throw ExoPlaybackException.m7733a(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (obj != null) {
                        c4023l.mo4037e();
                    }
                }
                i2 = i4;
            }
        }
    }
}
