package com.google.android.gms.internal.config;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzaz {
    /* renamed from: a */
    private final ByteBuffer f9948a;

    private zzaz(ByteBuffer byteBuffer) {
        this.f9948a = byteBuffer;
        this.f9948a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzaz(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static int m11378a(int i) {
        return i >= 0 ? m11388d(i) : 10;
    }

    /* renamed from: a */
    private static int m11379a(CharSequence charSequence) {
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
    public static zzaz m11380a(byte[] bArr) {
        return m11381a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static zzaz m11381a(byte[] bArr, int i, int i2) {
        return new zzaz(bArr, 0, i2);
    }

    /* renamed from: a */
    private static void m11382a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        int i = 0;
        int arrayOffset;
        int remaining;
        char charAt;
        if (byteBuffer.hasArray()) {
            try {
                int i2;
                byte[] array = byteBuffer.array();
                arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
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
                            StringBuilder stringBuilder = new StringBuilder(39);
                            stringBuilder.append("Unpaired surrogate at index ");
                            stringBuilder.append(i);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else {
                            StringBuilder stringBuilder2 = new StringBuilder(37);
                            stringBuilder2.append("Failed writing ");
                            stringBuilder2.append(charAt3);
                            stringBuilder2.append(" at index ");
                            stringBuilder2.append(arrayOffset);
                            throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
                        }
                        arrayOffset = i3;
                        i++;
                    }
                }
                byteBuffer.position(arrayOffset - byteBuffer.arrayOffset());
                return;
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        }
        int length2 = charSequence.length();
        while (i < length2) {
            arrayOffset = charSequence.charAt(i);
            if (arrayOffset >= 128) {
                if (arrayOffset < 2048) {
                    remaining = (arrayOffset >>> 6) | 960;
                } else {
                    if (arrayOffset >= 55296) {
                        if (57343 >= arrayOffset) {
                            remaining = i + 1;
                            if (remaining != charSequence.length()) {
                                charAt = charSequence.charAt(remaining);
                                if (Character.isSurrogatePair(arrayOffset, charAt)) {
                                    i = Character.toCodePoint(arrayOffset, charAt);
                                    byteBuffer.put((byte) ((i >>> 18) | 240));
                                    byteBuffer.put((byte) (((i >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((i >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((i & 63) | 128));
                                    i = remaining;
                                    i++;
                                } else {
                                    i = remaining;
                                }
                            }
                            i--;
                            stringBuilder = new StringBuilder(39);
                            stringBuilder.append("Unpaired surrogate at index ");
                            stringBuilder.append(i);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    byteBuffer.put((byte) ((arrayOffset >>> 12) | 480));
                    remaining = ((arrayOffset >>> 6) & 63) | 128;
                }
                byteBuffer.put((byte) remaining);
                arrayOffset = (arrayOffset & 63) | 128;
            }
            byteBuffer.put((byte) arrayOffset);
            i++;
        }
    }

    /* renamed from: b */
    public static int m11383b(int i) {
        return m11388d(i << 3);
    }

    /* renamed from: b */
    public static int m11384b(int i, int i2) {
        return m11383b(1) + m11378a(i2);
    }

    /* renamed from: b */
    public static int m11385b(int i, zzbh zzbh) {
        i = m11383b(i);
        int d = zzbh.m11419d();
        return i + (m11388d(d) + d);
    }

    /* renamed from: b */
    public static int m11386b(int i, String str) {
        i = m11383b(i);
        int a = m11379a((CharSequence) str);
        return i + (m11388d(a) + a);
    }

    /* renamed from: b */
    public static int m11387b(byte[] bArr) {
        return m11388d(bArr.length) + bArr.length;
    }

    /* renamed from: d */
    public static int m11388d(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: e */
    private final void m11389e(int i) {
        byte b = (byte) i;
        if (this.f9948a.hasRemaining()) {
            this.f9948a.put(b);
            return;
        }
        throw new zzba(this.f9948a.position(), this.f9948a.limit());
    }

    /* renamed from: a */
    public final void m11390a() {
        if (this.f9948a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f9948a.remaining())}));
        }
    }

    /* renamed from: a */
    public final void m11391a(byte b) {
        if (this.f9948a.hasRemaining()) {
            this.f9948a.put(b);
            return;
        }
        throw new zzba(this.f9948a.position(), this.f9948a.limit());
    }

    /* renamed from: a */
    public final void m11392a(int i, int i2) {
        m11398c(1, 0);
        if (i2 >= 0) {
            m11397c(i2);
            return;
        }
        long j = (long) i2;
        while ((-128 & j) != 0) {
            byte b = (byte) ((((int) j) & 127) | 128);
            if (this.f9948a.hasRemaining()) {
                this.f9948a.put(b);
                j >>>= 7;
            } else {
                throw new zzba(this.f9948a.position(), this.f9948a.limit());
            }
        }
        byte b2 = (byte) ((int) j);
        if (this.f9948a.hasRemaining()) {
            this.f9948a.put(b2);
            return;
        }
        throw new zzba(this.f9948a.position(), this.f9948a.limit());
    }

    /* renamed from: a */
    public final void m11393a(int i, long j) {
        m11398c(i, 1);
        if (this.f9948a.remaining() >= 8) {
            this.f9948a.putLong(j);
            return;
        }
        throw new zzba(this.f9948a.position(), this.f9948a.limit());
    }

    /* renamed from: a */
    public final void m11394a(int i, zzbh zzbh) {
        m11398c(i, 2);
        if (zzbh.f9959g < 0) {
            zzbh.m11419d();
        }
        m11397c(zzbh.f9959g);
        zzbh.mo2912a(this);
    }

    /* renamed from: a */
    public final void m11395a(int i, String str) {
        m11398c(i, 2);
        try {
            i = m11388d(str.length());
            if (i == m11388d(str.length() * 3)) {
                int position = this.f9948a.position();
                if (this.f9948a.remaining() >= i) {
                    this.f9948a.position(position + i);
                    m11382a((CharSequence) str, this.f9948a);
                    int position2 = this.f9948a.position();
                    this.f9948a.position(position);
                    m11397c((position2 - position) - i);
                    this.f9948a.position(position2);
                    return;
                }
                throw new zzba(position + i, this.f9948a.limit());
            }
            m11397c(m11379a((CharSequence) str));
            m11382a((CharSequence) str, this.f9948a);
        } catch (Throwable e) {
            zzba zzba = new zzba(this.f9948a.position(), this.f9948a.limit());
            zzba.initCause(e);
            throw zzba;
        }
    }

    /* renamed from: a */
    public final void m11396a(int i, byte[] bArr) {
        m11398c(i, 2);
        m11397c(bArr.length);
        m11399c(bArr);
    }

    /* renamed from: c */
    public final void m11397c(int i) {
        while ((i & -128) != 0) {
            m11389e((i & 127) | 128);
            i >>>= 7;
        }
        m11389e(i);
    }

    /* renamed from: c */
    public final void m11398c(int i, int i2) {
        m11397c((i << 3) | i2);
    }

    /* renamed from: c */
    public final void m11399c(byte[] bArr) {
        int length = bArr.length;
        if (this.f9948a.remaining() >= length) {
            this.f9948a.put(bArr, 0, length);
            return;
        }
        throw new zzba(this.f9948a.position(), this.f9948a.limit());
    }
}
