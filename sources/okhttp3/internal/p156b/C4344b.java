package okhttp3.internal.p156b;

import java.net.ProtocolException;
import okhttp3.C2983t;
import okhttp3.C2983t.C2982a;
import okhttp3.C2990y;
import okhttp3.aa;
import okhttp3.aa.C2896a;
import okhttp3.internal.C2933c;
import okhttp3.internal.connection.C2939f;
import okhttp3.internal.connection.C4353c;
import okio.C2994r;
import okio.C4393d;
import okio.C4755c;
import okio.C4905m;
import okio.C4910g;

/* renamed from: okhttp3.internal.b.b */
public final class C4344b implements C2983t {
    /* renamed from: a */
    private final boolean f18096a;

    /* renamed from: okhttp3.internal.b.b$a */
    static final class C4749a extends C4910g {
        /* renamed from: a */
        long f20798a;

        C4749a(C2994r c2994r) {
            super(c2994r);
        }

        public void a_(C4755c c4755c, long j) {
            super.a_(c4755c, j);
            this.f20798a += j;
        }
    }

    public C4344b(boolean z) {
        this.f18096a = z;
    }

    /* renamed from: a */
    public aa mo910a(C2982a c2982a) {
        C4345g c4345g = (C4345g) c2982a;
        C2921c g = c4345g.m23759g();
        C2939f f = c4345g.m23758f();
        C4353c c4353c = (C4353c) c4345g.mo3620b();
        C2990y a = c4345g.mo3619a();
        long currentTimeMillis = System.currentTimeMillis();
        c4345g.m23761i().m14522c(c4345g.m23760h());
        g.mo3632a(a);
        c4345g.m23761i().m14518a(c4345g.m23760h(), a);
        C2896a c2896a = null;
        if (C2925f.m14169c(a.m14624b()) && a.m14627d() != null) {
            if ("100-continue".equalsIgnoreCase(a.m14622a("Expect"))) {
                g.mo3631a();
                c4345g.m23761i().m14524e(c4345g.m23760h());
                c2896a = g.mo3628a(true);
            }
            if (c2896a == null) {
                c4345g.m23761i().m14523d(c4345g.m23760h());
                Object c4749a = new C4749a(g.mo3630a(a, a.m14627d().mo913b()));
                C4393d a2 = C4905m.a(c4749a);
                a.m14627d().mo912a(a2);
                a2.close();
                c4345g.m23761i().m14508a(c4345g.m23760h(), c4749a.f20798a);
            } else if (!c4353c.m23816f()) {
                f.m14245e();
            }
        }
        g.mo3633b();
        if (c2896a == null) {
            c4345g.m23761i().m14524e(c4345g.m23760h());
            c2896a = g.mo3628a(false);
        }
        aa a3 = c2896a.m14003a(a).m14001a(f.m14243c().m23815e()).m13995a(currentTimeMillis).m14005b(System.currentTimeMillis()).m14004a();
        int c = a3.m14012c();
        if (c == 100) {
            a3 = g.mo3628a(false).m14003a(a).m14001a(f.m14243c().m23815e()).m13995a(currentTimeMillis).m14005b(System.currentTimeMillis()).m14004a();
            c = a3.m14012c();
        }
        c4345g.m23761i().m14515a(c4345g.m23760h(), a3);
        if (this.f18096a == null || c != 101) {
            c2982a = a3.m14018i().m14000a(g.mo3629a(a3)).m14004a();
        } else {
            c2982a = a3.m14018i().m14000a(C2933c.f12354c).m14004a();
        }
        if ("close".equalsIgnoreCase(c2982a.m14010a().m14622a("Connection")) || "close".equalsIgnoreCase(c2982a.m14008a("Connection"))) {
            f.m14245e();
        }
        if ((c != 204 && c != 205) || c2982a.m14017h().mo915b() <= 0) {
            return c2982a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HTTP ");
        stringBuilder.append(c);
        stringBuilder.append(" had non-zero Content-Length: ");
        stringBuilder.append(c2982a.m14017h().mo915b());
        throw new ProtocolException(stringBuilder.toString());
    }
}
