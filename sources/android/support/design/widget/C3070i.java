package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.design.C0143a.C0134c;
import android.support.v4.content.C0389b;
import android.support.v7.p024d.p025a.C0682a;

/* renamed from: android.support.design.widget.i */
class C3070i extends C0682a {
    /* renamed from: a */
    static final double f12986a = Math.cos(Math.toRadians(45.0d));
    /* renamed from: b */
    final Paint f12987b;
    /* renamed from: c */
    final Paint f12988c;
    /* renamed from: d */
    final RectF f12989d;
    /* renamed from: e */
    float f12990e;
    /* renamed from: f */
    Path f12991f;
    /* renamed from: g */
    float f12992g;
    /* renamed from: h */
    float f12993h;
    /* renamed from: i */
    float f12994i;
    /* renamed from: j */
    float f12995j;
    /* renamed from: k */
    private boolean f12996k = true;
    /* renamed from: l */
    private final int f12997l;
    /* renamed from: m */
    private final int f12998m;
    /* renamed from: n */
    private final int f12999n;
    /* renamed from: o */
    private boolean f13000o = true;
    /* renamed from: p */
    private float f13001p;
    /* renamed from: q */
    private boolean f13002q = false;

    public int getOpacity() {
        return -3;
    }

    public C3070i(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f12997l = C0389b.m1438c(context, C0134c.design_fab_shadow_start_color);
        this.f12998m = C0389b.m1438c(context, C0134c.design_fab_shadow_mid_color);
        this.f12999n = C0389b.m1438c(context, C0134c.design_fab_shadow_end_color);
        this.f12987b = new Paint(5);
        this.f12987b.setStyle(Style.FILL);
        this.f12990e = (float) Math.round(f);
        this.f12989d = new RectF();
        this.f12988c = new Paint(this.f12987b);
        this.f12988c.setAntiAlias(false);
        m15087a(f2, f3);
    }

    /* renamed from: c */
    private static int m15083c(float f) {
        f = Math.round(f);
        return f % 2 == 1 ? f - 1 : f;
    }

    /* renamed from: a */
    public void m15088a(boolean z) {
        this.f13000o = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f12987b.setAlpha(i);
        this.f12988c.setAlpha(i);
    }

    protected void onBoundsChange(Rect rect) {
        this.f12996k = true;
    }

