package com.airbnb.lottie.p031a.p032a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C0949c;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C4493b;
import com.airbnb.lottie.model.p038a.C4495d;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p031a.p033b.C3296p;
import com.airbnb.lottie.p036d.C0953e;
import com.airbnb.lottie.p036d.C0954f;
import com.airbnb.lottie.p037e.C0961c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.a */
public abstract class C4474a implements C3288d, C3289j, C0921a {
    /* renamed from: a */
    final Paint f18679a = new Paint(1);
    /* renamed from: b */
    private final PathMeasure f18680b = new PathMeasure();
    /* renamed from: c */
    private final Path f18681c = new Path();
    /* renamed from: d */
    private final Path f18682d = new Path();
    /* renamed from: e */
    private final RectF f18683e = new RectF();
    /* renamed from: f */
    private final C0966f f18684f;
    /* renamed from: g */
    private final C4500a f18685g;
    /* renamed from: h */
    private final List<C0916a> f18686h = new ArrayList();
    /* renamed from: i */
    private final float[] f18687i;
    /* renamed from: j */
    private final C0922a<?, Float> f18688j;
    /* renamed from: k */
    private final C0922a<?, Integer> f18689k;
    /* renamed from: l */
    private final List<C0922a<?, Float>> f18690l;
    /* renamed from: m */
    private final C0922a<?, Float> f18691m;
    /* renamed from: n */
    private C0922a<ColorFilter, ColorFilter> f18692n;

    /* renamed from: com.airbnb.lottie.a.a.a$a */
    private static final class C0916a {
        /* renamed from: a */
        private final List<C3290l> f3094a;
        /* renamed from: b */
        private final C3291r f3095b;

        private C0916a(C3291r c3291r) {
            this.f3094a = new ArrayList();
            this.f3095b = c3291r;
        }
    }

    C4474a(C0966f c0966f, C4500a c4500a, Cap cap, Join join, float f, C4495d c4495d, C4493b c4493b, List<C4493b> list, C4493b c4493b2) {
        Enum enumR;
        this.f18684f = c0966f;
        this.f18685g = c4500a;
        this.f18679a.setStyle(Style.STROKE);
        this.f18679a.setStrokeCap(cap);
        this.f18679a.setStrokeJoin(join);
        this.f18679a.setStrokeMiter(f);
        this.f18689k = c4495d.mo877a();
        this.f18688j = c4493b.mo877a();
        if (c4493b2 == null) {
            this.f18691m = null;
        } else {
            this.f18691m = c4493b2.mo877a();
        }
        this.f18690l = new ArrayList(list.size());
        this.f18687i = new float[list.size()];
        for (enumR = null; enumR < list.size(); enumR++) {
            this.f18690l.add(((C4493b) list.get(enumR)).mo877a());
        }
        c4500a.m24890a(this.f18689k);
        c4500a.m24890a(this.f18688j);
        for (enumR = null; enumR < this.f18690l.size(); enumR++) {
            c4500a.m24890a((C0922a) this.f18690l.get(enumR));
        }
        if (this.f18691m != null) {
            c4500a.m24890a(this.f18691m);
        }
        this.f18689k.m3989a((C0921a) this);
        this.f18688j.m3989a((C0921a) this);
        for (c0966f = null; c0966f < list.size(); c0966f++) {
            ((C0922a) this.f18690l.get(c0966f)).m3989a((C0921a) this);
        }
        if (this.f18691m != null) {
            this.f18691m.m3989a((C0921a) this);
        }
    }

