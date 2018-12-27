package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzayv.zzb;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

final class hy implements zzavt<zzavr> {
    hy() {
    }

    /* renamed from: a */
    public final String mo1957a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: b */
    public final int mo1958b() {
        return 0;
    }

    /* renamed from: d */
    private final zzavr m20550d(zzbbu zzbbu) {
        try {
            zzbbu = zzayf.m29084a(zzbbu);
            if (zzbbu instanceof zzayf) {
                zzayf zzayf = (zzayf) zzbbu;
                zzbbd.m10252a(zzayf.m29093a(), 0);
                id.m8948a(zzayf.m29095b().m29115b());
                zzayd b = zzayf.m29095b().m29115b();
                zzayj a = b.m29077a();
                zzbai a2 = id.m8945a(a.m29120a());
                zzbbu = zzayf.m29096c().m10273b();
                return (zzavr) new zzbab((ECPrivateKey) ((KeyFactory) zzbal.f9077e.m10243a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, zzbbu), zzbag.m10237a(a2))), a.m29123c().m10273b(), id.m8947a(a.m29122b()), id.m8946a(b.m29080c()), new C4096if(b.m29079b().m29069a()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1959b(zzbbu zzbbu) {
        try {
            return mo1960b(zzayb.m29071a(zzbbu));
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1960b(zzbel zzbel) {
        if (zzbel instanceof zzayb) {
            zzayb zzayb = (zzayb) zzbel;
            id.m8948a(zzayb.m29073a());
            KeyPair a = zzbag.m10235a(zzbag.m10237a(id.m8945a(zzayb.m29073a().m29077a().m29120a())));
            ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
            ECPoint w = eCPublicKey.getW();
            return (zzbdd) zzayf.m29091d().m29081a(0).m29082a((zzayh) ((zzbdd) zzayh.m29110e().m29097a(0).m29098a(zzayb.m29073a()).m29099a(zzbbu.m10260a(w.getAffineX().toByteArray())).m29100b(zzbbu.m10260a(w.getAffineY().toByteArray())).mo4804f())).m29083a(zzbbu.m10260a(eCPrivateKey.getS().toByteArray())).mo4804f();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    /* renamed from: c */
    public final zzayv mo1961c(zzbbu zzbbu) {
        return (zzayv) ((zzbdd) zzayv.m29161d().m29154a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").m29153a(((zzayf) mo1959b(zzbbu)).mo4211h()).m29152a(zzb.ASYMMETRIC_PRIVATE).mo4804f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1956a(zzbel zzbel) {
        if (zzbel instanceof zzayf) {
            zzayf zzayf = (zzayf) zzbel;
            zzbbd.m10252a(zzayf.m29093a(), 0);
            id.m8948a(zzayf.m29095b().m29115b());
            zzayd b = zzayf.m29095b().m29115b();
            zzayj a = b.m29077a();
            zzbai a2 = id.m8945a(a.m29120a());
            zzbel = zzayf.m29096c().m10273b();
            return new zzbab((ECPrivateKey) ((KeyFactory) zzbal.f9077e.m10243a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, zzbel), zzbag.m10237a(a2))), a.m29123c().m10273b(), id.m8947a(a.m29122b()), id.m8946a(b.m29080c()), new C4096if(b.m29079b().m29069a()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1955a(zzbbu zzbbu) {
        return m20550d(zzbbu);
    }
}
