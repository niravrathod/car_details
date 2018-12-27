package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.content.ShapeStroke.LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke.LineJoinType;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C4493b;
import com.airbnb.lottie.model.p038a.C4494c;
import com.airbnb.lottie.model.p038a.C4495d;
import com.airbnb.lottie.model.p038a.C4496f;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C4770h;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.e */
public class C3321e implements C0985b {
    /* renamed from: a */
    private final String f14118a;
    /* renamed from: b */
    private final GradientType f14119b;
    /* renamed from: c */
    private final C4494c f14120c;
    /* renamed from: d */
    private final C4495d f14121d;
    /* renamed from: e */
    private final C4496f f14122e;
    /* renamed from: f */
    private final C4496f f14123f;
    /* renamed from: g */
    private final C4493b f14124g;
    /* renamed from: h */
    private final LineCapType f14125h;
    /* renamed from: i */
    private final LineJoinType f14126i;
    /* renamed from: j */
    private final float f14127j;
    /* renamed from: k */
    private final List<C4493b> f14128k;
    /* renamed from: l */
    private final C4493b f14129l;

    public C3321e(String str, GradientType gradientType, C4494c c4494c, C4495d c4495d, C4496f c4496f, C4496f c4496f2, C4493b c4493b, LineCapType lineCapType, LineJoinType lineJoinType, float f, List<C4493b> list, C4493b c4493b2) {
        this.f14118a = str;
        this.f14119b = gradientType;
        this.f14120c = c4494c;
        this.f14121d = c4495d;
        this.f14122e = c4496f;
        this.f14123f = c4496f2;
        this.f14124g = c4493b;
        this.f14125h = lineCapType;
        this.f14126i = lineJoinType;
        this.f14127j = f;
        this.f14128k = list;
        this.f14129l = c4493b2;
    }

    /* renamed from: a */
    public String m17079a() {
        return this.f14118a;
    }

    /* renamed from: b */
    public GradientType m17080b() {
        return this.f14119b;
    }

    /* renamed from: c */
    public C4494c m17081c() {
        return this.f14120c;
    }

    /* renamed from: d */
    public C4495d m17082d() {
        return this.f14121d;
    }

    /* renamed from: e */
    public C4496f m17083e() {
        return this.f14122e;
    }

    /* renamed from: f */
    public C4496f m17084f() {
        return this.f14123f;
    }

    /* renamed from: g */
    public C4493b m17085g() {
        return this.f14124g;
    }

    /* renamed from: h */
    public LineCapType m17086h() {
        return this.f14125h;
    }

    /* renamed from: i */
    public LineJoinType m17087i() {
        return this.f14126i;
    }

    /* renamed from: j */
    public List<C4493b> m17088j() {
        return this.f14128k;
    }

    /* renamed from: k */
    public C4493b m17089k() {
        return this.f14129l;
    }

    /* renamed from: l */
    public float m17090l() {
        return this.f14127j;
    }

    /* renamed from: a */
    public C0917b mo878a(C0966f c0966f, C4500a c4500a) {
        return new C4770h(c0966f, c4500a, this);
    }
}
