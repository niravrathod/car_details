package okhttp3.internal.connection;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okhttp3.C2895a;
import okhttp3.C2903e;
import okhttp3.C2907g;
import okhttp3.C2910i;
import okhttp3.C2967j;
import okhttp3.C2977p;
import okhttp3.C2979r;
import okhttp3.C2983t.C2982a;
import okhttp3.C2988w;
import okhttp3.C2990y;
import okhttp3.C2990y.C2989a;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.aa;
import okhttp3.ac;
import okhttp3.internal.C2933c;
import okhttp3.internal.C2941d;
import okhttp3.internal.http2.C2957e;
import okhttp3.internal.http2.C2957e.C2955a;
import okhttp3.internal.http2.C2957e.C2956b;
import okhttp3.internal.http2.C2960g;
import okhttp3.internal.http2.C4363d;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.p156b.C2921c;
import okhttp3.internal.p156b.C2924e;
import okhttp3.internal.p157c.C4351a;
import okhttp3.internal.p159e.C2945f;
import okhttp3.internal.p161g.C2948d;
import okio.C2995s;
import okio.C4393d;
import okio.C4394e;
import okio.C4905m;

/* renamed from: okhttp3.internal.connection.c */
public final class C4353c extends C2956b implements C2910i {
    /* renamed from: a */
    public boolean f18135a;
    /* renamed from: b */
    public int f18136b;
    /* renamed from: c */
    public int f18137c = 1;
    /* renamed from: d */
    public final List<Reference<C2939f>> f18138d = new ArrayList();
    /* renamed from: e */
    public long f18139e = Long.MAX_VALUE;
    /* renamed from: g */
    private final C2967j f18140g;
    /* renamed from: h */
    private final ac f18141h;
    /* renamed from: i */
    private Socket f18142i;
    /* renamed from: j */
    private Socket f18143j;
    /* renamed from: k */
    private C2979r f18144k;
    /* renamed from: l */
    private Protocol f18145l;
    /* renamed from: m */
    private C2957e f18146m;
    /* renamed from: n */
    private C4394e f18147n;
    /* renamed from: o */
    private C4393d f18148o;

