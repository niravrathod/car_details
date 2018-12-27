package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzaer
public final class zzaim extends RemoteCreator<zzaig> {
    public zzaim() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* renamed from: a */
    public final zzaid m21167a(Context context, zzyn zzyn) {
        try {
            context = ((zzaig) getRemoteCreatorInstance(context)).mo2265a(ObjectWrapper.m26019a((Object) context), zzyn, 13000000);
            if (context == null) {
                return null;
            }
            zzyn = context.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (zzyn instanceof zzaid) {
                return (zzaid) zzyn;
            }
            return new zzaif(context);
        } catch (Context context2) {
            zzaok.m10004c("Could not get remote RewardedVideoAd.", context2);
            return null;
        }
    }

    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof zzaig) {
            return (zzaig) queryLocalInterface;
        }
        return new zzaih(iBinder);
    }
}
