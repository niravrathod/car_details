package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class lj<K> implements Entry<K, Object> {
    /* renamed from: a */
    private Entry<K, zzbdo> f8226a;

    private lj(Entry<K, zzbdo> entry) {
        this.f8226a = entry;
    }

    public final K getKey() {
        return this.f8226a.getKey();
    }

    public final Object getValue() {
        if (((zzbdo) this.f8226a.getValue()) == null) {
            return null;
        }
        return zzbdo.m21599a();
    }

    /* renamed from: a */
    public final zzbdo m9018a() {
        return (zzbdo) this.f8226a.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzbel) {
            return ((zzbdo) this.f8226a.getValue()).m10352a((zzbel) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
