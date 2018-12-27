package com.google.gson.p142c;

/* renamed from: com.google.gson.c.a */
public class C2626a {
    /* renamed from: a */
    private static final int f11102a = C2626a.m12864c();

    /* renamed from: c */
    private static int m12864c() {
        String[] split = System.getProperty("java.version").split("[._]");
        int parseInt = Integer.parseInt(split[0]);
        return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
    }

    /* renamed from: a */
    public static int m12862a() {
        return f11102a;
    }

    /* renamed from: b */
    public static boolean m12863b() {
        return f11102a >= 9;
    }
}
