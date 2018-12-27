package com.airbnb.lottie.p031a.p033b;

import com.airbnb.lottie.p036d.C0953e;
import com.airbnb.lottie.p037e.C0959a;
import com.airbnb.lottie.p037e.C0962d;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.k */
public class C4490k extends C3292f<C0962d> {
    /* renamed from: a */
    public /* synthetic */ Object mo869a(C0959a c0959a, float f) {
        return m24861b(c0959a, f);
    }

    public C4490k(List<C0959a<C0962d>> list) {
        super(list);
    }

    /* renamed from: b */
    public C0962d m24861b(C0959a<C0962d> c0959a, float f) {
        if (c0959a.f3164a == null || c0959a.f3165b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C0962d c0962d = (C0962d) c0959a.f3164a;
        C0962d c0962d2 = (C0962d) c0959a.f3165b;
        if (this.b == null) {
            return new C0962d(C0953e.m4090a(c0962d.m4136a(), c0962d2.m4136a(), f), C0953e.m4090a(c0962d.m4137b(), c0962d2.m4137b(), f));
        }
        return (C0962d) this.b.m4133a(c0959a.f3167d, c0959a.f3168e.floatValue(), c0962d, c0962d2, f, m3992c(), m3995f());
    }
}
