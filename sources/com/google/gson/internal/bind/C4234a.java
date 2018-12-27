package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.gson.internal.bind.a */
public final class C4234a<E> extends C2660q<Object> {
    /* renamed from: a */
    public static final C2661r f17860a = new ArrayTypeAdapter$1();
    /* renamed from: b */
    private final Class<E> f17861b;
    /* renamed from: c */
    private final C2660q<E> f17862c;

    public C4234a(C2629e c2629e, C2660q<E> c2660q, Class<E> cls) {
        this.f17862c = new C4241h(c2629e, c2660q, cls);
        this.f17861b = cls;
    }

    /* renamed from: b */
    public Object mo3332b(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        List arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f17862c.mo3332b(jsonReader));
        }
        jsonReader.endArray();
        jsonReader = arrayList.size();
        Object newInstance = Array.newInstance(this.f17861b, jsonReader);
        for (int i = 0; i < jsonReader; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo3331a(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f17862c.mo3331a(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
