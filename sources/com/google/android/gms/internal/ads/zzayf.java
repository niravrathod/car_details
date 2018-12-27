package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzayf extends zzbdd<zzayf, zza> implements zzben {
    private static volatile zzbew<zzayf> zzaky;
    private static final zzayf zzdng = new zzayf();
    private int zzdlw;
    private zzbbu zzdme = zzbbu.f9094a;
    private zzayh zzdnf;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzayf, zza> implements zzben {
        private zza() {
            super(zzayf.zzdng);
        }

        /* renamed from: a */
        public final zza m29081a(int i) {
            m28335b();
            ((zzayf) this.a).m29089b(0);
            return this;
        }

        /* renamed from: a */
        public final zza m29082a(zzayh zzayh) {
            m28335b();
            ((zzayf) this.a).m29088a(zzayh);
            return this;
        }

        /* renamed from: a */
        public final zza m29083a(zzbbu zzbbu) {
            m28335b();
            ((zzayf) this.a).m29090b(zzbbu);
            return this;
        }
    }

    private zzayf() {
    }

    /* renamed from: a */
    public final int m29093a() {
        return this.zzdlw;
    }

    /* renamed from: b */
    private final void m29089b(int i) {
        this.zzdlw = i;
    }

    /* renamed from: b */
    public final zzayh m29095b() {
        return this.zzdnf == null ? zzayh.m29111f() : this.zzdnf;
    }

    /* renamed from: a */
    private final void m29088a(zzayh zzayh) {
        if (zzayh != null) {
            this.zzdnf = zzayh;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final zzbbu m29096c() {
        return this.zzdme;
    }

    /* renamed from: b */
    private final void m29090b(zzbbu zzbbu) {
        if (zzbbu != null) {
            this.zzdme = zzbbu;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static zzayf m29084a(zzbbu zzbbu) {
        return (zzayf) zzbdd.m28342a(zzdng, zzbbu);
    }

    /* renamed from: d */
    public static zza m29091d() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdng.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (iy.f8179a[i - 1]) {
            case 1:
                return new zzayf();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdlw", "zzdnf", "zzdme"};
                return zzbdd.m28347a((zzbel) zzdng, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", (Object[]) i);
            case 4:
                return zzdng;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzayf.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdng);
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
        zzbdd.m28349a(zzayf.class, zzdng);
    }
}
