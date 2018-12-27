package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.C0560r;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a */
public abstract class C0596a implements OnTouchListener {
    /* renamed from: r */
    private static final int f1893r = ViewConfiguration.getTapTimeout();
    /* renamed from: a */
    final C0594a f1894a = new C0594a();
    /* renamed from: b */
    final View f1895b;
    /* renamed from: c */
    boolean f1896c;
    /* renamed from: d */
    boolean f1897d;
    /* renamed from: e */
    boolean f1898e;
    /* renamed from: f */
    private final Interpolator f1899f = new AccelerateInterpolator();
    /* renamed from: g */
    private Runnable f1900g;
    /* renamed from: h */
    private float[] f1901h = new float[]{0.0f, 0.0f};
    /* renamed from: i */
    private float[] f1902i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: j */
    private int f1903j;
    /* renamed from: k */
    private int f1904k;
    /* renamed from: l */
    private float[] f1905l = new float[]{0.0f, 0.0f};
    /* renamed from: m */
    private float[] f1906m = new float[]{0.0f, 0.0f};
    /* renamed from: n */
    private float[] f1907n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: o */
    private boolean f1908o;
    /* renamed from: p */
    private boolean f1909p;
    /* renamed from: q */
    private boolean f1910q;

    /* renamed from: android.support.v4.widget.a$a */
    private static class C0594a {
        /* renamed from: a */
        private int f1881a;
        /* renamed from: b */
        private int f1882b;
        /* renamed from: c */
        private float f1883c;
        /* renamed from: d */
        private float f1884d;
        /* renamed from: e */
        private long f1885e = Long.MIN_VALUE;
        /* renamed from: f */
        private long f1886f = 0;
        /* renamed from: g */
        private int f1887g = 0;
        /* renamed from: h */
        private int f1888h = 0;
        /* renamed from: i */
        private long f1889i = -1;
        /* renamed from: j */
        private float f1890j;
        /* renamed from: k */
        private int f1891k;

        /* renamed from: a */
        private float m2343a(float f) {
            return ((-4.0f * f) * f) + (f * 4.0f);
        }

        C0594a() {
        }

        /* renamed from: a */
        public void m2347a(int i) {
            this.f1881a = i;
        }

        /* renamed from: b */
        public void m2349b(int i) {
            this.f1882b = i;
        }

        /* renamed from: a */
        public void m2345a() {
            this.f1885e = AnimationUtils.currentAnimationTimeMillis();
            this.f1889i = -1;
            this.f1886f = this.f1885e;
            this.f1890j = 0.5f;
            this.f1887g = 0;
            this.f1888h = 0;
        }

        /* renamed from: b */
        public void m2348b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1891k = C0596a.m2359a((int) (currentAnimationTimeMillis - this.f1885e), 0, this.f1882b);
            this.f1890j = m2344a(currentAnimationTimeMillis);
            this.f1889i = currentAnimationTimeMillis;
        }

        /* renamed from: c */
        public boolean m2350c() {
            return this.f1889i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1889i + ((long) this.f1891k);
        }

