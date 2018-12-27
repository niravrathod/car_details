package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.p017f.C0433m;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.C2428R;
import com.google.android.gms.common.C2429R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import javax.annotation.concurrent.GuardedBy;

public final class ConnectionErrorMessages {
    @GuardedBy("sCache")
    private static final C0433m<String, String> zaof = new C0433m();

    public static String getErrorTitle(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 20) {
            switch (i) {
                case 1:
                    return resources.getString(C2428R.string.common_google_play_services_install_title);
                case 2:
                    return resources.getString(C2428R.string.common_google_play_services_update_title);
                case 3:
                    return resources.getString(C2428R.string.common_google_play_services_enable_title);
                case 4:
                case 6:
                    break;
                case 5:
                    Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                    return zaa(context, "common_google_play_services_invalid_account_title");
                case 7:
                    Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                    return zaa(context, "common_google_play_services_network_error_title");
                case 8:
                    Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                    return null;
                case 9:
                    Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                    return null;
                case 10:
                    Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                    return null;
                case 11:
                    Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                    return null;
                default:
                    switch (i) {
                        case 16:
                            Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                            return null;
                        case 17:
                            Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                            return zaa(context, "common_google_play_services_sign_in_failed_title");
                        case 18:
                            break;
                        default:
                            StringBuilder stringBuilder = new StringBuilder(33);
                            stringBuilder.append("Unexpected error code ");
                            stringBuilder.append(i);
                            Log.e("GoogleApiAvailability", stringBuilder.toString());
                            return null;
                    }
            }
            return null;
        }
        Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
        return zaa(context, "common_google_play_services_restricted_profile_title");
    }

    public static String getErrorNotificationTitle(Context context, int i) {
        if (i == 6) {
            i = zaa(context, "common_google_play_services_resolution_required_title");
        } else {
            i = getErrorTitle(context, i);
        }
        return i == 0 ? context.getResources().getString(C2428R.string.common_google_play_services_notification_ticker) : i;
    }

    public static String getErrorMessage(Context context, int i) {
        Resources resources = context.getResources();
        String appName = getAppName(context);
        if (i == 5) {
            return zaa(context, "common_google_play_services_invalid_account_text", appName);
        }
        if (i == 7) {
            return zaa(context, "common_google_play_services_network_error_text", appName);
        }
        if (i == 9) {
            return resources.getString(C2428R.string.common_google_play_services_unsupported_text, new Object[]{appName});
        } else if (i == 20) {
            return zaa(context, "common_google_play_services_restricted_profile_text", appName);
        } else {
            switch (i) {
                case 1:
                    return resources.getString(C2428R.string.common_google_play_services_install_text, new Object[]{appName});
                case 2:
                    if (DeviceProperties.isWearableWithoutPlayStore(context) != null) {
                        return resources.getString(C2428R.string.common_google_play_services_wear_update_text);
                    }
                    return resources.getString(C2428R.string.common_google_play_services_update_text, new Object[]{appName});
                case 3:
                    return resources.getString(C2428R.string.common_google_play_services_enable_text, new Object[]{appName});
                default:
                    switch (i) {
                        case 16:
                            return zaa(context, "common_google_play_services_api_unavailable_text", appName);
                        case 17:
                            return zaa(context, "common_google_play_services_sign_in_failed_text", appName);
                        case 18:
                            return resources.getString(C2428R.string.common_google_play_services_updating_text, new Object[]{appName});
                        default:
                            return resources.getString(C2429R.string.common_google_play_services_unknown_issue, new Object[]{appName});
                    }
            }
        }
    }

    public static String getErrorNotificationMessage(Context context, int i) {
        if (i == 6) {
            return zaa(context, "common_google_play_services_resolution_required_text", getAppName(context));
        }
        return getErrorMessage(context, i);
    }

    public static String getErrorDialogButtonMessage(Context context, int i) {
        context = context.getResources();
        switch (i) {
            case 1:
                return context.getString(C2428R.string.common_google_play_services_install_button);
            case 2:
                return context.getString(C2428R.string.common_google_play_services_update_button);
            case 3:
                return context.getString(C2428R.string.common_google_play_services_enable_button);
            default:
                return context.getString(17039370);
        }
    }

    public static java.lang.String getAppName(android.content.Context r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = r2.getPackageName();
        r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2);	 Catch:{ NameNotFoundException -> 0x0011, NameNotFoundException -> 0x0011 }
        r1 = r1.getApplicationLabel(r0);	 Catch:{ NameNotFoundException -> 0x0011, NameNotFoundException -> 0x0011 }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x0011, NameNotFoundException -> 0x0011 }
        return r1;
        r2 = r2.getApplicationInfo();
        r2 = r2.name;
        r1 = android.text.TextUtils.isEmpty(r2);
        if (r1 == 0) goto L_0x001f;
    L_0x001e:
        return r0;
    L_0x001f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.ConnectionErrorMessages.getAppName(android.content.Context):java.lang.String");
    }

    private static String zaa(Context context, String str, String str2) {
        Resources resources = context.getResources();
        context = zaa(context, str);
        if (context == null) {
            context = resources.getString(C2429R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, context, new Object[]{str2});
    }

    private static String zaa(Context context, String str) {
        synchronized (zaof) {
            String str2 = (String) zaof.get(str);
            if (str2 != null) {
                return str2;
            }
            context = GooglePlayServicesUtil.getRemoteResource(context);
            if (context == null) {
                return null;
            }
            int identifier = context.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                context = "GoogleApiAvailability";
                String str3 = "Missing resource: ";
                str = String.valueOf(str);
                Log.w(context, str.length() != 0 ? str3.concat(str) : new String(str3));
                return null;
            }
            context = context.getString(identifier);
            if (TextUtils.isEmpty(context)) {
                context = "GoogleApiAvailability";
                str3 = "Got empty resource: ";
                str = String.valueOf(str);
                Log.w(context, str.length() != 0 ? str3.concat(str) : new String(str3));
                return null;
            }
            zaof.put(str, context);
            return context;
        }
    }

    public static String getDefaultNotificationChannelName(Context context) {
        return context.getResources().getString(C2428R.string.common_google_play_services_notification_channel_name);
    }

    private ConnectionErrorMessages() {
    }
}
