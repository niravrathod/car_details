package com.androidnetworking.p043b;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.androidnetworking.b.c */
public class C3332c implements C1041d {
    /* renamed from: a */
    public static final int f14163a = ((Runtime.getRuntime().availableProcessors() * 2) + 1);
    /* renamed from: b */
    private final C1039a f14164b;
    /* renamed from: c */
    private final C1039a f14165c;
    /* renamed from: d */
    private final Executor f14166d = new C1042e();

    public C3332c() {
        ThreadFactory c1044f = new C1044f(10);
        this.f14164b = new C1039a(f14163a, c1044f);
        this.f14165c = new C1039a(2, c1044f);
    }

    /* renamed from: a */
    public C1039a mo901a() {
        return this.f14164b;
    }

    /* renamed from: b */
    public C1039a mo902b() {
        return this.f14165c;
    }

    /* renamed from: c */
    public Executor mo903c() {
        return this.f14166d;
    }
}
