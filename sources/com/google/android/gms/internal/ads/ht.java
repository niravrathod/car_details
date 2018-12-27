package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzayv.zzb;
import java.security.GeneralSecurityException;

final class ht implements zzavt<zzavm> {
    ht() {
    }

    /* renamed from: a */
    public final String mo1957a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: b */
    public final int mo1958b() {
        return 0;
    }

    /* renamed from: d */
    private final zzavm m20508d(zzbbu zzbbu) {
        try {
            zzbbu = zzaxl.m29017a(zzbbu);
            if (zzbbu instanceof zzaxl) {
                zzaxl zzaxl = (zzaxl) zzbbu;
                zzbbd.m10252a(zzaxl.m29026a(), 0);
                zzbbd.m10251a(zzaxl.m29029c().mo4215a());
                if (zzaxl.m29028b().m29037a() != 12) {
                    if (zzaxl.m29028b().m29037a() != 16) {
                        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                    }
                }
                return new zzazv(zzaxl.m29029c().m10273b(), zzaxl.m29028b().m29037a());
            }
            throw new GeneralSecurityException("expected AesEaxKey proto");
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1959b(zzbbu zzbbu) {
        try {
            return mo1960b(zzaxn.m29030a(zzbbu));
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1960b(zzbel zzbel) {
        if (zzbel instanceof zzaxn) {
            zzaxn zzaxn = (zzaxn) zzbel;
            zzbbd.m10251a(zzaxn.m29034b());
            if (zzaxn.m29032a().m29037a() != 12) {
                if (zzaxn.m29032a().m29037a() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
            }
            return (zzbdd) zzaxl.m29024d().m29016a(zzbbu.m10260a(zzbay.m10249a(zzaxn.m29034b()))).m29015a(zzaxn.m29032a()).m29014a(0).mo4804f();
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    /* renamed from: c */
    public final zzayv mo1961c(zzbbu zzbbu) {
        return (zzayv) ((zzbdd) zzayv.m29161d().m29154a("type.googleapis.com/google.crypto.tink.AesEaxKey").m29153a(((zzaxl) mo1959b(zzbbu)).mo4211h()).m29152a(zzb.SYMMETRIC).mo4804f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1956a(zzbel zzbel) {
        if (zzbel instanceof zzaxl) {
            zzaxl zzaxl = (zzaxl) zzbel;
            zzbbd.m10252a(zzaxl.m29026a(), 0);
            zzbbd.m10251a(zzaxl.m29029c().mo4215a());
            if (zzaxl.m29028b().m29037a() != 12) {
                if (zzaxl.m29028b().m29037a() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
            }
            return new zzazv(zzaxl.m29029c().m10273b(), zzaxl.m29028b().m29037a());
        }
        throw new GeneralSecurityException("expected AesEaxKey proto");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1955a(zzbbu zzbbu) {
        return m20508d(zzbbu);
    }
}
