package com.airbnb.lottie.p031a.p033b;

import com.airbnb.lottie.model.content.C0986c;
import com.airbnb.lottie.p037e.C0959a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.d */
public class C4486d extends C3292f<C0986c> {
    /* renamed from: c */
    private final C0986c f18778c;

    /* renamed from: a */
    /* synthetic */ Object mo869a(C0959a c0959a, float f) {
        return m24853b(c0959a, f);
    }

    public C4486d(List<C0959a<C0986c>> list) {
        super(list);
        int i = 0;
        C0986c c0986c = (C0986c) ((C0959a) list.get(0)).f3164a;
        if (c0986c != null) {
            i = c0986c.m4255c();
        }
        this.f18778c = new C0986c(new float[i], new int[i]);
    }

    /* renamed from: b */
    C0986c m24853b(C0959a<C0986c> c0959a, float f) {
        this.f18778c.m4252a((C0986c) c0959a.f3164a, (C0986c) c0959a.f3165b, f);
        return this.f18778c;
    }
}
