package kotlin.collections;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C2885g;

/* renamed from: kotlin.collections.j */
class C4329j extends C2870i {
    /* renamed from: a */
    public static final <T> List<T> m23705a() {
        return EmptyList.f12080a;
    }

    /* renamed from: a */
    public static final <T> List<T> m23707a(T... tArr) {
        C2885g.m13910b(tArr, "elements");
        return tArr.length > 0 ? C4740e.m27466a(tArr) : C4329j.m23705a();
    }

    /* renamed from: b */
    public static final <T> ArrayList<T> m23708b(T... tArr) {
        C2885g.m13910b(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C2867a(tArr, true));
    }

    /* renamed from: a */
    public static final <T> List<T> m23706a(List<? extends T> list) {
        C2885g.m13910b(list, "$receiver");
        switch (list.size()) {
            case 0:
                return C4329j.m23705a();
            case 1:
                return C2870i.m13888a(list.get(0));
            default:
                return list;
        }
    }
}
