package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzaxv extends zzbdd<zzaxv, zza> implements zzben {
    private static volatile zzbew<zzaxv> zzaky;
    private static final zzaxv zzdmq = new zzaxv();
    private int zzdlw;
    private zzbbu zzdme = zzbbu.f9094a;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxv, zza> implements zzben {
        private zza() {
            super(zzaxv.zzdmq);
        }

        /* renamed from: a */
        public final zza m29055a(int i) {
            m28335b();
            ((zzaxv) this.a).m29060b(0);
            return this;
        }

        /* renamed from: a */
        public final zza m29056a(zzbbu zzbbu) {
            m28335b();
            ((zzaxv) this.a).m29061b(zzbbu);
            return this;
        }
    }

    private zzaxv() {
    }

    /* renamed from: a */
    public final int m29064a() {
        return this.zzdlw;
    }

    /* renamed from: b */
    private final void m29060b(int i) {
        this.zzdlw = i;
    }

    /* renamed from: b */
    public final zzbbu m29066b() {
        return this.zzdme;
    }

    /* renamed from: b */
    private final void m29061b(zzbbu zzbbu) {
        if (zzbbu != null) {
            this.zzdme = zzbbu;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static zzaxv m29057a(zzbbu zzbbu) {
        return (zzaxv) zzbdd.m28342a(zzdmq, zzbbu);
    }

    /* renamed from: c */
    public static zza m29062c() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdmq.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (it.f8175a[i - 1]) {
            case 1:
                return new zzaxv();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdlw", "zzdme"};
                return zzbdd.m28347a((zzbel) zzdmq, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", (Object[]) i);
            case 4:
                return zzdmq;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxv.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdmq);
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
        zzbdd.m28349a(zzaxv.class, zzdmq);
    }
}
