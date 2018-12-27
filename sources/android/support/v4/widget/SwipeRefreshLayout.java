package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.content.C0389b;
import android.support.v4.view.C0550h;
import android.support.v4.view.C0551j;
import android.support.v4.view.C0552k;
import android.support.v4.view.C0553m;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;

public class SwipeRefreshLayout extends ViewGroup implements C0550h, C0552k {
    /* renamed from: D */
    private static final int[] f13337D = new int[]{16842766};
    /* renamed from: m */
    private static final String f13338m = "SwipeRefreshLayout";
    /* renamed from: A */
    private int f13339A;
    /* renamed from: B */
    private boolean f13340B;
    /* renamed from: C */
    private final DecelerateInterpolator f13341C;
    /* renamed from: E */
    private int f13342E;
    /* renamed from: F */
    private Animation f13343F;
    /* renamed from: G */
    private Animation f13344G;
    /* renamed from: H */
    private Animation f13345H;
    /* renamed from: I */
    private Animation f13346I;
    /* renamed from: J */
    private Animation f13347J;
    /* renamed from: K */
    private int f13348K;
    /* renamed from: L */
    private C0592a f13349L;
    /* renamed from: M */
    private AnimationListener f13350M;
    /* renamed from: N */
    private final Animation f13351N;
    /* renamed from: O */
    private final Animation f13352O;
    /* renamed from: a */
    C0593b f13353a;
    /* renamed from: b */
    boolean f13354b;
    /* renamed from: c */
    int f13355c;
    /* renamed from: d */
    boolean f13356d;
    /* renamed from: e */
    C0599c f13357e;
    /* renamed from: f */
    protected int f13358f;
    /* renamed from: g */
    float f13359g;
    /* renamed from: h */
    protected int f13360h;
    /* renamed from: i */
    int f13361i;
    /* renamed from: j */
    C0603d f13362j;
    /* renamed from: k */
    boolean f13363k;
    /* renamed from: l */
    boolean f13364l;
    /* renamed from: n */
    private View f13365n;
    /* renamed from: o */
    private int f13366o;
    /* renamed from: p */
    private float f13367p;
    /* renamed from: q */
    private float f13368q;
    /* renamed from: r */
    private final C0553m f13369r;
    /* renamed from: s */
    private final C0551j f13370s;
    /* renamed from: t */
    private final int[] f13371t;
    /* renamed from: u */
    private final int[] f13372u;
    /* renamed from: v */
    private boolean f13373v;
    /* renamed from: w */
    private int f13374w;
    /* renamed from: x */
    private float f13375x;
    /* renamed from: y */
    private float f13376y;
    /* renamed from: z */
    private boolean f13377z;

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$1 */
    class C05841 implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1871a;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        C05841(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1871a = swipeRefreshLayout;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f1871a.f13354b != null) {
                this.f1871a.f13362j.setAlpha(255);
                this.f1871a.f13362j.start();
                if (!(this.f1871a.f13363k == null || this.f1871a.f13353a == null)) {
                    this.f1871a.f13353a.m2342a();
                }
                this.f1871a.f13355c = this.f1871a.f13357e.getTop();
                return;
            }
            this.f1871a.m15842a();
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$2 */
    class C05852 extends Animation {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1872a;

