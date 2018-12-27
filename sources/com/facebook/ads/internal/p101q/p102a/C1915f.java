package com.facebook.ads.internal.p101q.p102a;

import android.os.Handler;

/* renamed from: com.facebook.ads.internal.q.a.f */
public class C1915f {
    /* renamed from: a */
    private final Handler f5869a;
    /* renamed from: b */
    private final C1914a f5870b;
    /* renamed from: c */
    private int f5871c;
    /* renamed from: d */
    private boolean f5872d;

    /* renamed from: com.facebook.ads.internal.q.a.f$1 */
    class C19131 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1915f f5868a;

        C19131(C1915f c1915f) {
            this.f5868a = c1915f;
        }

        public void run() {
            if (this.f5868a.m7275c()) {
                this.f5868a.m7272e();
                this.f5868a.f5869a.postDelayed(this, 1000);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.q.a.f$a */
    public interface C1914a {
        /* renamed from: a */
        void mo1483a();

        /* renamed from: a */
        void mo1484a(int i);
    }

    public C1915f(int i, C1914a c1914a) {
        this(i, c1914a, new Handler());
    }

    C1915f(int i, C1914a c1914a, Handler handler) {
        this.f5872d = false;
        this.f5871c = i;
        this.f5870b = c1914a;
        this.f5869a = handler;
    }

    /* renamed from: e */
    private void m7272e() {
        this.f5871c--;
        this.f5870b.mo1484a(this.f5871c);
        if (this.f5871c == 0) {
            this.f5870b.mo1483a();
            this.f5872d = false;
        }
    }

    /* renamed from: a */
    public boolean m7273a() {
        if (this.f5871c > 0) {
            if (!m7275c()) {
                this.f5872d = true;
                this.f5870b.mo1484a(this.f5871c);
                this.f5869a.postDelayed(new C19131(this), 1000);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m7274b() {
        if (!m7275c()) {
            return false;
        }
        this.f5872d = false;
        return true;
    }

    /* renamed from: c */
    public boolean m7275c() {
        return this.f5872d;
    }

    /* renamed from: d */
    public boolean m7276d() {
        return this.f5871c <= 0;
    }
}
