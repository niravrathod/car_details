package android.support.v4.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.content.C0389b;
import android.support.v4.view.p018a.C0532b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    /* renamed from: a */
    static final int[] f1648a = new int[]{16842931};
    private static final C0524h ai = new C0524h();
    /* renamed from: e */
    private static final Comparator<C0519b> f1649e = new C05141();
    /* renamed from: f */
    private static final Interpolator f1650f = new C05152();
    /* renamed from: A */
    private int f1651A = 1;
    /* renamed from: B */
    private boolean f1652B;
    /* renamed from: C */
    private boolean f1653C;
    /* renamed from: D */
    private int f1654D;
    /* renamed from: E */
    private int f1655E;
    /* renamed from: F */
    private int f1656F;
    /* renamed from: G */
    private float f1657G;
    /* renamed from: H */
    private float f1658H;
    /* renamed from: I */
    private float f1659I;
    /* renamed from: J */
    private float f1660J;
    /* renamed from: K */
    private int f1661K = -1;
    /* renamed from: L */
    private VelocityTracker f1662L;
    /* renamed from: M */
    private int f1663M;
    /* renamed from: N */
    private int f1664N;
    /* renamed from: O */
    private int f1665O;
    /* renamed from: P */
    private int f1666P;
    /* renamed from: Q */
    private boolean f1667Q;
    /* renamed from: R */
    private EdgeEffect f1668R;
    /* renamed from: S */
    private EdgeEffect f1669S;
    /* renamed from: T */
    private boolean f1670T = true;
    /* renamed from: U */
    private boolean f1671U = false;
    /* renamed from: V */
    private boolean f1672V;
    /* renamed from: W */
    private int f1673W;
    private List<C0521e> aa;
    private C0521e ab;
    private C0521e ac;
    private List<C0520d> ad;
    private C0522f ae;
    private int af;
    private int ag;
    private ArrayList<View> ah;
    private final Runnable aj = new C05163(this);
    private int ak = 0;
    /* renamed from: b */
    C0555o f1674b;
    /* renamed from: c */
    int f1675c;
    /* renamed from: d */
    private int f1676d;
    /* renamed from: g */
    private final ArrayList<C0519b> f1677g = new ArrayList();
    /* renamed from: h */
    private final C0519b f1678h = new C0519b();
    /* renamed from: i */
    private final Rect f1679i = new Rect();
    /* renamed from: j */
    private int f1680j = -1;
    /* renamed from: k */
    private Parcelable f1681k = null;
    /* renamed from: l */
    private ClassLoader f1682l = null;
    /* renamed from: m */
    private Scroller f1683m;
    /* renamed from: n */
    private boolean f1684n;
    /* renamed from: o */
    private C0523g f1685o;
    /* renamed from: p */
    private int f1686p;
    /* renamed from: q */
    private Drawable f1687q;
    /* renamed from: r */
    private int f1688r;
    /* renamed from: s */
    private int f1689s;
    /* renamed from: t */
    private float f1690t = -3.4028235E38f;
    /* renamed from: u */
    private float f1691u = Float.MAX_VALUE;
    /* renamed from: v */
    private int f1692v;
    /* renamed from: w */
    private int f1693w;
    /* renamed from: x */
    private boolean f1694x;
    /* renamed from: y */
    private boolean f1695y;
    /* renamed from: z */
    private boolean f1696z;

    /* renamed from: android.support.v4.view.ViewPager$1 */
    static class C05141 implements Comparator<C0519b> {
        C05141() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m1889a((C0519b) obj, (C0519b) obj2);
        }

        /* renamed from: a */
        public int m1889a(C0519b c0519b, C0519b c0519b2) {
            return c0519b.f1643b - c0519b2.f1643b;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$2 */
    static class C05152 implements Interpolator {
        public float getInterpolation(float f) {
            f -= 1.0f;
            return ((((f * f) * f) * f) * f) + 1.0f;
        }

        C05152() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$3 */
    class C05163 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ViewPager f1635a;

        C05163(ViewPager viewPager) {
            this.f1635a = viewPager;
        }

        public void run() {
            this.f1635a.setScrollState(0);
            this.f1635a.m1939c();
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        /* renamed from: a */
        public boolean f1636a;
        /* renamed from: b */
        public int f1637b;
        /* renamed from: c */
        float f1638c = 0.0f;
        /* renamed from: d */
        boolean f1639d;
        /* renamed from: e */
        int f1640e;
        /* renamed from: f */
        int f1641f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, ViewPager.f1648a);
            this.f1637b = context.getInteger(null, 48);
            context.recycle();
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.v4.view.ViewPager$a */
    public @interface C0518a {
    }

    /* renamed from: android.support.v4.view.ViewPager$b */
    static class C0519b {
        /* renamed from: a */
        Object f1642a;
        /* renamed from: b */
        int f1643b;
        /* renamed from: c */
        boolean f1644c;
        /* renamed from: d */
        float f1645d;
        /* renamed from: e */
        float f1646e;

        C0519b() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$d */
    public interface C0520d {
        /* renamed from: a */
        void mo136a(ViewPager viewPager, C0555o c0555o, C0555o c0555o2);
    }

    /* renamed from: android.support.v4.view.ViewPager$e */
    public interface C0521e {
        /* renamed from: a */
        void mo137a(int i);

        /* renamed from: a */
        void mo138a(int i, float f, int i2);

        /* renamed from: b */
        void mo139b(int i);
    }

    /* renamed from: android.support.v4.view.ViewPager$f */
    public interface C0522f {
        /* renamed from: a */
        void m1897a(View view, float f);
    }

    /* renamed from: android.support.v4.view.ViewPager$g */
    private class C0523g extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ ViewPager f1647a;

        C0523g(ViewPager viewPager) {
            this.f1647a = viewPager;
        }

        public void onChanged() {
            this.f1647a.m1935b();
        }

        public void onInvalidated() {
            this.f1647a.m1935b();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$h */
    static class C0524h implements Comparator<View> {
        C0524h() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m1898a((View) obj, (View) obj2);
        }

        /* renamed from: a */
        public int m1898a(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f1636a == layoutParams2.f1636a) {
                return layoutParams.f1640e - layoutParams2.f1640e;
            }
            return layoutParams.f1636a != null ? true : -1;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$4 */
    class C31584 implements C0554n {
        /* renamed from: a */
        final /* synthetic */ ViewPager f13311a;
        /* renamed from: b */
        private final Rect f13312b = new Rect();

        C31584(ViewPager viewPager) {
            this.f13311a = viewPager;
        }

        /* renamed from: a */
        public C0571z mo88a(View view, C0571z c0571z) {
            C0571z a = C0560r.m2165a(view, c0571z);
            if (a.m2257f() != null) {
                return a;
            }
            c0571z = this.f13312b;
            c0571z.left = a.m2251a();
            c0571z.top = a.m2253b();
            c0571z.right = a.m2254c();
            c0571z.bottom = a.m2255d();
            int childCount = this.f13311a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0571z b = C0560r.m2183b(this.f13311a.getChildAt(i), a);
                c0571z.left = Math.min(b.m2251a(), c0571z.left);
                c0571z.top = Math.min(b.m2253b(), c0571z.top);
                c0571z.right = Math.min(b.m2254c(), c0571z.right);
                c0571z.bottom = Math.min(b.m2255d(), c0571z.bottom);
            }
            return a.m2252a(c0571z.left, c0571z.top, c0571z.right, c0571z.bottom);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C05171();
        /* renamed from: a */
        int f13313a;
        /* renamed from: b */
        Parcelable f13314b;
        /* renamed from: c */
        ClassLoader f13315c;

        /* renamed from: android.support.v4.view.ViewPager$SavedState$1 */
        static class C05171 implements ClassLoaderCreator<SavedState> {
            C05171() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1890a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m1891a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1892a(i);
            }

            /* renamed from: a */
            public SavedState m1891a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m1890a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m1892a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13313a);
            parcel.writeParcelable(this.f13314b, i);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FragmentPager.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" position=");
            stringBuilder.append(this.f13313a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f13313a = parcel.readInt();
            this.f13314b = parcel.readParcelable(classLoader);
            this.f13315c = classLoader;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$c */
    class C3159c extends C0536a {
        /* renamed from: a */
        final /* synthetic */ ViewPager f13316a;

        C3159c(ViewPager viewPager) {
            this.f13316a = viewPager;
        }

        /* renamed from: a */
        public void mo119a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo119a(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m15761b());
            if (accessibilityEvent.getEventType() == 4096 && this.f13316a.f1674b != null) {
                accessibilityEvent.setItemCount(this.f13316a.f1674b.mo1187b());
                accessibilityEvent.setFromIndex(this.f13316a.f1675c);
                accessibilityEvent.setToIndex(this.f13316a.f1675c);
            }
        }

        /* renamed from: a */
        public void mo87a(View view, C0532b c0532b) {
            super.mo87a(view, c0532b);
            c0532b.m1965b(ViewPager.class.getName());
            c0532b.m1991k(m15761b());
            if (this.f13316a.canScrollHorizontally(1) != null) {
                c0532b.m1954a(4096);
            }
            if (this.f13316a.canScrollHorizontally(-1) != null) {
                c0532b.m1954a(8192);
            }
        }

        /* renamed from: a */
        public boolean mo439a(View view, int i, Bundle bundle) {
            if (super.mo439a(view, i, bundle) != null) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || this.f13316a.canScrollHorizontally(-1) == null) {
                    return false;
                }
                this.f13316a.setCurrentItem(this.f13316a.f1675c - 1);
                return true;
            } else if (this.f13316a.canScrollHorizontally(1) == null) {
                return false;
            } else {
                this.f13316a.setCurrentItem(this.f13316a.f1675c + 1);
                return true;
            }
        }

        /* renamed from: b */
        private boolean m15761b() {
            return this.f13316a.f1674b != null && this.f13316a.f1674b.mo1187b() > 1;
        }
    }

    public ViewPager(Context context) {
        super(context);
        m1923a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1923a();
    }

    /* renamed from: a */
    void m1923a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f1683m = new Scroller(context, f1650f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1656F = viewConfiguration.getScaledPagingTouchSlop();
        this.f1663M = (int) (400.0f * f);
        this.f1664N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1668R = new EdgeEffect(context);
        this.f1669S = new EdgeEffect(context);
        this.f1665O = (int) (25.0f * f);
        this.f1666P = (int) (2.0f * f);
        this.f1654D = (int) (f * 16.0f);
        C0560r.m2175a((View) this, new C3159c(this));
        if (C0560r.m2191d(this) == 0) {
            C0560r.m2167a((View) this, 1);
        }
        C0560r.m2176a((View) this, new C31584(this));
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.aj);
        if (!(this.f1683m == null || this.f1683m.isFinished())) {
            this.f1683m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    void setScrollState(int i) {
        if (this.ak != i) {
            this.ak = i;
            if (this.ae != null) {
                m1908b(i != 0);
            }
            m1915f(i);
        }
    }

    public void setAdapter(C0555o c0555o) {
        int i = 0;
        if (this.f1674b != null) {
            this.f1674b.m2104c(null);
            this.f1674b.mo311a((ViewGroup) this);
            for (int i2 = 0; i2 < this.f1677g.size(); i2++) {
                C0519b c0519b = (C0519b) this.f1677g.get(i2);
                this.f1674b.mo312a((ViewGroup) this, c0519b.f1643b, c0519b.f1642a);
            }
            this.f1674b.mo314b((ViewGroup) this);
            this.f1677g.clear();
            m1914f();
            this.f1675c = 0;
            scrollTo(0, 0);
        }
        C0555o c0555o2 = this.f1674b;
        this.f1674b = c0555o;
        this.f1676d = 0;
        if (this.f1674b != null) {
            if (this.f1685o == null) {
                this.f1685o = new C0523g(this);
            }
            this.f1674b.m2104c(this.f1685o);
            this.f1696z = false;
            boolean z = this.f1670T;
            this.f1670T = true;
            this.f1676d = this.f1674b.mo1187b();
            if (this.f1680j >= 0) {
                this.f1674b.mo310a(this.f1681k, this.f1682l);
                m1927a(this.f1680j, false, true);
                this.f1680j = -1;
                this.f1681k = null;
                this.f1682l = null;
            } else if (z) {
                requestLayout();
            } else {
                m1939c();
            }
        }
        if (this.ad != null && !this.ad.isEmpty()) {
            int size = this.ad.size();
            while (i < size) {
                ((C0520d) this.ad.get(i)).mo136a(this, c0555o2, c0555o);
                i++;
            }
        }
    }

    /* renamed from: f */
    private void m1914f() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f1636a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public C0555o getAdapter() {
        return this.f1674b;
    }

    /* renamed from: a */
    public void m1929a(C0520d c0520d) {
        if (this.ad == null) {
            this.ad = new ArrayList();
        }
        this.ad.add(c0520d);
    }

    /* renamed from: b */
    public void m1936b(C0520d c0520d) {
        if (this.ad != null) {
            this.ad.remove(c0520d);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.f1696z = false;
        m1927a(i, this.f1670T ^ 1, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.f1696z = false;
        m1927a(i, z, false);
    }

    public int getCurrentItem() {
        return this.f1675c;
    }

    /* renamed from: a */
    void m1927a(int i, boolean z, boolean z2) {
        m1928a(i, z, z2, 0);
    }

    /* renamed from: a */
    void m1928a(int i, boolean z, boolean z2, int i2) {
        if (this.f1674b != null) {
            if (this.f1674b.mo1187b() > 0) {
                if (!z2 && this.f1675c == i && this.f1677g.size()) {
                    setScrollingCacheEnabled(false);
                    return;
                }
                z2 = true;
                if (i < 0) {
                    i = 0;
                } else if (i >= this.f1674b.mo1187b()) {
                    i = this.f1674b.mo1187b() - 1;
                }
                int i3 = this.f1651A;
                if (i > this.f1675c + i3 || i < this.f1675c - i3) {
                    for (i3 = 0; i3 < this.f1677g.size(); i3++) {
                        ((C0519b) this.f1677g.get(i3)).f1644c = true;
                    }
                }
                if (this.f1675c == i) {
                    z2 = false;
                }
                if (this.f1670T) {
                    this.f1675c = i;
                    if (z2) {
                        m1913e(i);
                    }
                    requestLayout();
                } else {
                    m1924a(i);
                    m1902a(i, z, i2, z2);
                }
                return;
            }
        }
        setScrollingCacheEnabled(false);
    }

    /* renamed from: a */
    private void m1902a(int i, boolean z, int i2, boolean z2) {
        C0519b b = m1933b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f1690t, Math.min(b.f1646e, this.f1691u))) : 0;
        if (z) {
            m1926a(clientWidth, 0, i2);
            if (z2) {
                m1913e(i);
                return;
            }
            return;
        }
        if (z2) {
            m1913e(i);
        }
        m1905a(false);
        scrollTo(clientWidth, 0);
        m1912d(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(C0521e c0521e) {
        this.ab = c0521e;
    }

    /* renamed from: a */
    public void m1930a(C0521e c0521e) {
        if (this.aa == null) {
            this.aa = new ArrayList();
        }
        this.aa.add(c0521e);
    }

    /* renamed from: b */
    public void m1937b(C0521e c0521e) {
        if (this.aa != null) {
            this.aa.remove(c0521e);
        }
    }

    public void setPageTransformer(boolean z, C0522f c0522f) {
        setPageTransformer(z, c0522f, 2);
    }

    public void setPageTransformer(boolean z, C0522f c0522f, int i) {
        int i2 = 1;
        boolean z2 = c0522f != null;
        Object obj = z2 != (this.ae != null) ? 1 : null;
        this.ae = c0522f;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.ag = i2;
            this.af = i;
        } else {
            this.ag = 0;
        }
        if (obj != null) {
            m1939c();
        }
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ag == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.ah.get(i2)).getLayoutParams()).f1641f;
    }

    /* renamed from: c */
    C0521e m1938c(C0521e c0521e) {
        C0521e c0521e2 = this.ac;
        this.ac = c0521e;
        return c0521e2;
    }

    public int getOffscreenPageLimit() {
        return this.f1651A;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Requested offscreen page limit ");
            stringBuilder.append(i);
            stringBuilder.append(" too small; defaulting to ");
            stringBuilder.append(1);
            Log.w("ViewPager", stringBuilder.toString());
            i = 1;
        }
        if (i != this.f1651A) {
            this.f1651A = i;
            m1939c();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f1686p;
        this.f1686p = i;
        int width = getWidth();
        m1901a(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.f1686p;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1687q = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null ? true : null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0389b.m1429a(getContext(), i));
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.f1687q) {
                return null;
            }
        }
        return true;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1687q;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: a */
    float m1920a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: a */
    void m1926a(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int currX;
        Object obj = (this.f1683m == null || this.f1683m.isFinished()) ? null : 1;
        if (obj != null) {
            currX = this.f1684n ? this.f1683m.getCurrX() : this.f1683m.getStartX();
            this.f1683m.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            currX = getScrollX();
        }
        int i4 = currX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m1905a(false);
            m1939c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        i = getClientWidth();
        i2 = i / 2;
        i = (float) i;
        i2 = (float) i2;
        i2 += m1920a(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / i)) * i2;
        i3 = Math.abs(i3);
        if (i3 > 0) {
            i = Math.round(Math.abs(i2 / ((float) i3)) * 1148846080) * 4;
        } else {
            i = (int) (((((float) Math.abs(i5)) / ((i * this.f1674b.m2105d(this.f1675c)) + ((float) this.f1686p))) + 1065353216) * 1120403456);
        }
        int min = Math.min(i, 600);
        this.f1684n = false;
        this.f1683m.startScroll(i4, scrollY, i5, i6, min);
        C0560r.m2189c(this);
    }

    /* renamed from: a */
    C0519b m1921a(int i, int i2) {
        C0519b c0519b = new C0519b();
        c0519b.f1643b = i;
        c0519b.f1642a = this.f1674b.mo309a((ViewGroup) this, i);
        c0519b.f1645d = this.f1674b.m2105d(i);
        if (i2 >= 0) {
            if (i2 < this.f1677g.size()) {
                this.f1677g.add(i2, c0519b);
                return c0519b;
            }
        }
        this.f1677g.add(c0519b);
        return c0519b;
    }

    /* renamed from: b */
    void m1935b() {
        int b = this.f1674b.mo1187b();
        this.f1676d = b;
        Object obj = (this.f1677g.size() >= (this.f1651A * 2) + 1 || this.f1677g.size() >= b) ? null : 1;
        Object obj2 = obj;
        int i = this.f1675c;
        int i2 = 0;
        Object obj3 = null;
        while (i2 < this.f1677g.size()) {
            C0519b c0519b = (C0519b) this.f1677g.get(i2);
            int a = this.f1674b.m2086a(c0519b.f1642a);
            if (a != -1) {
                if (a == -2) {
                    this.f1677g.remove(i2);
                    i2--;
                    if (obj3 == null) {
                        this.f1674b.mo311a((ViewGroup) this);
                        obj3 = 1;
                    }
                    this.f1674b.mo312a((ViewGroup) this, c0519b.f1643b, c0519b.f1642a);
                    if (this.f1675c == c0519b.f1643b) {
                        i = Math.max(0, Math.min(this.f1675c, b - 1));
                    }
                } else if (c0519b.f1643b != a) {
                    if (c0519b.f1643b == this.f1675c) {
                        i = a;
                    }
                    c0519b.f1643b = a;
                }
                obj2 = 1;
            }
            i2++;
        }
        if (obj3 != null) {
            this.f1674b.mo314b((ViewGroup) this);
        }
        Collections.sort(this.f1677g, f1649e);
        if (obj2 != null) {
            b = getChildCount();
            for (i2 = 0; i2 < b; i2++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                if (!layoutParams.f1636a) {
                    layoutParams.f1638c = 0.0f;
                }
            }
            m1927a(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: c */
    void m1939c() {
        m1924a(this.f1675c);
    }

    /* renamed from: a */
    void m1924a(int r18) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r0.f1675c;
        if (r2 == r1) goto L_0x0011;
    L_0x0008:
        r2 = r0.f1675c;
        r2 = r0.m1933b(r2);
        r0.f1675c = r1;
        goto L_0x0012;
    L_0x0011:
        r2 = 0;
    L_0x0012:
        r1 = r0.f1674b;
        if (r1 != 0) goto L_0x001a;
    L_0x0016:
        r17.m1916g();
        return;
    L_0x001a:
        r1 = r0.f1696z;
        if (r1 == 0) goto L_0x0022;
    L_0x001e:
        r17.m1916g();
        return;
    L_0x0022:
        r1 = r17.getWindowToken();
        if (r1 != 0) goto L_0x0029;
    L_0x0028:
        return;
    L_0x0029:
        r1 = r0.f1674b;
        r1.mo311a(r0);
        r1 = r0.f1651A;
        r4 = r0.f1675c;
        r4 = r4 - r1;
        r5 = 0;
        r4 = java.lang.Math.max(r5, r4);
        r6 = r0.f1674b;
        r6 = r6.mo1187b();
        r7 = r6 + -1;
        r8 = r0.f1675c;
        r8 = r8 + r1;
        r1 = java.lang.Math.min(r7, r8);
        r7 = r0.f1676d;
        if (r6 != r7) goto L_0x0216;
    L_0x004b:
        r7 = 0;
    L_0x004c:
        r8 = r0.f1677g;
        r8 = r8.size();
        if (r7 >= r8) goto L_0x006c;
    L_0x0054:
        r8 = r0.f1677g;
        r8 = r8.get(r7);
        r8 = (android.support.v4.view.ViewPager.C0519b) r8;
        r9 = r8.f1643b;
        r10 = r0.f1675c;
        if (r9 < r10) goto L_0x0069;
    L_0x0062:
        r9 = r8.f1643b;
        r10 = r0.f1675c;
        if (r9 != r10) goto L_0x006c;
    L_0x0068:
        goto L_0x006d;
    L_0x0069:
        r7 = r7 + 1;
        goto L_0x004c;
    L_0x006c:
        r8 = 0;
    L_0x006d:
        if (r8 != 0) goto L_0x0077;
    L_0x006f:
        if (r6 <= 0) goto L_0x0077;
    L_0x0071:
        r8 = r0.f1675c;
        r8 = r0.m1921a(r8, r7);
    L_0x0077:
        r9 = 0;
        if (r8 == 0) goto L_0x01a3;
    L_0x007a:
        r10 = r7 + -1;
        if (r10 < 0) goto L_0x0087;
    L_0x007e:
        r11 = r0.f1677g;
        r11 = r11.get(r10);
        r11 = (android.support.v4.view.ViewPager.C0519b) r11;
        goto L_0x0088;
    L_0x0087:
        r11 = 0;
    L_0x0088:
        r12 = r17.getClientWidth();
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 > 0) goto L_0x0092;
    L_0x0090:
        r3 = 0;
        goto L_0x009f;
    L_0x0092:
        r14 = r8.f1645d;
        r14 = r13 - r14;
        r15 = r17.getPaddingLeft();
        r15 = (float) r15;
        r3 = (float) r12;
        r15 = r15 / r3;
        r3 = r14 + r15;
    L_0x009f:
        r14 = r0.f1675c;
        r14 = r14 + -1;
        r15 = r7;
        r7 = 0;
    L_0x00a5:
        if (r14 < 0) goto L_0x0105;
    L_0x00a7:
        r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r16 < 0) goto L_0x00d3;
    L_0x00ab:
        if (r14 >= r4) goto L_0x00d3;
    L_0x00ad:
        if (r11 != 0) goto L_0x00b0;
    L_0x00af:
        goto L_0x0105;
    L_0x00b0:
        r5 = r11.f1643b;
        if (r14 != r5) goto L_0x0101;
    L_0x00b4:
        r5 = r11.f1644c;
        if (r5 != 0) goto L_0x0101;
    L_0x00b8:
        r5 = r0.f1677g;
        r5.remove(r10);
        r5 = r0.f1674b;
        r11 = r11.f1642a;
        r5.mo312a(r0, r14, r11);
        r10 = r10 + -1;
        r15 = r15 + -1;
        if (r10 < 0) goto L_0x00ff;
    L_0x00ca:
        r5 = r0.f1677g;
        r5 = r5.get(r10);
        r5 = (android.support.v4.view.ViewPager.C0519b) r5;
        goto L_0x0100;
    L_0x00d3:
        if (r11 == 0) goto L_0x00e9;
    L_0x00d5:
        r5 = r11.f1643b;
        if (r14 != r5) goto L_0x00e9;
    L_0x00d9:
        r5 = r11.f1645d;
        r7 = r7 + r5;
        r10 = r10 + -1;
        if (r10 < 0) goto L_0x00ff;
    L_0x00e0:
        r5 = r0.f1677g;
        r5 = r5.get(r10);
        r5 = (android.support.v4.view.ViewPager.C0519b) r5;
        goto L_0x0100;
    L_0x00e9:
        r5 = r10 + 1;
        r5 = r0.m1921a(r14, r5);
        r5 = r5.f1645d;
        r7 = r7 + r5;
        r15 = r15 + 1;
        if (r10 < 0) goto L_0x00ff;
    L_0x00f6:
        r5 = r0.f1677g;
        r5 = r5.get(r10);
        r5 = (android.support.v4.view.ViewPager.C0519b) r5;
        goto L_0x0100;
    L_0x00ff:
        r5 = 0;
    L_0x0100:
        r11 = r5;
    L_0x0101:
        r14 = r14 + -1;
        r5 = 0;
        goto L_0x00a5;
    L_0x0105:
        r3 = r8.f1645d;
        r4 = r15 + 1;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 >= 0) goto L_0x0197;
    L_0x010d:
        r5 = r0.f1677g;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x011e;
    L_0x0115:
        r5 = r0.f1677g;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.C0519b) r5;
        goto L_0x011f;
    L_0x011e:
        r5 = 0;
    L_0x011f:
        if (r12 > 0) goto L_0x0123;
    L_0x0121:
        r7 = 0;
        goto L_0x012b;
    L_0x0123:
        r7 = r17.getPaddingRight();
        r7 = (float) r7;
        r10 = (float) r12;
        r7 = r7 / r10;
        r7 = r7 + r13;
    L_0x012b:
        r10 = r0.f1675c;
    L_0x012d:
        r10 = r10 + 1;
        if (r10 >= r6) goto L_0x0197;
    L_0x0131:
        r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r11 < 0) goto L_0x0161;
    L_0x0135:
        if (r10 <= r1) goto L_0x0161;
    L_0x0137:
        if (r5 != 0) goto L_0x013a;
    L_0x0139:
        goto L_0x0197;
    L_0x013a:
        r11 = r5.f1643b;
        if (r10 != r11) goto L_0x0196;
    L_0x013e:
        r11 = r5.f1644c;
        if (r11 != 0) goto L_0x0196;
    L_0x0142:
        r11 = r0.f1677g;
        r11.remove(r4);
        r11 = r0.f1674b;
        r5 = r5.f1642a;
        r11.mo312a(r0, r10, r5);
        r5 = r0.f1677g;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x015f;
    L_0x0156:
        r5 = r0.f1677g;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.C0519b) r5;
        goto L_0x0196;
    L_0x015f:
        r5 = 0;
        goto L_0x0196;
    L_0x0161:
        if (r5 == 0) goto L_0x017d;
    L_0x0163:
        r11 = r5.f1643b;
        if (r10 != r11) goto L_0x017d;
    L_0x0167:
        r5 = r5.f1645d;
        r3 = r3 + r5;
        r4 = r4 + 1;
        r5 = r0.f1677g;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x015f;
    L_0x0174:
        r5 = r0.f1677g;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.C0519b) r5;
        goto L_0x0196;
    L_0x017d:
        r5 = r0.m1921a(r10, r4);
        r4 = r4 + 1;
        r5 = r5.f1645d;
        r3 = r3 + r5;
        r5 = r0.f1677g;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x015f;
    L_0x018e:
        r5 = r0.f1677g;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.C0519b) r5;
    L_0x0196:
        goto L_0x012d;
    L_0x0197:
        r0.m1903a(r8, r15, r2);
        r1 = r0.f1674b;
        r2 = r0.f1675c;
        r3 = r8.f1642a;
        r1.mo315b(r0, r2, r3);
    L_0x01a3:
        r1 = r0.f1674b;
        r1.mo314b(r0);
        r1 = r17.getChildCount();
        r2 = 0;
    L_0x01ad:
        if (r2 >= r1) goto L_0x01d6;
    L_0x01af:
        r3 = r0.getChildAt(r2);
        r4 = r3.getLayoutParams();
        r4 = (android.support.v4.view.ViewPager.LayoutParams) r4;
        r4.f1641f = r2;
        r5 = r4.f1636a;
        if (r5 != 0) goto L_0x01d3;
    L_0x01bf:
        r5 = r4.f1638c;
        r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r5 != 0) goto L_0x01d3;
    L_0x01c5:
        r3 = r0.m1922a(r3);
        if (r3 == 0) goto L_0x01d3;
    L_0x01cb:
        r5 = r3.f1645d;
        r4.f1638c = r5;
        r3 = r3.f1643b;
        r4.f1640e = r3;
    L_0x01d3:
        r2 = r2 + 1;
        goto L_0x01ad;
    L_0x01d6:
        r17.m1916g();
        r1 = r17.hasFocus();
        if (r1 == 0) goto L_0x0215;
    L_0x01df:
        r1 = r17.findFocus();
        if (r1 == 0) goto L_0x01ea;
    L_0x01e5:
        r3 = r0.m1934b(r1);
        goto L_0x01eb;
    L_0x01ea:
        r3 = 0;
    L_0x01eb:
        if (r3 == 0) goto L_0x01f3;
    L_0x01ed:
        r1 = r3.f1643b;
        r2 = r0.f1675c;
        if (r1 == r2) goto L_0x0215;
    L_0x01f3:
        r1 = 0;
    L_0x01f4:
        r2 = r17.getChildCount();
        if (r1 >= r2) goto L_0x0215;
    L_0x01fa:
        r2 = r0.getChildAt(r1);
        r3 = r0.m1922a(r2);
        if (r3 == 0) goto L_0x0212;
    L_0x0204:
        r3 = r3.f1643b;
        r4 = r0.f1675c;
        if (r3 != r4) goto L_0x0212;
    L_0x020a:
        r3 = 2;
        r2 = r2.requestFocus(r3);
        if (r2 == 0) goto L_0x0212;
    L_0x0211:
        goto L_0x0215;
    L_0x0212:
        r1 = r1 + 1;
        goto L_0x01f4;
    L_0x0215:
        return;
    L_0x0216:
        r1 = r17.getResources();	 Catch:{ NotFoundException -> 0x0223 }
        r2 = r17.getId();	 Catch:{ NotFoundException -> 0x0223 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x0223 }
        goto L_0x022b;
    L_0x0223:
        r1 = r17.getId();
        r1 = java.lang.Integer.toHexString(r1);
    L_0x022b:
        r2 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r3.append(r4);
        r4 = r0.f1676d;
        r3.append(r4);
        r4 = ", found: ";
        r3.append(r4);
        r3.append(r6);
        r4 = " Pager id: ";
        r3.append(r4);
        r3.append(r1);
        r1 = " Pager class: ";
        r3.append(r1);
        r1 = r17.getClass();
        r3.append(r1);
        r1 = " Problematic adapter: ";
        r3.append(r1);
        r1 = r0.f1674b;
        r1 = r1.getClass();
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    /* renamed from: g */
    private void m1916g() {
        if (this.ag != 0) {
            if (this.ah == null) {
                this.ah = new ArrayList();
            } else {
                this.ah.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ah.add(getChildAt(i));
            }
            Collections.sort(this.ah, ai);
        }
    }

    /* renamed from: a */
    private void m1903a(C0519b c0519b, int i, C0519b c0519b2) {
        int size;
        int b = this.f1674b.mo1187b();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f1686p) / ((float) clientWidth) : 0.0f;
        if (c0519b2 != null) {
            int i2 = c0519b2.f1643b;
            C0519b c0519b3;
            if (i2 < c0519b.f1643b) {
                float f2 = (c0519b2.f1646e + c0519b2.f1645d) + f;
                i2++;
                c0519b2 = null;
                while (i2 <= c0519b.f1643b && c0519b2 < this.f1677g.size()) {
                    c0519b3 = (C0519b) this.f1677g.get(c0519b2);
                    while (i2 > c0519b3.f1643b && c0519b2 < this.f1677g.size() - 1) {
                        c0519b2++;
                        c0519b3 = (C0519b) this.f1677g.get(c0519b2);
                    }
                    while (i2 < c0519b3.f1643b) {
                        f2 += this.f1674b.m2105d(i2) + f;
                        i2++;
                    }
                    c0519b3.f1646e = f2;
                    f2 += c0519b3.f1645d + f;
                    i2++;
                }
            } else if (i2 > c0519b.f1643b) {
                size = this.f1677g.size() - 1;
                c0519b2 = c0519b2.f1646e;
                i2--;
                while (i2 >= c0519b.f1643b && size >= 0) {
                    c0519b3 = (C0519b) this.f1677g.get(size);
                    while (i2 < c0519b3.f1643b && size > 0) {
                        size--;
                        c0519b3 = (C0519b) this.f1677g.get(size);
                    }
                    while (i2 > c0519b3.f1643b) {
                        c0519b2 -= this.f1674b.m2105d(i2) + f;
                        i2--;
                    }
                    c0519b2 -= c0519b3.f1645d + f;
                    c0519b3.f1646e = c0519b2;
                    i2--;
                }
            }
        }
        c0519b2 = this.f1677g.size();
        float f3 = c0519b.f1646e;
        size = c0519b.f1643b - 1;
        this.f1690t = c0519b.f1643b == 0 ? c0519b.f1646e : -3.4028235E38f;
        b--;
        this.f1691u = c0519b.f1643b == b ? (c0519b.f1646e + c0519b.f1645d) - 1.0f : Float.MAX_VALUE;
        int i3 = i - 1;
        while (i3 >= 0) {
            C0519b c0519b4 = (C0519b) this.f1677g.get(i3);
            while (size > c0519b4.f1643b) {
                f3 -= this.f1674b.m2105d(size) + f;
                size--;
            }
            f3 -= c0519b4.f1645d + f;
            c0519b4.f1646e = f3;
            if (c0519b4.f1643b == 0) {
                this.f1690t = f3;
            }
            i3--;
            size--;
        }
        f3 = (c0519b.f1646e + c0519b.f1645d) + f;
        c0519b = c0519b.f1643b + 1;
        i++;
        while (i < c0519b2) {
            C0519b c0519b5 = (C0519b) this.f1677g.get(i);
            while (c0519b < c0519b5.f1643b) {
                f3 += this.f1674b.m2105d(c0519b) + f;
                c0519b++;
            }
            if (c0519b5.f1643b == b) {
                this.f1691u = (c0519b5.f1645d + f3) - 1.0f;
            }
            c0519b5.f1646e = f3;
            f3 += c0519b5.f1645d + f;
            i++;
            c0519b++;
        }
        this.f1671U = false;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13313a = this.f1675c;
        if (this.f1674b != null) {
            savedState.f13314b = this.f1674b.mo308a();
        }
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.m1885a());
            if (this.f1674b != null) {
                this.f1674b.mo310a(savedState.f13314b, savedState.f13315c);
                m1927a(savedState.f13313a, false, true);
            } else {
                this.f1680j = savedState.f13313a;
                this.f1681k = savedState.f13314b;
                this.f1682l = savedState.f13315c;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f1636a |= m1911c(view);
        if (this.f1694x) {
            if (layoutParams2 != null) {
                if (layoutParams2.f1636a) {
                    throw new IllegalStateException("Cannot add pager decor view during layout");
                }
            }
            layoutParams2.f1639d = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    private static boolean m1911c(View view) {
        return view.getClass().getAnnotation(C0518a.class) != null ? true : null;
    }

    public void removeView(View view) {
        if (this.f1694x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: a */
    C0519b m1922a(View view) {
        for (int i = 0; i < this.f1677g.size(); i++) {
            C0519b c0519b = (C0519b) this.f1677g.get(i);
            if (this.f1674b.mo313a(view, c0519b.f1642a)) {
                return c0519b;
            }
        }
        return null;
    }

    /* renamed from: b */
    C0519b m1934b(View view) {
        while (true) {
            View parent = view.getParent();
            if (parent == this) {
                return m1922a(view);
            }
            if (parent == null) {
                break;
            } else if ((parent instanceof View) == null) {
                break;
            } else {
                view = parent;
            }
        }
        return null;
    }

    /* renamed from: b */
    C0519b m1933b(int i) {
        for (int i2 = 0; i2 < this.f1677g.size(); i2++) {
            C0519b c0519b = (C0519b) this.f1677g.get(i2);
            if (c0519b.f1643b == i) {
                return c0519b;
            }
        }
        return 0;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1670T = true;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f1655E = Math.min(measuredWidth / 10, this.f1654D);
        measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = measuredHeight;
        measuredHeight = measuredWidth;
        measuredWidth = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (measuredWidth >= childCount) {
                break;
            }
            View childAt = getChildAt(measuredWidth);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.f1636a) {
                    Object obj;
                    int i6;
                    int i7;
                    int i8 = layoutParams.f1637b & 7;
                    int i9 = layoutParams.f1637b & 112;
                    if (i9 != 48) {
                        if (i9 != 80) {
                            obj = null;
                            if (i8 != 3) {
                                if (i8 == 5) {
                                    z = false;
                                }
                            }
                            i8 = Integer.MIN_VALUE;
                            if (obj != null) {
                                i8 = 1073741824;
                            } else if (z) {
                                i6 = 1073741824;
                                if (layoutParams.width == -2) {
                                    i7 = layoutParams.width == -1 ? layoutParams.width : measuredHeight;
                                    i8 = 1073741824;
                                } else {
                                    i7 = measuredHeight;
                                }
                                if (layoutParams.height != -2) {
                                    i3 = layoutParams.height == -1 ? layoutParams.height : i4;
                                } else {
                                    i3 = i4;
                                    i5 = i6;
                                }
                                childAt.measure(MeasureSpec.makeMeasureSpec(i7, i8), MeasureSpec.makeMeasureSpec(i3, i5));
                                if (obj == null) {
                                    i4 -= childAt.getMeasuredHeight();
                                } else if (!z) {
                                    measuredHeight -= childAt.getMeasuredWidth();
                                }
                            }
                            i6 = Integer.MIN_VALUE;
                            if (layoutParams.width == -2) {
                                i7 = measuredHeight;
                            } else {
                                if (layoutParams.width == -1) {
                                }
                                i8 = 1073741824;
                            }
                            if (layoutParams.height != -2) {
                                i3 = i4;
                                i5 = i6;
                            } else if (layoutParams.height == -1) {
                            }
                            childAt.measure(MeasureSpec.makeMeasureSpec(i7, i8), MeasureSpec.makeMeasureSpec(i3, i5));
                            if (obj == null) {
                                i4 -= childAt.getMeasuredHeight();
                            } else if (!z) {
                                measuredHeight -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    obj = 1;
                    if (i8 != 3) {
                        if (i8 == 5) {
                            z = false;
                        }
                    }
                    i8 = Integer.MIN_VALUE;
                    if (obj != null) {
                        i8 = 1073741824;
                    } else if (z) {
                        i6 = 1073741824;
                        if (layoutParams.width == -2) {
                            if (layoutParams.width == -1) {
                            }
                            i8 = 1073741824;
                        } else {
                            i7 = measuredHeight;
                        }
                        if (layoutParams.height != -2) {
                            i3 = i4;
                            i5 = i6;
                        } else if (layoutParams.height == -1) {
                        }
                        childAt.measure(MeasureSpec.makeMeasureSpec(i7, i8), MeasureSpec.makeMeasureSpec(i3, i5));
                        if (obj == null) {
                            i4 -= childAt.getMeasuredHeight();
                        } else if (!z) {
                            measuredHeight -= childAt.getMeasuredWidth();
                        }
                    }
                    i6 = Integer.MIN_VALUE;
                    if (layoutParams.width == -2) {
                        i7 = measuredHeight;
                    } else {
                        if (layoutParams.width == -1) {
                        }
                        i8 = 1073741824;
                    }
                    if (layoutParams.height != -2) {
                        i3 = i4;
                        i5 = i6;
                    } else if (layoutParams.height == -1) {
                    }
                    childAt.measure(MeasureSpec.makeMeasureSpec(i7, i8), MeasureSpec.makeMeasureSpec(i3, i5));
                    if (obj == null) {
                        i4 -= childAt.getMeasuredHeight();
                    } else if (!z) {
                        measuredHeight -= childAt.getMeasuredWidth();
                    }
                }
            }
            measuredWidth++;
        }
        r0.f1692v = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        r0.f1693w = MeasureSpec.makeMeasureSpec(i4, 1073741824);
        r0.f1694x = true;
        m1939c();
        i3 = 0;
        r0.f1694x = false;
        measuredWidth = getChildCount();
        while (i3 < measuredWidth) {
            View childAt2 = getChildAt(i3);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (layoutParams2 == null || !layoutParams2.f1636a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (((float) measuredHeight) * layoutParams2.f1638c), 1073741824), r0.f1693w);
                }
            }
            i3++;
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m1901a(i, i3, this.f1686p, this.f1686p);
        }
    }

    /* renamed from: a */
    private void m1901a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f1677g.isEmpty()) {
            i2 = m1933b(this.f1675c);
            i = (int) ((i2 != 0 ? Math.min(i2.f1646e, this.f1691u) : 0) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (i != getScrollX()) {
                m1905a((boolean) 0);
                scrollTo(i, getScrollY());
            }
        } else if (this.f1683m.isFinished()) {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        } else {
            this.f1683m.setFinalX(getCurrentItem() * getClientWidth());
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        ViewPager viewPager = this;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = paddingBottom;
        int i8 = 0;
        paddingBottom = paddingTop;
        paddingTop = paddingLeft;
        for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
            View childAt = getChildAt(paddingLeft);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1636a) {
                    int i9 = layoutParams.f1637b & 7;
                    int i10 = layoutParams.f1637b & 112;
                    if (i9 == 1) {
                        i9 = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingTop);
                    } else if (i9 == 3) {
                        i9 = paddingTop;
                        paddingTop = childAt.getMeasuredWidth() + paddingTop;
                    } else if (i9 != 5) {
                        i9 = paddingTop;
                    } else {
                        i9 = (i5 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i10 == 16) {
                        i10 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingBottom);
                    } else if (i10 == 48) {
                        i10 = paddingBottom;
                        paddingBottom = childAt.getMeasuredHeight() + paddingBottom;
                    } else if (i10 != 80) {
                        i10 = paddingBottom;
                    } else {
                        i10 = (i6 - i7) - childAt.getMeasuredHeight();
                        i7 += childAt.getMeasuredHeight();
                    }
                    i9 += scrollX;
                    childAt.layout(i9, i10, childAt.getMeasuredWidth() + i9, i10 + childAt.getMeasuredHeight());
                    i8++;
                }
            }
        }
        i5 = (i5 - paddingTop) - paddingRight;
        for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
            View childAt2 = getChildAt(paddingLeft);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f1636a) {
                    C0519b a = m1922a(childAt2);
                    if (a != null) {
                        float f = (float) i5;
                        int i11 = ((int) (a.f1646e * f)) + paddingTop;
                        if (layoutParams2.f1639d) {
                            layoutParams2.f1639d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f1638c), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingBottom) - i7, 1073741824));
                        }
                        childAt2.layout(i11, paddingBottom, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + paddingBottom);
                    }
                }
            }
        }
        viewPager.f1688r = paddingBottom;
        viewPager.f1689s = i6 - i7;
        viewPager.f1673W = i8;
        if (viewPager.f1670T) {
            z2 = false;
            m1902a(viewPager.f1675c, false, 0, false);
        } else {
            z2 = false;
        }
        viewPager.f1670T = z2;
    }

    public void computeScroll() {
        this.f1684n = true;
        if (this.f1683m.isFinished() || !this.f1683m.computeScrollOffset()) {
            m1905a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1683m.getCurrX();
        int currY = this.f1683m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m1912d(currX)) {
                this.f1683m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0560r.m2189c(this);
    }

    /* renamed from: d */
    private boolean m1912d(int i) {
        if (this.f1677g.size() != 0) {
            C0519b i2 = m1918i();
            int clientWidth = getClientWidth();
            int i3 = this.f1686p + clientWidth;
            float f = (float) clientWidth;
            float f2 = ((float) this.f1686p) / f;
            int i4 = i2.f1643b;
            float f3 = ((((float) i) / f) - i2.f1646e) / (i2.f1645d + f2);
            int i5 = (int) (((float) i3) * f3);
            this.f1672V = false;
            m1925a(i4, f3, i5);
            if (this.f1672V != 0) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f1670T != 0) {
            return false;
        } else {
            this.f1672V = false;
            m1925a(0, 0.0f, 0);
            if (this.f1672V != 0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: a */
    protected void m1925a(int i, float f, int i2) {
        if (this.f1673W > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i3 = paddingRight;
            paddingRight = paddingLeft;
            for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
                View childAt = getChildAt(paddingLeft);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1636a) {
                    int i4 = layoutParams.f1637b & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            i4 = childAt.getWidth() + paddingRight;
                        } else if (i4 != 5) {
                            i4 = paddingRight;
                        } else {
                            i4 = (width - i3) - childAt.getMeasuredWidth();
                            i3 += childAt.getMeasuredWidth();
                        }
                        paddingRight = (paddingRight + scrollX) - childAt.getLeft();
                        if (paddingRight != 0) {
                            childAt.offsetLeftAndRight(paddingRight);
                        }
                        paddingRight = i4;
                    } else {
                        i4 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingRight);
                    }
                    int i5 = i4;
                    i4 = paddingRight;
                    paddingRight = i5;
                    paddingRight = (paddingRight + scrollX) - childAt.getLeft();
                    if (paddingRight != 0) {
                        childAt.offsetLeftAndRight(paddingRight);
                    }
                    paddingRight = i4;
                }
            }
        }
        m1907b(i, f, i2);
        if (this.ae != 0) {
            i = getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                i2 = getChildAt(i6);
                if (!((LayoutParams) i2.getLayoutParams()).f1636a) {
                    this.ae.m1897a(i2, ((float) (i2.getLeft() - i)) / ((float) getClientWidth()));
                }
            }
        }
        this.f1672V = true;
    }

    /* renamed from: b */
    private void m1907b(int i, float f, int i2) {
        if (this.ab != null) {
            this.ab.mo138a(i, f, i2);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0521e c0521e = (C0521e) this.aa.get(i3);
                if (c0521e != null) {
                    c0521e.mo138a(i, f, i2);
                }
            }
        }
        if (this.ac != null) {
            this.ac.mo138a(i, f, i2);
        }
    }

    /* renamed from: e */
    private void m1913e(int i) {
        if (this.ab != null) {
            this.ab.mo139b(i);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0521e c0521e = (C0521e) this.aa.get(i2);
                if (c0521e != null) {
                    c0521e.mo139b(i);
                }
            }
        }
        if (this.ac != null) {
            this.ac.mo139b(i);
        }
    }

    /* renamed from: f */
    private void m1915f(int i) {
        if (this.ab != null) {
            this.ab.mo137a(i);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0521e c0521e = (C0521e) this.aa.get(i2);
                if (c0521e != null) {
                    c0521e.mo137a(i);
                }
            }
        }
        if (this.ac != null) {
            this.ac.mo137a(i);
        }
    }

    /* renamed from: a */
    private void m1905a(boolean z) {
        Object obj = this.ak == 2 ? 1 : null;
        if (obj != null) {
            setScrollingCacheEnabled(false);
            if ((this.f1683m.isFinished() ^ 1) != 0) {
                this.f1683m.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1683m.getCurrX();
                int currY = this.f1683m.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m1912d(currX);
                    }
                }
            }
        }
        this.f1696z = false;
        Object obj2 = obj;
        for (int i = 0; i < this.f1677g.size(); i++) {
            C0519b c0519b = (C0519b) this.f1677g.get(i);
            if (c0519b.f1644c) {
                c0519b.f1644c = false;
                obj2 = 1;
            }
        }
        if (obj2 == null) {
            return;
        }
        if (z) {
            C0560r.m2178a((View) this, this.aj);
        } else {
            this.aj.run();
        }
    }

    /* renamed from: a */
    private boolean m1906a(float f, float f2) {
        return (f < ((float) this.f1655E) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f1655E)) && f2 < 0.0f);
    }

    /* renamed from: b */
    private void m1908b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.af : 0, null);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewPager viewPager = this;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            if (action != 1) {
                if (action != 0) {
                    if (viewPager.f1652B) {
                        return true;
                    }
                    if (viewPager.f1653C) {
                        return false;
                    }
                }
                if (action == 0) {
                    float x = motionEvent.getX();
                    viewPager.f1659I = x;
                    viewPager.f1657G = x;
                    x = motionEvent.getY();
                    viewPager.f1660J = x;
                    viewPager.f1658H = x;
                    viewPager.f1661K = motionEvent2.getPointerId(0);
                    viewPager.f1653C = false;
                    viewPager.f1684n = true;
                    viewPager.f1683m.computeScrollOffset();
                    if (viewPager.ak != 2 || Math.abs(viewPager.f1683m.getFinalX() - viewPager.f1683m.getCurrX()) <= viewPager.f1666P) {
                        m1905a(false);
                        viewPager.f1652B = false;
                    } else {
                        viewPager.f1683m.abortAnimation();
                        viewPager.f1696z = false;
                        m1939c();
                        viewPager.f1652B = true;
                        m1910c(true);
                        setScrollState(1);
                    }
                } else if (action == 2) {
                    action = viewPager.f1661K;
                    if (action != -1) {
                        action = motionEvent2.findPointerIndex(action);
                        float x2 = motionEvent2.getX(action);
                        float f = x2 - viewPager.f1657G;
                        float abs = Math.abs(f);
                        float y = motionEvent2.getY(action);
                        float abs2 = Math.abs(y - viewPager.f1660J);
                        if (f == 0.0f || m1906a(viewPager.f1657G, f) || !m1932a(this, false, (int) f, (int) x2, (int) y)) {
                            if (abs > ((float) viewPager.f1656F) && abs * 0.5f > abs2) {
                                viewPager.f1652B = true;
                                m1910c(true);
                                setScrollState(1);
                                viewPager.f1657G = f > 0.0f ? viewPager.f1659I + ((float) viewPager.f1656F) : viewPager.f1659I - ((float) viewPager.f1656F);
                                viewPager.f1658H = y;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > ((float) viewPager.f1656F)) {
                                viewPager.f1653C = true;
                            }
                            if (viewPager.f1652B && m1909b(x2)) {
                                C0560r.m2189c(this);
                            }
                        } else {
                            viewPager.f1657G = x2;
                            viewPager.f1658H = y;
                            viewPager.f1653C = true;
                            return false;
                        }
                    }
                } else if (action == 6) {
                    m1904a(motionEvent);
                }
                if (viewPager.f1662L == null) {
                    viewPager.f1662L = VelocityTracker.obtain();
                }
                viewPager.f1662L.addMovement(motionEvent2);
                return viewPager.f1652B;
            }
        }
        m1917h();
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1667Q) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && this.f1674b != null) {
            if (this.f1674b.mo1187b() != 0) {
                if (this.f1662L == null) {
                    this.f1662L = VelocityTracker.obtain();
                }
                this.f1662L.addMovement(motionEvent);
                float x;
                int xVelocity;
                switch (motionEvent.getAction() & 255) {
                    case 0:
                        this.f1683m.abortAnimation();
                        this.f1696z = false;
                        m1939c();
                        x = motionEvent.getX();
                        this.f1659I = x;
                        this.f1657G = x;
                        x = motionEvent.getY();
                        this.f1660J = x;
                        this.f1658H = x;
                        this.f1661K = motionEvent.getPointerId(0);
                        break;
                    case 1:
                        if (this.f1652B) {
                            VelocityTracker velocityTracker = this.f1662L;
                            velocityTracker.computeCurrentVelocity(1000, (float) this.f1664N);
                            xVelocity = (int) velocityTracker.getXVelocity(this.f1661K);
                            this.f1696z = true;
                            int clientWidth = getClientWidth();
                            int scrollX = getScrollX();
                            C0519b i = m1918i();
                            float f = (float) clientWidth;
                            m1928a(m1899a(i.f1643b, ((((float) scrollX) / f) - i.f1646e) / (i.f1645d + (((float) this.f1686p) / f)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f1661K)) - this.f1659I)), true, true, xVelocity);
                            z = m1917h();
                            break;
                        }
                        break;
                    case 2:
                        if (!this.f1652B) {
                            xVelocity = motionEvent.findPointerIndex(this.f1661K);
                            if (xVelocity == -1) {
                                z = m1917h();
                                break;
                            }
                            float x2 = motionEvent.getX(xVelocity);
                            float abs = Math.abs(x2 - this.f1657G);
                            x = motionEvent.getY(xVelocity);
                            float abs2 = Math.abs(x - this.f1658H);
                            if (abs > ((float) this.f1656F) && abs > abs2) {
                                this.f1652B = true;
                                m1910c(true);
                                this.f1657G = x2 - this.f1659I > 0.0f ? this.f1659I + ((float) this.f1656F) : this.f1659I - ((float) this.f1656F);
                                this.f1658H = x;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                        if (this.f1652B) {
                            z = false | m1909b(motionEvent.getX(motionEvent.findPointerIndex(this.f1661K)));
                            break;
                        }
                        break;
                    case 3:
                        if (this.f1652B != null) {
                            m1902a(this.f1675c, true, 0, false);
                            z = m1917h();
                            break;
                        }
                        break;
                    case 5:
                        xVelocity = motionEvent.getActionIndex();
                        this.f1657G = motionEvent.getX(xVelocity);
                        this.f1661K = motionEvent.getPointerId(xVelocity);
                        break;
                    case 6:
                        m1904a(motionEvent);
                        this.f1657G = motionEvent.getX(motionEvent.findPointerIndex(this.f1661K));
                        break;
                    default:
                        break;
                }
                if (z) {
                    C0560r.m2189c(this);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private boolean m1917h() {
        this.f1661K = -1;
        m1919j();
        this.f1668R.onRelease();
        this.f1669S.onRelease();
        if (!this.f1668R.isFinished()) {
            if (!this.f1669S.isFinished()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private void m1910c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: b */
    private boolean m1909b(float f) {
        Object obj;
        Object obj2;
        float f2 = this.f1657G - f;
        this.f1657G = f;
        f = ((float) getScrollX()) + f2;
        f2 = (float) getClientWidth();
        float f3 = this.f1690t * f2;
        float f4 = this.f1691u * f2;
        boolean z = false;
        C0519b c0519b = (C0519b) this.f1677g.get(0);
        C0519b c0519b2 = (C0519b) this.f1677g.get(this.f1677g.size() - 1);
        if (c0519b.f1643b != 0) {
            f3 = c0519b.f1646e * f2;
            obj = null;
        } else {
            obj = 1;
        }
        if (c0519b2.f1643b != this.f1674b.mo1187b() - 1) {
            f4 = c0519b2.f1646e * f2;
            obj2 = null;
        } else {
            obj2 = 1;
        }
        if (f < f3) {
            if (obj != null) {
                this.f1668R.onPull(Math.abs(f3 - f) / f2);
                z = true;
            }
            f = f3;
        } else if (f > f4) {
            if (obj2 != null) {
                this.f1669S.onPull(Math.abs(f - f4) / f2);
                z = true;
            }
            f = f4;
        }
        int i = (int) f;
        this.f1657G += f - ((float) i);
        scrollTo(i, getScrollY());
        m1912d(i);
        return z;
    }

    /* renamed from: i */
    private C0519b m1918i() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f1686p) / ((float) clientWidth) : 0.0f;
        C0519b c0519b = null;
        int i = 0;
        Object obj = 1;
        int i2 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i < this.f1677g.size()) {
            C0519b c0519b2 = (C0519b) this.f1677g.get(i);
            if (obj == null) {
                i2++;
                if (c0519b2.f1643b != i2) {
                    c0519b2 = this.f1678h;
                    c0519b2.f1646e = (f2 + f3) + f;
                    c0519b2.f1643b = i2;
                    c0519b2.f1645d = this.f1674b.m2105d(c0519b2.f1643b);
                    i--;
                }
            }
            f2 = c0519b2.f1646e;
            float f4 = (c0519b2.f1645d + f2) + f;
            if (obj == null) {
                if (scrollX < f2) {
                    return c0519b;
                }
            }
            if (scrollX >= f4) {
                if (i != this.f1677g.size() - 1) {
                    i2 = c0519b2.f1643b;
                    f3 = c0519b2.f1645d;
                    i++;
                    c0519b = c0519b2;
                    obj = null;
                }
            }
            return c0519b2;
        }
        return c0519b;
    }

    /* renamed from: a */
    private int m1899a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f1665O || Math.abs(i2) <= this.f1663M) {
            i += (int) (f + (i >= this.f1675c ? 1053609165 : 1058642330));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f1677g.size() <= null) {
            return i;
        }
        return Math.max(((C0519b) this.f1677g.get(0)).f1643b, Math.min(i, ((C0519b) this.f1677g.get(this.f1677g.size() - 1)).f1643b));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        int i = 0;
        if (overScrollMode != 0) {
            if (overScrollMode != 1 || this.f1674b == null || this.f1674b.mo1187b() <= 1) {
                this.f1668R.finish();
                this.f1669S.finish();
                if (i != 0) {
                    C0560r.m2189c(this);
                }
            }
        }
        if (!this.f1668R.isFinished()) {
            overScrollMode = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((float) ((-height) + getPaddingTop()), this.f1690t * ((float) width));
            this.f1668R.setSize(height, width);
            i = 0 | this.f1668R.draw(canvas);
            canvas.restoreToCount(overScrollMode);
        }
        if (!this.f1669S.isFinished()) {
            overScrollMode = canvas.save();
            height = getWidth();
            width = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate((float) (-getPaddingTop()), (-(this.f1691u + 1.0f)) * ((float) height));
            this.f1669S.setSize(width, height);
            i |= this.f1669S.draw(canvas);
            canvas.restoreToCount(overScrollMode);
        }
        if (i != 0) {
            C0560r.m2189c(this);
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1686p > 0 && r0.f1687q != null && r0.f1677g.size() > 0 && r0.f1674b != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = (float) width;
            float f2 = ((float) r0.f1686p) / f;
            int i = 0;
            C0519b c0519b = (C0519b) r0.f1677g.get(0);
            float f3 = c0519b.f1646e;
            int size = r0.f1677g.size();
            int i2 = c0519b.f1643b;
            int i3 = ((C0519b) r0.f1677g.get(size - 1)).f1643b;
            while (i2 < i3) {
                float f4;
                float f5;
                while (i2 > c0519b.f1643b && i < size) {
                    i++;
                    c0519b = (C0519b) r0.f1677g.get(i);
                }
                if (i2 == c0519b.f1643b) {
                    f3 = (c0519b.f1646e + c0519b.f1645d) * f;
                    f4 = (c0519b.f1646e + c0519b.f1645d) + f2;
                } else {
                    f4 = r0.f1674b.m2105d(i2);
                    f4 = f3 + (f4 + f2);
                    f3 = (f3 + f4) * f;
                }
                if (((float) r0.f1686p) + f3 > ((float) scrollX)) {
                    f5 = f2;
                    r0.f1687q.setBounds(Math.round(f3), r0.f1688r, Math.round(((float) r0.f1686p) + f3), r0.f1689s);
                    r0.f1687q.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f5 = f2;
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i2++;
                    f3 = f4;
                    f2 = f5;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m1904a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1661K) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f1657G = motionEvent.getX(actionIndex);
            this.f1661K = motionEvent.getPointerId(actionIndex);
            if (this.f1662L != null) {
                this.f1662L.clear();
            }
        }
    }

    /* renamed from: j */
    private void m1919j() {
        this.f1652B = false;
        this.f1653C = false;
        if (this.f1662L != null) {
            this.f1662L.recycle();
            this.f1662L = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f1695y != z) {
            this.f1695y = z;
        }
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.f1674b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f1690t))) {
                z = true;
            }
            return z;
        } else if (i <= 0) {
            return false;
        } else {
            if (scrollX < ((int) (((float) clientWidth) * this.f1691u))) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    protected boolean m1932a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (m1932a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            z2 = false;
        }
        return z2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (m1931a(keyEvent) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m1931a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        if (keyEvent.hasModifiers(2) != null) {
                            return m1941d();
                        }
                        return m1940c(17);
                    case 22:
                        if (keyEvent.hasModifiers(2) != null) {
                            return m1942e();
                        }
                        return m1940c(66);
                    default:
                        break;
                }
            } else if (keyEvent.hasNoModifiers()) {
                return m1940c(2);
            } else {
                if (keyEvent.hasModifiers(1) != null) {
                    return m1940c(1);
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public boolean m1940c(int i) {
        View findFocus = findFocus();
        boolean z = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                Object obj;
                for (ViewPager parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        stringBuilder.append(" => ");
                        stringBuilder.append(parent2.getClass().getSimpleName());
                    }
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("arrowScroll tried to find focus based on non-child current focused view ");
                    stringBuilder2.append(stringBuilder.toString());
                    Log.e("ViewPager", stringBuilder2.toString());
                }
            }
            view = findFocus;
        }
        findFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findFocus == null || findFocus == view) {
            if (i != 17) {
                if (i != 1) {
                    if (i == 66 || i == 2) {
                        z = m1942e();
                    }
                }
            }
            z = m1941d();
        } else {
            boolean requestFocus;
            int i2;
            int i3;
            if (i == 17) {
                i2 = m1900a(this.f1679i, findFocus).left;
                i3 = m1900a(this.f1679i, view).left;
                if (view == null || i2 < i3) {
                    requestFocus = findFocus.requestFocus();
                } else {
                    requestFocus = m1941d();
                }
            } else if (i == 66) {
                i2 = m1900a(this.f1679i, findFocus).left;
                i3 = m1900a(this.f1679i, view).left;
                if (view == null || i2 > i3) {
                    requestFocus = findFocus.requestFocus();
                } else {
                    requestFocus = m1942e();
                }
            }
            z = requestFocus;
        }
        if (z) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z;
    }

    /* renamed from: a */
    private Rect m1900a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        view = view.getParent();
        while ((view instanceof ViewGroup) && view != this) {
            ViewGroup viewGroup = (ViewGroup) view;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            view = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: d */
    boolean m1941d() {
        if (this.f1675c <= 0) {
            return false;
        }
        setCurrentItem(this.f1675c - 1, true);
        return true;
    }

    /* renamed from: e */
    boolean m1942e() {
        if (this.f1674b == null || this.f1675c >= this.f1674b.mo1187b() - 1) {
            return false;
        }
        setCurrentItem(this.f1675c + 1, true);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0519b a = m1922a(childAt);
                    if (a != null && a.f1643b == this.f1675c) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || isFocusable() == 0) {
            return;
        }
        if (!(((i2 & 1) == 1 && isInTouchMode() != 0 && isFocusableInTouchMode() == 0) || arrayList == null)) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0519b a = m1922a(childAt);
                if (a != null && a.f1643b == this.f1675c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int childCount = getChildCount();
        int i3 = -1;
        if ((i & 2) != 0) {
            i3 = childCount;
            childCount = 0;
            i2 = 1;
        } else {
            childCount--;
            i2 = -1;
        }
        while (childCount != i3) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                C0519b a = m1922a(childAt);
                if (a != null && a.f1643b == this.f1675c && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            childCount += i2;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0519b a = m1922a(childAt);
                if (a != null && a.f1643b == this.f1675c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (!(layoutParams instanceof LayoutParams) || super.checkLayoutParams(layoutParams) == null) ? null : true;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
