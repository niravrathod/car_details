package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.content.C3326k;
import com.airbnb.lottie.model.p038a.C4498h;

/* renamed from: com.airbnb.lottie.c.ag */
class ag {
    /* renamed from: a */
    static C3326k m4026a(JsonReader jsonReader, C0955d c0955d) {
        String str = null;
        C4498h c4498h = null;
        int i = 0;
        while (jsonReader.hasNext()) {
            Object obj;
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 3432) {
                if (nextName.equals("ks")) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            i = jsonReader.nextInt();
                            break;
                        case 2:
                            c4498h = C0932d.m4041e(jsonReader, c0955d);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 3519) {
                if (nextName.equals("nm")) {
                    obj = null;
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            i = jsonReader.nextInt();
                            break;
                        case 2:
                            c4498h = C0932d.m4041e(jsonReader, c0955d);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 104415) {
                if (nextName.equals("ind")) {
                    obj = 1;
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            i = jsonReader.nextInt();
                            break;
                        case 2:
                            c4498h = C0932d.m4041e(jsonReader, c0955d);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            }
            obj = -1;
            switch (obj) {
                case null:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    i = jsonReader.nextInt();
                    break;
                case 2:
                    c4498h = C0932d.m4041e(jsonReader, c0955d);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C3326k(str, i, c4498h);
    }
}
