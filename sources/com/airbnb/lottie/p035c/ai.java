package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.p038a.C4493b;
import com.cuvora.carinfo.fragment.C4552m;

/* renamed from: com.airbnb.lottie.c.ai */
class ai {
    /* renamed from: a */
    static ShapeTrimPath m4028a(JsonReader jsonReader, C0955d c0955d) {
        String str = null;
        Type type = str;
        C4493b c4493b = type;
        C4493b c4493b2 = c4493b;
        C4493b c4493b3 = c4493b2;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 101) {
                if (hashCode != 109) {
                    if (hashCode != 111) {
                        if (hashCode != 115) {
                            if (hashCode == 3519) {
                                if (nextName.equals("nm")) {
                                    obj = 3;
                                }
                            }
                        } else if (nextName.equals("s")) {
                            obj = null;
                        }
                    } else if (nextName.equals("o")) {
                        obj = 2;
                    }
                } else if (nextName.equals(C4552m.f18877a)) {
                    obj = 4;
                }
            } else if (nextName.equals("e")) {
                obj = 1;
            }
            switch (obj) {
                case null:
                    c4493b = C0932d.m4034a(jsonReader, c0955d, false);
                    break;
                case 1:
                    c4493b2 = C0932d.m4034a(jsonReader, c0955d, false);
                    break;
                case 2:
                    c4493b3 = C0932d.m4034a(jsonReader, c0955d, false);
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    type = Type.m4250a(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new ShapeTrimPath(str, type, c4493b, c4493b2, c4493b3);
    }
}
