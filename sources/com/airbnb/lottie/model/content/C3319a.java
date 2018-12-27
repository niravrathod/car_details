package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C0980m;
import com.airbnb.lottie.model.p038a.C4496f;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C4476e;

/* renamed from: com.airbnb.lottie.model.content.a */
public class C3319a implements C0985b {
    /* renamed from: a */
    private final String f14105a;
    /* renamed from: b */
    private final C0980m<PointF, PointF> f14106b;
    /* renamed from: c */
    private final C4496f f14107c;
    /* renamed from: d */
    private final boolean f14108d;

    public C3319a(String str, C0980m<PointF, PointF> c0980m, C4496f c4496f, boolean z) {
        this.f14105a = str;
        this.f14106b = c0980m;
        this.f14107c = c4496f;
        this.f14108d = z;
    }

    /* renamed from: a */
    public C0917b mo878a(C0966f c0966f, C4500a c4500a) {
        return new C4476e(c0966f, c4500a, this);
    }

    /* renamed from: a */
    public String m17066a() {
        return this.f14105a;
    }

    /* renamed from: b */
    public C0980m<PointF, PointF> m17067b() {
        return this.f14106b;
    }

    /* renamed from: c */
    public C4496f m17068c() {
        return this.f14107c;
    }

    /* renamed from: d */
    public boolean m17069d() {
        return this.f14108d;
    }
}
