package com.facebook.ads.internal.p096o;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p087f.C1795e;
import com.facebook.ads.internal.p087f.C3797a;
import com.facebook.ads.internal.p088g.C1799a;
import com.facebook.ads.internal.p089h.C1803c;
import com.facebook.ads.internal.p092k.C1819a;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p097p.p098a.C1856a;
import com.facebook.ads.internal.p097p.p098a.C1857b;
import com.facebook.ads.internal.p097p.p098a.C1862m;
import com.facebook.ads.internal.p097p.p098a.C1863n;
import com.facebook.ads.internal.p101q.p102a.C1919i;
import com.facebook.ads.internal.p101q.p102a.C1923m;
import com.facebook.ads.internal.p101q.p104c.C1948d;
import com.facebook.ads.internal.p101q.p104c.C1948d.C1947a;
import com.facebook.ads.internal.p101q.p105d.C1953a;
import com.facebook.ads.internal.p101q.p105d.C1954b;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1894a;
import com.facebook.ads.internal.protocol.C1905i;
import java.security.MessageDigest;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.facebook.ads.internal.o.c */
public class C1851c {
    /* renamed from: i */
    private static final C1923m f5661i = new C1923m();
    /* renamed from: j */
    private static final ThreadPoolExecutor f5662j = ((ThreadPoolExecutor) Executors.newCachedThreadPool(f5661i));
    /* renamed from: a */
    private final Context f5663a;
    /* renamed from: b */
    private final C1853e f5664b = C1853e.m7069a();
    /* renamed from: c */
    private final C1820a f5665c = C1820a.m6869x(this.f5663a);
    /* renamed from: d */
    private Map<String, String> f5666d;
    /* renamed from: e */
    private C1850a f5667e;
    /* renamed from: f */
    private C1847b f5668f;
    /* renamed from: g */
    private C1856a f5669g;
    /* renamed from: h */
    private final String f5670h = C1852d.m7067a();

    /* renamed from: com.facebook.ads.internal.o.c$a */
    public interface C1850a {
        /* renamed from: a */
        void mo1330a(C3812g c3812g);

        /* renamed from: a */
        void mo1331a(C1894a c1894a);
    }

    /* renamed from: com.facebook.ads.internal.o.c$2 */
    class C38112 extends C1857b {
        /* renamed from: a */
        final /* synthetic */ C1851c f15244a;

        C38112(C1851c c1851c) {
            this.f15244a = c1851c;
        }

        /* renamed from: a */
        void m19039a(com.facebook.ads.internal.p097p.p098a.C1862m r5) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r4.f15244a;
            r0 = r0.f5668f;
            com.facebook.ads.internal.p096o.C1846a.m7037b(r0);
            r0 = r4.f15244a;
            r1 = 0;
            r0.f5669g = r1;
            r0 = r5.m7113a();	 Catch:{ JSONException -> 0x0049 }
            if (r0 == 0) goto L_0x0049;	 Catch:{ JSONException -> 0x0049 }
        L_0x0015:
            r0 = r0.m7118e();	 Catch:{ JSONException -> 0x0049 }
            r1 = r4.f15244a;	 Catch:{ JSONException -> 0x0049 }
            r1 = r1.f5664b;	 Catch:{ JSONException -> 0x0049 }
            r1 = r1.m7073a(r0);	 Catch:{ JSONException -> 0x0049 }
            r2 = r1.m7075b();	 Catch:{ JSONException -> 0x0049 }
            r3 = com.facebook.ads.internal.p096o.C1855f.C1854a.ERROR;	 Catch:{ JSONException -> 0x0049 }
            if (r2 != r3) goto L_0x0049;	 Catch:{ JSONException -> 0x0049 }
        L_0x002b:
            r1 = (com.facebook.ads.internal.p096o.C3813h) r1;	 Catch:{ JSONException -> 0x0049 }
            r2 = r1.m19044f();	 Catch:{ JSONException -> 0x0049 }
            r1 = r1.m19045g();	 Catch:{ JSONException -> 0x0049 }
            r3 = com.facebook.ads.internal.protocol.AdErrorType.ERROR_MESSAGE;	 Catch:{ JSONException -> 0x0049 }
            r1 = com.facebook.ads.internal.protocol.AdErrorType.m7223a(r1, r3);	 Catch:{ JSONException -> 0x0049 }
            r3 = r4.f15244a;	 Catch:{ JSONException -> 0x0049 }
            if (r2 != 0) goto L_0x0040;	 Catch:{ JSONException -> 0x0049 }
        L_0x003f:
            goto L_0x0041;	 Catch:{ JSONException -> 0x0049 }
        L_0x0040:
            r0 = r2;	 Catch:{ JSONException -> 0x0049 }
        L_0x0041:
            r0 = com.facebook.ads.internal.protocol.C1894a.m7228a(r1, r0);	 Catch:{ JSONException -> 0x0049 }
            r3.m7055a(r0);	 Catch:{ JSONException -> 0x0049 }
            return;
        L_0x0049:
            r0 = r4.f15244a;
            r1 = com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR;
            r5 = r5.getMessage();
            r5 = com.facebook.ads.internal.protocol.C1894a.m7228a(r1, r5);
            r0.m7055a(r5);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.o.c.2.a(com.facebook.ads.internal.p.a.m):void");
        }

