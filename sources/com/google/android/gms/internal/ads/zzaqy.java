package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.util.PlatformVersion;

@zzaer
public final class zzaqy extends zzaqq {
    /* renamed from: a */
    public final zzaqp mo2386a(Context context, zzarg zzarg, int i, boolean z, zzoj zzoj, zzarf zzarf) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        Object obj = (!PlatformVersion.isAtLeastIceCreamSandwich() || (applicationInfo != null && applicationInfo.targetSdkVersion < 11)) ? null : 1;
        if (obj == null) {
            return null;
        }
        return new zzaqe(context, z, zzarg.mo4205s().m10134e(), zzarf, new zzarh(context, zzarg.mo4204i(), zzarg.mo4759g(), zzoj, zzarg.mo4752c()));
    }
}
