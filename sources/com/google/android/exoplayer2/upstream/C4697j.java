package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Log;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2177m;
import com.google.android.exoplayer2.upstream.HttpDataSource.C2359c;
import com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.upstream.j */
public class C4697j implements HttpDataSource {
    /* renamed from: b */
    private static final Pattern f19479b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    /* renamed from: c */
    private static final AtomicReference<byte[]> f19480c = new AtomicReference();
    /* renamed from: d */
    private final boolean f19481d;
    /* renamed from: e */
    private final int f19482e;
    /* renamed from: f */
    private final int f19483f;
    /* renamed from: g */
    private final String f19484g;
    /* renamed from: h */
    private final C2177m<String> f19485h;
    /* renamed from: i */
    private final C2359c f19486i;
    /* renamed from: j */
    private final C2359c f19487j = new C2359c();
    /* renamed from: k */
    private final C2371l<? super C4697j> f19488k;
    /* renamed from: l */
    private C2369e f19489l;
    /* renamed from: m */
    private HttpURLConnection f19490m;
    /* renamed from: n */
    private InputStream f19491n;
    /* renamed from: o */
    private boolean f19492o;
    /* renamed from: p */
    private long f19493p;
    /* renamed from: q */
    private long f19494q;
    /* renamed from: r */
    private long f19495r;
    /* renamed from: s */
    private long f19496s;

    public C4697j(String str, C2177m<String> c2177m, C2371l<? super C4697j> c2371l, int i, int i2, boolean z, C2359c c2359c) {
        this.f19484g = C2163a.m7915a(str);
        this.f19485h = c2177m;
        this.f19488k = c2371l;
        this.f19482e = i;
        this.f19483f = i2;
        this.f19481d = z;
        this.f19486i = c2359c;
    }

    /* renamed from: a */
    public Uri mo1686a() {
        return this.f19490m == null ? null : Uri.parse(this.f19490m.getURL().toString());
    }

    /* renamed from: a */
    public long mo1685a(C2369e c2369e) {
        StringBuilder stringBuilder;
        this.f19489l = c2369e;
        long j = 0;
        this.f19496s = 0;
        this.f19495r = 0;
        try {
            this.f19490m = m25919b(c2369e);
            try {
                int responseCode = this.f19490m.getResponseCode();
                if (responseCode >= 200) {
                    if (responseCode <= 299) {
                        String contentType = this.f19490m.getContentType();
                        if (this.f19485h != null) {
                            if (!this.f19485h.mo1688a(contentType)) {
                                m25921e();
                                throw new InvalidContentTypeException(contentType, c2369e);
                            }
                        }
                        if (responseCode == 200 && c2369e.f7516d != 0) {
                            j = c2369e.f7516d;
                        }
                        this.f19493p = j;
                        if (c2369e.m8703a(1)) {
                            this.f19494q = c2369e.f7517e;
                        } else {
                            long j2 = -1;
                            if (c2369e.f7517e != -1) {
                                this.f19494q = c2369e.f7517e;
                            } else {
                                j = C4697j.m25914a(this.f19490m);
                                if (j != -1) {
                                    j2 = j - this.f19493p;
                                }
                                this.f19494q = j2;
                            }
                        }
                        try {
                            this.f19491n = this.f19490m.getInputStream();
                            this.f19492o = true;
                            if (this.f19488k != null) {
                                this.f19488k.mo1697a((Object) this, c2369e);
                            }
                            return this.f19494q;
                        } catch (IOException e) {
                            m25921e();
                            throw new HttpDataSourceException(e, c2369e, 1);
                        }
                    }
                }
                Map headerFields = this.f19490m.getHeaderFields();
                m25921e();
                InvalidResponseCodeException invalidResponseCodeException = new InvalidResponseCodeException(responseCode, headerFields, c2369e);
                if (responseCode == 416) {
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                }
                throw invalidResponseCodeException;
            } catch (IOException e2) {
                m25921e();
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to connect to ");
                stringBuilder.append(c2369e.f7513a.toString());
                throw new HttpDataSourceException(stringBuilder.toString(), e2, c2369e, 1);
            }
        } catch (IOException e22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to connect to ");
            stringBuilder.append(c2369e.f7513a.toString());
            throw new HttpDataSourceException(stringBuilder.toString(), e22, c2369e, 1);
        }
    }

