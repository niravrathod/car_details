package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class hq implements zzavn<zzavm> {
    /* renamed from: a */
    public final zzavt<zzavm> mo1954a(String str, String str2, int i) {
        Object obj;
        String toLowerCase = str2.toLowerCase();
        Object obj2 = -1;
        if (toLowerCase.hashCode() == 2989895) {
            if (toLowerCase.equals("aead")) {
                obj = null;
                if (obj != null) {
                    switch (str.hashCode()) {
                        case 360753376:
                            if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key") != null) {
                                obj2 = 3;
                                break;
                            }
                            break;
                        case 1215885937:
                            if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey") != null) {
                                obj2 = null;
                                break;
                            }
                            break;
                        case 1469984853:
                            if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey") != null) {
                                obj2 = 4;
                                break;
                            }
                            break;
                        case 1797113348:
                            if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey") != null) {
                                obj2 = 1;
                                break;
                            }
                            break;
                        case 1855890991:
                            if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey") != null) {
                                obj2 = 2;
                                break;
                            }
                            break;
                        case 2079211877:
                            if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey") != null) {
                                obj2 = 5;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    switch (obj2) {
                        case null:
                            str2 = new hr();
                            break;
                        case 1:
                            str2 = new ht();
                            break;
                        case 2:
                            str2 = new hu();
                            break;
                        case 3:
                            str2 = new hv();
                            break;
                        case 4:
                            str2 = new hw();
                            break;
                        case 5:
                            str2 = new hx();
                            break;
                        default:
                            throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[]{str}));
                    }
                    if (str2.mo1958b() >= i) {
                        return str2;
                    }
                    throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
                }
                throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
            }
        }
        obj = -1;
        if (obj != null) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
        }
        switch (str.hashCode()) {
            case 360753376:
                if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key") != null) {
                    obj2 = 3;
                    break;
                }
                break;
            case 1215885937:
                if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey") != null) {
                    obj2 = null;
                    break;
                }
                break;
            case 1469984853:
                if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey") != null) {
                    obj2 = 4;
                    break;
                }
                break;
            case 1797113348:
                if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey") != null) {
                    obj2 = 1;
                    break;
                }
                break;
            case 1855890991:
                if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey") != null) {
                    obj2 = 2;
                    break;
                }
                break;
            case 2079211877:
                if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey") != null) {
                    obj2 = 5;
                    break;
                }
                break;
            default:
                break;
        }
        switch (obj2) {
            case null:
                str2 = new hr();
                break;
            case 1:
                str2 = new ht();
                break;
            case 2:
                str2 = new hu();
                break;
            case 3:
                str2 = new hv();
                break;
            case 4:
                str2 = new hw();
                break;
            case 5:
                str2 = new hx();
                break;
            default:
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[]{str}));
        }
        if (str2.mo1958b() >= i) {
            return str2;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
    }
}
