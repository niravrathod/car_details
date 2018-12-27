package com.google.android.exoplayer2.extractor.p129d;

import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2266m;
import com.google.android.exoplayer2.p126c.C2163a;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.d.a */
final class C3980a implements C2230f {
    /* renamed from: a */
    private final C2229e f15924a = new C2229e();
    /* renamed from: b */
    private final long f15925b;
    /* renamed from: c */
    private final long f15926c;
    /* renamed from: d */
    private final C2233h f15927d;
    /* renamed from: e */
    private int f15928e;
    /* renamed from: f */
    private long f15929f;
    /* renamed from: g */
    private long f15930g;
    /* renamed from: h */
    private long f15931h;
    /* renamed from: i */
    private long f15932i;
    /* renamed from: j */
    private long f15933j;
    /* renamed from: k */
    private long f15934k;
    /* renamed from: l */
    private long f15935l;

    /* renamed from: com.google.android.exoplayer2.extractor.d.a$a */
    private class C3979a implements C2266m {
        /* renamed from: a */
        final /* synthetic */ C3980a f15923a;

        /* renamed from: a */
        public boolean mo1578a() {
            return true;
        }

        private C3979a(C3980a c3980a) {
            this.f15923a = c3980a;
        }

        /* renamed from: b */
        public long mo1580b(long j) {
            if (j == 0) {
                return this.f15923a.f15925b;
            }
            return this.f15923a.m19866a(this.f15923a.f15925b, this.f15923a.f15927d.m8222b(j), 30000);
        }

        /* renamed from: b */
        public long mo1579b() {
            return this.f15923a.f15927d.m8217a(this.f15923a.f15929f);
        }
    }

    /* renamed from: c */
    public /* synthetic */ C2266m mo1599c() {
        return m19875a();
    }

    public C3980a(long j, long j2, C2233h c2233h, int i, long j3) {
        boolean z = j >= 0 && j2 > j;
        C2163a.m7916a(z);
        this.f15927d = c2233h;
        this.f15925b = j;
        this.f15926c = j2;
        if (((long) i) == j2 - j) {
            this.f15929f = j3;
            this.f15928e = 3;
            return;
        }
        this.f15928e = 0;
    }

    /* renamed from: a */
    public long mo1598a(C2260g c2260g) {
        long j;
        switch (this.f15928e) {
            case 0:
                this.f15930g = c2260g.mo1589c();
                this.f15928e = 1;
                j = this.f15926c - 65307;
                if (j > this.f15930g) {
                    return j;
                }
                break;
            case 1:
                break;
            case 2:
                long j2 = 0;
                if (this.f15931h != 0) {
                    j = m19872a(this.f15931h, c2260g);
                    if (j >= 0) {
                        return j;
                    }
                    j2 = m19874a(c2260g, this.f15931h, -(j + 2));
                }
                this.f15928e = 3;
                return -(j2 + 2);
            case 3:
                return -1;
            default:
                throw new IllegalStateException();
        }
        this.f15929f = m19879c(c2260g);
        this.f15928e = 3;
        return this.f15930g;
    }

    /* renamed from: a */
    public long mo1597a(long j) {
        boolean z;
        long j2;
        if (this.f15928e != 3) {
            if (this.f15928e != 2) {
                z = false;
                C2163a.m7916a(z);
                j2 = 0;
                if (j == 0) {
                    j2 = this.f15927d.m8222b(j);
                }
                this.f15931h = j2;
                this.f15928e = 2;
                m19877b();
                return this.f15931h;
            }
        }
        z = true;
        C2163a.m7916a(z);
        j2 = 0;
        if (j == 0) {
            j2 = this.f15927d.m8222b(j);
        }
        this.f15931h = j2;
        this.f15928e = 2;
        m19877b();
        return this.f15931h;
    }

    /* renamed from: a */
    public C3979a m19875a() {
        return this.f15929f != 0 ? new C3979a() : null;
    }

    /* renamed from: b */
    public void m19877b() {
        this.f15932i = this.f15925b;
        this.f15933j = this.f15926c;
        this.f15934k = 0;
        this.f15935l = this.f15929f;
    }

