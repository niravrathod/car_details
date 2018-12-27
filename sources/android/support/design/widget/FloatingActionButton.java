package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.C0143a.C0135d;
import android.support.design.C0143a.C0141j;
import android.support.design.C0143a.C0142k;
import android.support.design.widget.C0209g.C0207c;
import android.support.design.widget.CoordinatorLayout.C0163b;
import android.support.design.widget.CoordinatorLayout.C0165d;
import android.support.v4.view.C0560r;
import android.support.v4.widget.C0626s;
import android.support.v7.widget.C0864j;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;

@C0163b(a = Behavior.class)
public class FloatingActionButton extends VisibilityAwareImageButton {
    /* renamed from: a */
    int f12888a;
    /* renamed from: b */
    boolean f12889b;
    /* renamed from: c */
    final Rect f12890c;
    /* renamed from: d */
    private ColorStateList f12891d;
    /* renamed from: e */
    private Mode f12892e;
    /* renamed from: f */
    private int f12893f;
    /* renamed from: g */
    private int f12894g;
    /* renamed from: h */
    private int f12895h;
    /* renamed from: i */
    private int f12896i;
    /* renamed from: j */
    private int f12897j;
    /* renamed from: k */
    private final Rect f12898k;
    /* renamed from: l */
    private C0864j f12899l;
    /* renamed from: m */
    private C0209g f12900m;

    /* renamed from: android.support.design.widget.FloatingActionButton$a */
    public static abstract class C0168a {
        /* renamed from: a */
        public void m592a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void m593b(FloatingActionButton floatingActionButton) {
        }
    }

    public static class Behavior extends android.support.design.widget.CoordinatorLayout.Behavior<FloatingActionButton> {
        /* renamed from: a */
        private Rect f12884a;
        /* renamed from: b */
        private C0168a f12885b;
        /* renamed from: c */
        private boolean f12886c;

        /* renamed from: b */
        public /* synthetic */ boolean mo125b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return m14967a(coordinatorLayout, (FloatingActionButton) view, view2);
        }

        public Behavior() {
            this.f12886c = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, C0142k.FloatingActionButton_Behavior_Layout);
            this.f12886c = context.getBoolean(C0142k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            context.recycle();
        }

        /* renamed from: a */
        public void mo123a(C0165d c0165d) {
            if (c0165d.f604h == 0) {
                c0165d.f604h = 80;
            }
        }

