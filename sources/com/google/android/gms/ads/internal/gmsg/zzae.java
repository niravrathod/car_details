package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzalg;
import com.google.android.gms.internal.ads.zzaok;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzae implements zzu<Object> {
    /* renamed from: a */
    private final Object f16349a = new Object();
    @GuardedBy("mLock")
    /* renamed from: b */
    private final Map<String, zzaf> f16350b = new HashMap();

    public final void zza(String str, zzaf zzaf) {
        synchronized (this.f16349a) {
            this.f16350b.put(str, zzaf);
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        Object obj2;
        String str = (String) map.get(FacebookAdapter.KEY_ID);
        String str2 = (String) map.get("fail");
        Object obj3 = (String) map.get("fail_reason");
        String str3 = (String) map.get("fail_stack");
        String str4 = (String) map.get("result");
        if (TextUtils.isEmpty(str3)) {
            obj3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str3)) {
            obj2 = "";
        } else {
            String str5 = "\n";
            str3 = String.valueOf(str3);
            obj2 = str3.length() != 0 ? str5.concat(str3) : new String(str5);
        }
        synchronized (this.f16349a) {
            zzaf zzaf = (zzaf) this.f16350b.remove(str);
            if (zzaf == null) {
                map = "Received result for unexpected method invocation: ";
                obj = String.valueOf(str);
                zzaok.m10007e(obj.length() != 0 ? map.concat(obj) : new String(map));
                return;
            } else if (TextUtils.isEmpty(str2) == null) {
                obj = String.valueOf(obj3);
                map = String.valueOf(obj2);
                zzaf.zzax(map.length() != 0 ? obj.concat(map) : new String(obj));
                return;
            } else if (str4 == null) {
                zzaf.zzd(null);
                return;
            } else {
                try {
                    obj = new JSONObject(str4);
                    if (zzalg.m21226a() != null) {
                        map = "Result GMSG: ";
                        str2 = String.valueOf(obj.toString(2));
                        zzalg.m21225a(str2.length() != 0 ? map.concat(str2) : new String(map));
                    }
                    zzaf.zzd(obj);
                } catch (Object obj4) {
                    zzaf.zzax(obj4.getMessage());
                }
            }
        }
    }
}