    public C4353c(C2967j c2967j, ac acVar) {
        this.f18140g = c2967j;
        this.f18141h = acVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m23806a(int r17, int r18, int r19, int r20, boolean r21, okhttp3.C2903e r22, okhttp3.C2977p r23) {
        /*
        r16 = this;
        r7 = r16;
        r8 = r22;
        r9 = r23;
        r0 = r7.f18145l;
        if (r0 != 0) goto L_0x0132;
    L_0x000a:
        r0 = r7.f18141h;
        r0 = r0.m14034a();
        r0 = r0.m13986f();
        r10 = new okhttp3.internal.connection.b;
        r10.<init>(r0);
        r1 = r7.f18141h;
        r1 = r1.m14034a();
        r1 = r1.m13989i();
        if (r1 != 0) goto L_0x0074;
    L_0x0025:
        r1 = okhttp3.C2969k.f12549c;
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x0067;
    L_0x002d:
        r0 = r7.f18141h;
        r0 = r0.m14034a();
        r0 = r0.m13980a();
        r0 = r0.m13967f();
        r1 = okhttp3.internal.p159e.C2945f.m14270c();
        r1 = r1.mo3656b(r0);
        if (r1 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0074;
    L_0x0046:
        r1 = new okhttp3.internal.connection.RouteException;
        r2 = new java.net.UnknownServiceException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "CLEARTEXT communication to ";
        r3.append(r4);
        r3.append(r0);
        r0 = " not permitted by network security policy";
        r3.append(r0);
        r0 = r3.toString();
        r2.<init>(r0);
        r1.<init>(r2);
        throw r1;
    L_0x0067:
        r0 = new okhttp3.internal.connection.RouteException;
        r1 = new java.net.UnknownServiceException;
        r2 = "CLEARTEXT communication not enabled for client";
        r1.<init>(r2);
        r0.<init>(r1);
        throw r0;
    L_0x0074:
        r11 = 0;
        r12 = r11;
    L_0x0076:
        r0 = r7.f18141h;	 Catch:{ IOException -> 0x00e7 }
        r0 = r0.m14037d();	 Catch:{ IOException -> 0x00e7 }
        if (r0 == 0) goto L_0x0097;
    L_0x007e:
        r1 = r16;
        r2 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r22;
        r6 = r23;
        r1.m23798a(r2, r3, r4, r5, r6);	 Catch:{ IOException -> 0x00e7 }
        r0 = r7.f18142i;	 Catch:{ IOException -> 0x00e7 }
        if (r0 != 0) goto L_0x0092;
    L_0x0091:
        goto L_0x00b4;
    L_0x0092:
        r13 = r17;
        r14 = r18;
        goto L_0x009e;
    L_0x0097:
        r13 = r17;
        r14 = r18;
        r7.m23799a(r13, r14, r8, r9);	 Catch:{ IOException -> 0x00e5 }
    L_0x009e:
        r15 = r20;
        r7.m23801a(r10, r15, r8, r9);	 Catch:{ IOException -> 0x00e3 }
        r0 = r7.f18141h;	 Catch:{ IOException -> 0x00e3 }
        r0 = r0.m14036c();	 Catch:{ IOException -> 0x00e3 }
        r1 = r7.f18141h;	 Catch:{ IOException -> 0x00e3 }
        r1 = r1.m14035b();	 Catch:{ IOException -> 0x00e3 }
        r2 = r7.f18145l;	 Catch:{ IOException -> 0x00e3 }
        r9.m14513a(r8, r0, r1, r2);	 Catch:{ IOException -> 0x00e3 }
    L_0x00b4:
        r0 = r7.f18141h;
        r0 = r0.m14037d();
        if (r0 == 0) goto L_0x00ce;
    L_0x00bc:
        r0 = r7.f18142i;
        if (r0 == 0) goto L_0x00c1;
    L_0x00c0:
        goto L_0x00ce;
    L_0x00c1:
        r0 = new java.net.ProtocolException;
        r1 = "Too many tunnel connections attempted: 21";
        r0.<init>(r1);
        r1 = new okhttp3.internal.connection.RouteException;
        r1.<init>(r0);
        throw r1;
    L_0x00ce:
        r0 = r7.f18146m;
        if (r0 == 0) goto L_0x00e2;
    L_0x00d2:
        r1 = r7.f18140g;
        monitor-enter(r1);
        r0 = r7.f18146m;	 Catch:{ all -> 0x00df }
        r0 = r0.m14342a();	 Catch:{ all -> 0x00df }
        r7.f18137c = r0;	 Catch:{ all -> 0x00df }
        monitor-exit(r1);	 Catch:{ all -> 0x00df }
        goto L_0x00e2;
    L_0x00df:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00df }
        throw r0;
    L_0x00e2:
        return;
    L_0x00e3:
        r0 = move-exception;
        goto L_0x00ee;
    L_0x00e5:
        r0 = move-exception;
        goto L_0x00ec;
    L_0x00e7:
        r0 = move-exception;
        r13 = r17;
        r14 = r18;
    L_0x00ec:
        r15 = r20;
    L_0x00ee:
        r1 = r7.f18143j;
        okhttp3.internal.C2933c.m14195a(r1);
        r1 = r7.f18142i;
        okhttp3.internal.C2933c.m14195a(r1);
        r7.f18143j = r11;
        r7.f18142i = r11;
        r7.f18147n = r11;
        r7.f18148o = r11;
        r7.f18144k = r11;
        r7.f18145l = r11;
        r7.f18146m = r11;
        r1 = r7.f18141h;
        r3 = r1.m14036c();
        r1 = r7.f18141h;
        r4 = r1.m14035b();
        r5 = 0;
        r1 = r23;
        r2 = r22;
        r6 = r0;
        r1.m14514a(r2, r3, r4, r5, r6);
        if (r12 != 0) goto L_0x0124;
    L_0x011d:
        r1 = new okhttp3.internal.connection.RouteException;
        r1.<init>(r0);
        r12 = r1;
        goto L_0x0127;
    L_0x0124:
        r12.m14212a(r0);
    L_0x0127:
        if (r21 == 0) goto L_0x0131;
    L_0x0129:
        r0 = r10.m14215a(r0);
        if (r0 == 0) goto L_0x0131;
    L_0x012f:
        goto L_0x0076;
    L_0x0131:
        throw r12;
    L_0x0132:
        r0 = new java.lang.IllegalStateException;
        r1 = "already connected";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.c.a(int, int, int, int, boolean, okhttp3.e, okhttp3.p):void");
    }

    /* renamed from: a */
    private void m23798a(int i, int i2, int i3, C2903e c2903e, C2977p c2977p) {
        C2990y g = m23803g();
        HttpUrl a = g.m14623a();
        int i4 = 0;
        while (i4 < 21) {
            m23799a(i, i2, c2903e, c2977p);
            g = m23797a(i2, i3, g, a);
            if (g != null) {
                C2933c.m14195a(this.f18142i);
                this.f18142i = null;
                this.f18148o = null;
                this.f18147n = null;
                c2977p.m14513a(c2903e, this.f18141h.m14036c(), this.f18141h.m14035b(), null);
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m23799a(int i, int i2, C2903e c2903e, C2977p c2977p) {
        Socket socket;
        Proxy b = this.f18141h.m14035b();
        C2895a a = this.f18141h.m14034a();
        if (b.type() != Type.DIRECT) {
            if (b.type() != Type.HTTP) {
                socket = new Socket(b);
                this.f18142i = socket;
                c2977p.m14512a(c2903e, this.f18141h.m14036c(), b);
                this.f18142i.setSoTimeout(i2);
                C2945f.m14270c().mo3653a(this.f18142i, this.f18141h.m14036c(), i);
                this.f18147n = C4905m.a(C4905m.b(this.f18142i));
                this.f18148o = C4905m.a(C4905m.a(this.f18142i));
            }
        }
        socket = a.m13983c().createSocket();
        this.f18142i = socket;
        c2977p.m14512a(c2903e, this.f18141h.m14036c(), b);
        this.f18142i.setSoTimeout(i2);
        try {
            C2945f.m14270c().mo3653a(this.f18142i, this.f18141h.m14036c(), i);
            try {
                this.f18147n = C4905m.a(C4905m.b(this.f18142i));
                this.f18148o = C4905m.a(C4905m.a(this.f18142i));
            } catch (int i3) {
                if ("throw with null exception".equals(i3.getMessage()) != 0) {
                    throw new IOException(i3);
                }
            }
        } catch (int i32) {
            c2903e = new StringBuilder();
            c2903e.append("Failed to connect to ");
            c2903e.append(this.f18141h.m14036c());
            i2 = new ConnectException(c2903e.toString());
            i2.initCause(i32);
            throw i2;
        }
    }

    /* renamed from: a */
    private void m23801a(C2934b c2934b, int i, C2903e c2903e, C2977p c2977p) {
        if (this.f18141h.m14034a().m13989i() == null) {
            this.f18145l = Protocol.HTTP_1_1;
            this.f18143j = this.f18142i;
            return;
        }
        c2977p.m14519b(c2903e);
        m23800a(c2934b);
        c2977p.m14517a(c2903e, this.f18144k);
        if (this.f18145l == Protocol.HTTP_2) {
            this.f18143j.setSoTimeout(null);
            this.f18146m = new C2955a(true).m14331a(this.f18143j, this.f18141h.m14034a().m13980a().m13967f(), this.f18147n, this.f18148o).m14332a((C2956b) this).m14330a(i).m14333a();
            this.f18146m.m14359c();
        }
    }

    /* renamed from: a */
    private void m23800a(C2934b c2934b) {
        AssertionError e;
        C2895a a = this.f18141h.m14034a();
        String str = null;
        try {
            Socket socket = (SSLSocket) a.m13989i().createSocket(this.f18142i, a.m13980a().m13967f(), a.m13980a().m13968g(), true);
            try {
                c2934b = c2934b.m14214a((SSLSocket) socket);
                if (c2934b.m14462d()) {
                    C2945f.m14270c().mo3654a((SSLSocket) socket, a.m13980a().m13967f(), a.m13985e());
                }
                socket.startHandshake();
                SSLSession session = socket.getSession();
                if (m23802a(session)) {
                    C2979r a2 = C2979r.m14530a(session);
                    if (a.m13990j().verify(a.m13980a().m13967f(), session)) {
                        a.m13991k().m14081a(a.m13980a().m13967f(), a2.m14534c());
                        if (c2934b.m14462d() != null) {
                            str = C2945f.m14270c().mo3649a((SSLSocket) socket);
                        }
                        this.f18143j = socket;
                        this.f18147n = C4905m.a(C4905m.b(this.f18143j));
                        this.f18148o = C4905m.a(C4905m.a(this.f18143j));
                        this.f18144k = a2;
                        if (str != null) {
                            c2934b = Protocol.m13976a(str);
                        } else {
                            c2934b = Protocol.HTTP_1_1;
                        }
                        this.f18145l = c2934b;
                        if (socket != null) {
                            C2945f.m14270c().mo3658b((SSLSocket) socket);
                            return;
                        }
                        return;
                    }
                    Certificate certificate = (X509Certificate) a2.m14534c().get(0);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Hostname ");
                    stringBuilder.append(a.m13980a().m13967f());
                    stringBuilder.append(" not verified:\n    certificate: ");
                    stringBuilder.append(C2907g.m14076a(certificate));
                    stringBuilder.append("\n    DN: ");
                    stringBuilder.append(certificate.getSubjectDN().getName());
                    stringBuilder.append("\n    subjectAltNames: ");
                    stringBuilder.append(C2948d.m14291a(certificate));
                    throw new SSLPeerUnverifiedException(stringBuilder.toString());
                }
                throw new IOException("a valid ssl session was not established");
            } catch (AssertionError e2) {
                e = e2;
                str = socket;
                try {
                    if (C2933c.m14196a(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    c2934b = th;
                    socket = str;
                    if (socket != null) {
                        C2945f.m14270c().mo3658b((SSLSocket) socket);
                    }
                    C2933c.m14195a(socket);
                    throw c2934b;
                }
            } catch (Throwable th2) {
                c2934b = th2;
                if (socket != null) {
                    C2945f.m14270c().mo3658b((SSLSocket) socket);
                }
                C2933c.m14195a(socket);
                throw c2934b;
            }
        } catch (AssertionError e3) {
            e = e3;
            if (C2933c.m14196a(e)) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    /* renamed from: a */
    private boolean m23802a(SSLSession sSLSession) {
        return ("NONE".equals(sSLSession.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(sSLSession.getCipherSuite()) != null) ? null : true;
    }

    /* renamed from: a */
    private C2990y m23797a(int i, int i2, C2990y c2990y, HttpUrl httpUrl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CONNECT ");
        stringBuilder.append(C2933c.m14187a(httpUrl, true));
        stringBuilder.append(" HTTP/1.1");
        String stringBuilder2 = stringBuilder.toString();
        while (true) {
            C4351a c4351a = new C4351a(null, null, this.f18147n, this.f18148o);
            this.f18147n.mo3616a().m14674a((long) i, TimeUnit.MILLISECONDS);
            this.f18148o.mo3624a().m14674a((long) i2, TimeUnit.MILLISECONDS);
            c4351a.m23787a(c2990y.m14626c(), stringBuilder2);
            c4351a.mo3633b();
            aa a = c4351a.mo3628a(false).m14003a(c2990y).m14004a();
            long a2 = C2924e.m14155a(a);
            if (a2 == -1) {
                a2 = 0;
            }
            C2995s b = c4351a.m23790b(a2);
            C2933c.m14205b(b, (int) BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
            b.close();
            int c = a.m14012c();
            if (c == 200) {
                break;
            } else if (c == 407) {
                C2990y a3 = this.f18141h.m14034a().m13984d().mo3606a(this.f18141h, a);
                if (a3 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                } else if ("close".equalsIgnoreCase(a.m14008a("Connection")) != null) {
                    return a3;
                } else {
                    c2990y = a3;
                }
            } else {
                i2 = new StringBuilder();
                i2.append("Unexpected response code for CONNECT: ");
                i2.append(a.m14012c());
                throw new IOException(i2.toString());
            }
        }
        if (this.f18147n.mo4553c().mo4557e() != 0 && this.f18148o.mo4553c().mo4557e() != 0) {
            return null;
        }
        throw new IOException("TLS tunnel buffered too many bytes!");
    }

    /* renamed from: g */
    private C2990y m23803g() {
        return new C2989a().m14611a(this.f18141h.m14034a().m13980a()).m14609a("Host", C2933c.m14187a(this.f18141h.m14034a().m13980a(), true)).m14609a("Proxy-Connection", "Keep-Alive").m14609a("User-Agent", C2941d.m14256a()).m14620c();
    }

    /* renamed from: a */
    public boolean m23810a(okhttp3.C2895a r5, @javax.annotation.Nullable okhttp3.ac r6) {
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
        r4 = this;
        r0 = r4.f18138d;
        r0 = r0.size();
        r1 = r4.f18137c;
        r2 = 0;
        if (r0 >= r1) goto L_0x00a6;
    L_0x000b:
        r0 = r4.f18135a;
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        goto L_0x00a6;
    L_0x0011:
        r0 = okhttp3.internal.C2920a.f12341a;
        r1 = r4.f18141h;
        r1 = r1.m14034a();
        r0 = r0.mo3686a(r1, r5);
        if (r0 != 0) goto L_0x0020;
    L_0x001f:
        return r2;
    L_0x0020:
        r0 = r5.m13980a();
        r0 = r0.m13967f();
        r1 = r4.m23812b();
        r1 = r1.m14034a();
        r1 = r1.m13980a();
        r1 = r1.m13967f();
        r0 = r0.equals(r1);
        r1 = 1;
        if (r0 == 0) goto L_0x0040;
    L_0x003f:
        return r1;
    L_0x0040:
        r0 = r4.f18146m;
        if (r0 != 0) goto L_0x0045;
    L_0x0044:
        return r2;
    L_0x0045:
        if (r6 != 0) goto L_0x0048;
    L_0x0047:
        return r2;
    L_0x0048:
        r0 = r6.m14035b();
        r0 = r0.type();
        r3 = java.net.Proxy.Type.DIRECT;
        if (r0 == r3) goto L_0x0055;
    L_0x0054:
        return r2;
    L_0x0055:
        r0 = r4.f18141h;
        r0 = r0.m14035b();
        r0 = r0.type();
        r3 = java.net.Proxy.Type.DIRECT;
        if (r0 == r3) goto L_0x0064;
    L_0x0063:
        return r2;
    L_0x0064:
        r0 = r4.f18141h;
        r0 = r0.m14036c();
        r3 = r6.m14036c();
        r0 = r0.equals(r3);
        if (r0 != 0) goto L_0x0075;
    L_0x0074:
        return r2;
    L_0x0075:
        r6 = r6.m14034a();
        r6 = r6.m13990j();
        r0 = okhttp3.internal.p161g.C2948d.f12422a;
        if (r6 == r0) goto L_0x0082;
    L_0x0081:
        return r2;
    L_0x0082:
        r6 = r5.m13980a();
        r6 = r4.m23809a(r6);
        if (r6 != 0) goto L_0x008d;
    L_0x008c:
        return r2;
    L_0x008d:
        r6 = r5.m13991k();	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        r5 = r5.m13980a();	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        r5 = r5.m13967f();	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        r0 = r4.m23815e();	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        r0 = r0.m14534c();	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        r6.m14081a(r5, r0);	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        return r1;
    L_0x00a5:
        return r2;
    L_0x00a6:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.c.a(okhttp3.a, okhttp3.ac):boolean");
    }

    /* renamed from: a */
    public boolean m23809a(HttpUrl httpUrl) {
        if (httpUrl.m13968g() != this.f18141h.m14034a().m13980a().m13968g()) {
            return false;
        }
        boolean z = true;
        if (httpUrl.m13967f().equals(this.f18141h.m14034a().m13980a().m13967f())) {
            return true;
        }
        if (this.f18144k == null || C2948d.f12422a.m14296a(httpUrl.m13967f(), (X509Certificate) this.f18144k.m14534c().get(0)) == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public C2921c m23805a(C2988w c2988w, C2982a c2982a, C2939f c2939f) {
        if (this.f18146m != null) {
            return new C4363d(c2988w, c2982a, c2939f, this.f18146m);
        }
        this.f18143j.setSoTimeout(c2982a.mo3622d());
        this.f18147n.mo3616a().m14674a((long) c2982a.mo3622d(), TimeUnit.MILLISECONDS);
        this.f18148o.mo3624a().m14674a((long) c2982a.mo3623e(), TimeUnit.MILLISECONDS);
        return new C4351a(c2988w, c2939f, this.f18147n, this.f18148o);
    }

    /* renamed from: b */
    public ac m23812b() {
        return this.f18141h;
    }

    /* renamed from: c */
    public void m23813c() {
        C2933c.m14195a(this.f18142i);
    }

    /* renamed from: d */
    public Socket m23814d() {
        return this.f18143j;
    }

    /* renamed from: a */
    public boolean m23811a(boolean r5) {
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
        r4 = this;
        r0 = r4.f18143j;
        r0 = r0.isClosed();
        r1 = 0;
        if (r0 != 0) goto L_0x0051;
    L_0x0009:
        r0 = r4.f18143j;
        r0 = r0.isInputShutdown();
        if (r0 != 0) goto L_0x0051;
    L_0x0011:
        r0 = r4.f18143j;
        r0 = r0.isOutputShutdown();
        if (r0 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0051;
    L_0x001a:
        r0 = r4.f18146m;
        r2 = 1;
        if (r0 == 0) goto L_0x0027;
    L_0x001f:
        r5 = r4.f18146m;
        r5 = r5.m14362d();
        r5 = r5 ^ r2;
        return r5;
    L_0x0027:
        if (r5 == 0) goto L_0x0050;
    L_0x0029:
        r5 = r4.f18143j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r5 = r5.getSoTimeout();	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r0 = r4.f18143j;	 Catch:{ all -> 0x0048 }
        r0.setSoTimeout(r2);	 Catch:{ all -> 0x0048 }
        r0 = r4.f18147n;	 Catch:{ all -> 0x0048 }
        r0 = r0.mo4557e();	 Catch:{ all -> 0x0048 }
        if (r0 == 0) goto L_0x0042;
    L_0x003c:
        r0 = r4.f18143j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r0.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        return r1;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
    L_0x0042:
        r0 = r4.f18143j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r0.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        return r2;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
    L_0x0048:
        r0 = move-exception;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r3 = r4.f18143j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r3.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        throw r0;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
    L_0x004f:
        return r1;
    L_0x0050:
        return r2;
    L_0x0051:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.c.a(boolean):boolean");
    }

    /* renamed from: a */
    public void mo3637a(C2960g c2960g) {
        c2960g.m14392a(ErrorCode.REFUSED_STREAM);
    }

    /* renamed from: a */
    public void mo3636a(C2957e c2957e) {
        synchronized (this.f18140g) {
            this.f18137c = c2957e.m14342a();
        }
    }

    /* renamed from: e */
    public C2979r m23815e() {
        return this.f18144k;
    }

    /* renamed from: f */
    public boolean m23816f() {
        return this.f18146m != null;
    }

    /* renamed from: a */
    public Protocol mo3635a() {
        return this.f18145l;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Connection{");
        stringBuilder.append(this.f18141h.m14034a().m13980a().m13967f());
        stringBuilder.append(":");
        stringBuilder.append(this.f18141h.m14034a().m13980a().m13968g());
        stringBuilder.append(", proxy=");
        stringBuilder.append(this.f18141h.m14035b());
        stringBuilder.append(" hostAddress=");
        stringBuilder.append(this.f18141h.m14036c());
        stringBuilder.append(" cipherSuite=");
        stringBuilder.append(this.f18144k != null ? this.f18144k.m14533b() : "none");
        stringBuilder.append(" protocol=");
        stringBuilder.append(this.f18145l);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
