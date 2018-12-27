package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p011b.p012a.C0372b;
import android.support.v4.view.C0542b;
import android.support.v7.view.C0707c;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.menu.k */
public class C4461k extends C3221c<C0372b> implements MenuItem {
    /* renamed from: c */
    private Method f18529c;

    /* renamed from: android.support.v7.view.menu.k$a */
    class C3228a extends C0542b {
        /* renamed from: a */
        final ActionProvider f13639a;
        /* renamed from: b */
        final /* synthetic */ C4461k f13640b;

        public C3228a(C4461k c4461k, Context context, ActionProvider actionProvider) {
            this.f13640b = c4461k;
            super(context);
            this.f13639a = actionProvider;
        }

        /* renamed from: a */
        public View mo610a() {
            return this.f13639a.onCreateActionView();
        }

        /* renamed from: d */
        public boolean mo612d() {
            return this.f13639a.onPerformDefaultAction();
        }

        /* renamed from: e */
        public boolean mo613e() {
            return this.f13639a.hasSubMenu();
        }

        /* renamed from: a */
        public void mo611a(SubMenu subMenu) {
            this.f13639a.onPrepareSubMenu(this.f13640b.m16107a(subMenu));
        }
    }

    /* renamed from: android.support.v7.view.menu.k$b */
    static class C3229b extends FrameLayout implements C0707c {
        /* renamed from: a */
        final CollapsibleActionView f13641a;

        C3229b(View view) {
            super(view.getContext());
            this.f13641a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo614a() {
            this.f13641a.onActionViewExpanded();
        }

        /* renamed from: b */
        public void mo615b() {
            this.f13641a.onActionViewCollapsed();
        }

        /* renamed from: c */
        View m16227c() {
            return (View) this.f13641a;
        }
    }

    /* renamed from: android.support.v7.view.menu.k$c */
    private class C3230c extends C0716d<OnActionExpandListener> implements OnActionExpandListener {
        /* renamed from: a */
        final /* synthetic */ C4461k f13642a;

        C3230c(C4461k c4461k, OnActionExpandListener onActionExpandListener) {
            this.f13642a = c4461k;
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionExpand(this.f13642a.m16106a(menuItem));
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionCollapse(this.f13642a.m16106a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.k$d */
    private class C3231d extends C0716d<OnMenuItemClickListener> implements OnMenuItemClickListener {
        /* renamed from: a */
        final /* synthetic */ C4461k f13643a;

        C3231d(C4461k c4461k, OnMenuItemClickListener onMenuItemClickListener) {
            this.f13643a = c4461k;
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.b).onMenuItemClick(this.f13643a.m16106a(menuItem));
        }
    }

    C4461k(Context context, C0372b c0372b) {
        super(context, c0372b);
    }

    public int getItemId() {
        return ((C0372b) this.b).getItemId();
    }

    public int getGroupId() {
        return ((C0372b) this.b).getGroupId();
    }

    public int getOrder() {
        return ((C0372b) this.b).getOrder();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0372b) this.b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0372b) this.b).setTitle(i);
        return this;
    }

    public CharSequence getTitle() {
        return ((C0372b) this.b).getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0372b) this.b).setTitleCondensed(charSequence);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((C0372b) this.b).getTitleCondensed();
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0372b) this.b).setIcon(drawable);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0372b) this.b).setIcon(i);
        return this;
    }

    public Drawable getIcon() {
        return ((C0372b) this.b).getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((C0372b) this.b).setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((C0372b) this.b).getIntent();
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0372b) this.b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0372b) this.b).setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0372b) this.b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0372b) this.b).setNumericShortcut(c, i);
        return this;
    }

    public char getNumericShortcut() {
        return ((C0372b) this.b).getNumericShortcut();
    }

    public int getNumericModifiers() {
        return ((C0372b) this.b).getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0372b) this.b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0372b) this.b).setAlphabeticShortcut(c, i);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((C0372b) this.b).getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return ((C0372b) this.b).getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean z) {
        ((C0372b) this.b).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((C0372b) this.b).isCheckable();
    }

    public MenuItem setChecked(boolean z) {
        ((C0372b) this.b).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((C0372b) this.b).isChecked();
    }

    public MenuItem setVisible(boolean z) {
        return ((C0372b) this.b).setVisible(z);
    }

    public boolean isVisible() {
        return ((C0372b) this.b).isVisible();
    }

    public MenuItem setEnabled(boolean z) {
        ((C0372b) this.b).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((C0372b) this.b).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((C0372b) this.b).hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return m16107a(((C0372b) this.b).getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C0372b) this.b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C3231d(this, onMenuItemClickListener) : null);
        return this;
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0372b) this.b).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((C0372b) this.b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0372b) this.b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C3229b(view);
        }
        ((C0372b) this.b).setActionView(view);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0372b) this.b).setActionView(i);
        i = ((C0372b) this.b).getActionView();
        if (i instanceof CollapsibleActionView) {
            ((C0372b) this.b).setActionView(new C3229b(i));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((C0372b) this.b).getActionView();
        return actionView instanceof C3229b ? ((C3229b) actionView).m16227c() : actionView;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0372b) this.b).mo584a(actionProvider != null ? mo4613a(actionProvider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        C0542b a = ((C0372b) this.b).mo586a();
        return a instanceof C3228a ? ((C3228a) a).f13639a : null;
    }

    public boolean expandActionView() {
        return ((C0372b) this.b).expandActionView();
    }

    public boolean collapseActionView() {
        return ((C0372b) this.b).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((C0372b) this.b).isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C0372b) this.b).setOnActionExpandListener(onActionExpandListener != null ? new C3230c(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0372b) this.b).mo585a(charSequence);
        return this;
    }

    public CharSequence getContentDescription() {
        return ((C0372b) this.b).getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0372b) this.b).mo587b(charSequence);
        return this;
    }

    public CharSequence getTooltipText() {
        return ((C0372b) this.b).getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0372b) this.b).setIconTintList(colorStateList);
        return this;
    }

    public ColorStateList getIconTintList() {
        return ((C0372b) this.b).getIconTintList();
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0372b) this.b).setIconTintMode(mode);
        return this;
    }

    public Mode getIconTintMode() {
        return ((C0372b) this.b).getIconTintMode();
    }

    /* renamed from: a */
    public void m24458a(boolean z) {
        try {
            if (this.f18529c == null) {
                this.f18529c = ((C0372b) this.b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f18529c.invoke(this.b, new Object[]{Boolean.valueOf(z)});
        } catch (boolean z2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", z2);
        }
    }

    /* renamed from: a */
    C3228a mo4613a(ActionProvider actionProvider) {
        return new C3228a(this, this.a, actionProvider);
    }
}
