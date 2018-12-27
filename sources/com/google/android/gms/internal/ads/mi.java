package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

final class mi<E> extends kf<E> {
    /* renamed from: a */
    private static final mi<Object> f19652a;
    /* renamed from: b */
    private final List<E> f19653b;

    /* renamed from: d */
    public static <E> mi<E> m26087d() {
        return f19652a;
    }

    mi() {
        this(new ArrayList(10));
    }

    private mi(List<E> list) {
        this.f19653b = list;
    }

    public final void add(int i, E e) {
        m20595c();
        this.f19653b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f19653b.get(i);
    }

    public final E remove(int i) {
        m20595c();
        i = this.f19653b.remove(i);
        this.modCount++;
        return i;
    }

    public final E set(int i, E e) {
        m20595c();
        i = this.f19653b.set(i, e);
        this.modCount++;
        return i;
    }

    public final int size() {
        return this.f19653b.size();
    }

    /* renamed from: a */
    public final /* synthetic */ zzbdk mo4159a(int i) {
        if (i >= size()) {
            List arrayList = new ArrayList(i);
            arrayList.addAll(this.f19653b);
            return new mi(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        kf miVar = new mi();
        f19652a = miVar;
        miVar.mo1970b();
    }
}
