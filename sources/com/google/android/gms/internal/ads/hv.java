package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzayv.zzb;
import java.security.GeneralSecurityException;

final class hv implements zzavt<zzavm> {
    hv() {
    }

    /* renamed from: a */
    public final String mo1957a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: b */
    public final int mo1958b() {
        return 0;
    }

    /* renamed from: d */
    private final zzavm m20525d(zzbbu zzbbu) {
        try {
            zzbbu = zzaxv.m29057a(zzbbu);
            if (zzbbu instanceof zzaxv) {
                zzaxv zzaxv = (zzaxv) zzbbu;
                zzbbd.m10252a(zzaxv.m29064a(), 0);
                if (zzaxv.m29066b().mo4215a() == 32) {
                    return new zzazz(zzaxv.m29066b().m10273b());
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1959b(zzbbu zzbbu) {
        return m20524c();
    }

    /* renamed from: b */
    public final zzbel mo1960b(zzbel zzbel) {
        return m20524c();
    }

    /* renamed from: c */
    public final zzayv mo1961c(zzbbu zzbbu) {
        return (zzayv) ((zzbdd) zzayv.m29161d().m29154a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").m29153a(m20524c().mo4211h()).m29152a(zzb.SYMMETRIC).mo4804f());
    }

    /* renamed from: c */
    private static zzaxv m20524c() {
        return (zzaxv) ((zzbdd) zzaxv.m29062c().m29055a(0).m29056a(zzbbu.m10260a(zzbay.m10249a(32))).mo4804f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1956a(zzbel zzbel) {
        if (zzbel instanceof zzaxv) {
            zzaxv zzaxv = (zzaxv) zzbel;
            zzbbd.m10252a(zzaxv.m29064a(), 0);
            if (zzaxv.m29066b().mo4215a() == 32) {
                return new zzazz(zzaxv.m29066b().m10273b());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1955a(zzbbu zzbbu) {
        return m20525d(zzbbu);
    }
}
