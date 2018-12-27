package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C0980m;
import com.airbnb.lottie.model.p038a.C4493b;
import com.airbnb.lottie.model.p038a.C4496f;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C4481n;

/* renamed from: com.airbnb.lottie.model.content.f */
public class C3322f implements C0985b {
    /* renamed from: a */
    private final String f14130a;
    /* renamed from: b */
    private final C0980m<PointF, PointF> f14131b;
    /* renamed from: c */
    private final C4496f f14132c;
    /* renamed from: d */
    private final C4493b f14133d;

    public C3322f(String str, C0980m<PointF, PointF> c0980m, C4496f c4496f, C4493b c4493b) {
        this.f14130a = str;
        this.f14131b = c0980m;
        this.f14132c = c4496f;
        this.f14133d = c4493b;
    }

    /* renamed from: a */
    public String m17092a() {
        return this.f14130a;
    }

    /* renamed from: b */
    public C4493b m17093b() {
        return this.f14133d;
    }

    /* renamed from: c */
    public C4496f m17094c() {
        return this.f14132c;
    }

    /* renamed from: d */
    public C0980m<PointF, PointF> m17095d() {
        return this.f14131b;
    }

    /* renamed from: a */
    public C0917b mo878a(C0966f c0966f, C4500a c4500a) {
        return new C4481n(c0966f, c4500a, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RectangleShape{position=");
        stringBuilder.append(this.f14131b);
        stringBuilder.append(", size=");
        stringBuilder.append(this.f14132c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
