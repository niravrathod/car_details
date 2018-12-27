package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.content.C3323g;
import com.airbnb.lottie.model.p038a.C3317l;
import com.airbnb.lottie.model.p038a.C4493b;

/* renamed from: com.airbnb.lottie.c.ab */
class ab {
    /* renamed from: a */
    static C3323g m4023a(JsonReader jsonReader, C0955d c0955d) {
        String str = null;
        C4493b c4493b = null;
        C4493b c4493b2 = c4493b;
        C3317l c3317l = c4493b2;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 111) {
                    if (hashCode != 3519) {
                        if (hashCode == 3710) {
                            if (nextName.equals("tr")) {
                                obj = 3;
                            }
                        }
                    } else if (nextName.equals("nm")) {
                        obj = null;
                    }
                } else if (nextName.equals("o")) {
                    obj = 2;
                }
            } else if (nextName.equals("c")) {
                obj = 1;
            }
            switch (obj) {
                case null:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    c4493b = C0932d.m4034a(jsonReader, c0955d, false);
                    break;
                case 2:
                    c4493b2 = C0932d.m4034a(jsonReader, c0955d, false);
                    break;
                case 3:
                    c3317l = C0931c.m4032a(jsonReader, c0955d);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C3323g(str, c4493b, c4493b2, c3317l);
    }
}
