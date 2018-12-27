package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C2977p.C2976a;
import okhttp3.C2981s.C2980a;
import okhttp3.aa.C2896a;
import okhttp3.internal.C2920a;
import okhttp3.internal.C2933c;
import okhttp3.internal.connection.C2935d;
import okhttp3.internal.connection.C2939f;
import okhttp3.internal.connection.C4353c;
import okhttp3.internal.p155a.C2919f;
import okhttp3.internal.p159e.C2945f;
import okhttp3.internal.p161g.C2947c;
import okhttp3.internal.p161g.C2948d;

/* renamed from: okhttp3.w */
public class C2988w implements Cloneable {
    /* renamed from: a */
    static final List<Protocol> f12640a = C2933c.m14191a(Protocol.HTTP_2, Protocol.HTTP_1_1);
    /* renamed from: b */
    static final List<C2969k> f12641b = C2933c.m14191a(C2969k.f12547a, C2969k.f12549c);
    /* renamed from: A */
    final int f12642A;
    /* renamed from: B */
    final int f12643B;
    /* renamed from: C */
    final int f12644C;
    /* renamed from: c */
    final C2974n f12645c;
    @Nullable
    /* renamed from: d */
    final Proxy f12646d;
    /* renamed from: e */
    final List<Protocol> f12647e;
    /* renamed from: f */
    final List<C2969k> f12648f;
    /* renamed from: g */
    final List<C2983t> f12649g;
    /* renamed from: h */
    final List<C2983t> f12650h;
    /* renamed from: i */
    final C2976a f12651i;
    /* renamed from: j */
    final ProxySelector f12652j;
    /* renamed from: k */
    final C2973m f12653k;
    @Nullable
    /* renamed from: l */
    final C2900c f12654l;
    @Nullable
    /* renamed from: m */
    final C2919f f12655m;
    /* renamed from: n */
    final SocketFactory f12656n;
    @Nullable
    /* renamed from: o */
    final SSLSocketFactory f12657o;
    @Nullable
    /* renamed from: p */
    final C2947c f12658p;
    /* renamed from: q */
    final HostnameVerifier f12659q;
    /* renamed from: r */
    final C2907g f12660r;
    /* renamed from: s */
    final C2898b f12661s;
    /* renamed from: t */
    final C2898b f12662t;
    /* renamed from: u */
    final C2967j f12663u;
    /* renamed from: v */
    final C2975o f12664v;
    /* renamed from: w */
    final boolean f12665w;
    /* renamed from: x */
    final boolean f12666x;
    /* renamed from: y */
    final boolean f12667y;
    /* renamed from: z */
    final int f12668z;

    /* renamed from: okhttp3.w$a */
    public static final class C2987a {
        /* renamed from: A */
        int f12613A;
        /* renamed from: a */
        C2974n f12614a;
        @Nullable
        /* renamed from: b */
        Proxy f12615b;
        /* renamed from: c */
        List<Protocol> f12616c;
        /* renamed from: d */
        List<C2969k> f12617d;
        /* renamed from: e */
        final List<C2983t> f12618e;
        /* renamed from: f */
        final List<C2983t> f12619f;
        /* renamed from: g */
        C2976a f12620g;
        /* renamed from: h */
        ProxySelector f12621h;
        /* renamed from: i */
        C2973m f12622i;
        @Nullable
        /* renamed from: j */
        C2900c f12623j;
        @Nullable
        /* renamed from: k */
        C2919f f12624k;
        /* renamed from: l */
        SocketFactory f12625l;
        @Nullable
        /* renamed from: m */
        SSLSocketFactory f12626m;
        @Nullable
        /* renamed from: n */
        C2947c f12627n;
        /* renamed from: o */
        HostnameVerifier f12628o;
        /* renamed from: p */
        C2907g f12629p;
        /* renamed from: q */
        C2898b f12630q;
        /* renamed from: r */
        C2898b f12631r;
        /* renamed from: s */
        C2967j f12632s;
        /* renamed from: t */
        C2975o f12633t;
        /* renamed from: u */
        boolean f12634u;
        /* renamed from: v */
        boolean f12635v;
        /* renamed from: w */
        boolean f12636w;
        /* renamed from: x */
        int f12637x;
        /* renamed from: y */
        int f12638y;
        /* renamed from: z */
        int f12639z;

