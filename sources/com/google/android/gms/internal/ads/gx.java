package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

final class gx implements zzu<zzasg> {
    /* renamed from: a */
    private final /* synthetic */ gw f16495a;

    gx(gw gwVar) {
        this.f16495a = gwVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str) == null) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f16495a) {
                        if (this.f16495a.f21271C != parseInt) {
                            this.f16495a.f21271C = parseInt;
                            this.f16495a.requestLayout();
                        }
                    }
                } catch (Object obj2) {
                    zzaok.m10004c("Exception occurred while getting webview content height", obj2);
                }
            }
        }
    }
}
