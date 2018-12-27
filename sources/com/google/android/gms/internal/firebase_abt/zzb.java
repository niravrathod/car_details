package com.google.android.gms.internal.firebase_abt;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class zzb {
    /* renamed from: a */
    private final ByteBuffer f10005a;

    private zzb(ByteBuffer byteBuffer) {
        this.f10005a = byteBuffer;
        this.f10005a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzb(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, 0, i2));
    }

    /* renamed from: a */
    public static zzb m11468a(byte[] bArr) {
        return new zzb(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m11469b(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: c */
    private final void m11470c(int i) {
        byte b = (byte) i;
        if (this.f10005a.hasRemaining()) {
            this.f10005a.put(b);
            return;
        }
        throw new zzc(this.f10005a.position(), this.f10005a.limit());
    }

    /* renamed from: a */
    public final void m11471a(int i) {
        while ((i & -128) != 0) {
            m11470c((i & 127) | 128);
            i >>>= 7;
        }
        m11470c(i);
    }

    /* renamed from: b */
    public final void m11472b(byte[] bArr) {
        int length = bArr.length;
        if (this.f10005a.remaining() >= length) {
            this.f10005a.put(bArr, 0, length);
            return;
        }
        throw new zzc(this.f10005a.position(), this.f10005a.limit());
    }
}
