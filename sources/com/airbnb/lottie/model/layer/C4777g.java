package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.C1001o;
import com.airbnb.lottie.model.C0982b;
import com.airbnb.lottie.model.C0983c;
import com.airbnb.lottie.model.C0988d;
import com.airbnb.lottie.model.content.C3325j;
import com.airbnb.lottie.p031a.p032a.C4475c;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p031a.p033b.C4491n;
import com.airbnb.lottie.p036d.C0954f;
import com.airbnb.lottie.p037e.C0961c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.model.layer.g */
public class C4777g extends C4500a {
    /* renamed from: e */
    private final char[] f20883e = new char[1];
    /* renamed from: f */
    private final RectF f20884f = new RectF();
    /* renamed from: g */
    private final Matrix f20885g = new Matrix();
    /* renamed from: h */
    private final Paint f20886h = new Paint(this, 1) {
        /* renamed from: a */
        final /* synthetic */ C4777g f3359a;
    };
    /* renamed from: i */
    private final Paint f20887i = new Paint(this, 1) {
        /* renamed from: a */
        final /* synthetic */ C4777g f3360a;
    };
    /* renamed from: j */
    private final Map<C0988d, List<C4475c>> f20888j = new HashMap();
    /* renamed from: k */
    private final C4491n f20889k;
    /* renamed from: l */
    private final C0966f f20890l;
    /* renamed from: m */
    private final C0955d f20891m;
    /* renamed from: n */
    private C0922a<Integer, Integer> f20892n;
    /* renamed from: o */
    private C0922a<Integer, Integer> f20893o;
    /* renamed from: p */
    private C0922a<Float, Float> f20894p;
    /* renamed from: q */
    private C0922a<Float, Float> f20895q;

    C4777g(C0966f c0966f, Layer layer) {
        super(c0966f, layer);
        this.f20890l = c0966f;
        this.f20891m = layer.m4282a();
        this.f20889k = layer.m4301s().m24872b();
        this.f20889k.m3989a((C0921a) this);
        m24890a((C0922a) this.f20889k);
        c0966f = layer.m4302t();
        if (!(c0966f == null || c0966f.f3251a == null)) {
            this.f20892n = c0966f.f3251a.mo877a();
            this.f20892n.m3989a((C0921a) this);
            m24890a((C0922a) this.f20892n);
        }
        if (!(c0966f == null || c0966f.f3252b == null)) {
            this.f20893o = c0966f.f3252b.mo877a();
            this.f20893o.m3989a((C0921a) this);
            m24890a((C0922a) this.f20893o);
        }
        if (!(c0966f == null || c0966f.f3253c == null)) {
            this.f20894p = c0966f.f3253c.mo877a();
            this.f20894p.m3989a((C0921a) this);
            m24890a((C0922a) this.f20894p);
        }
        if (c0966f != null && c0966f.f3254d != null) {
            this.f20895q = c0966f.f3254d.mo877a();
            this.f20895q.m3989a((C0921a) this);
            m24890a((C0922a) this.f20895q);
        }
    }

