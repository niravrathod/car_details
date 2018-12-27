package com.cuvora.carinfo;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0780h;
import android.support.v7.widget.RecyclerView.C0795s;
import android.view.View;

/* renamed from: com.cuvora.carinfo.d */
public class C3667d extends C0780h {
    /* renamed from: a */
    private int f14884a;

    public C3667d(int i) {
        this.f14884a = i;
    }

    /* renamed from: a */
    public void mo930a(Rect rect, View view, RecyclerView recyclerView, C0795s c0795s) {
        if (recyclerView.m24678g(view) == null) {
            rect.left = this.f14884a;
        }
    }
}
