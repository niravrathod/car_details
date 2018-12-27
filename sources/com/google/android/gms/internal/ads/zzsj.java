package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.widget.FrameLayout;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzaer
public final class zzsj extends RemoteCreator<zzqr> {
    @VisibleForTesting
    public zzsj() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final zzqo m21959a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            context = ((zzqr) getRemoteCreatorInstance(context)).mo2624a(ObjectWrapper.m26019a((Object) context), ObjectWrapper.m26019a((Object) frameLayout), ObjectWrapper.m26019a((Object) frameLayout2), 13000000);
            if (context == null) {
                return null;
            }
            frameLayout = context.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if ((frameLayout instanceof zzqo) != null) {
                return (zzqo) frameLayout;
            }
            return new zzqq(context);
        } catch (Context context2) {
            zzaok.m10004c("Could not create remote NativeAdViewDelegate.", context2);
            return null;
        }
    }

    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzqr) {
            return (zzqr) queryLocalInterface;
        }
        return new zzqs(iBinder);
    }
}
