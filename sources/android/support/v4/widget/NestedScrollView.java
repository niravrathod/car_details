package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.C0536a;
import android.support.v4.view.C0551j;
import android.support.v4.view.C0552k;
import android.support.v4.view.C0553m;
import android.support.v4.view.C0560r;
import android.support.v4.view.C3167i;
import android.support.v4.view.p018a.C0532b;
import android.support.v4.view.p018a.C0535d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.List;

public class NestedScrollView extends FrameLayout implements C3167i, C0552k {
    /* renamed from: w */
    private static final C3177a f18422w = new C3177a();
    /* renamed from: x */
    private static final int[] f18423x = new int[]{16843130};
    /* renamed from: A */
    private float f18424A;
    /* renamed from: B */
    private C0579b f18425B;
    /* renamed from: a */
    private long f18426a;
    /* renamed from: b */
    private final Rect f18427b;
    /* renamed from: c */
    private OverScroller f18428c;
    /* renamed from: d */
    private EdgeEffect f18429d;
    /* renamed from: e */
    private EdgeEffect f18430e;
    /* renamed from: f */
    private int f18431f;
    /* renamed from: g */
    private boolean f18432g;
    /* renamed from: h */
    private boolean f18433h;
    /* renamed from: i */
    private View f18434i;
    /* renamed from: j */
    private boolean f18435j;
    /* renamed from: k */
    private VelocityTracker f18436k;
    /* renamed from: l */
    private boolean f18437l;
    /* renamed from: m */
    private boolean f18438m;
    /* renamed from: n */
    private int f18439n;
    /* renamed from: o */
    private int f18440o;
    /* renamed from: p */
    private int f18441p;
    /* renamed from: q */
    private int f18442q;
    /* renamed from: r */
    private final int[] f18443r;
    /* renamed from: s */
    private final int[] f18444s;
    /* renamed from: t */
    private int f18445t;
    /* renamed from: u */
    private int f18446u;
    /* renamed from: v */
    private SavedState f18447v;
    /* renamed from: y */
    private final C0553m f18448y;
    /* renamed from: z */
    private final C0551j f18449z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C05781();
        /* renamed from: a */
        public int f1842a;

        /* renamed from: android.support.v4.widget.NestedScrollView$SavedState$1 */
        static class C05781 implements Creator<SavedState> {
            C05781() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2311a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m2312a(i);
            }

