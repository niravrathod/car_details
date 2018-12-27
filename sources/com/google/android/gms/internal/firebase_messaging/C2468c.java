package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.firebase_messaging.c */
final class C2468c extends WeakReference<Throwable> {
    /* renamed from: a */
    private final int f10031a;

    public C2468c(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f10031a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final int hashCode() {
        return this.f10031a;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                if (this == obj) {
                    return true;
                }
                C2468c c2468c = (C2468c) obj;
                return this.f10031a == c2468c.f10031a && get() == c2468c.get();
            }
        }
        return false;
    }
}
