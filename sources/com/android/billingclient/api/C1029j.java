package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.j */
public class C1029j {
    /* renamed from: a */
    private final String f3426a;
    /* renamed from: b */
    private final JSONObject f3427b = new JSONObject(this.f3426a);

    /* renamed from: com.android.billingclient.api.j$a */
    static class C1028a {
        /* renamed from: a */
        private List<C1029j> f3424a;
        /* renamed from: b */
        private int f3425b;

        C1028a(int i, List<C1029j> list) {
            this.f3424a = list;
            this.f3425b = i;
        }

        /* renamed from: a */
        List<C1029j> m4391a() {
            return this.f3424a;
        }

        /* renamed from: b */
        int m4392b() {
            return this.f3425b;
        }
    }

    public C1029j(String str) {
        this.f3426a = str;
    }

    /* renamed from: a */
    public String m4393a() {
        return this.f3427b.optString("productId");
    }

    /* renamed from: b */
    public String m4394b() {
        return this.f3427b.optString("price");
    }

    /* renamed from: c */
    public String m4395c() {
        return this.f3427b.optString("title");
    }

    /* renamed from: d */
    public String m4396d() {
        return this.f3427b.optString("description");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SkuDetails: ");
        stringBuilder.append(this.f3426a);
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return TextUtils.equals(this.f3426a, ((C1029j) obj).f3426a);
            }
        }
        return null;
    }

    public int hashCode() {
        return this.f3426a.hashCode();
    }
}
