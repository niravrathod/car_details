package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class dg extends AbstractSet<Entry<K, V>> {
    /* renamed from: a */
    private final /* synthetic */ cx f10095a;

    private dg(cx cxVar) {
        this.f10095a = cxVar;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new df(this.f10095a);
    }

    public int size() {
        return this.f10095a.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f10095a.get(entry.getKey());
        obj = entry.getValue();
        if (obj2 != obj) {
            if (obj2 == null || obj2.equals(obj) == null) {
                return null;
            }
        }
        return true;
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return null;
        }
        this.f10095a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f10095a.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return null;
        }
        this.f10095a.m11692a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }
}
