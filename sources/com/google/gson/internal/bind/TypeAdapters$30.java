package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.internal.bind.C2647i.C4251a;
import com.google.gson.p141b.C2624a;

class TypeAdapters$30 implements C2661r {
    TypeAdapters$30() {
    }

    /* renamed from: a */
    public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
        c2629e = c2624a.getRawType();
        if (Enum.class.isAssignableFrom(c2629e) != null) {
            if (c2629e != Enum.class) {
                if (c2629e.isEnum() == null) {
                    c2629e = c2629e.getSuperclass();
                }
                return new C4251a(c2629e);
            }
        }
        return null;
    }
}
