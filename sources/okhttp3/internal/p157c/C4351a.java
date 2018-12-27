package okhttp3.internal.p157c;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.C2981s;
import okhttp3.C2981s.C2980a;
import okhttp3.C2988w;
import okhttp3.C2990y;
import okhttp3.HttpUrl;
import okhttp3.aa;
import okhttp3.aa.C2896a;
import okhttp3.ab;
import okhttp3.internal.C2920a;
import okhttp3.internal.C2933c;
import okhttp3.internal.connection.C2939f;
import okhttp3.internal.connection.C4353c;
import okhttp3.internal.p156b.C2921c;
import okhttp3.internal.p156b.C2924e;
import okhttp3.internal.p156b.C2926i;
import okhttp3.internal.p156b.C2927k;
import okhttp3.internal.p156b.C4346h;
import okio.C2994r;
import okio.C2995s;
import okio.C2996t;
import okio.C4393d;
import okio.C4394e;
import okio.C4755c;
import okio.C4905m;
import okio.C4912i;

/* renamed from: okhttp3.internal.c.a */
public final class C4351a implements C2921c {
    /* renamed from: a */
    final C2988w f18128a;
    /* renamed from: b */
    final C2939f f18129b;
    /* renamed from: c */
    final C4394e f18130c;
    /* renamed from: d */
    final C4393d f18131d;
    /* renamed from: e */
    int f18132e = 0;
    /* renamed from: f */
    private long f18133f = 262144;

    /* renamed from: okhttp3.internal.c.a$a */
    private abstract class C4348a implements C2995s {
        /* renamed from: a */
        protected final C4912i f18117a;
        /* renamed from: b */
        protected boolean f18118b;
        /* renamed from: c */
        protected long f18119c;
        /* renamed from: d */
        final /* synthetic */ C4351a f18120d;

        private C4348a(C4351a c4351a) {
            this.f18120d = c4351a;
            this.f18117a = new C4912i(this.f18120d.f18130c.mo3616a());
            this.f18119c = 0;
        }

        /* renamed from: a */
        public C2996t mo3616a() {
            return this.f18117a;
        }

        /* renamed from: a */
        public long mo3615a(C4755c c4755c, long j) {
            try {
                c4755c = this.f18120d.f18130c.mo3615a(c4755c, j);
                if (c4755c > 0) {
                    this.f18119c += c4755c;
                }
                return c4755c;
            } catch (IOException e) {
                m23777a((boolean) 0, e);
                throw e;
            }
        }

        /* renamed from: a */
        protected final void m23777a(boolean z, IOException iOException) {
            if (this.f18120d.f18132e != 6) {
                if (this.f18120d.f18132e == 5) {
                    this.f18120d.m23789a(this.f18117a);
                    this.f18120d.f18132e = 6;
                    if (this.f18120d.f18129b != null) {
                        this.f18120d.f18129b.m14241a(z ^ 1, this.f18120d, this.f18119c, iOException);
                    }
                    return;
                }
                iOException = new StringBuilder();
                iOException.append("state: ");
                iOException.append(this.f18120d.f18132e);
                throw new IllegalStateException(iOException.toString());
            }
        }
    }

    /* renamed from: okhttp3.internal.c.a$b */
    private final class C4349b implements C2994r {
        /* renamed from: a */
        final /* synthetic */ C4351a f18121a;
        /* renamed from: b */
        private final C4912i f18122b = new C4912i(this.f18121a.f18131d.mo3624a());
        /* renamed from: c */
        private boolean f18123c;

        C4349b(C4351a c4351a) {
            this.f18121a = c4351a;
        }

        /* renamed from: a */
        public C2996t mo3624a() {
            return this.f18122b;
        }

        public void a_(C4755c c4755c, long j) {
            if (this.f18123c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                this.f18121a.f18131d.mo4571l(j);
                this.f18121a.f18131d.mo4550b("\r\n");
                this.f18121a.f18131d.a_(c4755c, j);
                this.f18121a.f18131d.mo4550b("\r\n");
            }
        }

        public synchronized void flush() {
            if (!this.f18123c) {
                this.f18121a.f18131d.flush();
            }
        }

        public synchronized void close() {
            if (!this.f18123c) {
                this.f18123c = true;
                this.f18121a.f18131d.mo4550b("0\r\n\r\n");
                this.f18121a.m23789a(this.f18122b);
                this.f18121a.f18132e = 3;
            }
        }
    }

    /* renamed from: okhttp3.internal.c.a$d */
    private final class C4350d implements C2994r {
        /* renamed from: a */
        final /* synthetic */ C4351a f18124a;
        /* renamed from: b */
        private final C4912i f18125b = new C4912i(this.f18124a.f18131d.mo3624a());
        /* renamed from: c */
        private boolean f18126c;
        /* renamed from: d */
        private long f18127d;

        C4350d(C4351a c4351a, long j) {
            this.f18124a = c4351a;
            this.f18127d = j;
        }

        /* renamed from: a */
        public C2996t mo3624a() {
            return this.f18125b;
        }

