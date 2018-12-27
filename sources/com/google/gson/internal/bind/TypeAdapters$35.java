package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p141b.C2624a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

class TypeAdapters$35 implements C2661r {
    /* renamed from: a */
    final /* synthetic */ Class f17858a;
    /* renamed from: b */
    final /* synthetic */ C2660q f17859b;

    TypeAdapters$35(Class cls, C2660q c2660q) {
        this.f17858a = cls;
        this.f17859b = c2660q;
    }

    /* renamed from: a */
    public <T2> C2660q<T2> mo3339a(C2629e c2629e, C2624a<T2> c2624a) {
        c2629e = c2624a.getRawType();
        if (this.f17858a.isAssignableFrom(c2629e) == null) {
            return null;
        }
        return new C2660q<T1>(this) {
            /* renamed from: b */
            final /* synthetic */ TypeAdapters$35 f17857b;

            /* renamed from: a */
            public void mo3331a(JsonWriter jsonWriter, T1 t1) {
                this.f17857b.f17859b.mo3331a(jsonWriter, t1);
            }

            /* renamed from: b */
            public T1 mo3332b(JsonReader jsonReader) {
                jsonReader = this.f17857b.f17859b.mo3332b(jsonReader);
                if (jsonReader != null) {
                    if (!c2629e.isInstance(jsonReader)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected a ");
                        stringBuilder.append(c2629e.getName());
                        stringBuilder.append(" but was ");
                        stringBuilder.append(jsonReader.getClass().getName());
                        throw new JsonSyntaxException(stringBuilder.toString());
                    }
                }
                return jsonReader;
            }
        };
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Factory[typeHierarchy=");
        stringBuilder.append(this.f17858a.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.f17859b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
