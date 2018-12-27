package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.m */
public class C0553m {
    /* renamed from: a */
    private final ViewGroup f1758a;
    /* renamed from: b */
    private int f1759b;

    public C0553m(ViewGroup viewGroup) {
        this.f1758a = viewGroup;
    }

    /* renamed from: a */
    public void m2083a(View view, View view2, int i) {
        m2084a(view, view2, i, 0);
    }

    /* renamed from: a */
    public void m2084a(View view, View view2, int i, int i2) {
        this.f1759b = i;
    }

    /* renamed from: a */
    public int m2080a() {
        return this.f1759b;
    }

    /* renamed from: a */
    public void m2081a(View view) {
        m2082a(view, 0);
    }

    /* renamed from: a */
    public void m2082a(View view, int i) {
        this.f1759b = null;
    }
}
