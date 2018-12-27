package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import javax.annotation.concurrent.GuardedBy;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {
    /* renamed from: a */
    private static boolean f17720a = false;
    @GuardedBy("FirebaseInstanceIdReceiver.class")
    /* renamed from: b */
    private static ah f17721b;
    @GuardedBy("FirebaseInstanceIdReceiver.class")
    /* renamed from: c */
    private static ah f17722c;

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                m23046a(context, intent2, intent.getAction());
            } else {
                m23046a(context, intent, intent.getAction());
            }
        }
    }

    /* renamed from: a */
    private final void m23046a(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (!"google.com/iid".equals(intent.getStringExtra("from"))) {
            if (!"com.google.firebase.INSTANCE_ID_EVENT".equals(str)) {
                if (!"com.google.android.c2dm.intent.RECEIVE".equals(str)) {
                    if ("com.google.firebase.MESSAGING_EVENT".equals(str) == null) {
                        Log.d("FirebaseInstanceId", "Unexpected intent");
                        str = -1;
                        if (str2 != null) {
                            str = m23044a(this, context, str2, intent);
                        }
                        if (isOrderedBroadcast() == null) {
                            setResultCode(str);
                        }
                    }
                }
                str2 = "com.google.firebase.MESSAGING_EVENT";
                str = -1;
                if (str2 != null) {
                    str = m23044a(this, context, str2, intent);
                }
                if (isOrderedBroadcast() == null) {
                    setResultCode(str);
                }
            }
        }
        str2 = "com.google.firebase.INSTANCE_ID_EVENT";
        str = -1;
        if (str2 != null) {
            str = m23044a(this, context, str2, intent);
        }
        if (isOrderedBroadcast() == null) {
            setResultCode(str);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static int m23044a(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        Object obj = 1;
        Object obj2 = (!PlatformVersion.isAtLeastO() || context.getApplicationInfo().targetSdkVersion < 26) ? null : 1;
        if ((intent.getFlags() & 268435456) == 0) {
            obj = null;
        }
        if (obj2 != null && r1 == null) {
            return m23047b(broadcastReceiver, context, str, intent);
        }
        int a = C2603w.m12774a().m12779a(context, str, intent);
        if (!PlatformVersion.isAtLeastO() || a != 402) {
            return a;
        }
        m23047b(broadcastReceiver, context, str, intent);
        return 403;
    }

    /* renamed from: b */
    private static int m23047b(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String str2 = "FirebaseInstanceId";
            String str3 = "Binding to service: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        m23045a(context, str).m12699a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    /* renamed from: a */
    private static synchronized ah m23045a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (f17722c == null) {
                    f17722c = new ah(context, str);
                }
                context = f17722c;
                return context;
            }
            if (f17721b == null) {
                f17721b = new ah(context, str);
            }
            context = f17721b;
            return context;
        }
    }
}
