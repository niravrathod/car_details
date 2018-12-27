package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.content.C3322f;
import com.airbnb.lottie.model.p038a.C0980m;
import com.airbnb.lottie.model.p038a.C4493b;
import com.airbnb.lottie.model.p038a.C4496f;

/* renamed from: com.airbnb.lottie.c.aa */
class aa {
    /* renamed from: a */
    static C3322f m4022a(JsonReader jsonReader, C0955d c0955d) {
        String str = null;
        C0980m c0980m = null;
        C4496f c4496f = c0980m;
        C4493b c4493b = c4496f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 112) {
                if (hashCode != 3519) {
                    switch (hashCode) {
                        case 114:
                            if (nextName.equals("r")) {
                                obj = 3;
                                break;
                            }
                            break;
                        case 115:
                            if (nextName.equals("s")) {
                                obj = 2;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                } else if (nextName.equals("nm")) {
                    obj = null;
                }
            } else if (nextName.equals("p")) {
                obj = 1;
            }
            switch (obj) {
                case null:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    c0980m = C0929a.m4021b(jsonReader, c0955d);
                    break;
                case 2:
                    c4496f = C0932d.m4039c(jsonReader, c0955d);
                    break;
                case 3:
                    c4493b = C0932d.m4033a(jsonReader, c0955d);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C3322f(str, c0980m, c4496f, c4493b);
    }
}
