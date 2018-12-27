package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.cuvora.carinfo.videomodule.ui.model.C3729b;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.u */
public abstract class C4798u extends ViewDataBinding {
    /* renamed from: c */
    public final RecyclerView f20987c;
    /* renamed from: d */
    public final TextView f20988d;
    /* renamed from: e */
    public final TextView f20989e;
    /* renamed from: f */
    protected C3729b f20990f;
    /* renamed from: g */
    protected HomeFragmentViewModel f20991g;

    protected C4798u(C0059e c0059e, View view, int i, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(c0059e, view, i);
        this.f20987c = recyclerView;
        this.f20988d = textView;
        this.f20989e = textView2;
    }
}
