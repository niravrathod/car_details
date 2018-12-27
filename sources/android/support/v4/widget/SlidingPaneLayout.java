package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.content.C0389b;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0536a;
import android.support.v4.view.C0560r;
import android.support.v4.view.p018a.C0532b;
import android.support.v4.widget.C0625r.C0624a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    /* renamed from: h */
    static final C0583e f1850h;
    /* renamed from: a */
    View f1851a;
    /* renamed from: b */
    float f1852b;
    /* renamed from: c */
    int f1853c;
    /* renamed from: d */
    boolean f1854d;
    /* renamed from: e */
    final C0625r f1855e;
    /* renamed from: f */
    boolean f1856f;
    /* renamed from: g */
    final ArrayList<C0581b> f1857g;
    /* renamed from: i */
    private int f1858i;
    /* renamed from: j */
    private int f1859j;
    /* renamed from: k */
    private Drawable f1860k;
    /* renamed from: l */
    private Drawable f1861l;
    /* renamed from: m */
    private final int f1862m;
    /* renamed from: n */
    private boolean f1863n;
    /* renamed from: o */
    private float f1864o;
    /* renamed from: p */
    private int f1865p;
    /* renamed from: q */
    private float f1866q;
    /* renamed from: r */
    private float f1867r;
    /* renamed from: s */
    private C0582d f1868s;
    /* renamed from: t */
    private boolean f1869t;
    /* renamed from: u */
    private final Rect f1870u;

    public static class LayoutParams extends MarginLayoutParams {
        /* renamed from: e */
        private static final int[] f1843e = new int[]{16843137};
        /* renamed from: a */
        public float f1844a = 0.0f;
        /* renamed from: b */
        boolean f1845b;
        /* renamed from: c */
        boolean f1846c;
        /* renamed from: d */
        Paint f1847d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, f1843e);
            this.f1844a = context.getFloat(null, 0.0f);
            context.recycle();
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$b */
    private class C0581b implements Runnable {
        /* renamed from: a */
        final View f1848a;
        /* renamed from: b */
        final /* synthetic */ SlidingPaneLayout f1849b;

        C0581b(SlidingPaneLayout slidingPaneLayout, View view) {
            this.f1849b = slidingPaneLayout;
            this.f1848a = view;
        }

        public void run() {
            if (this.f1848a.getParent() == this.f1849b) {
                this.f1848a.setLayerType(0, null);
                this.f1849b.m2336e(this.f1848a);
            }
            this.f1849b.f1857g.remove(this);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$d */
    public interface C0582d {
        /* renamed from: a */
        void m2317a(View view);

        /* renamed from: a */
        void m2318a(View view, float f);

        /* renamed from: b */
        void m2319b(View view);
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$e */
    interface C0583e {
        /* renamed from: a */
        void mo460a(SlidingPaneLayout slidingPaneLayout, View view);
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C05801();
        /* renamed from: a */
        boolean f13333a;

        /* renamed from: android.support.v4.widget.SlidingPaneLayout$SavedState$1 */
        static class C05801 implements ClassLoaderCreator<SavedState> {
            C05801() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2314a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m2315a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m2316a(i);
            }

            /* renamed from: a */
            public SavedState m2315a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState m2314a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m2316a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13333a = parcel.readInt() != null ? true : null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13333a);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$a */
    class C3178a extends C0536a {
        /* renamed from: a */
        final /* synthetic */ SlidingPaneLayout f13334a;
        /* renamed from: c */
        private final Rect f13335c = new Rect();

        C3178a(SlidingPaneLayout slidingPaneLayout) {
            this.f13334a = slidingPaneLayout;
        }

        /* renamed from: a */
        public void mo87a(View view, C0532b c0532b) {
            C0532b a = C0532b.m1950a(c0532b);
            super.mo87a(view, a);
            m15812a(c0532b, a);
            a.m2003t();
            c0532b.m1965b(SlidingPaneLayout.class.getName());
            c0532b.m1956a(view);
            view = C0560r.m2194f(view);
            if (view instanceof View) {
                c0532b.m1970c(view);
            }
            view = this.f13334a.getChildCount();
            for (int i = 0; i < view; i++) {
                View childAt = this.f13334a.getChildAt(i);
                if (!m15816b(childAt) && childAt.getVisibility() == 0) {
                    C0560r.m2167a(childAt, 1);
                    c0532b.m1964b(childAt);
                }
            }
        }

        /* renamed from: a */
        public void mo119a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo119a(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        /* renamed from: a */
        public boolean mo455a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return !m15816b(view) ? super.mo455a(viewGroup, view, accessibilityEvent) : null;
        }

        /* renamed from: b */
        public boolean m15816b(View view) {
            return this.f13334a.m2339f(view);
        }

        /* renamed from: a */
        private void m15812a(C0532b c0532b, C0532b c0532b2) {
            Rect rect = this.f13335c;
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
            c0532b.m1962b(c0532b2.m1968c());
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$c */
    private class C3179c extends C0624a {
        /* renamed from: a */
        final /* synthetic */ SlidingPaneLayout f13336a;

        C3179c(SlidingPaneLayout slidingPaneLayout) {
            this.f13336a = slidingPaneLayout;
        }

        /* renamed from: a */
        public boolean mo108a(View view, int i) {
            if (this.f13336a.f1854d != 0) {
                return null;
            }
            return ((LayoutParams) view.getLayoutParams()).f1845b;
        }

        /* renamed from: a */
        public void mo105a(int i) {
            if (this.f13336a.f1855e.m2511a() != 0) {
                return;
            }
            if (this.f13336a.f1852b == 0) {
                this.f13336a.m2334d(this.f13336a.f1851a);
                this.f13336a.m2332c(this.f13336a.f1851a);
                this.f13336a.f1856f = false;
                return;
            }
            this.f13336a.m2330b(this.f13336a.f1851a);
            this.f13336a.f1856f = true;
        }

        /* renamed from: b */
        public void mo135b(View view, int i) {
            this.f13336a.m2326a();
        }

        /* renamed from: a */
        public void mo107a(View view, int i, int i2, int i3, int i4) {
            this.f13336a.m2327a(i);
            this.f13336a.invalidate();
        }

        /* renamed from: a */
        public void mo106a(View view, float f, float f2) {
            int width;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f13336a.m2338f()) {
                int paddingRight = this.f13336a.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && this.f13336a.f1852b > 0.5f)) {
                    paddingRight += this.f13336a.f1853c;
                }
                width = (this.f13336a.getWidth() - paddingRight) - this.f13336a.f1851a.getWidth();
            } else {
                width = layoutParams.leftMargin + this.f13336a.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && this.f13336a.f1852b > 0.5f)) {
                    width += this.f13336a.f1853c;
                }
            }
            this.f13336a.f1855e.m2515a(width, view.getTop());
            this.f13336a.invalidate();
        }

        /* renamed from: b */
        public int mo134b(View view) {
            return this.f13336a.f1853c;
        }

        /* renamed from: b */
        public int mo109b(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) this.f13336a.f1851a.getLayoutParams();
            if (this.f13336a.m2338f() != 0) {
                i2 = this.f13336a.getWidth() - ((this.f13336a.getPaddingRight() + layoutParams.rightMargin) + this.f13336a.f1851a.getWidth());
                return Math.max(Math.min(i, i2), i2 - this.f13336a.f1853c);
            }
            i2 = this.f13336a.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, i2), this.f13336a.f1853c + i2);
        }

        /* renamed from: a */
        public int mo104a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public void mo458b(int i, int i2) {
            this.f13336a.f1855e.m2514a(this.f13336a.f1851a, i2);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$f */
    static class C3180f implements C0583e {
        C3180f() {
        }

        /* renamed from: a */
        public void mo460a(SlidingPaneLayout slidingPaneLayout, View view) {
            C0560r.m2169a(slidingPaneLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$g */
    static class C4445g extends C3180f {
        /* renamed from: a */
        private Method f18450a;
        /* renamed from: b */
        private Field f18451b;

        C4445g() {
            try {
                this.f18450a = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
            } catch (Throwable e) {
                Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
            }
            try {
                this.f18451b = View.class.getDeclaredField("mRecreateDisplayList");
                this.f18451b.setAccessible(true);
            } catch (Throwable e2) {
                Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
            }
        }

        /* renamed from: a */
        public void mo460a(SlidingPaneLayout slidingPaneLayout, View view) {
            if (this.f18450a == null || this.f18451b == null) {
                view.invalidate();
                return;
            }
            try {
                this.f18451b.setBoolean(view, true);
                this.f18450a.invoke(view, (Object[]) null);
            } catch (Throwable e) {
                Log.e("SlidingPaneLayout", "Error refreshing display list state", e);
            }
            super.mo460a(slidingPaneLayout, view);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$h */
    static class C4446h extends C3180f {
        C4446h() {
        }

        /* renamed from: a */
        public void mo460a(SlidingPaneLayout slidingPaneLayout, View view) {
            C0560r.m2171a(view, ((LayoutParams) view.getLayoutParams()).f1847d);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f1850h = new C4446h();
        } else if (VERSION.SDK_INT >= 16) {
            f1850h = new C4445g();
        } else {
            f1850h = new C3180f();
        }
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1858i = -858993460;
        this.f1869t = true;
        this.f1870u = new Rect();
        this.f1857g = new ArrayList();
        context = context.getResources().getDisplayMetrics().density;
        this.f1862m = (int) ((1107296256 * context) + 1056964608);
        setWillNotDraw(0);
        C0560r.m2175a((View) this, new C3178a(this));
        C0560r.m2167a((View) this, 1);
        this.f1855e = C0625r.m2493a((ViewGroup) this, 0.5f, new C3179c(this));
        this.f1855e.m2512a(context * 1137180672);
    }

    public void setParallaxDistance(int i) {
        this.f1865p = i;
        requestLayout();
    }

    public int getParallaxDistance() {
        return this.f1865p;
    }

    public void setSliderFadeColor(int i) {
        this.f1858i = i;
    }

    public int getSliderFadeColor() {
        return this.f1858i;
    }

    public void setCoveredFadeColor(int i) {
        this.f1859j = i;
    }

    public int getCoveredFadeColor() {
        return this.f1859j;
    }

    public void setPanelSlideListener(C0582d c0582d) {
        this.f1868s = c0582d;
    }

    /* renamed from: a */
    void m2328a(View view) {
        if (this.f1868s != null) {
            this.f1868s.m2318a(view, this.f1852b);
        }
    }

    /* renamed from: b */
    void m2330b(View view) {
        if (this.f1868s != null) {
            this.f1868s.m2317a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: c */
    void m2332c(View view) {
        if (this.f1868s != null) {
            this.f1868s.m2319b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: d */
    void m2334d(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View view2 = view;
        boolean f = m2338f();
        int width = f ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = f ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m2325g(view)) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = view.getLeft();
            i2 = view.getRight();
            i3 = view.getTop();
            i4 = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt != view2) {
                boolean z;
                if (childAt.getVisibility() == 8) {
                    z = f;
                } else {
                    int i6;
                    int max = Math.max(f ? paddingLeft : width, childAt.getLeft());
                    int max2 = Math.max(paddingTop, childAt.getTop());
                    if (f) {
                        z = f;
                        i6 = width;
                    } else {
                        z = f;
                        i6 = paddingLeft;
                    }
                    max = (max < i || max2 < i3 || Math.min(i6, childAt.getRight()) > i2 || Math.min(height, childAt.getBottom()) > i4) ? 0 : 4;
                    childAt.setVisibility(max);
                }
                i5++;
                f = z;
                view2 = view;
            } else {
                return;
            }
        }
        SlidingPaneLayout slidingPaneLayout = this;
    }

    /* renamed from: a */
    void m2326a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: g */
    private static boolean m2325g(View view) {
        boolean z = true;
        if (view.isOpaque()) {
            return true;
        }
        if (VERSION.SDK_INT >= 18) {
            return false;
        }
        view = view.getBackground();
        if (view == null) {
            return false;
        }
        if (view.getOpacity() != -1) {
            z = false;
        }
        return z;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1869t = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1869t = true;
        int size = this.f1857g.size();
        for (int i = 0; i < size; i++) {
            ((C0581b) this.f1857g.get(i)).run();
        }
        this.f1857g.clear();
    }

    protected void onMeasure(int i, int i2) {
        int paddingTop;
        SlidingPaneLayout slidingPaneLayout = this;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    size = 300;
                }
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            size2 = 0;
        } else if (mode2 != 1073741824) {
            size2 = 0;
            paddingTop = 0;
        } else {
            size2 = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = size2;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        slidingPaneLayout.f1851a = null;
        int i3 = size2;
        int i4 = paddingLeft;
        size2 = 0;
        boolean z2 = false;
        float f = 0.0f;
        while (true) {
            int i5 = 8;
            if (size2 >= childCount) {
                break;
            }
            int i6;
            View childAt = getChildAt(size2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f1846c = z;
            } else {
                if (layoutParams.f1844a > 0.0f) {
                    f += layoutParams.f1844a;
                    if (layoutParams.width == 0) {
                    }
                }
                i6 = layoutParams.leftMargin + layoutParams.rightMargin;
                if (layoutParams.width == -2) {
                    mode = MeasureSpec.makeMeasureSpec(paddingLeft - i6, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    mode = MeasureSpec.makeMeasureSpec(paddingLeft - i6, 1073741824);
                } else {
                    mode = MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    i5 = MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                } else if (layoutParams.height == -1) {
                    i5 = MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                } else {
                    i5 = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                childAt.measure(mode, i5);
                mode = childAt.getMeasuredWidth();
                i6 = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && i6 > i3) {
                    i3 = Math.min(i6, paddingTop);
                }
                i4 -= mode;
                z = i4 < 0;
                layoutParams.f1845b = z;
                z |= z2;
                if (layoutParams.f1845b) {
                    slidingPaneLayout.f1851a = childAt;
                }
                z2 = z;
            }
            size2++;
            z = false;
        }
        if (z2 || f > 0.0f) {
            mode = paddingLeft - slidingPaneLayout.f1862m;
            mode2 = 0;
            while (mode2 < childCount) {
                int i7;
                View childAt2 = getChildAt(mode2);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        Object obj = (layoutParams2.width != 0 || layoutParams2.f1844a <= 0.0f) ? null : 1;
                        if (obj != null) {
                            i6 = 0;
                        } else {
                            i6 = childAt2.getMeasuredWidth();
                        }
                        int i8;
                        if (!z2 || childAt2 == slidingPaneLayout.f1851a) {
                            if (layoutParams2.f1844a > 0.0f) {
                                int makeMeasureSpec;
                                if (layoutParams2.width != 0) {
                                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                } else if (layoutParams2.height == -2) {
                                    i5 = MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    if (z2) {
                                        i7 = mode;
                                        childAt2.measure(MeasureSpec.makeMeasureSpec(i6 + ((int) ((layoutParams2.f1844a * ((float) Math.max(0, i4))) / f)), 1073741824), i5);
                                        mode2++;
                                        mode = i7;
                                        i5 = 8;
                                    } else {
                                        i8 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                        i7 = mode;
                                        mode = MeasureSpec.makeMeasureSpec(i8, 1073741824);
                                        if (i6 != i8) {
                                            childAt2.measure(mode, i5);
                                        }
                                        mode2++;
                                        mode = i7;
                                        i5 = 8;
                                    }
                                } else if (layoutParams2.height == -1) {
                                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                                }
                                i5 = makeMeasureSpec;
                                if (z2) {
                                    i7 = mode;
                                    childAt2.measure(MeasureSpec.makeMeasureSpec(i6 + ((int) ((layoutParams2.f1844a * ((float) Math.max(0, i4))) / f)), 1073741824), i5);
                                    mode2++;
                                    mode = i7;
                                    i5 = 8;
                                } else {
                                    i8 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    i7 = mode;
                                    mode = MeasureSpec.makeMeasureSpec(i8, 1073741824);
                                    if (i6 != i8) {
                                        childAt2.measure(mode, i5);
                                    }
                                    mode2++;
                                    mode = i7;
                                    i5 = 8;
                                }
                            }
                        } else if (layoutParams2.width < 0 && (i6 > mode || layoutParams2.f1844a > 0.0f)) {
                            int i9;
                            if (obj == null) {
                                i9 = 1073741824;
                                i8 = MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            } else if (layoutParams2.height == -2) {
                                i8 = MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                i9 = 1073741824;
                            } else if (layoutParams2.height == -1) {
                                i9 = 1073741824;
                                i8 = MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                            } else {
                                i9 = 1073741824;
                                i8 = MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                            }
                            childAt2.measure(MeasureSpec.makeMeasureSpec(mode, i9), i8);
                        }
                    }
                }
                i7 = mode;
                mode2++;
                mode = i7;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, (i3 + getPaddingTop()) + getPaddingBottom());
        slidingPaneLayout.f1863n = z2;
        if (slidingPaneLayout.f1855e.m2511a() != 0 && !z2) {
            slidingPaneLayout.f1855e.m2532f();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SlidingPaneLayout slidingPaneLayout = this;
        boolean f = m2338f();
        if (f) {
            slidingPaneLayout.f1855e.m2513a(2);
        } else {
            slidingPaneLayout.f1855e.m2513a(1);
        }
        int i5 = i3 - i;
        int paddingRight = f ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = f ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (slidingPaneLayout.f1869t) {
            float f2 = (slidingPaneLayout.f1863n && slidingPaneLayout.f1856f) ? 1.0f : 0.0f;
            slidingPaneLayout.f1852b = f2;
        }
        int i6 = paddingRight;
        int i7 = i6;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt = getChildAt(paddingRight);
            if (childAt.getVisibility() != 8) {
                int min;
                int i8;
                int i9;
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f1845b) {
                    int i10 = i5 - paddingLeft;
                    min = (Math.min(i6, i10 - slidingPaneLayout.f1862m) - i7) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    slidingPaneLayout.f1853c = min;
                    i8 = f ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.f1846c = ((i7 + i8) + min) + (measuredWidth / 2) > i10;
                    i10 = (int) (((float) min) * slidingPaneLayout.f1852b);
                    i8 = (i8 + i10) + i7;
                    slidingPaneLayout.f1852b = ((float) i10) / ((float) slidingPaneLayout.f1853c);
                } else if (!slidingPaneLayout.f1863n || slidingPaneLayout.f1865p == 0) {
                    i8 = i6;
                } else {
                    i9 = (int) ((1.0f - slidingPaneLayout.f1852b) * ((float) slidingPaneLayout.f1865p));
                    i8 = i6;
                    if (f) {
                        i9 = i8 - i9;
                        min = i9 + measuredWidth;
                    } else {
                        min = (i5 - i8) + i9;
                        i9 = min - measuredWidth;
                    }
                    childAt.layout(i9, paddingTop, min, childAt.getMeasuredHeight() + paddingTop);
                    i6 += childAt.getWidth();
                    i7 = i8;
                }
                i9 = 0;
                if (f) {
                    i9 = i8 - i9;
                    min = i9 + measuredWidth;
                } else {
                    min = (i5 - i8) + i9;
                    i9 = min - measuredWidth;
                }
                childAt.layout(i9, paddingTop, min, childAt.getMeasuredHeight() + paddingTop);
                i6 += childAt.getWidth();
                i7 = i8;
            }
        }
        if (slidingPaneLayout.f1869t) {
            if (slidingPaneLayout.f1863n) {
                if (slidingPaneLayout.f1865p != 0) {
                    m2321a(slidingPaneLayout.f1852b);
                }
                if (((LayoutParams) slidingPaneLayout.f1851a.getLayoutParams()).f1846c) {
                    m2322a(slidingPaneLayout.f1851a, slidingPaneLayout.f1852b, slidingPaneLayout.f1858i);
                }
            } else {
                for (int i11 = 0; i11 < childCount; i11++) {
                    m2322a(getChildAt(i11), 0.0f, slidingPaneLayout.f1858i);
                }
            }
            m2334d(slidingPaneLayout.f1851a);
        }
        slidingPaneLayout.f1869t = false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f1869t = true;
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() == null && this.f1863n == null) {
            this.f1856f = view == this.f1851a ? true : null;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (!this.f1863n && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.f1856f = this.f1855e.m2524b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY()) ^ true;
            }
        }
        if (this.f1863n) {
            if (!this.f1854d || actionMasked == 0) {
                if (actionMasked != 3) {
                    if (actionMasked != 1) {
                        Object obj;
                        float x;
                        float y;
                        if (actionMasked == 0) {
                            this.f1854d = false;
                            x = motionEvent.getX();
                            y = motionEvent.getY();
                            this.f1866q = x;
                            this.f1867r = y;
                            if (this.f1855e.m2524b(this.f1851a, (int) x, (int) y) && m2339f(this.f1851a)) {
                                obj = 1;
                                if (this.f1855e.m2516a(motionEvent) == null) {
                                    if (obj != null) {
                                        z = false;
                                    }
                                }
                                return z;
                            }
                        } else if (actionMasked == 2) {
                            x = motionEvent.getX();
                            y = motionEvent.getY();
                            x = Math.abs(x - this.f1866q);
                            y = Math.abs(y - this.f1867r);
                            if (x > ((float) this.f1855e.m2528d()) && y > x) {
                                this.f1855e.m2531e();
                                this.f1854d = true;
                                return false;
                            }
                        }
                        obj = null;
                        if (this.f1855e.m2516a(motionEvent) == null) {
                            if (obj != null) {
                                z = false;
                            }
                        }
                        return z;
                    }
                }
                this.f1855e.m2531e();
                return false;
            }
        }
        this.f1855e.m2531e();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1863n) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1855e.m2520b(motionEvent);
        float x;
        switch (motionEvent.getActionMasked()) {
            case 0:
                x = motionEvent.getX();
                motionEvent = motionEvent.getY();
                this.f1866q = x;
                this.f1867r = motionEvent;
                break;
            case 1:
                if (m2339f(this.f1851a)) {
                    x = motionEvent.getX();
                    motionEvent = motionEvent.getY();
                    float f = x - this.f1866q;
                    float f2 = motionEvent - this.f1867r;
                    int d = this.f1855e.m2528d();
                    if ((f * f) + (f2 * f2) < ((float) (d * d)) && this.f1855e.m2524b(this.f1851a, (int) x, (int) motionEvent) != null) {
                        m2323a(this.f1851a, 0);
                        break;
                    }
                }
                break;
            default:
                break;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m2323a(View view, int i) {
        if (this.f1869t == null) {
            if (m2329a((float) null, i) == null) {
                return false;
            }
        }
        this.f1856f = false;
        return true;
    }

    /* renamed from: b */
    private boolean m2324b(View view, int i) {
        if (this.f1869t == null) {
            if (m2329a(1.0f, i) == null) {
                return null;
            }
        }
        this.f1856f = true;
        return true;
    }

    /* renamed from: b */
    public boolean m2331b() {
        return m2324b(this.f1851a, 0);
    }

    /* renamed from: c */
    public boolean m2333c() {
        return m2323a(this.f1851a, 0);
    }

    /* renamed from: d */
    public boolean m2335d() {
        if (this.f1863n) {
            if (this.f1852b != 1.0f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public boolean m2337e() {
        return this.f1863n;
    }

    /* renamed from: a */
    void m2327a(int i) {
        if (this.f1851a == null) {
            this.f1852b = 0;
            return;
        }
        boolean f = m2338f();
        LayoutParams layoutParams = (LayoutParams) this.f1851a.getLayoutParams();
        int width = this.f1851a.getWidth();
        if (f) {
            i = (getWidth() - i) - width;
        }
        this.f1852b = ((float) (i - ((f ? getPaddingRight() : getPaddingLeft()) + (f ? layoutParams.rightMargin : layoutParams.leftMargin)))) / ((float) this.f1853c);
        if (this.f1865p != 0) {
            m2321a(this.f1852b);
        }
        if (layoutParams.f1846c != 0) {
            m2322a(this.f1851a, this.f1852b, this.f1858i);
        }
        m2328a(this.f1851a);
    }

    /* renamed from: a */
    private void m2322a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            f = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (layoutParams.f1847d == 0) {
                layoutParams.f1847d = new Paint();
            }
            layoutParams.f1847d.setColorFilter(new PorterDuffColorFilter(f, Mode.SRC_OVER));
            if (view.getLayerType() != 2.8E-45f) {
                view.setLayerType(2, layoutParams.f1847d);
            }
            m2336e(view);
        } else if (view.getLayerType() != null) {
            if (layoutParams.f1847d != null) {
                layoutParams.f1847d.setColorFilter(0);
            }
            Runnable c0581b = new C0581b(this, view);
            this.f1857g.add(c0581b);
            C0560r.m2178a((View) this, c0581b);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (!(!this.f1863n || layoutParams.f1845b || this.f1851a == null)) {
            canvas.getClipBounds(this.f1870u);
            if (m2338f()) {
                this.f1870u.left = Math.max(this.f1870u.left, this.f1851a.getRight());
            } else {
                this.f1870u.right = Math.min(this.f1870u.right, this.f1851a.getLeft());
            }
            canvas.clipRect(this.f1870u);
        }
        view = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return view;
    }

    /* renamed from: e */
    void m2336e(View view) {
        f1850h.mo460a(this, view);
    }

    /* renamed from: a */
    boolean m2329a(float f, int i) {
        if (this.f1863n == 0) {
            return false;
        }
        int width;
        LayoutParams layoutParams = (LayoutParams) this.f1851a.getLayoutParams();
        if (m2338f() != 0) {
            width = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f1853c))) + ((float) this.f1851a.getWidth())));
        } else {
            width = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f1853c)));
        }
        if (this.f1855e.m2517a(this.f1851a, width, this.f1851a.getTop()) == null) {
            return false;
        }
        m2326a();
        C0560r.m2189c(this);
        return true;
    }

    public void computeScroll() {
        if (this.f1855e.m2518a(true)) {
            if (this.f1863n) {
                C0560r.m2189c(this);
            } else {
                this.f1855e.m2532f();
            }
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f1860k = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f1861l = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0389b.m1429a(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0389b.m1429a(getContext(), i));
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        if (m2338f()) {
            drawable = this.f1861l;
        } else {
            drawable = this.f1860k;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null) {
            if (drawable != null) {
                int right;
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (m2338f()) {
                    right = childAt.getRight();
                    intrinsicWidth += right;
                } else {
                    right = childAt.getLeft();
                    int i = right - intrinsicWidth;
                    intrinsicWidth = right;
                    right = i;
                }
                drawable.setBounds(right, top, intrinsicWidth, bottom);
                drawable.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m2321a(float f) {
        Object obj;
        int childCount;
        int i;
        View childAt;
        int i2;
        boolean f2 = m2338f();
        LayoutParams layoutParams = (LayoutParams) this.f1851a.getLayoutParams();
        if (layoutParams.f1846c) {
            if ((f2 ? layoutParams.rightMargin : layoutParams.leftMargin) <= 0) {
                obj = 1;
                childCount = getChildCount();
                for (i = 0; i < childCount; i++) {
                    childAt = getChildAt(i);
                    if (childAt == this.f1851a) {
                        i2 = (int) ((1.0f - this.f1864o) * ((float) this.f1865p));
                        this.f1864o = f;
                        i2 -= (int) ((1.0f - f) * ((float) this.f1865p));
                        if (f2) {
                            i2 = -i2;
                        }
                        childAt.offsetLeftAndRight(i2);
                        if (obj == null) {
                            m2322a(childAt, f2 ? this.f1864o - 1.0f : 1.0f - this.f1864o, this.f1859j);
                        }
                    }
                }
            }
        }
        obj = null;
        childCount = getChildCount();
        for (i = 0; i < childCount; i++) {
            childAt = getChildAt(i);
            if (childAt == this.f1851a) {
                i2 = (int) ((1.0f - this.f1864o) * ((float) this.f1865p));
                this.f1864o = f;
                i2 -= (int) ((1.0f - f) * ((float) this.f1865p));
                if (f2) {
                    i2 = -i2;
                }
                childAt.offsetLeftAndRight(i2);
                if (obj == null) {
                    if (f2) {
                    }
                    m2322a(childAt, f2 ? this.f1864o - 1.0f : 1.0f - this.f1864o, this.f1859j);
                }
            }
        }
    }

    /* renamed from: f */
    boolean m2339f(View view) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f1863n && layoutParams.f1846c != null && this.f1852b > 0.0f) {
            z = true;
        }
        return z;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (!(layoutParams instanceof LayoutParams) || super.checkLayoutParams(layoutParams) == null) ? null : true;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13333a = m2337e() ? m2335d() : this.f1856f;
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.m1885a());
            if (savedState.f13333a) {
                m2331b();
            } else {
                m2333c();
            }
            this.f1856f = savedState.f13333a;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* renamed from: f */
    boolean m2338f() {
        return C0560r.m2193e(this) == 1;
    }
}
