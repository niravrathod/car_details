package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzayp extends zzbdd<zzayp, zza> implements zzben {
    private static volatile zzbew<zzayp> zzaky;
    private static final zzayp zzdob = new zzayp();
    private int zzdlw;
    private zzbbu zzdme = zzbbu.f9094a;
    private zzayt zzdoa;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzayp, zza> implements zzben {
        private zza() {
            super(zzayp.zzdob);
        }

        /* renamed from: a */
        public final zza m29124a(int i) {
            m28335b();
            ((zzayp) this.a).m29132b(0);
            return this;
        }

        /* renamed from: a */
        public final zza m29125a(zzayt zzayt) {
            m28335b();
            ((zzayp) this.a).m29131a(zzayt);
            return this;
        }

        /* renamed from: a */
        public final zza m29126a(zzbbu zzbbu) {
            m28335b();
            ((zzayp) this.a).m29133b(zzbbu);
            return this;
        }
    }

    private zzayp() {
    }

    /* renamed from: a */
    public final int m29137a() {
        return this.zzdlw;
    }

    /* renamed from: b */
    private final void m29132b(int i) {
        this.zzdlw = i;
    }

    /* renamed from: b */
    public final zzayt m29139b() {
        return this.zzdoa == null ? zzayt.m29147c() : this.zzdoa;
    }

    /* renamed from: a */
    private final void m29131a(zzayt zzayt) {
        if (zzayt != null) {
            this.zzdoa = zzayt;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final zzbbu m29140c() {
        return this.zzdme;
    }

    /* renamed from: b */
    private final void m29133b(zzbbu zzbbu) {
        if (zzbbu != null) {
            this.zzdme = zzbbu;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static zzayp m29127a(zzbbu zzbbu) {
        return (zzayp) zzbdd.m28342a(zzdob, zzbbu);
    }

    /* renamed from: d */
    public static zza m29134d() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdob.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (jd.f8184a[i - 1]) {
            case 1:
                return new zzayp();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdlw", "zzdoa", "zzdme"};
                return zzbdd.m28347a((zzbel) zzdob, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", (Object[]) i);
            case 4:
                return zzdob;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzayp.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdob);
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
    public static zzayp m29135e() {
        return zzdob;
    }

    static {
        zzbdd.m28349a(zzayp.class, zzdob);
    }
}
