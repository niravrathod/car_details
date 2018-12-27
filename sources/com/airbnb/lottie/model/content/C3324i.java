package com.airbnb.lottie.model.content;

import android.graphics.Path.FillType;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C4492a;
import com.airbnb.lottie.model.p038a.C4495d;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C4477f;

/* renamed from: com.airbnb.lottie.model.content.i */
public class C3324i implements C0985b {
    /* renamed from: a */
    private final boolean f14138a;
    /* renamed from: b */
    private final FillType f14139b;
    /* renamed from: c */
    private final String f14140c;
    /* renamed from: d */
    private final C4492a f14141d;
    /* renamed from: e */
    private final C4495d f14142e;

    public C3324i(String str, boolean z, FillType fillType, C4492a c4492a, C4495d c4495d) {
        this.f14140c = str;
        this.f14138a = z;
        this.f14139b = fillType;
        this.f14141d = c4492a;
        this.f14142e = c4495d;
    }

    /* renamed from: a */
    public String m17102a() {
        return this.f14140c;
    }

    /* renamed from: b */
    public C4492a m17103b() {
        return this.f14141d;
    }

    /* renamed from: c */
    public C4495d m17104c() {
        return this.f14142e;
    }

    /* renamed from: d */
    public FillType m17105d() {
        return this.f14139b;
    }

    /* renamed from: a */
    public C0917b mo878a(C0966f c0966f, C4500a c4500a) {
        return new C4477f(c0966f, c4500a, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeFill{color=, fillEnabled=");
        stringBuilder.append(this.f14138a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
