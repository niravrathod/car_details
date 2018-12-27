package com.facebook.ads.internal.p101q.p102a;

import android.content.Context;
import android.media.AudioManager;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.q.a.v */
public class C1935v {
    /* renamed from: a */
    public static float m7323a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume > 0) {
                return (((float) streamVolume) * 1.0f) / ((float) streamMaxVolume);
            }
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m7324a(Map<String, String> map, boolean z, boolean z2) {
        map.put(FacebookAdapter.KEY_AUTOPLAY, z ? "1" : "0");
        map.put("inline", z2 ? "1" : "0");
    }
}
