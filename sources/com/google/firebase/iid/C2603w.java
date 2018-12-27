package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.support.v4.p017f.C0433m;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.w */
public final class C2603w {
    /* renamed from: b */
    private static C2603w f11058b;
    /* renamed from: a */
    final Queue<Intent> f11059a = new ArrayDeque();
    @GuardedBy("serviceClassNames")
    /* renamed from: c */
    private final C0433m<String, String> f11060c = new C0433m();
    /* renamed from: d */
    private Boolean f11061d = null;
    /* renamed from: e */
    private final Queue<Intent> f11062e = new ArrayDeque();

    /* renamed from: a */
    public static synchronized C2603w m12774a() {
        C2603w c2603w;
        synchronized (C2603w.class) {
            if (f11058b == null) {
                f11058b = new C2603w();
            }
            c2603w = f11058b;
        }
        return c2603w;
    }

    private C2603w() {
    }

    /* renamed from: a */
    public static PendingIntent m12773a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, C2603w.m12776b(context, "com.google.firebase.MESSAGING_EVENT", intent), 1073741824);
    }

    /* renamed from: a */
    public static void m12775a(Context context, Intent intent) {
        context.sendBroadcast(C2603w.m12776b(context, "com.google.firebase.INSTANCE_ID_EVENT", intent));
    }

    /* renamed from: b */
    public static void m12777b(Context context, Intent intent) {
        context.sendBroadcast(C2603w.m12776b(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    /* renamed from: b */
    private static Intent m12776b(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    /* renamed from: b */
    public final Intent m12780b() {
        return (Intent) this.f11062e.poll();
    }

    /* renamed from: a */
    public final int m12779a(Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String str2 = "FirebaseInstanceId";
            String str3 = "Starting service: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        Object obj = -1;
        int hashCode = str.hashCode();
        if (hashCode != -842411455) {
            if (hashCode == 41532704) {
                if (str.equals("com.google.firebase.MESSAGING_EVENT")) {
                    obj = 1;
                }
            }
        } else if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            obj = null;
        }
        switch (obj) {
            case null:
                this.f11059a.offer(intent);
                break;
            case 1:
                this.f11062e.offer(intent);
                break;
            default:
                context = "FirebaseInstanceId";
                intent = "Unknown service action: ";
                str = String.valueOf(str);
                Log.w(context, str.length() != 0 ? intent.concat(str) : new String(intent));
                return 500;
        }
        intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        return m12778c(context, intent);
    }

    /* renamed from: c */
    private final int m12778c(Context context, Intent intent) {
        String str;
        synchronized (this.f11060c) {
            str = (String) this.f11060c.get(intent.getAction());
        }
        boolean z = false;
        if (str == null) {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null) {
                if (resolveService.serviceInfo != null) {
                    ServiceInfo serviceInfo = resolveService.serviceInfo;
                    if (context.getPackageName().equals(serviceInfo.packageName)) {
                        if (serviceInfo.name != null) {
                            str = serviceInfo.name;
                            if (str.startsWith(".")) {
                                String valueOf = String.valueOf(context.getPackageName());
                                str = String.valueOf(str);
                                str = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
                            }
                            synchronized (this.f11060c) {
                                this.f11060c.put(intent.getAction(), str);
                            }
                        }
                    }
                    String str2 = serviceInfo.packageName;
                    str = serviceInfo.name;
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 94) + String.valueOf(str).length());
                    stringBuilder.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                    stringBuilder.append(str2);
                    stringBuilder.append("/");
                    stringBuilder.append(str);
                    Log.e("FirebaseInstanceId", stringBuilder.toString());
                    if (this.f11061d == null) {
                        if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                            z = true;
                        }
                        this.f11061d = Boolean.valueOf(z);
                    }
                    if (this.f11061d.booleanValue()) {
                        context = WakefulBroadcastReceiver.a_(context, intent);
                    } else {
                        context = context.startService(intent);
                        Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
                    }
                    if (context == null) {
                        return -1;
                    }
                    Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                    return 404;
                }
            }
            Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
            if (this.f11061d == null) {
                if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                    z = true;
                }
                this.f11061d = Boolean.valueOf(z);
            }
            if (this.f11061d.booleanValue()) {
                context = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            } else {
                context = WakefulBroadcastReceiver.a_(context, intent);
            }
            if (context == null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            valueOf = "FirebaseInstanceId";
            str2 = "Restricting intent to a specific service: ";
            String valueOf2 = String.valueOf(str);
            Log.d(valueOf, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
        intent.setClassName(context.getPackageName(), str);
        try {
            if (this.f11061d == null) {
                if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                    z = true;
                }
                this.f11061d = Boolean.valueOf(z);
            }
            if (this.f11061d.booleanValue()) {
                context = WakefulBroadcastReceiver.a_(context, intent);
            } else {
                context = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (context == null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (Context context2) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", context2);
            return 401;
        } catch (Context context22) {
            context22 = String.valueOf(context22);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(context22).length() + 45);
            stringBuilder2.append("Failed to start service while in background: ");
            stringBuilder2.append(context22);
            Log.e("FirebaseInstanceId", stringBuilder2.toString());
            return 402;
        }
    }
}
