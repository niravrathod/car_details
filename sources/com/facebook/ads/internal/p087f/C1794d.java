package com.facebook.ads.internal.p087f;

import java.util.Map;

/* renamed from: com.facebook.ads.internal.f.d */
public class C1794d {
    /* renamed from: a */
    private double f5416a;
    /* renamed from: b */
    private double f5417b;
    /* renamed from: c */
    private String f5418c;
    /* renamed from: d */
    private Map<String, String> f5419d;

    public C1794d(double d, String str, Map<String, String> map) {
        this.f5416a = d;
        this.f5418c = str;
        this.f5419d = map;
        d = (double) System.currentTimeMillis();
        Double.isNaN(d);
        this.f5417b = d / 1000.0d;
    }

    /* renamed from: a */
    public String mo1351a() {
        return "debug";
    }

    /* renamed from: b */
    public double m6744b() {
        return this.f5417b;
    }

    /* renamed from: c */
    public double m6745c() {
        return this.f5416a;
    }

    /* renamed from: d */
    public String m6746d() {
        return this.f5418c;
    }

    /* renamed from: e */
    public Map<String, String> m6747e() {
        return this.f5419d;
    }
}
