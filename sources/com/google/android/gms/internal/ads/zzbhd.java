package com.google.android.gms.internal.ads;

public final class zzbhd {

    public static final class zza extends zzbdd<zza, zza> implements zzben {
        private static volatile zzbew<zza> zzaky;
        private static final zza zzefl = new zza();
        private int zzamm;
        private int zzefe;
        private zzb zzeff;
        private zzbbu zzefg = zzbbu.f9094a;
        private zzbbu zzefh = zzbbu.f9094a;
        private boolean zzefi;
        private boolean zzefj;
        private byte zzefk = (byte) 2;

        public enum zzc implements zzbdg {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);
            
            /* renamed from: f */
            private static final zzbdh<zzc> f17088f = null;
            private final int value;

            /* renamed from: a */
            public final int mo2419a() {
                return this.value;
            }

            /* renamed from: a */
            public static zzc m21618a(int i) {
                switch (i) {
                    case 0:
                        return SAFE;
                    case 1:
                        return DANGEROUS;
                    case 2:
                        return UNKNOWN;
                    case 3:
                        return POTENTIALLY_UNWANTED;
                    case 4:
                        return DANGEROUS_HOST;
                    default:
                        return 0;
                }
            }

            /* renamed from: b */
            public static zzbdi m21619b() {
                return nt.f16570a;
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                f17088f = new ns();
            }
        }

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zza, zza> implements zzben {
            private zza() {
                super(zza.zzefl);
            }
        }

        public static final class zzb extends zzbdd<zzb, zza> implements zzben {
            private static volatile zzbew<zzb> zzaky;
            private static final zzb zzefq = new zzb();
            private int zzamm;
            private String zzefm = "";
            private String zzefn = "";
            private String zzefo = "";
            private int zzefp;

            public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzb, zza> implements zzben {
                private zza() {
                    super(zzb.zzefq);
                }
            }

            private zzb() {
            }

            /* renamed from: a */
            protected final Object mo4959a(int i, Object obj, Object obj2) {
                switch (nr.f8306a[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new zza();
                    case 3:
                        i = new Object[]{"zzamm", "zzefm", "zzefn", "zzefo", "zzefp"};
                        return zzbdd.m28347a((zzbel) zzefq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003", (Object[]) i);
                    case 4:
                        return zzefq;
                    case 5:
                        i = zzaky;
                        if (i == 0) {
                            synchronized (zzb.class) {
                                i = zzaky;
                                if (i == 0) {
                                    i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzefq);
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
                zzbdd.m28349a(zzb.class, zzefq);
            }
        }

        private zza() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            obj2 = null;
            switch (nr.f8306a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzefe", zzc.m21619b(), "zzeff", "zzefg", "zzefh", "zzefi", "zzefj"};
                    return zzbdd.m28347a((zzbel) zzefl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Ԍ\u0000\u0002\t\u0001\u0003\n\u0002\u0004\n\u0003\u0005\u0007\u0004\u0006\u0007\u0005", (Object[]) i);
                case 4:
                    return zzefl;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zza.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzefl);
                                zzaky = i;
                            }
                        }
                    }
                    return i;
                case 6:
                    return Byte.valueOf(this.zzefk);
                case 7:
                    if (obj != null) {
                        obj2 = true;
                    }
                    this.zzefk = (byte) obj2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzbdd.m28349a(zza.class, zzefl);
        }
    }

    public static final class zzb extends zzbdd<zzb, zza> implements zzben {
        private static volatile zzbew<zzb> zzaky;
        private static final zzb zzegm = new zzb();
        private int zzamm;
        private int zzamn;
        private zzbbu zzefg = zzbbu.f9094a;
        private byte zzefk = (byte) 2;
        private String zzefn = "";
        private int zzefx;
        private String zzefy = "";
        private String zzefz = "";
        private zzb zzega;
        private zzbdk<zzh> zzegb = zzbdd.m28353n();
        private String zzegc = "";
        private zzf zzegd;
        private boolean zzege;
        private zzbdk<String> zzegf = zzbdd.m28353n();
        private String zzegg = "";
        private boolean zzegh;
        private boolean zzegi;
        private zzi zzegj;
        private zzbdk<String> zzegk = zzbdd.m28353n();
        private zzbdk<String> zzegl = zzbdd.m28353n();

