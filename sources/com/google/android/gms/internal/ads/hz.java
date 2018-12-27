package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class hz implements zzavt<zzavs> {
    hz() {
    }

    /* renamed from: a */
    public final String mo1957a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    /* renamed from: b */
    public final int mo1958b() {
        return 0;
    }

    /* renamed from: d */
    private final zzavs m20558d(zzbbu zzbbu) {
        try {
            zzbbu = zzayh.m29101a(zzbbu);
            if (zzbbu instanceof zzayh) {
                zzayh zzayh = (zzayh) zzbbu;
                zzbbd.m10252a(zzayh.m29113a(), 0);
                id.m8948a(zzayh.m29115b());
                zzayd b = zzayh.m29115b();
                zzayj a = b.m29077a();
                return (zzavs) new zzbac(zzbag.m10236a(id.m8945a(a.m29120a()), zzayh.m29116c().m10273b(), zzayh.m29117d().m10273b()), a.m29123c().m10273b(), id.m8947a(a.m29122b()), id.m8946a(b.m29080c()), new C4096if(b.m29079b().m29069a()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1959b(zzbbu zzbbu) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: b */
    public final zzbel mo1960b(zzbel zzbel) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: c */
    public final zzayv mo1961c(zzbbu zzbbu) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1956a(zzbel zzbel) {
        if (zzbel instanceof zzayh) {
            zzayh zzayh = (zzayh) zzbel;
            zzbbd.m10252a(zzayh.m29113a(), 0);
            id.m8948a(zzayh.m29115b());
            zzayd b = zzayh.m29115b();
            zzayj a = b.m29077a();
            return new zzbac(zzbag.m10236a(id.m8945a(a.m29120a()), zzayh.m29116c().m10273b(), zzayh.m29117d().m10273b()), a.m29123c().m10273b(), id.m8947a(a.m29122b()), id.m8946a(b.m29080c()), new C4096if(b.m29079b().m29069a()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1955a(zzbbu zzbbu) {
        return m20558d(zzbbu);
    }
}
