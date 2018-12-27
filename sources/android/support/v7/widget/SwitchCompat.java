package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.p022c.p023a.C0680b;
import android.support.v7.p028f.C0694a;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;

public class SwitchCompat extends CompoundButton {
    /* renamed from: N */
    private static final int[] f2653N = new int[]{16842912};
    /* renamed from: b */
    private static final Property<SwitchCompat, Float> f2654b = new Property<SwitchCompat, Float>(Float.class, "thumbPos") {
        public /* synthetic */ Object get(Object obj) {
            return m3376a((SwitchCompat) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m3377a((SwitchCompat) obj, (Float) obj2);
        }

        /* renamed from: a */
        public Float m3376a(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f2692z);
        }

        /* renamed from: a */
        public void m3377a(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    };
    /* renamed from: A */
    private int f2655A;
    /* renamed from: B */
    private int f2656B;
    /* renamed from: C */
    private int f2657C;
    /* renamed from: D */
    private int f2658D;
    /* renamed from: E */
    private int f2659E;
    /* renamed from: F */
    private int f2660F;
    /* renamed from: G */
    private int f2661G;
    /* renamed from: H */
    private final TextPaint f2662H;
    /* renamed from: I */
    private ColorStateList f2663I;
    /* renamed from: J */
    private Layout f2664J;
    /* renamed from: K */
    private Layout f2665K;
    /* renamed from: L */
    private TransformationMethod f2666L;
    /* renamed from: M */
    private final Rect f2667M;
    /* renamed from: a */
    ObjectAnimator f2668a;
    /* renamed from: c */
    private Drawable f2669c;
    /* renamed from: d */
    private ColorStateList f2670d;
    /* renamed from: e */
    private Mode f2671e;
    /* renamed from: f */
    private boolean f2672f;
    /* renamed from: g */
    private boolean f2673g;
    /* renamed from: h */
    private Drawable f2674h;
    /* renamed from: i */
    private ColorStateList f2675i;
    /* renamed from: j */
    private Mode f2676j;
    /* renamed from: k */
    private boolean f2677k;
    /* renamed from: l */
    private boolean f2678l;
    /* renamed from: m */
    private int f2679m;
    /* renamed from: n */
    private int f2680n;
    /* renamed from: o */
    private int f2681o;
    /* renamed from: p */
    private boolean f2682p;
    /* renamed from: q */
    private CharSequence f2683q;
    /* renamed from: r */
    private CharSequence f2684r;
    /* renamed from: s */
    private boolean f2685s;
    /* renamed from: t */
    private int f2686t;
    /* renamed from: u */
    private int f2687u;
    /* renamed from: v */
    private float f2688v;
    /* renamed from: w */
    private float f2689w;
    /* renamed from: x */
    private VelocityTracker f2690x;
    /* renamed from: y */
    private int f2691y;
    /* renamed from: z */
    private float f2692z;

    /* renamed from: a */
    private static float m3378a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2670d = null;
        this.f2671e = null;
        this.f2672f = false;
        this.f2673g = false;
        this.f2675i = null;
        this.f2676j = null;
        this.f2677k = false;
        this.f2678l = false;
        this.f2690x = VelocityTracker.obtain();
        this.f2667M = new Rect();
        this.f2662H = new TextPaint(1);
        Resources resources = getResources();
        this.f2662H.density = resources.getDisplayMetrics().density;
        attributeSet = ay.m3543a(context, attributeSet, C0636j.SwitchCompat, i, 0);
        this.f2669c = attributeSet.m3547a(C0636j.SwitchCompat_android_thumb);
        if (this.f2669c != 0) {
            this.f2669c.setCallback(this);
        }
        this.f2674h = attributeSet.m3547a(C0636j.SwitchCompat_track);
        if (this.f2674h != 0) {
            this.f2674h.setCallback(this);
        }
        this.f2683q = attributeSet.m3553c(C0636j.SwitchCompat_android_textOn);
        this.f2684r = attributeSet.m3553c(C0636j.SwitchCompat_android_textOff);
        this.f2685s = attributeSet.m3549a(C0636j.SwitchCompat_showText, true);
        this.f2679m = attributeSet.m3556e(C0636j.SwitchCompat_thumbTextPadding, 0);
        this.f2680n = attributeSet.m3556e(C0636j.SwitchCompat_switchMinWidth, 0);
        this.f2681o = attributeSet.m3556e(C0636j.SwitchCompat_switchPadding, 0);
        this.f2682p = attributeSet.m3549a(C0636j.SwitchCompat_splitTrack, false);
        i = attributeSet.m3557e(C0636j.SwitchCompat_thumbTint);
        if (i != 0) {
            this.f2670d = i;
            this.f2672f = true;
        }
        i = C0885y.m3861a(attributeSet.m3545a(C0636j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f2671e != i) {
            this.f2671e = i;
            this.f2673g = true;
        }
        if (!(this.f2672f == 0 && this.f2673g == 0)) {
            m3386b();
        }
        i = attributeSet.m3557e(C0636j.SwitchCompat_trackTint);
        if (i != 0) {
            this.f2675i = i;
            this.f2677k = true;
        }
        i = C0885y.m3861a(attributeSet.m3545a(C0636j.SwitchCompat_trackTintMode, -1), null);
        if (this.f2676j != i) {
            this.f2676j = i;
            this.f2678l = true;
        }
        if (!(this.f2677k == 0 && this.f2678l == 0)) {
            m3381a();
        }
        i = attributeSet.m3560g(C0636j.SwitchCompat_switchTextAppearance, 0);
        if (i != 0) {
            setSwitchTextAppearance(context, i);
        }
        attributeSet.m3548a();
        context = ViewConfiguration.get(context);
        this.f2687u = context.getScaledTouchSlop();
        this.f2691y = context.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTextAppearance(Context context, int i) {
        context = ay.m3541a(context, i, C0636j.TextAppearance);
        i = context.m3557e(C0636j.TextAppearance_android_textColor);
        if (i != 0) {
            this.f2663I = i;
        } else {
            this.f2663I = getTextColors();
        }
        i = context.m3556e(C0636j.TextAppearance_android_textSize, 0);
        if (i != 0) {
            i = (float) i;
            if (i != this.f2662H.getTextSize()) {
                this.f2662H.setTextSize(i);
                requestLayout();
            }
        }
        m3382a(context.m3545a(C0636j.TextAppearance_android_typeface, -1), context.m3545a(C0636j.TextAppearance_android_textStyle, -1));
        if (context.m3549a(C0636j.TextAppearance_textAllCaps, false) != 0) {
            this.f2666L = new C0694a(getContext());
        } else {
            this.f2666L = 0;
        }
        context.m3548a();
    }

    /* renamed from: a */
    private void m3382a(int i, int i2) {
        switch (i) {
            case 1:
                i = Typeface.SANS_SERIF;
                break;
            case 2:
                i = Typeface.SERIF;
                break;
            case 3:
                i = Typeface.MONOSPACE;
                break;
            default:
                i = 0;
                break;
        }
        setSwitchTypeface(i, i2);
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface = Typeface.defaultFromStyle(i);
            } else {
                typeface = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface);
            typeface = ((typeface != null ? typeface.getStyle() : null) ^ -1) & i;
            i = this.f2662H;
            if ((typeface & 1) != 0) {
                z = true;
            }
            i.setFakeBoldText(z);
            i = this.f2662H;
            if ((typeface & 2) != null) {
                f = -0.25f;
            }
            i.setTextSkewX(f);
            return;
        }
        this.f2662H.setFakeBoldText(false);
        this.f2662H.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f2662H.getTypeface() != null && !this.f2662H.getTypeface().equals(typeface)) || (this.f2662H.getTypeface() == null && typeface != null)) {
            this.f2662H.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchPadding(int i) {
        this.f2681o = i;
        requestLayout();
    }

    public int getSwitchPadding() {
        return this.f2681o;
    }

    public void setSwitchMinWidth(int i) {
        this.f2680n = i;
        requestLayout();
    }

    public int getSwitchMinWidth() {
        return this.f2680n;
    }

    public void setThumbTextPadding(int i) {
        this.f2679m = i;
        requestLayout();
    }

    public int getThumbTextPadding() {
        return this.f2679m;
    }

    public void setTrackDrawable(Drawable drawable) {
        if (this.f2674h != null) {
            this.f2674h.setCallback(null);
        }
        this.f2674h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0680b.m2703b(getContext(), i));
    }

    public Drawable getTrackDrawable() {
        return this.f2674h;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2675i = colorStateList;
        this.f2677k = true;
        m3381a();
    }

    public ColorStateList getTrackTintList() {
        return this.f2675i;
    }

    public void setTrackTintMode(Mode mode) {
        this.f2676j = mode;
        this.f2678l = true;
        m3381a();
    }

    public Mode getTrackTintMode() {
        return this.f2676j;
    }

    /* renamed from: a */
    private void m3381a() {
        if (this.f2674h == null) {
            return;
        }
        if (this.f2677k || this.f2678l) {
            this.f2674h = this.f2674h.mutate();
            if (this.f2677k) {
                C0295a.m1050a(this.f2674h, this.f2675i);
            }
            if (this.f2678l) {
                C0295a.m1053a(this.f2674h, this.f2676j);
            }
            if (this.f2674h.isStateful()) {
                this.f2674h.setState(getDrawableState());
            }
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        if (this.f2669c != null) {
            this.f2669c.setCallback(null);
        }
        this.f2669c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0680b.m2703b(getContext(), i));
    }

    public Drawable getThumbDrawable() {
        return this.f2669c;
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2670d = colorStateList;
        this.f2672f = true;
        m3386b();
    }

    public ColorStateList getThumbTintList() {
        return this.f2670d;
    }

    public void setThumbTintMode(Mode mode) {
        this.f2671e = mode;
        this.f2673g = true;
        m3386b();
    }

    public Mode getThumbTintMode() {
        return this.f2671e;
    }

    /* renamed from: b */
    private void m3386b() {
        if (this.f2669c == null) {
            return;
        }
        if (this.f2672f || this.f2673g) {
            this.f2669c = this.f2669c.mutate();
            if (this.f2672f) {
                C0295a.m1050a(this.f2669c, this.f2670d);
            }
            if (this.f2673g) {
                C0295a.m1053a(this.f2669c, this.f2671e);
            }
            if (this.f2669c.isStateful()) {
                this.f2669c.setState(getDrawableState());
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f2682p = z;
        invalidate();
    }

    public boolean getSplitTrack() {
        return this.f2682p;
    }

    public CharSequence getTextOn() {
        return this.f2683q;
    }

    public void setTextOn(CharSequence charSequence) {
        this.f2683q = charSequence;
        requestLayout();
    }

    public CharSequence getTextOff() {
        return this.f2684r;
    }

    public void setTextOff(CharSequence charSequence) {
        this.f2684r = charSequence;
        requestLayout();
    }

    public void setShowText(boolean z) {
        if (this.f2685s != z) {
            this.f2685s = z;
            requestLayout();
        }
    }

    public boolean getShowText() {
        return this.f2685s;
    }

    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f2685s) {
            if (this.f2664J == null) {
                this.f2664J = m3380a(this.f2683q);
            }
            if (this.f2665K == null) {
                this.f2665K = m3380a(this.f2684r);
            }
        }
        Rect rect = this.f2667M;
        int i3 = 0;
        if (this.f2669c != null) {
            this.f2669c.getPadding(rect);
            intrinsicWidth = (this.f2669c.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f2669c.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f2657C = Math.max(this.f2685s ? Math.max(this.f2664J.getWidth(), this.f2665K.getWidth()) + (this.f2679m * 2) : 0, intrinsicWidth);
        if (this.f2674h != null) {
            this.f2674h.getPadding(rect);
            i3 = this.f2674h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        intrinsicWidth = rect.left;
        int i4 = rect.right;
        if (this.f2669c != null) {
            Rect a = C0885y.m3862a(this.f2669c);
            intrinsicWidth = Math.max(intrinsicWidth, a.left);
            i4 = Math.max(i4, a.right);
        }
        i4 = Math.max(this.f2680n, ((this.f2657C * 2) + intrinsicWidth) + i4);
        intrinsicWidth = Math.max(i3, intrinsicHeight);
        this.f2655A = i4;
        this.f2656B = intrinsicWidth;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < intrinsicWidth) {
            setMeasuredDimension(getMeasuredWidthAndState(), intrinsicWidth);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        Object obj = isChecked() ? this.f2683q : this.f2684r;
        if (obj != null) {
            accessibilityEvent.getText().add(obj);
        }
    }

    /* renamed from: a */
    private Layout m3380a(CharSequence charSequence) {
        if (this.f2666L != null) {
            charSequence = this.f2666L.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f2662H, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, this.f2662H)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: a */
    private boolean m3385a(float f, float f2) {
        boolean z = false;
        if (this.f2669c == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f2669c.getPadding(this.f2667M);
        int i = this.f2659E - this.f2687u;
        int i2 = (this.f2658D + thumbOffset) - this.f2687u;
        thumbOffset = (((this.f2657C + i2) + this.f2667M.left) + this.f2667M.right) + this.f2687u;
        int i3 = this.f2661G + this.f2687u;
        if (f > ((float) i2) && f < ((float) thumbOffset) && f2 > ((float) i) && f2 < ((float) i3)) {
            z = true;
        }
        return z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f2690x.addMovement(motionEvent);
        float x;
        float y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                if (isEnabled() && m3385a(x, y)) {
                    this.f2686t = 1;
                    this.f2688v = x;
                    this.f2689w = y;
                    break;
                }
            case 1:
            case 3:
                if (this.f2686t != 2) {
                    this.f2686t = 0;
                    this.f2690x.clear();
                    break;
                }
                m3387b(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            case 2:
                switch (this.f2686t) {
                    case 0:
                        break;
                    case 1:
                        x = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x - this.f2688v) > ((float) this.f2687u) || Math.abs(y2 - this.f2689w) > ((float) this.f2687u)) {
                            this.f2686t = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f2688v = x;
                            this.f2689w = y2;
                            return true;
                        }
                    case 2:
                        motionEvent = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        y = motionEvent - this.f2688v;
                        y = thumbScrollRange != 0 ? y / ((float) thumbScrollRange) : y > 0.0f ? 1.0f : -1.0f;
                        if (bg.m3615a(this)) {
                            y = -y;
                        }
                        x = m3378a(this.f2692z + y, 0.0f, 1.0f);
                        if (x != this.f2692z) {
                            this.f2688v = motionEvent;
                            setThumbPosition(x);
                        }
                        return true;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m3383a(MotionEvent motionEvent) {
        motionEvent = MotionEvent.obtain(motionEvent);
        motionEvent.setAction(3);
        super.onTouchEvent(motionEvent);
        motionEvent.recycle();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private void m3387b(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r0 = 0;
        r6.f2686t = r0;
        r1 = r7.getAction();
        r2 = 1;
        if (r1 != r2) goto L_0x0012;
    L_0x000a:
        r1 = r6.isEnabled();
        if (r1 == 0) goto L_0x0012;
    L_0x0010:
        r1 = 1;
        goto L_0x0013;
    L_0x0012:
        r1 = 0;
    L_0x0013:
        r3 = r6.isChecked();
        if (r1 == 0) goto L_0x004a;
    L_0x0019:
        r1 = r6.f2690x;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1.computeCurrentVelocity(r4);
        r1 = r6.f2690x;
        r1 = r1.getXVelocity();
        r4 = java.lang.Math.abs(r1);
        r5 = r6.f2691y;
        r5 = (float) r5;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 <= 0) goto L_0x0045;
    L_0x0031:
        r4 = android.support.v7.widget.bg.m3615a(r6);
        r5 = 0;
        if (r4 == 0) goto L_0x003f;
    L_0x0038:
        r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r1 >= 0) goto L_0x003d;
    L_0x003c:
        goto L_0x0043;
    L_0x003d:
        r2 = 0;
        goto L_0x0043;
    L_0x003f:
        r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r1 <= 0) goto L_0x003d;
    L_0x0043:
        r1 = r2;
        goto L_0x004b;
    L_0x0045:
        r1 = r6.getTargetCheckedState();
        goto L_0x004b;
    L_0x004a:
        r1 = r3;
    L_0x004b:
        if (r1 == r3) goto L_0x0050;
    L_0x004d:
        r6.playSoundEffect(r0);
    L_0x0050:
        r6.setChecked(r1);
        r6.m3383a(r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.b(android.view.MotionEvent):void");
    }

    /* renamed from: a */
    private void m3384a(boolean z) {
        z = z ? true : false;
        this.f2668a = ObjectAnimator.ofFloat(this, f2654b, new float[]{z});
        this.f2668a.setDuration(250);
        if (VERSION.SDK_INT >= true) {
            this.f2668a.setAutoCancel(true);
        }
        this.f2668a.start();
    }

    /* renamed from: c */
    private void m3388c() {
        if (this.f2668a != null) {
            this.f2668a.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f2692z > 0.5f;
    }

    void setThumbPosition(float f) {
        this.f2692z = f;
        invalidate();
    }

    public void toggle() {
        setChecked(isChecked() ^ 1);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        z = isChecked();
        if (getWindowToken() == null || !C0560r.m2212x(this)) {
            m3388c();
            setThumbPosition(z ? true : false);
            return;
        }
        m3384a(z);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i = 0;
        if (this.f2669c) {
            z = this.f2667M;
            if (this.f2674h != 0) {
                this.f2674h.getPadding(z);
            } else {
                z.setEmpty();
            }
            i2 = C0885y.m3862a(this.f2669c);
            i3 = Math.max(0, i2.left - z.left);
            z = Math.max(0, i2.right - z.right);
            i = i3;
        } else {
            z = false;
        }
        if (bg.m3615a(this) != 0) {
            i2 = getPaddingLeft() + i;
            i3 = ((this.f2655A + i2) - i) - z;
        } else {
            i3 = (getWidth() - getPaddingRight()) - z;
            i2 = ((i3 - this.f2655A) + i) + z;
        }
        z = getGravity() & 112;
        if (z) {
            z = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.f2656B / 2);
            i = this.f2656B + z;
        } else if (!z) {
            z = getPaddingTop();
            i = this.f2656B + z;
        } else {
            i = getHeight() - getPaddingBottom();
            z = i - this.f2656B;
        }
        this.f2658D = i2;
        this.f2659E = z;
        this.f2661G = i;
        this.f2660F = i3;
    }

    public void draw(Canvas canvas) {
        Rect a;
        Rect rect = this.f2667M;
        int i = this.f2658D;
        int i2 = this.f2659E;
        int i3 = this.f2660F;
        int i4 = this.f2661G;
        int thumbOffset = getThumbOffset() + i;
        if (this.f2669c != null) {
            a = C0885y.m3862a(this.f2669c);
        } else {
            a = C0885y.f3015a;
        }
        if (this.f2674h != null) {
            int i5;
            int i6;
            this.f2674h.getPadding(rect);
            thumbOffset += rect.left;
            if (a != null) {
                if (a.left > rect.left) {
                    i += a.left - rect.left;
                }
                i5 = a.top > rect.top ? (a.top - rect.top) + i2 : i2;
                if (a.right > rect.right) {
                    i3 -= a.right - rect.right;
                }
                if (a.bottom > rect.bottom) {
                    i6 = i4 - (a.bottom - rect.bottom);
                    this.f2674h.setBounds(i, i5, i3, i6);
                }
            } else {
                i5 = i2;
            }
            i6 = i4;
            this.f2674h.setBounds(i, i5, i3, i6);
        }
        if (this.f2669c != null) {
            this.f2669c.getPadding(rect);
            i = thumbOffset - rect.left;
            thumbOffset = (thumbOffset + this.f2657C) + rect.right;
            this.f2669c.setBounds(i, i2, thumbOffset, i4);
            Drawable background = getBackground();
            if (background != null) {
                C0295a.m1049a(background, i, i2, thumbOffset, i4);
            }
        }
        super.draw(canvas);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.f2667M;
        Drawable drawable = this.f2674h;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f2659E + rect.top;
        int i2 = this.f2661G - rect.bottom;
        Drawable drawable2 = this.f2669c;
        if (drawable != null) {
            if (!this.f2682p || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a = C0885y.m3862a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f2664J : this.f2665K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            if (this.f2663I != null) {
                this.f2662H.setColor(this.f2663I.getColorForState(drawableState, 0));
            }
            this.f2662H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                save = bounds.left + bounds.right;
            } else {
                save = getWidth();
            }
            canvas.translate((float) ((save / 2) - (layout.getWidth() / 2)), (float) (((i + i2) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public int getCompoundPaddingLeft() {
        if (!bg.m3615a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2655A;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.f2681o;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (bg.m3615a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2655A;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.f2681o;
        }
        return compoundPaddingRight;
    }

    private int getThumbOffset() {
        float f;
        if (bg.m3615a(this)) {
            f = 1.0f - this.f2692z;
        } else {
            f = this.f2692z;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        if (this.f2674h == null) {
            return 0;
        }
        Rect a;
        Rect rect = this.f2667M;
        this.f2674h.getPadding(rect);
        if (this.f2669c != null) {
            a = C0885y.m3862a(this.f2669c);
        } else {
            a = C0885y.f3015a;
        }
        return ((((this.f2655A - this.f2657C) - rect.left) - rect.right) - a.left) - a.right;
    }

    protected int[] onCreateDrawableState(int i) {
        i = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(i, f2653N);
        }
        return i;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2669c;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = 0 | drawable.setState(drawableState);
        }
        drawable = this.f2674h;
        if (drawable != null && drawable.isStateful()) {
            i |= drawable.setState(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.f2669c != null) {
            C0295a.m1047a(this.f2669c, f, f2);
        }
        if (this.f2674h != null) {
            C0295a.m1047a(this.f2674h, f, f2);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!(super.verifyDrawable(drawable) || drawable == this.f2669c)) {
            if (drawable != this.f2674h) {
                return null;
            }
        }
        return true;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f2669c != null) {
            this.f2669c.jumpToCurrentState();
        }
        if (this.f2674h != null) {
            this.f2674h.jumpToCurrentState();
        }
        if (this.f2668a != null && this.f2668a.isStarted()) {
            this.f2668a.end();
            this.f2668a = null;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f2683q : this.f2684r;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            CharSequence stringBuilder = new StringBuilder();
            stringBuilder.append(text);
            stringBuilder.append(' ');
            stringBuilder.append(charSequence);
            accessibilityNodeInfo.setText(stringBuilder);
        }
    }
}
