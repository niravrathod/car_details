package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C2885g;

/* renamed from: kotlin.collections.i */
class C2870i {
    /* renamed from: a */
    public static final <T> List<T> m13888a(T t) {
        Object singletonList = Collections.singletonList(t);
        C2885g.m13907a(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m13889a(T[] tArr, boolean z) {
        C2885g.m13910b(tArr, "$receiver");
        if (z && C2885g.m13909a(tArr.getClass(), (Object) Object[].class)) {
            return tArr;
        }
        Object copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C2885g.m13907a(copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
