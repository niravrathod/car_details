package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.do */
final class C2469do implements Iterator<String> {
    /* renamed from: a */
    private Iterator<String> f10099a = this.f10100b.f17552a.iterator();
    /* renamed from: b */
    private final /* synthetic */ zzye f10100b;

    C2469do(zzye zzye) {
        this.f10100b = zzye;
    }

    public final boolean hasNext() {
        return this.f10099a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f10099a.next();
    }
}
