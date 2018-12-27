package android.support.v4.view.p018a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.google.android.gms.ads.AdRequest;

/* renamed from: android.support.v4.view.a.b */
public class C0532b {
    /* renamed from: a */
    public int f1734a = -1;
    /* renamed from: b */
    private final AccessibilityNodeInfo f1735b;

    /* renamed from: android.support.v4.view.a.b$a */
    public static class C0529a {
        /* renamed from: A */
        public static final C0529a f1701A = new C0529a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null);
        /* renamed from: B */
        public static final C0529a f1702B = new C0529a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null);
        /* renamed from: C */
        public static final C0529a f1703C = new C0529a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null);
        /* renamed from: D */
        public static final C0529a f1704D;
        /* renamed from: a */
        public static final C0529a f1705a = new C0529a(1, null);
        /* renamed from: b */
        public static final C0529a f1706b = new C0529a(2, null);
        /* renamed from: c */
        public static final C0529a f1707c = new C0529a(4, null);
        /* renamed from: d */
        public static final C0529a f1708d = new C0529a(8, null);
        /* renamed from: e */
        public static final C0529a f1709e = new C0529a(16, null);
        /* renamed from: f */
        public static final C0529a f1710f = new C0529a(32, null);
        /* renamed from: g */
        public static final C0529a f1711g = new C0529a(64, null);
        /* renamed from: h */
        public static final C0529a f1712h = new C0529a(128, null);
        /* renamed from: i */
        public static final C0529a f1713i = new C0529a(256, null);
        /* renamed from: j */
        public static final C0529a f1714j = new C0529a(AdRequest.MAX_CONTENT_URL_LENGTH, null);
        /* renamed from: k */
        public static final C0529a f1715k = new C0529a(1024, null);
        /* renamed from: l */
        public static final C0529a f1716l = new C0529a(2048, null);
        /* renamed from: m */
        public static final C0529a f1717m = new C0529a(4096, null);
        /* renamed from: n */
        public static final C0529a f1718n = new C0529a(8192, null);
        /* renamed from: o */
        public static final C0529a f1719o = new C0529a(16384, null);
        /* renamed from: p */
        public static final C0529a f1720p = new C0529a(32768, null);
        /* renamed from: q */
        public static final C0529a f1721q = new C0529a(65536, null);
        /* renamed from: r */
        public static final C0529a f1722r = new C0529a(131072, null);
        /* renamed from: s */
        public static final C0529a f1723s = new C0529a(262144, null);
        /* renamed from: t */
        public static final C0529a f1724t = new C0529a(524288, null);
        /* renamed from: u */
        public static final C0529a f1725u = new C0529a(1048576, null);
        /* renamed from: v */
        public static final C0529a f1726v = new C0529a(2097152, null);
        /* renamed from: w */
        public static final C0529a f1727w = new C0529a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);
        /* renamed from: x */
        public static final C0529a f1728x = new C0529a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);
        /* renamed from: y */
        public static final C0529a f1729y = new C0529a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null);
        /* renamed from: z */
        public static final C0529a f1730z = new C0529a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null);
        /* renamed from: E */
        final Object f1731E;

        static {
            Object obj = null;
            if (VERSION.SDK_INT >= 24) {
                obj = AccessibilityAction.ACTION_SET_PROGRESS;
            }
            f1704D = new C0529a(obj);
        }

        public C0529a(int i, CharSequence charSequence) {
            this(VERSION.SDK_INT >= 21 ? new AccessibilityAction(i, charSequence) : null);
        }

        C0529a(Object obj) {
            this.f1731E = obj;
        }
    }

    /* renamed from: android.support.v4.view.a.b$b */
    public static class C0530b {
        /* renamed from: a */
        final Object f1732a;

        /* renamed from: a */
        public static C0530b m1948a(int i, int i2, boolean z, int i3) {
            if (VERSION.SDK_INT >= 21) {
                return new C0530b(CollectionInfo.obtain(i, i2, z, i3));
            }
            if (VERSION.SDK_INT >= 19) {
                return new C0530b(CollectionInfo.obtain(i, i2, z));
            }
            return new C0530b(0);
        }

        C0530b(Object obj) {
            this.f1732a = obj;
        }
    }

    /* renamed from: android.support.v4.view.a.b$c */
    public static class C0531c {
        /* renamed from: a */
        final Object f1733a;

        /* renamed from: a */
        public static C0531c m1949a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            if (VERSION.SDK_INT >= 21) {
                return new C0531c(CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (VERSION.SDK_INT >= true) {
                return new C0531c(CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C0531c(0);
        }

        C0531c(Object obj) {
            this.f1733a = obj;
        }
    }

    /* renamed from: c */
    private static String m1952c(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case AdRequest.MAX_CONTENT_URL_LENGTH /*512*/:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    private C0532b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1735b = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0532b m1951a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0532b(accessibilityNodeInfo);
    }

    /* renamed from: a */
    public AccessibilityNodeInfo m1953a() {
        return this.f1735b;
    }

    /* renamed from: a */
    public static C0532b m1950a(C0532b c0532b) {
        return C0532b.m1951a(AccessibilityNodeInfo.obtain(c0532b.f1735b));
    }

    /* renamed from: a */
    public void m1956a(View view) {
        this.f1735b.setSource(view);
    }

    /* renamed from: b */
    public void m1964b(View view) {
        this.f1735b.addChild(view);
    }

    /* renamed from: b */
    public int m1961b() {
        return this.f1735b.getActions();
    }

    /* renamed from: a */
    public void m1954a(int i) {
        this.f1735b.addAction(i);
    }

    /* renamed from: a */
    public boolean m1960a(C0529a c0529a) {
        return VERSION.SDK_INT >= 21 ? this.f1735b.removeAction((AccessibilityAction) c0529a.f1731E) : null;
    }

    /* renamed from: b */
    public void m1962b(int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f1735b.setMovementGranularities(i);
        }
    }

    /* renamed from: c */
    public int m1968c() {
        return VERSION.SDK_INT >= 16 ? this.f1735b.getMovementGranularities() : 0;
    }

    /* renamed from: c */
    public void m1970c(View view) {
        this.f1735b.setParent(view);
    }

    /* renamed from: a */
    public void m1955a(Rect rect) {
        this.f1735b.getBoundsInParent(rect);
    }

    /* renamed from: b */
    public void m1963b(Rect rect) {
        this.f1735b.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public void m1969c(Rect rect) {
        this.f1735b.getBoundsInScreen(rect);
    }

    /* renamed from: d */
    public void m1973d(Rect rect) {
        this.f1735b.setBoundsInScreen(rect);
    }

    /* renamed from: d */
    public boolean m1977d() {
        return this.f1735b.isCheckable();
    }

    /* renamed from: a */
    public void m1959a(boolean z) {
        this.f1735b.setCheckable(z);
    }

    /* renamed from: e */
    public boolean m1980e() {
        return this.f1735b.isChecked();
    }

    /* renamed from: b */
    public void m1967b(boolean z) {
        this.f1735b.setChecked(z);
    }

    /* renamed from: f */
    public boolean m1982f() {
        return this.f1735b.isFocusable();
    }

    /* renamed from: c */
    public void m1972c(boolean z) {
        this.f1735b.setFocusable(z);
    }

    /* renamed from: g */
    public boolean m1984g() {
        return this.f1735b.isFocused();
    }

    /* renamed from: d */
    public void m1976d(boolean z) {
        this.f1735b.setFocused(z);
    }

    /* renamed from: h */
    public boolean m1986h() {
        return VERSION.SDK_INT >= 16 ? this.f1735b.isVisibleToUser() : false;
    }

    /* renamed from: e */
    public void m1979e(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f1735b.setVisibleToUser(z);
        }
    }

    /* renamed from: i */
    public boolean m1988i() {
        return VERSION.SDK_INT >= 16 ? this.f1735b.isAccessibilityFocused() : false;
    }

    /* renamed from: f */
    public void m1981f(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f1735b.setAccessibilityFocused(z);
        }
    }

    /* renamed from: j */
    public boolean m1990j() {
        return this.f1735b.isSelected();
    }

    /* renamed from: g */
    public void m1983g(boolean z) {
        this.f1735b.setSelected(z);
    }

    /* renamed from: k */
    public boolean m1992k() {
        return this.f1735b.isClickable();
    }

    /* renamed from: h */
    public void m1985h(boolean z) {
        this.f1735b.setClickable(z);
    }

    /* renamed from: l */
    public boolean m1994l() {
        return this.f1735b.isLongClickable();
    }

    /* renamed from: i */
    public void m1987i(boolean z) {
        this.f1735b.setLongClickable(z);
    }

    /* renamed from: m */
    public boolean m1996m() {
        return this.f1735b.isEnabled();
    }

    /* renamed from: j */
    public void m1989j(boolean z) {
        this.f1735b.setEnabled(z);
    }

    /* renamed from: n */
    public boolean m1997n() {
        return this.f1735b.isPassword();
    }

    /* renamed from: o */
    public boolean m1998o() {
        return this.f1735b.isScrollable();
    }

    /* renamed from: k */
    public void m1991k(boolean z) {
        this.f1735b.setScrollable(z);
    }

    /* renamed from: p */
    public CharSequence m1999p() {
        return this.f1735b.getPackageName();
    }

    /* renamed from: a */
    public void m1957a(CharSequence charSequence) {
        this.f1735b.setPackageName(charSequence);
    }

    /* renamed from: q */
    public CharSequence m2000q() {
        return this.f1735b.getClassName();
    }

    /* renamed from: b */
    public void m1965b(CharSequence charSequence) {
        this.f1735b.setClassName(charSequence);
    }

    /* renamed from: r */
    public CharSequence m2001r() {
        return this.f1735b.getText();
    }

    /* renamed from: c */
    public void m1971c(CharSequence charSequence) {
        this.f1735b.setText(charSequence);
    }

    /* renamed from: s */
    public CharSequence m2002s() {
        return this.f1735b.getContentDescription();
    }

    /* renamed from: d */
    public void m1975d(CharSequence charSequence) {
        this.f1735b.setContentDescription(charSequence);
    }

    /* renamed from: t */
    public void m2003t() {
        this.f1735b.recycle();
    }

    /* renamed from: u */
    public String m2004u() {
        return VERSION.SDK_INT >= 18 ? this.f1735b.getViewIdResourceName() : null;
    }

    /* renamed from: a */
    public void m1958a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f1735b.setCollectionInfo((CollectionInfo) ((C0530b) obj).f1732a);
        }
    }

    /* renamed from: b */
    public void m1966b(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f1735b.setCollectionItemInfo((CollectionItemInfo) ((C0531c) obj).f1733a);
        }
    }

    /* renamed from: l */
    public void m1993l(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f1735b.setContentInvalid(z);
        }
    }

    /* renamed from: e */
    public void m1978e(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 21) {
            this.f1735b.setError(charSequence);
        }
    }

    /* renamed from: d */
    public void m1974d(View view) {
        if (VERSION.SDK_INT >= 17) {
            this.f1735b.setLabelFor(view);
        }
    }

    /* renamed from: m */
    public void m1995m(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f1735b.setCanOpenPopup(z);
        }
    }

    public int hashCode() {
        return this.f1735b == null ? 0 : this.f1735b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0532b c0532b = (C0532b) obj;
        if (this.f1735b == null) {
            if (c0532b.f1735b != null) {
                return false;
            }
        } else if (this.f1735b.equals(c0532b.f1735b) == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m1955a(rect);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInParent: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        m1969c(rect);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInScreen: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(m1999p());
        stringBuilder.append("; className: ");
        stringBuilder.append(m2000q());
        stringBuilder.append("; text: ");
        stringBuilder.append(m2001r());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(m2002s());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(m2004u());
        stringBuilder.append("; checkable: ");
        stringBuilder.append(m1977d());
        stringBuilder.append("; checked: ");
        stringBuilder.append(m1980e());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(m1982f());
        stringBuilder.append("; focused: ");
        stringBuilder.append(m1984g());
        stringBuilder.append("; selected: ");
        stringBuilder.append(m1990j());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(m1992k());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(m1994l());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(m1996m());
        stringBuilder.append("; password: ");
        stringBuilder.append(m1997n());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("; scrollable: ");
        stringBuilder3.append(m1998o());
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append("; [");
        int b = m1961b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ -1;
            stringBuilder.append(C0532b.m1952c(numberOfTrailingZeros));
            if (b != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
