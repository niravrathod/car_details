package com.airbnb.lottie.p031a.p032a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.PolystarShape.Type;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p036d.C0953e;
import com.airbnb.lottie.p036d.C0954f;
import com.airbnb.lottie.p037e.C0961c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.m */
public class C4480m implements C3289j, C3290l, C0921a {
    /* renamed from: a */
    private final Path f18741a = new Path();
    /* renamed from: b */
    private final String f18742b;
    /* renamed from: c */
    private final C0966f f18743c;
    /* renamed from: d */
    private final Type f18744d;
    /* renamed from: e */
    private final C0922a<?, Float> f18745e;
    /* renamed from: f */
    private final C0922a<?, PointF> f18746f;
    /* renamed from: g */
    private final C0922a<?, Float> f18747g;
    /* renamed from: h */
    private final C0922a<?, Float> f18748h;
    /* renamed from: i */
    private final C0922a<?, Float> f18749i;
    /* renamed from: j */
    private final C0922a<?, Float> f18750j;
    /* renamed from: k */
    private final C0922a<?, Float> f18751k;
    /* renamed from: l */
    private C3291r f18752l;
    /* renamed from: m */
    private boolean f18753m;

    public C4480m(C0966f c0966f, C4500a c4500a, PolystarShape polystarShape) {
        this.f18743c = c0966f;
        this.f18742b = polystarShape.m17040a();
        this.f18744d = polystarShape.m17041b();
        this.f18745e = polystarShape.m17042c().mo877a();
        this.f18746f = polystarShape.m17043d().mo877a();
        this.f18747g = polystarShape.m17044e().mo877a();
        this.f18749i = polystarShape.m17046g().mo877a();
        this.f18751k = polystarShape.m17048i().mo877a();
        if (this.f18744d == Type.Star) {
            this.f18748h = polystarShape.m17045f().mo877a();
            this.f18750j = polystarShape.m17047h().mo877a();
        } else {
            this.f18748h = null;
            this.f18750j = null;
        }
        c4500a.m24890a(this.f18745e);
        c4500a.m24890a(this.f18746f);
        c4500a.m24890a(this.f18747g);
        c4500a.m24890a(this.f18749i);
        c4500a.m24890a(this.f18751k);
        if (this.f18744d == Type.Star) {
            c4500a.m24890a(this.f18748h);
            c4500a.m24890a(this.f18750j);
        }
        this.f18745e.m3989a((C0921a) this);
        this.f18746f.m3989a((C0921a) this);
        this.f18747g.m3989a((C0921a) this);
        this.f18749i.m3989a((C0921a) this);
        this.f18751k.m3989a((C0921a) this);
        if (this.f18744d == Type.Star) {
            this.f18748h.m3989a((C0921a) this);
            this.f18750j.m3989a((C0921a) this);
        }
    }

    /* renamed from: a */
    public void mo866a() {
        m24818c();
    }

    /* renamed from: c */
    private void m24818c() {
        this.f18753m = false;
        this.f18743c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
        for (list2 = null; list2 < list.size(); list2++) {
            C0917b c0917b = (C0917b) list.get(list2);
            if (c0917b instanceof C3291r) {
                C3291r c3291r = (C3291r) c0917b;
                if (c3291r.m16954c() == ShapeTrimPath.Type.Simultaneously) {
                    this.f18752l = c3291r;
                    this.f18752l.m16951a(this);
                }
            }
        }
    }

    /* renamed from: e */
    public Path mo3887e() {
        if (this.f18753m) {
            return this.f18741a;
        }
        this.f18741a.reset();
        switch (this.f18744d) {
            case Star:
                m24819d();
                break;
            case Polygon:
                m24820f();
                break;
            default:
                break;
        }
        this.f18741a.close();
        C0954f.m4106a(this.f18741a, this.f18752l);
        this.f18753m = true;
        return this.f18741a;
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f18742b;
    }

