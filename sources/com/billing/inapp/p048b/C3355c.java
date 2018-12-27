package com.billing.inapp.p048b;

import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.ViewGroup;
import com.billing.inapp.p048b.p049a.C1112d;
import com.billing.inapp.p048b.p049a.C1115f;
import com.billing.inapp.p048b.p049a.C3352e;
import com.billing.inapp.p048b.p049a.C3353h;
import java.util.List;

/* renamed from: com.billing.inapp.b.c */
public class C3355c extends C0771a<C3352e> implements C1112d {
    /* renamed from: a */
    private C3353h f14210a;
    /* renamed from: b */
    private List<C1115f> f14211b;

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m17226a(viewGroup, i);
    }

    /* renamed from: a */
    public void m17229a(C3353h c3353h) {
        this.f14210a = c3353h;
    }

    /* renamed from: a */
    void m17230a(List<C1115f> list) {
        this.f14211b = list;
        m2967e();
    }

    /* renamed from: b */
    public int mo95b(int i) {
        return this.f14211b == null ? 0 : ((C1115f) this.f14211b.get(i)).m4616e();
    }

    /* renamed from: a */
    public C3352e m17226a(ViewGroup viewGroup, int i) {
        return this.f14210a.m17220a(viewGroup, i);
    }

    /* renamed from: a */
    public void m17228a(C3352e c3352e, int i) {
        this.f14210a.m17223a(mo931c(i), c3352e);
    }

    /* renamed from: a */
    public int mo91a() {
        return this.f14211b == null ? 0 : this.f14211b.size();
    }

    /* renamed from: c */
    public C1115f mo931c(int i) {
        return this.f14211b == null ? 0 : (C1115f) this.f14211b.get(i);
    }
}
