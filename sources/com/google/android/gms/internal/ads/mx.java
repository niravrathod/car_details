package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class mx extends AbstractSet<Entry<K, V>> {
    /* renamed from: a */
    private final /* synthetic */ mo f8266a;

    private mx(mo moVar) {
        this.f8266a = moVar;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new mw(this.f8266a, null);
    }

    public int size() {
        return this.f8266a.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f8266a.get(entry.getKey());
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
        this.f8266a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f8266a.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return null;
        }
        this.f8266a.m9171a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }
}
