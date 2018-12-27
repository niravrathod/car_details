package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.p141b.C2624a;

class TypeAdapters$32 implements C2661r {
    /* renamed from: a */
    final /* synthetic */ Class f17848a;
    /* renamed from: b */
    final /* synthetic */ C2660q f17849b;

    TypeAdapters$32(Class cls, C2660q c2660q) {
        this.f17848a = cls;
        this.f17849b = c2660q;
    }

    /* renamed from: a */
    public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
        return c2624a.getRawType() == this.f17848a ? this.f17849b : null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Factory[type=");
        stringBuilder.append(this.f17848a.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.f17849b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
