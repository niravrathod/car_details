package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import kotlin.TypeCastException;

/* renamed from: kotlin.jvm.internal.e */
public final class C2883e {
    /* renamed from: a */
    private static final Object[] f12090a = new Object[0];

    /* renamed from: a */
    public static final Object[] m13901a(Collection<?> collection) {
        C2885g.m13910b(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            collection = collection.iterator();
            if (collection.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = collection.next();
                    if (i2 >= objArr.length) {
                        if (!collection.hasNext()) {
                            return objArr;
                        }
                        i = ((i2 * 3) + 1) >>> 1;
                        if (i <= i2) {
                            if (i2 < 2147483645) {
                                i = 2147483645;
                            } else {
                                throw ((Throwable) new OutOfMemoryError());
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i);
                        C2885g.m13907a((Object) objArr, "Arrays.copyOf(result, newSize)");
                    } else if (!collection.hasNext()) {
                        Object copyOf = Arrays.copyOf(objArr, i2);
                        C2885g.m13907a(copyOf, "Arrays.copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return f12090a;
    }

    /* renamed from: a */
    public static final Object[] m13902a(Collection<?> collection, Object[] objArr) {
        C2885g.m13910b(collection, "collection");
        if (objArr != null) {
            int size = collection.size();
            int i = 0;
            if (size != 0) {
                collection = collection.iterator();
                if (collection.hasNext()) {
                    Object[] objArr2;
                    int i2;
                    if (size <= objArr.length) {
                        objArr2 = objArr;
                    } else {
                        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                        if (newInstance != null) {
                            objArr2 = (Object[]) newInstance;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                    }
                    while (true) {
                        i2 = i + 1;
                        objArr2[i] = collection.next();
                        if (i2 >= objArr2.length) {
                            if (!collection.hasNext()) {
                                return objArr2;
                            }
                            i = ((i2 * 3) + 1) >>> 1;
                            if (i <= i2) {
                                if (i2 < 2147483645) {
                                    i = 2147483645;
                                } else {
                                    throw ((Throwable) new OutOfMemoryError());
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i);
                            C2885g.m13907a((Object) objArr2, "Arrays.copyOf(result, newSize)");
                        } else if (!collection.hasNext()) {
                            break;
                        }
                        i = i2;
                    }
                    if (objArr2 == objArr) {
                        objArr[i2] = null;
                        return objArr;
                    }
                    Object copyOf = Arrays.copyOf(objArr2, i2);
                    C2885g.m13907a(copyOf, "Arrays.copyOf(result, size)");
                    return copyOf;
                } else if (objArr.length <= null) {
                    return objArr;
                } else {
                    objArr[0] = null;
                    return objArr;
                }
            } else if (objArr.length <= null) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        }
        throw ((Throwable) new NullPointerException());
    }
}
