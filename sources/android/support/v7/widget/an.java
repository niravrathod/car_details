package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v7.p021b.C0677a.C0673b;
import android.support.v7.p021b.C0677a.C0674c;

class an extends Drawable {
    /* renamed from: a */
    static C0841a f2800a;
    /* renamed from: b */
    private static final double f2801b = Math.cos(Math.toRadians(45.0d));
    /* renamed from: c */
    private final int f2802c;
    /* renamed from: d */
    private Paint f2803d;
    /* renamed from: e */
    private Paint f2804e;
    /* renamed from: f */
    private Paint f2805f;
    /* renamed from: g */
    private final RectF f2806g;
    /* renamed from: h */
    private float f2807h;
    /* renamed from: i */
    private Path f2808i;
    /* renamed from: j */
    private float f2809j;
    /* renamed from: k */
    private float f2810k;
    /* renamed from: l */
    private float f2811l;
    /* renamed from: m */
    private ColorStateList f2812m;
    /* renamed from: n */
    private boolean f2813n = true;
    /* renamed from: o */
    private final int f2814o;
    /* renamed from: p */
    private final int f2815p;
    /* renamed from: q */
    private boolean f2816q = true;
    /* renamed from: r */
    private boolean f2817r = false;

    /* renamed from: android.support.v7.widget.an$a */
    interface C0841a {
        /* renamed from: a */
        void mo832a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public int getOpacity() {
        return -3;
    }

    an(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f2814o = resources.getColor(C0673b.cardview_shadow_start_color);
        this.f2815p = resources.getColor(C0673b.cardview_shadow_end_color);
        this.f2802c = resources.getDimensionPixelSize(C0674c.cardview_compat_inset_shadow);
        this.f2803d = new Paint(5);
        m3505b(colorStateList);
        this.f2804e = new Paint(5);
        this.f2804e.setStyle(Style.FILL);
        this.f2807h = (float) ((int) (f + 0.5f));
        this.f2806g = new RectF();
        this.f2805f = new Paint(this.f2804e);
        this.f2805f.setAntiAlias(false);
        m3502a(f2, f3);
    }

