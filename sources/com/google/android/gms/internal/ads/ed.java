package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import java.util.concurrent.Callable;

final class ed implements Callable<String> {
    /* renamed from: a */
    private final /* synthetic */ Context f8019a;

    ed(zzant zzant, Context context) {
        this.f8019a = context;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences = this.f8019a.getSharedPreferences("admob_user_agent", 0);
        CharSequence string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zzalg.m21225a("User agent is not initialized on Google Play Services. Initializing.");
            Object defaultUserAgent = WebSettings.getDefaultUserAgent(this.f8019a);
            SharedPreferencesUtils.publishWorldReadableSharedPreferences(this.f8019a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        zzalg.m21225a("User agent is already initialized on Google Play Services.");
        return string;
    }
}
