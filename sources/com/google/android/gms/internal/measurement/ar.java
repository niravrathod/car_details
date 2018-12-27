package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class ar<E> extends AbstractList<E> implements zzvs<E> {
    /* renamed from: a */
    private boolean f17420a = true;

    ar() {
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
        m22174c();
        return super.add(e);
    }

    public void add(int i, E e) {
        m22174c();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        m22174c();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        m22174c();
        return super.addAll(i, collection);
    }

    public void clear() {
        m22174c();
        super.clear();
    }

    /* renamed from: a */
    public boolean mo2923a() {
        return this.f17420a;
    }

    /* renamed from: b */
    public final void mo2924b() {
        this.f17420a = false;
    }

    public E remove(int i) {
        m22174c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        m22174c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        m22174c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        m22174c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        m22174c();
        return super.set(i, e);
    }

    /* renamed from: c */
    protected final void m22174c() {
        if (!this.f17420a) {
            throw new UnsupportedOperationException();
        }
    }
}
