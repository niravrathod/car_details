package android.support.v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.view.menu.C0730p.C0729a;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.f */
public class C3223f implements C0728o, OnItemClickListener {
    /* renamed from: a */
    Context f13563a;
    /* renamed from: b */
    LayoutInflater f13564b;
    /* renamed from: c */
    C3224h f13565c;
    /* renamed from: d */
    ExpandedMenuView f13566d;
    /* renamed from: e */
    int f13567e;
    /* renamed from: f */
    int f13568f;
    /* renamed from: g */
    int f13569g;
    /* renamed from: h */
    C0721a f13570h;
    /* renamed from: i */
    private C0727a f13571i;
    /* renamed from: j */
    private int f13572j;

    /* renamed from: android.support.v7.view.menu.f$a */
    private class C0721a extends BaseAdapter {
        /* renamed from: a */
        final /* synthetic */ C3223f f2312a;
        /* renamed from: b */
        private int f2313b = -1;

        public long getItemId(int i) {
            return (long) i;
        }

        public /* synthetic */ Object getItem(int i) {
            return m2811a(i);
        }

        public C0721a(C3223f c3223f) {
            this.f2312a = c3223f;
            m2812a();
        }

        public int getCount() {
            int size = this.f2312a.f13565c.m16180l().size() - this.f2312a.f13567e;
            return this.f2313b < 0 ? size : size - 1;
        }

        /* renamed from: a */
        public C3227j m2811a(int i) {
            ArrayList l = this.f2312a.f13565c.m16180l();
            i += this.f2312a.f13567e;
            if (this.f2313b >= 0 && i >= this.f2313b) {
                i++;
            }
            return (C3227j) l.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f2312a.f13564b.inflate(this.f2312a.f13569g, viewGroup, false);
            }
            ((C0729a) view).mo71a(m2811a(i), 0);
            return view;
        }

        /* renamed from: a */
        void m2812a() {
            C3227j r = this.f2312a.f13565c.m16186r();
            if (r != null) {
                ArrayList l = this.f2312a.f13565c.m16180l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (((C3227j) l.get(i)) == r) {
                        this.f2313b = i;
                        return;
                    }
                }
            }
            this.f2313b = -1;
        }

        public void notifyDataSetChanged() {
            m2812a();
            super.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo80a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo81a(C3224h c3224h, C3227j c3227j) {
        return false;
    }

    /* renamed from: b */
    public boolean mo84b(C3224h c3224h, C3227j c3227j) {
        return false;
    }

    public C3223f(Context context, int i) {
        this(i, 0);
        this.f13563a = context;
        this.f13564b = LayoutInflater.from(this.f13563a);
    }

    public C3223f(int i, int i2) {
        this.f13569g = i;
        this.f13568f = i2;
    }

    /* renamed from: a */
    public void mo75a(Context context, C3224h c3224h) {
        if (this.f13568f != 0) {
            this.f13563a = new ContextThemeWrapper(context, this.f13568f);
            this.f13564b = LayoutInflater.from(this.f13563a);
        } else if (this.f13563a != null) {
            this.f13563a = context;
            if (this.f13564b == null) {
                this.f13564b = LayoutInflater.from(this.f13563a);
            }
        }
        this.f13565c = c3224h;
        if (this.f13570h != null) {
            this.f13570h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public C0730p m16113a(ViewGroup viewGroup) {
        if (this.f13566d == null) {
            this.f13566d = (ExpandedMenuView) this.f13564b.inflate(C0633g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f13570h == null) {
                this.f13570h = new C0721a(this);
            }
            this.f13566d.setAdapter(this.f13570h);
            this.f13566d.setOnItemClickListener(this);
        }
        return this.f13566d;
    }

    /* renamed from: d */
    public ListAdapter m16127d() {
        if (this.f13570h == null) {
            this.f13570h = new C0721a(this);
        }
        return this.f13570h;
    }

    /* renamed from: a */
    public void mo79a(boolean z) {
        if (this.f13570h) {
            this.f13570h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo78a(C0727a c0727a) {
        this.f13571i = c0727a;
    }

    /* renamed from: a */
    public boolean mo82a(C4465u c4465u) {
        if (!c4465u.hasVisibleItems()) {
            return null;
        }
        new C3225i(c4465u).m16188a(null);
        if (this.f13571i != null) {
            this.f13571i.mo491a(c4465u);
        }
        return true;
    }

    /* renamed from: a */
    public void mo77a(C3224h c3224h, boolean z) {
        if (this.f13571i != null) {
            this.f13571i.mo490a(c3224h, z);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f13565c.m16156a(this.f13570h.m2811a(i), (C0728o) this, 0);
    }

    /* renamed from: a */
    public void m16115a(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        if (this.f13566d != null) {
            this.f13566d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    /* renamed from: b */
    public void m16124b(Bundle bundle) {
        bundle = bundle.getSparseParcelableArray("android:menu:list");
        if (bundle != null) {
            this.f13566d.restoreHierarchyState(bundle);
        }
    }

    /* renamed from: b */
    public int mo83b() {
        return this.f13572j;
    }

    /* renamed from: c */
    public Parcelable mo85c() {
        if (this.f13566d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m16115a(bundle);
        return bundle;
    }

    /* renamed from: a */
    public void mo76a(Parcelable parcelable) {
        m16124b((Bundle) parcelable);
    }
}
