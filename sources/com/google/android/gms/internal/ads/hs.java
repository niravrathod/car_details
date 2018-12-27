package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzayv.zzb;
import java.security.GeneralSecurityException;

final class hs implements zzavt<zzbav> {
    hs() {
    }

    /* renamed from: a */
    public final String mo1957a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: b */
    public final int mo1958b() {
        return 0;
    }

    /* renamed from: d */
    private final zzazu m20500d(zzbbu zzbbu) {
        try {
            zzbbu = zzaxf.m28990a(zzbbu);
            if (zzbbu instanceof zzaxf) {
                zzaxf zzaxf = (zzaxf) zzbbu;
                zzbbd.m10252a(zzaxf.m29000a(), 0);
                zzbbd.m10251a(zzaxf.m29003c().mo4215a());
                m20499a(zzaxf.m29002b());
                return new zzazu(zzaxf.m29003c().m10273b(), zzaxf.m29002b().m29012a());
            }
            throw new GeneralSecurityException("expected AesCtrKey proto");
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1959b(zzbbu zzbbu) {
        try {
            return mo1960b(zzaxh.m29004a(zzbbu));
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1960b(zzbel zzbel) {
        if (zzbel instanceof zzaxh) {
            zzaxh zzaxh = (zzaxh) zzbel;
            zzbbd.m10251a(zzaxh.m29009b());
            m20499a(zzaxh.m29007a());
            return (zzbdd) zzaxf.m28997d().m28988a(zzaxh.m29007a()).m28989a(zzbbu.m10260a(zzbay.m10249a(zzaxh.m29009b()))).m28987a(0).mo4804f();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    /* renamed from: c */
    public final zzayv mo1961c(zzbbu zzbbu) {
        return (zzayv) ((zzbdd) zzayv.m29161d().m29154a("type.googleapis.com/google.crypto.tink.AesCtrKey").m29153a(((zzaxf) mo1959b(zzbbu)).mo4211h()).m29152a(zzb.SYMMETRIC).mo4804f());
    }

    /* renamed from: a */
    private static void m20499a(zzaxj zzaxj) {
        if (zzaxj.m29012a() < 12 || zzaxj.m29012a() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1956a(zzbel zzbel) {
        if (zzbel instanceof zzaxf) {
            zzaxf zzaxf = (zzaxf) zzbel;
            zzbbd.m10252a(zzaxf.m29000a(), 0);
            zzbbd.m10251a(zzaxf.m29003c().mo4215a());
            m20499a(zzaxf.m29002b());
            return new zzazu(zzaxf.m29003c().m10273b(), zzaxf.m29002b().m29012a());
        }
        throw new GeneralSecurityException("expected AesCtrKey proto");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1955a(zzbbu zzbbu) {
        return m20500d(zzbbu);
    }
}
