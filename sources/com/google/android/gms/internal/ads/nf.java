package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class nf implements Iterator<String> {
    /* renamed from: a */
    private Iterator<String> f8273a = this.f8274b.f17081a.iterator();
    /* renamed from: b */
    private final /* synthetic */ zzbfx f8274b;

    nf(zzbfx zzbfx) {
        this.f8274b = zzbfx;
    }

    public final boolean hasNext() {
        return this.f8273a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f8273a.next();
    }
}
