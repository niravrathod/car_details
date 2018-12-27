package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;

public final class zzazk extends zzbdd<zzazk, zza> implements zzben {
    private static volatile zzbew<zzazk> zzaky;
    private static final zzazk zzdpr = new zzazk();
    private String zzdpq = "";

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzazk, zza> implements zzben {
        private zza() {
            super(zzazk.zzdpr);
        }
    }

    private zzazk() {
    }

    /* renamed from: a */
    public final String m29249a() {
        return this.zzdpq;
    }

    /* renamed from: a */
    public static zzazk m29245a(zzbbu zzbbu) {
        return (zzazk) zzbdd.m28342a(zzdpr, zzbbu);
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (jo.f8193a[i - 1]) {
            case 1:
                return new zzazk();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdpq"};
                return zzbdd.m28347a((zzbel) zzdpr, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", (Object[]) i);
            case 4:
                return zzdpr;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzazk.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdpr);
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

    /* renamed from: b */
    public static zzazk m29246b() {
        return zzdpr;
    }

    static {
        zzbdd.m28349a(zzazk.class, zzdpr);
    }
}
