package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C0949c;
import com.airbnb.lottie.model.C0981a;
import com.airbnb.lottie.p036d.C0953e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.h */
public class C0987h {
    /* renamed from: a */
    private final List<C0981a> f3307a = new ArrayList();
    /* renamed from: b */
    private PointF f3308b;
    /* renamed from: c */
    private boolean f3309c;

    public C0987h(PointF pointF, boolean z, List<C0981a> list) {
        this.f3308b = pointF;
        this.f3309c = z;
        this.f3307a.addAll(list);
    }

    /* renamed from: a */
    private void m4256a(float f, float f2) {
        if (this.f3308b == null) {
            this.f3308b = new PointF();
        }
        this.f3308b.set(f, f2);
    }

    /* renamed from: a */
    public PointF m4257a() {
        return this.f3308b;
    }

    /* renamed from: b */
    public boolean m4259b() {
        return this.f3309c;
    }

    /* renamed from: c */
    public List<C0981a> m4260c() {
        return this.f3307a;
    }

    /* renamed from: a */
    public void m4258a(C0987h c0987h, C0987h c0987h2, float f) {
        boolean z;
        int min;
        int i;
        PointF a;
        PointF a2;
        if (this.f3308b == null) {
            this.f3308b = new PointF();
        }
        if (!c0987h.m4259b()) {
            if (!c0987h2.m4259b()) {
                z = false;
                this.f3309c = z;
                if (c0987h.m4260c().size() != c0987h2.m4260c().size()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Curves must have the same number of control points. Shape 1: ");
                    stringBuilder.append(c0987h.m4260c().size());
                    stringBuilder.append("\tShape 2: ");
                    stringBuilder.append(c0987h2.m4260c().size());
                    C0949c.m4077b(stringBuilder.toString());
                }
                if (this.f3307a.isEmpty()) {
                    min = Math.min(c0987h.m4260c().size(), c0987h2.m4260c().size());
                    for (i = 0; i < min; i++) {
                        this.f3307a.add(new C0981a());
                    }
                }
                a = c0987h.m4257a();
                a2 = c0987h2.m4257a();
                m4256a(C0953e.m4090a(a.x, a2.x, f), C0953e.m4090a(a.y, a2.y, f));
                for (min = this.f3307a.size() - 1; min >= 0; min--) {
                    C0981a c0981a = (C0981a) c0987h.m4260c().get(min);
                    C0981a c0981a2 = (C0981a) c0987h2.m4260c().get(min);
                    PointF a3 = c0981a.m4234a();
                    PointF b = c0981a.m4236b();
                    a2 = c0981a.m4238c();
                    PointF a4 = c0981a2.m4234a();
                    PointF b2 = c0981a2.m4236b();
                    PointF c = c0981a2.m4238c();
                    ((C0981a) this.f3307a.get(min)).m4235a(C0953e.m4090a(a3.x, a4.x, f), C0953e.m4090a(a3.y, a4.y, f));
                    ((C0981a) this.f3307a.get(min)).m4237b(C0953e.m4090a(b.x, b2.x, f), C0953e.m4090a(b.y, b2.y, f));
                    ((C0981a) this.f3307a.get(min)).m4239c(C0953e.m4090a(a2.x, c.x, f), C0953e.m4090a(a2.y, c.y, f));
                }
            }
        }
        z = true;
        this.f3309c = z;
        if (c0987h.m4260c().size() != c0987h2.m4260c().size()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Curves must have the same number of control points. Shape 1: ");
            stringBuilder2.append(c0987h.m4260c().size());
            stringBuilder2.append("\tShape 2: ");
            stringBuilder2.append(c0987h2.m4260c().size());
            C0949c.m4077b(stringBuilder2.toString());
        }
        if (this.f3307a.isEmpty()) {
            min = Math.min(c0987h.m4260c().size(), c0987h2.m4260c().size());
            for (i = 0; i < min; i++) {
                this.f3307a.add(new C0981a());
            }
        }
        a = c0987h.m4257a();
        a2 = c0987h2.m4257a();
        m4256a(C0953e.m4090a(a.x, a2.x, f), C0953e.m4090a(a.y, a2.y, f));
        for (min = this.f3307a.size() - 1; min >= 0; min--) {
            C0981a c0981a3 = (C0981a) c0987h.m4260c().get(min);
            C0981a c0981a22 = (C0981a) c0987h2.m4260c().get(min);
            PointF a32 = c0981a3.m4234a();
            PointF b3 = c0981a3.m4236b();
            a2 = c0981a3.m4238c();
            PointF a42 = c0981a22.m4234a();
            PointF b22 = c0981a22.m4236b();
            PointF c2 = c0981a22.m4238c();
            ((C0981a) this.f3307a.get(min)).m4235a(C0953e.m4090a(a32.x, a42.x, f), C0953e.m4090a(a32.y, a42.y, f));
            ((C0981a) this.f3307a.get(min)).m4237b(C0953e.m4090a(b3.x, b22.x, f), C0953e.m4090a(b3.y, b22.y, f));
            ((C0981a) this.f3307a.get(min)).m4239c(C0953e.m4090a(a2.x, c2.x, f), C0953e.m4090a(a2.y, c2.y, f));
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeData{numCurves=");
        stringBuilder.append(this.f3307a.size());
        stringBuilder.append("closed=");
        stringBuilder.append(this.f3309c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
