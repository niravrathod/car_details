package com.androidnetworking.p162c;

import com.androidnetworking.p044d.C1072o;
import com.google.gson.C2629e;
import com.google.gson.C2660q;
import okhttp3.ab;

/* renamed from: com.androidnetworking.c.b */
final class C3334b<T> implements C1072o<ab, T> {
    /* renamed from: a */
    private final C2629e f14168a;
    /* renamed from: b */
    private final C2660q<T> f14169b;

    C3334b(C2629e c2629e, C2660q<T> c2660q) {
        this.f14168a = c2629e;
        this.f14169b = c2660q;
    }

    /* renamed from: a */
    public T m17163a(ab abVar) {
        try {
            T b = this.f14169b.mo3332b(this.f14168a.m12876a(abVar.m14032e()));
            return b;
        } finally {
            abVar.close();
        }
    }
}
