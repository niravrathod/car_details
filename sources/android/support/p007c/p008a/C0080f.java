package android.support.p007c.p008a;

import android.animation.TypeEvaluator;

/* renamed from: android.support.c.a.f */
public class C0080f implements TypeEvaluator {
    /* renamed from: a */
    private static final C0080f f101a = new C0080f();

    /* renamed from: a */
    public static C0080f m165a() {
        return f101a;
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        obj = ((Integer) obj).intValue();
        float f2 = ((float) ((obj >> 24) & 255)) / 255.0f;
        float f3 = ((float) ((obj >> 16) & 255)) / 255.0f;
        float f4 = ((float) ((obj >> 8) & 255)) / 255.0f;
        obj = ((float) (obj & 255)) / 1132396544;
        obj2 = ((Integer) obj2).intValue();
        float f5 = ((float) ((obj2 >> 24) & 255)) / 255.0f;
        float f6 = ((float) ((obj2 >> 16) & 255)) / 255.0f;
        float f7 = ((float) ((obj2 >> 8) & 255)) / 255.0f;
        f3 = (float) Math.pow((double) f3, 2.2d);
        f4 = (float) Math.pow((double) f4, 2.2d);
        obj = (float) Math.pow((double) obj, 2.2d);
        f4 += (((float) Math.pow((double) f7, 2.2d)) - f4) * f;
        obj += f * (((float) Math.pow((double) (((float) (obj2 & 255)) / 1132396544), 2.2d)) - obj);
        f2 = (f2 + ((f5 - f2) * f)) * 255.0f;
        return Integer.valueOf((((Math.round(((float) Math.pow((double) (f3 + ((((float) Math.pow((double) f6, 2.2d)) - f3) * f)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f2) << 24)) | (Math.round(((float) Math.pow((double) f4, 0.45454545454545453d)) * 1132396544) << 8)) | Math.round(((float) Math.pow((double) obj, 0.45454545454545453d)) * 1132396544));
    }
}
