package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzbbu implements Serializable, Iterable<Byte> {
    /* renamed from: a */
    public static final zzbbu f9094a = new zzbcd(zzbdf.f9181b);
    /* renamed from: b */
    private static final kn f9095b = (kg.m8958a() ? new kp() : new km());
    /* renamed from: c */
    private static final Comparator<zzbbu> f9096c = new kl();
    private int zzdso = 0;

    zzbbu() {
    }

    /* renamed from: b */
    private static int m10262b(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public abstract byte mo4214a(int i);

    /* renamed from: a */
    public abstract int mo4215a();

    /* renamed from: a */
    protected abstract int mo4216a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract zzbbu mo4217a(int i, int i2);

    /* renamed from: a */
    protected abstract String mo4218a(Charset charset);

    /* renamed from: a */
    abstract void mo4219a(zzbbt zzbbt);

    /* renamed from: a */
    protected abstract void mo4220a(byte[] bArr, int i, int i2, int i3);

    /* renamed from: d */
    public abstract boolean mo4222d();

    /* renamed from: e */
    public abstract zzbcf mo4223e();

    public abstract boolean equals(Object obj);

    /* renamed from: a */
    public static zzbbu m10261a(byte[] bArr, int i, int i2) {
        m10263b(i, i + i2, bArr.length);
        return new zzbcd(f9095b.mo1972a(bArr, i, i2));
    }

    /* renamed from: a */
    public static zzbbu m10260a(byte[] bArr) {
        return m10261a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    static zzbbu m10265b(byte[] bArr) {
        return new zzbcd(bArr);
    }

    /* renamed from: a */
    public static zzbbu m10259a(String str) {
        return new zzbcd(str.getBytes(zzbdf.f9180a));
    }

    /* renamed from: b */
    public final byte[] m10273b() {
        int a = mo4215a();
        if (a == 0) {
            return zzbdf.f9181b;
        }
        byte[] bArr = new byte[a];
        mo4220a(bArr, 0, 0, a);
        return bArr;
    }

    /* renamed from: c */
    public final String m10274c() {
        return mo4215a() == 0 ? "" : mo4218a(zzbdf.f9180a);
    }

    public final int hashCode() {
        int i = this.zzdso;
        if (i == 0) {
            i = mo4215a();
            i = mo4216a(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.zzdso = i;
        }
        return i;
    }

    /* renamed from: b */
    static ko m10264b(int i) {
        return new ko(i);
    }

    /* renamed from: f */
    protected final int m10277f() {
        return this.zzdso;
    }

    /* renamed from: b */
    static int m10263b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((((i | i2) | i4) | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(i);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else if (i2 < i) {
            r1 = new StringBuilder(66);
            r1.append("Beginning index larger than ending index: ");
            r1.append(i);
            r1.append(", ");
            r1.append(i2);
            throw new IndexOutOfBoundsException(r1.toString());
        } else {
            r1 = new StringBuilder(37);
            r1.append("End index: ");
            r1.append(i2);
            r1.append(" >= ");
            r1.append(i3);
            throw new IndexOutOfBoundsException(r1.toString());
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo4215a())});
    }

    public /* synthetic */ Iterator iterator() {
        return new kk(this);
    }
}
