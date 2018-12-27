package kotlin.p151b;

import java.util.NoSuchElementException;
import kotlin.collections.C2872t;

/* renamed from: kotlin.b.b */
public final class C4323b extends C2872t {
    /* renamed from: a */
    private final int f18062a;
    /* renamed from: b */
    private boolean f18063b;
    /* renamed from: c */
    private int f18064c;
    /* renamed from: d */
    private final int f18065d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4323b(int r3, int r4, int r5) {
        /*
        r2 = this;
        r2.<init>();
        r2.f18065d = r5;
        r2.f18062a = r4;
        r5 = r2.f18065d;
        r0 = 0;
        r1 = 1;
        if (r5 <= 0) goto L_0x0011;
    L_0x000d:
        if (r3 > r4) goto L_0x0014;
    L_0x000f:
        r0 = 1;
        goto L_0x0014;
    L_0x0011:
        if (r3 < r4) goto L_0x0014;
    L_0x0013:
        goto L_0x000f;
    L_0x0014:
        r2.f18063b = r0;
        r4 = r2.f18063b;
        if (r4 == 0) goto L_0x001b;
    L_0x001a:
        goto L_0x001d;
    L_0x001b:
        r3 = r2.f18062a;
    L_0x001d:
        r2.f18064c = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.b.b.<init>(int, int, int):void");
    }

    public boolean hasNext() {
        return this.f18063b;
    }

    /* renamed from: b */
    public int mo3600b() {
        int i = this.f18064c;
        if (i != this.f18062a) {
            this.f18064c += this.f18065d;
        } else if (this.f18063b) {
            this.f18063b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
