package com.airbnb.lottie.p036d;

/* renamed from: com.airbnb.lottie.d.d */
public class C0952d {
    /* renamed from: a */
    private float f3138a;
    /* renamed from: b */
    private int f3139b;

    /* renamed from: a */
    public void m4088a(float f) {
        this.f3138a += f;
        this.f3139b++;
        if (this.f3139b == Integer.MAX_VALUE) {
            this.f3138a /= 2.0f;
            this.f3139b /= 2;
        }
    }
}
