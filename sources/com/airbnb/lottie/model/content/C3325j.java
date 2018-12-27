package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C4475c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.j */
public class C3325j implements C0985b {
    /* renamed from: a */
    private final String f14143a;
    /* renamed from: b */
    private final List<C0985b> f14144b;

    public C3325j(String str, List<C0985b> list) {
        this.f14143a = str;
        this.f14144b = list;
    }

    /* renamed from: a */
    public String m17107a() {
        return this.f14143a;
    }

    /* renamed from: b */
    public List<C0985b> m17108b() {
        return this.f14144b;
    }

    /* renamed from: a */
    public C0917b mo878a(C0966f c0966f, C4500a c4500a) {
        return new C4475c(c0966f, c4500a, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeGroup{name='");
        stringBuilder.append(this.f14143a);
        stringBuilder.append("' Shapes: ");
        stringBuilder.append(Arrays.toString(this.f14144b.toArray()));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
