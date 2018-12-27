package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzayh extends zzbdd<zzayh, zza> implements zzben {
    private static volatile zzbew<zzayh> zzaky;
    private static final zzayh zzdnj = new zzayh();
    private int zzdlw;
    private zzayd zzdmz;
    private zzbbu zzdnh = zzbbu.f9094a;
    private zzbbu zzdni = zzbbu.f9094a;

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzayh, zza> implements zzben {
        private zza() {
            super(zzayh.zzdnj);
        }

        /* renamed from: a */
        public final zza m29097a(int i) {
            m28335b();
            ((zzayh) this.a).m29106b(0);
            return this;
        }

        /* renamed from: a */
        public final zza m29098a(zzayd zzayd) {
            m28335b();
            ((zzayh) this.a).m29102a(zzayd);
            return this;
        }

        /* renamed from: a */
        public final zza m29099a(zzbbu zzbbu) {
            m28335b();
            ((zzayh) this.a).m29108b(zzbbu);
            return this;
        }

        /* renamed from: b */
        public final zza m29100b(zzbbu zzbbu) {
            m28335b();
            ((zzayh) this.a).m29109c(zzbbu);
            return this;
        }
    }

    private zzayh() {
    }

    /* renamed from: a */
    public final int m29113a() {
        return this.zzdlw;
    }

    /* renamed from: b */
    private final void m29106b(int i) {
        this.zzdlw = i;
    }

    /* renamed from: b */
    public final zzayd m29115b() {
        return this.zzdmz == null ? zzayd.m29075d() : this.zzdmz;
    }

    /* renamed from: a */
    private final void m29102a(zzayd zzayd) {
        if (zzayd != null) {
            this.zzdmz = zzayd;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final zzbbu m29116c() {
        return this.zzdnh;
    }

    /* renamed from: b */
    private final void m29108b(zzbbu zzbbu) {
        if (zzbbu != null) {
            this.zzdnh = zzbbu;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: d */
    public final zzbbu m29117d() {
        return this.zzdni;
    }

    /* renamed from: c */
    private final void m29109c(zzbbu zzbbu) {
        if (zzbbu != null) {
            this.zzdni = zzbbu;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static zzayh m29101a(zzbbu zzbbu) {
        return (zzayh) zzbdd.m28342a(zzdnj, zzbbu);
    }

    /* renamed from: e */
    public static zza m29110e() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdnj.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (iz.f8180a[i - 1]) {
            case 1:
                return new zzayh();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdlw", "zzdmz", "zzdnh", "zzdni"};
                return zzbdd.m28347a((zzbel) zzdnj, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", (Object[]) i);
            case 4:
                return zzdnj;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzayh.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdnj);
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

    /* renamed from: f */
    public static zzayh m29111f() {
        return zzdnj;
    }

    static {
        zzbdd.m28349a(zzayh.class, zzdnj);
    }
}
