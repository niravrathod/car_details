package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzavo {
    /* renamed from: a */
    public static zzazc m10183a(String str, String str2, String str3, int i, boolean z) {
        str2 = zzazc.m29188f().m29174a(str2);
        i = "type.googleapis.com/google.crypto.tink.";
        str3 = String.valueOf(str3);
        return (zzazc) ((zzbdd) str2.m29176b(str3.length() ? i.concat(str3) : new String(i)).m29173a((int) null).m29175a(true).m29177c(str).mo4804f());
    }

    /* renamed from: a */
    public static void m10184a(zzazs zzazs) {
        for (zzazc zzazc : zzazs.m29277a()) {
            if (zzazc.m29192b().isEmpty()) {
                throw new GeneralSecurityException("Missing type_url.");
            } else if (zzazc.m29191a().isEmpty()) {
                throw new GeneralSecurityException("Missing primitive_name.");
            } else if (zzazc.m29195e().isEmpty()) {
                throw new GeneralSecurityException("Missing catalogue_name.");
            } else {
                zzawb.m10213a(zzawb.m10206a(zzazc.m29195e()).mo1954a(zzazc.m29192b(), zzazc.m29191a(), zzazc.m29193c()), zzazc.m29194d());
            }
        }
    }
}
