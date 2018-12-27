package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.PolystarShape.Type;
import com.airbnb.lottie.model.p038a.C0980m;
import com.airbnb.lottie.model.p038a.C4493b;

/* renamed from: com.airbnb.lottie.c.z */
class C0948z {
    /* renamed from: a */
    static PolystarShape m4075a(JsonReader jsonReader, C0955d c0955d) {
        String str = null;
        Type type = str;
        C4493b c4493b = type;
        C0980m c0980m = c4493b;
        C4493b c4493b2 = c0980m;
        C4493b c4493b3 = c4493b2;
        C4493b c4493b4 = c4493b3;
        C4493b c4493b5 = c4493b4;
        C4493b c4493b6 = c4493b5;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals("p")) {
                        obj = 3;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        obj = 4;
                        break;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        obj = 7;
                        break;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        obj = 8;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        obj = null;
                        break;
                    }
                    break;
                case 3555:
                    if (nextName.equals("or")) {
                        obj = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        obj = 6;
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        obj = 2;
                        break;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        obj = 1;
                        break;
                    }
                    break;
                default:
                    break;
            }
            switch (obj) {
                case null:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    type = Type.m4247a(jsonReader.nextInt());
                    break;
                case 2:
                    c4493b = C0932d.m4034a(jsonReader, c0955d, false);
                    break;
                case 3:
                    c0980m = C0929a.m4021b(jsonReader, c0955d);
                    break;
                case 4:
                    c4493b2 = C0932d.m4034a(jsonReader, c0955d, false);
                    break;
                case 5:
                    c4493b4 = C0932d.m4033a(jsonReader, c0955d);
                    break;
                case 6:
                    c4493b6 = C0932d.m4034a(jsonReader, c0955d, false);
                    break;
                case 7:
                    c4493b3 = C0932d.m4033a(jsonReader, c0955d);
                    break;
                case 8:
                    c4493b5 = C0932d.m4034a(jsonReader, c0955d, false);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new PolystarShape(str, type, c4493b, c0980m, c4493b2, c4493b3, c4493b4, c4493b5, c4493b6);
    }
}
