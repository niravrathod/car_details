package com.airbnb.lottie.p031a.p032a;

import android.graphics.Path;
import android.graphics.Path.FillType;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.content.C3326k;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p036d.C0954f;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.p */
public class C4483p implements C3290l, C0921a {
    /* renamed from: a */
    private final Path f18772a = new Path();
    /* renamed from: b */
    private final String f18773b;
    /* renamed from: c */
    private final C0966f f18774c;
    /* renamed from: d */
    private final C0922a<?, Path> f18775d;
    /* renamed from: e */
    private boolean f18776e;
    /* renamed from: f */
    private C3291r f18777f;

    public C4483p(C0966f c0966f, C4500a c4500a, C3326k c3326k) {
        this.f18773b = c3326k.m17110a();
        this.f18774c = c0966f;
        this.f18775d = c3326k.m17111b().mo877a();
        c4500a.m24890a(this.f18775d);
        this.f18775d.m3989a((C0921a) this);
    }

    /* renamed from: a */
    public void mo866a() {
        m24843c();
    }

    /* renamed from: c */
    private void m24843c() {
        this.f18776e = false;
        this.f18774c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
        for (list2 = null; list2 < list.size(); list2++) {
            C0917b c0917b = (C0917b) list.get(list2);
            if (c0917b instanceof C3291r) {
                C3291r c3291r = (C3291r) c0917b;
                if (c3291r.m16954c() == Type.Simultaneously) {
                    this.f18777f = c3291r;
                    this.f18777f.m16951a(this);
                }
            }
        }
    }

    /* renamed from: e */
    public Path mo3887e() {
        if (this.f18776e) {
            return this.f18772a;
        }
        this.f18772a.reset();
        this.f18772a.set((Path) this.f18775d.mo871e());
        this.f18772a.setFillType(FillType.EVEN_ODD);
        C0954f.m4106a(this.f18772a, this.f18777f);
        this.f18776e = true;
        return this.f18772a;
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f18773b;
    }
}
