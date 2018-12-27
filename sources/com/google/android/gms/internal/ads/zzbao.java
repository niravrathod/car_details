package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

public final class zzbao implements zzbam<KeyAgreement> {
    /* renamed from: a */
    public final /* synthetic */ Object mo2420a(String str, Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
