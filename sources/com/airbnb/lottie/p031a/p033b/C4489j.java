package com.airbnb.lottie.p031a.p033b;

import android.graphics.PointF;
import com.airbnb.lottie.p037e.C0959a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.j */
public class C4489j extends C3292f<PointF> {
    /* renamed from: c */
    private final PointF f18783c = new PointF();

    /* renamed from: a */
    public /* synthetic */ Object mo869a(C0959a c0959a, float f) {
        return m24859b(c0959a, f);
    }

    public C4489j(List<C0959a<PointF>> list) {
        super(list);
    }

    /* renamed from: b */
    public PointF m24859b(C0959a<PointF> c0959a, float f) {
        if (c0959a.f3164a == null || c0959a.f3165b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) c0959a.f3164a;
        PointF pointF2 = (PointF) c0959a.f3165b;
        if (this.b != null) {
            return (PointF) this.b.m4133a(c0959a.f3167d, c0959a.f3168e.floatValue(), pointF, pointF2, f, m3992c(), m3995f());
        }
        this.f18783c.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.f18783c;
    }
}
