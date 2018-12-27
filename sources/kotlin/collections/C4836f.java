package kotlin.collections;

import kotlin.jvm.internal.C2885g;

/* renamed from: kotlin.collections.f */
class C4836f extends C4740e {
    /* renamed from: a */
    public static final <T> boolean m28680a(T[] tArr, T t) {
        C2885g.m13910b(tArr, "$receiver");
        return C4836f.m28681b(tArr, t) >= null ? 1 : null;
    }

    /* renamed from: b */
    public static final <T> int m28681b(T[] tArr, T t) {
        C2885g.m13910b(tArr, "$receiver");
        int i = 0;
        if (t == null) {
            t = tArr.length;
            T t2;
            while (t2 < t) {
                if (tArr[t2] == null) {
                    return t2;
                }
                t2++;
            }
        } else {
            int length = tArr.length;
            while (i < length) {
                if (C2885g.m13909a((Object) t, tArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
