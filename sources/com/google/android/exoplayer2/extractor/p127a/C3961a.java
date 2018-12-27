package com.google.android.exoplayer2.extractor.p127a;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.p126c.C2163a;
import java.util.Stack;

/* renamed from: com.google.android.exoplayer2.extractor.a.a */
final class C3961a implements C2198b {
    /* renamed from: a */
    private final byte[] f15769a = new byte[8];
    /* renamed from: b */
    private final Stack<C2197a> f15770b = new Stack();
    /* renamed from: c */
    private final C2202f f15771c = new C2202f();
    /* renamed from: d */
    private C2199c f15772d;
    /* renamed from: e */
    private int f15773e;
    /* renamed from: f */
    private int f15774f;
    /* renamed from: g */
    private long f15775g;

    /* renamed from: com.google.android.exoplayer2.extractor.a.a$a */
    private static final class C2197a {
        /* renamed from: a */
        private final int f6781a;
        /* renamed from: b */
        private final long f6782b;

        private C2197a(int i, long j) {
            this.f6781a = i;
            this.f6782b = j;
        }
    }

    C3961a() {
    }

    /* renamed from: a */
    public void mo1562a(C2199c c2199c) {
        this.f15772d = c2199c;
    }

    /* renamed from: a */
    public void mo1561a() {
        this.f15773e = 0;
        this.f15770b.clear();
        this.f15771c.m8127a();
    }

    /* renamed from: a */
    public boolean mo1563a(C2260g c2260g) {
        C2163a.m7918b(this.f15772d != null);
        while (true) {
            if (this.f15770b.isEmpty() || c2260g.mo1589c() < ((C2197a) this.f15770b.peek()).f6782b) {
                if (this.f15773e == 0) {
                    long a = this.f15771c.m8126a(c2260g, true, false, 4);
                    if (a == -2) {
                        a = m19715b(c2260g);
                    }
                    if (a == -1) {
                        return false;
                    }
                    this.f15774f = (int) a;
                    this.f15773e = 1;
                }
                if (this.f15773e == 1) {
                    this.f15775g = this.f15771c.m8126a(c2260g, false, true, 8);
                    this.f15773e = 2;
                }
                int a2 = this.f15772d.mo1565a(this.f15774f);
                StringBuilder stringBuilder;
                switch (a2) {
                    case 0:
                        c2260g.mo1586b((int) this.f15775g);
                        this.f15773e = 0;
                    case 1:
                        long c = c2260g.mo1589c();
                        this.f15770b.add(new C2197a(this.f15774f, this.f15775g + c));
                        this.f15772d.mo1569a(this.f15774f, c, this.f15775g);
                        this.f15773e = 0;
                        return true;
                    case 2:
                        if (this.f15775g <= 8) {
                            this.f15772d.mo1568a(this.f15774f, m19713a(c2260g, (int) this.f15775g));
                            this.f15773e = 0;
                            return true;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid integer size: ");
                        stringBuilder.append(this.f15775g);
                        throw new ParserException(stringBuilder.toString());
                    case 3:
                        if (this.f15775g <= 2147483647L) {
                            this.f15772d.mo1570a(this.f15774f, m19716c(c2260g, (int) this.f15775g));
                            this.f15773e = 0;
                            return true;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("String element size: ");
                        stringBuilder.append(this.f15775g);
                        throw new ParserException(stringBuilder.toString());
                    case 4:
                        this.f15772d.mo1567a(this.f15774f, (int) this.f15775g, c2260g);
                        this.f15773e = 0;
                        return true;
                    case 5:
                        if (this.f15775g != 4) {
                            if (this.f15775g != 8) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid float size: ");
                                stringBuilder.append(this.f15775g);
                                throw new ParserException(stringBuilder.toString());
                            }
                        }
                        this.f15772d.mo1566a(this.f15774f, m19714b(c2260g, (int) this.f15775g));
                        this.f15773e = 0;
                        return true;
                    default:
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Invalid element type ");
                        stringBuilder2.append(a2);
                        throw new ParserException(stringBuilder2.toString());
                }
            }
            this.f15772d.mo1572c(((C2197a) this.f15770b.pop()).f6781a);
            return true;
        }
    }

    /* renamed from: b */
    private long m19715b(C2260g c2260g) {
        c2260g.mo1583a();
        while (true) {
            c2260g.mo1591c(this.f15769a, 0, 4);
            int a = C2202f.m8124a(this.f15769a[0]);
            if (a != -1 && a <= 4) {
                int a2 = (int) C2202f.m8125a(this.f15769a, a, false);
                if (this.f15772d.mo1571b(a2)) {
                    c2260g.mo1586b(a);
                    return (long) a2;
                }
            }
            c2260g.mo1586b(1);
        }
    }

    /* renamed from: a */
    private long m19713a(C2260g c2260g, int i) {
        int i2 = 0;
        c2260g.mo1587b(this.f15769a, 0, i);
        long j = 0;
        while (i2 < i) {
            j = (j << 8) | ((long) (this.f15769a[i2] & 255));
            i2++;
        }
        return j;
    }

    /* renamed from: b */
    private double m19714b(C2260g c2260g, int i) {
        long a = m19713a(c2260g, i);
        if (i == 4) {
            return (double) Float.intBitsToFloat((int) a);
        }
        return Double.longBitsToDouble(a);
    }

    /* renamed from: c */
    private String m19716c(C2260g c2260g, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        c2260g.mo1587b(bArr, 0, i);
        return new String(bArr);
    }
}
