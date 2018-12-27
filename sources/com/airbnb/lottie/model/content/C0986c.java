package com.airbnb.lottie.model.content;

import com.airbnb.lottie.p036d.C0951b;
import com.airbnb.lottie.p036d.C0953e;

/* renamed from: com.airbnb.lottie.model.content.c */
public class C0986c {
    /* renamed from: a */
    private final float[] f3305a;
    /* renamed from: b */
    private final int[] f3306b;

    public C0986c(float[] fArr, int[] iArr) {
        this.f3305a = fArr;
        this.f3306b = iArr;
    }

    /* renamed from: a */
    public float[] m4253a() {
        return this.f3305a;
    }

    /* renamed from: b */
    public int[] m4254b() {
        return this.f3306b;
    }

    /* renamed from: c */
    public int m4255c() {
        return this.f3306b.length;
    }

    /* renamed from: a */
    public void m4252a(C0986c c0986c, C0986c c0986c2, float f) {
        if (c0986c.f3306b.length == c0986c2.f3306b.length) {
            for (int i = 0; i < c0986c.f3306b.length; i++) {
                this.f3305a[i] = C0953e.m4090a(c0986c.f3305a[i], c0986c2.f3305a[i], f);
                this.f3306b[i] = C0951b.m4086a(f, c0986c.f3306b[i], c0986c2.f3306b[i]);
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot interpolate between gradients. Lengths vary (");
        stringBuilder.append(c0986c.f3306b.length);
        stringBuilder.append(" vs ");
        stringBuilder.append(c0986c2.f3306b.length);
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
