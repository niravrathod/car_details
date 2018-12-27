package com.cuvora.carinfo;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.cuvora.carinfo.activity.HomePageActivity;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1546i;
import com.cuvora.carinfo.helpers.C1548k;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.service.RegistrationIntentService;
import com.cuvora.carinfo.service.StartupService;
import io.branch.referral.Branch;
import io.branch.referral.Branch.C2704f;
import io.branch.referral.C2734d;
import org.json.JSONObject;

public class SplashScreenActivity extends AppCompatActivity {
    /* renamed from: o */
    private static final String f21828o = "SplashScreenActivity";
    /* renamed from: p */
    private static int f21829p = 2000;
    /* renamed from: q */
    private static boolean f21830q = true;
    /* renamed from: n */
    Handler f21831n = new Handler(new C14351(this));

    /* renamed from: com.cuvora.carinfo.SplashScreenActivity$1 */
    class C14351 implements Callback {
        /* renamed from: a */
        final /* synthetic */ SplashScreenActivity f4414a;

        C14351(SplashScreenActivity splashScreenActivity) {
            this.f4414a = splashScreenActivity;
        }

        public boolean handleMessage(Message message) {
            this.f4414a.m30071m();
            return true;
        }
    }

    /* renamed from: com.cuvora.carinfo.SplashScreenActivity$3 */
    class C14363 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SplashScreenActivity f4415a;

        C14363(SplashScreenActivity splashScreenActivity) {
            this.f4415a = splashScreenActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f4415a.m30072n();
        }
    }

    /* renamed from: com.cuvora.carinfo.SplashScreenActivity$4 */
    class C14374 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SplashScreenActivity f4416a;

        C14374(SplashScreenActivity splashScreenActivity) {
            this.f4416a = splashScreenActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("market://details?id=");
            stringBuilder.append(this.f4416a.getPackageName());
            dialogInterface = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
            if (dialogInterface.resolveActivity(this.f4416a.getPackageManager()) != 0) {
                this.f4416a.startActivity(dialogInterface);
                this.f4416a.finish();
                return;
            }
            C1570t.m5985a(this.f4416a, this.f4416a.getResources().getString(R.string.force_update_toast));
            this.f4416a.m30072n();
        }
    }

    /* renamed from: com.cuvora.carinfo.SplashScreenActivity$5 */
    class C14385 implements OnCancelListener {
        /* renamed from: a */
        final /* synthetic */ SplashScreenActivity f4417a;

        C14385(SplashScreenActivity splashScreenActivity) {
            this.f4417a = splashScreenActivity;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f4417a.finish();
        }
    }

    /* renamed from: com.cuvora.carinfo.SplashScreenActivity$2 */
    class C36092 implements C2704f {
        /* renamed from: a */
        final /* synthetic */ SplashScreenActivity f14779a;

        C36092(SplashScreenActivity splashScreenActivity) {
            this.f14779a = splashScreenActivity;
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
                    this.f14779a.setIntent(jSONObject);
                    this.f14779a.m30073o();
                    return;
                }
                this.f14779a.m30073o();
                return;
            }
            this.f14779a.m30073o();
            Log.i("BRANCH SDK", c2734d.m13253a());
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1459a.f4442a.m5713d();
        setContentView((int) R.layout.activity_splash_screen);
        bundle = (getIntent() == null || getIntent().getExtras() == null) ? true : C1548k.m5919a(getIntent().getExtras());
        if (bundle != null) {
            startService(new Intent(this, StartupService.class));
            startService(new Intent(this, RegistrationIntentService.class));
        }
        this.f21831n.sendEmptyMessageDelayed(1, (long) f21829p);
    }

    /* renamed from: m */
    private void m30071m() {
        try {
            int i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            if (!f21830q || C1541e.m5855b("liveVersionCode").intValue() <= i) {
                m30072n();
                return;
            }
            m30075l();
            f21830q = false;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            m30072n();
        }
    }

    /* renamed from: n */
    private void m30072n() {
        m30074p();
    }

    /* renamed from: o */
    private void m30073o() {
        if (getIntent() == null || getIntent().getExtras() == null) {
            startActivity(new Intent(this, HomePageActivity.class));
        } else {
            C1548k.m5918a(this, getIntent().getExtras());
        }
        finish();
    }

    /* renamed from: p */
    private void m30074p() {
        Branch.m23406b().m23459a(new C36092(this), getIntent().getData(), (Activity) this);
    }

    /* renamed from: l */
    public void m30075l() {
        if (!isFinishing()) {
            Builder builder = new Builder(this);
            CharSequence string = getResources().getString(R.string.app_update_description);
            builder.setMessage(string).setTitle(getResources().getString(R.string.app_update_title)).setOnCancelListener(new C14385(this)).setPositiveButton("OK", new C14374(this)).setNegativeButton("Later", new C14363(this));
            builder.create().show();
        }
    }
}
