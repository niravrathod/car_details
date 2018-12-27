package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.m */
abstract class C3232m implements C0728o, C0732s, OnItemClickListener {
    /* renamed from: a */
    private Rect f13644a;

    /* renamed from: a */
    public abstract void mo3821a(int i);

    /* renamed from: a */
    public void mo75a(Context context, C3224h c3224h) {
    }

    /* renamed from: a */
    public abstract void mo3822a(C3224h c3224h);

    /* renamed from: a */
    public abstract void mo3823a(View view);

    /* renamed from: a */
    public abstract void mo3824a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public boolean mo81a(C3224h c3224h, C3227j c3227j) {
        return false;
    }

    /* renamed from: b */
    public int mo83b() {
        return 0;
    }

    /* renamed from: b */
    public abstract void mo3825b(int i);

    /* renamed from: b */
    public abstract void mo3826b(boolean z);

    /* renamed from: b */
    public boolean mo84b(C3224h c3224h, C3227j c3227j) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo3827c(int i);

    /* renamed from: c */
    public abstract void mo3828c(boolean z);

    /* renamed from: h */
    protected boolean mo3829h() {
        return true;
    }

    C3232m() {
    }

    /* renamed from: a */
    public void m16233a(Rect rect) {
        this.f13644a = rect;
    }

    /* renamed from: i */
    public Rect m16245i() {
        return this.f13644a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C3232m.m16229a(listAdapter).f2315b.m16156a((MenuItem) listAdapter.getItem(i), (C0728o) this, mo3829h() != 0 ? 0 : 4);
    }

    /* renamed from: a */
    protected static int m16228a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int i2 = 0;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        viewGroup = null;
        int i3 = 0;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != viewGroup) {
                view = null;
                viewGroup = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            itemViewType = view.getMeasuredWidth();
            if (itemViewType >= i) {
                return i;
            }
            if (itemViewType > i3) {
                i3 = itemViewType;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: a */
    protected static C0722g m16229a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0722g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0722g) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m16230b(C3224h c3224h) {
        int size = c3224h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c3224h.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
