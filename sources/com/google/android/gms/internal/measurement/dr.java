package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

final class dr {
    /* renamed from: a */
    private static final dt f10125a;

    /* renamed from: a */
    public static boolean m11791a(byte[] bArr) {
        return f10125a.m11818a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    private static int m11793b(int i) {
        return i > -12 ? -1 : i;
    }

    /* renamed from: b */
    private static int m11794b(int i, int i2) {
        if (i <= -12) {
            if (i2 <= -65) {
                return i ^ (i2 << 8);
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static int m11795b(int i, int i2, int i3) {
        if (i <= -12 && i2 <= -65) {
            if (i3 <= -65) {
                return (i ^ (i2 << 8)) ^ (i3 << 16);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m11792a(byte[] bArr, int i, int i2) {
        return f10125a.m11818a(bArr, i, i2);
    }

    /* renamed from: d */
    private static int m11798d(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m11793b(i3);
            case 1:
                return m11794b(i3, bArr[i]);
            case 2:
                return m11795b(i3, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    static int m11788a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < '') {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 'ࠀ') {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 'ࠀ') {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if ('?' <= charAt2 && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzyn(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
                if (i3 >= length) {
                    return i3;
                }
                long j = ((long) i3) + 4294967296L;
                StringBuilder stringBuilder = new StringBuilder(54);
                stringBuilder.append("UTF-8 length does not fit in int: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j2 = ((long) i3) + 4294967296L;
        StringBuilder stringBuilder2 = new StringBuilder(54);
        stringBuilder2.append("UTF-8 length does not fit in int: ");
        stringBuilder2.append(j2);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    /* renamed from: a */
    static int m11789a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f10125a.mo3109a(charSequence, bArr, i, i2);
    }

    /* renamed from: b */
    static String m11796b(byte[] bArr, int i, int i2) {
        return f10125a.mo3111b(bArr, i, i2);
    }

    /* renamed from: a */
    static void m11790a(CharSequence charSequence, ByteBuffer byteBuffer) {
        dt dtVar = f10125a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m11789a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            dtVar.mo3110a(charSequence, byteBuffer);
        } else {
            dt.m11814b(charSequence, byteBuffer);
        }
    }

    static {
        dt duVar;
        Object obj = (dp.m11755a() && dp.m11760b()) ? 1 : null;
        if (obj == null || as.m11494a()) {
            duVar = new du();
        } else {
            duVar = new dv();
        }
        f10125a = duVar;
    }
}
