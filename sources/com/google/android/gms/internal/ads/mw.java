package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class mw implements Iterator<Entry<K, V>> {
    /* renamed from: a */
    private int f8262a;
    /* renamed from: b */
    private boolean f8263b;
    /* renamed from: c */
    private Iterator<Entry<K, V>> f8264c;
    /* renamed from: d */
    private final /* synthetic */ mo f8265d;

    private mw(mo moVar) {
        this.f8265d = moVar;
        this.f8262a = -1;
    }

    public final boolean hasNext() {
        if (this.f8262a + 1 >= this.f8265d.f8248b.size()) {
            if (this.f8265d.f8249c.isEmpty() || !m9182a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    public final void remove() {
        if (this.f8263b) {
            this.f8263b = false;
            this.f8265d.m9169f();
            if (this.f8262a < this.f8265d.f8248b.size()) {
                mo moVar = this.f8265d;
                int i = this.f8262a;
                this.f8262a = i - 1;
                moVar.m9166c(i);
                return;
            }
            m9182a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m9182a() {
        if (this.f8264c == null) {
            this.f8264c = this.f8265d.f8249c.entrySet().iterator();
        }
        return this.f8264c;
    }

    public final /* synthetic */ Object next() {
        this.f8263b = true;
        int i = this.f8262a + 1;
        this.f8262a = i;
        if (i < this.f8265d.f8248b.size()) {
            return (Entry) this.f8265d.f8248b.get(this.f8262a);
        }
        return (Entry) m9182a().next();
    }
}
