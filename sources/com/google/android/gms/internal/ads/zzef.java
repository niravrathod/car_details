package com.google.android.gms.internal.ads;

public final class zzef extends zzek {
    /* renamed from: d */
    private static volatile Long f17179d;
    /* renamed from: e */
    private static final Object f17180e = new Object();

    public zzef(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2) {
        super(zzdb, str, str2, zzbb, i, 33);
    }

    /* renamed from: a */
    protected final void mo2435a() {
        if (f17179d == null) {
            synchronized (f17180e) {
                if (f17179d == null) {
                    f17179d = (Long) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f20001r = f17179d;
        }
    }
}
