package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0052b;
import android.databinding.p004a.C0055a;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.util.SparseIntArray;
import android.view.View;
import com.cuvora.carinfo.videomodule.p079a.C1586a;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;

/* renamed from: com.cuvora.carinfo.b.af */
public class af extends ae {
    /* renamed from: h */
    private static final C0052b f21488h = null;
    /* renamed from: i */
    private static final SparseIntArray f21489i = null;
    /* renamed from: j */
    private final ConstraintLayout f21490j;
    /* renamed from: k */
    private final AppCompatTextView f21491k;
    /* renamed from: l */
    private long f21492l;

    public af(C0059e c0059e, View view) {
        this(c0059e, view, ViewDataBinding.m24012a(c0059e, view, 6, f21488h, f21489i));
    }

    private af(C0059e c0059e, View view, Object[] objArr) {
        super(c0059e, view, 0, (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4]);
        this.f21492l = -1;
        this.c.setTag(null);
        this.d.setTag(null);
        this.f21490j = (ConstraintLayout) objArr[null];
        this.f21490j.setTag(null);
        this.f21491k = (AppCompatTextView) objArr[5];
        this.f21491k.setTag(null);
        this.e.setTag(null);
        this.f.setTag(null);
        m24022a(view);
        mo4906h();
    }

    /* renamed from: h */
    public void mo4906h() {
        synchronized (this) {
            this.f21492l = 2;
        }
        m24027e();
    }

    /* renamed from: c */
    public boolean mo4905c() {
        synchronized (this) {
            if (this.f21492l != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4903a(int i, Object obj) {
        if (2 != i) {
            return false;
        }
        m28740a((C3730d) obj);
        return true;
    }

    /* renamed from: a */
    public void m28740a(C3730d c3730d) {
        this.g = c3730d;
        synchronized (this) {
            this.f21492l |= 1;
        }
        m14745a(2);
        super.m24027e();
    }

    /* renamed from: b */
    protected void mo4904b() {
        long j;
        CharSequence f;
        CharSequence i;
        String j2;
        boolean z;
        String str;
        synchronized (this) {
            j = this.f21492l;
            this.f21492l = 0;
        }
        C3730d c3730d = this.g;
        j &= 3;
        boolean z2 = false;
        CharSequence charSequence = null;
        if (j != 0) {
            String g;
            int l;
            String k;
            if (c3730d != null) {
                g = c3730d.m18597g();
                l = c3730d.m18602l();
                f = c3730d.m18596f();
                i = c3730d.m18599i();
                k = c3730d.m18601k();
                j2 = c3730d.m18600j();
            } else {
                j2 = null;
                f = j2;
                i = f;
                k = i;
                l = 0;
            }
            if (l == 0) {
                z2 = true;
            }
            z = z2;
            str = j2;
            j2 = g;
            charSequence = k;
        } else {
            j2 = null;
            str = j2;
            f = str;
            i = f;
            z = false;
        }
        if (j != 0) {
            C0055a.m117a(this.c, charSequence);
            C1586a.m6112a(this.d, j2);
            C1586a.m6117a(this.d, str);
            C0055a.m117a(this.f21491k, i);
            C1586a.m6118a(this.e, z);
            C0055a.m117a(this.f, f);
        }
    }
}
