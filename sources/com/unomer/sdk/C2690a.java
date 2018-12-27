package com.unomer.sdk;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.webkit.WebView;
import android.widget.RelativeLayout.LayoutParams;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import p173.C4894b;
import p173.C4896d;
import p173.C4897e;
import p173.C4899f;
import p173.C4899f.C48982;
import p173.C4903g;

/* renamed from: com.unomer.sdk.a */
public class C2690a {
    /* renamed from: a */
    Activity f11246a;
    /* renamed from: b */
    C2691b f11247b;
    /* renamed from: c */
    C4897e f11248c = new C4897e();
    /* renamed from: d */
    private C4899f f11249d;
    /* renamed from: e */
    private SharedPreferences f11250e;

    public C2690a(final android.app.Activity r5, java.lang.String r6, java.lang.String r7, com.unomer.sdk.C2691b r8) {
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
        r4 = this;
        r4.<init>();
        r4.f11246a = r5;
        r0 = new e;
        r0.<init>();
        r4.f11248c = r0;
        r0 = r5.getApplicationContext();
        r1 = "com.survey.one.library.shared.preference";
        r2 = 0;
        r0 = r0.getSharedPreferences(r1, r2);
        r4.f11250e = r0;
        r0 = r4.f11250e;
        r0 = r0.edit();
        r1 = "publisher_key";
        r0.putString(r1, r6);
        r0.commit();
        r4.m13001a(r7);
        r4.f11247b = r8;
        r6 = new f;
        r6.<init>(r5, r8);
        r4.f11249d = r6;
        r6 = new com.unomer.sdk.a$1;
        r6.<init>(r4, r5);
        r5 = new java.lang.Void[r2];
        r6.execute(r5);
        r5 = r4.f11250e;
        r6 = "cellID";
        r7 = "NOT_SET";
        r5 = r5.getString(r6, r7);
        r6 = "NOT_SET";
        r5 = r5.equalsIgnoreCase(r6);
        if (r5 != 0) goto L_0x0085;
    L_0x004f:
        r5 = r4.f11250e;
        r6 = "cellLocationCode";
        r7 = "NOT_SET";
        r5 = r5.getString(r6, r7);
        r6 = "NOT_SET";
        r5 = r5.equalsIgnoreCase(r6);
        if (r5 != 0) goto L_0x0085;
    L_0x0061:
        r5 = r4.f11250e;
        r6 = "cellMCC";
        r7 = "NOT_SET";
        r5 = r5.getString(r6, r7);
        r6 = "NOT_SET";
        r5 = r5.equalsIgnoreCase(r6);
        if (r5 != 0) goto L_0x0085;
    L_0x0073:
        r5 = r4.f11250e;
        r6 = "cellMNC";
        r7 = "NOT_SET";
        r5 = r5.getString(r6, r7);
        r6 = "NOT_SET";
        r5 = r5.equalsIgnoreCase(r6);
        if (r5 == 0) goto L_0x00dc;
    L_0x0085:
        r5 = "NOT_SET";
        r6 = "NOT_SET";
        r7 = r4.f11246a;	 Catch:{ Exception -> 0x00dc }
        r8 = "phone";	 Catch:{ Exception -> 0x00dc }
        r7 = r7.getSystemService(r8);	 Catch:{ Exception -> 0x00dc }
        r7 = (android.telephony.TelephonyManager) r7;	 Catch:{ Exception -> 0x00dc }
        r8 = r7.getCellLocation();	 Catch:{ Exception -> 0x00dc }
        r8 = (android.telephony.gsm.GsmCellLocation) r8;	 Catch:{ Exception -> 0x00dc }
        r0 = r8.getCid();	 Catch:{ Exception -> 0x00dc }
        r8 = r8.getLac();	 Catch:{ Exception -> 0x00dc }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ Exception -> 0x00dc }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ Exception -> 0x00dc }
        r7 = r7.getNetworkOperator();	 Catch:{ Exception -> 0x00dc }
        r1 = android.text.TextUtils.isEmpty(r7);	 Catch:{ Exception -> 0x00dc }
        if (r1 != 0) goto L_0x00bf;	 Catch:{ Exception -> 0x00dc }
    L_0x00b3:
        r5 = 3;	 Catch:{ Exception -> 0x00dc }
        r6 = r7.substring(r2, r5);	 Catch:{ Exception -> 0x00dc }
        r5 = r7.substring(r5);	 Catch:{ Exception -> 0x00dc }
        r3 = r6;	 Catch:{ Exception -> 0x00dc }
        r6 = r5;	 Catch:{ Exception -> 0x00dc }
        r5 = r3;	 Catch:{ Exception -> 0x00dc }
    L_0x00bf:
        r7 = r4.f11250e;	 Catch:{ Exception -> 0x00dc }
        r7 = r7.edit();	 Catch:{ Exception -> 0x00dc }
        r1 = "cellID";	 Catch:{ Exception -> 0x00dc }
        r7.putString(r1, r0);	 Catch:{ Exception -> 0x00dc }
        r0 = "cellLocationCode";	 Catch:{ Exception -> 0x00dc }
        r7.putString(r0, r8);	 Catch:{ Exception -> 0x00dc }
        r8 = "cellMCC";	 Catch:{ Exception -> 0x00dc }
        r7.putString(r8, r5);	 Catch:{ Exception -> 0x00dc }
        r5 = "cellMNC";	 Catch:{ Exception -> 0x00dc }
        r7.putString(r5, r6);	 Catch:{ Exception -> 0x00dc }
        r7.commit();	 Catch:{ Exception -> 0x00dc }
    L_0x00dc:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unomer.sdk.a.<init>(android.app.Activity, java.lang.String, java.lang.String, com.unomer.sdk.b):void");
    }

    /* renamed from: a */
    public void m12999a() {
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
        r2 = this;
        r0 = 0;
        r2.m13000a(r0);	 Catch:{ Exception -> 0x0005 }
        return;
    L_0x0005:
        r0 = r2.f11247b;
        r1 = "Response corrupt :: error Code :: 118";
        r0.mo1204a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unomer.sdk.a.a():void");
    }

    /* renamed from: a */
    public void m13000a(int i) {
        if (!C4899f.a("Default")) {
            C4899f c4899f = this.f11249d;
            String str = "Default";
            Calendar instance = Calendar.getInstance();
            String format = new SimpleDateFormat("dd-MMM-yyyy").format(instance.getTime());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(instance.getTimeInMillis());
            if (Long.parseLong(stringBuilder.toString()) > Long.parseLong(C4899f.f21928c.getString("last_fetch_request_timestamp", "0")) + 10000) {
                Editor edit = C4899f.f21928c.edit();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(instance.getTimeInMillis());
                edit.putString("last_fetch_request_timestamp", stringBuilder2.toString());
                edit.commit();
                if (!C4899f.a(str)) {
                    C4899f.f21927b = i;
                    if (!format.equalsIgnoreCase(C4899f.f21928c.getString("last_survey_upload_timestamp", "NOT_SET"))) {
                        Editor edit2 = C4899f.f21928c.edit();
                        edit2.putInt("user_counter", 0);
                        edit2.commit();
                    }
                    c4899f.f21932f++;
                    WebView webView = new WebView(c4899f.f21933g);
                    webView.setLayoutParams(new LayoutParams(-1, -1));
                    UnomerWebActivity.f11242c = new C4903g(c4899f.f21933g, C4899f.f21926a);
                    UnomerWebActivity.f11240a = webView;
                    UnomerWebActivity.m12993a();
                    C4894b c4894b = new C4894b();
                    Map a = C4894b.a(c4899f.f21933g);
                    a.put("purpose", "get-survey-details-sdk");
                    a.put("sdk_version", "15.0");
                    a.put("app_location", str);
                    a.put("survey_id", C4899f.f21928c.getString("survey_id", String.valueOf(i)));
                    Editor edit3 = C4899f.f21928c.edit();
                    edit3.putString("survey_test_code", "");
                    edit3.commit();
                    String a2 = C4896d.a(C4894b.a(a), "1612200904012015");
                    try {
                        StringBuilder stringBuilder3 = new StringBuilder("q=");
                        stringBuilder3.append(URLEncoder.encode(a2, "UTF-8"));
                        a2 = stringBuilder3.toString();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                        a2 = null;
                    }
                    webView.postUrl("http://www.unomer.com/api_sdk_v3/cakePHP/surveys/", a2.getBytes());
                    C4899f.f21926a.mo1202a();
                    return;
                }
                return;
            }
            C4899f.f21926a.mo1204a("UNOMER :: Request cancelled. Flood detected. Please wait for 10 seconds before making a new request");
        }
    }

    /* renamed from: a */
    public void m13001a(String str) {
        Editor edit = this.f11250e.edit();
        edit.putString("app_id", str);
        edit.commit();
    }

    /* renamed from: b */
    public void m13002b() {
        String str = "Default";
        try {
            if (C4899f.a(str)) {
                C4899f c4899f = this.f11249d;
                if (C4899f.a(str)) {
                    Editor edit = C4899f.f21928c.edit();
                    edit.putString("last_displayed_survey_id", C4899f.f21928c.getString("lastFetchedSurveyId", "0000"));
                    edit.commit();
                    c4899f.f21933g.runOnUiThread(new C48982(c4899f));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.f11247b.mo1204a("Response corrupt :: error Code :: 119");
        }
    }
}
