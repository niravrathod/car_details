package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzye extends AbstractList<String> implements zzwc, RandomAccess {
    /* renamed from: a */
    private final zzwc f17552a;

    public zzye(zzwc zzwc) {
        this.f17552a = zzwc;
    }

    /* renamed from: e */
    public final zzwc mo3159e() {
        return this;
    }

    /* renamed from: b */
    public final Object mo3157b(int i) {
        return this.f17552a.mo3157b(i);
    }

    public final int size() {
        return this.f17552a.size();
    }

    /* renamed from: a */
    public final void mo3156a(zzud zzud) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new dn(this, i);
    }

    public final Iterator<String> iterator() {
        return new C2469do(this);
    }

    /* renamed from: d */
    public final List<?> mo3158d() {
        return this.f17552a.mo3158d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f17552a.get(i);
    }
}
