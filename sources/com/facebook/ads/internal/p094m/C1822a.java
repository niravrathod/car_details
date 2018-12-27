package com.facebook.ads.internal.p094m;

import android.text.TextUtils;
import com.facebook.ads.internal.p088g.C1799a;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.facebook.ads.internal.m.a */
public class C1822a {
    /* renamed from: a */
    private final String f5516a;
    /* renamed from: b */
    private final double f5517b;
    /* renamed from: c */
    private final double f5518c;
    /* renamed from: d */
    private final String f5519d;
    /* renamed from: e */
    private final Map<String, String> f5520e;
    /* renamed from: f */
    private final C1828e f5521f;
    /* renamed from: g */
    private final C1829f f5522g;
    /* renamed from: h */
    private final boolean f5523h;

    /* renamed from: com.facebook.ads.internal.m.a$a */
    public static class C1821a {
        /* renamed from: a */
        private String f5509a;
        /* renamed from: b */
        private double f5510b;
        /* renamed from: c */
        private String f5511c;
        /* renamed from: d */
        private Map<String, String> f5512d;
        /* renamed from: e */
        private C1828e f5513e;
        /* renamed from: f */
        private C1829f f5514f;
        /* renamed from: g */
        private boolean f5515g;

        /* renamed from: a */
        public C1821a m6875a(double d) {
            this.f5510b = d;
            return this;
        }

        /* renamed from: a */
        public C1821a m6876a(C1828e c1828e) {
            this.f5513e = c1828e;
            return this;
        }

        /* renamed from: a */
        public C1821a m6877a(C1829f c1829f) {
            this.f5514f = c1829f;
            return this;
        }

        /* renamed from: a */
        public C1821a m6878a(String str) {
            this.f5509a = str;
            return this;
        }

        /* renamed from: a */
        public C1821a m6879a(Map<String, String> map) {
            this.f5512d = map;
            return this;
        }

        /* renamed from: a */
        public C1821a m6880a(boolean z) {
            this.f5515g = z;
            return this;
        }

        /* renamed from: a */
        public C1822a m6881a() {
            return new C1822a(this.f5509a, this.f5510b, this.f5511c, this.f5512d, this.f5513e, this.f5514f, this.f5515g);
        }

        /* renamed from: b */
        public C1821a m6882b(String str) {
            this.f5511c = str;
            return this;
        }
    }

    public C1822a(String str, double d, String str2, Map<String, String> map, C1828e c1828e, C1829f c1829f, boolean z) {
        this.f5516a = str;
        double currentTimeMillis = (double) System.currentTimeMillis();
        Double.isNaN(currentTimeMillis);
        this.f5517b = currentTimeMillis / 1000.0d;
        this.f5518c = d;
        this.f5519d = str2;
        this.f5521f = c1828e;
        this.f5522g = c1829f;
        this.f5523h = z;
        Map hashMap = new HashMap();
        if (!(map == null || map.isEmpty())) {
            hashMap.putAll(map);
        }
        if (m6889f()) {
            hashMap.put("analog", C1921k.m7293a(C1799a.m6761a()));
        }
        this.f5520e = C1822a.m6883a(hashMap);
    }

    /* renamed from: a */
    private static Map<String, String> m6883a(Map<String, String> map) {
        Map<String, String> hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 != null) {
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public String m6884a() {
        return this.f5516a;
    }

    /* renamed from: b */
    public double m6885b() {
        return this.f5517b;
    }

    /* renamed from: c */
    public double m6886c() {
        return this.f5518c;
    }

    /* renamed from: d */
    public String m6887d() {
        return this.f5519d;
    }

    /* renamed from: e */
    public Map<String, String> m6888e() {
        return this.f5520e;
    }

    /* renamed from: f */
    final boolean m6889f() {
        return this.f5521f == C1828e.IMMEDIATE;
    }

    /* renamed from: g */
    final boolean m6890g() {
        return TextUtils.isEmpty(this.f5516a) ^ 1;
    }

    /* renamed from: h */
    public C1828e m6891h() {
        return this.f5521f;
    }

    /* renamed from: i */
    public C1829f m6892i() {
        return this.f5522g;
    }
}
