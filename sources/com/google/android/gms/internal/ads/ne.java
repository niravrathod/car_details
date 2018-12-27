package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class ne implements ListIterator<String> {
    /* renamed from: a */
    private ListIterator<String> f8270a = this.f8272c.f17081a.listIterator(this.f8271b);
    /* renamed from: b */
    private final /* synthetic */ int f8271b;
    /* renamed from: c */
    private final /* synthetic */ zzbfx f8272c;

    ne(zzbfx zzbfx, int i) {
        this.f8272c = zzbfx;
        this.f8271b = i;
    }

    public final boolean hasNext() {
        return this.f8270a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f8270a.hasPrevious();
    }

    public final int nextIndex() {
        return this.f8270a.nextIndex();
    }

    public final int previousIndex() {
        return this.f8270a.previousIndex();
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
        return (String) this.f8270a.previous();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f8270a.next();
    }
}
