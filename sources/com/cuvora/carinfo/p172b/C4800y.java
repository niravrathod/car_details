package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.cuvora.carinfo.videomodule.ui.model.C3729b;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.y */
public abstract class C4800y extends ViewDataBinding {
    /* renamed from: c */
    public final RecyclerView f20998c;
    /* renamed from: d */
    public final TextView f20999d;
    /* renamed from: e */
    public final TextView f21000e;
    /* renamed from: f */
    protected C3729b f21001f;
    /* renamed from: g */
    protected HomeFragmentViewModel f21002g;

    protected C4800y(C0059e c0059e, View view, int i, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(c0059e, view, i);
        this.f20998c = recyclerView;
        this.f20999d = textView;
        this.f21000e = textView2;
    }
}
