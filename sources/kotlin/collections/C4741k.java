package kotlin.collections;

import java.util.Collection;
import kotlin.jvm.internal.C2885g;

/* renamed from: kotlin.collections.k */
class C4741k extends C4329j {
    /* renamed from: a */
    public static final <T> int m27467a(Iterable<? extends T> iterable, int i) {
        C2885g.m13910b(iterable, "$receiver");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
