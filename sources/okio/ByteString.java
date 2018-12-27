package okio;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.annotation.Nullable;

public class ByteString implements Serializable, Comparable<ByteString> {
    /* renamed from: a */
    static final char[] f12680a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /* renamed from: b */
    public static final ByteString f12681b = m14642a(new byte[0]);
    private static final long serialVersionUID = 1;
    /* renamed from: c */
    transient int f12682c;
    /* renamed from: d */
    transient String f12683d;
    final byte[] data;

    public /* synthetic */ int compareTo(Object obj) {
        return m14653b((ByteString) obj);
    }

    ByteString(byte[] bArr) {
        this.data = bArr;
    }

    /* renamed from: a */
    public static ByteString m14642a(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: a */
    public static ByteString m14641a(String str) {
        if (str != null) {
            ByteString byteString = new ByteString(str.getBytes(C4907u.f21956a));
            byteString.f12683d = str;
            return byteString;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: a */
    public String m14647a() {
        String str = this.f12683d;
        if (str != null) {
            return str;
        }
        str = new String(this.data, C4907u.f21956a);
        this.f12683d = str;
        return str;
    }

    /* renamed from: b */
    public String m14654b() {
        return C4904b.a(this.data);
    }

    /* renamed from: c */
    public ByteString m14655c() {
        return m14645d("MD5");
    }

    /* renamed from: d */
    public ByteString m14656d() {
        return m14645d("SHA-1");
    }

    /* renamed from: e */
    public ByteString m14657e() {
        return m14645d("SHA-256");
    }

    /* renamed from: d */
    private ByteString m14645d(String str) {
        try {
            return m14642a(MessageDigest.getInstance(str).digest(this.data));
        } catch (String str2) {
            throw new AssertionError(str2);
        }
    }

    @Nullable
    /* renamed from: b */
    public static ByteString m14643b(String str) {
        if (str != null) {
            str = C4904b.a(str);
            return str != null ? new ByteString(str) : null;
        } else {
            throw new IllegalArgumentException("base64 == null");
        }
    }

    /* renamed from: f */
    public String m14658f() {
        char[] cArr = new char[(this.data.length * 2)];
        int i = 0;
        for (byte b : this.data) {
            int i2 = i + 1;
            cArr[i] = f12680a[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = f12680a[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: c */
    public static ByteString m14644c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m14638a(str.charAt(i2)) << 4) + m14638a(str.charAt(i2 + 1)));
            }
            return m14642a(bArr);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected hex string: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static int m14638a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        if (c >= 'A' && c <= 'F') {
            return (c - 'A') + 10;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected hex digit: ");
        stringBuilder.append(c);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static ByteString m14640a(InputStream inputStream, int i) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i >= 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new ByteString(bArr);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: g */
    public ByteString m14659g() {
        for (int i = 0; i < this.data.length; i++) {
            byte b = this.data[i];
            if (b >= (byte) 65) {
                if (b <= (byte) 90) {
                    byte[] bArr = (byte[]) this.data.clone();
                    bArr[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < bArr.length; i2++) {
                        byte b2 = bArr[i2];
                        if (b2 >= (byte) 65) {
                            if (b2 <= (byte) 90) {
                                bArr[i2] = (byte) (b2 + 32);
                            }
                        }
                    }
                    return new ByteString(bArr);
                }
            }
        }
        return this;
    }

    /* renamed from: a */
    public ByteString m14648a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else if (i2 <= this.data.length) {
            int i3 = i2 - i;
            if (i3 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            } else if (i == 0 && i2 == this.data.length) {
                return this;
            } else {
                i2 = new byte[i3];
                System.arraycopy(this.data, i, i2, 0, i3);
                return new ByteString(i2);
            }
        } else {
            i2 = new StringBuilder();
            i2.append("endIndex > length(");
            i2.append(this.data.length);
            i2.append(")");
            throw new IllegalArgumentException(i2.toString());
        }
    }

    /* renamed from: a */
    public byte m14646a(int i) {
        return this.data[i];
    }

    /* renamed from: h */
    public int m14660h() {
        return this.data.length;
    }

    /* renamed from: i */
    public byte[] m14661i() {
        return (byte[]) this.data.clone();
    }

    /* renamed from: a */
    void m14649a(C4755c c4755c) {
        c4755c.m27505b(this.data, 0, this.data.length);
    }

    /* renamed from: a */
    public boolean m14650a(int i, ByteString byteString, int i2, int i3) {
        return byteString.m14651a(i2, this.data, i, i3);
    }

    /* renamed from: a */
    public boolean m14651a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.data.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C4907u.a(this.data, i, bArr, i2, i3) != 0;
    }

    /* renamed from: a */
    public final boolean m14652a(ByteString byteString) {
        return m14650a(0, byteString, 0, byteString.m14660h());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.m14660h() == this.data.length && byteString.m14651a(0, this.data, 0, this.data.length) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int i = this.f12682c;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.data);
        this.f12682c = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public int m14653b(okio.ByteString r10) {
        /*
        r9 = this;
        r0 = r9.m14660h();
        r1 = r10.m14660h();
        r2 = java.lang.Math.min(r0, r1);
        r3 = 0;
        r4 = 0;
    L_0x000e:
        r5 = -1;
        r6 = 1;
        if (r4 >= r2) goto L_0x0028;
    L_0x0012:
        r7 = r9.m14646a(r4);
        r7 = r7 & 255;
        r8 = r10.m14646a(r4);
        r8 = r8 & 255;
        if (r7 != r8) goto L_0x0023;
    L_0x0020:
        r4 = r4 + 1;
        goto L_0x000e;
    L_0x0023:
        if (r7 >= r8) goto L_0x0026;
    L_0x0025:
        goto L_0x0027;
    L_0x0026:
        r5 = 1;
    L_0x0027:
        return r5;
    L_0x0028:
        if (r0 != r1) goto L_0x002b;
    L_0x002a:
        return r3;
    L_0x002b:
        if (r0 >= r1) goto L_0x002e;
    L_0x002d:
        goto L_0x002f;
    L_0x002e:
        r5 = 1;
    L_0x002f:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.b(okio.ByteString):int");
    }

    public String toString() {
        if (this.data.length == 0) {
            return "[size=0]";
        }
        String a = m14647a();
        int a2 = m14639a(a, 64);
        StringBuilder stringBuilder;
        if (a2 == -1) {
            if (this.data.length <= 64) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("[hex=");
                stringBuilder.append(m14658f());
                stringBuilder.append("]");
                a = stringBuilder.toString();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("[size=");
                stringBuilder.append(this.data.length);
                stringBuilder.append(" hex=");
                stringBuilder.append(m14648a(0, 64).m14658f());
                stringBuilder.append("…]");
                a = stringBuilder.toString();
            }
            return a;
        }
        String replace = a.substring(0, a2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a2 < a.length()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[size=");
            stringBuilder.append(this.data.length);
            stringBuilder.append(" text=");
            stringBuilder.append(replace);
            stringBuilder.append("…]");
            a = stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[text=");
            stringBuilder.append(replace);
            stringBuilder.append("]");
            a = stringBuilder.toString();
        }
        return a;
    }

    /* renamed from: a */
    static int m14639a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    private void readObject(java.io.ObjectInputStream r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r3.readInt();
        r3 = m14640a(r3, r0);
        r0 = okio.ByteString.class;	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r1 = "data";	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r0 = r0.getDeclaredField(r1);	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r1 = 1;	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r0.setAccessible(r1);	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r3 = r3.data;	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r0.set(r2, r3);	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        return;
    L_0x001a:
        r3 = new java.lang.AssertionError;
        r3.<init>();
        throw r3;
    L_0x0020:
        r3 = new java.lang.AssertionError;
        r3.<init>();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.readObject(java.io.ObjectInputStream):void");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }
}
