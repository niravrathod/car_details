package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

public final class zzban implements zzbam<Cipher> {
    /* renamed from: a */
    public final /* synthetic */ Object mo2420a(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
