package com.google.android.gms.internal.ads;

public enum zzazq implements zzbdg {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    /* renamed from: g */
    private static final zzbdh<zzazq> f17047g = null;
    private final int value;

    /* renamed from: a */
    public final int mo2419a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public static zzazq m21488a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PREFIX;
            case 1:
                return TINK;
            case 2:
                return LEGACY;
            case 3:
                return RAW;
            case 4:
                return CRUNCHY;
            default:
                return 0;
        }
    }

    private zzazq(int i) {
        this.value = i;
    }

    static {
        f17047g = new jr();
    }
}
