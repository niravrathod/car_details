package com.cuvora.carinfo.helpers;

import android.content.Context;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.cuvora.carinfo.helpers.s */
public class C1565s {
    /* renamed from: a */
    private static String f4710a = "stage";
    /* renamed from: b */
    private static String f4711b = "car";
    /* renamed from: c */
    private static String f4712c = f4711b;

    /* renamed from: h */
    public static String m5968h(Context context) {
        return "http://ip-api.com/json";
    }

    /* renamed from: a */
    public static String m5955a(Context context, String str, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/v1/details/list?vehicle_num=");
        stringBuilder.append(str);
        stringBuilder.append("&skipDb=");
        stringBuilder.append(z);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m5953a(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/utils/trending/celebs");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public static String m5957b(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/v1/details/scrape");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    public static String m5959c(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/v1/details/licence/scrape");
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public static String m5961d(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/v1/details/licence/list");
        return stringBuilder.toString();
    }

    /* renamed from: e */
    public static String m5963e(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/v3/sections/");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m5954a(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        context = new StringBuilder();
        context.append("/");
        context.append(f4712c);
        context.append("/v1/user");
        stringBuilder.append(context.toString());
        if (str != null) {
            stringBuilder.append("?availableIds=");
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    /* renamed from: f */
    public static String m5965f(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/v1/user/token/sync");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public static String m5958b(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/search/vehicle?name=");
        stringBuilder.append(str);
        stringBuilder.append("&skipDb=true");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m5956a(Context context, Map<String, Object> map) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/v3/home");
        if (map != null && map.isEmpty() == null) {
            context = null;
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                stringBuilder.append(context == null ? "?" : "&");
                stringBuilder.append((String) entry.getKey());
                stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
                stringBuilder.append(entry.getValue());
                context++;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: c */
    public static String m5960c(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/v2/fuel/prices?cityId=");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: g */
    public static String m5967g(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/v2/fuel/states");
        return stringBuilder.toString();
    }

    /* renamed from: i */
    public static String m5969i(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/v2/user/fuel/prices");
        return stringBuilder.toString();
    }

    /* renamed from: j */
    public static String m5970j(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/car-data/brands");
        return stringBuilder.toString();
    }

    /* renamed from: k */
    public static String m5971k(Context context) {
        context = new StringBuilder();
        context.append("http://cuvora.com/");
        context.append(f4712c);
        context.append("/v1/user/property");
        return context.toString();
    }

    /* renamed from: d */
    public static String m5962d(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/car-data/models?brandId=");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: e */
    public static String m5964e(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/car-data/model/");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: f */
    public static String m5966f(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/car-data/varient/");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: l */
    public static String m5972l(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1547j.m5912c().m5917b(context));
        stringBuilder.append("/");
        stringBuilder.append(f4712c);
        stringBuilder.append("/v1/user/vehicles");
        return stringBuilder.toString();
    }
}
