package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p011b.p012a.C3118c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v */
class C4769v extends C4463r implements SubMenu {
    C4769v(Context context, C3118c c3118c) {
        super(context, c3118c);
    }

    /* renamed from: b */
    public C3118c m27661b() {
        return (C3118c) this.b;
    }

    public SubMenu setHeaderTitle(int i) {
        m27661b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m27661b().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderIcon(int i) {
        m27661b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        m27661b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        m27661b().setHeaderView(view);
        return this;
    }

    public void clearHeader() {
        m27661b().clearHeader();
    }

    public SubMenu setIcon(int i) {
        m27661b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        m27661b().setIcon(drawable);
        return this;
    }

    public MenuItem getItem() {
        return m16106a(m27661b().getItem());
    }
}
