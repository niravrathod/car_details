package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzalo;

@zzaer
public final class zzl {
    public static void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzccf == 4 && adOverlayInfoParcel.zzcby == null) {
            if (adOverlayInfoParcel.zzcbx) {
                adOverlayInfoParcel.zzcbx.onAdClicked();
            }
            zzbv.zzeh();
            zza.zza(context, adOverlayInfoParcel.zzcbw, adOverlayInfoParcel.zzcce);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzadg.f19896d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.zza(intent, adOverlayInfoParcel);
        if (PlatformVersion.isAtLeastLollipop() == null) {
            intent.addFlags(524288);
        }
        if ((context instanceof Activity) == null) {
            intent.addFlags(268435456);
        }
        zzbv.zzek();
        zzalo.m9789a(context, intent);
    }
}
