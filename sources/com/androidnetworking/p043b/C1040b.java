package com.androidnetworking.p043b;

/* renamed from: com.androidnetworking.b.b */
public class C1040b {
    /* renamed from: a */
    private static C1040b f3441a;
    /* renamed from: b */
    private final C1041d f3442b = new C3332c();

    private C1040b() {
    }

    /* renamed from: a */
    public static C1040b m4416a() {
        if (f3441a == null) {
            synchronized (C1040b.class) {
                if (f3441a == null) {
                    f3441a = new C1040b();
                }
            }
        }
        return f3441a;
    }

    /* renamed from: b */
    public C1041d m4417b() {
        return this.f3442b;
    }
}
