package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzaxr extends zzbdd<zzaxr, zza> implements zzben {
    private static volatile zzbew<zzaxr> zzaky;
    private static final zzaxr zzdmo = new zzaxr();
    private int zzdlw;
    private zzbbu zzdme = zzbbu.f9094a;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxr, zza> implements zzben {
        private zza() {
            super(zzaxr.zzdmo);
        }

        /* renamed from: a */
        public final zza m29039a(int i) {
            m28335b();
            ((zzaxr) this.a).m29044b(0);
            return this;
        }

        /* renamed from: a */
        public final zza m29040a(zzbbu zzbbu) {
            m28335b();
            ((zzaxr) this.a).m29045b(zzbbu);
            return this;
        }
    }

    private zzaxr() {
    }

    /* renamed from: a */
    public final int m29048a() {
        return this.zzdlw;
    }

    /* renamed from: b */
    private final void m29044b(int i) {
        this.zzdlw = i;
    }

    /* renamed from: b */
    public final zzbbu m29050b() {
        return this.zzdme;
    }

    /* renamed from: b */
    private final void m29045b(zzbbu zzbbu) {
        if (zzbbu != null) {
            this.zzdme = zzbbu;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static zzaxr m29041a(zzbbu zzbbu) {
        return (zzaxr) zzbdd.m28342a(zzdmo, zzbbu);
    }

    /* renamed from: c */
    public static zza m29046c() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdmo.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (ir.f8173a[i - 1]) {
            case 1:
                return new zzaxr();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdlw", "zzdme"};
                return zzbdd.m28347a((zzbel) zzdmo, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", (Object[]) i);
            case 4:
                return zzdmo;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxr.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdmo);
                            zzaky = i;
                        }
                    }
                }
                return i;
            case 6:
                return Byte.valueOf((byte) 1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        zzbdd.m28349a(zzaxr.class, zzdmo);
    }
}
