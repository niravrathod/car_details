package android.support.v4.content;

import android.content.Context;
import android.os.Process;
import android.support.v4.app.C0325c;

/* renamed from: android.support.v4.content.e */
public final class C0397e {
    /* renamed from: a */
    public static int m1472a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        str = C0325c.m1167a(str);
        if (str == null) {
            return 0;
        }
        if (str2 == null) {
            i2 = context.getPackageManager().getPackagesForUid(i2);
            if (i2 != 0) {
                if (i2.length > null) {
                    str2 = i2[0];
                }
            }
            return -1;
        }
        if (C0325c.m1166a(context, str, str2) != null) {
            return -2;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m1471a(Context context, String str) {
        return C0397e.m1472a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
