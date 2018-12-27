package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class da extends dg {
    /* renamed from: a */
    private final /* synthetic */ cx f17481a;

    private da(cx cxVar) {
        this.f17481a = cxVar;
        super(cxVar);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new cz(this.f17481a);
    }
}
