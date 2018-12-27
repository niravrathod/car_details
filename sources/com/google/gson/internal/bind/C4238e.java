package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.internal.bind.e */
public final class C4238e extends C2660q<Object> {
    /* renamed from: a */
    public static final C2661r f17876a = new ObjectTypeAdapter$1();
    /* renamed from: b */
    private final C2629e f17877b;

    C4238e(C2629e c2629e) {
        this.f17877b = c2629e;
    }

    /* renamed from: b */
    public Object mo3332b(JsonReader jsonReader) {
        switch (jsonReader.peek()) {
            case BEGIN_ARRAY:
                List arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(mo3332b(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            case BEGIN_OBJECT:
                Map linkedTreeMap = new LinkedTreeMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    linkedTreeMap.put(jsonReader.nextName(), mo3332b(jsonReader));
                }
                jsonReader.endObject();
                return linkedTreeMap;
            case STRING:
                return jsonReader.nextString();
            case NUMBER:
                return Double.valueOf(jsonReader.nextDouble());
            case BOOLEAN:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case NULL:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo3331a(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        C2660q a = this.f17877b.m12875a(obj.getClass());
        if (a instanceof C4238e) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        a.mo3331a(jsonWriter, obj);
    }
}
