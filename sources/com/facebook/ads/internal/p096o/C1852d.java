package com.facebook.ads.internal.p096o;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.settings.C1964b;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.o.d */
public class C1852d {
    /* renamed from: a */
    public static String m7067a() {
        if (TextUtils.isEmpty(C1964b.m7436b())) {
            return "https://graph.facebook.com/network_ads_common";
        }
        return String.format("https://graph.%s.facebook.com/network_ads_common", new Object[]{C1964b.m7436b()});
    }

    /* renamed from: a */
    public static String m7068a(Context context) {
        String format = TextUtils.isEmpty(C1964b.m7436b()) ? "https://www.facebook.com/adnw_logging/" : String.format(Locale.US, "https://www.%s.facebook.com/adnw_logging/", new Object[]{C1964b.m7436b()});
        CharSequence v = C1820a.m6867v(context);
        return TextUtils.isEmpty(v) ? format : format.replace("www", v);
    }
}
