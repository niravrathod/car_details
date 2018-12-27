package com.google.firebase.components;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.components.C2577a.C25751;
import com.google.firebase.p137b.C2570c;
import com.google.firebase.p137b.C2571d;
import com.google.firebase.p138c.C2573a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.j */
public final class C4722j extends C4187f {
    /* renamed from: a */
    private final List<C2577a<?>> f20775a;
    /* renamed from: b */
    private final Map<Class<?>, C4191n<?>> f20776b = new HashMap();
    /* renamed from: c */
    private final C4190l f20777c;

    public C4722j(Executor executor, Iterable<C2580d> iterable, C2577a<?>... c2577aArr) {
        this.f20777c = new C4190l(executor);
        List arrayList = new ArrayList();
        arrayList.add(C2577a.m12630a(this.f20777c, C4190l.class, C2571d.class, C2570c.class));
        for (C2580d components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, c2577aArr);
        this.f20775a = Collections.unmodifiableList(C25751.m12618a(arrayList));
        for (C2577a a : this.f20775a) {
            m27416a(a);
        }
        m27415a();
    }

    /* renamed from: b */
    public final <T> C2573a<T> mo4412b(Class<T> cls) {
        Preconditions.checkNotNull(cls, "Null interface requested.");
        return (C2573a) this.f20776b.get(cls);
    }

    /* renamed from: a */
    public final void m27418a(boolean z) {
        for (C2577a c2577a : this.f20775a) {
            if (c2577a.m12636e() || (c2577a.m12637f() && z)) {
                mo3312a((Class) c2577a.m12632a().iterator().next());
            }
        }
        this.f20777c.m23036a();
    }

    /* renamed from: a */
    private <T> void m27416a(C2577a<T> c2577a) {
        C4191n c4191n = new C4191n(c2577a.m12634c(), new C4723p(c2577a, this));
        for (T put : c2577a.m12632a()) {
            this.f20776b.put(put, c4191n);
        }
    }

    /* renamed from: a */
    private void m27415a() {
        for (C2577a b : this.f20775a) {
            for (C2581e c2581e : b.m12633b()) {
                if (c2581e.m12643b()) {
                    if (!this.f20776b.containsKey(c2581e.m12642a())) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{b, c2581e.m12642a()}));
                    }
                }
            }
        }
    }
}
