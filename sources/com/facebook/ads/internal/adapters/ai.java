package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p095n.C1837d;
import com.facebook.ads.internal.p095n.C1837d.C1836c;
import com.facebook.ads.internal.p095n.C1839f;
import com.facebook.ads.internal.p095n.C1842j;
import com.facebook.ads.internal.p095n.C1844m;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.List;
import java.util.Map;

public abstract class ai implements C1737a {
    /* renamed from: a */
    private AdPlacementType f15132a = AdPlacementType.NATIVE;

    /* renamed from: a */
    public abstract void mo3939a(int i);

    /* renamed from: a */
    public abstract void mo3940a(Context context, aj ajVar, C1827c c1827c, Map<String, Object> map, C1836c c1836c);

    /* renamed from: a */
    public abstract void mo3941a(View view, List<View> list);

    /* renamed from: a */
    public abstract void mo3942a(aj ajVar);

    /* renamed from: a */
    protected void m18854a(AdPlacementType adPlacementType) {
        this.f15132a = adPlacementType;
    }

    /* renamed from: a */
    public abstract void mo3943a(Map<String, String> map);

    /* renamed from: b */
    public abstract void mo3944b(Map<String, String> map);

    /* renamed from: c */
    public abstract String mo3945c();

    /* renamed from: d */
    public final AdPlacementType mo1333d() {
        return this.f15132a;
    }

    /* renamed from: f */
    public abstract boolean mo3947f();

    /* renamed from: g */
    public abstract boolean mo3948g();

    /* renamed from: h */
    public abstract int mo3949h();

    /* renamed from: i */
    public abstract int mo3950i();

    /* renamed from: j */
    public abstract int mo3951j();

    public abstract void j_();

    /* renamed from: k */
    public abstract C1839f mo3953k();

    public abstract boolean k_();

    /* renamed from: l */
    public abstract C1839f mo3955l();

    /* renamed from: m */
    public abstract C1842j mo3956m();

    /* renamed from: n */
    public abstract String mo3957n();

    /* renamed from: o */
    public abstract String mo3958o();

    /* renamed from: p */
    public abstract String mo3959p();

    /* renamed from: q */
    public abstract String mo3960q();

    /* renamed from: r */
    public abstract C1844m mo3961r();

    /* renamed from: s */
    public abstract int mo3962s();

    /* renamed from: t */
    public abstract String mo3963t();

    /* renamed from: u */
    public abstract List<C1837d> mo3964u();

    /* renamed from: v */
    public abstract int mo3965v();

    /* renamed from: w */
    public abstract int mo3966w();
}
