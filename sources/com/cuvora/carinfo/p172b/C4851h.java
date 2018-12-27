package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0052b;
import android.databinding.p004a.C0055a;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.cuvora.carinfo.p073f.p074a.C1490a;
import com.cuvora.carinfo.p073f.p074a.C1490a.C1489a;
import com.cuvora.carinfo.videomodule.p079a.C1586a;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;

/* renamed from: com.cuvora.carinfo.b.h */
public class C4851h extends C4791g implements C1489a {
    /* renamed from: j */
    private static final C0052b f21504j = null;
    /* renamed from: k */
    private static final SparseIntArray f21505k = null;
    /* renamed from: l */
    private final OnClickListener f21506l;
    /* renamed from: m */
    private long f21507m;

    public C4851h(C0059e c0059e, View view) {
        this(c0059e, view, ViewDataBinding.m24012a(c0059e, view, 5, f21504j, f21505k));
    }

    private C4851h(C0059e c0059e, View view, Object[] objArr) {
        super(c0059e, view, 0, (AppCompatTextView) objArr[4], (TextView) objArr[3], (AppCompatImageView) objArr[2], (CardView) objArr[1], (ConstraintLayout) objArr[0]);
        this.f21507m = -1;
        this.c.setTag(null);
        this.d.setTag(null);
        this.e.setTag(null);
        this.f.setTag(null);
        this.g.setTag(null);
        m24022a(view);
        this.f21506l = new C1490a(this, 1);
        mo4906h();
    }

    /* renamed from: h */
    public void mo4906h() {
        synchronized (this) {
            this.f21507m = 4;
        }
        m24027e();
    }

    /* renamed from: c */
    public boolean mo4905c() {
        synchronized (this) {
            if (this.f21507m != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4903a(int i, Object obj) {
        if (2 == i) {
            m28763a((C3730d) obj);
        } else if (3 != i) {
            return false;
        } else {
            m28764a((HomeFragmentViewModel) obj);
        }
        return true;
    }

    /* renamed from: a */
    public void m28763a(C3730d c3730d) {
        this.h = c3730d;
        synchronized (this) {
            this.f21507m |= 1;
        }
        m14745a(2);
        super.m24027e();
    }

    /* renamed from: a */
    public void m28764a(HomeFragmentViewModel homeFragmentViewModel) {
        this.i = homeFragmentViewModel;
        synchronized (this) {
            this.f21507m |= 2;
        }
        m14745a(3);
        super.m24027e();
    }

    /* renamed from: b */
    protected void mo4904b() {
        long j;
        String str;
        CharSequence charSequence;
        String str2;
        synchronized (this) {
            j = this.f21507m;
            this.f21507m = 0;
        }
        C3730d c3730d = this.h;
        HomeFragmentViewModel homeFragmentViewModel = this.i;
        long j2 = 5 & j;
        CharSequence charSequence2 = null;
        if (j2 == 0 || c3730d == null) {
            str = null;
            charSequence = str;
            str2 = charSequence;
        } else {
            String g = c3730d.m18597g();
            charSequence = c3730d.m18596f();
            String h = c3730d.m18598h();
            str2 = c3730d.m18600j();
            str = g;
            charSequence2 = h;
        }
        if (j2 != 0) {
            C0055a.m117a(this.c, charSequence2);
            C0055a.m117a(this.d, charSequence);
            C1586a.m6112a(this.e, str);
            C1586a.m6117a(this.f, str2);
        }
        if ((j & 4) != 0) {
            this.g.setOnClickListener(this.f21506l);
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
