package com.bumptech.glide.load.engine.p060a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.a.h */
class C1234h<K extends C1237m, V> {
    /* renamed from: a */
    private final C1233a<K, V> f3937a = new C1233a();
    /* renamed from: b */
    private final Map<K, C1233a<K, V>> f3938b = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.a.h$a */
    private static class C1233a<K, V> {
        /* renamed from: a */
        final K f3933a;
        /* renamed from: b */
        C1233a<K, V> f3934b;
        /* renamed from: c */
        C1233a<K, V> f3935c;
        /* renamed from: d */
        private List<V> f3936d;

        C1233a() {
            this(null);
        }

        C1233a(K k) {
            this.f3935c = this;
            this.f3934b = this;
            this.f3933a = k;
        }

        /* renamed from: a */
        public V m5037a() {
            int b = m5039b();
            return b > 0 ? this.f3936d.remove(b - 1) : null;
        }

        /* renamed from: b */
        public int m5039b() {
            return this.f3936d != null ? this.f3936d.size() : 0;
        }

        /* renamed from: a */
        public void m5038a(V v) {
            if (this.f3936d == null) {
                this.f3936d = new ArrayList();
            }
            this.f3936d.add(v);
        }
    }

    C1234h() {
    }

    /* renamed from: a */
    public void m5046a(K k, V v) {
        C1233a c1233a = (C1233a) this.f3938b.get(k);
        if (c1233a == null) {
            c1233a = new C1233a(k);
            m5041b(c1233a);
            this.f3938b.put(k, c1233a);
        } else {
            k.mo994a();
        }
        c1233a.m5038a(v);
    }

    /* renamed from: a */
    public V m5045a(K k) {
        C1233a c1233a = (C1233a) this.f3938b.get(k);
        if (c1233a == null) {
            c1233a = new C1233a(k);
            this.f3938b.put(k, c1233a);
        } else {
            k.mo994a();
        }
        m5040a(c1233a);
        return c1233a.m5037a();
    }

    /* renamed from: a */
    public V m5044a() {
        for (C1233a c1233a = this.f3937a.f3935c; !c1233a.equals(this.f3937a); c1233a = c1233a.f3935c) {
            V a = c1233a.m5037a();
            if (a != null) {
                return a;
            }
            C1234h.m5043d(c1233a);
            this.f3938b.remove(c1233a.f3933a);
            ((C1237m) c1233a.f3933a).mo994a();
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        Object obj = null;
        for (C1233a c1233a = this.f3937a.f3934b; !c1233a.equals(this.f3937a); c1233a = c1233a.f3934b) {
            obj = 1;
            stringBuilder.append('{');
            stringBuilder.append(c1233a.f3933a);
            stringBuilder.append(':');
            stringBuilder.append(c1233a.m5039b());
            stringBuilder.append("}, ");
        }
        if (obj != null) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private void m5040a(C1233a<K, V> c1233a) {
        C1234h.m5043d(c1233a);
        c1233a.f3935c = this.f3937a;
        c1233a.f3934b = this.f3937a.f3934b;
        C1234h.m5042c(c1233a);
    }

    /* renamed from: b */
    private void m5041b(C1233a<K, V> c1233a) {
        C1234h.m5043d(c1233a);
        c1233a.f3935c = this.f3937a.f3935c;
        c1233a.f3934b = this.f3937a;
        C1234h.m5042c(c1233a);
    }

    /* renamed from: c */
    private static <K, V> void m5042c(C1233a<K, V> c1233a) {
        c1233a.f3934b.f3935c = c1233a;
        c1233a.f3935c.f3934b = c1233a;
    }

    /* renamed from: d */
    private static <K, V> void m5043d(C1233a<K, V> c1233a) {
        c1233a.f3935c.f3934b = c1233a.f3934b;
        c1233a.f3934b.f3935c = c1233a.f3935c;
    }
}
