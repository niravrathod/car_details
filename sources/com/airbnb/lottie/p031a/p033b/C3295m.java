package com.airbnb.lottie.p031a.p033b;

import android.graphics.PointF;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p037e.C0959a;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.a.b.m */
public class C3295m extends C0922a<PointF, PointF> {
    /* renamed from: c */
    private final PointF f14022c = new PointF();
    /* renamed from: d */
    private final C0922a<Float, Float> f14023d;
    /* renamed from: e */
    private final C0922a<Float, Float> f14024e;

    /* renamed from: a */
    /* synthetic */ Object mo869a(C0959a c0959a, float f) {
        return m16963b(c0959a, f);
    }

    /* renamed from: e */
    public /* synthetic */ Object mo871e() {
        return mo872g();
    }

    public C3295m(C0922a<Float, Float> c0922a, C0922a<Float, Float> c0922a2) {
        super(Collections.emptyList());
        this.f14023d = c0922a;
        this.f14024e = c0922a2;
        mo870a(m3995f());
    }

    /* renamed from: a */
    public void mo870a(float f) {
        this.f14023d.mo870a(f);
        this.f14024e.mo870a(f);
        this.f14022c.set(((Float) this.f14023d.mo871e()).floatValue(), ((Float) this.f14024e.mo871e()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((C0921a) this.a.get(i)).mo866a();
        }
    }

    /* renamed from: g */
    public PointF mo872g() {
        return m16963b(null, 0.0f);
    }

    /* renamed from: b */
    PointF m16963b(C0959a<PointF> c0959a, float f) {
        return this.f14022c;
    }
}
