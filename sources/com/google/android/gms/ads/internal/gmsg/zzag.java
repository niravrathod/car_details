package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzaok;
import java.util.Map;

@zzaer
public final class zzag implements zzu<Object> {
    /* renamed from: a */
    private final zzah f16351a;

    public zzag(zzah zzah) {
        this.f16351a = zzah;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            obj = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    obj = new zzajk(str2, parseInt);
                }
            } catch (Map<String, String> map2) {
                zzaok.m10004c("Unable to parse reward amount.", map2);
            }
            this.f16351a.zzb(obj);
        } else if ("video_start".equals(str) != null) {
            this.f16351a.zzdk();
        } else {
            if ("video_complete".equals(str) != null) {
                this.f16351a.zzdl();
            }
        }
    }
}
