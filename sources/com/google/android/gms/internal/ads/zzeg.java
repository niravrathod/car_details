package com.google.android.gms.internal.ads;

public final class zzeg extends zzek {
    public zzeg(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2) {
        super(zzdb, str, str2, zzbb, i, 48);
    }

    /* renamed from: a */
    protected final void mo2435a() {
        this.b.f19963E = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.c.invoke(null, new Object[]{this.a.m10504a()})).booleanValue();
        synchronized (this.b) {
            if (booleanValue) {
                this.b.f19963E = Integer.valueOf(1);
            } else {
                this.b.f19963E = Integer.valueOf(0);
            }
        }
    }
}
