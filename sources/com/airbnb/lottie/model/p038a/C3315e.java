package com.airbnb.lottie.model.p038a;

import android.graphics.PointF;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C4488i;
import com.airbnb.lottie.p031a.p033b.C4489j;
import com.airbnb.lottie.p037e.C0959a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.a.e */
public class C3315e implements C0980m<PointF, PointF> {
    /* renamed from: a */
    private final List<C0959a<PointF>> f14069a;

    public C3315e() {
        this.f14069a = Collections.singletonList(new C0959a(new PointF(0.0f, 0.0f)));
    }

    public C3315e(List<C0959a<PointF>> list) {
        this.f14069a = list;
    }

    /* renamed from: a */
    public C0922a<PointF, PointF> mo877a() {
        if (((C0959a) this.f14069a.get(0)).m4131d()) {
            return new C4489j(this.f14069a);
        }
        return new C4488i(this.f14069a);
    }
}
