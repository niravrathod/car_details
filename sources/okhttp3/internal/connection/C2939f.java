package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import okhttp3.C2895a;
import okhttp3.C2903e;
import okhttp3.C2910i;
import okhttp3.C2967j;
import okhttp3.C2977p;
import okhttp3.C2983t.C2982a;
import okhttp3.C2988w;
import okhttp3.ac;
import okhttp3.internal.C2920a;
import okhttp3.internal.C2933c;
import okhttp3.internal.connection.C2937e.C2936a;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.p156b.C2921c;

/* renamed from: okhttp3.internal.connection.f */
public final class C2939f {
    /* renamed from: d */
    static final /* synthetic */ boolean f12387d = (C2939f.class.desiredAssertionStatus() ^ 1);
    /* renamed from: a */
    public final C2895a f12388a;
    /* renamed from: b */
    public final C2903e f12389b;
    /* renamed from: c */
    public final C2977p f12390c;
    /* renamed from: e */
    private C2936a f12391e;
    /* renamed from: f */
    private ac f12392f;
    /* renamed from: g */
    private final C2967j f12393g;
    /* renamed from: h */
    private final Object f12394h;
    /* renamed from: i */
    private final C2937e f12395i;
    /* renamed from: j */
    private int f12396j;
    /* renamed from: k */
    private C4353c f12397k;
    /* renamed from: l */
    private boolean f12398l;
    /* renamed from: m */
    private boolean f12399m;
    /* renamed from: n */
    private boolean f12400n;
    /* renamed from: o */
    private C2921c f12401o;

    /* renamed from: okhttp3.internal.connection.f$a */
    public static final class C2938a extends WeakReference<C2939f> {
        /* renamed from: a */
        public final Object f12386a;

        C2938a(C2939f c2939f, Object obj) {
            super(c2939f);
            this.f12386a = obj;
        }
    }

    public C2939f(C2967j c2967j, C2895a c2895a, C2903e c2903e, C2977p c2977p, Object obj) {
        this.f12393g = c2967j;
        this.f12388a = c2895a;
        this.f12389b = c2903e;
        this.f12390c = c2977p;
        this.f12395i = new C2937e(c2895a, m14235i(), c2903e, c2977p);
        this.f12394h = obj;
    }