        public enum zzg implements zzbdg {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);
            
            /* renamed from: k */
            private static final zzbdh<zzg> f17104k = null;
            private final int value;

            /* renamed from: a */
            public final int mo2419a() {
                return this.value;
            }

            /* renamed from: a */
            public static zzg m21624a(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return 0;
                }
            }

            /* renamed from: b */
            public static zzbdi m21625b() {
                return nx.f16572a;
            }

            private zzg(int i) {
                this.value = i;
            }

            static {
                f17104k = new nw();
            }
        }

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzb, zza> implements zzben {
            private zza() {
                super(zzb.zzegm);
            }
        }

        public static final class zzb extends zzbdd<zzb, zza> implements zzben {
            private static volatile zzbew<zzb> zzaky;
            private static final zzb zzego = new zzb();
            private int zzamm;
            private String zzegn = "";

            public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzb, zza> implements zzben {
                private zza() {
                    super(zzb.zzego);
                }
            }

            private zzb() {
            }

            /* renamed from: a */
            protected final Object mo4959a(int i, Object obj, Object obj2) {
                switch (nr.f8306a[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new zza();
                    case 3:
                        i = new Object[]{"zzamm", "zzegn"};
                        return zzbdd.m28347a((zzbel) zzego, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", (Object[]) i);
                    case 4:
                        return zzego;
                    case 5:
                        i = zzaky;
                        if (i == 0) {
                            synchronized (zzb.class) {
                                i = zzaky;
                                if (i == 0) {
                                    i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzego);
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
                zzbdd.m28349a(zzb.class, zzego);
            }
        }

        public static final class zzc extends zzbdd<zzc, zza> implements zzben {
            private static volatile zzbew<zzc> zzaky;
            private static final zzc zzegq = new zzc();
            private int zzamm;
            private zzbbu zzdoh = zzbbu.f9094a;
            private byte zzefk = (byte) 2;
            private zzbbu zzegp = zzbbu.f9094a;

            public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzc, zza> implements zzben {
                private zza() {
                    super(zzc.zzegq);
                }
            }

            private zzc() {
            }

            /* renamed from: a */
            protected final Object mo4959a(int i, Object obj, Object obj2) {
                obj2 = null;
                switch (nr.f8306a[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza();
                    case 3:
                        i = new Object[]{"zzamm", "zzegp", "zzdoh"};
                        return zzbdd.m28347a((zzbel) zzegq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ԋ\u0000\u0002\n\u0001", (Object[]) i);
                    case 4:
                        return zzegq;
                    case 5:
                        i = zzaky;
                        if (i == 0) {
                            synchronized (zzc.class) {
                                i = zzaky;
                                if (i == 0) {
                                    i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzegq);
                                    zzaky = i;
                                }
                            }
                        }
                        return i;
                    case 6:
                        return Byte.valueOf(this.zzefk);
                    case 7:
                        if (obj != null) {
                            obj2 = true;
                        }
                        this.zzefk = (byte) obj2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzbdd.m28349a(zzc.class, zzegq);
            }
        }

        public static final class zzd extends zzbdd<zzd, zza> implements zzben {
            private static volatile zzbew<zzd> zzaky;
            private static final zzd zzegw = new zzd();
            private int zzamm;
            private byte zzefk = (byte) 2;
            private zzb zzegr;
            private zzbdk<zzc> zzegs = zzbdd.m28353n();
            private zzbbu zzegt = zzbbu.f9094a;
            private zzbbu zzegu = zzbbu.f9094a;
            private int zzegv;

            public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzd, zza> implements zzben {
                private zza() {
                    super(zzd.zzegw);
                }
            }

            public static final class zzb extends zzbdd<zzb, zza> implements zzben {
                private static volatile zzbew<zzb> zzaky;
                private static final zzb zzeha = new zzb();
                private int zzamm;
                private zzbbu zzegx = zzbbu.f9094a;
                private zzbbu zzegy = zzbbu.f9094a;
                private zzbbu zzegz = zzbbu.f9094a;

                public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzb, zza> implements zzben {
                    private zza() {
                        super(zzb.zzeha);
                    }
                }

                private zzb() {
                }

                /* renamed from: a */
                protected final Object mo4959a(int i, Object obj, Object obj2) {
                    switch (nr.f8306a[i - 1]) {
                        case 1:
                            return new zzb();
                        case 2:
                            return new zza();
                        case 3:
                            i = new Object[]{"zzamm", "zzegx", "zzegy", "zzegz"};
                            return zzbdd.m28347a((zzbel) zzeha, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002", (Object[]) i);
                        case 4:
                            return zzeha;
                        case 5:
                            i = zzaky;
                            if (i == 0) {
                                synchronized (zzb.class) {
                                    i = zzaky;
                                    if (i == 0) {
                                        i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzeha);
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

                /* renamed from: a */
                public static zzbew<zzb> m29286a() {
                    return (zzbew) zzeha.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
                }

                static {
                    zzbdd.m28349a(zzb.class, zzeha);
                }
            }

            private zzd() {
            }

            /* renamed from: a */
            protected final Object mo4959a(int i, Object obj, Object obj2) {
                obj2 = null;
                switch (nr.f8306a[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza();
                    case 3:
                        i = new Object[]{"zzamm", "zzegr", "zzegs", zzc.class, "zzegt", "zzegu", "zzegv"};
                        return zzbdd.m28347a((zzbel) zzegw, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003", (Object[]) i);
                    case 4:
                        return zzegw;
                    case 5:
                        i = zzaky;
                        if (i == 0) {
                            synchronized (zzd.class) {
                                i = zzaky;
                                if (i == 0) {
                                    i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzegw);
                                    zzaky = i;
                                }
                            }
                        }
                        return i;
                    case 6:
                        return Byte.valueOf(this.zzefk);
                    case 7:
                        if (obj != null) {
                            obj2 = true;
                        }
                        this.zzefk = (byte) obj2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzbdd.m28349a(zzd.class, zzegw);
            }
        }

        public static final class zze extends zzbdd<zze, zza> implements zzben {
            private static volatile zzbew<zze> zzaky;
            private static final zze zzehd = new zze();
            private int zzamm;
            private byte zzefk = (byte) 2;
            private zzbdk<zzc> zzegs = zzbdd.m28353n();
            private zzbbu zzegt = zzbbu.f9094a;
            private zzbbu zzegu = zzbbu.f9094a;
            private int zzegv;
            private zzb zzehb;
            private zzbbu zzehc = zzbbu.f9094a;

            public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zze, zza> implements zzben {
                private zza() {
                    super(zze.zzehd);
                }
            }

            public static final class zzb extends zzbdd<zzb, zza> implements zzben {
                private static volatile zzbew<zzb> zzaky;
                private static final zzb zzehg = new zzb();
                private int zzamm;
                private zzbbu zzegz = zzbbu.f9094a;
                private int zzehe;
                private zzbbu zzehf = zzbbu.f9094a;

                public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzb, zza> implements zzben {
                    private zza() {
                        super(zzb.zzehg);
                    }
                }

                private zzb() {
                }

                /* renamed from: a */
                protected final Object mo4959a(int i, Object obj, Object obj2) {
                    switch (nr.f8306a[i - 1]) {
                        case 1:
                            return new zzb();
                        case 2:
                            return new zza();
                        case 3:
                            i = new Object[]{"zzamm", "zzehe", "zzehf", "zzegz"};
                            return zzbdd.m28347a((zzbel) zzehg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\n\u0002", (Object[]) i);
                        case 4:
                            return zzehg;
                        case 5:
                            i = zzaky;
                            if (i == 0) {
                                synchronized (zzb.class) {
                                    i = zzaky;
                                    if (i == 0) {
                                        i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzehg);
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

                /* renamed from: a */
                public static zzbew<zzb> m29291a() {
                    return (zzbew) zzehg.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
                }

                static {
                    zzbdd.m28349a(zzb.class, zzehg);
                }
            }

            private zze() {
            }

            /* renamed from: a */
            protected final Object mo4959a(int i, Object obj, Object obj2) {
                obj2 = null;
                switch (nr.f8306a[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new zza();
                    case 3:
                        i = new Object[]{"zzamm", "zzehb", "zzegs", zzc.class, "zzegt", "zzegu", "zzegv", "zzehc"};
                        return zzbdd.m28347a((zzbel) zzehd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003\u0006\n\u0004", (Object[]) i);
                    case 4:
                        return zzehd;
                    case 5:
                        i = zzaky;
                        if (i == 0) {
                            synchronized (zze.class) {
                                i = zzaky;
                                if (i == 0) {
                                    i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzehd);
                                    zzaky = i;
                                }
                            }
                        }
                        return i;
                    case 6:
                        return Byte.valueOf(this.zzefk);
                    case 7:
                        if (obj != null) {
                            obj2 = true;
                        }
                        this.zzefk = (byte) obj2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzbdd.m28349a(zze.class, zzehd);
            }
        }

        public static final class zzf extends zzbdd<zzf, zza> implements zzben {
            private static volatile zzbew<zzf> zzaky;
            private static final zzf zzehj = new zzf();
            private int zzamm;
            private int zzamn;
            private String zzehh = "";
            private zzbbu zzehi = zzbbu.f9094a;

            public enum zzb implements zzbdg {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);
                
                /* renamed from: c */
                private static final zzbdh<zzb> f17092c = null;
                private final int value;

                /* renamed from: a */
                public final int mo2419a() {
                    return this.value;
                }

                /* renamed from: a */
                public static zzb m21621a(int i) {
                    switch (i) {
                        case 0:
                            return TYPE_UNKNOWN;
                        case 1:
                            return TYPE_CREATIVE;
                        default:
                            return 0;
                    }
                }

                /* renamed from: b */
                public static zzbdi m21622b() {
                    return nv.f16571a;
                }

                private zzb(int i) {
                    this.value = i;
                }

                static {
                    f17092c = new nu();
                }
            }

            public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzf, zza> implements zzben {
                private zza() {
                    super(zzf.zzehj);
                }
            }

            private zzf() {
            }

            /* renamed from: a */
            protected final Object mo4959a(int i, Object obj, Object obj2) {
                switch (nr.f8306a[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new zza();
                    case 3:
                        i = new Object[]{"zzamm", "zzamn", zzb.m21622b(), "zzehh", "zzehi"};
                        return zzbdd.m28347a((zzbel) zzehj, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002", (Object[]) i);
                    case 4:
                        return zzehj;
                    case 5:
                        i = zzaky;
                        if (i == 0) {
                            synchronized (zzf.class) {
                                i = zzaky;
                                if (i == 0) {
                                    i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzehj);
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
                zzbdd.m28349a(zzf.class, zzehj);
            }
        }

        public static final class zzh extends zzbdd<zzh, zzb> implements zzben {
            private static volatile zzbew<zzh> zzaky;
            private static final zzh zzeig = new zzh();
            private int zzamm;
            private byte zzefk = (byte) 2;
            private String zzefn = "";
            private int zzehy;
            private zzd zzehz;
            private zze zzeia;
            private int zzeib;
            private zzbdj zzeic = zzbdd.m28352m();
            private String zzeid = "";
            private int zzeie;
            private zzbdk<String> zzeif = zzbdd.m28353n();

            public enum zza implements zzbdg {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
                
                /* renamed from: e */
                private static final zzbdh<zza> f17110e = null;
                private final int value;

                /* renamed from: a */
                public final int mo2419a() {
                    return this.value;
                }

                /* renamed from: a */
                public static zza m21627a(int i) {
                    switch (i) {
                        case 0:
                            return AD_RESOURCE_UNKNOWN;
                        case 1:
                            return AD_RESOURCE_CREATIVE;
                        case 2:
                            return AD_RESOURCE_POST_CLICK;
                        case 3:
                            return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                        default:
                            return 0;
                    }
                }

                /* renamed from: b */
                public static zzbdi m21628b() {
                    return nz.f16573a;
                }

                private zza(int i) {
                    this.value = i;
                }

                static {
                    f17110e = new ny();
                }
            }

            public static final class zzb extends com.google.android.gms.internal.ads.zzbdd.zza<zzh, zzb> implements zzben {
                private zzb() {
                    super(zzh.zzeig);
                }
            }

            private zzh() {
            }

            /* renamed from: a */
            protected final Object mo4959a(int i, Object obj, Object obj2) {
                obj2 = null;
                switch (nr.f8306a[i - 1]) {
                    case 1:
                        return new zzh();
                    case 2:
                        return new zzb();
                    case 3:
                        i = new Object[]{"zzamm", "zzehy", "zzefn", "zzehz", "zzeia", "zzeib", "zzeic", "zzeid", "zzeie", zza.m21628b(), "zzeif"};
                        return zzbdd.m28347a((zzbel) zzeig, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001Ԅ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0004\u0004\u0006\u0016\u0007\b\u0005\b\f\u0006\t\u001a", (Object[]) i);
                    case 4:
                        return zzeig;
                    case 5:
                        i = zzaky;
                        if (i == 0) {
                            synchronized (zzh.class) {
                                i = zzaky;
                                if (i == 0) {
                                    i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzeig);
                                    zzaky = i;
                                }
                            }
                        }
                        return i;
                    case 6:
                        return Byte.valueOf(this.zzefk);
                    case 7:
                        if (obj != null) {
                            obj2 = true;
                        }
                        this.zzefk = (byte) obj2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzbdd.m28349a(zzh.class, zzeig);
            }
        }

        public static final class zzi extends zzbdd<zzi, zza> implements zzben {
            private static volatile zzbew<zzi> zzaky;
            private static final zzi zzeip = new zzi();
            private int zzamm;
            private String zzeim = "";
            private long zzein;
            private boolean zzeio;

            public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzi, zza> implements zzben {
                private zza() {
                    super(zzi.zzeip);
                }
            }

            private zzi() {
            }

            /* renamed from: a */
            protected final Object mo4959a(int i, Object obj, Object obj2) {
                switch (nr.f8306a[i - 1]) {
                    case 1:
                        return new zzi();
                    case 2:
                        return new zza();
                    case 3:
                        i = new Object[]{"zzamm", "zzeim", "zzein", "zzeio"};
                        return zzbdd.m28347a((zzbel) zzeip, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002", (Object[]) i);
                    case 4:
                        return zzeip;
                    case 5:
                        i = zzaky;
                        if (i == 0) {
                            synchronized (zzi.class) {
                                i = zzaky;
                                if (i == 0) {
                                    i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzeip);
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
                zzbdd.m28349a(zzi.class, zzeip);
            }
        }

        private zzb() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            obj2 = null;
            switch (nr.f8306a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzefn", "zzefy", "zzefz", "zzegb", zzh.class, "zzege", "zzegf", "zzegg", "zzegh", "zzegi", "zzamn", zzg.m21625b(), "zzefx", zzc.m21619b(), "zzega", "zzegc", "zzegd", "zzefg", "zzegj", "zzegk", "zzegl"};
                    return zzbdd.m28347a((zzbel) zzegm, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001\b\u0002\u0002\b\u0003\u0003\b\u0004\u0004Л\u0005\u0007\b\u0006\u001a\u0007\b\t\b\u0007\n\t\u0007\u000b\n\f\u0000\u000b\f\u0001\f\t\u0005\r\b\u0006\u000e\t\u0007\u000f\n\f\u0011\t\r\u0014\u001a\u0015\u001a", (Object[]) i);
                case 4:
                    return zzegm;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzb.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzegm);
                                zzaky = i;
                            }
                        }
                    }
                    return i;
                case 6:
                    return Byte.valueOf(this.zzefk);
                case 7:
                    if (obj != null) {
                        obj2 = true;
                    }
                    this.zzefk = (byte) obj2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzbdd.m28349a(zzb.class, zzegm);
        }
    }
}
