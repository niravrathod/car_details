package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.v4.p011b.p012a.C0372b;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: android.support.v4.view.f */
public final class C0548f {
    /* renamed from: a */
    static final C0547c f1752a;

    /* renamed from: android.support.v4.view.f$c */
    interface C0547c {
        /* renamed from: a */
        void mo445a(MenuItem menuItem, char c, int i);

        /* renamed from: a */
        void mo446a(MenuItem menuItem, ColorStateList colorStateList);

        /* renamed from: a */
        void mo447a(MenuItem menuItem, Mode mode);

        /* renamed from: a */
        void mo448a(MenuItem menuItem, CharSequence charSequence);

        /* renamed from: b */
        void mo449b(MenuItem menuItem, char c, int i);

        /* renamed from: b */
        void mo450b(MenuItem menuItem, CharSequence charSequence);
    }

    /* renamed from: android.support.v4.view.f$b */
    static class C3166b implements C0547c {
        /* renamed from: a */
        public void mo445a(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: a */
        public void mo446a(MenuItem menuItem, ColorStateList colorStateList) {
        }

        /* renamed from: a */
        public void mo447a(MenuItem menuItem, Mode mode) {
        }

        /* renamed from: a */
        public void mo448a(MenuItem menuItem, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo449b(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: b */
        public void mo450b(MenuItem menuItem, CharSequence charSequence) {
        }

        C3166b() {
        }
    }

    /* renamed from: android.support.v4.view.f$a */
    static class C4441a extends C3166b {
        C4441a() {
        }

        /* renamed from: a */
        public void mo448a(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        /* renamed from: b */
        public void mo450b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }

        /* renamed from: a */
        public void mo445a(MenuItem menuItem, char c, int i) {
            menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: b */
        public void mo449b(MenuItem menuItem, char c, int i) {
            menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: a */
        public void mo446a(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo447a(MenuItem menuItem, Mode mode) {
            menuItem.setIconTintMode(mode);
        }
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1752a = new C4441a();
        } else {
            f1752a = new C3166b();
        }
    }

    /* renamed from: a */
    public static MenuItem m2053a(MenuItem menuItem, C0542b c0542b) {
        if (menuItem instanceof C0372b) {
            return ((C0372b) menuItem).mo584a(c0542b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m2057a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0372b) {
            ((C0372b) menuItem).mo585a(charSequence);
        } else {
            f1752a.mo448a(menuItem, charSequence);
        }
    }

    /* renamed from: b */
    public static void m2059b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0372b) {
            ((C0372b) menuItem).mo587b(charSequence);
        } else {
            f1752a.mo450b(menuItem, charSequence);
        }
    }

    /* renamed from: a */
    public static void m2054a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0372b) {
            ((C0372b) menuItem).setNumericShortcut(c, i);
        } else {
            f1752a.mo449b(menuItem, c, i);
        }
    }

    /* renamed from: b */
    public static void m2058b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0372b) {
            ((C0372b) menuItem).setAlphabeticShortcut(c, i);
        } else {
            f1752a.mo445a(menuItem, c, i);
        }
    }

    /* renamed from: a */
    public static void m2055a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0372b) {
            ((C0372b) menuItem).setIconTintList(colorStateList);
        } else {
            f1752a.mo446a(menuItem, colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2056a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C0372b) {
            ((C0372b) menuItem).setIconTintMode(mode);
        } else {
            f1752a.mo447a(menuItem, mode);
        }
    }
}
