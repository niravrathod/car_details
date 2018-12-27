package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzaok;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.h */
final class C4068h implements zzu<Object> {
    C4068h() {
    }

    public final void zza(Object obj, Map<String, String> map) {
        obj = "Received log message: ";
        map = String.valueOf((String) map.get("string"));
        zzaok.m10005d(map.length() != 0 ? obj.concat(map) : new String(obj));
    }
}
