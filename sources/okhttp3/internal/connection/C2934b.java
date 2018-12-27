package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import okhttp3.C2969k;
import okhttp3.internal.C2920a;

/* renamed from: okhttp3.internal.connection.b */
public final class C2934b {
    /* renamed from: a */
    private final List<C2969k> f12371a;
    /* renamed from: b */
    private int f12372b = 0;
    /* renamed from: c */
    private boolean f12373c;
    /* renamed from: d */
    private boolean f12374d;

    public C2934b(List<C2969k> list) {
        this.f12371a = list;
    }

    /* renamed from: a */
    public C2969k m14214a(SSLSocket sSLSocket) {
        C2969k c2969k;
        int size = this.f12371a.size();
        for (int i = this.f12372b; i < size; i++) {
            c2969k = (C2969k) this.f12371a.get(i);
            if (c2969k.m14459a(sSLSocket)) {
                this.f12372b = i + 1;
                break;
            }
        }
        c2969k = null;
        if (c2969k != null) {
            this.f12373c = m14213b(sSLSocket);
            C2920a.f12341a.mo3683a(c2969k, sSLSocket, this.f12374d);
            return c2969k;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to find acceptable protocols. isFallback=");
        stringBuilder.append(this.f12374d);
        stringBuilder.append(", modes=");
        stringBuilder.append(this.f12371a);
        stringBuilder.append(", supported protocols=");
        stringBuilder.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(stringBuilder.toString());
    }

    /* renamed from: a */
    public boolean m14215a(IOException iOException) {
        boolean z = true;
        this.f12374d = true;
        if (!this.f12373c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z2 = iOException instanceof SSLHandshakeException;
        if ((z2 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (!z2) {
            if ((iOException instanceof SSLProtocolException) == null) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private boolean m14213b(SSLSocket sSLSocket) {
        for (int i = this.f12372b; i < this.f12371a.size(); i++) {
            if (((C2969k) this.f12371a.get(i)).m14459a(sSLSocket)) {
                return true;
            }
        }
        return null;
    }
}
