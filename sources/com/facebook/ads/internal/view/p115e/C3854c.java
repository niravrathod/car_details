package com.facebook.ads.internal.view.p115e;

import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.e.c */
public class C3854c extends C0771a<C3856e> {
    /* renamed from: a */
    private final List<String> f15379a;
    /* renamed from: b */
    private final int f15380b;

    C3854c(List<String> list, int i) {
        this.f15379a = list;
        this.f15380b = i;
    }

    /* renamed from: a */
    public int mo91a() {
        return this.f15379a.size();
    }

    /* renamed from: a */
    public C3856e m19215a(ViewGroup viewGroup, int i) {
        return new C3856e(new C3855d(viewGroup.getContext()));
    }

    /* renamed from: a */
    public /* synthetic */ void mo94a(C0798v c0798v, int i) {
        m19217a((C3856e) c0798v, i);
    }

    /* renamed from: a */
    public void m19217a(C3856e c3856e, int i) {
        String str = (String) this.f15379a.get(i);
        LayoutParams marginLayoutParams = new MarginLayoutParams(-2, -1);
        marginLayoutParams.setMargins(i == 0 ? this.f15380b * 4 : this.f15380b, 0, i >= mo91a() + -1 ? this.f15380b * 4 : this.f15380b, 0);
        c3856e.mo1439y().setLayoutParams(marginLayoutParams);
        c3856e.mo1439y().m19219a(str);
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m19215a(viewGroup, i);
    }
}
