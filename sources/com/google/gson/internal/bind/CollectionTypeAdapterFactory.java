package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.C2640b;
import com.google.gson.internal.C2649d;
import com.google.gson.p141b.C2624a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements C2661r {
    /* renamed from: a */
    private final C2640b f17809a;

    /* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory$a */
    private static final class C4227a<E> extends C2660q<Collection<E>> {
        /* renamed from: a */
        private final C2660q<E> f17807a;
        /* renamed from: b */
        private final C2649d<? extends Collection<E>> f17808b;

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23157a(jsonReader);
        }

        public C4227a(C2629e c2629e, Type type, C2660q<E> c2660q, C2649d<? extends Collection<E>> c2649d) {
            this.f17807a = new C4241h(c2629e, c2660q, type);
            this.f17808b = c2649d;
        }

        /* renamed from: a */
        public Collection<E> m23157a(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collection = (Collection) this.f17808b.mo3341a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(this.f17807a.mo3332b(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }

        /* renamed from: a */
        public void m23159a(JsonWriter jsonWriter, Collection<E> collection) {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (E a : collection) {
                this.f17807a.mo3331a(jsonWriter, a);
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(C2640b c2640b) {
        this.f17809a = c2640b;
    }

    /* renamed from: a */
    public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
        Type type = c2624a.getType();
        Class rawType = c2624a.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        type = C$Gson$Types.m12898a(type, rawType);
        return new C4227a(c2629e, type, c2629e.m12873a(C2624a.get(type)), this.f17809a.m12935a((C2624a) c2624a));
    }
}
