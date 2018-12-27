package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzasg;

@zzaer
@VisibleForTesting
public final class zzi {
    public final int index;
    public final ViewGroup parent;
    public final LayoutParams zzcbt;
    public final Context zzrx;

    public zzi(zzasg zzasg) {
        this.zzcbt = zzasg.getLayoutParams();
        ViewParent parent = zzasg.getParent();
        this.zzrx = zzasg.mo4774p();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        this.parent = (ViewGroup) parent;
        this.index = this.parent.indexOfChild(zzasg.getView());
        this.parent.removeView(zzasg.getView());
        zzasg.mo4751b(true);
    }
}
