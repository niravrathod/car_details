package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class id {
    /* renamed from: a */
    public static void m8948a(zzayd zzayd) {
        zzbag.m10237a(m8945a(zzayd.m29077a().m29120a()));
        m8947a(zzayd.m29077a().m29122b());
        if (zzayd.m29080c() != zzaxx.UNKNOWN_FORMAT) {
            zzawb.m10208a(zzayd.m29079b().m29069a());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: a */
    public static String m8947a(zzayn zzayn) {
        switch (ie.f8161a[zzayn.ordinal()]) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha256";
            case 3:
                return "HmacSha512";
            default:
                zzayn = String.valueOf(zzayn);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzayn).length() + 27);
                stringBuilder.append("hash unsupported for HMAC: ");
                stringBuilder.append(zzayn);
                throw new NoSuchAlgorithmException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static zzbai m8945a(zzayl zzayl) {
        switch (ie.f8162b[zzayl.ordinal()]) {
            case 1:
                return zzbai.NIST_P256;
            case 2:
                return zzbai.NIST_P384;
            case 3:
                return zzbai.NIST_P521;
            default:
                zzayl = String.valueOf(zzayl);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzayl).length() + 20);
                stringBuilder.append("unknown curve type: ");
                stringBuilder.append(zzayl);
                throw new GeneralSecurityException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static zzbaj m8946a(zzaxx zzaxx) {
        switch (ie.f8163c[zzaxx.ordinal()]) {
            case 1:
                return zzbaj.UNCOMPRESSED;
            case 2:
                return zzbaj.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
            case 3:
                return zzbaj.COMPRESSED;
            default:
                zzaxx = String.valueOf(zzaxx);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzaxx).length() + 22);
                stringBuilder.append("unknown point format: ");
                stringBuilder.append(zzaxx);
                throw new GeneralSecurityException(stringBuilder.toString());
        }
    }
}
