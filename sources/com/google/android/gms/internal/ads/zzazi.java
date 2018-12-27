package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzazi extends zzbdd<zzazi, zza> implements zzben {
    private static volatile zzbew<zzazi> zzaky;
    private static final zzazi zzdpp = new zzazi();
    private int zzdlw;
    private zzazk zzdpo;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzazi, zza> implements zzben {
        private zza() {
            super(zzazi.zzdpp);
        }

        /* renamed from: a */
        public final zza m29233a(int i) {
            m28335b();
            ((zzazi) this.a).m29239b(0);
            return this;
        }

        /* renamed from: a */
        public final zza m29234a(zzazk zzazk) {
            m28335b();
            ((zzazi) this.a).m29238a(zzazk);
            return this;
        }
    }

    private zzazi() {
    }

    /* renamed from: a */
    public final int m29242a() {
        return this.zzdlw;
    }

    /* renamed from: b */
    private final void m29239b(int i) {
        this.zzdlw = i;
    }

    /* renamed from: b */
    public final zzazk m29244b() {
        return this.zzdpo == null ? zzazk.m29246b() : this.zzdpo;
    }

    /* renamed from: a */
    private final void m29238a(zzazk zzazk) {
        if (zzazk != null) {
            this.zzdpo = zzazk;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static zzazi m29235a(zzbbu zzbbu) {
        return (zzazi) zzbdd.m28342a(zzdpp, zzbbu);
    }

    /* renamed from: c */
    public static zza m29240c() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdpp.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (jn.f8192a[i - 1]) {
            case 1:
                return new zzazi();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdlw", "zzdpo"};
                return zzbdd.m28347a((zzbel) zzdpp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", (Object[]) i);
            case 4:
                return zzdpp;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzazi.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdpp);
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
        zzbdd.m28349a(zzazi.class, zzdpp);
    }
}
