package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzace extends zzen implements zzacd {
    /* renamed from: a */
    public static zzacd m21078a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (queryLocalInterface instanceof zzacd) {
            return (zzacd) queryLocalInterface;
        }
        return new zzacf(iBinder);
    }
}
