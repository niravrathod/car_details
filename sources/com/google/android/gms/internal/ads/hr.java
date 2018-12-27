package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzayv.zzb;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

class hr implements zzavt<zzavm> {
    /* renamed from: a */
    private static final Logger f16504a = Logger.getLogger(hr.class.getName());

    hr() {
        zzawb.m10212a(new hs());
    }

    /* renamed from: a */
    public final String mo1957a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* renamed from: b */
    public final int mo1958b() {
        return 0;
    }

    /* renamed from: d */
    private final zzavm m20491d(zzbbu zzbbu) {
        try {
            zzbbu = zzaxb.m28969a(zzbbu);
            if (zzbbu instanceof zzaxb) {
                zzaxb zzaxb = (zzaxb) zzbbu;
                zzbbd.m10252a(zzaxb.m28978a(), 0);
                return new zzbak((zzbav) zzawb.m10217b("type.googleapis.com/google.crypto.tink.AesCtrKey", zzaxb.m28980b()), (zzavx) zzawb.m10217b("type.googleapis.com/google.crypto.tink.HmacKey", zzaxb.m28981c()), zzaxb.m28981c().m29139b().m29151b());
            }
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1959b(zzbbu zzbbu) {
        try {
            return mo1960b(zzaxd.m28982a(zzbbu));
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1960b(zzbel zzbel) {
        if (zzbel instanceof zzaxd) {
            zzaxd zzaxd = (zzaxd) zzbel;
            zzaxf zzaxf = (zzaxf) zzawb.m10209a("type.googleapis.com/google.crypto.tink.AesCtrKey", zzaxd.m28984a());
            return (zzbdd) zzaxb.m28976d().m28967a(zzaxf).m28968a((zzayp) zzawb.m10209a("type.googleapis.com/google.crypto.tink.HmacKey", zzaxd.m28986b())).m28966a(0).mo4804f();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    /* renamed from: c */
    public final zzayv mo1961c(zzbbu zzbbu) {
        return (zzayv) ((zzbdd) zzayv.m29161d().m29154a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").m29153a(((zzaxb) mo1959b(zzbbu)).mo4211h()).m29152a(zzb.SYMMETRIC).mo4804f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1956a(zzbel zzbel) {
        if (zzbel instanceof zzaxb) {
            zzaxb zzaxb = (zzaxb) zzbel;
            zzbbd.m10252a(zzaxb.m28978a(), 0);
            return new zzbak((zzbav) zzawb.m10217b("type.googleapis.com/google.crypto.tink.AesCtrKey", zzaxb.m28980b()), (zzavx) zzawb.m10217b("type.googleapis.com/google.crypto.tink.HmacKey", zzaxb.m28981c()), zzaxb.m28981c().m29139b().m29151b());
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1955a(zzbbu zzbbu) {
        return m20491d(zzbbu);
    }
}
