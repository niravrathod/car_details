package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class zzel<T> {
    /* renamed from: a */
    private final Map<String, AtomicReference<T>> f9408a = new HashMap();

    /* renamed from: a */
    public final AtomicReference<T> m10544a(String str) {
        synchronized (this) {
            if (!this.f9408a.containsKey(str)) {
                this.f9408a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.f9408a.get(str);
    }
}
