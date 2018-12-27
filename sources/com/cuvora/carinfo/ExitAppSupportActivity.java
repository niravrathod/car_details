package com.cuvora.carinfo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class ExitAppSupportActivity extends AppCompatActivity {

    /* renamed from: com.cuvora.carinfo.ExitAppSupportActivity$1 */
    class C14161 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ExitAppSupportActivity f4387a;

        C14161(ExitAppSupportActivity exitAppSupportActivity) {
            this.f4387a = exitAppSupportActivity;
        }

        public void run() {
            this.f4387a.finish();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_exit_ad_support);
        new Handler().postDelayed(new C14161(this), 1000);
    }
}
