package android.support.v4.p017f;

/* renamed from: android.support.v4.f.j */
public class C0429j<F, S> {
    /* renamed from: a */
    public final F f1442a;
    /* renamed from: b */
    public final S f1443b;

    public C0429j(F f, S s) {
        this.f1442a = f;
        this.f1443b = s;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0429j)) {
            return false;
        }
        C0429j c0429j = (C0429j) obj;
        if (C0429j.m1571b(c0429j.f1442a, this.f1442a) && C0429j.m1571b(c0429j.f1443b, this.f1443b) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m1571b(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f1442a == null ? 0 : this.f1442a.hashCode();
        if (this.f1443b != null) {
            i = this.f1443b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pair{");
        stringBuilder.append(String.valueOf(this.f1442a));
        stringBuilder.append(" ");
        stringBuilder.append(String.valueOf(this.f1443b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static <A, B> C0429j<A, B> m1570a(A a, B b) {
        return new C0429j(a, b);
    }
}
