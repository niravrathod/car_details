package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

final class tn implements BaseOnConnectionFailedListener {
    /* renamed from: a */
    private final /* synthetic */ zzaps f16682a;

    tn(zztc zztc, zzaps zzaps) {
        this.f16682a = zzaps;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f16682a.m21289a(new RuntimeException("Connection failed."));
    }
}
