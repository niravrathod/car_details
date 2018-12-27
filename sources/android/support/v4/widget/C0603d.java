package android.support.v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.p017f.C0432l;
import android.support.v4.view.p019b.C3163b;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.v4.widget.d */
public class C0603d extends Drawable implements Animatable {
    /* renamed from: a */
    private static final Interpolator f1942a = new LinearInterpolator();
    /* renamed from: b */
    private static final Interpolator f1943b = new C3163b();
    /* renamed from: c */
    private static final int[] f1944c = new int[]{-16777216};
    /* renamed from: d */
    private final C0602a f1945d = new C0602a();
    /* renamed from: e */
    private float f1946e;
    /* renamed from: f */
    private Resources f1947f;
    /* renamed from: g */
    private Animator f1948g;
    /* renamed from: h */
    private float f1949h;
    /* renamed from: i */
    private boolean f1950i;

    /* renamed from: android.support.v4.widget.d$a */
    private static class C0602a {
        /* renamed from: a */
        final RectF f1921a = new RectF();
        /* renamed from: b */
        final Paint f1922b = new Paint();
        /* renamed from: c */
        final Paint f1923c = new Paint();
        /* renamed from: d */
        final Paint f1924d = new Paint();
        /* renamed from: e */
        float f1925e = 0.0f;
        /* renamed from: f */
        float f1926f = 0.0f;
        /* renamed from: g */
        float f1927g = 0.0f;
        /* renamed from: h */
        float f1928h = 5.0f;
        /* renamed from: i */
        int[] f1929i;
        /* renamed from: j */
        int f1930j;
        /* renamed from: k */
        float f1931k;
        /* renamed from: l */
        float f1932l;
        /* renamed from: m */
        float f1933m;
        /* renamed from: n */
        boolean f1934n;
        /* renamed from: o */
        Path f1935o;
        /* renamed from: p */
        float f1936p = 1.0f;
        /* renamed from: q */
        float f1937q;
        /* renamed from: r */
        int f1938r;
        /* renamed from: s */
        int f1939s;
        /* renamed from: t */
        int f1940t = 255;
        /* renamed from: u */
        int f1941u;

        C0602a() {
            this.f1922b.setStrokeCap(Cap.SQUARE);
            this.f1922b.setAntiAlias(true);
            this.f1922b.setStyle(Style.STROKE);
            this.f1923c.setStyle(Style.FILL);
            this.f1923c.setAntiAlias(true);
            this.f1924d.setColor(0);
        }

        /* renamed from: a */
        void m2383a(float f, float f2) {
            this.f1938r = (int) f;
            this.f1939s = (int) f2;
        }

