package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzatz {
    /* renamed from: a */
    public static zzasg m10138a(Context context, zzatt zzatt, String str, boolean z, boolean z2, zzck zzck, zzaop zzaop, zzoj zzoj, zzbo zzbo, zzv zzv, zzhv zzhv) {
        try {
            return (zzasg) zzanr.m9934a(new hh(context, zzatt, str, z, z2, zzck, zzaop, zzoj, zzbo, zzv));
        } catch (Throwable th) {
            zzbv.zzeo().m9714a(th, "AdWebViewFactory.newAdWebView2");
            zzasq zzasq = new zzasq("Webview initialization failed.", th);
        }
    }
}
