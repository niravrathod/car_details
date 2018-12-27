package io.fabric.sdk.android.services.network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URI;
import java.net.URL;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

public class HttpRequest {
    /* renamed from: b */
    private static final String[] f11968b = new String[0];
    /* renamed from: c */
    private static C2829b f11969c = C2829b.f11966a;
    /* renamed from: a */
    public final URL f11970a;
    /* renamed from: d */
    private HttpURLConnection f11971d = null;
    /* renamed from: e */
    private final String f11972e;
    /* renamed from: f */
    private C2831d f11973f;
    /* renamed from: g */
    private boolean f11974g;
    /* renamed from: h */
    private boolean f11975h = true;
    /* renamed from: i */
    private boolean f11976i = false;
    /* renamed from: j */
    private int f11977j = 8192;
    /* renamed from: k */
    private String f11978k;
    /* renamed from: l */
    private int f11979l;

    public static class HttpRequestException extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        public /* synthetic */ Throwable getCause() {
            return m13772a();
        }

        protected HttpRequestException(IOException iOException) {
            super(iOException);
        }

        /* renamed from: a */
        public IOException m13772a() {
            return (IOException) super.getCause();
        }
    }

    /* renamed from: io.fabric.sdk.android.services.network.HttpRequest$b */
    public interface C2829b {
        /* renamed from: a */
        public static final C2829b f11966a = new C43161();

        /* renamed from: io.fabric.sdk.android.services.network.HttpRequest$b$1 */
        static class C43161 implements C2829b {
            C43161() {
            }

            /* renamed from: a */
            public HttpURLConnection mo3589a(URL url) {
                return (HttpURLConnection) url.openConnection();
            }

            /* renamed from: a */
            public HttpURLConnection mo3590a(URL url, Proxy proxy) {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        }

        /* renamed from: a */
        HttpURLConnection mo3589a(URL url);

        /* renamed from: a */
        HttpURLConnection mo3590a(URL url, Proxy proxy);
    }

    /* renamed from: io.fabric.sdk.android.services.network.HttpRequest$c */
    protected static abstract class C2830c<V> implements Callable<V> {
        /* renamed from: b */
        protected abstract V mo4537b();

        /* renamed from: c */
        protected abstract void mo3588c();

        protected C2830c() {
        }

        public V call() {
            Throwable th;
            Object obj = 1;
            try {
                V b = mo4537b();
                try {
                    mo3588c();
                    return b;
                } catch (IOException e) {
                    throw new HttpRequestException(e);
                }
            } catch (HttpRequestException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new HttpRequestException(e3);
            } catch (Throwable th2) {
                th = th2;
                mo3588c();
                throw th;
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.services.network.HttpRequest$d */
    public static class C2831d extends BufferedOutputStream {
        /* renamed from: a */
        private final CharsetEncoder f11967a;

        public C2831d(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f11967a = Charset.forName(HttpRequest.m13790f(str)).newEncoder();
        }

        /* renamed from: a */
        public C2831d m13777a(String str) {
            str = this.f11967a.encode(CharBuffer.wrap(str));
            super.write(str.array(), 0, str.limit());
            return this;
        }
    }

    /* renamed from: io.fabric.sdk.android.services.network.HttpRequest$a */
    protected static abstract class C4315a<V> extends C2830c<V> {
        /* renamed from: a */
        private final Closeable f18048a;
        /* renamed from: b */
        private final boolean f18049b;

        protected C4315a(Closeable closeable, boolean z) {
            this.f18048a = closeable;
            this.f18049b = z;
        }

        /* renamed from: c */
        protected void mo3588c() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f18048a;
            r0 = r0 instanceof java.io.Flushable;
            if (r0 == 0) goto L_0x000d;
        L_0x0006:
            r0 = r1.f18048a;
            r0 = (java.io.Flushable) r0;
            r0.flush();
        L_0x000d:
            r0 = r1.f18049b;
            if (r0 == 0) goto L_0x0017;
        L_0x0011:
            r0 = r1.f18048a;	 Catch:{ IOException -> 0x001c }
            r0.close();	 Catch:{ IOException -> 0x001c }
            goto L_0x001c;
        L_0x0017:
            r0 = r1.f18048a;
            r0.close();
        L_0x001c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.HttpRequest.a.c():void");
        }
    }

    /* renamed from: f */
    private static String m13790f(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }

    /* renamed from: a */
    private static StringBuilder m13782a(String str, StringBuilder stringBuilder) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            stringBuilder.append('/');
        }
        return stringBuilder;
    }

    /* renamed from: b */
    private static StringBuilder m13785b(String str, StringBuilder stringBuilder) {
        int indexOf = str.indexOf(63);
        int length = stringBuilder.length() - 1;
        if (indexOf == -1) {
            stringBuilder.append('?');
        } else if (indexOf < length && str.charAt(length) != 38) {
            stringBuilder.append('&');
        }
        return stringBuilder;
    }

    /* renamed from: a */
    public static String m13780a(CharSequence charSequence) {
        try {
            URL url = new URL(charSequence.toString());
            charSequence = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(charSequence);
                stringBuilder.append(':');
                stringBuilder.append(Integer.toString(port));
                charSequence = stringBuilder.toString();
            }
            try {
                charSequence = new URI(url.getProtocol(), charSequence, url.getPath(), url.getQuery(), null).toASCIIString();
                int indexOf = charSequence.indexOf(63);
                if (indexOf <= 0) {
                    return charSequence;
                }
                indexOf++;
                if (indexOf >= charSequence.length()) {
                    return charSequence;
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(charSequence.substring(0, indexOf));
                stringBuilder2.append(charSequence.substring(indexOf).replace("+", "%2B"));
                return stringBuilder2.toString();
            } catch (CharSequence charSequence2) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(charSequence2);
                throw new HttpRequestException(iOException);
            }
        } catch (CharSequence charSequence22) {
            throw new HttpRequestException(charSequence22);
        }
    }

    /* renamed from: a */
    public static String m13781a(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map != null) {
            if (!map.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder(charSequence2);
                m13782a(charSequence2, stringBuilder);
                m13785b(charSequence2, stringBuilder);
                charSequence = map.entrySet().iterator();
                Entry entry = (Entry) charSequence.next();
                stringBuilder.append(entry.getKey().toString());
                stringBuilder.append('=');
                map = entry.getValue();
                if (map != null) {
                    stringBuilder.append(map);
                }
                while (charSequence.hasNext() != null) {
                    stringBuilder.append('&');
                    entry = (Entry) charSequence.next();
                    stringBuilder.append(entry.getKey().toString());
                    stringBuilder.append('=');
                    map = entry.getValue();
                    if (map != null) {
                        stringBuilder.append(map);
                    }
                }
                return stringBuilder.toString();
            }
        }
        return charSequence2;
    }

    /* renamed from: b */
    public static HttpRequest m13783b(CharSequence charSequence) {
        return new HttpRequest(charSequence, "GET");
    }

    /* renamed from: a */
    public static HttpRequest m13779a(CharSequence charSequence, Map<?, ?> map, boolean z) {
        charSequence = m13781a(charSequence, (Map) map);
        if (z) {
            charSequence = m13780a(charSequence);
        }
        return m13783b(charSequence);
    }

    /* renamed from: c */
    public static HttpRequest m13786c(CharSequence charSequence) {
        return new HttpRequest(charSequence, "POST");
    }

    /* renamed from: b */
    public static HttpRequest m13784b(CharSequence charSequence, Map<?, ?> map, boolean z) {
        charSequence = m13781a(charSequence, (Map) map);
        if (z) {
            charSequence = m13780a(charSequence);
        }
        return m13786c(charSequence);
    }

    /* renamed from: d */
    public static HttpRequest m13787d(CharSequence charSequence) {
        return new HttpRequest(charSequence, "PUT");
    }

    /* renamed from: e */
    public static HttpRequest m13788e(CharSequence charSequence) {
        return new HttpRequest(charSequence, "DELETE");
    }

    public HttpRequest(CharSequence charSequence, String str) {
        try {
            this.f11970a = new URL(charSequence.toString());
            this.f11972e = str;
        } catch (CharSequence charSequence2) {
            throw new HttpRequestException(charSequence2);
        }
    }

    /* renamed from: q */
    private Proxy m13791q() {
        return new Proxy(Type.HTTP, new InetSocketAddress(this.f11978k, this.f11979l));
    }

    /* renamed from: r */
    private HttpURLConnection m13792r() {
        try {
            HttpURLConnection a;
            if (this.f11978k != null) {
                a = f11969c.mo3590a(this.f11970a, m13791q());
            } else {
                a = f11969c.mo3589a(this.f11970a);
            }
            a.setRequestMethod(this.f11972e);
            return a;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m13831p());
        stringBuilder.append(' ');
        stringBuilder.append(m13830o());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public HttpURLConnection m13806a() {
        if (this.f11971d == null) {
            this.f11971d = m13792r();
        }
        return this.f11971d;
    }

    /* renamed from: b */
    public int m13807b() {
        try {
            m13826k();
            return m13806a().getResponseCode();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: c */
    public boolean m13813c() {
        return 200 == m13807b();
    }

    /* renamed from: d */
    protected ByteArrayOutputStream m13816d() {
        int j = m13825j();
        if (j > 0) {
            return new ByteArrayOutputStream(j);
        }
        return new ByteArrayOutputStream();
    }

    /* renamed from: a */
    public String m13805a(String str) {
        OutputStream d = m13816d();
        try {
            m13795a(m13821f(), d);
            return d.toString(m13790f(str));
        } catch (String str2) {
            throw new HttpRequestException(str2);
        }
    }

    /* renamed from: e */
    public String m13818e() {
        return m13805a(m13823h());
    }

    /* renamed from: f */
    public BufferedInputStream m13821f() {
        return new BufferedInputStream(m13822g(), this.f11977j);
    }

    /* renamed from: g */
    public InputStream m13822g() {
        InputStream inputStream;
        if (m13807b() < 400) {
            try {
                inputStream = m13806a().getInputStream();
            } catch (IOException e) {
                throw new HttpRequestException(e);
            }
        }
        inputStream = m13806a().getErrorStream();
        if (inputStream == null) {
            try {
                inputStream = m13806a().getInputStream();
            } catch (IOException e2) {
                throw new HttpRequestException(e2);
            }
        }
        if (this.f11976i) {
            if ("gzip".equals(m13824i())) {
                try {
                    return new GZIPInputStream(inputStream);
                } catch (IOException e22) {
                    throw new HttpRequestException(e22);
                }
            }
        }
        return inputStream;
    }

    /* renamed from: a */
    public HttpRequest m13794a(int i) {
        m13806a().setConnectTimeout(i);
        return this;
    }

    /* renamed from: a */
    public HttpRequest m13797a(String str, String str2) {
        m13806a().setRequestProperty(str, str2);
        return this;
    }

    /* renamed from: a */
    public HttpRequest m13803a(Entry<String, String> entry) {
        return m13797a((String) entry.getKey(), (String) entry.getValue());
    }

    /* renamed from: b */
    public String m13809b(String str) {
        m13827l();
        return m13806a().getHeaderField(str);
    }

    /* renamed from: c */
    public int m13811c(String str) {
        return m13793a(str, -1);
    }

    /* renamed from: a */
    public int m13793a(String str, int i) {
        m13827l();
        return m13806a().getHeaderFieldInt(str, i);
    }

    /* renamed from: b */
    public String m13810b(String str, String str2) {
        return m13812c(m13809b(str), str2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    protected java.lang.String m13812c(java.lang.String r9, java.lang.String r10) {
        /*
        r8 = this;
        r0 = 0;
        if (r9 == 0) goto L_0x0071;
    L_0x0003:
        r1 = r9.length();
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0071;
    L_0x000a:
        r1 = r9.length();
        r2 = 59;
        r3 = r9.indexOf(r2);
        r4 = 1;
        r3 = r3 + r4;
        if (r3 == 0) goto L_0x0070;
    L_0x0018:
        if (r3 != r1) goto L_0x001b;
    L_0x001a:
        goto L_0x0070;
    L_0x001b:
        r5 = r9.indexOf(r2, r3);
        r6 = -1;
        if (r5 != r6) goto L_0x0023;
    L_0x0022:
        r5 = r1;
    L_0x0023:
        if (r3 >= r5) goto L_0x006f;
    L_0x0025:
        r7 = 61;
        r7 = r9.indexOf(r7, r3);
        if (r7 == r6) goto L_0x0066;
    L_0x002d:
        if (r7 >= r5) goto L_0x0066;
    L_0x002f:
        r3 = r9.substring(r3, r7);
        r3 = r3.trim();
        r3 = r10.equals(r3);
        if (r3 == 0) goto L_0x0066;
    L_0x003d:
        r7 = r7 + 1;
        r3 = r9.substring(r7, r5);
        r3 = r3.trim();
        r7 = r3.length();
        if (r7 == 0) goto L_0x0066;
    L_0x004d:
        r9 = 2;
        if (r7 <= r9) goto L_0x0065;
    L_0x0050:
        r9 = 0;
        r9 = r3.charAt(r9);
        r10 = 34;
        if (r10 != r9) goto L_0x0065;
    L_0x0059:
        r7 = r7 - r4;
        r9 = r3.charAt(r7);
        if (r10 != r9) goto L_0x0065;
    L_0x0060:
        r9 = r3.substring(r4, r7);
        return r9;
    L_0x0065:
        return r3;
    L_0x0066:
        r3 = r5 + 1;
        r5 = r9.indexOf(r2, r3);
        if (r5 != r6) goto L_0x0023;
    L_0x006e:
        goto L_0x0022;
    L_0x006f:
        return r0;
    L_0x0070:
        return r0;
    L_0x0071:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.HttpRequest.c(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: h */
    public String m13823h() {
        return m13810b("Content-Type", "charset");
    }

    /* renamed from: a */
    public HttpRequest m13804a(boolean z) {
        m13806a().setUseCaches(z);
        return this;
    }

    /* renamed from: i */
    public String m13824i() {
        return m13809b("Content-Encoding");
    }

    /* renamed from: d */
    public HttpRequest m13814d(String str) {
        return m13815d(str, null);
    }

    /* renamed from: d */
    public HttpRequest m13815d(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return m13797a("Content-Type", str);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("; charset=");
        stringBuilder.append(str2);
        return m13797a("Content-Type", stringBuilder.toString());
    }

    /* renamed from: j */
    public int m13825j() {
        return m13811c("Content-Length");
    }

    /* renamed from: a */
    protected HttpRequest m13795a(InputStream inputStream, OutputStream outputStream) {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        return (HttpRequest) new C4315a<HttpRequest>(this, inputStream, this.f11975h) {
            /* renamed from: c */
            final /* synthetic */ HttpRequest f20790c;

            /* renamed from: b */
            public /* synthetic */ Object mo4537b() {
                return m27457a();
            }

            /* renamed from: a */
            public HttpRequest m27457a() {
                byte[] bArr = new byte[this.f20790c.f11977j];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return this.f20790c;
                    }
                    outputStream2.write(bArr, 0, read);
                }
            }
        }.call();
    }

    /* renamed from: k */
    protected io.fabric.sdk.android.services.network.HttpRequest m13826k() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.f11973f;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return r2;
    L_0x0005:
        r0 = r2.f11974g;
        if (r0 == 0) goto L_0x0010;
    L_0x0009:
        r0 = r2.f11973f;
        r1 = "\r\n--00content0boundary00--\r\n";
        r0.m13777a(r1);
    L_0x0010:
        r0 = r2.f11975h;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = r2.f11973f;	 Catch:{ IOException -> 0x001f }
        r0.close();	 Catch:{ IOException -> 0x001f }
        goto L_0x001f;
    L_0x001a:
        r0 = r2.f11973f;
        r0.close();
    L_0x001f:
        r0 = 0;
        r2.f11973f = r0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.HttpRequest.k():io.fabric.sdk.android.services.network.HttpRequest");
    }

    /* renamed from: l */
    protected HttpRequest m13827l() {
        try {
            return m13826k();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: m */
    protected HttpRequest m13828m() {
        if (this.f11973f != null) {
            return this;
        }
        m13806a().setDoOutput(true);
        this.f11973f = new C2831d(m13806a().getOutputStream(), m13812c(m13806a().getRequestProperty("Content-Type"), "charset"), this.f11977j);
        return this;
    }

    /* renamed from: n */
    protected HttpRequest m13829n() {
        if (this.f11974g) {
            this.f11973f.m13777a("\r\n--00content0boundary00\r\n");
        } else {
            this.f11974g = true;
            m13814d("multipart/form-data; boundary=00content0boundary00").m13828m();
            this.f11973f.m13777a("--00content0boundary00\r\n");
        }
        return this;
    }

    /* renamed from: a */
    protected HttpRequest m13799a(String str, String str2, String str3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("form-data; name=\"");
        stringBuilder.append(str);
        if (str2 != null) {
            stringBuilder.append("\"; filename=\"");
            stringBuilder.append(str2);
        }
        stringBuilder.append('\"');
        m13820f("Content-Disposition", stringBuilder.toString());
        if (str3 != null) {
            m13820f("Content-Type", str3);
        }
        return m13819f((CharSequence) "\r\n");
    }

    /* renamed from: e */
    public HttpRequest m13817e(String str, String str2) {
        return m13808b(str, null, str2);
    }

    /* renamed from: b */
    public HttpRequest m13808b(String str, String str2, String str3) {
        return m13802a(str, str2, null, str3);
    }

    /* renamed from: a */
    public HttpRequest m13802a(String str, String str2, String str3, String str4) {
        try {
            m13829n();
            m13799a(str, str2, str3);
            this.f11973f.m13777a(str4);
            return this;
        } catch (String str5) {
            throw new HttpRequestException(str5);
        }
    }

    /* renamed from: a */
    public HttpRequest m13796a(String str, Number number) {
        return m13798a(str, null, number);
    }

    /* renamed from: a */
    public HttpRequest m13798a(String str, String str2, Number number) {
        return m13808b(str, str2, number != null ? number.toString() : null);
    }

    /* renamed from: a */
    public io.fabric.sdk.android.services.network.HttpRequest m13800a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = 0;
        r1 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x001b }
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x001b }
        r2.<init>(r7);	 Catch:{ IOException -> 0x001b }
        r1.<init>(r2);	 Catch:{ IOException -> 0x001b }
        r4 = r3.m13801a(r4, r5, r6, r1);	 Catch:{ IOException -> 0x0016, all -> 0x0013 }
        r1.close();	 Catch:{ IOException -> 0x0012 }
    L_0x0012:
        return r4;
    L_0x0013:
        r4 = move-exception;
        r0 = r1;
        goto L_0x0022;
    L_0x0016:
        r4 = move-exception;
        r0 = r1;
        goto L_0x001c;
    L_0x0019:
        r4 = move-exception;
        goto L_0x0022;
    L_0x001b:
        r4 = move-exception;
    L_0x001c:
        r5 = new io.fabric.sdk.android.services.network.HttpRequest$HttpRequestException;	 Catch:{ all -> 0x0019 }
        r5.<init>(r4);	 Catch:{ all -> 0x0019 }
        throw r5;	 Catch:{ all -> 0x0019 }
    L_0x0022:
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r0.close();	 Catch:{ IOException -> 0x0027 }
    L_0x0027:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.HttpRequest.a(java.lang.String, java.lang.String, java.lang.String, java.io.File):io.fabric.sdk.android.services.network.HttpRequest");
    }

    /* renamed from: a */
    public HttpRequest m13801a(String str, String str2, String str3, InputStream inputStream) {
        try {
            m13829n();
            m13799a(str, str2, str3);
            m13795a(inputStream, this.f11973f);
            return this;
        } catch (String str4) {
            throw new HttpRequestException(str4);
        }
    }

    /* renamed from: f */
    public HttpRequest m13820f(String str, String str2) {
        return m13819f((CharSequence) str).m13819f((CharSequence) ": ").m13819f((CharSequence) str2).m13819f((CharSequence) "\r\n");
    }

    /* renamed from: f */
    public HttpRequest m13819f(CharSequence charSequence) {
        try {
            m13828m();
            this.f11973f.m13777a(charSequence.toString());
            return this;
        } catch (CharSequence charSequence2) {
            throw new HttpRequestException(charSequence2);
        }
    }

    /* renamed from: o */
    public URL m13830o() {
        return m13806a().getURL();
    }

    /* renamed from: p */
    public String m13831p() {
        return m13806a().getRequestMethod();
    }
}
