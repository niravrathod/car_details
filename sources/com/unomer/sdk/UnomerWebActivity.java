package com.unomer.sdk;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p173.C4893a;
import p173.C4896d;
import p173.C4899f;
import p173.C4903g;

public class UnomerWebActivity extends Activity {
    /* renamed from: a */
    public static WebView f11240a;
    /* renamed from: b */
    public static Activity f11241b;
    /* renamed from: c */
    public static C4903g f11242c;
    /* renamed from: d */
    static Activity f11243d;

    /* renamed from: com.unomer.sdk.UnomerWebActivity$1 */
    class C26881 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ UnomerWebActivity f11239a;

        C26881(UnomerWebActivity unomerWebActivity) {
            this.f11239a = unomerWebActivity;
        }

        public final void run() {
            UnomerWebActivity.f11240a.loadUrl("javascript:endSurvey()");
        }
    }

    /* renamed from: a */
    public static void m12993a() {
        WebSettings settings = f11240a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        f11240a.setScrollBarStyle(33554432);
        f11240a.setScrollbarFadingEnabled(false);
        f11240a.addJavascriptInterface(f11242c, "Android");
        f11240a.clearHistory();
        f11240a.clearFormData();
        f11240a.clearCache(true);
    }

    /* renamed from: a */
    public static void m12994a(int i, String str, String str2, int i2, String str3, String str4) {
        if (i == 0) {
            C4899f.f21926a.mo1209c(i2, str3, str4, Boolean.parseBoolean(str2));
        } else if (i == 2) {
            C4899f.f21926a.mo1208c();
        } else if (i == 1) {
            C4899f.f21926a.mo1207b(i2, str3, str4, Boolean.parseBoolean(str2));
        }
        str = C4896d.a(str, "1612200904012015");
        Map hashMap = new HashMap();
        final int i3 = i;
        final int i4 = i2;
        final String str5 = str3;
        final String str6 = str4;
        final String str7 = str2;
        C4893a c42662 = new C4893a() {
            /* renamed from: a */
            public final void m23371a(String str) {
                if (!UnomerWebActivity.m12996b(str)) {
                    C4899f.f21926a.mo1210d();
                } else if (i3 == 1) {
                    C4899f.f21926a.mo1203a(i4, str5, str6, Boolean.parseBoolean(str7));
                }
            }
        };
        hashMap.put("q", str);
        c42662.f21920a = hashMap;
        c42662.execute(new String[]{"http://www.unomer.com/api_sdk_v3/cakePHP/apis/api.php"});
        f11243d.finish();
    }

    /* renamed from: b */
    private static boolean m12996b(String str) {
        try {
            return new JSONObject(str).getString("responseId").equals("0");
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void onBackPressed() {
        runOnUiThread(new C26881(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(f11240a);
        f11243d = this;
        C4899f.a("Default", "false");
        f11240a.loadUrl("javascript:startSurvey()");
        C4899f.f21926a.mo1206b();
    }
}
