package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager.zaa;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;

final class zabm implements SignOutCallbacks {
    final /* synthetic */ zaa zaix;

    zabm(zaa zaa) {
        this.zaix = zaa;
    }

    public final void onSignOutComplete() {
        this.zaix.zail.handler.post(new zabn(this));
    }
}
