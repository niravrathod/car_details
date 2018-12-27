package android.support.v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.g */
public final class C0328g {

    /* renamed from: android.support.v4.app.g$a */
    static class C0327a {
        /* renamed from: a */
        private static Method f1148a;
        /* renamed from: b */
        private static boolean f1149b;
        /* renamed from: c */
        private static Method f1150c;
        /* renamed from: d */
        private static boolean f1151d;

        /* renamed from: a */
        public static IBinder m1168a(Bundle bundle, String str) {
            if (!f1149b) {
                try {
                    f1148a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f1148a.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f1149b = true;
            }
            if (f1148a != null) {
                try {
                    return (IBinder) f1148a.invoke(bundle, new Object[]{str});
                } catch (Bundle bundle2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", bundle2);
                    f1148a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m1169a(Bundle bundle, String str, IBinder iBinder) {
            if (!f1151d) {
                try {
                    f1150c = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f1150c.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f1151d = true;
            }
            if (f1150c != null) {
                try {
                    f1150c.invoke(bundle, new Object[]{str, iBinder});
                } catch (Bundle bundle2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", bundle2);
                    f1150c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m1170a(Bundle bundle, String str) {
        if (VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0327a.m1168a(bundle, str);
    }

    /* renamed from: a */
    public static void m1171a(Bundle bundle, String str, IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0327a.m1169a(bundle, str, iBinder);
        }
    }
}
