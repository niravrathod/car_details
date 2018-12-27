package com.cuvora.carinfo;

import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;
import android.support.multidex.C0228a;
import android.util.Log;
import com.android.billingclient.api.C1025g;
import com.android.billingclient.api.C1026h;
import com.billing.inapp.p047a.C3347a;
import com.billing.inapp.p047a.C3347a.C1101a;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.answers.Answers;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.loaders.C1580t;
import com.feedbox.C2110d;
import com.google.android.gms.ads.MobileAds;
import com.karumi.dexter.Dexter;
import io.branch.referral.Branch;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import java.util.List;

public class CarInfoApplication extends Application {
    /* renamed from: a */
    public static final String f4383a = "CarInfoApplication";

    /* renamed from: com.cuvora.carinfo.CarInfoApplication$2 */
    class C35912 implements C1101a {
        /* renamed from: a */
        final /* synthetic */ CarInfoApplication f14757a;

        /* renamed from: a */
        public void mo919a() {
        }

        /* renamed from: a */
        public void mo920a(int i, List<C1025g> list) {
        }

        C35912(CarInfoApplication carInfoApplication) {
            this.f14757a = carInfoApplication;
        }
    }

    public void onCreate() {
        super.onCreate();
        C1547j.m5910a(this);
        C1543g.m5861a((Context) this, "android_car-info", "");
        C2766c.m13514a((Context) this, new Crashlytics());
        Crashlytics.setUserIdentifier(C1570t.m5974a((Context) this));
        C2766c.m13514a((Context) this, new Answers());
        C2766c.m13514a((Context) this, new C2771h[0]);
        C1540d.m5806a((Context) this);
        C1541e.m5853a((Context) this);
        Branch.m23417c((Context) this);
        m5693b();
        Dexter.initialize(this);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-8646722329420776~4291131642");
        MobileAds.setAppVolume(0.1f);
        String string = PreferenceManager.getDefaultSharedPreferences(this).getString("KEY_PHONE_NUM", "");
        if (C1562q.m5946a(string)) {
            C1570t.m6015e(this, string);
        }
        ((C2110d) C2110d.f6448c.m7672a()).m7677a(this, "carinfo", 99, C1570t.m6023h(getApplicationContext()));
    }

    /* renamed from: b */
    private void m5693b() {
        final C3347a a = C3347a.m17191a((Context) this);
        a.m17204a(new C1101a(this) {
            /* renamed from: b */
            final /* synthetic */ CarInfoApplication f14756b;

            /* renamed from: com.cuvora.carinfo.CarInfoApplication$1$1 */
            class C35891 implements C1026h {
                /* renamed from: a */
                final /* synthetic */ C35901 f14754a;

                C35891(C35901 c35901) {
                    this.f14754a = c35901;
                }

                /* renamed from: a */
                public void mo922a(int i, List<C1025g> list) {
                    String str = CarInfoApplication.f4383a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(" purchase history code ");
                    stringBuilder.append(i);
                    Log.d(str, stringBuilder.toString());
                    if (i == 0) {
                        i = CarInfoApplication.f4383a;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(" purchase history is ");
                        stringBuilder2.append(list.toString());
                        Log.d(i, stringBuilder2.toString());
                        new C1580t(this.f14754a.f14756b, "purchase_history", C1570t.m5977a((List) list)).execute(new Void[null]);
                    }
                }
            }

            /* renamed from: a */
            public void mo919a() {
                a.m17203a(new C35891(this));
                a.m17209d();
            }

            /* renamed from: a */
            public void mo920a(int i, List<C1025g> list) {
                C1570t.m5981a(this.f14756b, i, (List) list);
            }
        });
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C0228a.m839a((Context) this);
    }

    /* renamed from: a */
    public void m5694a() {
        C3347a.m17191a((Context) this).m17204a(new C35912(this));
    }
}
