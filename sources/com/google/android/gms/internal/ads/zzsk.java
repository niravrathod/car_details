package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

@zzaer
public final class zzsk extends RemoteCreator<zzqw> {
    @VisibleForTesting
    public zzsk() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final zzqt m21960a(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        try {
            view = ((zzqw) getRemoteCreatorInstance(view.getContext())).mo2628a(ObjectWrapper.m26019a((Object) view), ObjectWrapper.m26019a((Object) hashMap), ObjectWrapper.m26019a((Object) hashMap2));
            if (view == null) {
                return null;
            }
            hashMap = view.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if ((hashMap instanceof zzqt) != null) {
                return (zzqt) hashMap;
            }
            return new zzqv(view);
        } catch (View view2) {
            zzaok.m10004c("Could not create remote NativeAdViewHolderDelegate.", view2);
            return null;
        }
    }

    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzqw) {
            return (zzqw) queryLocalInterface;
        }
        return new zzqx(iBinder);
    }
}
