package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.p041a.C1003a;

public class ProxyBillingActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1003a.m4332a("ProxyBillingActivity", "Launching Play Store billing flow");
        try {
            startIntentSenderForResult(((PendingIntent) getIntent().getParcelableExtra("BUY_INTENT")).getIntentSender(), 100, new Intent(), 0, 0, 0);
        } catch (Bundle bundle2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got exception while trying to start a purchase flow: ");
            stringBuilder.append(bundle2);
            C1003a.m4333b("ProxyBillingActivity", stringBuilder.toString());
            m4335a(6, null);
            finish();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            i = C1003a.m4329a(intent, "ProxyBillingActivity");
            if (!(i2 == -1 && i == 0)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got purchases updated result with resultCode ");
                stringBuilder.append(i2);
                stringBuilder.append(" and billing's responseCode: ");
                stringBuilder.append(i);
                C1003a.m4333b("ProxyBillingActivity", stringBuilder.toString());
            }
            if (intent == null) {
                i2 = 0;
            } else {
                i2 = intent.getExtras();
            }
            m4335a(i, i2);
        } else {
            intent = new StringBuilder();
            intent.append("Got onActivityResult with wrong requestCode: ");
            intent.append(i);
            intent.append("; skipping...");
            C1003a.m4333b("ProxyBillingActivity", intent.toString());
        }
        finish();
    }

    /* renamed from: a */
    private void m4335a(int i, Bundle bundle) {
        Intent intent = new Intent("proxy_activity_response_intent_action");
        intent.putExtra("response_code_key", i);
        intent.putExtra("response_bundle_key", bundle);
        C1023f.m4374a((Context) this).m4379a(intent);
    }
}
