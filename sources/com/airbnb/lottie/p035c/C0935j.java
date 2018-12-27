package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.C0988d;
import com.airbnb.lottie.model.content.C3325j;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.j */
class C0935j {
    /* renamed from: a */
    static C0988d m4046a(JsonReader jsonReader, C0955d c0955d) {
        List arrayList = new ArrayList();
        jsonReader.beginObject();
        String str = null;
        String str2 = str;
        double d = 0.0d;
        double d2 = d;
        char c = '\u0000';
        while (jsonReader.hasNext()) {
            Object obj;
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == -1866931350) {
                if (nextName.equals("fFamily")) {
                    obj = 4;
                    switch (obj) {
                        case null:
                            c = jsonReader.nextString().charAt(0);
                            break;
                        case 1:
                            d = jsonReader.nextDouble();
                            break;
                        case 2:
                            d2 = jsonReader.nextDouble();
                            break;
                        case 3:
                            str = jsonReader.nextString();
                            break;
                        case 4:
                            str2 = jsonReader.nextString();
                            break;
                        case 5:
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                if ("shapes".equals(jsonReader.nextName())) {
                                    jsonReader.skipValue();
                                } else {
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add((C3325j) C0934g.m4045a(jsonReader, c0955d));
                                    }
                                    jsonReader.endArray();
                                }
                            }
                            jsonReader.endObject();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 119) {
                if (nextName.equals("w")) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            c = jsonReader.nextString().charAt(0);
                            break;
                        case 1:
                            d = jsonReader.nextDouble();
                            break;
                        case 2:
                            d2 = jsonReader.nextDouble();
                            break;
                        case 3:
                            str = jsonReader.nextString();
                            break;
                        case 4:
                            str2 = jsonReader.nextString();
                            break;
                        case 5:
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                if ("shapes".equals(jsonReader.nextName())) {
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add((C3325j) C0934g.m4045a(jsonReader, c0955d));
                                    }
                                    jsonReader.endArray();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 3173) {
                if (nextName.equals("ch")) {
                    obj = null;
                    switch (obj) {
                        case null:
                            c = jsonReader.nextString().charAt(0);
                            break;
                        case 1:
                            d = jsonReader.nextDouble();
                            break;
                        case 2:
                            d2 = jsonReader.nextDouble();
                            break;
                        case 3:
                            str = jsonReader.nextString();
                            break;
                        case 4:
                            str2 = jsonReader.nextString();
                            break;
                        case 5:
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                if ("shapes".equals(jsonReader.nextName())) {
                                    jsonReader.skipValue();
                                } else {
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add((C3325j) C0934g.m4045a(jsonReader, c0955d));
                                    }
                                    jsonReader.endArray();
                                }
                            }
                            jsonReader.endObject();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 3076010) {
                if (nextName.equals("data")) {
                    obj = 5;
                    switch (obj) {
                        case null:
                            c = jsonReader.nextString().charAt(0);
                            break;
                        case 1:
                            d = jsonReader.nextDouble();
                            break;
                        case 2:
                            d2 = jsonReader.nextDouble();
                            break;
                        case 3:
                            str = jsonReader.nextString();
                            break;
                        case 4:
                            str2 = jsonReader.nextString();
                            break;
                        case 5:
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                if ("shapes".equals(jsonReader.nextName())) {
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add((C3325j) C0934g.m4045a(jsonReader, c0955d));
                                    }
                                    jsonReader.endArray();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 3530753) {
                if (nextName.equals("size")) {
                    obj = 1;
                    switch (obj) {
                        case null:
                            c = jsonReader.nextString().charAt(0);
                            break;
                        case 1:
                            d = jsonReader.nextDouble();
                            break;
                        case 2:
                            d2 = jsonReader.nextDouble();
                            break;
                        case 3:
                            str = jsonReader.nextString();
                            break;
                        case 4:
                            str2 = jsonReader.nextString();
                            break;
                        case 5:
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                if ("shapes".equals(jsonReader.nextName())) {
                                    jsonReader.skipValue();
                                } else {
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add((C3325j) C0934g.m4045a(jsonReader, c0955d));
                                    }
                                    jsonReader.endArray();
                                }
                            }
                            jsonReader.endObject();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 109780401) {
                if (nextName.equals(FacebookAdapter.KEY_STYLE)) {
                    obj = 3;
                    switch (obj) {
                        case null:
                            c = jsonReader.nextString().charAt(0);
                            break;
                        case 1:
                            d = jsonReader.nextDouble();
                            break;
                        case 2:
                            d2 = jsonReader.nextDouble();
                            break;
                        case 3:
                            str = jsonReader.nextString();
                            break;
                        case 4:
                            str2 = jsonReader.nextString();
                            break;
                        case 5:
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                if ("shapes".equals(jsonReader.nextName())) {
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add((C3325j) C0934g.m4045a(jsonReader, c0955d));
                                    }
                                    jsonReader.endArray();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
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
                    c = jsonReader.nextString().charAt(0);
                    break;
                case 1:
                    d = jsonReader.nextDouble();
                    break;
                case 2:
                    d2 = jsonReader.nextDouble();
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    str2 = jsonReader.nextString();
                    break;
                case 5:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if ("shapes".equals(jsonReader.nextName())) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add((C3325j) C0934g.m4045a(jsonReader, c0955d));
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C0988d(arrayList, c, d, d2, str, str2);
    }
}
