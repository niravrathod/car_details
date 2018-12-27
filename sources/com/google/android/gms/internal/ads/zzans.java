package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzans {
    /* renamed from: a */
    public static boolean m9935a(Bundle bundle) {
        bundle = bundle.getBundle(AdMobAdapter.class.getName());
        if (bundle == null || bundle.getBoolean("render_test_ad_label", false) == null) {
            return false;
        }
        return true;
    }
}
