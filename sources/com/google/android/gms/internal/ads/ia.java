package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class ia implements zzavn<zzavr> {
    /* renamed from: a */
    public final zzavt<zzavr> mo1954a(String str, String str2, int i) {
        Object obj;
        String toLowerCase = str2.toLowerCase();
        Object obj2 = -1;
        if (toLowerCase.hashCode() == 275448849) {
            if (toLowerCase.equals("hybriddecrypt")) {
                obj = null;
                if (obj != null) {
                    if (str.hashCode() != -80133005) {
                        if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") != null) {
                            obj2 = null;
                        }
                    }
                    if (obj2 != null) {
                        str2 = new hy();
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
        if (str.hashCode() != -80133005) {
            if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") != null) {
                obj2 = null;
            }
        }
        if (obj2 != null) {
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        str2 = new hy();
        if (i <= 0) {
            return str2;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
    }
}
