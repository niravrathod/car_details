package kotlin.p151b;

/* renamed from: kotlin.b.c */
public final class C4324c extends C2861a {
    /* renamed from: b */
    public static final C2862a f18066b = new C2862a();
    /* renamed from: c */
    private static final C4324c f18067c = new C4324c(1, 0);

    /* renamed from: kotlin.b.c$a */
    public static final class C2862a {
        private C2862a() {
        }

        /* renamed from: a */
        public final C4324c m13880a() {
            return C4324c.f18067c;
        }
    }

    public C4324c(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: f */
    public Integer m23703f() {
        return Integer.valueOf(m13875a());
    }

    /* renamed from: g */
    public Integer m23704g() {
        return Integer.valueOf(m13876b());
    }

    /* renamed from: e */
    public boolean mo3601e() {
        return m13875a() > m13876b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        r0 = r3 instanceof kotlin.p151b.C4324c;
        if (r0 == 0) goto L_0x002b;
    L_0x0004:
        r0 = r2.mo3601e();
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r3;
        r0 = (kotlin.p151b.C4324c) r0;
        r0 = r0.mo3601e();
        if (r0 != 0) goto L_0x0029;
    L_0x0013:
        r0 = r2.m13875a();
        r3 = (kotlin.p151b.C4324c) r3;
        r1 = r3.m13875a();
        if (r0 != r1) goto L_0x002b;
    L_0x001f:
        r0 = r2.m13876b();
        r3 = r3.m13876b();
        if (r0 != r3) goto L_0x002b;
    L_0x0029:
        r3 = 1;
        goto L_0x002c;
    L_0x002b:
        r3 = 0;
    L_0x002c:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.b.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return mo3601e() ? -1 : (m13875a() * 31) + m13876b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m13875a());
        stringBuilder.append("..");
        stringBuilder.append(m13876b());
        return stringBuilder.toString();
    }
}
