package com.google.android.gms.internal.ads;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzbgr {
    /* renamed from: a */
    private final ByteBuffer f9248a;
    /* renamed from: b */
    private zzbck f9249b;
    /* renamed from: c */
    private int f9250c;

    private zzbgr(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static int m10409a(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: d */
    public static int m10423d(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    private zzbgr(ByteBuffer byteBuffer) {
        this.f9248a = byteBuffer;
        this.f9248a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static zzbgr m10412a(byte[] bArr) {
        return m10413a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static zzbgr m10413a(byte[] bArr, int i, int i2) {
        return new zzbgr(bArr, 0, i2);
    }

    /* renamed from: a */
    public final void m10428a(int i, long j) {
        m10436c(i, 0);
        m10421b(j);
    }

    /* renamed from: b */
    public final void m10434b(int i, long j) {
        m10436c(i, 0);
        m10421b(j);
    }

    /* renamed from: a */
    public final void m10427a(int i, int i2) {
        m10436c(i, 0);
        if (i2 >= 0) {
            m10435c(i2);
        } else {
            m10421b((long) i2);
        }
    }

    /* renamed from: a */
    public final void m10432a(int i, boolean z) {
        m10436c(i, 0);
        i = (byte) z;
        if (this.f9248a.hasRemaining()) {
            this.f9248a.put(i);
            return;
        }
        throw new zzbgs(this.f9248a.position(), this.f9248a.limit());
    }

    /* renamed from: a */
    public final void m10431a(int i, String str) {
        m10436c(i, 2);
        try {
            i = m10423d(str.length());
            if (i == m10423d(str.length() * 3)) {
                int position = this.f9248a.position();
                if (this.f9248a.remaining() >= i) {
                    this.f9248a.position(position + i);
                    m10414a((CharSequence) str, this.f9248a);
                    str = this.f9248a.position();
                    this.f9248a.position(position);
                    m10435c((str - position) - i);
                    this.f9248a.position(str);
                    return;
                }
                throw new zzbgs(position + i, this.f9248a.limit());
            }
            m10435c(m10410a((CharSequence) str));
            m10414a((CharSequence) str, this.f9248a);
        } catch (int i2) {
            str = new zzbgs(this.f9248a.position(), this.f9248a.limit());
            str.initCause(i2);
            throw str;
        }
    }

    /* renamed from: a */
    public final void m10430a(int i, zzbgz zzbgz) {
        m10436c(i, 2);
        if (zzbgz.aa < 0) {
            zzbgz.m10455d();
        }
        m10435c(zzbgz.aa);
        zzbgz.mo2429a(this);
    }

    /* renamed from: a */
    public final void m10429a(int i, zzbel zzbel) {
        if (this.f9249b == null) {
            this.f9249b = zzbck.m21512a(this.f9248a);
            this.f9250c = this.f9248a.position();
        } else if (this.f9250c != this.f9248a.position()) {
            this.f9249b.mo4246b(this.f9248a.array(), this.f9250c, this.f9248a.position() - this.f9250c);
            this.f9250c = this.f9248a.position();
        }
        zzbck zzbck = this.f9249b;
        zzbck.mo4231a(i, zzbel);
        zzbck.mo4225a();
        this.f9250c = this.f9248a.position();
    }

    /* renamed from: a */
    public final void m10433a(int i, byte[] bArr) {
        m10436c(i, 2);
        m10435c(bArr.length);
        m10437c(bArr);
    }

    /* renamed from: a */
    private static int m10410a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < '') {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 'ࠀ') {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 'ࠀ') {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if ('?' <= charAt2 && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder stringBuilder = new StringBuilder(39);
                                stringBuilder.append("Unpaired surrogate at index ");
                                stringBuilder.append(i2);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
                if (i3 >= length) {
                    return i3;
                }
                long j = ((long) i3) + 4294967296L;
                StringBuilder stringBuilder2 = new StringBuilder(54);
                stringBuilder2.append("UTF-8 length does not fit in int: ");
                stringBuilder2.append(j);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j2 = ((long) i3) + 4294967296L;
        StringBuilder stringBuilder22 = new StringBuilder(54);
        stringBuilder22.append("UTF-8 length does not fit in int: ");
        stringBuilder22.append(j2);
        throw new IllegalArgumentException(stringBuilder22.toString());
    }

    /* renamed from: a */
    private static void m10414a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        int i = 0;
        int remaining;
        char charAt;
        if (byteBuffer.hasArray()) {
            try {
                int i2;
                byte[] array = byteBuffer.array();
                int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                remaining = byteBuffer.remaining();
                int length = charSequence.length();
                remaining += arrayOffset;
                while (i < length) {
                    i2 = i + arrayOffset;
                    if (i2 >= remaining) {
                        break;
                    }
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 >= '') {
                        break;
                    }
                    array[i2] = (byte) charAt2;
                    i++;
                }
                if (i == length) {
                    arrayOffset += length;
                } else {
                    arrayOffset += i;
                    while (i < length) {
                        int i3;
                        char charAt3 = charSequence.charAt(i);
                        if (charAt3 < '' && arrayOffset < remaining) {
                            i3 = arrayOffset + 1;
                            array[arrayOffset] = (byte) charAt3;
                        } else if (charAt3 < 'ࠀ' && arrayOffset <= remaining - 2) {
                            i3 = arrayOffset + 1;
                            array[arrayOffset] = (byte) ((charAt3 >>> 6) | 960);
                            arrayOffset = i3 + 1;
                            array[i3] = (byte) ((charAt3 & 63) | 128);
                            i++;
                        } else if ((charAt3 < '?' || '?' < charAt3) && arrayOffset <= remaining - 3) {
                            i3 = arrayOffset + 1;
                            array[arrayOffset] = (byte) ((charAt3 >>> 12) | 480);
                            arrayOffset = i3 + 1;
                            array[i3] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i3 = arrayOffset + 1;
                            array[arrayOffset] = (byte) ((charAt3 & 63) | 128);
                        } else if (arrayOffset <= remaining - 4) {
                            i3 = i + 1;
                            if (i3 != charSequence.length()) {
                                charAt = charSequence.charAt(i3);
                                if (Character.isSurrogatePair(charAt3, charAt)) {
                                    i = Character.toCodePoint(charAt3, charAt);
                                    i2 = arrayOffset + 1;
                                    array[arrayOffset] = (byte) ((i >>> 18) | 240);
                                    arrayOffset = i2 + 1;
                                    array[i2] = (byte) (((i >>> 12) & 63) | 128);
                                    i2 = arrayOffset + 1;
                                    array[arrayOffset] = (byte) (((i >>> 6) & 63) | 128);
                                    arrayOffset = i2 + 1;
                                    array[i2] = (byte) ((i & 63) | 128);
                                    i = i3;
                                    i++;
                                } else {
                                    i = i3;
                                }
                            }
                            i--;
                            byteBuffer = new StringBuilder(39);
                            byteBuffer.append("Unpaired surrogate at index ");
                            byteBuffer.append(i);
                            throw new IllegalArgumentException(byteBuffer.toString());
                        } else {
                            StringBuilder stringBuilder = new StringBuilder(37);
                            stringBuilder.append("Failed writing ");
                            stringBuilder.append(charAt3);
                            stringBuilder.append(" at index ");
                            stringBuilder.append(arrayOffset);
                            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                        }
                        arrayOffset = i3;
                        i++;
                    }
                }
                byteBuffer.position(arrayOffset - byteBuffer.arrayOffset());
                return;
            } catch (CharSequence charSequence2) {
                byteBuffer = new BufferOverflowException();
                byteBuffer.initCause(charSequence2);
                throw byteBuffer;
            }
        }
        int length2 = charSequence2.length();
        while (i < length2) {
            char charAt4 = charSequence2.charAt(i);
            if (charAt4 < '') {
                byteBuffer.put((byte) charAt4);
            } else if (charAt4 < 'ࠀ') {
                byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                byteBuffer.put((byte) ((charAt4 & 63) | 128));
            } else {
                if (charAt4 >= '?') {
                    if ('?' >= charAt4) {
                        remaining = i + 1;
                        if (remaining != charSequence2.length()) {
                            charAt = charSequence2.charAt(remaining);
                            if (Character.isSurrogatePair(charAt4, charAt)) {
                                i = Character.toCodePoint(charAt4, charAt);
                                byteBuffer.put((byte) ((i >>> 18) | 240));
                                byteBuffer.put((byte) (((i >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((i >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((i & 63) | 128));
                                i = remaining;
                            } else {
                                i = remaining;
                            }
                        }
                        i--;
                        byteBuffer = new StringBuilder(39);
                        byteBuffer.append("Unpaired surrogate at index ");
                        byteBuffer.append(i);
                        throw new IllegalArgumentException(byteBuffer.toString());
                    }
                }
                byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt4 & 63) | 128));
            }
            i++;
        }
    }

    /* renamed from: c */
    public static int m10422c(int i, long j) {
        return m10415b(i) + m10409a(j);
    }

    /* renamed from: d */
    public static int m10424d(int i, long j) {
        return m10415b(i) + m10409a(j);
    }

    /* renamed from: b */
    public static int m10416b(int i, int i2) {
        return m10415b(i) + m10408a(i2);
    }

    /* renamed from: b */
    public static int m10418b(int i, String str) {
        return m10415b(i) + m10411a(str);
    }

    /* renamed from: b */
    public static int m10417b(int i, zzbgz zzbgz) {
        i = m10415b(i);
        zzbgz = zzbgz.m10455d();
        return i + (m10423d(zzbgz) + zzbgz);
    }

    /* renamed from: b */
    public static int m10419b(int i, byte[] bArr) {
        return m10415b(i) + m10420b(bArr);
    }

    /* renamed from: a */
    public static int m10408a(int i) {
        return i >= 0 ? m10423d(i) : 10;
    }

    /* renamed from: a */
    public static int m10411a(String str) {
        str = m10410a((CharSequence) str);
        return m10423d(str) + str;
    }

    /* renamed from: b */
    public static int m10420b(byte[] bArr) {
        return m10423d(bArr.length) + bArr.length;
    }

    /* renamed from: a */
    public final void m10426a() {
        if (this.f9248a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f9248a.remaining())}));
        }
    }

    /* renamed from: e */
    private final void m10425e(int i) {
        i = (byte) i;
        if (this.f9248a.hasRemaining()) {
            this.f9248a.put(i);
            return;
        }
        throw new zzbgs(this.f9248a.position(), this.f9248a.limit());
    }

    /* renamed from: c */
    public final void m10437c(byte[] bArr) {
        int length = bArr.length;
        if (this.f9248a.remaining() >= length) {
            this.f9248a.put(bArr, 0, length);
            return;
        }
        throw new zzbgs(this.f9248a.position(), this.f9248a.limit());
    }

    /* renamed from: c */
    public final void m10436c(int i, int i2) {
        m10435c((i << 3) | i2);
    }

    /* renamed from: b */
    public static int m10415b(int i) {
        return m10423d(i << 3);
    }

    /* renamed from: c */
    public final void m10435c(int i) {
        while ((i & -128) != 0) {
            m10425e((i & 127) | 128);
            i >>>= 7;
        }
        m10425e(i);
    }

    /* renamed from: b */
    private final void m10421b(long j) {
        while ((-128 & j) != 0) {
            m10425e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m10425e((int) j);
    }
}
