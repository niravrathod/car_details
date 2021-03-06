package com.cuvora.carinfo.p172b;

import android.arch.lifecycle.C0035q;
import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0052b;
import android.databinding.p004a.C0055a;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.cuvora.carinfo.p073f.p074a.C1490a;
import com.cuvora.carinfo.p073f.p074a.C1490a.C1489a;
import com.cuvora.carinfo.videomodule.p079a.C1586a;
import com.cuvora.carinfo.videomodule.ui.model.C3729b;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;
import java.util.List;

/* renamed from: com.cuvora.carinfo.b.z */
public class C4860z extends C4800y implements C1489a {
    /* renamed from: h */
    private static final C0052b f21543h = null;
    /* renamed from: i */
    private static final SparseIntArray f21544i = null;
    /* renamed from: j */
    private final ConstraintLayout f21545j;
    /* renamed from: k */
    private final OnClickListener f21546k;
    /* renamed from: l */
    private long f21547l;

    public C4860z(C0059e c0059e, View view) {
        this(c0059e, view, ViewDataBinding.m24012a(c0059e, view, 4, f21543h, f21544i));
    }

    private C4860z(C0059e c0059e, View view, Object[] objArr) {
        super(c0059e, view, 0, (RecyclerView) objArr[3], (TextView) objArr[1], (TextView) objArr[2]);
        this.f21547l = -1;
        this.c.setTag(null);
        this.d.setTag(null);
        this.f21545j = (ConstraintLayout) objArr[null];
        this.f21545j.setTag(null);
        this.e.setTag(null);
        m24022a(view);
        this.f21546k = new C1490a(this, 1);
        mo4906h();
    }

    /* renamed from: h */
    public void mo4906h() {
        synchronized (this) {
            this.f21547l = 4;
        }
        m24027e();
    }

    /* renamed from: c */
    public boolean mo4905c() {
        synchronized (this) {
            if (this.f21547l != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4903a(int i, Object obj) {
        if (2 == i) {
            m28827a((C3729b) obj);
        } else if (3 != i) {
            return false;
        } else {
            m28828a((HomeFragmentViewModel) obj);
        }
        return true;
    }

    /* renamed from: a */
    public void m28827a(C3729b c3729b) {
        this.f = c3729b;
        synchronized (this) {
            this.f21547l |= 1;
        }
        m14745a(2);
        super.m24027e();
    }

    /* renamed from: a */
    public void m28828a(HomeFragmentViewModel homeFragmentViewModel) {
        this.g = homeFragmentViewModel;
        synchronized (this) {
            this.f21547l |= 2;
        }
        m14745a(3);
        super.m24027e();
    }

    /* renamed from: b */
    protected void mo4904b() {
        long j;
        List list;
        synchronized (this) {
            j = this.f21547l;
            this.f21547l = 0;
        }
        C3729b c3729b = this.f;
        C0035q c0035q = this.g;
        long j2 = 5 & j;
        CharSequence charSequence = null;
        if (j2 == 0 || c3729b == null) {
            list = null;
        } else {
            charSequence = c3729b.m18586d();
            list = c3729b.m18589g();
        }
        long j3 = 6 & j;
        if (j2 != 0) {
            C1586a.m6115a(this.c, list);
            C0055a.m117a(this.d, charSequence);
        }
        if ((j & 4) != 0) {
            C1586a.m6116a(this.c, true);
            this.e.setOnClickListener(this.f21546k);
        }
        if (j3 != 0) {
            C1586a.m6113a(this.c, c0035q);
        }
    }

    /* renamed from: a */
    public final void mo4902a(int i, View view) {
        C3729b c3729b = this.f;
        view = this.g;
        if ((view != null ? 1 : null) != null) {
            view.m18637a(c3729b);
        }
    }
}
