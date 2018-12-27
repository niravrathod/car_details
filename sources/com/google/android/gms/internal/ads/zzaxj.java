package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzaxj extends zzbdd<zzaxj, zza> implements zzben {
    private static volatile zzbew<zzaxj> zzaky;
    private static final zzaxj zzdmj = new zzaxj();
    private int zzdmi;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxj, zza> implements zzben {
        private zza() {
            super(zzaxj.zzdmj);
        }
    }

    private zzaxj() {
    }

    /* renamed from: a */
    public final int m29012a() {
        return this.zzdmi;
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (in.f8169a[i - 1]) {
            case 1:
                return new zzaxj();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdmi"};
                return zzbdd.m28347a((zzbel) zzdmj, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", (Object[]) i);
            case 4:
                return zzdmj;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxj.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdmj);
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
    public static zzaxj m29010b() {
        return zzdmj;
    }

    static {
        zzbdd.m28349a(zzaxj.class, zzdmj);
    }
}
