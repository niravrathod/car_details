package okhttp3.internal.p156b;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C2895a;
import okhttp3.C2903e;
import okhttp3.C2907g;
import okhttp3.C2977p;
import okhttp3.C2983t;
import okhttp3.C2983t.C2982a;
import okhttp3.C2988w;
import okhttp3.C2990y;
import okhttp3.C2990y.C2989a;
import okhttp3.C2991z;
import okhttp3.HttpUrl;
import okhttp3.aa;
import okhttp3.ac;
import okhttp3.internal.C2933c;
import okhttp3.internal.connection.C2939f;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* renamed from: okhttp3.internal.b.j */
public final class C4347j implements C2983t {
    /* renamed from: a */
    private final C2988w f18112a;
    /* renamed from: b */
    private final boolean f18113b;
    /* renamed from: c */
    private volatile C2939f f18114c;
    /* renamed from: d */
    private Object f18115d;
    /* renamed from: e */
    private volatile boolean f18116e;

    public C4347j(C2988w c2988w, boolean z) {
        this.f18112a = c2988w;
        this.f18113b = z;
    }

    /* renamed from: a */
    public void m23772a() {
        this.f18116e = true;
        C2939f c2939f = this.f18114c;
        if (c2939f != null) {
            c2939f.m14246f();
        }
    }

    /* renamed from: b */
    public boolean m23774b() {
        return this.f18116e;
    }

    /* renamed from: a */
    public void m23773a(Object obj) {
        this.f18115d = obj;
    }

