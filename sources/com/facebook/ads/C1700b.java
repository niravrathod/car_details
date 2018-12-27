package com.facebook.ads;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1894a;

/* renamed from: com.facebook.ads.b */
public class C1700b {
    /* renamed from: a */
    public static final C1700b f5119a = new C1700b(1000, "Network Error");
    /* renamed from: b */
    public static final C1700b f5120b = new C1700b(1001, "No Fill");
    /* renamed from: c */
    public static final C1700b f5121c = new C1700b(1002, "Ad was re-loaded too frequently");
    /* renamed from: d */
    public static final C1700b f5122d = new C1700b(2000, "Server Error");
    /* renamed from: e */
    public static final C1700b f5123e = new C1700b(2001, "Internal Error");
    /* renamed from: f */
    public static final C1700b f5124f = new C1700b(2002, "Cache Error");
    /* renamed from: g */
    public static final C1700b f5125g = new C1700b(3001, "Mediation Error");
    @Deprecated
    /* renamed from: h */
    public static final C1700b f5126h = new C1700b(2002, "Native ad failed to load due to missing properties");
    /* renamed from: i */
    public static final C1700b f5127i = new C1700b(2100, "Native ad failed to load its media");
    /* renamed from: j */
    public static final C1700b f5128j = new C1700b(6003, "unsupported type of ad assets");
    /* renamed from: k */
    private final int f5129k;
    /* renamed from: l */
    private final String f5130l;

    public C1700b(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown error";
        }
        this.f5129k = i;
        this.f5130l = str;
    }

    /* renamed from: a */
    public static C1700b m6434a(C1894a c1894a) {
        return c1894a.m7230a().m7226c() ? new C1700b(c1894a.m7230a().m7224a(), c1894a.m7231b()) : new C1700b(AdErrorType.UNKNOWN_ERROR.m7224a(), AdErrorType.UNKNOWN_ERROR.m7225b());
    }

    /* renamed from: a */
    public int m6435a() {
        return this.f5129k;
    }

    /* renamed from: b */
    public String m6436b() {
        return this.f5130l;
    }
}
