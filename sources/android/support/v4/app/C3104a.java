package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.C0389b;
import android.view.View;

/* renamed from: android.support.v4.app.a */
public class C3104a extends C0389b {
    /* renamed from: a */
    private static C0320b f13117a;

    /* renamed from: android.support.v4.app.a$a */
    public interface C0319a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: android.support.v4.app.a$b */
    public interface C0320b {
        /* renamed from: a */
        boolean m1139a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean m1140a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: android.support.v4.app.a$c */
    public interface C0321c {
        /* renamed from: a */
        void mo4887a(int i);
    }

    /* renamed from: a */
    public static C0320b m15332a() {
        return f13117a;
    }

    /* renamed from: a */
    public static void m15335a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m15336a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m15334a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static <T extends View> T m15333a(Activity activity, int i) {
        activity = activity.findViewById(i);
        if (activity != null) {
            return activity;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    /* renamed from: a */
    public static void m15337a(final Activity activity, final String[] strArr, final int i) {
        if (f13117a == null || !f13117a.m1140a(activity, strArr, i)) {
            if (VERSION.SDK_INT >= 23) {
                if (activity instanceof C0321c) {
                    ((C0321c) activity).mo4887a(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof C0319a) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        int[] iArr = new int[strArr.length];
                        PackageManager packageManager = activity.getPackageManager();
                        String packageName = activity.getPackageName();
                        int length = strArr.length;
                        for (int i = 0; i < length; i++) {
                            iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                        }
                        ((C0319a) activity).onRequestPermissionsResult(i, strArr, iArr);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static boolean m15338a(Activity activity, String str) {
        return VERSION.SDK_INT >= 23 ? activity.shouldShowRequestPermissionRationale(str) : null;
    }
}
