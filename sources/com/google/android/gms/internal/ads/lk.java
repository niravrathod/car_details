package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class lk<K> implements Iterator<Entry<K, Object>> {
    /* renamed from: a */
    private Iterator<Entry<K, Object>> f8227a;

    public lk(Iterator<Entry<K, Object>> it) {
        this.f8227a = it;
    }

    public final boolean hasNext() {
        return this.f8227a.hasNext();
    }

    public final void remove() {
        this.f8227a.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f8227a.next();
        return entry.getValue() instanceof zzbdo ? new lj(entry) : entry;
    }
}
