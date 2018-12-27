package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0052b;
import android.support.v7.widget.RecyclerView;
import android.util.SparseIntArray;
import android.view.View;
import com.cuvora.carinfo.videomodule.p079a.C1586a;
import com.cuvora.carinfo.videomodule.ui.C1596b;
import java.util.List;

/* renamed from: com.cuvora.carinfo.b.d */
public class C4849d extends C4789c {
    /* renamed from: e */
    private static final C0052b f21497e = null;
    /* renamed from: f */
    private static final SparseIntArray f21498f = null;
    /* renamed from: g */
    private long f21499g;

    public C4849d(C0059e c0059e, View view) {
        this(c0059e, view, ViewDataBinding.m24012a(c0059e, view, 1, f21497e, f21498f));
    }

    private C4849d(C0059e c0059e, View view, Object[] objArr) {
        super(c0059e, view, 0, (RecyclerView) objArr[0]);
        this.f21499g = -1;
        this.c.setTag(null);
        m24022a(view);
        mo4906h();
    }

    /* renamed from: h */
    public void mo4906h() {
        synchronized (this) {
            this.f21499g = 2;
        }
        m24027e();
    }

    /* renamed from: c */
    public boolean mo4905c() {
        synchronized (this) {
            if (this.f21499g != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4903a(int i, Object obj) {
        if (4 != i) {
            return false;
        }
        mo4909a((List) obj);
        return true;
    }

    /* renamed from: a */
    public void mo4909a(List<C1596b> list) {
        this.d = list;
        synchronized (this) {
            this.f21499g |= 1;
        }
        m14745a(4);
        super.m24027e();
    }

    /* renamed from: b */
    protected void mo4904b() {
        synchronized (this) {
            long j = this.f21499g;
            this.f21499g = 0;
        }
        List list = this.d;
        if ((j & 3) != 0) {
            C1586a.m6115a(this.c, list);
        }
    }
}
