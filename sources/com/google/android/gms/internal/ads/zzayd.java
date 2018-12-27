package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzayd extends zzbdd<zzayd, zza> implements zzben {
    private static volatile zzbew<zzayd> zzaky;
    private static final zzayd zzdne = new zzayd();
    private zzayj zzdnb;
    private zzaxz zzdnc;
    private int zzdnd;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzayd, zza> implements zzben {
        private zza() {
            super(zzayd.zzdne);
        }
    }

    private zzayd() {
    }

    /* renamed from: a */
    public final zzayj m29077a() {
        return this.zzdnb == null ? zzayj.m29118d() : this.zzdnb;
    }

    /* renamed from: b */
    public final zzaxz m29079b() {
        return this.zzdnc == null ? zzaxz.m29067b() : this.zzdnc;
    }

    /* renamed from: c */
    public final zzaxx m29080c() {
        zzaxx a = zzaxx.m21478a(this.zzdnd);
        return a == null ? zzaxx.UNRECOGNIZED : a;
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (ix.f8178a[i - 1]) {
            case 1:
                return new zzayd();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdnb", "zzdnc", "zzdnd"};
                return zzbdd.m28347a((zzbel) zzdne, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", (Object[]) i);
            case 4:
                return zzdne;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzayd.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdne);
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

    /* renamed from: d */
    public static zzayd m29075d() {
        return zzdne;
    }

    static {
        zzbdd.m28349a(zzayd.class, zzdne);
    }
}