        /* renamed from: a */
        private float m2344a(long j) {
            if (j < this.f1885e) {
                return 0.0f;
            }
            if (this.f1889i >= 0) {
                if (j >= this.f1889i) {
                    return (1.0f - this.f1890j) + (this.f1890j * C0596a.m2356a(((float) (j - this.f1889i)) / ((float) this.f1891k), 0.0f, 1.0f));
                }
            }
            return C0596a.m2356a(((float) (j - this.f1885e)) / ((float) this.f1881a), 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: d */
        public void m2351d() {
            if (this.f1886f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m2343a(m2344a(currentAnimationTimeMillis));
                long j = currentAnimationTimeMillis - this.f1886f;
                this.f1886f = currentAnimationTimeMillis;
                float f = ((float) j) * a;
                this.f1887g = (int) (this.f1883c * f);
                this.f1888h = (int) (f * this.f1884d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void m2346a(float f, float f2) {
            this.f1883c = f;
            this.f1884d = f2;
        }

        /* renamed from: e */
        public int m2352e() {
            return (int) (this.f1883c / Math.abs(this.f1883c));
        }

        /* renamed from: f */
        public int m2353f() {
            return (int) (this.f1884d / Math.abs(this.f1884d));
        }

        /* renamed from: g */
        public int m2354g() {
            return this.f1887g;
        }

        /* renamed from: h */
        public int m2355h() {
            return this.f1888h;
        }
    }

    /* renamed from: android.support.v4.widget.a$b */
    private class C0595b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0596a f1892a;

        C0595b(C0596a c0596a) {
            this.f1892a = c0596a;
        }

        public void run() {
            if (this.f1892a.f1898e) {
                if (this.f1892a.f1896c) {
                    this.f1892a.f1896c = false;
                    this.f1892a.f1894a.m2345a();
                }
                C0594a c0594a = this.f1892a.f1894a;
                if (!c0594a.m2350c()) {
                    if (this.f1892a.m2367a()) {
                        if (this.f1892a.f1897d) {
                            this.f1892a.f1897d = false;
                            this.f1892a.m2370b();
                        }
                        c0594a.m2351d();
                        this.f1892a.mo481a(c0594a.m2354g(), c0594a.m2355h());
                        C0560r.m2178a(this.f1892a.f1895b, (Runnable) this);
                        return;
                    }
                }
                this.f1892a.f1898e = false;
            }
        }
    }

    /* renamed from: a */
    static float m2356a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m2359a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public abstract void mo481a(int i, int i2);

    /* renamed from: e */
    public abstract boolean mo482e(int i);

    /* renamed from: f */
    public abstract boolean mo483f(int i);

    public C0596a(View view) {
        this.f1895b = view;
        view = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((view.density * 1575.0f) + 0.5f);
        view = (int) ((view.density * 315.0f) + 1056964608);
        float f = (float) i;
        m2363a(f, f);
        view = (float) view;
        m2368b(view, view);
        m2364a(1);
        m2375e(Float.MAX_VALUE, Float.MAX_VALUE);
        m2373d(0.2f, 0.2f);
        m2371c(1.0f, 1.0f);
        m2369b(f1893r);
        m2372c(500);
        m2374d(500);
    }

    /* renamed from: a */
    public C0596a m2365a(boolean z) {
        if (this.f1909p && !z) {
            m2361d();
        }
        this.f1909p = z;
        return this;
    }

    /* renamed from: a */
    public C0596a m2363a(float f, float f2) {
        this.f1907n[0] = f / 1000.0f;
        this.f1907n[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public C0596a m2368b(float f, float f2) {
        this.f1906m[0] = f / 1000.0f;
        this.f1906m[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C0596a m2371c(float f, float f2) {
        this.f1905l[0] = f / 1000.0f;
        this.f1905l[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: a */
    public C0596a m2364a(int i) {
        this.f1903j = i;
        return this;
    }

    /* renamed from: d */
    public C0596a m2373d(float f, float f2) {
        this.f1901h[0] = f;
        this.f1901h[1] = f2;
        return this;
    }

    /* renamed from: e */
    public C0596a m2375e(float f, float f2) {
        this.f1902i[0] = f;
        this.f1902i[1] = f2;
        return this;
    }

    /* renamed from: b */
    public C0596a m2369b(int i) {
        this.f1904k = i;
        return this;
    }

    /* renamed from: c */
    public C0596a m2372c(int i) {
        this.f1894a.m2347a(i);
        return this;
    }

    /* renamed from: d */
    public C0596a m2374d(int i) {
        this.f1894a.m2349b(i);
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f1909p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1897d = true;
                this.f1908o = false;
                break;
            case 1:
            case 3:
                m2361d();
                break;
            case 2:
                break;
            default:
                break;
        }
        this.f1894a.m2346a(m2358a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f1895b.getWidth()), m2358a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f1895b.getHeight()));
        if (this.f1898e == null && m2367a() != null) {
            m2360c();
        }
        if (!(this.f1910q == null || this.f1898e == null)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    boolean m2367a() {
        C0594a c0594a = this.f1894a;
        int f = c0594a.m2353f();
        int e = c0594a.m2352e();
        return (f != 0 && mo483f(f)) || (e != 0 && mo482e(e));
    }

    /* renamed from: c */
    private void m2360c() {
        if (this.f1900g == null) {
            this.f1900g = new C0595b(this);
        }
        this.f1898e = true;
        this.f1896c = true;
        if (this.f1908o || this.f1904k <= 0) {
            this.f1900g.run();
        } else {
            C0560r.m2179a(this.f1895b, this.f1900g, (long) this.f1904k);
        }
        this.f1908o = true;
    }

    /* renamed from: d */
    private void m2361d() {
        if (this.f1896c) {
            this.f1898e = false;
        } else {
            this.f1894a.m2348b();
        }
    }

    /* renamed from: a */
    private float m2358a(int i, float f, float f2, float f3) {
        f = m2357a(this.f1901h[i], f2, this.f1902i[i], f);
        if (f == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1905l[i];
        float f5 = this.f1906m[i];
        float f6 = this.f1907n[i];
        f4 *= f3;
        if (f > 0.0f) {
            return C0596a.m2356a(f * f4, f5, f6);
        }
        return -C0596a.m2356a((-f) * f4, f5, f6);
    }

    /* renamed from: a */
    private float m2357a(float f, float f2, float f3, float f4) {
        f = C0596a.m2356a(f * f2, 0.0f, f3);
        f = m2362f(f2 - f4, f) - m2362f(f4, f);
        if (f < 0.0f) {
            f = -this.f1899f.getInterpolation(-f);
        } else if (f <= 0.0f) {
            return 0.0f;
        } else {
            f = this.f1899f.getInterpolation(f);
        }
        return C0596a.m2356a(f, -1.0f, 1.0f);
    }

    /* renamed from: f */
    private float m2362f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f1903j) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    return (this.f1898e == null || this.f1903j != Float.MIN_VALUE) ? 0.0f : 1.0f;
                }
                break;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                break;
            default:
                break;
        }
    }

    /* renamed from: b */
    void m2370b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1895b.onTouchEvent(obtain);
        obtain.recycle();
    }
}
