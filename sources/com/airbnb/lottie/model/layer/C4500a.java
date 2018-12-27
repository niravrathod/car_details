package com.airbnb.lottie.model.layer;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import com.airbnb.lottie.C0949c;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.C0990f;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.Mask.MaskMode;
import com.airbnb.lottie.model.layer.Layer.MatteType;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C3288d;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p031a.p033b.C0923g;
import com.airbnb.lottie.p031a.p033b.C0924o;
import com.airbnb.lottie.p031a.p033b.C4485c;
import com.airbnb.lottie.p037e.C0961c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.a */
public abstract class C4500a implements C3288d, C0921a, C0990f {
    /* renamed from: a */
    final Matrix f18784a = new Matrix();
    /* renamed from: b */
    final C0966f f18785b;
    /* renamed from: c */
    final Layer f18786c;
    /* renamed from: d */
    final C0924o f18787d;
    /* renamed from: e */
    private final Path f18788e = new Path();
    /* renamed from: f */
    private final Matrix f18789f = new Matrix();
    /* renamed from: g */
    private final Paint f18790g = new Paint(1);
    /* renamed from: h */
    private final Paint f18791h = new Paint(1);
    /* renamed from: i */
    private final Paint f18792i = new Paint(1);
    /* renamed from: j */
    private final Paint f18793j = new Paint(1);
    /* renamed from: k */
    private final Paint f18794k = new Paint();
    /* renamed from: l */
    private final RectF f18795l = new RectF();
    /* renamed from: m */
    private final RectF f18796m = new RectF();
    /* renamed from: n */
    private final RectF f18797n = new RectF();
    /* renamed from: o */
    private final RectF f18798o = new RectF();
    /* renamed from: p */
    private final String f18799p;
    /* renamed from: q */
    private C0923g f18800q;
    /* renamed from: r */
    private C4500a f18801r;
    /* renamed from: s */
    private C4500a f18802s;
    /* renamed from: t */
    private List<C4500a> f18803t;
    /* renamed from: u */
    private final List<C0922a<?, ?>> f18804u = new ArrayList();
    /* renamed from: v */
    private boolean f18805v = true;

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
    }

    /* renamed from: b */
    abstract void mo4619b(Canvas canvas, Matrix matrix, int i);

    /* renamed from: b */
    void mo4620b(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
    }

    /* renamed from: a */
    static C4500a m24873a(Layer layer, C0966f c0966f, C0955d c0955d) {
        switch (layer.m4293k()) {
            case Shape:
                return new C4775e(c0966f, layer);
            case PreComp:
                return new C4772b(c0966f, layer, c0955d.m4115b(layer.m4289g()), c0955d);
            case Solid:
                return new C4776f(c0966f, layer);
            case Image:
                return new C4773c(c0966f, layer);
            case Null:
                return new C4774d(c0966f, layer);
            case Text:
                return new C4777g(c0966f, layer);
            default:
                c0966f = new StringBuilder();
                c0966f.append("Unknown layer type ");
                c0966f.append(layer.m4293k());
                C0949c.m4077b(c0966f.toString());
                return null;
        }
    }

    C4500a(C0966f c0966f, Layer layer) {
        this.f18785b = c0966f;
        this.f18786c = layer;
        c0966f = new StringBuilder();
        c0966f.append(layer.m4288f());
        c0966f.append("#draw");
        this.f18799p = c0966f.toString();
        this.f18794k.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f18791h.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        this.f18792i.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        if (layer.m4294l() == MatteType.Invert) {
            this.f18793j.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        } else {
            this.f18793j.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        }
        this.f18787d = layer.m4297o().m17035h();
        this.f18787d.m4001a((C0921a) this);
        if (layer.m4292j() != null && layer.m4292j().isEmpty() == null) {
            this.f18800q = new C0923g(layer.m4292j());
            for (C0922a a : this.f18800q.m3997b()) {
                a.m3989a((C0921a) this);
            }
            for (C0922a a2 : this.f18800q.m3998c()) {
                m24890a(a2);
                a2.m3989a((C0921a) this);
            }
        }
        m24883f();
    }

    /* renamed from: a */
    public void mo866a() {
        m24884g();
    }

    /* renamed from: c */
    Layer m24899c() {
        return this.f18786c;
    }

    /* renamed from: a */
    void m24892a(C4500a c4500a) {
        this.f18801r = c4500a;
    }

    /* renamed from: d */
    boolean m24900d() {
        return this.f18801r != null;
    }

    /* renamed from: b */
    void m24898b(C4500a c4500a) {
        this.f18802s = c4500a;
    }

    /* renamed from: f */
    private void m24883f() {
        boolean z = true;
        if (this.f18786c.m4286d().isEmpty()) {
            m24879a(true);
            return;
        }
        final C0922a c4485c = new C4485c(this.f18786c.m4286d());
        c4485c.m3987a();
        c4485c.m3989a(new C0921a(this) {
            /* renamed from: b */
            final /* synthetic */ C4500a f14149b;

            /* renamed from: a */
            public void mo866a() {
                this.f14149b.m24879a(((Float) c4485c.mo871e()).floatValue() == 1.0f);
            }
        });
        if (((Float) c4485c.mo871e()).floatValue() != 1.0f) {
            z = false;
        }
        m24879a(z);
        m24890a(c4485c);
    }

    /* renamed from: g */
    private void m24884g() {
        this.f18785b.invalidateSelf();
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    private void m24877a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        if (VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, z ? true : true);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    /* renamed from: a */
    public void m24890a(C0922a<?, ?> c0922a) {
        this.f18804u.add(c0922a);
    }

    /* renamed from: a */
    public void mo3884a(RectF rectF, Matrix matrix) {
        this.f18784a.set(matrix);
        this.f18784a.preConcat(this.f18787d.m4007d());
    }

    /* renamed from: a */
    public void mo3883a(Canvas canvas, Matrix matrix, int i) {
        C0949c.m4078c(this.f18799p);
        if (this.f18805v) {
            m24885h();
            C0949c.m4078c("Layer#parentMatrix");
            this.f18789f.reset();
            this.f18789f.set(matrix);
            for (int size = this.f18803t.size() - 1; size >= 0; size--) {
                this.f18789f.preConcat(((C4500a) this.f18803t.get(size)).f18787d.m4007d());
            }
            C0949c.m4079d("Layer#parentMatrix");
            i = (int) ((((((float) i) / 1132396544) * ((float) ((Integer) this.f18787d.m3999a().mo871e()).intValue())) / 1120403456) * 1132396544);
            if (m24900d() || m24901e()) {
                C0949c.m4078c("Layer#computeBounds");
                this.f18795l.set(0.0f, 0.0f, 0.0f, 0.0f);
                mo3884a(this.f18795l, this.f18789f);
                m24882c(this.f18795l, this.f18789f);
                this.f18789f.preConcat(this.f18787d.m4007d());
                m24881b(this.f18795l, this.f18789f);
                this.f18795l.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
                C0949c.m4079d("Layer#computeBounds");
                C0949c.m4078c("Layer#saveLayer");
                m24877a(canvas, this.f18795l, this.f18790g, true);
                C0949c.m4079d("Layer#saveLayer");
                m24874a(canvas);
                C0949c.m4078c("Layer#drawLayer");
                mo4619b(canvas, this.f18789f, i);
                C0949c.m4079d("Layer#drawLayer");
                if (m24901e()) {
                    m24875a(canvas, this.f18789f);
                }
                if (m24900d()) {
                    C0949c.m4078c("Layer#drawMatte");
                    C0949c.m4078c("Layer#saveLayer");
                    m24877a(canvas, this.f18795l, this.f18793j, false);
                    C0949c.m4079d("Layer#saveLayer");
                    m24874a(canvas);
                    this.f18801r.mo3883a(canvas, matrix, i);
                    C0949c.m4078c("Layer#restoreLayer");
                    canvas.restore();
                    C0949c.m4079d("Layer#restoreLayer");
                    C0949c.m4079d("Layer#drawMatte");
                }
                C0949c.m4078c("Layer#restoreLayer");
                canvas.restore();
                C0949c.m4079d("Layer#restoreLayer");
                m24880b(C0949c.m4079d(this.f18799p));
                return;
            }
            this.f18789f.preConcat(this.f18787d.m4007d());
            C0949c.m4078c("Layer#drawLayer");
            mo4619b(canvas, this.f18789f, i);
            C0949c.m4079d("Layer#drawLayer");
            m24880b(C0949c.m4079d(this.f18799p));
            return;
        }
        C0949c.m4079d(this.f18799p);
    }

    /* renamed from: b */
    private void m24880b(float f) {
        this.f18785b.m4202r().m4109a().m4231a(this.f18786c.m4288f(), f);
    }

    /* renamed from: a */
    private void m24874a(Canvas canvas) {
        C0949c.m4078c("Layer#clearLayer");
        canvas.drawRect(this.f18795l.left - 1.0f, this.f18795l.top - 1.0f, this.f18795l.right + 1.0f, this.f18795l.bottom + 1.0f, this.f18794k);
        C0949c.m4079d("Layer#clearLayer");
    }

    /* renamed from: b */
    private void m24881b(RectF rectF, Matrix matrix) {
        this.f18796m.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m24901e()) {
            int size = this.f18800q.m3996a().size();
            int i = 0;
            while (i < size) {
                Mask mask = (Mask) this.f18800q.m3996a().get(i);
                this.f18788e.set((Path) ((C0922a) this.f18800q.m3997b().get(i)).mo871e());
                this.f18788e.transform(matrix);
                switch (mask.m4243a()) {
                    case MaskModeSubtract:
                        return;
                    case MaskModeIntersect:
                        return;
                    default:
                        this.f18788e.computeBounds(this.f18798o, false);
                        if (i == 0) {
                            this.f18796m.set(this.f18798o);
                        } else {
                            this.f18796m.set(Math.min(this.f18796m.left, this.f18798o.left), Math.min(this.f18796m.top, this.f18798o.top), Math.max(this.f18796m.right, this.f18798o.right), Math.max(this.f18796m.bottom, this.f18798o.bottom));
                        }
                        i++;
                }
            }
            rectF.set(Math.max(rectF.left, this.f18796m.left), Math.max(rectF.top, this.f18796m.top), Math.min(rectF.right, this.f18796m.right), Math.min(rectF.bottom, this.f18796m.bottom));
        }
    }

    /* renamed from: c */
    private void m24882c(RectF rectF, Matrix matrix) {
        if (m24900d() && this.f18786c.m4294l() != MatteType.Invert) {
            this.f18801r.mo3884a(this.f18797n, matrix);
            rectF.set(Math.max(rectF.left, this.f18797n.left), Math.max(rectF.top, this.f18797n.top), Math.min(rectF.right, this.f18797n.right), Math.min(rectF.bottom, this.f18797n.bottom));
        }
    }

    /* renamed from: a */
    private void m24875a(Canvas canvas, Matrix matrix) {
        m24876a(canvas, matrix, MaskMode.MaskModeAdd);
        m24876a(canvas, matrix, MaskMode.MaskModeIntersect);
        m24876a(canvas, matrix, MaskMode.MaskModeSubtract);
    }

    /* renamed from: a */
    private void m24876a(Canvas canvas, Matrix matrix, MaskMode maskMode) {
        Paint paint;
        Object obj = 1;
        if (C09932.f3357b[maskMode.ordinal()] != 1) {
            paint = this.f18791h;
        } else {
            paint = this.f18792i;
        }
        int size = this.f18800q.m3996a().size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Mask) this.f18800q.m3996a().get(i2)).m4243a() == maskMode) {
                break;
            }
        }
        obj = null;
        if (obj != null) {
            C0949c.m4078c("Layer#drawMask");
            C0949c.m4078c("Layer#saveLayer");
            m24877a(canvas, this.f18795l, paint, false);
            C0949c.m4079d("Layer#saveLayer");
            m24874a(canvas);
            while (i < size) {
                if (((Mask) this.f18800q.m3996a().get(i)).m4243a() == maskMode) {
                    this.f18788e.set((Path) ((C0922a) this.f18800q.m3997b().get(i)).mo871e());
                    this.f18788e.transform(matrix);
                    C0922a c0922a = (C0922a) this.f18800q.m3998c().get(i);
                    int alpha = this.f18790g.getAlpha();
                    this.f18790g.setAlpha((int) (((float) ((Integer) c0922a.mo871e()).intValue()) * 2.55f));
                    canvas.drawPath(this.f18788e, this.f18790g);
                    this.f18790g.setAlpha(alpha);
                }
                i++;
            }
            C0949c.m4078c("Layer#restoreLayer");
            canvas.restore();
            C0949c.m4079d("Layer#restoreLayer");
            C0949c.m4079d("Layer#drawMask");
        }
    }

    /* renamed from: e */
    boolean m24901e() {
        return (this.f18800q == null || this.f18800q.m3997b().isEmpty()) ? false : true;
    }

    /* renamed from: a */
    private void m24879a(boolean z) {
        if (z != this.f18805v) {
            this.f18805v = z;
            m24884g();
        }
    }

    /* renamed from: a */
    void mo4618a(float f) {
        this.f18787d.m4000a(f);
        int i = 0;
        if (this.f18800q != null) {
            for (int i2 = 0; i2 < this.f18800q.m3997b().size(); i2++) {
                ((C0922a) this.f18800q.m3997b().get(i2)).mo870a(f);
            }
        }
        if (this.f18786c.m4284b() != 0.0f) {
            f /= this.f18786c.m4284b();
        }
        if (this.f18801r != null) {
            this.f18801r.mo4618a(this.f18801r.f18786c.m4284b() * f);
        }
        while (i < this.f18804u.size()) {
            ((C0922a) this.f18804u.get(i)).mo870a(f);
            i++;
        }
    }

    /* renamed from: h */
    private void m24885h() {
        if (this.f18803t == null) {
            if (this.f18802s == null) {
                this.f18803t = Collections.emptyList();
                return;
            }
            this.f18803t = new ArrayList();
            for (C4500a c4500a = this.f18802s; c4500a != null; c4500a = c4500a.f18802s) {
                this.f18803t.add(c4500a);
            }
        }
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f18786c.m4288f();
    }

    /* renamed from: a */
    public void mo3885a(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
        if (c0989e.m4269a(mo868b(), i)) {
            if (!"__container".equals(mo868b())) {
                c0989e2 = c0989e2.m4267a(mo868b());
                if (c0989e.m4271c(mo868b(), i)) {
                    list.add(c0989e2.m4266a((C0990f) this));
                }
            }
            if (c0989e.m4272d(mo868b(), i)) {
                mo4620b(c0989e, i + c0989e.m4270b(mo868b(), i), list, c0989e2);
            }
        }
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        this.f18787d.m4003a(t, c0961c);
    }
}
