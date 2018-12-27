package com.androidnetworking.common;

import com.androidnetworking.error.ANError;
import okhttp3.aa;

/* renamed from: com.androidnetworking.common.b */
public class C1054b<T> {
    /* renamed from: a */
    private final T f3545a;
    /* renamed from: b */
    private final ANError f3546b;
    /* renamed from: c */
    private aa f3547c;

    /* renamed from: a */
    public static <T> C1054b<T> m4493a(T t) {
        return new C1054b((Object) t);
    }

    /* renamed from: a */
    public static <T> C1054b<T> m4492a(ANError aNError) {
        return new C1054b(aNError);
    }

    public C1054b(T t) {
        this.f3545a = t;
        this.f3546b = null;
    }

    public C1054b(ANError aNError) {
        this.f3545a = null;
        this.f3546b = aNError;
    }

    /* renamed from: a */
    public T m4494a() {
        return this.f3545a;
    }

    /* renamed from: b */
    public boolean m4496b() {
        return this.f3546b == null;
    }

    /* renamed from: c */
    public ANError m4497c() {
        return this.f3546b;
    }

    /* renamed from: a */
    public void m4495a(aa aaVar) {
        this.f3547c = aaVar;
    }

    /* renamed from: d */
    public aa m4498d() {
        return this.f3547c;
    }
}
