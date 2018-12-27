package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C4230a;
import com.google.gson.p141b.C2624a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.gson.internal.bind.h */
final class C4241h<T> extends C2660q<T> {
    /* renamed from: a */
    private final C2629e f17882a;
    /* renamed from: b */
    private final C2660q<T> f17883b;
    /* renamed from: c */
    private final Type f17884c;

    C4241h(C2629e c2629e, C2660q<T> c2660q, Type type) {
        this.f17882a = c2629e;
        this.f17883b = c2660q;
        this.f17884c = type;
    }

    /* renamed from: b */
    public T mo3332b(JsonReader jsonReader) {
        return this.f17883b.mo3332b(jsonReader);
    }

    /* renamed from: a */
    public void mo3331a(JsonWriter jsonWriter, T t) {
        C2660q c2660q = this.f17883b;
        Type a = m23229a(this.f17884c, (Object) t);
        if (a != this.f17884c) {
            c2660q = this.f17882a.m12873a(C2624a.get(a));
            if (c2660q instanceof C4230a) {
                if (!(this.f17883b instanceof C4230a)) {
                    c2660q = this.f17883b;
                }
            }
        }
        c2660q.mo3331a(jsonWriter, t);
    }

    /* renamed from: a */
    private Type m23229a(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        } else {
            return type;
        }
    }
}
