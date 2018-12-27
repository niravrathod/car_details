package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import okio.C2994r;
import okio.C2995s;
import okio.C2996t;
import okio.C4392a;
import okio.C4394e;
import okio.C4755c;

/* renamed from: okhttp3.internal.http2.g */
public final class C2960g {
    /* renamed from: i */
    static final /* synthetic */ boolean f12504i = (C2960g.class.desiredAssertionStatus() ^ 1);
    /* renamed from: a */
    long f12505a = 0;
    /* renamed from: b */
    long f12506b;
    /* renamed from: c */
    final int f12507c;
    /* renamed from: d */
    final C2957e f12508d;
    /* renamed from: e */
    final C4377a f12509e;
    /* renamed from: f */
    final C4754c f12510f = new C4754c(this);
    /* renamed from: g */
    final C4754c f12511g = new C4754c(this);
    /* renamed from: h */
    ErrorCode f12512h = null;
    /* renamed from: j */
    private final List<C2950a> f12513j;
    /* renamed from: k */
    private List<C2950a> f12514k;
    /* renamed from: l */
    private boolean f12515l;
    /* renamed from: m */
    private final C4378b f12516m;

    /* renamed from: okhttp3.internal.http2.g$a */
    final class C4377a implements C2994r {
        /* renamed from: c */
        static final /* synthetic */ boolean f18221c = (C2960g.class.desiredAssertionStatus() ^ 1);
        /* renamed from: a */
        boolean f18222a;
        /* renamed from: b */
        boolean f18223b;
        /* renamed from: d */
        final /* synthetic */ C2960g f18224d;
        /* renamed from: e */
        private final C4755c f18225e = new C4755c();

        C4377a(C2960g c2960g) {
            this.f18224d = c2960g;
        }

        public void a_(C4755c c4755c, long j) {
            if (!f18221c) {
                if (Thread.holdsLock(this.f18224d)) {
                    throw new AssertionError();
                }
            }
            this.f18225e.a_(c4755c, j);
            while (this.f18225e.m27502b() >= 16384) {
                m23889a(null);
            }
        }

        /* renamed from: a */
        private void m23889a(boolean z) {
            synchronized (this.f18224d) {
                this.f18224d.f12511g.m23956c();
                while (this.f18224d.f12506b <= 0 && !this.f18223b && !this.f18222a && this.f18224d.f12512h == null) {
                    try {
                        this.f18224d.m14406l();
                    } finally {
                        this.f18224d.f12511g.m27483b();
                    }
                }
                this.f18224d.m14405k();
                long min = Math.min(this.f18224d.f12506b, this.f18225e.m27502b());
                C2960g c2960g = this.f18224d;
                c2960g.f12506b -= min;
            }
            this.f18224d.f12511g.m23956c();
            try {
                C2957e c2957e = this.f18224d.f12508d;
                int i = this.f18224d.f12507c;
                boolean z2 = z && min == this.f18225e.m27502b();
                c2957e.m14350a(i, z2, this.f18225e, min);
            } finally {
                this.f18224d.f12511g.m27483b();
            }
        }

        public void flush() {
            if (!f18221c) {
                if (Thread.holdsLock(this.f18224d)) {
                    throw new AssertionError();
                }
            }
            synchronized (this.f18224d) {
                this.f18224d.m14405k();
            }
            while (this.f18225e.m27502b() > 0) {
                m23889a(false);
                this.f18224d.f12508d.m14357b();
            }
        }