        public C2987a() {
            this.f12618e = new ArrayList();
            this.f12619f = new ArrayList();
            this.f12614a = new C2974n();
            this.f12616c = C2988w.f12640a;
            this.f12617d = C2988w.f12641b;
            this.f12620g = C2977p.m14506a(C2977p.f12592a);
            this.f12621h = ProxySelector.getDefault();
            this.f12622i = C2973m.f12583a;
            this.f12625l = SocketFactory.getDefault();
            this.f12628o = C2948d.f12422a;
            this.f12629p = C2907g.f12232a;
            this.f12630q = C2898b.f12184a;
            this.f12631r = C2898b.f12184a;
            this.f12632s = new C2967j();
            this.f12633t = C2975o.f12591a;
            this.f12634u = true;
            this.f12635v = true;
            this.f12636w = true;
            this.f12637x = 10000;
            this.f12638y = 10000;
            this.f12639z = 10000;
            this.f12613A = 0;
        }

        C2987a(C2988w c2988w) {
            this.f12618e = new ArrayList();
            this.f12619f = new ArrayList();
            this.f12614a = c2988w.f12645c;
            this.f12615b = c2988w.f12646d;
            this.f12616c = c2988w.f12647e;
            this.f12617d = c2988w.f12648f;
            this.f12618e.addAll(c2988w.f12649g);
            this.f12619f.addAll(c2988w.f12650h);
            this.f12620g = c2988w.f12651i;
            this.f12621h = c2988w.f12652j;
            this.f12622i = c2988w.f12653k;
            this.f12624k = c2988w.f12655m;
            this.f12623j = c2988w.f12654l;
            this.f12625l = c2988w.f12656n;
            this.f12626m = c2988w.f12657o;
            this.f12627n = c2988w.f12658p;
            this.f12628o = c2988w.f12659q;
            this.f12629p = c2988w.f12660r;
            this.f12630q = c2988w.f12661s;
            this.f12631r = c2988w.f12662t;
            this.f12632s = c2988w.f12663u;
            this.f12633t = c2988w.f12664v;
            this.f12634u = c2988w.f12665w;
            this.f12635v = c2988w.f12666x;
            this.f12636w = c2988w.f12667y;
            this.f12637x = c2988w.f12668z;
            this.f12638y = c2988w.f12642A;
            this.f12639z = c2988w.f12643B;
            this.f12613A = c2988w.f12644C;
        }

