package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.C0143a.C0135d;
import android.support.design.C0143a.C0139h;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0571z;
import android.support.v7.view.menu.C0728o;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.view.menu.C0730p;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3227j;
import android.support.v7.view.menu.C4465u;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: android.support.design.internal.c */
public class C3042c implements C0728o {
    /* renamed from: a */
    LinearLayout f12832a;
    /* renamed from: b */
    C3224h f12833b;
    /* renamed from: c */
    C3037b f12834c;
    /* renamed from: d */
    LayoutInflater f12835d;
    /* renamed from: e */
    int f12836e;
    /* renamed from: f */
    boolean f12837f;
    /* renamed from: g */
    ColorStateList f12838g;
    /* renamed from: h */
    ColorStateList f12839h;
    /* renamed from: i */
    Drawable f12840i;
    /* renamed from: j */
    int f12841j;
    /* renamed from: k */
    final OnClickListener f12842k = new C01471(this);
    /* renamed from: l */
    private NavigationMenuView f12843l;
    /* renamed from: m */
    private C0727a f12844m;
    /* renamed from: n */
    private int f12845n;
    /* renamed from: o */
    private int f12846o;

    /* renamed from: android.support.design.internal.c$1 */
    class C01471 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3042c f541a;

        C01471(C3042c c3042c) {
            this.f541a = c3042c;
        }

