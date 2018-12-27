package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class jv {
    /* renamed from: a */
    private static long m8949a(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16)))) & 4294967295L;
    }

    /* renamed from: a */
    private static long m8950a(byte[] bArr, int i, int i2) {
        return (m8949a(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: a */
    private static void m8951a(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    /* renamed from: a */
    static byte[] m8952a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        Object obj = bArr2;
        if (bArr3.length == 32) {
            long a = m8950a(bArr3, 0, 0) & 67108863;
            int i = 2;
            int i2 = 3;
            long a2 = m8950a(bArr3, 3, 2) & 67108611;
            long a3 = m8950a(bArr3, 6, 4) & 67092735;
            long a4 = m8950a(bArr3, 9, 6) & 66076671;
            long a5 = m8950a(bArr3, 12, 8) & 1048575;
            long j = a2 * 5;
            long j2 = a3 * 5;
            long j3 = a4 * 5;
            long j4 = a5 * 5;
            byte[] bArr4 = new byte[17];
            long j5 = 0;
            long j6 = 0;
            long j7 = j6;
            long j8 = j7;
            long j9 = j8;
            int i3 = 0;
            while (i3 < obj.length) {
                int min = Math.min(16, obj.length - i3);
                System.arraycopy(obj, i3, bArr4, 0, min);
                bArr4[min] = (byte) 1;
                if (min != 16) {
                    Arrays.fill(bArr4, min + 1, 17, (byte) 0);
                }
                j9 += m8950a(bArr4, 0, 0);
                j5 += m8950a(bArr4, i2, i);
                j6 += m8950a(bArr4, 6, 4);
                j7 += m8950a(bArr4, 9, 6);
                j8 += m8950a(bArr4, 12, 8) | ((long) (bArr4[16] << 24));
                long j10 = ((((j9 * a) + (j5 * j4)) + (j6 * j3)) + (j7 * j2)) + (j8 * j);
                long j11 = ((((j9 * a3) + (j5 * a2)) + (j6 * a)) + (j7 * j4)) + (j8 * j3);
                long j12 = (((((j9 * a2) + (j5 * a)) + (j6 * j4)) + (j7 * j3)) + (j8 * j2)) + (j10 >> 26);
                j11 += j12 >> 26;
                long j13 = (((((j9 * a4) + (j5 * a3)) + (j6 * a2)) + (j7 * a)) + (j8 * j4)) + (j11 >> 26);
                j9 = (((((j9 * a5) + (j5 * a4)) + (j6 * a3)) + (j7 * a2)) + (j8 * a)) + (j13 >> 26);
                j10 = (j10 & 67108863) + ((j9 >> 26) * 5);
                j5 = (j12 & 67108863) + (j10 >> 26);
                i3 += 16;
                j6 = j11 & 67108863;
                j7 = j13 & 67108863;
                j8 = j9 & 67108863;
                j9 = j10 & 67108863;
                i = 2;
                i2 = 3;
            }
            j6 += j5 >> 26;
            long j14 = j6 & 67108863;
            j7 += j6 >> 26;
            long j15 = j7 & 67108863;
            j8 += j7 >> 26;
            long j16 = j8 & 67108863;
            j9 += (j8 >> 26) * 5;
            a3 = j9 & 67108863;
            long j17 = (j5 & 67108863) + (j9 >> 26);
            long j18 = a3 + 5;
            a4 = j18 & 67108863;
            long j19 = (j18 >> 26) + j17;
            a5 = j14 + (j19 >> 26);
            j18 = j15 + (a5 >> 26);
            long j20 = j18 & 67108863;
            j = (j16 + (j18 >> 26)) - 67108864;
            j18 = j >> 63;
            a3 &= j18;
            j17 &= j18;
            j14 &= j18;
            j15 &= j18;
            j16 &= j18;
            j18 ^= -1;
            j19 = ((j19 & 67108863) & j18) | j17;
            j17 = ((a5 & 67108863) & j18) | j14;
            j14 = (j20 & j18) | j15;
            j15 = (j & j18) | j16;
            j16 = j19 << 26;
            j19 = ((j19 >> 6) | (j17 << 20)) & 4294967295L;
            j17 = ((j17 >> 12) | (j14 << 14)) & 4294967295L;
            j14 = ((j14 >> 18) | (j15 << 8)) & 4294967295L;
            j16 = ((j16 | (a3 | (a4 & j18))) & 4294967295L) + m8949a(bArr3, 16);
            j15 = j16 & 4294967295L;
            j19 = (j19 + m8949a(bArr3, 20)) + (j16 >> 32);
            j16 = j19 & 4294967295L;
            j17 = (j17 + m8949a(bArr3, 24)) + (j19 >> 32);
            j19 = j17 & 4294967295L;
            long a6 = ((j14 + m8949a(bArr3, 28)) + (j17 >> 32)) & 4294967295L;
            byte[] bArr5 = new byte[16];
            m8951a(bArr5, j15, 0);
            m8951a(bArr5, j16, 4);
            m8951a(bArr5, j19, 8);
            m8951a(bArr5, a6, 12);
            return bArr5;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
