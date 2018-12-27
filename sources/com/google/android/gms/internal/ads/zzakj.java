package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

@zzaer
public final class zzakj implements zzakl {
    /* renamed from: a */
    public final zzapi<String> mo2333a(String str, PackageInfo packageInfo) {
        return zzaox.m10019a((Object) str);
    }

    /* renamed from: a */
    public final zzapi<Info> mo2332a(Context context) {
        zzapi zzaps = new zzaps();
        zzkd.m10709a();
        if (zzaoa.m9968c(context)) {
            zzalm.m9772a(new cq(this, context, zzaps));
        }
        return zzaps;
    }
}