    /* renamed from: a */
    public long m19872a(long j, C2260g c2260g) {
        C2260g c2260g2 = c2260g;
        if (this.f15932i == this.f15933j) {
            return -(r0.f15934k + 2);
        }
        long c = c2260g.mo1589c();
        if (m19876a(c2260g2, r0.f15933j)) {
            r0.f15924a.m8210a(c2260g2, false);
            c2260g.mo1583a();
            long j2 = j - r0.f15924a.f7029c;
            int i = r0.f15924a.f7034h + r0.f15924a.f7035i;
            if (j2 >= 0) {
                if (j2 <= 72000) {
                    c2260g2.mo1586b(i);
                    return -(r0.f15924a.f7029c + 2);
                }
            }
            if (j2 < 0) {
                r0.f15933j = c;
                r0.f15935l = r0.f15924a.f7029c;
            } else {
                long j3 = (long) i;
                r0.f15932i = c2260g.mo1589c() + j3;
                r0.f15934k = r0.f15924a.f7029c;
                if ((r0.f15933j - r0.f15932i) + j3 < 100000) {
                    c2260g2.mo1586b(i);
                    return -(r0.f15934k + 2);
                }
            }
            if (r0.f15933j - r0.f15932i < 100000) {
                r0.f15933j = r0.f15932i;
                return r0.f15932i;
            }
            return Math.min(Math.max((c2260g.mo1589c() - ((long) (i * (j2 <= 0 ? 2 : 1)))) + ((j2 * (r0.f15933j - r0.f15932i)) / (r0.f15935l - r0.f15934k)), r0.f15932i), r0.f15933j - 1);
        } else if (r0.f15932i != c) {
            return r0.f15932i;
        } else {
            throw new IOException("No ogg page can be found.");
        }
    }

    /* renamed from: a */
    private long m19866a(long j, long j2, long j3) {
        j += ((j2 * (this.f15926c - this.f15925b)) / this.f15929f) - j3;
        if (j < this.f15925b) {
            j = this.f15925b;
        }
        return j >= this.f15926c ? this.f15926c - 1 : j;
    }

    /* renamed from: b */
    void m19878b(C2260g c2260g) {
        if (m19876a(c2260g, this.f15926c) == null) {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    boolean m19876a(C2260g c2260g, long j) {
        j = Math.min(j + 3, this.f15926c);
        byte[] bArr = new byte[2048];
        int length = bArr.length;
        while (true) {
            int i;
            int i2 = 0;
            if (c2260g.mo1589c() + ((long) length) > j) {
                length = (int) (j - c2260g.mo1589c());
                if (length < 4) {
                    return false;
                }
            }
            c2260g.mo1588b(bArr, 0, length, false);
            while (true) {
                i = length - 3;
                if (i2 >= i) {
                    break;
                } else if (bArr[i2] == (byte) 79 && bArr[i2 + 1] == (byte) 103 && bArr[i2 + 2] == (byte) 103 && bArr[i2 + 3] == (byte) 83) {
                    c2260g.mo1586b(i2);
                    return true;
                } else {
                    i2++;
                }
            }
            c2260g.mo1586b(i);
        }
    }

    /* renamed from: c */
    long m19879c(C2260g c2260g) {
        m19878b(c2260g);
        this.f15924a.m8209a();
        while ((this.f15924a.f7028b & 4) != 4 && c2260g.mo1589c() < this.f15926c) {
            this.f15924a.m8210a(c2260g, false);
            c2260g.mo1586b(this.f15924a.f7034h + this.f15924a.f7035i);
        }
        return this.f15924a.f7029c;
    }

    /* renamed from: a */
    long m19874a(C2260g c2260g, long j, long j2) {
        this.f15924a.m8210a(c2260g, false);
        while (this.f15924a.f7029c < j) {
            c2260g.mo1586b(this.f15924a.f7034h + this.f15924a.f7035i);
            j2 = this.f15924a.f7029c;
            this.f15924a.m8210a(c2260g, false);
        }
        c2260g.mo1583a();
        return j2;
    }
}