        /* renamed from: a */
        void m2386a(Canvas canvas, Rect rect) {
            RectF rectF = this.f1921a;
            float f = this.f1937q + (this.f1928h / 2.0f);
            if (this.f1937q <= 0.0f) {
                f = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f1938r) * this.f1936p) / 2.0f, this.f1928h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f, ((float) rect.centerY()) - f, ((float) rect.centerX()) + f, ((float) rect.centerY()) + f);
            rect = (this.f1925e + this.f1927g) * 1135869952;
            float f2 = ((this.f1926f + this.f1927g) * 360.0f) - rect;
            this.f1922b.setColor(this.f1941u);
            this.f1922b.setAlpha(this.f1940t);
            f = this.f1928h / 2.0f;
            rectF.inset(f, f);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f1924d);
            f = -f;
            rectF.inset(f, f);
            canvas.drawArc(rectF, rect, f2, false, this.f1922b);
            m2385a(canvas, rect, f2, rectF);
        }

        /* renamed from: a */
        void m2385a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f1934n) {
                if (this.f1935o == null) {
                    this.f1935o = new Path();
                    this.f1935o.setFillType(FillType.EVEN_ODD);
                } else {
                    this.f1935o.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (((float) this.f1938r) * this.f1936p) / 2.0f;
                this.f1935o.moveTo(0.0f, 0.0f);
                this.f1935o.lineTo(((float) this.f1938r) * this.f1936p, 0.0f);
                this.f1935o.lineTo((((float) this.f1938r) * this.f1936p) / 2.0f, ((float) this.f1939s) * this.f1936p);
                this.f1935o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f1928h / 2.0f));
                this.f1935o.close();
                this.f1923c.setColor(this.f1941u);
                this.f1923c.setAlpha(this.f1940t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f1935o, this.f1923c);
                canvas.restore();
            }
        }

        /* renamed from: a */
        void m2389a(int[] iArr) {
            this.f1929i = iArr;
            m2392b((int) null);
        }

        /* renamed from: a */
        void m2384a(int i) {
            this.f1941u = i;
        }

        /* renamed from: b */
        void m2392b(int i) {
            this.f1930j = i;
            this.f1941u = this.f1929i[this.f1930j];
        }

        /* renamed from: a */
        int m2381a() {
            return this.f1929i[m2390b()];
        }

        /* renamed from: b */
        int m2390b() {
            return (this.f1930j + 1) % this.f1929i.length;
        }

        /* renamed from: c */
        void m2393c() {
            m2392b(m2390b());
        }

        /* renamed from: a */
        void m2387a(ColorFilter colorFilter) {
            this.f1922b.setColorFilter(colorFilter);
        }

        /* renamed from: c */
        void m2395c(int i) {
            this.f1940t = i;
        }

        /* renamed from: d */
        int m2396d() {
            return this.f1940t;
        }

        /* renamed from: a */
        void m2382a(float f) {
            this.f1928h = f;
            this.f1922b.setStrokeWidth(f);
        }

        /* renamed from: b */
        void m2391b(float f) {
            this.f1925e = f;
        }

        /* renamed from: e */
        float m2398e() {
            return this.f1925e;
        }

        /* renamed from: f */
        float m2400f() {
            return this.f1931k;
        }

        /* renamed from: g */
        float m2402g() {
            return this.f1932l;
        }

        /* renamed from: h */
        int m2403h() {
            return this.f1929i[this.f1930j];
        }

        /* renamed from: c */
        void m2394c(float f) {
            this.f1926f = f;
        }

        /* renamed from: i */
        float m2404i() {
            return this.f1926f;
        }

        /* renamed from: d */
        void m2397d(float f) {
            this.f1927g = f;
        }

        /* renamed from: e */
        void m2399e(float f) {
            this.f1937q = f;
        }

        /* renamed from: a */
        void m2388a(boolean z) {
            if (this.f1934n != z) {
                this.f1934n = z;
            }
        }

        /* renamed from: f */
        void m2401f(float f) {
            if (f != this.f1936p) {
                this.f1936p = f;
            }
        }

        /* renamed from: j */
        float m2405j() {
            return this.f1933m;
        }

        /* renamed from: k */
        void m2406k() {
            this.f1931k = this.f1925e;
            this.f1932l = this.f1926f;
            this.f1933m = this.f1927g;
        }

        /* renamed from: l */
        void m2407l() {
            this.f1931k = 0.0f;
            this.f1932l = 0.0f;
            this.f1933m = 0.0f;
            m2391b(0.0f);
            m2394c(0.0f);
            m2397d(0.0f);
        }
    }

    /* renamed from: a */
    private int m2409a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        i &= 255;
        return ((((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16)) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8)) | (i + ((int) (f * ((float) ((i2 & 255) - i)))));
    }

    public int getOpacity() {
        return -3;
    }

    public C0603d(Context context) {
        this.f1947f = ((Context) C0432l.m1574a(context)).getResources();
        this.f1945d.m2389a(f1944c);
        m2421a(2.5f);
        m2410a();
    }

    /* renamed from: a */
    private void m2411a(float f, float f2, float f3, float f4) {
        C0602a c0602a = this.f1945d;
        float f5 = this.f1947f.getDisplayMetrics().density;
        c0602a.m2382a(f2 * f5);
        c0602a.m2399e(f * f5);
        c0602a.m2392b((int) 0.0f);
        c0602a.m2383a(f3 * f5, f4 * f5);
    }

    /* renamed from: a */
    public void m2423a(int i) {
        if (i == 0) {
            m2411a((float) 1093664768, 3.0f, 12.0f, 6.0f);
        } else {
            m2411a((float) 1089470464, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public void m2421a(float f) {
        this.f1945d.m2382a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m2424a(boolean z) {
        this.f1945d.m2388a(z);
        invalidateSelf();
    }

    /* renamed from: b */
    public void m2426b(float f) {
        this.f1945d.m2401f(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m2422a(float f, float f2) {
        this.f1945d.m2391b(f);
        this.f1945d.m2394c(f2);
        invalidateSelf();
    }

    /* renamed from: c */
    public void m2427c(float f) {
        this.f1945d.m2397d(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m2425a(int... iArr) {
        this.f1945d.m2389a(iArr);
        this.f1945d.m2392b(0);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1946e, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1945d.m2386a(canvas, bounds);
        canvas.restore();
    }

    public void setAlpha(int i) {
        this.f1945d.m2395c(i);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f1945d.m2396d();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1945d.m2387a(colorFilter);
        invalidateSelf();
    }

    /* renamed from: d */
    private void m2420d(float f) {
        this.f1946e = f;
    }

    public boolean isRunning() {
        return this.f1948g.isRunning();
    }

    public void start() {
        this.f1948g.cancel();
        this.f1945d.m2406k();
        if (this.f1945d.m2404i() != this.f1945d.m2398e()) {
            this.f1950i = true;
            this.f1948g.setDuration(666);
            this.f1948g.start();
            return;
        }
        this.f1945d.m2392b(0);
        this.f1945d.m2407l();
        this.f1948g.setDuration(1332);
        this.f1948g.start();
    }

    public void stop() {
        this.f1948g.cancel();
        m2420d(0.0f);
        this.f1945d.m2388a(false);
        this.f1945d.m2392b(0);
        this.f1945d.m2407l();
        invalidateSelf();
    }

    /* renamed from: a */
    private void m2412a(float f, C0602a c0602a) {
        if (f > 0.75f) {
            c0602a.m2384a(m2409a((f - 0.75f) / 0.25f, c0602a.m2403h(), c0602a.m2381a()));
        } else {
            c0602a.m2384a(c0602a.m2403h());
        }
    }

    /* renamed from: b */
    private void m2419b(float f, C0602a c0602a) {
        m2412a(f, c0602a);
        float floor = (float) (Math.floor((double) (c0602a.m2405j() / 0.8f)) + 1.0d);
        c0602a.m2391b(c0602a.m2400f() + (((c0602a.m2402g() - 0.01f) - c0602a.m2400f()) * f));
        c0602a.m2394c(c0602a.m2402g());
        c0602a.m2397d(c0602a.m2405j() + ((floor - c0602a.m2405j()) * f));
    }

    /* renamed from: a */
    private void m2413a(float f, C0602a c0602a, boolean z) {
        if (this.f1950i) {
            m2419b(f, c0602a);
        } else if (f != 1.0f || z) {
            float f2;
            float f3;
            z = c0602a.m2405j();
            if (f < 0.5f) {
                f2 = f / 0.5f;
                f3 = c0602a.m2400f();
                float f4 = f3;
                f3 = ((f1943b.getInterpolation(f2) * 0.79f) + 0.01f) + f3;
                f2 = f4;
            } else {
                f3 = c0602a.m2400f() + 0.79f;
                f2 = f3 - (((1.0f - f1943b.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            z += 0.20999998f * f;
            f = (f + this.f1949h) * 216.0f;
            c0602a.m2391b(f2);
            c0602a.m2394c(f3);
            c0602a.m2397d(z);
            m2420d(f);
        }
    }

    /* renamed from: a */
    private void m2410a() {
        final C0602a c0602a = this.f1945d;
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener(this) {
            /* renamed from: b */
            final /* synthetic */ C0603d f1918b;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f1918b.m2412a(floatValue, c0602a);
                this.f1918b.m2413a(floatValue, c0602a, false);
                this.f1918b.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f1942a);
        ofFloat.addListener(new AnimatorListener(this) {
            /* renamed from: b */
            final /* synthetic */ C0603d f1920b;

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                this.f1920b.f1949h = 0.0f;
            }

            public void onAnimationRepeat(Animator animator) {
                this.f1920b.m2413a(1.0f, c0602a, true);
                c0602a.m2406k();
                c0602a.m2393c();
                if (this.f1920b.f1950i) {
                    this.f1920b.f1950i = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    c0602a.m2388a(false);
                    return;
                }
                this.f1920b.f1949h = this.f1920b.f1949h + 1.0f;
            }
        });
        this.f1948g = ofFloat;
    }
}
