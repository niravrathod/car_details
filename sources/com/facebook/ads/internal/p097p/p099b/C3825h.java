package com.facebook.ads.internal.p097p.p099b;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.facebook.ads.internal.p.b.h */
public class C3825h implements C1892n {
    /* renamed from: a */
    public final String f15261a;
    /* renamed from: b */
    private HttpURLConnection f15262b;
    /* renamed from: c */
    private InputStream f15263c;
    /* renamed from: d */
    private volatile int f15264d;
    /* renamed from: e */
    private volatile String f15265e;

    public C3825h(C3825h c3825h) {
        this.f15264d = Integer.MIN_VALUE;
        this.f15261a = c3825h.f15261a;
        this.f15265e = c3825h.f15265e;
        this.f15264d = c3825h.f15264d;
    }

    public C3825h(String str) {
        this(str, C1891m.m7208a(str));
    }

    public C3825h(String str, String str2) {
        this.f15264d = Integer.MIN_VALUE;
        this.f15261a = (String) C1886j.m7191a(str);
        this.f15265e = str2;
    }

    /* renamed from: a */
    private int m19085a(HttpURLConnection httpURLConnection, int i, int i2) {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == 200 ? contentLength : i2 == 206 ? contentLength + i : this.f15264d;
    }

    /* renamed from: a */
    private HttpURLConnection m19086a(int i, int i2) {
        HttpURLConnection httpURLConnection;
        String str = this.f15261a;
        int i3 = 0;
        Object obj;
        do {
            String stringBuilder;
            String str2 = "ProxyCache";
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Open connection ");
            if (i > 0) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(" with offset ");
                stringBuilder3.append(i);
                stringBuilder = stringBuilder3.toString();
            } else {
                stringBuilder = "";
            }
            stringBuilder2.append(stringBuilder);
            stringBuilder2.append(" to ");
            stringBuilder2.append(str);
            Log.d(str2, stringBuilder2.toString());
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (i > 0) {
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append("bytes=");
                stringBuilder3.append(i);
                stringBuilder3.append("-");
                httpURLConnection.setRequestProperty("Range", stringBuilder3.toString());
            }
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (!(responseCode == 301 || responseCode == 302)) {
                if (responseCode != 303) {
                    obj = null;
                    if (obj != null) {
                        str = httpURLConnection.getHeaderField("Location");
                        i3++;
                        httpURLConnection.disconnect();
                    }
                    if (i3 <= 5) {
                        StringBuilder stringBuilder4 = new StringBuilder();
                        stringBuilder4.append("Too many redirects: ");
                        stringBuilder4.append(i3);
                        throw new C1890l(stringBuilder4.toString());
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                str = httpURLConnection.getHeaderField("Location");
                i3++;
                httpURLConnection.disconnect();
            }
            if (i3 <= 5) {
                StringBuilder stringBuilder42 = new StringBuilder();
                stringBuilder42.append("Too many redirects: ");
                stringBuilder42.append(i3);
                throw new C1890l(stringBuilder42.toString());
            }
        } while (obj != null);
        return httpURLConnection;
    }

    /* renamed from: d */
    private void m19087d() {
        Closeable inputStream;
        Throwable th;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Read content info from ");
        stringBuilder2.append(this.f15261a);
        Log.d("ProxyCache", stringBuilder2.toString());
        HttpURLConnection a;
        try {
            a = m19086a(0, 10000);
            try {
                this.f15264d = a.getContentLength();
                this.f15265e = a.getContentType();
                inputStream = a.getInputStream();
            } catch (Throwable e) {
                th = e;
                inputStream = null;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error fetching info from ");
                    stringBuilder.append(this.f15261a);
                    Log.e("ProxyCache", stringBuilder.toString(), th);
                    C1891m.m7210a(inputStream);
                    if (a == null) {
                        return;
                    }
                    a.disconnect();
                } catch (Throwable th2) {
                    th = th2;
                    C1891m.m7210a(inputStream);
                    if (a != null) {
                        a.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable e2) {
                th = e2;
                inputStream = null;
                C1891m.m7210a(inputStream);
                if (a != null) {
                    a.disconnect();
                }
                throw th;
            }
            try {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Content info for `");
                stringBuilder3.append(this.f15261a);
                stringBuilder3.append("`: mime: ");
                stringBuilder3.append(this.f15265e);
                stringBuilder3.append(", content-length: ");
                stringBuilder3.append(this.f15264d);
                Log.i("ProxyCache", stringBuilder3.toString());
                C1891m.m7210a(inputStream);
                if (a != null) {
                    a.disconnect();
                }
            } catch (IOException e3) {
                th = e3;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error fetching info from ");
                stringBuilder.append(this.f15261a);
                Log.e("ProxyCache", stringBuilder.toString(), th);
                C1891m.m7210a(inputStream);
                if (a == null) {
                    return;
                }
                a.disconnect();
            }
        } catch (Throwable e4) {
            inputStream = null;
            th = e4;
            a = inputStream;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error fetching info from ");
            stringBuilder.append(this.f15261a);
            Log.e("ProxyCache", stringBuilder.toString(), th);
            C1891m.m7210a(inputStream);
            if (a == null) {
                return;
            }
            a.disconnect();
        } catch (Throwable e42) {
            inputStream = null;
            th = e42;
            a = inputStream;
            C1891m.m7210a(inputStream);
            if (a != null) {
                a.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized int mo1402a() {
        if (this.f15264d == Integer.MIN_VALUE) {
            m19087d();
        }
        return this.f15264d;
    }

    /* renamed from: a */
    public int mo1403a(byte[] bArr) {
        StringBuilder stringBuilder;
        if (this.f15263c != null) {
            try {
                return this.f15263c.read(bArr, 0, bArr.length);
            } catch (Throwable e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Reading source ");
                stringBuilder.append(this.f15261a);
                stringBuilder.append(" is interrupted");
                throw new C3826i(stringBuilder.toString(), e);
            } catch (Throwable e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error reading data from ");
                stringBuilder.append(this.f15261a);
                throw new C1890l(stringBuilder.toString(), e2);
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Error reading data from ");
        stringBuilder2.append(this.f15261a);
        stringBuilder2.append(": connection is absent!");
        throw new C1890l(stringBuilder2.toString());
    }

    /* renamed from: a */
    public void mo1404a(int i) {
        try {
            this.f15262b = m19086a(i, -1);
            this.f15265e = this.f15262b.getContentType();
            this.f15263c = new BufferedInputStream(this.f15262b.getInputStream(), 8192);
            this.f15264d = m19085a(this.f15262b, i, this.f15262b.getResponseCode());
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error opening connection for ");
            stringBuilder.append(this.f15261a);
            stringBuilder.append(" with offset ");
            stringBuilder.append(i);
            throw new C1890l(stringBuilder.toString(), e);
        }
    }

    /* renamed from: b */
    public void mo1405b() {
        if (this.f15262b != null) {
            try {
                this.f15262b.disconnect();
            } catch (Throwable e) {
                throw new C1890l("Error disconnecting HttpUrlConnection", e);
            }
        }
    }

    /* renamed from: c */
    public synchronized String m19092c() {
        if (TextUtils.isEmpty(this.f15265e)) {
            m19087d();
        }
        return this.f15265e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HttpUrlSource{url='");
        stringBuilder.append(this.f15261a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
