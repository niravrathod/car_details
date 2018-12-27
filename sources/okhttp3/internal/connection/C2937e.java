package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.C2895a;
import okhttp3.C2903e;
import okhttp3.C2977p;
import okhttp3.HttpUrl;
import okhttp3.ac;
import okhttp3.internal.C2933c;

/* renamed from: okhttp3.internal.connection.e */
public final class C2937e {
    /* renamed from: a */
    private final C2895a f12378a;
    /* renamed from: b */
    private final C2935d f12379b;
    /* renamed from: c */
    private final C2903e f12380c;
    /* renamed from: d */
    private final C2977p f12381d;
    /* renamed from: e */
    private List<Proxy> f12382e = Collections.emptyList();
    /* renamed from: f */
    private int f12383f;
    /* renamed from: g */
    private List<InetSocketAddress> f12384g = Collections.emptyList();
    /* renamed from: h */
    private final List<ac> f12385h = new ArrayList();

    /* renamed from: okhttp3.internal.connection.e$a */
    public static final class C2936a {
        /* renamed from: a */
        private final List<ac> f12376a;
        /* renamed from: b */
        private int f12377b = 0;

        C2936a(List<ac> list) {
            this.f12376a = list;
        }

        /* renamed from: a */
        public boolean m14219a() {
            return this.f12377b < this.f12376a.size();
        }

        /* renamed from: b */
        public ac m14220b() {
            if (m14219a()) {
                List list = this.f12376a;
                int i = this.f12377b;
                this.f12377b = i + 1;
                return (ac) list.get(i);
            }
            throw new NoSuchElementException();
        }

        /* renamed from: c */
        public List<ac> m14221c() {
            return new ArrayList(this.f12376a);
        }
    }

    public C2937e(C2895a c2895a, C2935d c2935d, C2903e c2903e, C2977p c2977p) {
        this.f12378a = c2895a;
        this.f12379b = c2935d;
        this.f12380c = c2903e;
        this.f12381d = c2977p;
        m14224a(c2895a.m13980a(), c2895a.m13988h());
    }

    /* renamed from: a */
    public boolean m14228a() {
        if (!m14225c()) {
            if (this.f12385h.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public C2936a m14229b() {
        if (m14228a()) {
            List arrayList = new ArrayList();
            while (m14225c()) {
                Proxy d = m14226d();
                int size = this.f12384g.size();
                for (int i = 0; i < size; i++) {
                    ac acVar = new ac(this.f12378a, d, (InetSocketAddress) this.f12384g.get(i));
                    if (this.f12379b.m14218c(acVar)) {
                        this.f12385h.add(acVar);
                    } else {
                        arrayList.add(acVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f12385h);
                this.f12385h.clear();
            }
            return new C2936a(arrayList);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public void m14227a(ac acVar, IOException iOException) {
        if (!(acVar.m14035b().type() == Type.DIRECT || this.f12378a.m13987g() == null)) {
            this.f12378a.m13987g().connectFailed(this.f12378a.m13980a().m13960a(), acVar.m14035b().address(), iOException);
        }
        this.f12379b.m14216a(acVar);
    }

    /* renamed from: a */
    private void m14224a(HttpUrl httpUrl, Proxy proxy) {
        if (proxy != null) {
            this.f12382e = Collections.singletonList(proxy);
        } else {
            List select = this.f12378a.m13987g().select(httpUrl.m13960a());
            if (select == null || select.isEmpty() != null) {
                httpUrl = C2933c.m14191a(Proxy.NO_PROXY);
            } else {
                httpUrl = C2933c.m14190a(select);
            }
            this.f12382e = httpUrl;
        }
        this.f12383f = 0;
    }

    /* renamed from: c */
    private boolean m14225c() {
        return this.f12383f < this.f12382e.size();
    }

    /* renamed from: d */
    private Proxy m14226d() {
        if (m14225c()) {
            List list = this.f12382e;
            int i = this.f12383f;
            this.f12383f = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m14223a(proxy);
            return proxy;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No route to ");
        stringBuilder.append(this.f12378a.m13980a().m13967f());
        stringBuilder.append("; exhausted proxy configurations: ");
        stringBuilder.append(this.f12382e);
        throw new SocketException(stringBuilder.toString());
    }

    /* renamed from: a */
    private void m14223a(Proxy proxy) {
        String a;
        int port;
        StringBuilder stringBuilder;
        this.f12384g = new ArrayList();
        if (proxy.type() != Type.DIRECT) {
            if (proxy.type() != Type.SOCKS) {
                SocketAddress address = proxy.address();
                if (address instanceof InetSocketAddress) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    a = C2937e.m14222a(inetSocketAddress);
                    port = inetSocketAddress.getPort();
                    if (port >= 1 || port > 65535) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("No route to ");
                        stringBuilder.append(a);
                        stringBuilder.append(":");
                        stringBuilder.append(port);
                        stringBuilder.append("; port is out of range");
                        throw new SocketException(stringBuilder.toString());
                    } else if (proxy.type() == Type.SOCKS) {
                        this.f12384g.add(InetSocketAddress.createUnresolved(a, port));
                        return;
                    } else {
                        this.f12381d.m14510a(this.f12380c, a);
                        List a2 = this.f12378a.m13982b().mo3677a(a);
                        if (a2.isEmpty()) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(this.f12378a.m13982b());
                            stringBuilder2.append(" returned no addresses for ");
                            stringBuilder2.append(a);
                            throw new UnknownHostException(stringBuilder2.toString());
                        }
                        this.f12381d.m14511a(this.f12380c, a, a2);
                        int size = a2.size();
                        for (int i = 0; i < size; i++) {
                            this.f12384g.add(new InetSocketAddress((InetAddress) a2.get(i), port));
                        }
                        return;
                    }
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Proxy.address() is not an InetSocketAddress: ");
                stringBuilder3.append(address.getClass());
                throw new IllegalArgumentException(stringBuilder3.toString());
            }
        }
        a = this.f12378a.m13980a().m13967f();
        port = this.f12378a.m13980a().m13968g();
        if (port >= 1) {
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("No route to ");
        stringBuilder.append(a);
        stringBuilder.append(":");
        stringBuilder.append(port);
        stringBuilder.append("; port is out of range");
        throw new SocketException(stringBuilder.toString());
    }

    /* renamed from: a */
    static String m14222a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
