package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzv;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzasm {
    /* renamed from: a */
    public static zzapi<zzasg> m10091a(Context context, zzaop zzaop, String str, zzck zzck, zzv zzv) {
        return zzaox.m10021a(zzaox.m10019a(null), new gs(context, zzck, zzaop, zzv, str), zzapn.f8961a);
    }

    /* renamed from: a */
    public static zzasg m10092a(Context context, zzatt zzatt, String str, boolean z, boolean z2, zzck zzck, zzaop zzaop, zzoj zzoj, zzbo zzbo, zzv zzv, zzhv zzhv) {
        zznw.m10901a(context);
        if (((Boolean) zzkd.m10713e().m10897a(zznw.al)).booleanValue()) {
            return zzatz.m10138a(context, zzatt, str, z, z2, zzck, zzaop, zzoj, zzbo, zzv, zzhv);
        }
        try {
            return (zzasg) zzanr.m9934a(new gt(context, zzatt, str, z, z2, zzck, zzaop, zzoj, zzbo, zzv, zzhv));
        } catch (Throwable th) {
            zzasq zzasq = new zzasq("Webview initialization failed.", th);
        }
    }
}
