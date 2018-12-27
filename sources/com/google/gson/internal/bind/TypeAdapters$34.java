package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.p141b.C2624a;

class TypeAdapters$34 implements C2661r {
    /* renamed from: a */
    final /* synthetic */ Class f17853a;
    /* renamed from: b */
    final /* synthetic */ Class f17854b;
    /* renamed from: c */
    final /* synthetic */ C2660q f17855c;

    TypeAdapters$34(Class cls, Class cls2, C2660q c2660q) {
        this.f17853a = cls;
        this.f17854b = cls2;
        this.f17855c = c2660q;
    }

    /* renamed from: a */
    public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
        c2629e = c2624a.getRawType();
        if (c2629e != this.f17853a) {
            if (c2629e != this.f17854b) {
                return null;
            }
        }
        return this.f17855c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Factory[type=");
        stringBuilder.append(this.f17853a.getName());
        stringBuilder.append("+");
        stringBuilder.append(this.f17854b.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.f17855c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