        /* renamed from: a */
        public C2987a m14569a(long j, TimeUnit timeUnit) {
            this.f12637x = C2933c.m14182a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: b */
        public C2987a m14574b(long j, TimeUnit timeUnit) {
            this.f12638y = C2933c.m14182a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public C2987a m14576c(long j, TimeUnit timeUnit) {
            this.f12639z = C2933c.m14182a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: a */
        public C2987a m14571a(C2973m c2973m) {
            if (c2973m != null) {
                this.f12622i = c2973m;
                return this;
            }
            throw new NullPointerException("cookieJar == null");
        }

        /* renamed from: a */
        public C2987a m14570a(@Nullable C2900c c2900c) {
            this.f12623j = c2900c;
            this.f12624k = null;
            return this;
        }

        /* renamed from: a */
        public C2987a m14572a(C2983t c2983t) {
            if (c2983t != null) {
                this.f12618e.add(c2983t);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: b */
        public C2987a m14575b(C2983t c2983t) {
            if (c2983t != null) {
                this.f12619f.add(c2983t);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public C2988w m14573a() {
            return new C2988w(this);
        }
    }

    /* renamed from: okhttp3.w$1 */
    class C43871 extends C2920a {
        C43871() {
        }

        /* renamed from: a */
        public void mo3684a(C2980a c2980a, String str) {
            c2980a.m14537a(str);
        }

        /* renamed from: a */
        public void mo3685a(C2980a c2980a, String str, String str2) {
            c2980a.m14541b(str, str2);
        }

        /* renamed from: a */
        public boolean mo3687a(C2967j c2967j, C4353c c4353c) {
            return c2967j.m14449b(c4353c);
        }

        /* renamed from: a */
        public C4353c mo3681a(C2967j c2967j, C2895a c2895a, C2939f c2939f, ac acVar) {
            return c2967j.m14447a(c2895a, c2939f, acVar);
        }

        /* renamed from: a */
        public boolean mo3686a(C2895a c2895a, C2895a c2895a2) {
            return c2895a.m13981a(c2895a2);
        }

        /* renamed from: a */
        public Socket mo3680a(C2967j c2967j, C2895a c2895a, C2939f c2939f) {
            return c2967j.m14446a(c2895a, c2939f);
        }

        /* renamed from: b */
        public void mo3688b(C2967j c2967j, C4353c c4353c) {
            c2967j.m14448a(c4353c);
        }

        /* renamed from: a */
        public C2935d mo3682a(C2967j c2967j) {
            return c2967j.f12537a;
        }

        /* renamed from: a */
        public int mo3679a(C2896a c2896a) {
            return c2896a.f12153c;
        }

        /* renamed from: a */
        public void mo3683a(C2969k c2969k, SSLSocket sSLSocket, boolean z) {
            c2969k.m14457a(sSLSocket, z);
        }
    }

    static {
        C2920a.f12341a = new C43871();
    }

    public C2988w() {
        this(new C2987a());
    }

    C2988w(C2987a c2987a) {
        StringBuilder stringBuilder;
        this.f12645c = c2987a.f12614a;
        this.f12646d = c2987a.f12615b;
        this.f12647e = c2987a.f12616c;
        this.f12648f = c2987a.f12617d;
        this.f12649g = C2933c.m14190a(c2987a.f12618e);
        this.f12650h = C2933c.m14190a(c2987a.f12619f);
        this.f12651i = c2987a.f12620g;
        this.f12652j = c2987a.f12621h;
        this.f12653k = c2987a.f12622i;
        this.f12654l = c2987a.f12623j;
        this.f12655m = c2987a.f12624k;
        this.f12656n = c2987a.f12625l;
        loop0:
        while (true) {
            Object obj = null;
            for (C2969k c2969k : this.f12648f) {
                if (obj != null || c2969k.m14458a()) {
                    obj = 1;
                }
            }
            break loop0;
        }
        if (c2987a.f12626m == null) {
            if (obj != null) {
                X509TrustManager B = m14577B();
                this.f12657o = m14578a(B);
                this.f12658p = C2947c.m14289a(B);
                this.f12659q = c2987a.f12628o;
                this.f12660r = c2987a.f12629p.m14080a(this.f12658p);
                this.f12661s = c2987a.f12630q;
                this.f12662t = c2987a.f12631r;
                this.f12663u = c2987a.f12632s;
                this.f12664v = c2987a.f12633t;
                this.f12665w = c2987a.f12634u;
                this.f12666x = c2987a.f12635v;
                this.f12667y = c2987a.f12636w;
                this.f12668z = c2987a.f12637x;
                this.f12642A = c2987a.f12638y;
                this.f12643B = c2987a.f12639z;
                this.f12644C = c2987a.f12613A;
                if (this.f12649g.contains(null) == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Null interceptor: ");
                    stringBuilder.append(this.f12649g);
                    throw new IllegalStateException(stringBuilder.toString());
                } else if (this.f12650h.contains(null) == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Null network interceptor: ");
                    stringBuilder.append(this.f12650h);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
        }
        this.f12657o = c2987a.f12626m;
        this.f12658p = c2987a.f12627n;
        this.f12659q = c2987a.f12628o;
        this.f12660r = c2987a.f12629p.m14080a(this.f12658p);
        this.f12661s = c2987a.f12630q;
        this.f12662t = c2987a.f12631r;
        this.f12663u = c2987a.f12632s;
        this.f12664v = c2987a.f12633t;
        this.f12665w = c2987a.f12634u;
        this.f12666x = c2987a.f12635v;
        this.f12667y = c2987a.f12636w;
        this.f12668z = c2987a.f12637x;
        this.f12642A = c2987a.f12638y;
        this.f12643B = c2987a.f12639z;
        this.f12644C = c2987a.f12613A;
        if (this.f12649g.contains(null) == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Null interceptor: ");
            stringBuilder.append(this.f12649g);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.f12650h.contains(null) == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Null network interceptor: ");
            stringBuilder.append(this.f12650h);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: B */
    private X509TrustManager m14577B() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected default trust managers:");
            stringBuilder.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(stringBuilder.toString());
        } catch (Exception e) {
            throw C2933c.m14184a("No System TLS", e);
        }
    }

    /* renamed from: a */
    private SSLSocketFactory m14578a(X509TrustManager x509TrustManager) {
        try {
            SSLContext C_ = C2945f.m14270c().C_();
            C_.init(null, new TrustManager[]{x509TrustManager}, null);
            return C_.getSocketFactory();
        } catch (Exception e) {
            throw C2933c.m14184a("No System TLS", e);
        }
    }

    /* renamed from: a */
    public int m14580a() {
        return this.f12668z;
    }

    /* renamed from: b */
    public int m14582b() {
        return this.f12642A;
    }

    /* renamed from: c */
    public int m14583c() {
        return this.f12643B;
    }

    /* renamed from: d */
    public int m14584d() {
        return this.f12644C;
    }

    /* renamed from: e */
    public Proxy m14585e() {
        return this.f12646d;
    }

    /* renamed from: f */
    public ProxySelector m14586f() {
        return this.f12652j;
    }

    /* renamed from: g */
    public C2973m m14587g() {
        return this.f12653k;
    }

    /* renamed from: h */
    public C2900c m14588h() {
        return this.f12654l;
    }

    /* renamed from: i */
    C2919f m14589i() {
        return this.f12654l != null ? this.f12654l.f12197a : this.f12655m;
    }

    /* renamed from: j */
    public C2975o m14590j() {
        return this.f12664v;
    }

    /* renamed from: k */
    public SocketFactory m14591k() {
        return this.f12656n;
    }

    /* renamed from: l */
    public SSLSocketFactory m14592l() {
        return this.f12657o;
    }

    /* renamed from: m */
    public HostnameVerifier m14593m() {
        return this.f12659q;
    }

    /* renamed from: n */
    public C2907g m14594n() {
        return this.f12660r;
    }

    /* renamed from: o */
    public C2898b m14595o() {
        return this.f12662t;
    }

    /* renamed from: p */
    public C2898b m14596p() {
        return this.f12661s;
    }

    /* renamed from: q */
    public C2967j m14597q() {
        return this.f12663u;
    }

    /* renamed from: r */
    public boolean m14598r() {
        return this.f12665w;
    }

    /* renamed from: s */
    public boolean m14599s() {
        return this.f12666x;
    }

    /* renamed from: t */
    public boolean m14600t() {
        return this.f12667y;
    }

    /* renamed from: u */
    public C2974n m14601u() {
        return this.f12645c;
    }

    /* renamed from: v */
    public List<Protocol> m14602v() {
        return this.f12647e;
    }

    /* renamed from: w */
    public List<C2969k> m14603w() {
        return this.f12648f;
    }

    /* renamed from: x */
    public List<C2983t> m14604x() {
        return this.f12649g;
    }

    /* renamed from: y */
    public List<C2983t> m14605y() {
        return this.f12650h;
    }

    /* renamed from: z */
    public C2976a m14606z() {
        return this.f12651i;
    }

    /* renamed from: a */
    public C2903e m14581a(C2990y c2990y) {
        return C4389x.m23931a(this, c2990y, false);
    }

    /* renamed from: A */
    public C2987a m14579A() {
        return new C2987a(this);
    }
}
