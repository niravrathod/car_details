package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzud implements Serializable, Iterable<Byte> {
    /* renamed from: a */
    public static final zzud f10195a = new zzum(zzvo.f10282b);
    /* renamed from: b */
    private static final ax f10196b = (as.m11494a() ? new az() : new aw());
    /* renamed from: c */
    private static final Comparator<zzud> f10197c = new av();
    private int zzbry = 0;

    zzud() {
    }

    /* renamed from: b */
    private static int m12009b(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public abstract byte mo4350a(int i);

    /* renamed from: a */
    public abstract int mo4351a();

    /* renamed from: a */
    protected abstract int mo4352a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract zzud mo4353a(int i, int i2);

    /* renamed from: a */
    protected abstract String mo4354a(Charset charset);

    /* renamed from: a */
    abstract void mo4355a(zzuc zzuc);

    /* renamed from: c */
    public abstract boolean mo4357c();

    public abstract boolean equals(Object obj);

    /* renamed from: a */
    public static zzud m12008a(byte[] bArr, int i, int i2) {
        m12010b(i, i + i2, bArr.length);
        return new zzum(f10196b.mo2926a(bArr, i, i2));
    }

    /* renamed from: a */
    static zzud m12007a(byte[] bArr) {
        return new zzum(bArr);
    }

    /* renamed from: a */
    public static zzud m12006a(String str) {
        return new zzum(str.getBytes(zzvo.f10281a));
    }

    /* renamed from: b */
    public final String m12018b() {
        return mo4351a() == 0 ? "" : mo4354a(zzvo.f10281a);
    }

    public final int hashCode() {
        int i = this.zzbry;
        if (i == 0) {
            i = mo4351a();
            i = mo4352a(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.zzbry = i;
        }
        return i;
    }

    /* renamed from: b */
    static ay m12011b(int i) {
        return new ay(i);
    }

    /* renamed from: d */
    protected final int m12020d() {
        return this.zzbry;
    }

    /* renamed from: b */
    static int m12010b(int i, int i2, int i3) {
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
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo4351a())});
    }

    public /* synthetic */ Iterator iterator() {
        return new au(this);
    }
}
