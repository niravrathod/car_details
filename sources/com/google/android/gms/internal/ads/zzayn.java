package com.google.android.gms.internal.ads;

public enum zzayn implements zzbdg {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    /* renamed from: f */
    private static final zzbdh<zzayn> f17024f = null;
    private final int value;

    /* renamed from: a */
    public final int mo2419a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public static zzayn m21482a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_HASH;
            case 1:
                return SHA1;
            case 3:
                return SHA256;
            case 4:
                return SHA512;
            default:
                return 0;
        }
    }

    private zzayn(int i) {
        this.value = i;
    }

    static {
        f17024f = new jc();
    }
}
