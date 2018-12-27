package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzazv implements zzavm {
    /* renamed from: a */
    private final byte[] f17052a;
    /* renamed from: b */
    private final byte[] f17053b;
    /* renamed from: c */
    private final SecretKeySpec f17054c;
    /* renamed from: d */
    private final int f17055d;

    public zzazv(byte[] bArr, int i) {
        if (i != 12) {
            if (i != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
        }
        this.f17055d = i;
        zzbbd.m10251a(bArr.length);
        this.f17054c = new SecretKeySpec(bArr, "AES");
        bArr = Cipher.getInstance("AES/ECB/NOPADDING");
        bArr.init(1, this.f17054c);
        this.f17052a = m21492a(bArr.doFinal(new byte[16]));
        this.f17053b = m21492a(this.f17052a);
    }

    /* renamed from: b */
    private static byte[] m21493b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    private static byte[] m21492a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        i2 = bArr[15] << 1;
        if ((bArr[0] & 128) != null) {
            i = 135;
        }
        bArr2[15] = (byte) (i2 ^ i);
        return bArr2;
    }

    /* renamed from: a */
    private final byte[] m21491a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m21493b(bArr2, this.f17052a));
        }
        i = cipher.doFinal(bArr2);
        byte[] bArr3 = i;
        i = 0;
        while (i3 - i > 16) {
            for (int i4 = 0; i4 < 16; i4++) {
                bArr3[i4] = (byte) (bArr3[i4] ^ bArr[(i2 + i) + i4]);
            }
            bArr3 = cipher.doFinal(bArr3);
            i += 16;
        }
        i = Arrays.copyOfRange(bArr, i + i2, i2 + i3);
        if (i.length == 16) {
            i = m21493b(i, this.f17052a);
        } else {
            bArr = Arrays.copyOf(this.f17053b, 16);
            for (int i5 = 0; i5 < i.length; i5++) {
                bArr[i5] = (byte) (bArr[i5] ^ i[i5]);
            }
            bArr[i.length] = (byte) (bArr[i.length] ^ 128);
            i = bArr;
        }
        return cipher.doFinal(m21493b(bArr3, i));
    }

    /* renamed from: a */
    public final byte[] mo1966a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        if (bArr3.length <= (BaseClientBuilder.API_PRIORITY_OTHER - this.f17055d) - 16) {
            Object obj = new byte[((r6.f17055d + bArr3.length) + 16)];
            Object a = zzbay.m10249a(r6.f17055d);
            int i = 0;
            System.arraycopy(a, 0, obj, 0, r6.f17055d);
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, r6.f17054c);
            byte[] a2 = m21491a(instance, 0, a, 0, a.length);
            byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
            byte[] a3 = m21491a(instance, 1, bArr4, 0, bArr4.length);
            Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
            instance2.init(1, r6.f17054c, new IvParameterSpec(a2));
            instance2.doFinal(bArr, 0, bArr3.length, obj, r6.f17055d);
            byte[] a4 = m21491a(instance, 2, obj, r6.f17055d, bArr3.length);
            int length = bArr3.length + r6.f17055d;
            while (i < 16) {
                obj[length + i] = (byte) ((a3[i] ^ a2[i]) ^ a4[i]);
                i++;
            }
            return obj;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
