package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzaxb extends zzbdd<zzaxb, zza> implements zzben {
    private static volatile zzbew<zzaxb> zzaky;
    private static final zzaxb zzdlz = new zzaxb();
    private int zzdlw;
    private zzaxf zzdlx;
    private zzayp zzdly;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxb, zza> implements zzben {
        private zza() {
            super(zzaxb.zzdlz);
        }

        /* renamed from: a */
        public final zza m28966a(int i) {
            m28335b();
            ((zzaxb) this.a).m28975b(i);
            return this;
        }

        /* renamed from: a */
        public final zza m28967a(zzaxf zzaxf) {
            m28335b();
            ((zzaxb) this.a).m28973a(zzaxf);
            return this;
        }

        /* renamed from: a */
        public final zza m28968a(zzayp zzayp) {
            m28335b();
            ((zzaxb) this.a).m28974a(zzayp);
            return this;
        }
    }

    private zzaxb() {
    }

    /* renamed from: a */
    public final int m28978a() {
        return this.zzdlw;
    }

    /* renamed from: b */
    private final void m28975b(int i) {
        this.zzdlw = i;
    }

    /* renamed from: b */
    public final zzaxf m28980b() {
        return this.zzdlx == null ? zzaxf.m28998e() : this.zzdlx;
    }

    /* renamed from: a */
    private final void m28973a(zzaxf zzaxf) {
        if (zzaxf != null) {
            this.zzdlx = zzaxf;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final zzayp m28981c() {
        return this.zzdly == null ? zzayp.m29135e() : this.zzdly;
    }

    /* renamed from: a */
    private final void m28974a(zzayp zzayp) {
        if (zzayp != null) {
            this.zzdly = zzayp;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static zzaxb m28969a(zzbbu zzbbu) {
        return (zzaxb) zzbdd.m28342a(zzdlz, zzbbu);
    }

    /* renamed from: d */
    public static zza m28976d() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdlz.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (ij.f8165a[i - 1]) {
            case 1:
                return new zzaxb();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdlw", "zzdlx", "zzdly"};
                return zzbdd.m28347a((zzbel) zzdlz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", (Object[]) i);
            case 4:
                return zzdlz;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxb.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdlz);
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
        zzbdd.m28349a(zzaxb.class, zzdlz);
    }
}
