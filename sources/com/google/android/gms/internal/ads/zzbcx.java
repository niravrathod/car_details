package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

public enum zzbcx {
    DOUBLE(0, zzbcz.SCALAR, zzbdn.DOUBLE),
    FLOAT(1, zzbcz.SCALAR, zzbdn.FLOAT),
    INT64(2, zzbcz.SCALAR, zzbdn.LONG),
    UINT64(3, zzbcz.SCALAR, zzbdn.LONG),
    INT32(4, zzbcz.SCALAR, zzbdn.INT),
    FIXED64(5, zzbcz.SCALAR, zzbdn.LONG),
    FIXED32(6, zzbcz.SCALAR, zzbdn.INT),
    BOOL(7, zzbcz.SCALAR, zzbdn.BOOLEAN),
    STRING(8, zzbcz.SCALAR, zzbdn.STRING),
    MESSAGE(9, zzbcz.SCALAR, zzbdn.MESSAGE),
    BYTES(10, zzbcz.SCALAR, zzbdn.BYTE_STRING),
    UINT32(11, zzbcz.SCALAR, zzbdn.INT),
    ENUM(12, zzbcz.SCALAR, zzbdn.ENUM),
    SFIXED32(13, zzbcz.SCALAR, zzbdn.INT),
    SFIXED64(14, zzbcz.SCALAR, zzbdn.LONG),
    SINT32(15, zzbcz.SCALAR, zzbdn.INT),
    SINT64(16, zzbcz.SCALAR, zzbdn.LONG),
    GROUP(17, zzbcz.SCALAR, zzbdn.MESSAGE),
    DOUBLE_LIST(18, zzbcz.VECTOR, zzbdn.DOUBLE),
    FLOAT_LIST(19, zzbcz.VECTOR, zzbdn.FLOAT),
    INT64_LIST(20, zzbcz.VECTOR, zzbdn.LONG),
    UINT64_LIST(21, zzbcz.VECTOR, zzbdn.LONG),
    INT32_LIST(22, zzbcz.VECTOR, zzbdn.INT),
    FIXED64_LIST(23, zzbcz.VECTOR, zzbdn.LONG),
    FIXED32_LIST(24, zzbcz.VECTOR, zzbdn.INT),
    BOOL_LIST(25, zzbcz.VECTOR, zzbdn.BOOLEAN),
    STRING_LIST(26, zzbcz.VECTOR, zzbdn.STRING),
    MESSAGE_LIST(27, zzbcz.VECTOR, zzbdn.MESSAGE),
    BYTES_LIST(28, zzbcz.VECTOR, zzbdn.BYTE_STRING),
    UINT32_LIST(29, zzbcz.VECTOR, zzbdn.INT),
    ENUM_LIST(30, zzbcz.VECTOR, zzbdn.ENUM),
    SFIXED32_LIST(31, zzbcz.VECTOR, zzbdn.INT),
    SFIXED64_LIST(32, zzbcz.VECTOR, zzbdn.LONG),
    SINT32_LIST(33, zzbcz.VECTOR, zzbdn.INT),
    SINT64_LIST(34, zzbcz.VECTOR, zzbdn.LONG),
    DOUBLE_LIST_PACKED(35, zzbcz.PACKED_VECTOR, zzbdn.DOUBLE),
    FLOAT_LIST_PACKED(36, zzbcz.PACKED_VECTOR, zzbdn.FLOAT),
    INT64_LIST_PACKED(37, zzbcz.PACKED_VECTOR, zzbdn.LONG),
    UINT64_LIST_PACKED(38, zzbcz.PACKED_VECTOR, zzbdn.LONG),
    INT32_LIST_PACKED(39, zzbcz.PACKED_VECTOR, zzbdn.INT),
    FIXED64_LIST_PACKED(40, zzbcz.PACKED_VECTOR, zzbdn.LONG),
    FIXED32_LIST_PACKED(41, zzbcz.PACKED_VECTOR, zzbdn.INT),
    BOOL_LIST_PACKED(42, zzbcz.PACKED_VECTOR, zzbdn.BOOLEAN),
    UINT32_LIST_PACKED(43, zzbcz.PACKED_VECTOR, zzbdn.INT),
    ENUM_LIST_PACKED(44, zzbcz.PACKED_VECTOR, zzbdn.ENUM),
    SFIXED32_LIST_PACKED(45, zzbcz.PACKED_VECTOR, zzbdn.INT),
    SFIXED64_LIST_PACKED(46, zzbcz.PACKED_VECTOR, zzbdn.LONG),
    SINT32_LIST_PACKED(47, zzbcz.PACKED_VECTOR, zzbdn.INT),
    SINT64_LIST_PACKED(48, zzbcz.PACKED_VECTOR, zzbdn.LONG),
    GROUP_LIST(49, zzbcz.VECTOR, zzbdn.MESSAGE),
    MAP(50, zzbcz.MAP, zzbdn.VOID);
    
    /* renamed from: Z */
    private static final zzbcx[] f9134Z = null;
    private static final Type[] aa = null;
    private final int id;
    private final zzbdn zzdwz;
    private final zzbcz zzdxa;
    private final Class<?> zzdxb;
    private final boolean zzdxc;

    private zzbcx(int i, zzbcz zzbcz, zzbdn zzbdn) {
        this.id = i;
        this.zzdxa = zzbcz;
        this.zzdwz = zzbdn;
        switch (ld.f8222a[zzbcz.ordinal()]) {
            case 1:
                this.zzdxb = zzbdn.m10350a();
                break;
            case 2:
                this.zzdxb = zzbdn.m10350a();
                break;
            default:
                this.zzdxb = null;
                break;
        }
        r1 = null;
        if (zzbcz == zzbcz.SCALAR) {
            switch (ld.f8223b[zzbdn.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    r1 = true;
                    break;
            }
        }
        this.zzdxc = r1;
    }

    /* renamed from: a */
    public final int m10323a() {
        return this.id;
    }

    static {
        aa = new Type[0];
        zzbcx[] values = values();
        f9134Z = new zzbcx[values.length];
        int length = values.length;
        int i;
        while (i < length) {
            zzbcx zzbcx = values[i];
            f9134Z[zzbcx.id] = zzbcx;
            i++;
        }
    }
}
