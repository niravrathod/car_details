package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class cz implements Iterator<Entry<K, V>> {
    /* renamed from: a */
    private int f10083a;
    /* renamed from: b */
    private Iterator<Entry<K, V>> f10084b;
    /* renamed from: c */
    private final /* synthetic */ cx f10085c;

    private cz(cx cxVar) {
        this.f10085c = cxVar;
        this.f10083a = this.f10085c.f10077b.size();
    }

    public final boolean hasNext() {
        return (this.f10083a > 0 && this.f10083a <= this.f10085c.f10077b.size()) || m11699a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m11699a() {
        if (this.f10084b == null) {
            this.f10084b = this.f10085c.f10081f.entrySet().iterator();
        }
        return this.f10084b;
    }

    public final /* synthetic */ Object next() {
        if (m11699a().hasNext()) {
            return (Entry) m11699a().next();
        }
        List b = this.f10085c.f10077b;
        int i = this.f10083a - 1;
        this.f10083a = i;
        return (Entry) b.get(i);
    }
}
