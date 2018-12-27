package android.support.v7.p022c.p023a;

import java.lang.reflect.Array;

/* renamed from: android.support.v7.c.a.c */
final class C0681c {
    /* renamed from: a */
    static final /* synthetic */ boolean f2187a = (C0681c.class.desiredAssertionStatus() ^ 1);

    /* renamed from: a */
    public static int m2707a(int i) {
        return i <= 4 ? 8 : i * 2;
    }

    /* renamed from: a */
    public static <T> T[] m2709a(T[] tArr, int i, T t) {
        if (!f2187a) {
            if (i > tArr.length) {
                throw new AssertionError();
            }
        }
        if (i + 1 > tArr.length) {
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), C0681c.m2707a(i));
            System.arraycopy(tArr, 0, tArr2, 0, i);
            tArr = tArr2;
        }
        tArr[i] = t;
        return tArr;
    }

    /* renamed from: a */
    public static int[] m2708a(int[] iArr, int i, int i2) {
        if (!f2187a) {
            if (i > iArr.length) {
                throw new AssertionError();
            }
        }
        if (i + 1 > iArr.length) {
            Object obj = new int[C0681c.m2707a(i)];
            System.arraycopy(iArr, 0, obj, 0, i);
            iArr = obj;
        }
        iArr[i] = i2;
        return iArr;
    }

    private C0681c() {
    }
}
