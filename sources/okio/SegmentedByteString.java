package okio;

import java.util.Arrays;

final class SegmentedByteString extends ByteString {
    /* renamed from: e */
    final transient byte[][] f21958e;
    /* renamed from: f */
    final transient int[] f21959f;

    SegmentedByteString(C4755c c4755c, int i) {
        super(null);
        C4907u.m30281a(c4755c.f20813b, 0, (long) i);
        int i2 = 0;
        C2992p c2992p = c4755c.f20812a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (c2992p.f12686c != c2992p.f12685b) {
                i3 += c2992p.f12686c - c2992p.f12685b;
                i4++;
                c2992p = c2992p.f12689f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f21958e = new byte[i4][];
        this.f21959f = new int[(i4 * 2)];
        C2992p c2992p2 = c4755c.f20812a;
        c4755c = null;
        while (i2 < i) {
            this.f21958e[c4755c] = c2992p2.f12684a;
            i2 += c2992p2.f12686c - c2992p2.f12685b;
            if (i2 > i) {
                i2 = i;
            }
            this.f21959f[c4755c] = i2;
            this.f21959f[this.f21958e.length + c4755c] = c2992p2.f12685b;
            c2992p2.f12687d = true;
            c4755c++;
            c2992p2 = c2992p2.f12689f;
        }
    }

    /* renamed from: a */
    public String m30289a() {
        return m30287j().a();
    }

    /* renamed from: b */
    public String m30294b() {
        return m30287j().b();
    }

    /* renamed from: f */
    public String m30298f() {
        return m30287j().f();
    }

    /* renamed from: g */
    public ByteString m30299g() {
        return m30287j().g();
    }

    /* renamed from: c */
    public ByteString m30295c() {
        return m30287j().c();
    }

    /* renamed from: d */
    public ByteString m30296d() {
        return m30287j().d();
    }

    /* renamed from: e */
    public ByteString m30297e() {
        return m30287j().e();
    }

    /* renamed from: a */
    public ByteString m30290a(int i, int i2) {
        return m30287j().a(i, i2);
    }

    /* renamed from: a */
    public byte m30288a(int i) {
        int i2;
        C4907u.m30281a((long) this.f21959f[this.f21958e.length - 1], (long) i, 1);
        int b = m30286b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.f21959f[b - 1];
        }
        return this.f21958e[b][(i - i2) + this.f21959f[this.f21958e.length + b]];
    }

    /* renamed from: b */
    private int m30286b(int i) {
        i = Arrays.binarySearch(this.f21959f, 0, this.f21958e.length, i + 1);
        return i >= 0 ? i : i ^ -1;
    }

    /* renamed from: h */
    public int m30300h() {
        return this.f21959f[this.f21958e.length - 1];
    }

    /* renamed from: i */
    public byte[] m30301i() {
        Object obj = new byte[this.f21959f[this.f21958e.length - 1]];
        int length = this.f21958e.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f21959f[length + i];
            int i4 = this.f21959f[i];
            System.arraycopy(this.f21958e[i], i3, obj, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return obj;
    }

    /* renamed from: a */
    void m30291a(C4755c c4755c) {
        int length = this.f21958e.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f21959f[length + i];
            int i4 = this.f21959f[i];
            C2992p c2992p = new C2992p(this.f21958e[i], i3, (i3 + i4) - i2, true, false);
            if (c4755c.f20812a == null) {
                c2992p.f12690g = c2992p;
                c2992p.f12689f = c2992p;
                c4755c.f20812a = c2992p;
            } else {
                c4755c.f20812a.f12690g.a(c2992p);
            }
            i++;
            i2 = i4;
        }
        c4755c.f20813b += (long) i2;
    }

    /* renamed from: a */
    public boolean m30292a(int i, ByteString byteString, int i2, int i3) {
        if (i >= 0) {
            if (i <= m30300h() - i3) {
                int b = m30286b(i);
                while (i3 > 0) {
                    int i4;
                    if (b == 0) {
                        i4 = 0;
                    } else {
                        i4 = this.f21959f[b - 1];
                    }
                    int min = Math.min(i3, ((this.f21959f[b] - i4) + i4) - i);
                    if (!byteString.a(i2, this.f21958e[b], (i - i4) + this.f21959f[this.f21958e.length + b], min)) {
                        return false;
                    }
                    i += min;
                    i2 += min;
                    i3 -= min;
                    b++;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m30293a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0 && i <= m30300h() - i3 && i2 >= 0) {
            if (i2 <= bArr.length - i3) {
                int b = m30286b(i);
                while (i3 > 0) {
                    int i4;
                    if (b == 0) {
                        i4 = 0;
                    } else {
                        i4 = this.f21959f[b - 1];
                    }
                    int min = Math.min(i3, ((this.f21959f[b] - i4) + i4) - i);
                    if (!C4907u.m30283a(this.f21958e[b], (i - i4) + this.f21959f[this.f21958e.length + b], bArr, i2, min)) {
                        return false;
                    }
                    i += min;
                    i2 += min;
                    i3 -= min;
                    b++;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private ByteString m30287j() {
        return new ByteString(m30301i());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.h() == m30300h() && m30292a(0, byteString, 0, m30300h()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        i = this.f21958e.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            byte[] bArr = this.f21958e[i2];
            int i5 = this.f21959f[i + i2];
            int i6 = this.f21959f[i2];
            i3 = (i6 - i3) + i5;
            while (i5 < i3) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.c = i4;
        return i4;
    }

    public String toString() {
        return m30287j().toString();
    }

    private Object writeReplace() {
        return m30287j();
    }
}
