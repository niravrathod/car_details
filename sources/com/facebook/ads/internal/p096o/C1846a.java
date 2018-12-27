package com.facebook.ads.internal.p096o;

import com.facebook.ads.internal.protocol.C1897c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.o.a */
public class C1846a {
    /* renamed from: a */
    private static Map<String, Long> f5640a = new ConcurrentHashMap();
    /* renamed from: b */
    private static Map<String, Long> f5641b = new ConcurrentHashMap();
    /* renamed from: c */
    private static Map<String, String> f5642c = new ConcurrentHashMap();

    /* renamed from: a */
    private static long m7033a(String str, C1897c c1897c) {
        if (f5640a.containsKey(str)) {
            return ((Long) f5640a.get(str)).longValue();
        }
        switch (c1897c) {
            case BANNER:
                return 15000;
            default:
                return -1000;
        }
    }

    /* renamed from: a */
    public static void m7034a(long j, C1847b c1847b) {
        f5640a.put(C1846a.m7039d(c1847b), Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m7035a(String str, C1847b c1847b) {
        f5642c.put(C1846a.m7039d(c1847b), str);
    }

    /* renamed from: a */
    public static boolean m7036a(C1847b c1847b) {
        String d = C1846a.m7039d(c1847b);
        boolean z = false;
        if (!f5641b.containsKey(d)) {
            return false;
        }
        long longValue = ((Long) f5641b.get(d)).longValue();
        if (System.currentTimeMillis() - longValue < C1846a.m7033a(d, c1847b.m7042b())) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public static void m7037b(C1847b c1847b) {
        f5641b.put(C1846a.m7039d(c1847b), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: c */
    public static String m7038c(C1847b c1847b) {
        return (String) f5642c.get(C1846a.m7039d(c1847b));
    }

    /* renamed from: d */
    private static String m7039d(C1847b c1847b) {
        String str = "%s:%s:%s:%d:%d:%d";
        Object[] objArr = new Object[6];
        int i = 0;
        objArr[0] = c1847b.m7041a();
        objArr[1] = c1847b.m7042b();
        objArr[2] = c1847b.f5645c;
        objArr[3] = Integer.valueOf(c1847b.m7043c() == null ? 0 : c1847b.m7043c().m7296a());
        if (c1847b.m7043c() != null) {
            i = c1847b.m7043c().m7297b();
        }
        objArr[4] = Integer.valueOf(i);
        objArr[5] = Integer.valueOf(c1847b.m7044d());
        return String.format(str, objArr);
    }
}
