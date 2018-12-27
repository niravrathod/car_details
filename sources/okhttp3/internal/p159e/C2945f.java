package okhttp3.internal.p159e;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.C2988w;
import okhttp3.Protocol;
import okhttp3.internal.p161g.C2947c;
import okhttp3.internal.p161g.C2949e;
import okhttp3.internal.p161g.C4361a;
import okhttp3.internal.p161g.C4362b;
import okio.C4755c;

/* renamed from: okhttp3.internal.e.f */
public class C2945f {
    /* renamed from: a */
    private static final C2945f f12412a = C2945f.m14268b();
    /* renamed from: b */
    private static final Logger f12413b = Logger.getLogger(C2988w.class.getName());

    @Nullable
    /* renamed from: a */
    public String mo3649a(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: a */
    public void mo3654a(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    /* renamed from: b */
    public void mo3658b(SSLSocket sSLSocket) {
    }

    /* renamed from: b */
    public boolean mo3656b(String str) {
        return true;
    }

    /* renamed from: d */
    public String m14282d() {
        return "OkHttp";
    }

    /* renamed from: c */
    public static C2945f m14270c() {
        return f12412a;
    }

    /* renamed from: a */
    public void mo3653a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    public void mo3651a(int i, String str, Throwable th) {
        f12413b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: a */
    public Object mo3648a(String str) {
        return f12413b.isLoggable(Level.FINE) ? new Throwable(str) : null;
    }

    /* renamed from: a */
    public void mo3652a(String str, Object obj) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = stringBuilder.toString();
        }
        mo3651a(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public static List<String> m14267a(List<Protocol> list) {
        List<String> arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = (Protocol) list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C2947c mo3650a(X509TrustManager x509TrustManager) {
        return new C4361a(mo3655b(x509TrustManager));
    }

    /* renamed from: e */
    public static boolean m14271e() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: b */
    private static C2945f m14268b() {
        C2945f a = C4357a.m23827a();
        if (a != null) {
            return a;
        }
        if (C2945f.m14271e()) {
            a = C4358b.m23840b();
            if (a != null) {
                return a;
            }
        }
        a = C4359c.m23844b();
        if (a != null) {
            return a;
        }
        a = C4360d.m23847b();
        if (a != null) {
            return a;
        }
        return new C2945f();
    }

    /* renamed from: b */
    static byte[] m14269b(List<Protocol> list) {
        C4755c c4755c = new C4755c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = (Protocol) list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                c4755c.m27503b(protocol.toString().length());
                c4755c.m27492a(protocol.toString());
            }
        }
        return c4755c.mo4577s();
    }

    public SSLContext C_() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (Throwable e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: b */
    public C2949e mo3655b(X509TrustManager x509TrustManager) {
        return new C4362b(x509TrustManager.getAcceptedIssuers());
    }
}
