package com.airbnb.lottie.p035c;

import android.graphics.Path.FillType;
import android.util.JsonReader;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.content.C3324i;
import com.airbnb.lottie.model.p038a.C4492a;
import com.airbnb.lottie.model.p038a.C4495d;

/* renamed from: com.airbnb.lottie.c.ae */
class ae {
    /* renamed from: a */
    static C3324i m4024a(JsonReader jsonReader, C0955d c0955d) {
        String str = null;
        C4492a c4492a = str;
        C4495d c4495d = c4492a;
        int i = 1;
        boolean z = false;
        while (jsonReader.hasNext()) {
            Object obj;
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == -396065730) {
                if (nextName.equals("fillEnabled")) {
                    obj = 3;
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            c4492a = C0932d.m4043g(jsonReader, c0955d);
                            break;
                        case 2:
                            c4495d = C0932d.m4038b(jsonReader, c0955d);
                            break;
                        case 3:
                            z = jsonReader.nextBoolean();
                            break;
                        case 4:
                            i = jsonReader.nextInt();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 99) {
                if (nextName.equals("c")) {
                    obj = 1;
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            c4492a = C0932d.m4043g(jsonReader, c0955d);
                            break;
                        case 2:
                            c4495d = C0932d.m4038b(jsonReader, c0955d);
                            break;
                        case 3:
                            z = jsonReader.nextBoolean();
                            break;
                        case 4:
                            i = jsonReader.nextInt();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 111) {
                if (nextName.equals("o")) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            c4492a = C0932d.m4043g(jsonReader, c0955d);
                            break;
                        case 2:
                            c4495d = C0932d.m4038b(jsonReader, c0955d);
                            break;
                        case 3:
                            z = jsonReader.nextBoolean();
                            break;
                        case 4:
                            i = jsonReader.nextInt();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 114) {
                if (nextName.equals("r")) {
                    obj = 4;
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            c4492a = C0932d.m4043g(jsonReader, c0955d);
                            break;
                        case 2:
                            c4495d = C0932d.m4038b(jsonReader, c0955d);
                            break;
                        case 3:
                            z = jsonReader.nextBoolean();
                            break;
                        case 4:
                            i = jsonReader.nextInt();
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
                            c4492a = C0932d.m4043g(jsonReader, c0955d);
                            break;
                        case 2:
                            c4495d = C0932d.m4038b(jsonReader, c0955d);
                            break;
                        case 3:
                            z = jsonReader.nextBoolean();
                            break;
                        case 4:
                            i = jsonReader.nextInt();
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
                    c4492a = C0932d.m4043g(jsonReader, c0955d);
                    break;
                case 2:
                    c4495d = C0932d.m4038b(jsonReader, c0955d);
                    break;
                case 3:
                    z = jsonReader.nextBoolean();
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C3324i(str, z, i == 1 ? FillType.WINDING : FillType.EVEN_ODD, c4492a, c4495d);
    }
}
