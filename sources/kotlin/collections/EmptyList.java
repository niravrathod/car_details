package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C2883e;
import kotlin.jvm.internal.C2885g;

public final class EmptyList implements Serializable, List, RandomAccess {
    /* renamed from: a */
    public static final EmptyList f12080a = new EmptyList();
    private static final long serialVersionUID = -7390468764508069838L;

    /* renamed from: a */
    public int m13881a() {
        return 0;
    }

    /* renamed from: a */
    public boolean m13883a(Void voidR) {
        C2885g.m13910b(voidR, "element");
        return false;
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int m13884b(Void voidR) {
        C2885g.m13910b(voidR, "element");
        return -1;
    }

    /* renamed from: c */
    public int m13885c(Void voidR) {
        C2885g.m13910b(voidR, "element");
        return -1;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 1;
    }

    public boolean isEmpty() {
        return true;
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return C2883e.m13901a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C2883e.m13902a(this, tArr);
    }

    public String toString() {
        return "[]";
    }

    private EmptyList() {
    }

    public final boolean contains(Object obj) {
        return obj instanceof Void ? m13883a((Void) obj) : null;
    }

    public /* synthetic */ Object get(int i) {
        return m13882a(i);
    }

    public final int indexOf(Object obj) {
        return obj instanceof Void ? m13884b((Void) obj) : -1;
    }

    public final int lastIndexOf(Object obj) {
        return obj instanceof Void ? m13885c((Void) obj) : -1;
    }

    public final int size() {
        return m13881a();
    }

    public boolean equals(Object obj) {
        return (!(obj instanceof List) || ((List) obj).isEmpty() == null) ? null : true;
    }

    public boolean containsAll(Collection collection) {
        C2885g.m13910b(collection, "elements");
        return collection.isEmpty();
    }

    /* renamed from: a */
    public Void m13882a(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Empty list doesn't contain element at index ");
        stringBuilder.append(i);
        stringBuilder.append(46);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public Iterator iterator() {
        return C2871s.f12083a;
    }

    public ListIterator listIterator() {
        return C2871s.f12083a;
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return (ListIterator) C2871s.f12083a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index: ");
        stringBuilder.append(i);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fromIndex: ");
        stringBuilder.append(i);
        stringBuilder.append(", toIndex: ");
        stringBuilder.append(i2);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    private final Object readResolve() {
        return f12080a;
    }
}
