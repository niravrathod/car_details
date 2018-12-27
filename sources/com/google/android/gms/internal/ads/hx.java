package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzayv.zzb;
import java.security.GeneralSecurityException;

final class hx implements zzavt<zzavm> {
    hx() {
    }

    /* renamed from: a */
    public final String mo1957a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    /* renamed from: b */
    public final int mo1958b() {
        return 0;
    }

    /* renamed from: d */
    private final zzavm m20542d(zzbbu zzbbu) {
        try {
            zzbbu = zzazm.m29252a(zzbbu);
            if (zzbbu instanceof zzazm) {
                zzazm zzazm = (zzazm) zzbbu;
                zzbbd.m10252a(zzazm.m29259a(), 0);
                String a = zzazm.m29261b().m29266a();
                return new zzawl(zzazm.m29261b().m29267b(), zzavw.m10197a(a).m10196b(a));
            }
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1959b(zzbbu zzbbu) {
        try {
            return mo1960b(zzazo.m29262a(zzbbu));
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1960b(zzbel zzbel) {
        if (zzbel instanceof zzazo) {
            return (zzbdd) zzazm.m29257c().m29251a((zzazo) zzbel).m29250a(0).mo4804f();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    /* renamed from: c */
    public final zzayv mo1961c(zzbbu zzbbu) {
        return (zzayv) ((zzbdd) zzayv.m29161d().m29154a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").m29153a(((zzazm) mo1959b(zzbbu)).mo4211h()).m29152a(zzb.REMOTE).mo4804f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1956a(zzbel zzbel) {
        if (zzbel instanceof zzazm) {
            zzazm zzazm = (zzazm) zzbel;
            zzbbd.m10252a(zzazm.m29259a(), 0);
            String a = zzazm.m29261b().m29266a();
            return new zzawl(zzazm.m29261b().m29267b(), zzavw.m10197a(a).m10196b(a));
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1955a(zzbbu zzbbu) {
        return m20542d(zzbbu);
    }
}
