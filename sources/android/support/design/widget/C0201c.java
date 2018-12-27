package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.p009a.C0299a;

/* renamed from: android.support.design.widget.c */
class C0201c extends Drawable {
    /* renamed from: a */
    final Paint f728a = new Paint(1);
    /* renamed from: b */
    final Rect f729b = new Rect();
    /* renamed from: c */
    final RectF f730c = new RectF();
    /* renamed from: d */
    float f731d;
    /* renamed from: e */
    private int f732e;
    /* renamed from: f */
    private int f733f;
    /* renamed from: g */
    private int f734g;
    /* renamed from: h */
    private int f735h;
    /* renamed from: i */
    private ColorStateList f736i;
    /* renamed from: j */
    private int f737j;
    /* renamed from: k */
    private boolean f738k = true;
    /* renamed from: l */
    private float f739l;

    public C0201c() {
        this.f728a.setStyle(Style.STROKE);
    }

    /* renamed from: a */
    void m695a(int i, int i2, int i3, int i4) {
        this.f732e = i;
        this.f733f = i2;
        this.f734g = i3;
        this.f735h = i4;
    }

    /* renamed from: a */
    void m694a(float f) {
        if (this.f731d != f) {
            this.f731d = f;
            this.f728a.setStrokeWidth(f * 1.3333f);
            this.f738k = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f738k) {
            this.f728a.setShader(m693a());
            this.f738k = false;
        }
        float strokeWidth = this.f728a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f730c;
        copyBounds(this.f729b);
        rectF.set(this.f729b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f739l, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f728a);
        canvas.restore();
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f731d);
        rect.set(round, round, round, round);
        return true;
    }

    public void setAlpha(int i) {
        this.f728a.setAlpha(i);
        invalidateSelf();
    }

    /* renamed from: a */
    void m696a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f737j = colorStateList.getColorForState(getState(), this.f737j);
        }
        this.f736i = colorStateList;
        this.f738k = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f728a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.f731d > 0.0f ? -3 : -2;
    }

    /* renamed from: b */
    final void m697b(float f) {
        if (f != this.f739l) {
            this.f739l = f;
            invalidateSelf();
        }
    }

    protected void onBoundsChange(Rect rect) {
        this.f738k = true;
    }

    public boolean isStateful() {
        return (this.f736i != null && this.f736i.isStateful()) || super.isStateful();
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.f736i != null) {
            iArr = this.f736i.getColorForState(iArr, this.f737j);
            if (iArr != this.f737j) {
                this.f738k = true;
                this.f737j = iArr;
            }
        }
        if (this.f738k != null) {
            invalidateSelf();
        }
        return this.f738k;
    }

    /* renamed from: a */
    private Shader m693a() {
        Rect rect = this.f729b;
        copyBounds(rect);
        float height = this.f731d / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0299a.m1067a(this.f732e, this.f737j), C0299a.m1067a(this.f733f, this.f737j), C0299a.m1067a(C0299a.m1070b(this.f733f, 0), this.f737j), C0299a.m1067a(C0299a.m1070b(this.f735h, 0), this.f737j), C0299a.m1067a(this.f735h, this.f737j), C0299a.m1067a(this.f734g, this.f737j)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
    }
}
