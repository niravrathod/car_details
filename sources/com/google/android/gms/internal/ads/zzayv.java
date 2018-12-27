package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzayv extends zzbdd<zzayv, zza> implements zzben {
    private static volatile zzbew<zzayv> zzaky;
    private static final zzayv zzdoj = new zzayv();
    private String zzdog = "";
    private zzbbu zzdoh = zzbbu.f9094a;
    private int zzdoi;

    public enum zzb implements zzbdg {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        /* renamed from: g */
        private static final zzbdh<zzb> f17032g = null;
        private final int value;

        /* renamed from: a */
        public final int mo2419a() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: a */
        public static zzb m21484a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_KEYMATERIAL;
                case 1:
                    return SYMMETRIC;
                case 2:
                    return ASYMMETRIC_PRIVATE;
                case 3:
                    return ASYMMETRIC_PUBLIC;
                case 4:
                    return REMOTE;
                default:
                    return 0;
            }
        }

        private zzb(int i) {
            this.value = i;
        }

        static {
            f17032g = new jh();
        }
    }

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzayv, zza> implements zzben {
        private zza() {
            super(zzayv.zzdoj);
        }

        /* renamed from: a */
        public final zza m29154a(String str) {
            m28335b();
            ((zzayv) this.a).m29160a(str);
            return this;
        }

        /* renamed from: a */
        public final zza m29153a(zzbbu zzbbu) {
            m28335b();
            ((zzayv) this.a).m29159a(zzbbu);
            return this;
        }

        /* renamed from: a */
        public final zza m29152a(zzb zzb) {
            m28335b();
            ((zzayv) this.a).m29155a(zzb);
            return this;
        }
    }

    private zzayv() {
    }

    /* renamed from: a */
    public final String m29165a() {
        return this.zzdog;
    }

    /* renamed from: a */
    private final void m29160a(String str) {
        if (str != null) {
            this.zzdog = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public final zzbbu m29166b() {
        return this.zzdoh;
    }

    /* renamed from: a */
    private final void m29159a(zzbbu zzbbu) {
        if (zzbbu != null) {
            this.zzdoh = zzbbu;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final zzb m29167c() {
        zzb a = zzb.m21484a(this.zzdoi);
        return a == null ? zzb.UNRECOGNIZED : a;
    }

    /* renamed from: a */
    private final void m29155a(zzb zzb) {
        if (zzb != null) {
            this.zzdoi = zzb.mo2419a();
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: d */
    public static zza m29161d() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdoj.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (jg.f8187a[i - 1]) {
            case 1:
                return new zzayv();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdog", "zzdoh", "zzdoi"};
                return zzbdd.m28347a((zzbel) zzdoj, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", (Object[]) i);
            case 4:
                return zzdoj;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzayv.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzdoj);
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

    /* renamed from: e */
    public static zzayv m29162e() {
        return zzdoj;
    }

    static {
        zzbdd.m28349a(zzayv.class, zzdoj);
    }
}
