package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class ao {
    /* renamed from: a */
    private final ConcurrentHashMap<Object, List<Throwable>> f10037a = new ConcurrentHashMap(16, 0.75f, 10);
    /* renamed from: b */
    private final ReferenceQueue<Throwable> f10038b = new ReferenceQueue();

    ao() {
    }
}