    /* renamed from: b */
    private void m3505b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(null);
        }
        this.f2812m = colorStateList;
        this.f2803d.setColor(this.f2812m.getColorForState(getState(), this.f2812m.getDefaultColor()));
    }

    /* renamed from: d */
    private int m3507d(float f) {
        f = (int) (f + 0.5f);
        return f % 2 == 1 ? f - Float.MIN_VALUE : f;
    }

    /* renamed from: a */
    void m3513a(boolean z) {
        this.f2816q = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f2803d.setAlpha(i);
        this.f2804e.setAlpha(i);
        this.f2805f.setAlpha(i);
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2813n = true;
    }

    /* renamed from: a */
    private void m3502a(float f, float f2) {
        StringBuilder stringBuilder;
        if (f < 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid shadow size ");
            stringBuilder.append(f);
            stringBuilder.append(". Must be >= 0");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (f2 >= 0.0f) {
            f = (float) m3507d(f);
            f2 = (float) m3507d(f2);
            if (f > f2) {
                if (this.f2817r == null) {
                    this.f2817r = true;
                }
                f = f2;
            }
            if (this.f2811l != f || this.f2809j != f2) {
                this.f2811l = f;
                this.f2809j = f2;
                this.f2810k = (float) ((int) (((f * 1.5f) + ((float) this.f2802c)) + 0.5f));
                this.f2813n = true;
                invalidateSelf();
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid max shadow size ");
            stringBuilder.append(f2);
            stringBuilder.append(". Must be >= 0");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m3501a(this.f2809j, this.f2807h, this.f2816q));
        int ceil2 = (int) Math.ceil((double) m3504b(this.f2809j, this.f2807h, this.f2816q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: a */
    static float m3501a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - f2801b;
        f = (double) f2;
        Double.isNaN(f);
        d2 *= f;
        Double.isNaN(d);
        return (float) (d + d2);
    }

    /* renamed from: b */
    static float m3504b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f2801b;
        f = (double) f2;
        Double.isNaN(f);
        d2 *= f;
        Double.isNaN(d);
        return (float) (d + d2);
    }

    protected boolean onStateChange(int[] iArr) {
        iArr = this.f2812m.getColorForState(iArr, this.f2812m.getDefaultColor());
        if (this.f2803d.getColor() == iArr) {
            return null;
        }
        this.f2803d.setColor(iArr);
        this.f2813n = true;
        invalidateSelf();
        return true;
    }

    public boolean isStateful() {
        return (this.f2812m != null && this.f2812m.isStateful()) || super.isStateful();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2803d.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    void m3510a(float f) {
        if (f >= 0.0f) {
            f = (float) ((int) (f + 0.5f));
            if (this.f2807h != f) {
                this.f2807h = f;
                this.f2813n = true;
                invalidateSelf();
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid radius ");
        stringBuilder.append(f);
        stringBuilder.append(". Must be >= 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void draw(Canvas canvas) {
        if (this.f2813n) {
            m3506b(getBounds());
            this.f2813n = false;
        }
        canvas.translate(0.0f, this.f2811l / 2.0f);
        m3503a(canvas);
        canvas.translate(0.0f, (-this.f2811l) / 2.0f);
        f2800a.mo832a(canvas, this.f2806g, this.f2807h, this.f2803d);
    }

    /* renamed from: a */
    private void m3503a(Canvas canvas) {
        float f = (-this.f2807h) - this.f2810k;
        float f2 = (this.f2807h + ((float) this.f2802c)) + (this.f2811l / 2.0f);
        float f3 = f2 * 2.0f;
        Object obj = this.f2806g.width() - f3 > 0.0f ? 1 : null;
        Object obj2 = this.f2806g.height() - f3 > 0.0f ? 1 : null;
        int save = canvas.save();
        canvas.translate(this.f2806g.left + f2, this.f2806g.top + f2);
        canvas.drawPath(this.f2808i, this.f2804e);
        if (obj != null) {
            canvas.drawRect(0.0f, f, this.f2806g.width() - f3, -this.f2807h, this.f2805f);
        }
        canvas.restoreToCount(save);
        save = canvas.save();
        canvas.translate(this.f2806g.right - f2, this.f2806g.bottom - f2);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f2808i, this.f2804e);
        if (obj != null) {
            canvas.drawRect(0.0f, f, this.f2806g.width() - f3, (-this.f2807h) + this.f2810k, this.f2805f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.f2806g.left + f2, this.f2806g.bottom - f2);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f2808i, this.f2804e);
        if (obj2 != null) {
            canvas.drawRect(0.0f, f, this.f2806g.height() - f3, -this.f2807h, this.f2805f);
        }
        canvas.restoreToCount(save2);
        save2 = canvas.save();
        canvas.translate(this.f2806g.right - f2, this.f2806g.top + f2);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f2808i, this.f2804e);
        if (obj2 != null) {
            canvas.drawRect(0.0f, f, this.f2806g.height() - f3, -this.f2807h, this.f2805f);
        }
        canvas.restoreToCount(save2);
    }

    /* renamed from: g */
    private void m3508g() {
        RectF rectF = new RectF(-this.f2807h, -this.f2807h, this.f2807h, this.f2807h);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f2810k, -this.f2810k);
        if (this.f2808i == null) {
            r0.f2808i = new Path();
        } else {
            r0.f2808i.reset();
        }
        r0.f2808i.setFillType(FillType.EVEN_ODD);
        r0.f2808i.moveTo(-r0.f2807h, 0.0f);
        r0.f2808i.rLineTo(-r0.f2810k, 0.0f);
        r0.f2808i.arcTo(rectF2, 180.0f, 90.0f, false);
        r0.f2808i.arcTo(rectF, 270.0f, -90.0f, false);
        r0.f2808i.close();
        float f = r0.f2807h / (r0.f2807h + r0.f2810k);
        r0.f2804e.setShader(new RadialGradient(0.0f, 0.0f, r0.f2807h + r0.f2810k, new int[]{r0.f2814o, r0.f2814o, r0.f2815p}, new float[]{0.0f, f, 1.0f}, TileMode.CLAMP));
        r0.f2805f.setShader(new LinearGradient(0.0f, (-r0.f2807h) + r0.f2810k, 0.0f, (-r0.f2807h) - r0.f2810k, new int[]{r0.f2814o, r0.f2814o, r0.f2815p}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
        r0.f2805f.setAntiAlias(false);
    }

    /* renamed from: b */
    private void m3506b(Rect rect) {
        float f = this.f2809j * 1.5f;
        this.f2806g.set(((float) rect.left) + this.f2809j, ((float) rect.top) + f, ((float) rect.right) - this.f2809j, ((float) rect.bottom) - f);
        m3508g();
    }

    /* renamed from: a */
    float m3509a() {
        return this.f2807h;
    }

    /* renamed from: a */
    void m3512a(Rect rect) {
        getPadding(rect);
    }

    /* renamed from: b */
    void m3515b(float f) {
        m3502a(f, this.f2809j);
    }

    /* renamed from: c */
    void m3517c(float f) {
        m3502a(this.f2811l, f);
    }

    /* renamed from: b */
    float m3514b() {
        return this.f2811l;
    }

    /* renamed from: c */
    float m3516c() {
        return this.f2809j;
    }

    /* renamed from: d */
    float m3518d() {
        return (Math.max(this.f2809j, (this.f2807h + ((float) this.f2802c)) + (this.f2809j / 2.0f)) * 2.0f) + ((this.f2809j + ((float) this.f2802c)) * 2.0f);
    }

    /* renamed from: e */
    float m3519e() {
        return (Math.max(this.f2809j, (this.f2807h + ((float) this.f2802c)) + ((this.f2809j * 1.5f) / 2.0f)) * 2.0f) + (((this.f2809j * 1.5f) + ((float) this.f2802c)) * 2.0f);
    }

    /* renamed from: a */
    void m3511a(ColorStateList colorStateList) {
        m3505b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: f */
    ColorStateList m3520f() {
        return this.f2812m;
    }
}
