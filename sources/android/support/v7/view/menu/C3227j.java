package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.p011b.p012a.C0372b;
import android.support.v4.view.C0542b;
import android.support.v4.view.C0542b.C0538b;
import android.support.v7.p022c.p023a.C0680b;
import android.support.v7.view.menu.C0730p.C0729a;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.view.menu.j */
public final class C3227j implements C0372b {
    /* renamed from: F */
    private static String f13604F;
    /* renamed from: G */
    private static String f13605G;
    /* renamed from: H */
    private static String f13606H;
    /* renamed from: I */
    private static String f13607I;
    /* renamed from: A */
    private View f13608A;
    /* renamed from: B */
    private C0542b f13609B;
    /* renamed from: C */
    private OnActionExpandListener f13610C;
    /* renamed from: D */
    private boolean f13611D = false;
    /* renamed from: E */
    private ContextMenuInfo f13612E;
    /* renamed from: a */
    C3224h f13613a;
    /* renamed from: b */
    private final int f13614b;
    /* renamed from: c */
    private final int f13615c;
    /* renamed from: d */
    private final int f13616d;
    /* renamed from: e */
    private final int f13617e;
    /* renamed from: f */
    private CharSequence f13618f;
    /* renamed from: g */
    private CharSequence f13619g;
    /* renamed from: h */
    private Intent f13620h;
    /* renamed from: i */
    private char f13621i;
    /* renamed from: j */
    private int f13622j = 4096;
    /* renamed from: k */
    private char f13623k;
    /* renamed from: l */
    private int f13624l = 4096;
    /* renamed from: m */
    private Drawable f13625m;
    /* renamed from: n */
    private int f13626n = 0;
    /* renamed from: o */
    private C4465u f13627o;
    /* renamed from: p */
    private Runnable f13628p;
    /* renamed from: q */
    private OnMenuItemClickListener f13629q;
    /* renamed from: r */
    private CharSequence f13630r;
    /* renamed from: s */
    private CharSequence f13631s;
    /* renamed from: t */
    private ColorStateList f13632t = null;
    /* renamed from: u */
    private Mode f13633u = null;
    /* renamed from: v */
    private boolean f13634v = false;
    /* renamed from: w */
    private boolean f13635w = false;
    /* renamed from: x */
    private boolean f13636x = false;
    /* renamed from: y */
    private int f13637y = 16;
    /* renamed from: z */
    private int f13638z = 0;

    /* renamed from: android.support.v7.view.menu.j$1 */
    class C32261 implements C0538b {
        /* renamed from: a */
        final /* synthetic */ C3227j f13603a;

        C32261(C3227j c3227j) {
            this.f13603a = c3227j;
        }

        /* renamed from: a */
        public void mo609a(boolean z) {
            this.f13603a.f13613a.m16148a(this.f13603a);
        }
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        return m16193a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m16195a(view);
    }

