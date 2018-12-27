package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzazs.zza;

public final class zzaxa {
    @Deprecated
    /* renamed from: a */
    public static final zzazs f9058a = ((zzazs) ((zzbdd) zzazs.m29274b().m29269a("TINK_MAC_1_0_0").m29268a(zzavo.m10183a("TinkMac", "Mac", "HmacKey", 0, true)).mo4804f()));
    /* renamed from: b */
    public static final zzazs f9059b = ((zzazs) ((zzbdd) ((zza) zzazs.m29274b().m28334a(f9058a)).m29269a("TINK_MAC").mo4804f()));
    @Deprecated
    /* renamed from: c */
    private static final zzazs f9060c = ((zzazs) ((zzbdd) ((zza) zzazs.m29274b().m28334a(f9058a)).m29269a("TINK_MAC_1_1_0").mo4804f()));

    /* renamed from: a */
    public static void m10220a() {
        zzawb.m10214a("TinkMac", new ii());
        zzavo.m10184a(f9059b);
    }

    static {
        try {
            m10220a();
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
