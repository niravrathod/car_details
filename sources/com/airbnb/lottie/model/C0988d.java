package com.airbnb.lottie.model;

import com.airbnb.lottie.model.content.C3325j;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.d */
public class C0988d {
    /* renamed from: a */
    private final List<C3325j> f3310a;
    /* renamed from: b */
    private final char f3311b;
    /* renamed from: c */
    private final double f3312c;
    /* renamed from: d */
    private final double f3313d;
    /* renamed from: e */
    private final String f3314e;
    /* renamed from: f */
    private final String f3315f;

    /* renamed from: a */
    public static int m4261a(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public C0988d(List<C3325j> list, char c, double d, double d2, String str, String str2) {
        this.f3310a = list;
        this.f3311b = c;
        this.f3312c = d;
        this.f3313d = d2;
        this.f3314e = str;
        this.f3315f = str2;
    }

    /* renamed from: a */
    public List<C3325j> m4262a() {
        return this.f3310a;
    }

    /* renamed from: b */
    public double m4263b() {
        return this.f3313d;
    }

    public int hashCode() {
        return C0988d.m4261a(this.f3311b, this.f3315f, this.f3314e);
    }
}
