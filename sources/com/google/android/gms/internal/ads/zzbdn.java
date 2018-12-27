package com.google.android.gms.internal.ads;

public enum zzbdn {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzbbu.class, zzbbu.class, zzbbu.f9094a),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzdzd;
    private final Class<?> zzdze;
    private final Object zzdzf;

    private zzbdn(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzdzd = cls;
        this.zzdze = cls2;
        this.zzdzf = obj;
    }

    /* renamed from: a */
    public final Class<?> m10350a() {
        return this.zzdze;
    }
}
