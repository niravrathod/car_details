package com.airbnb.lottie.p031a.p033b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.p037e.C0959a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.i */
public class C4488i extends C3292f<PointF> {
    /* renamed from: c */
    private final PointF f18779c = new PointF();
    /* renamed from: d */
    private final float[] f18780d = new float[2];
    /* renamed from: e */
    private C3293h f18781e;
    /* renamed from: f */
    private PathMeasure f18782f;

    /* renamed from: a */
    public /* synthetic */ Object mo869a(C0959a c0959a, float f) {
        return m24857b(c0959a, f);
    }

    public C4488i(List<? extends C0959a<PointF>> list) {
        super(list);
    }

    /* renamed from: b */
    public PointF m24857b(C0959a<PointF> c0959a, float f) {
        C0959a c0959a2 = (C3293h) c0959a;
        Path a = c0959a2.m16958a();
        if (a == null) {
            return (PointF) c0959a.f3164a;
        }
        if (this.b != null) {
            return (PointF) this.b.m4133a(c0959a2.d, c0959a2.e.floatValue(), c0959a2.a, c0959a2.b, m3992c(), f, m3995f());
        }
        if (this.f18781e != c0959a2) {
            this.f18782f = new PathMeasure(a, false);
            this.f18781e = c0959a2;
        }
        this.f18782f.getPosTan(f * this.f18782f.getLength(), this.f18780d, null);
        this.f18779c.set(this.f18780d[0], this.f18780d[1]);
        return this.f18779c;
    }
}
