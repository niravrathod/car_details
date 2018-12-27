package com.google.android.gms.internal.ads;

public final class zzdw extends zzek {
    /* renamed from: d */
    private static volatile Long f17169d;
    /* renamed from: e */
    private static final Object f17170e = new Object();

    public zzdw(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2) {
        super(zzdb, str, str2, zzbb, i, 22);
    }

    /* renamed from: a */
    protected final void mo2435a() {
        if (f17169d == null) {
            synchronized (f17170e) {
                if (f17169d == null) {
                    f17169d = (Long) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f19995l = f17169d;
        }
    }
}
