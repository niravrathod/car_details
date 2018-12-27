package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

public enum zzvg {
    DOUBLE(0, zzvi.SCALAR, zzvv.DOUBLE),
    FLOAT(1, zzvi.SCALAR, zzvv.FLOAT),
    INT64(2, zzvi.SCALAR, zzvv.LONG),
    UINT64(3, zzvi.SCALAR, zzvv.LONG),
    INT32(4, zzvi.SCALAR, zzvv.INT),
    FIXED64(5, zzvi.SCALAR, zzvv.LONG),
    FIXED32(6, zzvi.SCALAR, zzvv.INT),
    BOOL(7, zzvi.SCALAR, zzvv.BOOLEAN),
    STRING(8, zzvi.SCALAR, zzvv.STRING),
    MESSAGE(9, zzvi.SCALAR, zzvv.MESSAGE),
    BYTES(10, zzvi.SCALAR, zzvv.BYTE_STRING),
    UINT32(11, zzvi.SCALAR, zzvv.INT),
    ENUM(12, zzvi.SCALAR, zzvv.ENUM),
    SFIXED32(13, zzvi.SCALAR, zzvv.INT),
    SFIXED64(14, zzvi.SCALAR, zzvv.LONG),
    SINT32(15, zzvi.SCALAR, zzvv.INT),
    SINT64(16, zzvi.SCALAR, zzvv.LONG),
    GROUP(17, zzvi.SCALAR, zzvv.MESSAGE),
    DOUBLE_LIST(18, zzvi.VECTOR, zzvv.DOUBLE),
    FLOAT_LIST(19, zzvi.VECTOR, zzvv.FLOAT),
    INT64_LIST(20, zzvi.VECTOR, zzvv.LONG),
    UINT64_LIST(21, zzvi.VECTOR, zzvv.LONG),
    INT32_LIST(22, zzvi.VECTOR, zzvv.INT),
    FIXED64_LIST(23, zzvi.VECTOR, zzvv.LONG),
    FIXED32_LIST(24, zzvi.VECTOR, zzvv.INT),
    BOOL_LIST(25, zzvi.VECTOR, zzvv.BOOLEAN),
    STRING_LIST(26, zzvi.VECTOR, zzvv.STRING),
    MESSAGE_LIST(27, zzvi.VECTOR, zzvv.MESSAGE),
    BYTES_LIST(28, zzvi.VECTOR, zzvv.BYTE_STRING),
    UINT32_LIST(29, zzvi.VECTOR, zzvv.INT),
    ENUM_LIST(30, zzvi.VECTOR, zzvv.ENUM),
    SFIXED32_LIST(31, zzvi.VECTOR, zzvv.INT),
    SFIXED64_LIST(32, zzvi.VECTOR, zzvv.LONG),
    SINT32_LIST(33, zzvi.VECTOR, zzvv.INT),
    SINT64_LIST(34, zzvi.VECTOR, zzvv.LONG),
    DOUBLE_LIST_PACKED(35, zzvi.PACKED_VECTOR, zzvv.DOUBLE),
    FLOAT_LIST_PACKED(36, zzvi.PACKED_VECTOR, zzvv.FLOAT),
    INT64_LIST_PACKED(37, zzvi.PACKED_VECTOR, zzvv.LONG),
    UINT64_LIST_PACKED(38, zzvi.PACKED_VECTOR, zzvv.LONG),
    INT32_LIST_PACKED(39, zzvi.PACKED_VECTOR, zzvv.INT),
    FIXED64_LIST_PACKED(40, zzvi.PACKED_VECTOR, zzvv.LONG),
    FIXED32_LIST_PACKED(41, zzvi.PACKED_VECTOR, zzvv.INT),
    BOOL_LIST_PACKED(42, zzvi.PACKED_VECTOR, zzvv.BOOLEAN),
    UINT32_LIST_PACKED(43, zzvi.PACKED_VECTOR, zzvv.INT),
    ENUM_LIST_PACKED(44, zzvi.PACKED_VECTOR, zzvv.ENUM),
    SFIXED32_LIST_PACKED(45, zzvi.PACKED_VECTOR, zzvv.INT),
    SFIXED64_LIST_PACKED(46, zzvi.PACKED_VECTOR, zzvv.LONG),
    SINT32_LIST_PACKED(47, zzvi.PACKED_VECTOR, zzvv.INT),
    SINT64_LIST_PACKED(48, zzvi.PACKED_VECTOR, zzvv.LONG),
    GROUP_LIST(49, zzvi.VECTOR, zzvv.MESSAGE),
    MAP(50, zzvi.MAP, zzvv.VOID);
    
    /* renamed from: Z */
    private static final zzvg[] f10235Z = null;
    private static final Type[] aa = null;
    private final int id;
    private final zzvv zzbxt;
    private final zzvi zzbxu;
    private final Class<?> zzbxv;
    private final boolean zzbxw;

    private zzvg(int i, zzvi zzvi, zzvv zzvv) {
        this.id = i;
        this.zzbxu = zzvi;
        this.zzbxt = zzvv;
        switch (bn.f10053a[zzvi.ordinal()]) {
            case 1:
                this.zzbxv = zzvv.m12090a();
                break;
            case 2:
                this.zzbxv = zzvv.m12090a();
                break;
            default:
                this.zzbxv = null;
                break;
        }
        r1 = null;
        if (zzvi == zzvi.SCALAR) {
            switch (bn.f10054b[zzvv.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    r1 = true;
                    break;
            }
        }
        this.zzbxw = r1;
    }

    /* renamed from: a */
    public final int m12064a() {
        return this.id;
    }

    static {
        aa = new Type[0];
        zzvg[] values = values();
        f10235Z = new zzvg[values.length];
        int length = values.length;
        int i;
        while (i < length) {
            zzvg zzvg = values[i];
            f10235Z[zzvg.id] = zzvg;
            i++;
        }
    }
}
