package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.CardView;
import android.view.View;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.o */
public abstract class C4795o extends ViewDataBinding {
    /* renamed from: c */
    public final AppCompatImageView f20967c;
    /* renamed from: d */
    public final CardView f20968d;
    /* renamed from: e */
    public final ConstraintLayout f20969e;
    /* renamed from: f */
    protected C3730d f20970f;
    /* renamed from: g */
    protected HomeFragmentViewModel f20971g;

    protected C4795o(C0059e c0059e, View view, int i, AppCompatImageView appCompatImageView, CardView cardView, ConstraintLayout constraintLayout) {
        super(c0059e, view, i);
        this.f20967c = appCompatImageView;
        this.f20968d = cardView;
        this.f20969e = constraintLayout;
    }
}