    /* renamed from: a */
    public void mo866a() {
        this.f18684f.invalidateSelf();
    }

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
        C3291r c3291r = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C0917b c0917b = (C0917b) list.get(size);
            if (c0917b instanceof C3291r) {
                C3291r c3291r2 = (C3291r) c0917b;
                if (c3291r2.m16954c() == Type.Individually) {
                    c3291r = c3291r2;
                }
            }
        }
        if (c3291r != null) {
            c3291r.m16951a(this);
        }
        Object obj = null;
        for (list = list2.size() - 1; list >= null; list--) {
            c0917b = (C0917b) list2.get(list);
            if (c0917b instanceof C3291r) {
                C3291r c3291r3 = (C3291r) c0917b;
                if (c3291r3.m16954c() == Type.Individually) {
                    if (obj != null) {
                        this.f18686h.add(obj);
                    }
                    obj = new C0916a(c3291r3);
                    c3291r3.m16951a(this);
                }
            }
            if (c0917b instanceof C3290l) {
                if (obj == null) {
                    obj = new C0916a(c3291r);
                }
                obj.f3094a.add((C3290l) c0917b);
            }
        }
        if (obj != null) {
            this.f18686h.add(obj);
        }
    }

    /* renamed from: a */
    public void mo3883a(Canvas canvas, Matrix matrix, int i) {
        C0949c.m4078c("StrokeContent#draw");
        int i2 = 0;
        this.f18679a.setAlpha(C0953e.m4094a((int) ((((((float) i) / 1132396544) * ((float) ((Integer) this.f18689k.mo871e()).intValue())) / 1120403456) * 1132396544), 0, 255));
        this.f18679a.setStrokeWidth(((Float) this.f18688j.mo871e()).floatValue() * C0954f.m4102a(matrix));
        if (this.f18679a.getStrokeWidth() <= 0) {
            C0949c.m4079d("StrokeContent#draw");
            return;
        }
        m24769a(matrix);
        if (this.f18692n != 0) {
            this.f18679a.setColorFilter((ColorFilter) this.f18692n.mo871e());
        }
        while (i2 < this.f18686h.size()) {
            C0916a c0916a = (C0916a) this.f18686h.get(i2);
            if (c0916a.f3095b != null) {
                m24768a(canvas, c0916a, matrix);
            } else {
                C0949c.m4078c("StrokeContent#buildPath");
                this.f18681c.reset();
                for (int size = c0916a.f3094a.size() - 1; size >= 0; size--) {
                    this.f18681c.addPath(((C3290l) c0916a.f3094a.get(size)).mo3887e(), matrix);
                }
                C0949c.m4079d("StrokeContent#buildPath");
                C0949c.m4078c("StrokeContent#drawPath");
                canvas.drawPath(this.f18681c, this.f18679a);
                C0949c.m4079d("StrokeContent#drawPath");
            }
            i2++;
        }
        C0949c.m4079d("StrokeContent#draw");
    }

    /* renamed from: a */
    private void m24768a(Canvas canvas, C0916a c0916a, Matrix matrix) {
        C0949c.m4078c("StrokeContent#applyTrimPath");
        if (c0916a.f3095b == null) {
            C0949c.m4079d("StrokeContent#applyTrimPath");
            return;
        }
        this.f18681c.reset();
        for (int size = c0916a.f3094a.size() - 1; size >= 0; size--) {
            this.f18681c.addPath(((C3290l) c0916a.f3094a.get(size)).mo3887e(), matrix);
        }
        this.f18680b.setPath(this.f18681c, false);
        float length = this.f18680b.getLength();
        while (this.f18680b.nextContour()) {
            length += this.f18680b.getLength();
        }
        float floatValue = (((Float) c0916a.f3095b.m16957f().mo871e()).floatValue() * length) / 360.0f;
        float floatValue2 = ((((Float) c0916a.f3095b.m16955d().mo871e()).floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((((Float) c0916a.f3095b.m16956e().mo871e()).floatValue() * length) / 100.0f) + floatValue;
        float f = 0.0f;
        for (int size2 = c0916a.f3094a.size() - 1; size2 >= 0; size2--) {
            float f2;
            this.f18682d.set(((C3290l) c0916a.f3094a.get(size2)).mo3887e());
            this.f18682d.transform(matrix);
            this.f18680b.setPath(this.f18682d, false);
            float length2 = this.f18680b.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                f2 = floatValue3 - length;
                if (f2 < f + length2 && f < f2) {
                    C0954f.m4105a(this.f18682d, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f2 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f18682d, this.f18679a);
                    f += length2;
                }
            }
            f2 = f + length2;
            if (f2 >= floatValue2) {
                if (f <= floatValue3) {
                    if (f2 > floatValue3 || floatValue2 >= f) {
                        float f4 = floatValue2 < f ? 0.0f : (floatValue2 - f) / length2;
                        if (floatValue3 <= f2) {
                            f3 = (floatValue3 - f) / length2;
                        }
                        C0954f.m4105a(this.f18682d, f4, f3, 0.0f);
                        canvas.drawPath(this.f18682d, this.f18679a);
                    } else {
                        canvas.drawPath(this.f18682d, this.f18679a);
                    }
                }
            }
            f += length2;
        }
        C0949c.m4079d("StrokeContent#applyTrimPath");
    }

    /* renamed from: a */
    public void mo3884a(RectF rectF, Matrix matrix) {
        C0949c.m4078c("StrokeContent#getBounds");
        this.f18681c.reset();
        for (int i = 0; i < this.f18686h.size(); i++) {
            C0916a c0916a = (C0916a) this.f18686h.get(i);
            for (int i2 = 0; i2 < c0916a.f3094a.size(); i2++) {
                this.f18681c.addPath(((C3290l) c0916a.f3094a.get(i2)).mo3887e(), matrix);
            }
        }
        this.f18681c.computeBounds(this.f18683e, false);
        matrix = ((Float) this.f18688j.mo871e()).floatValue() / 2.0f;
        this.f18683e.set(this.f18683e.left - matrix, this.f18683e.top - matrix, this.f18683e.right + matrix, this.f18683e.bottom + matrix);
        rectF.set(this.f18683e);
        rectF.set(rectF.left - 1065353216, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C0949c.m4079d("StrokeContent#getBounds");
    }

    /* renamed from: a */
    private void m24769a(Matrix matrix) {
        C0949c.m4078c("StrokeContent#applyDashPattern");
        if (this.f18690l.isEmpty()) {
            C0949c.m4079d("StrokeContent#applyDashPattern");
            return;
        }
        matrix = C0954f.m4102a(matrix);
        for (int i = 0; i < this.f18690l.size(); i++) {
            this.f18687i[i] = ((Float) ((C0922a) this.f18690l.get(i)).mo871e()).floatValue();
            if (i % 2 == 0) {
                if (this.f18687i[i] < 1.0f) {
                    this.f18687i[i] = 1.0f;
                }
            } else if (this.f18687i[i] < 0.1f) {
                this.f18687i[i] = 0.1f;
            }
            float[] fArr = this.f18687i;
            fArr[i] = fArr[i] * matrix;
        }
        this.f18679a.setPathEffect(new DashPathEffect(this.f18687i, this.f18691m == null ? null : ((Float) this.f18691m.mo871e()).floatValue()));
        C0949c.m4079d("StrokeContent#applyDashPattern");
    }

    /* renamed from: a */
    public void mo3885a(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
        C0953e.m4097a(c0989e, i, list, c0989e2, this);
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        if (t == C0969i.f3214d) {
            this.f18689k.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3221k) {
            this.f18688j.m3990a((C0961c) c0961c);
        } else if (t != C0969i.f3234x) {
        } else {
            if (c0961c == null) {
                this.f18692n = null;
                return;
            }
            this.f18692n = new C3296p(c0961c);
            this.f18692n.m3989a((C0921a) this);
            this.f18685g.m24890a(this.f18692n);
        }
    }
}
