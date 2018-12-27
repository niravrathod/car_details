package com.android.billingclient.p041a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.C1025g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.billingclient.a.a */
public final class C1003a {
    /* renamed from: a */
    public static int f3372a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static void m4332a(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    /* renamed from: b */
    public static void m4333b(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: a */
    public static int m4329a(Intent intent, String str) {
        if (intent != null) {
            return C1003a.m4330a(intent.getExtras(), str);
        }
        C1003a.m4333b("BillingHelper", "Got null intent!");
        return 6;
    }

    /* renamed from: a */
    public static int m4330a(Bundle bundle, String str) {
        if (bundle == null) {
            C1003a.m4333b(str, "Unexpected null bundle received!");
            return 6;
        }
        bundle = bundle.get("RESPONSE_CODE");
        if (bundle == null) {
            C1003a.m4332a(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return null;
        } else if (bundle instanceof Integer) {
            return ((Integer) bundle).intValue();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected type for bundle response code: ");
            stringBuilder.append(bundle.getClass().getName());
            C1003a.m4333b(str, stringBuilder.toString());
            return 6;
        }
    }

    /* renamed from: a */
    public static List<C1025g> m4331a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        List stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        List stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        List<C1025g> arrayList = new ArrayList();
        if (stringArrayList != null) {
            if (stringArrayList2 != null) {
                bundle = null;
                while (bundle < stringArrayList.size() && bundle < stringArrayList2.size()) {
                    C1025g c = C1003a.m4334c((String) stringArrayList.get(bundle), (String) stringArrayList2.get(bundle));
                    if (c != null) {
                        arrayList.add(c);
                    }
                    bundle++;
                }
                return arrayList;
            }
        }
        C1003a.m4333b("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
        bundle = C1003a.m4334c(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
        if (bundle == null) {
            C1003a.m4333b("BillingHelper", "Couldn't find single purchase data as well.");
            return null;
        }
        arrayList.add(bundle);
        return arrayList;
    }

    /* renamed from: c */
    private static C1025g m4334c(String str, String str2) {
        C1025g c1025g = null;
        if (str != null) {
            if (str2 != null) {
                try {
                    c1025g = new C1025g(str, str2);
                } catch (String str3) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Got JSONException while parsing purchase data: ");
                    stringBuilder.append(str3);
                    C1003a.m4333b("BillingHelper", stringBuilder.toString());
                }
                return c1025g;
            }
        }
        C1003a.m4333b("BillingHelper", "Received a bad purchase data.");
        return null;
    }
}