    /* renamed from: d */
    private void m24819d() {
        float f;
        double d;
        double d2;
        float f2;
        float f3;
        float f4;
        float floatValue = ((Float) this.f18745e.mo871e()).floatValue();
        double toRadians = Math.toRadians((this.f18747g == null ? 0.0d : (double) ((Float) r0.f18747g.mo871e()).floatValue()) - 90.0d);
        double d3 = (double) floatValue;
        Double.isNaN(d3);
        float f5 = (float) (6.283185307179586d / d3);
        float f6 = f5 / 2.0f;
        floatValue -= (float) ((int) floatValue);
        if (floatValue != 0.0f) {
            double d4 = (double) ((1.0f - floatValue) * f6);
            Double.isNaN(d4);
            toRadians += d4;
        }
        float floatValue2 = ((Float) r0.f18749i.mo871e()).floatValue();
        float floatValue3 = ((Float) r0.f18748h.mo871e()).floatValue();
        float floatValue4 = r0.f18750j != null ? ((Float) r0.f18750j.mo871e()).floatValue() / 100.0f : 0.0f;
        float floatValue5 = r0.f18751k != null ? ((Float) r0.f18751k.mo871e()).floatValue() / 100.0f : 0.0f;
        if (floatValue != 0.0f) {
            f = ((floatValue2 - floatValue3) * floatValue) + floatValue3;
            float f7 = floatValue2;
            d = (double) f;
            double cos = Math.cos(toRadians);
            Double.isNaN(d);
            d2 = d3;
            f2 = (float) (d * cos);
            d3 = Math.sin(toRadians);
            Double.isNaN(d);
            f3 = (float) (d * d3);
            r0.f18741a.moveTo(f2, f3);
            d = (double) ((f5 * floatValue) / 2.0f);
            Double.isNaN(d);
            toRadians += d;
            f4 = f7;
        } else {
            d2 = d3;
            f2 = floatValue2;
            d3 = (double) f2;
            d = Math.cos(toRadians);
            Double.isNaN(d3);
            float f8 = (float) (d * d3);
            double sin = Math.sin(toRadians);
            Double.isNaN(d3);
            f3 = (float) (d3 * sin);
            r0.f18741a.moveTo(f8, f3);
            f4 = f2;
            float f9 = f3;
            double d5 = (double) f6;
            Double.isNaN(d5);
            toRadians += d5;
            f2 = f8;
            f3 = f9;
            f = 0.0f;
        }
        d = Math.ceil(d2) * 2.0d;
        int i = 0;
        double d6 = toRadians;
        float f10 = f2;
        float f11 = f3;
        int i2 = 0;
        while (true) {
            d5 = (double) i;
            if (d5 < d) {
                float f12;
                float f13;
                float f14;
                float f15;
                float f16 = i2 != 0 ? f4 : floatValue3;
                float f17 = (f == 0.0f || d5 != d - 2.0d) ? f6 : (f5 * floatValue) / 2.0f;
                if (f == 0.0f || d5 != d - 1.0d) {
                    f12 = f5;
                } else {
                    f12 = f5;
                    f16 = f;
                }
                double d7 = (double) f16;
                double cos2 = Math.cos(d6);
                Double.isNaN(d7);
                float f18 = f;
                float f19 = f17;
                f = (float) (d7 * cos2);
                cos2 = Math.sin(d6);
                Double.isNaN(d7);
                f16 = (float) (d7 * cos2);
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    r0.f18741a.lineTo(f, f16);
                    f13 = floatValue3;
                    f14 = floatValue4;
                    f15 = floatValue5;
                    f2 = f19;
                } else {
                    double d8 = d5;
                    f17 = f11;
                    f13 = floatValue3;
                    f14 = floatValue4;
                    f3 = f10;
                    double atan2 = (double) ((float) (Math.atan2((double) f17, (double) f3) - 1.5707963267948966d));
                    floatValue3 = (float) Math.cos(atan2);
                    f5 = (float) Math.sin(atan2);
                    f15 = floatValue5;
                    float f20 = f3;
                    d5 = (double) ((float) (Math.atan2((double) f16, (double) f) - 1.5707963267948966d));
                    floatValue4 = (float) Math.cos(d5);
                    f2 = (float) Math.sin(d5);
                    f3 = i2 != 0 ? f14 : f15;
                    float f21 = ((i2 != 0 ? f13 : f4) * f3) * 0.47829f;
                    floatValue3 *= f21;
                    f21 *= f5;
                    f9 = ((i2 != 0 ? f4 : f13) * (i2 != 0 ? f15 : f14)) * 0.47829f;
                    floatValue4 *= f9;
                    f9 *= f2;
                    if (floatValue != 0.0f) {
                        if (i == 0) {
                            floatValue3 *= floatValue;
                            f21 *= floatValue;
                        } else if (d8 == d - 1.0d) {
                            floatValue4 *= floatValue;
                            f9 *= floatValue;
                        }
                    }
                    r0.f18741a.cubicTo(f20 - floatValue3, f17 - f21, f + floatValue4, f16 + f9, f, f16);
                    f2 = f19;
                }
                d5 = (double) f2;
                Double.isNaN(d5);
                d6 += d5;
                i2 ^= 1;
                i++;
                f11 = f16;
                f10 = f;
                f5 = f12;
                f = f18;
                floatValue3 = f13;
                floatValue4 = f14;
                floatValue5 = f15;
            } else {
                PointF pointF = (PointF) r0.f18746f.mo871e();
                r0.f18741a.offset(pointF.x, pointF.y);
                r0.f18741a.close();
                return;
            }
        }
    }

    /* renamed from: f */
    private void m24820f() {
        int floor = (int) Math.floor((double) ((Float) this.f18745e.mo871e()).floatValue());
        double toRadians = Math.toRadians((this.f18747g == null ? 0.0d : (double) ((Float) r0.f18747g.mo871e()).floatValue()) - 90.0d);
        double d = (double) floor;
        Double.isNaN(d);
        float f = (float) (6.283185307179586d / d);
        float floatValue = ((Float) r0.f18751k.mo871e()).floatValue() / 100.0f;
        float floatValue2 = ((Float) r0.f18749i.mo871e()).floatValue();
        double d2 = (double) floatValue2;
        double cos = Math.cos(toRadians);
        Double.isNaN(d2);
        float f2 = (float) (cos * d2);
        double sin = Math.sin(toRadians);
        Double.isNaN(d2);
        float f3 = (float) (sin * d2);
        r0.f18741a.moveTo(f2, f3);
        double d3 = (double) f;
        Double.isNaN(d3);
        toRadians += d3;
        d = Math.ceil(d);
        floor = 0;
        while (((double) floor) < d) {
            double d4;
            int i;
            double d5;
            double d6;
            double cos2 = Math.cos(toRadians);
            Double.isNaN(d2);
            float f4 = (float) (cos2 * d2);
            double sin2 = Math.sin(toRadians);
            Double.isNaN(d2);
            double d7 = d;
            float f5 = (float) (d2 * sin2);
            if (floatValue != 0.0f) {
                d4 = d2;
                i = floor;
                d5 = toRadians;
                double atan2 = (double) ((float) (Math.atan2((double) f3, (double) f2) - 1.5707963267948966d));
                d6 = d3;
                double atan22 = (double) ((float) (Math.atan2((double) f5, (double) f4) - 1.5707963267948966d));
                float f6 = (floatValue2 * floatValue) * 0.25f;
                r0.f18741a.cubicTo(f2 - (((float) Math.cos(atan2)) * f6), f3 - (((float) Math.sin(atan2)) * f6), f4 + (((float) Math.cos(atan22)) * f6), f5 + (f6 * ((float) Math.sin(atan22))), f4, f5);
            } else {
                i = floor;
                d5 = toRadians;
                d4 = d2;
                d6 = d3;
                r0.f18741a.lineTo(f4, f5);
            }
            Double.isNaN(d6);
            toRadians = d5 + d6;
            floor = i + 1;
            f3 = f5;
            f2 = f4;
            d = d7;
            d2 = d4;
            d3 = d6;
        }
        PointF pointF = (PointF) r0.f18746f.mo871e();
        r0.f18741a.offset(pointF.x, pointF.y);
        r0.f18741a.close();
    }

    /* renamed from: a */
    public void mo3885a(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
        C0953e.m4097a(c0989e, i, list, c0989e2, this);
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        if (t == C0969i.f3225o) {
            this.f18745e.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3226p) {
            this.f18747g.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3218h) {
            this.f18746f.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3227q && this.f18748h != null) {
            this.f18748h.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3228r) {
            this.f18749i.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3229s && this.f18750j != null) {
            this.f18750j.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3230t) {
            this.f18751k.m3990a((C0961c) c0961c);
        }
    }
}
