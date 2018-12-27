package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.C3224h.C0723a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.u */
public class C4465u extends C3224h implements SubMenu {
    /* renamed from: d */
    private C3224h f18552d;
    /* renamed from: e */
    private C3227j f18553e;

    public C4465u(Context context, C3224h c3224h, C3227j c3227j) {
        super(context);
        this.f18552d = c3224h;
        this.f18553e = c3227j;
    }

    public void setQwertyMode(boolean z) {
        this.f18552d.setQwertyMode(z);
    }

    /* renamed from: b */
    public boolean mo3837b() {
        return this.f18552d.mo3837b();
    }

    /* renamed from: c */
    public boolean mo3838c() {
        return this.f18552d.mo3838c();
    }

    /* renamed from: s */
    public Menu m24494s() {
        return this.f18552d;
    }

    public MenuItem getItem() {
        return this.f18553e;
    }

    /* renamed from: a */
    public void mo3835a(C0723a c0723a) {
        this.f18552d.mo3835a(c0723a);
    }

    /* renamed from: p */
    public C3224h mo3841p() {
        return this.f18552d.mo3841p();
    }

    /* renamed from: a */
    boolean mo3836a(C3224h c3224h, MenuItem menuItem) {
        if (!super.mo3836a(c3224h, menuItem)) {
            if (this.f18552d.mo3836a(c3224h, menuItem) == null) {
                return null;
            }
        }
        return true;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f18553e.setIcon(drawable);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f18553e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m16140a(drawable);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m16173e(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m16142a(charSequence);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m16169d(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m16141a(view);
    }

    /* renamed from: c */
    public boolean mo3839c(C3227j c3227j) {
        return this.f18552d.mo3839c(c3227j);
    }

    /* renamed from: d */
    public boolean mo3840d(C3227j c3227j) {
        return this.f18552d.mo3840d(c3227j);
    }

    /* renamed from: a */
    public String mo3834a() {
        int itemId = this.f18553e != null ? this.f18553e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.mo3834a());
        stringBuilder.append(":");
        stringBuilder.append(itemId);
        return stringBuilder.toString();
    }
}
