package okhttp3;

import java.io.Closeable;
import javax.annotation.Nullable;
import okhttp3.C2981s.C2980a;

public final class aa implements Closeable {
    /* renamed from: a */
    final C2990y f12163a;
    /* renamed from: b */
    final Protocol f12164b;
    /* renamed from: c */
    final int f12165c;
    /* renamed from: d */
    final String f12166d;
    @Nullable
    /* renamed from: e */
    final C2979r f12167e;
    /* renamed from: f */
    final C2981s f12168f;
    @Nullable
    /* renamed from: g */
    final ab f12169g;
    @Nullable
    /* renamed from: h */
    final aa f12170h;
    @Nullable
    /* renamed from: i */
    final aa f12171i;
    @Nullable
    /* renamed from: j */
    final aa f12172j;
    /* renamed from: k */
    final long f12173k;
    /* renamed from: l */
    final long f12174l;
    /* renamed from: m */
    private volatile C2902d f12175m;

    /* renamed from: okhttp3.aa$a */
    public static class C2896a {
        /* renamed from: a */
        C2990y f12151a;
        /* renamed from: b */
        Protocol f12152b;
        /* renamed from: c */
        int f12153c;
        /* renamed from: d */
        String f12154d;
        @Nullable
        /* renamed from: e */
        C2979r f12155e;
        /* renamed from: f */
        C2980a f12156f;
        /* renamed from: g */
        ab f12157g;
        /* renamed from: h */
        aa f12158h;
        /* renamed from: i */
        aa f12159i;
        /* renamed from: j */
        aa f12160j;
        /* renamed from: k */
        long f12161k;
        /* renamed from: l */
        long f12162l;

        public C2896a() {
            this.f12153c = -1;
            this.f12156f = new C2980a();
        }

        C2896a(aa aaVar) {
            this.f12153c = -1;
            this.f12151a = aaVar.f12163a;
            this.f12152b = aaVar.f12164b;
            this.f12153c = aaVar.f12165c;
            this.f12154d = aaVar.f12166d;
            this.f12155e = aaVar.f12167e;
            this.f12156f = aaVar.f12168f.m14552c();
            this.f12157g = aaVar.f12169g;
            this.f12158h = aaVar.f12170h;
            this.f12159i = aaVar.f12171i;
            this.f12160j = aaVar.f12172j;
            this.f12161k = aaVar.f12173k;
            this.f12162l = aaVar.f12174l;
        }

        /* renamed from: a */
        public C2896a m14003a(C2990y c2990y) {
            this.f12151a = c2990y;
            return this;
        }

        /* renamed from: a */
        public C2896a m13998a(Protocol protocol) {
            this.f12152b = protocol;
            return this;
        }

        /* renamed from: a */
        public C2896a m13994a(int i) {
            this.f12153c = i;
            return this;
        }

        /* renamed from: a */
        public C2896a m13996a(String str) {
            this.f12154d = str;
            return this;
        }

        /* renamed from: a */
        public C2896a m14001a(@Nullable C2979r c2979r) {
            this.f12155e = c2979r;
            return this;
        }

