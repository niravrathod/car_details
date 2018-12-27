package com.airbnb.lottie.p036d;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.C0981a;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.C0990f;
import com.airbnb.lottie.model.content.C0987h;
import com.airbnb.lottie.p031a.p032a.C3289j;
import java.util.List;

/* renamed from: com.airbnb.lottie.d.e */
public class C0953e {
    /* renamed from: a */
    public static double m4089a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: a */
    public static float m4090a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m4093a(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: c */
    public static boolean m4100c(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: a */
    public static PointF m4095a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: a */
    public static void m4096a(C0987h c0987h, Path path) {
        path.reset();
        PointF a = c0987h.m4257a();
        path.moveTo(a.x, a.y);
        PointF pointF = new PointF(a.x, a.y);
        for (int i = 0; i < c0987h.m4260c().size(); i++) {
            C0981a c0981a = (C0981a) c0987h.m4260c().get(i);
            PointF a2 = c0981a.m4234a();
            PointF b = c0981a.m4236b();
            PointF c = c0981a.m4238c();
            if (a2.equals(pointF) && b.equals(c)) {
                path.lineTo(c.x, c.y);
            } else {
                path.cubicTo(a2.x, a2.y, b.x, b.y, c.x, c.y);
            }
            pointF.set(c.x, c.y);
        }
        if (c0987h.m4259b() != null) {
            path.close();
        }
    }

    /* renamed from: a */
    static int m4091a(float f, float f2) {
        return C0953e.m4092a((int) f, (int) f2);
    }

    /* renamed from: a */
    private static int m4092a(int i, int i2) {
        return i - (i2 * C0953e.m4099b(i, i2));
    }

    /* renamed from: b */
    private static int m4099b(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0 ? 1 : null) != null || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* renamed from: a */
    public static int m4094a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: b */
    public static float m4098b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: a */
    public static void m4097a(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2, C3289j c3289j) {
        if (c0989e.m4271c(c3289j.mo868b(), i) != null) {
            list.add(c0989e2.m4267a(c3289j.mo868b()).m4266a((C0990f) c3289j));
        }
    }
}
