package com.facebook.ads.internal.p083b;

import android.os.Bundle;
import android.view.View;
import com.facebook.ads.internal.p101q.p102a.C1926p;
import com.facebook.ads.internal.p107r.C1958a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.b.a */
public final class C3792a implements C1926p<Bundle> {
    /* renamed from: a */
    private final View f15193a;
    /* renamed from: b */
    private final List<C3793d> f15194b;
    /* renamed from: c */
    private C1764c f15195c;

    public C3792a(View view, List<C1762b> list) {
        this.f15193a = view;
        this.f15194b = new ArrayList(list.size());
        for (C1762b c3793d : list) {
            this.f15194b.add(new C3793d(c3793d));
        }
        this.f15195c = new C1764c();
    }

    public C3792a(View view, List<C1762b> list, Bundle bundle) {
        this.f15193a = view;
        this.f15194b = new ArrayList(list.size());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("TESTS");
        for (int i = 0; i < list.size(); i++) {
            this.f15194b.add(new C3793d((C1762b) list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.f15195c = (C1764c) bundle.getSerializable("STATISTICS");
    }

    /* renamed from: a */
    public void m18963a() {
        this.f15195c.m6657a();
    }

    /* renamed from: a */
    public void m18964a(double d, double d2) {
        if (d2 >= 0.0d) {
            this.f15195c.m6660b(d, d2);
        }
        d2 = (double) C1958a.m7399a(this.f15193a, 0).m7426c();
        this.f15195c.m6658a(d, d2);
        for (C3793d a : this.f15194b) {
            a.m18972a(d, d2);
        }
    }

    /* renamed from: b */
    public void m18965b() {
        this.f15195c.m6659b();
        for (C3793d a : this.f15194b) {
            a.m18971a();
        }
    }

    /* renamed from: c */
    public C1764c m18966c() {
        return this.f15195c;
    }

    /* renamed from: i */
    public Bundle mo1347i() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("STATISTICS", this.f15195c);
        ArrayList arrayList = new ArrayList(this.f15194b.size());
        for (C3793d i : this.f15194b) {
            arrayList.add(i.mo1347i());
        }
        bundle.putParcelableArrayList("TESTS", arrayList);
        return bundle;
    }
}