        public void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            this.f541a.m14911b(true);
            C3227j itemData = navigationMenuItemView.getItemData();
            boolean a = this.f541a.f12833b.m16156a((MenuItem) itemData, this.f541a, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                this.f541a.f12834c.m14882a(itemData);
            }
            this.f541a.m14911b(false);
            this.f541a.mo79a(false);
        }
    }

    /* renamed from: android.support.design.internal.c$d */
    private interface C0148d {
    }

    /* renamed from: android.support.design.internal.c$b */
    private class C3037b extends C0771a<C3041j> {
        /* renamed from: a */
        final /* synthetic */ C3042c f12824a;
        /* renamed from: b */
        private final ArrayList<C0148d> f12825b = new ArrayList();
        /* renamed from: c */
        private C3227j f12826c;
        /* renamed from: d */
        private boolean f12827d;

        /* renamed from: a */
        public long mo92a(int i) {
            return (long) i;
        }

        /* renamed from: b */
        public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
            return m14878a(viewGroup, i);
        }

        C3037b(C3042c c3042c) {
            this.f12824a = c3042c;
            m14875f();
        }

        /* renamed from: a */
        public int mo91a() {
            return this.f12825b.size();
        }

        /* renamed from: b */
        public int mo95b(int i) {
            C0148d c0148d = (C0148d) this.f12825b.get(i);
            if (c0148d instanceof C3039e) {
                return 2;
            }
            if (c0148d instanceof C3038c) {
                return 3;
            }
            if (c0148d instanceof C3040f) {
                return ((C3040f) c0148d).m14892a().hasSubMenu() != 0 ? 1 : 0;
            } else {
                throw new RuntimeException("Unknown item type.");
            }
        }

        /* renamed from: a */
        public C3041j m14878a(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new C4410g(this.f12824a.f12835d, viewGroup, this.f12824a.f12842k);
                case 1:
                    return new C4412i(this.f12824a.f12835d, viewGroup);
                case 2:
                    return new C4411h(this.f12824a.f12835d, viewGroup);
                case 3:
                    return new C4409a(this.f12824a.f12832a);
                default:
                    return null;
            }
        }

        /* renamed from: a */
        public void m14881a(C3041j c3041j, int i) {
            switch (mo95b(i)) {
                case 0:
                    View view = (NavigationMenuItemView) c3041j.a;
                    view.setIconTintList(this.f12824a.f12839h);
                    if (this.f12824a.f12837f) {
                        view.setTextAppearance(this.f12824a.f12836e);
                    }
                    if (this.f12824a.f12838g != null) {
                        view.setTextColor(this.f12824a.f12838g);
                    }
                    C0560r.m2174a(view, this.f12824a.f12840i != null ? this.f12824a.f12840i.getConstantState().newDrawable() : null);
                    C3040f c3040f = (C3040f) this.f12825b.get(i);
                    view.setNeedsEmptyIcon(c3040f.f12830a);
                    view.mo71a(c3040f.m14892a(), 0);
                    return;
                case 1:
                    ((TextView) c3041j.a).setText(((C3040f) this.f12825b.get(i)).m14892a().getTitle());
                    return;
                case 2:
                    C3039e c3039e = (C3039e) this.f12825b.get(i);
                    c3041j.a.setPadding(0, c3039e.m14890a(), 0, c3039e.m14891b());
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public void m14880a(C3041j c3041j) {
            if (c3041j instanceof C4410g) {
                ((NavigationMenuItemView) c3041j.a).m24091b();
            }
        }

        /* renamed from: b */
        public void m14888b() {
            m14875f();
            m2967e();
        }

        /* renamed from: f */
        private void m14875f() {
            if (!this.f12827d) {
                r0.f12827d = true;
                r0.f12825b.clear();
                r0.f12825b.add(new C3038c());
                int size = r0.f12824a.f12833b.m16177i().size();
                int i = -1;
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C3227j c3227j = (C3227j) r0.f12824a.f12833b.m16177i().get(i3);
                    if (c3227j.isChecked()) {
                        m14882a(c3227j);
                    }
                    if (c3227j.isCheckable()) {
                        c3227j.m16201a(false);
                    }
                    if (c3227j.hasSubMenu()) {
                        SubMenu subMenu = c3227j.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                r0.f12825b.add(new C3039e(r0.f12824a.f12841j, 0));
                            }
                            r0.f12825b.add(new C3040f(c3227j));
                            int size2 = r0.f12825b.size();
                            int size3 = subMenu.size();
                            Object obj = null;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C3227j c3227j2 = (C3227j) subMenu.getItem(i4);
                                if (c3227j2.isVisible()) {
                                    if (obj == null && c3227j2.getIcon() != null) {
                                        obj = 1;
                                    }
                                    if (c3227j2.isCheckable()) {
                                        c3227j2.m16201a(false);
                                    }
                                    if (c3227j.isChecked()) {
                                        m14882a(c3227j);
                                    }
                                    r0.f12825b.add(new C3040f(c3227j2));
                                }
                            }
                            if (obj != null) {
                                m14874d(size2, r0.f12825b.size());
                            }
                        }
                    } else {
                        int groupId = c3227j.getGroupId();
                        if (groupId != i) {
                            i2 = r0.f12825b.size();
                            boolean z2 = c3227j.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                r0.f12825b.add(new C3039e(r0.f12824a.f12841j, r0.f12824a.f12841j));
                            }
                            z = z2;
                        } else if (!(z || c3227j.getIcon() == null)) {
                            m14874d(i2, r0.f12825b.size());
                            z = true;
                        }
                        C3040f c3040f = new C3040f(c3227j);
                        c3040f.f12830a = z;
                        r0.f12825b.add(c3040f);
                        i = groupId;
                    }
                }
                r0.f12827d = false;
            }
        }

        /* renamed from: d */
        private void m14874d(int i, int i2) {
            while (i < i2) {
                ((C3040f) this.f12825b.get(i)).f12830a = true;
                i++;
            }
        }

        /* renamed from: a */
        public void m14882a(C3227j c3227j) {
            if (this.f12826c != c3227j) {
                if (c3227j.isCheckable()) {
                    if (this.f12826c != null) {
                        this.f12826c.setChecked(false);
                    }
                    this.f12826c = c3227j;
                    c3227j.setChecked(true);
                }
            }
        }

        /* renamed from: c */
        public Bundle m14889c() {
            Bundle bundle = new Bundle();
            if (this.f12826c != null) {
                bundle.putInt("android:menu:checked", this.f12826c.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f12825b.size();
            for (int i = 0; i < size; i++) {
                C0148d c0148d = (C0148d) this.f12825b.get(i);
                if (c0148d instanceof C3040f) {
                    C3227j a = ((C3040f) c0148d).m14892a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        SparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: a */
        public void m14879a(Bundle bundle) {
            int i = 0;
            int i2 = bundle.getInt("android:menu:checked", 0);
            if (i2 != 0) {
                this.f12827d = true;
                int size = this.f12825b.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0148d c0148d = (C0148d) this.f12825b.get(i3);
                    if (c0148d instanceof C3040f) {
                        C3227j a = ((C3040f) c0148d).m14892a();
                        if (a != null && a.getItemId() == i2) {
                            m14882a(a);
                            break;
                        }
                    }
                }
                this.f12827d = false;
                m14875f();
            }
            bundle = bundle.getSparseParcelableArray("android:menu:action_views");
            if (bundle != null) {
                i2 = this.f12825b.size();
                while (i < i2) {
                    C0148d c0148d2 = (C0148d) this.f12825b.get(i);
                    if (c0148d2 instanceof C3040f) {
                        C3227j a2 = ((C3040f) c0148d2).m14892a();
                        if (a2 != null) {
                            View actionView = a2.getActionView();
                            if (actionView != null) {
                                ParcelableSparseArray parcelableSparseArray = (ParcelableSparseArray) bundle.get(a2.getItemId());
                                if (parcelableSparseArray != null) {
                                    actionView.restoreHierarchyState(parcelableSparseArray);
                                }
                            }
                        }
                    }
                    i++;
                }
            }
        }

        /* renamed from: a */
        public void m14885a(boolean z) {
            this.f12827d = z;
        }
    }

    /* renamed from: android.support.design.internal.c$c */
    private static class C3038c implements C0148d {
        C3038c() {
        }
    }

    /* renamed from: android.support.design.internal.c$e */
    private static class C3039e implements C0148d {
        /* renamed from: a */
        private final int f12828a;
        /* renamed from: b */
        private final int f12829b;

        public C3039e(int i, int i2) {
            this.f12828a = i;
            this.f12829b = i2;
        }

        /* renamed from: a */
        public int m14890a() {
            return this.f12828a;
        }

        /* renamed from: b */
        public int m14891b() {
            return this.f12829b;
        }
    }

    /* renamed from: android.support.design.internal.c$f */
    private static class C3040f implements C0148d {
        /* renamed from: a */
        boolean f12830a;
        /* renamed from: b */
        private final C3227j f12831b;

        C3040f(C3227j c3227j) {
            this.f12831b = c3227j;
        }

        /* renamed from: a */
        public C3227j m14892a() {
            return this.f12831b;
        }
    }

    /* renamed from: android.support.design.internal.c$j */
    private static abstract class C3041j extends C0798v {
        public C3041j(View view) {
            super(view);
        }
    }

    /* renamed from: android.support.design.internal.c$a */
    private static class C4409a extends C3041j {
        public C4409a(View view) {
            super(view);
        }
    }

    /* renamed from: android.support.design.internal.c$g */
    private static class C4410g extends C3041j {
        public C4410g(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(C0139h.design_navigation_item, viewGroup, false));
            this.a.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: android.support.design.internal.c$h */
    private static class C4411h extends C3041j {
        public C4411h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0139h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.c$i */
    private static class C4412i extends C3041j {
        public C4412i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0139h.design_navigation_item_subheader, viewGroup, false));
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

    /* renamed from: a */
    public boolean mo82a(C4465u c4465u) {
        return false;
    }

    /* renamed from: b */
    public boolean mo84b(C3224h c3224h, C3227j c3227j) {
        return false;
    }

    /* renamed from: a */
    public void mo75a(Context context, C3224h c3224h) {
        this.f12835d = LayoutInflater.from(context);
        this.f12833b = c3224h;
        this.f12841j = context.getResources().getDimensionPixelOffset(C0135d.design_navigation_separator_vertical_padding);
    }

    /* renamed from: a */
    public C0730p m14893a(ViewGroup viewGroup) {
        if (this.f12843l == null) {
            this.f12843l = (NavigationMenuView) this.f12835d.inflate(C0139h.design_navigation_menu, viewGroup, false);
            if (this.f12834c == null) {
                this.f12834c = new C3037b(this);
            }
            this.f12832a = (LinearLayout) this.f12835d.inflate(C0139h.design_navigation_item_header, this.f12843l, false);
            this.f12843l.setAdapter(this.f12834c);
        }
        return this.f12843l;
    }

    /* renamed from: a */
    public void mo79a(boolean z) {
        if (this.f12834c) {
            this.f12834c.m14888b();
        }
    }

    /* renamed from: a */
    public void mo78a(C0727a c0727a) {
        this.f12844m = c0727a;
    }

    /* renamed from: a */
    public void mo77a(C3224h c3224h, boolean z) {
        if (this.f12844m != null) {
            this.f12844m.mo490a(c3224h, z);
        }
    }

    /* renamed from: b */
    public int mo83b() {
        return this.f12845n;
    }

    /* renamed from: a */
    public void m14894a(int i) {
        this.f12845n = i;
    }

    /* renamed from: c */
    public Parcelable mo85c() {
        if (VERSION.SDK_INT < 11) {
            return null;
        }
        Parcelable bundle = new Bundle();
        if (this.f12843l != null) {
            SparseArray sparseArray = new SparseArray();
            this.f12843l.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.f12834c != null) {
            bundle.putBundle("android:menu:adapter", this.f12834c.m14889c());
        }
        if (this.f12832a != null) {
            sparseArray = new SparseArray();
            this.f12832a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray);
        }
        return bundle;
    }

    /* renamed from: a */
    public void mo76a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f12843l.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f12834c.m14879a(bundle2);
            }
            parcelable = bundle.getSparseParcelableArray("android:menu:header");
            if (parcelable != null) {
                this.f12832a.restoreHierarchyState(parcelable);
            }
        }
    }

    /* renamed from: a */
    public void m14901a(C3227j c3227j) {
        this.f12834c.m14882a(c3227j);
    }

    /* renamed from: b */
    public View m14909b(int i) {
        View inflate = this.f12835d.inflate(i, this.f12832a, false);
        m14903a(inflate);
        return inflate;
    }

    /* renamed from: a */
    public void m14903a(View view) {
        this.f12832a.addView(view);
        this.f12843l.setPadding(0, 0, 0, this.f12843l.getPaddingBottom());
    }

    /* renamed from: d */
    public int m14915d() {
        return this.f12832a.getChildCount();
    }

    /* renamed from: e */
    public ColorStateList m14916e() {
        return this.f12839h;
    }

    /* renamed from: a */
    public void m14896a(ColorStateList colorStateList) {
        this.f12839h = colorStateList;
        mo79a((boolean) null);
    }

    /* renamed from: f */
    public ColorStateList m14917f() {
        return this.f12838g;
    }

    /* renamed from: b */
    public void m14910b(ColorStateList colorStateList) {
        this.f12838g = colorStateList;
        mo79a((boolean) null);
    }

    /* renamed from: c */
    public void m14914c(int i) {
        this.f12836e = i;
        this.f12837f = true;
        mo79a((boolean) 0);
    }

    /* renamed from: g */
    public Drawable m14918g() {
        return this.f12840i;
    }

    /* renamed from: a */
    public void m14897a(Drawable drawable) {
        this.f12840i = drawable;
        mo79a((boolean) null);
    }

    /* renamed from: b */
    public void m14911b(boolean z) {
        if (this.f12834c != null) {
            this.f12834c.m14885a(z);
        }
    }

    /* renamed from: a */
    public void m14899a(C0571z c0571z) {
        int b = c0571z.m2253b();
        if (this.f12846o != b) {
            this.f12846o = b;
            if (this.f12832a.getChildCount() == 0) {
                this.f12843l.setPadding(0, this.f12846o, 0, this.f12843l.getPaddingBottom());
            }
        }
        C0560r.m2183b(this.f12832a, c0571z);
    }
}
