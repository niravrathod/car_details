package com.google.android.gms.internal.ads;

public enum zzbgj {
    DOUBLE(zzbgo.DOUBLE, 1),
    FLOAT(zzbgo.FLOAT, 5),
    INT64(zzbgo.LONG, 0),
    UINT64(zzbgo.LONG, 0),
    INT32(zzbgo.INT, 0),
    FIXED64(zzbgo.LONG, 1),
    FIXED32(zzbgo.INT, 5),
    BOOL(zzbgo.BOOLEAN, 0),
    STRING(zzbgo.STRING, 2),
    GROUP(zzbgo.MESSAGE, 3),
    MESSAGE(zzbgo.MESSAGE, 2),
    BYTES(zzbgo.BYTE_STRING, 2),
    UINT32(zzbgo.INT, 0),
    ENUM(zzbgo.ENUM, 0),
    SFIXED32(zzbgo.INT, 5),
    SFIXED64(zzbgo.LONG, 1),
    SINT32(zzbgo.INT, 0),
    SINT64(zzbgo.LONG, 0);
    
    private final zzbgo zzedp;
    private final int zzedq;

    private zzbgj(zzbgo zzbgo, int i) {
        this.zzedp = zzbgo;
        this.zzedq = i;
    }

    /* renamed from: a */
    public final zzbgo m10383a() {
        return this.zzedp;
    }

    /* renamed from: b */
    public final int m10384b() {
        return this.zzedq;
    }
}
