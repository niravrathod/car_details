package com.cuvora.carinfo;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0780h;
import android.support.v7.widget.RecyclerView.C0795s;
import android.view.View;

/* renamed from: com.cuvora.carinfo.c */
public class C3664c extends C0780h {
    /* renamed from: a */
    private int f14880a;

    public C3664c(int i) {
        this.f14880a = i;
    }

    /* renamed from: a */
    public void mo930a(Rect rect, View view, RecyclerView recyclerView, C0795s c0795s) {
        rect.top = this.f14880a;
        if (recyclerView.m24678g(view) % 3 != null) {
            rect.left = this.f14880a;
        }
    }
}
