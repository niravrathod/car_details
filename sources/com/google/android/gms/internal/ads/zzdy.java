package com.google.android.gms.internal.ads;

public final class zzdy extends zzek {
    /* renamed from: d */
    private static volatile String f17172d;
    /* renamed from: e */
    private static final Object f17173e = new Object();

    public zzdy(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2) {
        super(zzdb, str, str2, zzbb, i, 1);
    }

    /* renamed from: a */
    protected final void mo2435a() {
        this.b.f19984a = "E";
        if (f17172d == null) {
            synchronized (f17173e) {
                if (f17172d == null) {
                    f17172d = (String) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f19984a = f17172d;
        }
    }
}
