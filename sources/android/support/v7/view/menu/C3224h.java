package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.C0389b;
import android.support.v4.p011b.p012a.C0371a;
import android.support.v4.view.C0542b;
import android.support.v7.p020a.C0637a.C0628b;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.h */
public class C3224h implements C0371a {
    /* renamed from: d */
    private static final int[] f13573d = new int[]{1, 4, 5, 3, 2, 0};
    /* renamed from: a */
    CharSequence f13574a;
    /* renamed from: b */
    Drawable f13575b;
    /* renamed from: c */
    View f13576c;
    /* renamed from: e */
    private final Context f13577e;
    /* renamed from: f */
    private final Resources f13578f;
    /* renamed from: g */
    private boolean f13579g;
    /* renamed from: h */
    private boolean f13580h;
    /* renamed from: i */
    private C0723a f13581i;
    /* renamed from: j */
    private ArrayList<C3227j> f13582j;
    /* renamed from: k */
    private ArrayList<C3227j> f13583k;
    /* renamed from: l */
    private boolean f13584l;
    /* renamed from: m */
    private ArrayList<C3227j> f13585m;
    /* renamed from: n */
    private ArrayList<C3227j> f13586n;
    /* renamed from: o */
    private boolean f13587o;
    /* renamed from: p */
    private int f13588p = 0;
    /* renamed from: q */
    private ContextMenuInfo f13589q;
    /* renamed from: r */
    private boolean f13590r = false;
    /* renamed from: s */
    private boolean f13591s = false;
    /* renamed from: t */
    private boolean f13592t = false;
    /* renamed from: u */
    private boolean f13593u = false;
    /* renamed from: v */
    private boolean f13594v = false;
    /* renamed from: w */
    private ArrayList<C3227j> f13595w = new ArrayList();
    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<C0728o>> f13596x = new CopyOnWriteArrayList();
    /* renamed from: y */
    private C3227j f13597y;
    /* renamed from: z */
    private boolean f13598z;

    /* renamed from: android.support.v7.view.menu.h$a */
    public interface C0723a {
        /* renamed from: a */
        void mo101a(C3224h c3224h);

        /* renamed from: a */
        boolean mo102a(C3224h c3224h, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.h$b */
    public interface C0724b {
        /* renamed from: a */
        boolean mo583a(C3227j c3227j);
    }

    /* renamed from: a */
    protected String mo3834a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: p */
    public C3224h mo3841p() {
        return this;
    }

    public C3224h(Context context) {
        this.f13577e = context;
        this.f13578f = context.getResources();
        this.f13582j = new ArrayList();
        this.f13583k = new ArrayList();
        this.f13584l = true;
        this.f13585m = new ArrayList();
        this.f13586n = new ArrayList();
        this.f13587o = true;
        m16135e(true);
    }

    /* renamed from: a */
    public C3224h m16139a(int i) {
        this.f13588p = i;
        return this;
    }

    /* renamed from: a */
    public void m16149a(C0728o c0728o) {
        m16150a(c0728o, this.f13577e);
    }

    /* renamed from: a */
    public void m16150a(C0728o c0728o, Context context) {
        this.f13596x.add(new WeakReference(c0728o));
        c0728o.mo75a(context, this);
        this.f13587o = true;
    }

    /* renamed from: b */
    public void m16160b(C0728o c0728o) {
        Iterator it = this.f13596x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0728o c0728o2 = (C0728o) weakReference.get();
            if (c0728o2 == null || c0728o2 == c0728o) {
                this.f13596x.remove(weakReference);
            }
        }
    }

    /* renamed from: d */
    private void m16133d(boolean z) {
        if (!this.f13596x.isEmpty()) {
            m16175g();
            Iterator it = this.f13596x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0728o c0728o = (C0728o) weakReference.get();
                if (c0728o == null) {
                    this.f13596x.remove(weakReference);
                } else {
                    c0728o.mo79a(z);
                }
            }
            m16176h();
        }
    }

