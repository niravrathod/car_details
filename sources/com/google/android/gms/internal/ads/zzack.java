package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzack extends zzen implements zzacj {
    /* renamed from: a */
    public static zzacj m21080a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if (queryLocalInterface instanceof zzacj) {
            return (zzacj) queryLocalInterface;
        }
        return new zzacl(iBinder);
    }
}
