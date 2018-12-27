package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.a */
final class C2476a implements Iterator<String> {
    /* renamed from: a */
    private Iterator<String> f10403a = this.f10404b.f20673a.keySet().iterator();
    /* renamed from: b */
    private final /* synthetic */ zzaa f10404b;

    C2476a(zzaa zzaa) {
        this.f10404b = zzaa;
    }

    public final boolean hasNext() {
        return this.f10403a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public final /* synthetic */ Object next() {
        return (String) this.f10403a.next();
    }
}