        public void a_(C4755c c4755c, long j) {
            if (this.f18126c) {
                throw new IllegalStateException("closed");
            }
            C2933c.m14193a(c4755c.m27502b(), 0, j);
            if (j <= this.f18127d) {
                this.f18124a.f18131d.a_(c4755c, j);
                this.f18127d -= j;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected ");
            stringBuilder.append(this.f18127d);
            stringBuilder.append(" bytes but received ");
            stringBuilder.append(j);
            throw new ProtocolException(stringBuilder.toString());
        }

        public void flush() {
            if (!this.f18126c) {
                this.f18124a.f18131d.flush();
            }
        }

        public void close() {
            if (!this.f18126c) {
                this.f18126c = true;
                if (this.f18127d <= 0) {
                    this.f18124a.m23789a(this.f18125b);
                    this.f18124a.f18132e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    /* renamed from: okhttp3.internal.c.a$c */
    private class C4750c extends C4348a {
        /* renamed from: e */
        final /* synthetic */ C4351a f20799e;
        /* renamed from: f */
        private final HttpUrl f20800f;
        /* renamed from: g */
        private long f20801g = -1;
        /* renamed from: h */
        private boolean f20802h = true;

        C4750c(C4351a c4351a, HttpUrl httpUrl) {
            this.f20799e = c4351a;
            super();
            this.f20800f = httpUrl;
        }

        /* renamed from: a */
        public long mo3615a(C4755c c4755c, long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (!this.f20802h) {
                return -1;
            } else {
                if (this.f20801g == 0 || this.f20801g == -1) {
                    m27475b();
                    if (!this.f20802h) {
                        return -1;
                    }
                }
                c4755c = super.mo3615a(c4755c, Math.min(j, this.f20801g));
                if (c4755c != -1) {
                    this.f20801g -= c4755c;
                    return c4755c;
                }
                c4755c = new ProtocolException("unexpected end of stream");
                m23777a((boolean) 0, (IOException) c4755c);
                throw c4755c;
            }
        }

        /* renamed from: b */
        private void m27475b() {
            if (this.f20801g != -1) {
                this.f20799e.f18130c.mo4576q();
            }
            try {
                this.f20801g = this.f20799e.f18130c.mo4574n();
                String trim = this.f20799e.f18130c.mo4576q().trim();
                if (this.f20801g < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("expected chunk size and optional extensions but was \"");
                    stringBuilder.append(this.f20801g);
                    stringBuilder.append(trim);
                    stringBuilder.append("\"");
                    throw new ProtocolException(stringBuilder.toString());
                } else if (this.f20801g == 0) {
                    this.f20802h = false;
                    C2924e.m14158a(this.f20799e.f18128a.m14587g(), this.f20800f, this.f20799e.m23793d());
                    m23777a(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() {
            if (!this.b) {
                if (this.f20802h && !C2933c.m14199a((C2995s) this, 100, TimeUnit.MILLISECONDS)) {
                    m23777a(false, null);
                }
                this.b = true;
            }
        }
    }

    /* renamed from: okhttp3.internal.c.a$e */
    private class C4751e extends C4348a {
        /* renamed from: e */
        final /* synthetic */ C4351a f20803e;
        /* renamed from: f */
        private long f20804f;

        C4751e(C4351a c4351a, long j) {
            this.f20803e = c4351a;
            super();
            this.f20804f = j;
            if (this.f20804f == 0) {
                m23777a(true, null);
            }
        }

        /* renamed from: a */
        public long mo3615a(C4755c c4755c, long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.f20804f == 0) {
                return -1;
            } else {
                c4755c = super.mo3615a(c4755c, Math.min(this.f20804f, j));
                if (c4755c != -1) {
                    this.f20804f -= c4755c;
                    if (this.f20804f == 0) {
                        m23777a(true, null);
                    }
                    return c4755c;
                }
                c4755c = new ProtocolException("unexpected end of stream");
                m23777a((boolean) 0, (IOException) c4755c);
                throw c4755c;
            }
        }

        public void close() {
            if (!this.b) {
                if (!(this.f20804f == 0 || C2933c.m14199a((C2995s) this, 100, TimeUnit.MILLISECONDS))) {
                    m23777a(false, null);
                }
                this.b = true;
            }
        }
    }

    /* renamed from: okhttp3.internal.c.a$f */
    private class C4752f extends C4348a {
        /* renamed from: e */
        final /* synthetic */ C4351a f20805e;
        /* renamed from: f */
        private boolean f20806f;

        C4752f(C4351a c4351a) {
            this.f20805e = c4351a;
            super();
        }

        /* renamed from: a */
        public long mo3615a(C4755c c4755c, long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.f20806f) {
                return -1;
            } else {
                c4755c = super.mo3615a(c4755c, j);
                if (c4755c != -1) {
                    return c4755c;
                }
                this.f20806f = true;
                m23777a(true, (IOException) 0);
                return -1;
            }
        }

        public void close() {
            if (!this.b) {
                if (!this.f20806f) {
                    m23777a(false, null);
                }
                this.b = true;
            }
        }
    }

    public C4351a(C2988w c2988w, C2939f c2939f, C4394e c4394e, C4393d c4393d) {
        this.f18128a = c2988w;
        this.f18129b = c2939f;
        this.f18130c = c4394e;
        this.f18131d = c4393d;
    }

    /* renamed from: a */
    public C2994r mo3630a(C2990y c2990y, long j) {
        if ("chunked".equalsIgnoreCase(c2990y.m14622a("Transfer-Encoding")) != null) {
            return m23794e();
        }
        if (j != -1) {
            return m23783a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* renamed from: c */
    public void mo3634c() {
        C4353c c = this.f18129b.m14243c();
        if (c != null) {
            c.m23813c();
        }
    }

    /* renamed from: a */
    public void mo3632a(C2990y c2990y) {
        m23787a(c2990y.m14626c(), C2926i.m14173a(c2990y, this.f18129b.m14243c().m23812b().m14035b().type()));
    }

    /* renamed from: a */
    public ab mo3629a(aa aaVar) {
        this.f18129b.f12390c.m14525f(this.f18129b.f12389b);
        String a = aaVar.m14008a("Content-Type");
        if (!C2924e.m14165d(aaVar)) {
            return new C4346h(a, 0, C4905m.a(m23790b(0)));
        }
        if ("chunked".equalsIgnoreCase(aaVar.m14008a("Transfer-Encoding"))) {
            return new C4346h(a, -1, C4905m.a(m23785a(aaVar.m14010a().m14623a())));
        }
        long a2 = C2924e.m14155a(aaVar);
        if (a2 != -1) {
            return new C4346h(a, a2, C4905m.a(m23790b(a2)));
        }
        return new C4346h(a, -1, C4905m.a(m23795f()));
    }

    /* renamed from: a */
    public void mo3631a() {
        this.f18131d.flush();
    }

    /* renamed from: b */
    public void mo3633b() {
        this.f18131d.flush();
    }

    /* renamed from: a */
    public void m23787a(C2981s c2981s, String str) {
        if (this.f18132e == 0) {
            this.f18131d.mo4550b(str).mo4550b("\r\n");
            int a = c2981s.m14546a();
            for (int i = null; i < a; i++) {
                this.f18131d.mo4550b(c2981s.m14547a(i)).mo4550b(": ").mo4550b(c2981s.m14549b(i)).mo4550b("\r\n");
            }
            this.f18131d.mo4550b("\r\n");
            this.f18132e = 1;
            return;
        }
        str = new StringBuilder();
        str.append("state: ");
        str.append(this.f18132e);
        throw new IllegalStateException(str.toString());
    }

    /* renamed from: a */
    public C2896a mo3628a(boolean z) {
        if (this.f18132e != 1) {
            if (this.f18132e != 3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("state: ");
                stringBuilder.append(this.f18132e);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        try {
            C2927k a = C2927k.m14175a(m23780g());
            C2896a a2 = new C2896a().m13998a(a.f12346a).m13994a(a.f12347b).m13996a(a.f12348c).m14002a(m23793d());
            if (z && a.f12347b) {
                return false;
            }
            if (a.f12347b) {
                this.f18132e = 3;
                return a2;
            }
            this.f18132e = true;
            return a2;
        } catch (boolean z2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("unexpected end of stream on ");
            stringBuilder2.append(this.f18129b);
            IOException iOException = new IOException(stringBuilder2.toString());
            iOException.initCause(z2);
            throw iOException;
        }
    }

    /* renamed from: g */
    private String m23780g() {
        String f = this.f18130c.mo4559f(this.f18133f);
        this.f18133f -= (long) f.length();
        return f;
    }

    /* renamed from: d */
    public C2981s m23793d() {
        C2980a c2980a = new C2980a();
        while (true) {
            String g = m23780g();
            if (g.length() == 0) {
                return c2980a.m14539a();
            }
            C2920a.f12341a.mo3684a(c2980a, g);
        }
    }

    /* renamed from: e */
    public C2994r m23794e() {
        if (this.f18132e == 1) {
            this.f18132e = 2;
            return new C4349b(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.f18132e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public C2994r m23783a(long j) {
        if (this.f18132e == 1) {
            this.f18132e = 2;
            return new C4350d(this, j);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.f18132e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: b */
    public C2995s m23790b(long j) {
        if (this.f18132e == 4) {
            this.f18132e = 5;
            return new C4751e(this, j);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.f18132e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public C2995s m23785a(HttpUrl httpUrl) {
        if (this.f18132e == 4) {
            this.f18132e = 5;
            return new C4750c(this, httpUrl);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.f18132e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: f */
    public C2995s m23795f() {
        if (this.f18132e != 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f18132e);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.f18129b != null) {
            this.f18132e = 5;
            this.f18129b.m14245e();
            return new C4752f(this);
        } else {
            throw new IllegalStateException("streamAllocation == null");
        }
    }

    /* renamed from: a */
    void m23789a(C4912i c4912i) {
        C2996t a = c4912i.a();
        c4912i.a(C2996t.f12693c);
        a.m14676f();
        a.B_();
    }
}
