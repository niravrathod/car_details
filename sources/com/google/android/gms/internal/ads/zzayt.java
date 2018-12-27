package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzayt extends zzbdd<zzayt, zza> implements zzben {
    private static volatile zzbew<zzayt> zzaky;
    private static final zzayt zzdof = new zzayt();
    private int zzdod;
    private int zzdoe;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzayt, zza> implements zzben {
        private zza() {
            super(zzayt.zzdof);
        }
    }

    private zzayt() {
    }

    /* renamed from: a */
    public final zzayn m29149a() {
        zzayn a = zzayn.m21482a(this.zzdod);
        return a == null ? zzayn.UNRECOGNIZED : a;
    }

    /* renamed from: b */
    public final int m29151b() {
        return this.zzdoe;
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (jf.f8186a[i - 1]) {
            case 1:
                return new zzayt();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdod", "zzdoe"};
                return zzbdd.m28347a((zzbel) zzdof, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", (Object[]) i);
            case 4:
                return zzdof;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzayt.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdof);
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
    public static zzayt m29147c() {
        return zzdof;
    }

    static {
        zzbdd.m28349a(zzayt.class, zzdof);
    }
}
