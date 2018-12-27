package com.airbnb.lottie.p031a.p032a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.support.v4.p017f.C0420f;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.content.C0986c;
import com.airbnb.lottie.model.content.C3321e;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;

/* renamed from: com.airbnb.lottie.a.a.h */
public class C4770h extends C4474a {
    /* renamed from: b */
    private final String f20855b;
    /* renamed from: c */
    private final C0420f<LinearGradient> f20856c = new C0420f();
    /* renamed from: d */
    private final C0420f<RadialGradient> f20857d = new C0420f();
    /* renamed from: e */
    private final RectF f20858e = new RectF();
    /* renamed from: f */
    private final GradientType f20859f;
    /* renamed from: g */
    private final int f20860g;
    /* renamed from: h */
    private final C0922a<C0986c, C0986c> f20861h;
    /* renamed from: i */
    private final C0922a<PointF, PointF> f20862i;
    /* renamed from: j */
    private final C0922a<PointF, PointF> f20863j;

    public C4770h(C0966f c0966f, C4500a c4500a, C3321e c3321e) {
        super(c0966f, c4500a, c3321e.m17086h().m4248a(), c3321e.m17087i().m4249a(), c3321e.m17090l(), c3321e.m17082d(), c3321e.m17085g(), c3321e.m17088j(), c3321e.m17089k());
        this.f20855b = c3321e.m17079a();
        this.f20859f = c3321e.m17080b();
        this.f20860g = (int) (c0966f.m4202r().m4116c() / 32.0f);
        this.f20861h = c3321e.m17081c().mo877a();
        this.f20861h.m3989a((C0921a) this);
        c4500a.m24890a(this.f20861h);
        this.f20862i = c3321e.m17083e().mo877a();
        this.f20862i.m3989a((C0921a) this);
        c4500a.m24890a(this.f20862i);
        this.f20863j = c3321e.m17084f().mo877a();
        this.f20863j.m3989a((C0921a) this);
        c4500a.m24890a(this.f20863j);
    }

    /* renamed from: a */
    public void mo3883a(Canvas canvas, Matrix matrix, int i) {
        mo3884a(this.f20858e, matrix);
        if (this.f20859f == GradientType.Linear) {
            this.a.setShader(m27685c());
        } else {
            this.a.setShader(m27686d());
        }
        super.mo3883a(canvas, matrix, i);
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f20855b;
    }

    /* renamed from: c */
    private LinearGradient m27685c() {
        long e = (long) m27687e();
        LinearGradient linearGradient = (LinearGradient) this.f20856c.m1539a(e);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f20862i.mo871e();
        PointF pointF2 = (PointF) this.f20863j.mo871e();
        C0986c c0986c = (C0986c) this.f20861h.mo871e();
        LinearGradient linearGradient2 = new LinearGradient((float) ((int) ((this.f20858e.left + (this.f20858e.width() / 2.0f)) + pointF.x)), (float) ((int) ((this.f20858e.top + (this.f20858e.height() / 2.0f)) + pointF.y)), (float) ((int) ((this.f20858e.left + (this.f20858e.width() / 2.0f)) + pointF2.x)), (float) ((int) ((this.f20858e.top + (this.f20858e.height() / 2.0f)) + pointF2.y)), c0986c.m4254b(), c0986c.m4253a(), TileMode.CLAMP);
        this.f20856c.m1545b(e, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: d */
    private RadialGradient m27686d() {
        long e = (long) m27687e();
        RadialGradient radialGradient = (RadialGradient) this.f20857d.m1539a(e);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f20862i.mo871e();
        PointF pointF2 = (PointF) this.f20863j.mo871e();
        C0986c c0986c = (C0986c) this.f20861h.mo871e();
        int[] b = c0986c.m4254b();
        float[] a = c0986c.m4253a();
        int width = (int) ((this.f20858e.left + (this.f20858e.width() / 2.0f)) + pointF.x);
        int height = (int) ((this.f20858e.top + (this.f20858e.height() / 2.0f)) + pointF.y);
        float f = (float) width;
        float f2 = (float) height;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot((double) (((int) ((this.f20858e.left + (this.f20858e.width() / 2.0f)) + pointF2.x)) - width), (double) (((int) ((this.f20858e.top + (this.f20858e.height() / 2.0f)) + pointF2.y)) - height)), b, a, TileMode.CLAMP);
        this.f20857d.m1545b(e, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: e */
    private int m27687e() {
        int round = Math.round(this.f20862i.m3995f() * ((float) this.f20860g));
        int round2 = Math.round(this.f20863j.m3995f() * ((float) this.f20860g));
        int round3 = Math.round(this.f20861h.m3995f() * ((float) this.f20860g));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = (i * 31) * round2;
        }
        return round3 != 0 ? (i * 31) * round3 : i;
    }
}
