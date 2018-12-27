package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class mr extends mx {
    /* renamed from: a */
    private final /* synthetic */ mo f16568a;

    private mr(mo moVar) {
        this.f16568a = moVar;
        super(moVar);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new mq(this.f16568a);
    }
}
