package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0052b;
import android.databinding.p004a.C0055a;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.CardView;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.p073f.p074a.C1490a;
import com.cuvora.carinfo.p073f.p074a.C1490a.C1489a;
import com.cuvora.carinfo.videomodule.p079a.C1586a;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.ui.viewmodels.SeeAllFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.r */
public class C4856r extends C4796q implements C1489a {
    /* renamed from: m */
    private static final C0052b f21524m = null;
    /* renamed from: n */
    private static final SparseIntArray f21525n = new SparseIntArray();
    /* renamed from: o */
    private final OnClickListener f21526o;
    /* renamed from: p */
    private long f21527p;

    static {
        f21525n.put(R.id.tvDot, 7);
    }

    public C4856r(C0059e c0059e, View view) {
        this(c0059e, view, ViewDataBinding.m24012a(c0059e, view, 8, f21524m, f21525n));
    }

    private C4856r(C0059e c0059e, View view, Object[] objArr) {
        super(c0059e, view, 0, (AppCompatImageView) objArr[2], (TextView) objArr[3], (TextView) objArr[6], (CardView) objArr[1], (ConstraintLayout) objArr[0], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[7]);
        this.f21527p = -1;
        this.c.setTag(null);
        this.d.setTag(null);
        this.e.setTag(null);
        this.f.setTag(null);
        this.g.setTag(null);
        this.h.setTag(null);
        this.i.setTag(null);
        m24022a(view);
        this.f21526o = new C1490a(this, 1);
        mo4906h();
    }

    /* renamed from: h */
    public void mo4906h() {
        synchronized (this) {
            this.f21527p = 4;
        }
        m24027e();
    }

    /* renamed from: c */
    public boolean mo4905c() {
        synchronized (this) {
            if (this.f21527p != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4903a(int i, Object obj) {
        if (2 == i) {
            m28798a((C3730d) obj);
        } else if (3 != i) {
            return false;
        } else {
            m28799a((SeeAllFragmentViewModel) obj);
        }
        return true;
    }

    /* renamed from: a */
    public void m28798a(C3730d c3730d) {
        this.k = c3730d;
        synchronized (this) {
            this.f21527p |= 1;
        }
        m14745a(2);
        super.m24027e();
    }

    /* renamed from: a */
    public void m28799a(SeeAllFragmentViewModel seeAllFragmentViewModel) {
        this.l = seeAllFragmentViewModel;
        synchronized (this) {
            this.f21527p |= 2;
        }
        m14745a(3);
        super.m24027e();
    }

    /* renamed from: b */
    protected void mo4904b() {
        long j;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        synchronized (this) {
            j = this.f21527p;
            this.f21527p = 0;
        }
        C3730d c3730d = this.k;
        SeeAllFragmentViewModel seeAllFragmentViewModel = this.l;
        long j2 = 5 & j;
        String str2 = null;
        if (j2 == 0 || c3730d == null) {
            str = null;
            charSequence = str;
            charSequence2 = charSequence;
            charSequence3 = charSequence2;
            charSequence4 = charSequence3;
        } else {
            str2 = c3730d.m18597g();
            charSequence = c3730d.m18596f();
            charSequence2 = c3730d.m18598h();
            charSequence3 = c3730d.m18599i();
            charSequence4 = c3730d.m18601k();
            str = c3730d.m18600j();
        }
        if (j2 != 0) {
            C1586a.m6112a(this.c, str2);
            C0055a.m117a(this.d, charSequence);
            C0055a.m117a(this.e, charSequence4);
            C1586a.m6117a(this.f, str);
            C0055a.m117a(this.h, charSequence2);
            C0055a.m117a(this.i, charSequence3);
        }
        if ((j & 4) != 0) {
            this.g.setOnClickListener(this.f21526o);
        }
    }

    /* renamed from: a */
    public final void mo4902a(int i, View view) {
        C3730d c3730d = this.k;
        view = this.l;
        if ((view != null ? 1 : null) != null) {
            view.m18640a(c3730d);
        }
    }
}
