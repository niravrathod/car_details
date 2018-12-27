package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzazu implements zzbav {
    /* renamed from: a */
    private final SecretKeySpec f17049a;
    /* renamed from: b */
    private final int f17050b;
    /* renamed from: c */
    private final int f17051c = ((Cipher) zzbal.f9073a.m10243a("AES/CTR/NoPadding")).getBlockSize();

    public zzazu(byte[] bArr, int i) {
        zzbbd.m10251a(bArr.length);
        this.f17049a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.f17051c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f17050b = i;
    }

    /* renamed from: a */
    public final byte[] mo1965a(byte[] bArr) {
        if (bArr.length <= BaseClientBuilder.API_PRIORITY_OTHER - this.f17050b) {
            Object obj = new byte[(this.f17050b + bArr.length)];
            Object a = zzbay.m10249a(this.f17050b);
            System.arraycopy(a, 0, obj, 0, this.f17050b);
            int length = bArr.length;
            int i = this.f17050b;
            Cipher cipher = (Cipher) zzbal.f9073a.m10243a("AES/CTR/NoPadding");
            Object obj2 = new byte[this.f17051c];
            System.arraycopy(a, 0, obj2, 0, this.f17050b);
            cipher.init(1, this.f17049a, new IvParameterSpec(obj2));
            if (cipher.doFinal(bArr, 0, length, obj, i) == length) {
                return obj;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i2 = BaseClientBuilder.API_PRIORITY_OTHER - this.f17050b;
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("plaintext length can not exceed ");
        stringBuilder.append(i2);
        throw new GeneralSecurityException(stringBuilder.toString());
    }
}
