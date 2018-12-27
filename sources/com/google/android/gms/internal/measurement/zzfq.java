package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzvm.zze;

public final class zzfq {

    public static final class zza extends zzvm<zza, zza> implements zzwv {
        private static final zza zzauq = new zza();
        private static volatile zzxd<zza> zznw;
        private String zzauo = "";
        private long zzaup;
        private int zznr;

        public static final class zza extends com.google.android.gms.internal.measurement.zzvm.zza<zza, zza> implements zzwv {
            private zza() {
                super(zza.zzauq);
            }
        }

        private zza() {
        }

        /* renamed from: a */
        protected final Object mo4960a(int i, Object obj, Object obj2) {
            switch (C2471z.f10132a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zznr", "zzauo", "zzaup"};
                    return zzvm.m28422a((zzwt) zzauq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", (Object[]) i);
                case 4:
                    return zzauq;
                case 5:
                    i = zznw;
                    if (i == 0) {
                        synchronized (zza.class) {
                            i = zznw;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.measurement.zzvm.zzb(zzauq);
                                zznw = i;
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
            zzvm.m28424a(zza.class, zzauq);
        }
    }

    public static final class zzb extends zzvm<zzb, zza> implements zzwv {
        private static final zzb zzaut = new zzb();
        private static volatile zzxd<zzb> zznw;
        private int zzaur = 1;
        private zzvs<zza> zzaus = zzvm.m28426g();
        private int zznr;

        public enum zzb implements zzvp {
            RADS(1),
            PROVISIONING(2);
            
            /* renamed from: c */
            private static final zzvq<zzb> f17546c = null;
            private final int value;

            /* renamed from: a */
            public final int mo3152a() {
                return this.value;
            }

            /* renamed from: a */
            public static zzb m22538a(int i) {
                switch (i) {
                    case 1:
                        return RADS;
                    case 2:
                        return PROVISIONING;
                    default:
                        return 0;
                }
            }

            /* renamed from: b */
            public static zzvr m22539b() {
                return ab.f17413a;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                f17546c = new aa();
            }
        }

        public static final class zza extends com.google.android.gms.internal.measurement.zzvm.zza<zzb, zza> implements zzwv {
            private zza() {
                super(zzb.zzaut);
            }
        }

        private zzb() {
        }

        /* renamed from: a */
        protected final Object mo4960a(int i, Object obj, Object obj2) {
            switch (C2471z.f10132a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    i = new Object[]{"zznr", "zzaur", zzb.m22539b(), "zzaus", zza.class};
                    return zzvm.m28422a((zzwt) zzaut, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", (Object[]) i);
                case 4:
                    return zzaut;
                case 5:
                    i = zznw;
                    if (i == 0) {
                        synchronized (zzb.class) {
                            i = zznw;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.measurement.zzvm.zzb(zzaut);
                                zznw = i;
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
        public static zzxd<zzb> m29368a() {
            return (zzxd) zzaut.mo4960a(zze.f10273g, null, null);
        }

        static {
            zzvm.m28424a(zzb.class, zzaut);
        }
    }
}
