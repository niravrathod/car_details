package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.p037e.C0959a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.r */
class C0942r {
    /* renamed from: a */
    static <T> List<C0959a<T>> m4063a(JsonReader jsonReader, C0955d c0955d, float f, aj<T> ajVar) {
        List<C0959a<T>> arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            c0955d.m4112a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == 107) {
                if (nextName.equals("k")) {
                    obj = null;
                }
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(C0941q.m4059a(jsonReader, c0955d, f, ajVar, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C0941q.m4059a(jsonReader, c0955d, f, ajVar, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C0941q.m4059a(jsonReader, c0955d, f, ajVar, false));
            }
        }
        jsonReader.endObject();
        C0942r.m4064a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static void m4064a(List<? extends C0959a<?>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C0959a c0959a = (C0959a) list.get(i2);
            i2++;
            c0959a.f3168e = Float.valueOf(((C0959a) list.get(i2)).f3167d);
        }
        C0959a c0959a2 = (C0959a) list.get(i);
        if (c0959a2.f3164a == null) {
            list.remove(c0959a2);
        }
    }
}
