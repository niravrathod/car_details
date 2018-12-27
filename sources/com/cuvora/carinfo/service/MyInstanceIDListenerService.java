package com.cuvora.carinfo.service;

import android.preference.PreferenceManager;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyInstanceIDListenerService extends FirebaseInstanceIdService {
    /* renamed from: a */
    public void mo3930a() {
        super.mo3930a();
        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("KEY_TOKEN", FirebaseInstanceId.m12658a().m12679d()).apply();
    }
}
