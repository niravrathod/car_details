package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0543c;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0636j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat extends ViewGroup {
    /* renamed from: a */
    private boolean f2420a;
    /* renamed from: b */
    private int f2421b;
    /* renamed from: c */
    private int f2422c;
    /* renamed from: d */
    private int f2423d;
    /* renamed from: e */
    private int f2424e;
    /* renamed from: f */
    private int f2425f;
    /* renamed from: g */
    private float f2426g;
    /* renamed from: h */
    private boolean f2427h;
    /* renamed from: i */
    private int[] f2428i;
    /* renamed from: j */
    private int[] f2429j;
    /* renamed from: k */
    private Drawable f2430k;
    /* renamed from: l */
    private int f2431l;
    /* renamed from: m */
    private int f2432m;
    /* renamed from: n */
    private int f2433n;
    /* renamed from: o */
    private int f2434o;

    public static class LayoutParams extends MarginLayoutParams {
        /* renamed from: g */
        public float f2418g;
        /* renamed from: h */
        public int f2419h;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2419h = -1;
            context = context.obtainStyledAttributes(attributeSet, C0636j.LinearLayoutCompat_Layout);
            this.f2418g = context.getFloat(C0636j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f2419h = context.getInt(C0636j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            context.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2419h = -1;
            this.f2418g = 0;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2419h = -1;
        }
    }

    /* renamed from: a */
    int m2905a(View view) {
        return 0;
    }

    /* renamed from: a */
    int m2906a(View view, int i) {
        return 0;
    }

    /* renamed from: b */
    int m2912b(View view) {
        return 0;
    }

    /* renamed from: d */
    int m2921d(int i) {
        return 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return mo644j();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return mo638b(attributeSet);
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return mo639b(layoutParams);
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2420a = true;
        this.f2421b = -1;
        this.f2422c = 0;
        this.f2424e = 8388659;
        context = ay.m3543a(context, attributeSet, C0636j.LinearLayoutCompat, i, 0);
        attributeSet = context.m3545a(C0636j.LinearLayoutCompat_android_orientation, -1);
        if (attributeSet >= null) {
            setOrientation(attributeSet);
        }
        attributeSet = context.m3545a(C0636j.LinearLayoutCompat_android_gravity, -1);
        if (attributeSet >= null) {
            setGravity(attributeSet);
        }
        attributeSet = context.m3549a(C0636j.LinearLayoutCompat_android_baselineAligned, true);
        if (attributeSet == null) {
            setBaselineAligned(attributeSet);
        }
        this.f2426g = context.m3544a(C0636j.LinearLayoutCompat_android_weightSum, (float) -1082130432);
        this.f2421b = context.m3545a(C0636j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f2427h = context.m3549a(C0636j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(context.m3547a(C0636j.LinearLayoutCompat_divider));
        this.f2433n = context.m3545a(C0636j.LinearLayoutCompat_showDividers, 0);
        this.f2434o = context.m3556e(C0636j.LinearLayoutCompat_dividerPadding, 0);
        context.m3548a();
    }

    public void setShowDividers(int i) {
        if (i != this.f2433n) {
            requestLayout();
        }
        this.f2433n = i;
    }

    public int getShowDividers() {
        return this.f2433n;
    }

    public Drawable getDividerDrawable() {
        return this.f2430k;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f2430k) {
            this.f2430k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f2431l = drawable.getIntrinsicWidth();
                this.f2432m = drawable.getIntrinsicHeight();
            } else {
                this.f2431l = 0;
                this.f2432m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f2434o = i;
    }

    public int getDividerPadding() {
        return this.f2434o;
    }

    public int getDividerWidth() {
        return this.f2431l;
    }

    protected void onDraw(Canvas canvas) {
        if (this.f2430k != null) {
            if (this.f2423d == 1) {
                m2909a(canvas);
            } else {
                m2918b(canvas);
            }
        }
    }

    /* renamed from: a */
    void m2909a(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        int i = 0;
        while (i < virtualChildCount) {
            View b = m2915b(i);
            if (!(b == null || b.getVisibility() == 8 || !m2920c(i))) {
                m2910a(canvas, (b.getTop() - ((LayoutParams) b.getLayoutParams()).topMargin) - this.f2432m);
            }
            i++;
        }
        if (m2920c(virtualChildCount)) {
            View b2 = m2915b(virtualChildCount - 1);
            if (b2 == null) {
                virtualChildCount = (getHeight() - getPaddingBottom()) - this.f2432m;
            } else {
                virtualChildCount = b2.getBottom() + ((LayoutParams) b2.getLayoutParams()).bottomMargin;
            }
            m2910a(canvas, virtualChildCount);
        }
    }

    /* renamed from: b */
    void m2918b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        boolean a = bg.m3615a(this);
        int i = 0;
        while (i < virtualChildCount) {
            View b = m2915b(i);
            if (!(b == null || b.getVisibility() == 8 || !m2920c(i))) {
                int right;
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                if (a) {
                    right = b.getRight() + layoutParams.rightMargin;
                } else {
                    right = (b.getLeft() - layoutParams.leftMargin) - this.f2431l;
                }
                m2919b(canvas, right);
            }
            i++;
        }
        if (m2920c(virtualChildCount)) {
            View b2 = m2915b(virtualChildCount - 1);
            if (b2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) b2.getLayoutParams();
                if (a) {
                    virtualChildCount = (b2.getLeft() - layoutParams2.leftMargin) - this.f2431l;
                } else {
                    virtualChildCount = b2.getRight() + layoutParams2.rightMargin;
                }
            } else if (a) {
                virtualChildCount = getPaddingLeft();
            } else {
                virtualChildCount = (getWidth() - getPaddingRight()) - this.f2431l;
            }
            m2919b(canvas, virtualChildCount);
        }
    }

    /* renamed from: a */
    void m2910a(Canvas canvas, int i) {
        this.f2430k.setBounds(getPaddingLeft() + this.f2434o, i, (getWidth() - getPaddingRight()) - this.f2434o, this.f2432m + i);
        this.f2430k.draw(canvas);
    }

    /* renamed from: b */
    void m2919b(Canvas canvas, int i) {
        this.f2430k.setBounds(i, getPaddingTop() + this.f2434o, this.f2431l + i, (getHeight() - getPaddingBottom()) - this.f2434o);
        this.f2430k.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.f2420a = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f2427h = z;
    }

    public int getBaseline() {
        if (this.f2421b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() > this.f2421b) {
            View childAt = getChildAt(this.f2421b);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i = this.f2422c;
                if (this.f2423d == 1) {
                    int i2 = this.f2424e & 112;
                    if (i2 != 48) {
                        if (i2 == 16) {
                            i += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2425f) / 2;
                        } else if (i2 == 80) {
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2425f;
                        }
                    }
                }
                return (i + ((LayoutParams) childAt.getLayoutParams()).topMargin) + baseline;
            } else if (this.f2421b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2421b;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("base aligned child index out of range (0, ");
            stringBuilder.append(getChildCount());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f2421b = i;
    }

    /* renamed from: b */
    View m2915b(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2426g;
    }

    public void setWeightSum(float f) {
        this.f2426g = Math.max(0.0f, f);
    }

    protected void onMeasure(int i, int i2) {
        if (this.f2423d == 1) {
            m2907a(i, i2);
        } else {
            m2916b(i, i2);
        }
    }

    /* renamed from: c */
    protected boolean m2920c(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.f2433n & 1) != 0) {
                z = true;
            }
            return z;
        } else if (i == getChildCount()) {
            if ((this.f2433n & 4) != 0) {
                z = true;
            }
            return z;
        } else if ((this.f2433n & 2) == 0) {
            return false;
        } else {
            for (i--; i >= 0; i--) {
                if (getChildAt(i).getVisibility() != 8) {
                    z = true;
                    break;
                }
            }
            return z;
        }
    }

    /* renamed from: a */
    void m2907a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        Object obj;
        int i8;
        int i9 = i;
        int i10 = i2;
        this.f2425f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int i11 = this.f2421b;
        boolean z = this.f2427h;
        float f = 0.0f;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        Object obj2 = null;
        Object obj3 = 1;
        Object obj4 = null;
        while (true) {
            i3 = 8;
            i4 = i15;
            if (i17 >= virtualChildCount) {
                break;
            }
            View b = m2915b(i17);
            if (b == null) {
                r7.f2425f += m2921d(i17);
                i5 = virtualChildCount;
                i6 = mode2;
                i15 = i4;
            } else {
                int i18 = i12;
                if (b.getVisibility() == 8) {
                    i17 += m2906a(b, i17);
                    i5 = virtualChildCount;
                    i6 = mode2;
                    i15 = i4;
                    i12 = i18;
                } else {
                    int i19;
                    int i20;
                    if (m2920c(i17)) {
                        r7.f2425f += r7.f2432m;
                    }
                    LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                    float f2 = f + layoutParams.f2418g;
                    int i21;
                    if (mode2 == 1073741824 && layoutParams.height == 0 && layoutParams.f2418g > 0.0f) {
                        i7 = r7.f2425f;
                        i21 = i13;
                        r7.f2425f = Math.max(i7, (layoutParams.topMargin + i7) + layoutParams.bottomMargin);
                        i7 = i14;
                        view = b;
                        i19 = i16;
                        i5 = virtualChildCount;
                        i6 = mode2;
                        mode2 = i4;
                        i9 = i18;
                        i20 = i21;
                        obj2 = 1;
                        virtualChildCount = i17;
                    } else {
                        i21 = i13;
                        if (layoutParams.height != 0 || layoutParams.f2418g <= 0.0f) {
                            i13 = Integer.MIN_VALUE;
                        } else {
                            layoutParams.height = -2;
                            i13 = 0;
                        }
                        i9 = i18;
                        int i22 = i13;
                        i20 = i21;
                        i10 = i14;
                        View view2 = b;
                        i5 = virtualChildCount;
                        i6 = mode2;
                        mode2 = i4;
                        i19 = i16;
                        virtualChildCount = i17;
                        m2911a(b, i17, i, 0, i2, f2 == 0.0f ? r7.f2425f : 0);
                        i7 = i22;
                        if (i7 != Integer.MIN_VALUE) {
                            layoutParams.height = i7;
                        }
                        i7 = view2.getMeasuredHeight();
                        i12 = r7.f2425f;
                        view = view2;
                        r7.f2425f = Math.max(i12, (((i12 + i7) + layoutParams.topMargin) + layoutParams.bottomMargin) + m2912b(view));
                        i7 = z ? Math.max(i7, i10) : i10;
                    }
                    if (i11 >= 0 && i11 == virtualChildCount + 1) {
                        r7.f2422c = r7.f2425f;
                    }
                    if (virtualChildCount < i11) {
                        if (layoutParams.f2418g > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                    }
                    if (mode == 1073741824 || layoutParams.width != -1) {
                        obj = null;
                    } else {
                        obj = 1;
                        obj4 = 1;
                    }
                    i13 = layoutParams.leftMargin + layoutParams.rightMargin;
                    i15 = view.getMeasuredWidth() + i13;
                    i16 = Math.max(i20, i15);
                    i17 = View.combineMeasuredStates(i9, view.getMeasuredState());
                    Object obj5 = (obj3 == null || layoutParams.width != -1) ? null : 1;
                    if (layoutParams.f2418g > 0.0f) {
                        if (obj == null) {
                            i13 = i15;
                        }
                        mode2 = Math.max(mode2, i13);
                        i12 = i19;
                    } else {
                        if (obj == null) {
                            i13 = i15;
                        }
                        i12 = Math.max(i19, i13);
                    }
                    i14 = i7;
                    obj3 = obj5;
                    i15 = mode2;
                    f = f2;
                    i8 = i16;
                    i16 = i12;
                    i12 = i17;
                    i17 = m2906a(view, virtualChildCount) + virtualChildCount;
                    i13 = i8;
                }
            }
            i17++;
            mode2 = i6;
            virtualChildCount = i5;
            i9 = i;
            i10 = i2;
        }
        i9 = i12;
        i10 = i14;
        i12 = i16;
        i5 = virtualChildCount;
        i6 = mode2;
        mode2 = i4;
        i16 = i13;
        if (r7.f2425f > 0) {
            i13 = i5;
            if (m2920c(i13)) {
                r7.f2425f += r7.f2432m;
            }
        } else {
            i13 = i5;
        }
        if (z) {
            i14 = i6;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                r7.f2425f = 0;
                i15 = 0;
                while (i15 < i13) {
                    View b2 = m2915b(i15);
                    if (b2 == null) {
                        r7.f2425f += m2921d(i15);
                    } else if (b2.getVisibility() == i3) {
                        i15 += m2906a(b2, i15);
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) b2.getLayoutParams();
                        i11 = r7.f2425f;
                        r7.f2425f = Math.max(i11, (((i11 + i10) + layoutParams2.topMargin) + layoutParams2.bottomMargin) + m2912b(b2));
                    }
                    i15++;
                    i3 = 8;
                }
            }
        } else {
            i14 = i6;
        }
        r7.f2425f += getPaddingTop() + getPaddingBottom();
        i3 = i10;
        i17 = i2;
        i15 = View.resolveSizeAndState(Math.max(r7.f2425f, getSuggestedMinimumHeight()), i17, 0);
        i10 = (16777215 & i15) - r7.f2425f;
        if (obj2 == null) {
            if (i10 == 0 || f <= 0.0f) {
                i7 = Math.max(i12, mode2);
                if (z && r3 != 1073741824) {
                    for (i12 = 0; i12 < i13; i12++) {
                        view = m2915b(i12);
                        if (view != null) {
                            if (view.getVisibility() != 8) {
                                if (((LayoutParams) view.getLayoutParams()).f2418g > 0.0f) {
                                    view.measure(MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i3, 1073741824));
                                }
                            }
                        }
                    }
                }
                i12 = i9;
                virtualChildCount = i;
                if (obj3 == null || mode == 1073741824) {
                    i7 = i16;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i7 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), virtualChildCount, i12), i15);
                if (obj4 != null) {
                    m2903c(i13, i17);
                }
            }
        }
        if (r7.f2426g > 0.0f) {
            f = r7.f2426g;
        }
        r7.f2425f = 0;
        float f3 = f;
        i7 = 0;
        i8 = i9;
        i9 = i12;
        i12 = i8;
        while (i7 < i13) {
            int i23;
            float f4;
            View b3 = m2915b(i7);
            if (b3.getVisibility() == 8) {
                i23 = i14;
                f4 = f3;
                virtualChildCount = i;
            } else {
                int i24;
                LayoutParams layoutParams3 = (LayoutParams) b3.getLayoutParams();
                f4 = layoutParams3.f2418g;
                if (f4 > 0.0f) {
                    i24 = (int) ((((float) i10) * f4) / f3);
                    int i25 = i10 - i24;
                    float f5 = f3 - f4;
                    i10 = getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + layoutParams3.leftMargin) + layoutParams3.rightMargin, layoutParams3.width);
                    if (layoutParams3.height == 0) {
                        i3 = 1073741824;
                        if (i14 == 1073741824) {
                            if (i24 <= 0) {
                                i24 = 0;
                            }
                            b3.measure(i10, MeasureSpec.makeMeasureSpec(i24, 1073741824));
                            i12 = View.combineMeasuredStates(i12, b3.getMeasuredState() & -256);
                            i10 = i25;
                            f4 = f5;
                        }
                    } else {
                        i3 = 1073741824;
                    }
                    i24 = b3.getMeasuredHeight() + i24;
                    if (i24 < 0) {
                        i24 = 0;
                    }
                    b3.measure(i10, MeasureSpec.makeMeasureSpec(i24, i3));
                    i12 = View.combineMeasuredStates(i12, b3.getMeasuredState() & -256);
                    i10 = i25;
                    f4 = f5;
                } else {
                    f4 = f3;
                    virtualChildCount = i;
                }
                int i26 = i12;
                i24 = layoutParams3.leftMargin + layoutParams3.rightMargin;
                i12 = b3.getMeasuredWidth() + i24;
                i16 = Math.max(i16, i12);
                int i27 = i12;
                if (mode != 1073741824) {
                    i23 = i14;
                    i14 = -1;
                    if (layoutParams3.width == -1) {
                        obj = 1;
                        if (obj != null) {
                            i24 = i27;
                        }
                        i12 = Math.max(i9, i24);
                        obj5 = (obj3 == null && layoutParams3.width == i14) ? 1 : null;
                        i24 = r7.f2425f;
                        r7.f2425f = Math.max(i24, (((i24 + b3.getMeasuredHeight()) + layoutParams3.topMargin) + layoutParams3.bottomMargin) + m2912b(b3));
                        obj3 = obj5;
                        i9 = i12;
                        i12 = i26;
                    }
                } else {
                    i23 = i14;
                    i14 = -1;
                }
                obj = null;
                if (obj != null) {
                    i24 = i27;
                }
                i12 = Math.max(i9, i24);
                if (obj3 == null) {
                }
                i24 = r7.f2425f;
                r7.f2425f = Math.max(i24, (((i24 + b3.getMeasuredHeight()) + layoutParams3.topMargin) + layoutParams3.bottomMargin) + m2912b(b3));
                obj3 = obj5;
                i9 = i12;
                i12 = i26;
            }
            i7++;
            f3 = f4;
            i14 = i23;
        }
        virtualChildCount = i;
        r7.f2425f += getPaddingTop() + getPaddingBottom();
        i7 = i9;
        if (obj3 == null) {
        }
        i7 = i16;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), virtualChildCount, i12), i15);
        if (obj4 != null) {
            m2903c(i13, i17);
        }
    }

    /* renamed from: c */
    private void m2903c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = m2915b(i3);
            if (b.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* renamed from: b */
    void m2916b(int i, int i2) {
        int[] iArr;
        int i3;
        boolean z;
        boolean z2;
        int measuredHeight;
        int combineMeasuredStates;
        int baseline;
        int i4;
        int i5;
        int i6;
        View b;
        LayoutParams layoutParams;
        int i7;
        int i8;
        float f;
        View b2;
        float f2;
        float f3;
        int i9;
        float f4;
        Object obj;
        Object obj2;
        int i10 = i;
        int i11 = i2;
        this.f2425f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (this.f2428i == null || r7.f2429j == null) {
            r7.f2428i = new int[4];
            r7.f2429j = new int[4];
        }
        int[] iArr2 = r7.f2428i;
        int[] iArr3 = r7.f2429j;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z3 = r7.f2420a;
        boolean z4 = r7.f2427h;
        int i12 = 1073741824;
        Object obj3 = mode == 1073741824 ? 1 : null;
        float f5 = 0.0f;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        Object obj4 = null;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        Object obj5 = 1;
        Object obj6 = null;
        while (true) {
            iArr = iArr3;
            if (i13 >= virtualChildCount) {
                break;
            }
            View view;
            View b3 = m2915b(i13);
            if (b3 == null) {
                r7.f2425f += m2921d(i13);
            } else if (b3.getVisibility() == 8) {
                i13 += m2906a(b3, i13);
            } else {
                int i19;
                Object obj7;
                Object obj8;
                if (m2920c(i13)) {
                    r7.f2425f += r7.f2431l;
                }
                LayoutParams layoutParams2 = (LayoutParams) b3.getLayoutParams();
                float f6 = f5 + layoutParams2.f2418g;
                if (mode == i12 && layoutParams2.width == 0 && layoutParams2.f2418g > 0.0f) {
                    if (obj3 != null) {
                        r7.f2425f += layoutParams2.leftMargin + layoutParams2.rightMargin;
                    } else {
                        i3 = r7.f2425f;
                        r7.f2425f = Math.max(i3, (layoutParams2.leftMargin + i3) + layoutParams2.rightMargin);
                    }
                    if (z3) {
                        i12 = MeasureSpec.makeMeasureSpec(0, 0);
                        b3.measure(i12, i12);
                        i19 = i13;
                        z = z4;
                        z2 = z3;
                        view = b3;
                    } else {
                        i19 = i13;
                        z = z4;
                        z2 = z3;
                        view = b3;
                        i13 = 1073741824;
                        obj4 = 1;
                        if (mode2 == i13 && layoutParams2.height == -1) {
                            obj7 = 1;
                            obj6 = 1;
                        } else {
                            obj7 = null;
                        }
                        i12 = layoutParams2.topMargin + layoutParams2.bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i12;
                        combineMeasuredStates = View.combineMeasuredStates(i18, view.getMeasuredState());
                        if (z2) {
                            baseline = view.getBaseline();
                            if (baseline != -1) {
                                i11 = ((((layoutParams2.f2419h >= 0 ? r7.f2424e : layoutParams2.f2419h) & 112) >> 4) & -2) >> 1;
                                iArr2[i11] = Math.max(iArr2[i11], baseline);
                                iArr[i11] = Math.max(iArr[i11], measuredHeight - baseline);
                            }
                        }
                        i13 = Math.max(i15, measuredHeight);
                        obj8 = (obj5 == null && layoutParams2.height == -1) ? 1 : null;
                        if (layoutParams2.f2418g <= 0.0f) {
                            if (obj7 == null) {
                                i12 = measuredHeight;
                            }
                            i17 = Math.max(i17, i12);
                        } else {
                            i4 = i17;
                            if (obj7 != null) {
                                measuredHeight = i12;
                            }
                            i16 = Math.max(i16, measuredHeight);
                            i17 = i4;
                        }
                        i4 = i19;
                        i15 = i13;
                        i18 = combineMeasuredStates;
                        obj5 = obj8;
                        i13 = m2906a(view, i4) + i4;
                        f5 = f6;
                        i13++;
                        iArr3 = iArr;
                        z4 = z;
                        z3 = z2;
                        i12 = 1073741824;
                        i11 = i2;
                    }
                } else {
                    if (layoutParams2.width != 0 || layoutParams2.f2418g <= 0.0f) {
                        i12 = Integer.MIN_VALUE;
                    } else {
                        layoutParams2.width = -2;
                        i12 = 0;
                    }
                    i19 = i13;
                    int i20 = i12;
                    z = z4;
                    z2 = z3;
                    View view2 = b3;
                    m2911a(b3, i19, i, f6 == 0.0f ? r7.f2425f : 0, i2, 0);
                    i3 = i20;
                    if (i3 != Integer.MIN_VALUE) {
                        layoutParams2.width = i3;
                    }
                    i3 = view2.getMeasuredWidth();
                    if (obj3 != null) {
                        view = view2;
                        r7.f2425f += ((layoutParams2.leftMargin + i3) + layoutParams2.rightMargin) + m2912b(view);
                    } else {
                        view = view2;
                        i13 = r7.f2425f;
                        r7.f2425f = Math.max(i13, (((i13 + i3) + layoutParams2.leftMargin) + layoutParams2.rightMargin) + m2912b(view));
                    }
                    if (z) {
                        i14 = Math.max(i3, i14);
                    }
                }
                i13 = 1073741824;
                if (mode2 == i13) {
                }
                obj7 = null;
                i12 = layoutParams2.topMargin + layoutParams2.bottomMargin;
                measuredHeight = view.getMeasuredHeight() + i12;
                combineMeasuredStates = View.combineMeasuredStates(i18, view.getMeasuredState());
                if (z2) {
                    baseline = view.getBaseline();
                    if (baseline != -1) {
                        if (layoutParams2.f2419h >= 0) {
                        }
                        i11 = ((((layoutParams2.f2419h >= 0 ? r7.f2424e : layoutParams2.f2419h) & 112) >> 4) & -2) >> 1;
                        iArr2[i11] = Math.max(iArr2[i11], baseline);
                        iArr[i11] = Math.max(iArr[i11], measuredHeight - baseline);
                    }
                }
                i13 = Math.max(i15, measuredHeight);
                if (obj5 == null) {
                }
                if (layoutParams2.f2418g <= 0.0f) {
                    i4 = i17;
                    if (obj7 != null) {
                        measuredHeight = i12;
                    }
                    i16 = Math.max(i16, measuredHeight);
                    i17 = i4;
                } else {
                    if (obj7 == null) {
                        i12 = measuredHeight;
                    }
                    i17 = Math.max(i17, i12);
                }
                i4 = i19;
                i15 = i13;
                i18 = combineMeasuredStates;
                obj5 = obj8;
                i13 = m2906a(view, i4) + i4;
                f5 = f6;
                i13++;
                iArr3 = iArr;
                z4 = z;
                z3 = z2;
                i12 = 1073741824;
                i11 = i2;
            }
            z = z4;
            z2 = z3;
            i13++;
            iArr3 = iArr;
            z4 = z;
            z3 = z2;
            i12 = 1073741824;
            i11 = i2;
        }
        z = z4;
        z2 = z3;
        i13 = i15;
        i12 = i16;
        i4 = i17;
        baseline = i18;
        if (r7.f2425f > 0 && m2920c(virtualChildCount)) {
            r7.f2425f += r7.f2431l;
        }
        if (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1) {
            if (iArr2[3] == -1) {
                i5 = baseline;
                if (z && (mode == Integer.MIN_VALUE || mode == 0)) {
                    r7.f2425f = 0;
                    i6 = 0;
                    while (i6 < virtualChildCount) {
                        b = m2915b(i6);
                        if (b == null) {
                            r7.f2425f += m2921d(i6);
                        } else if (b.getVisibility() != 8) {
                            i6 += m2906a(b, i6);
                        } else {
                            layoutParams = (LayoutParams) b.getLayoutParams();
                            if (obj3 == null) {
                                r7.f2425f += ((layoutParams.leftMargin + i14) + layoutParams.rightMargin) + m2912b(b);
                            } else {
                                baseline = r7.f2425f;
                                i7 = i13;
                                r7.f2425f = Math.max(baseline, (((baseline + i14) + layoutParams.leftMargin) + layoutParams.rightMargin) + m2912b(b));
                                i6++;
                                i13 = i7;
                            }
                        }
                        i7 = i13;
                        i6++;
                        i13 = i7;
                    }
                }
                i7 = i13;
                r7.f2425f += getPaddingLeft() + getPaddingRight();
                i13 = View.resolveSizeAndState(Math.max(r7.f2425f, getSuggestedMinimumWidth()), i10, 0);
                i6 = (16777215 & i13) - r7.f2425f;
                if (obj4 == null) {
                    if (i6 != 0 || f5 <= 0.0f) {
                        i3 = Math.max(i12, i4);
                        if (z && mode != 1073741824) {
                            for (i12 = 0; i12 < virtualChildCount; i12++) {
                                view = m2915b(i12);
                                if (view == null) {
                                    if (view.getVisibility() == 8) {
                                        if (((LayoutParams) view.getLayoutParams()).f2418g > 0.0f) {
                                            view.measure(MeasureSpec.makeMeasureSpec(i14, 1073741824), MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
                                        }
                                    }
                                }
                            }
                        }
                        i8 = virtualChildCount;
                        i6 = i2;
                        if (obj5 == null && mode2 != 1073741824) {
                            i7 = i3;
                        }
                        setMeasuredDimension(i13 | (i5 & -16777216), View.resolveSizeAndState(Math.max(i7 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i6, i5 << 16));
                        if (obj6 != null) {
                            m2904d(i8, i);
                        }
                    }
                }
                if (r7.f2426g > 0.0f) {
                    f5 = r7.f2426g;
                }
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                r7.f2425f = 0;
                i4 = i12;
                i11 = i5;
                baseline = -1;
                f = f5;
                i3 = 0;
                while (i3 < virtualChildCount) {
                    b2 = m2915b(i3);
                    if (b2 != null) {
                        if (b2.getVisibility() == 8) {
                            layoutParams = (LayoutParams) b2.getLayoutParams();
                            f2 = layoutParams.f2418g;
                            if (f2 <= 0.0f) {
                                i10 = (int) ((((float) i6) * f2) / f);
                                f3 = f - f2;
                                i9 = i6 - i10;
                                i8 = virtualChildCount;
                                i12 = getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin, layoutParams.height);
                                if (layoutParams.width != 0) {
                                    measuredHeight = 1073741824;
                                    if (mode != 1073741824) {
                                        if (i10 > 0) {
                                            i10 = 0;
                                        }
                                        b2.measure(MeasureSpec.makeMeasureSpec(i10, 1073741824), i12);
                                        i11 = View.combineMeasuredStates(i11, b2.getMeasuredState() & -16777216);
                                        f = f3;
                                        measuredHeight = i9;
                                    }
                                } else {
                                    measuredHeight = 1073741824;
                                }
                                i10 = b2.getMeasuredWidth() + i10;
                                if (i10 < 0) {
                                    i10 = 0;
                                }
                                b2.measure(MeasureSpec.makeMeasureSpec(i10, measuredHeight), i12);
                                i11 = View.combineMeasuredStates(i11, b2.getMeasuredState() & -16777216);
                                f = f3;
                                measuredHeight = i9;
                            } else {
                                measuredHeight = i6;
                                i8 = virtualChildCount;
                                i6 = i2;
                            }
                            if (obj3 == null) {
                                r7.f2425f += ((b2.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin) + m2912b(b2);
                                f4 = f;
                            } else {
                                i10 = r7.f2425f;
                                f4 = f;
                                r7.f2425f = Math.max(i10, (((b2.getMeasuredWidth() + i10) + layoutParams.leftMargin) + layoutParams.rightMargin) + m2912b(b2));
                            }
                            obj = (mode2 == 1073741824 && layoutParams.height == -1) ? 1 : null;
                            i10 = layoutParams.topMargin + layoutParams.bottomMargin;
                            virtualChildCount = b2.getMeasuredHeight() + i10;
                            baseline = Math.max(baseline, virtualChildCount);
                            if (obj != null) {
                                i10 = virtualChildCount;
                            }
                            i12 = Math.max(i4, i10);
                            if (obj5 == null) {
                                i4 = -1;
                                if (layoutParams.height == -1) {
                                    obj2 = 1;
                                    if (z2) {
                                        i14 = b2.getBaseline();
                                        if (i14 != i4) {
                                            combineMeasuredStates = ((((layoutParams.f2419h >= 0 ? r7.f2424e : layoutParams.f2419h) & 112) >> 4) & -2) >> 1;
                                            iArr2[combineMeasuredStates] = Math.max(iArr2[combineMeasuredStates], i14);
                                            iArr[combineMeasuredStates] = Math.max(iArr[combineMeasuredStates], virtualChildCount - i14);
                                            i4 = i12;
                                            obj5 = obj2;
                                            f = f4;
                                            i3++;
                                            i6 = measuredHeight;
                                            virtualChildCount = i8;
                                            i10 = i;
                                        }
                                    }
                                    i4 = i12;
                                    obj5 = obj2;
                                    f = f4;
                                    i3++;
                                    i6 = measuredHeight;
                                    virtualChildCount = i8;
                                    i10 = i;
                                }
                            } else {
                                i4 = -1;
                            }
                            obj2 = null;
                            if (z2) {
                                i14 = b2.getBaseline();
                                if (i14 != i4) {
                                    if (layoutParams.f2419h >= 0) {
                                    }
                                    combineMeasuredStates = ((((layoutParams.f2419h >= 0 ? r7.f2424e : layoutParams.f2419h) & 112) >> 4) & -2) >> 1;
                                    iArr2[combineMeasuredStates] = Math.max(iArr2[combineMeasuredStates], i14);
                                    iArr[combineMeasuredStates] = Math.max(iArr[combineMeasuredStates], virtualChildCount - i14);
                                    i4 = i12;
                                    obj5 = obj2;
                                    f = f4;
                                    i3++;
                                    i6 = measuredHeight;
                                    virtualChildCount = i8;
                                    i10 = i;
                                }
                            }
                            i4 = i12;
                            obj5 = obj2;
                            f = f4;
                            i3++;
                            i6 = measuredHeight;
                            virtualChildCount = i8;
                            i10 = i;
                        }
                    }
                    measuredHeight = i6;
                    i8 = virtualChildCount;
                    i6 = i2;
                    i3++;
                    i6 = measuredHeight;
                    virtualChildCount = i8;
                    i10 = i;
                }
                i8 = virtualChildCount;
                i6 = i2;
                r7.f2425f += getPaddingLeft() + getPaddingRight();
                if (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1) {
                    if (iArr2[3] != -1) {
                        i3 = baseline;
                        i7 = i3;
                        i5 = i11;
                        i3 = i4;
                        i7 = i3;
                        setMeasuredDimension(i13 | (i5 & -16777216), View.resolveSizeAndState(Math.max(i7 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i6, i5 << 16));
                        if (obj6 != null) {
                            m2904d(i8, i);
                        }
                    }
                }
                i3 = Math.max(baseline, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
                i7 = i3;
                i5 = i11;
                i3 = i4;
                i7 = i3;
                setMeasuredDimension(i13 | (i5 & -16777216), View.resolveSizeAndState(Math.max(i7 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i6, i5 << 16));
                if (obj6 != null) {
                    m2904d(i8, i);
                }
            }
        }
        i5 = baseline;
        i13 = Math.max(i13, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        r7.f2425f = 0;
        i6 = 0;
        while (i6 < virtualChildCount) {
            b = m2915b(i6);
            if (b == null) {
                r7.f2425f += m2921d(i6);
            } else if (b.getVisibility() != 8) {
                layoutParams = (LayoutParams) b.getLayoutParams();
                if (obj3 == null) {
                    baseline = r7.f2425f;
                    i7 = i13;
                    r7.f2425f = Math.max(baseline, (((baseline + i14) + layoutParams.leftMargin) + layoutParams.rightMargin) + m2912b(b));
                    i6++;
                    i13 = i7;
                } else {
                    r7.f2425f += ((layoutParams.leftMargin + i14) + layoutParams.rightMargin) + m2912b(b);
                }
            } else {
                i6 += m2906a(b, i6);
            }
            i7 = i13;
            i6++;
            i13 = i7;
        }
        i7 = i13;
        r7.f2425f += getPaddingLeft() + getPaddingRight();
        i13 = View.resolveSizeAndState(Math.max(r7.f2425f, getSuggestedMinimumWidth()), i10, 0);
        i6 = (16777215 & i13) - r7.f2425f;
        if (obj4 == null) {
            if (i6 != 0) {
            }
            i3 = Math.max(i12, i4);
            for (i12 = 0; i12 < virtualChildCount; i12++) {
                view = m2915b(i12);
                if (view == null) {
                    if (view.getVisibility() == 8) {
                        if (((LayoutParams) view.getLayoutParams()).f2418g > 0.0f) {
                            view.measure(MeasureSpec.makeMeasureSpec(i14, 1073741824), MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
            }
            i8 = virtualChildCount;
            i6 = i2;
            i7 = i3;
            setMeasuredDimension(i13 | (i5 & -16777216), View.resolveSizeAndState(Math.max(i7 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i6, i5 << 16));
            if (obj6 != null) {
                m2904d(i8, i);
            }
        }
        if (r7.f2426g > 0.0f) {
            f5 = r7.f2426g;
        }
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        r7.f2425f = 0;
        i4 = i12;
        i11 = i5;
        baseline = -1;
        f = f5;
        i3 = 0;
        while (i3 < virtualChildCount) {
            b2 = m2915b(i3);
            if (b2 != null) {
                if (b2.getVisibility() == 8) {
                    layoutParams = (LayoutParams) b2.getLayoutParams();
                    f2 = layoutParams.f2418g;
                    if (f2 <= 0.0f) {
                        measuredHeight = i6;
                        i8 = virtualChildCount;
                        i6 = i2;
                    } else {
                        i10 = (int) ((((float) i6) * f2) / f);
                        f3 = f - f2;
                        i9 = i6 - i10;
                        i8 = virtualChildCount;
                        i12 = getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin, layoutParams.height);
                        if (layoutParams.width != 0) {
                            measuredHeight = 1073741824;
                        } else {
                            measuredHeight = 1073741824;
                            if (mode != 1073741824) {
                                if (i10 > 0) {
                                    i10 = 0;
                                }
                                b2.measure(MeasureSpec.makeMeasureSpec(i10, 1073741824), i12);
                                i11 = View.combineMeasuredStates(i11, b2.getMeasuredState() & -16777216);
                                f = f3;
                                measuredHeight = i9;
                            }
                        }
                        i10 = b2.getMeasuredWidth() + i10;
                        if (i10 < 0) {
                            i10 = 0;
                        }
                        b2.measure(MeasureSpec.makeMeasureSpec(i10, measuredHeight), i12);
                        i11 = View.combineMeasuredStates(i11, b2.getMeasuredState() & -16777216);
                        f = f3;
                        measuredHeight = i9;
                    }
                    if (obj3 == null) {
                        i10 = r7.f2425f;
                        f4 = f;
                        r7.f2425f = Math.max(i10, (((b2.getMeasuredWidth() + i10) + layoutParams.leftMargin) + layoutParams.rightMargin) + m2912b(b2));
                    } else {
                        r7.f2425f += ((b2.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin) + m2912b(b2);
                        f4 = f;
                    }
                    if (mode2 == 1073741824) {
                    }
                    i10 = layoutParams.topMargin + layoutParams.bottomMargin;
                    virtualChildCount = b2.getMeasuredHeight() + i10;
                    baseline = Math.max(baseline, virtualChildCount);
                    if (obj != null) {
                        i10 = virtualChildCount;
                    }
                    i12 = Math.max(i4, i10);
                    if (obj5 == null) {
                        i4 = -1;
                    } else {
                        i4 = -1;
                        if (layoutParams.height == -1) {
                            obj2 = 1;
                            if (z2) {
                                i14 = b2.getBaseline();
                                if (i14 != i4) {
                                    if (layoutParams.f2419h >= 0) {
                                    }
                                    combineMeasuredStates = ((((layoutParams.f2419h >= 0 ? r7.f2424e : layoutParams.f2419h) & 112) >> 4) & -2) >> 1;
                                    iArr2[combineMeasuredStates] = Math.max(iArr2[combineMeasuredStates], i14);
                                    iArr[combineMeasuredStates] = Math.max(iArr[combineMeasuredStates], virtualChildCount - i14);
                                    i4 = i12;
                                    obj5 = obj2;
                                    f = f4;
                                    i3++;
                                    i6 = measuredHeight;
                                    virtualChildCount = i8;
                                    i10 = i;
                                }
                            }
                            i4 = i12;
                            obj5 = obj2;
                            f = f4;
                            i3++;
                            i6 = measuredHeight;
                            virtualChildCount = i8;
                            i10 = i;
                        }
                    }
                    obj2 = null;
                    if (z2) {
                        i14 = b2.getBaseline();
                        if (i14 != i4) {
                            if (layoutParams.f2419h >= 0) {
                            }
                            combineMeasuredStates = ((((layoutParams.f2419h >= 0 ? r7.f2424e : layoutParams.f2419h) & 112) >> 4) & -2) >> 1;
                            iArr2[combineMeasuredStates] = Math.max(iArr2[combineMeasuredStates], i14);
                            iArr[combineMeasuredStates] = Math.max(iArr[combineMeasuredStates], virtualChildCount - i14);
                            i4 = i12;
                            obj5 = obj2;
                            f = f4;
                            i3++;
                            i6 = measuredHeight;
                            virtualChildCount = i8;
                            i10 = i;
                        }
                    }
                    i4 = i12;
                    obj5 = obj2;
                    f = f4;
                    i3++;
                    i6 = measuredHeight;
                    virtualChildCount = i8;
                    i10 = i;
                }
            }
            measuredHeight = i6;
            i8 = virtualChildCount;
            i6 = i2;
            i3++;
            i6 = measuredHeight;
            virtualChildCount = i8;
            i10 = i;
        }
        i8 = virtualChildCount;
        i6 = i2;
        r7.f2425f += getPaddingLeft() + getPaddingRight();
        if (iArr2[3] != -1) {
            i3 = baseline;
            i7 = i3;
            i5 = i11;
            i3 = i4;
            i7 = i3;
            setMeasuredDimension(i13 | (i5 & -16777216), View.resolveSizeAndState(Math.max(i7 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i6, i5 << 16));
            if (obj6 != null) {
                m2904d(i8, i);
            }
        }
        i3 = Math.max(baseline, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        i7 = i3;
        i5 = i11;
        i3 = i4;
        i7 = i3;
        setMeasuredDimension(i13 | (i5 & -16777216), View.resolveSizeAndState(Math.max(i7 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i6, i5 << 16));
        if (obj6 != null) {
            m2904d(i8, i);
        }
    }

    /* renamed from: d */
    private void m2904d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = m2915b(i3);
            if (b.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = b.getMeasuredWidth();
                    measureChildWithMargins(b, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    /* renamed from: a */
    void m2911a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2423d) {
            m2908a(i, i2, i3, i4);
        } else {
            m2917b(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    void m2908a(int i, int i2, int i3, int i4) {
        int paddingTop;
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        i5 = this.f2424e & 112;
        int i6 = this.f2424e & 8388615;
        if (i5 == 16) {
            paddingTop = (((i4 - i2) - r6.f2425f) / 2) + getPaddingTop();
        } else if (i5 != 80) {
            paddingTop = getPaddingTop();
        } else {
            paddingTop = ((getPaddingTop() + i4) - i2) - r6.f2425f;
        }
        int i7 = 0;
        while (i7 < virtualChildCount) {
            View b = m2915b(i7);
            if (b == null) {
                paddingTop += m2921d(i7);
            } else if (b.getVisibility() != 8) {
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                int i8 = layoutParams.f2419h;
                if (i8 < 0) {
                    i8 = i6;
                }
                i8 = C0543c.m2037a(i8, C0560r.m2193e(this)) & 7;
                if (i8 == 1) {
                    i8 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                } else if (i8 != 5) {
                    i8 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i8 = (paddingRight - measuredWidth) - layoutParams.rightMargin;
                }
                i5 = i8;
                if (m2920c(i7)) {
                    paddingTop += r6.f2432m;
                }
                int i9 = paddingTop + layoutParams.topMargin;
                LayoutParams layoutParams2 = layoutParams;
                m2902a(b, i5, i9 + m2905a(b), measuredWidth, measuredHeight);
                i7 += m2906a(b, i7);
                paddingTop = i9 + ((measuredHeight + layoutParams2.bottomMargin) + m2912b(b));
            }
            i7++;
        }
    }

    /* renamed from: b */
    void m2917b(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean a = bg.m3615a(this);
        int paddingTop = getPaddingTop();
        int i7 = i4 - i2;
        int paddingBottom = i7 - getPaddingBottom();
        int paddingBottom2 = (i7 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        i7 = this.f2424e & 8388615;
        int i8 = this.f2424e & 112;
        boolean z = this.f2420a;
        int[] iArr = this.f2428i;
        int[] iArr2 = this.f2429j;
        i7 = C0543c.m2037a(i7, C0560r.m2193e(this));
        if (i7 == 1) {
            paddingLeft = (((i3 - i) - r6.f2425f) / 2) + getPaddingLeft();
        } else if (i7 != 5) {
            paddingLeft = getPaddingLeft();
        } else {
            paddingLeft = ((getPaddingLeft() + i3) - i) - r6.f2425f;
        }
        if (a) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        i7 = 0;
        while (i7 < virtualChildCount) {
            int i9;
            int i10;
            int i11;
            int i12 = i5 + (i6 * i7);
            View b = m2915b(i12);
            if (b == null) {
                paddingLeft += m2921d(i12);
            } else if (b.getVisibility() != 8) {
                int i13;
                View view;
                LayoutParams layoutParams;
                View view2;
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                LayoutParams layoutParams2 = (LayoutParams) b.getLayoutParams();
                if (z) {
                    i13 = i7;
                    i9 = virtualChildCount;
                    if (layoutParams2.height != -1) {
                        i7 = b.getBaseline();
                        virtualChildCount = layoutParams2.f2419h;
                        if (virtualChildCount < 0) {
                            virtualChildCount = i8;
                        }
                        virtualChildCount &= 112;
                        i10 = i8;
                        if (virtualChildCount != 16) {
                            i7 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + layoutParams2.topMargin) - layoutParams2.bottomMargin;
                        } else if (virtualChildCount != 48) {
                            virtualChildCount = layoutParams2.topMargin + paddingTop;
                            if (i7 != -1) {
                                virtualChildCount += iArr[1] - i7;
                            }
                            i7 = virtualChildCount;
                        } else if (virtualChildCount == 80) {
                            i7 = paddingTop;
                        } else {
                            virtualChildCount = (paddingBottom - measuredHeight) - layoutParams2.bottomMargin;
                            if (i7 != -1) {
                                virtualChildCount -= iArr2[2] - (b.getMeasuredHeight() - i7);
                            }
                            i7 = virtualChildCount;
                        }
                        if (m2920c(i12)) {
                            paddingLeft += r6.f2431l;
                        }
                        virtualChildCount = layoutParams2.leftMargin + paddingLeft;
                        view = b;
                        i8 = i12;
                        i12 = virtualChildCount + m2905a(b);
                        r19 = i13;
                        i11 = paddingTop;
                        layoutParams = layoutParams2;
                        m2902a(b, i12, i7, measuredWidth, measuredHeight);
                        view2 = view;
                        i7 = r19 + m2906a(view2, i8);
                        paddingLeft = virtualChildCount + ((measuredWidth + layoutParams.rightMargin) + m2912b(view2));
                        i7++;
                        virtualChildCount = i9;
                        i8 = i10;
                        paddingTop = i11;
                    }
                } else {
                    i13 = i7;
                    i9 = virtualChildCount;
                }
                i7 = -1;
                virtualChildCount = layoutParams2.f2419h;
                if (virtualChildCount < 0) {
                    virtualChildCount = i8;
                }
                virtualChildCount &= 112;
                i10 = i8;
                if (virtualChildCount != 16) {
                    i7 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + layoutParams2.topMargin) - layoutParams2.bottomMargin;
                } else if (virtualChildCount != 48) {
                    virtualChildCount = layoutParams2.topMargin + paddingTop;
                    if (i7 != -1) {
                        virtualChildCount += iArr[1] - i7;
                    }
                    i7 = virtualChildCount;
                } else if (virtualChildCount == 80) {
                    virtualChildCount = (paddingBottom - measuredHeight) - layoutParams2.bottomMargin;
                    if (i7 != -1) {
                        virtualChildCount -= iArr2[2] - (b.getMeasuredHeight() - i7);
                    }
                    i7 = virtualChildCount;
                } else {
                    i7 = paddingTop;
                }
                if (m2920c(i12)) {
                    paddingLeft += r6.f2431l;
                }
                virtualChildCount = layoutParams2.leftMargin + paddingLeft;
                view = b;
                i8 = i12;
                i12 = virtualChildCount + m2905a(b);
                r19 = i13;
                i11 = paddingTop;
                layoutParams = layoutParams2;
                m2902a(b, i12, i7, measuredWidth, measuredHeight);
                view2 = view;
                i7 = r19 + m2906a(view2, i8);
                paddingLeft = virtualChildCount + ((measuredWidth + layoutParams.rightMargin) + m2912b(view2));
                i7++;
                virtualChildCount = i9;
                i8 = i10;
                paddingTop = i11;
            } else {
                r19 = i7;
            }
            i11 = paddingTop;
            i9 = virtualChildCount;
            i10 = i8;
            i7++;
            virtualChildCount = i9;
            i8 = i10;
            paddingTop = i11;
        }
    }

    /* renamed from: a */
    private void m2902a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.f2423d != i) {
            this.f2423d = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f2423d;
    }

    public void setGravity(int i) {
        if (this.f2424e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2424e = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.f2424e;
    }

    public void setHorizontalGravity(int i) {
        i &= 8388615;
        if ((8388615 & this.f2424e) != i) {
            this.f2424e = i | (this.f2424e & -8388616);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        i &= 112;
        if ((this.f2424e & 112) != i) {
            this.f2424e = i | (this.f2424e & -113);
            requestLayout();
        }
    }

    /* renamed from: b */
    public LayoutParams mo638b(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: j */
    protected LayoutParams mo644j() {
        if (this.f2423d == 0) {
            return new LayoutParams(-2, -2);
        }
        return this.f2423d == 1 ? new LayoutParams(-1, -2) : null;
    }

    /* renamed from: b */
    protected LayoutParams mo639b(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }
}
