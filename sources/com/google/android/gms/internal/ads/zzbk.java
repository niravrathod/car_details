package com.google.android.gms.internal.ads;

import android.util.Base64;

public final class zzbk {
    /* renamed from: a */
    public static String m10467a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? true : true);
    }

    /* renamed from: a */
    public static byte[] m10468a(String str, boolean z) {
        z = Base64.decode(str, z ? true : true);
        if (z.length != 0 || str.length() <= 0) {
            return z;
        }
        String str2 = "Unable to decode ";
        str = String.valueOf(str);
        throw new IllegalArgumentException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
