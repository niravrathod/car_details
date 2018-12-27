package io.fabric.sdk.android.services.network;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: io.fabric.sdk.android.services.network.d */
public final class C2835d {
    /* renamed from: a */
    public static final SSLSocketFactory m13837a(C2836e c2836e) {
        SSLContext instance = SSLContext.getInstance("TLS");
        C2837f c2837f = new C2837f(new C2838g(c2836e.mo1151a(), c2836e.mo1152b()), c2836e);
        instance.init(null, new TrustManager[]{c2837f}, null);
        return instance.getSocketFactory();
    }
}
