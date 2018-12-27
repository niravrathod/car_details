package com.bumptech.glide.p055g;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.g.f */
public class C1175f<T, Y> {
    /* renamed from: a */
    private final Map<T, Y> f3827a = new LinkedHashMap(100, 0.75f, true);
    /* renamed from: b */
    private final long f3828b;
    /* renamed from: c */
    private long f3829c;
    /* renamed from: d */
    private long f3830d;

    /* renamed from: a */
    protected int mo1022a(Y y) {
        return 1;
    }

    /* renamed from: a */
    protected void mo984a(T t, Y y) {
    }

    public C1175f(long j) {
        this.f3828b = j;
        this.f3829c = j;
    }

    /* renamed from: b */
    public synchronized long m4872b() {
        return this.f3829c;
    }

    /* renamed from: b */
    public synchronized Y m4873b(T t) {
        return this.f3827a.get(t);
    }

    /* renamed from: b */
    public synchronized Y m4874b(T t, Y y) {
        long a = (long) mo1022a((Object) y);
        if (a >= this.f3829c) {
            mo984a(t, y);
            return null;
        }
        if (y != null) {
            this.f3830d += a;
        }
        Object put = this.f3827a.put(t, y);
        if (put != null) {
            this.f3830d -= (long) mo1022a(put);
            if (put.equals(y) == null) {
                mo984a(t, put);
            }
        }
        m4867c();
        return put;
    }

    /* renamed from: c */
    public synchronized Y m4875c(T t) {
        Object remove;
        remove = this.f3827a.remove(t);
        if (remove != null) {
            this.f3830d -= (long) mo1022a(remove);
        }
        return remove;
    }

    /* renamed from: a */
    public void m4869a() {
        m4870a(0);
    }

    /* renamed from: a */
    protected synchronized void m4870a(long j) {
        while (this.f3830d > j) {
            Iterator it = this.f3827a.entrySet().iterator();
            Entry entry = (Entry) it.next();
            Object value = entry.getValue();
            this.f3830d -= (long) mo1022a(value);
            Object key = entry.getKey();
            it.remove();
            mo984a(key, value);
        }
    }

    /* renamed from: c */
    private void m4867c() {
        m4870a(this.f3829c);
    }
}
