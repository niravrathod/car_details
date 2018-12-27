package com.facebook.ads.internal.p101q.p102a;

import android.app.KeyguardManager;
import android.content.Context;
import android.util.Log;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.q.a.y */
public class C1938y {
    /* renamed from: a */
    private static final String f5937a = "y";

    /* renamed from: a */
    public static boolean m7334a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }

    /* renamed from: a */
    public static boolean m7335a(Map<String, String> map) {
        if (map != null) {
            if (!map.isEmpty()) {
                String str = (String) map.get("wfdkg");
                String str2 = (String) map.get("wfswl");
                String str3 = (String) map.get("kgr");
                return str != null && str.equals("1") && str2 != null && str2.equals("1") && str3 != null && str3.equals("true");
            }
        }
        Log.v(f5937a, "Invalid Window info in window interactive check, assuming is not a Lockscreen.");
        return false;
    }

    /* renamed from: b */
    public static boolean m7336b(Map<String, String> map) {
        boolean z = false;
        if (map != null) {
            if (!map.isEmpty()) {
                String str = (String) map.get("wfdkg");
                String str2 = (String) map.get("wfswl");
                if ((str != null && str.equals("1")) || (str2 != null && str2.equals("1"))) {
                    return false;
                }
                String str3 = (String) map.get("kgr");
                if (str3 != null && str3.equals("true")) {
                    z = true;
                }
                return z;
            }
        }
        Log.v(f5937a, "Invalid Window info in window interactive check, assuming not obstructed by Keyguard.");
        return false;
    }
}
