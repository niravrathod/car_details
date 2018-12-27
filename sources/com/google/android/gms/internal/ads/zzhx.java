package com.google.android.gms.internal.ads;

public final class zzhx {

    public static final class zza extends zzbdd<zza, zza> implements zzben {
        private static final zza zzakx = new zza();
        private static volatile zzbew<zza> zzaky;

        public enum zzb implements zzbdg {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
            REQUEST_DID_UPDATE_GMS_SIGNALS(1001),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(1002),
            REQUEST_FAILED_TO_BUILD_URL(1003),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005),
            REQUEST_FAILED_TO_UPDATE_SIGNALS(1006),
            BANNER_SIZE_INVALID(10000),
            BANNER_SIZE_VALID(10001),
            ANDROID_WEBVIEW_CRASH(10002);
            
            /* renamed from: E */
            private static final zzbdh<zzb> f17220E = null;
            private final int value;

            /* renamed from: a */
            public final int mo2419a() {
                return this.value;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                f17220E = new qu();
            }
        }

        public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zza, zza> implements zzben {
            private zza() {
                super(zza.zzakx);
            }
        }

        private zza() {
        }

        /* renamed from: a */
        protected final Object mo4959a(int i, Object obj, Object obj2) {
            switch (qt.f8360a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zza();
                case 3:
                    return zzbdd.m28347a((zzbel) zzakx, "\u0001\u0000", null);
                case 4:
                    return zzakx;
                case 5:
                    i = zzaky;
                    if (i == 0) {
                        synchronized (zza.class) {
                            i = zzaky;
                            if (i == 0) {
                                i = new com.google.android.gms.internal.ads.zzbdd.zzb(zzakx);
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
            zzbdd.m28349a(zza.class, zzakx);
        }
    }
}
