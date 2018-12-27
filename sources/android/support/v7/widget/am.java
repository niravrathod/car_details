package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class am extends Drawable {
    /* renamed from: a */
    private float f2789a;
    /* renamed from: b */
    private final Paint f2790b;
    /* renamed from: c */
    private final RectF f2791c;
    /* renamed from: d */
    private final Rect f2792d;
    /* renamed from: e */
    private float f2793e;
    /* renamed from: f */
    private boolean f2794f = false;
    /* renamed from: g */
    private boolean f2795g = true;
    /* renamed from: h */
    private ColorStateList f2796h;
    /* renamed from: i */
    private PorterDuffColorFilter f2797i;
    /* renamed from: j */
    private ColorStateList f2798j;
    /* renamed from: k */
    private Mode f2799k = Mode.SRC_IN;

    public int getOpacity() {
        return -3;
    }

    am(ColorStateList colorStateList, float f) {
        this.f2789a = f;
        this.f2790b = new Paint(5);
        m3493b(colorStateList);
        this.f2791c = new RectF();
        this.f2792d = new Rect();
    }

    /* renamed from: b */
    private void m3493b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(null);
        }
        this.f2796h = colorStateList;
        this.f2790b.setColor(this.f2796h.getColorForState(getState(), this.f2796h.getDefaultColor()));
    }

    /* renamed from: a */
    void m3496a(float f, boolean z, boolean z2) {
        if (f != this.f2793e || this.f2794f != z || this.f2795g != z2) {
            this.f2793e = f;
            this.f2794f = z;
            this.f2795g = z2;
            m3492a((Rect) 0.0f);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    float m3494a() {
        return this.f2793e;
    }

    public void draw(Canvas canvas) {
        Object obj;
        Paint paint = this.f2790b;
        if (this.f2797i == null || paint.getColorFilter() != null) {
            obj = null;
        } else {
            paint.setColorFilter(this.f2797i);
            obj = 1;
        }
        canvas.drawRoundRect(this.f2791c, this.f2789a, this.f2789a, paint);
        if (obj != null) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: a */
    private void m3492a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2791c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f2792d.set(rect);
        if (this.f2794f != null) {
            rect = an.m3501a(this.f2793e, this.f2789a, this.f2795g);
            this.f2792d.inset((int) Math.ceil((double) an.m3504b(this.f2793e, this.f2789a, this.f2795g)), (int) Math.ceil((double) rect));
            this.f2791c.set(this.f2792d);
        }
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3492a(rect);
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2792d, this.f2789a);
    }

    /* renamed from: a */
    void m3495a(float f) {
        if (f != this.f2789a) {
            this.f2789a = f;
            m3492a((Rect) 0.0f);
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        this.f2790b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2790b.setColorFilter(colorFilter);
    }

    /* renamed from: b */
    public float m3498b() {
        return this.f2789a;
    }

    /* renamed from: a */
    public void m3497a(ColorStateList colorStateList) {
        m3493b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: c */
    public ColorStateList m3499c() {
        return this.f2796h;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2798j = colorStateList;
        this.f2797i = m3491a(this.f2798j, this.f2799k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f2799k = mode;
        this.f2797i = m3491a(this.f2798j, this.f2799k);
        invalidateSelf();
    }

    protected boolean onStateChange(int[] iArr) {
        iArr = this.f2796h.getColorForState(iArr, this.f2796h.getDefaultColor());
        boolean z = iArr != this.f2790b.getColor();
        if (z) {
            this.f2790b.setColor(iArr);
        }
        if (this.f2798j == null || this.f2799k == null) {
            return z;
        }
        this.f2797i = m3491a(this.f2798j, this.f2799k);
        return true;
    }

    public boolean isStateful() {
        return (this.f2798j != null && this.f2798j.isStateful()) || ((this.f2796h != null && this.f2796h.isStateful()) || super.isStateful());
    }

    /* renamed from: a */
    private PorterDuffColorFilter m3491a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList != null) {
            if (mode != null) {
                return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
        }
        return null;
    }
}
