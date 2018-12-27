package com.google.android.gms.measurement.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

final class co extends SSLSocket {
    /* renamed from: a */
    private final SSLSocket f10575a;

    co(cn cnVar, SSLSocket sSLSocket) {
        this.f10575a = sSLSocket;
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            strArr = new ArrayList(Arrays.asList(this.f10575a.getEnabledProtocols()));
            if (strArr.size() > 1) {
                strArr.remove("SSLv3");
            }
            strArr = (String[]) strArr.toArray(new String[strArr.size()]);
        }
        this.f10575a.setEnabledProtocols(strArr);
    }

    public final String[] getSupportedCipherSuites() {
        return this.f10575a.getSupportedCipherSuites();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f10575a.getEnabledCipherSuites();
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f10575a.setEnabledCipherSuites(strArr);
    }

    public final String[] getSupportedProtocols() {
        return this.f10575a.getSupportedProtocols();
    }

    public final String[] getEnabledProtocols() {
        return this.f10575a.getEnabledProtocols();
    }

    public final SSLSession getSession() {
        return this.f10575a.getSession();
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f10575a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f10575a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void startHandshake() {
        this.f10575a.startHandshake();
    }

    public final void setUseClientMode(boolean z) {
        this.f10575a.setUseClientMode(z);
    }

    public final boolean getUseClientMode() {
        return this.f10575a.getUseClientMode();
    }

    public final void setNeedClientAuth(boolean z) {
        this.f10575a.setNeedClientAuth(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f10575a.setWantClientAuth(z);
    }

    public final boolean getNeedClientAuth() {
        return this.f10575a.getNeedClientAuth();
    }

    public final boolean getWantClientAuth() {
        return this.f10575a.getWantClientAuth();
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f10575a.setEnableSessionCreation(z);
    }

    public final boolean getEnableSessionCreation() {
        return this.f10575a.getEnableSessionCreation();
    }

    public final void bind(SocketAddress socketAddress) {
        this.f10575a.bind(socketAddress);
    }

    public final synchronized void close() {
        this.f10575a.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.f10575a.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) {
        this.f10575a.connect(socketAddress, i);
    }

    public final SocketChannel getChannel() {
        return this.f10575a.getChannel();
    }

    public final InetAddress getInetAddress() {
        return this.f10575a.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.f10575a.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.f10575a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f10575a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f10575a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f10575a.getLocalSocketAddress();
    }

    public final boolean getOOBInline() {
        return this.f10575a.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.f10575a.getOutputStream();
    }

    public final int getPort() {
        return this.f10575a.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.f10575a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f10575a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.f10575a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.f10575a.getSendBufferSize();
    }

    public final int getSoLinger() {
        return this.f10575a.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.f10575a.getSoTimeout();
    }

    public final boolean getTcpNoDelay() {
        return this.f10575a.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.f10575a.getTrafficClass();
    }

    public final boolean isBound() {
        return this.f10575a.isBound();
    }

    public final boolean isClosed() {
        return this.f10575a.isClosed();
    }

    public final boolean isConnected() {
        return this.f10575a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f10575a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f10575a.isOutputShutdown();
    }

    public final void sendUrgentData(int i) {
        this.f10575a.sendUrgentData(i);
    }

    public final void setKeepAlive(boolean z) {
        this.f10575a.setKeepAlive(z);
    }

    public final void setOOBInline(boolean z) {
        this.f10575a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f10575a.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) {
        this.f10575a.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) {
        this.f10575a.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) {
        this.f10575a.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) {
        this.f10575a.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) {
        this.f10575a.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) {
        this.f10575a.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) {
        this.f10575a.setTrafficClass(i);
    }

    public final void shutdownInput() {
        this.f10575a.shutdownInput();
    }

    public final void shutdownOutput() {
        this.f10575a.shutdownOutput();
    }

    public final String toString() {
        return this.f10575a.toString();
    }

    public final boolean equals(Object obj) {
        return this.f10575a.equals(obj);
    }
}
