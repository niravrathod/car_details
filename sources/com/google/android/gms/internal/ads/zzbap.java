package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

public final class zzbap implements zzbam<KeyFactory> {
    /* renamed from: a */
    public final /* synthetic */ Object mo2420a(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
