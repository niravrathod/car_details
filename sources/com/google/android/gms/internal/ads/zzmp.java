package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzaer
public final class zzmp extends RemoteCreator<zzlo> {
    public zzmp() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* renamed from: a */
    public final zzll m21784a(Context context) {
        try {
            context = ((zzlo) getRemoteCreatorInstance(context)).mo2548a(ObjectWrapper.m26019a((Object) context), 13000000);
            if (context == null) {
                return null;
            }
            IInterface queryLocalInterface = context.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzll) {
                return (zzll) queryLocalInterface;
            }
            return new zzln(context);
        } catch (Context context2) {
            zzaok.m10004c("Could not get remote MobileAdsSettingManager.", context2);
            return null;
        }
    }

    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzlo) {
            return (zzlo) queryLocalInterface;
        }
        return new zzlp(iBinder);
    }
}
