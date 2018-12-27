package com.google.android.exoplayer2.extractor.p130e;

import com.google.android.exoplayer2.p126c.C2163a;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.e.n */
final class C2247n {
    /* renamed from: a */
    public byte[] f7135a;
    /* renamed from: b */
    public int f7136b;
    /* renamed from: c */
    private final int f7137c;
    /* renamed from: d */
    private boolean f7138d;
    /* renamed from: e */
    private boolean f7139e;

    public C2247n(int i, int i2) {
        this.f7137c = i;
        this.f7135a = new byte[(i2 + 3)];
        this.f7135a[2] = (byte) 1;
    }

    /* renamed from: a */
    public void m8267a() {
        this.f7138d = false;
        this.f7139e = false;
    }

    /* renamed from: b */
    public boolean m8270b() {
        return this.f7139e;
    }

    /* renamed from: a */
    public void m8268a(int i) {
        boolean z = true;
        C2163a.m7918b(this.f7138d ^ true);
        if (i != this.f7137c) {
            z = false;
        }
        this.f7138d = z;
        if (this.f7138d != 0) {
            this.f7136b = 3;
            this.f7139e = false;
        }
    }

    /* renamed from: a */
    public void m8269a(byte[] bArr, int i, int i2) {
        if (this.f7138d) {
            i2 -= i;
            if (this.f7135a.length < this.f7136b + i2) {
                this.f7135a = Arrays.copyOf(this.f7135a, (this.f7136b + i2) * 2);
            }
            System.arraycopy(bArr, i, this.f7135a, this.f7136b, i2);
            this.f7136b += i2;
        }
    }

    /* renamed from: b */
    public boolean m8271b(int i) {
        if (!this.f7138d) {
            return false;
        }
        this.f7136b -= i;
        this.f7138d = false;
        this.f7139e = true;
        return true;
    }
}
