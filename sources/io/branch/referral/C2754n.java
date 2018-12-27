package io.branch.referral;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: io.branch.referral.n */
public class C2754n {
    /* renamed from: a */
    private static boolean f11599a = false;
    /* renamed from: b */
    private static String f11600b;
    /* renamed from: c */
    private static C2754n f11601c;
    /* renamed from: i */
    private static JSONObject f11602i;
    /* renamed from: d */
    private SharedPreferences f11603d;
    /* renamed from: e */
    private Editor f11604e = this.f11603d.edit();
    /* renamed from: f */
    private final JSONObject f11605f;
    /* renamed from: g */
    private final JSONObject f11606g;
    /* renamed from: h */
    private Context f11607h;

    /* renamed from: a */
    public String m13357a() {
        return "https://api.branch.io/";
    }

    private C2754n(Context context) {
        this.f11603d = context.getSharedPreferences("branch_referral_shared_pref", 0);
        this.f11607h = context;
        this.f11605f = new JSONObject();
        this.f11606g = new JSONObject();
    }

    /* renamed from: a */
    public static C2754n m13342a(Context context) {
        if (f11601c == null) {
            f11601c = new C2754n(context);
        }
        return f11601c;
    }

    /* renamed from: b */
    public int m13367b() {
        return m13375d("bnc_timeout", 5500);
    }

    /* renamed from: c */
    public int m13371c() {
        return m13375d("bnc_retry_count", 3);
    }

    /* renamed from: d */
    public int m13374d() {
        return m13375d("bnc_retry_interval", 1000);
    }

    /* renamed from: a */
    public void m13361a(String str) {
        m13365a("bnc_app_version", str);
    }

    /* renamed from: e */
    public String m13377e() {
        return m13413v("bnc_app_version");
    }

    /* renamed from: b */
    public boolean m13370b(String str) {
        f11600b = str;
        String v = m13413v("bnc_branch_key");
        if (!(str == null || v == null)) {
            if (v.equals(str)) {
                return null;
            }
        }
        m13341L();
        m13365a("bnc_branch_key", str);
        return true;
    }

    /* renamed from: f */
    public String m13380f() {
        if (f11600b == null) {
            f11600b = m13413v("bnc_branch_key");
        }
        return f11600b;
    }

