package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.app.C0369x.C0367c;
import android.support.v4.app.C0369x.C3116b;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.iid.C2603w;
import com.google.firebase.messaging.C2611c.C2610a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.d */
final class C2612d {
    /* renamed from: a */
    private static final AtomicInteger f11084a = new AtomicInteger((int) SystemClock.elapsedRealtime());
    /* renamed from: b */
    private final Context f11085b;
    /* renamed from: c */
    private Bundle f11086c;

    public C2612d(Context context) {
        this.f11085b = context.getApplicationContext();
    }

    /* renamed from: a */
    static boolean m12818a(Bundle bundle) {
        if (!"1".equals(C2612d.m12815a(bundle, "gcm.n.e"))) {
            if (C2612d.m12815a(bundle, "gcm.n.icon") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    static String m12815a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    /* renamed from: b */
    static String m12820b(Bundle bundle, String str) {
        str = String.valueOf(str);
        String valueOf = String.valueOf("_loc_key");
        return C2612d.m12815a(bundle, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: c */
    static java.lang.Object[] m12821c(android.os.Bundle r5, java.lang.String r6) {
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
        r0 = java.lang.String.valueOf(r6);
        r1 = "_loc_args";
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        if (r2 == 0) goto L_0x0015;
    L_0x0010:
        r0 = r0.concat(r1);
        goto L_0x001b;
    L_0x0015:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x001b:
        r5 = com.google.firebase.messaging.C2612d.m12815a(r5, r0);
        r0 = android.text.TextUtils.isEmpty(r5);
        r1 = 0;
        if (r0 == 0) goto L_0x0027;
    L_0x0026:
        return r1;
    L_0x0027:
        r0 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0040 }
        r0.<init>(r5);	 Catch:{ JSONException -> 0x0040 }
        r2 = r0.length();	 Catch:{ JSONException -> 0x0040 }
        r2 = new java.lang.String[r2];	 Catch:{ JSONException -> 0x0040 }
        r3 = 0;	 Catch:{ JSONException -> 0x0040 }
    L_0x0033:
        r4 = r2.length;	 Catch:{ JSONException -> 0x0040 }
        if (r3 >= r4) goto L_0x003f;	 Catch:{ JSONException -> 0x0040 }
    L_0x0036:
        r4 = r0.opt(r3);	 Catch:{ JSONException -> 0x0040 }
        r2[r3] = r4;	 Catch:{ JSONException -> 0x0040 }
        r3 = r3 + 1;
        goto L_0x0033;
    L_0x003f:
        return r2;
        r0 = "FirebaseMessaging";
        r6 = java.lang.String.valueOf(r6);
        r2 = "_loc_args";
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 == 0) goto L_0x0058;
    L_0x0053:
        r6 = r6.concat(r2);
        goto L_0x005e;
    L_0x0058:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r6 = r2;
    L_0x005e:
        r2 = 6;
        r6 = r6.substring(r2);
        r2 = java.lang.String.valueOf(r6);
        r2 = r2.length();
        r2 = r2 + 41;
        r3 = java.lang.String.valueOf(r5);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Malformed ";
        r3.append(r2);
        r3.append(r6);
        r6 = ": ";
        r3.append(r6);
        r3.append(r5);
        r5 = "  Default value will be used.";
        r3.append(r5);
        r5 = r3.toString();
        android.util.Log.w(r0, r5);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.d.c(android.os.Bundle, java.lang.String):java.lang.Object[]");
    }

    /* renamed from: b */
    static Uri m12819b(Bundle bundle) {
        Object a = C2612d.m12815a(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(a)) {
            a = C2612d.m12815a(bundle, "gcm.n.link");
        }
        return TextUtils.isEmpty(a) == null ? Uri.parse(a) : null;
    }

    /* renamed from: c */
    final boolean m12824c(Bundle bundle) {
        C2612d c2612d = this;
        Bundle bundle2 = bundle;
        if ("1".equals(C2612d.m12815a(bundle2, "gcm.n.noui"))) {
            return true;
        }
        Object obj;
        CharSequence d;
        CharSequence d2;
        String a;
        Resources resources;
        int identifier;
        Integer a2;
        String d3;
        String str;
        Uri uri;
        Object a3;
        Uri b;
        Intent launchIntentForPackage;
        Bundle bundle3;
        PendingIntent activity;
        boolean equals;
        Intent intent;
        PendingIntent a4;
        String a5;
        NotificationManager notificationManager;
        StringBuilder stringBuilder;
        String string;
        C0367c a6;
        Notification a7;
        String a8;
        NotificationManager notificationManager2;
        long uptimeMillis;
        StringBuilder stringBuilder2;
        int i;
        if (!((KeyguardManager) c2612d.f11085b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10);
            }
            int myPid = Process.myPid();
            List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) c2612d.f11085b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (runningAppProcessInfo.importance == 100) {
                            obj = 1;
                            if (obj != null) {
                                return false;
                            }
                            d = m12823d(bundle2, "gcm.n.title");
                            if (TextUtils.isEmpty(d)) {
                                d = c2612d.f11085b.getApplicationInfo().loadLabel(c2612d.f11085b.getPackageManager());
                            }
                            d2 = m12823d(bundle2, "gcm.n.body");
                            a = C2612d.m12815a(bundle2, "gcm.n.icon");
                            if (!TextUtils.isEmpty(a)) {
                                resources = c2612d.f11085b.getResources();
                                identifier = resources.getIdentifier(a, "drawable", c2612d.f11085b.getPackageName());
                                if (identifier == 0 && m12817a(identifier)) {
                                    a2 = m12814a(C2612d.m12815a(bundle2, "gcm.n.color"));
                                    d3 = C2612d.m12822d(bundle);
                                    str = null;
                                    if (TextUtils.isEmpty(d3)) {
                                        uri = null;
                                    } else {
                                        if (!"default".equals(d3)) {
                                        }
                                        uri = RingtoneManager.getDefaultUri(2);
                                    }
                                    a3 = C2612d.m12815a(bundle2, "gcm.n.click_action");
                                    if (TextUtils.isEmpty(a3)) {
                                        b = C2612d.m12819b(bundle);
                                        if (b == null) {
                                            launchIntentForPackage = c2612d.f11085b.getPackageManager().getLaunchIntentForPackage(c2612d.f11085b.getPackageName());
                                            if (launchIntentForPackage == null) {
                                                Log.w("FirebaseMessaging", "No activity found to launch app");
                                            }
                                        } else {
                                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                            launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
                                            launchIntentForPackage.setData(b);
                                        }
                                    } else {
                                        launchIntentForPackage = new Intent(a3);
                                        launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
                                        launchIntentForPackage.setFlags(268435456);
                                    }
                                    if (launchIntentForPackage != null) {
                                        launchIntentForPackage.addFlags(67108864);
                                        bundle3 = new Bundle(bundle2);
                                        FirebaseMessagingService.m23073a(bundle3);
                                        launchIntentForPackage.putExtras(bundle3);
                                        for (String str2 : bundle3.keySet()) {
                                            if (!str2.startsWith("gcm.n.")) {
                                            }
                                            launchIntentForPackage.removeExtra(str2);
                                        }
                                        activity = PendingIntent.getActivity(c2612d.f11085b, f11084a.incrementAndGet(), launchIntentForPackage, 1073741824);
                                    } else {
                                        activity = null;
                                    }
                                    if (bundle2 != null) {
                                        equals = "1".equals(bundle2.getString("google.c.a.e"));
                                    } else {
                                        equals = false;
                                    }
                                    if (equals) {
                                        intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                                        C2612d.m12816a(intent, bundle2);
                                        intent.putExtra("pending_intent", activity);
                                        activity = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
                                        intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
                                        C2612d.m12816a(intent, bundle2);
                                        a4 = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
                                    } else {
                                        a4 = null;
                                    }
                                    a5 = C2612d.m12815a(bundle2, "gcm.n.android_channel_id");
                                    if (PlatformVersion.isAtLeastO()) {
                                        if (c2612d.f11085b.getApplicationInfo().targetSdkVersion < 26) {
                                            notificationManager = (NotificationManager) c2612d.f11085b.getSystemService(NotificationManager.class);
                                            if (!TextUtils.isEmpty(a5)) {
                                                if (notificationManager.getNotificationChannel(a5) == null) {
                                                    stringBuilder = new StringBuilder(String.valueOf(a5).length() + 122);
                                                    stringBuilder.append("Notification Channel requested (");
                                                    stringBuilder.append(a5);
                                                    stringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                                                    Log.w("FirebaseMessaging", stringBuilder.toString());
                                                } else {
                                                    str = a5;
                                                }
                                            }
                                            string = m12813a().getString("com.google.firebase.messaging.default_notification_channel_id");
                                            if (!TextUtils.isEmpty(string)) {
                                                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                                            } else if (notificationManager.getNotificationChannel(string) == null) {
                                                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                                            } else {
                                                str = string;
                                            }
                                            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                                                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", c2612d.f11085b.getString(C2610a.fcm_fallback_notification_channel_label), 3));
                                            }
                                            str = "fcm_fallback_notification_channel";
                                        }
                                    }
                                    a6 = new C0367c(c2612d.f11085b).m1351a(true).m1343a(identifier);
                                    if (!TextUtils.isEmpty(d)) {
                                        a6.m1349a(d);
                                    }
                                    if (!TextUtils.isEmpty(d2)) {
                                        a6.m1354b(d2);
                                        a6.m1348a(new C3116b().m15562a(d2));
                                    }
                                    if (a2 != null) {
                                        a6.m1356c(a2.intValue());
                                    }
                                    if (uri != null) {
                                        a6.m1347a(uri);
                                    }
                                    if (activity != null) {
                                        a6.m1346a(activity);
                                    }
                                    if (a4 != null) {
                                        a6.m1353b(a4);
                                    }
                                    if (str != null) {
                                        a6.m1350a(str);
                                    }
                                    a7 = a6.m1342a();
                                    a8 = C2612d.m12815a(bundle2, "gcm.n.tag");
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        Log.d("FirebaseMessaging", "Showing notification");
                                    }
                                    notificationManager2 = (NotificationManager) c2612d.f11085b.getSystemService("notification");
                                    if (TextUtils.isEmpty(a8)) {
                                        uptimeMillis = SystemClock.uptimeMillis();
                                        stringBuilder2 = new StringBuilder(37);
                                        stringBuilder2.append("FCM-Notification:");
                                        stringBuilder2.append(uptimeMillis);
                                        a8 = stringBuilder2.toString();
                                    }
                                    notificationManager2.notify(a8, 0, a7);
                                    return true;
                                }
                                identifier = resources.getIdentifier(a, "mipmap", c2612d.f11085b.getPackageName());
                                if (identifier == 0 && m12817a(identifier)) {
                                    a2 = m12814a(C2612d.m12815a(bundle2, "gcm.n.color"));
                                    d3 = C2612d.m12822d(bundle);
                                    str = null;
                                    if (TextUtils.isEmpty(d3)) {
                                        uri = null;
                                    } else if ("default".equals(d3) || c2612d.f11085b.getResources().getIdentifier(d3, "raw", c2612d.f11085b.getPackageName()) == 0) {
                                        uri = RingtoneManager.getDefaultUri(2);
                                    } else {
                                        String packageName = c2612d.f11085b.getPackageName();
                                        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(packageName).length() + 24) + String.valueOf(d3).length());
                                        stringBuilder3.append("android.resource://");
                                        stringBuilder3.append(packageName);
                                        stringBuilder3.append("/raw/");
                                        stringBuilder3.append(d3);
                                        uri = Uri.parse(stringBuilder3.toString());
                                    }
                                    a3 = C2612d.m12815a(bundle2, "gcm.n.click_action");
                                    if (TextUtils.isEmpty(a3)) {
                                        launchIntentForPackage = new Intent(a3);
                                        launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
                                        launchIntentForPackage.setFlags(268435456);
                                    } else {
                                        b = C2612d.m12819b(bundle);
                                        if (b == null) {
                                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                            launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
                                            launchIntentForPackage.setData(b);
                                        } else {
                                            launchIntentForPackage = c2612d.f11085b.getPackageManager().getLaunchIntentForPackage(c2612d.f11085b.getPackageName());
                                            if (launchIntentForPackage == null) {
                                                Log.w("FirebaseMessaging", "No activity found to launch app");
                                            }
                                        }
                                    }
                                    if (launchIntentForPackage != null) {
                                        activity = null;
                                    } else {
                                        launchIntentForPackage.addFlags(67108864);
                                        bundle3 = new Bundle(bundle2);
                                        FirebaseMessagingService.m23073a(bundle3);
                                        launchIntentForPackage.putExtras(bundle3);
                                        for (String str22 : bundle3.keySet()) {
                                            if (str22.startsWith("gcm.n.") || str22.startsWith("gcm.notification.")) {
                                                launchIntentForPackage.removeExtra(str22);
                                            }
                                        }
                                        activity = PendingIntent.getActivity(c2612d.f11085b, f11084a.incrementAndGet(), launchIntentForPackage, 1073741824);
                                    }
                                    if (bundle2 != null) {
                                        equals = false;
                                    } else {
                                        equals = "1".equals(bundle2.getString("google.c.a.e"));
                                    }
                                    if (equals) {
                                        intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                                        C2612d.m12816a(intent, bundle2);
                                        intent.putExtra("pending_intent", activity);
                                        activity = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
                                        intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
                                        C2612d.m12816a(intent, bundle2);
                                        a4 = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
                                    } else {
                                        a4 = null;
                                    }
                                    a5 = C2612d.m12815a(bundle2, "gcm.n.android_channel_id");
                                    if (PlatformVersion.isAtLeastO()) {
                                        if (c2612d.f11085b.getApplicationInfo().targetSdkVersion < 26) {
                                            notificationManager = (NotificationManager) c2612d.f11085b.getSystemService(NotificationManager.class);
                                            if (TextUtils.isEmpty(a5)) {
                                                if (notificationManager.getNotificationChannel(a5) == null) {
                                                    str = a5;
                                                } else {
                                                    stringBuilder = new StringBuilder(String.valueOf(a5).length() + 122);
                                                    stringBuilder.append("Notification Channel requested (");
                                                    stringBuilder.append(a5);
                                                    stringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                                                    Log.w("FirebaseMessaging", stringBuilder.toString());
                                                }
                                            }
                                            string = m12813a().getString("com.google.firebase.messaging.default_notification_channel_id");
                                            if (!TextUtils.isEmpty(string)) {
                                                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                                            } else if (notificationManager.getNotificationChannel(string) == null) {
                                                str = string;
                                            } else {
                                                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                                            }
                                            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                                                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", c2612d.f11085b.getString(C2610a.fcm_fallback_notification_channel_label), 3));
                                            }
                                            str = "fcm_fallback_notification_channel";
                                        }
                                    }
                                    a6 = new C0367c(c2612d.f11085b).m1351a(true).m1343a(identifier);
                                    if (TextUtils.isEmpty(d)) {
                                        a6.m1349a(d);
                                    }
                                    if (TextUtils.isEmpty(d2)) {
                                        a6.m1354b(d2);
                                        a6.m1348a(new C3116b().m15562a(d2));
                                    }
                                    if (a2 != null) {
                                        a6.m1356c(a2.intValue());
                                    }
                                    if (uri != null) {
                                        a6.m1347a(uri);
                                    }
                                    if (activity != null) {
                                        a6.m1346a(activity);
                                    }
                                    if (a4 != null) {
                                        a6.m1353b(a4);
                                    }
                                    if (str != null) {
                                        a6.m1350a(str);
                                    }
                                    a7 = a6.m1342a();
                                    a8 = C2612d.m12815a(bundle2, "gcm.n.tag");
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        Log.d("FirebaseMessaging", "Showing notification");
                                    }
                                    notificationManager2 = (NotificationManager) c2612d.f11085b.getSystemService("notification");
                                    if (TextUtils.isEmpty(a8)) {
                                        uptimeMillis = SystemClock.uptimeMillis();
                                        stringBuilder2 = new StringBuilder(37);
                                        stringBuilder2.append("FCM-Notification:");
                                        stringBuilder2.append(uptimeMillis);
                                        a8 = stringBuilder2.toString();
                                    }
                                    notificationManager2.notify(a8, 0, a7);
                                    return true;
                                }
                                StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(a).length() + 61);
                                stringBuilder4.append("Icon resource ");
                                stringBuilder4.append(a);
                                stringBuilder4.append(" not found. Notification will use default icon.");
                                Log.w("FirebaseMessaging", stringBuilder4.toString());
                            }
                            i = m12813a().getInt("com.google.firebase.messaging.default_notification_icon", 0);
                            if (i == 0 || !m12817a(i)) {
                                i = c2612d.f11085b.getApplicationInfo().icon;
                            }
                            if (i != 0) {
                                if (!m12817a(i)) {
                                    identifier = i;
                                    a2 = m12814a(C2612d.m12815a(bundle2, "gcm.n.color"));
                                    d3 = C2612d.m12822d(bundle);
                                    str = null;
                                    if (TextUtils.isEmpty(d3)) {
                                        uri = null;
                                    } else {
                                        if ("default".equals(d3)) {
                                        }
                                        uri = RingtoneManager.getDefaultUri(2);
                                    }
                                    a3 = C2612d.m12815a(bundle2, "gcm.n.click_action");
                                    if (TextUtils.isEmpty(a3)) {
                                        launchIntentForPackage = new Intent(a3);
                                        launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
                                        launchIntentForPackage.setFlags(268435456);
                                    } else {
                                        b = C2612d.m12819b(bundle);
                                        if (b == null) {
                                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                            launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
                                            launchIntentForPackage.setData(b);
                                        } else {
                                            launchIntentForPackage = c2612d.f11085b.getPackageManager().getLaunchIntentForPackage(c2612d.f11085b.getPackageName());
                                            if (launchIntentForPackage == null) {
                                                Log.w("FirebaseMessaging", "No activity found to launch app");
                                            }
                                        }
                                    }
                                    if (launchIntentForPackage != null) {
                                        activity = null;
                                    } else {
                                        launchIntentForPackage.addFlags(67108864);
                                        bundle3 = new Bundle(bundle2);
                                        FirebaseMessagingService.m23073a(bundle3);
                                        launchIntentForPackage.putExtras(bundle3);
                                        for (String str222 : bundle3.keySet()) {
                                            if (str222.startsWith("gcm.n.")) {
                                            }
                                            launchIntentForPackage.removeExtra(str222);
                                        }
                                        activity = PendingIntent.getActivity(c2612d.f11085b, f11084a.incrementAndGet(), launchIntentForPackage, 1073741824);
                                    }
                                    if (bundle2 != null) {
                                        equals = false;
                                    } else {
                                        equals = "1".equals(bundle2.getString("google.c.a.e"));
                                    }
                                    if (equals) {
                                        intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                                        C2612d.m12816a(intent, bundle2);
                                        intent.putExtra("pending_intent", activity);
                                        activity = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
                                        intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
                                        C2612d.m12816a(intent, bundle2);
                                        a4 = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
                                    } else {
                                        a4 = null;
                                    }
                                    a5 = C2612d.m12815a(bundle2, "gcm.n.android_channel_id");
                                    if (PlatformVersion.isAtLeastO()) {
                                        if (c2612d.f11085b.getApplicationInfo().targetSdkVersion < 26) {
                                            notificationManager = (NotificationManager) c2612d.f11085b.getSystemService(NotificationManager.class);
                                            if (TextUtils.isEmpty(a5)) {
                                                if (notificationManager.getNotificationChannel(a5) == null) {
                                                    str = a5;
                                                } else {
                                                    stringBuilder = new StringBuilder(String.valueOf(a5).length() + 122);
                                                    stringBuilder.append("Notification Channel requested (");
                                                    stringBuilder.append(a5);
                                                    stringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                                                    Log.w("FirebaseMessaging", stringBuilder.toString());
                                                }
                                            }
                                            string = m12813a().getString("com.google.firebase.messaging.default_notification_channel_id");
                                            if (!TextUtils.isEmpty(string)) {
                                                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                                            } else if (notificationManager.getNotificationChannel(string) == null) {
                                                str = string;
                                            } else {
                                                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                                            }
                                            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                                                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", c2612d.f11085b.getString(C2610a.fcm_fallback_notification_channel_label), 3));
                                            }
                                            str = "fcm_fallback_notification_channel";
                                        }
                                    }
                                    a6 = new C0367c(c2612d.f11085b).m1351a(true).m1343a(identifier);
                                    if (TextUtils.isEmpty(d)) {
                                        a6.m1349a(d);
                                    }
                                    if (TextUtils.isEmpty(d2)) {
                                        a6.m1354b(d2);
                                        a6.m1348a(new C3116b().m15562a(d2));
                                    }
                                    if (a2 != null) {
                                        a6.m1356c(a2.intValue());
                                    }
                                    if (uri != null) {
                                        a6.m1347a(uri);
                                    }
                                    if (activity != null) {
                                        a6.m1346a(activity);
                                    }
                                    if (a4 != null) {
                                        a6.m1353b(a4);
                                    }
                                    if (str != null) {
                                        a6.m1350a(str);
                                    }
                                    a7 = a6.m1342a();
                                    a8 = C2612d.m12815a(bundle2, "gcm.n.tag");
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        Log.d("FirebaseMessaging", "Showing notification");
                                    }
                                    notificationManager2 = (NotificationManager) c2612d.f11085b.getSystemService("notification");
                                    if (TextUtils.isEmpty(a8)) {
                                        uptimeMillis = SystemClock.uptimeMillis();
                                        stringBuilder2 = new StringBuilder(37);
                                        stringBuilder2.append("FCM-Notification:");
                                        stringBuilder2.append(uptimeMillis);
                                        a8 = stringBuilder2.toString();
                                    }
                                    notificationManager2.notify(a8, 0, a7);
                                    return true;
                                }
                            }
                            identifier = 17301651;
                            a2 = m12814a(C2612d.m12815a(bundle2, "gcm.n.color"));
                            d3 = C2612d.m12822d(bundle);
                            str = null;
                            if (TextUtils.isEmpty(d3)) {
                                if ("default".equals(d3)) {
                                }
                                uri = RingtoneManager.getDefaultUri(2);
                            } else {
                                uri = null;
                            }
                            a3 = C2612d.m12815a(bundle2, "gcm.n.click_action");
                            if (TextUtils.isEmpty(a3)) {
                                b = C2612d.m12819b(bundle);
                                if (b == null) {
                                    launchIntentForPackage = c2612d.f11085b.getPackageManager().getLaunchIntentForPackage(c2612d.f11085b.getPackageName());
                                    if (launchIntentForPackage == null) {
                                        Log.w("FirebaseMessaging", "No activity found to launch app");
                                    }
                                } else {
                                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                    launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
                                    launchIntentForPackage.setData(b);
                                }
                            } else {
                                launchIntentForPackage = new Intent(a3);
                                launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
                                launchIntentForPackage.setFlags(268435456);
                            }
                            if (launchIntentForPackage != null) {
                                launchIntentForPackage.addFlags(67108864);
                                bundle3 = new Bundle(bundle2);
                                FirebaseMessagingService.m23073a(bundle3);
                                launchIntentForPackage.putExtras(bundle3);
                                for (String str2222 : bundle3.keySet()) {
                                    if (str2222.startsWith("gcm.n.")) {
                                    }
                                    launchIntentForPackage.removeExtra(str2222);
                                }
                                activity = PendingIntent.getActivity(c2612d.f11085b, f11084a.incrementAndGet(), launchIntentForPackage, 1073741824);
                            } else {
                                activity = null;
                            }
                            if (bundle2 != null) {
                                equals = "1".equals(bundle2.getString("google.c.a.e"));
                            } else {
                                equals = false;
                            }
                            if (equals) {
                                a4 = null;
                            } else {
                                intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                                C2612d.m12816a(intent, bundle2);
                                intent.putExtra("pending_intent", activity);
                                activity = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
                                intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
                                C2612d.m12816a(intent, bundle2);
                                a4 = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
                            }
                            a5 = C2612d.m12815a(bundle2, "gcm.n.android_channel_id");
                            if (PlatformVersion.isAtLeastO()) {
                                if (c2612d.f11085b.getApplicationInfo().targetSdkVersion < 26) {
                                    notificationManager = (NotificationManager) c2612d.f11085b.getSystemService(NotificationManager.class);
                                    if (TextUtils.isEmpty(a5)) {
                                        if (notificationManager.getNotificationChannel(a5) == null) {
                                            stringBuilder = new StringBuilder(String.valueOf(a5).length() + 122);
                                            stringBuilder.append("Notification Channel requested (");
                                            stringBuilder.append(a5);
                                            stringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                                            Log.w("FirebaseMessaging", stringBuilder.toString());
                                        } else {
                                            str = a5;
                                        }
                                    }
                                    string = m12813a().getString("com.google.firebase.messaging.default_notification_channel_id");
                                    if (!TextUtils.isEmpty(string)) {
                                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                                    } else if (notificationManager.getNotificationChannel(string) == null) {
                                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                                    } else {
                                        str = string;
                                    }
                                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", c2612d.f11085b.getString(C2610a.fcm_fallback_notification_channel_label), 3));
                                    }
                                    str = "fcm_fallback_notification_channel";
                                }
                            }
                            a6 = new C0367c(c2612d.f11085b).m1351a(true).m1343a(identifier);
                            if (TextUtils.isEmpty(d)) {
                                a6.m1349a(d);
                            }
                            if (TextUtils.isEmpty(d2)) {
                                a6.m1354b(d2);
                                a6.m1348a(new C3116b().m15562a(d2));
                            }
                            if (a2 != null) {
                                a6.m1356c(a2.intValue());
                            }
                            if (uri != null) {
                                a6.m1347a(uri);
                            }
                            if (activity != null) {
                                a6.m1346a(activity);
                            }
                            if (a4 != null) {
                                a6.m1353b(a4);
                            }
                            if (str != null) {
                                a6.m1350a(str);
                            }
                            a7 = a6.m1342a();
                            a8 = C2612d.m12815a(bundle2, "gcm.n.tag");
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Showing notification");
                            }
                            notificationManager2 = (NotificationManager) c2612d.f11085b.getSystemService("notification");
                            if (TextUtils.isEmpty(a8)) {
                                uptimeMillis = SystemClock.uptimeMillis();
                                stringBuilder2 = new StringBuilder(37);
                                stringBuilder2.append("FCM-Notification:");
                                stringBuilder2.append(uptimeMillis);
                                a8 = stringBuilder2.toString();
                            }
                            notificationManager2.notify(a8, 0, a7);
                            return true;
                        }
                    }
                }
            }
        }
        obj = null;
        if (obj != null) {
            return false;
        }
        d = m12823d(bundle2, "gcm.n.title");
        if (TextUtils.isEmpty(d)) {
            d = c2612d.f11085b.getApplicationInfo().loadLabel(c2612d.f11085b.getPackageManager());
        }
        d2 = m12823d(bundle2, "gcm.n.body");
        a = C2612d.m12815a(bundle2, "gcm.n.icon");
        if (TextUtils.isEmpty(a)) {
            resources = c2612d.f11085b.getResources();
            identifier = resources.getIdentifier(a, "drawable", c2612d.f11085b.getPackageName());
            if (identifier == 0) {
            }
            identifier = resources.getIdentifier(a, "mipmap", c2612d.f11085b.getPackageName());
            if (identifier == 0) {
            }
            StringBuilder stringBuilder42 = new StringBuilder(String.valueOf(a).length() + 61);
            stringBuilder42.append("Icon resource ");
            stringBuilder42.append(a);
            stringBuilder42.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", stringBuilder42.toString());
        }
        i = m12813a().getInt("com.google.firebase.messaging.default_notification_icon", 0);
        i = c2612d.f11085b.getApplicationInfo().icon;
        if (i != 0) {
            if (!m12817a(i)) {
                identifier = i;
                a2 = m12814a(C2612d.m12815a(bundle2, "gcm.n.color"));
                d3 = C2612d.m12822d(bundle);
                str = null;
                if (TextUtils.isEmpty(d3)) {
                    uri = null;
                } else {
                    if ("default".equals(d3)) {
                    }
                    uri = RingtoneManager.getDefaultUri(2);
                }
                a3 = C2612d.m12815a(bundle2, "gcm.n.click_action");
                if (TextUtils.isEmpty(a3)) {
                    launchIntentForPackage = new Intent(a3);
                    launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
                    launchIntentForPackage.setFlags(268435456);
                } else {
                    b = C2612d.m12819b(bundle);
                    if (b == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
                        launchIntentForPackage.setData(b);
                    } else {
                        launchIntentForPackage = c2612d.f11085b.getPackageManager().getLaunchIntentForPackage(c2612d.f11085b.getPackageName());
                        if (launchIntentForPackage == null) {
                            Log.w("FirebaseMessaging", "No activity found to launch app");
                        }
                    }
                }
                if (launchIntentForPackage != null) {
                    activity = null;
                } else {
                    launchIntentForPackage.addFlags(67108864);
                    bundle3 = new Bundle(bundle2);
                    FirebaseMessagingService.m23073a(bundle3);
                    launchIntentForPackage.putExtras(bundle3);
                    for (String str22222 : bundle3.keySet()) {
                        if (str22222.startsWith("gcm.n.")) {
                        }
                        launchIntentForPackage.removeExtra(str22222);
                    }
                    activity = PendingIntent.getActivity(c2612d.f11085b, f11084a.incrementAndGet(), launchIntentForPackage, 1073741824);
                }
                if (bundle2 != null) {
                    equals = false;
                } else {
                    equals = "1".equals(bundle2.getString("google.c.a.e"));
                }
                if (equals) {
                    intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                    C2612d.m12816a(intent, bundle2);
                    intent.putExtra("pending_intent", activity);
                    activity = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
                    intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
                    C2612d.m12816a(intent, bundle2);
                    a4 = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
                } else {
                    a4 = null;
                }
                a5 = C2612d.m12815a(bundle2, "gcm.n.android_channel_id");
                if (PlatformVersion.isAtLeastO()) {
                    if (c2612d.f11085b.getApplicationInfo().targetSdkVersion < 26) {
                        notificationManager = (NotificationManager) c2612d.f11085b.getSystemService(NotificationManager.class);
                        if (TextUtils.isEmpty(a5)) {
                            if (notificationManager.getNotificationChannel(a5) == null) {
                                str = a5;
                            } else {
                                stringBuilder = new StringBuilder(String.valueOf(a5).length() + 122);
                                stringBuilder.append("Notification Channel requested (");
                                stringBuilder.append(a5);
                                stringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                                Log.w("FirebaseMessaging", stringBuilder.toString());
                            }
                        }
                        string = m12813a().getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(string)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(string) == null) {
                            str = string;
                        } else {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", c2612d.f11085b.getString(C2610a.fcm_fallback_notification_channel_label), 3));
                        }
                        str = "fcm_fallback_notification_channel";
                    }
                }
                a6 = new C0367c(c2612d.f11085b).m1351a(true).m1343a(identifier);
                if (TextUtils.isEmpty(d)) {
                    a6.m1349a(d);
                }
                if (TextUtils.isEmpty(d2)) {
                    a6.m1354b(d2);
                    a6.m1348a(new C3116b().m15562a(d2));
                }
                if (a2 != null) {
                    a6.m1356c(a2.intValue());
                }
                if (uri != null) {
                    a6.m1347a(uri);
                }
                if (activity != null) {
                    a6.m1346a(activity);
                }
                if (a4 != null) {
                    a6.m1353b(a4);
                }
                if (str != null) {
                    a6.m1350a(str);
                }
                a7 = a6.m1342a();
                a8 = C2612d.m12815a(bundle2, "gcm.n.tag");
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Showing notification");
                }
                notificationManager2 = (NotificationManager) c2612d.f11085b.getSystemService("notification");
                if (TextUtils.isEmpty(a8)) {
                    uptimeMillis = SystemClock.uptimeMillis();
                    stringBuilder2 = new StringBuilder(37);
                    stringBuilder2.append("FCM-Notification:");
                    stringBuilder2.append(uptimeMillis);
                    a8 = stringBuilder2.toString();
                }
                notificationManager2.notify(a8, 0, a7);
                return true;
            }
        }
        identifier = 17301651;
        a2 = m12814a(C2612d.m12815a(bundle2, "gcm.n.color"));
        d3 = C2612d.m12822d(bundle);
        str = null;
        if (TextUtils.isEmpty(d3)) {
            if ("default".equals(d3)) {
            }
            uri = RingtoneManager.getDefaultUri(2);
        } else {
            uri = null;
        }
        a3 = C2612d.m12815a(bundle2, "gcm.n.click_action");
        if (TextUtils.isEmpty(a3)) {
            b = C2612d.m12819b(bundle);
            if (b == null) {
                launchIntentForPackage = c2612d.f11085b.getPackageManager().getLaunchIntentForPackage(c2612d.f11085b.getPackageName());
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            } else {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
                launchIntentForPackage.setData(b);
            }
        } else {
            launchIntentForPackage = new Intent(a3);
            launchIntentForPackage.setPackage(c2612d.f11085b.getPackageName());
            launchIntentForPackage.setFlags(268435456);
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(67108864);
            bundle3 = new Bundle(bundle2);
            FirebaseMessagingService.m23073a(bundle3);
            launchIntentForPackage.putExtras(bundle3);
            for (String str222222 : bundle3.keySet()) {
                if (str222222.startsWith("gcm.n.")) {
                }
                launchIntentForPackage.removeExtra(str222222);
            }
            activity = PendingIntent.getActivity(c2612d.f11085b, f11084a.incrementAndGet(), launchIntentForPackage, 1073741824);
        } else {
            activity = null;
        }
        if (bundle2 != null) {
            equals = "1".equals(bundle2.getString("google.c.a.e"));
        } else {
            equals = false;
        }
        if (equals) {
            a4 = null;
        } else {
            intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
            C2612d.m12816a(intent, bundle2);
            intent.putExtra("pending_intent", activity);
            activity = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
            intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
            C2612d.m12816a(intent, bundle2);
            a4 = C2603w.m12773a(c2612d.f11085b, f11084a.incrementAndGet(), intent, 1073741824);
        }
        a5 = C2612d.m12815a(bundle2, "gcm.n.android_channel_id");
        if (PlatformVersion.isAtLeastO()) {
            if (c2612d.f11085b.getApplicationInfo().targetSdkVersion < 26) {
                notificationManager = (NotificationManager) c2612d.f11085b.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(a5)) {
                    if (notificationManager.getNotificationChannel(a5) == null) {
                        stringBuilder = new StringBuilder(String.valueOf(a5).length() + 122);
                        stringBuilder.append("Notification Channel requested (");
                        stringBuilder.append(a5);
                        stringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                        Log.w("FirebaseMessaging", stringBuilder.toString());
                    } else {
                        str = a5;
                    }
                }
                string = m12813a().getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string)) {
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                } else if (notificationManager.getNotificationChannel(string) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                } else {
                    str = string;
                }
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", c2612d.f11085b.getString(C2610a.fcm_fallback_notification_channel_label), 3));
                }
                str = "fcm_fallback_notification_channel";
            }
        }
        a6 = new C0367c(c2612d.f11085b).m1351a(true).m1343a(identifier);
        if (TextUtils.isEmpty(d)) {
            a6.m1349a(d);
        }
        if (TextUtils.isEmpty(d2)) {
            a6.m1354b(d2);
            a6.m1348a(new C3116b().m15562a(d2));
        }
        if (a2 != null) {
            a6.m1356c(a2.intValue());
        }
        if (uri != null) {
            a6.m1347a(uri);
        }
        if (activity != null) {
            a6.m1346a(activity);
        }
        if (a4 != null) {
            a6.m1353b(a4);
        }
        if (str != null) {
            a6.m1350a(str);
        }
        a7 = a6.m1342a();
        a8 = C2612d.m12815a(bundle2, "gcm.n.tag");
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        notificationManager2 = (NotificationManager) c2612d.f11085b.getSystemService("notification");
        if (TextUtils.isEmpty(a8)) {
            uptimeMillis = SystemClock.uptimeMillis();
            stringBuilder2 = new StringBuilder(37);
            stringBuilder2.append("FCM-Notification:");
            stringBuilder2.append(uptimeMillis);
            a8 = stringBuilder2.toString();
        }
        notificationManager2.notify(a8, 0, a7);
        return true;
    }

    /* renamed from: d */
    private final String m12823d(Bundle bundle, String str) {
        Object a = C2612d.m12815a(bundle, str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String b = C2612d.m12820b(bundle, str);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        Resources resources = this.f11085b.getResources();
        int identifier = resources.getIdentifier(b, "string", this.f11085b.getPackageName());
        if (identifier == 0) {
            bundle = "FirebaseMessaging";
            str = String.valueOf(str);
            String valueOf = String.valueOf("_loc_key");
            str = (valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).substring(6);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 49) + String.valueOf(b).length());
            stringBuilder.append(str);
            stringBuilder.append(" resource not found: ");
            stringBuilder.append(b);
            stringBuilder.append(" Default value will be used.");
            Log.w(bundle, stringBuilder.toString());
            return null;
        }
        bundle = C2612d.m12821c(bundle, str);
        if (bundle == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, bundle);
        } catch (String str2) {
            bundle = Arrays.toString(bundle);
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(b).length() + 58) + String.valueOf(bundle).length());
            stringBuilder2.append("Missing format argument for ");
            stringBuilder2.append(b);
            stringBuilder2.append(": ");
            stringBuilder2.append(bundle);
            stringBuilder2.append(" Default value will be used.");
            Log.w("FirebaseMessaging", stringBuilder2.toString(), str2);
            return null;
        }
    }

    @android.annotation.TargetApi(26)
    /* renamed from: a */
    private final boolean m12817a(int r5) {
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
        r4 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 1;
        r2 = 26;
        if (r0 == r2) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = 0;
        r2 = r4.f11085b;	 Catch:{ NotFoundException -> 0x0032 }
        r2 = r2.getResources();	 Catch:{ NotFoundException -> 0x0032 }
        r3 = 0;	 Catch:{ NotFoundException -> 0x0032 }
        r2 = r2.getDrawable(r5, r3);	 Catch:{ NotFoundException -> 0x0032 }
        r2 = r2 instanceof android.graphics.drawable.AdaptiveIconDrawable;	 Catch:{ NotFoundException -> 0x0032 }
        if (r2 == 0) goto L_0x0031;	 Catch:{ NotFoundException -> 0x0032 }
    L_0x0018:
        r1 = "FirebaseMessaging";	 Catch:{ NotFoundException -> 0x0032 }
        r2 = 77;	 Catch:{ NotFoundException -> 0x0032 }
        r3 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x0032 }
        r3.<init>(r2);	 Catch:{ NotFoundException -> 0x0032 }
        r2 = "Adaptive icons cannot be used in notifications. Ignoring icon id: ";	 Catch:{ NotFoundException -> 0x0032 }
        r3.append(r2);	 Catch:{ NotFoundException -> 0x0032 }
        r3.append(r5);	 Catch:{ NotFoundException -> 0x0032 }
        r5 = r3.toString();	 Catch:{ NotFoundException -> 0x0032 }
        android.util.Log.e(r1, r5);	 Catch:{ NotFoundException -> 0x0032 }
        return r0;
    L_0x0031:
        return r1;
    L_0x0032:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.d.a(int):boolean");
    }

    /* renamed from: a */
    private final java.lang.Integer m12814a(java.lang.String r5) {
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
        r4 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 0;
        r2 = 21;
        if (r0 >= r2) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = android.text.TextUtils.isEmpty(r5);
        if (r0 != 0) goto L_0x003c;
    L_0x000e:
        r0 = android.graphics.Color.parseColor(r5);	 Catch:{ IllegalArgumentException -> 0x0017 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x0017 }
        return r0;
    L_0x0017:
        r0 = "FirebaseMessaging";
        r2 = java.lang.String.valueOf(r5);
        r2 = r2.length();
        r2 = r2 + 54;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Color ";
        r3.append(r2);
        r3.append(r5);
        r5 = " not valid. Notification will use default color.";
        r3.append(r5);
        r5 = r3.toString();
        android.util.Log.w(r0, r5);
    L_0x003c:
        r5 = r4.m12813a();
        r0 = "com.google.firebase.messaging.default_notification_color";
        r2 = 0;
        r5 = r5.getInt(r0, r2);
        if (r5 == 0) goto L_0x005b;
    L_0x0049:
        r0 = r4.f11085b;	 Catch:{ NotFoundException -> 0x0054 }
        r5 = android.support.v4.content.C0389b.m1438c(r0, r5);	 Catch:{ NotFoundException -> 0x0054 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ NotFoundException -> 0x0054 }
        return r5;
    L_0x0054:
        r5 = "FirebaseMessaging";
        r0 = "Cannot find the color resource referenced in AndroidManifest.";
        android.util.Log.w(r5, r0);
    L_0x005b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.d.a(java.lang.String):java.lang.Integer");
    }

    /* renamed from: d */
    static String m12822d(Bundle bundle) {
        String a = C2612d.m12815a(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(a) ? C2612d.m12815a(bundle, "gcm.n.sound") : a;
    }

    /* renamed from: a */
    private static void m12816a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    /* renamed from: a */
    private final android.os.Bundle m12813a() {
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
        r4 = this;
        r0 = r4.f11086c;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0 = r4.f11086c;
        return r0;
    L_0x0007:
        r0 = 0;
        r1 = r4.f11085b;	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x001b }
        r2 = r4.f11085b;	 Catch:{ NameNotFoundException -> 0x001b }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x001b }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r1.getApplicationInfo(r2, r3);	 Catch:{ NameNotFoundException -> 0x001b }
        r0 = r1;
    L_0x001b:
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r1 = r0.metaData;
        if (r1 == 0) goto L_0x0028;
    L_0x0021:
        r0 = r0.metaData;
        r4.f11086c = r0;
        r0 = r4.f11086c;
        return r0;
    L_0x0028:
        r0 = android.os.Bundle.EMPTY;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.d.a():android.os.Bundle");
    }
}
