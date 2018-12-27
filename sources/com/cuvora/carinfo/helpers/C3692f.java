package com.cuvora.carinfo.helpers;

import okhttp3.C2983t;
import okhttp3.C2983t.C2982a;
import okhttp3.C2984u;
import okhttp3.C2990y;
import okhttp3.C2991z;
import okhttp3.aa;
import okio.C4393d;
import okio.C4755c;
import okio.C4905m;
import okio.C4913j;

/* renamed from: com.cuvora.carinfo.helpers.f */
class C3692f implements C2983t {
    C3692f() {
    }

    /* renamed from: a */
    public aa mo910a(C2982a c2982a) {
        C2990y a = c2982a.mo3619a();
        if (a.m14627d() != null) {
            if (a.m14622a("Content-Encoding") == null) {
                return c2982a.mo3618a(a.m14628e().m14609a("Content-Encoding", "gzip").m14610a(a.m14624b(), m18518a(m18519b(a.m14627d()))).m14620c());
            }
        }
        return c2982a.mo3618a(a);
    }

    /* renamed from: a */
    private C2991z m18518a(final C2991z c2991z) {
        final Object c4755c = new C4755c();
        c2991z.mo912a(c4755c);
        return new C2991z(this) {
            /* renamed from: c */
            final /* synthetic */ C3692f f14916c;

            /* renamed from: a */
            public C2984u mo911a() {
                return c2991z.mo911a();
            }

            /* renamed from: b */
            public long mo913b() {
                return c4755c.m27502b();
            }

            /* renamed from: a */
            public void mo912a(C4393d c4393d) {
                c4393d.mo4551b(c4755c.m27550v());
            }
        };
    }

    /* renamed from: b */
    private C2991z m18519b(final C2991z c2991z) {
        return new C2991z(this) {
            /* renamed from: b */
            final /* synthetic */ C3692f f14918b;

            /* renamed from: b */
            public long mo913b() {
                return -1;
            }

            /* renamed from: a */
            public C2984u mo911a() {
                return c2991z.mo911a();
            }

            /* renamed from: a */
            public void mo912a(C4393d c4393d) {
                c4393d = C4905m.a(new C4913j(c4393d));
                c2991z.mo912a(c4393d);
                c4393d.close();
            }
        };
    }
}
