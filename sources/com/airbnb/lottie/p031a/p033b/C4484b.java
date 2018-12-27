package com.airbnb.lottie.p031a.p033b;

import com.airbnb.lottie.p036d.C0951b;
import com.airbnb.lottie.p037e.C0959a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.b */
public class C4484b extends C3292f<Integer> {
    /* renamed from: a */
    public /* synthetic */ Object mo869a(C0959a c0959a, float f) {
        return m24849b(c0959a, f);
    }

    public C4484b(List<C0959a<Integer>> list) {
        super(list);
    }

    /* renamed from: b */
    public Integer m24849b(C0959a<Integer> c0959a, float f) {
        if (c0959a.f3164a == null || c0959a.f3165b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) c0959a.f3164a).intValue();
        int intValue2 = ((Integer) c0959a.f3165b).intValue();
        if (this.b == null) {
            return Integer.valueOf(C0951b.m4086a(f, intValue, intValue2));
        }
        return (Integer) this.b.m4133a(c0959a.f3167d, c0959a.f3168e.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, m3992c(), m3995f());
    }
}
