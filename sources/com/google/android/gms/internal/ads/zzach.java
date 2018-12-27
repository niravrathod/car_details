package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzach extends zzen implements zzacg {
    /* renamed from: a */
    public static zzacg m21079a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        if (queryLocalInterface instanceof zzacg) {
            return (zzacg) queryLocalInterface;
        }
        return new zzaci(iBinder);
    }
}
