package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class zzpr implements zzu<Object> {
    /* renamed from: a */
    private final WeakReference<zzpn> f17316a;
    /* renamed from: b */
    private final String f17317b;

    public zzpr(zzpn zzpn, String str) {
        this.f17316a = new WeakReference(zzpn);
        this.f17317b = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("ads_id");
        String str2 = (String) map.get("eventName");
        if (!TextUtils.isEmpty(str)) {
            if (this.f17317b.equals(str) != null) {
                zzpn zzpn;
                if ("_ai".equals(str2) != null) {
                    zzpn = (zzpn) this.f17316a.get();
                    if (zzpn != null) {
                        zzpn.zzbr();
                    }
                } else if ("_ac".equals(str2) != null) {
                    zzpn = (zzpn) this.f17316a.get();
                    if (zzpn != null) {
                        zzpn.zzbs();
                    }
                }
            }
        }
    }
}
