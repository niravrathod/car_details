package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.p038a.C4492a;
import com.airbnb.lottie.model.p038a.C4493b;
import com.airbnb.lottie.model.p038a.C4494c;
import com.airbnb.lottie.model.p038a.C4495d;
import com.airbnb.lottie.model.p038a.C4496f;
import com.airbnb.lottie.model.p038a.C4497g;
import com.airbnb.lottie.model.p038a.C4498h;
import com.airbnb.lottie.model.p038a.C4499j;
import com.airbnb.lottie.p036d.C0954f;
import com.airbnb.lottie.p037e.C0959a;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.d */
public class C0932d {
    /* renamed from: a */
    public static C4493b m4033a(JsonReader jsonReader, C0955d c0955d) {
        return C0932d.m4034a(jsonReader, c0955d, true);
    }

    /* renamed from: a */
    public static C4493b m4034a(JsonReader jsonReader, C0955d c0955d, boolean z) {
        return new C4493b(C0932d.m4036a(jsonReader, z ? C0954f.m4101a() : true, c0955d, C3299i.f14030a));
    }

    /* renamed from: b */
    static C4495d m4038b(JsonReader jsonReader, C0955d c0955d) {
        return new C4495d(C0932d.m4037a(jsonReader, c0955d, C3301o.f14032a));
    }

    /* renamed from: c */
    static C4496f m4039c(JsonReader jsonReader, C0955d c0955d) {
        return new C4496f(C0932d.m4036a(jsonReader, C0954f.m4101a(), c0955d, C3303y.f14034a));
    }

    /* renamed from: d */
    static C4497g m4040d(JsonReader jsonReader, C0955d c0955d) {
        return new C4497g(C0932d.m4037a(jsonReader, c0955d, ac.f14026a));
    }

    /* renamed from: e */
    static C4498h m4041e(JsonReader jsonReader, C0955d c0955d) {
        return new C4498h(C0932d.m4036a(jsonReader, C0954f.m4101a(), c0955d, ad.f14027a));
    }

    /* renamed from: f */
    static C4499j m4042f(JsonReader jsonReader, C0955d c0955d) {
        return new C4499j(C0932d.m4037a(jsonReader, c0955d, C3298h.f14029a));
    }

    /* renamed from: g */
    static C4492a m4043g(JsonReader jsonReader, C0955d c0955d) {
        return new C4492a(C0932d.m4037a(jsonReader, c0955d, C3297f.f14028a));
    }

    /* renamed from: a */
    static C4494c m4035a(JsonReader jsonReader, C0955d c0955d, int i) {
        return new C4494c(C0932d.m4037a(jsonReader, c0955d, new C3300l(i)));
    }

    /* renamed from: a */
    private static <T> List<C0959a<T>> m4037a(JsonReader jsonReader, C0955d c0955d, aj<T> ajVar) {
        return C0942r.m4063a(jsonReader, c0955d, 1.0f, ajVar);
    }

    /* renamed from: a */
    private static <T> List<C0959a<T>> m4036a(JsonReader jsonReader, float f, C0955d c0955d, aj<T> ajVar) {
        return C0942r.m4063a(jsonReader, c0955d, f, ajVar);
    }
}
