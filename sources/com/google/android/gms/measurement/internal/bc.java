package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class bc implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ boolean f10488a;
    /* renamed from: b */
    private final /* synthetic */ zzdn f10489b;
    /* renamed from: c */
    private final /* synthetic */ zzdn f10490c;
    /* renamed from: d */
    private final /* synthetic */ zzdo f10491d;

    bc(zzdo zzdo, boolean z, zzdn zzdn, zzdn zzdn2) {
        this.f10491d = zzdo;
        this.f10488a = z;
        this.f10489b = zzdn;
        this.f10490c = zzdn2;
    }

    public final void run() {
        Object obj;
        Bundle bundle;
        if (this.f10488a && this.f10491d.f21649a != null) {
            this.f10491d.m29621a(this.f10491d.f21649a);
        }
        if (this.f10489b != null && this.f10489b.f10781c == this.f10490c.f10781c && zzfk.m28604c(this.f10489b.f10780b, this.f10490c.f10780b)) {
            if (zzfk.m28604c(this.f10489b.f10779a, this.f10490c.f10779a)) {
                obj = null;
                if (obj != null) {
                    bundle = new Bundle();
                    zzdo.m29622a(this.f10490c, bundle, true);
                    if (this.f10489b != null) {
                        if (this.f10489b.f10779a != null) {
                            bundle.putString("_pn", this.f10489b.f10779a);
                        }
                        bundle.putString("_pc", this.f10489b.f10780b);
                        bundle.putLong("_pi", this.f10489b.f10781c);
                    }
                    this.f10491d.mo4842f().m29594b("auto", "_vs", bundle);
                }
                this.f10491d.f21649a = this.f10490c;
                this.f10491d.mo4844h().m29677a(this.f10490c);
            }
        }
        obj = 1;
        if (obj != null) {
            bundle = new Bundle();
            zzdo.m29622a(this.f10490c, bundle, true);
            if (this.f10489b != null) {
                if (this.f10489b.f10779a != null) {
                    bundle.putString("_pn", this.f10489b.f10779a);
                }
                bundle.putString("_pc", this.f10489b.f10780b);
                bundle.putLong("_pi", this.f10489b.f10781c);
            }
            this.f10491d.mo4842f().m29594b("auto", "_vs", bundle);
        }
        this.f10491d.f21649a = this.f10490c;
        this.f10491d.mo4844h().m29677a(this.f10490c);
    }
}
