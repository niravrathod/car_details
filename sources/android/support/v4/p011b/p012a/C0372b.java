package android.support.v4.p011b.p012a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.v4.view.C0542b;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.b.a.b */
public interface C0372b extends MenuItem {
    /* renamed from: a */
    C0372b mo584a(C0542b c0542b);

    /* renamed from: a */
    C0372b mo585a(CharSequence charSequence);

    /* renamed from: a */
    C0542b mo586a();

    /* renamed from: b */
    C0372b mo587b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
