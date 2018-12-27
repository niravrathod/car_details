package com.airbnb.lottie.p031a.p033b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C3317l;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p037e.C0961c;
import com.airbnb.lottie.p037e.C0962d;

/* renamed from: com.airbnb.lottie.a.b.o */
public class C0924o {
    /* renamed from: a */
    private final Matrix f3107a = new Matrix();
    /* renamed from: b */
    private final C0922a<PointF, PointF> f3108b;
    /* renamed from: c */
    private final C0922a<?, PointF> f3109c;
    /* renamed from: d */
    private final C0922a<C0962d, C0962d> f3110d;
    /* renamed from: e */
    private final C0922a<Float, Float> f3111e;
    /* renamed from: f */
    private final C0922a<Integer, Integer> f3112f;
    /* renamed from: g */
    private final C0922a<?, Float> f3113g;
    /* renamed from: h */
    private final C0922a<?, Float> f3114h;

    public C0924o(C3317l c3317l) {
        this.f3108b = c3317l.m17028a().mo877a();
        this.f3109c = c3317l.m17029b().mo877a();
        this.f3110d = c3317l.m17030c().mo877a();
        this.f3111e = c3317l.m17031d().mo877a();
        this.f3112f = c3317l.m17032e().mo877a();
        if (c3317l.m17033f() != null) {
            this.f3113g = c3317l.m17033f().mo877a();
        } else {
            this.f3113g = null;
        }
        if (c3317l.m17034g() != null) {
            this.f3114h = c3317l.m17034g().mo877a();
        } else {
            this.f3114h = null;
        }
    }

    /* renamed from: a */
    public void m4002a(C4500a c4500a) {
        c4500a.m24890a(this.f3108b);
        c4500a.m24890a(this.f3109c);
        c4500a.m24890a(this.f3110d);
        c4500a.m24890a(this.f3111e);
        c4500a.m24890a(this.f3112f);
        if (this.f3113g != null) {
            c4500a.m24890a(this.f3113g);
        }
        if (this.f3114h != null) {
            c4500a.m24890a(this.f3114h);
        }
    }

    /* renamed from: a */
    public void m4001a(C0921a c0921a) {
        this.f3108b.m3989a(c0921a);
        this.f3109c.m3989a(c0921a);
        this.f3110d.m3989a(c0921a);
        this.f3111e.m3989a(c0921a);
        this.f3112f.m3989a(c0921a);
        if (this.f3113g != null) {
            this.f3113g.m3989a(c0921a);
        }
        if (this.f3114h != null) {
            this.f3114h.m3989a(c0921a);
        }
    }

    /* renamed from: a */
    public void m4000a(float f) {
        this.f3108b.mo870a(f);
        this.f3109c.mo870a(f);
        this.f3110d.mo870a(f);
        this.f3111e.mo870a(f);
        this.f3112f.mo870a(f);
        if (this.f3113g != null) {
            this.f3113g.mo870a(f);
        }
        if (this.f3114h != null) {
            this.f3114h.mo870a(f);
        }
    }

    /* renamed from: a */
    public C0922a<?, Integer> m3999a() {
        return this.f3112f;
    }

    /* renamed from: b */
    public C0922a<?, Float> m4005b() {
        return this.f3113g;
    }

    /* renamed from: c */
    public C0922a<?, Float> m4006c() {
        return this.f3114h;
    }

    /* renamed from: d */
    public Matrix m4007d() {
        this.f3107a.reset();
        PointF pointF = (PointF) this.f3109c.mo871e();
        if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
            this.f3107a.preTranslate(pointF.x, pointF.y);
        }
        float floatValue = ((Float) this.f3111e.mo871e()).floatValue();
        if (floatValue != 0.0f) {
            this.f3107a.preRotate(floatValue);
        }
        C0962d c0962d = (C0962d) this.f3110d.mo871e();
        if (!(c0962d.m4136a() == 1.0f && c0962d.m4137b() == 1.0f)) {
            this.f3107a.preScale(c0962d.m4136a(), c0962d.m4137b());
        }
        pointF = (PointF) this.f3108b.mo871e();
        if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
            this.f3107a.preTranslate(-pointF.x, -pointF.y);
        }
        return this.f3107a;
    }

    /* renamed from: b */
    public Matrix m4004b(float f) {
        PointF pointF = (PointF) this.f3109c.mo871e();
        PointF pointF2 = (PointF) this.f3108b.mo871e();
        C0962d c0962d = (C0962d) this.f3110d.mo871e();
        float floatValue = ((Float) this.f3111e.mo871e()).floatValue();
        this.f3107a.reset();
        this.f3107a.preTranslate(pointF.x * f, pointF.y * f);
        double d = (double) f;
        this.f3107a.preScale((float) Math.pow((double) c0962d.m4136a(), d), (float) Math.pow((double) c0962d.m4137b(), d));
        this.f3107a.preRotate(floatValue * f, pointF2.x, pointF2.y);
        return this.f3107a;
    }

    /* renamed from: a */
    public <T> boolean m4003a(T t, C0961c<T> c0961c) {
        if (t == C0969i.f3215e) {
            this.f3108b.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3216f) {
            this.f3109c.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3219i) {
            this.f3110d.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3220j) {
            this.f3111e.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3213c) {
            this.f3112f.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3231u && this.f3113g != null) {
            this.f3113g.m3990a((C0961c) c0961c);
        } else if (t != C0969i.f3232v || this.f3114h == null) {
            return null;
        } else {
            this.f3114h.m3990a((C0961c) c0961c);
        }
        return true;
    }
}
