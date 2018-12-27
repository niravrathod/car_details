package com.google.firebase.components;

import com.google.firebase.p137b.C2570c;
import com.google.firebase.p138c.C2573a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.p */
final class C4723p extends C4187f {
    /* renamed from: a */
    private final Set<Class<?>> f20778a;
    /* renamed from: b */
    private final Set<Class<?>> f20779b;
    /* renamed from: c */
    private final Set<Class<?>> f20780c;
    /* renamed from: d */
    private final C2578b f20781d;

    /* renamed from: com.google.firebase.components.p$a */
    static class C4193a implements C2570c {
        /* renamed from: a */
        private final Set<Class<?>> f17718a;
        /* renamed from: b */
        private final C2570c f17719b;

        public C4193a(Set<Class<?>> set, C2570c c2570c) {
            this.f17718a = set;
            this.f17719b = c2570c;
        }
    }

    C4723p(C2577a<?> c2577a, C2578b c2578b) {
        Set hashSet = new HashSet();
        Set hashSet2 = new HashSet();
        for (C2581e c2581e : c2577a.m12633b()) {
            if (c2581e.m12644c()) {
                hashSet.add(c2581e.m12642a());
            } else {
                hashSet2.add(c2581e.m12642a());
            }
        }
        if (!c2577a.m12635d().isEmpty()) {
            hashSet.add(C2570c.class);
        }
        this.f20778a = Collections.unmodifiableSet(hashSet);
        this.f20779b = Collections.unmodifiableSet(hashSet2);
        this.f20780c = c2577a.m12635d();
        this.f20781d = c2578b;
    }

    /* renamed from: a */
    public final <T> T mo3312a(Class<T> cls) {
        if (this.f20778a.contains(cls)) {
            T a = this.f20781d.mo3312a(cls);
            if (cls.equals(C2570c.class) == null) {
                return a;
            }
            return new C4193a(this.f20780c, (C2570c) a);
        }
        throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", new Object[]{cls}));
    }

    /* renamed from: b */
    public final <T> C2573a<T> mo4412b(Class<T> cls) {
        if (this.f20779b.contains(cls)) {
            return this.f20781d.mo4412b(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", new Object[]{cls}));
    }
}
