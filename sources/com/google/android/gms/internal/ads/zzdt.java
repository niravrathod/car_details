package com.google.android.gms.internal.ads;

public final class zzdt extends zzek {
    /* renamed from: d */
    private long f17168d;

    public zzdt(zzdb zzdb, String str, String str2, zzbb zzbb, long j, int i, int i2) {
        super(zzdb, str, str2, zzbb, i, 25);
        this.f17168d = j;
    }

    /* renamed from: a */
    protected final void mo2435a() {
        long longValue = ((Long) this.c.invoke(null, new Object[0])).longValue();
        synchronized (this.b) {
            this.b.f19982X = Long.valueOf(longValue);
            if (this.f17168d != 0) {
                this.b.f19993j = Long.valueOf(longValue - this.f17168d);
                this.b.f19996m = Long.valueOf(this.f17168d);
            }
        }
    }
}
