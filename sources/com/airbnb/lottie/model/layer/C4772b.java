package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.v4.p017f.C0420f;
import com.airbnb.lottie.C0949c;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p031a.p033b.C3296p;
import com.airbnb.lottie.p037e.C0961c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.b */
public class C4772b extends C4500a {
    /* renamed from: e */
    private C0922a<Float, Float> f20868e;
    /* renamed from: f */
    private final List<C4500a> f20869f = new ArrayList();
    /* renamed from: g */
    private final RectF f20870g = new RectF();
    /* renamed from: h */
    private final RectF f20871h = new RectF();

    public C4772b(C0966f c0966f, Layer layer, List<Layer> list, C0955d c0955d) {
        super(c0966f, layer);
        layer = layer.m4303u();
        if (layer != null) {
            this.f20868e = layer.mo877a();
            m24890a((C0922a) this.f20868e);
            this.f20868e.m3989a((C0921a) this);
        } else {
            this.f20868e = null;
        }
        layer = new C0420f(c0955d.m4120g().size());
        int size = list.size() - 1;
        C4500a c4500a = null;
        while (true) {
            int i = 0;
            if (size >= 0) {
                Layer layer2 = (Layer) list.get(size);
                C4500a a = C4500a.m24873a(layer2, c0966f, c0955d);
                if (a != null) {
                    layer.m1545b(a.m24899c().m4287e(), a);
                    if (c4500a == null) {
                        this.f20869f.add(0, a);
                        switch (layer2.m4294l()) {
                            case Add:
                            case Invert:
                                c4500a = a;
                                break;
                            default:
                                break;
                        }
                    }
                    c4500a.m24892a(a);
                    c4500a = null;
                }
                size--;
            } else {
                while (i < layer.m1542b()) {
                    C4500a c4500a2 = (C4500a) layer.m1539a(layer.m1543b(i));
                    if (c4500a2 != null) {
                        C4500a c4500a3 = (C4500a) layer.m1539a(c4500a2.m24899c().m4295m());
                        if (c4500a3 != null) {
                            c4500a2.m24898b(c4500a3);
                        }
                    }
                    i++;
                }
                return;
            }
        }
    }

    /* renamed from: b */
    void mo4619b(Canvas canvas, Matrix matrix, int i) {
        C0949c.m4078c("CompositionLayer#draw");
        canvas.save();
        this.f20871h.set(0.0f, 0.0f, (float) this.c.m4290h(), (float) this.c.m4291i());
        matrix.mapRect(this.f20871h);
        for (int size = this.f20869f.size() - 1; size >= 0; size--) {
            if (!this.f20871h.isEmpty() ? canvas.clipRect(this.f20871h) : true) {
                ((C4500a) this.f20869f.get(size)).mo3883a(canvas, matrix, i);
            }
        }
        canvas.restore();
        C0949c.m4079d("CompositionLayer#draw");
    }

    /* renamed from: a */
    public void mo3884a(RectF rectF, Matrix matrix) {
        super.mo3884a(rectF, matrix);
        this.f20870g.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (matrix = this.f20869f.size() - 1; matrix >= null; matrix--) {
            ((C4500a) this.f20869f.get(matrix)).mo3884a(this.f20870g, this.a);
            if (rectF.isEmpty()) {
                rectF.set(this.f20870g);
            } else {
                rectF.set(Math.min(rectF.left, this.f20870g.left), Math.min(rectF.top, this.f20870g.top), Math.max(rectF.right, this.f20870g.right), Math.max(rectF.bottom, this.f20870g.bottom));
            }
        }
    }

    /* renamed from: a */
    public void mo4618a(float f) {
        super.mo4618a(f);
        if (this.f20868e != null) {
            f = ((float) ((long) (((Float) this.f20868e.mo871e()).floatValue() * 1000.0f))) / this.b.m4202r().m4116c();
        }
        if (this.c.m4284b() != 0.0f) {
            f /= this.c.m4284b();
        }
        f -= this.c.m4285c();
        for (int size = this.f20869f.size() - 1; size >= 0; size--) {
            ((C4500a) this.f20869f.get(size)).mo4618a(f);
        }
    }

    /* renamed from: b */
    protected void mo4620b(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
        for (int i2 = 0; i2 < this.f20869f.size(); i2++) {
            ((C4500a) this.f20869f.get(i2)).mo3885a(c0989e, i, (List) list, c0989e2);
        }
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        super.mo3886a((Object) t, (C0961c) c0961c);
        if (t != C0969i.f3233w) {
            return;
        }
        if (c0961c == null) {
            this.f20868e = null;
            return;
        }
        this.f20868e = new C3296p(c0961c);
        m24890a((C0922a) this.f20868e);
    }
}
