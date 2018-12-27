package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.CardView;
import android.view.View;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.i */
public abstract class C4792i extends ViewDataBinding {
    /* renamed from: c */
    public final AppCompatImageView f20950c;
    /* renamed from: d */
    public final CardView f20951d;
    /* renamed from: e */
    public final ConstraintLayout f20952e;
    /* renamed from: f */
    protected C3730d f20953f;
    /* renamed from: g */
    protected HomeFragmentViewModel f20954g;

    protected C4792i(C0059e c0059e, View view, int i, AppCompatImageView appCompatImageView, CardView cardView, ConstraintLayout constraintLayout) {
        super(c0059e, view, i);
        this.f20950c = appCompatImageView;
        this.f20951d = cardView;
        this.f20952e = constraintLayout;
    }
}
