package com.google.android.gms.internal.ads;

public enum zzaxx implements zzbdg {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    
    /* renamed from: f */
    private static final zzbdh<zzaxx> f17010f = null;
    private final int value;

    /* renamed from: a */
    public final int mo2419a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public static zzaxx m21478a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return UNCOMPRESSED;
            case 2:
                return COMPRESSED;
            case 3:
                return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
            default:
                return 0;
        }
    }

    private zzaxx(int i) {
        this.value = i;
    }

    static {
        f17010f = new iu();
    }
}
