package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: okio.a */
public class C4392a extends C2996t {
    /* renamed from: a */
    private static final long f18267a = TimeUnit.SECONDS.toMillis(60);
    @Nullable
    /* renamed from: b */
    static C4392a f18268b;
    /* renamed from: d */
    private static final long f18269d = TimeUnit.MILLISECONDS.toNanos(f18267a);
    /* renamed from: e */
    private boolean f18270e;
    @Nullable
    /* renamed from: f */
    private C4392a f18271f;
    /* renamed from: g */
    private long f18272g;

    /* renamed from: a */
    protected void mo4543a() {
    }

    /* renamed from: c */
    public final void m23956c() {
        if (this.f18270e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long z_ = z_();
        boolean A_ = A_();
        if (z_ != 0 || A_) {
            this.f18270e = true;
            C4392a.m23946a(this, z_, A_);
        }
    }

    /* renamed from: a */
    private static synchronized void m23946a(C4392a c4392a, long j, boolean z) {
        synchronized (C4392a.class) {
            if (f18268b == null) {
                f18268b = new C4392a();
                new a$a().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                c4392a.f18272g = Math.min(j, c4392a.m14675d() - nanoTime) + nanoTime;
            } else if (j != 0) {
                c4392a.f18272g = j + nanoTime;
            } else if (z) {
                c4392a.f18272g = c4392a.m14675d();
            } else {
                throw new AssertionError();
            }
            j = c4392a.m23948b(nanoTime);
            z = f18268b;
            while (z.f18271f != null) {
                if (j < z.f18271f.m23948b(nanoTime)) {
                    break;
                }
                z = z.f18271f;
            }
            c4392a.f18271f = z.f18271f;
            z.f18271f = c4392a;
            if (z == f18268b) {
                C4392a.class.notify();
            }
        }
    }

    public final boolean y_() {
        if (!this.f18270e) {
            return false;
        }
        this.f18270e = false;
        return C4392a.m23947a(this);
    }

    /* renamed from: a */
    private static synchronized boolean m23947a(C4392a c4392a) {
        synchronized (C4392a.class) {
            for (C4392a c4392a2 = f18268b; c4392a2 != null; c4392a2 = c4392a2.f18271f) {
                if (c4392a2.f18271f == c4392a) {
                    c4392a2.f18271f = c4392a.f18271f;
                    c4392a.f18271f = null;
                    return null;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    private long m23948b(long j) {
        return this.f18272g - j;
    }

    /* renamed from: a */
    public final C2994r m23951a(C2994r c2994r) {
        return new a$1(this, c2994r);
    }

    /* renamed from: a */
    public final C2995s m23952a(C2995s c2995s) {
        return new a$2(this, c2995s);
    }

    /* renamed from: a */
    final void m23954a(boolean z) {
        if (!y_()) {
            return;
        }
        if (z) {
            throw mo4542a((IOException) false);
        }
    }

    /* renamed from: b */
    final IOException m23955b(IOException iOException) {
        if (y_()) {
            return mo4542a(iOException);
        }
        return iOException;
    }

    /* renamed from: a */
    protected IOException mo4542a(@Nullable IOException iOException) {
        IOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Nullable
    /* renamed from: e */
    static C4392a m23949e() {
        C4392a c4392a = f18268b.f18271f;
        C4392a c4392a2 = null;
        if (c4392a == null) {
            long nanoTime = System.nanoTime();
            C4392a.class.wait(f18267a);
            if (f18268b.f18271f == null && System.nanoTime() - nanoTime >= f18269d) {
                c4392a2 = f18268b;
            }
            return c4392a2;
        }
        nanoTime = c4392a.m23948b(System.nanoTime());
        if (nanoTime > 0) {
            long j = nanoTime / 1000000;
            C4392a.class.wait(j, (int) (nanoTime - (1000000 * j)));
            return null;
        }
        f18268b.f18271f = c4392a.f18271f;
        c4392a.f18271f = null;
        return c4392a;
    }
}
