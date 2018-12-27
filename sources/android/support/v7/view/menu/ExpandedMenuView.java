package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.C3224h.C0724b;
import android.support.v7.widget.ay;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements C0724b, C0730p, OnItemClickListener {
    /* renamed from: a */
    private static final int[] f13509a = new int[]{16842964, 16843049};
    /* renamed from: b */
    private C3224h f13510b;
    /* renamed from: c */
    private int f13511c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        context = ay.m3543a(context, attributeSet, f13509a, i, 0);
        if (context.m3561g(0) != null) {
            setBackgroundDrawable(context.m3547a(0));
        }
        if (context.m3561g(1) != 0) {
            setDivider(context.m3547a(1));
        }
        context.m3548a();
    }

    /* renamed from: a */
    public void mo74a(C3224h c3224h) {
        this.f13510b = c3224h;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    /* renamed from: a */
    public boolean mo583a(C3227j c3227j) {
        return this.f13510b.m16155a((MenuItem) c3227j, 0);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo583a((C3227j) getAdapter().getItem(i));
    }

    public int getWindowAnimations() {
        return this.f13511c;
    }
}