        C05852(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1872a = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            this.f1872a.setAnimationProgress(f);
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$3 */
    class C05863 extends Animation {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1873a;

        C05863(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1873a = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            this.f1873a.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$5 */
    class C05885 implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1877a;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        C05885(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1877a = swipeRefreshLayout;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f1877a.f13356d == null) {
                this.f1877a.m15844a(null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$6 */
    class C05896 extends Animation {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1878a;

        C05896(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1878a = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            if (this.f1878a.f13364l == null) {
                transformation = this.f1878a.f13361i - Math.abs(this.f1878a.f13360h);
            } else {
                transformation = this.f1878a.f13361i;
            }
            this.f1878a.setTargetOffsetTopAndBottom((this.f1878a.f13358f + ((int) (((float) (transformation - this.f1878a.f13358f)) * f))) - this.f1878a.f13357e.getTop());
            this.f1878a.f13362j.m2426b(1.0f - f);
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$7 */
    class C05907 extends Animation {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1879a;

        C05907(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1879a = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            this.f1879a.m15843a(f);
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$8 */
    class C05918 extends Animation {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1880a;

        C05918(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1880a = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            this.f1880a.setAnimationProgress(this.f1880a.f13359g + ((-this.f1880a.f13359g) * f));
            this.f1880a.m15843a(f);
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$a */
    public interface C0592a {
        /* renamed from: a */
        boolean m2341a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$b */
    public interface C0593b {
        /* renamed from: a */
        void m2342a();
    }

    /* renamed from: a */
    void m15842a() {
        this.f13357e.clearAnimation();
        this.f13362j.stop();
        this.f13357e.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f13356d) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f13360h - this.f13355c);
        }
        this.f13355c = this.f13357e.getTop();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            m15842a();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m15842a();
    }

    private void setColorViewAlpha(int i) {
        this.f13357e.getBackground().setAlpha(i);
        this.f13362j.setAlpha(i);
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.f13356d = z;
        this.f13360h = i;
        this.f13361i = i2;
        this.f13364l = true;
        m15842a();
        this.f13354b = false;
    }

    public int getProgressViewStartOffset() {
        return this.f13360h;
    }

    public int getProgressViewEndOffset() {
        return this.f13361i;
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.f13361i = i;
        this.f13356d = z;
        this.f13357e.invalidate();
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f13348K = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f13348K = (int) (displayMetrics.density * 40.0f);
            }
            this.f13357e.setImageDrawable(null);
            this.f13362j.m2423a(i);
            this.f13357e.setImageDrawable(this.f13362j);
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13354b = false;
        this.f13367p = -1.0f;
        this.f13371t = new int[2];
        this.f13372u = new int[2];
        this.f13339A = -1;
        this.f13342E = -1;
        this.f13350M = new C05841(this);
        this.f13351N = new C05896(this);
        this.f13352O = new C05907(this);
        this.f13366o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f13374w = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f13341C = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f13348K = (int) (displayMetrics.density * 40.0f);
        m15835c();
        setChildrenDrawingOrderEnabled(true);
        this.f13361i = (int) (displayMetrics.density * 64.0f);
        this.f13367p = (float) this.f13361i;
        this.f13369r = new C0553m(this);
        this.f13370s = new C0551j(this);
        setNestedScrollingEnabled(true);
        int i = -this.f13348K;
        this.f13355c = i;
        this.f13360h = i;
        m15843a(1.0f);
        context = context.obtainStyledAttributes(attributeSet, f13337D);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f13342E < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.f13342E;
        }
        return i2 >= this.f13342E ? i2 + 1 : i2;
    }

    /* renamed from: c */
    private void m15835c() {
        this.f13357e = new C0599c(getContext(), -328966);
        this.f13362j = new C0603d(getContext());
        this.f13362j.m2423a(1);
        this.f13357e.setImageDrawable(this.f13362j);
        this.f13357e.setVisibility(8);
        addView(this.f13357e);
    }

    public void setOnRefreshListener(C0593b c0593b) {
        this.f13353a = c0593b;
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f13354b == z) {
            m15830a(z, false);
            return;
        }
        this.f13354b = z;
        if (this.f13364l) {
            z = this.f13361i;
        } else {
            z = this.f13361i + this.f13360h;
        }
        setTargetOffsetTopAndBottom(z - this.f13355c);
        this.f13363k = false;
        m15834b(this.f13350M);
    }

    /* renamed from: b */
    private void m15834b(AnimationListener animationListener) {
        this.f13357e.setVisibility(0);
        this.f13362j.setAlpha(255);
        this.f13343F = new C05852(this);
        this.f13343F.setDuration((long) this.f13374w);
        if (animationListener != null) {
            this.f13357e.m2380a(animationListener);
        }
        this.f13357e.clearAnimation();
        this.f13357e.startAnimation(this.f13343F);
    }

    void setAnimationProgress(float f) {
        this.f13357e.setScaleX(f);
        this.f13357e.setScaleY(f);
    }

    /* renamed from: a */
    private void m15830a(boolean z, boolean z2) {
        if (this.f13354b != z) {
            this.f13363k = z2;
            m15841f();
            this.f13354b = z;
            if (this.f13354b) {
                m15828a(this.f13355c, this.f13350M);
            } else {
                m15844a(this.f13350M);
            }
        }
    }

    /* renamed from: a */
    void m15844a(AnimationListener animationListener) {
        this.f13344G = new C05863(this);
        this.f13344G.setDuration(150);
        this.f13357e.m2380a(animationListener);
        this.f13357e.clearAnimation();
        this.f13357e.startAnimation(this.f13344G);
    }

    /* renamed from: d */
    private void m15838d() {
        this.f13345H = m15827a(this.f13362j.getAlpha(), 76);
    }

    /* renamed from: e */
    private void m15840e() {
        this.f13346I = m15827a(this.f13362j.getAlpha(), 255);
    }

    /* renamed from: a */
    private Animation m15827a(final int i, final int i2) {
        Animation c05874 = new Animation(this) {
            /* renamed from: c */
            final /* synthetic */ SwipeRefreshLayout f1876c;

            public void applyTransformation(float f, Transformation transformation) {
                this.f1876c.f13362j.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        c05874.setDuration(300);
        this.f13357e.m2380a(0);
        this.f13357e.clearAnimation();
        this.f13357e.startAnimation(c05874);
        return c05874;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0389b.m1438c(getContext(), i));
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f13357e.setBackgroundColor(i);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0389b.m1438c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        m15841f();
        this.f13362j.m2425a(iArr);
    }

    /* renamed from: f */
    private void m15841f() {
        if (this.f13365n == null) {
            int i = 0;
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (childAt.equals(this.f13357e)) {
                    i++;
                } else {
                    this.f13365n = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.f13367p = (float) i;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = getMeasuredWidth();
        i = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f13365n == 0) {
                m15841f();
            }
            if (this.f13365n != 0) {
                i2 = this.f13365n;
                i3 = getPaddingLeft();
                i4 = getPaddingTop();
                i2.layout(i3, i4, ((z - getPaddingLeft()) - getPaddingRight()) + i3, ((i - getPaddingTop()) - getPaddingBottom()) + i4);
                i = this.f13357e.getMeasuredWidth();
                z /= 2;
                i /= 2;
                this.f13357e.layout(z - i, this.f13355c, z + i, this.f13355c + this.f13357e.getMeasuredHeight());
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f13365n == 0) {
            m15841f();
        }
        if (this.f13365n != 0) {
            this.f13365n.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f13357e.measure(MeasureSpec.makeMeasureSpec(this.f13348K, 1073741824), MeasureSpec.makeMeasureSpec(this.f13348K, 1073741824));
            this.f13342E = -1;
            for (i = 0; i < getChildCount(); i++) {
                if (getChildAt(i) == this.f13357e) {
                    this.f13342E = i;
                    break;
                }
            }
        }
    }

    public int getProgressCircleDiameter() {
        return this.f13348K;
    }

    /* renamed from: b */
    public boolean m15845b() {
        if (this.f13349L != null) {
            return this.f13349L.m2341a(this, this.f13365n);
        }
        if (this.f13365n instanceof ListView) {
            return C0615l.m2460b((ListView) this.f13365n, -1);
        }
        return this.f13365n.canScrollVertically(-1);
    }

    public void setOnChildScrollUpCallback(C0592a c0592a) {
        this.f13349L = c0592a;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m15841f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f13340B && actionMasked == 0) {
            this.f13340B = false;
        }
        if (!(!isEnabled() || this.f13340B || m15845b() || this.f13354b)) {
            if (!this.f13373v) {
                if (actionMasked != 6) {
                    switch (actionMasked) {
                        case 0:
                            setTargetOffsetTopAndBottom(this.f13360h - this.f13357e.getTop());
                            this.f13339A = motionEvent.getPointerId(0);
                            this.f13377z = false;
                            actionMasked = motionEvent.findPointerIndex(this.f13339A);
                            if (actionMasked >= 0) {
                                this.f13376y = motionEvent.getY(actionMasked);
                                break;
                            }
                            return false;
                        case 1:
                        case 3:
                            this.f13377z = false;
                            this.f13339A = -1;
                            break;
                        case 2:
                            if (this.f13339A != -1) {
                                actionMasked = motionEvent.findPointerIndex(this.f13339A);
                                if (actionMasked >= 0) {
                                    m15839d(motionEvent.getY(actionMasked));
                                    break;
                                }
                                return false;
                            }
                            Log.e(f13338m, "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        default:
                            break;
                    }
                }
                m15829a(motionEvent);
                return this.f13377z;
            }
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT < 21 && (this.f13365n instanceof AbsListView)) {
            return;
        }
        if (this.f13365n == null || C0560r.m2210v(this.f13365n)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (isEnabled() == null || this.f13340B != null || this.f13354b != null || (i & 2) == null) ? null : true;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f13369r.m2083a(view, view2, i);
        startNestedScroll(i & 2);
        this.f13368q = null;
        this.f13373v = true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f13368q > 0.0f) {
            float f = (float) i2;
            if (f > this.f13368q) {
                iArr[1] = i2 - ((int) this.f13368q);
                this.f13368q = 0.0f;
            } else {
                this.f13368q -= f;
                iArr[1] = i2;
            }
            m15832b(this.f13368q);
        }
        if (this.f13364l && i2 > 0 && this.f13368q == 0.0f && Math.abs(i2 - iArr[1]) > null) {
            this.f13357e.setVisibility(8);
        }
        view = this.f13371t;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], view, null) != 0) {
            iArr[0] = iArr[0] + view[0];
            iArr[1] = iArr[1] + view[1];
        }
    }

    public int getNestedScrollAxes() {
        return this.f13369r.m2080a();
    }

    public void onStopNestedScroll(View view) {
        this.f13369r.m2081a(view);
        this.f13373v = null;
        if (this.f13368q > null) {
            m15836c(this.f13368q);
            this.f13368q = 0.0f;
        }
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f13372u);
        i4 += this.f13372u[1];
        if (i4 < 0 && m15845b() == null) {
            this.f13368q += (float) Math.abs(i4);
            m15832b(this.f13368q);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f13370s.m2066a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f13370s.m2067a();
    }

    public boolean startNestedScroll(int i) {
        return this.f13370s.m2077b(i);
    }

    public void stopNestedScroll() {
        this.f13370s.m2078c();
    }

    public boolean hasNestedScrollingParent() {
        return this.f13370s.m2076b();
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f13370s.m2072a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f13370s.m2074a(i, i2, iArr, iArr2);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f13370s.m2069a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f13370s.m2068a(f, f2);
    }

    /* renamed from: a */
    private boolean m15831a(Animation animation) {
        return (animation != null && animation.hasStarted() && animation.hasEnded() == null) ? true : null;
    }

    /* renamed from: b */
    private void m15832b(float f) {
        this.f13362j.m2424a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f13367p));
        double d = (double) min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float f2 = (float) (this.f13364l ? this.f13361i - this.f13360h : this.f13361i);
        double max2 = (double) (Math.max(0.0f, Math.min(Math.abs(f) - this.f13367p, f2 * 2.0f) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i = this.f13360h + ((int) ((f2 * min) + ((f2 * f3) * 2.0f)));
        if (this.f13357e.getVisibility() != 0) {
            this.f13357e.setVisibility(0);
        }
        if (!this.f13356d) {
            this.f13357e.setScaleX(1.0f);
            this.f13357e.setScaleY(1.0f);
        }
        if (this.f13356d) {
            setAnimationProgress(Math.min(1.0f, f / this.f13367p));
        }
        if (f < this.f13367p) {
            if (this.f13362j.getAlpha() > 76 && m15831a(this.f13345H) == null) {
                m15838d();
            }
        } else if (this.f13362j.getAlpha() < 255 && m15831a(this.f13346I) == null) {
            m15840e();
        }
        this.f13362j.m2422a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f13362j.m2426b(Math.min(1.0f, max));
        this.f13362j.m2427c((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i - this.f13355c);
    }

    /* renamed from: c */
    private void m15836c(float f) {
        if (f > this.f13367p) {
            m15830a(true, true);
            return;
        }
        this.f13354b = false;
        this.f13362j.m2422a(0.0f, 0.0f);
        AnimationListener animationListener = null;
        if (!this.f13356d) {
            animationListener = new C05885(this);
        }
        m15833b(this.f13355c, animationListener);
        this.f13362j.m2424a(false);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f13340B && actionMasked == 0) {
            this.f13340B = false;
        }
        if (!(!isEnabled() || this.f13340B || m15845b() || this.f13354b)) {
            if (!this.f13373v) {
                switch (actionMasked) {
                    case 0:
                        this.f13339A = motionEvent.getPointerId(0);
                        this.f13377z = false;
                        break;
                    case 1:
                        actionMasked = motionEvent.findPointerIndex(this.f13339A);
                        if (actionMasked < 0) {
                            Log.e(f13338m, "Got ACTION_UP event but don't have an active pointer id.");
                            return false;
                        }
                        if (this.f13377z) {
                            motionEvent = (motionEvent.getY(actionMasked) - this.f13375x) * 1056964608;
                            this.f13377z = false;
                            m15836c(motionEvent);
                        }
                        this.f13339A = -1;
                        return false;
                    case 2:
                        actionMasked = motionEvent.findPointerIndex(this.f13339A);
                        if (actionMasked < 0) {
                            Log.e(f13338m, "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        motionEvent = motionEvent.getY(actionMasked);
                        m15839d(motionEvent);
                        if (this.f13377z) {
                            float f = (motionEvent - this.f13375x) * 1056964608;
                            if (f > 0.0f) {
                                m15832b(f);
                                break;
                            }
                            return false;
                        }
                        break;
                    case 3:
                        return false;
                    case 5:
                        actionMasked = motionEvent.getActionIndex();
                        if (actionMasked >= 0) {
                            this.f13339A = motionEvent.getPointerId(actionMasked);
                            break;
                        }
                        Log.e(f13338m, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    case 6:
                        m15829a(motionEvent);
                        break;
                    default:
                        break;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m15839d(float f) {
        if (f - this.f13376y > ((float) this.f13366o) && this.f13377z == null) {
            this.f13375x = this.f13376y + ((float) this.f13366o);
            this.f13377z = true;
            this.f13362j.setAlpha(76);
        }
    }

    /* renamed from: a */
    private void m15828a(int i, AnimationListener animationListener) {
        this.f13358f = i;
        this.f13351N.reset();
        this.f13351N.setDuration(200);
        this.f13351N.setInterpolator(this.f13341C);
        if (animationListener != null) {
            this.f13357e.m2380a(animationListener);
        }
        this.f13357e.clearAnimation();
        this.f13357e.startAnimation(this.f13351N);
    }

    /* renamed from: b */
    private void m15833b(int i, AnimationListener animationListener) {
        if (this.f13356d) {
            m15837c(i, animationListener);
            return;
        }
        this.f13358f = i;
        this.f13352O.reset();
        this.f13352O.setDuration(200);
        this.f13352O.setInterpolator(this.f13341C);
        if (animationListener != null) {
            this.f13357e.m2380a(animationListener);
        }
        this.f13357e.clearAnimation();
        this.f13357e.startAnimation(this.f13352O);
    }

    /* renamed from: a */
    void m15843a(float f) {
        setTargetOffsetTopAndBottom((this.f13358f + ((int) (((float) (this.f13360h - this.f13358f)) * f))) - this.f13357e.getTop());
    }

    /* renamed from: c */
    private void m15837c(int i, AnimationListener animationListener) {
        this.f13358f = i;
        this.f13359g = this.f13357e.getScaleX();
        this.f13347J = new C05918(this);
        this.f13347J.setDuration(150);
        if (animationListener != null) {
            this.f13357e.m2380a(animationListener);
        }
        this.f13357e.clearAnimation();
        this.f13357e.startAnimation(this.f13347J);
    }

    void setTargetOffsetTopAndBottom(int i) {
        this.f13357e.bringToFront();
        C0560r.m2190c(this.f13357e, i);
        this.f13355c = this.f13357e.getTop();
    }

    /* renamed from: a */
    private void m15829a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f13339A) {
            this.f13339A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
