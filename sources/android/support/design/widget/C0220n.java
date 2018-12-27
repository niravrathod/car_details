package android.support.design.widget;

import android.support.v4.view.C0560r;
import android.view.View;

/* renamed from: android.support.design.widget.n */
class C0220n {
    /* renamed from: a */
    private final View f836a;
    /* renamed from: b */
    private int f837b;
    /* renamed from: c */
    private int f838c;
    /* renamed from: d */
    private int f839d;
    /* renamed from: e */
    private int f840e;

    public C0220n(View view) {
        this.f836a = view;
    }

    /* renamed from: a */
    public void m809a() {
        this.f837b = this.f836a.getTop();
        this.f838c = this.f836a.getLeft();
        m808d();
    }

    /* renamed from: d */
    private void m808d() {
        C0560r.m2190c(this.f836a, this.f839d - (this.f836a.getTop() - this.f837b));
        C0560r.m2192d(this.f836a, this.f840e - (this.f836a.getLeft() - this.f838c));
    }

    /* renamed from: a */
    public boolean m810a(int i) {
        if (this.f839d == i) {
            return false;
        }
        this.f839d = i;
        m808d();
        return true;
    }

    /* renamed from: b */
    public boolean m812b(int i) {
        if (this.f840e == i) {
            return false;
        }
        this.f840e = i;
        m808d();
        return true;
    }

    /* renamed from: b */
    public int m811b() {
        return this.f839d;
    }

    /* renamed from: c */
    public int m813c() {
        return this.f837b;
    }
}
