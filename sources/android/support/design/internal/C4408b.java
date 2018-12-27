package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3227j;
import android.support.v7.view.menu.C4465u;
import android.view.SubMenu;

/* renamed from: android.support.design.internal.b */
public class C4408b extends C3224h {
    public C4408b(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C3227j c3227j = (C3227j) mo3723a(i, i2, i3, charSequence);
        C4465u c4756d = new C4756d(m16172e(), this, c3227j);
        c3227j.m16199a(c4756d);
        return c4756d;
    }
}
