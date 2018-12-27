package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzaze extends zzbdd<zzaze, zza> implements zzben {
    private static volatile zzbew<zzaze> zzaky;
    private static final zzaze zzdpg = new zzaze();
    private int zzamm;
    private int zzdpe;
    private zzbdk<zzb> zzdpf = zzbdd.m28353n();

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzaze, zza> implements zzben {
        private zza() {
            super(zzaze.zzdpg);
        }
    }

    public static final class zzb extends zzbdd<zzb, zza> implements zzben {
        private static volatile zzbew<zzb> zzaky;
        private static final zzb zzdpk = new zzb();
        private int zzdox;
        private zzayv zzdph;
        private int zzdpi;
        private int zzdpj;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzb, zza> implements zzben {
            private zza() {
                super(zzb.zzdpk);
            }
        }

        private zzb() {
        }

        /* renamed from: a */
        public final boolean m29198a() {
            return this.zzdph != null;
        }

        /* renamed from: b */
        public final zzayv m29199b() {
            return this.zzdph == null ? zzayv.m29162e() : this.zzdph;
        }

        /* renamed from: c */
        public final zzayy m29200c() {
            zzayy a = zzayy.m21486a(this.zzdpi);
            return a == null ? zzayy.UNRECOGNIZED : a;
        }

        /* renamed from: d */
        public final int m29201d() {
            return this.zzdpj;
        }

        /* renamed from: e */
        public final zzazq m29202e() {
            zzazq a = zzazq.m21488a(this.zzdox);
            return a == null ? zzazq.UNRECOGNIZED : a;
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (jl.f8190a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzdph", "zzdpi", "zzdpj", "zzdox"};
                    return zzbdd.m28347a((zzbel) zzdpk, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", (Object[]) i);
                case 4:
                    return zzdpk;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzb.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzdpk);
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
            zzbdd.m28349a(zzb.class, zzdpk);
        }
    }

    private zzaze() {
    }

    /* renamed from: a */
    public final int m29205a() {
        return this.zzdpe;
    }

    /* renamed from: b */
    public final List<zzb> m29207b() {
        return this.zzdpf;
    }

    /* renamed from: c */
    public final int m29208c() {
        return this.zzdpf.size();
    }

    /* renamed from: a */
    public static zzaze m29203a(byte[] bArr) {
        return (zzaze) zzbdd.m28345a(zzdpg, bArr);
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (jl.f8190a[i - 1]) {
            case 1:
                return new zzaze();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzamm", "zzdpe", "zzdpf", zzb.class};
                return zzbdd.m28347a((zzbel) zzdpg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", (Object[]) i);
            case 4:
                return zzdpg;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzaze.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzdpg);
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
        zzbdd.m28349a(zzaze.class, zzdpg);
    }
}
