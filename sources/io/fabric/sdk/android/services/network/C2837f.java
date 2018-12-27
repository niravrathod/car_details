package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.C2766c;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: io.fabric.sdk.android.services.network.f */
class C2837f implements X509TrustManager {
    /* renamed from: a */
    private static final X509Certificate[] f11981a = new X509Certificate[0];
    /* renamed from: b */
    private final TrustManager[] f11982b;
    /* renamed from: c */
    private final C2838g f11983c;
    /* renamed from: d */
    private final long f11984d;
    /* renamed from: e */
    private final List<byte[]> f11985e = new LinkedList();
    /* renamed from: f */
    private final Set<X509Certificate> f11986f = Collections.synchronizedSet(new HashSet());

    public C2837f(C2838g c2838g, C2836e c2836e) {
        this.f11982b = m13846a(c2838g);
        this.f11983c = c2838g;
        this.f11984d = c2836e.mo1154d();
        for (String a : c2836e.mo1153c()) {
            this.f11985e.add(m13845a(a));
        }
    }

    /* renamed from: a */
    private TrustManager[] m13846a(C2838g c2838g) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(c2838g.f11987a);
            return instance.getTrustManagers();
        } catch (C2838g c2838g2) {
            throw new AssertionError(c2838g2);
        } catch (C2838g c2838g22) {
            throw new AssertionError(c2838g22);
        }
    }

    /* renamed from: a */
    private boolean m13844a(X509Certificate x509Certificate) {
        try {
            x509Certificate = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] equals : this.f11985e) {
                if (Arrays.equals(equals, x509Certificate)) {
                    return true;
                }
            }
            return null;
        } catch (X509Certificate x509Certificate2) {
            throw new CertificateException(x509Certificate2);
        }
    }

    /* renamed from: a */
    private void m13843a(X509Certificate[] x509CertificateArr, String str) {
        for (TrustManager trustManager : this.f11982b) {
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    private void m13842a(X509Certificate[] x509CertificateArr) {
        if (this.f11984d == -1 || System.currentTimeMillis() - this.f11984d <= 15552000000L) {
            x509CertificateArr = C2832a.m13833a(x509CertificateArr, this.f11983c);
            int length = x509CertificateArr.length;
            int i = 0;
            while (i < length) {
                if (!m13844a(x509CertificateArr[i])) {
                    i++;
                } else {
                    return;
                }
            }
            throw new CertificateException("No valid pins found in chain!");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Certificate pins are stale, (");
        stringBuilder.append(System.currentTimeMillis() - this.f11984d);
        stringBuilder.append(" millis vs ");
        stringBuilder.append(15552000000L);
        stringBuilder.append(" millis) falling back to system trust.");
        C2766c.m13524h().mo3559d("Fabric", stringBuilder.toString());
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (!this.f11986f.contains(x509CertificateArr[0])) {
            m13843a(x509CertificateArr, str);
            m13842a(x509CertificateArr);
            this.f11986f.add(x509CertificateArr[0]);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f11981a;
    }

    /* renamed from: a */
    private byte[] m13845a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
