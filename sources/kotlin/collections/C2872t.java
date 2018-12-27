package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.t */
public abstract class C2872t implements Iterator<Integer> {
    /* renamed from: b */
    public abstract int mo3600b();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return m13892a();
    }

    /* renamed from: a */
    public final Integer m13892a() {
        return Integer.valueOf(mo3600b());
    }
}
