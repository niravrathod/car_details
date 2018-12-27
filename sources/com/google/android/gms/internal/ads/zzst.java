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
public final class zzst extends zzac<zzta> {
    @VisibleForTesting
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @VisibleForTesting
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    zzst(Context context, Looper looper, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzaht.m9573a(context), looper, 166, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    /* renamed from: a */
    public final zzta m26848a() {
        return (zzta) super.getService();
    }

    @VisibleForTesting
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        if (queryLocalInterface instanceof zzta) {
            return (zzta) queryLocalInterface;
        }
        return new zztb(iBinder);
    }
}
