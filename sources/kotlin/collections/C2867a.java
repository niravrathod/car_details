package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C2882b;
import kotlin.jvm.internal.C2883e;
import kotlin.jvm.internal.C2885g;

/* renamed from: kotlin.collections.a */
final class C2867a<T> implements Collection<T> {
    /* renamed from: a */
    private final T[] f12081a;
    /* renamed from: b */
    private final boolean f12082b;

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        return C2883e.m13902a(this, tArr);
    }

    public C2867a(T[] tArr, boolean z) {
        C2885g.m13910b(tArr, "values");
        this.f12081a = tArr;
        this.f12082b = z;
    }

    public final int size() {
        return m13886a();
    }

    /* renamed from: a */
    public int m13886a() {
        return this.f12081a.length;
    }

    public boolean isEmpty() {
        return this.f12081a.length == 0;
    }

    public boolean contains(Object obj) {
        return C4836f.m28680a(this.f12081a, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C2885g.m13910b(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<T> iterator() {
        return C2882b.m13900a(this.f12081a);
    }

    public final Object[] toArray() {
        return C2870i.m13889a(this.f12081a, this.f12082b);
    }
}
