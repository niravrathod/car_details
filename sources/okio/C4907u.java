package okio;

import java.nio.charset.Charset;

/* renamed from: okio.u */
final class C4907u {
    /* renamed from: a */
    public static final Charset f21956a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static int m30279a(int i) {
        return ((i & 255) << 24) | ((((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8)) | ((65280 & i) << 8));
    }

    /* renamed from: a */
    public static short m30280a(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: a */
    public static void m30281a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    /* renamed from: a */
    public static void m30282a(Throwable th) {
        C4907u.m30284b(th);
    }

    /* renamed from: b */
    private static <T extends Throwable> void m30284b(Throwable th) {
        throw th;
    }

    /* renamed from: a */
    public static boolean m30283a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return 1;
    }
}
