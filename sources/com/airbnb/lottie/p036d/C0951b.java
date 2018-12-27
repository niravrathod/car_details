package com.airbnb.lottie.p036d;

/* renamed from: com.airbnb.lottie.d.b */
public class C0951b {
    /* renamed from: a */
    private static float m4085a(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: b */
    private static float m4087b(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: a */
    public static int m4086a(float f, int i, int i2) {
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float f3 = ((float) ((i >> 8) & 255)) / 255.0f;
        i = ((float) (i & 255)) / 1132396544;
        float f4 = ((float) ((i2 >> 24) & 255)) / 255.0f;
        float f5 = ((float) ((i2 >> 16) & 255)) / 255.0f;
        float f6 = ((float) ((i2 >> 8) & 255)) / 255.0f;
        i2 = ((float) (i2 & 255)) / 1132396544;
        float b = C0951b.m4087b(((float) ((i >> 16) & 255)) / 255.0f);
        f3 = C0951b.m4087b(f3);
        i = C0951b.m4087b(i);
        f5 = C0951b.m4087b(f5);
        f3 += (C0951b.m4087b(f6) - f3) * f;
        i += f * (C0951b.m4087b(i2) - i);
        f2 = (f2 + ((f4 - f2) * f)) * 255.0f;
        return (((Math.round(C0951b.m4085a(b + ((f5 - b) * f)) * 255.0f) << 16) | (Math.round(f2) << 24)) | (Math.round(C0951b.m4085a(f3) * 1132396544) << 8)) | Math.round(C0951b.m4085a(i) * 1132396544);
    }
}
