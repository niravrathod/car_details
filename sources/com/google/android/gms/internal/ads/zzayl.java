package com.google.android.gms.internal.ads;

public enum zzayl implements zzbdg {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    
    /* renamed from: f */
    private static final zzbdh<zzayl> f17017f = null;
    private final int value;

    /* renamed from: a */
    public final int mo2419a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public static zzayl m21480a(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        switch (i) {
            case 2:
                return NIST_P256;
            case 3:
                return NIST_P384;
            case 4:
                return NIST_P521;
            default:
                return 0;
        }
    }

    private zzayl(int i) {
        this.value = i;
    }

    static {
        f17017f = new jb();
    }
}
