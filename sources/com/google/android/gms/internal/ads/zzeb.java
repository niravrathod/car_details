package com.google.android.gms.internal.ads;

public final class zzeb extends zzek {
    /* renamed from: d */
    private final boolean f17175d;

    public zzeb(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2) {
        super(zzdb, str, str2, zzbb, i, 61);
        this.f17175d = zzdb.m10517j();
    }

    /* renamed from: a */
    protected final void mo2435a() {
        long longValue = ((Long) this.c.invoke(null, new Object[]{this.a.m10504a(), Boolean.valueOf(this.f17175d)})).longValue();
        synchronized (this.b) {
            this.b.f19974P = Long.valueOf(longValue);
        }
    }
}