        /* renamed from: a */
        public boolean m14967a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m14960a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (m14961a(view) != null) {
                m14963b(view, floatingActionButton);
            }
            return null;
        }

        /* renamed from: a */
        private static boolean m14961a(View view) {
            view = view.getLayoutParams();
            return view instanceof C0165d ? ((C0165d) view).m582b() instanceof BottomSheetBehavior : null;
        }

        /* renamed from: a */
        private boolean m14962a(View view, FloatingActionButton floatingActionButton) {
            C0165d c0165d = (C0165d) floatingActionButton.getLayoutParams();
            if (this.f12886c && c0165d.m574a() == view.getId() && floatingActionButton.getUserSetVisibility() == null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m14960a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m14962a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f12884a == null) {
                this.f12884a = new Rect();
            }
            Rect rect = this.f12884a;
            C0626s.m2535b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m14982b(this.f12885b, false);
            } else {
                floatingActionButton.m14980a(this.f12885b, false);
            }
            return true;
        }

        /* renamed from: b */
        private boolean m14963b(View view, FloatingActionButton floatingActionButton) {
            if (!m14962a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0165d) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.m14982b(this.f12885b, false);
            } else {
                floatingActionButton.m14980a(this.f12885b, false);
            }
            return true;
        }

        /* renamed from: a */
        public boolean m14965a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List c = coordinatorLayout.m24135c((View) floatingActionButton);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) c.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m14961a(view) && m14963b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m14960a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m24121a((View) floatingActionButton, i);
            m14959a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean m14966a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            coordinatorLayout = floatingActionButton.f12890c;
            rect.set(floatingActionButton.getLeft() + coordinatorLayout.left, floatingActionButton.getTop() + coordinatorLayout.top, floatingActionButton.getRight() - coordinatorLayout.right, floatingActionButton.getBottom() - coordinatorLayout.bottom);
            return true;
        }

        /* renamed from: a */
        private void m14959a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f12890c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0165d c0165d = (C0165d) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - c0165d.rightMargin ? rect.right : floatingActionButton.getLeft() <= c0165d.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - c0165d.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= c0165d.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C0560r.m2190c(floatingActionButton, i);
                }
                if (i2 != 0) {
                    C0560r.m2192d(floatingActionButton, i2);
                }
            }
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$b */
    private class C3052b implements C0211j {
        /* renamed from: a */
        final /* synthetic */ FloatingActionButton f12887a;

        C3052b(FloatingActionButton floatingActionButton) {
            this.f12887a = floatingActionButton;
        }

        /* renamed from: a */
        public float mo126a() {
            return ((float) this.f12887a.getSizeDimension()) / 2.0f;
        }

        /* renamed from: a */
        public void mo127a(int i, int i2, int i3, int i4) {
            this.f12887a.f12890c.set(i, i2, i3, i4);
            this.f12887a.setPadding(i + this.f12887a.f12888a, i2 + this.f12887a.f12888a, i3 + this.f12887a.f12888a, i4 + this.f12887a.f12888a);
        }

        /* renamed from: a */
        public void mo128a(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        /* renamed from: b */
        public boolean mo129b() {
            return this.f12887a.f12889b;
        }
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12890c = new Rect();
        this.f12898k = new Rect();
        C0219m.m807a(context);
        context = context.obtainStyledAttributes(attributeSet, C0142k.FloatingActionButton, i, C0141j.Widget_Design_FloatingActionButton);
        this.f12891d = context.getColorStateList(C0142k.FloatingActionButton_backgroundTint);
        this.f12892e = C0221o.m814a(context.getInt(C0142k.FloatingActionButton_backgroundTintMode, -1), null);
        this.f12894g = context.getColor(C0142k.FloatingActionButton_rippleColor, 0);
        this.f12895h = context.getInt(C0142k.FloatingActionButton_fabSize, -1);
        this.f12896i = context.getDimensionPixelSize(C0142k.FloatingActionButton_fabCustomSize, 0);
        this.f12893f = context.getDimensionPixelSize(C0142k.FloatingActionButton_borderWidth, 0);
        float dimension = context.getDimension(C0142k.FloatingActionButton_elevation, 0.0f);
        float dimension2 = context.getDimension(C0142k.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f12889b = context.getBoolean(C0142k.FloatingActionButton_useCompatPadding, false);
        context.recycle();
        this.f12899l = new C0864j(this);
        this.f12899l.m3701a(attributeSet, i);
        this.f12897j = (int) getResources().getDimension(C0135d.design_fab_image_size);
        getImpl().mo156a(this.f12891d, this.f12892e, this.f12894g, this.f12893f);
        getImpl().m756a(dimension);
        getImpl().m766b(dimension2);
    }

    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f12888a = (sizeDimension - this.f12897j) / 2;
        getImpl().m771e();
        i = Math.min(m14976a(sizeDimension, i), m14976a(sizeDimension, i2));
        setMeasuredDimension((this.f12890c.left + i) + this.f12890c.right, (i + this.f12890c.top) + this.f12890c.bottom);
    }

    public int getRippleColor() {
        return this.f12894g;
    }

    public void setRippleColor(int i) {
        if (this.f12894g != i) {
            this.f12894g = i;
            getImpl().mo155a(i);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f12891d;
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f12891d != colorStateList) {
            this.f12891d = colorStateList;
            getImpl().m759a(colorStateList);
        }
    }

    public Mode getBackgroundTintMode() {
        return this.f12892e;
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f12892e != mode) {
            this.f12892e = mode;
            getImpl().m761a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setImageResource(int i) {
        this.f12899l.m3698a(i);
    }

    /* renamed from: a */
    void m14980a(C0168a c0168a, boolean z) {
        getImpl().m768b(m14977a(c0168a), z);
    }

    /* renamed from: b */
    void m14982b(C0168a c0168a, boolean z) {
        getImpl().m763a(m14977a(c0168a), z);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f12889b != z) {
            this.f12889b = z;
            getImpl().mo161d();
        }
    }

    public boolean getUseCompatPadding() {
        return this.f12889b;
    }

    public void setSize(int i) {
        if (i != this.f12895h) {
            this.f12895h = i;
            requestLayout();
        }
    }

    public int getSize() {
        return this.f12895h;
    }

    /* renamed from: a */
    private C0207c m14977a(final C0168a c0168a) {
        return c0168a == null ? null : new C0207c(this) {
            /* renamed from: b */
            final /* synthetic */ FloatingActionButton f12883b;

            /* renamed from: a */
            public void mo121a() {
                c0168a.m592a(this.f12883b);
            }

            /* renamed from: b */
            public void mo122b() {
                c0168a.m593b(this.f12883b);
            }
        };
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.f12896i = i;
            return;
        }
        throw new IllegalArgumentException("Custom size should be non-negative.");
    }

    public int getCustomSize() {
        return this.f12896i;
    }

    int getSizeDimension() {
        return m14975a(this.f12895h);
    }

    /* renamed from: a */
    private int m14975a(int i) {
        Resources resources = getResources();
        if (this.f12896i != 0) {
            return this.f12896i;
        }
        if (i == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                i = m14975a(1);
            } else {
                i = m14975a(0);
            }
            return i;
        } else if (i != 1) {
            return resources.getDimensionPixelSize(C0135d.design_fab_size_normal);
        } else {
            return resources.getDimensionPixelSize(C0135d.design_fab_size_mini);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m772f();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m773g();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo158a(getDrawableState());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo159b();
    }

    /* renamed from: a */
    public boolean m14981a(Rect rect) {
        if (!C0560r.m2212x(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        rect.left += this.f12890c.left;
        rect.top += this.f12890c.top;
        rect.right -= this.f12890c.right;
        rect.bottom -= this.f12890c.bottom;
        return true;
    }

    public Drawable getContentBackground() {
        return getImpl().m769c();
    }

    /* renamed from: a */
    private static int m14976a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, i2);
        }
        if (mode != 0) {
            return mode != 1073741824 ? i : i2;
        } else {
            return i;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (m14981a(this.f12898k) && !this.f12898k.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public float getCompatElevation() {
        return getImpl().mo153a();
    }

    public void setCompatElevation(float f) {
        getImpl().m756a(f);
    }

    private C0209g getImpl() {
        if (this.f12900m == null) {
            this.f12900m = m14978a();
        }
        return this.f12900m;
    }

    /* renamed from: a */
    private C0209g m14978a() {
        if (VERSION.SDK_INT >= 21) {
            return new C3069h(this, new C3052b(this));
        }
        return new C0209g(this, new C3052b(this));
    }
}
