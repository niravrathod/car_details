package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzaxf extends zzbdd<zzaxf, zza> implements zzben {
    private static volatile zzbew<zzaxf> zzaky;
    private static final zzaxf zzdmf = new zzaxf();
    private int zzdlw;
    private zzaxj zzdmd;
    private zzbbu zzdme = zzbbu.f9094a;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaxf, zza> implements zzben {
        private zza() {
            super(zzaxf.zzdmf);
        }

        /* renamed from: a */
        public final zza m28987a(int i) {
            m28335b();
            ((zzaxf) this.a).m28995b(0);
            return this;
        }

        /* renamed from: a */
        public final zza m28988a(zzaxj zzaxj) {
            m28335b();
            ((zzaxf) this.a).m28994a(zzaxj);
            return this;
        }

        /* renamed from: a */
        public final zza m28989a(zzbbu zzbbu) {
            m28335b();
            ((zzaxf) this.a).m28996b(zzbbu);
            return this;
        }
    }

    private zzaxf() {
    }

    /* renamed from: a */
    public final int m29000a() {
        return this.zzdlw;
    }

    /* renamed from: b */
    private final void m28995b(int i) {
        this.zzdlw = i;
    }

    /* renamed from: b */
    public final zzaxj m29002b() {
        return this.zzdmd == null ? zzaxj.m29010b() : this.zzdmd;
    }

    /* renamed from: a */
    private final void m28994a(zzaxj zzaxj) {
        if (zzaxj != null) {
            this.zzdmd = zzaxj;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final zzbbu m29003c() {
        return this.zzdme;
    }

    /* renamed from: b */
    private final void m28996b(zzbbu zzbbu) {
        if (zzbbu != null) {
            this.zzdme = zzbbu;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static zzaxf m28990a(zzbbu zzbbu) {
        return (zzaxf) zzbdd.m28342a(zzdmf, zzbbu);
    }

    /* renamed from: d */
    public static zza m28997d() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdmf.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (il.f8167a[i - 1]) {
            case 1:
                return new zzaxf();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdlw", "zzdmd", "zzdme"};
                return zzbdd.m28347a((zzbel) zzdmf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", (Object[]) i);
            case 4:
                return zzdmf;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaxf.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdmf);
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
    public static zzaxf m28998e() {
        return zzdmf;
    }

    static {
        zzbdd.m28349a(zzaxf.class, zzdmf);
    }
}
