package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaps;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

@zzaer
public final class zzz implements zzu<Object> {
    @VisibleForTesting
    /* renamed from: a */
    private final HashMap<String, zzaps<JSONObject>> f16354a = new HashMap();

    public final Future<JSONObject> zzav(String str) {
        Future zzaps = new zzaps();
        this.f16354a.put(str, zzaps);
        return zzaps;
    }

    public final void zzaw(String str) {
        zzaps zzaps = (zzaps) this.f16354a.get(str);
        if (zzaps == null) {
            zzaok.m10003c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!zzaps.isDone()) {
            zzaps.cancel(true);
        }
        this.f16354a.remove(str);
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = (String) map.get("fetched_ad");
        zzaok.m10001b("Received ad from the cache.");
        zzaps zzaps = (zzaps) this.f16354a.get(str);
        if (zzaps == null) {
            zzaok.m10003c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            zzaps.m21290b(new JSONObject(str2));
        } catch (Map<String, String> map2) {
            zzaok.m10002b("Failed constructing JSON object from value passed from javascript", map2);
            zzaps.m21290b(null);
        } finally {
            this.f16354a.remove(str);
        }
    }
}
