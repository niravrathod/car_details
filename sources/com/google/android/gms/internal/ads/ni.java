package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class ni {
    /* renamed from: a */
    private static final nk f8299a;

    /* renamed from: a */
    public static boolean m9270a(byte[] bArr) {
        return f8299a.m9297a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    private static int m9272b(int i) {
        return i > -12 ? -1 : i;
    }

    /* renamed from: b */
    private static int m9273b(int i, int i2) {
        if (i <= -12) {
            if (i2 <= -65) {
                return i ^ (i2 << 8);
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static int m9274b(int i, int i2, int i3) {
        if (i <= -12 && i2 <= -65) {
            if (i3 <= -65) {
                return (i ^ (i2 << 8)) ^ (i3 << 16);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m9271a(byte[] bArr, int i, int i2) {
        return f8299a.m9297a(bArr, i, i2);
    }

    /* renamed from: d */
    private static int m9277d(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m9272b(i3);
            case 1:
                return m9273b(i3, bArr[i]);
            case 2:
                return m9274b(i3, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    static int m9267a(CharSequence charSequence) {
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
                                throw new zzbgg(i2, length2);
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
    static int m9268a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f8299a.mo2155a(charSequence, bArr, i, i2);
    }

    /* renamed from: b */
    static String m9275b(byte[] bArr, int i, int i2) {
        return f8299a.mo2157b(bArr, i, i2);
    }

    /* renamed from: a */
    static void m9269a(CharSequence charSequence, ByteBuffer byteBuffer) {
        nk nkVar = f8299a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m9268a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            nkVar.mo2156a(charSequence, byteBuffer);
        } else {
            nk.m9293b(charSequence, byteBuffer);
        }
    }

    static {
        nk nlVar;
        Object obj = (ng.m9234a() && ng.m9239b()) ? 1 : null;
        if (obj == null || kg.m8958a()) {
            nlVar = new nl();
        } else {
            nlVar = new nm();
        }
        f8299a = nlVar;
    }
}
