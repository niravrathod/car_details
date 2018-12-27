package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* renamed from: android.support.v4.content.b */
public class C0389b {
    /* renamed from: a */
    private static final Object f1328a = new Object();
    /* renamed from: b */
    private static TypedValue f1329b;

    /* renamed from: a */
    public static boolean m1432a(Context context, Intent[] intentArr, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    /* renamed from: a */
    public static void m1431a(Context context, Intent intent, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static File[] m1434a(Context context, String str) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: a */
    public static File[] m1433a(Context context) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: a */
    public static Drawable m1429a(Context context, int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f1328a) {
            if (f1329b == null) {
                f1329b = new TypedValue();
            }
            context.getResources().getValue(i, f1329b, true);
            i = f1329b.resourceId;
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: b */
    public static ColorStateList m1436b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    /* renamed from: c */
    public static int m1438c(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: b */
    public static int m1435b(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static File m1437b(Context context) {
        if (VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        return C0389b.m1430a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static synchronized java.io.File m1430a(java.io.File r4) {
        /*
        r0 = android.support.v4.content.C0389b.class;
        monitor-enter(r0);
        r1 = r4.exists();	 Catch:{ all -> 0x0036 }
        if (r1 != 0) goto L_0x0034;
    L_0x0009:
        r1 = r4.mkdirs();	 Catch:{ all -> 0x0036 }
        if (r1 != 0) goto L_0x0034;
    L_0x000f:
        r1 = r4.exists();	 Catch:{ all -> 0x0036 }
        if (r1 == 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r0);
        return r4;
    L_0x0017:
        r1 = "ContextCompat";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0036 }
        r2.<init>();	 Catch:{ all -> 0x0036 }
        r3 = "Unable to create files subdir ";
        r2.append(r3);	 Catch:{ all -> 0x0036 }
        r4 = r4.getPath();	 Catch:{ all -> 0x0036 }
        r2.append(r4);	 Catch:{ all -> 0x0036 }
        r4 = r2.toString();	 Catch:{ all -> 0x0036 }
        android.util.Log.w(r1, r4);	 Catch:{ all -> 0x0036 }
        r4 = 0;
        monitor-exit(r0);
        return r4;
    L_0x0034:
        monitor-exit(r0);
        return r4;
    L_0x0036:
        r4 = move-exception;
        monitor-exit(r0);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.b.a(java.io.File):java.io.File");
    }

    /* renamed from: c */
    public static boolean m1439c(Context context) {
        return VERSION.SDK_INT >= 24 ? context.isDeviceProtectedStorage() : null;
    }
}
