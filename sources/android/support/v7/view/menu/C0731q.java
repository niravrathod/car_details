package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.p011b.p012a.C0371a;
import android.support.v4.p011b.p012a.C0372b;
import android.support.v4.p011b.p012a.C3118c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.q */
public final class C0731q {
    /* renamed from: a */
    public static Menu m2850a(Context context, C0371a c0371a) {
        return new C4463r(context, c0371a);
    }

    /* renamed from: a */
    public static MenuItem m2851a(Context context, C0372b c0372b) {
        if (VERSION.SDK_INT >= 16) {
            return new C4768l(context, c0372b);
        }
        return new C4461k(context, c0372b);
    }

    /* renamed from: a */
    public static SubMenu m2852a(Context context, C3118c c3118c) {
        return new C4769v(context, c3118c);
    }
}
