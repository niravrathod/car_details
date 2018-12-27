package kotlin.p151b;

/* renamed from: kotlin.b.g */
class C4739g extends C4325f {
    /* renamed from: c */
    public static final int m27464c(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: d */
    public static final int m27465d(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: a */
    public static final C2861a m27462a(int i, int i2) {
        return C2861a.f12075a.m13874a(i, i2, -1);
    }

    /* renamed from: b */
    public static final C4324c m27463b(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C4324c.f18066b.m13880a();
        }
        return new C4324c(i, i2 - 1);
    }

    /* renamed from: a */
    public static final int m27461a(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot coerce value to an empty range: maximum ");
            stringBuilder.append(i3);
            stringBuilder.append(" is less than minimum ");
            stringBuilder.append(i2);
            stringBuilder.append(46);
            throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }
}
