package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2656j;
import com.google.gson.C2659p;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.internal.C2640b;
import com.google.gson.p140a.C2620b;
import com.google.gson.p141b.C2624a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements C2661r {
    /* renamed from: a */
    private final C2640b f17810a;

    public JsonAdapterAnnotationTypeAdapterFactory(C2640b c2640b) {
        this.f17810a = c2640b;
    }

    /* renamed from: a */
    public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
        C2620b c2620b = (C2620b) c2624a.getRawType().getAnnotation(C2620b.class);
        if (c2620b == null) {
            return null;
        }
        return m23164a(this.f17810a, c2629e, c2624a, c2620b);
    }

    /* renamed from: a */
    C2660q<?> m23164a(C2640b c2640b, C2629e c2629e, C2624a<?> c2624a, C2620b c2620b) {
        c2640b = c2640b.m12935a(C2624a.get(c2620b.m12854a())).mo3341a();
        if (c2640b instanceof C2660q) {
            c2640b = (C2660q) c2640b;
        } else if (c2640b instanceof C2661r) {
            c2640b = ((C2661r) c2640b).mo3339a(c2629e, c2624a);
        } else {
            boolean z = c2640b instanceof C2659p;
            if (!z) {
                if (!(c2640b instanceof C2656j)) {
                    c2620b = new StringBuilder();
                    c2620b.append("Invalid attempt to bind an instance of ");
                    c2620b.append(c2640b.getClass().getName());
                    c2620b.append(" as a @JsonAdapter for ");
                    c2620b.append(c2624a.toString());
                    c2620b.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                    throw new IllegalArgumentException(c2620b.toString());
                }
            }
            C2656j c2656j = null;
            C2659p c2659p = z ? (C2659p) c2640b : null;
            if (c2640b instanceof C2656j) {
                c2656j = (C2656j) c2640b;
            }
            C2640b treeTypeAdapter = new TreeTypeAdapter(c2659p, c2656j, c2629e, c2624a, null);
        }
        return (c2640b == null || c2620b.m12855b() == null) ? c2640b : c2640b.m12977a();
    }
}
