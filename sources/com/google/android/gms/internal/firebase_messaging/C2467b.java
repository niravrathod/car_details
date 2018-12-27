package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase_messaging.b */
final class C2467b {
    /* renamed from: a */
    private final ConcurrentHashMap<C2468c, List<Throwable>> f10029a = new ConcurrentHashMap(16, 0.75f, 10);
    /* renamed from: b */
    private final ReferenceQueue<Throwable> f10030b = new ReferenceQueue();

    C2467b() {
    }

    /* renamed from: a */
    public final List<Throwable> m11489a(Throwable th, boolean z) {
        z = this.f10030b.poll();
        while (z) {
            this.f10029a.remove(z);
            z = this.f10030b.poll();
        }
        List list = (List) this.f10029a.get(new C2468c(th, null));
        if (list != null) {
            return list;
        }
        z = new Vector(2);
        List list2 = (List) this.f10029a.putIfAbsent(new C2468c(th, this.f10030b), z);
        return list2 == null ? z : list2;
    }
}
