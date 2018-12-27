package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

final class bt<K> implements Entry<K, Object> {
    /* renamed from: a */
    private Entry<K, zzvw> f10057a;

    private bt(Entry<K, zzvw> entry) {
        this.f10057a = entry;
    }

    public final K getKey() {
        return this.f10057a.getKey();
    }

    public final Object getValue() {
        if (((zzvw) this.f10057a.getValue()) == null) {
            return null;
        }
        return zzvw.m22631a();
    }

    /* renamed from: a */
    public final zzvw m11540a() {
        return (zzvw) this.f10057a.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzwt) {
            return ((zzvw) this.f10057a.getValue()).m12092a((zzwt) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
