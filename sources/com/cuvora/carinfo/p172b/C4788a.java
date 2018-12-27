package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.view.View;
import android.widget.ProgressBar;
import com.cuvora.carinfo.videomodule.ui.C1596b;
import com.cuvora.carinfo.videomodule.ui.view.BannerAdView;
import com.cuvora.carinfo.videomodule.ui.view.SmoothRecyclerView;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;
import java.util.List;

/* renamed from: com.cuvora.carinfo.b.a */
public abstract class C4788a extends ViewDataBinding {
    /* renamed from: c */
    public final BannerAdView f20917c;
    /* renamed from: d */
    public final View f20918d;
    /* renamed from: e */
    public final ProgressBar f20919e;
    /* renamed from: f */
    public final SmoothRecyclerView f20920f;
    /* renamed from: g */
    protected List<C1596b> f20921g;
    /* renamed from: h */
    protected HomeFragmentViewModel f20922h;

    /* renamed from: a */
    public abstract void mo4907a(HomeFragmentViewModel homeFragmentViewModel);

    /* renamed from: a */
    public abstract void mo4908a(List<C1596b> list);

    protected C4788a(C0059e c0059e, View view, int i, BannerAdView bannerAdView, View view2, ProgressBar progressBar, SmoothRecyclerView smoothRecyclerView) {
        super(c0059e, view, i);
        this.f20917c = bannerAdView;
        this.f20918d = view2;
        this.f20919e = progressBar;
        this.f20920f = smoothRecyclerView;
    }
}
