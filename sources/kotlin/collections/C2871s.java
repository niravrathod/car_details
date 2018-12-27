package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.collections.s */
public final class C2871s implements ListIterator {
    /* renamed from: a */
    public static final C2871s f12083a = new C2871s();

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private C2871s() {
    }

    public /* synthetic */ Object next() {
        return m13890a();
    }

    public /* synthetic */ Object previous() {
        return m13891b();
    }

    /* renamed from: a */
    public Void m13890a() {
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public Void m13891b() {
        throw new NoSuchElementException();
    }
}
