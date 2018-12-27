package com.facebook.ads.internal.p091j;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.facebook.ads.internal.j.e */
public class C1816e<T extends C1817f, E extends C1815d> {
    /* renamed from: a */
    private final Map<Class<E>, List<WeakReference<T>>> f5498a = new HashMap();
    /* renamed from: b */
    private final Queue<E> f5499b = new ArrayDeque();

    /* renamed from: a */
    private void m6827a(List<WeakReference<T>> list) {
        if (list != null) {
            int i;
            int i2 = 0;
            for (i = 0; i < list.size(); i++) {
                WeakReference weakReference = (WeakReference) list.get(i);
                if (weakReference.get() != null) {
                    int i3 = i2 + 1;
                    list.set(i2, weakReference);
                    i2 = i3;
                }
            }
            for (i = list.size() - 1; i >= i2; i--) {
                list.remove(i);
            }
        }
    }

    /* renamed from: b */
    private void m6828b(E e) {
        if (this.f5498a != null) {
            List list = (List) this.f5498a.get(e.getClass());
            if (list != null) {
                m6827a(list);
                if (!list.isEmpty()) {
                    for (WeakReference weakReference : new ArrayList(list)) {
                        C1817f c1817f = (C1817f) weakReference.get();
                        if (c1817f != null && c1817f.m6836b(e)) {
                            c1817f.mo1341a(e);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void m6829a(E e) {
        if (this.f5499b.isEmpty()) {
            this.f5499b.add(e);
            while (!this.f5499b.isEmpty()) {
                m6828b((C1815d) this.f5499b.peek());
                this.f5499b.remove();
            }
        } else {
            this.f5499b.add(e);
        }
    }

    /* renamed from: a */
    public synchronized void m6830a(T... tArr) {
        if (tArr != null) {
            for (C1817f a : tArr) {
                m6831a(a);
            }
        }
    }

    /* renamed from: a */
    public synchronized boolean m6831a(T t) {
        if (t == null) {
            return false;
        }
        Class a = t.mo1340a();
        if (this.f5498a.get(a) == null) {
            this.f5498a.put(a, new ArrayList());
        }
        List list = (List) this.f5498a.get(a);
        m6827a(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((WeakReference) list.get(i)).get() == t) {
                return false;
            }
        }
        return list.add(new WeakReference(t));
    }

    /* renamed from: b */
    public synchronized void m6832b(T... tArr) {
        if (tArr != null) {
            for (C1817f b : tArr) {
                m6833b(b);
            }
        }
    }

    /* renamed from: b */
    public synchronized boolean m6833b(T t) {
        if (t == null) {
            return false;
        }
        List list = (List) this.f5498a.get(t.mo1340a());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((WeakReference) list.get(i)).get() == t) {
                ((WeakReference) list.get(i)).clear();
                return true;
            }
        }
        return false;
    }
}
