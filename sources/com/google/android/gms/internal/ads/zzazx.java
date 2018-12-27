package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzazx {
    /* renamed from: a */
    public static byte[] m10222a(byte[]... bArr) {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (i2 <= BaseClientBuilder.API_PRIORITY_OTHER - bArr2.length) {
                i2 += bArr2.length;
                i++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        Object obj = new byte[i2];
        int i3 = 0;
        for (Object obj2 : bArr) {
            System.arraycopy(obj2, 0, obj, i3, obj2.length);
            i3 += obj2.length;
        }
        return obj;
    }

    /* renamed from: a */
    public static final void m10221a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }
}
