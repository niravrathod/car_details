package kotlin.p151b;

import java.util.Iterator;
import kotlin.collections.C2872t;
import kotlin.p150a.C2858a;

/* renamed from: kotlin.b.a */
public class C2861a implements Iterable<Integer> {
    /* renamed from: a */
    public static final C2860a f12075a = new C2860a();
    /* renamed from: b */
    private final int f12076b;
    /* renamed from: c */
    private final int f12077c;
    /* renamed from: d */
    private final int f12078d;

    /* renamed from: kotlin.b.a$a */
    public static final class C2860a {
        private C2860a() {
        }

        /* renamed from: a */
        public final C2861a m13874a(int i, int i2, int i3) {
            return new C2861a(i, i2, i3);
        }
    }

    public /* synthetic */ Iterator iterator() {
        return m13878d();
    }

    public C2861a(int i, int i2, int i3) {
        if (i3 != 0) {
            this.f12076b = i;
            this.f12077c = C2858a.m13871a(i, i2, i3);
            this.f12078d = i3;
            return;
        }
        throw ((Throwable) new IllegalArgumentException("Step must be non-zero"));
    }

    /* renamed from: a */
    public final int m13875a() {
        return this.f12076b;
    }

    /* renamed from: b */
    public final int m13876b() {
        return this.f12077c;
    }

    /* renamed from: c */
    public final int m13877c() {
        return this.f12078d;
    }

    /* renamed from: d */
    public C2872t m13878d() {
        return new C4323b(this.f12076b, this.f12077c, this.f12078d);
    }

    /* renamed from: e */
    public boolean mo3601e() {
        if (this.f12078d > 0) {
            if (this.f12076b <= this.f12077c) {
                return false;
            }
        } else if (this.f12076b >= this.f12077c) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        r0 = r3 instanceof kotlin.p151b.C2861a;
        if (r0 == 0) goto L_0x0029;
    L_0x0004:
        r0 = r2.mo3601e();
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r3;
        r0 = (kotlin.p151b.C2861a) r0;
        r0 = r0.mo3601e();
        if (r0 != 0) goto L_0x0027;
    L_0x0013:
        r0 = r2.f12076b;
        r3 = (kotlin.p151b.C2861a) r3;
        r1 = r3.f12076b;
        if (r0 != r1) goto L_0x0029;
    L_0x001b:
        r0 = r2.f12077c;
        r1 = r3.f12077c;
        if (r0 != r1) goto L_0x0029;
    L_0x0021:
        r0 = r2.f12078d;
        r3 = r3.f12078d;
        if (r0 != r3) goto L_0x0029;
    L_0x0027:
        r3 = 1;
        goto L_0x002a;
    L_0x0029:
        r3 = 0;
    L_0x002a:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.b.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return mo3601e() ? -1 : (((this.f12076b * 31) + this.f12077c) * 31) + this.f12078d;
    }

    public String toString() {
        StringBuilder stringBuilder;
        int i;
        if (this.f12078d > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f12076b);
            stringBuilder.append("..");
            stringBuilder.append(this.f12077c);
            stringBuilder.append(" step ");
            i = this.f12078d;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f12076b);
            stringBuilder.append(" downTo ");
            stringBuilder.append(this.f12077c);
            stringBuilder.append(" step ");
            i = -this.f12078d;
        }
        stringBuilder.append(i);
        return stringBuilder.toString();
    }
}
