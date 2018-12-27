package okhttp3.internal.p156b;

import java.util.List;
import okhttp3.C2903e;
import okhttp3.C2910i;
import okhttp3.C2977p;
import okhttp3.C2983t;
import okhttp3.C2983t.C2982a;
import okhttp3.C2990y;
import okhttp3.aa;
import okhttp3.internal.connection.C2939f;
import okhttp3.internal.connection.C4353c;

/* renamed from: okhttp3.internal.b.g */
public final class C4345g implements C2982a {
    /* renamed from: a */
    private final List<C2983t> f18097a;
    /* renamed from: b */
    private final C2939f f18098b;
    /* renamed from: c */
    private final C2921c f18099c;
    /* renamed from: d */
    private final C4353c f18100d;
    /* renamed from: e */
    private final int f18101e;
    /* renamed from: f */
    private final C2990y f18102f;
    /* renamed from: g */
    private final C2903e f18103g;
    /* renamed from: h */
    private final C2977p f18104h;
    /* renamed from: i */
    private final int f18105i;
    /* renamed from: j */
    private final int f18106j;
    /* renamed from: k */
    private final int f18107k;
    /* renamed from: l */
    private int f18108l;

    public C4345g(List<C2983t> list, C2939f c2939f, C2921c c2921c, C4353c c4353c, int i, C2990y c2990y, C2903e c2903e, C2977p c2977p, int i2, int i3, int i4) {
        this.f18097a = list;
        this.f18100d = c4353c;
        this.f18098b = c2939f;
        this.f18099c = c2921c;
        this.f18101e = i;
        this.f18102f = c2990y;
        this.f18103g = c2903e;
        this.f18104h = c2977p;
        this.f18105i = i2;
        this.f18106j = i3;
        this.f18107k = i4;
    }

    /* renamed from: b */
    public C2910i mo3620b() {
        return this.f18100d;
    }

    /* renamed from: c */
    public int mo3621c() {
        return this.f18105i;
    }

    /* renamed from: d */
    public int mo3622d() {
        return this.f18106j;
    }

    /* renamed from: e */
    public int mo3623e() {
        return this.f18107k;
    }

    /* renamed from: f */
    public C2939f m23758f() {
        return this.f18098b;
    }

    /* renamed from: g */
    public C2921c m23759g() {
        return this.f18099c;
    }

    /* renamed from: h */
    public C2903e m23760h() {
        return this.f18103g;
    }

    /* renamed from: i */
    public C2977p m23761i() {
        return this.f18104h;
    }

    /* renamed from: a */
    public C2990y mo3619a() {
        return this.f18102f;
    }

    /* renamed from: a */
    public aa mo3618a(C2990y c2990y) {
        return m23752a(c2990y, this.f18098b, this.f18099c, this.f18100d);
    }

    /* renamed from: a */
    public aa m23752a(C2990y c2990y, C2939f c2939f, C2921c c2921c, C4353c c4353c) {
        if (this.f18101e < this.f18097a.size()) {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            r0.f18108l++;
            if (r0.f18099c != null) {
                if (!r0.f18100d.m23809a(c2990y.m14623a())) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("network interceptor ");
                    stringBuilder.append(r0.f18097a.get(r0.f18101e - 1));
                    stringBuilder.append(" must retain the same host and port");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            if (r0.f18099c != null) {
                if (r0.f18108l > 1) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("network interceptor ");
                    stringBuilder.append(r0.f18097a.get(r0.f18101e - 1));
                    stringBuilder.append(" must call proceed() exactly once");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            C4345g c4345g = new C4345g(r0.f18097a, c2939f, c2921c, c4353c, r0.f18101e + 1, c2990y, r0.f18103g, r0.f18104h, r0.f18105i, r0.f18106j, r0.f18107k);
            C2983t c2983t = (C2983t) r0.f18097a.get(r0.f18101e);
            aa a = c2983t.mo910a(c4345g);
            if (c2921c != null && r0.f18101e + 1 < r0.f18097a.size()) {
                if (c4345g.f18108l != 1) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("network interceptor ");
                    stringBuilder2.append(c2983t);
                    stringBuilder2.append(" must call proceed() exactly once");
                    throw new IllegalStateException(stringBuilder2.toString());
                }
            }
            if (a == null) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("interceptor ");
                stringBuilder2.append(c2983t);
                stringBuilder2.append(" returned null");
                throw new NullPointerException(stringBuilder2.toString());
            } else if (a.m14017h() != null) {
                return a;
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("interceptor ");
                stringBuilder2.append(c2983t);
                stringBuilder2.append(" returned a response with no body");
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        throw new AssertionError();
    }
}
