package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {
    /* renamed from: a */
    private TypedValue f2408a;
    /* renamed from: b */
    private TypedValue f2409b;
    /* renamed from: c */
    private TypedValue f2410c;
    /* renamed from: d */
    private TypedValue f2411d;
    /* renamed from: e */
    private TypedValue f2412e;
    /* renamed from: f */
    private TypedValue f2413f;
    /* renamed from: g */
    private final Rect f2414g;
    /* renamed from: h */
    private C0754a f2415h;

    /* renamed from: android.support.v7.widget.ContentFrameLayout$a */
    public interface C0754a {
        /* renamed from: a */
        void mo488a();

        /* renamed from: b */
        void mo489b();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2414g = new Rect();
    }

    /* renamed from: a */
    public void m2895a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(C0754a c0754a) {
        this.f2415h = c0754a;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.f2414g.set(i, i2, i3, i4);
        if (C0560r.m2212x(this) != 0) {
            requestLayout();
        }
    }

    protected void onMeasure(int i, int i2) {
        int dimension;
        TypedValue typedValue;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Object obj = 1;
        Object obj2 = displayMetrics.widthPixels < displayMetrics.heightPixels ? 1 : null;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = obj2 != null ? this.f2411d : this.f2410c;
            if (!(typedValue2 == null || typedValue2.type == 0)) {
                dimension = typedValue2.type == 5 ? (int) typedValue2.getDimension(displayMetrics) : typedValue2.type == 6 ? (int) typedValue2.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels) : 0;
                if (dimension > 0) {
                    dimension = MeasureSpec.makeMeasureSpec(Math.min(dimension - (this.f2414g.left + this.f2414g.right), MeasureSpec.getSize(i)), 1073741824);
                    i = 1;
                    if (mode2 == Integer.MIN_VALUE) {
                        typedValue = obj2 == null ? this.f2412e : this.f2413f;
                        if (!(typedValue == null || typedValue.type == 0)) {
                            mode2 = typedValue.type != 5 ? (int) typedValue.getDimension(displayMetrics) : typedValue.type != 6 ? (int) typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels) : 0;
                            if (mode2 > 0) {
                                i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.f2414g.top + this.f2414g.bottom), MeasureSpec.getSize(i2)), 1073741824);
                            }
                        }
                    }
                    super.onMeasure(dimension, i2);
                    mode2 = getMeasuredWidth();
                    dimension = MeasureSpec.makeMeasureSpec(mode2, 1073741824);
                    if (i == 0 && mode == Integer.MIN_VALUE) {
                        i = obj2 == null ? this.f2409b : this.f2408a;
                        if (!(i == 0 || i.type == 0)) {
                            i = i.type != 5 ? (int) i.getDimension(displayMetrics) : i.type != 6 ? (int) i.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels) : 0;
                            if (i > 0) {
                                i -= this.f2414g.left + this.f2414g.right;
                            }
                            if (mode2 < i) {
                                dimension = MeasureSpec.makeMeasureSpec(i, 1073741824);
                                if (obj == null) {
                                    super.onMeasure(dimension, i2);
                                }
                            }
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        super.onMeasure(dimension, i2);
                    }
                }
            }
        }
        dimension = i;
        i = 0;
        if (mode2 == Integer.MIN_VALUE) {
            if (obj2 == null) {
            }
            if (typedValue.type != 5) {
                if (typedValue.type != 6) {
                }
            }
            if (mode2 > 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.f2414g.top + this.f2414g.bottom), MeasureSpec.getSize(i2)), 1073741824);
            }
        }
        super.onMeasure(dimension, i2);
        mode2 = getMeasuredWidth();
        dimension = MeasureSpec.makeMeasureSpec(mode2, 1073741824);
        if (obj2 == null) {
        }
        if (i.type != 5) {
            if (i.type != 6) {
            }
        }
        if (i > 0) {
            i -= this.f2414g.left + this.f2414g.right;
        }
        if (mode2 < i) {
            dimension = MeasureSpec.makeMeasureSpec(i, 1073741824);
            if (obj == null) {
                super.onMeasure(dimension, i2);
            }
        }
        obj = null;
        if (obj == null) {
            super.onMeasure(dimension, i2);
        }
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2408a == null) {
            this.f2408a = new TypedValue();
        }
        return this.f2408a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2409b == null) {
            this.f2409b = new TypedValue();
        }
        return this.f2409b;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2410c == null) {
            this.f2410c = new TypedValue();
        }
        return this.f2410c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2411d == null) {
            this.f2411d = new TypedValue();
        }
        return this.f2411d;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2412e == null) {
            this.f2412e = new TypedValue();
        }
        return this.f2412e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2413f == null) {
            this.f2413f = new TypedValue();
        }
        return this.f2413f;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2415h != null) {
            this.f2415h.mo488a();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2415h != null) {
            this.f2415h.mo489b();
        }
    }
}
