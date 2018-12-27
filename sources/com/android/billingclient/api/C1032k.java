package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.billingclient.api.k */
public class C1032k {
    /* renamed from: a */
    private String f3430a;
    /* renamed from: b */
    private List<String> f3431b;

    /* renamed from: com.android.billingclient.api.k$a */
    public static class C1031a {
        /* renamed from: a */
        private String f3428a;
        /* renamed from: b */
        private List<String> f3429b;

        private C1031a() {
        }

        /* renamed from: a */
        public C1031a m4398a(List<String> list) {
            this.f3429b = list;
            return this;
        }

        /* renamed from: a */
        public C1031a m4397a(String str) {
            this.f3428a = str;
            return this;
        }

        /* renamed from: a */
        public C1032k m4399a() {
            C1032k c1032k = new C1032k();
            c1032k.f3430a = this.f3428a;
            c1032k.f3431b = new ArrayList(this.f3429b);
            return c1032k;
        }
    }

    /* renamed from: a */
    public String m4403a() {
        return this.f3430a;
    }

    /* renamed from: b */
    public List<String> m4404b() {
        return this.f3431b;
    }

    /* renamed from: c */
    public static C1031a m4402c() {
        return new C1031a();
    }
}
