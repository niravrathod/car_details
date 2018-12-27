package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzayj extends zzbdd<zzayj, zza> implements zzben {
    private static volatile zzbew<zzayj> zzaky;
    private static final zzayj zzdnn = new zzayj();
    private int zzdnk;
    private int zzdnl;
    private zzbbu zzdnm = zzbbu.f9094a;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzayj, zza> implements zzben {
        private zza() {
            super(zzayj.zzdnn);
        }
    }

    private zzayj() {
    }

    /* renamed from: a */
    public final zzayl m29120a() {
        zzayl a = zzayl.m21480a(this.zzdnk);
        return a == null ? zzayl.UNRECOGNIZED : a;
    }

    /* renamed from: b */
    public final zzayn m29122b() {
        zzayn a = zzayn.m21482a(this.zzdnl);
        return a == null ? zzayn.UNRECOGNIZED : a;
    }

    /* renamed from: c */
    public final zzbbu m29123c() {
        return this.zzdnm;
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (ja.f8183a[i - 1]) {
            case 1:
                return new zzayj();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdnk", "zzdnl", "zzdnm"};
                return zzbdd.m28347a((zzbel) zzdnn, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", (Object[]) i);
            case 4:
                return zzdnn;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzayj.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdnn);
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
    public static zzayj m29118d() {
        return zzdnn;
    }

    static {
        zzbdd.m28349a(zzayj.class, zzdnn);
    }
}
