package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzaer
public final class zzjh extends RemoteCreator<zzks> {
    public zzjh() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public final zzkp m21742a(Context context, String str, zzyn zzyn) {
        try {
            context = ((zzks) getRemoteCreatorInstance(context)).mo2486a(ObjectWrapper.m26019a((Object) context), str, zzyn, 13000000);
            if (context == null) {
                return null;
            }
            str = context.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if ((str instanceof zzkp) != null) {
                return (zzkp) str;
            }
            return new zzkr(context);
        } catch (Context context2) {
            zzaok.m10004c("Could not create remote builder for AdLoader.", context2);
            return null;
        }
    }

    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzks) {
            return (zzks) queryLocalInterface;
        }
        return new zzkt(iBinder);
    }
}
