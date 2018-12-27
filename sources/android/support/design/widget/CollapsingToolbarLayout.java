package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.C0143a.C0137f;
import android.support.design.C0143a.C0141j;
import android.support.design.C0143a.C0142k;
import android.support.design.widget.AppBarLayout.C0153a;
import android.support.v4.content.C0389b;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.p013c.C0373a;
import android.support.v4.p017f.C0428i;
import android.support.v4.view.C0554n;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0571z;
import android.support.v4.widget.C0626s;
import android.support.v7.p020a.C0637a.C0635i;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;

public class CollapsingToolbarLayout extends FrameLayout {
    /* renamed from: a */
    final C0202e f573a;
    /* renamed from: b */
    Drawable f574b;
    /* renamed from: c */
    int f575c;
    /* renamed from: d */
    C0571z f576d;
    /* renamed from: e */
    private boolean f577e;
    /* renamed from: f */
    private int f578f;
    /* renamed from: g */
    private Toolbar f579g;
    /* renamed from: h */
    private View f580h;
    /* renamed from: i */
    private View f581i;
    /* renamed from: j */
    private int f582j;
    /* renamed from: k */
    private int f583k;
    /* renamed from: l */
    private int f584l;
    /* renamed from: m */
    private int f585m;
    /* renamed from: n */
    private final Rect f586n;
    /* renamed from: o */
    private boolean f587o;
    /* renamed from: p */
    private boolean f588p;
    /* renamed from: q */
    private Drawable f589q;
    /* renamed from: r */
    private int f590r;
    /* renamed from: s */
    private boolean f591s;
    /* renamed from: t */
    private ValueAnimator f592t;
    /* renamed from: u */
    private long f593u;
    /* renamed from: v */
    private int f594v;
    /* renamed from: w */
    private C0153a f595w;

    /* renamed from: android.support.design.widget.CollapsingToolbarLayout$2 */
    class C01602 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ CollapsingToolbarLayout f570a;

