package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.p021b.C0677a.C0672a;
import android.support.v7.p021b.C0677a.C0673b;
import android.support.v7.p021b.C0677a.C0675d;
import android.support.v7.p021b.C0677a.C0676e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class CardView extends FrameLayout {
    /* renamed from: e */
    private static final int[] f2399e = new int[]{16842801};
    /* renamed from: f */
    private static final C0869t f2400f;
    /* renamed from: a */
    int f2401a;
    /* renamed from: b */
    int f2402b;
    /* renamed from: c */
    final Rect f2403c;
    /* renamed from: d */
    final Rect f2404d;
    /* renamed from: g */
    private boolean f2405g;
    /* renamed from: h */
    private boolean f2406h;
    /* renamed from: i */
    private final C0868s f2407i;

    /* renamed from: android.support.v7.widget.CardView$1 */
    class C32421 implements C0868s {
        /* renamed from: a */
        final /* synthetic */ CardView f13741a;
        /* renamed from: b */
        private Drawable f13742b;

        C32421(CardView cardView) {
            this.f13741a = cardView;
        }

        /* renamed from: a */
        public void mo658a(Drawable drawable) {
            this.f13742b = drawable;
            this.f13741a.setBackgroundDrawable(drawable);
        }

        /* renamed from: a */
        public boolean mo659a() {
            return this.f13741a.getUseCompatPadding();
        }

        /* renamed from: b */
        public boolean mo660b() {
            return this.f13741a.getPreventCornerOverlap();
        }

        /* renamed from: a */
        public void mo657a(int i, int i2, int i3, int i4) {
            this.f13741a.f2404d.set(i, i2, i3, i4);
            super.setPadding(i + this.f13741a.f2403c.left, i2 + this.f13741a.f2403c.top, i3 + this.f13741a.f2403c.right, i4 + this.f13741a.f2403c.bottom);
        }

        /* renamed from: a */
        public void mo656a(int i, int i2) {
            if (i > this.f13741a.f2401a) {
                super.setMinimumWidth(i);
            }
            if (i2 > this.f13741a.f2402b) {
                super.setMinimumHeight(i2);
            }
        }

        /* renamed from: c */
        public Drawable mo661c() {
            return this.f13742b;
        }

        /* renamed from: d */
        public View mo662d() {
            return this.f13741a;
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f2400f = new C3269q();
        } else if (VERSION.SDK_INT >= 17) {
            f2400f = new C4471p();
        } else {
            f2400f = new C3271r();
        }
        f2400f.mo834a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0672a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int color;
        super(context, attributeSet, i);
        this.f2403c = new Rect();
        this.f2404d = new Rect();
        this.f2407i = new C32421(this);
        attributeSet = context.obtainStyledAttributes(attributeSet, C0676e.CardView, i, C0675d.CardView);
        if (attributeSet.hasValue(C0676e.CardView_cardBackgroundColor) != 0) {
            i = attributeSet.getColorStateList(C0676e.CardView_cardBackgroundColor);
        } else {
            i = getContext().obtainStyledAttributes(f2399e);
            color = i.getColor(0, 0);
            i.recycle();
            i = new float[3];
            Color.colorToHSV(color, i);
            if (i[2] > 1056964608) {
                i = getResources().getColor(C0673b.cardview_light_background);
            } else {
                i = getResources().getColor(C0673b.cardview_dark_background);
            }
            i = ColorStateList.valueOf(i);
        }
        ColorStateList colorStateList = i;
        float dimension = attributeSet.getDimension(C0676e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = attributeSet.getDimension(C0676e.CardView_cardElevation, 0.0f);
        i = attributeSet.getDimension(C0676e.CardView_cardMaxElevation, 0.0f);
        this.f2405g = attributeSet.getBoolean(C0676e.CardView_cardUseCompatPadding, false);
        this.f2406h = attributeSet.getBoolean(C0676e.CardView_cardPreventCornerOverlap, true);
        color = attributeSet.getDimensionPixelSize(C0676e.CardView_contentPadding, 0);
        this.f2403c.left = attributeSet.getDimensionPixelSize(C0676e.CardView_contentPaddingLeft, color);
        this.f2403c.top = attributeSet.getDimensionPixelSize(C0676e.CardView_contentPaddingTop, color);
        this.f2403c.right = attributeSet.getDimensionPixelSize(C0676e.CardView_contentPaddingRight, color);
        this.f2403c.bottom = attributeSet.getDimensionPixelSize(C0676e.CardView_contentPaddingBottom, color);
        float f = dimension2 > i ? dimension2 : i;
        this.f2401a = attributeSet.getDimensionPixelSize(C0676e.CardView_android_minWidth, 0);
        this.f2402b = attributeSet.getDimensionPixelSize(C0676e.CardView_android_minHeight, 0);
        attributeSet.recycle();
        f2400f.mo836a(this.f2407i, context, colorStateList, dimension, dimension2, f);
    }

    public boolean getUseCompatPadding() {
        return this.f2405g;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2405g != z) {
            this.f2405g = z;
            f2400f.mo845g(this.f2407i);
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f2403c.set(i, i2, i3, i4);
        f2400f.mo844f(this.f2407i);
    }

    protected void onMeasure(int i, int i2) {
        if (f2400f instanceof C3269q) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2400f.mo838b(this.f2407i)), MeasureSpec.getSize(i)), mode);
        }
        mode = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2400f.mo840c(this.f2407i)), MeasureSpec.getSize(i2)), mode);
        }
        super.onMeasure(i, i2);
    }

    public void setMinimumWidth(int i) {
        this.f2401a = i;
        super.setMinimumWidth(i);
    }

    public void setMinimumHeight(int i) {
        this.f2402b = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        f2400f.mo837a(this.f2407i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f2400f.mo837a(this.f2407i, colorStateList);
    }

    public ColorStateList getCardBackgroundColor() {
        return f2400f.mo847i(this.f2407i);
    }

    public int getContentPaddingLeft() {
        return this.f2403c.left;
    }

    public int getContentPaddingRight() {
        return this.f2403c.right;
    }

    public int getContentPaddingTop() {
        return this.f2403c.top;
    }

    public int getContentPaddingBottom() {
        return this.f2403c.bottom;
    }

    public void setRadius(float f) {
        f2400f.mo835a(this.f2407i, f);
    }

    public float getRadius() {
        return f2400f.mo842d(this.f2407i);
    }

    public void setCardElevation(float f) {
        f2400f.mo841c(this.f2407i, f);
    }

    public float getCardElevation() {
        return f2400f.mo843e(this.f2407i);
    }

    public void setMaxCardElevation(float f) {
        f2400f.mo839b(this.f2407i, f);
    }

    public float getMaxCardElevation() {
        return f2400f.mo833a(this.f2407i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f2406h;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f2406h) {
            this.f2406h = z;
            f2400f.mo846h(this.f2407i);
        }
    }
}
