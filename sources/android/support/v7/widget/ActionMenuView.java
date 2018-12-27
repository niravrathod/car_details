package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.view.menu.C0730p;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3224h.C0723a;
import android.support.v7.view.menu.C3224h.C0724b;
import android.support.v7.view.menu.C3227j;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

public class ActionMenuView extends LinearLayoutCompat implements C0724b, C0730p {
    /* renamed from: a */
    C0723a f13698a;
    /* renamed from: b */
    C0743d f13699b;
    /* renamed from: c */
    private C3224h f13700c;
    /* renamed from: d */
    private Context f13701d;
    /* renamed from: e */
    private int f13702e;
    /* renamed from: f */
    private boolean f13703f;
    /* renamed from: g */
    private ActionMenuPresenter f13704g;
    /* renamed from: h */
    private C0727a f13705h;
    /* renamed from: i */
    private boolean f13706i;
    /* renamed from: j */
    private int f13707j;
    /* renamed from: k */
    private int f13708k;
    /* renamed from: l */
    private int f13709l;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C0742a {
        /* renamed from: c */
        boolean mo3819c();

        /* renamed from: d */
        boolean mo3820d();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    public interface C0743d {
        /* renamed from: a */
        boolean mo756a(MenuItem menuItem);
    }

    public static class LayoutParams extends android.support.v7.widget.LinearLayoutCompat.LayoutParams {
        @ExportedProperty
        /* renamed from: a */
        public boolean f13691a;
        @ExportedProperty
        /* renamed from: b */
        public int f13692b;
        @ExportedProperty
        /* renamed from: c */
        public int f13693c;
        @ExportedProperty
        /* renamed from: d */
        public boolean f13694d;
        @ExportedProperty
        /* renamed from: e */
        public boolean f13695e;
        /* renamed from: f */
        boolean f13696f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f13691a = layoutParams.f13691a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f13691a = false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    private static class C3238b implements C0727a {
        /* renamed from: a */
        public void mo490a(C3224h c3224h, boolean z) {
        }

        /* renamed from: a */
        public boolean mo491a(C3224h c3224h) {
            return false;
        }

        C3238b() {
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    private class C3239c implements C0723a {
        /* renamed from: a */
        final /* synthetic */ ActionMenuView f13697a;

        C3239c(ActionMenuView actionMenuView) {
            this.f13697a = actionMenuView;
        }

        /* renamed from: a */
        public boolean mo102a(C3224h c3224h, MenuItem menuItem) {
            return (this.f13697a.f13699b == null || this.f13697a.f13699b.mo756a(menuItem) == null) ? null : true;
        }

        /* renamed from: a */
        public void mo101a(C3224h c3224h) {
            if (this.f13697a.f13698a != null) {
                this.f13697a.f13698a.mo101a(c3224h);
            }
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: b */
    public /* synthetic */ android.support.v7.widget.LinearLayoutCompat.LayoutParams mo638b(AttributeSet attributeSet) {
        return m16287a(attributeSet);
    }

    /* renamed from: b */
    protected /* synthetic */ android.support.v7.widget.LinearLayoutCompat.LayoutParams mo639b(android.view.ViewGroup.LayoutParams layoutParams) {
        return m16288a(layoutParams);
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m16293b();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m16287a(attributeSet);
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m16288a(layoutParams);
    }

    /* renamed from: j */
    protected /* synthetic */ android.support.v7.widget.LinearLayoutCompat.LayoutParams mo644j() {
        return m16293b();
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f13708k = (int) (56.0f * f);
        this.f13709l = (int) (f * 4.0f);
        this.f13701d = context;
        this.f13702e = 0;
    }

    public void setPopupTheme(int i) {
        if (this.f13702e != i) {
            this.f13702e = i;
            if (i == 0) {
                this.f13701d = getContext();
            } else {
                this.f13701d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f13702e;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f13704g = actionMenuPresenter;
        this.f13704g.m24512a(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f13704g != null) {
            this.f13704g.mo79a(false);
            if (this.f13704g.m24527j() != null) {
                this.f13704g.m24524g();
                this.f13704g.m24523f();
            }
        }
    }

    public void setOnMenuItemClickListener(C0743d c0743d) {
        this.f13699b = c0743d;
    }

    protected void onMeasure(int i, int i2) {
        boolean z = this.f13706i;
        this.f13706i = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f13706i) {
            this.f13707j = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.f13706i || this.f13700c == null || size == this.f13707j)) {
            this.f13707j = size;
            this.f13700c.mo4579a(true);
        }
        size = getChildCount();
        if (!this.f13706i || size <= 0) {
            for (int i3 = 0; i3 < size; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m16286c(i, i2);
    }

    /* renamed from: c */
    private void m16286c(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        size -= paddingLeft;
        paddingLeft = size / this.f13708k;
        int i3 = size % this.f13708k;
        if (paddingLeft == 0) {
            setMeasuredDimension(size, 0);
            return;
        }
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        int i8;
        int i9 = r0.f13708k + (i3 / paddingLeft);
        i3 = getChildCount();
        int i10 = paddingLeft;
        paddingLeft = 0;
        int i11 = 0;
        Object obj2 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        long j = 0;
        while (paddingLeft < i3) {
            View childAt = getChildAt(paddingLeft);
            i4 = size2;
            if (childAt.getVisibility() == 8) {
                i5 = size;
            } else {
                int i15;
                boolean z;
                int i16;
                boolean z2 = childAt instanceof ActionMenuItemView;
                i12++;
                if (z2) {
                    i15 = i12;
                    i5 = size;
                    z = false;
                    childAt.setPadding(r0.f13709l, 0, r0.f13709l, 0);
                } else {
                    i5 = size;
                    i15 = i12;
                    z = false;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f13696f = z;
                layoutParams.f13693c = z;
                layoutParams.f13692b = z;
                layoutParams.f13694d = z;
                layoutParams.leftMargin = z;
                layoutParams.rightMargin = z;
                z = z2 && ((ActionMenuItemView) childAt).m24424b();
                layoutParams.f13695e = z;
                size = m16285a(childAt, i9, layoutParams.f13691a ? 1 : i10, childMeasureSpec, paddingTop);
                size2 = Math.max(i13, size);
                if (layoutParams.f13694d) {
                    i14++;
                }
                if (layoutParams.f13691a) {
                    obj2 = 1;
                }
                i10 -= size;
                i11 = Math.max(i11, childAt.getMeasuredHeight());
                if (size == 1) {
                    i16 = size2;
                    j |= (long) (1 << paddingLeft);
                } else {
                    i16 = size2;
                }
                i12 = i15;
                i13 = i16;
            }
            paddingLeft++;
            size2 = i4;
            size = i5;
        }
        i5 = size;
        i4 = size2;
        Object obj3 = (obj2 == null || i12 != 2) ? null : 1;
        Object obj4 = null;
        while (i14 > 0 && i10 > 0) {
            paddingTop = 0;
            int i17 = 0;
            int i18 = BaseClientBuilder.API_PRIORITY_OTHER;
            long j2 = 0;
            while (paddingTop < i3) {
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(paddingTop).getLayoutParams();
                obj = obj4;
                if (layoutParams2.f13694d) {
                    if (layoutParams2.f13692b < i18) {
                        j2 = 1 << paddingTop;
                        i18 = layoutParams2.f13692b;
                        i17 = 1;
                    } else if (layoutParams2.f13692b == i18) {
                        j2 |= 1 << paddingTop;
                        i17++;
                    }
                }
                paddingTop++;
                obj4 = obj;
            }
            obj = obj4;
            j |= j2;
            if (i17 > i10) {
                break;
            }
            i18++;
            size = 0;
            while (size < i3) {
                View childAt2 = getChildAt(size);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                i6 = i11;
                i7 = childMeasureSpec;
                i8 = i3;
                long j3 = (long) (1 << size);
                if ((j2 & j3) != 0) {
                    boolean z3;
                    if (obj3 == null || !layoutParams3.f13695e) {
                        z3 = true;
                    } else {
                        z3 = true;
                        if (i10 == 1) {
                            childAt2.setPadding(r0.f13709l + i9, 0, r0.f13709l, 0);
                        }
                    }
                    layoutParams3.f13692b += z3;
                    layoutParams3.f13696f = z3;
                    i10--;
                } else if (layoutParams3.f13692b == i18) {
                    j |= j3;
                }
                size++;
                i11 = i6;
                childMeasureSpec = i7;
                i3 = i8;
            }
            obj4 = 1;
        }
        obj = obj4;
        i7 = childMeasureSpec;
        i8 = i3;
        i6 = i11;
        View childAt3;
        LayoutParams layoutParams4;
        if (obj2 == null) {
            size = 1;
            if (i12 == 1) {
                obj3 = 1;
                if (i10 > 0 || j == 0 || (i10 >= i12 - r2 && obj3 == null && i13 <= r2)) {
                    size = i8;
                    size2 = 0;
                } else {
                    float bitCount = (float) Long.bitCount(j);
                    if (obj3 == null) {
                        if ((j & 1) != 0) {
                            size2 = 0;
                            if (!((LayoutParams) getChildAt(0).getLayoutParams()).f13695e) {
                                bitCount -= 0.5f;
                            }
                        } else {
                            size2 = 0;
                        }
                        i3 = i8 - 1;
                        if (!((j & ((long) (1 << i3))) == 0 || ((LayoutParams) getChildAt(i3).getLayoutParams()).f13695e)) {
                            bitCount -= 0.5f;
                        }
                    } else {
                        size2 = 0;
                    }
                    i17 = bitCount > 0.0f ? (int) (((float) (i10 * i9)) / bitCount) : 0;
                    Object obj5 = obj;
                    size = i8;
                    for (paddingLeft = 0; paddingLeft < size; paddingLeft++) {
                        if ((j & ((long) (1 << paddingLeft))) != 0) {
                            childAt3 = getChildAt(paddingLeft);
                            layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                            if (childAt3 instanceof ActionMenuItemView) {
                                layoutParams4.f13693c = i17;
                                layoutParams4.f13696f = true;
                                if (paddingLeft == 0 && !layoutParams4.f13695e) {
                                    layoutParams4.leftMargin = (-i17) / 2;
                                }
                            } else if (layoutParams4.f13691a) {
                                layoutParams4.f13693c = i17;
                                layoutParams4.f13696f = true;
                                layoutParams4.rightMargin = (-i17) / 2;
                            } else {
                                if (paddingLeft != 0) {
                                    layoutParams4.leftMargin = i17 / 2;
                                }
                                if (paddingLeft != size - 1) {
                                    layoutParams4.rightMargin = i17 / 2;
                                }
                            }
                            obj5 = 1;
                        }
                    }
                    obj = obj5;
                }
                if (obj != null) {
                    while (size2 < size) {
                        childAt3 = getChildAt(size2);
                        layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                        if (layoutParams4.f13696f) {
                            i3 = i7;
                        } else {
                            i3 = i7;
                            childAt3.measure(MeasureSpec.makeMeasureSpec((layoutParams4.f13692b * i9) + layoutParams4.f13693c, 1073741824), i3);
                        }
                        size2++;
                        i7 = i3;
                    }
                }
                if (mode == 1073741824) {
                    size = i5;
                    mode = i6;
                } else {
                    mode = i4;
                    size = i5;
                }
                setMeasuredDimension(size, mode);
            }
        }
        size = 1;
        obj3 = null;
        if (i10 > 0) {
        }
        size = i8;
        size2 = 0;
        if (obj != null) {
            while (size2 < size) {
                childAt3 = getChildAt(size2);
                layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                if (layoutParams4.f13696f) {
                    i3 = i7;
                    childAt3.measure(MeasureSpec.makeMeasureSpec((layoutParams4.f13692b * i9) + layoutParams4.f13693c, 1073741824), i3);
                } else {
                    i3 = i7;
                }
                size2++;
                i7 = i3;
            }
        }
        if (mode == 1073741824) {
            mode = i4;
            size = i5;
        } else {
            size = i5;
            mode = i6;
        }
        setMeasuredDimension(size, mode);
    }

    /* renamed from: a */
    static int m16285a(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        i3 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        i4 = (view instanceof ActionMenuItemView) != 0 ? (ActionMenuItemView) view : 0;
        boolean z = true;
        i4 = (i4 == 0 || i4.m24424b() == 0) ? 0 : 1;
        int i5 = 2;
        if (i2 <= 0 || (i4 != 0 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), i3);
            i2 = view.getMeasuredWidth();
            int i6 = i2 / i;
            if (i2 % i != 0) {
                i6++;
            }
            if (i4 == 0 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.f13691a != 0 || i4 == 0) {
            z = false;
        }
        layoutParams.f13694d = z;
        layoutParams.f13692b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), i3);
        return i5;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f13706i) {
            int i5;
            int childCount = getChildCount();
            int i6 = (i4 - i2) / 2;
            int dividerWidth = getDividerWidth();
            int i7 = i3 - i;
            int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
            boolean a = bg.m3615a(this);
            int i8 = paddingRight;
            int i9 = 0;
            int i10 = 0;
            for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
                View childAt = getChildAt(paddingRight);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.f13691a) {
                        int paddingLeft;
                        int i11;
                        i9 = childAt.getMeasuredWidth();
                        if (m16291a(paddingRight)) {
                            i9 += dividerWidth;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a) {
                            paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                            i11 = paddingLeft + i9;
                        } else {
                            i11 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                            paddingLeft = i11 - i9;
                        }
                        i5 = i6 - (measuredHeight / 2);
                        childAt.layout(paddingLeft, i5, i11, measuredHeight + i5);
                        i8 -= i9;
                        i9 = 1;
                    } else {
                        i8 -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                        boolean a2 = m16291a(paddingRight);
                        i10++;
                    }
                }
            }
            if (childCount == 1 && i9 == 0) {
                View childAt2 = getChildAt(0);
                dividerWidth = childAt2.getMeasuredWidth();
                paddingRight = childAt2.getMeasuredHeight();
                i7 = (i7 / 2) - (dividerWidth / 2);
                i6 -= paddingRight / 2;
                childAt2.layout(i7, i6, dividerWidth + i7, paddingRight + i6);
                return;
            }
            i10 -= i9 ^ 1;
            if (i10 > 0) {
                i5 = i8 / i10;
                dividerWidth = 0;
            } else {
                dividerWidth = 0;
                i5 = 0;
            }
            i7 = Math.max(dividerWidth, i5);
            View childAt3;
            LayoutParams layoutParams2;
            if (a) {
                paddingRight = getWidth() - getPaddingRight();
                while (dividerWidth < childCount) {
                    childAt3 = getChildAt(dividerWidth);
                    layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() != 8) {
                        if (!layoutParams2.f13691a) {
                            paddingRight -= layoutParams2.rightMargin;
                            i9 = childAt3.getMeasuredWidth();
                            i10 = childAt3.getMeasuredHeight();
                            i8 = i6 - (i10 / 2);
                            childAt3.layout(paddingRight - i9, i8, paddingRight, i10 + i8);
                            paddingRight -= (i9 + layoutParams2.leftMargin) + i7;
                        }
                    }
                    dividerWidth++;
                }
            } else {
                paddingRight = getPaddingLeft();
                while (dividerWidth < childCount) {
                    childAt3 = getChildAt(dividerWidth);
                    layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() != 8) {
                        if (!layoutParams2.f13691a) {
                            paddingRight += layoutParams2.leftMargin;
                            i9 = childAt3.getMeasuredWidth();
                            i10 = childAt3.getMeasuredHeight();
                            i8 = i6 - (i10 / 2);
                            childAt3.layout(paddingRight, i8, paddingRight + i9, i10 + i8);
                            paddingRight += (i9 + layoutParams2.rightMargin) + i7;
                        }
                    }
                    dividerWidth++;
                }
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m16302i();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f13704g.m24508a(drawable);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f13704g.m24522e();
    }

    /* renamed from: a */
    public boolean m16290a() {
        return this.f13703f;
    }

    public void setOverflowReserved(boolean z) {
        this.f13703f = z;
    }

    /* renamed from: b */
    protected LayoutParams m16293b() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.h = 16;
        return layoutParams;
    }

    /* renamed from: a */
    public LayoutParams m16287a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    protected LayoutParams m16288a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m16293b();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.h <= null) {
            layoutParams2.h = 16;
        }
        return layoutParams2;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams == null || (layoutParams instanceof LayoutParams) == null) ? null : true;
    }

    /* renamed from: c */
    public LayoutParams m16296c() {
        LayoutParams b = m16293b();
        b.f13691a = true;
        return b;
    }

    /* renamed from: a */
    public boolean mo583a(C3227j c3227j) {
        return this.f13700c.m16155a((MenuItem) c3227j, 0);
    }

    /* renamed from: a */
    public void mo74a(C3224h c3224h) {
        this.f13700c = c3224h;
    }

    public Menu getMenu() {
        if (this.f13700c == null) {
            Context context = getContext();
            this.f13700c = new C3224h(context);
            this.f13700c.mo3835a(new C3239c(this));
            this.f13704g = new ActionMenuPresenter(context);
            this.f13704g.m24520c(true);
            this.f13704g.mo78a(this.f13705h != null ? this.f13705h : new C3238b());
            this.f13700c.m16150a(this.f13704g, this.f13701d);
            this.f13704g.m24512a(this);
        }
        return this.f13700c;
    }

    public void setMenuCallbacks(C0727a c0727a, C0723a c0723a) {
        this.f13705h = c0727a;
        this.f13698a = c0723a;
    }

    /* renamed from: d */
    public C3224h m16297d() {
        return this.f13700c;
    }

    /* renamed from: e */
    public boolean m16298e() {
        return this.f13704g != null && this.f13704g.m24523f();
    }

    /* renamed from: f */
    public boolean m16299f() {
        return this.f13704g != null && this.f13704g.m24524g();
    }

    /* renamed from: g */
    public boolean m16300g() {
        return this.f13704g != null && this.f13704g.m24527j();
    }

    /* renamed from: h */
    public boolean m16301h() {
        return this.f13704g != null && this.f13704g.m24528k();
    }

    /* renamed from: i */
    public void m16302i() {
        if (this.f13704g != null) {
            this.f13704g.m24525h();
        }
    }

    /* renamed from: a */
    protected boolean m16291a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0742a)) {
            z = 0 | ((C0742a) childAt).mo3820d();
        }
        if (i > 0 && (childAt2 instanceof C0742a) != 0) {
            z |= ((C0742a) childAt2).mo3819c();
        }
        return z;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f13704g.m24521d(z);
    }
}
