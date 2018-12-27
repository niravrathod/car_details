package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzaxl extends zzbdd<zzaxl, zza> implements zzben {
    private static volatile zzbew<zzaxl> zzaky;
    private static final zzaxl zzdml = new zzaxl();
    private int zzdlw;
    private zzbbu zzdme = zzbbu.f9094a;
    private zzaxp zzdmk;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxl, zza> implements zzben {
        private zza() {
            super(zzaxl.zzdml);
        }

        /* renamed from: a */
        public final zza m29014a(int i) {
            m28335b();
            ((zzaxl) this.a).m29022b(0);
            return this;
        }

        /* renamed from: a */
        public final zza m29015a(zzaxp zzaxp) {
            m28335b();
            ((zzaxl) this.a).m29021a(zzaxp);
            return this;
        }

        /* renamed from: a */
        public final zza m29016a(zzbbu zzbbu) {
            m28335b();
            ((zzaxl) this.a).m29023b(zzbbu);
            return this;
        }
    }

    private zzaxl() {
    }

    /* renamed from: a */
    public final int m29026a() {
        return this.zzdlw;
    }

    /* renamed from: b */
    private final void m29022b(int i) {
        this.zzdlw = i;
    }

    /* renamed from: b */
    public final zzaxp m29028b() {
        return this.zzdmk == null ? zzaxp.m29035b() : this.zzdmk;
    }

    /* renamed from: a */
    private final void m29021a(zzaxp zzaxp) {
        if (zzaxp != null) {
            this.zzdmk = zzaxp;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final zzbbu m29029c() {
        return this.zzdme;
    }

    /* renamed from: b */
    private final void m29023b(zzbbu zzbbu) {
        if (zzbbu != null) {
            this.zzdme = zzbbu;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static zzaxl m29017a(zzbbu zzbbu) {
        return (zzaxl) zzbdd.m28342a(zzdml, zzbbu);
    }

    /* renamed from: d */
    public static zza m29024d() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdml.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (io.f8170a[i - 1]) {
            case 1:
                return new zzaxl();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdlw", "zzdmk", "zzdme"};
                return zzbdd.m28347a((zzbel) zzdml, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", (Object[]) i);
            case 4:
                return zzdml;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxl.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdml);
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

    static {
        zzbdd.m28349a(zzaxl.class, zzdml);
    }
}
