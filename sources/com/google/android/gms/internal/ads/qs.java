package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

final class qs implements BaseOnConnectionFailedListener {
    /* renamed from: a */
    private final /* synthetic */ zzhg f16620a;

    qs(zzhg zzhg) {
        this.f16620a = zzhg;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.f16620a.f9532b) {
            this.f16620a.f9535e = null;
            if (this.f16620a.f9533c != null) {
                this.f16620a.f9533c = null;
            }
            this.f16620a.f9532b.notifyAll();
        }
    }
}
