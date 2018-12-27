package android.support.v7.view;

import android.content.Context;
import android.support.v4.p011b.p012a.C0371a;
import android.support.v4.p011b.p012a.C0372b;
import android.support.v4.p017f.C0433m;
import android.support.v7.view.C0706b.C0705a;
import android.support.v7.view.menu.C0731q;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.f */
public class C0709f extends ActionMode {
    /* renamed from: a */
    final Context f2252a;
    /* renamed from: b */
    final C0706b f2253b;

    /* renamed from: android.support.v7.view.f$a */
    public static class C3217a implements C0705a {
        /* renamed from: a */
        final Callback f13504a;
        /* renamed from: b */
        final Context f13505b;
        /* renamed from: c */
        final ArrayList<C0709f> f13506c = new ArrayList();
        /* renamed from: d */
        final C0433m<Menu, Menu> f13507d = new C0433m();

        public C3217a(Context context, Callback callback) {
            this.f13505b = context;
            this.f13504a = callback;
        }

        /* renamed from: a */
        public boolean mo493a(C0706b c0706b, Menu menu) {
            return this.f13504a.onCreateActionMode(m16069b(c0706b), m16065a(menu));
        }

        /* renamed from: b */
        public boolean mo495b(C0706b c0706b, Menu menu) {
            return this.f13504a.onPrepareActionMode(m16069b(c0706b), m16065a(menu));
        }

        /* renamed from: a */
        public boolean mo494a(C0706b c0706b, MenuItem menuItem) {
            return this.f13504a.onActionItemClicked(m16069b(c0706b), C0731q.m2851a(this.f13505b, (C0372b) menuItem));
        }

        /* renamed from: a */
        public void mo492a(C0706b c0706b) {
            this.f13504a.onDestroyActionMode(m16069b(c0706b));
        }

        /* renamed from: a */
        private Menu m16065a(Menu menu) {
            Menu menu2 = (Menu) this.f13507d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            menu2 = C0731q.m2850a(this.f13505b, (C0371a) menu);
            this.f13507d.put(menu, menu2);
            return menu2;
        }

        /* renamed from: b */
        public ActionMode m16069b(C0706b c0706b) {
            int size = this.f13506c.size();
            for (int i = 0; i < size; i++) {
                C0709f c0709f = (C0709f) this.f13506c.get(i);
                if (c0709f != null && c0709f.f2253b == c0706b) {
                    return c0709f;
                }
            }
            ActionMode c0709f2 = new C0709f(this.f13505b, c0706b);
            this.f13506c.add(c0709f2);
            return c0709f2;
        }
    }

    public C0709f(Context context, C0706b c0706b) {
        this.f2252a = context;
        this.f2253b = c0706b;
    }

    public Object getTag() {
        return this.f2253b.m2781j();
    }

    public void setTag(Object obj) {
        this.f2253b.m2770a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2253b.mo557b(charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2253b.mo553a(charSequence);
    }

    public void invalidate() {
        this.f2253b.mo559d();
    }

    public void finish() {
        this.f2253b.mo558c();
    }

    public Menu getMenu() {
        return C0731q.m2850a(this.f2252a, (C0371a) this.f2253b.mo555b());
    }

    public CharSequence getTitle() {
        return this.f2253b.mo560f();
    }

    public void setTitle(int i) {
        this.f2253b.mo551a(i);
    }

    public CharSequence getSubtitle() {
        return this.f2253b.mo561g();
    }

    public void setSubtitle(int i) {
        this.f2253b.mo556b(i);
    }

    public View getCustomView() {
        return this.f2253b.mo563i();
    }

    public void setCustomView(View view) {
        this.f2253b.mo552a(view);
    }

    public MenuInflater getMenuInflater() {
        return this.f2253b.mo550a();
    }

    public boolean getTitleOptionalHint() {
        return this.f2253b.m2782k();
    }

    public void setTitleOptionalHint(boolean z) {
        this.f2253b.mo554a(z);
    }

    public boolean isTitleOptional() {
        return this.f2253b.mo562h();
    }
}
