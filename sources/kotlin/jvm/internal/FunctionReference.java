package kotlin.jvm.internal;

import kotlin.p152c.C2865a;
import kotlin.p152c.C4327d;

public class FunctionReference extends CallableReference implements C4327d, FunctionBase {
    private final int arity;

    public FunctionReference(int i) {
        this.arity = i;
    }

    /* renamed from: f */
    protected C2865a mo4539f() {
        return C2886h.m13915a(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof kotlin.jvm.internal.FunctionReference;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (kotlin.jvm.internal.FunctionReference) r5;
        r1 = r4.mo4666c();
        if (r1 != 0) goto L_0x0018;
    L_0x0011:
        r1 = r5.mo4666c();
        if (r1 != 0) goto L_0x0051;
    L_0x0017:
        goto L_0x0026;
    L_0x0018:
        r1 = r4.mo4666c();
        r3 = r5.mo4666c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0026:
        r1 = r4.mo4667d();
        r3 = r5.mo4667d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0034:
        r1 = r4.mo4668e();
        r3 = r5.mo4668e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0042:
        r1 = r4.m23716g();
        r5 = r5.m23716g();
        r5 = kotlin.jvm.internal.C2885g.m13909a(r1, r5);
        if (r5 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0052;
    L_0x0051:
        r0 = 0;
    L_0x0052:
        return r0;
    L_0x0053:
        r0 = r5 instanceof kotlin.p152c.C4327d;
        if (r0 == 0) goto L_0x0060;
    L_0x0057:
        r0 = r4.m23717h();
        r5 = r5.equals(r0);
        return r5;
    L_0x0060:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.FunctionReference.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((mo4666c() == null ? 0 : mo4666c().hashCode() * 31) + mo4667d().hashCode()) * 31) + mo4668e().hashCode();
    }

    public String toString() {
        FunctionReference h = m23717h();
        if (h != this) {
            return h.toString();
        }
        String str;
        if ("<init>".equals(mo4667d())) {
            str = "constructor (Kotlin reflection is not available)";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("function ");
            stringBuilder.append(mo4667d());
            stringBuilder.append(" (Kotlin reflection is not available)");
            str = stringBuilder.toString();
        }
        return str;
    }
}
