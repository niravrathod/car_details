package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.g */
public abstract class C4791g extends ViewDataBinding {
    /* renamed from: c */
    public final AppCompatTextView f20943c;
    /* renamed from: d */
    public final TextView f20944d;
    /* renamed from: e */
    public final AppCompatImageView f20945e;
    /* renamed from: f */
    public final CardView f20946f;
    /* renamed from: g */
    public final ConstraintLayout f20947g;
    /* renamed from: h */
    protected C3730d f20948h;
    /* renamed from: i */
    protected HomeFragmentViewModel f20949i;

    protected C4791g(C0059e c0059e, View view, int i, AppCompatTextView appCompatTextView, TextView textView, AppCompatImageView appCompatImageView, CardView cardView, ConstraintLayout constraintLayout) {
        super(c0059e, view, i);
        this.f20943c = appCompatTextView;
        this.f20944d = textView;
        this.f20945e = appCompatImageView;
        this.f20946f = cardView;
        this.f20947g = constraintLayout;
    }
}
