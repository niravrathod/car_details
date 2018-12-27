package com.google.android.gms.internal.ads;

public final class zzee extends zzek {
    /* renamed from: d */
    private final zzdk f17177d;
    /* renamed from: e */
    private long f17178e;

    public zzee(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2, zzdk zzdk) {
        super(zzdb, str, str2, zzbb, i, 53);
        this.f17177d = zzdk;
        if (zzdk != null) {
            this.f17178e = zzdk.m10535a();
        }
    }

    /* renamed from: a */
    protected final void mo2435a() {
        if (this.f17177d != null) {
            this.b.f19967I = (Long) this.c.invoke(null, new Object[]{Long.valueOf(this.f17178e)});
        }
    }
}
