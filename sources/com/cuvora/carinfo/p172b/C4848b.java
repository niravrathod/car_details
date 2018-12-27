package com.cuvora.carinfo.p172b;

import android.arch.lifecycle.C0035q;
import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0052b;
import android.support.constraint.ConstraintLayout;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.videomodule.p079a.C1586a;
import com.cuvora.carinfo.videomodule.ui.C1596b;
import com.cuvora.carinfo.videomodule.ui.view.BannerAdView;
import com.cuvora.carinfo.videomodule.ui.view.SmoothRecyclerView;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;
import java.util.List;

/* renamed from: com.cuvora.carinfo.b.b */
public class C4848b extends C4788a {
    /* renamed from: i */
    private static final C0052b f21493i = null;
    /* renamed from: j */
    private static final SparseIntArray f21494j = new SparseIntArray();
    /* renamed from: k */
    private final ConstraintLayout f21495k;
    /* renamed from: l */
    private long f21496l;

    static {
        f21494j.put(R.id.connectivity_view, 2);
        f21494j.put(R.id.pb, 3);
        f21494j.put(R.id.bannerAdView, 4);
    }

    public C4848b(C0059e c0059e, View view) {
        this(c0059e, view, ViewDataBinding.m24012a(c0059e, view, 5, f21493i, f21494j));
    }

    private C4848b(C0059e c0059e, View view, Object[] objArr) {
        super(c0059e, view, 0, (BannerAdView) objArr[4], (View) objArr[2], (ProgressBar) objArr[3], (SmoothRecyclerView) objArr[1]);
        this.f21496l = -1;
        this.f21495k = (ConstraintLayout) objArr[null];
        this.f21495k.setTag(null);
        this.f.setTag(null);
        m24022a(view);
        mo4906h();
    }

    /* renamed from: h */
    public void mo4906h() {
        synchronized (this) {
            this.f21496l = 4;
        }
        m24027e();
    }

    /* renamed from: c */
    public boolean mo4905c() {
        synchronized (this) {
            if (this.f21496l != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4903a(int i, Object obj) {
        if (4 == i) {
            mo4908a((List) obj);
        } else if (3 != i) {
            return false;
        } else {
            mo4907a((HomeFragmentViewModel) obj);
        }
        return true;
    }

    /* renamed from: a */
    public void mo4908a(List<C1596b> list) {
        this.g = list;
        synchronized (this) {
            this.f21496l |= 1;
        }
        m14745a(4);
        super.m24027e();
    }

    /* renamed from: a */
    public void mo4907a(HomeFragmentViewModel homeFragmentViewModel) {
        this.h = homeFragmentViewModel;
        synchronized (this) {
            this.f21496l |= 2;
        }
        m14745a(3);
        super.m24027e();
    }

    /* renamed from: b */
    protected void mo4904b() {
        long j;
        synchronized (this) {
            j = this.f21496l;
            this.f21496l = 0;
        }
        List list = this.g;
        C0035q c0035q = this.h;
        long j2 = 5 & j;
        j &= 6;
        if (j2 != 0) {
            C1586a.m6115a(this.f, list);
        }
        if (j != 0) {
            C1586a.m6113a(this.f, c0035q);
        }
    }
}
