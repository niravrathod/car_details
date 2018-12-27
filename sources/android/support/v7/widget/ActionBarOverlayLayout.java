package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.C0552k;
import android.support.v4.view.C0553m;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.view.menu.C0728o.C0727a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

public class ActionBarOverlayLayout extends ViewGroup implements C0552k, C0873v {
    /* renamed from: e */
    static final int[] f13656e = new int[]{C0627a.actionBarSize, 16842841};
    /* renamed from: A */
    private final Runnable f13657A;
    /* renamed from: B */
    private final Runnable f13658B;
    /* renamed from: C */
    private final C0553m f13659C;
    /* renamed from: a */
    ActionBarContainer f13660a;
    /* renamed from: b */
    boolean f13661b;
    /* renamed from: c */
    ViewPropertyAnimator f13662c;
    /* renamed from: d */
    final AnimatorListenerAdapter f13663d;
    /* renamed from: f */
    private int f13664f;
    /* renamed from: g */
    private int f13665g;
    /* renamed from: h */
    private ContentFrameLayout f13666h;
    /* renamed from: i */
    private C0874w f13667i;
    /* renamed from: j */
    private Drawable f13668j;
    /* renamed from: k */
    private boolean f13669k;
    /* renamed from: l */
    private boolean f13670l;
    /* renamed from: m */
    private boolean f13671m;
    /* renamed from: n */
    private boolean f13672n;
    /* renamed from: o */
    private int f13673o;
    /* renamed from: p */
    private int f13674p;
    /* renamed from: q */
    private final Rect f13675q;
    /* renamed from: r */
    private final Rect f13676r;
    /* renamed from: s */
    private final Rect f13677s;
    /* renamed from: t */
    private final Rect f13678t;
    /* renamed from: u */
    private final Rect f13679u;
    /* renamed from: v */
    private final Rect f13680v;
    /* renamed from: w */
    private final Rect f13681w;
    /* renamed from: x */
    private C0739a f13682x;
    /* renamed from: y */
    private final int f13683y;
    /* renamed from: z */
    private OverScroller f13684z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$1 */
    class C07361 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ActionBarOverlayLayout f2347a;

