package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C4493b;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C3291r;

public class ShapeTrimPath implements C0985b {
    /* renamed from: a */
    private final String f14100a;
    /* renamed from: b */
    private final Type f14101b;
    /* renamed from: c */
    private final C4493b f14102c;
    /* renamed from: d */
    private final C4493b f14103d;
    /* renamed from: e */
    private final C4493b f14104e;

    public enum Type {
        Simultaneously,
        Individually;

        /* renamed from: a */
        public static Type m4250a(int i) {
            switch (i) {
                case 1:
                    return Simultaneously;
                case 2:
                    return Individually;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown trim path type ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    public ShapeTrimPath(String str, Type type, C4493b c4493b, C4493b c4493b2, C4493b c4493b3) {
        this.f14100a = str;
        this.f14101b = type;
        this.f14102c = c4493b;
        this.f14103d = c4493b2;
        this.f14104e = c4493b3;
    }

    /* renamed from: a */
    public String m17060a() {
        return this.f14100a;
    }

    /* renamed from: b */
    public Type m17061b() {
        return this.f14101b;
    }

    /* renamed from: c */
    public C4493b m17062c() {
        return this.f14103d;
    }

    /* renamed from: d */
    public C4493b m17063d() {
        return this.f14102c;
    }

    /* renamed from: e */
    public C4493b m17064e() {
        return this.f14104e;
    }

    /* renamed from: a */
    public C0917b mo878a(C0966f c0966f, C4500a c4500a) {
        return new C3291r(c4500a, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trim Path: {start: ");
        stringBuilder.append(this.f14102c);
        stringBuilder.append(", end: ");
        stringBuilder.append(this.f14103d);
        stringBuilder.append(", offset: ");
        stringBuilder.append(this.f14104e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