    /* renamed from: a */
    void m15087a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        f = (float) C3070i.m15083c(f);
        f2 = (float) C3070i.m15083c(f2);
        if (f > f2) {
            if (this.f13002q == null) {
                this.f13002q = true;
            }
            f = f2;
        }
        if (this.f12995j != f || this.f12993h != f2) {
            this.f12995j = f;
            this.f12993h = f2;
            this.f12994i = (float) Math.round(f * 1.5f);
            this.f12992g = f2;
            this.f12996k = true;
            invalidateSelf();
        }
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) C3070i.m15079a(this.f12993h, this.f12990e, this.f13000o));
        int ceil2 = (int) Math.ceil((double) C3070i.m15082b(this.f12993h, this.f12990e, this.f13000o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: a */
    public static float m15079a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - f12986a;
        f = (double) f2;
        Double.isNaN(f);
        d2 *= f;
        Double.isNaN(d);
        return (float) (d + d2);
    }

    /* renamed from: b */
    public static float m15082b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f12986a;
        f = (double) f2;
        Double.isNaN(f);
        d2 *= f;
        Double.isNaN(d);
        return (float) (d + d2);
    }

    public void draw(Canvas canvas) {
        if (this.f12996k) {
            m15081a(getBounds());
            this.f12996k = false;
        }
        m15080a(canvas);
        super.draw(canvas);
    }

    /* renamed from: a */
    final void m15086a(float f) {
        if (this.f13001p != f) {
            this.f13001p = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m15080a(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f13001p, this.f12989d.centerX(), this.f12989d.centerY());
        float f4 = (-this.f12990e) - this.f12994i;
        float f5 = this.f12990e;
        float f6 = f5 * 2.0f;
        Object obj = this.f12989d.width() - f6 > 0.0f ? 1 : null;
        Object obj2 = r0.f12989d.height() - f6 > 0.0f ? 1 : null;
        float f7 = f5 / ((r0.f12995j - (r0.f12995j * 0.5f)) + f5);
        float f8 = f5 / ((r0.f12995j - (r0.f12995j * 0.25f)) + f5);
        float f9 = f5 / ((r0.f12995j - (r0.f12995j * 1.0f)) + f5);
        int save2 = canvas.save();
        canvas2.translate(r0.f12989d.left + f5, r0.f12989d.top + f5);
        canvas2.scale(f7, f8);
        canvas2.drawPath(r0.f12991f, r0.f12987b);
        if (obj != null) {
            canvas2.scale(1.0f / f7, 1.0f);
            i = save2;
            f = f9;
            i2 = save;
            f2 = f8;
            canvas.drawRect(0.0f, f4, r0.f12989d.width() - f6, -r0.f12990e, r0.f12988c);
        } else {
            i = save2;
            f = f9;
            i2 = save;
            f2 = f8;
        }
        canvas2.restoreToCount(i);
        i = canvas.save();
        canvas2.translate(r0.f12989d.right - f5, r0.f12989d.bottom - f5);
        f8 = f;
        canvas2.scale(f7, f8);
        canvas2.rotate(180.0f);
        canvas2.drawPath(r0.f12991f, r0.f12987b);
        if (obj != null) {
            canvas2.scale(1.0f / f7, 1.0f);
            f3 = f2;
            f2 = f8;
            canvas.drawRect(0.0f, f4, r0.f12989d.width() - f6, (-r0.f12990e) + r0.f12994i, r0.f12988c);
        } else {
            f3 = f2;
            f2 = f8;
        }
        canvas2.restoreToCount(i);
        int save3 = canvas.save();
        canvas2.translate(r0.f12989d.left + f5, r0.f12989d.bottom - f5);
        canvas2.scale(f7, f2);
        canvas2.rotate(270.0f);
        canvas2.drawPath(r0.f12991f, r0.f12987b);
        if (obj2 != null) {
            canvas2.scale(1.0f / f2, 1.0f);
            canvas.drawRect(0.0f, f4, r0.f12989d.height() - f6, -r0.f12990e, r0.f12988c);
        }
        canvas2.restoreToCount(save3);
        save = canvas.save();
        canvas2.translate(r0.f12989d.right - f5, r0.f12989d.top + f5);
        f5 = f3;
        canvas2.scale(f7, f5);
        canvas2.rotate(90.0f);
        canvas2.drawPath(r0.f12991f, r0.f12987b);
        if (obj2 != null) {
            canvas2.scale(1.0f / f5, 1.0f);
            canvas.drawRect(0.0f, f4, r0.f12989d.height() - f6, -r0.f12990e, r0.f12988c);
        }
        canvas2.restoreToCount(save);
        canvas2.restoreToCount(i2);
    }

    /* renamed from: c */
    private void m15084c() {
        RectF rectF = new RectF(-this.f12990e, -this.f12990e, this.f12990e, this.f12990e);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f12994i, -this.f12994i);
        if (this.f12991f == null) {
            r0.f12991f = new Path();
        } else {
            r0.f12991f.reset();
        }
        r0.f12991f.setFillType(FillType.EVEN_ODD);
        r0.f12991f.moveTo(-r0.f12990e, 0.0f);
        r0.f12991f.rLineTo(-r0.f12994i, 0.0f);
        r0.f12991f.arcTo(rectF2, 180.0f, 90.0f, false);
        r0.f12991f.arcTo(rectF, 270.0f, -90.0f, false);
        r0.f12991f.close();
        float f = -rectF2.top;
        if (f > 0.0f) {
            float f2 = r0.f12990e / f;
            float f3 = ((1.0f - f2) / 2.0f) + f2;
            Paint paint = r0.f12987b;
            Shader shader = r8;
            Shader radialGradient = new RadialGradient(0.0f, 0.0f, f, new int[]{0, r0.f12997l, r0.f12998m, r0.f12999n}, new float[]{0.0f, f2, f3, 1.0f}, TileMode.CLAMP);
            paint.setShader(shader);
        }
        r0.f12988c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{r0.f12997l, r0.f12998m, r0.f12999n}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
        r0.f12988c.setAntiAlias(false);
    }

    /* renamed from: a */
    private void m15081a(Rect rect) {
        float f = this.f12993h * 1.5f;
        this.f12989d.set(((float) rect.left) + this.f12993h, ((float) rect.top) + f, ((float) rect.right) - this.f12993h, ((float) rect.bottom) - f);
        m2711b().setBounds((int) this.f12989d.left, (int) this.f12989d.top, (int) this.f12989d.right, (int) this.f12989d.bottom);
        m15084c();
    }

    /* renamed from: b */
    public void m15089b(float f) {
        m15087a(f, this.f12993h);
    }

    /* renamed from: a */
    public float m15085a() {
        return this.f12995j;
    }
}