        /* renamed from: a */
        public void mo1376a(C1863n c1863n) {
            if (c1863n != null) {
                String e = c1863n.m7118e();
                C1846a.m7037b(this.f15244a.f5668f);
                this.f15244a.f5669g = null;
                this.f15244a.m7056a(e);
            }
        }

        /* renamed from: a */
        public void mo1377a(Exception exception) {
            if (C1862m.class.equals(exception.getClass())) {
                m19039a((C1862m) exception);
            } else {
                this.f15244a.m7055a(C1894a.m7228a(AdErrorType.NETWORK_ERROR, exception.getMessage()));
            }
        }
    }

    public C1851c(Context context) {
        this.f5663a = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m7054a(C3812g c3812g) {
        if (this.f5667e != null) {
            this.f5667e.mo1330a(c3812g);
        }
        m7064a();
    }

    /* renamed from: a */
    private void m7055a(C1894a c1894a) {
        if (this.f5667e != null) {
            this.f5667e.mo1331a(c1894a);
        }
        m7064a();
    }

    /* renamed from: a */
    private void m7056a(String str) {
        try {
            C1894a a;
            C1855f a2 = this.f5664b.m7073a(str);
            C1803c a3 = a2.mo1378a();
            if (a3 != null) {
                this.f5665c.m6873a(a3.m6791b());
                C1846a.m7034a(a3.m6789a().m6797d(), this.f5668f);
            }
            String c;
            switch (a2.m7075b()) {
                case ADS:
                    C3812g c3812g = (C3812g) a2;
                    if (a3 != null) {
                        if (a3.m6789a().m6798e()) {
                            C1846a.m7035a(str, this.f5668f);
                        }
                        Object obj = this.f5666d != null ? (String) this.f5666d.get("CLIENT_REQUEST_ID") : null;
                        c = a2.m7076c();
                        if (!(TextUtils.isEmpty(c) || TextUtils.isEmpty(obj))) {
                            StringBuilder stringBuilder = new StringBuilder();
                            for (int i = 0; i < "9n016rsr18194oq187s9s48p6n0sr7s8".length(); i++) {
                                int i2;
                                char charAt = "9n016rsr18194oq187s9s48p6n0sr7s8".charAt(i);
                                if ((charAt < 'a' || charAt > 'm') && (charAt < 'A' || charAt > 'M')) {
                                    if ((charAt >= 'n' && charAt <= 'z') || (charAt >= 'N' && charAt <= 'Z')) {
                                        i2 = charAt - 13;
                                    }
                                    stringBuilder.append(charAt);
                                } else {
                                    i2 = charAt + 13;
                                }
                                charAt = (char) i2;
                                stringBuilder.append(charAt);
                            }
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(obj);
                            stringBuilder2.append(c);
                            stringBuilder2.append(stringBuilder.toString());
                            byte[] bytes = stringBuilder2.toString().getBytes("iso-8859-1");
                            MessageDigest instance = MessageDigest.getInstance("SHA-1");
                            instance.update(bytes, 0, bytes.length);
                            if (!a2.m7077d().equals(C1919i.m7289a(instance.digest()))) {
                                C1953a.m7382a(this.f5663a, "network", C1954b.f5994h, new C1905i());
                            }
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(c);
                            stringBuilder2.append(obj);
                            stringBuilder2.append(stringBuilder.toString());
                            byte[] bytes2 = stringBuilder2.toString().getBytes("iso-8859-1");
                            MessageDigest instance2 = MessageDigest.getInstance("SHA-1");
                            instance2.update(bytes2, 0, bytes2.length);
                            C1795e.m6752a(new C3797a(c, C1919i.m7289a(instance2.digest())), this.f5663a);
                        }
                        if (!(TextUtils.isEmpty(a2.m7078e()) || TextUtils.isEmpty(obj))) {
                            new C1819a(this.f5663a, obj, a2.m7078e()).m6843a();
                        }
                    }
                    m7054a(c3812g);
                    return;
                case ERROR:
                    C3813h c3813h = (C3813h) a2;
                    c = c3813h.m19044f();
                    AdErrorType a4 = AdErrorType.m7223a(c3813h.m19045g(), AdErrorType.ERROR_MESSAGE);
                    if (c != null) {
                        str = c;
                    }
                    a = C1894a.m7228a(a4, str);
                    break;
                default:
                    a = C1894a.m7228a(AdErrorType.UNKNOWN_RESPONSE, str);
                    break;
            }
            m7055a(a);
        } catch (Exception e) {
            m7055a(C1894a.m7228a(AdErrorType.PARSER_FAILURE, e.getMessage()));
        }
    }

    /* renamed from: b */
    private C1857b m7057b() {
        return new C38112(this);
    }

    /* renamed from: a */
    public void m7064a() {
        if (this.f5669g != null) {
            this.f5669g.m7101c(1);
            this.f5669g.m7099b(1);
            this.f5669g = null;
        }
    }

    /* renamed from: a */
    public void m7065a(final C1847b c1847b) {
        m7064a();
        if (C1948d.m7361c(this.f5663a) == C1947a.NONE) {
            m7055a(new C1894a(AdErrorType.NETWORK_ERROR, "No network connection"));
            return;
        }
        this.f5668f = c1847b;
        C1799a.m6762a(this.f5663a);
        if (C1846a.m7036a(c1847b)) {
            String c = C1846a.m7038c(c1847b);
            if (c != null) {
                m7056a(c);
                return;
            } else {
                m7055a(C1894a.m7228a(AdErrorType.LOAD_TOO_FREQUENTLY, null));
                return;
            }
        }
        f5662j.submit(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C1851c f5659b;

            public void run() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
                /*
                r6 = this;
                r0 = r6.f5659b;
                r0 = r0.f5663a;
                com.facebook.ads.internal.p084c.C1770b.m6673a(r0);
                r0 = r3;
                r0 = r0.m7045e();
                r0 = r0.m7245a();
                if (r0 == 0) goto L_0x003b;
            L_0x0015:
                r0 = r3;	 Catch:{ b -> 0x0021 }
                r0 = r0.m7045e();	 Catch:{ b -> 0x0021 }
                r1 = com.facebook.ads.internal.p084c.C1770b.f5345b;	 Catch:{ b -> 0x0021 }
                r0.m7244a(r1);	 Catch:{ b -> 0x0021 }
                goto L_0x002b;
            L_0x0021:
                r0 = move-exception;
                r1 = r6.f5659b;
                r0 = com.facebook.ads.internal.protocol.C1894a.m7229a(r0);
                r1.m7055a(r0);
            L_0x002b:
                r0 = r6.f5659b;
                r1 = r3;
                r1 = r1.m7045e();
                r1 = r1.m7246b();
                r0.m7056a(r1);
                return;
            L_0x003b:
                r0 = r6.f5659b;
                r1 = r3;
                r1 = r1.m7046f();
                r0.f5666d = r1;
                r0 = r6.f5659b;	 Catch:{ Exception -> 0x0095 }
                r0 = r0.f5666d;	 Catch:{ Exception -> 0x0095 }
                r1 = "M_BANNER_KEY";	 Catch:{ Exception -> 0x0095 }
                r2 = new java.lang.String;	 Catch:{ Exception -> 0x0095 }
                r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0095 }
                r3.<init>();	 Catch:{ Exception -> 0x0095 }
                r4 = r6.f5659b;	 Catch:{ Exception -> 0x0095 }
                r4 = r4.f5663a;	 Catch:{ Exception -> 0x0095 }
                r4 = r4.getPackageName();	 Catch:{ Exception -> 0x0095 }
                r3.append(r4);	 Catch:{ Exception -> 0x0095 }
                r4 = " ";	 Catch:{ Exception -> 0x0095 }
                r3.append(r4);	 Catch:{ Exception -> 0x0095 }
                r4 = r6.f5659b;	 Catch:{ Exception -> 0x0095 }
                r4 = r4.f5663a;	 Catch:{ Exception -> 0x0095 }
                r4 = r4.getPackageManager();	 Catch:{ Exception -> 0x0095 }
                r5 = r6.f5659b;	 Catch:{ Exception -> 0x0095 }
                r5 = r5.f5663a;	 Catch:{ Exception -> 0x0095 }
                r5 = r5.getPackageName();	 Catch:{ Exception -> 0x0095 }
                r4 = r4.getInstallerPackageName(r5);	 Catch:{ Exception -> 0x0095 }
                r3.append(r4);	 Catch:{ Exception -> 0x0095 }
                r3 = r3.toString();	 Catch:{ Exception -> 0x0095 }
                r3 = r3.getBytes();	 Catch:{ Exception -> 0x0095 }
                r4 = 2;	 Catch:{ Exception -> 0x0095 }
                r3 = android.util.Base64.encode(r3, r4);	 Catch:{ Exception -> 0x0095 }
                r2.<init>(r3);	 Catch:{ Exception -> 0x0095 }
                r0.put(r1, r2);	 Catch:{ Exception -> 0x0095 }
            L_0x0095:
                r0 = r3;	 Catch:{ Exception -> 0x00f0 }
                r0 = r0.f5645c;	 Catch:{ Exception -> 0x00f0 }
                r1 = com.facebook.ads.internal.protocol.C1900f.NATIVE_250;	 Catch:{ Exception -> 0x00f0 }
                if (r0 == r1) goto L_0x00b6;	 Catch:{ Exception -> 0x00f0 }
            L_0x009d:
                r0 = r3;	 Catch:{ Exception -> 0x00f0 }
                r0 = r0.f5645c;	 Catch:{ Exception -> 0x00f0 }
                r1 = com.facebook.ads.internal.protocol.C1900f.NATIVE_UNKNOWN;	 Catch:{ Exception -> 0x00f0 }
                if (r0 == r1) goto L_0x00b6;	 Catch:{ Exception -> 0x00f0 }
            L_0x00a5:
                r0 = r3;	 Catch:{ Exception -> 0x00f0 }
                r0 = r0.f5645c;	 Catch:{ Exception -> 0x00f0 }
                r1 = com.facebook.ads.internal.protocol.C1900f.NATIVE_BANNER;	 Catch:{ Exception -> 0x00f0 }
                if (r0 == r1) goto L_0x00b6;	 Catch:{ Exception -> 0x00f0 }
            L_0x00ad:
                r0 = r3;	 Catch:{ Exception -> 0x00f0 }
                r0 = r0.f5645c;	 Catch:{ Exception -> 0x00f0 }
                if (r0 != 0) goto L_0x00b4;	 Catch:{ Exception -> 0x00f0 }
            L_0x00b3:
                goto L_0x00b6;	 Catch:{ Exception -> 0x00f0 }
            L_0x00b4:
                r0 = 0;	 Catch:{ Exception -> 0x00f0 }
                goto L_0x00b7;	 Catch:{ Exception -> 0x00f0 }
            L_0x00b6:
                r0 = 1;	 Catch:{ Exception -> 0x00f0 }
            L_0x00b7:
                r1 = r6.f5659b;	 Catch:{ Exception -> 0x00f0 }
                r2 = r6.f5659b;	 Catch:{ Exception -> 0x00f0 }
                r2 = r2.f5663a;	 Catch:{ Exception -> 0x00f0 }
                r0 = com.facebook.ads.internal.p101q.p104c.C1948d.m7360b(r2, r0);	 Catch:{ Exception -> 0x00f0 }
                r1.f5669g = r0;	 Catch:{ Exception -> 0x00f0 }
                r0 = r6.f5659b;	 Catch:{ Exception -> 0x00f0 }
                r0 = r0.f5669g;	 Catch:{ Exception -> 0x00f0 }
                r1 = r6.f5659b;	 Catch:{ Exception -> 0x00f0 }
                r1 = r1.f5670h;	 Catch:{ Exception -> 0x00f0 }
                r2 = r6.f5659b;	 Catch:{ Exception -> 0x00f0 }
                r2 = r2.f5669g;	 Catch:{ Exception -> 0x00f0 }
                r2 = r2.m7098b();	 Catch:{ Exception -> 0x00f0 }
                r3 = r6.f5659b;	 Catch:{ Exception -> 0x00f0 }
                r3 = r3.f5666d;	 Catch:{ Exception -> 0x00f0 }
                r2 = r2.m7121a(r3);	 Catch:{ Exception -> 0x00f0 }
                r3 = r6.f5659b;	 Catch:{ Exception -> 0x00f0 }
                r3 = r3.m7057b();	 Catch:{ Exception -> 0x00f0 }
                r0.m7091a(r1, r2, r3);	 Catch:{ Exception -> 0x00f0 }
                goto L_0x0100;
            L_0x00f0:
                r0 = move-exception;
                r1 = r6.f5659b;
                r2 = com.facebook.ads.internal.protocol.AdErrorType.AD_REQUEST_FAILED;
                r0 = r0.getMessage();
                r0 = com.facebook.ads.internal.protocol.C1894a.m7228a(r2, r0);
                r1.m7055a(r0);
            L_0x0100:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.o.c.1.run():void");
            }
        });
    }

    /* renamed from: a */
    public void m7066a(C1850a c1850a) {
        this.f5667e = c1850a;
    }
}
