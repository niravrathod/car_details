package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl.Builder;
import okhttp3.internal.C2933c;

/* renamed from: okhttp3.a */
public final class C2895a {
    /* renamed from: a */
    final HttpUrl f12140a;
    /* renamed from: b */
    final C2975o f12141b;
    /* renamed from: c */
    final SocketFactory f12142c;
    /* renamed from: d */
    final C2898b f12143d;
    /* renamed from: e */
    final List<Protocol> f12144e;
    /* renamed from: f */
    final List<C2969k> f12145f;
    /* renamed from: g */
    final ProxySelector f12146g;
    @Nullable
    /* renamed from: h */
    final Proxy f12147h;
    @Nullable
    /* renamed from: i */
    final SSLSocketFactory f12148i;
    @Nullable
    /* renamed from: j */
    final HostnameVerifier f12149j;
    @Nullable
    /* renamed from: k */
    final C2907g f12150k;

    public C2895a(String str, int i, C2975o c2975o, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable C2907g c2907g, C2898b c2898b, @Nullable Proxy proxy, List<Protocol> list, List<C2969k> list2, ProxySelector proxySelector) {
        this.f12140a = new Builder().m13938a(sSLSocketFactory != null ? "https" : "http").m13944d(str).m13937a(i).m13943c();
        if (c2975o != null) {
            this.f12141b = c2975o;
            if (socketFactory != null) {
                this.f12142c = socketFactory;
                if (c2898b != null) {
                    this.f12143d = c2898b;
                    if (list != null) {
                        this.f12144e = C2933c.m14190a((List) list);
                        if (list2 != null) {
                            this.f12145f = C2933c.m14190a((List) list2);
                            if (proxySelector != null) {
                                this.f12146g = proxySelector;
                                this.f12147h = proxy;
                                this.f12148i = sSLSocketFactory;
                                this.f12149j = hostnameVerifier;
                                this.f12150k = c2907g;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    /* renamed from: a */
    public HttpUrl m13980a() {
        return this.f12140a;
    }

    /* renamed from: b */
    public C2975o m13982b() {
        return this.f12141b;
    }

    /* renamed from: c */
    public SocketFactory m13983c() {
        return this.f12142c;
    }

    /* renamed from: d */
    public C2898b m13984d() {
        return this.f12143d;
    }

    /* renamed from: e */
    public List<Protocol> m13985e() {
        return this.f12144e;
    }

    /* renamed from: f */
    public List<C2969k> m13986f() {
        return this.f12145f;
    }

    /* renamed from: g */
    public ProxySelector m13987g() {
        return this.f12146g;
    }

    @Nullable
    /* renamed from: h */
    public Proxy m13988h() {
        return this.f12147h;
    }

    @Nullable
    /* renamed from: i */
    public SSLSocketFactory m13989i() {
        return this.f12148i;
    }

    @Nullable
    /* renamed from: j */
    public HostnameVerifier m13990j() {
        return this.f12149j;
    }

    @Nullable
    /* renamed from: k */
    public C2907g m13991k() {
        return this.f12150k;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C2895a) {
            C2895a c2895a = (C2895a) obj;
            if (this.f12140a.equals(c2895a.f12140a) && m13981a(c2895a) != null) {
                return true;
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((527 + this.f12140a.hashCode()) * 31) + this.f12141b.hashCode()) * 31) + this.f12143d.hashCode()) * 31) + this.f12144e.hashCode()) * 31) + this.f12145f.hashCode()) * 31) + this.f12146g.hashCode()) * 31) + (this.f12147h != null ? this.f12147h.hashCode() : 0)) * 31) + (this.f12148i != null ? this.f12148i.hashCode() : 0)) * 31) + (this.f12149j != null ? this.f12149j.hashCode() : 0)) * 31;
        if (this.f12150k != null) {
            i = this.f12150k.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    boolean m13981a(C2895a c2895a) {
        return (this.f12141b.equals(c2895a.f12141b) && this.f12143d.equals(c2895a.f12143d) && this.f12144e.equals(c2895a.f12144e) && this.f12145f.equals(c2895a.f12145f) && this.f12146g.equals(c2895a.f12146g) && C2933c.m14197a(this.f12147h, c2895a.f12147h) && C2933c.m14197a(this.f12148i, c2895a.f12148i) && C2933c.m14197a(this.f12149j, c2895a.f12149j) && C2933c.m14197a(this.f12150k, c2895a.f12150k) && m13980a().m13968g() == c2895a.m13980a().m13968g()) ? true : null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Address{");
        stringBuilder.append(this.f12140a.m13967f());
        stringBuilder.append(":");
        stringBuilder.append(this.f12140a.m13968g());
        if (this.f12147h != null) {
            stringBuilder.append(", proxy=");
            stringBuilder.append(this.f12147h);
        } else {
            stringBuilder.append(", proxySelector=");
            stringBuilder.append(this.f12146g);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
