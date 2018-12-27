package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzbfx extends AbstractList<String> implements zzbdu, RandomAccess {
    /* renamed from: a */
    private final zzbdu f17081a;

    public zzbfx(zzbdu zzbdu) {
        this.f17081a = zzbdu;
    }

    /* renamed from: e */
    public final zzbdu mo2427e() {
        return this;
    }

    /* renamed from: b */
    public final Object mo2425b(int i) {
        return this.f17081a.mo2425b(i);
    }

    public final int size() {
        return this.f17081a.size();
    }

    /* renamed from: a */
    public final void mo2424a(zzbbu zzbbu) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new ne(this, i);
    }

    public final Iterator<String> iterator() {
        return new nf(this);
    }

    /* renamed from: d */
    public final List<?> mo2426d() {
        return this.f17081a.mo2426d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f17081a.get(i);
    }
}
