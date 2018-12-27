package com.airbnb.lottie.p031a.p033b;

import com.airbnb.lottie.p036d.C0953e;
import com.airbnb.lottie.p037e.C0959a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.e */
public class C4487e extends C3292f<Integer> {
    /* renamed from: a */
    /* synthetic */ Object mo869a(C0959a c0959a, float f) {
        return m24855b(c0959a, f);
    }

    public C4487e(List<C0959a<Integer>> list) {
        super(list);
    }

    /* renamed from: b */
    Integer m24855b(C0959a<Integer> c0959a, float f) {
        if (c0959a.f3164a == null || c0959a.f3165b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.b == null) {
            return Integer.valueOf(C0953e.m4093a(((Integer) c0959a.f3164a).intValue(), ((Integer) c0959a.f3165b).intValue(), f));
        } else {
            return (Integer) this.b.m4133a(c0959a.f3167d, c0959a.f3168e.floatValue(), c0959a.f3164a, c0959a.f3165b, f, m3992c(), m3995f());
        }
    }
}