        /* renamed from: a */
        public C2996t mo3624a() {
            return this.f18224d.f12511g;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
            r8 = this;
            r0 = f18221c;
            if (r0 != 0) goto L_0x0013;
        L_0x0004:
            r0 = r8.f18224d;
            r0 = java.lang.Thread.holdsLock(r0);
            if (r0 != 0) goto L_0x000d;
        L_0x000c:
            goto L_0x0013;
        L_0x000d:
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
        L_0x0013:
            r0 = r8.f18224d;
            monitor-enter(r0);
            r1 = r8.f18222a;	 Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x001c;
        L_0x001a:
            monitor-exit(r0);	 Catch:{ all -> 0x0065 }
            return;
        L_0x001c:
            monitor-exit(r0);	 Catch:{ all -> 0x0065 }
            r0 = r8.f18224d;
            r0 = r0.f12509e;
            r0 = r0.f18223b;
            r1 = 1;
            if (r0 != 0) goto L_0x004f;
        L_0x0026:
            r0 = r8.f18225e;
            r2 = r0.m27502b();
            r4 = 0;
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x0040;
        L_0x0032:
            r0 = r8.f18225e;
            r2 = r0.m27502b();
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x004f;
        L_0x003c:
            r8.m23889a(r1);
            goto L_0x0032;
        L_0x0040:
            r0 = r8.f18224d;
            r2 = r0.f12508d;
            r0 = r8.f18224d;
            r3 = r0.f12507c;
            r4 = 1;
            r5 = 0;
            r6 = 0;
            r2.m14350a(r3, r4, r5, r6);
        L_0x004f:
            r2 = r8.f18224d;
            monitor-enter(r2);
            r8.f18222a = r1;	 Catch:{ all -> 0x0062 }
            monitor-exit(r2);	 Catch:{ all -> 0x0062 }
            r0 = r8.f18224d;
            r0 = r0.f12508d;
            r0.m14357b();
            r0 = r8.f18224d;
            r0.m14404j();
            return;
        L_0x0062:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0062 }
            throw r0;
        L_0x0065:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0065 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.g.a.close():void");
        }
    }

    /* renamed from: okhttp3.internal.http2.g$b */
    private final class C4378b implements C2995s {
        /* renamed from: c */
        static final /* synthetic */ boolean f18226c = (C2960g.class.desiredAssertionStatus() ^ 1);
        /* renamed from: a */
        boolean f18227a;
        /* renamed from: b */
        boolean f18228b;
        /* renamed from: d */
        final /* synthetic */ C2960g f18229d;
        /* renamed from: e */
        private final C4755c f18230e = new C4755c();
        /* renamed from: f */
        private final C4755c f18231f = new C4755c();
        /* renamed from: g */
        private final long f18232g;

        C4378b(C2960g c2960g, long j) {
            this.f18229d = c2960g;
            this.f18232g = j;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public long mo3615a(okio.C4755c r8, long r9) {
            /*
            r7 = this;
            r0 = 0;
            r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
            if (r2 < 0) goto L_0x00a0;
        L_0x0006:
            r2 = r7.f18229d;
            monitor-enter(r2);
            r7.m23891b();	 Catch:{ all -> 0x009d }
            r7.m23892c();	 Catch:{ all -> 0x009d }
            r3 = r7.f18231f;	 Catch:{ all -> 0x009d }
            r3 = r3.m27502b();	 Catch:{ all -> 0x009d }
            r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
            if (r5 != 0) goto L_0x001d;
        L_0x0019:
            r8 = -1;
            monitor-exit(r2);	 Catch:{ all -> 0x009d }
            return r8;
        L_0x001d:
            r3 = r7.f18231f;	 Catch:{ all -> 0x009d }
            r4 = r7.f18231f;	 Catch:{ all -> 0x009d }
            r4 = r4.m27502b();	 Catch:{ all -> 0x009d }
            r9 = java.lang.Math.min(r9, r4);	 Catch:{ all -> 0x009d }
            r8 = r3.mo3615a(r8, r9);	 Catch:{ all -> 0x009d }
            r10 = r7.f18229d;	 Catch:{ all -> 0x009d }
            r3 = r10.f12505a;	 Catch:{ all -> 0x009d }
            r5 = 0;
            r3 = r3 + r8;
            r10.f12505a = r3;	 Catch:{ all -> 0x009d }
            r10 = r7.f18229d;	 Catch:{ all -> 0x009d }
            r3 = r10.f12505a;	 Catch:{ all -> 0x009d }
            r10 = r7.f18229d;	 Catch:{ all -> 0x009d }
            r10 = r10.f12508d;	 Catch:{ all -> 0x009d }
            r10 = r10.f12489k;	 Catch:{ all -> 0x009d }
            r10 = r10.m14442d();	 Catch:{ all -> 0x009d }
            r10 = r10 / 2;
            r5 = (long) r10;	 Catch:{ all -> 0x009d }
            r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r10 < 0) goto L_0x005d;
        L_0x004a:
            r10 = r7.f18229d;	 Catch:{ all -> 0x009d }
            r10 = r10.f12508d;	 Catch:{ all -> 0x009d }
            r3 = r7.f18229d;	 Catch:{ all -> 0x009d }
            r3 = r3.f12507c;	 Catch:{ all -> 0x009d }
            r4 = r7.f18229d;	 Catch:{ all -> 0x009d }
            r4 = r4.f12505a;	 Catch:{ all -> 0x009d }
            r10.m14345a(r3, r4);	 Catch:{ all -> 0x009d }
            r10 = r7.f18229d;	 Catch:{ all -> 0x009d }
            r10.f12505a = r0;	 Catch:{ all -> 0x009d }
        L_0x005d:
            monitor-exit(r2);	 Catch:{ all -> 0x009d }
            r10 = r7.f18229d;
            r10 = r10.f12508d;
            monitor-enter(r10);
            r2 = r7.f18229d;	 Catch:{ all -> 0x009a }
            r2 = r2.f12508d;	 Catch:{ all -> 0x009a }
            r3 = r2.f12487i;	 Catch:{ all -> 0x009a }
            r5 = 0;
            r3 = r3 + r8;
            r2.f12487i = r3;	 Catch:{ all -> 0x009a }
            r2 = r7.f18229d;	 Catch:{ all -> 0x009a }
            r2 = r2.f12508d;	 Catch:{ all -> 0x009a }
            r2 = r2.f12487i;	 Catch:{ all -> 0x009a }
            r4 = r7.f18229d;	 Catch:{ all -> 0x009a }
            r4 = r4.f12508d;	 Catch:{ all -> 0x009a }
            r4 = r4.f12489k;	 Catch:{ all -> 0x009a }
            r4 = r4.m14442d();	 Catch:{ all -> 0x009a }
            r4 = r4 / 2;
            r4 = (long) r4;	 Catch:{ all -> 0x009a }
            r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r6 < 0) goto L_0x0098;
        L_0x0084:
            r2 = r7.f18229d;	 Catch:{ all -> 0x009a }
            r2 = r2.f12508d;	 Catch:{ all -> 0x009a }
            r3 = 0;
            r4 = r7.f18229d;	 Catch:{ all -> 0x009a }
            r4 = r4.f12508d;	 Catch:{ all -> 0x009a }
            r4 = r4.f12487i;	 Catch:{ all -> 0x009a }
            r2.m14345a(r3, r4);	 Catch:{ all -> 0x009a }
            r2 = r7.f18229d;	 Catch:{ all -> 0x009a }
            r2 = r2.f12508d;	 Catch:{ all -> 0x009a }
            r2.f12487i = r0;	 Catch:{ all -> 0x009a }
        L_0x0098:
            monitor-exit(r10);	 Catch:{ all -> 0x009a }
            return r8;
        L_0x009a:
            r8 = move-exception;
            monitor-exit(r10);	 Catch:{ all -> 0x009a }
            throw r8;
        L_0x009d:
            r8 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x009d }
            throw r8;
        L_0x00a0:
            r8 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "byteCount < 0: ";
            r0.append(r1);
            r0.append(r9);
            r9 = r0.toString();
            r8.<init>(r9);
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.g.b.a(okio.c, long):long");
        }

        /* renamed from: b */
        private void m23891b() {
            this.f18229d.f12510f.m23956c();
            while (this.f18231f.m27502b() == 0 && !this.f18228b && !this.f18227a && this.f18229d.f12512h == null) {
                try {
                    this.f18229d.m14406l();
                } catch (Throwable th) {
                    this.f18229d.f12510f.m27483b();
                }
            }
            this.f18229d.f12510f.m27483b();
        }

        /* renamed from: a */
        void m23895a(C4394e c4394e, long j) {
            if (!f18226c) {
                if (Thread.holdsLock(this.f18229d)) {
                    throw new AssertionError();
                }
            }
            while (j > 0) {
                synchronized (this.f18229d) {
                    boolean z = this.f18228b;
                    Object obj = null;
                    Object obj2 = this.f18231f.m27502b() + j > this.f18232g ? 1 : null;
                }
                if (obj2 != null) {
                    c4394e.mo4565i(j);
                    this.f18229d.m14394b(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    c4394e.mo4565i(j);
                    return;
                } else {
                    long a = c4394e.mo3615a(this.f18230e, j);
                    if (a != -1) {
                        j -= a;
                        synchronized (this.f18229d) {
                            if (this.f18231f.m27502b() == 0) {
                                obj = 1;
                            }
                            this.f18231f.mo4545a(this.f18230e);
                            if (obj != null) {
                                this.f18229d.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        /* renamed from: a */
        public C2996t mo3616a() {
            return this.f18229d.f12510f;
        }

        public void close() {
            synchronized (this.f18229d) {
                this.f18227a = true;
                this.f18231f.m27548t();
                this.f18229d.notifyAll();
            }
            this.f18229d.m14404j();
        }

        /* renamed from: c */
        private void m23892c() {
            if (this.f18227a) {
                throw new IOException("stream closed");
            } else if (this.f18229d.f12512h != null) {
                throw new StreamResetException(this.f18229d.f12512h);
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.g$c */
    class C4754c extends C4392a {
        /* renamed from: a */
        final /* synthetic */ C2960g f20810a;

        C4754c(C2960g c2960g) {
            this.f20810a = c2960g;
        }

        /* renamed from: a */
        protected void mo4543a() {
            this.f20810a.m14394b(ErrorCode.CANCEL);
        }

        /* renamed from: a */
        protected IOException mo4542a(IOException iOException) {
            IOException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* renamed from: b */
        public void m27483b() {
            if (y_()) {
                throw mo4542a(null);
            }
        }
    }

    C2960g(int i, C2957e c2957e, boolean z, boolean z2, List<C2950a> list) {
        if (c2957e == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f12507c = i;
            this.f12508d = c2957e;
            this.f12506b = (long) c2957e.f12490l.m14442d();
            this.f12516m = new C4378b(this, (long) c2957e.f12489k.m14442d());
            this.f12509e = new C4377a(this);
            this.f12516m.f18228b = z2;
            this.f12509e.f18223b = z;
            this.f12513j = list;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    /* renamed from: a */
    public int m14389a() {
        return this.f12507c;
    }

    /* renamed from: b */
    public synchronized boolean m14395b() {
        if (this.f12512h != null) {
            return false;
        }
        if ((this.f12516m.f18228b || this.f12516m.f18227a) && ((this.f12509e.f18223b || this.f12509e.f18222a) && this.f12515l)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m14397c() {
        if (this.f12508d.f12479a == ((this.f12507c & 1) == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public synchronized List<C2950a> m14398d() {
        List<C2950a> list;
        if (m14397c()) {
            this.f12510f.m23956c();
            while (this.f12514k == null && this.f12512h == null) {
                try {
                    m14406l();
                } finally {
                    this.f12510f.m27483b();
                }
            }
            list = this.f12514k;
            if (list != null) {
                this.f12514k = null;
            } else {
                throw new StreamResetException(this.f12512h);
            }
        }
        throw new IllegalStateException("servers cannot read response headers");
        return list;
    }

    /* renamed from: e */
    public C2996t m14399e() {
        return this.f12510f;
    }

    /* renamed from: f */
    public C2996t m14400f() {
        return this.f12511g;
    }

    /* renamed from: g */
    public C2995s m14401g() {
        return this.f12516m;
    }

    /* renamed from: h */
    public C2994r m14402h() {
        synchronized (this) {
            if (!this.f12515l) {
                if (!m14397c()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f12509e;
    }

    /* renamed from: a */
    public void m14392a(ErrorCode errorCode) {
        if (m14388d(errorCode)) {
            this.f12508d.m14358b(this.f12507c, errorCode);
        }
    }

    /* renamed from: b */
    public void m14394b(ErrorCode errorCode) {
        if (m14388d(errorCode)) {
            this.f12508d.m14348a(this.f12507c, errorCode);
        }
    }

    /* renamed from: d */
    private boolean m14388d(ErrorCode errorCode) {
        if (!f12504i) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        synchronized (this) {
            if (this.f12512h != null) {
                return false;
            } else if (this.f12516m.f18228b && this.f12509e.f18223b) {
                return false;
            } else {
                this.f12512h = errorCode;
                notifyAll();
                this.f12508d.m14356b(this.f12507c);
                return true;
            }
        }
    }

    /* renamed from: a */
    void m14391a(List<C2950a> list) {
        if (!f12504i) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        synchronized (this) {
            boolean z = true;
            this.f12515l = true;
            if (this.f12514k == null) {
                this.f12514k = list;
                z = m14395b();
                notifyAll();
            } else {
                List arrayList = new ArrayList();
                arrayList.addAll(this.f12514k);
                arrayList.add(null);
                arrayList.addAll(list);
                this.f12514k = arrayList;
            }
        }
        if (!z) {
            this.f12508d.m14356b(this.f12507c);
        }
    }

    /* renamed from: a */
    void m14393a(C4394e c4394e, int i) {
        if (!f12504i) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        this.f12516m.m23895a(c4394e, (long) i);
    }

    /* renamed from: i */
    void m14403i() {
        if (!f12504i) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        synchronized (this) {
            this.f12516m.f18228b = true;
            boolean b = m14395b();
            notifyAll();
        }
        if (!b) {
            this.f12508d.m14356b(this.f12507c);
        }
    }

    /* renamed from: c */
    synchronized void m14396c(ErrorCode errorCode) {
        if (this.f12512h == null) {
            this.f12512h = errorCode;
            notifyAll();
        }
    }

    /* renamed from: j */
    void m14404j() {
        if (!f12504i) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        synchronized (this) {
            Object obj = (!this.f12516m.f18228b && this.f12516m.f18227a && (this.f12509e.f18223b || this.f12509e.f18222a)) ? 1 : null;
            boolean b = m14395b();
        }
        if (obj != null) {
            m14392a(ErrorCode.CANCEL);
        } else if (!b) {
            this.f12508d.m14356b(this.f12507c);
        }
    }

    /* renamed from: a */
    void m14390a(long j) {
        this.f12506b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: k */
    void m14405k() {
        if (this.f12509e.f18222a) {
            throw new IOException("stream closed");
        } else if (this.f12509e.f18223b) {
            throw new IOException("stream finished");
        } else if (this.f12512h != null) {
            throw new StreamResetException(this.f12512h);
        }
    }

    /* renamed from: l */
    void m14406l() {
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
        r1 = this;
        r1.wait();	 Catch:{ InterruptedException -> 0x0004 }
        return;
    L_0x0004:
        r0 = new java.io.InterruptedIOException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.g.l():void");
    }
}
