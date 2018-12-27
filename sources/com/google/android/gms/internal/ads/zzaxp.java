package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzaxp extends zzbdd<zzaxp, zza> implements zzben {
    private static volatile zzbew<zzaxp> zzaky;
    private static final zzaxp zzdmn = new zzaxp();
    private int zzdmi;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxp, zza> implements zzben {
        private zza() {
            super(zzaxp.zzdmn);
        }
    }

    private zzaxp() {
    }

    /* renamed from: a */
    public final int m29037a() {
        return this.zzdmi;
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (iq.f8172a[i - 1]) {
            case 1:
                return new zzaxp();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdmi"};
                return zzbdd.m28347a((zzbel) zzdmn, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", (Object[]) i);
            case 4:
                return zzdmn;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxp.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdmn);
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
    public static zzaxp m29035b() {
        return zzdmn;
    }

    static {
        zzbdd.m28349a(zzaxp.class, zzdmn);
    }
}
