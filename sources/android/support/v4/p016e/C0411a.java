package android.support.v4.p016e;

import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: android.support.v4.e.a */
public final class C0411a {
    /* renamed from: a */
    private static Method f1398a;
    /* renamed from: b */
    private static Method f1399b;

    static {
        if (VERSION.SDK_INT >= 21) {
            try {
                f1399b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
                return;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        try {
            Class cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f1398a = cls.getMethod("getScript", new Class[]{String.class});
                f1399b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
            }
        } catch (Throwable e2) {
            f1398a = null;
            f1399b = null;
            Log.w("ICUCompat", e2);
        }
    }

    /* renamed from: a */
    public static String m1510a(Locale locale) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f1399b.invoke(null, new Object[]{locale})).getScript();
            } catch (Throwable e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (Throwable e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        }
        String b = C0411a.m1511b(locale);
        if (b != null) {
            return C0411a.m1509a(b);
        }
        return null;
    }

    /* renamed from: a */
    private static String m1509a(String str) {
        try {
            if (f1398a != null) {
                return (String) f1398a.invoke(null, new Object[]{str});
            }
        } catch (String str2) {
            Log.w("ICUCompat", str2);
        } catch (String str22) {
            Log.w("ICUCompat", str22);
        }
        return null;
    }

    /* renamed from: b */
    private static String m1511b(Locale locale) {
        locale = locale.toString();
        try {
            if (f1399b != null) {
                return (String) f1399b.invoke(null, new Object[]{locale});
            }
        } catch (Throwable e) {
            Log.w("ICUCompat", e);
        } catch (Throwable e2) {
            Log.w("ICUCompat", e2);
        }
        return locale;
    }
}