    /* renamed from: a */
    public aa mo910a(C2982a c2982a) {
        C2990y a = c2982a.mo3619a();
        C4345g c4345g = (C4345g) c2982a;
        C2903e h = c4345g.m23760h();
        C2977p i = c4345g.m23761i();
        C2939f c2939f = new C2939f(this.f18112a.m14597q(), m23766a(a.m14623a()), h, i, this.f18115d);
        this.f18114c = c2939f;
        aa aaVar = null;
        int i2 = 0;
        while (!this.f18116e) {
            try {
                aa a2 = c4345g.m23752a(a, r9, null, null);
                aa a3 = aaVar != null ? a2.m14018i().m14007c(aaVar.m14018i().m14000a(null).m14004a()).m14004a() : a2;
                C2990y a4 = m23767a(a3, r9.m14242b());
                if (a4 == null) {
                    if (this.f18113b == null) {
                        r9.m14244d();
                    }
                    return a3;
                }
                C2933c.m14194a(a3.m14017h());
                int i3 = i2 + 1;
                if (i3 > 20) {
                    r9.m14244d();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Too many follow-up requests: ");
                    stringBuilder.append(i3);
                    throw new ProtocolException(stringBuilder.toString());
                } else if (a4.m14627d() instanceof C2928l) {
                    r9.m14244d();
                    throw new HttpRetryException("Cannot retry streamed HTTP body", a3.m14012c());
                } else {
                    if (!m23770a(a3, a4.m14623a())) {
                        r9.m14244d();
                        c2939f = new C2939f(this.f18112a.m14597q(), m23766a(a4.m14623a()), h, i, this.f18115d);
                        this.f18114c = c2939f;
                    } else if (r9.m14237a() != null) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Closing the body of ");
                        stringBuilder2.append(a3);
                        stringBuilder2.append(" didn't close its backing stream. Bad interceptor?");
                        throw new IllegalStateException(stringBuilder2.toString());
                    }
                    aaVar = a3;
                    a = a4;
                    i2 = i3;
                }
            } catch (RouteException e) {
                if (!m23768a(e.m14211a(), r9, false, a)) {
                    throw e.m14211a();
                }
            } catch (IOException e2) {
                if (!m23768a(e2, r9, !(e2 instanceof ConnectionShutdownException), a)) {
                    throw e2;
                }
            } catch (Throwable th) {
                r9.m14239a(null);
                r9.m14244d();
            }
        }
        r9.m14244d();
        throw new IOException("Canceled");
    }

    /* renamed from: a */
    private C2895a m23766a(HttpUrl httpUrl) {
        HostnameVerifier m;
        SSLSocketFactory sSLSocketFactory;
        C2907g n;
        C4347j c4347j = this;
        if (httpUrl.m13963c()) {
            SSLSocketFactory l = c4347j.f18112a.m14592l();
            m = c4347j.f18112a.m14593m();
            sSLSocketFactory = l;
            n = c4347j.f18112a.m14594n();
        } else {
            sSLSocketFactory = null;
            m = sSLSocketFactory;
            n = m;
        }
        return new C2895a(httpUrl.m13967f(), httpUrl.m13968g(), c4347j.f18112a.m14590j(), c4347j.f18112a.m14591k(), sSLSocketFactory, m, n, c4347j.f18112a.m14596p(), c4347j.f18112a.m14585e(), c4347j.f18112a.m14602v(), c4347j.f18112a.m14603w(), c4347j.f18112a.m14586f());
    }

    /* renamed from: a */
    private boolean m23768a(IOException iOException, C2939f c2939f, boolean z, C2990y c2990y) {
        c2939f.m14239a(iOException);
        if (!this.f18112a.m14600t()) {
            return false;
        }
        if ((z && (c2990y.m14627d() instanceof C2928l) != null) || m23769a(iOException, z) == null || c2939f.m14247g() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m23769a(IOException iOException, boolean z) {
        boolean z2 = false;
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!((iOException instanceof SocketTimeoutException) == null || z)) {
                z2 = true;
            }
            return z2;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && (iOException instanceof SSLPeerUnverifiedException) == null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private C2990y m23767a(aa aaVar, ac acVar) {
        if (aaVar != null) {
            int c = aaVar.m14012c();
            String b = aaVar.m14010a().m14624b();
            C2991z c2991z = null;
            switch (c) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                case 307:
                case 308:
                    if (b.equals("GET") == null && b.equals("HEAD") == null) {
                        return null;
                    }
                case 401:
                    return this.f18112a.m14595o().mo3606a(acVar, aaVar);
                case 407:
                    Proxy b2;
                    if (acVar != null) {
                        b2 = acVar.m14035b();
                    } else {
                        b2 = this.f18112a.m14585e();
                    }
                    if (b2.type() == Type.HTTP) {
                        return this.f18112a.m14596p().mo3606a(acVar, aaVar);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                case 408:
                    if (this.f18112a.m14600t() == null || (aaVar.m14010a().m14627d() instanceof C2928l) != null) {
                        return null;
                    }
                    if ((aaVar.m14021l() == null || aaVar.m14021l().m14012c() != 408) && m23765a(aaVar, (int) null) <= null) {
                        return aaVar.m14010a();
                    }
                    return null;
                case 503:
                    if ((aaVar.m14021l() == null || aaVar.m14021l().m14012c() != 503) && m23765a(aaVar, (int) BaseClientBuilder.API_PRIORITY_OTHER) == null) {
                        return aaVar.m14010a();
                    }
                    return null;
                default:
                    return null;
            }
            if (this.f18112a.m14599s() == null) {
                return null;
            }
            acVar = aaVar.m14008a("Location");
            if (acVar == null) {
                return null;
            }
            HttpUrl c2 = aaVar.m14010a().m14623a().m13962c(acVar);
            if (c2 == null) {
                return null;
            }
            if (!c2.m13961b().equals(aaVar.m14010a().m14623a().m13961b()) && !this.f18112a.m14598r()) {
                return null;
            }
            C2989a e = aaVar.m14010a().m14628e();
            if (C2925f.m14169c(b)) {
                boolean d = C2925f.m14170d(b);
                if (C2925f.m14171e(b)) {
                    e.m14610a("GET", null);
                } else {
                    if (d) {
                        c2991z = aaVar.m14010a().m14627d();
                    }
                    e.m14610a(b, c2991z);
                }
                if (!d) {
                    e.m14616b("Transfer-Encoding");
                    e.m14616b("Content-Length");
                    e.m14616b("Content-Type");
                }
            }
            if (m23770a(aaVar, c2) == null) {
                e.m14616b("Authorization");
            }
            return e.m14611a(c2).m14620c();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private int m23765a(aa aaVar, int i) {
        aaVar = aaVar.m14008a("Retry-After");
        if (aaVar == null) {
            return i;
        }
        return aaVar.matches("\\d+") != 0 ? Integer.valueOf(aaVar).intValue() : BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* renamed from: a */
    private boolean m23770a(aa aaVar, HttpUrl httpUrl) {
        aaVar = aaVar.m14010a().m14623a();
        return (aaVar.m13967f().equals(httpUrl.m13967f()) && aaVar.m13968g() == httpUrl.m13968g() && aaVar.m13961b().equals(httpUrl.m13961b()) != null) ? true : null;
    }
}
