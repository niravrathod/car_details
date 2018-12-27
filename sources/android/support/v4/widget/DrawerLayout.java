package android.support.v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.content.C0389b;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0536a;
import android.support.v4.view.C0543c;
import android.support.v4.view.C0560r;
import android.support.v4.view.p018a.C0532b;
import android.support.v4.view.p018a.C0532b.C0529a;
import android.support.v4.widget.C0625r.C0624a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    /* renamed from: a */
    static final int[] f1803a = new int[]{16842931};
    /* renamed from: b */
    static final boolean f1804b = (VERSION.SDK_INT >= 19);
    /* renamed from: c */
    private static final int[] f1805c = new int[]{16843828};
    /* renamed from: d */
    private static final boolean f1806d;
    /* renamed from: A */
    private float f1807A;
    /* renamed from: B */
    private Drawable f1808B;
    /* renamed from: C */
    private Drawable f1809C;
    /* renamed from: D */
    private Drawable f1810D;
    /* renamed from: E */
    private CharSequence f1811E;
    /* renamed from: F */
    private CharSequence f1812F;
    /* renamed from: G */
    private Object f1813G;
    /* renamed from: H */
    private boolean f1814H;
    /* renamed from: I */
    private Drawable f1815I;
    /* renamed from: J */
    private Drawable f1816J;
    /* renamed from: K */
    private Drawable f1817K;
    /* renamed from: L */
    private Drawable f1818L;
    /* renamed from: M */
    private final ArrayList<View> f1819M;
    /* renamed from: e */
    private final C3175b f1820e;
    /* renamed from: f */
    private float f1821f;
    /* renamed from: g */
    private int f1822g;
    /* renamed from: h */
    private int f1823h;
    /* renamed from: i */
    private float f1824i;
    /* renamed from: j */
    private Paint f1825j;
    /* renamed from: k */
    private final C0625r f1826k;
    /* renamed from: l */
    private final C0625r f1827l;
    /* renamed from: m */
    private final C3176d f1828m;
    /* renamed from: n */
    private final C3176d f1829n;
    /* renamed from: o */
    private int f1830o;
    /* renamed from: p */
    private boolean f1831p;
    /* renamed from: q */
    private boolean f1832q;
    /* renamed from: r */
    private int f1833r;
    /* renamed from: s */
    private int f1834s;
    /* renamed from: t */
    private int f1835t;
    /* renamed from: u */
    private int f1836u;
    /* renamed from: v */
    private boolean f1837v;
    /* renamed from: w */
    private boolean f1838w;
    /* renamed from: x */
    private C0576c f1839x;
    /* renamed from: y */
    private List<C0576c> f1840y;
    /* renamed from: z */
    private float f1841z;

    /* renamed from: android.support.v4.widget.DrawerLayout$1 */
    class C05741 implements OnApplyWindowInsetsListener {
        /* renamed from: a */
        final /* synthetic */ DrawerLayout f1797a;

        C05741(DrawerLayout drawerLayout) {
            this.f1797a = drawerLayout;
        }

        @TargetApi(21)
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public static class LayoutParams extends MarginLayoutParams {
        /* renamed from: a */
        public int f1798a = 0;
        /* renamed from: b */
        float f1799b;
        /* renamed from: c */
        boolean f1800c;
        /* renamed from: d */
        int f1801d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1803a);
            this.f1798a = context.getInt(0, 0);
            context.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1798a = layoutParams.f1798a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$c */
    public interface C0576c {
        /* renamed from: a */
        void mo501a(int i);

        /* renamed from: a */
        void mo502a(View view);

        /* renamed from: a */
        void mo503a(View view, float f);

        /* renamed from: b */
        void mo504b(View view);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C05751();
        /* renamed from: a */
        int f13322a = null;
        /* renamed from: b */
        int f13323b;
        /* renamed from: c */
        int f13324c;
        /* renamed from: e */
        int f13325e;
        /* renamed from: f */
        int f13326f;

        /* renamed from: android.support.v4.widget.DrawerLayout$SavedState$1 */
        static class C05751 implements ClassLoaderCreator<SavedState> {
            C05751() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2260a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m2261a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m2262a(i);
            }

            /* renamed from: a */
            public SavedState m2261a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m2260a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m2262a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13322a = parcel.readInt();
            this.f13323b = parcel.readInt();
            this.f13324c = parcel.readInt();
            this.f13325e = parcel.readInt();
            this.f13326f = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13322a);
            parcel.writeInt(this.f13323b);
            parcel.writeInt(this.f13324c);
            parcel.writeInt(this.f13325e);
            parcel.writeInt(this.f13326f);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$a */
    class C3174a extends C0536a {
        /* renamed from: a */
        final /* synthetic */ DrawerLayout f13327a;
        /* renamed from: c */
        private final Rect f13328c = new Rect();

        C3174a(DrawerLayout drawerLayout) {
            this.f13327a = drawerLayout;
        }

        /* renamed from: a */
        public void mo87a(View view, C0532b c0532b) {
            if (DrawerLayout.f1804b) {
                super.mo87a(view, c0532b);
            } else {
                C0532b a = C0532b.m1950a(c0532b);
                super.mo87a(view, a);
                c0532b.m1956a(view);
                ViewParent f = C0560r.m2194f(view);
                if (f instanceof View) {
                    c0532b.m1970c((View) f);
                }
                m15787a(c0532b, a);
                a.m2003t();
                m15788a(c0532b, (ViewGroup) view);
            }
            c0532b.m1965b(DrawerLayout.class.getName());
            c0532b.m1972c(false);
            c0532b.m1976d(false);
            c0532b.m1960a(C0529a.f1705a);
            c0532b.m1960a(C0529a.f1706b);
        }

        /* renamed from: a */
        public void mo119a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo119a(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        /* renamed from: d */
        public boolean mo456d(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo456d(view, accessibilityEvent);
            }
            view = accessibilityEvent.getText();
            View c = this.f13327a.m2294c();
            if (c != null) {
                accessibilityEvent = this.f13327a.m2287b(this.f13327a.m2300e(c));
                if (accessibilityEvent != null) {
                    view.add(accessibilityEvent);
                }
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo455a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!DrawerLayout.f1804b) {
                if (!DrawerLayout.m2275l(view)) {
                    return null;
                }
            }
            return super.mo455a(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: a */
        private void m15788a(C0532b c0532b, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m2275l(childAt)) {
                    c0532b.m1964b(childAt);
                }
            }
        }

        /* renamed from: a */
        private void m15787a(C0532b c0532b, C0532b c0532b2) {
            Rect rect = this.f13328c;
            c0532b2.m1955a(rect);
            c0532b.m1963b(rect);
            c0532b2.m1969c(rect);
            c0532b.m1973d(rect);
            c0532b.m1979e(c0532b2.m1986h());
            c0532b.m1957a(c0532b2.m1999p());
            c0532b.m1965b(c0532b2.m2000q());
            c0532b.m1975d(c0532b2.m2002s());
            c0532b.m1989j(c0532b2.m1996m());
            c0532b.m1985h(c0532b2.m1992k());
            c0532b.m1972c(c0532b2.m1982f());
            c0532b.m1976d(c0532b2.m1984g());
            c0532b.m1981f(c0532b2.m1988i());
            c0532b.m1983g(c0532b2.m1990j());
            c0532b.m1987i(c0532b2.m1994l());
            c0532b.m1954a(c0532b2.m1961b());
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$b */
    static final class C3175b extends C0536a {
        C3175b() {
        }

        /* renamed from: a */
        public void mo87a(View view, C0532b c0532b) {
            super.mo87a(view, c0532b);
            if (DrawerLayout.m2275l(view) == null) {
                c0532b.m1970c(null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$d */
    private class C3176d extends C0624a {
        /* renamed from: a */
        final /* synthetic */ DrawerLayout f13329a;
        /* renamed from: b */
        private final int f13330b;
        /* renamed from: c */
        private C0625r f13331c;
        /* renamed from: d */
        private final Runnable f13332d = new C05771(this);

        /* renamed from: android.support.v4.widget.DrawerLayout$d$1 */
        class C05771 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C3176d f1802a;

            C05771(C3176d c3176d) {
                this.f1802a = c3176d;
            }

            public void run() {
                this.f1802a.m15805b();
            }
        }

        /* renamed from: b */
        public boolean mo459b(int i) {
            return false;
        }

        C3176d(DrawerLayout drawerLayout, int i) {
            this.f13329a = drawerLayout;
            this.f13330b = i;
        }

        /* renamed from: a */
        public void m15799a(C0625r c0625r) {
            this.f13331c = c0625r;
        }

        /* renamed from: a */
        public void m15796a() {
            this.f13329a.removeCallbacks(this.f13332d);
        }

        /* renamed from: a */
        public boolean mo108a(View view, int i) {
            return (this.f13329a.m2305g(view) == 0 || this.f13329a.m2286a(view, this.f13330b) == 0 || this.f13329a.m2278a(view) != null) ? null : true;
        }

        /* renamed from: a */
        public void mo105a(int i) {
            this.f13329a.m2280a(this.f13330b, i, this.f13331c.m2525c());
        }

        /* renamed from: a */
        public void mo107a(View view, int i, int i2, int i3, int i4) {
            float f;
            i2 = view.getWidth();
            if (this.f13329a.m2286a(view, 3) != 0) {
                f = ((float) (i + i2)) / ((float) i2);
            } else {
                f = ((float) (this.f13329a.getWidth() - i)) / ((float) i2);
            }
            this.f13329a.m2292b(view, f);
            view.setVisibility(f == 0 ? 4 : 0);
            this.f13329a.invalidate();
        }

        /* renamed from: b */
        public void mo135b(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f1800c = false;
            m15794c();
        }

        /* renamed from: c */
        private void m15794c() {
            int i = 3;
            if (this.f13330b == 3) {
                i = 5;
            }
            View c = this.f13329a.m2295c(i);
            if (c != null) {
                this.f13329a.m2308i(c);
            }
        }

        /* renamed from: a */
        public void mo106a(View view, float f, float f2) {
            int i;
            f2 = this.f13329a.m2298d(view);
            int width = view.getWidth();
            if (this.f13329a.m2286a(view, 3)) {
                if (f <= 0.0f) {
                    if (f != 0.0f || f2 <= 0.5f) {
                        i = -width;
                    }
                }
                i = 0;
            } else {
                int width2 = this.f13329a.getWidth();
                if (f < 0.0f || (f == 0.0f && f2 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f13331c.m2515a(i, view.getTop());
            this.f13329a.invalidate();
        }

        /* renamed from: a */
        public void mo457a(int i, int i2) {
            this.f13329a.postDelayed(this.f13332d, 160);
        }

        /* renamed from: b */
        void m15805b() {
            View c;
            int b = this.f13331c.m2519b();
            int i = 0;
            Object obj = this.f13330b == 3 ? 1 : null;
            if (obj != null) {
                c = this.f13329a.m2295c(3);
                if (c != null) {
                    i = -c.getWidth();
                }
                i += b;
            } else {
                c = this.f13329a.m2295c(5);
                i = this.f13329a.getWidth() - b;
            }
            if (c == null) {
                return;
            }
            if (((obj != null && c.getLeft() < i) || (obj == null && c.getLeft() > i)) && this.f13329a.m2278a(c) == 0) {
                LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                this.f13331c.m2517a(c, i, c.getTop());
                layoutParams.f1800c = true;
                this.f13329a.invalidate();
                m15794c();
                this.f13329a.m2299d();
            }
        }

        /* renamed from: b */
        public void mo458b(int i, int i2) {
            View c;
            if ((i & 1) == 1) {
                c = this.f13329a.m2295c(3);
            } else {
                c = this.f13329a.m2295c(5);
            }
            if (c != 0 && this.f13329a.m2278a(c) == 0) {
                this.f13331c.m2514a(c, i2);
            }
        }

        /* renamed from: b */
        public int mo134b(View view) {
            return this.f13329a.m2305g(view) ? view.getWidth() : null;
        }

        /* renamed from: b */
        public int mo109b(View view, int i, int i2) {
            if (this.f13329a.m2286a(view, 3) != 0) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            i2 = this.f13329a.getWidth();
            return Math.max(i2 - view.getWidth(), Math.min(i, i2));
        }

        /* renamed from: a */
        public int mo104a(View view, int i, int i2) {
            return view.getTop();
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        f1806d = z;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1820e = new C3175b();
        this.f1823h = -1728053248;
        this.f1825j = new Paint();
        this.f1832q = true;
        this.f1833r = 3;
        this.f1834s = 3;
        this.f1835t = 3;
        this.f1836u = 3;
        this.f1815I = null;
        this.f1816J = null;
        this.f1817K = null;
        this.f1818L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1822g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f1828m = new C3176d(this, 3);
        this.f1829n = new C3176d(this, 5);
        this.f1826k = C0625r.m2493a((ViewGroup) this, 1.0f, this.f1828m);
        this.f1826k.m2513a(1);
        this.f1826k.m2512a(f2);
        this.f1828m.m15799a(this.f1826k);
        this.f1827l = C0625r.m2493a((ViewGroup) this, 1.0f, this.f1829n);
        this.f1827l.m2513a(2);
        this.f1827l.m2512a(f2);
        this.f1829n.m15799a(this.f1827l);
        setFocusableInTouchMode(true);
        C0560r.m2167a((View) this, 1);
        C0560r.m2175a((View) this, new C3174a(this));
        setMotionEventSplittingEnabled(false);
        if (C0560r.m2205q(this) != 0) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new C05741(this));
                setSystemUiVisibility(1280);
                context = context.obtainStyledAttributes(f1805c);
                try {
                    this.f1808B = context.getDrawable(0);
                } finally {
                    context.recycle();
                }
            } else {
                this.f1808B = null;
            }
        }
        this.f1821f = f * 10.0f;
        this.f1819M = new ArrayList();
    }

    public void setDrawerElevation(float f) {
        this.f1821f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m2305g(childAt)) {
                C0560r.m2166a(childAt, this.f1821f);
            }
        }
    }

    public float getDrawerElevation() {
        return f1806d ? this.f1821f : 0.0f;
    }

    public void setChildInsets(Object obj, boolean z) {
        this.f1813G = obj;
        this.f1814H = z;
        obj = (z || getBackground() != null) ? null : true;
        setWillNotDraw(obj);
        requestLayout();
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!f1806d) {
            if ((i & 8388611) == 8388611) {
                this.f1815I = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.f1816J = drawable;
            } else if ((i & 3) == 3) {
                this.f1817K = drawable;
            } else if ((i & 5) == 5) {
                this.f1818L = drawable;
            } else {
                return;
            }
            m2270e();
            invalidate();
        }
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(C0389b.m1429a(getContext(), i), i2);
    }

    public void setScrimColor(int i) {
        this.f1823h = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(C0576c c0576c) {
        if (this.f1839x != null) {
            m2290b(this.f1839x);
        }
        if (c0576c != null) {
            m2282a(c0576c);
        }
        this.f1839x = c0576c;
    }

    /* renamed from: a */
    public void m2282a(C0576c c0576c) {
        if (c0576c != null) {
            if (this.f1840y == null) {
                this.f1840y = new ArrayList();
            }
            this.f1840y.add(c0576c);
        }
    }

    /* renamed from: b */
    public void m2290b(C0576c c0576c) {
        if (c0576c != null && this.f1840y != null) {
            this.f1840y.remove(c0576c);
        }
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, int i2) {
        int a = C0543c.m2037a(i2, C0560r.m2193e(this));
        if (i2 == 3) {
            this.f1833r = i;
        } else if (i2 == 5) {
            this.f1834s = i;
        } else if (i2 == 8388611) {
            this.f1835t = i;
        } else if (i2 == 8388613) {
            this.f1836u = i;
        }
        if (i != 0) {
            (a == 3 ? this.f1826k : this.f1827l).m2531e();
        }
        switch (i) {
            case 1:
                i = m2295c(a);
                if (i != 0) {
                    m2308i(i);
                    return;
                }
                return;
            case 2:
                View c = m2295c(a);
                if (c != 0) {
                    m2306h(c);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void setDrawerLockMode(int i, View view) {
        if (m2305g(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).f1798a);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a ");
        stringBuilder.append("drawer with appropriate layout_gravity");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public int m2277a(int i) {
        int e = C0560r.m2193e(this);
        if (i != 3) {
            if (i != 5) {
                if (i != 8388611) {
                    if (i == 8388613) {
                        if (this.f1836u != 3) {
                            return this.f1836u;
                        }
                        if (e == 0) {
                            i = this.f1834s;
                        } else {
                            i = this.f1833r;
                        }
                        if (i != 3) {
                            return i;
                        }
                    }
                } else if (this.f1835t != 3) {
                    return this.f1835t;
                } else {
                    if (e == 0) {
                        i = this.f1833r;
                    } else {
                        i = this.f1834s;
                    }
                    if (i != 3) {
                        return i;
                    }
                }
            } else if (this.f1834s != 3) {
                return this.f1834s;
            } else {
                if (e == 0) {
                    i = this.f1836u;
                } else {
                    i = this.f1835t;
                }
                if (i != 3) {
                    return i;
                }
            }
        } else if (this.f1833r != 3) {
            return this.f1833r;
        } else {
            i = e == 0 ? this.f1835t : this.f1836u;
            if (i != 3) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public int m2278a(View view) {
        if (m2305g(view)) {
            return m2277a(((LayoutParams) view.getLayoutParams()).f1798a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        i = C0543c.m2037a(i, C0560r.m2193e(this));
        if (i == 3) {
            this.f1811E = charSequence;
        } else if (i == 5) {
            this.f1812F = charSequence;
        }
    }

    /* renamed from: b */
    public CharSequence m2287b(int i) {
        i = C0543c.m2037a(i, C0560r.m2193e(this));
        if (i == 3) {
            return this.f1811E;
        }
        return i == 5 ? this.f1812F : 0;
    }

    /* renamed from: a */
    void m2280a(int i, int i2, View view) {
        LayoutParams layoutParams;
        i = this.f1826k.m2511a();
        int a = this.f1827l.m2511a();
        int i3 = 2;
        if (i != 1) {
            if (a != 1) {
                if (i != 2) {
                    if (a != 2) {
                        i3 = 0;
                    }
                }
                if (view != null && i2 == 0) {
                    layoutParams = (LayoutParams) view.getLayoutParams();
                    if (layoutParams.f1799b == 0) {
                        m2291b(view);
                    } else if (layoutParams.f1799b == 1065353216) {
                        m2296c(view);
                    }
                }
                if (i3 != this.f1830o) {
                    this.f1830o = i3;
                    if (this.f1840y != 0) {
                        for (i = this.f1840y.size() - 1; i >= 0; i--) {
                            ((C0576c) this.f1840y.get(i)).mo501a(i3);
                        }
                    }
                }
            }
        }
        i3 = 1;
        layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.f1799b == 0) {
            m2291b(view);
        } else if (layoutParams.f1799b == 1065353216) {
            m2296c(view);
        }
        if (i3 != this.f1830o) {
            this.f1830o = i3;
            if (this.f1840y != 0) {
                for (i = this.f1840y.size() - 1; i >= 0; i--) {
                    ((C0576c) this.f1840y.get(i)).mo501a(i3);
                }
            }
        }
    }

    /* renamed from: b */
    void m2291b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f1801d & 1) == 1) {
            layoutParams.f1801d = 0;
            if (this.f1840y != null) {
                for (int size = this.f1840y.size() - 1; size >= 0; size--) {
                    ((C0576c) this.f1840y.get(size)).mo504b(view);
                }
            }
            m2268c(view, false);
            if (hasWindowFocus() != null) {
                view = getRootView();
                if (view != null) {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
    }

    /* renamed from: c */
    void m2296c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f1801d & 1) == 0) {
            layoutParams.f1801d = 1;
            if (this.f1840y != null) {
                for (int size = this.f1840y.size() - 1; size >= 0; size--) {
                    ((C0576c) this.f1840y.get(size)).mo502a(view);
                }
            }
            m2268c(view, true);
            if (hasWindowFocus() != null) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: c */
    private void m2268c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m2305g(childAt)) && !(z && childAt == view)) {
                C0560r.m2167a(childAt, 4);
            } else {
                C0560r.m2167a(childAt, 1);
            }
        }
    }

    /* renamed from: a */
    void m2283a(View view, float f) {
        if (this.f1840y != null) {
            for (int size = this.f1840y.size() - 1; size >= 0; size--) {
                ((C0576c) this.f1840y.get(size)).mo503a(view, f);
            }
        }
    }

    /* renamed from: b */
    void m2292b(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f1799b) {
            layoutParams.f1799b = f;
            m2283a(view, f);
        }
    }

    /* renamed from: d */
    float m2298d(View view) {
        return ((LayoutParams) view.getLayoutParams()).f1799b;
    }

    /* renamed from: e */
    int m2300e(View view) {
        return C0543c.m2037a(((LayoutParams) view.getLayoutParams()).f1798a, C0560r.m2193e(this));
    }

    /* renamed from: a */
    boolean m2286a(View view, int i) {
        return (m2300e(view) & i) == i ? true : null;
    }

    /* renamed from: a */
    View m2279a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f1801d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: c */
    void m2297c(View view, float f) {
        float width = (float) view.getWidth();
        int i = (int) (width * f);
        i -= (int) (m2298d(view) * width);
        if (!m2286a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m2292b(view, f);
    }

    /* renamed from: c */
    View m2295c(int i) {
        i = C0543c.m2037a(i, C0560r.m2193e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m2300e(childAt) & 7) == i) {
                return childAt;
            }
        }
        return 0;
    }

    /* renamed from: d */
    static String m2269d(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1832q = true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1832q = true;
    }

    protected void onMeasure(int i, int i2) {
        DrawerLayout drawerLayout = this;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        size = 300;
                    }
                }
                if (mode2 != Integer.MIN_VALUE) {
                    if (mode2 == 0) {
                        size2 = 300;
                    }
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        Object obj = (drawerLayout.f1813G == null || !C0560r.m2205q(this)) ? null : 1;
        int e = C0560r.m2193e(this);
        int childCount = getChildCount();
        int i4 = 0;
        Object obj2 = null;
        Object obj3 = null;
        while (i4 < childCount) {
            int a;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (obj != null) {
                    a = C0543c.m2037a(layoutParams.f1798a, e);
                    WindowInsets windowInsets;
                    if (C0560r.m2205q(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            windowInsets = (WindowInsets) drawerLayout.f1813G;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        windowInsets = (WindowInsets) drawerLayout.f1813G;
                        if (a == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (m2303f(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (m2305g(childAt)) {
                    if (f1806d && C0560r.m2200l(childAt) != drawerLayout.f1821f) {
                        C0560r.m2166a(childAt, drawerLayout.f1821f);
                    }
                    mode2 = m2300e(childAt) & 7;
                    Object obj4 = mode2 == 3 ? 1 : null;
                    if (obj4 == null || r10 == null) {
                        if (obj4 == null) {
                            if (obj3 == null) {
                            }
                        }
                        if (obj4 != null) {
                            obj2 = 1;
                        } else {
                            obj3 = 1;
                        }
                        childAt.measure(getChildMeasureSpec(i, (drawerLayout.f1822g + layoutParams.leftMargin) + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i4++;
                        i3 = 0;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Child drawer has absolute gravity ");
                    stringBuilder.append(m2269d(mode2));
                    stringBuilder.append(" but this ");
                    stringBuilder.append("DrawerLayout");
                    stringBuilder.append(" already has a ");
                    stringBuilder.append("drawer view along that edge");
                    throw new IllegalStateException(stringBuilder.toString());
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Child ");
                    stringBuilder2.append(childAt);
                    stringBuilder2.append(" at index ");
                    stringBuilder2.append(i4);
                    stringBuilder2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    stringBuilder2.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(stringBuilder2.toString());
                }
            }
            a = i;
            int i5 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* renamed from: e */
    private void m2270e() {
        if (!f1806d) {
            this.f1809C = m2271f();
            this.f1810D = m2272g();
        }
    }

    /* renamed from: f */
    private Drawable m2271f() {
        int e = C0560r.m2193e(this);
        if (e == 0) {
            if (this.f1815I != null) {
                m2267a(this.f1815I, e);
                return this.f1815I;
            }
        } else if (this.f1816J != null) {
            m2267a(this.f1816J, e);
            return this.f1816J;
        }
        return this.f1817K;
    }

    /* renamed from: g */
    private Drawable m2272g() {
        int e = C0560r.m2193e(this);
        if (e == 0) {
            if (this.f1816J != null) {
                m2267a(this.f1816J, e);
                return this.f1816J;
            }
        } else if (this.f1815I != null) {
            m2267a(this.f1815I, e);
            return this.f1815I;
        }
        return this.f1818L;
    }

    /* renamed from: a */
    private boolean m2267a(Drawable drawable, int i) {
        if (drawable != null) {
            if (C0295a.m1055b(drawable)) {
                C0295a.m1056b(drawable, i);
                return true;
            }
        }
        return null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1831p = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m2303f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i7;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2286a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i7 = (-measuredWidth) + ((int) (layoutParams.f1799b * f2));
                        f = ((float) (measuredWidth + i7)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i8 = i5 - ((int) (layoutParams.f1799b * f3));
                        f = ((float) (i5 - i8)) / f3;
                        i7 = i8;
                    }
                    Object obj = f != layoutParams.f1799b ? 1 : null;
                    int i9 = layoutParams.f1798a & 112;
                    int i10;
                    if (i9 == 16) {
                        i10 = i4 - i2;
                        i9 = (i10 - measuredHeight) / 2;
                        if (i9 < layoutParams.topMargin) {
                            i9 = layoutParams.topMargin;
                        } else if (i9 + measuredHeight > i10 - layoutParams.bottomMargin) {
                            i9 = (i10 - layoutParams.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i7, i9, measuredWidth + i7, measuredHeight + i9);
                    } else if (i9 != 80) {
                        childAt.layout(i7, layoutParams.topMargin, measuredWidth + i7, layoutParams.topMargin + measuredHeight);
                    } else {
                        i10 = i4 - i2;
                        childAt.layout(i7, (i10 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i10 - layoutParams.bottomMargin);
                    }
                    if (obj != null) {
                        m2292b(childAt, f);
                    }
                    int i11 = layoutParams.f1799b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        r0.f1831p = false;
        r0.f1832q = false;
    }

    public void requestLayout() {
        if (!this.f1831p) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f1799b);
        }
        this.f1824i = f;
        boolean a = this.f1826k.m2518a(true);
        boolean a2 = this.f1827l.m2518a(true);
        if (a || a2) {
            C0560r.m2189c(this);
        }
    }

    /* renamed from: m */
    private static boolean m2276m(View view) {
        view = view.getBackground();
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (view.getOpacity() == -1) {
            z = true;
        }
        return z;
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1808B = drawable;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1808B;
    }

    public void setStatusBarBackground(int i) {
        this.f1808B = i != 0 ? C0389b.m1429a(getContext(), i) : 0;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1808B = new ColorDrawable(i);
        invalidate();
    }

    public void onRtlPropertiesChanged(int i) {
        m2270e();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1814H && this.f1808B != null) {
            int systemWindowInsetTop = (VERSION.SDK_INT < 21 || this.f1813G == null) ? 0 : ((WindowInsets) this.f1813G).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.f1808B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f1808B.draw(canvas);
            }
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        DrawerLayout drawerLayout = this;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean f = m2303f(view2);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (f) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (width = 0; width < childCount; width++) {
                View childAt = getChildAt(width);
                if (childAt != view2 && childAt.getVisibility() == 0 && m2276m(childAt) && m2305g(childAt)) {
                    if (childAt.getHeight() >= height) {
                        int right;
                        if (m2286a(childAt, 3)) {
                            right = childAt.getRight();
                            if (right > i3) {
                                i3 = right;
                            }
                        } else {
                            right = childAt.getLeft();
                            if (right < i) {
                                i = right;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (drawerLayout.f1824i > 0.0f && f) {
            drawerLayout.f1825j.setColor((((int) (((float) ((drawerLayout.f1823h & -16777216) >>> 24)) * drawerLayout.f1824i)) << 24) | (drawerLayout.f1823h & 16777215));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), drawerLayout.f1825j);
        } else if (drawerLayout.f1809C != null && m2286a(view2, 3)) {
            height = drawerLayout.f1809C.getIntrinsicWidth();
            r7 = view.getRight();
            r5 = Math.max(0.0f, Math.min(((float) r7) / ((float) drawerLayout.f1826k.m2519b()), 1.0f));
            drawerLayout.f1809C.setBounds(r7, view.getTop(), height + r7, view.getBottom());
            drawerLayout.f1809C.setAlpha((int) (r5 * 255.0f));
            drawerLayout.f1809C.draw(canvas);
        } else if (drawerLayout.f1810D != null && m2286a(view2, 5)) {
            height = drawerLayout.f1810D.getIntrinsicWidth();
            r7 = view.getLeft();
            r5 = Math.max(0.0f, Math.min(((float) (getWidth() - r7)) / ((float) drawerLayout.f1827l.m2519b()), 1.0f));
            drawerLayout.f1810D.setBounds(r7 - height, view.getTop(), r7, view.getBottom());
            drawerLayout.f1810D.setAlpha((int) (r5 * 255.0f));
            drawerLayout.f1810D.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: f */
    boolean m2303f(View view) {
        return ((LayoutParams) view.getLayoutParams()).f1798a == null ? true : null;
    }

    /* renamed from: g */
    boolean m2305g(View view) {
        view = C0543c.m2037a(((LayoutParams) view.getLayoutParams()).f1798a, C0560r.m2193e(view));
        return ((view & 3) == 0 && (view & 5) == null) ? null : true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int a = this.f1826k.m2516a(motionEvent) | this.f1827l.m2516a(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                motionEvent = motionEvent.getY();
                this.f1841z = x;
                this.f1807A = motionEvent;
                if (this.f1824i > 0.0f) {
                    View d = this.f1826k.m2529d((int) x, (int) motionEvent);
                    if (!(d == null || m2303f(d) == null)) {
                        motionEvent = true;
                        this.f1837v = false;
                        this.f1838w = false;
                        break;
                    }
                }
                motionEvent = null;
                this.f1837v = false;
                this.f1838w = false;
            case 1:
            case 3:
                m2285a(true);
                this.f1837v = false;
                this.f1838w = false;
                break;
            case 2:
                if (this.f1826k.m2530d(3) != null) {
                    this.f1828m.m15796a();
                    this.f1829n.m15796a();
                    break;
                }
                break;
            default:
                break;
        }
        motionEvent = null;
        if (a != 0 || r7 != null || m2273h() != null) {
            return true;
        }
        if (this.f1838w != null) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f1826k.m2520b(motionEvent);
        this.f1827l.m2520b(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            float x;
            switch (action) {
                case 0:
                    x = motionEvent.getX();
                    motionEvent = motionEvent.getY();
                    this.f1841z = x;
                    this.f1807A = motionEvent;
                    this.f1837v = false;
                    this.f1838w = false;
                    break;
                case 1:
                    boolean z;
                    x = motionEvent.getX();
                    motionEvent = motionEvent.getY();
                    View d = this.f1826k.m2529d((int) x, (int) motionEvent);
                    if (d != null && m2303f(d)) {
                        x -= this.f1841z;
                        motionEvent -= this.f1807A;
                        int d2 = this.f1826k.m2528d();
                        if ((x * x) + (motionEvent * motionEvent) < ((float) (d2 * d2))) {
                            View a = m2279a();
                            if (a != null) {
                                if (m2278a(a) != 2) {
                                    z = null;
                                    m2285a(z);
                                    this.f1837v = false;
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                    m2285a(z);
                    this.f1837v = false;
                default:
                    break;
            }
        }
        m2285a(true);
        this.f1837v = false;
        this.f1838w = false;
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1837v = z;
        if (z) {
            m2285a(true);
        }
    }

    /* renamed from: b */
    public void m2288b() {
        m2285a(false);
    }

    /* renamed from: a */
    void m2285a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m2305g(childAt)) {
                if (!z || layoutParams.f1800c) {
                    int width = childAt.getWidth();
                    if (m2286a(childAt, 3)) {
                        i |= this.f1826k.m2517a(childAt, -width, childAt.getTop());
                    } else {
                        i |= this.f1827l.m2517a(childAt, getWidth(), childAt.getTop());
                    }
                    layoutParams.f1800c = false;
                }
            }
        }
        this.f1828m.m15796a();
        this.f1829n.m15796a();
        if (i != 0) {
            invalidate();
        }
    }

    /* renamed from: h */
    public void m2306h(View view) {
        m2284a(view, true);
    }

    /* renamed from: a */
    public void m2284a(View view, boolean z) {
        if (m2305g(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f1832q) {
                layoutParams.f1799b = 1.0f;
                layoutParams.f1801d = 1;
                m2268c(view, true);
            } else if (z) {
                layoutParams.f1801d |= 2;
                if (m2286a(view, (int) true)) {
                    this.f1826k.m2517a(view, 0, view.getTop());
                } else {
                    this.f1827l.m2517a(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                m2297c(view, 1.0f);
                m2280a(layoutParams.f1798a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: e */
    public void m2301e(int i) {
        m2281a(i, true);
    }

    /* renamed from: a */
    public void m2281a(int i, boolean z) {
        View c = m2295c(i);
        if (c != null) {
            m2284a(c, z);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No drawer view found with gravity ");
        stringBuilder.append(m2269d(i));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: i */
    public void m2308i(View view) {
        m2293b(view, true);
    }

    /* renamed from: b */
    public void m2293b(View view, boolean z) {
        if (m2305g(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f1832q) {
                layoutParams.f1799b = 0.0f;
                layoutParams.f1801d = 0;
            } else if (z) {
                layoutParams.f1801d |= true;
                if (m2286a(view, (int) true)) {
                    this.f1826k.m2517a(view, -view.getWidth(), view.getTop());
                } else {
                    this.f1827l.m2517a(view, getWidth(), view.getTop());
                }
            } else {
                m2297c(view, 0.0f);
                m2280a(layoutParams.f1798a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: f */
    public void m2302f(int i) {
        m2289b(i, true);
    }

    /* renamed from: b */
    public void m2289b(int i, boolean z) {
        View c = m2295c(i);
        if (c != null) {
            m2293b(c, z);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No drawer view found with gravity ");
        stringBuilder.append(m2269d(i));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: j */
    public boolean m2309j(View view) {
        if (m2305g(view)) {
            return (((LayoutParams) view.getLayoutParams()).f1801d & 1) == 1;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View ");
            stringBuilder.append(view);
            stringBuilder.append(" is not a drawer");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: g */
    public boolean m2304g(int i) {
        i = m2295c(i);
        return i != 0 ? m2309j(i) : false;
    }

    /* renamed from: k */
    public boolean m2310k(View view) {
        if (m2305g(view)) {
            return ((LayoutParams) view.getLayoutParams()).f1799b > 0.0f ? true : null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View ");
            stringBuilder.append(view);
            stringBuilder.append(" is not a drawer");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: h */
    public boolean m2307h(int i) {
        i = m2295c(i);
        return i != 0 ? m2310k(i) : false;
    }

    /* renamed from: h */
    private boolean m2273h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f1800c) {
                return true;
            }
        }
        return false;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (!(layoutParams instanceof LayoutParams) || super.checkLayoutParams(layoutParams) == null) ? null : true;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            Object obj = null;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!m2305g(childAt)) {
                    this.f1819M.add(childAt);
                } else if (m2309j(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    obj = 1;
                }
            }
            if (obj == null) {
                childCount = this.f1819M.size();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View view = (View) this.f1819M.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f1819M.clear();
        }
    }

    /* renamed from: i */
    private boolean m2274i() {
        return m2294c() != null;
    }

    /* renamed from: c */
    View m2294c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2305g(childAt) && m2310k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    void m2299d() {
        if (!this.f1838w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f1838w = true;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m2274i()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View c = m2294c();
        if (c != 0 && m2278a(c) == null) {
            m2288b();
        }
        return c != null ? 1 : 0;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.m1885a());
            if (savedState.f13322a != 0) {
                View c = m2295c(savedState.f13322a);
                if (c != null) {
                    m2306h(c);
                }
            }
            if (savedState.f13323b != 3) {
                setDrawerLockMode(savedState.f13323b, 3);
            }
            if (savedState.f13324c != 3) {
                setDrawerLockMode(savedState.f13324c, 5);
            }
            if (savedState.f13325e != 3) {
                setDrawerLockMode(savedState.f13325e, 8388611);
            }
            if (savedState.f13326f != 3) {
                setDrawerLockMode(savedState.f13326f, 8388613);
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            Object obj = 1;
            Object obj2 = layoutParams.f1801d == 1 ? 1 : null;
            if (layoutParams.f1801d != 2) {
                obj = null;
            }
            if (obj2 == null) {
                if (obj == null) {
                    i++;
                }
            }
            savedState.f13322a = layoutParams.f1798a;
            break;
        }
        savedState.f13323b = this.f1833r;
        savedState.f13324c = this.f1834s;
        savedState.f13325e = this.f1835t;
        savedState.f13326f = this.f1836u;
        return savedState;
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m2279a() == 0) {
            if (m2305g(view) == 0) {
                C0560r.m2167a(view, 1);
                if (f1804b == 0) {
                    C0560r.m2175a(view, this.f1820e);
                }
            }
        }
        C0560r.m2167a(view, 4);
        if (f1804b == 0) {
            C0560r.m2175a(view, this.f1820e);
        }
    }

    /* renamed from: l */
    static boolean m2275l(View view) {
        return (C0560r.m2191d(view) == 4 || C0560r.m2191d(view) == 2) ? null : true;
    }
}
