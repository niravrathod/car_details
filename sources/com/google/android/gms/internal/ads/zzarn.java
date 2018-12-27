package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@zzaer
public final class zzarn implements zzu<zzarg> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzarg zzarg = (zzarg) obj;
        zzasw b = zzarg.mo4198b();
        if (b == null) {
            try {
                zzasw zzasw = new zzasw(zzarg, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzarg.mo4197a(zzasw);
                b = zzasw;
            } catch (Throwable e) {
                zzaok.m10002b("Unable to parse videoMeta message.", e);
                zzbv.zzeo().m9714a(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        obj = Integer.parseInt((String) map.get("playbackState"));
        if (obj < null || 3 < obj) {
            obj = null;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zzaok.m10000a(3)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 140);
            stringBuilder.append("Video Meta GMSG: currentTime : ");
            stringBuilder.append(parseFloat2);
            stringBuilder.append(" , duration : ");
            stringBuilder.append(parseFloat);
            stringBuilder.append(" , isMuted : ");
            stringBuilder.append(equals);
            stringBuilder.append(" , playbackState : ");
            stringBuilder.append(obj);
            stringBuilder.append(" , aspectRatio : ");
            stringBuilder.append(str);
            zzaok.m10001b(stringBuilder.toString());
        }
        b.m26359a(parseFloat2, parseFloat, obj, equals, parseFloat3);
    }
}
