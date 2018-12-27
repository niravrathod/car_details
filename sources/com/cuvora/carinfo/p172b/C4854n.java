package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0052b;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.CardView;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import com.cuvora.carinfo.p073f.p074a.C1490a;
import com.cuvora.carinfo.p073f.p074a.C1490a.C1489a;
import com.cuvora.carinfo.videomodule.p079a.C1586a;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.n */
public class C4854n extends C4794m implements C1489a {
    /* renamed from: h */
    private static final C0052b f21516h = null;
    /* renamed from: i */
    private static final SparseIntArray f21517i = null;
    /* renamed from: j */
    private final OnClickListener f21518j;
    /* renamed from: k */
    private long f21519k;

    public C4854n(C0059e c0059e, View view) {
        this(c0059e, view, ViewDataBinding.m24012a(c0059e, view, 3, f21516h, f21517i));
    }

    private C4854n(C0059e c0059e, View view, Object[] objArr) {
        super(c0059e, view, 0, (AppCompatImageView) objArr[2], (CardView) objArr[1], (ConstraintLayout) objArr[0]);
        this.f21519k = -1;
        this.c.setTag(null);
        this.d.setTag(null);
        this.e.setTag(null);
        m24022a(view);
        this.f21518j = new C1490a(this, 1);
        mo4906h();
    }

    /* renamed from: h */
    public void mo4906h() {
        synchronized (this) {
            this.f21519k = 4;
        }
        m24027e();
    }

    /* renamed from: c */
    public boolean mo4905c() {
        synchronized (this) {
            if (this.f21519k != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4903a(int i, Object obj) {
        if (2 == i) {
            m28784a((C3730d) obj);
        } else if (3 != i) {
            return false;
        } else {
            m28785a((HomeFragmentViewModel) obj);
        }
        return true;
    }

    /* renamed from: a */
    public void m28784a(C3730d c3730d) {
        this.f = c3730d;
        synchronized (this) {
            this.f21519k |= 1;
        }
        m14745a(2);
        super.m24027e();
    }

    /* renamed from: a */
    public void m28785a(HomeFragmentViewModel homeFragmentViewModel) {
        this.g = homeFragmentViewModel;
        synchronized (this) {
            this.f21519k |= 2;
        }
        m14745a(3);
        super.m24027e();
    }

    /* renamed from: b */
    protected void mo4904b() {
        long j;
        String str;
        synchronized (this) {
            j = this.f21519k;
            this.f21519k = 0;
        }
        C3730d c3730d = this.f;
        HomeFragmentViewModel homeFragmentViewModel = this.g;
        long j2 = 5 & j;
        String str2 = null;
        if (j2 == 0 || c3730d == null) {
            str = null;
        } else {
            str2 = c3730d.m18597g();
            str = c3730d.m18600j();
        }
        if (j2 != 0) {
            C1586a.m6112a(this.c, str2);
            C1586a.m6117a(this.d, str);
        }
        if ((j & 4) != 0) {
            this.e.setOnClickListener(this.f21518j);
        }
    }

    /* renamed from: a */
    public final void mo4902a(int i, View view) {
        C3730d c3730d = this.f;
        view = this.g;
        if ((view != null ? 1 : null) != null) {
            view.m18638a(c3730d);
        }
    }
}
