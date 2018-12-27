package com.airbnb.lottie.model.content;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C4492a;
import com.airbnb.lottie.model.p038a.C4493b;
import com.airbnb.lottie.model.p038a.C4495d;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C4771q;
import java.util.List;

public class ShapeStroke implements C0985b {
    /* renamed from: a */
    private final String f14091a;
    /* renamed from: b */
    private final C4493b f14092b;
    /* renamed from: c */
    private final List<C4493b> f14093c;
    /* renamed from: d */
    private final C4492a f14094d;
    /* renamed from: e */
    private final C4495d f14095e;
    /* renamed from: f */
    private final C4493b f14096f;
    /* renamed from: g */
    private final LineCapType f14097g;
    /* renamed from: h */
    private final LineJoinType f14098h;
    /* renamed from: i */
    private final float f14099i;

    public enum LineCapType {
        Butt,
        Round,
        Unknown;

        /* renamed from: a */
        public Cap m4248a() {
            switch (this) {
                case Butt:
                    return Cap.BUTT;
                case Round:
                    return Cap.ROUND;
                default:
                    return Cap.SQUARE;
            }
        }
    }

    public enum LineJoinType {
        Miter,
        Round,
        Bevel;

        /* renamed from: a */
        public Join m4249a() {
            switch (this) {
                case Bevel:
                    return Join.BEVEL;
                case Miter:
                    return Join.MITER;
                case Round:
                    return Join.ROUND;
                default:
                    return null;
            }
        }
    }

    public ShapeStroke(String str, C4493b c4493b, List<C4493b> list, C4492a c4492a, C4495d c4495d, C4493b c4493b2, LineCapType lineCapType, LineJoinType lineJoinType, float f) {
        this.f14091a = str;
        this.f14092b = c4493b;
        this.f14093c = list;
        this.f14094d = c4492a;
        this.f14095e = c4495d;
        this.f14096f = c4493b2;
        this.f14097g = lineCapType;
        this.f14098h = lineJoinType;
        this.f14099i = f;
    }

    /* renamed from: a */
    public C0917b mo878a(C0966f c0966f, C4500a c4500a) {
        return new C4771q(c0966f, c4500a, this);
    }

    /* renamed from: a */
    public String m17050a() {
        return this.f14091a;
    }

    /* renamed from: b */
    public C4492a m17051b() {
        return this.f14094d;
    }

    /* renamed from: c */
    public C4495d m17052c() {
        return this.f14095e;
    }

    /* renamed from: d */
    public C4493b m17053d() {
        return this.f14096f;
    }

    /* renamed from: e */
    public List<C4493b> m17054e() {
        return this.f14093c;
    }

    /* renamed from: f */
    public C4493b m17055f() {
        return this.f14092b;
    }

    /* renamed from: g */
    public LineCapType m17056g() {
        return this.f14097g;
    }

    /* renamed from: h */
    public LineJoinType m17057h() {
        return this.f14098h;
    }

    /* renamed from: i */
    public float m17058i() {
        return this.f14099i;
    }
}
