package com.androidnetworking.p162c;

import com.androidnetworking.p044d.C1072o;
import com.androidnetworking.p044d.C1072o.C1071a;
import com.google.gson.C2629e;
import com.google.gson.p141b.C2624a;
import java.lang.reflect.Type;
import okhttp3.ab;

/* renamed from: com.androidnetworking.c.a */
public final class C3333a extends C1071a {
    /* renamed from: a */
    private final C2629e f14167a;

    public C3333a() {
        this.f14167a = new C2629e();
    }

    public C3333a(C2629e c2629e) {
        this.f14167a = c2629e;
    }

    /* renamed from: a */
    public C1072o<ab, ?> mo904a(Type type) {
        return new C3334b(this.f14167a, this.f14167a.m12873a(C2624a.get(type)));
    }
}
