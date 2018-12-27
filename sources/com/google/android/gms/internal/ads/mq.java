package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class mq implements Iterator<Entry<K, V>> {
    /* renamed from: a */
    private int f8254a;
    /* renamed from: b */
    private Iterator<Entry<K, V>> f8255b;
    /* renamed from: c */
    private final /* synthetic */ mo f8256c;

    private mq(mo moVar) {
        this.f8256c = moVar;
        this.f8254a = this.f8256c.f8248b.size();
    }

    public final boolean hasNext() {
        return (this.f8254a > 0 && this.f8254a <= this.f8256c.f8248b.size()) || m9178a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m9178a() {
        if (this.f8255b == null) {
            this.f8255b = this.f8256c.f8252f.entrySet().iterator();
        }
        return this.f8255b;
    }

    public final /* synthetic */ Object next() {
        if (m9178a().hasNext()) {
            return (Entry) m9178a().next();
        }
        List b = this.f8256c.f8248b;
        int i = this.f8254a - 1;
        this.f8254a = i;
        return (Entry) b.get(i);
    }
}
