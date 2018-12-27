package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.y */
final class C2605y {
    /* renamed from: b */
    private static final long f11067b = TimeUnit.DAYS.toMillis(7);
    /* renamed from: a */
    final String f11068a;
    /* renamed from: c */
    private final String f11069c;
    /* renamed from: d */
    private final long f11070d;

    private C2605y(String str, String str2, long j) {
        this.f11068a = str;
        this.f11069c = str2;
        this.f11070d = j;
    }

    /* renamed from: a */
    static C2605y m12791a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C2605y(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C2605y(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (String str2) {
            str2 = String.valueOf(str2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 23);
            stringBuilder.append("Failed to parse token: ");
            stringBuilder.append(str2);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return null;
        }
    }

    /* renamed from: a */
    static String m12793a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (String str3) {
            str3 = String.valueOf(str3);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str3).length() + 24);
            stringBuilder.append("Failed to encode token: ");
            stringBuilder.append(str3);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return null;
        }
    }

    /* renamed from: a */
    static String m12792a(C2605y c2605y) {
        return c2605y == null ? null : c2605y.f11068a;
    }

    /* renamed from: b */
    final boolean m12794b(String str) {
        if (System.currentTimeMillis() <= this.f11070d + f11067b) {
            if (str.equals(this.f11069c) != null) {
                return null;
            }
        }
        return true;
    }
}
