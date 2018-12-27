package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

public final class zzags implements zzu<Object> {
    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = "Invalid request: ";
        map = String.valueOf((String) map.get("errors"));
        zzaok.m10007e(map.length() != 0 ? str2.concat(map) : new String(str2));
        zzagk.f19831f.zzaw(str);
    }
}
