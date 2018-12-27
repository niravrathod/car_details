package com.google.android.gms.internal.ads;

public abstract class zzbgz {
    protected volatile int aa = -1;

    /* renamed from: a */
    protected int mo2428a() {
        return 0;
    }

    /* renamed from: a */
    public abstract zzbgz mo4209a(zzbgq zzbgq);

    /* renamed from: a */
    public void mo2429a(zzbgr zzbgr) {
    }

    /* renamed from: d */
    public final int m10455d() {
        int a = mo2428a();
        this.aa = a;
        return a;
    }

    /* renamed from: a */
    public static final byte[] m10450a(zzbgz zzbgz) {
        byte[] bArr = new byte[zzbgz.m10455d()];
        try {
            zzbgr a = zzbgr.m10413a(bArr, 0, bArr.length);
            zzbgz.mo2429a(a);
            a.m10426a();
            return bArr;
        } catch (zzbgz zzbgz2) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", zzbgz2);
        }
    }

    /* renamed from: a */
    public static final <T extends zzbgz> T m10448a(T t, byte[] bArr) {
        return m10449a(t, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private static final <T extends zzbgz> T m10449a(T t, byte[] bArr, int i, int i2) {
        try {
            zzbgq a = zzbgq.m10385a(bArr, 0, i2);
            t.mo4209a(a);
            a.m10391a(0);
            return t;
        } catch (T t2) {
            throw t2;
        } catch (T t22) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", t22);
        }
    }

    public String toString() {
        return zzbha.m10456a(this);
    }

    /* renamed from: c */
    public zzbgz mo2430c() {
        return (zzbgz) super.clone();
    }

    public /* synthetic */ Object clone() {
        return mo2430c();
    }
}
