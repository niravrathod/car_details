package okhttp3.internal.p156b;

import java.util.List;
import okhttp3.C2971l;
import okhttp3.C2973m;
import okhttp3.C2983t;
import okhttp3.C2983t.C2982a;
import okhttp3.C2984u;
import okhttp3.C2990y;
import okhttp3.C2990y.C2989a;
import okhttp3.C2991z;
import okhttp3.aa;
import okhttp3.aa.C2896a;
import okhttp3.internal.C2933c;
import okhttp3.internal.C2941d;
import okio.C2995s;
import okio.C4905m;
import okio.C4914k;

/* renamed from: okhttp3.internal.b.a */
public final class C4343a implements C2983t {
    /* renamed from: a */
    private final C2973m f18095a;

    public C4343a(C2973m c2973m) {
        this.f18095a = c2973m;
    }

    /* renamed from: a */
    public aa mo910a(C2982a c2982a) {
        C2990y a = c2982a.mo3619a();
        C2989a e = a.m14628e();
        C2991z d = a.m14627d();
        if (d != null) {
            C2984u a2 = d.mo911a();
            if (a2 != null) {
                e.m14609a("Content-Type", a2.toString());
            }
            long b = d.mo913b();
            if (b != -1) {
                e.m14609a("Content-Length", Long.toString(b));
                e.m14616b("Transfer-Encoding");
            } else {
                e.m14609a("Transfer-Encoding", "chunked");
                e.m14616b("Content-Length");
            }
        }
        boolean z = false;
        if (a.m14622a("Host") == null) {
            e.m14609a("Host", C2933c.m14187a(a.m14623a(), false));
        }
        if (a.m14622a("Connection") == null) {
            e.m14609a("Connection", "Keep-Alive");
        }
        if (a.m14622a("Accept-Encoding") == null && a.m14622a("Range") == null) {
            z = true;
            e.m14609a("Accept-Encoding", "gzip");
        }
        List a3 = this.f18095a.mo3675a(a.m14623a());
        if (!a3.isEmpty()) {
            e.m14609a("Cookie", m23748a(a3));
        }
        if (a.m14622a("User-Agent") == null) {
            e.m14609a("User-Agent", C2941d.m14256a());
        }
        c2982a = c2982a.mo3618a(e.m14620c());
        C2924e.m14158a(this.f18095a, a.m14623a(), c2982a.m14016g());
        C2896a a4 = c2982a.m14018i().m14003a(a);
        if (z && "gzip".equalsIgnoreCase(c2982a.m14008a("Content-Encoding")) && C2924e.m14165d(c2982a)) {
            C2995s c4914k = new C4914k(c2982a.m14017h().mo916c());
            a4.m14002a(c2982a.m14016g().m14552c().m14540b("Content-Encoding").m14540b("Content-Length").m14539a());
            a4.m14000a(new C4346h(c2982a.m14008a("Content-Type"), -1, C4905m.a(c4914k)));
        }
        return a4.m14004a();
    }

    /* renamed from: a */
    private String m23748a(List<C2971l> list) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append("; ");
            }
            C2971l c2971l = (C2971l) list.get(i);
            stringBuilder.append(c2971l.m14482a());
            stringBuilder.append('=');
            stringBuilder.append(c2971l.m14485b());
        }
        return stringBuilder.toString();
    }
}
