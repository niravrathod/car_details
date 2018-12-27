package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

@zzaer
final class to {
    /* renamed from: a */
    private final List<un> f8396a = new ArrayList();

    to() {
    }

    /* renamed from: a */
    final void m9382a(uo uoVar) {
        Handler handler = zzalo.f8872a;
        for (un umVar : this.f8396a) {
            handler.post(new um(this, umVar, uoVar));
        }
        this.f8396a.clear();
    }
}
