package com.cuvora.carinfo;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0780h;
import android.support.v7.widget.RecyclerView.C0795s;
import android.view.View;

/* renamed from: com.cuvora.carinfo.e */
public class C3668e extends C0780h {
    /* renamed from: a */
    private int f14885a;

    public C3668e(int i) {
        this.f14885a = i;
    }

    /* renamed from: a */
    public void mo930a(Rect rect, View view, RecyclerView recyclerView, C0795s c0795s) {
        if (recyclerView.m24678g(view) == null) {
            rect.left = this.f14885a;
        }
    }
}
