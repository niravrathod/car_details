package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.cuvora.carinfo.videomodule.ui.model.C3729b;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.aa */
public abstract class aa extends ViewDataBinding {
    /* renamed from: c */
    public final RecyclerView f20923c;
    /* renamed from: d */
    public final TextView f20924d;
    /* renamed from: e */
    public final TextView f20925e;
    /* renamed from: f */
    protected C3729b f20926f;
    /* renamed from: g */
    protected HomeFragmentViewModel f20927g;

    protected aa(C0059e c0059e, View view, int i, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(c0059e, view, i);
        this.f20923c = recyclerView;
        this.f20924d = textView;
        this.f20925e = textView2;
    }
}
