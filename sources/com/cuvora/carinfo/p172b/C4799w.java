package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.view.View;
import android.widget.TextView;
import com.cuvora.carinfo.videomodule.ui.model.C3729b;
import com.cuvora.carinfo.videomodule.ui.view.C3733a;
import com.cuvora.carinfo.videomodule.ui.view.CarauselRecyclerView;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.w */
public abstract class C4799w extends ViewDataBinding {
    /* renamed from: c */
    public final CarauselRecyclerView f20992c;
    /* renamed from: d */
    public final TextView f20993d;
    /* renamed from: e */
    public final TextView f20994e;
    /* renamed from: f */
    protected C3729b f20995f;
    /* renamed from: g */
    protected HomeFragmentViewModel f20996g;
    /* renamed from: h */
    protected C3733a f20997h;

    protected C4799w(C0059e c0059e, View view, int i, CarauselRecyclerView carauselRecyclerView, TextView textView, TextView textView2) {
        super(c0059e, view, i);
        this.f20992c = carauselRecyclerView;
        this.f20993d = textView;
        this.f20994e = textView2;
    }
}
