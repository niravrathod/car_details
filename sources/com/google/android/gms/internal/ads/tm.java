package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;

final class tm implements BaseConnectionCallbacks {
    /* renamed from: a */
    private final /* synthetic */ zzaps f16680a;
    /* renamed from: b */
    private final /* synthetic */ zztc f16681b;

    tm(zztc zztc, zzaps zzaps) {
        this.f16681b = zztc;
        this.f16680a = zzaps;
    }

    public final void onConnected(Bundle bundle) {
        try {
            this.f16680a.m21290b(this.f16681b.f17335a.m26848a());
        } catch (Bundle bundle2) {
            this.f16680a.m21289a(bundle2);
        }
    }

    public final void onConnectionSuspended(int i) {
        zzaps zzaps = this.f16680a;
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("onConnectionSuspended: ");
        stringBuilder.append(i);
        zzaps.m21289a(new RuntimeException(stringBuilder.toString()));
    }
}
