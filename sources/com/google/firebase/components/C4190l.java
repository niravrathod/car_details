package com.google.firebase.components;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.p137b.C2568a;
import com.google.firebase.p137b.C2569b;
import com.google.firebase.p137b.C2570c;
import com.google.firebase.p137b.C2571d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.l */
class C4190l implements C2570c, C2571d {
    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C2569b<Object>, Executor>> f17710a = new HashMap();
    /* renamed from: b */
    private Queue<C2568a<?>> f17711b = new ArrayDeque();
    /* renamed from: c */
    private final Executor f17712c;

    C4190l(Executor executor) {
        this.f17712c = executor;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m23037a(com.google.firebase.p137b.C2568a<?> r4) {
        /*
        r3 = this;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r4);
        monitor-enter(r3);
        r0 = r3.f17711b;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r0 = r3.f17711b;	 Catch:{ all -> 0x0033 }
        r0.add(r4);	 Catch:{ all -> 0x0033 }
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        return;
    L_0x000f:
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        r0 = r3.m23035b(r4);
        r0 = r0.iterator();
    L_0x0018:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0032;
    L_0x001e:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getValue();
        r2 = (java.util.concurrent.Executor) r2;
        r1 = com.google.firebase.components.C2584m.m12653a(r1, r4);
        r2.execute(r1);
        goto L_0x0018;
    L_0x0032:
        return;
    L_0x0033:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.l.a(com.google.firebase.b.a):void");
    }

    /* renamed from: b */
    private synchronized Set<Entry<C2569b<Object>, Executor>> m23035b(C2568a<?> c2568a) {
        Map map = (Map) this.f17710a.get(c2568a.m12588a());
        if (map == null) {
            return Collections.emptySet();
        }
        return map.entrySet();
    }

    /* renamed from: a */
    public synchronized <T> void mo3315a(Class<T> cls, Executor executor, C2569b<? super T> c2569b) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(c2569b);
        Preconditions.checkNotNull(executor);
        if (!this.f17710a.containsKey(cls)) {
            this.f17710a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f17710a.get(cls)).put(c2569b, executor);
    }

    /* renamed from: a */
    public <T> void mo3314a(Class<T> cls, C2569b<? super T> c2569b) {
        mo3315a(cls, this.f17712c, c2569b);
    }

    /* renamed from: a */
    final void m23036a() {
        synchronized (this) {
            Queue queue;
            if (this.f17711b != null) {
                queue = this.f17711b;
                this.f17711b = null;
            } else {
                queue = null;
            }
        }
        if (r0 != null) {
            for (C2568a a : r0) {
                m23037a(a);
            }
        }
    }
}
