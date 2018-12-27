package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class zzbal<T_WRAPPER extends zzbam<T_ENGINE>, T_ENGINE> {
    /* renamed from: a */
    public static final zzbal<zzban, Cipher> f9073a = new zzbal(new zzban());
    /* renamed from: b */
    public static final zzbal<zzbar, Mac> f9074b = new zzbal(new zzbar());
    /* renamed from: c */
    public static final zzbal<zzbao, KeyAgreement> f9075c = new zzbal(new zzbao());
    /* renamed from: d */
    public static final zzbal<zzbaq, KeyPairGenerator> f9076d = new zzbal(new zzbaq());
    /* renamed from: e */
    public static final zzbal<zzbap, KeyFactory> f9077e = new zzbal(new zzbap());
    /* renamed from: f */
    private static final Logger f9078f = Logger.getLogger(zzbal.class.getName());
    /* renamed from: g */
    private static final List<Provider> f9079g;
    /* renamed from: h */
    private static final zzbal<zzbat, Signature> f9080h = new zzbal(new zzbat());
    /* renamed from: i */
    private static final zzbal<zzbas, MessageDigest> f9081i = new zzbal(new zzbas());
    /* renamed from: j */
    private T_WRAPPER f9082j;
    /* renamed from: k */
    private List<Provider> f9083k = f9079g;
    /* renamed from: l */
    private boolean f9084l = true;

    private zzbal(T_WRAPPER t_wrapper) {
        this.f9082j = t_wrapper;
    }

    /* renamed from: a */
    public final T_ENGINE m10243a(String str) {
        for (Provider provider : this.f9083k) {
            if (m10242a(str, provider)) {
                return this.f9082j.mo2420a(str, provider);
            }
        }
        if (this.f9084l) {
            return this.f9082j.mo2420a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }

    /* renamed from: a */
    private final boolean m10242a(String str, Provider provider) {
        try {
            this.f9082j.mo2420a(str, provider);
            return true;
        } catch (String str2) {
            zzbbe.m10254a(str2);
            return null;
        }
    }

    static {
        if (jz.m8953a()) {
            String[] strArr = new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL"};
            List arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                Provider provider = Security.getProvider(strArr[i]);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f9078f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{r4}));
                }
            }
            f9079g = arrayList;
        } else {
            f9079g = new ArrayList();
        }
    }
}
