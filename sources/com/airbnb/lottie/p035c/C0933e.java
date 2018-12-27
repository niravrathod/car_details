package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.content.C3319a;
import com.airbnb.lottie.model.p038a.C4496f;

/* renamed from: com.airbnb.lottie.c.e */
class C0933e {
    /* renamed from: a */
    static C3319a m4044a(JsonReader jsonReader, C0955d c0955d, int i) {
        String str = null;
        boolean z = i == 3;
        i = 0;
        C4496f c4496f = i;
        while (jsonReader.hasNext()) {
            Object obj;
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 100) {
                if (nextName.equals("d")) {
                    obj = 3;
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            i = C0929a.m4021b(jsonReader, c0955d);
                            break;
                        case 2:
                            c4496f = C0932d.m4039c(jsonReader, c0955d);
                            break;
                        case 3:
                            if (jsonReader.nextInt() != 3) {
                                z = true;
                                break;
                            }
                            z = false;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 112) {
                if (nextName.equals("p")) {
                    obj = 1;
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            i = C0929a.m4021b(jsonReader, c0955d);
                            break;
                        case 2:
                            c4496f = C0932d.m4039c(jsonReader, c0955d);
                            break;
                        case 3:
                            if (jsonReader.nextInt() != 3) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 115) {
                if (nextName.equals("s")) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            i = C0929a.m4021b(jsonReader, c0955d);
                            break;
                        case 2:
                            c4496f = C0932d.m4039c(jsonReader, c0955d);
                            break;
                        case 3:
                            if (jsonReader.nextInt() != 3) {
                                z = true;
                                break;
                            }
                            z = false;
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
                            i = C0929a.m4021b(jsonReader, c0955d);
                            break;
                        case 2:
                            c4496f = C0932d.m4039c(jsonReader, c0955d);
                            break;
                        case 3:
                            if (jsonReader.nextInt() != 3) {
                                z = false;
                                break;
                            }
                            z = true;
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
                    i = C0929a.m4021b(jsonReader, c0955d);
                    break;
                case 2:
                    c4496f = C0932d.m4039c(jsonReader, c0955d);
                    break;
                case 3:
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C3319a(str, i, c4496f, z);
    }
}
