package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzaer
public final class zzji extends RemoteCreator<zzkx> {
    @VisibleForTesting
    public zzji() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public final zzku m21743a(Context context, zzjo zzjo, String str, zzyn zzyn, int i) {
        try {
            context = ((zzkx) getRemoteCreatorInstance(context)).mo2521a(ObjectWrapper.m26019a((Object) context), zzjo, str, zzyn, 13000000, i);
            if (context == null) {
                return null;
            }
            zzjo = context.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if ((zzjo instanceof zzku) != null) {
                return (zzku) zzjo;
            }
            return new zzkw(context);
        } catch (Context context2) {
            zzaok.m9999a("Could not create remote AdManager.", context2);
            return null;
        }
    }

    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzkx) {
            return (zzkx) queryLocalInterface;
        }
        return new zzky(iBinder);
    }
}