    /* renamed from: a */
    public int mo1684a(byte[] bArr, int i, int i2) {
        try {
            m25920d();
            return m25918b(bArr, i, i2);
        } catch (IOException e) {
            throw new HttpDataSourceException(e, this.f19489l, 2);
        }
    }

    /* renamed from: b */
    public void mo1687b() {
        try {
            if (this.f19491n != null) {
                C4697j.m25917a(this.f19490m, m25926c());
                this.f19491n.close();
            }
            this.f19491n = null;
            m25921e();
            if (this.f19492o) {
                this.f19492o = false;
                if (this.f19488k != null) {
                    this.f19488k.mo1695a(this);
                }
            }
        } catch (IOException e) {
            throw new HttpDataSourceException(e, this.f19489l, 3);
        } catch (Throwable th) {
            this.f19491n = null;
            m25921e();
            if (this.f19492o) {
                this.f19492o = false;
                if (this.f19488k != null) {
                    this.f19488k.mo1695a(this);
                }
            }
        }
    }

    /* renamed from: c */
    protected final long m25926c() {
        return this.f19494q == -1 ? this.f19494q : this.f19494q - this.f19496s;
    }

    /* renamed from: b */
    private HttpURLConnection m25919b(C2369e c2369e) {
        C2369e c2369e2 = c2369e;
        URL url = new URL(c2369e2.f7513a.toString());
        byte[] bArr = c2369e2.f7514b;
        long j = c2369e2.f7516d;
        long j2 = c2369e2.f7517e;
        boolean a = c2369e2.m8703a(1);
        if (!this.f19481d) {
            return m25915a(url, bArr, j, j2, a, true);
        }
        HttpURLConnection a2;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            int i3;
            if (i <= 20) {
                long j3 = j;
                i3 = i2;
                a2 = m25915a(url, bArr, j, j2, a, false);
                int responseCode = a2.getResponseCode();
                if (!(responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303)) {
                    if (bArr == null) {
                        if (responseCode != 307) {
                            if (responseCode != 308) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        break;
                    }
                }
                bArr = null;
                String headerField = a2.getHeaderField("Location");
                a2.disconnect();
                url = C4697j.m25916a(url, headerField);
                C4697j c4697j = this;
                i = i3;
                j = j3;
            } else {
                i3 = i2;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Too many redirects: ");
                stringBuilder.append(i3);
                throw new NoRouteToHostException(stringBuilder.toString());
            }
        }
        return a2;
    }

