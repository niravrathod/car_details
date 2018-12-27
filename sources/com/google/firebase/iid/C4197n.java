package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.n */
final class C4197n extends C2598m<Bundle> {
    C4197n(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* renamed from: a */
    final boolean mo3329a() {
        return false;
    }

    /* renamed from: a */
    final void mo3328a(Bundle bundle) {
        Object bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m12752a(bundle2);
    }
}
