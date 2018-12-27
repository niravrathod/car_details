package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzazg extends zzbdd<zzazg, zza> implements zzben {
    private static volatile zzbew<zzazg> zzaky;
    private static final zzazg zzdpm = new zzazg();
    private int zzamm;
    private int zzdpe;
    private zzbdk<zzb> zzdpl = zzbdd.m28353n();

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzazg, zza> implements zzben {
        private zza() {
            super(zzazg.zzdpm);
        }

        /* renamed from: a */
        public final zza m29209a(int i) {
            m28335b();
            ((zzazg) this.a).m29231b(i);
            return this;
        }

        /* renamed from: a */
        public final zza m29210a(zzb zzb) {
            m28335b();
            ((zzazg) this.a).m29227a(zzb);
            return this;
        }
    }

    public static final class zzb extends zzbdd<zzb, zza> implements zzben {
        private static volatile zzbew<zzb> zzaky;
        private static final zzb zzdpn = new zzb();
        private String zzdog = "";
        private int zzdox;
        private int zzdpi;
        private int zzdpj;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzb, zza> implements zzben {
            private zza() {
                super(zzb.zzdpn);
            }

            /* renamed from: a */
            public final zza m29214a(String str) {
                m28335b();
                ((zzb) this.a).m29222a(str);
                return this;
            }

            /* renamed from: a */
            public final zza m29212a(zzayy zzayy) {
                m28335b();
                ((zzb) this.a).m29216a(zzayy);
                return this;
            }

            /* renamed from: a */
            public final zza m29211a(int i) {
                m28335b();
                ((zzb) this.a).m29224b(i);
                return this;
            }

            /* renamed from: a */
            public final zza m29213a(zzazq zzazq) {
                m28335b();
                ((zzb) this.a).m29221a(zzazq);
                return this;
            }
        }

        private zzb() {
        }

        /* renamed from: a */
        private final void m29222a(String str) {
            if (str != null) {
                this.zzdog = str;
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        private final void m29216a(zzayy zzayy) {
            if (zzayy != null) {
                this.zzdpi = zzayy.mo2419a();
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: b */
        private final void m29224b(int i) {
            this.zzdpj = i;
        }

        /* renamed from: a */
        private final void m29221a(zzazq zzazq) {
            if (zzazq != null) {
                this.zzdox = zzazq.mo2419a();
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public static zza m29215a() {
            return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdpn.mo4959a(zze.f9170e, null, null));
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (jm.f8191a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzdog", "zzdpi", "zzdpj", "zzdox"};
                    return zzbdd.m28347a((zzbel) zzdpn, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", (Object[]) i);
                case 4:
                    return zzdpn;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzb.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzdpn);
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
            zzbdd.m28349a(zzb.class, zzdpn);
        }
    }

    private zzazg() {
    }

    /* renamed from: b */
    private final void m29231b(int i) {
        this.zzdpe = i;
    }

    /* renamed from: a */
    private final void m29227a(zzb zzb) {
        if (zzb != null) {
            if (!this.zzdpl.mo1969a()) {
                zzbdk zzbdk = this.zzdpl;
                int size = zzbdk.size();
                this.zzdpl = zzbdk.mo4159a(size == 0 ? 10 : size << 1);
            }
            this.zzdpl.add(zzb);
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static zza m29226a() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdpm.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (jm.f8191a[i - 1]) {
            case 1:
                return new zzazg();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzamm", "zzdpe", "zzdpl", zzb.class};
                return zzbdd.m28347a((zzbel) zzdpm, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", (Object[]) i);
            case 4:
                return zzdpm;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzazg.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzdpm);
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
        zzbdd.m28349a(zzazg.class, zzdpm);
    }
}
