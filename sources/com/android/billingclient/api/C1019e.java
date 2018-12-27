package com.android.billingclient.api;

import java.util.ArrayList;

/* renamed from: com.android.billingclient.api.e */
public class C1019e {
    /* renamed from: a */
    private String f3400a;
    /* renamed from: b */
    private String f3401b;
    /* renamed from: c */
    private String f3402c;
    /* renamed from: d */
    private String f3403d;
    /* renamed from: e */
    private boolean f3404e;
    /* renamed from: f */
    private int f3405f = 0;

    /* renamed from: com.android.billingclient.api.e$a */
    public static class C1018a {
        /* renamed from: a */
        private String f3394a;
        /* renamed from: b */
        private String f3395b;
        /* renamed from: c */
        private String f3396c;
        /* renamed from: d */
        private String f3397d;
        /* renamed from: e */
        private boolean f3398e;
        /* renamed from: f */
        private int f3399f;

        private C1018a() {
            this.f3399f = 0;
        }

        /* renamed from: a */
        public C1018a m4356a(String str) {
            this.f3394a = str;
            return this;
        }

        /* renamed from: b */
        public C1018a m4359b(String str) {
            this.f3395b = str;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C1018a m4357a(ArrayList<String> arrayList) {
            if (arrayList != null && arrayList.size() > 0) {
                this.f3396c = (String) arrayList.get(0);
            }
            return this;
        }

        /* renamed from: a */
        public C1019e m4358a() {
            C1019e c1019e = new C1019e();
            c1019e.f3400a = this.f3394a;
            c1019e.f3401b = this.f3395b;
            c1019e.f3402c = this.f3396c;
            c1019e.f3403d = this.f3397d;
            c1019e.f3404e = this.f3398e;
            c1019e.f3405f = this.f3399f;
            return c1019e;
        }
    }

    /* renamed from: a */
    public String m4367a() {
        return this.f3400a;
    }

    /* renamed from: b */
    public String m4368b() {
        return this.f3401b;
    }

    /* renamed from: c */
    public String m4369c() {
        return this.f3402c;
    }

    /* renamed from: d */
    public String m4370d() {
        return this.f3403d;
    }

    /* renamed from: e */
    public boolean m4371e() {
        return this.f3404e;
    }

    /* renamed from: f */
    public int m4372f() {
        return this.f3405f;
    }

    /* renamed from: g */
    public boolean m4373g() {
        if (!this.f3404e && this.f3403d == null) {
            if (this.f3405f == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static C1018a m4366h() {
        return new C1018a();
    }
}
