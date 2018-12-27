package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.content.C0985b;
import com.airbnb.lottie.model.content.C3325j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.af */
class af {
    /* renamed from: a */
    static C3325j m4025a(JsonReader jsonReader, C0955d c0955d) {
        List arrayList = new ArrayList();
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 3371) {
                if (hashCode == 3519) {
                    if (nextName.equals("nm")) {
                        obj = null;
                    }
                }
            } else if (nextName.equals("it")) {
                obj = 1;
            }
            switch (obj) {
                case null:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        C0985b a = C0934g.m4045a(jsonReader, c0955d);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C3325j(str, arrayList);
    }
}
