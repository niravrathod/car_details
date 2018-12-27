package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

final /* synthetic */ class dd implements Callable {
    /* renamed from: a */
    private final zzalo f7989a;
    /* renamed from: b */
    private final Context f7990b;

    dd(zzalo zzalo, Context context) {
        this.f7989a = zzalo;
        this.f7990b = context;
    }

    public final Object call() {
        Context context = this.f7990b;
        if (!((Boolean) zzkd.m10713e().m10897a(zznw.cL)).booleanValue()) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Bundle bundle = new Bundle();
        int i = 0;
        if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
            bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
        }
        String[] strArr = new String[]{"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
        while (i < 4) {
            String str = strArr[i];
            if (defaultSharedPreferences.contains(str)) {
                bundle.putString(str, defaultSharedPreferences.getString(str, null));
            }
            i++;
        }
        return bundle;
    }
}
