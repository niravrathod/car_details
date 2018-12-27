package com.cuvora.carinfo.service;

import android.app.IntentService;
import android.content.Intent;
import android.preference.PreferenceManager;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1543g.C1542a;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.gson.C2657k;
import com.google.gson.C4212h;
import com.google.gson.C4257m;
import okhttp3.C2991z;
import okhttp3.aa;

public class RegistrationIntentService extends IntentService {
    public RegistrationIntentService() {
        super("RegistrationIntentService");
    }

    protected void onHandleIntent(Intent intent) {
        String string = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("KEY_TOKEN", null);
        if (string != null) {
            try {
                C2657k c4212h = new C4212h();
                String f = C1565s.m5965f(getApplicationContext());
                C4257m c4257m = new C4257m();
                C2657k c4257m2 = new C4257m();
                c4257m2.m23354a("client", "FIREBASE");
                c4257m2.m23354a("fieldName", "TOKEN");
                c4257m2.m23354a("fieldValue", string);
                c4212h.m23115a(c4257m2);
                try {
                    string = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                    c4257m2 = new C4257m();
                    c4257m2.m23354a("client", "ADVERTISING_ID");
                    c4257m2.m23354a("fieldName", "AD_ID");
                    c4257m2.m23354a("fieldValue", string);
                    c4212h.m23115a(c4257m2);
                } catch (Intent intent2) {
                    intent2.printStackTrace();
                }
                intent2 = new C4257m();
                intent2.m23354a("client", "FIREBASE_INSTANCE_ID");
                intent2.m23354a("fieldName", "FIREBASE_ID");
                intent2.m23354a("fieldValue", FirebaseInstanceId.m12658a().m12678c());
                c4212h.m23115a(intent2);
                c4257m.m23353a("serviceIdentifiers", c4212h);
                C2991z a = C2991z.m14632a(C1542a.f4673a, c4257m.toString());
                C1570t.m5988a((aa) C1543g.m5859a().m5865a(aa.class, f, new StringBuilder(C1570t.m5974a(getApplicationContext())).reverse().toString(), a, 1));
            } catch (Intent intent22) {
                intent22.printStackTrace();
            }
        }
    }
}
