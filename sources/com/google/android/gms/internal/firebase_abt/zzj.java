package com.google.android.gms.internal.firebase_abt;

public abstract class zzj {
    /* renamed from: b */
    protected volatile int f10015b = -1;

    /* renamed from: a */
    public static final <T extends zzj> T m11481a(T t, byte[] bArr, int i, int i2) {
        try {
            zza a = zza.m11453a(bArr, 0, i2);
            t.mo4338a(a);
            a.m11458a(0);
            return t;
        } catch (zzi e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* renamed from: a */
    public zzj mo2916a() {
        return (zzj) super.clone();
    }

    /* renamed from: a */
    public abstract zzj mo4338a(zza zza);

    public /* synthetic */ Object clone() {
        return mo2916a();
    }

    public String toString() {
        return zzk.m11484a(this);
    }
}
