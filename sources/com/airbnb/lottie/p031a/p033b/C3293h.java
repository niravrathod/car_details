package com.airbnb.lottie.p031a.p033b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.p036d.C0954f;
import com.airbnb.lottie.p037e.C0959a;

/* renamed from: com.airbnb.lottie.a.b.h */
public class C3293h extends C0959a<PointF> {
    /* renamed from: h */
    private Path f14019h;

    public C3293h(C0955d c0955d, C0959a<PointF> c0959a) {
        super(c0955d, c0959a.f3164a, c0959a.f3165b, c0959a.f3166c, c0959a.f3167d, c0959a.f3168e);
        c0955d = (this.b == null || this.a == null || ((PointF) this.a).equals(((PointF) this.b).x, ((PointF) this.b).y) == null) ? null : true;
        if (this.b != null && c0955d == null) {
            this.f14019h = C0954f.m4104a((PointF) this.a, (PointF) this.b, c0959a.f3169f, c0959a.f3170g);
        }
    }

    /* renamed from: a */
    Path m16958a() {
        return this.f14019h;
    }
}