        C07361(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f2347a = actionBarOverlayLayout;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2347a.f13662c = null;
            this.f2347a.f13661b = false;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2347a.f13662c = null;
            this.f2347a.f13661b = false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$2 */
    class C07372 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ActionBarOverlayLayout f2348a;

        C07372(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f2348a = actionBarOverlayLayout;
        }

        public void run() {
            this.f2348a.m16266d();
            this.f2348a.f13662c = this.f2348a.f13660a.animate().translationY(0.0f).setListener(this.f2348a.f13663d);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$3 */
    class C07383 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ActionBarOverlayLayout f2349a;

        C07383(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f2349a = actionBarOverlayLayout;
        }

        public void run() {
            this.f2349a.m16266d();
            this.f2349a.f13662c = this.f2349a.f13660a.animate().translationY((float) (-this.f2349a.f13660a.getHeight())).setListener(this.f2349a.f13663d);
        }
    }

    public static class LayoutParams extends MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C0739a {
        /* renamed from: c */
        void mo565c(int i);

        /* renamed from: i */
        void mo567i(boolean z);

        /* renamed from: j */
        void mo568j();

        /* renamed from: k */
        void mo569k();

        /* renamed from: l */
        void mo570l();

        /* renamed from: m */
        void mo571m();
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m16264b();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m16261a(attributeSet);
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13665g = null;
        this.f13675q = new Rect();
        this.f13676r = new Rect();
        this.f13677s = new Rect();
        this.f13678t = new Rect();
        this.f13679u = new Rect();
        this.f13680v = new Rect();
        this.f13681w = new Rect();
        this.f13683y = 600;
        this.f13663d = new C07361(this);
        this.f13657A = new C07372(this);
        this.f13658B = new C07383(this);
        m16254a(context);
        this.f13659C = new C0553m(this);
    }

    /* renamed from: a */
    private void m16254a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f13656e);
        boolean z = false;
        this.f13664f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f13668j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f13668j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f13669k = z;
        this.f13684z = new OverScroller(context);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m16266d();
    }

    public void setActionBarVisibilityCallback(C0739a c0739a) {
        this.f13682x = c0739a;
        if (getWindowToken() != null) {
            this.f13682x.mo565c(this.f13665g);
            if (this.f13674p != null) {
                onWindowSystemUiVisibilityChanged(this.f13674p);
                C0560r.m2204p(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.f13670l = z;
        z = z && getContext().getApplicationInfo().targetSdkVersion < true;
        this.f13669k = z;
    }

    /* renamed from: a */
    public boolean m16263a() {
        return this.f13670l;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f13671m = z;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m16254a(getContext());
        C0560r.m2204p(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m16265c();
        int i2 = this.f13674p ^ i;
        this.f13674p = i;
        int i3 = 0;
        Object obj = (i & 4) == 0 ? 1 : null;
        if ((i & 256) != 0) {
            i3 = 1;
        }
        if (this.f13682x != 0) {
            this.f13682x.mo567i(i3 ^ 1);
            if (obj == null) {
                if (i3 != 0) {
                    this.f13682x.mo569k();
                }
            }
            this.f13682x.mo568j();
        }
        if ((i2 & 256) != 0 && this.f13682x != 0) {
            C0560r.m2204p(this);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f13665g = i;
        if (this.f13682x != null) {
            this.f13682x.mo565c(i);
        }
    }

    /* renamed from: a */
    private boolean m16256a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z || layoutParams.leftMargin == rect.left) {
            z = false;
        } else {
            layoutParams.leftMargin = rect.left;
            z = true;
        }
        if (z2 && layoutParams.topMargin != rect.top) {
            layoutParams.topMargin = rect.top;
            z = true;
        }
        if (z4 && layoutParams.rightMargin != rect.right) {
            layoutParams.rightMargin = rect.right;
            z = true;
        }
        if (!z3 || layoutParams.bottomMargin == rect.bottom) {
            return z;
        }
        layoutParams.bottomMargin = rect.bottom;
        return true;
    }

    protected boolean fitSystemWindows(Rect rect) {
        m16265c();
        int o = C0560r.m2203o(this) & 256;
        boolean a = m16256a(this.f13660a, rect, true, true, false, true);
        this.f13678t.set(rect);
        bg.m3614a(this, this.f13678t, this.f13675q);
        if (this.f13679u.equals(this.f13678t) == null) {
            this.f13679u.set(this.f13678t);
            a = true;
        }
        if (this.f13676r.equals(this.f13675q) == null) {
            this.f13676r.set(this.f13675q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: b */
    protected LayoutParams m16264b() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: a */
    public LayoutParams m16261a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        m16265c();
        measureChildWithMargins(this.f13660a, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f13660a.getLayoutParams();
        int max = Math.max(0, (this.f13660a.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin);
        int max2 = Math.max(0, (this.f13660a.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f13660a.getMeasuredState());
        Object obj = (C0560r.m2203o(this) & 256) != 0 ? 1 : null;
        if (obj != null) {
            i3 = this.f13664f;
            if (this.f13671m && this.f13660a.getTabContainer() != null) {
                i3 += this.f13664f;
            }
        } else {
            i3 = this.f13660a.getVisibility() != 8 ? this.f13660a.getMeasuredHeight() : 0;
        }
        this.f13677s.set(this.f13675q);
        this.f13680v.set(this.f13678t);
        Rect rect;
        if (this.f13670l || obj != null) {
            rect = this.f13680v;
            rect.top += i3;
            rect = this.f13680v;
            rect.bottom += 0;
        } else {
            rect = this.f13677s;
            rect.top += i3;
            rect = this.f13677s;
            rect.bottom += 0;
        }
        m16256a(this.f13666h, this.f13677s, true, true, true, true);
        if (!this.f13681w.equals(this.f13680v)) {
            this.f13681w.set(this.f13680v);
            this.f13666h.m2895a(this.f13680v);
        }
        measureChildWithMargins(this.f13666h, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f13666h.getLayoutParams();
        max = Math.max(max, (this.f13666h.getMeasuredWidth() + layoutParams2.leftMargin) + layoutParams2.rightMargin);
        max2 = Math.max(max2, (this.f13666h.getMeasuredHeight() + layoutParams2.topMargin) + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f13666h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max2 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = getChildCount();
        i = getPaddingLeft();
        getPaddingRight();
        i2 = getPaddingTop();
        getPaddingBottom();
        for (boolean z2 = false; z2 < z; z2++) {
            i4 = getChildAt(z2);
            if (i4.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) i4.getLayoutParams();
                int i5 = layoutParams.leftMargin + i;
                int i6 = layoutParams.topMargin + i2;
                i4.layout(i5, i6, i4.getMeasuredWidth() + i5, i4.getMeasuredHeight() + i6);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f13668j != null && !this.f13669k) {
            int bottom = this.f13660a.getVisibility() == 0 ? (int) ((((float) this.f13660a.getBottom()) + this.f13660a.getTranslationY()) + 0.5f) : 0;
            this.f13668j.setBounds(0, bottom, getWidth(), this.f13668j.getIntrinsicHeight() + bottom);
            this.f13668j.draw(canvas);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != null) {
            if (this.f13660a.getVisibility() == null) {
                return this.f13672n;
            }
        }
        return null;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f13659C.m2083a(view, view2, i);
        this.f13673o = getActionBarHideOffset();
        m16266d();
        if (this.f13682x != null) {
            this.f13682x.mo570l();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f13673o += i2;
        setActionBarHideOffset(this.f13673o);
    }

    public void onStopNestedScroll(View view) {
        if (this.f13672n != null && this.f13661b == null) {
            if (this.f13673o <= this.f13660a.getHeight()) {
                m16257k();
            } else {
                m16258l();
            }
        }
        if (this.f13682x != null) {
            this.f13682x.mo571m();
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f13672n != null) {
            if (z) {
                if (m16255a(f, f2) != null) {
                    m16260n();
                } else {
                    m16259m();
                }
                this.f13661b = true;
                return true;
            }
        }
        return null;
    }

    public int getNestedScrollAxes() {
        return this.f13659C.m2080a();
    }

    /* renamed from: c */
    void m16265c() {
        if (this.f13666h == null) {
            this.f13666h = (ContentFrameLayout) findViewById(C0632f.action_bar_activity_content);
            this.f13660a = (ActionBarContainer) findViewById(C0632f.action_bar_container);
            this.f13667i = m16253a(findViewById(C0632f.action_bar));
        }
    }

    /* renamed from: a */
    private C0874w m16253a(View view) {
        if (view instanceof C0874w) {
            return (C0874w) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't make a decor toolbar out of ");
        stringBuilder.append(view.getClass().getSimpleName());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f13672n) {
            this.f13672n = z;
            if (!z) {
                m16266d();
                setActionBarHideOffset(false);
            }
        }
    }

    public int getActionBarHideOffset() {
        return this.f13660a != null ? -((int) this.f13660a.getTranslationY()) : 0;
    }

    public void setActionBarHideOffset(int i) {
        m16266d();
        this.f13660a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f13660a.getHeight()))));
    }

    /* renamed from: d */
    void m16266d() {
        removeCallbacks(this.f13657A);
        removeCallbacks(this.f13658B);
        if (this.f13662c != null) {
            this.f13662c.cancel();
        }
    }

    /* renamed from: k */
    private void m16257k() {
        m16266d();
        postDelayed(this.f13657A, 600);
    }

    /* renamed from: l */
    private void m16258l() {
        m16266d();
        postDelayed(this.f13658B, 600);
    }

    /* renamed from: m */
    private void m16259m() {
        m16266d();
        this.f13657A.run();
    }

    /* renamed from: n */
    private void m16260n() {
        m16266d();
        this.f13658B.run();
    }

    /* renamed from: a */
    private boolean m16255a(float f, float f2) {
        this.f13684z.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, BaseClientBuilder.API_PRIORITY_OTHER);
        return this.f13684z.getFinalY() > this.f13660a.getHeight();
    }

    public void setWindowCallback(Callback callback) {
        m16265c();
        this.f13667i.mo796a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        m16265c();
        this.f13667i.mo797a(charSequence);
    }

    public CharSequence getTitle() {
        m16265c();
        return this.f13667i.mo808e();
    }

    /* renamed from: a */
    public void mo624a(int i) {
        m16265c();
        if (i == 2) {
            this.f13667i.mo810f();
        } else if (i == 5) {
            this.f13667i.mo811g();
        } else if (i == 109) {
            setOverlayMode(1);
        }
    }

    public void setIcon(int i) {
        m16265c();
        this.f13667i.mo791a(i);
    }

    public void setIcon(Drawable drawable) {
        m16265c();
        this.f13667i.mo792a(drawable);
    }

    public void setLogo(int i) {
        m16265c();
        this.f13667i.mo800b(i);
    }

    /* renamed from: e */
    public boolean mo625e() {
        m16265c();
        return this.f13667i.mo812h();
    }

    /* renamed from: f */
    public boolean mo626f() {
        m16265c();
        return this.f13667i.mo813i();
    }

    /* renamed from: g */
    public boolean mo627g() {
        m16265c();
        return this.f13667i.mo814j();
    }

    /* renamed from: h */
    public boolean mo628h() {
        m16265c();
        return this.f13667i.mo815k();
    }

    /* renamed from: i */
    public boolean mo629i() {
        m16265c();
        return this.f13667i.mo816l();
    }

    public void setMenuPrepared() {
        m16265c();
        this.f13667i.mo817m();
    }

    public void setMenu(Menu menu, C0727a c0727a) {
        m16265c();
        this.f13667i.mo795a(menu, c0727a);
    }

    /* renamed from: j */
    public void mo630j() {
        m16265c();
        this.f13667i.mo818n();
    }
}
