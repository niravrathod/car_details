package com.google.android.gms.internal.ads;

public final class zzif {

    public static final class zza extends zzbdd<zza, zzb> implements zzben {
        private static volatile zzbew<zza> zzaky;
        private static final zza zzamp = new zza();
        private int zzamm;
        private int zzamn;
        private zzl zzamo;

        public enum zza implements zzbdg {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);
            
            /* renamed from: l */
            private static final zzbdh<zza> f17260l = null;
            private final int value;

            /* renamed from: a */
            public final int mo2419a() {
                return this.value;
            }

            /* renamed from: a */
            public static zza m21724a(int i) {
                switch (i) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return 0;
                }
            }

            /* renamed from: b */
            public static zzbdi m21725b() {
                return ra.f16623a;
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                f17260l = new qz();
            }
        }

        public static final class zzb extends com.google.android.gms.internal.ads.zzbdd.zza<zza, zzb> implements zzben {
            private zzb() {
                super(zza.zzamp);
            }
        }

        private zza() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb();
                case 3:
                    i = new Object[]{"zzamm", "zzamn", zza.m21725b(), "zzamo"};
                    return zzbdd.m28347a((zzbel) zzamp, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", (Object[]) i);
                case 4:
                    return zzamp;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zza.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzamp);
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
        public static zzbew<zza> m29306a() {
            return (zzbew) zzamp.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zza.class, zzamp);
        }
    }

    public static final class zzb extends zzbdd<zzb, zza> implements zzben {
        private static volatile zzbew<zzb> zzaky;
        private static final zzb zzang = new zzb();
        private int zzamm;
        private String zzand = "";
        private zzbdk<zza> zzane = zzbdd.m28353n();
        private int zzanf;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzb, zza> implements zzben {
            private zza() {
                super(zzb.zzang);
            }
        }

        private zzb() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzand", "zzane", zza.class, "zzanf", zzil.m21740b()};
                    return zzbdd.m28347a((zzbel) zzang, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\f\u0001", (Object[]) i);
                case 4:
                    return zzang;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzb.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzang);
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
        public static zzbew<zzb> m29309a() {
            return (zzbew) zzang.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzb.class, zzang);
        }
    }

    public static final class zzc extends zzbdd<zzc, zza> implements zzben {
        private static volatile zzbew<zzc> zzaky;
        private static final zzc zzann = new zzc();
        private int zzamm;
        private int zzanh;
        private zzn zzani;
        private zzn zzanj;
        private zzn zzank;
        private zzbdk<zzn> zzanl = zzbdd.m28353n();
        private int zzanm;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzc, zza> implements zzben {
            private zza() {
                super(zzc.zzann);
            }
        }

        private zzc() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzanh", "zzani", "zzanj", "zzank", "zzanl", zzn.class, "zzanm"};
                    return zzbdd.m28347a((zzbel) zzann, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u001b\u0006\u0004\u0004", (Object[]) i);
                case 4:
                    return zzann;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzc.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzann);
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
        public static zzbew<zzc> m29312a() {
            return (zzbew) zzann.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzc.class, zzann);
        }
    }

    public static final class zzd extends zzbdd<zzd, zza> implements zzben {
        private static volatile zzbew<zzd> zzaky;
        private static final zzd zzans = new zzd();
        private int zzamm;
        private int zzano;
        private zzo zzanp;
        private String zzanq = "";
        private String zzanr = "";

        public enum zzb implements zzbdg {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);
            
            /* renamed from: d */
            private static final zzbdh<zzb> f17265d = null;
            private final int value;

            /* renamed from: a */
            public final int mo2419a() {
                return this.value;
            }

            /* renamed from: a */
            public static zzb m21727a(int i) {
                switch (i) {
                    case 0:
                        return PLATFORM_UNSPECIFIED;
                    case 1:
                        return IOS;
                    case 2:
                        return ANDROID;
                    default:
                        return 0;
                }
            }

            /* renamed from: b */
            public static zzbdi m21728b() {
                return rc.f16624a;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                f17265d = new rb();
            }
        }

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzd, zza> implements zzben {
            private zza() {
                super(zzd.zzans);
            }
        }

        private zzd() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzano", zzb.m21728b(), "zzanp", "zzanq", "zzanr"};
                    return zzbdd.m28347a((zzbel) zzans, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005\f\u0000\u0006\t\u0001\u0007\b\u0002\b\b\u0003", (Object[]) i);
                case 4:
                    return zzans;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzd.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzans);
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
            zzbdd.m28349a(zzd.class, zzans);
        }
    }

    public static final class zze extends zzbdd<zze, zza> implements zzben {
        private static volatile zzbew<zze> zzaky;
        private static final zze zzaof = new zze();
        private int zzamm;
        private String zzaob = "";
        private int zzaoc;
        private zzbdj zzaod = zzbdd.m28352m();
        private zzn zzaoe;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zze, zza> implements zzben {
            private zza() {
                super(zze.zzaof);
            }
        }

        private zze() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaob", "zzaoc", zzil.m21740b(), "zzaod", "zzaoe"};
                    return zzbdd.m28347a((zzbel) zzaof, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0016\u0004\t\u0002", (Object[]) i);
                case 4:
                    return zzaof;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zze.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaof);
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
            zzbdd.m28349a(zze.class, zzaof);
        }
    }

    public static final class zzf extends zzbdd<zzf, zza> implements zzben {
        private static volatile zzbew<zzf> zzaky;
        private static final zzf zzaoh = new zzf();
        private int zzamm;
        private zzbdj zzaod = zzbdd.m28352m();
        private int zzaog;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzf, zza> implements zzben {
            private zza() {
                super(zzf.zzaoh);
            }
        }

        private zzf() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaog", zzil.m21740b(), "zzaod"};
                    return zzbdd.m28347a((zzbel) zzaoh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u0016", (Object[]) i);
                case 4:
                    return zzaoh;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzf.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaoh);
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
        public static zzbew<zzf> m29319a() {
            return (zzbew) zzaoh.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzf.class, zzaoh);
        }
    }

    public static final class zzg extends zzbdd<zzg, zza> implements zzben {
        private static volatile zzbew<zzg> zzaky;
        private static final zzg zzaok = new zzg();
        private int zzamm;
        private zzn zzaoe;
        private int zzaog;
        private zze zzaoi;
        private zzbdk<zzm> zzaoj = zzbdd.m28353n();

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzg, zza> implements zzben {
            private zza() {
                super(zzg.zzaok);
            }
        }

        private zzg() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaoi", "zzaoj", zzm.class, "zzaog", zzil.m21740b(), "zzaoe"};
                    return zzbdd.m28347a((zzbel) zzaok, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001\u0004\t\u0002", (Object[]) i);
                case 4:
                    return zzaok;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzg.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaok);
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
        public static zzbew<zzg> m29322a() {
            return (zzbew) zzaok.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzg.class, zzaok);
        }
    }

    public static final class zzh extends zzbdd<zzh, zza> implements zzben {
        private static volatile zzbew<zzh> zzaky;
        private static final zzh zzaom = new zzh();
        private int zzamm;
        private int zzamn;
        private int zzaol;

        public enum zzb implements zzbdg {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);
            
            /* renamed from: e */
            private static final zzbdh<zzb> f17271e = null;
            private final int value;

            /* renamed from: a */
            public final int mo2419a() {
                return this.value;
            }

            /* renamed from: a */
            public static zzb m21730a(int i) {
                if (i == 4) {
                    return LTE;
                }
                switch (i) {
                    case 0:
                        return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    case 1:
                        return TWO_G;
                    case 2:
                        return THREE_G;
                    default:
                        return 0;
                }
            }

            /* renamed from: b */
            public static zzbdi m21731b() {
                return rg.f16626a;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                f17271e = new rf();
            }
        }

        public enum zzc implements zzbdg {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);
            
            /* renamed from: d */
            private static final zzbdh<zzc> f17276d = null;
            private final int value;

            /* renamed from: a */
            public final int mo2419a() {
                return this.value;
            }

            /* renamed from: a */
            public static zzc m21733a(int i) {
                switch (i) {
                    case 0:
                        return NETWORKTYPE_UNSPECIFIED;
                    case 1:
                        return CELL;
                    case 2:
                        return WIFI;
                    default:
                        return 0;
                }
            }

            /* renamed from: b */
            public static zzbdi m21734b() {
                return ri.f16627a;
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                f17276d = new rh();
            }
        }

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzh, zza> implements zzben {
            private zza() {
                super(zzh.zzaom);
            }
        }

        private zzh() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzamn", zzc.m21734b(), "zzaol", zzb.m21731b()};
                    return zzbdd.m28347a((zzbel) zzaom, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", (Object[]) i);
                case 4:
                    return zzaom;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzh.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaom);
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
        public static zzbew<zzh> m29325a() {
            return (zzbew) zzaom.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzh.class, zzaom);
        }
    }

    public static final class zzi extends zzbdd<zzi, zza> implements zzben {
        private static volatile zzbew<zzi> zzaky;
        private static final zzi zzaoy = new zzi();
        private int zzamm;
        private int zzaow;
        private zzn zzaox;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzi, zza> implements zzben {
            private zza() {
                super(zzi.zzaoy);
            }
        }

        private zzi() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaow", zzil.m21740b(), "zzaox"};
                    return zzbdd.m28347a((zzbel) zzaoy, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", (Object[]) i);
                case 4:
                    return zzaoy;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzi.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaoy);
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
        public static zzbew<zzi> m29328a() {
            return (zzbew) zzaoy.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzi.class, zzaoy);
        }
    }

    public static final class zzj extends zzbdd<zzj, zza> implements zzben {
        private static volatile zzbew<zzj> zzaky;
        private static final zzj zzapk = new zzj();
        private int zzamm;
        private int zzaoz = 1000;
        private int zzapa = 1000;
        private int zzapb;
        private int zzapc;
        private int zzapd;
        private int zzape;
        private int zzapf;
        private int zzapg;
        private int zzaph;
        private int zzapi;
        private zzk zzapj;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzj, zza> implements zzben {
            private zza() {
                super(zzj.zzapk);
            }
        }

        private zzj() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaoz", zzil.m21740b(), "zzapa", zzil.m21740b(), "zzapb", "zzapc", "zzapd", "zzape", "zzapf", "zzapg", "zzaph", "zzapi", "zzapj"};
                    return zzbdd.m28347a((zzbel) zzapk, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\t\n", (Object[]) i);
                case 4:
                    return zzapk;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzj.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzapk);
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
        public static zzbew<zzj> m29331a() {
            return (zzbew) zzapk.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzj.class, zzapk);
        }
    }

    public static final class zzk extends zzbdd<zzk, zza> implements zzben {
        private static volatile zzbew<zzk> zzaky;
        private static final zzk zzapn = new zzk();
        private int zzamm;
        private int zzapl;
        private int zzapm;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzk, zza> implements zzben {
            private zza() {
                super(zzk.zzapn);
            }
        }

        private zzk() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzapl", "zzapm"};
                    return zzbdd.m28347a((zzbel) zzapn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", (Object[]) i);
                case 4:
                    return zzapn;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzk.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzapn);
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
            zzbdd.m28349a(zzk.class, zzapn);
        }
    }

    public static final class zzl extends zzbdd<zzl, zza> implements zzben {
        private static volatile zzbew<zzl> zzaky;
        private static final zzl zzapq = new zzl();
        private int zzamm;
        private int zzapo;
        private int zzapp;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzl, zza> implements zzben {
            private zza() {
                super(zzl.zzapq);
            }
        }

        private zzl() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzapo", "zzapp"};
                    return zzbdd.m28347a((zzbel) zzapq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", (Object[]) i);
                case 4:
                    return zzapq;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzl.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzapq);
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
            zzbdd.m28349a(zzl.class, zzapq);
        }
    }

    public static final class zzm extends zzbdd<zzm, zza> implements zzben {
        private static volatile zzbew<zzm> zzaky;
        private static final zzm zzapr = new zzm();
        private int zzamm;
        private String zzaob = "";
        private int zzaoc;
        private zzn zzaoe;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzm, zza> implements zzben {
            private zza() {
                super(zzm.zzapr);
            }
        }

        private zzm() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaob", "zzaoc", zzil.m21740b(), "zzaoe"};
                    return zzbdd.m28347a((zzbel) zzapr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\t\u0002", (Object[]) i);
                case 4:
                    return zzapr;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzm.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzapr);
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
            zzbdd.m28349a(zzm.class, zzapr);
        }
    }

    public static final class zzn extends zzbdd<zzn, zza> implements zzben {
        private static volatile zzbew<zzn> zzaky;
        private static final zzn zzapu = new zzn();
        private int zzamm;
        private int zzaps;
        private int zzapt;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzn, zza> implements zzben {
            private zza() {
                super(zzn.zzapu);
            }
        }

        private zzn() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaps", "zzapt"};
                    return zzbdd.m28347a((zzbel) zzapu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", (Object[]) i);
                case 4:
                    return zzapu;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzn.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzapu);
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
        public static zzbew<zzn> m29340a() {
            return (zzbew) zzapu.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzn.class, zzapu);
        }
    }

    public static final class zzo extends zzbdd<zzo, zza> implements zzben {
        private static volatile zzbew<zzo> zzaky;
        private static final zzo zzapy = new zzo();
        private int zzamm;
        private int zzapv;
        private int zzapw;
        private int zzapx;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzo, zza> implements zzben {
            private zza() {
                super(zzo.zzapy);
            }
        }

        private zzo() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzapv", "zzapw", "zzapx"};
                    return zzbdd.m28347a((zzbel) zzapy, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002", (Object[]) i);
                case 4:
                    return zzapy;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzo.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzapy);
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
            zzbdd.m28349a(zzo.class, zzapy);
        }
    }

    public static final class zzp extends zzbdd<zzp, zza> implements zzben {
        private static volatile zzbew<zzp> zzaky;
        private static final zzp zzaqb = new zzp();
        private int zzamm;
        private int zzaog = 1000;
        private zzq zzapz;
        private zzn zzaqa;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzp, zza> implements zzben {
            private zza() {
                super(zzp.zzaqb);
            }
        }

        private zzp() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaog", zzil.m21740b(), "zzapz", "zzaqa"};
                    return zzbdd.m28347a((zzbel) zzaqb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", (Object[]) i);
                case 4:
                    return zzaqb;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzp.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaqb);
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
        public static zzbew<zzp> m29345a() {
            return (zzbew) zzaqb.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzp.class, zzaqb);
        }
    }

    public static final class zzq extends zzbdd<zzq, zza> implements zzben {
        private static volatile zzbew<zzq> zzaky;
        private static final zzq zzaqd = new zzq();
        private int zzamm;
        private int zzaqc;

        public enum zzb implements zzbdg {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);
            
            /* renamed from: e */
            private static final zzbdh<zzb> f17282e = null;
            private final int value;

            /* renamed from: a */
            public final int mo2419a() {
                return this.value;
            }

            /* renamed from: a */
            public static zzb m21736a(int i) {
                switch (i) {
                    case 0:
                        return VIDEO_ERROR_CODE_UNSPECIFIED;
                    case 1:
                        return OPENGL_RENDERING_FAILED;
                    case 2:
                        return CACHE_LOAD_FAILED;
                    case 3:
                        return ANDROID_TARGET_API_TOO_LOW;
                    default:
                        return 0;
                }
            }

            /* renamed from: b */
            public static zzbdi m21737b() {
                return rk.f16628a;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                f17282e = new rj();
            }
        }

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzq, zza> implements zzben {
            private zza() {
                super(zzq.zzaqd);
            }
        }

        private zzq() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzq();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaqc", zzb.m21737b()};
                    return zzbdd.m28347a((zzbel) zzaqd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", (Object[]) i);
                case 4:
                    return zzaqd;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzq.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaqd);
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
        public static zzbew<zzq> m29348a() {
            return (zzbew) zzaqd.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzq.class, zzaqd);
        }
    }

    public static final class zzr extends zzbdd<zzr, zza> implements zzben {
        private static volatile zzbew<zzr> zzaky;
        private static final zzr zzaqm = new zzr();
        private int zzamm;
        private int zzaog = 1000;
        private zzq zzapz;
        private int zzaqj;
        private int zzaqk;
        private int zzaql;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzr, zza> implements zzben {
            private zza() {
                super(zzr.zzaqm);
            }
        }

        private zzr() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzr();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaog", zzil.m21740b(), "zzapz", "zzaqj", "zzaqk", "zzaql"};
                    return zzbdd.m28347a((zzbel) zzaqm, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004", (Object[]) i);
                case 4:
                    return zzaqm;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzr.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaqm);
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
        public static zzbew<zzr> m29351a() {
            return (zzbew) zzaqm.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzr.class, zzaqm);
        }
    }

    public static final class zzs extends zzbdd<zzs, zza> implements zzben {
        private static volatile zzbew<zzs> zzaky;
        private static final zzs zzaqn = new zzs();
        private int zzamm;
        private int zzaog = 1000;
        private zzq zzapz;
        private zzn zzaqa;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzs, zza> implements zzben {
            private zza() {
                super(zzs.zzaqn);
            }
        }

        private zzs() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzs();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaog", zzil.m21740b(), "zzapz", "zzaqa"};
                    return zzbdd.m28347a((zzbel) zzaqn, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", (Object[]) i);
                case 4:
                    return zzaqn;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzs.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaqn);
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
        public static zzbew<zzs> m29354a() {
            return (zzbew) zzaqn.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzs.class, zzaqn);
        }
    }

    public static final class zzt extends zzbdd<zzt, zza> implements zzben {
        private static volatile zzbew<zzt> zzaky;
        private static final zzt zzaqp = new zzt();
        private int zzamm;
        private int zzaog = 1000;
        private zzq zzapz;
        private int zzaqj;
        private int zzaqk;
        private int zzaql;
        private long zzaqo;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzt, zza> implements zzben {
            private zza() {
                super(zzt.zzaqp);
            }
        }

        private zzt() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzt();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaog", zzil.m21740b(), "zzapz", "zzaqj", "zzaqk", "zzaql", "zzaqo"};
                    return zzbdd.m28347a((zzbel) zzaqp, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0003\u0005", (Object[]) i);
                case 4:
                    return zzaqp;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzt.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaqp);
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
        public static zzbew<zzt> m29357a() {
            return (zzbew) zzaqp.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzt.class, zzaqp);
        }
    }

    public static final class zzu extends zzbdd<zzu, zza> implements zzben {
        private static volatile zzbew<zzu> zzaky;
        private static final zzu zzaqq = new zzu();
        private int zzamm;
        private int zzaog = 1000;
        private zzq zzapz;
        private zzn zzaqa;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzu, zza> implements zzben {
            private zza() {
                super(zzu.zzaqq);
            }
        }

        private zzu() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzu();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaog", zzil.m21740b(), "zzapz", "zzaqa"};
                    return zzbdd.m28347a((zzbel) zzaqq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", (Object[]) i);
                case 4:
                    return zzaqq;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzu.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaqq);
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
        public static zzbew<zzu> m29360a() {
            return (zzbew) zzaqq.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzu.class, zzaqq);
        }
    }

    public static final class zzv extends zzbdd<zzv, zza> implements zzben {
        private static volatile zzbew<zzv> zzaky;
        private static final zzv zzaqr = new zzv();
        private int zzamm;
        private int zzaog = 1000;
        private zzq zzapz;

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzv, zza> implements zzben {
            private zza() {
                super(zzv.zzaqr);
            }
        }

        private zzv() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qy.f8361a[i - 1]) {
                case 1:
                    return new zzv();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zzamm", "zzaog", zzil.m21740b(), "zzapz"};
                    return zzbdd.m28347a((zzbel) zzaqr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", (Object[]) i);
                case 4:
                    return zzaqr;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zzv.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzaqr);
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
        public static zzbew<zzv> m29363a() {
            return (zzbew) zzaqr.mo4959a(com.google.android.gms.internal.ads.zzbdd.zze.f9172g, null, null);
        }

        static {
            zzbdd.m28349a(zzv.class, zzaqr);
        }
    }
}
