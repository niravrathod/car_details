package kotlin.p150a;

/* renamed from: kotlin.a.a */
public final class C2858a {
    /* renamed from: a */
    private static final int m13870a(int i, int i2) {
        i %= i2;
        return i >= 0 ? i : i + i2;
    }

    /* renamed from: b */
    private static final int m13872b(int i, int i2, int i3) {
        return C2858a.m13870a(C2858a.m13870a(i, i3) - C2858a.m13870a(i2, i3), i3);
    }

    /* renamed from: a */
    public static final int m13871a(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - C2858a.m13872b(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + C2858a.m13872b(i, i2, -i3);
        } else {
            throw ((Throwable) new IllegalArgumentException("Step is zero."));
        }
    }
}
