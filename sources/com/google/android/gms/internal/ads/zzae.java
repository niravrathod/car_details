package com.google.android.gms.internal.ads;

public class zzae extends Exception {
    private long zzad;
    private final zzp zzbj;

    public zzae() {
        this.zzbj = null;
    }

    public zzae(zzp zzp) {
        this.zzbj = zzp;
    }

    public zzae(String str) {
        super(str);
        this.zzbj = null;
    }

    public zzae(Throwable th) {
        super(th);
        this.zzbj = null;
    }

    /* renamed from: a */
    final void m9503a(long j) {
        this.zzad = j;
    }
}
