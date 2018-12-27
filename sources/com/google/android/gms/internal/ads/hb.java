package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

final class hb extends FilterInputStream {
    /* renamed from: a */
    private final HttpURLConnection f8138a;

    hb(HttpURLConnection httpURLConnection) {
        super(zzas.m26306b(httpURLConnection));
        this.f8138a = httpURLConnection;
    }

    public final void close() {
        super.close();
        this.f8138a.disconnect();
    }
}
