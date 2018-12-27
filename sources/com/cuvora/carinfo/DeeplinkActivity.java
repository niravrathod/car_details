package com.cuvora.carinfo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.cuvora.carinfo.activity.HomePageActivity;
import com.cuvora.carinfo.helpers.C1546i;
import com.cuvora.carinfo.helpers.C1548k;
import io.branch.referral.Branch;
import io.branch.referral.Branch.C2704f;
import io.branch.referral.C2734d;
import org.json.JSONObject;

public class DeeplinkActivity extends AppCompatActivity {

    /* renamed from: com.cuvora.carinfo.DeeplinkActivity$1 */
    class C35961 implements C2704f {
        /* renamed from: a */
        final /* synthetic */ DeeplinkActivity f14763a;

        C35961(DeeplinkActivity deeplinkActivity) {
            this.f14763a = deeplinkActivity;
        }

        /* renamed from: a */
        public void mo1161a(JSONObject jSONObject, C2734d c2734d) {
            if (c2734d == null) {
                Log.i("BRANCH SDK", jSONObject.toString());
                if (C1546i.m5909h(jSONObject, "deeplink") != null) {
                    jSONObject = Uri.parse(C1546i.m5899a(jSONObject, "deeplink"));
                    c2734d = new Bundle();
                    c2734d.putString("deepLink", jSONObject.toString());
                    jSONObject = new Intent();
                    jSONObject.putExtras(c2734d);
                    this.f14763a.setIntent(jSONObject);
                    this.f14763a.m29950m();
                    return;
                }
                this.f14763a.m29950m();
                return;
            }
            Log.i("BRANCH SDK", c2734d.m13253a());
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    protected void onStart() {
        super.onStart();
        m29949l();
    }

    /* renamed from: l */
    private void m29949l() {
        Branch.m23406b().m23459a(new C35961(this), getIntent().getData(), (Activity) this);
    }

    public void onNewIntent(Intent intent) {
        setIntent(intent);
    }

    /* renamed from: m */
    private void m29950m() {
        if (getIntent() == null || getIntent().getExtras() == null) {
            startActivity(new Intent(this, HomePageActivity.class));
        } else {
            C1548k.m5918a(this, getIntent().getExtras());
        }
        finish();
    }
}