        /* renamed from: a */
        public C2896a m13997a(String str, String str2) {
            this.f12156f.m14538a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C2896a m14002a(C2981s c2981s) {
            this.f12156f = c2981s.m14552c();
            return this;
        }

        /* renamed from: a */
        public C2896a m14000a(@Nullable ab abVar) {
            this.f12157g = abVar;
            return this;
        }

        /* renamed from: a */
        public C2896a m13999a(@Nullable aa aaVar) {
            if (aaVar != null) {
                m13992a("networkResponse", aaVar);
            }
            this.f12158h = aaVar;
            return this;
        }

        /* renamed from: b */
        public C2896a m14006b(@Nullable aa aaVar) {
            if (aaVar != null) {
                m13992a("cacheResponse", aaVar);
            }
            this.f12159i = aaVar;
            return this;
        }

        /* renamed from: a */
        private void m13992a(String str, aa aaVar) {
            StringBuilder stringBuilder;
            if (aaVar.f12169g != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".body != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (aaVar.f12170h != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".networkResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (aaVar.f12171i != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".cacheResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (aaVar.f12172j != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".priorResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        /* renamed from: c */
        public C2896a m14007c(@Nullable aa aaVar) {
            if (aaVar != null) {
                m13993d(aaVar);
            }
            this.f12160j = aaVar;
            return this;
        }

        /* renamed from: d */
        private void m13993d(aa aaVar) {
            if (aaVar.f12169g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: a */
        public C2896a m13995a(long j) {
            this.f12161k = j;
            return this;
        }

        /* renamed from: b */
        public C2896a m14005b(long j) {
            this.f12162l = j;
            return this;
        }

        /* renamed from: a */
        public aa m14004a() {
            if (this.f12151a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f12152b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f12153c < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("code < 0: ");
                stringBuilder.append(this.f12153c);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f12154d != null) {
                return new aa(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    aa(C2896a c2896a) {
        this.f12163a = c2896a.f12151a;
        this.f12164b = c2896a.f12152b;
        this.f12165c = c2896a.f12153c;
        this.f12166d = c2896a.f12154d;
        this.f12167e = c2896a.f12155e;
        this.f12168f = c2896a.f12156f.m14539a();
        this.f12169g = c2896a.f12157g;
        this.f12170h = c2896a.f12158h;
        this.f12171i = c2896a.f12159i;
        this.f12172j = c2896a.f12160j;
        this.f12173k = c2896a.f12161k;
        this.f12174l = c2896a.f12162l;
    }

    /* renamed from: a */
    public C2990y m14010a() {
        return this.f12163a;
    }

    /* renamed from: b */
    public Protocol m14011b() {
        return this.f12164b;
    }

    /* renamed from: c */
    public int m14012c() {
        return this.f12165c;
    }

    /* renamed from: d */
    public boolean m14013d() {
        return this.f12165c >= 200 && this.f12165c < 300;
    }

    /* renamed from: e */
    public String m14014e() {
        return this.f12166d;
    }

    /* renamed from: f */
    public C2979r m14015f() {
        return this.f12167e;
    }

    @Nullable
    /* renamed from: a */
    public String m14008a(String str) {
        return m14009a(str, null);
    }

    @Nullable
    /* renamed from: a */
    public String m14009a(String str, @Nullable String str2) {
        str = this.f12168f.m14548a(str);
        return str != null ? str : str2;
    }

    /* renamed from: g */
    public C2981s m14016g() {
        return this.f12168f;
    }

    @Nullable
    /* renamed from: h */
    public ab m14017h() {
        return this.f12169g;
    }

    /* renamed from: i */
    public C2896a m14018i() {
        return new C2896a(this);
    }

    @Nullable
    /* renamed from: j */
    public aa m14019j() {
        return this.f12170h;
    }

    @Nullable
    /* renamed from: k */
    public aa m14020k() {
        return this.f12171i;
    }

    @Nullable
    /* renamed from: l */
    public aa m14021l() {
        return this.f12172j;
    }

    /* renamed from: m */
    public C2902d m14022m() {
        C2902d c2902d = this.f12175m;
        if (c2902d != null) {
            return c2902d;
        }
        c2902d = C2902d.m14058a(this.f12168f);
        this.f12175m = c2902d;
        return c2902d;
    }

    /* renamed from: n */
    public long m14023n() {
        return this.f12173k;
    }

    /* renamed from: o */
    public long m14024o() {
        return this.f12174l;
    }

    public void close() {
        if (this.f12169g != null) {
            this.f12169g.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response{protocol=");
        stringBuilder.append(this.f12164b);
        stringBuilder.append(", code=");
        stringBuilder.append(this.f12165c);
        stringBuilder.append(", message=");
        stringBuilder.append(this.f12166d);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f12163a.m14623a());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
