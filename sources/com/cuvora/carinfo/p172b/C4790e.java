package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import com.cuvora.carinfo.videomodule.ui.C1596b;
import com.cuvora.carinfo.videomodule.ui.view.BannerAdView;
import com.cuvora.carinfo.videomodule.ui.viewmodels.SeeAllFragmentViewModel;
import java.util.List;

/* renamed from: com.cuvora.carinfo.b.e */
public abstract class C4790e extends ViewDataBinding {
    /* renamed from: c */
    public final BannerAdView f20938c;
    /* renamed from: d */
    public final ProgressBar f20939d;
    /* renamed from: e */
    public final RecyclerView f20940e;
    /* renamed from: f */
    protected List<C1596b> f20941f;
    /* renamed from: g */
    protected SeeAllFragmentViewModel f20942g;

    /* renamed from: a */
    public abstract void mo4910a(SeeAllFragmentViewModel seeAllFragmentViewModel);

    /* renamed from: a */
    public abstract void mo4911a(List<C1596b> list);

    protected C4790e(C0059e c0059e, View view, int i, BannerAdView bannerAdView, ProgressBar progressBar, RecyclerView recyclerView) {
        super(c0059e, view, i);
        this.f20938c = bannerAdView;
        this.f20939d = progressBar;
        this.f20940e = recyclerView;
    }
}
