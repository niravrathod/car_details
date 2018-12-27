package com.google.android.gms.internal.ads;

public enum zzayy implements zzbdg {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    /* renamed from: f */
    private static final zzbdh<zzayy> f17039f = null;
    private final int value;

    /* renamed from: a */
    public final int mo2419a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public static zzayy m21486a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return DESTROYED;
            default:
                return 0;
        }
    }

    private zzayy(int i) {
        this.value = i;
    }

    static {
        f17039f = new ji();
    }
}
