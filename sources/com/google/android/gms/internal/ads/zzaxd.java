package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzaxd extends zzbdd<zzaxd, zza> implements zzben {
    private static volatile zzbew<zzaxd> zzaky;
    private static final zzaxd zzdmc = new zzaxd();
    private zzaxh zzdma;
    private zzayr zzdmb;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxd, zza> implements zzben {
        private zza() {
            super(zzaxd.zzdmc);
        }
    }

    private zzaxd() {
    }

    /* renamed from: a */
    public final zzaxh m28984a() {
        return this.zzdma == null ? zzaxh.m29005c() : this.zzdma;
    }

    /* renamed from: b */
    public final zzayr m28986b() {
        return this.zzdmb == null ? zzayr.m29142c() : this.zzdmb;
    }

    /* renamed from: a */
    public static zzaxd m28982a(zzbbu zzbbu) {
        return (zzaxd) zzbdd.m28342a(zzdmc, zzbbu);
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (ik.f8166a[i - 1]) {
            case 1:
                return new zzaxd();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdma", "zzdmb"};
                return zzbdd.m28347a((zzbel) zzdmc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", (Object[]) i);
            case 4:
                return zzdmc;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxd.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdmc);
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
        zzbdd.m28349a(zzaxd.class, zzdmc);
    }
}
