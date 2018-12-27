package com.google.android.exoplayer2.extractor.p129d;

import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.d.d */
final class C2228d {
    /* renamed from: a */
    private final C2229e f7021a = new C2229e();
    /* renamed from: b */
    private final C2175k f7022b = new C2175k(new byte[65025], 0);
    /* renamed from: c */
    private int f7023c = -1;
    /* renamed from: d */
    private int f7024d;
    /* renamed from: e */
    private boolean f7025e;

    C2228d() {
    }

    /* renamed from: a */
    public void m8204a() {
        this.f7021a.m8209a();
        this.f7022b.m7971a();
        this.f7023c = -1;
        this.f7025e = false;
    }

    /* renamed from: a */
    public boolean m8205a(C2260g c2260g) {
        C2163a.m7918b(c2260g != null);
        if (this.f7025e) {
            this.f7025e = false;
            this.f7022b.m7971a();
        }
        while (!this.f7025e) {
            int i;
            int i2;
            if (this.f7023c < 0) {
                if (!this.f7021a.m8210a(c2260g, true)) {
                    return false;
                }
                i = this.f7021a.f7034h;
                if ((this.f7021a.f7028b & 1) == 1 && this.f7022b.m7978c() == 0) {
                    i += m8203a(0);
                    i2 = this.f7024d + 0;
                } else {
                    i2 = 0;
                }
                c2260g.mo1586b(i);
                this.f7023c = i2;
            }
            i = m8203a(this.f7023c);
            i2 = this.f7023c + this.f7024d;
            if (i > 0) {
                if (this.f7022b.m7982e() < this.f7022b.m7978c() + i) {
                    this.f7022b.f6735a = Arrays.copyOf(this.f7022b.f6735a, this.f7022b.m7978c() + i);
                }
                c2260g.mo1587b(this.f7022b.f6735a, this.f7022b.m7978c(), i);
                this.f7022b.m7977b(this.f7022b.m7978c() + i);
                this.f7025e = this.f7021a.f7036j[i2 + -1] != 255;
            }
            if (i2 == this.f7021a.f7033g) {
                i2 = -1;
            }
            this.f7023c = i2;
        }
        return true;
    }

    /* renamed from: b */
    public C2229e m8206b() {
        return this.f7021a;
    }

    /* renamed from: c */
    public C2175k m8207c() {
        return this.f7022b;
    }

    /* renamed from: d */
    public void m8208d() {
        if (this.f7022b.f6735a.length != 65025) {
            this.f7022b.f6735a = Arrays.copyOf(this.f7022b.f6735a, Math.max(65025, this.f7022b.m7978c()));
        }
    }

    /* renamed from: a */
    private int m8203a(int i) {
        int i2 = 0;
        this.f7024d = 0;
        while (this.f7024d + i < this.f7021a.f7033g) {
            int[] iArr = this.f7021a.f7036j;
            int i3 = this.f7024d;
            this.f7024d = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }
}
