package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzac;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;

@zzaer
public final class zzhn extends zzac<zzhr> {
    @VisibleForTesting
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @VisibleForTesting
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    zzhn(Context context, Looper looper, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzaht.m9573a(context), looper, 123, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    /* renamed from: a */
    public final zzhr m26574a() {
        return (zzhr) super.getService();
    }

    @VisibleForTesting
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        if (queryLocalInterface instanceof zzhr) {
            return (zzhr) queryLocalInterface;
        }
        return new zzhs(iBinder);
    }
}
