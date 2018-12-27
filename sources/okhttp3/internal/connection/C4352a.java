package okhttp3.internal.connection;

import okhttp3.C2983t;
import okhttp3.C2983t.C2982a;
import okhttp3.C2988w;
import okhttp3.C2990y;
import okhttp3.aa;
import okhttp3.internal.p156b.C4345g;

/* renamed from: okhttp3.internal.connection.a */
public final class C4352a implements C2983t {
    /* renamed from: a */
    public final C2988w f18134a;

    public C4352a(C2988w c2988w) {
        this.f18134a = c2988w;
    }

    /* renamed from: a */
    public aa mo910a(C2982a c2982a) {
        C4345g c4345g = (C4345g) c2982a;
        C2990y a = c4345g.mo3619a();
        C2939f f = c4345g.m23758f();
        return c4345g.m23752a(a, f, f.m14238a(this.f18134a, c2982a, a.m14624b().equals("GET") ^ 1), f.m14243c());
    }
}
