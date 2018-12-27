package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzayr extends zzbdd<zzayr, zza> implements zzben {
    private static volatile zzbew<zzayr> zzaky;
    private static final zzayr zzdoc = new zzayr();
    private int zzdmg;
    private zzayt zzdoa;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzayr, zza> implements zzben {
        private zza() {
            super(zzayr.zzdoc);
        }
    }

    private zzayr() {
    }

    /* renamed from: a */
    public final zzayt m29144a() {
        return this.zzdoa == null ? zzayt.m29147c() : this.zzdoa;
    }

    /* renamed from: b */
    public final int m29146b() {
        return this.zzdmg;
    }

    /* renamed from: a */
    public static zzayr m29141a(zzbbu zzbbu) {
        return (zzayr) zzbdd.m28342a(zzdoc, zzbbu);
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (je.f8185a[i - 1]) {
            case 1:
                return new zzayr();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdoa", "zzdmg"};
                return zzbdd.m28347a((zzbel) zzdoc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", (Object[]) i);
            case 4:
                return zzdoc;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzayr.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdoc);
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
    public static zzayr m29142c() {
        return zzdoc;
    }

    static {
        zzbdd.m28349a(zzayr.class, zzdoc);
    }
}
