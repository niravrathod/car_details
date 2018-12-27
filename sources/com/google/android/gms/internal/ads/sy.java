package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

final class sy implements zzu<Object> {
    /* renamed from: a */
    final /* synthetic */ sx f16664a;
    /* renamed from: b */
    private final /* synthetic */ zzadw f16665b;

    sy(sx sxVar, zzadw zzadw) {
        this.f16664a = sxVar;
        this.f16665b = zzadw;
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzasg zzasg = (zzasg) this.f16664a.f8383a.get();
        if (zzasg == null) {
            this.f16665b.mo2226b("/loadHtml", this);
            return;
        }
        zzasg.mo4782u().mo2393a(new sz(this, map, this.f16665b));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2) != null) {
            zzasg.loadData(str, "text/html", "UTF-8");
        } else {
            zzasg.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
