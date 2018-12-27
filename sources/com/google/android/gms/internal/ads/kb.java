package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class kb {
    /* renamed from: a */
    private final ConcurrentHashMap<kc, List<Throwable>> f8201a = new ConcurrentHashMap(16, 0.75f, 10);
    /* renamed from: b */
    private final ReferenceQueue<Throwable> f8202b = new ReferenceQueue();

    kb() {
    }

    /* renamed from: a */
    public final List<Throwable> m8956a(Throwable th, boolean z) {
        z = this.f8202b.poll();
        while (z) {
            this.f8201a.remove(z);
            z = this.f8202b.poll();
        }
        return (List) this.f8201a.get(new kc(th, null));
    }
}
