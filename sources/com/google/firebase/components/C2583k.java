package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.k */
final class C2583k {
    /* renamed from: a */
    private final C2577a<?> f10965a;
    /* renamed from: b */
    private final Set<C2583k> f10966b = new HashSet();
    /* renamed from: c */
    private final Set<C2583k> f10967c = new HashSet();

    C2583k(C2577a<?> c2577a) {
        this.f10965a = c2577a;
    }

    /* renamed from: a */
    final void m12647a(C2583k c2583k) {
        this.f10966b.add(c2583k);
    }

    /* renamed from: b */
    final void m12649b(C2583k c2583k) {
        this.f10967c.add(c2583k);
    }

    /* renamed from: a */
    final Set<C2583k> m12646a() {
        return this.f10966b;
    }

    /* renamed from: c */
    final void m12650c(C2583k c2583k) {
        this.f10967c.remove(c2583k);
    }

    /* renamed from: b */
    final C2577a<?> m12648b() {
        return this.f10965a;
    }

    /* renamed from: c */
    final boolean m12651c() {
        return this.f10967c.isEmpty();
    }

    /* renamed from: d */
    final boolean m12652d() {
        return this.f10966b.isEmpty();
    }
}
