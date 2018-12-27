package com.facebook.ads.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: com.facebook.ads.internal.settings.b */
public class C1964b {
    /* renamed from: a */
    static volatile boolean f6057a = false;
    /* renamed from: b */
    private static final String f6058b = "b";
    /* renamed from: c */
    private static final Collection<String> f6059c = new HashSet();
    /* renamed from: d */
    private static final Collection<String> f6060d = new HashSet();
    /* renamed from: e */
    private static boolean f6061e;
    /* renamed from: f */
    private static String f6062f;
    /* renamed from: g */
    private static String f6063g;
    /* renamed from: h */
    private static String f6064h;
    /* renamed from: i */
    private static boolean f6065i = false;
    /* renamed from: j */
    private static boolean f6066j;
    /* renamed from: k */
    private static boolean f6067k;

    static {
        f6060d.add("sdk");
        f6060d.add("google_sdk");
        f6060d.add("vbox86p");
        f6060d.add("vbox86tp");
    }

    /* renamed from: a */
    public static void m7433a(String str) {
        f6063g = str;
    }

    /* renamed from: a */
    public static boolean m7434a() {
        return f6061e;
    }

    /* renamed from: a */
    public static boolean m7435a(Context context) {
        if (!(f6065i || C1964b.m7434a())) {
            if (!f6060d.contains(Build.PRODUCT)) {
                if (f6064h == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("FBAdPrefs", 0);
                    f6064h = sharedPreferences.getString("deviceIdHash", null);
                    if (TextUtils.isEmpty(f6064h)) {
                        f6064h = UUID.randomUUID().toString();
                        sharedPreferences.edit().putString("deviceIdHash", f6064h).apply();
                    }
                }
                if (f6059c.contains(f6064h)) {
                    return true;
                }
                C1964b.m7437b(f6064h);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m7436b() {
        return f6062f;
    }

    /* renamed from: b */
    private static void m7437b(String str) {
        if (!f6057a) {
            f6057a = true;
            String str2 = f6058b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Test mode device hash: ");
            stringBuilder.append(str);
            Log.d(str2, stringBuilder.toString());
            str2 = f6058b;
            stringBuilder = new StringBuilder();
            stringBuilder.append("When testing your app with Facebook's ad units you must specify the device hashed ID to ensure the delivery of test ads, add the following code before loading an ad: AdSettings.addTestDevice(\"");
            stringBuilder.append(str);
            stringBuilder.append("\");");
            Log.d(str2, stringBuilder.toString());
        }
    }

    /* renamed from: c */
    public static String m7438c() {
        return f6063g;
    }

    /* renamed from: d */
    public static boolean m7439d() {
        return f6066j;
    }

    /* renamed from: e */
    public static boolean m7440e() {
        return f6067k;
    }

    /* renamed from: f */
    public static boolean m7441f() {
        return f6065i;
    }
}
