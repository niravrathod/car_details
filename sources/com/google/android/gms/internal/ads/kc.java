package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class kc extends WeakReference<Throwable> {
    /* renamed from: a */
    private final int f8203a;

    public kc(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th != null) {
            this.f8203a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final int hashCode() {
        return this.f8203a;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                if (this == obj) {
                    return true;
                }
                kc kcVar = (kc) obj;
                return this.f8203a == kcVar.f8203a && get() == kcVar.get();
            }
        }
        return false;
    }
}
