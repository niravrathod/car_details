package com.facebook.ads.internal.p089h;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.h.c */
public class C1803c {
    /* renamed from: a */
    private List<C1801a> f5443a = new ArrayList();
    /* renamed from: b */
    private int f5444b = 0;
    /* renamed from: c */
    private C1804d f5445c;
    /* renamed from: d */
    private String f5446d;

    public C1803c(C1804d c1804d, String str) {
        this.f5445c = c1804d;
        this.f5446d = str;
    }

    /* renamed from: a */
    public C1804d m6789a() {
        return this.f5445c;
    }

    /* renamed from: a */
    public void m6790a(C1801a c1801a) {
        this.f5443a.add(c1801a);
    }

    /* renamed from: b */
    public String m6791b() {
        return this.f5446d;
    }

    /* renamed from: c */
    public C1801a m6792c() {
        if (this.f5444b >= this.f5443a.size()) {
            return null;
        }
        this.f5444b++;
        return (C1801a) this.f5443a.get(this.f5444b - 1);
    }
}
