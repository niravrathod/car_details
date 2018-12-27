package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p037e.C0962d;

/* renamed from: com.airbnb.lottie.c.ac */
public class ac implements aj<C0962d> {
    /* renamed from: a */
    public static final ac f14026a = new ac();

    /* renamed from: b */
    public /* synthetic */ Object mo875b(JsonReader jsonReader, float f) {
        return m16970a(jsonReader, f);
    }

    private ac() {
    }

    /* renamed from: a */
    public C0962d m16970a(JsonReader jsonReader, float f) {
        Object obj = jsonReader.peek() == JsonToken.BEGIN_ARRAY ? 1 : null;
        if (obj != null) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (obj != null) {
            jsonReader.endArray();
        }
        return new C0962d((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
