package com.airbnb.lottie.p037e;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C0955d;

/* renamed from: com.airbnb.lottie.e.a */
public class C0959a<T> {
    /* renamed from: a */
    public final T f3164a;
    /* renamed from: b */
    public final T f3165b;
    /* renamed from: c */
    public final Interpolator f3166c;
    /* renamed from: d */
    public final float f3167d;
    /* renamed from: e */
    public Float f3168e;
    /* renamed from: f */
    public PointF f3169f;
    /* renamed from: g */
    public PointF f3170g;
    /* renamed from: h */
    private final C0955d f3171h;
    /* renamed from: i */
    private float f3172i;
    /* renamed from: j */
    private float f3173j;

    public C0959a(C0955d c0955d, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f3172i = Float.MIN_VALUE;
        this.f3173j = Float.MIN_VALUE;
        this.f3169f = null;
        this.f3170g = null;
        this.f3171h = c0955d;
        this.f3164a = t;
        this.f3165b = t2;
        this.f3166c = interpolator;
        this.f3167d = f;
        this.f3168e = f2;
    }

    public C0959a(T t) {
        this.f3172i = Float.MIN_VALUE;
        this.f3173j = Float.MIN_VALUE;
        this.f3169f = null;
        this.f3170g = null;
        this.f3171h = null;
        this.f3164a = t;
        this.f3165b = t;
        this.f3166c = null;
        this.f3167d = Float.MIN_VALUE;
        this.f3168e = Float.valueOf(Float.MAX_VALUE);
    }

    /* renamed from: b */
    public float m4129b() {
        if (this.f3171h == null) {
            return 0.0f;
        }
        if (this.f3172i == Float.MIN_VALUE) {
            this.f3172i = (this.f3167d - this.f3171h.m4117d()) / this.f3171h.m4124k();
        }
        return this.f3172i;
    }

    /* renamed from: c */
    public float m4130c() {
        if (this.f3171h == null) {
            return 1.0f;
        }
        if (this.f3173j == Float.MIN_VALUE) {
            if (this.f3168e == null) {
                this.f3173j = 1.0f;
            } else {
                this.f3173j = m4129b() + ((this.f3168e.floatValue() - this.f3167d) / this.f3171h.m4124k());
            }
        }
        return this.f3173j;
    }

    /* renamed from: d */
    public boolean m4131d() {
        return this.f3166c == null;
    }

    /* renamed from: a */
    public boolean m4128a(float f) {
        return f >= m4129b() && f < m4130c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Keyframe{startValue=");
        stringBuilder.append(this.f3164a);
        stringBuilder.append(", endValue=");
        stringBuilder.append(this.f3165b);
        stringBuilder.append(", startFrame=");
        stringBuilder.append(this.f3167d);
        stringBuilder.append(", endFrame=");
        stringBuilder.append(this.f3168e);
        stringBuilder.append(", interpolator=");
        stringBuilder.append(this.f3166c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
