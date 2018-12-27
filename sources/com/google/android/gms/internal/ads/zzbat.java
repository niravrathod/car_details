package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

public final class zzbat implements zzbam<Signature> {
    /* renamed from: a */
    public final /* synthetic */ Object mo2420a(String str, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
