package com.facebook.ads.internal.p101q.p106e;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.util.Log;
import com.facebook.ads.internal.p101q.p105d.C1953a;
import com.facebook.ads.internal.p101q.p105d.C1954b;

/* renamed from: com.facebook.ads.internal.q.e.a */
public class C1955a {
    /* renamed from: a */
    private static final String f6008a = "a";

    /* renamed from: a */
    public static boolean m7385a(Context context) {
        return C1955a.m7386b(context) && C1956b.m7388b(context);
    }

    /* renamed from: b */
    public static boolean m7386b(Context context) {
        if (context == null) {
            Log.v(f6008a, "Invalid context in screen interactive check, assuming interactive.");
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            return VERSION.SDK_INT >= 20 ? powerManager.isInteractive() : powerManager.isScreenOn();
        } catch (Exception e) {
            Log.e(f6008a, "Exception in screen interactive check, assuming interactive.", e);
            C1953a.m7382a(context, "risky", C1954b.f6003q, e);
            return true;
        }
    }
}
