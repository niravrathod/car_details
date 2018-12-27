package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzasg;
import java.util.Map;

@zzaer
public final class zze implements zzu<zzasg> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzasg zzasg = (zzasg) obj;
        String str = (String) map.get("action");
        String str2;
        if ("tick".equals(str)) {
            str = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            str2 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str)) {
                zzaok.m10007e("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str2)) {
                zzaok.m10007e("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = zzbv.zzer().elapsedRealtime() + (Long.parseLong(str2) - zzbv.zzer().currentTimeMillis());
                    if (TextUtils.isEmpty(str3) != null) {
                        str3 = "native:view_load";
                    }
                    zzasg.mo4203h().m10924a(str, str3, elapsedRealtime);
                } catch (Object obj2) {
                    zzaok.m10004c("Malformed timestamp for CSI tick.", obj2);
                }
            }
        } else if ("experiment".equals(str)) {
            str2 = (String) map.get("value");
            if (TextUtils.isEmpty(str2)) {
                zzaok.m10007e("No value given for CSI experiment.");
                return;
            }
            obj2 = zzasg.mo4203h().m10922a();
            if (obj2 == null) {
                zzaok.m10007e("No ticker for WebView, dropping experiment ID.");
            } else {
                obj2.m10929a("e", str2);
            }
        } else {
            if ("extra".equals(str)) {
                str = (String) map.get("name");
                str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    zzaok.m10007e("No value given for CSI extra.");
                } else if (TextUtils.isEmpty(str)) {
                    zzaok.m10007e("No name given for CSI extra.");
                } else {
                    obj2 = zzasg.mo4203h().m10922a();
                    if (obj2 == null) {
                        zzaok.m10007e("No ticker for WebView, dropping extra parameter.");
                        return;
                    }
                    obj2.m10929a(str, str2);
                }
            }
        }
    }
}
