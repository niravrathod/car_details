package com.airbnb.lottie.p031a.p032a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.content.C3319a;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p036d.C0953e;
import com.airbnb.lottie.p036d.C0954f;
import com.airbnb.lottie.p037e.C0961c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.e */
public class C4476e implements C3289j, C3290l, C0921a {
    /* renamed from: a */
    private final Path f18701a = new Path();
    /* renamed from: b */
    private final String f18702b;
    /* renamed from: c */
    private final C0966f f18703c;
    /* renamed from: d */
    private final C0922a<?, PointF> f18704d;
    /* renamed from: e */
    private final C0922a<?, PointF> f18705e;
    /* renamed from: f */
    private final C3319a f18706f;
    /* renamed from: g */
    private C3291r f18707g;
    /* renamed from: h */
    private boolean f18708h;

    public C4476e(C0966f c0966f, C4500a c4500a, C3319a c3319a) {
        this.f18702b = c3319a.m17066a();
        this.f18703c = c0966f;
        this.f18704d = c3319a.m17068c().mo877a();
        this.f18705e = c3319a.m17067b().mo877a();
        this.f18706f = c3319a;
        c4500a.m24890a(this.f18704d);
        c4500a.m24890a(this.f18705e);
        this.f18704d.m3989a((C0921a) this);
        this.f18705e.m3989a((C0921a) this);
    }

    /* renamed from: a */
    public void mo866a() {
        m24788c();
    }

    /* renamed from: c */
    private void m24788c() {
        this.f18708h = false;
        this.f18703c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
        for (list2 = null; list2 < list.size(); list2++) {
            C0917b c0917b = (C0917b) list.get(list2);
            if (c0917b instanceof C3291r) {
                C3291r c3291r = (C3291r) c0917b;
                if (c3291r.m16954c() == Type.Simultaneously) {
                    this.f18707g = c3291r;
                    this.f18707g.m16951a(this);
                }
            }
        }
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f18702b;
    }

    /* renamed from: e */
    public Path mo3887e() {
        if (this.f18708h) {
            return r0.f18701a;
        }
        r0.f18701a.reset();
        PointF pointF = (PointF) r0.f18704d.mo871e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        r0.f18701a.reset();
        float f5;
        if (r0.f18706f.m17069d()) {
            float f6 = -f2;
            r0.f18701a.moveTo(0.0f, f6);
            float f7 = 0.0f - f3;
            float f8 = -f;
            float f9 = 0.0f - f4;
            r0.f18701a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            f4 += 0.0f;
            f5 = f6;
            r0.f18701a.cubicTo(f8, f4, f7, f2, 0.0f, f2);
            f3 += 0.0f;
            r0.f18701a.cubicTo(f3, f2, f, f4, f, 0.0f);
            r0.f18701a.cubicTo(f, f9, f3, f5, 0.0f, f5);
        } else {
            float f10 = -f2;
            r0.f18701a.moveTo(0.0f, f10);
            f5 = f3 + 0.0f;
            float f11 = 0.0f - f4;
            r0.f18701a.cubicTo(f5, f10, f, f11, f, 0.0f);
            f4 += 0.0f;
            r0.f18701a.cubicTo(f, f4, f5, f2, 0.0f, f2);
            f3 = 0.0f - f3;
            float f12 = -f;
            r0.f18701a.cubicTo(f3, f2, f12, f4, f12, 0.0f);
            f2 = f10;
            r0.f18701a.cubicTo(f12, f11, f3, f2, 0.0f, f2);
        }
        pointF = (PointF) r0.f18705e.mo871e();
        r0.f18701a.offset(pointF.x, pointF.y);
        r0.f18701a.close();
        C0954f.m4106a(r0.f18701a, r0.f18707g);
        r0.f18708h = true;
        return r0.f18701a;
    }

    /* renamed from: a */
    public void mo3885a(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
        C0953e.m4097a(c0989e, i, list, c0989e2, this);
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        if (t == C0969i.f3217g) {
            this.f18704d.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3218h) {
            this.f18705e.m3990a((C0961c) c0961c);
        }
    }
}
