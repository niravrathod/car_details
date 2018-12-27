package com.google.gson;

import com.google.gson.internal.bind.C4237d;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: com.google.gson.q */
public abstract class C2660q<T> {

    /* renamed from: com.google.gson.q$1 */
    class C42591 extends C2660q<T> {
        /* renamed from: a */
        final /* synthetic */ C2660q f17896a;

        C42591(C2660q c2660q) {
            this.f17896a = c2660q;
        }

        /* renamed from: a */
        public void mo3331a(JsonWriter jsonWriter, T t) {
            if (t == null) {
                jsonWriter.nullValue();
            } else {
                this.f17896a.mo3331a(jsonWriter, t);
            }
        }

        /* renamed from: b */
        public T mo3332b(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return this.f17896a.mo3332b(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }
    }

    /* renamed from: a */
    public abstract void mo3331a(JsonWriter jsonWriter, T t);

    /* renamed from: b */
    public abstract T mo3332b(JsonReader jsonReader);

    /* renamed from: a */
    public final C2660q<T> m12977a() {
        return new C42591(this);
    }

    /* renamed from: a */
    public final C2657k m12976a(T t) {
        try {
            JsonWriter c4237d = new C4237d();
            mo3331a(c4237d, t);
            return c4237d.m23218a();
        } catch (Throwable e) {
            throw new JsonIOException(e);
        }
    }
}
