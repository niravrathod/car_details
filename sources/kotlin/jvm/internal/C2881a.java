package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.a */
final class C2881a<T> implements Iterator<T> {
    /* renamed from: a */
    private int f12088a;
    /* renamed from: b */
    private final T[] f12089b;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C2881a(T[] tArr) {
        C2885g.m13910b(tArr, "array");
        this.f12089b = tArr;
    }

    public boolean hasNext() {
        return this.f12088a < this.f12089b.length;
    }

    public T next() {
        try {
            Object[] objArr = this.f12089b;
            int i = this.f12088a;
            this.f12088a = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f12088a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
