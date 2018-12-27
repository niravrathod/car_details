package com.airbnb.lottie.p031a.p033b;

import com.airbnb.lottie.p036d.C0953e;
import com.airbnb.lottie.p037e.C0959a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.c */
public class C4485c extends C3292f<Float> {
    /* renamed from: a */
    /* synthetic */ Object mo869a(C0959a c0959a, float f) {
        return m24851b(c0959a, f);
    }

    public C4485c(List<C0959a<Float>> list) {
        super(list);
    }

    /* renamed from: b */
    Float m24851b(C0959a<Float> c0959a, float f) {
        if (c0959a.f3164a == null || c0959a.f3165b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.b == null) {
            return Float.valueOf(C0953e.m4090a(((Float) c0959a.f3164a).floatValue(), ((Float) c0959a.f3165b).floatValue(), f));
        } else {
            return (Float) this.b.m4133a(c0959a.f3167d, c0959a.f3168e.floatValue(), c0959a.f3164a, c0959a.f3165b, f, m3992c(), m3995f());
        }
    }
}
