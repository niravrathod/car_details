package com.airbnb.lottie.model;

import android.graphics.PointF;

/* renamed from: com.airbnb.lottie.model.a */
public class C0981a {
    /* renamed from: a */
    private final PointF f3255a;
    /* renamed from: b */
    private final PointF f3256b;
    /* renamed from: c */
    private final PointF f3257c;

    public C0981a() {
        this.f3255a = new PointF();
        this.f3256b = new PointF();
        this.f3257c = new PointF();
    }

    public C0981a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f3255a = pointF;
        this.f3256b = pointF2;
        this.f3257c = pointF3;
    }

    /* renamed from: a */
    public void m4235a(float f, float f2) {
        this.f3255a.set(f, f2);
    }

    /* renamed from: a */
    public PointF m4234a() {
        return this.f3255a;
    }

    /* renamed from: b */
    public void m4237b(float f, float f2) {
        this.f3256b.set(f, f2);
    }

    /* renamed from: b */
    public PointF m4236b() {
        return this.f3256b;
    }

    /* renamed from: c */
    public void m4239c(float f, float f2) {
        this.f3257c.set(f, f2);
    }

    /* renamed from: c */
    public PointF m4238c() {
        return this.f3257c;
    }
}
