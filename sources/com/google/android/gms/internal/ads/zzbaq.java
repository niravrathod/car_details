package com.google.android.gms.internal.ads;

import java.security.KeyPairGenerator;
import java.security.Provider;

public final class zzbaq implements zzbam<KeyPairGenerator> {
    /* renamed from: a */
    public final /* synthetic */ Object mo2420a(String str, Provider provider) {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
