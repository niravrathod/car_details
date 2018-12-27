package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.g */
public class C1025g {
    /* renamed from: a */
    private final String f3421a;
    /* renamed from: b */
    private final String f3422b;
    /* renamed from: c */
    private final JSONObject f3423c = new JSONObject(this.f3421a);

    /* renamed from: com.android.billingclient.api.g$a */
    public static class C1024a {
        /* renamed from: a */
        private List<C1025g> f3419a;
        /* renamed from: b */
        private int f3420b;

        C1024a(int i, List<C1025g> list) {
            this.f3419a = list;
            this.f3420b = i;
        }

        /* renamed from: a */
        public int m4380a() {
            return this.f3420b;
        }

        /* renamed from: b */
        public List<C1025g> m4381b() {
            return this.f3419a;
        }
    }

    public C1025g(String str, String str2) {
        this.f3421a = str;
        this.f3422b = str2;
    }

    /* renamed from: a */
    public String m4382a() {
        return this.f3423c.optString("orderId");
    }

    /* renamed from: b */
    public String m4383b() {
        return this.f3423c.optString("productId");
    }

    /* renamed from: c */
    public long m4384c() {
        return this.f3423c.optLong("purchaseTime");
    }

    /* renamed from: d */
    public String m4385d() {
        return this.f3423c.optString("token", this.f3423c.optString("purchaseToken"));
    }

    /* renamed from: e */
    public boolean m4386e() {
        return this.f3423c.optBoolean("autoRenewing");
    }

    /* renamed from: f */
    public String m4387f() {
        return this.f3421a;
    }

    /* renamed from: g */
    public String m4388g() {
        return this.f3422b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Purchase. Json: ");
        stringBuilder.append(this.f3421a);
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1025g)) {
            return false;
        }
        C1025g c1025g = (C1025g) obj;
        if (!TextUtils.equals(this.f3421a, c1025g.m4387f()) || TextUtils.equals(this.f3422b, c1025g.m4388g()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f3421a.hashCode();
    }
}
