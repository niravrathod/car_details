package com.airbnb.lottie.p035c;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: com.airbnb.lottie.c.f */
public class C3297f implements aj<Integer> {
    /* renamed from: a */
    public static final C3297f f14028a = new C3297f();

    /* renamed from: b */
    public /* synthetic */ Object mo875b(JsonReader jsonReader, float f) {
        return m16974a(jsonReader, f);
    }

    private C3297f() {
    }

    /* renamed from: a */
    public Integer m16974a(JsonReader jsonReader, float f) {
        f = jsonReader.peek() == JsonToken.BEGIN_ARRAY ? Float.MIN_VALUE : 0.0f;
        if (f != null) {
            jsonReader.beginArray();
        }
        double nextDouble = jsonReader.nextDouble();
        double nextDouble2 = jsonReader.nextDouble();
        double nextDouble3 = jsonReader.nextDouble();
        double nextDouble4 = jsonReader.nextDouble();
        if (f != null) {
            jsonReader.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d && nextDouble4 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            nextDouble4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
