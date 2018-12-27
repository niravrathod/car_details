package com.google.android.gms.internal.ads;

public enum zzil implements zzbdg {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    
    /* renamed from: d */
    private static final zzbdh<zzil> f17287d = null;
    private final int value;

    /* renamed from: a */
    public final int mo2419a() {
        return this.value;
    }

    /* renamed from: a */
    public static zzil m21739a(int i) {
        if (i == 1000) {
            return ENUM_UNKNOWN;
        }
        switch (i) {
            case 0:
                return ENUM_FALSE;
            case 1:
                return ENUM_TRUE;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static zzbdi m21740b() {
        return re.f16625a;
    }

    private zzil(int i) {
        this.value = i;
    }

    static {
        f17287d = new rd();
    }
}
