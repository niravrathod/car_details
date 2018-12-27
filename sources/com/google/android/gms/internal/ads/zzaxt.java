package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzaxt extends zzbdd<zzaxt, zza> implements zzben {
    private static volatile zzbew<zzaxt> zzaky;
    private static final zzaxt zzdmp = new zzaxt();
    private int zzdmg;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxt, zza> implements zzben {
        private zza() {
            super(zzaxt.zzdmp);
        }
    }

    private zzaxt() {
    }

    /* renamed from: a */
    public final int m29053a() {
        return this.zzdmg;
    }

    /* renamed from: a */
    public static zzaxt m29051a(zzbbu zzbbu) {
        return (zzaxt) zzbdd.m28342a(zzdmp, zzbbu);
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (is.f8174a[i - 1]) {
            case 1:
                return new zzaxt();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdmg"};
                return zzbdd.m28347a((zzbel) zzdmp, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", (Object[]) i);
            case 4:
                return zzdmp;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxt.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdmp);
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
        zzbdd.m28349a(zzaxt.class, zzdmp);
    }
}
