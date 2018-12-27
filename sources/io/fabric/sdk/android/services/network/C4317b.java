package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.C4290b;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.fabric.sdk.android.services.network.b */
public class C4317b implements C2834c {
    /* renamed from: a */
    private final C2774k f18050a;
    /* renamed from: b */
    private C2836e f18051b;
    /* renamed from: c */
    private SSLSocketFactory f18052c;
    /* renamed from: d */
    private boolean f18053d;

    public C4317b() {
        this(new C4290b());
    }

    public C4317b(C2774k c2774k) {
        this.f18050a = c2774k;
    }

    /* renamed from: a */
    public void mo3593a(C2836e c2836e) {
        if (this.f18051b != c2836e) {
            this.f18051b = c2836e;
            m23662a();
        }
    }

    /* renamed from: a */
    private synchronized void m23662a() {
        this.f18053d = false;
        this.f18052c = null;
    }

    /* renamed from: a */
    public HttpRequest mo3591a(HttpMethod httpMethod, String str) {
        return mo3592a(httpMethod, str, Collections.emptyMap());
    }

    /* renamed from: a */
    public HttpRequest mo3592a(HttpMethod httpMethod, String str, Map<String, String> map) {
        switch (httpMethod) {
            case GET:
                httpMethod = HttpRequest.m13779a((CharSequence) str, (Map) map, true);
                break;
            case POST:
                httpMethod = HttpRequest.m13784b((CharSequence) str, (Map) map, true);
                break;
            case PUT:
                httpMethod = HttpRequest.m13787d((CharSequence) str);
                break;
            case DELETE:
                httpMethod = HttpRequest.m13788e((CharSequence) str);
                break;
            default:
                throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (!(m23663a(str) == null || this.f18051b == null)) {
            str = m23664b();
            if (str != null) {
                ((HttpsURLConnection) httpMethod.m13806a()).setSSLSocketFactory(str);
            }
        }
        return httpMethod;
    }

    /* renamed from: a */
    private boolean m23663a(String str) {
        return (str == null || str.toLowerCase(Locale.US).startsWith("https") == null) ? null : true;
    }

    /* renamed from: b */
    private synchronized SSLSocketFactory m23664b() {
        if (this.f18052c == null && !this.f18053d) {
            this.f18052c = m23665c();
        }
        return this.f18052c;
    }

    /* renamed from: c */
    private synchronized SSLSocketFactory m23665c() {
        SSLSocketFactory a;
        this.f18053d = true;
        try {
            a = C2835d.m13837a(this.f18051b);
            this.f18050a.mo3554a("Fabric", "Custom SSL pinning enabled");
        } catch (Throwable e) {
            this.f18050a.mo3562e("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return a;
    }
}
