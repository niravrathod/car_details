package com.cuvora.carinfo.p172b;

import android.arch.lifecycle.C0035q;
import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0052b;
import android.databinding.p004a.C0055a;
import android.support.constraint.ConstraintLayout;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.cuvora.carinfo.p073f.p074a.C1490a;
import com.cuvora.carinfo.p073f.p074a.C1490a.C1489a;
import com.cuvora.carinfo.videomodule.p079a.C1586a;
import com.cuvora.carinfo.videomodule.ui.model.C3729b;
import com.cuvora.carinfo.videomodule.ui.view.C3733a;
import com.cuvora.carinfo.videomodule.ui.view.CarauselRecyclerView;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;
import java.util.List;

/* renamed from: com.cuvora.carinfo.b.x */
public class C4859x extends C4799w implements C1489a {
    /* renamed from: i */
    private static final C0052b f21538i = null;
    /* renamed from: j */
    private static final SparseIntArray f21539j = null;
    /* renamed from: k */
    private final ConstraintLayout f21540k;
    /* renamed from: l */
    private final OnClickListener f21541l;
    /* renamed from: m */
    private long f21542m;

    public C4859x(C0059e c0059e, View view) {
        this(c0059e, view, ViewDataBinding.m24012a(c0059e, view, 4, f21538i, f21539j));
    }

    private C4859x(C0059e c0059e, View view, Object[] objArr) {
        super(c0059e, view, 0, (CarauselRecyclerView) objArr[3], (TextView) objArr[1], (TextView) objArr[2]);
        this.f21542m = -1;
        this.c.setTag(null);
        this.d.setTag(null);
        this.f21540k = (ConstraintLayout) objArr[null];
        this.f21540k.setTag(null);
        this.e.setTag(null);
        m24022a(view);
        this.f21541l = new C1490a(this, 1);
        mo4906h();
    }

    /* renamed from: h */
    public void mo4906h() {
        synchronized (this) {
            this.f21542m = 8;
        }
        m24027e();
    }

    /* renamed from: c */
    public boolean mo4905c() {
        synchronized (this) {
            if (this.f21542m != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4903a(int i, Object obj) {
        if (2 == i) {
            m28819a((C3729b) obj);
            return true;
        } else if (1 == i) {
            m28820a((C3733a) obj);
            return true;
        } else if (3 != i) {
            return false;
        } else {
            m28821a((HomeFragmentViewModel) obj);
            return true;
        }
    }

    /* renamed from: a */
    public void m28819a(C3729b c3729b) {
        this.f = c3729b;
        synchronized (this) {
            this.f21542m |= 1;
        }
        m14745a(2);
        super.m24027e();
    }

    /* renamed from: a */
    public void m28820a(C3733a c3733a) {
        this.h = c3733a;
        synchronized (this) {
            this.f21542m |= 2;
        }
        m14745a(1);
        super.m24027e();
    }

    /* renamed from: a */
    public void m28821a(HomeFragmentViewModel homeFragmentViewModel) {
        this.g = homeFragmentViewModel;
        synchronized (this) {
            this.f21542m |= 4;
        }
        m14745a(3);
        super.m24027e();
    }

    /* renamed from: b */
    protected void mo4904b() {
        long j;
        List list;
        C4859x c4859x = this;
        synchronized (this) {
            j = c4859x.f21542m;
            c4859x.f21542m = 0;
        }
        C3729b c3729b = c4859x.f;
        boolean z = false;
        C3733a c3733a = c4859x.h;
        C0035q c0035q = c4859x.g;
        long j2 = 9 & j;
        CharSequence charSequence = null;
        if (j2 == 0 || c3729b == null) {
            list = null;
        } else {
            charSequence = c3729b.m18586d();
            z = c3729b.m18587e();
            list = c3729b.m18589g();
        }
        long j3 = 10 & j;
        long j4 = 12 & j;
        if (j2 != 0) {
            C1586a.m6115a(c4859x.c, list);
            C0055a.m117a(c4859x.d, charSequence);
            C1586a.m6118a(c4859x.e, z);
        }
        if ((j & 8) != 0) {
            C1586a.m6116a(c4859x.c, true);
            c4859x.e.setOnClickListener(c4859x.f21541l);
        }
        if (j4 != 0) {
            C1586a.m6113a(c4859x.c, c0035q);
        }
        if (j3 != 0) {
            C1586a.m6114a(c4859x.c, c3733a);
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
