package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzha {
    /* renamed from: a */
    public static void m10661a(String[] strArr, int i, int i2, PriorityQueue<zzhb> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            m10660a(i, m10662b(strArr2, 0, strArr2.length), m10659a(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long b = m10662b(strArr2, 0, i3);
        m10660a(i, b, m10659a(strArr2, 0, i3), i2, priorityQueue);
        long a = m10658a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            b += 1073807359;
            b = (((((b - ((((((long) zzgx.m10653a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) zzgx.m10653a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            m10660a(i, b, m10659a(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    private static void m10660a(int r2, long r3, java.lang.String r5, int r6, java.util.PriorityQueue<com.google.android.gms.internal.ads.zzhb> r7) {
        /*
        r0 = new com.google.android.gms.internal.ads.zzhb;
        r0.<init>(r3, r5, r6);
        r3 = r7.size();
        if (r3 != r2) goto L_0x0026;
    L_0x000b:
        r3 = r7.peek();
        r3 = (com.google.android.gms.internal.ads.zzhb) r3;
        r3 = r3.f9521c;
        r4 = r0.f9521c;
        if (r3 > r4) goto L_0x0025;
    L_0x0017:
        r3 = r7.peek();
        r3 = (com.google.android.gms.internal.ads.zzhb) r3;
        r3 = r3.f9519a;
        r5 = r0.f9519a;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 <= 0) goto L_0x0026;
    L_0x0025:
        return;
    L_0x0026:
        r3 = r7.contains(r0);
        if (r3 == 0) goto L_0x002d;
    L_0x002c:
        return;
    L_0x002d:
        r7.add(r0);
        r3 = r7.size();
        if (r3 <= r2) goto L_0x0039;
    L_0x0036:
        r7.poll();
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzha.a(int, long, java.lang.String, int, java.util.PriorityQueue):void");
    }

    @VisibleForTesting
    /* renamed from: a */
    private static String m10659a(String[] strArr, int i, int i2) {
        i2 += i;
        if (strArr.length < i2) {
            zzaok.m10003c("Unable to construct shingle");
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            int i3 = i2 - 1;
            if (i < i3) {
                stringBuilder.append(strArr[i]);
                stringBuilder.append(' ');
                i++;
            } else {
                stringBuilder.append(strArr[i3]);
                return stringBuilder.toString();
            }
        }
    }

    /* renamed from: b */
    private static long m10662b(String[] strArr, int i, int i2) {
        long a = (((long) zzgx.m10653a(strArr[0])) + 2147483647L) % 1073807359;
        for (i = 1; i < i2; i++) {
            a = (((a * 16785407) % 1073807359) + ((((long) zzgx.m10653a(strArr[i])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }

    @VisibleForTesting
    /* renamed from: a */
    private static long m10658a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        if (i % 2 == 0) {
            return m10658a((j * j) % 1073807359, i / 2) % 1073807359;
        }
        return (j * (m10658a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }
}