    /* renamed from: a */
    private HttpURLConnection m25915a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f19482e);
        httpURLConnection.setReadTimeout(this.f19483f);
        if (this.f19486i != null) {
            for (Entry entry : this.f19486i.m8667a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Entry entry2 : this.f19487j.m8667a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bytes=");
            stringBuilder.append(j);
            stringBuilder.append("-");
            String stringBuilder2 = stringBuilder.toString();
            if (j2 != -1) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append((j + j2) - 1);
                stringBuilder2 = stringBuilder3.toString();
            }
            httpURLConnection.setRequestProperty("Range", stringBuilder2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f19484g);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null ? 1 : null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == null) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                j = httpURLConnection.getOutputStream();
                j.write(bArr);
                j.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: a */
    private static URL m25916a(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            url = url2.getProtocol();
            if ("https".equals(url) == null) {
                if ("http".equals(url) == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported protocol redirect: ");
                    stringBuilder.append(url);
                    throw new ProtocolException(stringBuilder.toString());
                }
            }
            return url2;
        }
        throw new ProtocolException("Null location redirect");
    }

    /* renamed from: a */
    private static long m25914a(java.net.HttpURLConnection r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "Content-Length";
        r0 = r8.getHeaderField(r0);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x002c;
    L_0x000c:
        r1 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0011 }
        goto L_0x002e;
    L_0x0011:
        r1 = "DefaultHttpDataSource";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Unexpected Content-Length [";
        r2.append(r3);
        r2.append(r0);
        r3 = "]";
        r2.append(r3);
        r2 = r2.toString();
        android.util.Log.e(r1, r2);
    L_0x002c:
        r1 = -1;
    L_0x002e:
        r3 = "Content-Range";
        r8 = r8.getHeaderField(r3);
        r3 = android.text.TextUtils.isEmpty(r8);
        if (r3 != 0) goto L_0x00ad;
    L_0x003a:
        r3 = f19479b;
        r3 = r3.matcher(r8);
        r4 = r3.find();
        if (r4 == 0) goto L_0x00ad;
    L_0x0046:
        r4 = 2;
        r4 = r3.group(r4);	 Catch:{ NumberFormatException -> 0x0092 }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x0092 }
        r6 = 1;	 Catch:{ NumberFormatException -> 0x0092 }
        r3 = r3.group(r6);	 Catch:{ NumberFormatException -> 0x0092 }
        r6 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0092 }
        r3 = 0;	 Catch:{ NumberFormatException -> 0x0092 }
        r4 = r4 - r6;	 Catch:{ NumberFormatException -> 0x0092 }
        r6 = 1;	 Catch:{ NumberFormatException -> 0x0092 }
        r4 = r4 + r6;	 Catch:{ NumberFormatException -> 0x0092 }
        r6 = 0;	 Catch:{ NumberFormatException -> 0x0092 }
        r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0092 }
        if (r3 >= 0) goto L_0x0065;	 Catch:{ NumberFormatException -> 0x0092 }
    L_0x0063:
        r1 = r4;	 Catch:{ NumberFormatException -> 0x0092 }
        goto L_0x00ad;	 Catch:{ NumberFormatException -> 0x0092 }
    L_0x0065:
        r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0092 }
        if (r3 == 0) goto L_0x00ad;	 Catch:{ NumberFormatException -> 0x0092 }
    L_0x0069:
        r3 = "DefaultHttpDataSource";	 Catch:{ NumberFormatException -> 0x0092 }
        r6 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0092 }
        r6.<init>();	 Catch:{ NumberFormatException -> 0x0092 }
        r7 = "Inconsistent headers [";	 Catch:{ NumberFormatException -> 0x0092 }
        r6.append(r7);	 Catch:{ NumberFormatException -> 0x0092 }
        r6.append(r0);	 Catch:{ NumberFormatException -> 0x0092 }
        r0 = "] [";	 Catch:{ NumberFormatException -> 0x0092 }
        r6.append(r0);	 Catch:{ NumberFormatException -> 0x0092 }
        r6.append(r8);	 Catch:{ NumberFormatException -> 0x0092 }
        r0 = "]";	 Catch:{ NumberFormatException -> 0x0092 }
        r6.append(r0);	 Catch:{ NumberFormatException -> 0x0092 }
        r0 = r6.toString();	 Catch:{ NumberFormatException -> 0x0092 }
        android.util.Log.w(r3, r0);	 Catch:{ NumberFormatException -> 0x0092 }
        r3 = java.lang.Math.max(r1, r4);	 Catch:{ NumberFormatException -> 0x0092 }
        r1 = r3;
        goto L_0x00ad;
    L_0x0092:
        r0 = "DefaultHttpDataSource";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Unexpected Content-Range [";
        r3.append(r4);
        r3.append(r8);
        r8 = "]";
        r3.append(r8);
        r8 = r3.toString();
        android.util.Log.e(r0, r8);
    L_0x00ad:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.j.a(java.net.HttpURLConnection):long");
    }

    /* renamed from: d */
    private void m25920d() {
        if (this.f19495r != this.f19493p) {
            Object obj = (byte[]) f19480c.getAndSet(null);
            if (obj == null) {
                obj = new byte[4096];
            }
            while (this.f19495r != this.f19493p) {
                int read = this.f19491n.read(obj, 0, (int) Math.min(this.f19493p - this.f19495r, (long) obj.length));
                if (Thread.interrupted()) {
                    throw new InterruptedIOException();
                } else if (read != -1) {
                    this.f19495r += (long) read;
                    if (this.f19488k != null) {
                        this.f19488k.mo1696a((Object) this, read);
                    }
                } else {
                    throw new EOFException();
                }
            }
            f19480c.set(obj);
        }
    }

    /* renamed from: b */
    private int m25918b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return null;
        }
        if (this.f19494q != -1) {
            long j = this.f19494q - this.f19496s;
            if (j == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j);
        }
        int read = this.f19491n.read(bArr, i, i2);
        if (read != -1) {
            this.f19496s += (long) read;
            if (this.f19488k != 0) {
                this.f19488k.mo1696a((Object) this, read);
            }
            return read;
        } else if (this.f19494q == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    private static void m25917a(java.net.HttpURLConnection r3, long r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = com.google.android.exoplayer2.p126c.C2186s.f6761a;
        r1 = 19;
        if (r0 == r1) goto L_0x000d;
    L_0x0006:
        r0 = com.google.android.exoplayer2.p126c.C2186s.f6761a;
        r1 = 20;
        if (r0 == r1) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r3 = r3.getInputStream();	 Catch:{ Exception -> 0x0058 }
        r0 = -1;	 Catch:{ Exception -> 0x0058 }
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ Exception -> 0x0058 }
        if (r2 != 0) goto L_0x001f;	 Catch:{ Exception -> 0x0058 }
    L_0x0017:
        r4 = r3.read();	 Catch:{ Exception -> 0x0058 }
        r5 = -1;	 Catch:{ Exception -> 0x0058 }
        if (r4 != r5) goto L_0x0026;	 Catch:{ Exception -> 0x0058 }
    L_0x001e:
        return;	 Catch:{ Exception -> 0x0058 }
    L_0x001f:
        r0 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;	 Catch:{ Exception -> 0x0058 }
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ Exception -> 0x0058 }
        if (r2 > 0) goto L_0x0026;	 Catch:{ Exception -> 0x0058 }
    L_0x0025:
        return;	 Catch:{ Exception -> 0x0058 }
    L_0x0026:
        r4 = r3.getClass();	 Catch:{ Exception -> 0x0058 }
        r4 = r4.getName();	 Catch:{ Exception -> 0x0058 }
        r5 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream";	 Catch:{ Exception -> 0x0058 }
        r5 = r4.equals(r5);	 Catch:{ Exception -> 0x0058 }
        if (r5 != 0) goto L_0x003e;	 Catch:{ Exception -> 0x0058 }
    L_0x0036:
        r5 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream";	 Catch:{ Exception -> 0x0058 }
        r4 = r4.equals(r5);	 Catch:{ Exception -> 0x0058 }
        if (r4 == 0) goto L_0x0058;	 Catch:{ Exception -> 0x0058 }
    L_0x003e:
        r4 = r3.getClass();	 Catch:{ Exception -> 0x0058 }
        r4 = r4.getSuperclass();	 Catch:{ Exception -> 0x0058 }
        r5 = "unexpectedEndOfInput";	 Catch:{ Exception -> 0x0058 }
        r0 = 0;	 Catch:{ Exception -> 0x0058 }
        r1 = new java.lang.Class[r0];	 Catch:{ Exception -> 0x0058 }
        r4 = r4.getDeclaredMethod(r5, r1);	 Catch:{ Exception -> 0x0058 }
        r5 = 1;	 Catch:{ Exception -> 0x0058 }
        r4.setAccessible(r5);	 Catch:{ Exception -> 0x0058 }
        r5 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x0058 }
        r4.invoke(r3, r5);	 Catch:{ Exception -> 0x0058 }
    L_0x0058:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.j.a(java.net.HttpURLConnection, long):void");
    }

    /* renamed from: e */
    private void m25921e() {
        if (this.f19490m != null) {
            try {
                this.f19490m.disconnect();
            } catch (Throwable e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f19490m = null;
        }
    }
}
