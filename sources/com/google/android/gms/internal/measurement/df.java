package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class df implements Iterator<Entry<K, V>> {
    /* renamed from: a */
    private int f10091a;
    /* renamed from: b */
    private boolean f10092b;
    /* renamed from: c */
    private Iterator<Entry<K, V>> f10093c;
    /* renamed from: d */
    private final /* synthetic */ cx f10094d;

    private df(cx cxVar) {
        this.f10094d = cxVar;
        this.f10091a = -1;
    }

    public final boolean hasNext() {
        if (this.f10091a + 1 >= this.f10094d.f10077b.size()) {
            if (this.f10094d.f10078c.isEmpty() || !m11703a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    public final void remove() {
        if (this.f10092b) {
            this.f10092b = false;
            this.f10094d.m11690f();
            if (this.f10091a < this.f10094d.f10077b.size()) {
                cx cxVar = this.f10094d;
                int i = this.f10091a;
                this.f10091a = i - 1;
                cxVar.m11687c(i);
                return;
            }
            m11703a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m11703a() {
        if (this.f10093c == null) {
            this.f10093c = this.f10094d.f10078c.entrySet().iterator();
        }
        return this.f10093c;
    }

    public final /* synthetic */ Object next() {
        this.f10092b = true;
        int i = this.f10091a + 1;
        this.f10091a = i;
        if (i < this.f10094d.f10077b.size()) {
            return (Entry) this.f10094d.f10077b.get(this.f10091a);
        }
        return (Entry) m11703a().next();
    }
}
