package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzayv.zzb;
import java.security.GeneralSecurityException;

final class hw implements zzavt<zzavm> {
    hw() {
    }

    /* renamed from: a */
    public final String mo1957a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    /* renamed from: b */
    public final int mo1958b() {
        return 0;
    }

    /* renamed from: d */
    private static zzavm m20534d(zzbbu zzbbu) {
        try {
            return m20533c(zzazi.m29235a(zzbbu));
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", zzbbu2);
        }
    }

    /* renamed from: c */
    private static zzavm m20533c(zzbel zzbel) {
        if (zzbel instanceof zzazi) {
            zzazi zzazi = (zzazi) zzbel;
            zzbbd.m10252a(zzazi.m29242a(), 0);
            zzbel = zzazi.m29244b().m29249a();
            return zzavw.m10197a(zzbel).m10196b(zzbel);
        }
        throw new GeneralSecurityException("expected KmsAeadKey proto");
    }

    /* renamed from: b */
    public final zzbel mo1959b(zzbbu zzbbu) {
        try {
            return mo1960b(zzazk.m29245a(zzbbu));
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1960b(zzbel zzbel) {
        if (zzbel instanceof zzazk) {
            return (zzbdd) zzazi.m29240c().m29234a((zzazk) zzbel).m29233a(0).mo4804f();
        }
        throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }

    /* renamed from: c */
    public final zzayv mo1961c(zzbbu zzbbu) {
        return (zzayv) ((zzbdd) zzayv.m29161d().m29154a("type.googleapis.com/google.crypto.tink.KmsAeadKey").m29153a(((zzazi) mo1959b(zzbbu)).mo4211h()).m29152a(zzb.REMOTE).mo4804f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1956a(zzbel zzbel) {
        return m20533c(zzbel);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1955a(zzbbu zzbbu) {
        return m20534d(zzbbu);
    }
}
