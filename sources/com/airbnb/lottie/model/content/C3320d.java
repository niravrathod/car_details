package com.airbnb.lottie.model.content;

import android.graphics.Path.FillType;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C4493b;
import com.airbnb.lottie.model.p038a.C4494c;
import com.airbnb.lottie.model.p038a.C4495d;
import com.airbnb.lottie.model.p038a.C4496f;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C4478g;

/* renamed from: com.airbnb.lottie.model.content.d */
public class C3320d implements C0985b {
    /* renamed from: a */
    private final GradientType f14109a;
    /* renamed from: b */
    private final FillType f14110b;
    /* renamed from: c */
    private final C4494c f14111c;
    /* renamed from: d */
    private final C4495d f14112d;
    /* renamed from: e */
    private final C4496f f14113e;
    /* renamed from: f */
    private final C4496f f14114f;
    /* renamed from: g */
    private final String f14115g;
    /* renamed from: h */
    private final C4493b f14116h;
    /* renamed from: i */
    private final C4493b f14117i;

    public C3320d(String str, GradientType gradientType, FillType fillType, C4494c c4494c, C4495d c4495d, C4496f c4496f, C4496f c4496f2, C4493b c4493b, C4493b c4493b2) {
        this.f14109a = gradientType;
        this.f14110b = fillType;
        this.f14111c = c4494c;
        this.f14112d = c4495d;
        this.f14113e = c4496f;
        this.f14114f = c4496f2;
        this.f14115g = str;
        this.f14116h = c4493b;
        this.f14117i = c4493b2;
    }

    /* renamed from: a */
    public String m17071a() {
        return this.f14115g;
    }

    /* renamed from: b */
    public GradientType m17072b() {
        return this.f14109a;
    }

    /* renamed from: c */
    public FillType m17073c() {
        return this.f14110b;
    }

    /* renamed from: d */
    public C4494c m17074d() {
        return this.f14111c;
    }

    /* renamed from: e */
    public C4495d m17075e() {
        return this.f14112d;
    }

    /* renamed from: f */
    public C4496f m17076f() {
        return this.f14113e;
    }

    /* renamed from: g */
    public C4496f m17077g() {
        return this.f14114f;
    }

    /* renamed from: a */
    public C0917b mo878a(C0966f c0966f, C4500a c4500a) {
        return new C4478g(c0966f, c4500a, this);
    }
}
