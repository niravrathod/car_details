package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzalg;

@zzaer
public final class zzr extends zzd {
    public zzr(Activity activity) {
        super(activity);
    }

    public final void onCreate(Bundle bundle) {
        zzalg.m21225a("AdOverlayParcel is null or does not contain valid overlay type.");
        this.d = 3;
        this.a.finish();
    }
}
