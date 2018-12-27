package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzaxn extends zzbdd<zzaxn, zza> implements zzben {
    private static volatile zzbew<zzaxn> zzaky;
    private static final zzaxn zzdmm = new zzaxn();
    private int zzdmg;
    private zzaxp zzdmk;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxn, zza> implements zzben {
        private zza() {
            super(zzaxn.zzdmm);
        }
    }

    private zzaxn() {
    }

    /* renamed from: a */
    public final zzaxp m29032a() {
        return this.zzdmk == null ? zzaxp.m29035b() : this.zzdmk;
    }

    /* renamed from: b */
    public final int m29034b() {
        return this.zzdmg;
    }

    /* renamed from: a */
    public static zzaxn m29030a(zzbbu zzbbu) {
        return (zzaxn) zzbdd.m28342a(zzdmm, zzbbu);
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (ip.f8171a[i - 1]) {
            case 1:
                return new zzaxn();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdmk", "zzdmg"};
                return zzbdd.m28347a((zzbel) zzdmm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", (Object[]) i);
            case 4:
                return zzdmm;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxn.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdmm);
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
        zzbdd.m28349a(zzaxn.class, zzdmm);
    }
}
