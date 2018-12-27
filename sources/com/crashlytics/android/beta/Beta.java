package com.crashlytics.android.beta;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2800k;
import io.fabric.sdk.android.services.common.C4308q;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import io.fabric.sdk.android.services.network.C4317b;
import io.fabric.sdk.android.services.p146a.C4732b;
import io.fabric.sdk.android.services.p148c.C4298d;
import io.fabric.sdk.android.services.settings.C2843f;
import io.fabric.sdk.android.services.settings.C2851q;
import io.fabric.sdk.android.services.settings.C2853s;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Beta extends C2771h<Boolean> implements C2800k {
    private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private static final String CRASHLYTICS_BUILD_PROPERTIES = "crashlytics-build.properties";
    static final String NO_DEVICE_TOKEN = "";
    public static final String TAG = "Beta";
    private final C4732b<String> deviceTokenCache = new C4732b();
    private final DeviceTokenLoader deviceTokenLoader = new DeviceTokenLoader();
    private C1342h updatesController;

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:beta";
    }

    public String getVersion() {
        return "1.2.8.25";
    }

    public static Beta getInstance() {
        return (Beta) C2766c.m13515a(Beta.class);
    }

    @TargetApi(14)
    protected boolean onPreExecute() {
        this.updatesController = createUpdatesController(VERSION.SDK_INT, (Application) getContext().getApplicationContext());
        return true;
    }

    protected Boolean doInBackground() {
        C2766c.m13524h().mo3554a(TAG, "Beta kit initializing...");
        Context context = getContext();
        IdManager idManager = getIdManager();
        if (TextUtils.isEmpty(getBetaDeviceToken(context, idManager.m13656i()))) {
            C2766c.m13524h().mo3554a(TAG, "A Beta device token was not found for this app");
            return Boolean.valueOf(false);
        }
        C2766c.m13524h().mo3554a(TAG, "Beta device token is present, checking for app updates.");
        C2843f betaSettingsData = getBetaSettingsData();
        C1339c loadBuildProperties = loadBuildProperties(context);
        if (canCheckForUpdates(betaSettingsData, loadBuildProperties)) {
            this.updatesController.mo1120a(context, this, idManager, betaSettingsData, loadBuildProperties, new C4298d(this), new C4308q(), new C4317b(C2766c.m13524h()));
        }
        return Boolean.valueOf(true);
    }

    @TargetApi(14)
    C1342h createUpdatesController(int i, Application application) {
        if (i >= 14) {
            return new C4530b(getFabric().m13535e(), getFabric().m13536f());
        }
        return new C4531g();
    }

    public Map<DeviceIdentifierType, String> getDeviceIdentifiers() {
        CharSequence betaDeviceToken = getBetaDeviceToken(getContext(), getIdManager().m13656i());
        Map<DeviceIdentifierType, String> hashMap = new HashMap();
        if (!TextUtils.isEmpty(betaDeviceToken)) {
            hashMap.put(DeviceIdentifierType.FONT_TOKEN, betaDeviceToken);
        }
        return hashMap;
    }

    boolean canCheckForUpdates(C2843f c2843f, C1339c c1339c) {
        return (c2843f == null || TextUtils.isEmpty(c2843f.f12025a) != null || c1339c == null) ? null : true;
    }

    private String getBetaDeviceToken(Context context, String str) {
        str = null;
        try {
            String str2 = (String) this.deviceTokenCache.mo3565a(context, this.deviceTokenLoader);
            if (!"".equals(str2)) {
                str = str2;
            }
        } catch (Context context2) {
            C2766c.m13524h().mo3562e(TAG, "Failed to load the Beta device token", context2);
        }
        context2 = C2766c.m13524h();
        String str3 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Beta device token present: ");
        stringBuilder.append(TextUtils.isEmpty(str) ^ 1);
        context2.mo3554a(str3, stringBuilder.toString());
        return str;
    }

    private C2843f getBetaSettingsData() {
        C2853s b = C2851q.m13855a().m13858b();
        return b != null ? b.f12060f : null;
    }

    private C1339c loadBuildProperties(Context context) {
        C1339c a;
        Throwable th;
        C1339c c1339c = null;
        try {
            context = context.getAssets().open(CRASHLYTICS_BUILD_PROPERTIES);
            if (context != null) {
                try {
                    a = C1339c.m5387a((InputStream) context);
                } catch (Throwable e) {
                    Throwable th2 = e;
                    a = null;
                    th = th2;
                    try {
                        C2766c.m13524h().mo3562e(TAG, "Error reading Beta build properties", th);
                        if (context != null) {
                            try {
                                context.close();
                            } catch (Context context2) {
                                C2766c.m13524h().mo3562e(TAG, "Error closing Beta build properties asset", context2);
                            }
                        }
                        return a;
                    } catch (Throwable th3) {
                        th = th3;
                        if (context2 != null) {
                            try {
                                context2.close();
                            } catch (Context context22) {
                                C2766c.m13524h().mo3562e(TAG, "Error closing Beta build properties asset", context22);
                            }
                        }
                        throw th;
                    }
                }
                try {
                    C2774k h = C2766c.m13524h();
                    String str = TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a.f4211d);
                    stringBuilder.append(" build properties: ");
                    stringBuilder.append(a.f4209b);
                    stringBuilder.append(" (");
                    stringBuilder.append(a.f4208a);
                    stringBuilder.append(") - ");
                    stringBuilder.append(a.f4210c);
                    h.mo3554a(str, stringBuilder.toString());
                    c1339c = a;
                } catch (Exception e2) {
                    th = e2;
                    C2766c.m13524h().mo3562e(TAG, "Error reading Beta build properties", th);
                    if (context22 != null) {
                        context22.close();
                    }
                    return a;
                }
            }
            if (context22 == null) {
                return c1339c;
            }
            try {
                context22.close();
                return c1339c;
            } catch (Context context222) {
                C2766c.m13524h().mo3562e(TAG, "Error closing Beta build properties asset", context222);
                return c1339c;
            }
        } catch (Context context2222) {
            a = null;
            th = context2222;
            context2222 = a;
            C2766c.m13524h().mo3562e(TAG, "Error reading Beta build properties", th);
            if (context2222 != null) {
                context2222.close();
            }
            return a;
        } catch (Context context22222) {
            th = context22222;
            context22222 = null;
            if (context22222 != null) {
                context22222.close();
            }
            throw th;
        }
    }

    String getOverridenSpiEndpoint() {
        return CommonUtils.m13620b(getContext(), CRASHLYTICS_API_ENDPOINT);
    }
}
