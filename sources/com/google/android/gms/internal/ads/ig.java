package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzayv.zzb;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

final class ig implements zzavt<zzavx> {
    ig() {
    }

    /* renamed from: a */
    public final String mo1957a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: b */
    public final int mo1958b() {
        return 0;
    }

    /* renamed from: d */
    private final zzavx m20572d(zzbbu zzbbu) {
        try {
            zzbbu = zzayp.m29127a(zzbbu);
            if (zzbbu instanceof zzayp) {
                zzayp zzayp = (zzayp) zzbbu;
                zzbbd.m10252a(zzayp.m29137a(), 0);
                if (zzayp.m29140c().mo4215a() >= 16) {
                    zzbaw zzbaw;
                    m20571a(zzayp.m29139b());
                    zzayn a = zzayp.m29139b().m29149a();
                    Key secretKeySpec = new SecretKeySpec(zzayp.m29140c().m10273b(), "HMAC");
                    zzbbu = zzayp.m29139b().m29151b();
                    switch (ih.f8164a[a.ordinal()]) {
                        case 1:
                            zzbaw = new zzbaw("HMACSHA1", secretKeySpec, zzbbu);
                            break;
                        case 2:
                            zzbaw = new zzbaw("HMACSHA256", secretKeySpec, zzbbu);
                            break;
                        case 3:
                            zzbaw = new zzbaw("HMACSHA512", secretKeySpec, zzbbu);
                            break;
                        default:
                            throw new GeneralSecurityException("unknown hash");
                    }
                    return zzbaw;
                }
                throw new GeneralSecurityException("key too short");
            }
            throw new GeneralSecurityException("expected HmacKey proto");
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1959b(zzbbu zzbbu) {
        try {
            return mo1960b(zzayr.m29141a(zzbbu));
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1960b(zzbel zzbel) {
        if (zzbel instanceof zzayr) {
            zzayr zzayr = (zzayr) zzbel;
            if (zzayr.m29146b() >= 16) {
                m20571a(zzayr.m29144a());
                return (zzbdd) zzayp.m29134d().m29124a(0).m29125a(zzayr.m29144a()).m29126a(zzbbu.m10260a(zzbay.m10249a(zzayr.m29146b()))).mo4804f();
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    /* renamed from: c */
    public final zzayv mo1961c(zzbbu zzbbu) {
        return (zzayv) ((zzbdd) zzayv.m29161d().m29154a("type.googleapis.com/google.crypto.tink.HmacKey").m29153a(((zzayp) mo1959b(zzbbu)).mo4211h()).m29152a(zzb.SYMMETRIC).mo4804f());
    }

    /* renamed from: a */
    private static void m20571a(zzayt zzayt) {
        if (zzayt.m29151b() >= 10) {
            switch (ih.f8164a[zzayt.m29149a().ordinal()]) {
                case 1:
                    if (zzayt.m29151b() > 20) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case 2:
                    if (zzayt.m29151b() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case 3:
                    if (zzayt.m29151b() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                default:
                    throw new GeneralSecurityException("unknown hash type");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1956a(zzbel zzbel) {
        if (zzbel instanceof zzayp) {
            zzayp zzayp = (zzayp) zzbel;
            zzbbd.m10252a(zzayp.m29137a(), 0);
            if (zzayp.m29140c().mo4215a() >= 16) {
                m20571a(zzayp.m29139b());
                zzayn a = zzayp.m29139b().m29149a();
                Key secretKeySpec = new SecretKeySpec(zzayp.m29140c().m10273b(), "HMAC");
                zzbel = zzayp.m29139b().m29151b();
                switch (ih.f8164a[a.ordinal()]) {
                    case 1:
                        return new zzbaw("HMACSHA1", secretKeySpec, zzbel);
                    case 2:
                        return new zzbaw("HMACSHA256", secretKeySpec, zzbel);
                    case 3:
                        return new zzbaw("HMACSHA512", secretKeySpec, zzbel);
                    default:
                        throw new GeneralSecurityException("unknown hash");
                }
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKey proto");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1955a(zzbbu zzbbu) {
        return m20572d(zzbbu);
    }
}
