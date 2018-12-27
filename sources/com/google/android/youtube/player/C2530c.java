package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Intent;
import com.google.ads.mediation.facebook.FacebookAdapter;

/* renamed from: com.google.android.youtube.player.c */
public final class C2530c {
    /* renamed from: a */
    public static Intent m12460a(Activity activity, String str, String str2) {
        return C2530c.m12461a(activity, str, str2, 0, false, false);
    }

    /* renamed from: a */
    public static Intent m12461a(Activity activity, String str, String str2, int i, boolean z, boolean z2) {
        if (str2 == null) {
            throw new NullPointerException("The videoId cannot be null");
        } else if (str != null) {
            return C2530c.m12462a(new Intent("com.google.android.youtube.api.StandalonePlayerActivity.START").putExtra("video_id", str2), activity, str, i, z, z2);
        } else {
            throw new NullPointerException("The developerKey cannot be null");
        }
    }

    /* renamed from: a */
    private static Intent m12462a(Intent intent, Activity activity, String str, int i, boolean z, boolean z2) {
        C2529b.m12459a(intent, activity).putExtra("developer_key", str).putExtra(FacebookAdapter.KEY_AUTOPLAY, z).putExtra("lightbox_mode", z2).putExtra("start_time_millis", i).putExtra("window_has_status_bar", (activity.getWindow().getAttributes().flags & 1024) == 0);
        return intent;
    }
}