        C01602(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f570a = collapsingToolbarLayout;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f570a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams {
        /* renamed from: a */
        int f571a = 0;
        /* renamed from: b */
        float f572b = 1056964608;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, C0142k.CollapsingToolbarLayout_Layout);
            this.f571a = context.getInt(C0142k.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            m524a(context.getFloat(C0142k.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            context.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void m524a(float f) {
            this.f572b = f;
        }
    }

    /* renamed from: android.support.design.widget.CollapsingToolbarLayout$1 */
    class C30481 implements C0554n {
        /* renamed from: a */
        final /* synthetic */ CollapsingToolbarLayout f12878a;

        C30481(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f12878a = collapsingToolbarLayout;
        }

        /* renamed from: a */
        public C0571z mo88a(View view, C0571z c0571z) {
            return this.f12878a.m533a(c0571z);
        }
    }

    /* renamed from: android.support.design.widget.CollapsingToolbarLayout$a */
    private class C3049a implements C0153a {
        /* renamed from: a */
        final /* synthetic */ CollapsingToolbarLayout f12879a;

        C3049a(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f12879a = collapsingToolbarLayout;
        }

        /* renamed from: a */
        public void mo120a(AppBarLayout appBarLayout, int i) {
            this.f12879a.f575c = i;
            appBarLayout = this.f12879a.f576d != null ? this.f12879a.f576d.m2253b() : null;
            int childCount = this.f12879a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f12879a.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C0220n a = CollapsingToolbarLayout.m525a(childAt);
                switch (layoutParams.f571a) {
                    case 1:
                        a.m810a(C0373a.m1375a(-i, 0, this.f12879a.m535b(childAt)));
                        break;
                    case 2:
                        a.m810a(Math.round(((float) (-i)) * layoutParams.f572b));
                        break;
                    default:
                        break;
                }
            }
            this.f12879a.m536b();
            if (this.f12879a.f574b != null && appBarLayout > null) {
                C0560r.m2189c(this.f12879a);
            }
            this.f12879a.f573a.m726b(((float) Math.abs(i)) / ((float) ((this.f12879a.getHeight() - C0560r.m2198j(this.f12879a)) - appBarLayout)));
        }
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m532a();
    }

    /* renamed from: generateDefaultLayoutParams */
    protected /* synthetic */ android.widget.FrameLayout.LayoutParams m30384generateDefaultLayoutParams() {
        return m532a();
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m534a(layoutParams);
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f577e = true;
        this.f586n = new Rect();
        this.f594v = -1;
        C0219m.m807a(context);
        this.f573a = new C0202e(this);
        this.f573a.m722a(C0189a.f703e);
        context = context.obtainStyledAttributes(attributeSet, C0142k.CollapsingToolbarLayout, i, C0141j.Widget_Design_CollapsingToolbar);
        this.f573a.m717a(context.getInt(C0142k.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.f573a.m727b(context.getInt(C0142k.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        attributeSet = context.getDimensionPixelSize(C0142k.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f585m = attributeSet;
        this.f584l = attributeSet;
        this.f583k = attributeSet;
        this.f582j = attributeSet;
        if (context.hasValue(C0142k.CollapsingToolbarLayout_expandedTitleMarginStart) != null) {
            this.f582j = context.getDimensionPixelSize(C0142k.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (context.hasValue(C0142k.CollapsingToolbarLayout_expandedTitleMarginEnd) != null) {
            this.f584l = context.getDimensionPixelSize(C0142k.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (context.hasValue(C0142k.CollapsingToolbarLayout_expandedTitleMarginTop) != null) {
            this.f583k = context.getDimensionPixelSize(C0142k.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (context.hasValue(C0142k.CollapsingToolbarLayout_expandedTitleMarginBottom) != null) {
            this.f585m = context.getDimensionPixelSize(C0142k.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f587o = context.getBoolean(C0142k.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(context.getText(C0142k.CollapsingToolbarLayout_title));
        this.f573a.m736d(C0141j.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.f573a.m733c(C0635i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (context.hasValue(C0142k.CollapsingToolbarLayout_expandedTitleTextAppearance) != null) {
            this.f573a.m736d(context.getResourceId(C0142k.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (context.hasValue(C0142k.CollapsingToolbarLayout_collapsedTitleTextAppearance) != null) {
            this.f573a.m733c(context.getResourceId(C0142k.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f594v = context.getDimensionPixelSize(C0142k.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.f593u = (long) context.getInt(C0142k.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(context.getDrawable(C0142k.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(context.getDrawable(C0142k.CollapsingToolbarLayout_statusBarScrim));
        this.f578f = context.getResourceId(C0142k.CollapsingToolbarLayout_toolbarId, -1);
        context.recycle();
        setWillNotDraw(false);
        C0560r.m2176a((View) this, new C30481(this));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            C0560r.m2187b((View) this, C0560r.m2205q((View) parent));
            if (this.f595w == null) {
                this.f595w = new C3049a(this);
            }
            ((AppBarLayout) parent).m503a(this.f595w);
            C0560r.m2204p(this);
        }
    }

    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        if (this.f595w != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).m505b(this.f595w);
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    C0571z m533a(C0571z c0571z) {
        C0571z c0571z2 = C0560r.m2205q(this) ? c0571z : null;
        if (!C0428i.m1569a(this.f576d, c0571z2)) {
            this.f576d = c0571z2;
            requestLayout();
        }
        return c0571z.m2258g();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m527c();
        if (this.f579g == null && this.f589q != null && this.f590r > 0) {
            this.f589q.mutate().setAlpha(this.f590r);
            this.f589q.draw(canvas);
        }
        if (this.f587o && this.f588p) {
            this.f573a.m720a(canvas);
        }
        if (this.f574b != null && this.f590r > 0) {
            int b = this.f576d != null ? this.f576d.m2253b() : 0;
            if (b > 0) {
                this.f574b.setBounds(0, -this.f575c, getWidth(), b - this.f575c);
                this.f574b.mutate().setAlpha(this.f590r);
                this.f574b.draw(canvas);
            }
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        Object obj;
        if (this.f589q == null || this.f590r <= 0 || !m528c(view)) {
            obj = null;
        } else {
            this.f589q.mutate().setAlpha(this.f590r);
            this.f589q.draw(canvas);
            obj = 1;
        }
        if (super.drawChild(canvas, view, j) != null) {
            return true;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f589q != 0) {
            this.f589q.setBounds(0, 0, i, i2);
        }
    }

    /* renamed from: c */
    private void m527c() {
        if (this.f577e) {
            Toolbar toolbar = null;
            this.f579g = null;
            this.f580h = null;
            if (this.f578f != -1) {
                this.f579g = (Toolbar) findViewById(this.f578f);
                if (this.f579g != null) {
                    this.f580h = m529d(this.f579g);
                }
            }
            if (this.f579g == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                }
                this.f579g = toolbar;
            }
            m530d();
            this.f577e = false;
        }
    }

    /* renamed from: c */
    private boolean m528c(View view) {
        if (this.f580h != null) {
            if (this.f580h != this) {
                return view == this.f580h;
            }
        }
        if (view != this.f579g) {
            return false;
        }
    }

    /* renamed from: d */
    private View m529d(View view) {
        View parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: d */
    private void m530d() {
        if (!(this.f587o || this.f581i == null)) {
            ViewParent parent = this.f581i.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f581i);
            }
        }
        if (this.f587o && this.f579g != null) {
            if (this.f581i == null) {
                this.f581i = new View(getContext());
            }
            if (this.f581i.getParent() == null) {
                this.f579g.addView(this.f581i, -1, -1);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        m527c();
        super.onMeasure(i, i2);
        i2 = MeasureSpec.getMode(i2);
        int b = this.f576d != null ? this.f576d.m2253b() : 0;
        if (i2 == 0 && b > 0) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(getMeasuredHeight() + b, 1073741824));
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f576d) {
            z = this.f576d.m2253b();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C0560r.m2205q(childAt) && childAt.getTop() < z) {
                    C0560r.m2190c(childAt, z);
                }
            }
        }
        if (this.f587o && this.f581i) {
            Object obj = 1;
            z = C0560r.m2162A(this.f581i) && !this.f581i.getVisibility();
            this.f588p = z;
            if (this.f588p) {
                int titleMarginEnd;
                int titleMarginStart;
                if (!C0560r.m2193e(this)) {
                    obj = null;
                }
                z = m535b(this.f580h ? this.f580h : this.f579g);
                C0626s.m2535b(this, this.f581i, this.f586n);
                C0202e c0202e = this.f573a;
                int i6 = this.f586n.left;
                if (obj != null) {
                    titleMarginEnd = this.f579g.getTitleMarginEnd();
                } else {
                    titleMarginEnd = this.f579g.getTitleMarginStart();
                }
                i6 += titleMarginEnd;
                titleMarginEnd = (this.f586n.top + z) + this.f579g.getTitleMarginTop();
                int i7 = this.f586n.right;
                if (obj != null) {
                    titleMarginStart = this.f579g.getTitleMarginStart();
                } else {
                    titleMarginStart = this.f579g.getTitleMarginEnd();
                }
                c0202e.m728b(i6, titleMarginEnd, i7 + titleMarginStart, (this.f586n.bottom + z) - this.f579g.getTitleMarginBottom());
                this.f573a.m718a(obj != null ? this.f584l : this.f582j, this.f586n.top + this.f583k, (i3 - i) - (obj != null ? this.f582j : this.f584l), (i4 - i2) - this.f585m);
                this.f573a.m741i();
            }
        }
        z = getChildCount();
        for (boolean z2 = false; z2 < z; z2++) {
            m525a(getChildAt(z2)).m809a();
        }
        if (this.f579g) {
            if (this.f587o && TextUtils.isEmpty(this.f573a.m742j())) {
                this.f573a.m723a(this.f579g.getTitle());
            }
            if (this.f580h) {
                if (this.f580h != this) {
                    setMinimumHeight(m531e(this.f580h));
                }
            }
            setMinimumHeight(m531e(this.f579g));
        }
        m536b();
    }

    /* renamed from: e */
    private static int m531e(View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            return view.getHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        return (view.getHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    static C0220n m525a(View view) {
        C0220n c0220n = (C0220n) view.getTag(C0137f.view_offset_helper);
        if (c0220n != null) {
            return c0220n;
        }
        c0220n = new C0220n(view);
        view.setTag(C0137f.view_offset_helper, c0220n);
        return c0220n;
    }

    public void setTitle(CharSequence charSequence) {
        this.f573a.m723a(charSequence);
    }

    public CharSequence getTitle() {
        return this.f587o ? this.f573a.m742j() : null;
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f587o) {
            this.f587o = z;
            m530d();
            requestLayout();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2 = C0560r.m2212x(this) && !isInEditMode();
        setScrimsShown(z, z2);
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.f591s != z) {
            int i = 0;
            if (z2) {
                if (z) {
                    i = 255;
                }
                m526a(i);
            } else {
                if (z) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.f591s = z;
        }
    }

    /* renamed from: a */
    private void m526a(int i) {
        m527c();
        if (this.f592t == null) {
            this.f592t = new ValueAnimator();
            this.f592t.setDuration(this.f593u);
            this.f592t.setInterpolator(i > this.f590r ? C0189a.f701c : C0189a.f702d);
            this.f592t.addUpdateListener(new C01602(this));
        } else if (this.f592t.isRunning()) {
            this.f592t.cancel();
        }
        this.f592t.setIntValues(new int[]{this.f590r, i});
        this.f592t.start();
    }

    void setScrimAlpha(int i) {
        if (i != this.f590r) {
            if (!(this.f589q == null || this.f579g == null)) {
                C0560r.m2189c(this.f579g);
            }
            this.f590r = i;
            C0560r.m2189c(this);
        }
    }

    int getScrimAlpha() {
        return this.f590r;
    }

    public void setContentScrim(Drawable drawable) {
        if (this.f589q != drawable) {
            Drawable drawable2 = null;
            if (this.f589q != null) {
                this.f589q.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f589q = drawable2;
            if (this.f589q != null) {
                this.f589q.setBounds(0, 0, getWidth(), getHeight());
                this.f589q.setCallback(this);
                this.f589q.setAlpha(this.f590r);
            }
            C0560r.m2189c(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C0389b.m1429a(getContext(), i));
    }

    public Drawable getContentScrim() {
        return this.f589q;
    }

    public void setStatusBarScrim(Drawable drawable) {
        if (this.f574b != drawable) {
            Drawable drawable2 = null;
            if (this.f574b != null) {
                this.f574b.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f574b = drawable2;
            if (this.f574b != null) {
                if (this.f574b.isStateful() != null) {
                    this.f574b.setState(getDrawableState());
                }
                C0295a.m1056b(this.f574b, C0560r.m2193e(this));
                this.f574b.setVisible(getVisibility() == 0, false);
                this.f574b.setCallback(this);
                this.f574b.setAlpha(this.f590r);
            }
            C0560r.m2189c(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f574b;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = 0 | drawable.setState(drawableState);
        }
        drawable = this.f589q;
        if (drawable != null && drawable.isStateful()) {
            i |= drawable.setState(drawableState);
        }
        if (this.f573a != null) {
            i |= this.f573a.m724a(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!(super.verifyDrawable(drawable) || drawable == this.f589q)) {
            if (drawable != this.f574b) {
                return null;
            }
        }
        return true;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (!(this.f574b == null || this.f574b.isVisible() == z)) {
            this.f574b.setVisible(z, false);
        }
        if (this.f589q != null && this.f589q.isVisible() != z) {
            this.f589q.setVisible(z, false);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0389b.m1429a(getContext(), i));
    }

    public Drawable getStatusBarScrim() {
        return this.f574b;
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f573a.m733c(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f573a.m719a(colorStateList);
    }

    public void setCollapsedTitleGravity(int i) {
        this.f573a.m727b(i);
    }

    public int getCollapsedTitleGravity() {
        return this.f573a.m732c();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f573a.m736d(i);
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f573a.m729b(colorStateList);
    }

    public void setExpandedTitleGravity(int i) {
        this.f573a.m717a(i);
    }

    public int getExpandedTitleGravity() {
        return this.f573a.m725b();
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f573a.m721a(typeface);
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f573a.m735d();
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f573a.m730b(typeface);
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f573a.m737e();
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f582j = i;
        this.f583k = i2;
        this.f584l = i3;
        this.f585m = i4;
        requestLayout();
    }

    public int getExpandedTitleMarginStart() {
        return this.f582j;
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f582j = i;
        requestLayout();
    }

    public int getExpandedTitleMarginTop() {
        return this.f583k;
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f583k = i;
        requestLayout();
    }

    public int getExpandedTitleMarginEnd() {
        return this.f584l;
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f584l = i;
        requestLayout();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f585m;
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f585m = i;
        requestLayout();
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f594v != i) {
            this.f594v = i;
            m536b();
        }
    }

    public int getScrimVisibleHeightTrigger() {
        if (this.f594v >= 0) {
            return this.f594v;
        }
        int b = this.f576d != null ? this.f576d.m2253b() : 0;
        int j = C0560r.m2198j(this);
        if (j > 0) {
            return Math.min((j * 2) + b, getHeight());
        }
        return getHeight() / 3;
    }

    public void setScrimAnimationDuration(long j) {
        this.f593u = j;
    }

    public long getScrimAnimationDuration() {
        return this.f593u;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: a */
    protected LayoutParams m532a() {
        return new LayoutParams(-1, -1);
    }

    public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    protected android.widget.FrameLayout.LayoutParams m534a(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* renamed from: b */
    final void m536b() {
        if (this.f589q != null || this.f574b != null) {
            setScrimsShown(getHeight() + this.f575c < getScrimVisibleHeightTrigger());
        }
    }

    /* renamed from: b */
    final int m535b(View view) {
        return ((getHeight() - m525a(view).m813c()) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }
}
