package com.airbnb.lottie.model;

import android.support.v4.p017f.C0421g;
import com.airbnb.lottie.C0955d;

/* renamed from: com.airbnb.lottie.model.g */
public class C0991g {
    /* renamed from: a */
    private static final C0991g f3318a = new C0991g();
    /* renamed from: b */
    private final C0421g<String, C0955d> f3319b = new C0421g(10485760);

    /* renamed from: a */
    public static C0991g m4275a() {
        return f3318a;
    }

    C0991g() {
    }

    /* renamed from: a */
    public C0955d m4276a(int i) {
        return m4277a(Integer.toString(i));
    }

    /* renamed from: a */
    public C0955d m4277a(String str) {
        return (C0955d) this.f3319b.get(str);
    }

    /* renamed from: a */
    public void m4278a(int i, C0955d c0955d) {
        m4279a(Integer.toString(i), c0955d);
    }

    /* renamed from: a */
    public void m4279a(String str, C0955d c0955d) {
        if (str != null) {
            this.f3319b.put(str, c0955d);
        }
    }
}