    /* renamed from: a */
    private boolean m16132a(C4465u c4465u, C0728o c0728o) {
        boolean z = false;
        if (this.f13596x.isEmpty()) {
            return false;
        }
        if (c0728o != null) {
            z = c0728o.mo82a(c4465u);
        }
        c0728o = this.f13596x.iterator();
        while (c0728o.hasNext()) {
            WeakReference weakReference = (WeakReference) c0728o.next();
            C0728o c0728o2 = (C0728o) weakReference.get();
            if (c0728o2 == null) {
                this.f13596x.remove(weakReference);
            } else if (!z) {
                z = c0728o2.mo82a(c4465u);
            }
        }
        return z;
    }

    /* renamed from: e */
    private void m16134e(Bundle bundle) {
        if (!this.f13596x.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f13596x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0728o c0728o = (C0728o) weakReference.get();
                if (c0728o == null) {
                    this.f13596x.remove(weakReference);
                } else {
                    int b = c0728o.mo83b();
                    if (b > 0) {
                        Parcelable c = c0728o.mo85c();
                        if (c != null) {
                            sparseArray.put(b, c);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: f */
    private void m16137f(Bundle bundle) {
        bundle = bundle.getSparseParcelableArray("android:menu:presenters");
        if (bundle != null) {
            if (!this.f13596x.isEmpty()) {
                Iterator it = this.f13596x.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C0728o c0728o = (C0728o) weakReference.get();
                    if (c0728o == null) {
                        this.f13596x.remove(weakReference);
                    } else {
                        int b = c0728o.mo83b();
                        if (b > 0) {
                            Parcelable parcelable = (Parcelable) bundle.get(b);
                            if (parcelable != null) {
                                c0728o.mo76a(parcelable);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m16146a(Bundle bundle) {
        m16134e(bundle);
    }

    /* renamed from: b */
    public void m16158b(Bundle bundle) {
        m16137f(bundle);
    }

    /* renamed from: c */
    public void m16164c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C4465u) item.getSubMenu()).m16164c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo3834a(), sparseArray);
        }
    }

    /* renamed from: d */
    public void m16170d(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo3834a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C4465u) item.getSubMenu()).m16170d(bundle);
                }
            }
            bundle = bundle.getInt("android:menu:expandedactionview");
            if (bundle > null) {
                bundle = findItem(bundle);
                if (bundle != null) {
                    bundle.expandActionView();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3835a(C0723a c0723a) {
        this.f13581i = c0723a;
    }

    /* renamed from: a */
    protected MenuItem mo3723a(int i, int i2, int i3, CharSequence charSequence) {
        int f = C3224h.m16136f(i3);
        i = m16129a(i, i2, i3, f, charSequence, this.f13588p);
        if (this.f13589q != 0) {
            i.m16200a(this.f13589q);
        }
        this.f13582j.add(C3224h.m16128a(this.f13582j, f), i);
        mo4579a((boolean) 1);
        return i;
    }

    /* renamed from: a */
    private C3227j m16129a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C3227j(this, i, i2, i3, i4, charSequence, i5);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo3723a(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return mo3723a(0, 0, 0, this.f13578f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo3723a(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo3723a(i, i2, i3, this.f13578f.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f13578f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C3227j c3227j = (C3227j) mo3723a(i, i2, i3, charSequence);
        C4465u c4465u = new C4465u(this.f13577e, this, c3227j);
        c3227j.m16199a(c4465u);
        return c4465u;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f13578f.getString(i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f13577e.getPackageManager();
        int i5 = 0;
        componentName = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = componentName != null ? componentName.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        while (i5 < size) {
            ResolveInfo resolveInfo = (ResolveInfo) componentName.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
            i5++;
        }
        return size;
    }

    public void removeItem(int i) {
        m16131a(m16157b(i), true);
    }

    public void removeGroup(int i) {
        int c = m16163c(i);
        if (c >= 0) {
            int size = this.f13582j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C3227j) this.f13582j.get(c)).getGroupId() != i) {
                    mo4579a((boolean) 1);
                } else {
                    m16131a(c, false);
                    i2 = i3;
                }
            }
            mo4579a((boolean) 1);
        }
    }

    /* renamed from: a */
    private void m16131a(int i, boolean z) {
        if (i >= 0) {
            if (i < this.f13582j.size()) {
                this.f13582j.remove(i);
                if (z) {
                    mo4579a((boolean) 1);
                }
            }
        }
    }

    public void clear() {
        if (this.f13597y != null) {
            mo3840d(this.f13597y);
        }
        this.f13582j.clear();
        mo4579a(true);
    }

    /* renamed from: a */
    void m16151a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f13582j.size();
        m16175g();
        for (int i = 0; i < size; i++) {
            MenuItem menuItem2 = (C3227j) this.f13582j.get(i);
            if (menuItem2.getGroupId() == groupId) {
                if (menuItem2.m16213g()) {
                    if (menuItem2.isCheckable()) {
                        menuItem2.m16204b(menuItem2 == menuItem);
                    }
                }
            }
        }
        m16176h();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f13582j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3227j c3227j = (C3227j) this.f13582j.get(i2);
            if (c3227j.getGroupId() == i) {
                c3227j.m16201a(z2);
                c3227j.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f13582j.size();
        Object obj = null;
        for (int i2 = 0; i2 < size; i2++) {
            C3227j c3227j = (C3227j) this.f13582j.get(i2);
            if (c3227j.getGroupId() == i && c3227j.m16207c(z)) {
                obj = 1;
            }
        }
        if (obj != null) {
            mo4579a(true);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f13582j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3227j c3227j = (C3227j) this.f13582j.get(i2);
            if (c3227j.getGroupId() == i) {
                c3227j.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f13598z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C3227j) this.f13582j.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C3227j c3227j = (C3227j) this.f13582j.get(i2);
            if (c3227j.getItemId() == i) {
                return c3227j;
            }
            if (c3227j.hasSubMenu()) {
                MenuItem findItem = c3227j.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public int m16157b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C3227j) this.f13582j.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public int m16163c(int i) {
        return m16138a(i, 0);
    }

    /* renamed from: a */
    public int m16138a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C3227j) this.f13582j.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int size() {
        return this.f13582j.size();
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f13582j.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m16143a(i, keyEvent) != 0;
    }

    public void setQwertyMode(boolean z) {
        this.f13579g = z;
        mo4579a(false);
    }

    /* renamed from: f */
    private static int m16136f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 < 0 || i2 >= f13573d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (i & 65535) | (f13573d[i2] << 16);
    }

    /* renamed from: b */
    boolean mo3837b() {
        return this.f13579g;
    }

    /* renamed from: e */
    private void m16135e(boolean z) {
        boolean z2 = true;
        if (!z || this.f13578f.getConfiguration().keyboard || !this.f13578f.getBoolean(C0628b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            z2 = false;
        }
        this.f13580h = z2;
    }

    /* renamed from: c */
    public boolean mo3838c() {
        return this.f13580h;
    }

    /* renamed from: d */
    Resources m16168d() {
        return this.f13578f;
    }

    /* renamed from: e */
    public Context m16172e() {
        return this.f13577e;
    }

    /* renamed from: a */
    boolean mo3836a(C3224h c3224h, MenuItem menuItem) {
        return (this.f13581i == null || this.f13581i.mo102a(c3224h, menuItem) == null) ? null : true;
    }

    /* renamed from: f */
    public void m16174f() {
        if (this.f13581i != null) {
            this.f13581i.mo101a(this);
        }
    }

    /* renamed from: a */
    private static int m16128a(ArrayList<C3227j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C3227j) arrayList.get(size)).m16206c() <= i) {
                return size + 1;
            }
        }
        return null;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = m16143a(i, keyEvent);
        i = a != 0 ? m16155a(a, i2) : 0;
        if ((i2 & 2) != null) {
            m16161b(true);
        }
        return i;
    }

    /* renamed from: a */
    void m16152a(List<C3227j> list, int i, KeyEvent keyEvent) {
        boolean b = mo3837b();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f13582j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3227j c3227j = (C3227j) this.f13582j.get(i2);
                if (c3227j.hasSubMenu()) {
                    ((C3224h) c3227j.getSubMenu()).m16152a((List) list, i, keyEvent);
                }
                char alphabeticShortcut = b ? c3227j.getAlphabeticShortcut() : c3227j.getNumericShortcut();
                if (!(((modifiers & 69647) == ((b ? c3227j.getAlphabeticModifiers() : c3227j.getNumericModifiers()) & 69647) ? 1 : null) == null || alphabeticShortcut == '\u0000' || ((alphabeticShortcut != keyData.meta[0] && alphabeticShortcut != keyData.meta[2] && (!b || alphabeticShortcut != '\b' || i != 67)) || !c3227j.isEnabled()))) {
                    list.add(c3227j);
                }
            }
        }
    }

