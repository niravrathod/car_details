package android.support.v7.p024d.p025a;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0635i;
import android.support.v7.p020a.C0637a.C0636j;

/* renamed from: android.support.v7.d.a.b */
public class C0683b extends Drawable {
    /* renamed from: b */
    private static final float f2189b = ((float) Math.toRadians(45.0d));
    /* renamed from: a */
    private final Paint f2190a = new Paint();
    /* renamed from: c */
    private float f2191c;
    /* renamed from: d */
    private float f2192d;
    /* renamed from: e */
    private float f2193e;
    /* renamed from: f */
    private float f2194f;
    /* renamed from: g */
    private boolean f2195g;
    /* renamed from: h */
    private final Path f2196h = new Path();
    /* renamed from: i */
    private final int f2197i;
    /* renamed from: j */
    private boolean f2198j = false;
    /* renamed from: k */
    private float f2199k;
    /* renamed from: l */
    private float f2200l;
    /* renamed from: m */
    private int f2201m = 2;

    /* renamed from: a */
    private static float m2712a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public int getOpacity() {
        return -3;
    }

    public C0683b(Context context) {
        this.f2190a.setStyle(Style.STROKE);
        this.f2190a.setStrokeJoin(Join.MITER);
        this.f2190a.setStrokeCap(Cap.BUTT);
        this.f2190a.setAntiAlias(true);
        context = context.getTheme().obtainStyledAttributes(null, C0636j.DrawerArrowToggle, C0627a.drawerArrowStyle, C0635i.Base_Widget_AppCompat_DrawerArrowToggle);
        m2714a(context.getColor(C0636j.DrawerArrowToggle_color, 0));
        m2713a(context.getDimension(C0636j.DrawerArrowToggle_thickness, 0.0f));
        m2715a(context.getBoolean(C0636j.DrawerArrowToggle_spinBars, true));
        m2716b((float) Math.round(context.getDimension(C0636j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f2197i = context.getDimensionPixelSize(C0636j.DrawerArrowToggle_drawableSize, 0);
        this.f2192d = (float) Math.round(context.getDimension(C0636j.DrawerArrowToggle_barLength, 0.0f));
        this.f2191c = (float) Math.round(context.getDimension(C0636j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f2193e = context.getDimension(C0636j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        context.recycle();
    }

    /* renamed from: a */
    public void m2714a(int i) {
        if (i != this.f2190a.getColor()) {
            this.f2190a.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void m2713a(float f) {
        if (this.f2190a.getStrokeWidth() != f) {
            this.f2190a.setStrokeWidth(f);
            double d = (double) (f / 2.0f);
            double cos = Math.cos((double) f2189b);
            Double.isNaN(d);
            this.f2200l = (float) (d * cos);
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void m2716b(float f) {
        if (f != this.f2194f) {
            this.f2194f = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void m2715a(boolean z) {
        if (this.f2195g != z) {
            this.f2195g = z;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void m2717b(boolean z) {
        if (this.f2198j != z) {
            this.f2198j = z;
            invalidateSelf();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r20) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r19.getBounds();
        r3 = r0.f2201m;
        r4 = 3;
        r5 = 0;
        r6 = 1;
        if (r3 == r4) goto L_0x001a;
    L_0x000f:
        switch(r3) {
            case 0: goto L_0x0021;
            case 1: goto L_0x0018;
            default: goto L_0x0012;
        };
    L_0x0012:
        r3 = android.support.v4.p009a.p010a.C0295a.m1063i(r19);
        if (r3 != r6) goto L_0x0021;
    L_0x0018:
        r5 = 1;
        goto L_0x0021;
    L_0x001a:
        r3 = android.support.v4.p009a.p010a.C0295a.m1063i(r19);
        if (r3 != 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0018;
    L_0x0021:
        r3 = r0.f2191c;
        r4 = r0.f2191c;
        r3 = r3 * r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 * r4;
        r7 = (double) r3;
        r7 = java.lang.Math.sqrt(r7);
        r3 = (float) r7;
        r7 = r0.f2192d;
        r8 = r0.f2199k;
        r3 = android.support.v7.p024d.p025a.C0683b.m2712a(r7, r3, r8);
        r7 = r0.f2192d;
        r8 = r0.f2193e;
        r9 = r0.f2199k;
        r7 = android.support.v7.p024d.p025a.C0683b.m2712a(r7, r8, r9);
        r8 = r0.f2200l;
        r9 = r0.f2199k;
        r10 = 0;
        r8 = android.support.v7.p024d.p025a.C0683b.m2712a(r10, r8, r9);
        r8 = java.lang.Math.round(r8);
        r8 = (float) r8;
        r9 = f2189b;
        r11 = r0.f2199k;
        r9 = android.support.v7.p024d.p025a.C0683b.m2712a(r10, r9, r11);
        if (r5 == 0) goto L_0x005d;
    L_0x005b:
        r11 = 0;
        goto L_0x005f;
    L_0x005d:
        r11 = -1020002304; // 0xffffffffc3340000 float:-180.0 double:NaN;
    L_0x005f:
        r12 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        if (r5 == 0) goto L_0x0066;
    L_0x0063:
        r13 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        goto L_0x0067;
    L_0x0066:
        r13 = 0;
    L_0x0067:
        r14 = r0.f2199k;
        r11 = android.support.v7.p024d.p025a.C0683b.m2712a(r11, r13, r14);
        r13 = (double) r3;
        r15 = r11;
        r10 = (double) r9;
        r16 = java.lang.Math.cos(r10);
        java.lang.Double.isNaN(r13);
        r16 = r16 * r13;
        r18 = r5;
        r4 = java.lang.Math.round(r16);
        r3 = (float) r4;
        r4 = java.lang.Math.sin(r10);
        java.lang.Double.isNaN(r13);
        r13 = r13 * r4;
        r4 = java.lang.Math.round(r13);
        r4 = (float) r4;
        r5 = r0.f2196h;
        r5.rewind();
        r5 = r0.f2194f;
        r9 = r0.f2190a;
        r9 = r9.getStrokeWidth();
        r5 = r5 + r9;
        r9 = r0.f2200l;
        r9 = -r9;
        r10 = r0.f2199k;
        r5 = android.support.v7.p024d.p025a.C0683b.m2712a(r5, r9, r10);
        r9 = -r7;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = r9 / r10;
        r11 = r0.f2196h;
        r13 = r9 + r8;
        r14 = 0;
        r11.moveTo(r13, r14);
        r11 = r0.f2196h;
        r8 = r8 * r10;
        r7 = r7 - r8;
        r11.rLineTo(r7, r14);
        r7 = r0.f2196h;
        r7.moveTo(r9, r5);
        r7 = r0.f2196h;
        r7.rLineTo(r3, r4);
        r7 = r0.f2196h;
        r5 = -r5;
        r7.moveTo(r9, r5);
        r5 = r0.f2196h;
        r4 = -r4;
        r5.rLineTo(r3, r4);
        r3 = r0.f2196h;
        r3.close();
        r20.save();
        r3 = r0.f2190a;
        r3 = r3.getStrokeWidth();
        r4 = r2.height();
        r4 = (float) r4;
        r5 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r5 = r5 * r3;
        r4 = r4 - r5;
        r5 = r0.f2194f;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r5 * r7;
        r4 = r4 - r5;
        r4 = (int) r4;
        r4 = r4 / 4;
        r4 = r4 * 2;
        r4 = (float) r4;
        r5 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r3 = r3 * r5;
        r5 = r0.f2194f;
        r3 = r3 + r5;
        r4 = r4 + r3;
        r2 = r2.centerX();
        r2 = (float) r2;
        r1.translate(r2, r4);
        r2 = r0.f2195g;
        if (r2 == 0) goto L_0x0116;
    L_0x0108:
        r2 = r0.f2198j;
        r2 = r2 ^ r18;
        if (r2 == 0) goto L_0x010f;
    L_0x010e:
        r6 = -1;
    L_0x010f:
        r2 = (float) r6;
        r11 = r15 * r2;
        r1.rotate(r11);
        goto L_0x011b;
    L_0x0116:
        if (r18 == 0) goto L_0x011b;
    L_0x0118:
        r1.rotate(r12);
    L_0x011b:
        r2 = r0.f2196h;
        r3 = r0.f2190a;
        r1.drawPath(r2, r3);
        r20.restore();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.d.a.b.draw(android.graphics.Canvas):void");
    }

    public void setAlpha(int i) {
        if (i != this.f2190a.getAlpha()) {
            this.f2190a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2190a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.f2197i;
    }

    public int getIntrinsicWidth() {
        return this.f2197i;
    }

    /* renamed from: c */
    public void m2718c(float f) {
        if (this.f2199k != f) {
            this.f2199k = f;
            invalidateSelf();
        }
    }
}
