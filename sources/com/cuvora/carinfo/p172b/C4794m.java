package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.CardView;
import android.view.View;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.m */
public abstract class C4794m extends ViewDataBinding {
    /* renamed from: c */
    public final AppCompatImageView f20962c;
    /* renamed from: d */
    public final CardView f20963d;
    /* renamed from: e */
    public final ConstraintLayout f20964e;
    /* renamed from: f */
    protected C3730d f20965f;
    /* renamed from: g */
    protected HomeFragmentViewModel f20966g;

    protected C4794m(C0059e c0059e, View view, int i, AppCompatImageView appCompatImageView, CardView cardView, ConstraintLayout constraintLayout) {
        super(c0059e, view, i);
        this.f20962c = appCompatImageView;
        this.f20963d = cardView;
        this.f20964e = constraintLayout;
    }
}
