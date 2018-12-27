package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: okio.t */
public class C2996t {
    /* renamed from: c */
    public static final C2996t f12693c = new t$1();
    /* renamed from: a */
    private boolean f12694a;
    /* renamed from: b */
    private long f12695b;
    /* renamed from: d */
    private long f12696d;

    /* renamed from: a */
    public C2996t m14674a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("timeout < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (timeUnit != null) {
            this.f12696d = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long z_() {
        return this.f12696d;
    }

    public boolean A_() {
        return this.f12694a;
    }

    /* renamed from: d */
    public long m14675d() {
        if (this.f12694a) {
            return this.f12695b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: a */
    public C2996t m14673a(long j) {
        this.f12694a = true;
        this.f12695b = j;
        return this;
    }

    public C2996t B_() {
        this.f12696d = 0;
        return this;
    }

    /* renamed from: f */
    public C2996t m14676f() {
        this.f12694a = false;
        return this;
    }

    /* renamed from: g */
    public void m14677g() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (!this.f12694a) {
        } else {
            if (this.f12695b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
        }
    }
}
