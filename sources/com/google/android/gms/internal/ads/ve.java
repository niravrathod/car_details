package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.common.util.Predicate;

final /* synthetic */ class ve implements Predicate {
    /* renamed from: a */
    private final zzu f16690a;

    ve(zzu zzu) {
        this.f16690a = zzu;
    }

    public final boolean apply(Object obj) {
        zzu zzu = (zzu) obj;
        return (!(zzu instanceof vj) || ((vj) zzu).f16692a.equals(this.f16690a) == null) ? null : true;
    }
}
