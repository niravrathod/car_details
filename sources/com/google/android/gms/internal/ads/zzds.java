package com.google.android.gms.internal.ads;

public final class zzds extends zzek {
    /* renamed from: d */
    private static volatile Long f17166d;
    /* renamed from: e */
    private static final Object f17167e = new Object();

    public zzds(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2) {
        super(zzdb, str, str2, zzbb, i, 44);
    }

    /* renamed from: a */
    protected final void mo2435a() {
        if (f17166d == null) {
            synchronized (f17167e) {
                if (f17166d == null) {
                    f17166d = (Long) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f19959A = f17166d;
        }
    }
}
