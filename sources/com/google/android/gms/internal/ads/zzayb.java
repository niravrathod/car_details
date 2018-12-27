package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzayb extends zzbdd<zzayb, zza> implements zzben {
    private static volatile zzbew<zzayb> zzaky;
    private static final zzayb zzdna = new zzayb();
    private zzayd zzdmz;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzayb, zza> implements zzben {
        private zza() {
            super(zzayb.zzdna);
        }
    }

    private zzayb() {
    }

    /* renamed from: a */
    public final zzayd m29073a() {
        return this.zzdmz == null ? zzayd.m29075d() : this.zzdmz;
    }

    /* renamed from: a */
    public static zzayb m29071a(zzbbu zzbbu) {
        return (zzayb) zzbdd.m28342a(zzdna, zzbbu);
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (iw.f8177a[i - 1]) {
            case 1:
                return new zzayb();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdmz"};
                return zzbdd.m28347a((zzbel) zzdna, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", (Object[]) i);
            case 4:
                return zzdna;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzayb.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdna);
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
        zzbdd.m28349a(zzayb.class, zzdna);
    }
}
