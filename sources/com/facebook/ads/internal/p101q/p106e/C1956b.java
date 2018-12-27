package com.facebook.ads.internal.p101q.p106e;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.util.Log;
import android.view.Window;
import com.facebook.ads.internal.p101q.p102a.C1938y;
import com.facebook.ads.internal.p101q.p105d.C1953a;
import com.facebook.ads.internal.p101q.p105d.C1954b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.q.e.b */
public class C1956b {
    /* renamed from: a */
    private static final String f6009a = "b";

    /* renamed from: a */
    public static Map<String, String> m7387a(Context context) {
        Map<String, String> hashMap = new HashMap();
        if (context == null) {
            Log.v(f6009a, "Null context in window interactive check.");
            return hashMap;
        }
        try {
            String str;
            String str2;
            hashMap.put("kgr", String.valueOf(C1956b.m7389c(context)));
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    int i = window.getAttributes().flags;
                    hashMap.put("wt", Integer.toString(window.getAttributes().type));
                    hashMap.put("wfdkg", (4194304 & i) > 0 ? "1" : "0");
                    hashMap.put("wfswl", (524288 & i) > 0 ? "1" : "0");
                    return hashMap;
                }
                str = f6009a;
                str2 = "Invalid window in window interactive check, assuming interactive.";
            } else {
                str = f6009a;
                str2 = "Invalid Activity context in window interactive check, assuming interactive.";
            }
            Log.v(str, str2);
        } catch (Exception e) {
            Log.e(f6009a, "Exception in window info check", e);
            C1953a.m7382a(context, "risky", C1954b.f6004r, e);
        }
        return hashMap;
    }

    /* renamed from: b */
    public static boolean m7388b(Context context) {
        return C1938y.m7336b(C1956b.m7387a(context)) ^ 1;
    }

    /* renamed from: c */
    public static boolean m7389c(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