    /* renamed from: a */
    C3227j m16143a(int i, KeyEvent keyEvent) {
        List list = this.f13595w;
        list.clear();
        m16152a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        keyEvent = list.size();
        if (keyEvent == 1) {
            return (C3227j) list.get(0);
        }
        boolean b = mo3837b();
        for (int i2 = 0; i2 < keyEvent; i2++) {
            char alphabeticShortcut;
            C3227j c3227j = (C3227j) list.get(i2);
            if (b) {
                alphabeticShortcut = c3227j.getAlphabeticShortcut();
            } else {
                alphabeticShortcut = c3227j.getNumericShortcut();
            }
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (b && alphabeticShortcut == '\b' && i == 67))) {
                return c3227j;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return m16155a(findItem(i), i2);
    }

    /* renamed from: a */
    public boolean m16155a(MenuItem menuItem, int i) {
        return m16156a(menuItem, null, i);
    }

    /* renamed from: a */
    public boolean m16156a(MenuItem menuItem, C0728o c0728o, int i) {
        C3227j c3227j = (C3227j) menuItem;
        if (c3227j != null) {
            if (c3227j.isEnabled()) {
                boolean b = c3227j.m16205b();
                C0542b a = c3227j.mo586a();
                Object obj = (a == null || !a.mo613e()) ? null : 1;
                if (c3227j.m16220n()) {
                    b |= c3227j.expandActionView();
                    if (b) {
                        m16161b(true);
                    }
                } else {
                    if (!c3227j.hasSubMenu()) {
                        if (obj == null) {
                            if ((i & 1) == null) {
                                m16161b(true);
                            }
                        }
                    }
                    if ((i & 4) == 0) {
                        m16161b(false);
                    }
                    if (c3227j.hasSubMenu() == 0) {
                        c3227j.m16199a(new C4465u(m16172e(), this, c3227j));
                    }
                    C4465u c4465u = (C4465u) c3227j.getSubMenu();
                    if (obj != null) {
                        a.mo611a((SubMenu) c4465u);
                    }
                    b |= m16132a(c4465u, c0728o);
                    if (!b) {
                        m16161b(true);
                    }
                }
                return b;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m16161b(boolean z) {
        if (!this.f13594v) {
            this.f13594v = true;
            Iterator it = this.f13596x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0728o c0728o = (C0728o) weakReference.get();
                if (c0728o == null) {
                    this.f13596x.remove(weakReference);
                } else {
                    c0728o.mo77a(this, z);
                }
            }
            this.f13594v = false;
        }
    }

    public void close() {
        m16161b(true);
    }

    /* renamed from: a */
    public void mo4579a(boolean z) {
        if (this.f13590r) {
            this.f13591s = true;
            if (z) {
                this.f13592t = true;
                return;
            }
            return;
        }
        if (z) {
            this.f13584l = true;
            this.f13587o = true;
        }
        m16133d(z);
    }

    /* renamed from: g */
    public void m16175g() {
        if (!this.f13590r) {
            this.f13590r = true;
            this.f13591s = false;
            this.f13592t = false;
        }
    }

    /* renamed from: h */
    public void m16176h() {
        this.f13590r = false;
        if (this.f13591s) {
            this.f13591s = false;
            mo4579a(this.f13592t);
        }
    }

    /* renamed from: a */
    void m16148a(C3227j c3227j) {
        this.f13584l = true;
        mo4579a(true);
    }

    /* renamed from: b */
    void m16159b(C3227j c3227j) {
        this.f13587o = true;
        mo4579a(true);
    }

    /* renamed from: i */
    public ArrayList<C3227j> m16177i() {
        if (!this.f13584l) {
            return this.f13583k;
        }
        this.f13583k.clear();
        int size = this.f13582j.size();
        for (int i = 0; i < size; i++) {
            C3227j c3227j = (C3227j) this.f13582j.get(i);
            if (c3227j.isVisible()) {
                this.f13583k.add(c3227j);
            }
        }
        this.f13584l = false;
        this.f13587o = true;
        return this.f13583k;
    }

    /* renamed from: j */
    public void m16178j() {
        ArrayList i = m16177i();
        if (this.f13587o) {
            Iterator it = this.f13596x.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0728o c0728o = (C0728o) weakReference.get();
                if (c0728o == null) {
                    this.f13596x.remove(weakReference);
                } else {
                    i2 |= c0728o.mo80a();
                }
            }
            if (i2 != 0) {
                this.f13585m.clear();
                this.f13586n.clear();
                int size = i.size();
                for (i2 = 0; i2 < size; i2++) {
                    C3227j c3227j = (C3227j) i.get(i2);
                    if (c3227j.m16216j()) {
                        this.f13585m.add(c3227j);
                    } else {
                        this.f13586n.add(c3227j);
                    }
                }
            } else {
                this.f13585m.clear();
                this.f13586n.clear();
                this.f13586n.addAll(m16177i());
            }
            this.f13587o = false;
        }
    }

    /* renamed from: k */
    public ArrayList<C3227j> m16179k() {
        m16178j();
        return this.f13585m;
    }

    /* renamed from: l */
    public ArrayList<C3227j> m16180l() {
        m16178j();
        return this.f13586n;
    }

    public void clearHeader() {
        this.f13575b = null;
        this.f13574a = null;
        this.f13576c = null;
        mo4579a(false);
    }

    /* renamed from: a */
    private void m16130a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d = m16168d();
        if (view != null) {
            this.f13576c = view;
            this.f13574a = null;
            this.f13575b = null;
        } else {
            if (i > 0) {
                this.f13574a = d.getText(i);
            } else if (charSequence != null) {
                this.f13574a = charSequence;
            }
            if (i2 > 0) {
                this.f13575b = C0389b.m1429a(m16172e(), i2);
            } else if (drawable != null) {
                this.f13575b = drawable;
            }
            this.f13576c = null;
        }
        mo4579a((boolean) 0);
    }

