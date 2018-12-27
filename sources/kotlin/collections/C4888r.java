package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C2885g;

/* renamed from: kotlin.collections.r */
class C4888r extends C4885q {
    /* renamed from: b */
    public static final <T> T m30244b(Iterable<? extends T> iterable) {
        C2885g.m13910b(iterable, "$receiver");
        if (iterable instanceof List) {
            return C4888r.m30245b((List) iterable);
        }
        iterable = iterable.iterator();
        if (iterable.hasNext()) {
            return iterable.next();
        }
        throw ((Throwable) new NoSuchElementException("Collection is empty."));
    }

    /* renamed from: b */
    public static final <T> T m30245b(List<? extends T> list) {
        C2885g.m13910b(list, "$receiver");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw ((Throwable) new NoSuchElementException("List is empty."));
    }

    /* renamed from: c */
    public static final <T> T m30247c(Iterable<? extends T> iterable) {
        C2885g.m13910b(iterable, "$receiver");
        if (iterable instanceof List) {
            return C4888r.m30248c((List) iterable);
        }
        iterable = iterable.iterator();
        if (iterable.hasNext()) {
            T next = iterable.next();
            if (iterable.hasNext() == null) {
                return next;
            }
            throw ((Throwable) new IllegalArgumentException("Collection has more than one element."));
        }
        throw ((Throwable) new NoSuchElementException("Collection is empty."));
    }

    /* renamed from: c */
    public static final <T> T m30248c(List<? extends T> list) {
        C2885g.m13910b(list, "$receiver");
        switch (list.size()) {
            case 0:
                throw ((Throwable) new NoSuchElementException("List is empty."));
            case 1:
                return list.get(0);
            default:
                throw ((Throwable) new IllegalArgumentException("List has more than one element."));
        }
    }

    /* renamed from: b */
    public static final <T> List<T> m30246b(Iterable<? extends T> iterable, int i) {
        C2885g.m13910b(iterable, "$receiver");
        int i2 = 0;
        if ((i >= 0 ? 1 : null) == null) {
            iterable = new StringBuilder();
            iterable.append("Requested element count ");
            iterable.append(i);
            iterable.append(" is less than zero.");
            throw ((Throwable) new IllegalArgumentException(iterable.toString().toString()));
        } else if (i == 0) {
            return C4329j.m23705a();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return C4888r.m30249d(iterable);
                }
                if (i == 1) {
                    return C2870i.m13888a(C4888r.m30244b((Iterable) iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object next : iterable) {
                int i3 = i2 + 1;
                if (i2 == i) {
                    break;
                }
                arrayList.add(next);
                i2 = i3;
            }
            return C4329j.m23706a((List) arrayList);
        }
    }

    /* renamed from: a */
    public static final <T, C extends Collection<? super T>> C m30242a(Iterable<? extends T> iterable, C c) {
        C2885g.m13910b(iterable, "$receiver");
        C2885g.m13910b(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: d */
    public static final <T> List<T> m30249d(Iterable<? extends T> iterable) {
        C2885g.m13910b(iterable, "$receiver");
        if (!(iterable instanceof Collection)) {
            return C4329j.m23706a((List) C4888r.m30250e(iterable));
        }
        Collection collection = (Collection) iterable;
        switch (collection.size()) {
            case 0:
                iterable = C4329j.m23705a();
                break;
            case 1:
                iterable = C2870i.m13888a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                break;
            default:
                iterable = C4888r.m30243a(collection);
                break;
        }
        return iterable;
    }

    /* renamed from: e */
    public static final <T> List<T> m30250e(Iterable<? extends T> iterable) {
        C2885g.m13910b(iterable, "$receiver");
        if (iterable instanceof Collection) {
            return C4888r.m30243a((Collection) iterable);
        }
        return (List) C4888r.m30242a(iterable, new ArrayList());
    }

    /* renamed from: a */
    public static final <T> List<T> m30243a(Collection<? extends T> collection) {
        C2885g.m13910b(collection, "$receiver");
        return new ArrayList(collection);
    }
}
