package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;

final class qr implements BaseConnectionCallbacks {
    /* renamed from: a */
    private final /* synthetic */ zzhg f16619a;

    qr(zzhg zzhg) {
        this.f16619a = zzhg;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.f16619a.f9532b) {
            try {
                if (this.f16619a.f9533c != null) {
                    this.f16619a.f9535e = this.f16619a.f9533c.m26574a();
                }
            } catch (Throwable e) {
                zzaok.m10002b("Unable to obtain a cache service instance.", e);
                this.f16619a.m10670c();
            }
            this.f16619a.f9532b.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i) {
        synchronized (this.f16619a.f9532b) {
            this.f16619a.f9535e = null;
            this.f16619a.f9532b.notifyAll();
        }
    }
}