    /* renamed from: a */
    protected C3224h m16142a(CharSequence charSequence) {
        m16130a(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: d */
    protected C3224h m16169d(int i) {
        m16130a(i, null, 0, null, null);
        return this;
    }

    /* renamed from: a */
    protected C3224h m16140a(Drawable drawable) {
        m16130a(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: e */
    protected C3224h m16173e(int i) {
        m16130a(0, null, i, null, null);
        return this;
    }

    /* renamed from: a */
    protected C3224h m16141a(View view) {
        m16130a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: m */
    public CharSequence m16181m() {
        return this.f13574a;
    }

    /* renamed from: n */
    public Drawable m16182n() {
        return this.f13575b;
    }

    /* renamed from: o */
    public View m16183o() {
        return this.f13576c;
    }

    /* renamed from: q */
    boolean m16185q() {
        return this.f13593u;
    }

    /* renamed from: c */
    public boolean mo3839c(C3227j c3227j) {
        boolean z = false;
        if (this.f13596x.isEmpty()) {
            return false;
        }
        m16175g();
        Iterator it = this.f13596x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0728o c0728o = (C0728o) weakReference.get();
            if (c0728o == null) {
                this.f13596x.remove(weakReference);
            } else {
                z = c0728o.mo81a(this, c3227j);
                if (z) {
                    break;
                }
            }
        }
        m16176h();
        if (z) {
            this.f13597y = c3227j;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo3840d(C3227j c3227j) {
        boolean z = false;
        if (!this.f13596x.isEmpty()) {
            if (this.f13597y == c3227j) {
                m16175g();
                Iterator it = this.f13596x.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C0728o c0728o = (C0728o) weakReference.get();
                    if (c0728o == null) {
                        this.f13596x.remove(weakReference);
                    } else {
                        z = c0728o.mo84b(this, c3227j);
                        if (z) {
                            break;
                        }
                    }
                }
                m16176h();
                if (z) {
                    this.f13597y = null;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: r */
    public C3227j m16186r() {
        return this.f13597y;
    }

    /* renamed from: c */
    public void m16165c(boolean z) {
        this.f13598z = z;
    }
}
