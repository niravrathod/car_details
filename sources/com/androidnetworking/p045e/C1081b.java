package com.androidnetworking.p045e;

import com.androidnetworking.common.C1053a;
import com.androidnetworking.common.Priority;
import com.androidnetworking.p043b.C1040b;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.androidnetworking.e.b */
public class C1081b {
    /* renamed from: c */
    private static C1081b f3576c;
    /* renamed from: a */
    private final Set<C1053a> f3577a = Collections.newSetFromMap(new ConcurrentHashMap());
    /* renamed from: b */
    private AtomicInteger f3578b = new AtomicInteger();

    /* renamed from: a */
    public static void m4562a() {
        C1081b.m4563b();
    }

    /* renamed from: b */
    public static C1081b m4563b() {
        if (f3576c == null) {
            synchronized (C1081b.class) {
                if (f3576c == null) {
                    f3576c = new C1081b();
                }
            }
        }
        return f3576c;
    }

    /* renamed from: c */
    public int m4566c() {
        return this.f3578b.incrementAndGet();
    }

    /* renamed from: a */
    public C1053a m4564a(C1053a c1053a) {
        try {
            this.f3577a.add(c1053a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            c1053a.m4459a(m4566c());
            if (c1053a.m4472c() == Priority.IMMEDIATE) {
                c1053a.m4464a(C1040b.m4416a().m4417b().mo902b().submit(new C1085e(c1053a)));
            } else {
                c1053a.m4464a(C1040b.m4416a().m4417b().mo901a().submit(new C1085e(c1053a)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return c1053a;
    }

    /* renamed from: b */
    public void m4565b(C1053a c1053a) {
        try {
            this.f3577a.remove(c1053a);
        } catch (C1053a c1053a2) {
            c1053a2.printStackTrace();
        }
    }
}
