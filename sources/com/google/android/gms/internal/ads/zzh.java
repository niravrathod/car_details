package com.google.android.gms.internal.ads;

public final class zzh implements zzab {
    /* renamed from: a */
    private int f17209a;
    /* renamed from: b */
    private int f17210b;
    /* renamed from: c */
    private final int f17211c;
    /* renamed from: d */
    private final float f17212d;

    public zzh() {
        this(2500, 1, 1.0f);
    }

    private zzh(int i, int i2, float f) {
        this.f17209a = 2500;
        this.f17211c = 1;
        this.f17212d = 1065353216;
    }

    /* renamed from: a */
    public final int mo2453a() {
        return this.f17209a;
    }

    /* renamed from: b */
    public final int mo2455b() {
        return this.f17210b;
    }

    /* renamed from: a */
    public final void mo2454a(zzae zzae) {
        int i = 1;
        this.f17210b++;
        this.f17209a += (int) (((float) this.f17209a) * this.f17212d);
        if (this.f17210b > this.f17211c) {
            i = 0;
        }
        if (i == 0) {
            throw zzae;
        }
    }
}
