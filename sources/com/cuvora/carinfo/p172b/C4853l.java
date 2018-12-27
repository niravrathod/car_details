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
import android.widget.ImageView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.p073f.p074a.C1490a;
import com.cuvora.carinfo.p073f.p074a.C1490a.C1489a;
import com.cuvora.carinfo.videomodule.p079a.C1586a;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.l */
public class C4853l extends C4793k implements C1489a {
    /* renamed from: j */
    private static final C0052b f21512j = null;
    /* renamed from: k */
    private static final SparseIntArray f21513k = new SparseIntArray();
    /* renamed from: l */
    private final OnClickListener f21514l;
    /* renamed from: m */
    private long f21515m;

    static {
        f21513k.put(R.id.right_arrow, 3);
        f21513k.put(R.id.left_arrow, 4);
    }

    public C4853l(C0059e c0059e, View view) {
        this(c0059e, view, ViewDataBinding.m24012a(c0059e, view, 5, f21512j, f21513k));
    }

    private C4853l(C0059e c0059e, View view, Object[] objArr) {
        super(c0059e, view, 0, (AppCompatImageView) objArr[2], (ImageView) objArr[4], (CardView) objArr[1], (ImageView) objArr[3], (ConstraintLayout) objArr[0]);
        this.f21515m = -1;
        this.c.setTag(null);
        this.e.setTag(null);
        this.g.setTag(null);
        m24022a(view);
        this.f21514l = new C1490a(this, 1);
        mo4906h();
    }

    /* renamed from: h */
    public void mo4906h() {
        synchronized (this) {
            this.f21515m = 4;
        }
        m24027e();
    }

    /* renamed from: c */
    public boolean mo4905c() {
        synchronized (this) {
            if (this.f21515m != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4903a(int i, Object obj) {
        if (2 == i) {
            m28777a((C3730d) obj);
        } else if (3 != i) {
            return false;
        } else {
            m28778a((HomeFragmentViewModel) obj);
        }
        return true;
    }

    /* renamed from: a */
    public void m28777a(C3730d c3730d) {
        this.h = c3730d;
        synchronized (this) {
            this.f21515m |= 1;
        }
        m14745a(2);
        super.m24027e();
    }

    /* renamed from: a */
    public void m28778a(HomeFragmentViewModel homeFragmentViewModel) {
        this.i = homeFragmentViewModel;
        synchronized (this) {
            this.f21515m |= 2;
        }
        m14745a(3);
        super.m24027e();
    }

    /* renamed from: b */
    protected void mo4904b() {
        long j;
        String str;
        synchronized (this) {
            j = this.f21515m;
            this.f21515m = 0;
        }
        C3730d c3730d = this.h;
        HomeFragmentViewModel homeFragmentViewModel = this.i;
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
            C1586a.m6117a(this.e, str);
        }
        if ((j & 4) != 0) {
            this.g.setOnClickListener(this.f21514l);
        }
    }

    /* renamed from: a */
    public final void mo4902a(int i, View view) {
        C3730d c3730d = this.h;
        view = this.i;
        if ((view != null ? 1 : null) != null) {
            view.m18638a(c3730d);
        }
    }
}
