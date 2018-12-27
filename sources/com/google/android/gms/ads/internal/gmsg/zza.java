package com.google.android.gms.ads.internal.gmsg;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaok;
import java.util.Map;
import org.json.JSONObject;

@zzaer
public final class zza implements zzu<Object> {
    /* renamed from: a */
    private final zzb f16341a;

    public zza(zzb zzb) {
        this.f16341a = zzb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (this.f16341a != null) {
            obj = (String) map.get("name");
            if (obj == null) {
                zzaok.m10005d("Ad metadata with no name parameter.");
                obj = "";
            }
            map = m20362a((String) map.get("info"));
            if (map == null) {
                zzaok.m10003c("Failed to convert ad metadata to Bundle.");
            } else {
                this.f16341a.zza(obj, map);
            }
        }
    }

    /* renamed from: a */
    private static Bundle m20362a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            str = jSONObject.keys();
            Bundle bundle = new Bundle();
            while (str.hasNext()) {
                String str2 = (String) str.next();
                Object obj = jSONObject.get(str2);
                if (obj != null) {
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Double) obj).doubleValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str2, (String) obj);
                    } else {
                        String str3 = "Unsupported type for key:";
                        str2 = String.valueOf(str2);
                        zzaok.m10007e(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                    }
                }
            }
            return bundle;
        } catch (String str4) {
            zzaok.m10002b("Failed to convert ad metadata to JSON.", str4);
            return null;
        }
    }
}
