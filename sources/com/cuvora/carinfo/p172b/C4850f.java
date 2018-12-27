package com.cuvora.carinfo.p172b;

import android.arch.lifecycle.C0035q;
import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0052b;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.videomodule.p079a.C1586a;
import com.cuvora.carinfo.videomodule.ui.C1596b;
import com.cuvora.carinfo.videomodule.ui.view.BannerAdView;
import com.cuvora.carinfo.videomodule.ui.viewmodels.SeeAllFragmentViewModel;
import java.util.List;

/* renamed from: com.cuvora.carinfo.b.f */
public class C4850f extends C4790e {
    /* renamed from: h */
    private static final C0052b f21500h = null;
    /* renamed from: i */
    private static final SparseIntArray f21501i = new SparseIntArray();
    /* renamed from: j */
    private final ConstraintLayout f21502j;
    /* renamed from: k */
    private long f21503k;

    static {
        f21501i.put(R.id.pb, 2);
        f21501i.put(R.id.bannerAdView, 3);
    }

    public C4850f(C0059e c0059e, View view) {
        this(c0059e, view, ViewDataBinding.m24012a(c0059e, view, 4, f21500h, f21501i));
    }

    private C4850f(C0059e c0059e, View view, Object[] objArr) {
        super(c0059e, view, 0, (BannerAdView) objArr[3], (ProgressBar) objArr[2], (RecyclerView) objArr[1]);
        this.f21503k = -1;
        this.f21502j = (ConstraintLayout) objArr[null];
        this.f21502j.setTag(null);
        this.e.setTag(null);
        m24022a(view);
        mo4906h();
    }

    /* renamed from: h */
    public void mo4906h() {
        synchronized (this) {
            this.f21503k = 4;
        }
        m24027e();
    }

    /* renamed from: c */
    public boolean mo4905c() {
        synchronized (this) {
            if (this.f21503k != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4903a(int i, Object obj) {
        if (4 == i) {
            mo4911a((List) obj);
        } else if (3 != i) {
            return false;
        } else {
            mo4910a((SeeAllFragmentViewModel) obj);
        }
        return true;
    }

    /* renamed from: a */
    public void mo4911a(List<C1596b> list) {
        this.f = list;
        synchronized (this) {
            this.f21503k |= 1;
        }
        m14745a(4);
        super.m24027e();
    }

    /* renamed from: a */
    public void mo4910a(SeeAllFragmentViewModel seeAllFragmentViewModel) {
        this.g = seeAllFragmentViewModel;
        synchronized (this) {
            this.f21503k |= 2;
        }
        m14745a(3);
        super.m24027e();
    }

    /* renamed from: b */
    protected void mo4904b() {
        long j;
        synchronized (this) {
            j = this.f21503k;
            this.f21503k = 0;
        }
        List list = this.f;
        C0035q c0035q = this.g;
        long j2 = 5 & j;
        j &= 6;
        if (j2 != 0) {
            C1586a.m6115a(this.e, list);
        }
        if (j != 0) {
            C1586a.m6113a(this.e, c0035q);
        }
    }
}
