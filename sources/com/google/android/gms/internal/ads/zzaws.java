package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.logging.Logger;

public final class zzaws {
    /* renamed from: a */
    private static final Logger f9057a = Logger.getLogger(zzaws.class.getName());

    /* renamed from: a */
    public static zzavs m10219a(zzavu zzavu) {
        zzavu = zzawb.m10207a(zzavu, null);
        for (Collection<zzawa> it : zzavu.m10203b()) {
            for (zzawa a : it) {
                if (!(a.m10204a() instanceof zzavs)) {
                    throw new GeneralSecurityException("invalid HybridEncrypt key material");
                }
            }
        }
        return new ic(zzavu);
    }
}
