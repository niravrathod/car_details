package okio;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: okio.c */
public final class C4755c implements Cloneable, ByteChannel, C4393d, C4394e {
    /* renamed from: c */
    private static final byte[] f20811c = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102};
    @Nullable
    /* renamed from: a */
    C2992p f20812a;
    /* renamed from: b */
    long f20813b;

    /* renamed from: c */
    public C4755c mo4553c() {
        return this;
    }

    public void close() {
    }

    /* renamed from: d */
    public C4755c m27515d() {
        return this;
    }

    public void flush() {
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: b */
    public /* synthetic */ C4393d mo4550b(String str) {
        return m27492a(str);
    }

    /* renamed from: b */
    public /* synthetic */ C4393d mo4551b(ByteString byteString) {
        return m27495a(byteString);
    }

    /* renamed from: c */
    public /* synthetic */ C4393d mo4554c(byte[] bArr) {
        return m27504b(bArr);
    }

    /* renamed from: c */
    public /* synthetic */ C4393d mo4555c(byte[] bArr, int i, int i2) {
        return m27505b(bArr, i, i2);
    }

    public /* synthetic */ Object clone() {
        return m27549u();
    }

    /* renamed from: h */
    public /* synthetic */ C4393d mo4561h(int i) {
        return m27518e(i);
    }

    /* renamed from: i */
    public /* synthetic */ C4393d mo4563i(int i) {
        return m27516d(i);
    }

    /* renamed from: j */
    public /* synthetic */ C4393d mo4567j(int i) {
        return m27511c(i);
    }

    /* renamed from: k */
    public /* synthetic */ C4393d mo4568k(int i) {
        return m27503b(i);
    }

    /* renamed from: l */
    public /* synthetic */ C4393d mo4571l(long j) {
        return m27535k(j);
    }

    /* renamed from: m */
    public /* synthetic */ C4393d mo4573m(long j) {
        return m27533j(j);
    }

    /* renamed from: w */
    public /* synthetic */ C4393d mo4578w() {
        return m27515d();
    }

    /* renamed from: b */
    public long m27502b() {
        return this.f20813b;
    }

    /* renamed from: e */
    public boolean mo4557e() {
        return this.f20813b == 0;
    }

    /* renamed from: a */
    public void mo4547a(long j) {
        if (this.f20813b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public boolean mo4552b(long j) {
        return this.f20813b >= j ? 1 : 0;
    }

    /* renamed from: f */
    public InputStream mo4558f() {
        return new c$1(this);
    }

    /* renamed from: a */
    public C4755c m27496a(C4755c c4755c, long j, long j2) {
        if (c4755c != null) {
            C4907u.a(this.f20813b, j, j2);
            if (j2 == 0) {
                return this;
            }
            c4755c.f20813b += j2;
            C2992p c2992p = this.f20812a;
            while (j >= ((long) (c2992p.f12686c - c2992p.f12685b))) {
                j -= (long) (c2992p.f12686c - c2992p.f12685b);
                c2992p = c2992p.f12689f;
            }
            while (j2 > 0) {
                C2992p a = c2992p.m14662a();
                a.f12685b = (int) (((long) a.f12685b) + j);
                a.f12686c = Math.min(a.f12685b + ((int) j2), a.f12686c);
                if (c4755c.f20812a == null) {
                    a.f12690g = a;
                    a.f12689f = a;
                    c4755c.f20812a = a;
                } else {
                    c4755c.f20812a.f12690g.m14664a(a);
                }
                j2 -= (long) (a.f12686c - a.f12685b);
                c2992p = c2992p.f12689f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: g */
    public long m27523g() {
        long j = this.f20813b;
        if (j == 0) {
            return 0;
        }
        C2992p c2992p = this.f20812a.f12690g;
        if (c2992p.f12686c < 8192 && c2992p.f12688e) {
            j -= (long) (c2992p.f12686c - c2992p.f12685b);
        }
        return j;
    }

    /* renamed from: h */
    public byte mo4560h() {
        if (this.f20813b != 0) {
            C2992p c2992p = this.f20812a;
            int i = c2992p.f12685b;
            int i2 = c2992p.f12686c;
            int i3 = i + 1;
            byte b = c2992p.f12684a[i];
            this.f20813b--;
            if (i3 == i2) {
                this.f20812a = c2992p.m14666b();
                C2993q.m14669a(c2992p);
            } else {
                c2992p.f12685b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: c */
    public byte m27509c(long j) {
        C4907u.a(this.f20813b, j, 1);
        C2992p c2992p;
        if (this.f20813b - j > j) {
            c2992p = this.f20812a;
            while (true) {
                long j2 = (long) (c2992p.f12686c - c2992p.f12685b);
                if (j < j2) {
                    return c2992p.f12684a[c2992p.f12685b + ((int) j)];
                }
                j -= j2;
                c2992p = c2992p.f12689f;
            }
        } else {
            j -= this.f20813b;
            c2992p = this.f20812a;
            do {
                c2992p = c2992p.f12690g;
                j += (long) (c2992p.f12686c - c2992p.f12685b);
            } while (j < 0);
            return c2992p.f12684a[c2992p.f12685b + ((int) j)];
        }
    }

    /* renamed from: i */
    public short mo4564i() {
        if (this.f20813b >= 2) {
            C2992p c2992p = this.f20812a;
            int i = c2992p.f12685b;
            int i2 = c2992p.f12686c;
            if (i2 - i < 2) {
                return (short) (((mo4560h() & 255) << 8) | (mo4560h() & 255));
            }
            byte[] bArr = c2992p.f12684a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            i = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f20813b -= 2;
            if (i4 == i2) {
                this.f20812a = c2992p.m14666b();
                C2993q.m14669a(c2992p);
            } else {
                c2992p.f12685b = i4;
            }
            return (short) i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size < 2: ");
        stringBuilder.append(this.f20813b);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: j */
    public int mo4566j() {
        if (this.f20813b >= 4) {
            C2992p c2992p = this.f20812a;
            int i = c2992p.f12685b;
            int i2 = c2992p.f12686c;
            if (i2 - i < 4) {
                return ((((mo4560h() & 255) << 24) | ((mo4560h() & 255) << 16)) | ((mo4560h() & 255) << 8)) | (mo4560h() & 255);
            }
            byte[] bArr = c2992p.f12684a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            i = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            i3 = i4 + 1;
            i |= (bArr[i4] & 255) << 8;
            i4 = i3 + 1;
            i |= bArr[i3] & 255;
            this.f20813b -= 4;
            if (i4 == i2) {
                this.f20812a = c2992p.m14666b();
                C2993q.m14669a(c2992p);
            } else {
                c2992p.f12685b = i4;
            }
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size < 4: ");
        stringBuilder.append(this.f20813b);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: k */
    public short mo4569k() {
        return C4907u.a(mo4564i());
    }

    /* renamed from: l */
    public int mo4570l() {
        return C4907u.a(mo4566j());
    }

    /* renamed from: m */
    public long mo4572m() {
        long j = 0;
        if (this.f20813b != 0) {
            int i = 0;
            long j2 = -7;
            Object obj = null;
            Object obj2 = null;
            do {
                C2992p c2992p = r0.f20812a;
                byte[] bArr = c2992p.f12684a;
                int i2 = c2992p.f12685b;
                int i3 = c2992p.f12686c;
                while (i2 < i3) {
                    byte b = bArr[i2];
                    if (b >= (byte) 48 && b <= (byte) 57) {
                        int i4 = 48 - b;
                        if (j >= -922337203685477580L) {
                            if (j != -922337203685477580L || ((long) i4) >= j2) {
                                j = (j * 10) + ((long) i4);
                            }
                        }
                        C4755c b2 = new C4755c().m27533j(j).m27503b((int) b);
                        if (obj == null) {
                            b2.mo4560h();
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Number too large: ");
                        stringBuilder.append(b2.mo4575p());
                        throw new NumberFormatException(stringBuilder.toString());
                    } else if (b == (byte) 45 && i == 0) {
                        j2--;
                        obj = 1;
                    } else if (i != 0) {
                        obj2 = 1;
                        if (i2 != i3) {
                            r0.f20812a = c2992p.m14666b();
                            C2993q.m14669a(c2992p);
                        } else {
                            c2992p.f12685b = i2;
                        }
                        if (obj2 == null) {
                            break;
                        }
                    } else {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Expected leading [0-9] or '-' character but was 0x");
                        stringBuilder2.append(Integer.toHexString(b));
                        throw new NumberFormatException(stringBuilder2.toString());
                    }
                    i2++;
                    i++;
                }
                if (i2 != i3) {
                    c2992p.f12685b = i2;
                } else {
                    r0.f20812a = c2992p.m14666b();
                    C2993q.m14669a(c2992p);
                }
                if (obj2 == null) {
                    break;
                }
            } while (r0.f20812a != null);
            r0.f20813b -= (long) i;
            return obj != null ? j : -j;
        } else {
            throw new IllegalStateException("size == 0");
        }
    }

    /* renamed from: n */
    public long mo4574n() {
        if (this.f20813b != 0) {
            int i = 0;
            long j = 0;
            Object obj = null;
            do {
                C2992p c2992p = this.f20812a;
                byte[] bArr = c2992p.f12684a;
                int i2 = c2992p.f12685b;
                int i3 = c2992p.f12686c;
                while (i2 < i3) {
                    int i4;
                    int i5 = bArr[i2];
                    if (i5 >= (byte) 48 && i5 <= (byte) 57) {
                        i4 = i5 - 48;
                    } else if (i5 >= (byte) 97 && i5 <= (byte) 102) {
                        i4 = (i5 - 97) + 10;
                    } else if (i5 >= (byte) 65 && i5 <= (byte) 70) {
                        i4 = (i5 - 65) + 10;
                    } else if (i != 0) {
                        obj = 1;
                        if (i2 != i3) {
                            this.f20812a = c2992p.m14666b();
                            C2993q.m14669a(c2992p);
                        } else {
                            c2992p.f12685b = i2;
                        }
                        if (obj == null) {
                            break;
                        }
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected leading [0-9a-fA-F] character but was 0x");
                        stringBuilder.append(Integer.toHexString(i5));
                        throw new NumberFormatException(stringBuilder.toString());
                    }
                    if ((-1152921504606846976L & j) == 0) {
                        j = (j << 4) | ((long) i4);
                        i2++;
                        i++;
                    } else {
                        C4755c b = new C4755c().m27535k(j).m27503b(i5);
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Number too large: ");
                        stringBuilder2.append(b.mo4575p());
                        throw new NumberFormatException(stringBuilder2.toString());
                    }
                }
                if (i2 != i3) {
                    c2992p.f12685b = i2;
                } else {
                    this.f20812a = c2992p.m14666b();
                    C2993q.m14669a(c2992p);
                }
                if (obj == null) {
                    break;
                }
            } while (this.f20812a != null);
            this.f20813b -= (long) i;
            return j;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: o */
    public ByteString m27543o() {
        return new ByteString(mo4577s());
    }

    /* renamed from: d */
    public ByteString mo4556d(long j) {
        return new ByteString(mo4562h(j));
    }

    /* renamed from: p */
    public String mo4575p() {
        try {
            return m27489a(this.f20813b, C4907u.f21956a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public String m27517e(long j) {
        return m27489a(j, C4907u.f21956a);
    }

    /* renamed from: a */
    public String mo4546a(Charset charset) {
        try {
            return m27489a(this.f20813b, charset);
        } catch (Charset charset2) {
            throw new AssertionError(charset2);
        }
    }

    /* renamed from: a */
    public String m27489a(long j, Charset charset) {
        C4907u.a(this.f20813b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j == 0) {
            return "";
        } else {
            C2992p c2992p = this.f20812a;
            if (((long) c2992p.f12685b) + j > ((long) c2992p.f12686c)) {
                return new String(mo4562h(j), charset);
            }
            String str = new String(c2992p.f12684a, c2992p.f12685b, (int) j, charset);
            c2992p.f12685b = (int) (((long) c2992p.f12685b) + j);
            this.f20813b -= j;
            if (c2992p.f12685b == c2992p.f12686c) {
                this.f20812a = c2992p.m14666b();
                C2993q.m14669a(c2992p);
            }
            return str;
        }
    }

    /* renamed from: q */
    public String mo4576q() {
        return mo4559f(Long.MAX_VALUE);
    }

    /* renamed from: f */
    public String mo4559f(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long a = m27486a((byte) 10, 0, j2);
            if (a != -1) {
                return m27524g(a);
            }
            if (j2 < m27502b() && m27509c(j2 - 1) == (byte) 13 && m27509c(j2) == (byte) 10) {
                return m27524g(j2);
            }
            C4755c c4755c = new C4755c();
            m27496a(c4755c, 0, Math.min(32, m27502b()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\\n not found: limit=");
            stringBuilder.append(Math.min(m27502b(), j));
            stringBuilder.append(" content=");
            stringBuilder.append(c4755c.m27543o().m14658f());
            stringBuilder.append(8230);
            throw new EOFException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("limit < 0: ");
        stringBuilder.append(j);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: g */
    String m27524g(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (m27509c(j2) == (byte) 13) {
                j = m27517e(j2);
                mo4565i(2);
                return j;
            }
        }
        j = m27517e(j);
        mo4565i(1);
        return j;
    }

    /* renamed from: r */
    public int m27546r() {
        if (this.f20813b != 0) {
            int i;
            int i2;
            byte c = m27509c(0);
            int i3 = 1;
            int i4;
            if ((c & 128) == 0) {
                i = c & 127;
                i2 = 1;
                i4 = 0;
            } else if ((c & 224) == 192) {
                i = c & 31;
                i2 = 2;
                i4 = 128;
            } else if ((c & 240) == 224) {
                i = c & 15;
                i2 = 3;
                i4 = 2048;
            } else if ((c & 248) == 240) {
                i = c & 7;
                i2 = 4;
                i4 = 65536;
            } else {
                mo4565i(1);
                return 65533;
            }
            long j = (long) i2;
            if (this.f20813b >= j) {
                while (i3 < i2) {
                    long j2 = (long) i3;
                    c = m27509c(j2);
                    if ((c & 192) == 128) {
                        i = (i << 6) | (c & 63);
                        i3++;
                    } else {
                        mo4565i(j2);
                        return 65533;
                    }
                }
                mo4565i(j);
                if (i > 1114111) {
                    return 65533;
                }
                if ((i < 55296 || i > 57343) && i >= r6) {
                    return i;
                }
                return 65533;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("size < ");
            stringBuilder.append(i2);
            stringBuilder.append(": ");
            stringBuilder.append(this.f20813b);
            stringBuilder.append(" (to read code point prefixed 0x");
            stringBuilder.append(Integer.toHexString(c));
            stringBuilder.append(")");
            throw new EOFException(stringBuilder.toString());
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public byte[] mo4577s() {
        try {
            return mo4562h(this.f20813b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: h */
    public byte[] mo4562h(long j) {
        C4907u.a(this.f20813b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            mo4548a(bArr);
            return bArr;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
        stringBuilder.append(j);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public void mo4548a(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a = m27484a(bArr, i, bArr.length - i);
            if (a != -1) {
                i += a;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    public int m27484a(byte[] bArr, int i, int i2) {
        C4907u.a((long) bArr.length, (long) i, (long) i2);
        C2992p c2992p = this.f20812a;
        if (c2992p == null) {
            return -1;
        }
        i2 = Math.min(i2, c2992p.f12686c - c2992p.f12685b);
        System.arraycopy(c2992p.f12684a, c2992p.f12685b, bArr, i, i2);
        c2992p.f12685b += i2;
        this.f20813b -= (long) i2;
        if (c2992p.f12685b == c2992p.f12686c) {
            this.f20812a = c2992p.m14666b();
            C2993q.m14669a(c2992p);
        }
        return i2;
    }

    public int read(ByteBuffer byteBuffer) {
        C2992p c2992p = this.f20812a;
        if (c2992p == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c2992p.f12686c - c2992p.f12685b);
        byteBuffer.put(c2992p.f12684a, c2992p.f12685b, min);
        c2992p.f12685b += min;
        this.f20813b -= (long) min;
        if (c2992p.f12685b == c2992p.f12686c) {
            this.f20812a = c2992p.m14666b();
            C2993q.m14669a(c2992p);
        }
        return min;
    }

    /* renamed from: t */
    public void m27548t() {
        try {
            mo4565i(this.f20813b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i */
    public void mo4565i(long j) {
        while (j > 0) {
            if (this.f20812a != null) {
                int min = (int) Math.min(j, (long) (this.f20812a.f12686c - this.f20812a.f12685b));
                long j2 = (long) min;
                this.f20813b -= j2;
                j -= j2;
                C2992p c2992p = this.f20812a;
                c2992p.f12685b += min;
                if (this.f20812a.f12685b == this.f20812a.f12686c) {
                    C2992p c2992p2 = this.f20812a;
                    this.f20812a = c2992p2.m14666b();
                    C2993q.m14669a(c2992p2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    public C4755c m27495a(ByteString byteString) {
        if (byteString != null) {
            byteString.m14649a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: a */
    public C4755c m27492a(String str) {
        return m27493a(str, 0, str.length());
    }

    /* renamed from: a */
    public C4755c m27493a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            i2 = new StringBuilder();
            i2.append("beginIndex < 0: ");
            i2.append(i);
            throw new IllegalArgumentException(i2.toString());
        } else if (i2 < i) {
            r0 = new StringBuilder();
            r0.append("endIndex < beginIndex: ");
            r0.append(i2);
            r0.append(" < ");
            r0.append(i);
            throw new IllegalArgumentException(r0.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                int i3;
                int min;
                int i4;
                if (charAt < '') {
                    C2992p f = m27522f(1);
                    byte[] bArr = f.f12684a;
                    i3 = f.f12686c - i;
                    min = Math.min(i2, 8192 - i3);
                    int i5 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i5 < min) {
                        i = str.charAt(i5);
                        if (i >= 128) {
                            break;
                        }
                        i4 = i5 + 1;
                        bArr[i5 + i3] = (byte) i;
                        i5 = i4;
                    }
                    i3 = (i3 + i5) - f.f12686c;
                    f.f12686c += i3;
                    this.f20813b += (long) i3;
                    i = i5;
                } else if (charAt < 'ࠀ') {
                    m27503b((charAt >> 6) | 192);
                    m27503b((charAt & 63) | 128);
                    i++;
                } else {
                    if (charAt >= '?') {
                        if (charAt <= '?') {
                            i3 = i + 1;
                            if (i3 < i2) {
                                min = str.charAt(i3);
                            } else {
                                min = 0;
                            }
                            if (charAt <= '?' && min >= 56320) {
                                if (min <= 57343) {
                                    i4 = (((charAt & -55297) << 10) | (-56321 & min)) + 65536;
                                    m27503b((i4 >> 18) | 240);
                                    m27503b(((i4 >> 12) & 63) | 128);
                                    m27503b(((i4 >> 6) & 63) | 128);
                                    m27503b((i4 & 63) | 128);
                                    i += 2;
                                }
                            }
                            m27503b(63);
                            i = i3;
                        }
                    }
                    m27503b((charAt >> 12) | 224);
                    m27503b(((charAt >> 6) & 63) | 128);
                    m27503b((charAt & 63) | 128);
                    i++;
                }
            }
            return this;
        } else {
            r0 = new StringBuilder();
            r0.append("endIndex > string.length: ");
            r0.append(i2);
            r0.append(" > ");
            r0.append(str.length());
            throw new IllegalArgumentException(r0.toString());
        }
    }

    /* renamed from: a */
    public C4755c m27491a(int i) {
        if (i < 128) {
            m27503b(i);
        } else if (i < 2048) {
            m27503b((i >> 6) | 192);
            m27503b((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                m27503b((i >> 12) | 224);
                m27503b(((i >> 6) & 63) | 128);
                m27503b((i & 63) | 128);
            } else {
                m27503b(63);
            }
        } else if (i <= 1114111) {
            m27503b((i >> 18) | 240);
            m27503b(((i >> 12) & 63) | 128);
            m27503b(((i >> 6) & 63) | 128);
            m27503b((i & 63) | 128);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected code point: ");
            stringBuilder.append(Integer.toHexString(i));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return this;
    }

    /* renamed from: a */
    public C4755c m27494a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            i2 = new StringBuilder();
            i2.append("beginIndex < 0: ");
            i2.append(i);
            throw new IllegalAccessError(i2.toString());
        } else if (i2 < i) {
            charset = new StringBuilder();
            charset.append("endIndex < beginIndex: ");
            charset.append(i2);
            charset.append(" < ");
            charset.append(i);
            throw new IllegalArgumentException(charset.toString());
        } else if (i2 > str.length()) {
            charset = new StringBuilder();
            charset.append("endIndex > string.length: ");
            charset.append(i2);
            charset.append(" > ");
            charset.append(str.length());
            throw new IllegalArgumentException(charset.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C4907u.f21956a)) {
            return m27493a(str, i, i2);
        } else {
            str = str.substring(i, i2).getBytes(charset);
            return m27505b(str, 0, str.length);
        }
    }

    /* renamed from: b */
    public C4755c m27504b(byte[] bArr) {
        if (bArr != null) {
            return m27505b(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public C4755c m27505b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C4907u.a((long) bArr.length, (long) i, j);
            i2 += i;
            while (i < i2) {
                C2992p f = m27522f(1);
                int min = Math.min(i2 - i, 8192 - f.f12686c);
                System.arraycopy(bArr, i, f.f12684a, f.f12686c, min);
                i += min;
                f.f12686c += min;
            }
            this.f20813b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C2992p f = m27522f(1);
                int min = Math.min(i, 8192 - f.f12686c);
                byteBuffer.get(f.f12684a, f.f12686c, min);
                i -= min;
                f.f12686c += min;
            }
            this.f20813b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public long mo4545a(C2995s c2995s) {
        if (c2995s != null) {
            long j = 0;
            while (true) {
                long a = c2995s.mo3615a(this, 8192);
                if (a == -1) {
                    return j;
                }
                j += a;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: b */
    public C4755c m27503b(int i) {
        C2992p f = m27522f(1);
        byte[] bArr = f.f12684a;
        int i2 = f.f12686c;
        f.f12686c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f20813b++;
        return this;
    }

    /* renamed from: c */
    public C4755c m27511c(int i) {
        C2992p f = m27522f(2);
        byte[] bArr = f.f12684a;
        int i2 = f.f12686c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        f.f12686c = i2;
        this.f20813b += 2;
        return this;
    }

    /* renamed from: d */
    public C4755c m27516d(int i) {
        C2992p f = m27522f(4);
        byte[] bArr = f.f12684a;
        int i2 = f.f12686c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        f.f12686c = i2;
        this.f20813b += 4;
        return this;
    }

    /* renamed from: e */
    public C4755c m27518e(int i) {
        return m27516d(C4907u.a(i));
    }

    /* renamed from: j */
    public C4755c m27533j(long j) {
        if (j == 0) {
            return m27503b((int) 48);
        }
        Object obj = null;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return m27492a("-9223372036854775808");
            }
            obj = 1;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (obj != null) {
            i++;
        }
        C2992p f = m27522f(i);
        byte[] bArr = f.f12684a;
        int i2 = f.f12686c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f20811c[(int) (j % 10)];
            j /= 10;
        }
        if (obj != null) {
            bArr[i2 - 1] = 45;
        }
        f.f12686c += i;
        this.f20813b += (long) i;
        return this;
    }

    /* renamed from: k */
    public C4755c m27535k(long j) {
        if (j == 0) {
            return m27503b((int) 48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C2992p f = m27522f(numberOfTrailingZeros);
        byte[] bArr = f.f12684a;
        int i = f.f12686c;
        for (int i2 = (f.f12686c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f20811c[(int) (15 & j)];
            j >>>= 4;
        }
        f.f12686c += numberOfTrailingZeros;
        this.f20813b += (long) numberOfTrailingZeros;
        return this;
    }

    /* renamed from: f */
    C2992p m27522f(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        } else if (this.f20812a == null) {
            this.f20812a = C2993q.m14668a();
            i = this.f20812a;
            C2992p c2992p = this.f20812a;
            r1 = this.f20812a;
            c2992p.f12690g = r1;
            i.f12689f = r1;
            return r1;
        } else {
            r1 = this.f20812a.f12690g;
            if (r1.f12686c + i > 8192 || r1.f12688e == 0) {
                r1 = r1.m14664a(C2993q.m14668a());
            }
            return r1;
        }
    }

    public void a_(C4755c c4755c, long j) {
        if (c4755c == null) {
            throw new IllegalArgumentException("source == null");
        } else if (c4755c != this) {
            C4907u.a(c4755c.f20813b, 0, j);
            while (j > 0) {
                C2992p c2992p;
                long j2;
                if (j < ((long) (c4755c.f20812a.f12686c - c4755c.f20812a.f12685b))) {
                    c2992p = this.f20812a != null ? this.f20812a.f12690g : null;
                    if (c2992p != null && c2992p.f12688e) {
                        int i;
                        j2 = ((long) c2992p.f12686c) + j;
                        if (c2992p.f12687d) {
                            i = 0;
                        } else {
                            i = c2992p.f12685b;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            c4755c.f20812a.m14665a(c2992p, (int) j);
                            c4755c.f20813b -= j;
                            this.f20813b += j;
                            return;
                        }
                    }
                    c4755c.f20812a = c4755c.f20812a.m14663a((int) j);
                }
                c2992p = c4755c.f20812a;
                j2 = (long) (c2992p.f12686c - c2992p.f12685b);
                c4755c.f20812a = c2992p.m14666b();
                if (this.f20812a == null) {
                    this.f20812a = c2992p;
                    c2992p = this.f20812a;
                    C2992p c2992p2 = this.f20812a;
                    C2992p c2992p3 = this.f20812a;
                    c2992p2.f12690g = c2992p3;
                    c2992p.f12689f = c2992p3;
                } else {
                    this.f20812a.f12690g.m14664a(c2992p).m14667c();
                }
                c4755c.f20813b -= j2;
                this.f20813b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: a */
    public long mo3615a(C4755c c4755c, long j) {
        if (c4755c == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f20813b == 0) {
            return -1;
        } else {
            if (j > this.f20813b) {
                j = this.f20813b;
            }
            c4755c.a_(this, j);
            return j;
        }
    }

    /* renamed from: a */
    public long mo4544a(byte b) {
        return m27486a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long m27486a(byte b, long j, long j2) {
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f20813b), Long.valueOf(j), Long.valueOf(j2)}));
        }
        if (j2 > this.f20813b) {
            j2 = this.f20813b;
        }
        if (j == j2) {
            return -1;
        }
        C2992p c2992p = this.f20812a;
        if (c2992p == null) {
            return -1;
        }
        if (this.f20813b - j >= j) {
            while (true) {
                long j4 = ((long) (c2992p.f12686c - c2992p.f12685b)) + j3;
                if (j4 >= j) {
                    break;
                }
                c2992p = c2992p.f12689f;
                j3 = j4;
            }
        } else {
            j3 = this.f20813b;
            while (j3 > j) {
                c2992p = c2992p.f12690g;
                j3 -= (long) (c2992p.f12686c - c2992p.f12685b);
            }
        }
        while (j3 < j2) {
            byte[] bArr = c2992p.f12684a;
            int min = (int) Math.min((long) c2992p.f12686c, (((long) c2992p.f12685b) + j2) - j3);
            for (j = (int) ((((long) c2992p.f12685b) + j) - j3); j < min; j++) {
                if (bArr[j] == b) {
                    return ((long) (j - c2992p.f12685b)) + j3;
                }
            }
            j = ((long) (c2992p.f12686c - c2992p.f12685b)) + j3;
            c2992p = c2992p.f12689f;
            j3 = j;
        }
        return -1;
    }

    /* renamed from: a */
    public boolean mo4549a(long j, ByteString byteString) {
        return m27501a(j, byteString, 0, byteString.m14660h());
    }

    /* renamed from: a */
    public boolean m27501a(long j, ByteString byteString, int i, int i2) {
        if (j >= 0 && i >= 0 && i2 >= 0 && this.f20813b - j >= ((long) i2)) {
            if (byteString.m14660h() - i >= i2) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (m27509c(((long) i3) + j) != byteString.m14646a(i + i3)) {
                        return false;
                    }
                }
                return 1;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C2996t mo3616a() {
        return C2996t.f12693c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4755c)) {
            return false;
        }
        C4755c c4755c = (C4755c) obj;
        if (this.f20813b != c4755c.f20813b) {
            return false;
        }
        long j = 0;
        if (this.f20813b == 0) {
            return true;
        }
        C2992p c2992p = this.f20812a;
        obj = c4755c.f20812a;
        int i = c2992p.f12685b;
        int i2 = obj.f12685b;
        while (j < this.f20813b) {
            long min = (long) Math.min(c2992p.f12686c - i, obj.f12686c - i2);
            int i3 = i2;
            i2 = i;
            i = 0;
            while (((long) i) < min) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (c2992p.f12684a[i2] != obj.f12684a[i3]) {
                    return false;
                }
                i++;
                i2 = i4;
                i3 = i5;
            }
            if (i2 == c2992p.f12686c) {
                c2992p = c2992p.f12689f;
                i = c2992p.f12685b;
            } else {
                i = i2;
            }
            if (i3 == obj.f12686c) {
                obj = obj.f12689f;
                i2 = obj.f12685b;
            } else {
                i2 = i3;
            }
            j += min;
        }
        return true;
    }

    public int hashCode() {
        C2992p c2992p = this.f20812a;
        if (c2992p == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = c2992p.f12685b; i2 < c2992p.f12686c; i2++) {
                i = (i * 31) + c2992p.f12684a[i2];
            }
            c2992p = c2992p.f12689f;
        } while (c2992p != this.f20812a);
        return i;
    }

    public String toString() {
        return m27550v().toString();
    }

    /* renamed from: u */
    public C4755c m27549u() {
        C4755c c4755c = new C4755c();
        if (this.f20813b == 0) {
            return c4755c;
        }
        c4755c.f20812a = this.f20812a.m14662a();
        C2992p c2992p = c4755c.f20812a;
        C2992p c2992p2 = c4755c.f20812a;
        C2992p c2992p3 = c4755c.f20812a;
        c2992p2.f12690g = c2992p3;
        c2992p.f12689f = c2992p3;
        c2992p = this.f20812a;
        while (true) {
            c2992p = c2992p.f12689f;
            if (c2992p != this.f20812a) {
                c4755c.f20812a.f12690g.m14664a(c2992p.m14662a());
            } else {
                c4755c.f20813b = this.f20813b;
                return c4755c;
            }
        }
    }

    /* renamed from: v */
    public ByteString m27550v() {
        if (this.f20813b <= 2147483647L) {
            return m27525g((int) this.f20813b);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size > Integer.MAX_VALUE: ");
        stringBuilder.append(this.f20813b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: g */
    public ByteString m27525g(int i) {
        if (i == 0) {
            return ByteString.f12681b;
        }
        return new SegmentedByteString(this, i);
    }
}
