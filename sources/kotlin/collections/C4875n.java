package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C2885g;

/* renamed from: kotlin.collections.n */
class C4875n extends C4866m {
    /* renamed from: a */
    public static final <T> List<T> m29858a(Iterable<? extends T> iterable) {
        C2885g.m13910b(iterable, "$receiver");
        iterable = C4888r.m30250e(iterable);
        Collections.shuffle(iterable);
        return iterable;
    }
}
