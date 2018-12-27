package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0052b;
import android.support.constraint.ConstraintLayout;
import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import com.cuvora.carinfo.videomodule.p079a.C1586a;
import com.cuvora.carinfo.videomodule.ui.model.C3729b;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.ad */
public class ad extends ac {
    /* renamed from: f */
    private static final C0052b f21484f = null;
    /* renamed from: g */
    private static final SparseIntArray f21485g = null;
    /* renamed from: h */
    private final ConstraintLayout f21486h;
    /* renamed from: i */
    private long f21487i;

    public ad(C0059e c0059e, View view) {
        this(c0059e, view, ViewDataBinding.m24012a(c0059e, view, 2, f21484f, f21485g));
    }

    private ad(C0059e c0059e, View view, Object[] objArr) {
        super(c0059e, view, 0, (WebView) objArr[1]);
        this.f21487i = -1;
        this.f21486h = (ConstraintLayout) objArr[0];
        this.f21486h.setTag(null);
        this.c.setTag(null);
        m24022a(view);
        mo4906h();
    }

    /* renamed from: h */
    public void mo4906h() {
        synchronized (this) {
            this.f21487i = 4;
        }
        m24027e();
    }

    /* renamed from: c */
    public boolean mo4905c() {
        synchronized (this) {
            if (this.f21487i != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4903a(int i, Object obj) {
        if (2 == i) {
            m28734a((C3729b) obj);
        } else if (3 != i) {
            return false;
        } else {
            m28735a((HomeFragmentViewModel) obj);
        }
        return true;
    }

    /* renamed from: a */
    public void m28734a(C3729b c3729b) {
        this.d = c3729b;
        synchronized (this) {
            this.f21487i |= 1;
        }
        m14745a(2);
        super.m24027e();
    }

    /* renamed from: a */
    public void m28735a(HomeFragmentViewModel homeFragmentViewModel) {
        this.e = homeFragmentViewModel;
    }

    /* renamed from: b */
    protected void mo4904b() {
        long j;
        synchronized (this) {
            j = this.f21487i;
            this.f21487i = 0;
        }
        C3729b c3729b = this.d;
        String str = null;
        j &= 5;
        if (!(j == 0 || c3729b == null)) {
            str = c3729b.m18590h();
        }
        if (j != 0) {
            C1586a.m6119a(this.c, str);
        }
    }
}
