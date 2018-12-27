package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@zzaer
public final class zzgy extends zzgt {
    /* renamed from: b */
    private MessageDigest f17208b;

    /* renamed from: a */
    public final byte[] mo2452a(String str) {
        byte[] array;
        str = str.split(" ");
        int i = 4;
        if (str.length == 1) {
            str = zzgx.m10653a(str[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(str);
            array = allocate.array();
        } else if (str.length < 5) {
            array = new byte[(str.length << 1)];
            for (r4 = 0; r4 < str.length; r4++) {
                int a = zzgx.m10653a(str[r4]);
                a = (a >> 16) ^ (65535 & a);
                byte[] bArr = new byte[]{(byte) a, (byte) (a >> 8)};
                a = r4 << 1;
                array[a] = bArr[0];
                array[a + 1] = bArr[1];
            }
        } else {
            array = new byte[str.length];
            for (int i2 = 0; i2 < str.length; i2++) {
                r4 = zzgx.m10653a(str[i2]);
                array[i2] = (byte) ((r4 >> 24) ^ (((r4 & 255) ^ ((r4 >> 8) & 255)) ^ ((r4 >> 16) & 255)));
            }
        }
        this.f17208b = m10649a();
        synchronized (this.a) {
            if (this.f17208b == null) {
                array = new byte[0];
                return array;
            }
            this.f17208b.reset();
            this.f17208b.update(array);
            Object digest = this.f17208b.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            Object obj = new byte[i];
            System.arraycopy(digest, 0, obj, 0, obj.length);
            return obj;
        }
    }
}
