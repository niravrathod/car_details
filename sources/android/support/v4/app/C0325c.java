package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.app.c */
public final class C0325c {
    /* renamed from: a */
    public static String m1167a(String str) {
        return VERSION.SDK_INT >= 23 ? AppOpsManager.permissionToOp(str) : null;
    }

    /* renamed from: a */
    public static int m1166a(Context context, String str, String str2) {
        return VERSION.SDK_INT >= 23 ? ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2) : 1;
    }
}