    public /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        return mo585a(charSequence);
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m16202b(i);
    }

    public /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        return mo587b(charSequence);
    }

    C3227j(C3224h c3224h, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f13613a = c3224h;
        this.f13614b = i2;
        this.f13615c = i;
        this.f13616d = i3;
        this.f13617e = i4;
        this.f13618f = charSequence;
        this.f13638z = i5;
    }

    /* renamed from: b */
    public boolean m16205b() {
        if ((this.f13629q != null && this.f13629q.onMenuItemClick(this)) || this.f13613a.mo3836a(this.f13613a, (MenuItem) this)) {
            return true;
        }
        if (this.f13628p != null) {
            this.f13628p.run();
            return true;
        }
        if (this.f13620h != null) {
            try {
                this.f13613a.m16172e().startActivity(this.f13620h);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        if (this.f13609B == null || !this.f13609B.mo612d()) {
            return false;
        }
        return true;
    }

    public boolean isEnabled() {
        return (this.f13637y & 16) != 0;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f13637y |= 16;
        } else {
            this.f13637y &= -17;
        }
        this.f13613a.mo4579a(false);
        return this;
    }

    public int getGroupId() {
        return this.f13615c;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f13614b;
    }

    public int getOrder() {
        return this.f13616d;
    }

    /* renamed from: c */
    public int m16206c() {
        return this.f13617e;
    }

    public Intent getIntent() {
        return this.f13620h;
    }

    public MenuItem setIntent(Intent intent) {
        this.f13620h = intent;
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f13623k;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f13623k == c) {
            return this;
        }
        this.f13623k = Character.toLowerCase(c);
        this.f13613a.mo4579a(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f13623k == c && this.f13624l == i) {
            return this;
        }
        this.f13623k = Character.toLowerCase(c);
        this.f13624l = KeyEvent.normalizeMetaState(i);
        this.f13613a.mo4579a((boolean) 0);
        return this;
    }

    public int getAlphabeticModifiers() {
        return this.f13624l;
    }

    public char getNumericShortcut() {
        return this.f13621i;
    }

    public int getNumericModifiers() {
        return this.f13622j;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f13621i == c) {
            return this;
        }
        this.f13621i = c;
        this.f13613a.mo4579a(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f13621i == c && this.f13622j == i) {
            return this;
        }
        this.f13621i = c;
        this.f13622j = KeyEvent.normalizeMetaState(i);
        this.f13613a.mo4579a((boolean) 0);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f13621i = c;
        this.f13623k = Character.toLowerCase(c2);
        this.f13613a.mo4579a((boolean) '\u0000');
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f13621i = c;
        this.f13622j = KeyEvent.normalizeMetaState(i);
        this.f13623k = Character.toLowerCase(c2);
        this.f13624l = KeyEvent.normalizeMetaState(i2);
        this.f13613a.mo4579a((boolean) '\u0000');
        return this;
    }

    /* renamed from: d */
    char m16208d() {
        return this.f13613a.mo3837b() ? this.f13623k : this.f13621i;
    }

    /* renamed from: e */
    String m16210e() {
        char d = m16208d();
        if (d == '\u0000') {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(f13604F);
        if (d == '\b') {
            stringBuilder.append(f13606H);
        } else if (d == '\n') {
            stringBuilder.append(f13605G);
        } else if (d != ' ') {
            stringBuilder.append(d);
        } else {
            stringBuilder.append(f13607I);
        }
        return stringBuilder.toString();
    }

    /* renamed from: f */
    boolean m16212f() {
        return this.f13613a.mo3838c() && m16208d() != '\u0000';
    }

    public SubMenu getSubMenu() {
        return this.f13627o;
    }

    public boolean hasSubMenu() {
        return this.f13627o != null;
    }

    /* renamed from: a */
    public void m16199a(C4465u c4465u) {
        this.f13627o = c4465u;
        c4465u.setHeaderTitle(getTitle());
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f13618f;
    }

    /* renamed from: a */
    CharSequence m16198a(C0729a c0729a) {
        if (c0729a == null || c0729a.mo72a() == null) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f13618f = charSequence;
        this.f13613a.mo4579a(false);
        if (this.f13627o != null) {
            this.f13627o.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle(this.f13613a.m16172e().getString(i));
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13619g != null ? this.f13619g : this.f13618f;
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13619g = charSequence;
        if (charSequence == null) {
            charSequence = this.f13618f;
        }
        this.f13613a.mo4579a(false);
        return this;
    }

    public Drawable getIcon() {
        if (this.f13625m != null) {
            return m16192a(this.f13625m);
        }
        if (this.f13626n == 0) {
            return null;
        }
        Drawable b = C0680b.m2703b(this.f13613a.m16172e(), this.f13626n);
        this.f13626n = 0;
        this.f13625m = b;
        return m16192a(b);
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f13626n = 0;
        this.f13625m = drawable;
        this.f13636x = true;
        this.f13613a.mo4579a(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f13625m = null;
        this.f13626n = i;
        this.f13636x = true;
        this.f13613a.mo4579a(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13632t = colorStateList;
        this.f13634v = true;
        this.f13636x = true;
        this.f13613a.mo4579a(false);
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f13632t;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f13633u = mode;
        this.f13635w = true;
        this.f13636x = true;
        this.f13613a.mo4579a(false);
        return this;
    }

    public Mode getIconTintMode() {
        return this.f13633u;
    }

    /* renamed from: a */
    private Drawable m16192a(Drawable drawable) {
        if (drawable != null && this.f13636x && (this.f13634v || this.f13635w)) {
            drawable = C0295a.m1061g(drawable).mutate();
            if (this.f13634v) {
                C0295a.m1050a(drawable, this.f13632t);
            }
            if (this.f13635w) {
                C0295a.m1053a(drawable, this.f13633u);
            }
            this.f13636x = false;
        }
        return drawable;
    }

    public boolean isCheckable() {
        return (this.f13637y & 1) == 1;
    }

    public MenuItem setCheckable(boolean z) {
        boolean z2 = this.f13637y;
        this.f13637y = z | (this.f13637y & -2);
        if (z2 != this.f13637y) {
            this.f13613a.mo4579a(false);
        }
        return this;
    }

    /* renamed from: a */
    public void m16201a(boolean z) {
        this.f13637y = (z ? true : false) | (this.f13637y & -5);
    }

    /* renamed from: g */
    public boolean m16213g() {
        return (this.f13637y & 4) != 0;
    }

    public boolean isChecked() {
        return (this.f13637y & 2) == 2;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f13637y & 4) != 0) {
            this.f13613a.m16151a((MenuItem) this);
        } else {
            m16204b(z);
        }
        return this;
    }

    /* renamed from: b */
    void m16204b(boolean z) {
        boolean z2 = this.f13637y;
        this.f13637y = (z ? true : false) | (this.f13637y & -3);
        if (z2 != this.f13637y) {
            this.f13613a.mo4579a(false);
        }
    }

    public boolean isVisible() {
        boolean z = false;
        if (this.f13609B == null || !this.f13609B.mo3832b()) {
            if ((this.f13637y & 8) == 0) {
                z = true;
            }
            return z;
        }
        if ((this.f13637y & 8) == 0 && this.f13609B.mo3833c()) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    boolean m16207c(boolean z) {
        boolean z2 = this.f13637y;
        this.f13637y = (z ? false : true) | (this.f13637y & -9);
        if (z2 != this.f13637y) {
            return true;
        }
        return false;
    }

    public MenuItem setVisible(boolean z) {
        if (m16207c(z)) {
            this.f13613a.m16148a(this);
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f13629q = onMenuItemClickListener;
        return this;
    }

    public String toString() {
        return this.f13618f != null ? this.f13618f.toString() : null;
    }

    /* renamed from: a */
    void m16200a(ContextMenuInfo contextMenuInfo) {
        this.f13612E = contextMenuInfo;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f13612E;
    }

    /* renamed from: h */
    public void m16214h() {
        this.f13613a.m16159b(this);
    }

    /* renamed from: i */
    public boolean m16215i() {
        return this.f13613a.m16185q();
    }

    /* renamed from: j */
    public boolean m16216j() {
        return (this.f13637y & 32) == 32;
    }

    /* renamed from: k */
    public boolean m16217k() {
        return (this.f13638z & 1) == 1;
    }

    /* renamed from: l */
    public boolean m16218l() {
        return (this.f13638z & 2) == 2;
    }

    /* renamed from: d */
    public void m16209d(boolean z) {
        if (z) {
            this.f13637y |= 32;
        } else {
            this.f13637y &= -33;
        }
    }

    /* renamed from: m */
    public boolean m16219m() {
        return (this.f13638z & 4) == 4;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f13638z = i;
                this.f13613a.m16159b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    /* renamed from: a */
    public C0372b m16195a(View view) {
        this.f13608A = view;
        this.f13609B = null;
        if (view != null && view.getId() == -1 && this.f13614b > 0) {
            view.setId(this.f13614b);
        }
        this.f13613a.m16159b(this);
        return this;
    }

    /* renamed from: a */
    public C0372b m16193a(int i) {
        Context e = this.f13613a.m16172e();
        m16195a(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    public View getActionView() {
        if (this.f13608A != null) {
            return this.f13608A;
        }
        if (this.f13609B == null) {
            return null;
        }
        this.f13608A = this.f13609B.mo3830a((MenuItem) this);
        return this.f13608A;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /* renamed from: a */
    public C0542b mo586a() {
        return this.f13609B;
    }

    /* renamed from: a */
    public C0372b mo584a(C0542b c0542b) {
        if (this.f13609B != null) {
            this.f13609B.m2036f();
        }
        this.f13608A = null;
        this.f13609B = c0542b;
        this.f13613a.mo4579a(true);
        if (this.f13609B != null) {
            this.f13609B.mo3831a(new C32261(this));
        }
        return this;
    }

    /* renamed from: b */
    public C0372b m16202b(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean expandActionView() {
        if (!m16220n()) {
            return false;
        }
        if (this.f13610C != null) {
            if (!this.f13610C.onMenuItemActionExpand(this)) {
                return false;
            }
        }
        return this.f13613a.mo3839c(this);
    }

    public boolean collapseActionView() {
        if ((this.f13638z & 8) == 0) {
            return false;
        }
        if (this.f13608A == null) {
            return true;
        }
        if (this.f13610C != null) {
            if (!this.f13610C.onMenuItemActionCollapse(this)) {
                return false;
            }
        }
        return this.f13613a.mo3840d(this);
    }

    /* renamed from: n */
    public boolean m16220n() {
        boolean z = false;
        if ((this.f13638z & 8) == 0) {
            return false;
        }
        if (this.f13608A == null && this.f13609B != null) {
            this.f13608A = this.f13609B.mo3830a((MenuItem) this);
        }
        if (this.f13608A != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    public void m16211e(boolean z) {
        this.f13611D = z;
        this.f13613a.mo4579a(false);
    }

    public boolean isActionViewExpanded() {
        return this.f13611D;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f13610C = onActionExpandListener;
        return this;
    }

    /* renamed from: a */
    public C0372b mo585a(CharSequence charSequence) {
        this.f13630r = charSequence;
        this.f13613a.mo4579a(false);
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f13630r;
    }

    /* renamed from: b */
    public C0372b mo587b(CharSequence charSequence) {
        this.f13631s = charSequence;
        this.f13613a.mo4579a(false);
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f13631s;
    }
}
