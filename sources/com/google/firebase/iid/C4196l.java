package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.l */
final class C4196l extends C2598m<Void> {
    C4196l(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* renamed from: a */
    final boolean mo3329a() {
        return true;
    }

    /* renamed from: a */
    final void mo3328a(Bundle bundle) {
        if (bundle.getBoolean("ack", false) != null) {
            m12752a((Object) null);
        } else {
            m12751a(new zzal(4, "Invalid response to one way request"));
        }
    }
}
