package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzaxh extends zzbdd<zzaxh, zza> implements zzben {
    private static volatile zzbew<zzaxh> zzaky;
    private static final zzaxh zzdmh = new zzaxh();
    private zzaxj zzdmd;
    private int zzdmg;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxh, zza> implements zzben {
        private zza() {
            super(zzaxh.zzdmh);
        }
    }

    private zzaxh() {
    }

    /* renamed from: a */
    public final zzaxj m29007a() {
        return this.zzdmd == null ? zzaxj.m29010b() : this.zzdmd;
    }

    /* renamed from: b */
    public final int m29009b() {
        return this.zzdmg;
    }

    /* renamed from: a */
    public static zzaxh m29004a(zzbbu zzbbu) {
        return (zzaxh) zzbdd.m28342a(zzdmh, zzbbu);
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (im.f8168a[i - 1]) {
            case 1:
                return new zzaxh();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdmd", "zzdmg"};
                return zzbdd.m28347a((zzbel) zzdmh, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", (Object[]) i);
            case 4:
                return zzdmh;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxh.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdmh);
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
    public static zzaxh m29005c() {
        return zzdmh;
    }

    static {
        zzbdd.m28349a(zzaxh.class, zzdmh);
    }
}
