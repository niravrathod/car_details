package android.support.v7.view.menu;

import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.view.menu.C0730p.C0729a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.g */
public class C0722g extends BaseAdapter {
    /* renamed from: a */
    static final int f2314a = C0633g.abc_popup_menu_item_layout;
    /* renamed from: b */
    C3224h f2315b;
    /* renamed from: c */
    private int f2316c = -1;
    /* renamed from: d */
    private boolean f2317d;
    /* renamed from: e */
    private final boolean f2318e;
    /* renamed from: f */
    private final LayoutInflater f2319f;

    public long getItemId(int i) {
        return (long) i;
    }

    public /* synthetic */ Object getItem(int i) {
        return m2814a(i);
    }

    public C0722g(C3224h c3224h, LayoutInflater layoutInflater, boolean z) {
        this.f2318e = z;
        this.f2319f = layoutInflater;
        this.f2315b = c3224h;
        m2816b();
    }

    /* renamed from: a */
    public void m2815a(boolean z) {
        this.f2317d = z;
    }

    public int getCount() {
        ArrayList l = this.f2318e ? this.f2315b.m16180l() : this.f2315b.m16177i();
        if (this.f2316c < 0) {
            return l.size();
        }
        return l.size() - 1;
    }

    /* renamed from: a */
    public C3224h m2813a() {
        return this.f2315b;
    }

    /* renamed from: a */
    public C3227j m2814a(int i) {
        ArrayList l = this.f2318e ? this.f2315b.m16180l() : this.f2315b.m16177i();
        if (this.f2316c >= 0 && i >= this.f2316c) {
            i++;
        }
        return (C3227j) l.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2319f.inflate(f2314a, viewGroup, false);
        }
        C0729a c0729a = (C0729a) view;
        if (this.f2317d) {
            ((ListMenuItemView) view).setForceShowIcon(true);
        }
        c0729a.mo71a(m2814a(i), 0);
        return view;
    }

    /* renamed from: b */
    void m2816b() {
        C3227j r = this.f2315b.m16186r();
        if (r != null) {
            ArrayList l = this.f2315b.m16180l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                if (((C3227j) l.get(i)) == r) {
                    this.f2316c = i;
                    return;
                }
            }
        }
        this.f2316c = -1;
    }

    public void notifyDataSetChanged() {
        m2816b();
        super.notifyDataSetChanged();
    }
}
