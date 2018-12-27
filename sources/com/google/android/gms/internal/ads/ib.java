package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class ib implements zzavn<zzavs> {
    /* renamed from: a */
    public final zzavt<zzavs> mo1954a(String str, String str2, int i) {
        Object obj;
        String toLowerCase = str2.toLowerCase();
        Object obj2 = -1;
        if (toLowerCase.hashCode() == 1420614889) {
            if (toLowerCase.equals("hybridencrypt")) {
                obj = null;
                if (obj != null) {
                    if (str.hashCode() != 396454335) {
                        if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey") != null) {
                            obj2 = null;
                        }
                    }
                    if (obj2 != null) {
                        str2 = new hz();
                        if (i <= 0) {
                            return str2;
                        }
                        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
                    }
                    throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
                }
                throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
            }
        }
        obj = -1;
        if (obj != null) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
        }
        if (str.hashCode() != 396454335) {
            if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey") != null) {
                obj2 = null;
            }
        }
        if (obj2 != null) {
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        str2 = new hz();
        if (i <= 0) {
            return str2;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
    }
}
