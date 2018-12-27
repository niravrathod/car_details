package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

final class hj implements zzu<zzasg> {
    /* renamed from: a */
    private final /* synthetic */ hi f16498a;

    hj(hi hiVar) {
        this.f16498a = hiVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str) == null) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f16498a) {
                        if (this.f16498a.f21345v != parseInt) {
                            this.f16498a.f21345v = parseInt;
                            this.f16498a.requestLayout();
                        }
                    }
                } catch (Object obj2) {
                    zzaok.m10004c("Exception occurred while getting webview content height", obj2);
                }
            }
        }
    }
}
