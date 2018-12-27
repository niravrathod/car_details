package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final class ee implements Callable<String> {
    /* renamed from: a */
    private final /* synthetic */ Context f8020a;
    /* renamed from: b */
    private final /* synthetic */ Context f8021b;

    ee(zzant zzant, Context context, Context context2) {
        this.f8020a = context;
        this.f8021b = context2;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        int i = 0;
        if (this.f8020a != null) {
            zzalg.m21225a("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f8020a.getSharedPreferences("admob_user_agent", 0);
        } else {
            zzalg.m21225a("Attempting to read user agent from local cache.");
            sharedPreferences = this.f8021b.getSharedPreferences("admob_user_agent", 0);
            i = 1;
        }
        Object string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zzalg.m21225a("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f8021b);
            if (i != 0) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zzalg.m21225a("Persisting user agent.");
            }
        }
        return string;
    }
}
