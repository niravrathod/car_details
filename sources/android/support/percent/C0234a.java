package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.percent.C0236b.C0235a;
import android.support.v4.view.C0546e;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

@Deprecated
/* renamed from: android.support.percent.a */
public class C0234a {
    /* renamed from: a */
    private final ViewGroup f869a;

    @Deprecated
    /* renamed from: android.support.percent.a$a */
    public static class C0231a {
        /* renamed from: a */
        public float f857a = -1.0f;
        /* renamed from: b */
        public float f858b = -1.0f;
        /* renamed from: c */
        public float f859c = -1.0f;
        /* renamed from: d */
        public float f860d = -1.0f;
        /* renamed from: e */
        public float f861e = -1.0f;
        /* renamed from: f */
        public float f862f = -1.0f;
        /* renamed from: g */
        public float f863g = -1.0f;
        /* renamed from: h */
        public float f864h = -1.0f;
        /* renamed from: i */
        public float f865i;
        /* renamed from: j */
        final C0233c f866j = new C0233c(0, 0);

        /* renamed from: a */
        public void m859a(LayoutParams layoutParams, int i, int i2) {
            this.f866j.width = layoutParams.width;
            this.f866j.height = layoutParams.height;
            Object obj = null;
            Object obj2 = ((this.f866j.f868b || this.f866j.width == 0) && this.f857a < 0.0f) ? 1 : null;
            if ((this.f866j.f867a || this.f866j.height == 0) && this.f858b < 0.0f) {
                obj = 1;
            }
            if (this.f857a >= 0.0f) {
                layoutParams.width = Math.round(((float) i) * this.f857a);
            }
            if (this.f858b >= 0) {
                layoutParams.height = Math.round(((float) i2) * this.f858b);
            }
            if (this.f865i >= 0) {
                if (obj2 != null) {
                    layoutParams.width = Math.round(((float) layoutParams.height) * this.f865i);
                    this.f866j.f868b = true;
                }
                if (obj != null) {
                    layoutParams.height = Math.round(((float) layoutParams.width) / this.f865i);
                    this.f866j.f867a = true;
                }
            }
        }

        /* renamed from: a */
        public void m857a(View view, MarginLayoutParams marginLayoutParams, int i, int i2) {
            m859a(marginLayoutParams, i, i2);
            this.f866j.leftMargin = marginLayoutParams.leftMargin;
            this.f866j.topMargin = marginLayoutParams.topMargin;
            this.f866j.rightMargin = marginLayoutParams.rightMargin;
            this.f866j.bottomMargin = marginLayoutParams.bottomMargin;
            C0546e.m2043a(this.f866j, C0546e.m2042a(marginLayoutParams));
            C0546e.m2045b(this.f866j, C0546e.m2044b(marginLayoutParams));
            if (this.f859c >= 0.0f) {
                marginLayoutParams.leftMargin = Math.round(((float) i) * this.f859c);
            }
            if (this.f860d >= 0.0f) {
                marginLayoutParams.topMargin = Math.round(((float) i2) * this.f860d);
            }
            if (this.f861e >= 0.0f) {
                marginLayoutParams.rightMargin = Math.round(((float) i) * this.f861e);
            }
            if (this.f862f >= 0.0f) {
                marginLayoutParams.bottomMargin = Math.round(((float) i2) * this.f862f);
            }
            i2 = 0;
            if (this.f863g >= 0.0f) {
                C0546e.m2043a(marginLayoutParams, Math.round(((float) i) * this.f863g));
                i2 = 1;
            }
            if (this.f864h >= 0.0f) {
                C0546e.m2045b(marginLayoutParams, Math.round(((float) i) * this.f864h));
                i2 = 1;
            }
            if (i2 != 0 && view != null) {
                C0546e.m2046c(marginLayoutParams, C0560r.m2193e(view));
            }
        }

        public String toString() {
            return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", new Object[]{Float.valueOf(this.f857a), Float.valueOf(this.f858b), Float.valueOf(this.f859c), Float.valueOf(this.f860d), Float.valueOf(this.f861e), Float.valueOf(this.f862f), Float.valueOf(this.f863g), Float.valueOf(this.f864h)});
        }

        /* renamed from: a */
        public void m860a(MarginLayoutParams marginLayoutParams) {
            m858a((LayoutParams) marginLayoutParams);
            marginLayoutParams.leftMargin = this.f866j.leftMargin;
            marginLayoutParams.topMargin = this.f866j.topMargin;
            marginLayoutParams.rightMargin = this.f866j.rightMargin;
            marginLayoutParams.bottomMargin = this.f866j.bottomMargin;
            C0546e.m2043a(marginLayoutParams, C0546e.m2042a(this.f866j));
            C0546e.m2045b(marginLayoutParams, C0546e.m2044b(this.f866j));
        }

        /* renamed from: a */
        public void m858a(LayoutParams layoutParams) {
            if (!this.f866j.f868b) {
                layoutParams.width = this.f866j.width;
            }
            if (!this.f866j.f867a) {
                layoutParams.height = this.f866j.height;
            }
            this.f866j.f868b = false;
            this.f866j.f867a = false;
        }
    }

    @Deprecated
    /* renamed from: android.support.percent.a$b */
    public interface C0232b {
        /* renamed from: a */
        C0231a mo171a();
    }