    /* renamed from: a */
    public java.lang.String m13358a(boolean r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r5 = this;
        if (r6 == 0) goto L_0x0005;
    L_0x0002:
        r0 = "io.branch.sdk.BranchKey";
        goto L_0x0007;
    L_0x0005:
        r0 = "io.branch.sdk.BranchKey.test";
    L_0x0007:
        if (r6 != 0) goto L_0x000c;
    L_0x0009:
        r5.m13353F();
    L_0x000c:
        r1 = 0;
        r2 = r5.f11607h;	 Catch:{ Exception -> 0x0037 }
        r2 = r2.getPackageManager();	 Catch:{ Exception -> 0x0037 }
        r3 = r5.f11607h;	 Catch:{ Exception -> 0x0037 }
        r3 = r3.getPackageName();	 Catch:{ Exception -> 0x0037 }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x0037 }
        r2 = r2.getApplicationInfo(r3, r4);	 Catch:{ Exception -> 0x0037 }
        r3 = r2.metaData;	 Catch:{ Exception -> 0x0037 }
        if (r3 == 0) goto L_0x0037;	 Catch:{ Exception -> 0x0037 }
    L_0x0023:
        r3 = r2.metaData;	 Catch:{ Exception -> 0x0037 }
        r3 = r3.getString(r0);	 Catch:{ Exception -> 0x0037 }
        if (r3 != 0) goto L_0x0036;
    L_0x002b:
        if (r6 != 0) goto L_0x0036;
    L_0x002d:
        r6 = r2.metaData;	 Catch:{ Exception -> 0x0036 }
        r1 = "io.branch.sdk.BranchKey";	 Catch:{ Exception -> 0x0036 }
        r1 = r6.getString(r1);	 Catch:{ Exception -> 0x0036 }
        goto L_0x0037;
    L_0x0036:
        r1 = r3;
    L_0x0037:
        r6 = android.text.TextUtils.isEmpty(r1);
        if (r6 == 0) goto L_0x0054;
    L_0x003d:
        r6 = r5.f11607h;	 Catch:{ Exception -> 0x0054 }
        r6 = r6.getResources();	 Catch:{ Exception -> 0x0054 }
        r2 = "string";	 Catch:{ Exception -> 0x0054 }
        r3 = r5.f11607h;	 Catch:{ Exception -> 0x0054 }
        r3 = r3.getPackageName();	 Catch:{ Exception -> 0x0054 }
        r0 = r6.getIdentifier(r0, r2, r3);	 Catch:{ Exception -> 0x0054 }
        r6 = r6.getString(r0);	 Catch:{ Exception -> 0x0054 }
        goto L_0x0055;
    L_0x0054:
        r6 = r1;
    L_0x0055:
        if (r6 != 0) goto L_0x0059;
    L_0x0057:
        r6 = "bnc_no_value";
    L_0x0059:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.n.a(boolean):java.lang.String");
    }

    /* renamed from: c */
    public void m13372c(String str) {
        m13365a("bnc_device_fingerprint_id", str);
    }

    /* renamed from: g */
    public String m13382g() {
        return m13413v("bnc_device_fingerprint_id");
    }

    /* renamed from: d */
    public void m13376d(String str) {
        m13365a("bnc_session_id", str);
    }

    /* renamed from: h */
    public String m13384h() {
        return m13413v("bnc_session_id");
    }

    /* renamed from: e */
    public void m13378e(String str) {
        m13365a("bnc_identity_id", str);
    }

    /* renamed from: i */
    public String m13386i() {
        return m13413v("bnc_identity_id");
    }

    /* renamed from: f */
    public void m13381f(String str) {
        m13365a("bnc_identity", str);
    }

    /* renamed from: j */
    public String m13388j() {
        return m13413v("bnc_identity");
    }

    /* renamed from: g */
    public void m13383g(String str) {
        m13365a("bnc_link_click_id", str);
    }

    /* renamed from: k */
    public String m13390k() {
        return m13413v("bnc_link_click_id");
    }

    /* renamed from: a */
    public void m13360a(Boolean bool) {
        m13364a("bnc_triggered_by_fb_app_link", bool);
    }

    /* renamed from: l */
    public boolean m13393l() {
        return m13415w("bnc_triggered_by_fb_app_link");
    }

    /* renamed from: h */
    public void m13385h(String str) {
        m13365a("bnc_external_intent_uri", str);
    }

    /* renamed from: m */
    public String m13394m() {
        return m13413v("bnc_external_intent_uri");
    }

    /* renamed from: i */
    public void m13387i(String str) {
        m13365a("bnc_external_intent_extra", str);
    }

    /* renamed from: n */
    public String m13396n() {
        return m13413v("bnc_external_intent_extra");
    }

    /* renamed from: j */
    public void m13389j(String str) {
        m13365a("bnc_link_click_identifier", str);
    }

    /* renamed from: o */
    public String m13398o() {
        return m13413v("bnc_link_click_identifier");
    }

    /* renamed from: k */
    public void m13391k(String str) {
        m13365a("bnc_google_search_install_identifier", str);
    }

    /* renamed from: p */
    public String m13400p() {
        return m13413v("bnc_google_search_install_identifier");
    }

    /* renamed from: l */
    public void m13392l(String str) {
        m13365a("bnc_google_play_install_referrer_extras", str);
    }

    /* renamed from: q */
    public String m13402q() {
        return m13413v("bnc_google_play_install_referrer_extras");
    }

    /* renamed from: m */
    public void m13395m(String str) {
        m13365a("bnc_app_link", str);
    }

    /* renamed from: r */
    public String m13404r() {
        return m13413v("bnc_app_link");
    }

    /* renamed from: b */
    public void m13369b(boolean z) {
        m13364a("bnc_is_full_app_conversion", Boolean.valueOf(z));
    }

    /* renamed from: s */
    public boolean m13407s() {
        return m13415w("bnc_is_full_app_conversion");
    }

    /* renamed from: n */
    public void m13397n(String str) {
        m13365a("bnc_push_identifier", str);
    }

    /* renamed from: t */
    public String m13409t() {
        return m13413v("bnc_push_identifier");
    }

    /* renamed from: u */
    public String m13411u() {
        return m13413v("bnc_session_params");
    }

    /* renamed from: o */
    public void m13399o(String str) {
        m13365a("bnc_session_params", str);
    }

    /* renamed from: v */
    public String m13412v() {
        return m13413v("bnc_install_params");
    }

    /* renamed from: p */
    public void m13401p(String str) {
        m13365a("bnc_install_params", str);
    }

    /* renamed from: q */
    public void m13403q(String str) {
        m13365a("bnc_install_referrer", str);
    }

    /* renamed from: r */
    public void m13405r(String str) {
        m13365a("bnc_user_url", str);
    }

    /* renamed from: w */
    public String m13414w() {
        return m13413v("bnc_user_url");
    }

    /* renamed from: x */
    public int m13416x() {
        return m13408t("bnc_is_referrable");
    }

    /* renamed from: y */
    public void m13419y() {
        m13379e("bnc_is_referrable", 1);
    }

    /* renamed from: z */
    public void m13420z() {
        m13379e("bnc_is_referrable", 0);
    }

    /* renamed from: A */
    boolean m13348A() {
        return m13415w("bnc_limit_facebook_tracking");
    }

    /* renamed from: B */
    public void m13349B() {
        Iterator it = m13339J().iterator();
        while (it.hasNext()) {
            m13362a((String) it.next(), 0);
        }
        m13343a(new ArrayList());
        it = m13340K().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m13368b(str, 0);
            m13373c(str, 0);
        }
        m13345b(new ArrayList());
    }

    /* renamed from: J */
    private ArrayList<String> m13339J() {
        String v = m13413v("bnc_buckets");
        if (v.equals("bnc_no_value")) {
            return new ArrayList();
        }
        return m13347z(v);
    }

    /* renamed from: a */
    private void m13343a(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            m13365a("bnc_buckets", "bnc_no_value");
        } else {
            m13365a("bnc_buckets", m13346c((ArrayList) arrayList));
        }
    }

    /* renamed from: a */
    public void m13362a(String str, int i) {
        ArrayList J = m13339J();
        if (!J.contains(str)) {
            J.add(str);
            m13343a(J);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_credit_base_");
        stringBuilder.append(str);
        m13379e(stringBuilder.toString(), i);
    }

    /* renamed from: s */
    public int m13406s(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_credit_base_");
        stringBuilder.append(str);
        return m13408t(stringBuilder.toString());
    }

    /* renamed from: K */
    private ArrayList<String> m13340K() {
        String v = m13413v("bnc_actions");
        if (v.equals("bnc_no_value")) {
            return new ArrayList();
        }
        return m13347z(v);
    }

    /* renamed from: b */
    private void m13345b(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            m13365a("bnc_actions", "bnc_no_value");
        } else {
            m13365a("bnc_actions", m13346c((ArrayList) arrayList));
        }
    }

    /* renamed from: b */
    public void m13368b(String str, int i) {
        ArrayList K = m13340K();
        if (!K.contains(str)) {
            K.add(str);
            m13345b(K);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_total_base_");
        stringBuilder.append(str);
        m13379e(stringBuilder.toString(), i);
    }

    /* renamed from: c */
    public void m13373c(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_balance_base_");
        stringBuilder.append(str);
        m13379e(stringBuilder.toString(), i);
    }

    /* renamed from: c */
    private String m13346c(ArrayList<String> arrayList) {
        String str = "";
        arrayList = arrayList.iterator();
        while (arrayList.hasNext()) {
            String str2 = (String) arrayList.next();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append(",");
            str = stringBuilder.toString();
        }
        return str.substring(null, str.length() - 1);
    }

    /* renamed from: z */
    private ArrayList<String> m13347z(String str) {
        Object arrayList = new ArrayList();
        Collections.addAll(arrayList, str.split(","));
        return arrayList;
    }

    /* renamed from: t */
    public int m13408t(String str) {
        return m13375d(str, 0);
    }

    /* renamed from: d */
    public int m13375d(String str, int i) {
        return f11601c.f11603d.getInt(str, i);
    }

    /* renamed from: u */
    public long m13410u(String str) {
        return f11601c.f11603d.getLong(str, 0);
    }

    /* renamed from: v */
    public String m13413v(String str) {
        return f11601c.f11603d.getString(str, "bnc_no_value");
    }

    /* renamed from: w */
    public boolean m13415w(String str) {
        return f11601c.f11603d.getBoolean(str, false);
    }

    /* renamed from: e */
    public void m13379e(String str, int i) {
        f11601c.f11604e.putInt(str, i);
        f11601c.f11604e.apply();
    }

    /* renamed from: a */
    public void m13363a(String str, long j) {
        f11601c.f11604e.putLong(str, j);
        f11601c.f11604e.apply();
    }

    /* renamed from: a */
    public void m13365a(String str, String str2) {
        f11601c.f11604e.putString(str, str2);
        f11601c.f11604e.apply();
    }

    /* renamed from: a */
    public void m13364a(String str, Boolean bool) {
        f11601c.f11604e.putBoolean(str, bool.booleanValue());
        f11601c.f11604e.apply();
    }

    /* renamed from: x */
    public void m13417x(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_branch_view_use_");
        stringBuilder.append(str);
        m13379e(stringBuilder.toString(), m13418y(str) + 1);
    }

    /* renamed from: y */
    public int m13418y(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bnc_branch_view_use_");
        stringBuilder.append(str);
        return m13375d(stringBuilder.toString(), 0);
    }

    /* renamed from: C */
    public org.json.JSONObject m13350C() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = f11602i;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0 = f11602i;
        goto L_0x0028;
    L_0x0007:
        r0 = "bnc_branch_analytical_data";
        r0 = r3.m13413v(r0);
        r1 = new org.json.JSONObject;
        r1.<init>();
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x0027;
    L_0x0018:
        r2 = "bnc_no_value";
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x0027;
    L_0x0020:
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0027 }
        r2.<init>(r0);	 Catch:{ JSONException -> 0x0027 }
        r0 = r2;
        goto L_0x0028;
    L_0x0027:
        r0 = r1;
    L_0x0028:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.n.C():org.json.JSONObject");
    }

    /* renamed from: D */
    public void m13351D() {
        f11602i = null;
        m13365a("bnc_branch_analytical_data", "");
    }

    /* renamed from: a */
    public void m13366a(org.json.JSONObject r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.m13384h();
        r1 = "bnc_no_value";
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x003e;
    L_0x000c:
        r1 = f11602i;
        if (r1 != 0) goto L_0x0016;
    L_0x0010:
        r1 = r3.m13350C();
        f11602i = r1;
    L_0x0016:
        r1 = f11602i;	 Catch:{ JSONException -> 0x003e }
        r1 = r1.has(r0);	 Catch:{ JSONException -> 0x003e }
        if (r1 == 0) goto L_0x0025;	 Catch:{ JSONException -> 0x003e }
    L_0x001e:
        r1 = f11602i;	 Catch:{ JSONException -> 0x003e }
        r0 = r1.getJSONArray(r0);	 Catch:{ JSONException -> 0x003e }
        goto L_0x0030;	 Catch:{ JSONException -> 0x003e }
    L_0x0025:
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x003e }
        r1.<init>();	 Catch:{ JSONException -> 0x003e }
        r2 = f11602i;	 Catch:{ JSONException -> 0x003e }
        r2.put(r0, r1);	 Catch:{ JSONException -> 0x003e }
        r0 = r1;	 Catch:{ JSONException -> 0x003e }
    L_0x0030:
        r0.put(r4);	 Catch:{ JSONException -> 0x003e }
        r4 = "bnc_branch_analytical_data";	 Catch:{ JSONException -> 0x003e }
        r0 = f11602i;	 Catch:{ JSONException -> 0x003e }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x003e }
        r3.m13365a(r4, r0);	 Catch:{ JSONException -> 0x003e }
    L_0x003e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.n.a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public void m13359a(long j) {
        m13363a("bnc_branch_strong_match_time", j);
    }

    /* renamed from: E */
    public long m13352E() {
        return m13410u("bnc_branch_strong_match_time");
    }

    /* renamed from: L */
    private void m13341L() {
        String k = m13390k();
        String o = m13398o();
        String r = m13404r();
        String t = m13409t();
        this.f11604e.clear();
        m13383g(k);
        m13389j(o);
        m13395m(r);
        m13397n(t);
        f11601c.f11604e.apply();
    }

    /* renamed from: F */
    public void m13353F() {
        f11599a = true;
    }

    /* renamed from: G */
    public boolean m13354G() {
        return f11599a;
    }

    /* renamed from: H */
    public JSONObject m13355H() {
        return this.f11605f;
    }

    /* renamed from: I */
    public JSONObject m13356I() {
        return this.f11606g;
    }

    /* renamed from: b */
    public static void m13344b(String str, String str2) {
        if ((Branch.f17916b == null && f11599a) || (Branch.f17916b != null && Branch.f17916b.booleanValue())) {
            if (str2 != null) {
                Log.i(str, str2);
            } else {
                Log.i(str, "An error occurred. Unable to print the log message");
            }
        }
    }
}
