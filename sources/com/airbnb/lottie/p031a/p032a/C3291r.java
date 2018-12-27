package com.airbnb.lottie.p031a.p032a;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.r */
public class C3291r implements C0917b, C0921a {
    /* renamed from: a */
    private final String f14013a;
    /* renamed from: b */
    private final List<C0921a> f14014b = new ArrayList();
    /* renamed from: c */
    private final Type f14015c;
    /* renamed from: d */
    private final C0922a<?, Float> f14016d;
    /* renamed from: e */
    private final C0922a<?, Float> f14017e;
    /* renamed from: f */
    private final C0922a<?, Float> f14018f;

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
    }

    public C3291r(C4500a c4500a, ShapeTrimPath shapeTrimPath) {
        this.f14013a = shapeTrimPath.m17060a();
        this.f14015c = shapeTrimPath.m17061b();
        this.f14016d = shapeTrimPath.m17063d().mo877a();
        this.f14017e = shapeTrimPath.m17062c().mo877a();
        this.f14018f = shapeTrimPath.m17064e().mo877a();
        c4500a.m24890a(this.f14016d);
        c4500a.m24890a(this.f14017e);
        c4500a.m24890a(this.f14018f);
        this.f14016d.m3989a((C0921a) this);
        this.f14017e.m3989a((C0921a) this);
        this.f14018f.m3989a((C0921a) this);
    }

    /* renamed from: a */
    public void mo866a() {
        for (int i = 0; i < this.f14014b.size(); i++) {
            ((C0921a) this.f14014b.get(i)).mo866a();
        }
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f14013a;
    }

    /* renamed from: a */
    void m16951a(C0921a c0921a) {
        this.f14014b.add(c0921a);
    }

    /* renamed from: c */
    Type m16954c() {
        return this.f14015c;
    }

    /* renamed from: d */
    public C0922a<?, Float> m16955d() {
        return this.f14016d;
    }

    /* renamed from: e */
    public C0922a<?, Float> m16956e() {
        return this.f14017e;
    }

    /* renamed from: f */
    public C0922a<?, Float> m16957f() {
        return this.f14018f;
    }
}
