package okhttp3.internal.p161g;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.p159e.C2945f;

/* renamed from: okhttp3.internal.g.c */
public abstract class C2947c {
    /* renamed from: a */
    public abstract List<Certificate> mo3646a(List<Certificate> list, String str);

    /* renamed from: a */
    public static C2947c m14289a(X509TrustManager x509TrustManager) {
        return C2945f.m14270c().mo3650a(x509TrustManager);
    }
}
