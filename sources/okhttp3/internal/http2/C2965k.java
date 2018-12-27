package okhttp3.internal.http2;

import java.util.Arrays;

/* renamed from: okhttp3.internal.http2.k */
public final class C2965k {
    /* renamed from: a */
    private int f12532a;
    /* renamed from: b */
    private final int[] f12533b = new int[10];

    /* renamed from: a */
    void m14435a() {
        this.f12532a = 0;
        Arrays.fill(this.f12533b, 0);
    }

    /* renamed from: a */
    C2965k m14434a(int i, int i2) {
        if (i >= 0) {
            if (i < this.f12533b.length) {
                this.f12532a = (1 << i) | this.f12532a;
                this.f12533b[i] = i2;
                return this;
            }
        }
        return this;
    }

    /* renamed from: a */
    boolean m14437a(int i) {
        return ((1 << i) & this.f12532a) != 0;
    }

    /* renamed from: b */
    int m14439b(int i) {
        return this.f12533b[i];
    }

    /* renamed from: b */
    int m14438b() {
        return Integer.bitCount(this.f12532a);
    }

    /* renamed from: c */
    int m14440c() {
        return (this.f12532a & 2) != 0 ? this.f12533b[1] : -1;
    }

    /* renamed from: c */
    int m14441c(int i) {
        return (this.f12532a & 16) != 0 ? this.f12533b[4] : i;
    }

    /* renamed from: d */
    int m14443d(int i) {
        return (this.f12532a & 32) != 0 ? this.f12533b[5] : i;
    }

    /* renamed from: d */
    int m14442d() {
        return (this.f12532a & 128) != 0 ? this.f12533b[7] : 65535;
    }

    /* renamed from: a */
    void m14436a(C2965k c2965k) {
        for (int i = 0; i < 10; i++) {
            if (c2965k.m14437a(i)) {
                m14434a(i, c2965k.m14439b(i));
            }
        }
    }
}
