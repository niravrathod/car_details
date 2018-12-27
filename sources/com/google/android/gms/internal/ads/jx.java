package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class jx implements zzbav {
    /* renamed from: a */
    static final int[] f16512a = m20582a(ByteBuffer.wrap(new byte[]{(byte) 101, (byte) 120, (byte) 112, (byte) 97, (byte) 110, (byte) 100, (byte) 32, (byte) 51, (byte) 50, (byte) 45, (byte) 98, (byte) 121, (byte) 116, (byte) 101, (byte) 32, (byte) 107}));
    /* renamed from: b */
    final zzbau f16513b;
    /* renamed from: c */
    private final int f16514c;

    jx(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f16513b = zzbau.m10245a(bArr);
            this.f16514c = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    static int m20581a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: a */
    abstract int mo4157a();

    /* renamed from: a */
    abstract ByteBuffer mo4158a(byte[] bArr, int i);

    /* renamed from: a */
    public final byte[] mo1965a(byte[] bArr) {
        int length = bArr.length;
        mo4157a();
        if (length <= 2147483635) {
            ByteBuffer allocate = ByteBuffer.allocate(mo4157a() + bArr.length);
            m20585a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: a */
    final void m20585a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - mo4157a() >= bArr.length) {
            byte[] a = zzbay.m10249a(mo4157a());
            byteBuffer.put(a);
            bArr = ByteBuffer.wrap(bArr);
            int remaining = bArr.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer a2 = mo4158a(a, this.f16514c + i2);
                if (i2 == i - 1) {
                    zzazx.m10221a(byteBuffer, bArr, a2, remaining % 64);
                } else {
                    zzazx.m10221a(byteBuffer, bArr, a2, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: a */
    static int[] m20582a(ByteBuffer byteBuffer) {
        byteBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[byteBuffer.remaining()];
        byteBuffer.get(iArr);
        return iArr;
    }
}
