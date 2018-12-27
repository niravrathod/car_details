package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.C2572b;
import com.google.firebase.analytics.connector.C2561a;

@KeepForSdk
/* renamed from: com.google.firebase.messaging.b */
public class C2609b {
    @KeepForSdk
    /* renamed from: a */
    public static void m12807a(Intent intent) {
        C2609b.m12808a("_nr", intent);
    }

    @KeepForSdk
    /* renamed from: b */
    public static void m12809b(Intent intent) {
        if (intent != null) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                C2561a c2561a = (C2561a) C2572b.m12602d().m12608a(C2561a.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (c2561a != null) {
                    Object stringExtra = intent.getStringExtra("google.c.a.c_id");
                    c2561a.mo3308a("fcm", "_ln", stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", stringExtra);
                    c2561a.mo3307a("fcm", "_cmp", bundle);
                } else {
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
        C2609b.m12808a("_no", intent);
    }

    @KeepForSdk
    /* renamed from: c */
    public static void m12810c(Intent intent) {
        C2609b.m12808a("_nd", intent);
    }

    @KeepForSdk
    /* renamed from: d */
    public static void m12811d(Intent intent) {
        C2609b.m12808a("_nf", intent);
    }

    @KeepForSdk
    /* renamed from: e */
    public static boolean m12812e(Intent intent) {
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* renamed from: a */
    private static void m12808a(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        stringExtra = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra != null) {
            bundle.putString("_nmn", stringExtra);
        }
        Object stringExtra2 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle.putString("label", stringExtra2);
        }
        stringExtra2 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle.putString("message_channel", stringExtra2);
        }
        stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            stringExtra = null;
        }
        if (stringExtra != null) {
            bundle.putString("_nt", stringExtra);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (Throwable e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (Intent intent2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", intent2);
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3) != null) {
            stringExtra = String.valueOf(bundle);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 22) + String.valueOf(stringExtra).length());
            stringBuilder.append("Sending event=");
            stringBuilder.append(str);
            stringBuilder.append(" params=");
            stringBuilder.append(stringExtra);
            Log.d("FirebaseMessaging", stringBuilder.toString());
        }
        C2561a c2561a = (C2561a) C2572b.m12602d().m12608a(C2561a.class);
        if (c2561a != null) {
            c2561a.mo3307a("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }
}
