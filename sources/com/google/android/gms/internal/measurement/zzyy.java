package com.google.android.gms.internal.measurement;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzyy {
    /* renamed from: a */
    private final ByteBuffer f10349a;
    /* renamed from: b */
    private zzut f10350b;
    /* renamed from: c */
    private int f10351c;

    private zzyy(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static int m12149a(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: d */
    public static int m12162d(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    private zzyy(ByteBuffer byteBuffer) {
        this.f10349a = byteBuffer;
        this.f10349a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static zzyy m12152a(byte[] bArr) {
        return m12153a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static zzyy m12153a(byte[] bArr, int i, int i2) {
        return new zzyy(bArr, 0, i2);
    }

    /* renamed from: b */
    private final zzut m12159b() {
        if (this.f10350b == null) {
            this.f10350b = zzut.m22544a(this.f10349a);
            this.f10351c = this.f10349a.position();
        } else if (this.f10351c != this.f10349a.position()) {
            this.f10350b.mo4380b(this.f10349a.array(), this.f10351c, this.f10349a.position() - this.f10351c);
            this.f10351c = this.f10349a.position();
        }
        return this.f10350b;
    }

    /* renamed from: a */
    public final void m12165a(int i, double d) {
        m12177c(i, 1);
        i = Double.doubleToLongBits(d);
        if (this.f10349a.remaining() >= 8) {
            this.f10349a.putLong(i);
            return;
        }
        throw new zzyz(this.f10349a.position(), this.f10349a.limit());
    }

    /* renamed from: a */
    public final void m12166a(int i, float f) {
        m12177c(i, 5);
        i = Float.floatToIntBits(f);
        if (this.f10349a.remaining() >= 4) {
            this.f10349a.putInt(i);
            return;
        }
        throw new zzyz(this.f10349a.position(), this.f10349a.limit());
    }

    /* renamed from: a */
    public final void m12168a(int i, long j) {
        m12177c(i, 0);
        m12160b(j);
    }

    /* renamed from: b */
    public final void m12174b(int i, long j) {
        m12177c(i, 0);
        m12160b(j);
    }

    /* renamed from: a */
    public final void m12167a(int i, int i2) {
        m12177c(i, 0);
        if (i2 >= 0) {
            m12176c(i2);
        } else {
            m12160b((long) i2);
        }
    }

    /* renamed from: a */
    public final void m12172a(int i, boolean z) {
        m12177c(i, 0);
        i = (byte) z;
        if (this.f10349a.hasRemaining()) {
            this.f10349a.put(i);
            return;
        }
        throw new zzyz(this.f10349a.position(), this.f10349a.limit());
    }

    /* renamed from: a */
    public final void m12171a(int i, String str) {
        m12177c(i, 2);
        try {
            i = m12162d(str.length());
            if (i == m12162d(str.length() * 3)) {
                int position = this.f10349a.position();
                if (this.f10349a.remaining() >= i) {
                    this.f10349a.position(position + i);
                    m12154a((CharSequence) str, this.f10349a);
                    str = this.f10349a.position();
                    this.f10349a.position(position);
                    m12176c((str - position) - i);
                    this.f10349a.position(str);
                    return;
                }
                throw new zzyz(position + i, this.f10349a.limit());
            }
            m12176c(m12150a((CharSequence) str));
            m12154a((CharSequence) str, this.f10349a);
        } catch (int i2) {
            str = new zzyz(this.f10349a.position(), this.f10349a.limit());
            str.initCause(i2);
            throw str;
        }
    }

    /* renamed from: a */
    public final void m12170a(int i, zzzg zzzg) {
        m12177c(i, 2);
        m12173a(zzzg);
    }

    /* renamed from: a */
    public final void m12169a(int i, zzwt zzwt) {
        zzut b = m12159b();
        b.mo4365a(i, zzwt);
        b.mo4359a();
        this.f10351c = this.f10349a.position();
    }

    /* renamed from: a */
    private static int m12150a(CharSequence charSequence) {
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
    private static void m12154a(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    /* renamed from: a */
    public final void m12173a(zzzg zzzg) {
        m12176c(zzzg.m12202d());
        zzzg.mo3160a(this);
    }

    /* renamed from: c */
    public static int m12161c(int i, long j) {
        return m12155b(i) + m12149a(j);
    }

    /* renamed from: b */
    public static int m12156b(int i, int i2) {
        return m12155b(i) + m12148a(i2);
    }

    /* renamed from: b */
    public static int m12158b(int i, String str) {
        return m12155b(i) + m12151a(str);
    }

    /* renamed from: b */
    public static int m12157b(int i, zzzg zzzg) {
        i = m12155b(i);
        zzzg = zzzg.m12203e();
        return i + (m12162d(zzzg) + zzzg);
    }

    /* renamed from: a */
    public static int m12148a(int i) {
        return i >= 0 ? m12162d(i) : 10;
    }

    /* renamed from: a */
    public static int m12151a(String str) {
        str = m12150a((CharSequence) str);
        return m12162d(str) + str;
    }

    /* renamed from: a */
    public final void m12164a() {
        if (this.f10349a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f10349a.remaining())}));
        }
    }

    /* renamed from: e */
    private final void m12163e(int i) {
        i = (byte) i;
        if (this.f10349a.hasRemaining()) {
            this.f10349a.put(i);
            return;
        }
        throw new zzyz(this.f10349a.position(), this.f10349a.limit());
    }

    /* renamed from: b */
    public final void m12175b(byte[] bArr) {
        int length = bArr.length;
        if (this.f10349a.remaining() >= length) {
            this.f10349a.put(bArr, 0, length);
            return;
        }
        throw new zzyz(this.f10349a.position(), this.f10349a.limit());
    }

    /* renamed from: c */
    public final void m12177c(int i, int i2) {
        m12176c((i << 3) | i2);
    }

    /* renamed from: b */
    public static int m12155b(int i) {
        return m12162d(i << 3);
    }

    /* renamed from: c */
    public final void m12176c(int i) {
        while ((i & -128) != 0) {
            m12163e((i & 127) | 128);
            i >>>= 7;
        }
        m12163e(i);
    }

    /* renamed from: b */
    private final void m12160b(long j) {
        while ((-128 & j) != 0) {
            m12163e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m12163e((int) j);
    }
}
