package com.cuvora.carinfo.p071d;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.cuvora.carinfo.d.b */
public abstract class C3666b extends C0798v {
    /* renamed from: n */
    protected Context f14883n;

    protected C3666b(ViewGroup viewGroup, int i) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        this.f14883n = viewGroup.getContext();
    }

    protected C3666b(ViewGroup viewGroup, View view) {
        super(view);
        this.f14883n = viewGroup.getContext();
    }
}
