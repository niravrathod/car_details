package com.google.android.gms.measurement.internal;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

final class cn extends SSLSocketFactory {
    /* renamed from: a */
    private final SSLSocketFactory f10574a;

    cn() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private cn(SSLSocketFactory sSLSocketFactory) {
        this.f10574a = sSLSocketFactory;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m12245a((SSLSocket) this.f10574a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f10574a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f10574a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i) {
        return m12245a((SSLSocket) this.f10574a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m12245a((SSLSocket) this.f10574a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m12245a((SSLSocket) this.f10574a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m12245a((SSLSocket) this.f10574a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket() {
        return m12245a((SSLSocket) this.f10574a.createSocket());
    }

    /* renamed from: a */
    private final SSLSocket m12245a(SSLSocket sSLSocket) {
        return new co(this, sSLSocket);
    }
}
