package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.p141b.C2624a;

class TypeAdapters$33 implements C2661r {
    /* renamed from: a */
    final /* synthetic */ Class f17850a;
    /* renamed from: b */
    final /* synthetic */ Class f17851b;
    /* renamed from: c */
    final /* synthetic */ C2660q f17852c;

    TypeAdapters$33(Class cls, Class cls2, C2660q c2660q) {
        this.f17850a = cls;
        this.f17851b = cls2;
        this.f17852c = c2660q;
    }

    /* renamed from: a */
    public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
        c2629e = c2624a.getRawType();
        if (c2629e != this.f17850a) {
            if (c2629e != this.f17851b) {
                return null;
            }
        }
        return this.f17852c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Factory[type=");
        stringBuilder.append(this.f17851b.getName());
        stringBuilder.append("+");
        stringBuilder.append(this.f17850a.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.f17852c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
