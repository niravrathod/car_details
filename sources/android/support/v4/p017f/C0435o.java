package android.support.v4.p017f;

import java.io.PrintWriter;

/* renamed from: android.support.v4.f.o */
public final class C0435o {
    /* renamed from: a */
    private static final Object f1456a = new Object();
    /* renamed from: b */
    private static char[] f1457b = new char[24];

    /* renamed from: a */
    private static int m1602a(int i, int i2, boolean z, int i3) {
        if (i <= 99) {
            if (!z || i3 < 3) {
                if (i <= 9) {
                    if (!z || i3 < 2) {
                        if (!z) {
                            if (i <= 0) {
                                return 0;
                            }
                        }
                        return i2 + 1;
                    }
                }
                return i2 + 2;
            }
        }
        return i2 + 3;
    }

    /* renamed from: a */
    private static int m1604a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        if (!z && i <= 0) {
            return i2;
        }
        int i4;
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= true) || i > true || i2 != i4) {
            i2 = i / 10;
            cArr[i4] = (char) (i2 + 48);
            i4++;
            i -= i2 * 10;
        }
        cArr[i4] = (char) (i + 48);
        i4++;
        cArr[i4] = c;
        return i4 + 1;
    }

    /* renamed from: a */
    private static int m1603a(long j, int i) {
        long j2 = j;
        int i2 = i;
        if (f1457b.length < i2) {
            f1457b = new char[i2];
        }
        char[] cArr = f1457b;
        int i3;
        if (j2 == 0) {
            i3 = i2 - 1;
            while (i3 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (j2 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i9 = (int) (j2 % 1000);
        i3 = (int) Math.floor((double) (j2 / 1000));
        if (i3 > 86400) {
            i4 = i3 / 86400;
            i3 -= 86400 * i4;
        } else {
            i4 = 0;
        }
        if (i3 > 3600) {
            i5 = i3 / 3600;
            i3 -= i5 * 3600;
        } else {
            i5 = 0;
        }
        if (i3 > 60) {
            i6 = i3 / 60;
            i7 = i3 - (i6 * 60);
            i3 = i6;
        } else {
            i7 = i3;
            i3 = 0;
        }
        if (i2 != 0) {
            i6 = C0435o.m1602a(i4, 1, false, 0);
            i6 += C0435o.m1602a(i5, 1, i6 > 0, 2);
            i6 += C0435o.m1602a(i3, 1, i6 > 0, 2);
            i6 += C0435o.m1602a(i7, 1, i6 > 0, 2);
            i8 = 0;
            for (i6 += C0435o.m1602a(i9, 2, true, i6 > 0 ? 3 : 0) + 1; i6 < i2; i6++) {
                cArr[i8] = ' ';
                i8++;
            }
        } else {
            i8 = 0;
        }
        cArr[i8] = c;
        int i10 = i8 + 1;
        Object obj = i2 != 0 ? 1 : null;
        int i11 = i10;
        i6 = C0435o.m1604a(cArr, i4, 'd', i10, false, 0);
        i6 = C0435o.m1604a(cArr, i5, 'h', i6, i6 != i11, obj != null ? 2 : 0);
        i6 = C0435o.m1604a(cArr, i3, 'm', i6, i6 != i11, obj != null ? 2 : 0);
        i6 = C0435o.m1604a(cArr, i7, 's', i6, i6 != i11, obj != null ? 2 : 0);
        i10 = (obj == null || i6 == i11) ? 0 : 3;
        i3 = C0435o.m1604a(cArr, i9, 'm', i6, true, i10);
        cArr[i3] = 's';
        return i3 + 1;
    }

    /* renamed from: a */
    public static void m1607a(long j, PrintWriter printWriter, int i) {
        synchronized (f1456a) {
            printWriter.print(new String(f1457b, 0, C0435o.m1603a(j, i)));
        }
    }

    /* renamed from: a */
    public static void m1606a(long j, PrintWriter printWriter) {
        C0435o.m1607a(j, printWriter, 0);
    }

    /* renamed from: a */
    public static void m1605a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            C0435o.m1607a(j - j2, printWriter, (int) 0);
        }
    }
}
