package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p126c.C2175k;
import java.io.EOFException;

/* renamed from: com.google.android.exoplayer2.extractor.e */
public final class C4012e implements C2267n {
    /* renamed from: a */
    public void mo1605a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    /* renamed from: a */
    public void mo1606a(Format format) {
    }

    /* renamed from: a */
    public int mo1604a(C2260g c2260g, int i, boolean z) {
        c2260g = c2260g.mo1581a(i);
        if (c2260g != -1) {
            return c2260g;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public void mo1607a(C2175k c2175k, int i) {
        c2175k.m7981d(i);
    }
}
