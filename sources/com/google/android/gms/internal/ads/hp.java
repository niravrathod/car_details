package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaze.zzb;
import com.google.android.gms.internal.ads.zzbdd.zza;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

final class hp {
    /* renamed from: a */
    private static final Charset f8160a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static zzazg m8943a(zzaze zzaze) {
        zza a = zzazg.m29226a().m29209a(zzaze.m29205a());
        for (zzb zzb : zzaze.m29207b()) {
            a.m29210a((zzazg.zzb) ((zzbdd) zzazg.zzb.m29215a().m29214a(zzb.m29199b().m29165a()).m29212a(zzb.m29200c()).m29213a(zzb.m29202e()).m29211a(zzb.m29201d()).mo4804f()));
        }
        return (zzazg) ((zzbdd) a.mo4804f());
    }

    /* renamed from: b */
    public static void m8944b(zzaze zzaze) {
        if (zzaze.m29208c() != 0) {
            int a = zzaze.m29205a();
            Object obj = null;
            Object obj2 = 1;
            for (zzb zzb : zzaze.m29207b()) {
                if (!zzb.m29198a()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzb.m29201d())}));
                } else if (zzb.m29202e() == zzazq.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzb.m29201d())}));
                } else if (zzb.m29200c() != zzayy.UNKNOWN_STATUS) {
                    if (zzb.m29200c() == zzayy.ENABLED && zzb.m29201d() == a) {
                        if (obj == null) {
                            obj = 1;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (zzb.m29199b().m29167c() != zzayv.zzb.ASYMMETRIC_PUBLIC) {
                        obj2 = null;
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzb.m29201d())}));
                }
            }
            if (obj != null) {
                return;
            }
            if (obj2 == null) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
