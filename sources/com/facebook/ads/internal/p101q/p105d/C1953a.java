package com.facebook.ads.internal.p101q.p105d;

import android.content.Context;
import com.facebook.ads.internal.p087f.C1795e;
import com.facebook.ads.internal.p090i.C1809c;
import com.facebook.ads.internal.p093l.C1820a;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.q.d.a */
public class C1953a {
    /* renamed from: a */
    public static void m7382a(Context context, String str, int i, Exception exception) {
        if (C1953a.m7383a(context, str, i, Math.random())) {
            C1953a.m7384b(context, str, i, exception);
        }
    }

    /* renamed from: a */
    static boolean m7383a(Context context, String str, int i, double d) {
        double k;
        double d2;
        Set i2 = C1820a.m6854i(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(i);
        if (i2.contains(stringBuilder.toString())) {
            k = (double) (C1820a.m6856k(context) * C1820a.m6855j(context));
            d2 = 10000.0d;
        } else {
            k = (double) C1820a.m6856k(context);
            d2 = 100.0d;
        }
        Double.isNaN(k);
        return d >= 1.0d - (k / d2);
    }

    /* renamed from: b */
    private static void m7384b(Context context, String str, int i, Exception exception) {
        Map a = new C1809c(context, false).m6817a();
        a.put("subtype", str);
        a.put("subtype_code", String.valueOf(i));
        C1795e.m6748a(exception, context, a);
    }
}
