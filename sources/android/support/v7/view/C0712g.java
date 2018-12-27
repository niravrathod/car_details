package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.support.v4.p011b.p012a.C0371a;
import android.support.v4.view.C0542b;
import android.support.v4.view.C0548f;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.view.menu.C3227j;
import android.support.v7.view.menu.C4461k;
import android.support.v7.widget.C0885y;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.view.g */
public class C0712g extends MenuInflater {
    /* renamed from: a */
    static final Class<?>[] f2289a = new Class[]{Context.class};
    /* renamed from: b */
    static final Class<?>[] f2290b = f2289a;
    /* renamed from: c */
    final Object[] f2291c;
    /* renamed from: d */
    final Object[] f2292d = this.f2291c;
    /* renamed from: e */
    Context f2293e;
    /* renamed from: f */
    private Object f2294f;

    /* renamed from: android.support.v7.view.g$a */
    private static class C0710a implements OnMenuItemClickListener {
        /* renamed from: a */
        private static final Class<?>[] f2254a = new Class[]{MenuItem.class};
        /* renamed from: b */
        private Object f2255b;
        /* renamed from: c */
        private Method f2256c;

        public C0710a(Object obj, String str) {
            this.f2255b = obj;
            obj = obj.getClass();
            try {
                this.f2256c = obj.getMethod(str, f2254a);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't resolve menu item onClick handler ");
                stringBuilder.append(str);
                stringBuilder.append(" in class ");
                stringBuilder.append(obj.getName());
                InflateException inflateException = new InflateException(stringBuilder.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2256c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2256c.invoke(this.f2255b, new Object[]{menuItem})).booleanValue();
                }
                this.f2256c.invoke(this.f2255b, new Object[]{menuItem});
                return true;
            } catch (MenuItem menuItem2) {
                throw new RuntimeException(menuItem2);
            }
        }
    }

    /* renamed from: android.support.v7.view.g$b */
    private class C0711b {
        /* renamed from: A */
        private String f2257A;
        /* renamed from: B */
        private String f2258B;
        /* renamed from: C */
        private CharSequence f2259C;
        /* renamed from: D */
        private CharSequence f2260D;
        /* renamed from: E */
        private ColorStateList f2261E = null;
        /* renamed from: F */
        private Mode f2262F = null;
        /* renamed from: a */
        C0542b f2263a;
        /* renamed from: b */
        final /* synthetic */ C0712g f2264b;
        /* renamed from: c */
        private Menu f2265c;
        /* renamed from: d */
        private int f2266d;
        /* renamed from: e */
        private int f2267e;
        /* renamed from: f */
        private int f2268f;
        /* renamed from: g */
        private int f2269g;
        /* renamed from: h */
        private boolean f2270h;
        /* renamed from: i */
        private boolean f2271i;
        /* renamed from: j */
        private boolean f2272j;
        /* renamed from: k */
        private int f2273k;
        /* renamed from: l */
        private int f2274l;
        /* renamed from: m */
        private CharSequence f2275m;
        /* renamed from: n */
        private CharSequence f2276n;
        /* renamed from: o */
        private int f2277o;
        /* renamed from: p */
        private char f2278p;
        /* renamed from: q */
        private int f2279q;
        /* renamed from: r */
        private char f2280r;
        /* renamed from: s */
        private int f2281s;
        /* renamed from: t */
        private int f2282t;
        /* renamed from: u */
        private boolean f2283u;
        /* renamed from: v */
        private boolean f2284v;
        /* renamed from: w */
        private boolean f2285w;
        /* renamed from: x */
        private int f2286x;
        /* renamed from: y */
        private int f2287y;
        /* renamed from: z */
        private String f2288z;

        public C0711b(C0712g c0712g, Menu menu) {
            this.f2264b = c0712g;
            this.f2265c = menu;
            m2792a();
        }

        /* renamed from: a */
        public void m2792a() {
            this.f2266d = 0;
            this.f2267e = 0;
            this.f2268f = 0;
            this.f2269g = 0;
            this.f2270h = true;
            this.f2271i = true;
        }

        /* renamed from: a */
        public void m2793a(AttributeSet attributeSet) {
            attributeSet = this.f2264b.f2293e.obtainStyledAttributes(attributeSet, C0636j.MenuGroup);
            this.f2266d = attributeSet.getResourceId(C0636j.MenuGroup_android_id, 0);
            this.f2267e = attributeSet.getInt(C0636j.MenuGroup_android_menuCategory, 0);
            this.f2268f = attributeSet.getInt(C0636j.MenuGroup_android_orderInCategory, 0);
            this.f2269g = attributeSet.getInt(C0636j.MenuGroup_android_checkableBehavior, 0);
            this.f2270h = attributeSet.getBoolean(C0636j.MenuGroup_android_visible, true);
            this.f2271i = attributeSet.getBoolean(C0636j.MenuGroup_android_enabled, true);
            attributeSet.recycle();
        }

        /* renamed from: b */
        public void m2795b(AttributeSet attributeSet) {
            attributeSet = this.f2264b.f2293e.obtainStyledAttributes(attributeSet, C0636j.MenuItem);
            this.f2273k = attributeSet.getResourceId(C0636j.MenuItem_android_id, 0);
            this.f2274l = (attributeSet.getInt(C0636j.MenuItem_android_menuCategory, this.f2267e) & -65536) | (attributeSet.getInt(C0636j.MenuItem_android_orderInCategory, this.f2268f) & 65535);
            this.f2275m = attributeSet.getText(C0636j.MenuItem_android_title);
            this.f2276n = attributeSet.getText(C0636j.MenuItem_android_titleCondensed);
            this.f2277o = attributeSet.getResourceId(C0636j.MenuItem_android_icon, 0);
            this.f2278p = m2789a(attributeSet.getString(C0636j.MenuItem_android_alphabeticShortcut));
            this.f2279q = attributeSet.getInt(C0636j.MenuItem_alphabeticModifiers, 4096);
            this.f2280r = m2789a(attributeSet.getString(C0636j.MenuItem_android_numericShortcut));
            this.f2281s = attributeSet.getInt(C0636j.MenuItem_numericModifiers, 4096);
            if (attributeSet.hasValue(C0636j.MenuItem_android_checkable)) {
                this.f2282t = attributeSet.getBoolean(C0636j.MenuItem_android_checkable, false);
            } else {
                this.f2282t = this.f2269g;
            }
            this.f2283u = attributeSet.getBoolean(C0636j.MenuItem_android_checked, false);
            this.f2284v = attributeSet.getBoolean(C0636j.MenuItem_android_visible, this.f2270h);
            this.f2285w = attributeSet.getBoolean(C0636j.MenuItem_android_enabled, this.f2271i);
            this.f2286x = attributeSet.getInt(C0636j.MenuItem_showAsAction, -1);
            this.f2258B = attributeSet.getString(C0636j.MenuItem_android_onClick);
            this.f2287y = attributeSet.getResourceId(C0636j.MenuItem_actionLayout, 0);
            this.f2288z = attributeSet.getString(C0636j.MenuItem_actionViewClass);
            this.f2257A = attributeSet.getString(C0636j.MenuItem_actionProviderClass);
            Object obj = this.f2257A != null ? 1 : null;
            if (obj != null && this.f2287y == 0 && this.f2288z == null) {
                this.f2263a = (C0542b) m2790a(this.f2257A, C0712g.f2290b, this.f2264b.f2292d);
            } else {
                if (obj != null) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f2263a = null;
            }
            this.f2259C = attributeSet.getText(C0636j.MenuItem_contentDescription);
            this.f2260D = attributeSet.getText(C0636j.MenuItem_tooltipText);
            if (attributeSet.hasValue(C0636j.MenuItem_iconTintMode)) {
                this.f2262F = C0885y.m3861a(attributeSet.getInt(C0636j.MenuItem_iconTintMode, -1), this.f2262F);
            } else {
                this.f2262F = null;
            }
            if (attributeSet.hasValue(C0636j.MenuItem_iconTint)) {
                this.f2261E = attributeSet.getColorStateList(C0636j.MenuItem_iconTint);
            } else {
                this.f2261E = null;
            }
            attributeSet.recycle();
            this.f2272j = false;
        }

        /* renamed from: a */
        private char m2789a(String str) {
            return str == null ? '\u0000' : str.charAt(0);
        }

        /* renamed from: a */
        private void m2791a(MenuItem menuItem) {
            Object obj = null;
            menuItem.setChecked(this.f2283u).setVisible(this.f2284v).setEnabled(this.f2285w).setCheckable(this.f2282t >= 1).setTitleCondensed(this.f2276n).setIcon(this.f2277o);
            if (this.f2286x >= 0) {
                menuItem.setShowAsAction(this.f2286x);
            }
            if (this.f2258B != null) {
                if (this.f2264b.f2293e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new C0710a(this.f2264b.m2800a(), this.f2258B));
            }
            boolean z = menuItem instanceof C3227j;
            if (z) {
                C3227j c3227j = (C3227j) menuItem;
            }
            if (this.f2282t >= 2) {
                if (z) {
                    ((C3227j) menuItem).m16201a(true);
                } else if (menuItem instanceof C4461k) {
                    ((C4461k) menuItem).m24458a(true);
                }
            }
            if (this.f2288z != null) {
                menuItem.setActionView((View) m2790a(this.f2288z, C0712g.f2289a, this.f2264b.f2291c));
                obj = 1;
            }
            if (this.f2287y > 0) {
                if (obj == null) {
                    menuItem.setActionView(this.f2287y);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.f2263a != null) {
                C0548f.m2053a(menuItem, this.f2263a);
            }
            C0548f.m2057a(menuItem, this.f2259C);
            C0548f.m2059b(menuItem, this.f2260D);
            C0548f.m2058b(menuItem, this.f2278p, this.f2279q);
            C0548f.m2054a(menuItem, this.f2280r, this.f2281s);
            if (this.f2262F != null) {
                C0548f.m2056a(menuItem, this.f2262F);
            }
            if (this.f2261E != null) {
                C0548f.m2055a(menuItem, this.f2261E);
            }
        }

        /* renamed from: b */
        public void m2794b() {
            this.f2272j = true;
            m2791a(this.f2265c.add(this.f2266d, this.f2273k, this.f2274l, this.f2275m));
        }

        /* renamed from: c */
        public SubMenu m2796c() {
            this.f2272j = true;
            SubMenu addSubMenu = this.f2265c.addSubMenu(this.f2266d, this.f2273k, this.f2274l, this.f2275m);
            m2791a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m2797d() {
            return this.f2272j;
        }

        /* renamed from: a */
        private <T> T m2790a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                clsArr = this.f2264b.f2293e.getClassLoader().loadClass(str).getConstructor(clsArr);
                clsArr.setAccessible(true);
                return clsArr.newInstance(objArr);
            } catch (Class<?>[] clsArr2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot instantiate class: ");
                stringBuilder.append(str);
                Log.w("SupportMenuInflater", stringBuilder.toString(), clsArr2);
                return null;
            }
        }
    }

    public C0712g(Context context) {
        super(context);
        this.f2293e = context;
        this.f2291c = new Object[]{context};
    }

    public void inflate(int i, Menu menu) {
        if (menu instanceof C0371a) {
            XmlResourceParser xmlResourceParser = null;
            try {
                i = this.f2293e.getResources().getLayout(i);
                try {
                    m2799a(i, Xml.asAttributeSet(i), menu);
                    if (i != 0) {
                        i.close();
                    }
                    return;
                } catch (XmlPullParserException e) {
                    menu = e;
                    Object obj = i;
                    throw new InflateException("Error inflating menu XML", menu);
                } catch (IOException e2) {
                    menu = e2;
                    xmlResourceParser = i;
                    throw new InflateException("Error inflating menu XML", menu);
                } catch (Throwable th) {
                    menu = th;
                    xmlResourceParser = i;
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    throw menu;
                }
            } catch (XmlPullParserException e3) {
                menu = e3;
                throw new InflateException("Error inflating menu XML", menu);
            } catch (IOException e4) {
                menu = e4;
                throw new InflateException("Error inflating menu XML", menu);
            } catch (Throwable th2) {
                menu = th2;
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw menu;
            }
        }
        super.inflate(i, menu);
    }

    /* renamed from: a */
    private void m2799a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0711b c0711b = new C0711b(this, menu);
        menu = xmlPullParser.getEventType();
        while (menu != 2) {
            menu = xmlPullParser.next();
            if (menu == 1) {
                break;
            }
        }
        menu = xmlPullParser.getName();
        if (menu.equals("menu")) {
            menu = xmlPullParser.next();
            int i = menu;
            Object obj = null;
            menu = null;
            Object obj2 = null;
            while (menu == null) {
                String name;
                switch (i) {
                    case 1:
                        throw new RuntimeException("Unexpected end of document");
                    case 2:
                        if (obj2 == null) {
                            name = xmlPullParser.getName();
                            if (!name.equals("group")) {
                                if (!name.equals("item")) {
                                    if (!name.equals("menu")) {
                                        obj = name;
                                        obj2 = 1;
                                        break;
                                    }
                                    m2799a(xmlPullParser, attributeSet, c0711b.m2796c());
                                    break;
                                }
                                c0711b.m2795b(attributeSet);
                                break;
                            }
                            c0711b.m2793a(attributeSet);
                            break;
                        }
                        break;
                    case 3:
                        name = xmlPullParser.getName();
                        if (obj2 == null || !name.equals(r6)) {
                            if (!name.equals("group")) {
                                if (!name.equals("item")) {
                                    if (!name.equals("menu")) {
                                        break;
                                    }
                                    menu = true;
                                    break;
                                } else if (!c0711b.m2797d()) {
                                    if (c0711b.f2263a != null && c0711b.f2263a.mo613e()) {
                                        c0711b.m2796c();
                                        break;
                                    } else {
                                        c0711b.m2794b();
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            c0711b.m2792a();
                            break;
                        }
                        obj = null;
                        obj2 = null;
                        break;
                    default:
                        break;
                }
                i = xmlPullParser.next();
            }
            return;
        }
        attributeSet = new StringBuilder();
        attributeSet.append("Expecting menu, got ");
        attributeSet.append(menu);
        throw new RuntimeException(attributeSet.toString());
    }

    /* renamed from: a */
    Object m2800a() {
        if (this.f2294f == null) {
            this.f2294f = m2798a(this.f2293e);
        }
        return this.f2294f;
    }

    /* renamed from: a */
    private Object m2798a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m2798a(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
