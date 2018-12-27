package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.content.C0389b;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.p011b.p012a.C0372b;
import android.support.v4.view.C0542b;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.a */
public class C3219a implements C0372b {
    /* renamed from: a */
    private final int f13527a;
    /* renamed from: b */
    private final int f13528b;
    /* renamed from: c */
    private final int f13529c;
    /* renamed from: d */
    private final int f13530d;
    /* renamed from: e */
    private CharSequence f13531e;
    /* renamed from: f */
    private CharSequence f13532f;
    /* renamed from: g */
    private Intent f13533g;
    /* renamed from: h */
    private char f13534h;
    /* renamed from: i */
    private int f13535i = 4096;
    /* renamed from: j */
    private char f13536j;
    /* renamed from: k */
    private int f13537k = 4096;
    /* renamed from: l */
    private Drawable f13538l;
    /* renamed from: m */
    private int f13539m = 0;
    /* renamed from: n */
    private Context f13540n;
    /* renamed from: o */
    private OnMenuItemClickListener f13541o;
    /* renamed from: p */
    private CharSequence f13542p;
    /* renamed from: q */
    private CharSequence f13543q;
    /* renamed from: r */
    private ColorStateList f13544r = null;
    /* renamed from: s */
    private Mode f13545s = null;
    /* renamed from: t */
    private boolean f13546t = false;
    /* renamed from: u */
    private boolean f13547u = false;
    /* renamed from: v */
    private int f13548v = 16;

    /* renamed from: a */
    public C0542b mo586a() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public View getActionView() {
        return null;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public void setShowAsAction(int i) {
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        return m16081a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m16083a(view);
    }

    public /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        return mo585a(charSequence);
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m16086b(i);
    }

    public /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        return mo587b(charSequence);
    }

    public C3219a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f13540n = context;
        this.f13527a = i2;
        this.f13528b = i;
        this.f13529c = i3;
        this.f13530d = i4;
        this.f13531e = charSequence;
    }

    public char getAlphabeticShortcut() {
        return this.f13536j;
    }

    public int getAlphabeticModifiers() {
        return this.f13537k;
    }

    public int getGroupId() {
        return this.f13528b;
    }

    public Drawable getIcon() {
        return this.f13538l;
    }

    public Intent getIntent() {
        return this.f13533g;
    }

    public int getItemId() {
        return this.f13527a;
    }

    public char getNumericShortcut() {
        return this.f13534h;
    }

    public int getNumericModifiers() {
        return this.f13535i;
    }

    public int getOrder() {
        return this.f13530d;
    }

    public CharSequence getTitle() {
        return this.f13531e;
    }

    public CharSequence getTitleCondensed() {
        return this.f13532f != null ? this.f13532f : this.f13531e;
    }

    public boolean isCheckable() {
        return (this.f13548v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f13548v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f13548v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f13548v & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f13536j = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f13536j = Character.toLowerCase(c);
        this.f13537k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f13548v = z | (this.f13548v & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f13548v = (z ? true : false) | (this.f13548v & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f13548v = (z ? true : false) | (this.f13548v & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f13538l = drawable;
        this.f13539m = null;
        m16080b();
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f13539m = i;
        this.f13538l = C0389b.m1429a(this.f13540n, i);
        m16080b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f13533g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f13534h = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f13534h = c;
        this.f13535i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f13541o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f13534h = c;
        this.f13536j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f13534h = c;
        this.f13535i = KeyEvent.normalizeMetaState(i);
        this.f13536j = Character.toLowerCase(c2);
        this.f13537k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f13531e = charSequence;
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f13531e = this.f13540n.getResources().getString(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13532f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f13548v & 8;
        if (z) {
            i = 0;
        }
        this.f13548v = i2 | i;
        return this;
    }

    /* renamed from: a */
    public C0372b m16083a(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0372b m16081a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0372b mo584a(C0542b c0542b) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C0372b m16086b(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0372b mo585a(CharSequence charSequence) {
        this.f13542p = charSequence;
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f13542p;
    }

    /* renamed from: b */
    public C0372b mo587b(CharSequence charSequence) {
        this.f13543q = charSequence;
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f13543q;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13544r = colorStateList;
        this.f13546t = true;
        m16080b();
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f13544r;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f13545s = mode;
        this.f13547u = true;
        m16080b();
        return this;
    }

    public Mode getIconTintMode() {
        return this.f13545s;
    }

    /* renamed from: b */
    private void m16080b() {
        if (this.f13538l == null) {
            return;
        }
        if (this.f13546t || this.f13547u) {
            this.f13538l = C0295a.m1061g(this.f13538l);
            this.f13538l = this.f13538l.mutate();
            if (this.f13546t) {
                C0295a.m1050a(this.f13538l, this.f13544r);
            }
            if (this.f13547u) {
                C0295a.m1053a(this.f13538l, this.f13545s);
            }
        }
    }
}
