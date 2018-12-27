package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.p038a.C0979k;
import com.airbnb.lottie.model.p038a.C4492a;
import com.airbnb.lottie.model.p038a.C4493b;
import com.facebook.ads.internal.p084c.C1769a;

/* renamed from: com.airbnb.lottie.c.b */
public class C0930b {
    /* renamed from: a */
    public static C0979k m4030a(JsonReader jsonReader, C0955d c0955d) {
        jsonReader.beginObject();
        C0979k c0979k = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == 97) {
                if (nextName.equals(C1769a.f5340a)) {
                    obj = null;
                }
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else {
                c0979k = C0930b.m4031b(jsonReader, c0955d);
            }
        }
        jsonReader.endObject();
        return c0979k == null ? new C0979k(null, null, null, null) : c0979k;
    }

    /* renamed from: b */
    private static C0979k m4031b(JsonReader jsonReader, C0955d c0955d) {
        jsonReader.beginObject();
        C4492a c4492a = null;
        C4492a c4492a2 = null;
        C4493b c4493b = c4492a2;
        C4493b c4493b2 = c4493b;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 116) {
                if (hashCode != 3261) {
                    if (hashCode != 3664) {
                        if (hashCode == 3684) {
                            if (nextName.equals("sw")) {
                                obj = 2;
                            }
                        }
                    } else if (nextName.equals("sc")) {
                        obj = 1;
                    }
                } else if (nextName.equals("fc")) {
                    obj = null;
                }
            } else if (nextName.equals("t")) {
                obj = 3;
            }
            switch (obj) {
                case null:
                    c4492a = C0932d.m4043g(jsonReader, c0955d);
                    break;
                case 1:
                    c4492a2 = C0932d.m4043g(jsonReader, c0955d);
                    break;
                case 2:
                    c4493b = C0932d.m4033a(jsonReader, c0955d);
                    break;
                case 3:
                    c4493b2 = C0932d.m4033a(jsonReader, c0955d);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C0979k(c4492a, c4492a2, c4493b, c4493b2);
    }
}
