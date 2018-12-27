package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class kf<E> extends AbstractList<E> implements zzbdk<E> {
    /* renamed from: a */
    private boolean f16519a = true;

    kf() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        m20595c();
        return super.add(e);
    }

    public void add(int i, E e) {
        m20595c();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        m20595c();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        m20595c();
        return super.addAll(i, collection);
    }

    public void clear() {
        m20595c();
        super.clear();
    }

    /* renamed from: a */
    public boolean mo1969a() {
        return this.f16519a;
    }

    /* renamed from: b */
    public final void mo1970b() {
        this.f16519a = false;
    }

    public E remove(int i) {
        m20595c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        m20595c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        m20595c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        m20595c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        m20595c();
        return super.set(i, e);
    }

    /* renamed from: c */
    protected final void m20595c() {
        if (!this.f16519a) {
            throw new UnsupportedOperationException();
        }
    }
}
