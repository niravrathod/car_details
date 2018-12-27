package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p011b.p012a.C0372b;
import android.support.v4.p011b.p012a.C3118c;
import android.support.v4.p017f.C3131a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.c */
abstract class C3221c<T> extends C0716d<T> {
    /* renamed from: a */
    final Context f13559a;
    /* renamed from: c */
    private Map<C0372b, MenuItem> f13560c;
    /* renamed from: d */
    private Map<C3118c, SubMenu> f13561d;

    C3221c(Context context, T t) {
        super(t);
        this.f13559a = context;
    }

    /* renamed from: a */
    final MenuItem m16106a(MenuItem menuItem) {
        if (!(menuItem instanceof C0372b)) {
            return menuItem;
        }
        C0372b c0372b = (C0372b) menuItem;
        if (this.f13560c == null) {
            this.f13560c = new C3131a();
        }
        menuItem = (MenuItem) this.f13560c.get(menuItem);
        if (menuItem == null) {
            menuItem = C0731q.m2851a(this.f13559a, c0372b);
            this.f13560c.put(c0372b, menuItem);
        }
        return menuItem;
    }

    /* renamed from: a */
    final SubMenu m16107a(SubMenu subMenu) {
        if (!(subMenu instanceof C3118c)) {
            return subMenu;
        }
        C3118c c3118c = (C3118c) subMenu;
        if (this.f13561d == null) {
            this.f13561d = new C3131a();
        }
        SubMenu subMenu2 = (SubMenu) this.f13561d.get(c3118c);
        if (subMenu2 == null) {
            subMenu2 = C0731q.m2852a(this.f13559a, c3118c);
            this.f13561d.put(c3118c, subMenu2);
        }
        return subMenu2;
    }

    /* renamed from: a */
    final void m16108a() {
        if (this.f13560c != null) {
            this.f13560c.clear();
        }
        if (this.f13561d != null) {
            this.f13561d.clear();
        }
    }

    /* renamed from: a */
    final void m16109a(int i) {
        if (this.f13560c != null) {
            Iterator it = this.f13560c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    final void m16110b(int i) {
        if (this.f13560c != null) {
            Iterator it = this.f13560c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
    }
}
