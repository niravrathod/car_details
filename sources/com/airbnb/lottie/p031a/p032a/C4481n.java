package com.airbnb.lottie.p031a.p032a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.content.C3322f;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p036d.C0953e;
import com.airbnb.lottie.p036d.C0954f;
import com.airbnb.lottie.p037e.C0961c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.n */
public class C4481n implements C3289j, C3290l, C0921a {
    /* renamed from: a */
    private final Path f18754a = new Path();
    /* renamed from: b */
    private final RectF f18755b = new RectF();
    /* renamed from: c */
    private final String f18756c;
    /* renamed from: d */
    private final C0966f f18757d;
    /* renamed from: e */
    private final C0922a<?, PointF> f18758e;
    /* renamed from: f */
    private final C0922a<?, PointF> f18759f;
    /* renamed from: g */
    private final C0922a<?, Float> f18760g;
    /* renamed from: h */
    private C3291r f18761h;
    /* renamed from: i */
    private boolean f18762i;

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
    }

    public C4481n(C0966f c0966f, C4500a c4500a, C3322f c3322f) {
        this.f18756c = c3322f.m17092a();
        this.f18757d = c0966f;
        this.f18758e = c3322f.m17095d().mo877a();
        this.f18759f = c3322f.m17094c().mo877a();
        this.f18760g = c3322f.m17093b().mo877a();
        c4500a.m24890a(this.f18758e);
        c4500a.m24890a(this.f18759f);
        c4500a.m24890a(this.f18760g);
        this.f18758e.m3989a((C0921a) this);
        this.f18759f.m3989a((C0921a) this);
        this.f18760g.m3989a((C0921a) this);
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f18756c;
    }

    /* renamed from: a */
    public void mo866a() {
        m24827c();
    }

    /* renamed from: c */
    private void m24827c() {
        this.f18762i = false;
        this.f18757d.invalidateSelf();
    }

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
        for (list2 = null; list2 < list.size(); list2++) {
            C0917b c0917b = (C0917b) list.get(list2);
            if (c0917b instanceof C3291r) {
                C3291r c3291r = (C3291r) c0917b;
                if (c3291r.m16954c() == Type.Simultaneously) {
                    this.f18761h = c3291r;
                    this.f18761h.m16951a(this);
                }
            }
        }
    }

    /* renamed from: e */
    public Path mo3887e() {
        if (this.f18762i) {
            return this.f18754a;
        }
        this.f18754a.reset();
        PointF pointF = (PointF) this.f18759f.mo871e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float floatValue = this.f18760g == null ? 0.0f : ((Float) this.f18760g.mo871e()).floatValue();
        float min = Math.min(f, f2);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF pointF2 = (PointF) this.f18758e.mo871e();
        this.f18754a.moveTo(pointF2.x + f, (pointF2.y - f2) + floatValue);
        this.f18754a.lineTo(pointF2.x + f, (pointF2.y + f2) - floatValue);
        if (floatValue > 0.0f) {
            float f3 = floatValue * 2.0f;
            this.f18755b.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
            this.f18754a.arcTo(this.f18755b, 0.0f, 90.0f, false);
        }
        this.f18754a.lineTo((pointF2.x - f) + floatValue, pointF2.y + f2);
        if (floatValue > 0.0f) {
            float f4 = floatValue * 2.0f;
            this.f18755b.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
            this.f18754a.arcTo(this.f18755b, 90.0f, 90.0f, false);
        }
        this.f18754a.lineTo(pointF2.x - f, (pointF2.y - f2) + floatValue);
        if (floatValue > 0.0f) {
            float f5 = floatValue * 2.0f;
            this.f18755b.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
            this.f18754a.arcTo(this.f18755b, 180.0f, 90.0f, false);
        }
        this.f18754a.lineTo((pointF2.x + f) - floatValue, pointF2.y - f2);
        if (floatValue > 0.0f) {
            floatValue *= 2.0f;
            this.f18755b.set((pointF2.x + f) - floatValue, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + floatValue);
            this.f18754a.arcTo(this.f18755b, 270.0f, 90.0f, false);
        }
        this.f18754a.close();
        C0954f.m4106a(this.f18754a, this.f18761h);
        this.f18762i = true;
        return this.f18754a;
    }

    /* renamed from: a */
    public void mo3885a(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
        C0953e.m4097a(c0989e, i, list, c0989e2, this);
    }
}
