package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C0980m;
import com.airbnb.lottie.model.p038a.C4493b;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C4480m;

public class PolystarShape implements C0985b {
    /* renamed from: a */
    private final String f14082a;
    /* renamed from: b */
    private final Type f14083b;
    /* renamed from: c */
    private final C4493b f14084c;
    /* renamed from: d */
    private final C0980m<PointF, PointF> f14085d;
    /* renamed from: e */
    private final C4493b f14086e;
    /* renamed from: f */
    private final C4493b f14087f;
    /* renamed from: g */
    private final C4493b f14088g;
    /* renamed from: h */
    private final C4493b f14089h;
    /* renamed from: i */
    private final C4493b f14090i;

    public enum Type {
        Star(1),
        Polygon(2);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        /* renamed from: a */
        public static Type m4247a(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return 0;
        }
    }

    public PolystarShape(String str, Type type, C4493b c4493b, C0980m<PointF, PointF> c0980m, C4493b c4493b2, C4493b c4493b3, C4493b c4493b4, C4493b c4493b5, C4493b c4493b6) {
        this.f14082a = str;
        this.f14083b = type;
        this.f14084c = c4493b;
        this.f14085d = c0980m;
        this.f14086e = c4493b2;
        this.f14087f = c4493b3;
        this.f14088g = c4493b4;
        this.f14089h = c4493b5;
        this.f14090i = c4493b6;
    }

    /* renamed from: a */
    public String m17040a() {
        return this.f14082a;
    }

    /* renamed from: b */
    public Type m17041b() {
        return this.f14083b;
    }

    /* renamed from: c */
    public C4493b m17042c() {
        return this.f14084c;
    }

    /* renamed from: d */
    public C0980m<PointF, PointF> m17043d() {
        return this.f14085d;
    }

    /* renamed from: e */
    public C4493b m17044e() {
        return this.f14086e;
    }

    /* renamed from: f */
    public C4493b m17045f() {
        return this.f14087f;
    }

    /* renamed from: g */
    public C4493b m17046g() {
        return this.f14088g;
    }

    /* renamed from: h */
    public C4493b m17047h() {
        return this.f14089h;
    }

    /* renamed from: i */
    public C4493b m17048i() {
        return this.f14090i;
    }

    /* renamed from: a */
    public C0917b mo878a(C0966f c0966f, C4500a c4500a) {
        return new C4480m(c0966f, c4500a, this);
    }
}
