package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

final class cr<E> extends ar<E> {
    /* renamed from: a */
    private static final cr<Object> f20517a;
    /* renamed from: b */
    private final List<E> f20518b;

    /* renamed from: d */
    public static <E> cr<E> m27090d() {
        return f20517a;
    }

    cr() {
        this(new ArrayList(10));
    }

    private cr(List<E> list) {
        this.f20518b = list;
    }

    public final void add(int i, E e) {
        m22174c();
        this.f20518b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f20518b.get(i);
    }

    public final E remove(int i) {
        m22174c();
        i = this.f20518b.remove(i);
        this.modCount++;
        return i;
    }

    public final E set(int i, E e) {
        m22174c();
        i = this.f20518b.set(i, e);
        this.modCount++;
        return i;
    }

    public final int size() {
        return this.f20518b.size();
    }

    /* renamed from: a */
    public final /* synthetic */ zzvs mo4339a(int i) {
        if (i >= size()) {
            List arrayList = new ArrayList(i);
            arrayList.addAll(this.f20518b);
            return new cr(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        ar crVar = new cr();
        f20517a = crVar;
        crVar.mo2924b();
    }
}
