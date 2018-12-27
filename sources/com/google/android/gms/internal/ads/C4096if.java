package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxr.zza;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.if */
final class C4096if implements zzbaa {
    /* renamed from: a */
    private final String f16507a;
    /* renamed from: b */
    private final int f16508b;
    /* renamed from: c */
    private zzaxr f16509c;
    /* renamed from: d */
    private zzaxb f16510d;
    /* renamed from: e */
    private int f16511e;

    C4096if(zzaza zzaza) {
        this.f16507a = zzaza.m29171a();
        if (this.f16507a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzaxt a = zzaxt.m29051a(zzaza.m29172b());
                this.f16509c = (zzaxr) zzawb.m10216b(zzaza);
                this.f16508b = a.m29053a();
            } catch (zzaza zzaza2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", zzaza2);
            }
        } else if (this.f16507a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzaxd a2 = zzaxd.m28982a(zzaza2.m29172b());
                this.f16510d = (zzaxb) zzawb.m10216b(zzaza2);
                this.f16511e = a2.m28984a().m29009b();
                this.f16508b = this.f16511e + a2.m28986b().m29146b();
            } catch (zzaza zzaza22) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", zzaza22);
            }
        } else {
            String str = "unsupported AEAD DEM key type: ";
            String valueOf = String.valueOf(this.f16507a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: a */
    public final int mo1963a() {
        return this.f16508b;
    }

    /* renamed from: a */
    public final zzavm mo1964a(byte[] bArr) {
        if (bArr.length != this.f16508b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f16507a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            return (zzavm) zzawb.m10217b(this.f16507a, (zzaxr) ((zzbdd) ((zza) zzaxr.m29046c().m28334a(this.f16509c)).m29040a(zzbbu.m10261a(bArr, 0, this.f16508b)).mo4804f()));
        } else if (this.f16507a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f16511e);
            zzayp zzayp = (zzayp) ((zzbdd) ((zzayp.zza) zzayp.m29134d().m28334a(this.f16510d.m28981c())).m29126a(zzbbu.m10260a(Arrays.copyOfRange(bArr, this.f16511e, this.f16508b))).mo4804f());
            return (zzavm) zzawb.m10217b(this.f16507a, (zzaxb) ((zzbdd) zzaxb.m28976d().m28966a(this.f16510d.m28978a()).m28967a((zzaxf) ((zzbdd) ((zzaxf.zza) zzaxf.m28997d().m28334a(this.f16510d.m28980b())).m28989a(zzbbu.m10260a(copyOfRange)).mo4804f())).m28968a(zzayp).mo4804f()));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
