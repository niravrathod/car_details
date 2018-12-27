package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzaxz extends zzbdd<zzaxz, zza> implements zzben {
    private static volatile zzbew<zzaxz> zzaky;
    private static final zzaxz zzdmy = new zzaxz();
    private zzaza zzdmx;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxz, zza> implements zzben {
        private zza() {
            super(zzaxz.zzdmy);
        }
    }

    private zzaxz() {
    }

    /* renamed from: a */
    public final zzaza m29069a() {
        return this.zzdmx == null ? zzaza.m29168c() : this.zzdmx;
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (iv.f8176a[i - 1]) {
            case 1:
                return new zzaxz();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdmx"};
                return zzbdd.m28347a((zzbel) zzdmy, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", (Object[]) i);
            case 4:
                return zzdmy;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxz.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdmy);
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

    /* renamed from: b */
    public static zzaxz m29067b() {
        return zzdmy;
    }

    static {
        zzbdd.m28349a(zzaxz.class, zzdmy);
    }
}
