package com.facebook.ads.internal.p097p.p098a;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.p.a.n */
public class C1863n {
    /* renamed from: a */
    private int f5703a;
    /* renamed from: b */
    private String f5704b;
    /* renamed from: c */
    private Map<String, List<String>> f5705c;
    /* renamed from: d */
    private byte[] f5706d;

    public C1863n(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.f5703a = httpURLConnection.getResponseCode();
            this.f5704b = httpURLConnection.getURL().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f5705c = httpURLConnection.getHeaderFields();
        this.f5706d = bArr;
    }

    /* renamed from: a */
    public int m7114a() {
        return this.f5703a;
    }

    /* renamed from: b */
    public String m7115b() {
        return this.f5704b;
    }

    /* renamed from: c */
    public Map<String, List<String>> m7116c() {
        return this.f5705c;
    }

    /* renamed from: d */
    public byte[] m7117d() {
        return this.f5706d;
    }

    /* renamed from: e */
    public String m7118e() {
        return this.f5706d != null ? new String(this.f5706d) : null;
    }
}