    /* renamed from: android.support.percent.a$c */
    static class C0233c extends MarginLayoutParams {
        /* renamed from: a */
        private boolean f867a;
        /* renamed from: b */
        private boolean f868b;

        public C0233c(int i, int i2) {
            super(i, i2);
        }
    }

    public C0234a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f869a = viewGroup;
            return;
        }
        throw new IllegalArgumentException("host must be non-null");
    }

    /* renamed from: a */
    public static void m867a(LayoutParams layoutParams, TypedArray typedArray, int i, int i2) {
        layoutParams.width = typedArray.getLayoutDimension(i, 0);
        layoutParams.height = typedArray.getLayoutDimension(i2, 0);
    }

    /* renamed from: a */
    public void m871a(int i, int i2) {
        i = (MeasureSpec.getSize(i) - this.f869a.getPaddingLeft()) - this.f869a.getPaddingRight();
        i2 = (MeasureSpec.getSize(i2) - this.f869a.getPaddingTop()) - this.f869a.getPaddingBottom();
        int childCount = this.f869a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f869a.getChildAt(i3);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof C0232b) {
                C0231a a = ((C0232b) layoutParams).mo171a();
                if (a != null) {
                    if (layoutParams instanceof MarginLayoutParams) {
                        a.m857a(childAt, (MarginLayoutParams) layoutParams, i, i2);
                    } else {
                        a.m859a(layoutParams, i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C0231a m866a(Context context, AttributeSet attributeSet) {
        C0231a c0231a;
        context = context.obtainStyledAttributes(attributeSet, C0235a.PercentLayout_Layout);
        attributeSet = context.getFraction(C0235a.PercentLayout_Layout_layout_widthPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            c0231a = new C0231a();
            c0231a.f857a = attributeSet;
        } else {
            c0231a = null;
        }
        attributeSet = context.getFraction(C0235a.PercentLayout_Layout_layout_heightPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0231a == null) {
                c0231a = new C0231a();
            }
            c0231a.f858b = attributeSet;
        }
        attributeSet = context.getFraction(C0235a.PercentLayout_Layout_layout_marginPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0231a == null) {
                c0231a = new C0231a();
            }
            c0231a.f859c = attributeSet;
            c0231a.f860d = attributeSet;
            c0231a.f861e = attributeSet;
            c0231a.f862f = attributeSet;
        }
        attributeSet = context.getFraction(C0235a.PercentLayout_Layout_layout_marginLeftPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0231a == null) {
                c0231a = new C0231a();
            }
            c0231a.f859c = attributeSet;
        }
        attributeSet = context.getFraction(C0235a.PercentLayout_Layout_layout_marginTopPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0231a == null) {
                c0231a = new C0231a();
            }
            c0231a.f860d = attributeSet;
        }
        attributeSet = context.getFraction(C0235a.PercentLayout_Layout_layout_marginRightPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0231a == null) {
                c0231a = new C0231a();
            }
            c0231a.f861e = attributeSet;
        }
        attributeSet = context.getFraction(C0235a.PercentLayout_Layout_layout_marginBottomPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0231a == null) {
                c0231a = new C0231a();
            }
            c0231a.f862f = attributeSet;
        }
        attributeSet = context.getFraction(C0235a.PercentLayout_Layout_layout_marginStartPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0231a == null) {
                c0231a = new C0231a();
            }
            c0231a.f863g = attributeSet;
        }
        attributeSet = context.getFraction(C0235a.PercentLayout_Layout_layout_marginEndPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0231a == null) {
                c0231a = new C0231a();
            }
            c0231a.f864h = attributeSet;
        }
        attributeSet = context.getFraction(C0235a.PercentLayout_Layout_layout_aspectRatio, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0231a == null) {
                c0231a = new C0231a();
            }
            c0231a.f865i = attributeSet;
        }
        context.recycle();
        return c0231a;
    }

    /* renamed from: a */
    public void m870a() {
        int childCount = this.f869a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = this.f869a.getChildAt(i).getLayoutParams();
            if (layoutParams instanceof C0232b) {
                C0231a a = ((C0232b) layoutParams).mo171a();
                if (a != null) {
                    if (layoutParams instanceof MarginLayoutParams) {
                        a.m860a((MarginLayoutParams) layoutParams);
                    } else {
                        a.m858a(layoutParams);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m872b() {
        int childCount = this.f869a.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f869a.getChildAt(i);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof C0232b) {
                C0231a a = ((C0232b) layoutParams).mo171a();
                if (a != null) {
                    if (C0234a.m868a(childAt, a)) {
                        layoutParams.width = -2;
                        z = true;
                    }
                    if (C0234a.m869b(childAt, a)) {
                        layoutParams.height = -2;
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m868a(View view, C0231a c0231a) {
        return ((view.getMeasuredWidthAndState() & -16777216) == 16777216 && c0231a.f857a >= 0.0f && c0231a.f866j.width == -2) ? true : null;
    }

    /* renamed from: b */
    private static boolean m869b(View view, C0231a c0231a) {
        return ((view.getMeasuredHeightAndState() & -16777216) == 16777216 && c0231a.f858b >= 0.0f && c0231a.f866j.height == -2) ? true : null;
    }
}
