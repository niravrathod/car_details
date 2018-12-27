package com.airbnb.lottie.p035c;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: com.airbnb.lottie.c.y */
public class C3303y implements aj<PointF> {
    /* renamed from: a */
    public static final C3303y f14034a = new C3303y();

    /* renamed from: b */
    public /* synthetic */ Object mo875b(JsonReader jsonReader, float f) {
        return m16988a(jsonReader, f);
    }

    private C3303y() {
    }

    /* renamed from: a */
    public PointF m16988a(JsonReader jsonReader, float f) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return C0940p.m4053b(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return C0940p.m4053b(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext() != null) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        f = new StringBuilder();
        f.append("Cannot convert json to point. Next token is ");
        f.append(peek);
        throw new IllegalArgumentException(f.toString());
    }
}
