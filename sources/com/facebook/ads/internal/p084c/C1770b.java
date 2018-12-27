package com.facebook.ads.internal.p084c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.facebook.ads.internal.p084c.C1769a.C1768c;
import com.facebook.ads.internal.p084c.C1772c.C1771a;
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p101q.p102a.C1907b;

/* renamed from: com.facebook.ads.internal.c.b */
public class C1770b {
    /* renamed from: a */
    public static String f5344a = "";
    /* renamed from: b */
    public static String f5345b = "";
    /* renamed from: c */
    public static boolean f5346c = false;
    /* renamed from: d */
    public static String f5347d = "";

    /* renamed from: a */
    public static void m6673a(Context context) {
        try {
            C1771a a;
            C1769a a2;
            SharedPreferences sharedPreferences = context.getSharedPreferences("SDKIDFA", 0);
            if (sharedPreferences.contains("attributionId")) {
                f5344a = sharedPreferences.getString("attributionId", "");
            }
            if (sharedPreferences.contains("advertisingId")) {
                f5345b = sharedPreferences.getString("advertisingId", "");
                f5346c = sharedPreferences.getBoolean("limitAdTracking", f5346c);
                f5347d = C1768c.SHARED_PREFS.name();
            }
            try {
                a = C1772c.m6674a(context.getContentResolver());
            } catch (Throwable e) {
                C1813b.m6823a(C1812a.m6820a(e, "Error retrieving attribution id from fb4a"));
                a = null;
            }
            if (!(a == null || a.f5348a == null)) {
                f5344a = a.f5348a;
            }
            if (C1907b.m7252a() && C1907b.m7253b("aid_override")) {
                f5344a = C1907b.m7251a("aid_override");
            }
            try {
                a2 = C1769a.m6667a(context, a);
            } catch (Throwable e2) {
                C1813b.m6823a(C1812a.m6820a(e2, "Error retrieving advertising id from Google Play Services"));
                a2 = null;
            }
            if (a2 != null) {
                String a3 = a2.m6670a();
                Boolean valueOf = Boolean.valueOf(a2.m6671b());
                if (a3 != null) {
                    f5345b = a3;
                    f5346c = valueOf.booleanValue();
                    f5347d = a2.m6672c().name();
                }
            }
            Editor edit = sharedPreferences.edit();
            edit.putString("attributionId", f5344a);
            edit.putString("advertisingId", f5345b);
            edit.putBoolean("limitAdTracking", f5346c);
            edit.apply();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
