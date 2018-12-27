package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2182o;
import com.google.android.exoplayer2.upstream.C2366c.C2365a;

/* renamed from: com.google.android.exoplayer2.upstream.g */
public final class C4054g implements C2366c, C2371l<Object> {
    /* renamed from: a */
    private final Handler f16310a;
    /* renamed from: b */
    private final C2365a f16311b;
    /* renamed from: c */
    private final C2182o f16312c;
    /* renamed from: d */
    private int f16313d;
    /* renamed from: e */
    private long f16314e;
    /* renamed from: f */
    private long f16315f;
    /* renamed from: g */
    private long f16316g;
    /* renamed from: h */
    private long f16317h;
    /* renamed from: i */
    private long f16318i;

    public C4054g() {
        this(null, null);
    }

    public C4054g(Handler handler, C2365a c2365a) {
        this(handler, c2365a, 2000);
    }

    public C4054g(Handler handler, C2365a c2365a, int i) {
        this.f16310a = handler;
        this.f16311b = c2365a;
        this.f16312c = new C2182o(i);
        this.f16318i = -1;
    }

    /* renamed from: a */
    public synchronized long mo1694a() {
        return this.f16318i;
    }

    /* renamed from: a */
    public synchronized void mo1697a(Object obj, C2369e c2369e) {
        if (this.f16313d == null) {
            this.f16314e = SystemClock.elapsedRealtime();
        }
        this.f16313d++;
    }

    /* renamed from: a */
    public synchronized void mo1696a(Object obj, int i) {
        this.f16315f += (long) i;
    }

    /* renamed from: a */
    public synchronized void mo1695a(Object obj) {
        C2163a.m7918b(this.f16313d > null ? true : null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.f16314e);
        long j = (long) i;
        this.f16316g += j;
        this.f16317h += this.f16315f;
        if (i > 0) {
            this.f16312c.m8025a((int) Math.sqrt((double) this.f16315f), (float) ((this.f16315f * 8000) / j));
            if (this.f16316g >= 2000 || this.f16317h >= 524288) {
                obj = this.f16312c.m8024a(0.5f);
                this.f16318i = Float.isNaN(obj) ? -1 : (long) obj;
            }
        }
        m20342a(i, this.f16315f, this.f16318i);
        obj = this.f16313d - 1;
        this.f16313d = obj;
        if (obj > null) {
            this.f16314e = elapsedRealtime;
        }
        this.f16315f = 0;
    }

    /* renamed from: a */
    private void m20342a(int i, long j, long j2) {
        if (this.f16310a != null && this.f16311b != null) {
            final int i2 = i;
            final long j3 = j;
            final long j4 = j2;
            this.f16310a.post(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ C4054g f7523d;

                public void run() {
                    this.f7523d.f16311b.m8696a(i2, j3, j4);
                }
            });
        }
    }
}
