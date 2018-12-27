package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.C2766c;

/* renamed from: io.fabric.sdk.android.services.common.g */
public class C2796g {
    /* renamed from: a */
    protected String m13678a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    /* renamed from: a */
    public String m13679a(Context context) {
        Object c = m13681c(context);
        if (TextUtils.isEmpty(c)) {
            c = m13682d(context);
        }
        if (TextUtils.isEmpty(c)) {
            c = m13680b(context);
        }
        if (TextUtils.isEmpty(c)) {
            m13683e(context);
        }
        return c;
    }

    /* renamed from: b */
    protected String m13680b(Context context) {
        return new C2803m().m13693a(context);
    }

    /* renamed from: c */
    protected String m13681c(Context context) {
        StringBuilder stringBuilder;
        String str = null;
        try {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (context == null) {
                return null;
            }
            String string = context.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    C2766c.m13524h().mo3554a("Fabric", "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str = string;
                }
                if (str != null) {
                    return str;
                }
                C2766c.m13524h().mo3554a("Fabric", "Falling back to Crashlytics key lookup from Manifest");
                return context.getString("com.crashlytics.ApiKey");
            } catch (Exception e) {
                context = e;
                str = string;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Caught non-fatal exception while retrieving apiKey: ");
                stringBuilder.append(context);
                C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
                return str;
            }
        } catch (Exception e2) {
            context = e2;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Caught non-fatal exception while retrieving apiKey: ");
            stringBuilder.append(context);
            C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
            return str;
        }
    }

    /* renamed from: d */
    protected String m13682d(Context context) {
        int a = CommonUtils.m13595a(context, "io.fabric.ApiKey", "string");
        if (a == 0) {
            C2766c.m13524h().mo3554a("Fabric", "Falling back to Crashlytics key lookup from Strings");
            a = CommonUtils.m13595a(context, "com.crashlytics.ApiKey", "string");
        }
        return a != 0 ? context.getResources().getString(a) : null;
    }

    /* renamed from: e */
    protected void m13683e(Context context) {
        if (C2766c.m13525i() || CommonUtils.m13633i(context) != null) {
            throw new IllegalArgumentException(m13678a());
        }
        C2766c.m13524h().mo3561e("Fabric", m13678a());
    }
}
