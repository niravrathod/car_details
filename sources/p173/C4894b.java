package p173;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: b */
public final class C4894b {
    /* renamed from: a */
    public static String m30253a(Map<String, String> map) {
        String str = "{";
        for (String str2 : map.keySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("\"");
            stringBuilder.append(str2);
            stringBuilder.append("\":\"");
            stringBuilder.append((String) map.get(str2));
            stringBuilder.append("\",");
            str = stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str.substring(0, str.length() - 1));
        stringBuilder2.append("}");
        return stringBuilder2.toString();
    }

    /* renamed from: a */
    public static java.util.Map m30254a(android.content.Context r20) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r20;
        r1 = "com.survey.one.library.shared.preference";
        r2 = 0;
        r1 = r0.getSharedPreferences(r1, r2);
        r3 = "NOT_SET";
        r4 = 1;
        r5 = "connectivity";	 Catch:{ Exception -> 0x002b }
        r5 = r0.getSystemService(r5);	 Catch:{ Exception -> 0x002b }
        r5 = (android.net.ConnectivityManager) r5;	 Catch:{ Exception -> 0x002b }
        r5 = r5.getActiveNetworkInfo();	 Catch:{ Exception -> 0x002b }
        r6 = r5.getType();	 Catch:{ Exception -> 0x002b }
        if (r6 != 0) goto L_0x0022;	 Catch:{ Exception -> 0x002b }
    L_0x001e:
        r5 = "MOBILE";	 Catch:{ Exception -> 0x002b }
    L_0x0020:
        r3 = r5;	 Catch:{ Exception -> 0x002b }
        goto L_0x002c;	 Catch:{ Exception -> 0x002b }
    L_0x0022:
        r5 = r5.getType();	 Catch:{ Exception -> 0x002b }
        if (r5 != r4) goto L_0x002c;	 Catch:{ Exception -> 0x002b }
    L_0x0028:
        r5 = "WIFI";	 Catch:{ Exception -> 0x002b }
        goto L_0x0020;
    L_0x002c:
        r5 = "allowLocationDetection";
        r6 = "true";
        r5 = r1.getString(r5, r6);
        r6 = "true";
        r5 = r5.equalsIgnoreCase(r6);
        if (r5 == 0) goto L_0x0123;
    L_0x003c:
        r5 = new c;	 Catch:{ Exception -> 0x0122 }
        r5.<init>();	 Catch:{ Exception -> 0x0122 }
        r5 = r5.m30256a(r0);	 Catch:{ Exception -> 0x0122 }
        r6 = new android.location.Geocoder;	 Catch:{ Exception -> 0x0122 }
        r7 = java.util.Locale.getDefault();	 Catch:{ Exception -> 0x0122 }
        r6.<init>(r0, r7);	 Catch:{ Exception -> 0x0122 }
        r12 = "NOT_SET";	 Catch:{ Exception -> 0x0122 }
        r13 = "NOT_SET";	 Catch:{ Exception -> 0x0122 }
        r14 = "NOT_SET";	 Catch:{ Exception -> 0x0122 }
        r15 = "NOT_SET";	 Catch:{ Exception -> 0x0122 }
        r16 = "";	 Catch:{ Exception -> 0x0122 }
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0122 }
        r7.<init>();	 Catch:{ Exception -> 0x0122 }
        r8 = r5.getLatitude();	 Catch:{ Exception -> 0x0122 }
        r7.append(r8);	 Catch:{ Exception -> 0x0122 }
        r11 = r7.toString();	 Catch:{ Exception -> 0x0122 }
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0122 }
        r7.<init>();	 Catch:{ Exception -> 0x0122 }
        r8 = r5.getLongitude();	 Catch:{ Exception -> 0x0122 }
        r7.append(r8);	 Catch:{ Exception -> 0x0122 }
        r9 = r7.toString();	 Catch:{ Exception -> 0x0122 }
        r7 = r5.getLatitude();	 Catch:{ Exception -> 0x0122 }
        r17 = r5.getLongitude();	 Catch:{ Exception -> 0x0122 }
        r5 = 1;	 Catch:{ Exception -> 0x0122 }
        r4 = r9;	 Catch:{ Exception -> 0x0122 }
        r9 = r17;	 Catch:{ Exception -> 0x0122 }
        r19 = r11;	 Catch:{ Exception -> 0x0122 }
        r11 = r5;	 Catch:{ Exception -> 0x0122 }
        r5 = r6.getFromLocation(r7, r9, r11);	 Catch:{ Exception -> 0x0122 }
        r6 = r5.size();	 Catch:{ Exception -> 0x0122 }
        if (r6 <= 0) goto L_0x00f3;	 Catch:{ Exception -> 0x0122 }
    L_0x0091:
        r6 = r5.get(r2);	 Catch:{ Exception -> 0x0122 }
        r6 = (android.location.Address) r6;	 Catch:{ Exception -> 0x0122 }
        r12 = r6.getLocality();	 Catch:{ Exception -> 0x0122 }
        r6 = r5.get(r2);	 Catch:{ Exception -> 0x0122 }
        r6 = (android.location.Address) r6;	 Catch:{ Exception -> 0x0122 }
        r13 = r6.getAdminArea();	 Catch:{ Exception -> 0x0122 }
        r6 = r5.get(r2);	 Catch:{ Exception -> 0x0122 }
        r6 = (android.location.Address) r6;	 Catch:{ Exception -> 0x0122 }
        r14 = r6.getCountryCode();	 Catch:{ Exception -> 0x0122 }
        r6 = r5.get(r2);	 Catch:{ Exception -> 0x0122 }
        r6 = (android.location.Address) r6;	 Catch:{ Exception -> 0x0122 }
        r15 = r6.getPostalCode();	 Catch:{ Exception -> 0x0122 }
        r7 = r16;	 Catch:{ Exception -> 0x0122 }
        r6 = 0;	 Catch:{ Exception -> 0x0122 }
    L_0x00bc:
        r8 = r5.get(r2);	 Catch:{ Exception -> 0x0122 }
        r8 = (android.location.Address) r8;	 Catch:{ Exception -> 0x0122 }
        r8 = r8.getMaxAddressLineIndex();	 Catch:{ Exception -> 0x0122 }
        if (r6 >= r8) goto L_0x00e9;	 Catch:{ Exception -> 0x0122 }
    L_0x00c8:
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0122 }
        r8.<init>();	 Catch:{ Exception -> 0x0122 }
        r8.append(r7);	 Catch:{ Exception -> 0x0122 }
        r7 = r5.get(r2);	 Catch:{ Exception -> 0x0122 }
        r7 = (android.location.Address) r7;	 Catch:{ Exception -> 0x0122 }
        r7 = r7.getAddressLine(r6);	 Catch:{ Exception -> 0x0122 }
        r8.append(r7);	 Catch:{ Exception -> 0x0122 }
        r7 = " | ";	 Catch:{ Exception -> 0x0122 }
        r8.append(r7);	 Catch:{ Exception -> 0x0122 }
        r7 = r8.toString();	 Catch:{ Exception -> 0x0122 }
        r6 = r6 + 1;	 Catch:{ Exception -> 0x0122 }
        goto L_0x00bc;	 Catch:{ Exception -> 0x0122 }
    L_0x00e9:
        r5 = "";	 Catch:{ Exception -> 0x0122 }
        r5 = r7.equalsIgnoreCase(r5);	 Catch:{ Exception -> 0x0122 }
        if (r5 == 0) goto L_0x00f5;	 Catch:{ Exception -> 0x0122 }
    L_0x00f1:
        r16 = "NOT_SET";	 Catch:{ Exception -> 0x0122 }
    L_0x00f3:
        r7 = r16;	 Catch:{ Exception -> 0x0122 }
    L_0x00f5:
        r5 = r1.edit();	 Catch:{ Exception -> 0x0122 }
        r6 = "country_code";	 Catch:{ Exception -> 0x0122 }
        r5.putString(r6, r14);	 Catch:{ Exception -> 0x0122 }
        r6 = "state";	 Catch:{ Exception -> 0x0122 }
        r5.putString(r6, r13);	 Catch:{ Exception -> 0x0122 }
        r6 = "city";	 Catch:{ Exception -> 0x0122 }
        r5.putString(r6, r12);	 Catch:{ Exception -> 0x0122 }
        r6 = "street";	 Catch:{ Exception -> 0x0122 }
        r5.putString(r6, r7);	 Catch:{ Exception -> 0x0122 }
        r6 = "pincode";	 Catch:{ Exception -> 0x0122 }
        r5.putString(r6, r15);	 Catch:{ Exception -> 0x0122 }
        r6 = "lat";	 Catch:{ Exception -> 0x0122 }
        r7 = r19;	 Catch:{ Exception -> 0x0122 }
        r5.putString(r6, r7);	 Catch:{ Exception -> 0x0122 }
        r6 = "long";	 Catch:{ Exception -> 0x0122 }
        r5.putString(r6, r4);	 Catch:{ Exception -> 0x0122 }
        r5.commit();	 Catch:{ Exception -> 0x0122 }
        goto L_0x0123;
    L_0x0123:
        r4 = "phone";
        r4 = r0.getSystemService(r4);
        r4 = (android.telephony.TelephonyManager) r4;
        r4 = r4.getNetworkOperatorName();
        r5 = android.os.Build.MANUFACTURER;
        r6 = android.os.Build.MODEL;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = android.os.Build.VERSION.SDK_INT;
        r7.append(r8);
        r7 = r7.toString();
        r8 = r20.getApplicationContext();
        r8 = r8.getContentResolver();
        r9 = "android_id";
        r8 = android.provider.Settings.Secure.getString(r8, r9);
        r9 = "NOT_SET";
        r10 = r20.getResources();
        r10 = r10.getConfiguration();
        r10 = r10.screenLayout;
        r10 = r10 & 15;
        r11 = 3;
        if (r10 < r11) goto L_0x0163;
    L_0x0160:
        r10 = "Tablet";
        goto L_0x0165;
    L_0x0163:
        r10 = "Phone";
    L_0x0165:
        r11 = r20.getPackageManager();
        r12 = "";
        r13 = "";
        r14 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r11 = r11.getInstalledApplications(r14);	 Catch:{ Exception -> 0x01b8 }
        r11 = r11.iterator();	 Catch:{ Exception -> 0x01b8 }
    L_0x0177:
        r14 = r11.hasNext();	 Catch:{ Exception -> 0x01b8 }
        if (r14 == 0) goto L_0x01bc;	 Catch:{ Exception -> 0x01b8 }
    L_0x017d:
        r14 = r11.next();	 Catch:{ Exception -> 0x01b8 }
        r14 = (android.content.pm.ApplicationInfo) r14;	 Catch:{ Exception -> 0x01b8 }
        r15 = r14.flags;	 Catch:{ Exception -> 0x01b8 }
        r2 = 1;	 Catch:{ Exception -> 0x01b8 }
        r15 = r15 & r2;	 Catch:{ Exception -> 0x01b8 }
        if (r15 != r2) goto L_0x01a1;	 Catch:{ Exception -> 0x01b8 }
    L_0x0189:
        r15 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01b8 }
        r15.<init>();	 Catch:{ Exception -> 0x01b8 }
        r15.append(r12);	 Catch:{ Exception -> 0x01b8 }
        r12 = ",";	 Catch:{ Exception -> 0x01b8 }
        r15.append(r12);	 Catch:{ Exception -> 0x01b8 }
        r12 = r14.packageName;	 Catch:{ Exception -> 0x01b8 }
        r15.append(r12);	 Catch:{ Exception -> 0x01b8 }
        r12 = r15.toString();	 Catch:{ Exception -> 0x01b8 }
    L_0x019f:
        r2 = 0;	 Catch:{ Exception -> 0x01b8 }
        goto L_0x0177;	 Catch:{ Exception -> 0x01b8 }
    L_0x01a1:
        r15 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01b8 }
        r15.<init>();	 Catch:{ Exception -> 0x01b8 }
        r15.append(r13);	 Catch:{ Exception -> 0x01b8 }
        r13 = ",";	 Catch:{ Exception -> 0x01b8 }
        r15.append(r13);	 Catch:{ Exception -> 0x01b8 }
        r13 = r14.packageName;	 Catch:{ Exception -> 0x01b8 }
        r15.append(r13);	 Catch:{ Exception -> 0x01b8 }
        r13 = r15.toString();	 Catch:{ Exception -> 0x01b8 }
        goto L_0x019f;
    L_0x01b8:
        r12 = "TransactionTooLargeException";
        r13 = "TransactionTooLargeException";
    L_0x01bc:
        r0 = r20.getPackageName();
        r2 = new java.util.HashMap;
        r2.<init>();
        r11 = "last_displayed_survey_id";
        r14 = "last_displayed_survey_id";
        r15 = "0000";
        r14 = r1.getString(r14, r15);
        r2.put(r11, r14);
        r11 = "app_id";
        r14 = "app_id";
        r15 = "";
        r14 = r1.getString(r14, r15);
        r2.put(r11, r14);
        r11 = "publisher_key";
        r14 = "publisher_key";
        r15 = "";
        r14 = r1.getString(r14, r15);
        r2.put(r11, r14);
        r11 = "survey_test_code";
        r14 = "survey_test_code";
        r15 = "";
        r14 = r1.getString(r14, r15);
        r2.put(r11, r14);
        r11 = "device_id";
        r2.put(r11, r8);
        r8 = "google_ad_id";
        r11 = "google_ad_id";
        r14 = "NOT_SET";
        r11 = r1.getString(r11, r14);
        r2.put(r8, r11);
        r8 = "app_package";
        r2.put(r8, r0);
        r0 = "language";
        r8 = java.util.Locale.getDefault();
        r8 = r8.getDisplayLanguage();
        r2.put(r0, r8);
        r0 = "end_user_email";
        r2.put(r0, r9);
        r0 = "end_user_name";
        r8 = "end_user_name";
        r9 = "NOT_SET";
        r8 = r1.getString(r8, r9);
        r2.put(r0, r8);
        r0 = "os_type";
        r8 = "Android";
        r2.put(r0, r8);
        r0 = "device_type";
        r2.put(r0, r10);
        r0 = "age_by_app";
        r8 = "age_by_app";
        r9 = "NOT_SET";
        r8 = r1.getString(r8, r9);
        r2.put(r0, r8);
        r0 = "gender_by_app";
        r8 = "gender_by_app";
        r9 = "NOT_SET";
        r8 = r1.getString(r8, r9);
        r2.put(r0, r8);
        r0 = "email_by_app";
        r8 = "email_by_app";
        r9 = "NOT_SET";
        r8 = r1.getString(r8, r9);
        r2.put(r0, r8);
        r0 = "os_version";
        r2.put(r0, r7);
        r0 = "model";
        r2.put(r0, r6);
        r0 = "manufacturer";
        r2.put(r0, r5);
        r0 = "network_carrier";
        r2.put(r0, r4);
        r0 = "network_type";
        r2.put(r0, r3);
        r0 = "age";
        r3 = "age";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "gender";
        r3 = "gender";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "marital";
        r3 = "marital";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "vehicle";
        r3 = "vehicle";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "customField";
        r3 = "customField";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "qualification";
        r3 = "qualification";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "cellID";
        r3 = "cellID";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "cellLocationCode";
        r3 = "cellLocationCode";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "cellMCC";
        r3 = "cellMCC";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "cellMNC";
        r3 = "cellMNC";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "street";
        r3 = "street";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "city";
        r3 = "city";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "state";
        r3 = "state";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "country_code";
        r3 = "country_code";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "pincode";
        r3 = "pincode";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "lat";
        r3 = "lat";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "long";
        r3 = "long";
        r4 = "NOT_SET";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "backfill_by_app";
        r3 = "backfill_by_app";
        r4 = "1";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "cadre_by_app";
        r3 = "cadre_by_app";
        r4 = "";
        r3 = r1.getString(r3, r4);
        r2.put(r0, r3);
        r0 = "user_counter";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "user_counter";
        r5 = 0;
        r4 = r1.getInt(r4, r5);
        r3.append(r4);
        r3 = r3.toString();
        r2.put(r0, r3);
        r0 = "geographics";
        r3 = "NOT_SET";
        r2.put(r0, r3);
        r0 = "ignore_survey_ids";
        r3 = "ignore_survey_ids";
        r4 = "";
        r1 = r1.getString(r3, r4);
        r2.put(r0, r1);
        r0 = "list_of_apps_installed";
        r2.put(r0, r12);
        r0 = "list_of_apps_installed_by_user";
        r2.put(r0, r13);
        r0 = "last_fetch_request_timestamp";
        r1 = "NOT_SET";
        r2.put(r0, r1);
        r0 = "0";
        r1 = "1";
        r0 = r0.equalsIgnoreCase(r1);
        if (r0 == 0) goto L_0x03e3;
    L_0x03b9:
        r0 = "list_of_apps_installed";
        r1 = "NOT_SET";
        r2.put(r0, r1);
        r0 = "list_of_apps_installed_by_user";
        r1 = "NOT_SET";
        r2.put(r0, r1);
        r0 = "city";
        r1 = "Jaipur";
        r2.put(r0, r1);
        r0 = "state";
        r1 = "Rajasthan";
        r2.put(r0, r1);
        r0 = "country_code";
        r1 = "IN";
        r2.put(r0, r1);
        r0 = "pincode";
        r1 = "302033";
        r2.put(r0, r1);
    L_0x03e3:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a(android.content.Context):java.util.Map");
    }

    /* renamed from: b */
    public static ArrayList<NameValuePair> m30255b(Map<String, String> map) {
        ArrayList<NameValuePair> arrayList = new ArrayList();
        for (Entry entry : map.entrySet()) {
            arrayList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }
}
