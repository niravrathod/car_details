package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

final class dn implements ListIterator<String> {
    /* renamed from: a */
    private ListIterator<String> f10096a = this.f10098c.f17552a.listIterator(this.f10097b);
    /* renamed from: b */
    private final /* synthetic */ int f10097b;
    /* renamed from: c */
    private final /* synthetic */ zzye f10098c;

    dn(zzye zzye, int i) {
        this.f10098c = zzye;
        this.f10097b = i;
    }

    public final boolean hasNext() {
        return this.f10096a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f10096a.hasPrevious();
    }

    public final int nextIndex() {
        return this.f10096a.nextIndex();
    }

    public final int previousIndex() {
        return this.f10096a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f10096a.previous();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f10096a.next();
    }
}
