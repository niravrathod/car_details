package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.p141b.C2624a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

class TypeAdapters$26 implements C2661r {
    TypeAdapters$26() {
    }

    /* renamed from: a */
    public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
        if (c2624a.getRawType() != Timestamp.class) {
            return null;
        }
        c2629e = c2629e.m12875a(Date.class);
        return new C2660q<Timestamp>(this) {
            /* renamed from: b */
            final /* synthetic */ TypeAdapters$26 f17845b;

            /* renamed from: b */
            public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
                return m23190a(jsonReader);
            }

            /* renamed from: a */
            public Timestamp m23190a(JsonReader jsonReader) {
                Date date = (Date) c2629e.mo3332b(jsonReader);
                return date != null ? new Timestamp(date.getTime()) : null;
            }

            /* renamed from: a */
            public void m23192a(JsonWriter jsonWriter, Timestamp timestamp) {
                c2629e.mo3331a(jsonWriter, timestamp);
            }
        };
    }
}
