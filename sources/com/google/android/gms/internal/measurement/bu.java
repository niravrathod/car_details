package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class bu<K> implements Iterator<Entry<K, Object>> {
    /* renamed from: a */
    private Iterator<Entry<K, Object>> f10058a;

    public bu(Iterator<Entry<K, Object>> it) {
        this.f10058a = it;
    }

    public final boolean hasNext() {
        return this.f10058a.hasNext();
    }

    public final void remove() {
        this.f10058a.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f10058a.next();
        return entry.getValue() instanceof zzvw ? new bt(entry) : entry;
    }
}
