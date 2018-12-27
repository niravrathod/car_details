package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class zzbak implements zzavm {
    /* renamed from: a */
    private final zzbav f17070a;
    /* renamed from: b */
    private final zzavx f17071b;
    /* renamed from: c */
    private final int f17072c;

    public zzbak(zzbav zzbav, zzavx zzavx, int i) {
        this.f17070a = zzbav;
        this.f17071b = zzavx;
        this.f17072c = i;
    }

    /* renamed from: a */
    public final byte[] mo1966a(byte[] bArr, byte[] bArr2) {
        bArr = this.f17070a.mo1965a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        copyOf = this.f17071b.mo2421a(zzazx.m10222a(bArr2, bArr, copyOf));
        return zzazx.m10222a(bArr, copyOf);
    }
}
