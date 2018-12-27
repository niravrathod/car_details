package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C4498h;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C4483p;

/* renamed from: com.airbnb.lottie.model.content.k */
public class C3326k implements C0985b {
    /* renamed from: a */
    private final String f14145a;
    /* renamed from: b */
    private final int f14146b;
    /* renamed from: c */
    private final C4498h f14147c;

    public C3326k(String str, int i, C4498h c4498h) {
        this.f14145a = str;
        this.f14146b = i;
        this.f14147c = c4498h;
    }

    /* renamed from: a */
    public String m17110a() {
        return this.f14145a;
    }

    /* renamed from: b */
    public C4498h m17111b() {
        return this.f14147c;
    }

    /* renamed from: a */
    public C0917b mo878a(C0966f c0966f, C4500a c4500a) {
        return new C4483p(c0966f, c4500a, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapePath{name=");
        stringBuilder.append(this.f14145a);
        stringBuilder.append(", index=");
        stringBuilder.append(this.f14146b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
