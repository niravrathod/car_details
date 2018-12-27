package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzac;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

public final class zzavf extends zzac<zzavk> {
    public zzavf(Context context, Looper looper, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(context, looper, 116, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    protected final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    protected final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    /* renamed from: a */
    public final zzavk m26377a() {
        return (zzavk) super.getService();
    }

    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof zzavk) {
            return (zzavk) queryLocalInterface;
        }
        return new zzavl(iBinder);
    }
}
