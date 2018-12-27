package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3227j;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.design.internal.a */
public final class C4407a extends C3224h {
    public C4407a(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    /* renamed from: a */
    protected MenuItem mo3723a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            m16175g();
            i = super.mo3723a(i, i2, i3, charSequence);
            if ((i instanceof C3227j) != 0) {
                ((C3227j) i).m16201a(true);
            }
            m16176h();
            return i;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }
}
