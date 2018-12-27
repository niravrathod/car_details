package p173;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.unomer.sdk.C2691b;
import com.unomer.sdk.UnomerWebActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f */
public final class C4899f {
    /* renamed from: a */
    public static C2691b f21926a;
    /* renamed from: b */
    public static int f21927b;
    /* renamed from: c */
    public static SharedPreferences f21928c;
    /* renamed from: e */
    public static Map<String, String> f21929e = new HashMap();
    /* renamed from: h */
    public static C4899f f21930h;
    /* renamed from: d */
    public Map<String, Map<String, String>> f21931d = new HashMap();
    /* renamed from: f */
    public int f21932f = 0;
    /* renamed from: g */
    public Activity f21933g;
    /* renamed from: i */
    private boolean f21934i;

    /* renamed from: f$2 */
    public class C48982 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C4899f f21925a;

        public C48982(C4899f c4899f) {
            this.f21925a = c4899f;
        }

        public final void run() {
            Intent intent = new Intent(this.f21925a.f21933g, UnomerWebActivity.class);
            UnomerWebActivity.f11241b = this.f21925a.f21933g;
            C4903g.f21950b = C4899f.f21926a;
            this.f21925a.f21933g.startActivity(intent);
            this.f21925a.f21934i = true;
        }
    }

    /* renamed from: f$1 */
    class C49081 extends C4893a {
        /* renamed from: c */
        final /* synthetic */ C4899f f21957c;

        C49081(C4899f c4899f) {
            this.f21957c = c4899f;
        }

        /* renamed from: a */
        public final void mo5047a(String str) {
        }
    }

    public C4899f(Activity activity, C2691b c2691b) {
        Editor edit;
        f21930h = this;
        f21926a = c2691b;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("com.survey.one.library.shared.preference", 0);
        f21928c = sharedPreferences;
        if (!sharedPreferences.contains("has_answered")) {
            edit = f21928c.edit();
            edit.putBoolean("has_answered", true);
            edit.putString("saved_survey", "");
            edit.commit();
        }
        this.f21933g = activity;
        C4894b c4894b = new C4894b();
        Map a = C4894b.m30254a(this.f21933g);
        a.put("purpose", "save-user-details");
        a.put("sdk_version", "15.0");
        edit = f21928c.edit();
        edit.putString("survey_test_code", "");
        edit.commit();
        String a2 = C4896d.m30257a(C4894b.m30253a(a), "1612200904012015");
        C4893a c49081 = new C49081(this);
        a.clear();
        a.put("q", a2);
        c49081.f21920a = a;
        c49081.execute(new String[]{"http://www.unomer.com/api_sdk_v3/cakePHP/apis/api.php"});
    }

    /* renamed from: a */
    public static void m30259a(String str, String str2) {
        f21929e.put(str, str2);
    }

    /* renamed from: a */
    public static boolean m30260a(java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = f21929e;	 Catch:{ Exception -> 0x0013 }
        r2 = r1.get(r2);	 Catch:{ Exception -> 0x0013 }
        r2 = (java.lang.String) r2;	 Catch:{ Exception -> 0x0013 }
        r1 = "true";	 Catch:{ Exception -> 0x0013 }
        r2 = r2.equalsIgnoreCase(r1);	 Catch:{ Exception -> 0x0013 }
        if (r2 == 0) goto L_0x0013;
    L_0x0011:
        r2 = 1;
        return r2;
    L_0x0013:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a(java.lang.String):boolean");
    }
}
