package com.google.android.exoplayer2.extractor.p129d;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.p129d.C2233h.C2232a;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.d.g */
final class C3985g extends C2233h {
    /* renamed from: a */
    private static final int f15945a = C2186s.m8062e("Opus");
    /* renamed from: b */
    private static final byte[] f15946b = new byte[]{(byte) 79, (byte) 112, (byte) 117, (byte) 115, (byte) 72, (byte) 101, (byte) 97, (byte) 100};
    /* renamed from: c */
    private boolean f15947c;

    C3985g() {
    }

    /* renamed from: a */
    public static boolean m19905a(C2175k c2175k) {
        if (c2175k.m7976b() < f15946b.length) {
            return false;
        }
        byte[] bArr = new byte[f15946b.length];
        c2175k.m7975a(bArr, 0, f15946b.length);
        return Arrays.equals(bArr, f15946b);
    }

    /* renamed from: a */
    protected void mo1600a(boolean z) {
        super.mo1600a(z);
        if (z) {
            this.f15947c = false;
        }
    }

    /* renamed from: b */
    protected long mo1602b(C2175k c2175k) {
        return m8222b(m19903a(c2175k.f6735a));
    }

    /* renamed from: a */
    protected boolean mo1601a(C2175k c2175k, long j, C2232a c2232a) {
        boolean z = true;
        if (this.f15947c == null) {
            c2175k = Arrays.copyOf(c2175k.f6735a, c2175k.m7978c());
            int i = c2175k[9] & 255;
            j = ((c2175k[11] & 255) << 8) | (c2175k[10] & 255);
            List arrayList = new ArrayList(3);
            arrayList.add(c2175k);
            m19904a(arrayList, j);
            m19904a(arrayList, 3840);
            c2232a.f7038a = Format.m7741a(null, "audio/opus", null, -1, -1, i, 48000, arrayList, null, 0, null);
            this.f15947c = true;
            return true;
        }
        if (c2175k.m7993n() != f15945a) {
            z = false;
        }
        c2175k.m7979c(0);
        return z;
    }

    /* renamed from: a */
    private void m19904a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    /* renamed from: a */
    private long m19903a(byte[] bArr) {
        int i = bArr[0] & 255;
        switch (i & 3) {
            case 0:
                bArr = 1;
                break;
            case 1:
            case 2:
                bArr = 2;
                break;
            default:
                bArr = bArr[1] & 63;
                break;
        }
        i >>= 3;
        int i2 = i & 3;
        i = i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2;
        return (long) (bArr * i);
    }
}
