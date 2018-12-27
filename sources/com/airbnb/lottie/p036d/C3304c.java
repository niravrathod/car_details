package com.airbnb.lottie.p036d;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.airbnb.lottie.C0955d;

/* renamed from: com.airbnb.lottie.d.c */
public class C3304c extends C0950a implements FrameCallback {
    /* renamed from: a */
    protected boolean f14035a = false;
    /* renamed from: b */
    private float f14036b = 1.0f;
    /* renamed from: c */
    private boolean f14037c = false;
    /* renamed from: d */
    private long f14038d = 0;
    /* renamed from: e */
    private float f14039e = 0.0f;
    /* renamed from: f */
    private int f14040f = 0;
    /* renamed from: g */
    private float f14041g = -2.14748365E9f;
    /* renamed from: h */
    private float f14042h = 2.14748365E9f;
    /* renamed from: i */
    private C0955d f14043i;

    public Object getAnimatedValue() {
        return Float.valueOf(m17000d());
    }

    /* renamed from: d */
    public float m17000d() {
        if (this.f14043i == null) {
            return 0.0f;
        }
        return (this.f14039e - this.f14043i.m4117d()) / (this.f14043i.m4118e() - this.f14043i.m4117d());
    }

    public float getAnimatedFraction() {
        if (this.f14043i == null) {
            return 0.0f;
        }
        if (m16991p()) {
            return (m17008l() - this.f14039e) / (m17008l() - m17007k());
        }
        return (this.f14039e - m17007k()) / (m17008l() - m17007k());
    }

    public long getDuration() {
        return this.f14043i == null ? 0 : (long) this.f14043i.m4116c();
    }

    /* renamed from: e */
    public float m17001e() {
        return this.f14039e;
    }

    public boolean isRunning() {
        return this.f14035a;
    }

    public void doFrame(long j) {
        m17009m();
        if (this.f14043i != null) {
            if (isRunning() != null) {
                j = System.nanoTime();
                float o = ((float) (j - this.f14038d)) / m16990o();
                float f = this.f14039e;
                if (m16991p()) {
                    o = -o;
                }
                this.f14039e = f + o;
                int c = C0953e.m4100c(this.f14039e, m17007k(), m17008l()) ^ 1;
                this.f14039e = C0953e.m4098b(this.f14039e, m17007k(), m17008l());
                this.f14038d = j;
                m4084c();
                if (c != 0) {
                    if (getRepeatCount() == -1 || this.f14040f < getRepeatCount()) {
                        m4080a();
                        this.f14040f++;
                        if (getRepeatMode() == 2) {
                            this.f14037c ^= 1;
                            m17003g();
                        } else {
                            this.f14039e = m16991p() ? m17008l() : m17007k();
                        }
                        this.f14038d = j;
                    } else {
                        this.f14039e = m17008l();
                        m17010n();
                        m4083b(m16991p());
                    }
                }
                m16992q();
            }
        }
    }

    /* renamed from: o */
    private float m16990o() {
        if (this.f14043i == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / this.f14043i.m4119f()) / Math.abs(this.f14036b);
    }

    /* renamed from: f */
    public void m17002f() {
        this.f14043i = null;
        this.f14041g = -2.14748365E9f;
        this.f14042h = 2.14748365E9f;
    }

    /* renamed from: a */
    public void m16996a(C0955d c0955d) {
        Object obj = this.f14043i == null ? 1 : null;
        this.f14043i = c0955d;
        if (obj != null) {
            m16995a((int) Math.max(this.f14041g, c0955d.m4117d()), (int) Math.min(this.f14042h, c0955d.m4118e()));
        } else {
            m16995a((int) c0955d.m4117d(), (int) c0955d.m4118e());
        }
        m16994a((int) this.f14039e);
        this.f14038d = System.nanoTime();
    }

    /* renamed from: a */
    public void m16994a(int i) {
        i = (float) i;
        if (this.f14039e != i) {
            this.f14039e = C0953e.m4098b(i, m17007k(), m17008l());
            this.f14038d = System.nanoTime();
            m4084c();
        }
    }

    /* renamed from: b */
    public void m16997b(int i) {
        m16995a(i, (int) this.f14042h);
    }

    /* renamed from: c */
    public void m16998c(int i) {
        m16995a((int) this.f14041g, i);
    }

    /* renamed from: a */
    public void m16995a(int i, int i2) {
        float d = this.f14043i == null ? -3.4028235E38f : this.f14043i.m4117d();
        float e = this.f14043i == null ? Float.MAX_VALUE : this.f14043i.m4118e();
        i = (float) i;
        this.f14041g = C0953e.m4098b(i, d, e);
        i2 = (float) i2;
        this.f14042h = C0953e.m4098b(i2, d, e);
        m16994a((int) C0953e.m4098b(this.f14039e, i, i2));
    }

    /* renamed from: g */
    public void m17003g() {
        m16993a(-m17004h());
    }

    /* renamed from: a */
    public void m16993a(float f) {
        this.f14036b = f;
    }

    /* renamed from: h */
    public float m17004h() {
        return this.f14036b;
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f14037c != 0) {
            this.f14037c = false;
            m17003g();
        }
    }

    /* renamed from: i */
    public void m17005i() {
        this.f14035a = true;
        m4081a(m16991p());
        m16994a((int) (m16991p() ? m17008l() : m17007k()));
        this.f14038d = System.nanoTime();
        this.f14040f = 0;
        m17009m();
    }

    /* renamed from: j */
    public void m17006j() {
        m17010n();
        m4083b(m16991p());
    }

    public void cancel() {
        m4082b();
        m17010n();
    }

    /* renamed from: p */
    private boolean m16991p() {
        return m17004h() < 0.0f;
    }

    /* renamed from: k */
    public float m17007k() {
        if (this.f14043i == null) {
            return 0.0f;
        }
        return this.f14041g == -2.14748365E9f ? this.f14043i.m4117d() : this.f14041g;
    }

    /* renamed from: l */
    public float m17008l() {
        if (this.f14043i == null) {
            return 0.0f;
        }
        return this.f14042h == 2.14748365E9f ? this.f14043i.m4118e() : this.f14042h;
    }

    /* renamed from: m */
    protected void m17009m() {
        if (isRunning()) {
            m16999c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: n */
    protected void m17010n() {
        m16999c(true);
    }

    /* renamed from: c */
    protected void m16999c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f14035a = false;
        }
    }

    /* renamed from: q */
    private void m16992q() {
        if (this.f14043i != null) {
            if (this.f14039e < this.f14041g || this.f14039e > this.f14042h) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f14041g), Float.valueOf(this.f14042h), Float.valueOf(this.f14039e)}));
            }
        }
    }
}
