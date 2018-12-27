package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.C2766c;

/* renamed from: io.fabric.sdk.android.services.common.m */
public class C2803m {
    /* renamed from: a */
    protected String m13693a(Context context) {
        int a = CommonUtils.m13595a(context, "google_app_id", "string");
        if (a == 0) {
            return null;
        }
        C2766c.m13524h().mo3554a("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
        return m13694a(context.getResources().getString(a));
    }

    /* renamed from: a */
    protected String m13694a(String str) {
        return CommonUtils.m13622b(str).substring(0, 40);
    }

    /* renamed from: b */
    public boolean m13695b(Context context) {
        boolean z = false;
        if (CommonUtils.m13616a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        Object obj = CommonUtils.m13595a(context, "google_app_id", "string") != 0 ? 1 : null;
        if (TextUtils.isEmpty(new C2796g().m13681c(context))) {
            if (TextUtils.isEmpty(new C2796g().m13682d(context)) != null) {
                context = null;
                if (obj != null && r5 == null) {
                    z = true;
                }
                return z;
            }
        }
        context = true;
        z = true;
        return z;
    }
}
