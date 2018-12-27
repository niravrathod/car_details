package com.bumptech.glide.p054e;

import com.bumptech.glide.load.C1280f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.e.e */
public class C1154e {
    /* renamed from: a */
    private final List<String> f3778a = new ArrayList();
    /* renamed from: b */
    private final Map<String, List<C1153a<?, ?>>> f3779b = new HashMap();

    /* renamed from: com.bumptech.glide.e.e$a */
    private static class C1153a<T, R> {
        /* renamed from: a */
        final Class<R> f3775a;
        /* renamed from: b */
        final C1280f<T, R> f3776b;
        /* renamed from: c */
        private final Class<T> f3777c;

        public C1153a(Class<T> cls, Class<R> cls2, C1280f<T, R> c1280f) {
            this.f3777c = cls;
            this.f3775a = cls2;
            this.f3776b = c1280f;
        }

        /* renamed from: a */
        public boolean m4806a(Class<?> cls, Class<?> cls2) {
            return (this.f3777c.isAssignableFrom(cls) == null || cls2.isAssignableFrom(this.f3775a) == null) ? null : true;
        }
    }

    /* renamed from: a */
    public synchronized void m4810a(List<String> list) {
        List<String> arrayList = new ArrayList(this.f3778a);
        this.f3778a.clear();
        this.f3778a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f3778a.add(str);
            }
        }
    }

    /* renamed from: a */
    public synchronized <T, R> List<C1280f<T, R>> m4808a(Class<T> cls, Class<R> cls2) {
        List<C1280f<T, R>> arrayList;
        arrayList = new ArrayList();
        for (String str : this.f3778a) {
            List<C1153a> list = (List) this.f3779b.get(str);
            if (list != null) {
                for (C1153a c1153a : list) {
                    if (c1153a.m4806a(cls, cls2)) {
                        arrayList.add(c1153a.f3776b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized <T, R> List<Class<R>> m4811b(Class<T> cls, Class<R> cls2) {
        List<Class<R>> arrayList;
        arrayList = new ArrayList();
        for (String str : this.f3778a) {
            List<C1153a> list = (List) this.f3779b.get(str);
            if (list != null) {
                for (C1153a c1153a : list) {
                    if (c1153a.m4806a(cls, cls2) && !arrayList.contains(c1153a.f3775a)) {
                        arrayList.add(c1153a.f3775a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> void m4809a(String str, C1280f<T, R> c1280f, Class<T> cls, Class<R> cls2) {
        m4807a(str).add(new C1153a(cls, cls2, c1280f));
    }

    /* renamed from: a */
    private synchronized List<C1153a<?, ?>> m4807a(String str) {
        List<C1153a<?, ?>> list;
        if (!this.f3778a.contains(str)) {
            this.f3778a.add(str);
        }
        list = (List) this.f3779b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f3779b.put(str, list);
        }
        return list;
    }
}
