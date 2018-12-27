package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.C2933c;
import okio.ByteString;

/* renamed from: okhttp3.internal.http2.c */
public final class C2954c {
    /* renamed from: a */
    static final ByteString f12464a = ByteString.m14641a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    /* renamed from: b */
    static final String[] f12465b = new String[64];
    /* renamed from: c */
    static final String[] f12466c = new String[256];
    /* renamed from: d */
    private static final String[] f12467d = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    static {
        int i = 0;
        for (int i2 = 0; i2 < f12466c.length; i2++) {
            f12466c[i2] = C2933c.m14186a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
        }
        f12465b[0] = "";
        f12465b[1] = "END_STREAM";
        int[] iArr = new int[]{1};
        f12465b[8] = "PADDED";
        for (int i3 : iArr) {
            String[] strArr = f12465b;
            int i4 = i3 | 8;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f12465b[i3]);
            stringBuilder.append("|PADDED");
            strArr[i4] = stringBuilder.toString();
        }
        f12465b[4] = "END_HEADERS";
        f12465b[32] = "PRIORITY";
        f12465b[36] = "END_HEADERS|PRIORITY";
        for (int i32 : new int[]{4, 32, 36}) {
            for (int i5 : iArr) {
                String[] strArr2 = f12465b;
                int i6 = i5 | i32;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f12465b[i5]);
                stringBuilder2.append('|');
                stringBuilder2.append(f12465b[i32]);
                strArr2[i6] = stringBuilder2.toString();
                strArr2 = f12465b;
                i6 |= 8;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f12465b[i5]);
                stringBuilder2.append('|');
                stringBuilder2.append(f12465b[i32]);
                stringBuilder2.append("|PADDED");
                strArr2[i6] = stringBuilder2.toString();
            }
        }
        while (i < f12465b.length) {
            if (f12465b[i] == null) {
                f12465b[i] = f12466c[i];
            }
            i++;
        }
    }

    private C2954c() {
    }

    /* renamed from: a */
    static IllegalArgumentException m14326a(String str, Object... objArr) {
        throw new IllegalArgumentException(C2933c.m14186a(str, objArr));
    }

    /* renamed from: b */
    static IOException m14329b(String str, Object... objArr) {
        throw new IOException(C2933c.m14186a(str, objArr));
    }

    /* renamed from: a */
    static String m14328a(boolean z, int i, int i2, byte b, byte b2) {
        String a = b < f12467d.length ? f12467d[b] : C2933c.m14186a("0x%02x", Byte.valueOf(b));
        b = C2954c.m14327a(b, b2);
        String str = "%s 0x%08x %5d %-13s %s";
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[true] = Integer.valueOf(i2);
        objArr[true] = a;
        objArr[true] = b;
        return C2933c.m14186a(str, objArr);
    }

    /* renamed from: a */
    static String m14327a(byte b, byte b2) {
        if (b2 == (byte) 0) {
            return "";
        }
        switch (b) {
            case (byte) 2:
            case (byte) 3:
            case (byte) 7:
            case (byte) 8:
                return f12466c[b2];
            case (byte) 4:
            case (byte) 6:
                return b2 == (byte) 1 ? "ACK" : f12466c[b2];
            default:
                String str;
                if (b2 < f12465b.length) {
                    str = f12465b[b2];
                } else {
                    str = f12466c[b2];
                }
                if (b != (byte) 5 || (b2 & 4) == 0) {
                    return (b != (byte) 0 || (b2 & 32) == (byte) 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                } else {
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
        }
    }
}
