package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.p126c.C2175k;

abstract class TagPayloadReader {
    /* renamed from: a */
    protected final C2267n f7172a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    protected abstract void mo1620a(C2175k c2175k, long j);

    /* renamed from: a */
    protected abstract boolean mo1621a(C2175k c2175k);

    protected TagPayloadReader(C2267n c2267n) {
        this.f7172a = c2267n;
    }

    /* renamed from: b */
    public final void m8309b(C2175k c2175k, long j) {
        if (mo1621a(c2175k)) {
            mo1620a(c2175k, j);
        }
    }
}
