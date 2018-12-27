package okhttp3.internal.p155a;

import java.util.concurrent.TimeUnit;
import okhttp3.C2981s;
import okhttp3.C2981s.C2980a;
import okhttp3.C2983t;
import okhttp3.aa;
import okhttp3.internal.C2920a;
import okhttp3.internal.C2933c;
import okhttp3.internal.p156b.C4346h;
import okio.C2994r;
import okio.C2995s;
import okio.C2996t;
import okio.C4393d;
import okio.C4394e;
import okio.C4755c;
import okio.C4905m;

/* renamed from: okhttp3.internal.a.a */
public final class C4342a implements C2983t {
    /* renamed from: a */
    final C2919f f18094a;

    public C4342a(C2919f c2919f) {
        this.f18094a = c2919f;
    }

    /* renamed from: a */
    public okhttp3.aa mo910a(okhttp3.C2983t.C2982a r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r5.f18094a;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r5.f18094a;
        r1 = r6.mo3619a();
        r0 = r0.mo3607a(r1);
        goto L_0x0010;
    L_0x000f:
        r0 = 0;
    L_0x0010:
        r1 = java.lang.System.currentTimeMillis();
        r3 = new okhttp3.internal.a.c$a;
        r4 = r6.mo3619a();
        r3.<init>(r1, r4, r0);
        r1 = r3.m14095a();
        r2 = r1.f12299a;
        r3 = r1.f12300b;
        r4 = r5.f18094a;
        if (r4 == 0) goto L_0x002e;
    L_0x0029:
        r4 = r5.f18094a;
        r4.mo3611a(r1);
    L_0x002e:
        if (r0 == 0) goto L_0x0039;
    L_0x0030:
        if (r3 != 0) goto L_0x0039;
    L_0x0032:
        r1 = r0.m14017h();
        okhttp3.internal.C2933c.m14194a(r1);
    L_0x0039:
        if (r2 != 0) goto L_0x0075;
    L_0x003b:
        if (r3 != 0) goto L_0x0075;
    L_0x003d:
        r0 = new okhttp3.aa$a;
        r0.<init>();
        r6 = r6.mo3619a();
        r6 = r0.m14003a(r6);
        r0 = okhttp3.Protocol.HTTP_1_1;
        r6 = r6.m13998a(r0);
        r0 = 504; // 0x1f8 float:7.06E-43 double:2.49E-321;
        r6 = r6.m13994a(r0);
        r0 = "Unsatisfiable Request (only-if-cached)";
        r6 = r6.m13996a(r0);
        r0 = okhttp3.internal.C2933c.f12354c;
        r6 = r6.m14000a(r0);
        r0 = -1;
        r6 = r6.m13995a(r0);
        r0 = java.lang.System.currentTimeMillis();
        r6 = r6.m14005b(r0);
        r6 = r6.m14004a();
        return r6;
    L_0x0075:
        if (r2 != 0) goto L_0x0088;
    L_0x0077:
        r6 = r3.m14018i();
        r0 = okhttp3.internal.p155a.C4342a.m23742a(r3);
        r6 = r6.m14006b(r0);
        r6 = r6.m14004a();
        return r6;
    L_0x0088:
        r6 = r6.mo3618a(r2);	 Catch:{ all -> 0x0135 }
        if (r6 != 0) goto L_0x0097;
    L_0x008e:
        if (r0 == 0) goto L_0x0097;
    L_0x0090:
        r0 = r0.m14017h();
        okhttp3.internal.C2933c.m14194a(r0);
    L_0x0097:
        if (r3 == 0) goto L_0x00f2;
    L_0x0099:
        r0 = r6.m14012c();
        r1 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r0 != r1) goto L_0x00eb;
    L_0x00a1:
        r0 = r3.m14018i();
        r1 = r3.m14016g();
        r2 = r6.m14016g();
        r1 = okhttp3.internal.p155a.C4342a.m23744a(r1, r2);
        r0 = r0.m14002a(r1);
        r1 = r6.m14023n();
        r0 = r0.m13995a(r1);
        r1 = r6.m14024o();
        r0 = r0.m14005b(r1);
        r1 = okhttp3.internal.p155a.C4342a.m23742a(r3);
        r0 = r0.m14006b(r1);
        r1 = okhttp3.internal.p155a.C4342a.m23742a(r6);
        r0 = r0.m13999a(r1);
        r0 = r0.m14004a();
        r6 = r6.m14017h();
        r6.close();
        r6 = r5.f18094a;
        r6.mo3609a();
        r6 = r5.f18094a;
        r6.mo3610a(r3, r0);
        return r0;
    L_0x00eb:
        r0 = r3.m14017h();
        okhttp3.internal.C2933c.m14194a(r0);
    L_0x00f2:
        r0 = r6.m14018i();
        r1 = okhttp3.internal.p155a.C4342a.m23742a(r3);
        r0 = r0.m14006b(r1);
        r6 = okhttp3.internal.p155a.C4342a.m23742a(r6);
        r6 = r0.m13999a(r6);
        r6 = r6.m14004a();
        r0 = r5.f18094a;
        if (r0 == 0) goto L_0x0134;
    L_0x010e:
        r0 = okhttp3.internal.p156b.C2924e.m14165d(r6);
        if (r0 == 0) goto L_0x0125;
    L_0x0114:
        r0 = okhttp3.internal.p155a.C2913c.m14096a(r6, r2);
        if (r0 == 0) goto L_0x0125;
    L_0x011a:
        r0 = r5.f18094a;
        r0 = r0.mo3608a(r6);
        r6 = r5.m23743a(r0, r6);
        return r6;
    L_0x0125:
        r0 = r2.m14624b();
        r0 = okhttp3.internal.p156b.C2925f.m14167a(r0);
        if (r0 == 0) goto L_0x0134;
    L_0x012f:
        r0 = r5.f18094a;	 Catch:{ IOException -> 0x0134 }
        r0.mo3612b(r2);	 Catch:{ IOException -> 0x0134 }
    L_0x0134:
        return r6;
    L_0x0135:
        r6 = move-exception;
        if (r0 == 0) goto L_0x013f;
    L_0x0138:
        r0 = r0.m14017h();
        okhttp3.internal.C2933c.m14194a(r0);
    L_0x013f:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.a.a(okhttp3.t$a):okhttp3.aa");
    }

    /* renamed from: a */
    private static aa m23742a(aa aaVar) {
        return (aaVar == null || aaVar.m14017h() == null) ? aaVar : aaVar.m14018i().m14000a(null).m14004a();
    }

    /* renamed from: a */
    private aa m23743a(final C2911b c2911b, aa aaVar) {
        if (c2911b == null) {
            return aaVar;
        }
        C2994r b = c2911b.mo3614b();
        if (b == null) {
            return aaVar;
        }
        final C4394e c = aaVar.m14017h().mo916c();
        final C4393d a = C4905m.a(b);
        C2995s c43411 = new C2995s(this) {
            /* renamed from: a */
            boolean f18089a;
            /* renamed from: e */
            final /* synthetic */ C4342a f18093e;

            /* renamed from: a */
            public long mo3615a(C4755c c4755c, long j) {
                try {
                    j = c.mo3615a(c4755c, j);
                    if (j == -1) {
                        if (this.f18089a == null) {
                            this.f18089a = true;
                            a.close();
                        }
                        return -1;
                    }
                    c4755c.m27496a(a.mo4553c(), c4755c.m27502b() - j, j);
                    a.mo4578w();
                    return j;
                } catch (C4755c c4755c2) {
                    if (this.f18089a == null) {
                        this.f18089a = true;
                        c2911b.mo3613a();
                    }
                    throw c4755c2;
                }
            }

            /* renamed from: a */
            public C2996t mo3616a() {
                return c.mo3616a();
            }

            public void close() {
                if (!(this.f18089a || C2933c.m14199a((C2995s) this, 100, TimeUnit.MILLISECONDS))) {
                    this.f18089a = true;
                    c2911b.mo3613a();
                }
                c.close();
            }
        };
        return aaVar.m14018i().m14000a(new C4346h(aaVar.m14008a("Content-Type"), aaVar.m14017h().mo915b(), C4905m.a(c43411))).m14004a();
    }

    /* renamed from: a */
    private static C2981s m23744a(C2981s c2981s, C2981s c2981s2) {
        C2980a c2980a = new C2980a();
        int a = c2981s.m14546a();
        for (int i = 0; i < a; i++) {
            String a2 = c2981s.m14547a(i);
            String b = c2981s.m14549b(i);
            if (!"Warning".equalsIgnoreCase(a2) || !b.startsWith("1")) {
                if (C4342a.m23746b(a2) || !C4342a.m23745a(a2) || c2981s2.m14548a(a2) == null) {
                    C2920a.f12341a.mo3685a(c2980a, a2, b);
                }
            }
        }
        c2981s = c2981s2.m14546a();
        for (int i2 = 0; i2 < c2981s; i2++) {
            String a3 = c2981s2.m14547a(i2);
            if (!C4342a.m23746b(a3) && C4342a.m23745a(a3)) {
                C2920a.f12341a.mo3685a(c2980a, a3, c2981s2.m14549b(i2));
            }
        }
        return c2980a.m14539a();
    }

    /* renamed from: a */
    static boolean m23745a(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str) != null) ? null : true;
    }

    /* renamed from: b */
    static boolean m23746b(String str) {
        if (!("Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str))) {
            if ("Content-Type".equalsIgnoreCase(str) == null) {
                return null;
            }
        }
        return true;
    }
}
