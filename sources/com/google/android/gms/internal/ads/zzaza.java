package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzaza extends zzbdd<zzaza, zza> implements zzben {
    private static volatile zzbew<zzaza> zzaky;
    private static final zzaza zzdoy = new zzaza();
    private String zzdog = "";
    private zzbbu zzdoh = zzbbu.f9094a;
    private int zzdox;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaza, zza> implements zzben {
        private zza() {
            super(zzaza.zzdoy);
        }
    }

    private zzaza() {
    }

    /* renamed from: a */
    public final String m29171a() {
        return this.zzdog;
    }

    /* renamed from: b */
    public final zzbbu m29172b() {
        return this.zzdoh;
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (jj.f8188a[i - 1]) {
            case 1:
                return new zzaza();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdog", "zzdoh", "zzdox"};
                return zzbdd.m28347a((zzbel) zzdoy, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", (Object[]) i);
            case 4:
                return zzdoy;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaza.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdoy);
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

    /* renamed from: c */
    public static zzaza m29168c() {
        return zzdoy;
    }

    static {
        zzbdd.m28349a(zzaza.class, zzdoy);
    }
}
