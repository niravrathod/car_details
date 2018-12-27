package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzazm extends zzbdd<zzazm, zza> implements zzben {
    private static volatile zzbew<zzazm> zzaky;
    private static final zzazm zzdpt = new zzazm();
    private int zzdlw;
    private zzazo zzdps;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzazm, zza> implements zzben {
        private zza() {
            super(zzazm.zzdpt);
        }

        /* renamed from: a */
        public final zza m29250a(int i) {
            m28335b();
            ((zzazm) this.a).m29256b(0);
            return this;
        }

        /* renamed from: a */
        public final zza m29251a(zzazo zzazo) {
            m28335b();
            ((zzazm) this.a).m29255a(zzazo);
            return this;
        }
    }

    private zzazm() {
    }

    /* renamed from: a */
    public final int m29259a() {
        return this.zzdlw;
    }

    /* renamed from: b */
    private final void m29256b(int i) {
        this.zzdlw = i;
    }

    /* renamed from: b */
    public final zzazo m29261b() {
        return this.zzdps == null ? zzazo.m29263c() : this.zzdps;
    }

    /* renamed from: a */
    private final void m29255a(zzazo zzazo) {
        if (zzazo != null) {
            this.zzdps = zzazo;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static zzazm m29252a(zzbbu zzbbu) {
        return (zzazm) zzbdd.m28342a(zzdpt, zzbbu);
    }

    /* renamed from: c */
    public static zza m29257c() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdpt.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (jp.f8194a[i - 1]) {
            case 1:
                return new zzazm();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdlw", "zzdps"};
                return zzbdd.m28347a((zzbel) zzdpt, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", (Object[]) i);
            case 4:
                return zzdpt;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzazm.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdpt);
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
        zzbdd.m28349a(zzazm.class, zzdpt);
    }
}
