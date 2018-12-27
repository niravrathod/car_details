package kotlin.jvm.internal;

import kotlin.jvm.C2880a;
import kotlin.p152c.C4326b;

/* renamed from: kotlin.jvm.internal.d */
public final class C4743d implements C4326b<Object>, C4332c {
    /* renamed from: a */
    private final Class<?> f20791a;

    public C4743d(Class<?> cls) {
        C2885g.m13910b(cls, "jClass");
        this.f20791a = cls;
    }

    /* renamed from: a */
    public Class<?> mo4540a() {
        return this.f20791a;
    }

    public boolean equals(Object obj) {
        return (!(obj instanceof C4743d) || C2885g.m13909a(C2880a.m13898a(this), C2880a.m13898a((C4326b) obj)) == null) ? null : true;
    }

    public int hashCode() {
        return C2880a.m13898a(this).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mo4540a().toString());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}
