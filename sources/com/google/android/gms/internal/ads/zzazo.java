package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzazo extends zzbdd<zzazo, zza> implements zzben {
    private static volatile zzbew<zzazo> zzaky;
    private static final zzazo zzdpw = new zzazo();
    private String zzdpu = "";
    private zzaza zzdpv;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzazo, zza> implements zzben {
        private zza() {
            super(zzazo.zzdpw);
        }
    }

    private zzazo() {
    }

    /* renamed from: a */
    public final String m29266a() {
        return this.zzdpu;
    }

    /* renamed from: b */
    public final zzaza m29267b() {
        return this.zzdpv == null ? zzaza.m29168c() : this.zzdpv;
    }

    /* renamed from: a */
    public static zzazo m29262a(zzbbu zzbbu) {
        return (zzazo) zzbdd.m28342a(zzdpw, zzbbu);
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (jq.f8195a[i - 1]) {
            case 1:
                return new zzazo();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdpu", "zzdpv"};
                return zzbdd.m28347a((zzbel) zzdpw, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", (Object[]) i);
            case 4:
                return zzdpw;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzazo.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdpw);
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
    public static zzazo m29263c() {
        return zzdpw;
    }

    static {
        zzbdd.m28349a(zzazo.class, zzdpw);
    }
}