    /* renamed from: a */
    public C2921c m14238a(C2988w c2988w, C2982a c2982a, boolean z) {
        try {
            c2988w = m14232a(c2982a.mo3621c(), c2982a.mo3622d(), c2982a.mo3623e(), c2988w.m14584d(), c2988w.m14600t(), z).m23805a(c2988w, c2982a, this);
            synchronized (this.f12393g) {
                this.f12401o = c2988w;
            }
            return c2988w;
        } catch (C2988w c2988w2) {
            throw new RouteException(c2988w2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private okhttp3.internal.connection.C4353c m14232a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
        r3 = this;
    L_0x0000:
        r0 = r3.m14231a(r4, r5, r6, r7, r8);
        r1 = r3.f12393g;
        monitor-enter(r1);
        r2 = r0.f18136b;	 Catch:{ all -> 0x0019 }
        if (r2 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        return r0;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        r1 = r0.m23811a(r9);
        if (r1 != 0) goto L_0x0018;
    L_0x0014:
        r3.m14245e();
        goto L_0x0000;
    L_0x0018:
        return r0;
    L_0x0019:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.f.a(int, int, int, int, boolean, boolean):okhttp3.internal.connection.c");
    }

    /* renamed from: a */
    private C4353c m14231a(int i, int i2, int i3, int i4, boolean z) {
        Socket h;
        C2910i c2910i;
        C2910i c2910i2;
        ac acVar;
        Object obj;
        synchronized (this.f12393g) {
            if (r1.f12399m) {
                throw new IllegalStateException("released");
            } else if (r1.f12401o != null) {
                throw new IllegalStateException("codec != null");
            } else if (r1.f12400n) {
                throw new IOException("Canceled");
            } else {
                C4353c c4353c = r1.f12397k;
                h = m14234h();
                Socket socket = null;
                if (r1.f12397k != null) {
                    c4353c = r1.f12397k;
                    c2910i = null;
                } else {
                    c2910i = c4353c;
                    c4353c = null;
                }
                if (!r1.f12398l) {
                    c2910i = null;
                }
                if (c4353c == null) {
                    C2920a.f12341a.mo3681a(r1.f12393g, r1.f12388a, r1, null);
                    if (r1.f12397k != null) {
                        c2910i2 = r1.f12397k;
                        acVar = null;
                        obj = 1;
                    } else {
                        acVar = r1.f12392f;
                        c2910i2 = c4353c;
                    }
                } else {
                    c2910i2 = c4353c;
                    acVar = null;
                }
                obj = null;
            }
        }
        C2933c.m14195a(h);
        if (c2910i != null) {
            r1.f12390c.m14521b(r1.f12389b, c2910i);
        }
        if (obj != null) {
            r1.f12390c.m14516a(r1.f12389b, c2910i2);
        }
        if (c2910i2 != null) {
            return c2910i2;
        }
        Object obj2;
        if (acVar != null || (r1.f12391e != null && r1.f12391e.m14219a())) {
            obj2 = null;
        } else {
            r1.f12391e = r1.f12395i.m14229b();
            obj2 = 1;
        }
        synchronized (r1.f12393g) {
            if (r1.f12400n) {
                throw new IOException("Canceled");
            }
            if (obj2 != null) {
                List c = r1.f12391e.m14221c();
                int size = c.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ac acVar2 = (ac) c.get(i5);
                    C2920a.f12341a.mo3681a(r1.f12393g, r1.f12388a, r1, acVar2);
                    if (r1.f12397k != null) {
                        c2910i2 = r1.f12397k;
                        r1.f12392f = acVar2;
                        obj = 1;
                        break;
                    }
                }
            }
            if (obj == null) {
                if (acVar == null) {
                    acVar = r1.f12391e.m14220b();
                }
                r1.f12392f = acVar;
                r1.f12396j = 0;
                c2910i2 = new C4353c(r1.f12393g, acVar);
                m14240a(c2910i2, false);
            }
        }
        if (obj != null) {
            r1.f12390c.m14516a(r1.f12389b, c2910i2);
            return c2910i2;
        }
        c2910i2.m23806a(i, i2, i3, i4, z, r1.f12389b, r1.f12390c);
        m14235i().m14217b(c2910i2.m23812b());
        synchronized (r1.f12393g) {
            r1.f12398l = true;
            C2920a.f12341a.mo3688b(r1.f12393g, c2910i2);
            if (c2910i2.m23816f()) {
                socket = C2920a.f12341a.mo3680a(r1.f12393g, r1.f12388a, r1);
                c2910i2 = r1.f12397k;
            }
        }
        C2933c.m14195a(socket);
        r1.f12390c.m14516a(r1.f12389b, c2910i2);
        return c2910i2;
    }

    /* renamed from: h */
    private Socket m14234h() {
        if (!f12387d) {
            if (!Thread.holdsLock(this.f12393g)) {
                throw new AssertionError();
            }
        }
        C4353c c4353c = this.f12397k;
        return (c4353c == null || !c4353c.f18135a) ? null : m14230a(false, false, true);
    }

    /* renamed from: a */
    public void m14241a(boolean z, C2921c c2921c, long j, IOException iOException) {
        Socket a;
        this.f12390c.m14520b(this.f12389b, j);
        synchronized (this.f12393g) {
            if (c2921c != null) {
                if (c2921c == this.f12401o) {
                    if (!z) {
                        C4353c c4353c = this.f12397k;
                        c4353c.f18136b++;
                    }
                    C2910i c2910i = this.f12397k;
                    a = m14230a(z, false, true);
                    if (this.f12397k != null) {
                        c2910i = null;
                    }
                    c2921c = this.f12399m;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected ");
            stringBuilder.append(this.f12401o);
            stringBuilder.append(" but was ");
            stringBuilder.append(c2921c);
            throw new IllegalStateException(stringBuilder.toString());
        }
        C2933c.m14195a(a);
        if (c2910i != null) {
            this.f12390c.m14521b(this.f12389b, c2910i);
        }
        if (iOException != null) {
            this.f12390c.m14509a(this.f12389b, iOException);
        } else if (c2921c != null) {
            this.f12390c.m14526g(this.f12389b);
        }
    }

    /* renamed from: a */
    public C2921c m14237a() {
        C2921c c2921c;
        synchronized (this.f12393g) {
            c2921c = this.f12401o;
        }
        return c2921c;
    }

    /* renamed from: i */
    private C2935d m14235i() {
        return C2920a.f12341a.mo3682a(this.f12393g);
    }

    /* renamed from: b */
    public ac m14242b() {
        return this.f12392f;
    }

    /* renamed from: c */
    public synchronized C4353c m14243c() {
        return this.f12397k;
    }

    /* renamed from: d */
    public void m14244d() {
        Socket a;
        synchronized (this.f12393g) {
            C2910i c2910i = this.f12397k;
            a = m14230a(false, true, false);
            if (this.f12397k != null) {
                c2910i = null;
            }
        }
        C2933c.m14195a(a);
        if (c2910i != null) {
            this.f12390c.m14521b(this.f12389b, c2910i);
        }
    }

    /* renamed from: e */
    public void m14245e() {
        Socket a;
        synchronized (this.f12393g) {
            C2910i c2910i = this.f12397k;
            a = m14230a(true, false, false);
            if (this.f12397k != null) {
                c2910i = null;
            }
        }
        C2933c.m14195a(a);
        if (c2910i != null) {
            this.f12390c.m14521b(this.f12389b, c2910i);
        }
    }

    /* renamed from: a */
    private Socket m14230a(boolean z, boolean z2, boolean z3) {
        if (!f12387d) {
            if (!Thread.holdsLock(this.f12393g)) {
                throw new AssertionError();
            }
        }
        if (z3) {
            this.f12401o = null;
        }
        if (z2) {
            this.f12399m = true;
        }
        if (this.f12397k) {
            if (z) {
                this.f12397k.f18135a = true;
            }
            if (!this.f12401o && (this.f12399m || this.f12397k.f18135a)) {
                m14233b(this.f12397k);
                if (this.f12397k.f18138d.isEmpty()) {
                    this.f12397k.f18139e = System.nanoTime();
                    if (C2920a.f12341a.mo3687a(this.f12393g, this.f12397k)) {
                        z = this.f12397k.m23814d();
                        this.f12397k = null;
                        return z;
                    }
                }
                z = false;
                this.f12397k = null;
                return z;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void m14246f() {
        synchronized (this.f12393g) {
            this.f12400n = true;
            C2921c c2921c = this.f12401o;
            C4353c c4353c = this.f12397k;
        }
        if (c2921c != null) {
            c2921c.mo3634c();
        } else if (c4353c != null) {
            c4353c.m23813c();
        }
    }

    /* renamed from: a */
    public void m14239a(IOException iOException) {
        C2910i c2910i;
        Socket a;
        synchronized (this.f12393g) {
            boolean z;
            if (iOException instanceof StreamResetException) {
                StreamResetException streamResetException = (StreamResetException) iOException;
                if (streamResetException.errorCode == ErrorCode.REFUSED_STREAM) {
                    this.f12396j++;
                }
                if (streamResetException.errorCode != ErrorCode.REFUSED_STREAM || this.f12396j > 1) {
                    this.f12392f = null;
                }
                z = null;
                c2910i = this.f12397k;
                a = m14230a(z, false, true);
                if (!(this.f12397k == null && this.f12398l)) {
                    c2910i = null;
                }
            } else {
                if (this.f12397k != null && (!this.f12397k.m23816f() || (iOException instanceof ConnectionShutdownException))) {
                    if (this.f12397k.f18136b == 0) {
                        if (!(this.f12392f == null || iOException == null)) {
                            this.f12395i.m14227a(this.f12392f, iOException);
                        }
                        this.f12392f = null;
                    }
                }
                z = null;
                c2910i = this.f12397k;
                a = m14230a(z, false, true);
                c2910i = null;
            }
            z = true;
            c2910i = this.f12397k;
            a = m14230a(z, false, true);
            c2910i = null;
        }
        C2933c.m14195a(a);
        if (c2910i != null) {
            this.f12390c.m14521b(this.f12389b, c2910i);
        }
    }

    /* renamed from: a */
    public void m14240a(C4353c c4353c, boolean z) {
        if (!f12387d) {
            if (!Thread.holdsLock(this.f12393g)) {
                throw new AssertionError();
            }
        }
        if (this.f12397k == null) {
            this.f12397k = c4353c;
            this.f12398l = z;
            c4353c.f18138d.add(new C2938a(this, this.f12394h));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    private void m14233b(C4353c c4353c) {
        int size = c4353c.f18138d.size();
        for (int i = 0; i < size; i++) {
            if (((Reference) c4353c.f18138d.get(i)).get() == this) {
                c4353c.f18138d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public Socket m14236a(C4353c c4353c) {
        if (!f12387d) {
            if (!Thread.holdsLock(this.f12393g)) {
                throw new AssertionError();
            }
        }
        if (this.f12401o == null && this.f12397k.f18138d.size() == 1) {
            Reference reference = (Reference) this.f12397k.f18138d.get(0);
            Socket a = m14230a(true, false, false);
            this.f12397k = c4353c;
            c4353c.f18138d.add(reference);
            return a;
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public boolean m14247g() {
        if (this.f12392f == null && (this.f12391e == null || !this.f12391e.m14219a())) {
            if (!this.f12395i.m14228a()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        C4353c c = m14243c();
        return c != null ? c.toString() : this.f12388a.toString();
    }
}
