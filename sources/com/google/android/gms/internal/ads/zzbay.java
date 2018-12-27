package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class zzbay {
    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f9086a = new jw();

    /* renamed from: b */
    private static SecureRandom m10250b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    /* renamed from: a */
    public static byte[] m10249a(int i) {
        i = new byte[i];
        ((SecureRandom) f9086a.get()).nextBytes(i);
        return i;
    }
}
