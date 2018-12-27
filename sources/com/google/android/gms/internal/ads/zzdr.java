package com.google.android.gms.internal.ads;

public final class zzdr extends zzek {
    public zzdr(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2) {
        super(zzdb, str, str2, zzbb, i, 5);
    }

    /* renamed from: a */
    protected final void mo2435a() {
        this.b.f19987d = Long.valueOf(-1);
        this.b.f19988e = Long.valueOf(-1);
        int[] iArr = (int[]) this.c.invoke(null, new Object[]{this.a.m10504a()});
        synchronized (this.b) {
            this.b.f19987d = Long.valueOf((long) iArr[0]);
            this.b.f19988e = Long.valueOf((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.b.f19972N = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