            /* renamed from: a */
            public SavedState m2311a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m2312a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1842a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1842a);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HorizontalScrollView.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" scrollPosition=");
            stringBuilder.append(this.f1842a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface C0579b {
        /* renamed from: a */
        void mo486a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C3177a extends C0536a {
        C3177a() {
        }

        /* renamed from: a */
        public boolean mo439a(View view, int i, Bundle bundle) {
            if (super.mo439a(view, i, bundle) != null) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled() == null) {
                return false;
            }
            if (i == 4096) {
                i = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (i == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m24333c(0, i);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                i = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (i == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m24333c(0, i);
                return true;
            }
        }

        /* renamed from: a */
        public void mo87a(View view, C0532b c0532b) {
            super.mo87a(view, c0532b);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0532b.m1965b(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    c0532b.m1991k(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0532b.m1954a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0532b.m1954a(4096);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo119a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo119a(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0535d.m2010a(accessibilityEvent, nestedScrollView.getScrollX());
            C0535d.m2011b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: b */
    private static int m24313b(int i, int i2, int i3) {
        if (i2 < i3) {
            if (i >= 0) {
                return i2 + i > i3 ? i3 - i2 : i;
            }
        }
        return 0;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18427b = new Rect();
        this.f18432g = true;
        this.f18433h = false;
        this.f18434i = null;
        this.f18435j = false;
        this.f18438m = true;
        this.f18442q = -1;
        this.f18443r = new int[2];
        this.f18444s = new int[2];
        mo4659a();
        context = context.obtainStyledAttributes(attributeSet, f18423x, i, 0);
        setFillViewport(context.getBoolean(0, false));
        context.recycle();
        this.f18448y = new C0553m(this);
        this.f18449z = new C0551j(this);
        setNestedScrollingEnabled(true);
        C0560r.m2175a((View) this, f18422w);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f18449z.m2066a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f18449z.m2067a();
    }

    public boolean startNestedScroll(int i) {
        return this.f18449z.m2077b(i);
    }

    /* renamed from: a */
    public boolean m24326a(int i, int i2) {
        return this.f18449z.m2071a(i, i2);
    }

    public void stopNestedScroll() {
        this.f18449z.m2078c();
    }

    /* renamed from: a */
    public void m24325a(int i) {
        this.f18449z.m2079c(i);
    }

    public boolean hasNestedScrollingParent() {
        return this.f18449z.m2076b();
    }

    /* renamed from: b */
    public boolean m24332b(int i) {
        return this.f18449z.m2070a(i);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f18449z.m2072a(i, i2, i3, i4, iArr);
    }

    /* renamed from: a */
    public boolean m24328a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f18449z.m2073a(i, i2, i3, i4, iArr, i5);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f18449z.m2074a(i, i2, iArr, iArr2);
    }

    /* renamed from: a */
    public boolean m24329a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f18449z.m2075a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f18449z.m2069a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f18449z.m2068a(f, f2);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f18448y.m2083a(view, view2, i);
        startNestedScroll(2);
    }

    public void onStopNestedScroll(View view) {
        this.f18448y.m2081a(view);
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        view = getScrollY();
        scrollBy(0, i4);
        int scrollY = getScrollY() - view;
        dispatchNestedScroll(0, scrollY, 0, i4 - scrollY, null);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return null;
        }
        m24323h((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public int getNestedScrollAxes() {
        return this.f18448y.m2080a();
    }

    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* renamed from: a */
    private void mo4659a() {
        this.f18428c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f18439n = viewConfiguration.getScaledTouchSlop();
        this.f18440o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f18441p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(C0579b c0579b) {
        this.f18425B = c0579b;
    }

    /* renamed from: b */
    private boolean m24315b() {
        boolean z = false;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        if (getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom()) {
            z = true;
        }
        return z;
    }

    public void setFillViewport(boolean z) {
        if (z != this.f18437l) {
            this.f18437l = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f18438m = z;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f18425B != null) {
            this.f18425B.mo486a(this, i, i2, i3, i4);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f18437l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            i2 = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (i2.getMeasuredHeight() < measuredHeight) {
                i2.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) i2.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (m24330a(keyEvent) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m24330a(KeyEvent keyEvent) {
        this.f18427b.setEmpty();
        boolean z = false;
        int i = 130;
        if (m24315b()) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 62) {
                    switch (keyCode) {
                        case 19:
                            if (keyEvent.isAltPressed() != null) {
                                z = m24335d(33);
                                break;
                            }
                            z = m24336e(33);
                            break;
                        case 20:
                            if (keyEvent.isAltPressed() != null) {
                                z = m24335d(130);
                                break;
                            }
                            z = m24336e(130);
                            break;
                        default:
                            break;
                    }
                }
                if (keyEvent.isShiftPressed() != null) {
                    i = 33;
                }
                m24334c(i);
            }
            return z;
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            keyEvent = findFocus();
            if (keyEvent == this) {
                keyEvent = null;
            }
            Object findNextFocus = FocusFinder.getInstance().findNextFocus(this, keyEvent, 130);
            if (!(findNextFocus == null || findNextFocus == this || findNextFocus.requestFocus(130) == null)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: d */
    private boolean m24318d(int i, int i2) {
        boolean z = false;
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight()) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    private void m24316c() {
        if (this.f18436k == null) {
            this.f18436k = VelocityTracker.obtain();
        } else {
            this.f18436k.clear();
        }
    }

    /* renamed from: d */
    private void m24317d() {
        if (this.f18436k == null) {
            this.f18436k = VelocityTracker.obtain();
        }
    }

    /* renamed from: e */
    private void m24319e() {
        if (this.f18436k != null) {
            this.f18436k.recycle();
            this.f18436k = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m24319e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f18435j) {
            return true;
        }
        action &= 255;
        if (action != 6) {
            switch (action) {
                case 0:
                    action = (int) motionEvent.getY();
                    if (!m24318d((int) motionEvent.getX(), action)) {
                        this.f18435j = false;
                        m24319e();
                        break;
                    }
                    this.f18431f = action;
                    this.f18442q = motionEvent.getPointerId(0);
                    m24316c();
                    this.f18436k.addMovement(motionEvent);
                    this.f18428c.computeScrollOffset();
                    this.f18435j = this.f18428c.isFinished() ^ 1;
                    m24326a(2, 0);
                    break;
                case 1:
                case 3:
                    this.f18435j = false;
                    this.f18442q = -1;
                    m24319e();
                    if (this.f18428c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != null) {
                        C0560r.m2189c(this);
                    }
                    m24325a(0);
                    break;
                case 2:
                    action = this.f18442q;
                    if (action != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(action);
                        if (findPointerIndex != -1) {
                            action = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(action - this.f18431f) > this.f18439n && (2 & getNestedScrollAxes()) == 0) {
                                this.f18435j = true;
                                this.f18431f = action;
                                m24317d();
                                this.f18436k.addMovement(motionEvent);
                                this.f18445t = 0;
                                motionEvent = getParent();
                                if (motionEvent != null) {
                                    motionEvent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid pointerId=");
                        stringBuilder.append(action);
                        stringBuilder.append(" in onInterceptTouchEvent");
                        Log.e("NestedScrollView", stringBuilder.toString());
                        break;
                    }
                    break;
                    break;
                default:
                    break;
            }
        }
        m24307a(motionEvent);
        return this.f18435j;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView = this;
        MotionEvent motionEvent2 = motionEvent;
        m24317d();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            nestedScrollView.f18445t = 0;
        }
        obtain.offsetLocation(0.0f, (float) nestedScrollView.f18445t);
        ViewParent parent;
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean isFinished = nestedScrollView.f18428c.isFinished() ^ true;
                    nestedScrollView.f18435j = isFinished;
                    if (isFinished) {
                        parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!nestedScrollView.f18428c.isFinished()) {
                        nestedScrollView.f18428c.abortAnimation();
                    }
                    nestedScrollView.f18431f = (int) motionEvent.getY();
                    nestedScrollView.f18442q = motionEvent2.getPointerId(0);
                    m24326a(2, 0);
                    break;
                }
                return false;
            case 1:
                VelocityTracker velocityTracker = nestedScrollView.f18436k;
                velocityTracker.computeCurrentVelocity(1000, (float) nestedScrollView.f18441p);
                actionMasked = (int) velocityTracker.getYVelocity(nestedScrollView.f18442q);
                if (Math.abs(actionMasked) > nestedScrollView.f18440o) {
                    m24323h(-actionMasked);
                } else if (nestedScrollView.f18428c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0560r.m2189c(this);
                }
                nestedScrollView.f18442q = -1;
                m24320f();
                break;
            case 2:
                int findPointerIndex = motionEvent2.findPointerIndex(nestedScrollView.f18442q);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i = nestedScrollView.f18431f - y;
                    if (m24329a(0, i, nestedScrollView.f18444s, nestedScrollView.f18443r, 0)) {
                        i -= nestedScrollView.f18444s[1];
                        obtain.offsetLocation(0.0f, (float) nestedScrollView.f18443r[1]);
                        nestedScrollView.f18445t += nestedScrollView.f18443r[1];
                    }
                    if (!nestedScrollView.f18435j && Math.abs(i) > nestedScrollView.f18439n) {
                        parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        nestedScrollView.f18435j = true;
                        if (i > 0) {
                            i -= nestedScrollView.f18439n;
                        } else {
                            i += nestedScrollView.f18439n;
                        }
                    }
                    int i2 = i;
                    if (nestedScrollView.f18435j) {
                        Object obj;
                        int i3;
                        int i4;
                        int i5;
                        int scrollY;
                        nestedScrollView.f18431f = y - nestedScrollView.f18443r[1];
                        int scrollY2 = getScrollY();
                        i = getScrollRange();
                        actionMasked = getOverScrollMode();
                        if (actionMasked != 0) {
                            if (actionMasked != 1 || i <= 0) {
                                obj = null;
                                i3 = i;
                                i4 = i2;
                                i5 = findPointerIndex;
                                if (m24327a(0, i2, 0, getScrollY(), 0, i, 0, 0, true) && !m24332b(0)) {
                                    nestedScrollView.f18436k.clear();
                                }
                                scrollY = getScrollY() - scrollY2;
                                if (m24328a(0, scrollY, 0, i4 - scrollY, nestedScrollView.f18443r, 0)) {
                                    if (obj != null) {
                                        m24321g();
                                        actionMasked = scrollY2 + i4;
                                        if (actionMasked >= 0) {
                                            C0612i.m2450a(nestedScrollView.f18429d, ((float) i4) / ((float) getHeight()), motionEvent2.getX(i5) / ((float) getWidth()));
                                            if (!nestedScrollView.f18430e.isFinished()) {
                                                nestedScrollView.f18430e.onRelease();
                                            }
                                        } else {
                                            scrollY = i5;
                                            if (actionMasked > i3) {
                                                C0612i.m2450a(nestedScrollView.f18430e, ((float) i4) / ((float) getHeight()), 1.0f - (motionEvent2.getX(scrollY) / ((float) getWidth())));
                                                if (!nestedScrollView.f18429d.isFinished()) {
                                                    nestedScrollView.f18429d.onRelease();
                                                }
                                            }
                                        }
                                        if (!(nestedScrollView.f18429d == null || (nestedScrollView.f18429d.isFinished() && nestedScrollView.f18430e.isFinished()))) {
                                            C0560r.m2189c(this);
                                            break;
                                        }
                                    }
                                }
                                nestedScrollView.f18431f -= nestedScrollView.f18443r[1];
                                obtain.offsetLocation(0.0f, (float) nestedScrollView.f18443r[1]);
                                nestedScrollView.f18445t += nestedScrollView.f18443r[1];
                                break;
                            }
                        }
                        obj = 1;
                        i3 = i;
                        i4 = i2;
                        i5 = findPointerIndex;
                        nestedScrollView.f18436k.clear();
                        scrollY = getScrollY() - scrollY2;
                        if (m24328a(0, scrollY, 0, i4 - scrollY, nestedScrollView.f18443r, 0)) {
                            if (obj != null) {
                                m24321g();
                                actionMasked = scrollY2 + i4;
                                if (actionMasked >= 0) {
                                    scrollY = i5;
                                    if (actionMasked > i3) {
                                        C0612i.m2450a(nestedScrollView.f18430e, ((float) i4) / ((float) getHeight()), 1.0f - (motionEvent2.getX(scrollY) / ((float) getWidth())));
                                        if (nestedScrollView.f18429d.isFinished()) {
                                            nestedScrollView.f18429d.onRelease();
                                        }
                                    }
                                } else {
                                    C0612i.m2450a(nestedScrollView.f18429d, ((float) i4) / ((float) getHeight()), motionEvent2.getX(i5) / ((float) getWidth()));
                                    if (nestedScrollView.f18430e.isFinished()) {
                                        nestedScrollView.f18430e.onRelease();
                                    }
                                }
                                C0560r.m2189c(this);
                                break;
                            }
                        }
                        nestedScrollView.f18431f -= nestedScrollView.f18443r[1];
                        obtain.offsetLocation(0.0f, (float) nestedScrollView.f18443r[1]);
                        nestedScrollView.f18445t += nestedScrollView.f18443r[1];
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid pointerId=");
                stringBuilder.append(nestedScrollView.f18442q);
                stringBuilder.append(" in onTouchEvent");
                Log.e("NestedScrollView", stringBuilder.toString());
                break;
                break;
            case 3:
                if (nestedScrollView.f18435j && getChildCount() > 0 && nestedScrollView.f18428c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0560r.m2189c(this);
                }
                nestedScrollView.f18442q = -1;
                m24320f();
                break;
            case 5:
                actionMasked = motionEvent.getActionIndex();
                nestedScrollView.f18431f = (int) motionEvent2.getY(actionMasked);
                nestedScrollView.f18442q = motionEvent2.getPointerId(actionMasked);
                break;
            case 6:
                m24307a(motionEvent);
                nestedScrollView.f18431f = (int) motionEvent2.getY(motionEvent2.findPointerIndex(nestedScrollView.f18442q));
                break;
            default:
                break;
        }
        if (nestedScrollView.f18436k != null) {
            nestedScrollView.f18436k.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: a */
    private void m24307a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f18442q) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f18431f = (int) motionEvent.getY(actionIndex);
            this.f18442q = motionEvent.getPointerId(actionIndex);
            if (this.f18436k != null) {
                this.f18436k.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            if (motionEvent.getAction() == 8) {
                if (!this.f18435j) {
                    motionEvent = motionEvent.getAxisValue(9);
                    if (motionEvent != 0.0f) {
                        motionEvent = (int) (motionEvent * getVerticalScrollFactorCompat());
                        int scrollRange = getScrollRange();
                        int scrollY = getScrollY();
                        motionEvent = scrollY - motionEvent;
                        if (motionEvent < null) {
                            motionEvent = null;
                        } else if (motionEvent > scrollRange) {
                            motionEvent = scrollRange;
                        }
                        if (motionEvent != scrollY) {
                            super.scrollTo(getScrollX(), motionEvent);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f18424A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f18424A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f18424A;
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* renamed from: a */
    boolean m24327a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        Object obj;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        boolean z3;
        NestedScrollView nestedScrollView = this;
        int overScrollMode = getOverScrollMode();
        Object obj2 = computeHorizontalScrollRange() > computeHorizontalScrollExtent() ? 1 : null;
        Object obj3 = computeVerticalScrollRange() > computeVerticalScrollExtent() ? 1 : null;
        if (overScrollMode != 0) {
            if (overScrollMode != 1 || obj2 == null) {
                obj2 = null;
                if (overScrollMode != 0) {
                    if (overScrollMode == 1 || obj3 == null) {
                        obj = null;
                        overScrollMode = i3 + i;
                        i9 = obj2 != null ? 0 : i7;
                        i10 = i4 + i2;
                        i11 = obj != null ? 0 : i8;
                        i12 = -i9;
                        i9 += i5;
                        i13 = -i11;
                        i11 += i6;
                        if (overScrollMode <= i9) {
                            i12 = i9;
                        } else if (overScrollMode >= i12) {
                            i12 = overScrollMode;
                            z2 = false;
                            if (i10 <= i11) {
                                i13 = i11;
                            } else if (i10 >= i13) {
                                i13 = i10;
                                z3 = false;
                                if (z3 && !m24332b(1)) {
                                    nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                                }
                                onOverScrolled(i12, i13, z2, z3);
                                if (z2 || z3) {
                                    return true;
                                }
                                return false;
                            }
                            z3 = true;
                            nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                            onOverScrolled(i12, i13, z2, z3);
                            if (!z2) {
                            }
                            return true;
                        }
                        z2 = true;
                        if (i10 <= i11) {
                            i13 = i11;
                        } else if (i10 >= i13) {
                            i13 = i10;
                            z3 = false;
                            nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                            onOverScrolled(i12, i13, z2, z3);
                            if (z2) {
                            }
                            return true;
                        }
                        z3 = true;
                        nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                        onOverScrolled(i12, i13, z2, z3);
                        if (z2) {
                        }
                        return true;
                    }
                }
                obj = 1;
                overScrollMode = i3 + i;
                if (obj2 != null) {
                }
                i10 = i4 + i2;
                if (obj != null) {
                }
                i12 = -i9;
                i9 += i5;
                i13 = -i11;
                i11 += i6;
                if (overScrollMode <= i9) {
                    i12 = i9;
                } else if (overScrollMode >= i12) {
                    i12 = overScrollMode;
                    z2 = false;
                    if (i10 <= i11) {
                        i13 = i11;
                    } else if (i10 >= i13) {
                        i13 = i10;
                        z3 = false;
                        nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                        onOverScrolled(i12, i13, z2, z3);
                        if (z2) {
                        }
                        return true;
                    }
                    z3 = true;
                    nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                    onOverScrolled(i12, i13, z2, z3);
                    if (z2) {
                    }
                    return true;
                }
                z2 = true;
                if (i10 <= i11) {
                    i13 = i11;
                } else if (i10 >= i13) {
                    i13 = i10;
                    z3 = false;
                    nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                    onOverScrolled(i12, i13, z2, z3);
                    if (z2) {
                    }
                    return true;
                }
                z3 = true;
                nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
                return true;
            }
        }
        obj2 = 1;
        if (overScrollMode != 0) {
            if (overScrollMode == 1) {
            }
            obj = null;
            overScrollMode = i3 + i;
            if (obj2 != null) {
            }
            i10 = i4 + i2;
            if (obj != null) {
            }
            i12 = -i9;
            i9 += i5;
            i13 = -i11;
            i11 += i6;
            if (overScrollMode <= i9) {
                i12 = i9;
            } else if (overScrollMode >= i12) {
                i12 = overScrollMode;
                z2 = false;
                if (i10 <= i11) {
                    i13 = i11;
                } else if (i10 >= i13) {
                    i13 = i10;
                    z3 = false;
                    nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                    onOverScrolled(i12, i13, z2, z3);
                    if (z2) {
                    }
                    return true;
                }
                z3 = true;
                nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
                return true;
            }
            z2 = true;
            if (i10 <= i11) {
                i13 = i11;
            } else if (i10 >= i13) {
                i13 = i10;
                z3 = false;
                nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
                return true;
            }
            z3 = true;
            nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
            onOverScrolled(i12, i13, z2, z3);
            if (z2) {
            }
            return true;
        }
        obj = 1;
        overScrollMode = i3 + i;
        if (obj2 != null) {
        }
        i10 = i4 + i2;
        if (obj != null) {
        }
        i12 = -i9;
        i9 += i5;
        i13 = -i11;
        i11 += i6;
        if (overScrollMode <= i9) {
            i12 = i9;
        } else if (overScrollMode >= i12) {
            i12 = overScrollMode;
            z2 = false;
            if (i10 <= i11) {
                i13 = i11;
            } else if (i10 >= i13) {
                i13 = i10;
                z3 = false;
                nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
                return true;
            }
            z3 = true;
            nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
            onOverScrolled(i12, i13, z2, z3);
            if (z2) {
            }
            return true;
        }
        z2 = true;
        if (i10 <= i11) {
            i13 = i11;
        } else if (i10 >= i13) {
            i13 = i10;
            z3 = false;
            nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
            onOverScrolled(i12, i13, z2, z3);
            if (z2) {
            }
            return true;
        }
        z3 = true;
        nestedScrollView.f18428c.springBack(i12, i13, 0, 0, 0, getScrollRange());
        onOverScrolled(i12, i13, z2, z3);
        if (z2) {
        }
        return true;
    }

    int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    /* renamed from: a */
    private View m24305a(boolean z, int i, int i2) {
        List focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        Object obj = null;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                Object obj2 = (i >= top || bottom >= i2) ? null : 1;
                if (view == null) {
                    view = view2;
                    obj = obj2;
                } else {
                    Object obj3 = ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) ? null : 1;
                    if (obj != null) {
                        if (!(obj2 == null || obj3 == null)) {
                        }
                    } else if (obj2 != null) {
                        view = view2;
                        obj = 1;
                    } else if (obj3 == null) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: c */
    public boolean m24334c(int i) {
        Object obj = i == 130 ? 1 : null;
        int height = getHeight();
        if (obj != null) {
            this.f18427b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.f18427b.top + height > childAt.getBottom()) {
                    this.f18427b.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.f18427b.top = getScrollY() - height;
            if (this.f18427b.top < 0) {
                this.f18427b.top = 0;
            }
        }
        this.f18427b.bottom = this.f18427b.top + height;
        return m24308a(i, this.f18427b.top, this.f18427b.bottom);
    }

    /* renamed from: d */
    public boolean m24335d(int i) {
        Object obj = i == 130 ? 1 : null;
        int height = getHeight();
        this.f18427b.top = 0;
        this.f18427b.bottom = height;
        if (obj != null) {
            int childCount = getChildCount();
            if (childCount > 0) {
                this.f18427b.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
                this.f18427b.top = this.f18427b.bottom - height;
            }
        }
        return m24308a(i, this.f18427b.top, this.f18427b.bottom);
    }

    /* renamed from: a */
    private boolean m24308a(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        height += scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m24305a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > height) {
            m24322g(z2 ? i2 - scrollY : i3 - height);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: e */
    public boolean m24336e(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m24311a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom());
                if (bottom < maxScrollAmount) {
                    maxScrollAmount = bottom;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m24322g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f18427b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f18427b);
            m24322g(m24324a(this.f18427b));
            findNextFocus.requestFocus(i);
        }
        if (!(findFocus == null || findFocus.isFocused() == 0 || m24310a(findFocus) == 0)) {
            i = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(i);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m24310a(View view) {
        return m24311a(view, 0, getHeight()) ^ 1;
    }

    /* renamed from: a */
    private boolean m24311a(View view, int i, int i2) {
        view.getDrawingRect(this.f18427b);
        offsetDescendantRectToMyCoords(view, this.f18427b);
        return (this.f18427b.bottom + i < getScrollY() || this.f18427b.top - i > getScrollY() + i2) ? null : true;
    }

    /* renamed from: g */
    private void m24322g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f18438m) {
            m24331b(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: b */
    public final void m24331b(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f18426a > 250) {
                i = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f18428c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, i)) - scrollY);
                C0560r.m2189c(this);
            } else {
                if (!this.f18428c.isFinished()) {
                    this.f18428c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f18426a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: c */
    public final void m24333c(int i, int i2) {
        m24331b(i - getScrollX(), i2 - getScrollY());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void computeScroll() {
        if (this.f18428c.computeScrollOffset()) {
            r10.f18428c.getCurrX();
            int currY = r10.f18428c.getCurrY();
            int i = currY - r10.f18446u;
            if (m24329a(0, i, r10.f18444s, null, 1)) {
                i -= r10.f18444s[1];
            }
            int i2 = i;
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY;
                m24327a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - i3;
                if (!m24328a(0, scrollY2, 0, i2 - scrollY2, null, 1)) {
                    Object obj;
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode != 0) {
                        if (overScrollMode != 1 || scrollRange <= 0) {
                            obj = null;
                            if (obj != null) {
                                m24321g();
                                if (currY > 0 && i3 > 0) {
                                    r10.f18429d.onAbsorb((int) r10.f18428c.getCurrVelocity());
                                } else if (currY >= scrollRange && i3 < scrollRange) {
                                    r10.f18430e.onAbsorb((int) r10.f18428c.getCurrVelocity());
                                }
                            }
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        m24321g();
                        if (currY > 0) {
                        }
                        r10.f18430e.onAbsorb((int) r10.f18428c.getCurrVelocity());
                    }
                }
            }
            r10.f18446u = currY;
            C0560r.m2189c(this);
            return;
        }
        if (m24332b(1)) {
            m24325a(1);
        }
        r10.f18446u = 0;
    }

    /* renamed from: b */
    private void m24314b(View view) {
        view.getDrawingRect(this.f18427b);
        offsetDescendantRectToMyCoords(view, this.f18427b);
        view = m24324a(this.f18427b);
        if (view != null) {
            scrollBy(0, view);
        }
    }

    /* renamed from: a */
    private boolean m24309a(Rect rect, boolean z) {
        rect = m24324a(rect);
        boolean z2 = rect != null;
        if (z2) {
            if (z) {
                scrollBy(0, rect);
            } else {
                m24331b(0, rect);
            }
        }
        return z2;
    }

    /* renamed from: a */
    protected int m24324a(Rect rect) {
        int i = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i2 -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i2 && rect.top > scrollY) {
            if (rect.height() > height) {
                rect = (rect.top - scrollY) + null;
            } else {
                rect = (rect.bottom - i2) + null;
            }
            i = Math.min(rect, getChildAt(0).getBottom() - i2);
        } else if (rect.top < scrollY && rect.bottom < i2) {
            if (rect.height() > height) {
                i = 0 - (i2 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            i = Math.max(i, -getScrollY());
        }
        return i;
    }

    public void requestChildFocus(View view, View view2) {
        if (this.f18432g) {
            this.f18434i = view2;
        } else {
            m24314b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocus;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocus == null || m24310a(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m24309a(rect, z);
    }

    public void requestLayout() {
        this.f18432g = true;
        super.requestLayout();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f18432g = false;
        if (!(this.f18434i == 0 || m24312a(this.f18434i, (View) this) == 0)) {
            m24314b(this.f18434i);
        }
        this.f18434i = null;
        if (this.f18433h == 0) {
            if (this.f18447v != 0) {
                scrollTo(getScrollX(), this.f18447v.f1842a);
                this.f18447v = null;
            }
            i = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > i) {
                scrollTo(getScrollX(), i);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f18433h = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18433h = false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null) {
            if (this != findFocus) {
                if (m24311a(findFocus, 0, i4) != 0) {
                    findFocus.getDrawingRect(this.f18427b);
                    offsetDescendantRectToMyCoords(findFocus, this.f18427b);
                    m24322g(m24324a(this.f18427b));
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m24312a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        view = view.getParent();
        if (!(view instanceof ViewGroup) || m24312a(view, view2) == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public void m24337f(int i) {
        if (getChildCount() > 0) {
            m24326a(2, 1);
            this.f18428c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            this.f18446u = getScrollY();
            C0560r.m2189c(this);
        }
    }

    /* renamed from: h */
    private void m24323h(int i) {
        boolean z;
        float f;
        int scrollY = getScrollY();
        if (scrollY > 0 || i > 0) {
            if (scrollY >= getScrollRange()) {
                if (i < 0) {
                }
            }
            z = true;
            f = (float) i;
            if (!dispatchNestedPreFling(0.0f, f)) {
                dispatchNestedFling(0.0f, f, z);
                m24337f(i);
            }
        }
        z = false;
        f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            m24337f(i);
        }
    }

    /* renamed from: f */
    private void m24320f() {
        this.f18435j = false;
        m24319e();
        m24325a(0);
        if (this.f18429d != null) {
            this.f18429d.onRelease();
            this.f18430e.onRelease();
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            i = m24313b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            i2 = m24313b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    /* renamed from: g */
    private void m24321g() {
        if (getOverScrollMode() == 2) {
            this.f18429d = null;
            this.f18430e = null;
        } else if (this.f18429d == null) {
            Context context = getContext();
            this.f18429d = new EdgeEffect(context);
            this.f18430e = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f18429d != null) {
            int save;
            int width;
            int height;
            int scrollY = getScrollY();
            int i = 0;
            if (!this.f18429d.isFinished()) {
                int i2;
                save = canvas.save();
                width = getWidth();
                height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT >= 21) {
                    if (!getClipToPadding()) {
                        i2 = 0;
                        if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                            height -= getPaddingTop() + getPaddingBottom();
                            min += getPaddingTop();
                        }
                        canvas.translate((float) i2, (float) min);
                        this.f18429d.setSize(width, height);
                        if (this.f18429d.draw(canvas)) {
                            C0560r.m2189c(this);
                        }
                        canvas.restoreToCount(save);
                    }
                }
                width -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft() + 0;
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
                canvas.translate((float) i2, (float) min);
                this.f18429d.setSize(width, height);
                if (this.f18429d.draw(canvas)) {
                    C0560r.m2189c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f18430e.isFinished()) {
                save = canvas.save();
                width = getWidth();
                height = getHeight();
                scrollY = Math.max(getScrollRange(), scrollY) + height;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    scrollY -= getPaddingBottom();
                }
                canvas.translate((float) (i - width), (float) scrollY);
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.f18430e.setSize(width, height);
                if (this.f18430e.draw(canvas)) {
                    C0560r.m2189c(this);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f18447v = savedState;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1842a = getScrollY();
        return savedState;
    }
}
