package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import org.json.JSONObject;

@zzaer
public final class zzarv implements zzu<zzarg> {
    /* renamed from: a */
    private static java.lang.Integer m21372a(java.util.Map<java.lang.String, java.lang.String> r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r3.containsKey(r4);
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r3.get(r4);	 Catch:{ NumberFormatException -> 0x0017 }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x0017 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0017 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0017 }
        return r0;
    L_0x0017:
        r3 = r3.get(r4);
        r3 = (java.lang.String) r3;
        r0 = java.lang.String.valueOf(r4);
        r0 = r0.length();
        r0 = r0 + 39;
        r2 = java.lang.String.valueOf(r3);
        r2 = r2.length();
        r0 = r0 + r2;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r0);
        r0 = "Precache invalid numeric parameter '";
        r2.append(r0);
        r2.append(r4);
        r4 = "': ";
        r2.append(r4);
        r2.append(r3);
        r3 = r2.toString();
        com.google.android.gms.internal.ads.zzaok.m10007e(r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarv.a(java.util.Map, java.lang.String):java.lang.Integer");
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzarg zzarg = (zzarg) obj;
        if (zzaok.m10000a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 15);
            stringBuilder.append("Precache GMSG: ");
            stringBuilder.append(valueOf);
            zzaok.m10001b(stringBuilder.toString());
        }
        zzbv.zzfh();
        if (map.containsKey("abort")) {
            if (zzarq.m10083a(zzarg) == null) {
                zzaok.m10007e("Precache abort but no precache task running.");
            }
            return;
        }
        valueOf = (String) map.get("src");
        if (valueOf != null) {
            if (zzarq.m10084b(zzarg) != null) {
                zzaok.m10007e("Precache task is already running.");
                return;
            } else if (zzarg.mo4200e() == null) {
                zzaok.m10007e("Precache requires a dependency provider.");
                return;
            } else {
                zzarf zzarf = new zzarf((String) map.get("flags"));
                Integer a = m21372a(map, "player");
                if (a == null) {
                    a = Integer.valueOf(0);
                }
                new zzaro(zzarg, zzarg.mo4200e().zzxj.mo2388a(zzarg, a.intValue(), null, zzarf), valueOf).mo2219c();
            }
        } else if (zzarq.m10084b(zzarg) == null) {
            zzaok.m10007e("Precache must specify a source.");
            return;
        }
        obj = m21372a(map, "minBufferMs");
        if (obj != null) {
            obj.intValue();
        }
        obj = m21372a(map, "maxBufferMs");
        if (obj != null) {
            obj.intValue();
        }
        obj = m21372a(map, "bufferForPlaybackMs");
        if (obj != null) {
            obj.intValue();
        }
        obj = m21372a(map, "bufferForPlaybackAfterRebufferMs");
        if (obj != null) {
            obj.intValue();
        }
    }
}
