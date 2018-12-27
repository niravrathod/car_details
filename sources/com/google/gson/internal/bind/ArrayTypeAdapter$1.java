package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.p141b.C2624a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

class ArrayTypeAdapter$1 implements C2661r {
    ArrayTypeAdapter$1() {
    }

    /* renamed from: a */
    public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
        c2624a = c2624a.getType();
        if (!(c2624a instanceof GenericArrayType) && (!(c2624a instanceof Class) || !((Class) c2624a).isArray())) {
            return null;
        }
        Type g = C$Gson$Types.m12912g(c2624a);
        return new C4234a(c2629e, c2629e.m12873a(C2624a.get(g)), C$Gson$Types.m12910e(g));
    }
}
