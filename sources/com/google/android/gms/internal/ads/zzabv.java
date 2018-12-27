package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzaer
public final class zzabv extends RemoteCreator<zzabz> {
    public zzabv() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public final zzabw m21075a(Activity activity) {
        try {
            activity = ((zzabz) getRemoteCreatorInstance(activity)).mo2216a(ObjectWrapper.m26019a((Object) activity));
            if (activity == null) {
                return null;
            }
            IInterface queryLocalInterface = activity.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzabw) {
                return (zzabw) queryLocalInterface;
            }
            return new zzaby(activity);
        } catch (Activity activity2) {
            zzaok.m10004c("Could not create remote AdOverlay.", activity2);
            return null;
        } catch (Activity activity22) {
            zzaok.m10004c("Could not create remote AdOverlay.", activity22);
            return null;
        }
    }

    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzabz) {
            return (zzabz) queryLocalInterface;
        }
        return new zzaca(iBinder);
    }
}
