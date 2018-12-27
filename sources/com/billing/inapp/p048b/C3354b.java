package com.billing.inapp.p048b;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0780h;
import android.support.v7.widget.RecyclerView.C0795s;
import android.view.View;
import com.billing.inapp.p048b.p049a.C1112d;

/* renamed from: com.billing.inapp.b.b */
public class C3354b extends C0780h {
    /* renamed from: a */
    private final C1112d f14207a;
    /* renamed from: b */
    private final int f14208b;
    /* renamed from: c */
    private final int f14209c;

    public C3354b(C1112d c1112d, int i, int i2) {
        this.f14207a = c1112d;
        this.f14208b = i;
        this.f14209c = i2;
    }

    /* renamed from: a */
    public void mo930a(Rect rect, View view, RecyclerView recyclerView, C0795s c0795s) {
        view = recyclerView.m24674f(view);
        if (this.f14207a.mo931c(view).m4616e() == null) {
            rect.top = this.f14208b;
        }
        if (view == recyclerView.getAdapter().mo91a() - 1) {
            rect.bottom = this.f14208b;
        } else {
            rect.bottom = this.f14209c;
        }
    }
}