    /* renamed from: b */
    void mo4619b(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (this.f20890l.m4200p() == 0) {
            canvas.setMatrix(matrix);
        }
        C0982b c0982b = (C0982b) this.f20889k.mo871e();
        C0983c c0983c = (C0983c) this.f20891m.m4122i().get(c0982b.f3259b);
        if (c0983c == null) {
            canvas.restore();
            return;
        }
        if (this.f20892n != null) {
            this.f20886h.setColor(((Integer) this.f20892n.mo871e()).intValue());
        } else {
            this.f20886h.setColor(c0982b.f3265h);
        }
        if (this.f20893o != null) {
            this.f20887i.setColor(((Integer) this.f20893o.mo871e()).intValue());
        } else {
            this.f20887i.setColor(c0982b.f3266i);
        }
        int intValue = (((Integer) this.d.m3999a().mo871e()).intValue() * 255) / 100;
        this.f20886h.setAlpha(intValue);
        this.f20887i.setAlpha(intValue);
        if (this.f20894p != null) {
            this.f20887i.setStrokeWidth(((Float) this.f20894p.mo871e()).floatValue());
        } else {
            this.f20887i.setStrokeWidth((((float) c0982b.f3267j) * C0954f.m4101a()) * C0954f.m4102a(matrix));
        }
        if (this.f20890l.m4200p()) {
            m27713a(c0982b, matrix, c0983c, canvas);
        } else {
            m27714a(c0982b, c0983c, matrix, canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private void m27713a(C0982b c0982b, Matrix matrix, C0983c c0983c, Canvas canvas) {
        float f = ((float) c0982b.f3260c) / 100.0f;
        float a = C0954f.m4102a(matrix);
        String str = c0982b.f3258a;
        for (int i = 0; i < str.length(); i++) {
            C0988d c0988d = (C0988d) this.f20891m.m4121h().m1590a(C0988d.m4261a(str.charAt(i), c0983c.m4240a(), c0983c.m4242c()));
            if (c0988d != null) {
                m27715a(c0988d, matrix, f, c0982b, canvas);
                float b = ((((float) c0988d.m4263b()) * f) * C0954f.m4101a()) * a;
                float f2 = ((float) c0982b.f3262e) / 10.0f;
                if (this.f20895q != null) {
                    f2 += ((Float) this.f20895q.mo871e()).floatValue();
                }
                canvas.translate(b + (f2 * a), 0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m27714a(C0982b c0982b, C0983c c0983c, Matrix matrix, Canvas canvas) {
        matrix = C0954f.m4102a(matrix);
        c0983c = this.f20890l.m4162a(c0983c.m4240a(), c0983c.m4242c());
        if (c0983c != null) {
            String str = c0982b.f3258a;
            C1001o o = this.f20890l.m4199o();
            if (o != null) {
                str = o.m4318a(str);
            }
            this.f20886h.setTypeface(c0983c);
            c0983c = this.f20886h;
            double d = c0982b.f3260c;
            double a = (double) C0954f.m4101a();
            Double.isNaN(a);
            c0983c.setTextSize((float) (d * a));
            this.f20887i.setTypeface(this.f20886h.getTypeface());
            this.f20887i.setTextSize(this.f20886h.getTextSize());
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                m27711a(charAt, c0982b, canvas);
                this.f20883e[0] = charAt;
                float measureText = this.f20886h.measureText(this.f20883e, 0, 1);
                float f = ((float) c0982b.f3262e) / 10.0f;
                if (this.f20895q != null) {
                    f += ((Float) this.f20895q.mo871e()).floatValue();
                }
                canvas.translate(measureText + (f * matrix), 0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m27715a(C0988d c0988d, Matrix matrix, float f, C0982b c0982b, Canvas canvas) {
        c0988d = m27710a(c0988d);
        for (int i = 0; i < c0988d.size(); i++) {
            Path e = ((C4475c) c0988d.get(i)).mo3887e();
            e.computeBounds(this.f20884f, false);
            this.f20885g.set(matrix);
            this.f20885g.preTranslate(0.0f, ((float) (-c0982b.f3264g)) * C0954f.m4101a());
            this.f20885g.preScale(f, f);
            e.transform(this.f20885g);
            if (c0982b.f3268k) {
                m27712a(e, this.f20886h, canvas);
                m27712a(e, this.f20887i, canvas);
            } else {
                m27712a(e, this.f20887i, canvas);
                m27712a(e, this.f20886h, canvas);
            }
        }
    }

    /* renamed from: a */
    private void m27712a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: a */
    private void m27711a(char c, C0982b c0982b, Canvas canvas) {
        this.f20883e[0] = c;
        if (c0982b.f3268k != '\u0000') {
            m27716a(this.f20883e, this.f20886h, canvas);
            m27716a(this.f20883e, this.f20887i, canvas);
            return;
        }
        m27716a(this.f20883e, this.f20887i, canvas);
        m27716a(this.f20883e, this.f20886h, canvas);
    }

    /* renamed from: a */
    private void m27716a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: a */
    private List<C4475c> m27710a(C0988d c0988d) {
        if (this.f20888j.containsKey(c0988d)) {
            return (List) this.f20888j.get(c0988d);
        }
        List a = c0988d.m4262a();
        int size = a.size();
        List<C4475c> arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C4475c(this.f20890l, this, (C3325j) a.get(i)));
        }
        this.f20888j.put(c0988d, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        super.mo3886a((Object) t, (C0961c) c0961c);
        if (t == C0969i.f3211a && this.f20892n != null) {
            this.f20892n.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3212b && this.f20893o != null) {
            this.f20893o.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3221k && this.f20894p != null) {
            this.f20894p.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3222l && this.f20895q != null) {
            this.f20895q.m3990a((C0961c) c0961c);
        }
    }
}
