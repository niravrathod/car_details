package com.google.android.exoplayer2.extractor.p130e;

import android.util.Log;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2174j;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2183q;

/* renamed from: com.google.android.exoplayer2.extractor.e.o */
public final class C4003o implements C2255v {
    /* renamed from: a */
    private final C2241h f16091a;
    /* renamed from: b */
    private final C2174j f16092b = new C2174j(new byte[10]);
    /* renamed from: c */
    private int f16093c = null;
    /* renamed from: d */
    private int f16094d;
    /* renamed from: e */
    private C2183q f16095e;
    /* renamed from: f */
    private boolean f16096f;
    /* renamed from: g */
    private boolean f16097g;
    /* renamed from: h */
    private boolean f16098h;
    /* renamed from: i */
    private int f16099i;
    /* renamed from: j */
    private int f16100j;
    /* renamed from: k */
    private boolean f16101k;
    /* renamed from: l */
    private long f16102l;

    public C4003o(C2241h c2241h) {
        this.f16091a = c2241h;
    }

    /* renamed from: a */
    public void mo1617a(C2183q c2183q, C2261h c2261h, C2254d c2254d) {
        this.f16095e = c2183q;
        this.f16091a.mo1611a(c2261h, c2254d);
    }

    /* renamed from: a */
    public final void mo1615a() {
        this.f16093c = 0;
        this.f16094d = 0;
        this.f16098h = false;
        this.f16091a.mo1608a();
    }

    /* renamed from: a */
    public final void mo1616a(C2175k c2175k, boolean z) {
        if (z) {
            switch (this.f16093c) {
                case false:
                case true:
                    break;
                case true:
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                    break;
                case true:
                    if (!this.f16100j) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected start indicator: expected ");
                        stringBuilder.append(this.f16100j);
                        stringBuilder.append(" more bytes");
                        Log.w("PesReader", stringBuilder.toString());
                    }
                    this.f16091a.mo1612b();
                    break;
                default:
                    break;
            }
            m20034a(1);
        }
        while (c2175k.m7976b() <= false) {
            int i = 0;
            switch (this.f16093c) {
                case false:
                    c2175k.m7981d(c2175k.m7976b());
                    break;
                case true:
                    if (!m20035a(c2175k, this.f16092b.f6731a, 9)) {
                        break;
                    }
                    if (m20036b()) {
                        i = 2;
                    }
                    m20034a(i);
                    break;
                case true:
                    if (m20035a(c2175k, this.f16092b.f6731a, Math.min(true, this.f16099i)) && m20035a(c2175k, (byte[]) false, this.f16099i)) {
                        m20037c();
                        this.f16091a.mo1609a(this.f16102l, this.f16101k);
                        m20034a(true);
                        break;
                    }
                case true:
                    z = c2175k.m7976b();
                    if (this.f16100j != -1) {
                        i = z - this.f16100j;
                    }
                    if (i > 0) {
                        z -= i;
                        c2175k.m7977b(c2175k.m7980d() + z);
                    }
                    this.f16091a.mo1610a(c2175k);
                    if (this.f16100j == -1) {
                        break;
                    }
                    this.f16100j -= z;
                    if (!this.f16100j) {
                        this.f16091a.mo1612b();
                        m20034a(1);
                        break;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m20034a(int i) {
        this.f16093c = i;
        this.f16094d = 0;
    }

    /* renamed from: a */
    private boolean m20035a(C2175k c2175k, byte[] bArr, int i) {
        int min = Math.min(c2175k.m7976b(), i - this.f16094d);
        boolean z = true;
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c2175k.m7981d(min);
        } else {
            c2175k.m7975a(bArr, this.f16094d, min);
        }
        this.f16094d += min;
        if (this.f16094d != i) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private boolean m20036b() {
        this.f16092b.m7960a(0);
        int c = this.f16092b.m7966c(24);
        if (c != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected start code prefix: ");
            stringBuilder.append(c);
            Log.w("PesReader", stringBuilder.toString());
            this.f16100j = -1;
            return false;
        }
        this.f16092b.m7964b(8);
        c = this.f16092b.m7966c(16);
        this.f16092b.m7964b(5);
        this.f16101k = this.f16092b.m7968d();
        this.f16092b.m7964b(2);
        this.f16096f = this.f16092b.m7968d();
        this.f16097g = this.f16092b.m7968d();
        this.f16092b.m7964b(6);
        this.f16099i = this.f16092b.m7966c(8);
        if (c == 0) {
            this.f16100j = -1;
        } else {
            this.f16100j = ((c + 6) - 9) - this.f16099i;
        }
        return true;
    }

    /* renamed from: c */
    private void m20037c() {
        this.f16092b.m7960a(0);
        this.f16102l = -9223372036854775807L;
        if (this.f16096f) {
            this.f16092b.m7964b(4);
            long c = ((long) this.f16092b.m7966c(3)) << 30;
            this.f16092b.m7964b(1);
            c |= (long) (this.f16092b.m7966c(15) << 15);
            this.f16092b.m7964b(1);
            c |= (long) this.f16092b.m7966c(15);
            this.f16092b.m7964b(1);
            if (!this.f16098h && this.f16097g) {
                this.f16092b.m7964b(4);
                long c2 = ((long) this.f16092b.m7966c(3)) << 30;
                this.f16092b.m7964b(1);
                c2 |= (long) (this.f16092b.m7966c(15) << 15);
                this.f16092b.m7964b(1);
                c2 |= (long) this.f16092b.m7966c(15);
                this.f16092b.m7964b(1);
                this.f16095e.m8031b(c2);
                this.f16098h = true;
            }
            this.f16102l = this.f16095e.m8031b(c);
        }
    }
}
