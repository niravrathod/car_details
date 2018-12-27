package com.airbnb.lottie.p031a.p032a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.support.v4.p017f.C0420f;
import com.airbnb.lottie.C0949c;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.content.C0986c;
import com.airbnb.lottie.model.content.C3320d;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p031a.p033b.C3296p;
import com.airbnb.lottie.p036d.C0953e;
import com.airbnb.lottie.p037e.C0961c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.g */
public class C4478g implements C3288d, C3289j, C0921a {
    /* renamed from: a */
    private final String f18718a;
    /* renamed from: b */
    private final C4500a f18719b;
    /* renamed from: c */
    private final C0420f<LinearGradient> f18720c = new C0420f();
    /* renamed from: d */
    private final C0420f<RadialGradient> f18721d = new C0420f();
    /* renamed from: e */
    private final Matrix f18722e = new Matrix();
    /* renamed from: f */
    private final Path f18723f = new Path();
    /* renamed from: g */
    private final Paint f18724g = new Paint(1);
    /* renamed from: h */
    private final RectF f18725h = new RectF();
    /* renamed from: i */
    private final List<C3290l> f18726i = new ArrayList();
    /* renamed from: j */
    private final GradientType f18727j;
    /* renamed from: k */
    private final C0922a<C0986c, C0986c> f18728k;
    /* renamed from: l */
    private final C0922a<Integer, Integer> f18729l;
    /* renamed from: m */
    private final C0922a<PointF, PointF> f18730m;
    /* renamed from: n */
    private final C0922a<PointF, PointF> f18731n;
    /* renamed from: o */
    private C0922a<ColorFilter, ColorFilter> f18732o;
    /* renamed from: p */
    private final C0966f f18733p;
    /* renamed from: q */
    private final int f18734q;

    public C4478g(C0966f c0966f, C4500a c4500a, C3320d c3320d) {
        this.f18719b = c4500a;
        this.f18718a = c3320d.m17071a();
        this.f18733p = c0966f;
        this.f18727j = c3320d.m17072b();
        this.f18723f.setFillType(c3320d.m17073c());
        this.f18734q = (int) (c0966f.m4202r().m4116c() / 32.0f);
        this.f18728k = c3320d.m17074d().mo877a();
        this.f18728k.m3989a((C0921a) this);
        c4500a.m24890a(this.f18728k);
        this.f18729l = c3320d.m17075e().mo877a();
        this.f18729l.m3989a((C0921a) this);
        c4500a.m24890a(this.f18729l);
        this.f18730m = c3320d.m17076f().mo877a();
        this.f18730m.m3989a((C0921a) this);
        c4500a.m24890a(this.f18730m);
        this.f18731n = c3320d.m17077g().mo877a();
        this.f18731n.m3989a((C0921a) this);
        c4500a.m24890a(this.f18731n);
    }

    /* renamed from: a */
    public void mo866a() {
        this.f18733p.invalidateSelf();
    }

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
        for (list = null; list < list2.size(); list++) {
            C0917b c0917b = (C0917b) list2.get(list);
            if (c0917b instanceof C3290l) {
                this.f18726i.add((C3290l) c0917b);
            }
        }
    }

    /* renamed from: a */
    public void mo3883a(Canvas canvas, Matrix matrix, int i) {
        Shader c;
        C0949c.m4078c("GradientFillContent#draw");
        this.f18723f.reset();
        for (int i2 = 0; i2 < this.f18726i.size(); i2++) {
            this.f18723f.addPath(((C3290l) this.f18726i.get(i2)).mo3887e(), matrix);
        }
        this.f18723f.computeBounds(this.f18725h, false);
        if (this.f18727j == GradientType.Linear) {
            c = m24802c();
        } else {
            c = m24803d();
        }
        this.f18722e.set(matrix);
        c.setLocalMatrix(this.f18722e);
        this.f18724g.setShader(c);
        if (this.f18732o != null) {
            this.f18724g.setColorFilter((ColorFilter) this.f18732o.mo871e());
        }
        this.f18724g.setAlpha(C0953e.m4094a((int) ((((((float) i) / 1132396544) * ((float) ((Integer) this.f18729l.mo871e()).intValue())) / 100.0f) * 1132396544), 0, 255));
        canvas.drawPath(this.f18723f, this.f18724g);
        C0949c.m4079d("GradientFillContent#draw");
    }

    /* renamed from: a */
    public void mo3884a(RectF rectF, Matrix matrix) {
        this.f18723f.reset();
        for (int i = 0; i < this.f18726i.size(); i++) {
            this.f18723f.addPath(((C3290l) this.f18726i.get(i)).mo3887e(), matrix);
        }
        this.f18723f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1065353216, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f18718a;
    }

    /* renamed from: c */
    private LinearGradient m24802c() {
        long e = (long) m24804e();
        LinearGradient linearGradient = (LinearGradient) this.f18720c.m1539a(e);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f18730m.mo871e();
        PointF pointF2 = (PointF) this.f18731n.mo871e();
        C0986c c0986c = (C0986c) this.f18728k.mo871e();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, c0986c.m4254b(), c0986c.m4253a(), TileMode.CLAMP);
        this.f18720c.m1545b(e, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: d */
    private RadialGradient m24803d() {
        long e = (long) m24804e();
        RadialGradient radialGradient = (RadialGradient) this.f18721d.m1539a(e);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f18730m.mo871e();
        PointF pointF2 = (PointF) this.f18731n.mo871e();
        C0986c c0986c = (C0986c) this.f18728k.mo871e();
        int[] b = c0986c.m4254b();
        float[] a = c0986c.m4253a();
        float f = pointF.x;
        float f2 = pointF.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot((double) (pointF2.x - f), (double) (pointF2.y - f2)), b, a, TileMode.CLAMP);
        this.f18721d.m1545b(e, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: e */
    private int m24804e() {
        int round = Math.round(this.f18730m.m3995f() * ((float) this.f18734q));
        int round2 = Math.round(this.f18731n.m3995f() * ((float) this.f18734q));
        int round3 = Math.round(this.f18728k.m3995f() * ((float) this.f18734q));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = (i * 31) * round2;
        }
        return round3 != 0 ? (i * 31) * round3 : i;
    }

    /* renamed from: a */
    public void mo3885a(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
        C0953e.m4097a(c0989e, i, list, c0989e2, this);
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        if (t != C0969i.f3234x) {
            return;
        }
        if (c0961c == null) {
            this.f18732o = null;
            return;
        }
        this.f18732o = new C3296p(c0961c);
        this.f18732o.m3989a((C0921a) this);
        this.f18719b.m24890a(this.f18732o);
    }
}
