package okhttp3.logging;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.C2910i;
import okhttp3.C2981s;
import okhttp3.C2983t;
import okhttp3.C2983t.C2982a;
import okhttp3.C2984u;
import okhttp3.C2990y;
import okhttp3.C2991z;
import okhttp3.aa;
import okhttp3.ab;
import okhttp3.internal.p156b.C2924e;
import okhttp3.internal.p159e.C2945f;
import okio.C2995s;
import okio.C4394e;
import okio.C4755c;
import okio.C4914k;

public final class HttpLoggingInterceptor implements C2983t {
    /* renamed from: a */
    private static final Charset f18233a = Charset.forName("UTF-8");
    /* renamed from: b */
    private final C2972a f18234b;
    /* renamed from: c */
    private volatile Level f18235c;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* renamed from: okhttp3.logging.HttpLoggingInterceptor$a */
    public interface C2972a {
        /* renamed from: a */
        public static final C2972a f12582a = new C43801();

        /* renamed from: okhttp3.logging.HttpLoggingInterceptor$a$1 */
        class C43801 implements C2972a {
            C43801() {
            }

            /* renamed from: a */
            public void mo3674a(String str) {
                C2945f.m14270c().mo3651a(4, str, null);
            }
        }

        /* renamed from: a */
        void mo3674a(String str);
    }

    public HttpLoggingInterceptor() {
        this(C2972a.f12582a);
    }

    public HttpLoggingInterceptor(C2972a c2972a) {
        this.f18235c = Level.NONE;
        this.f18234b = c2972a;
    }

    /* renamed from: a */
    public HttpLoggingInterceptor m23904a(Level level) {
        if (level != null) {
            this.f18235c = level;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    /* renamed from: a */
    public aa mo910a(C2982a c2982a) {
        Throwable th;
        C2982a c2982a2 = c2982a;
        Level level = this.f18235c;
        C2990y a = c2982a.mo3619a();
        if (level == Level.NONE) {
            return c2982a2.mo3618a(a);
        }
        Object obj;
        C2991z d;
        C2910i b;
        StringBuilder stringBuilder;
        String stringBuilder2;
        C2972a c2972a;
        StringBuilder stringBuilder3;
        C2981s c;
        int a2;
        int i;
        String a3;
        StringBuilder stringBuilder4;
        C4755c c4755c;
        Charset charset;
        C2984u a4;
        C2972a c2972a2;
        StringBuilder stringBuilder5;
        long nanoTime;
        aa a5;
        ab h;
        long b2;
        String stringBuilder6;
        String stringBuilder7;
        String stringBuilder8;
        C2981s g;
        int a6;
        int i2;
        C4755c c2;
        C2995s c4914k;
        Charset charset2;
        C2984u a7;
        C2972a c2972a3;
        StringBuilder stringBuilder9;
        Object obj2 = 1;
        Object obj3 = level == Level.BODY ? 1 : null;
        if (obj3 == null) {
            if (level != Level.HEADERS) {
                obj = null;
                d = a.m14627d();
                if (d != null) {
                    obj2 = null;
                }
                b = c2982a.mo3620b();
                stringBuilder = new StringBuilder();
                stringBuilder.append("--> ");
                stringBuilder.append(a.m14624b());
                stringBuilder.append(' ');
                stringBuilder.append(a.m14623a());
                if (b == null) {
                    StringBuilder stringBuilder10 = new StringBuilder();
                    stringBuilder10.append(" ");
                    stringBuilder10.append(b.mo3635a());
                    stringBuilder2 = stringBuilder10.toString();
                } else {
                    stringBuilder2 = "";
                }
                stringBuilder.append(stringBuilder2);
                stringBuilder2 = stringBuilder.toString();
                if (obj == null && obj2 != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(stringBuilder2);
                    stringBuilder.append(" (");
                    stringBuilder.append(d.mo913b());
                    stringBuilder.append("-byte body)");
                    stringBuilder2 = stringBuilder.toString();
                }
                r1.f18234b.mo3674a(stringBuilder2);
                if (obj != null) {
                    if (obj2 != null) {
                        if (d.mo911a() != null) {
                            c2972a = r1.f18234b;
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Content-Type: ");
                            stringBuilder3.append(d.mo911a());
                            c2972a.mo3674a(stringBuilder3.toString());
                        }
                        if (d.mo913b() != -1) {
                            c2972a = r1.f18234b;
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Content-Length: ");
                            stringBuilder3.append(d.mo913b());
                            c2972a.mo3674a(stringBuilder3.toString());
                        }
                    }
                    c = a.m14626c();
                    a2 = c.m14546a();
                    for (i = 0; i < a2; i++) {
                        a3 = c.m14547a(i);
                        if (!("Content-Type".equalsIgnoreCase(a3) || "Content-Length".equalsIgnoreCase(a3))) {
                            C2972a c2972a4 = r1.f18234b;
                            stringBuilder4 = new StringBuilder();
                            stringBuilder4.append(a3);
                            stringBuilder4.append(": ");
                            stringBuilder4.append(c.m14549b(i));
                            c2972a4.mo3674a(stringBuilder4.toString());
                        }
                    }
                    if (obj3 != null) {
                        if (obj2 == null) {
                            if (m23901a(a.m14626c())) {
                                c4755c = new C4755c();
                                d.mo912a(c4755c);
                                charset = f18233a;
                                a4 = d.mo911a();
                                if (a4 != null) {
                                    charset = a4.m14562a(f18233a);
                                }
                                r1.f18234b.mo3674a("");
                                if (m23902a(c4755c)) {
                                    c2972a2 = r1.f18234b;
                                    stringBuilder5 = new StringBuilder();
                                    stringBuilder5.append("--> END ");
                                    stringBuilder5.append(a.m14624b());
                                    stringBuilder5.append(" (binary ");
                                    stringBuilder5.append(d.mo913b());
                                    stringBuilder5.append("-byte body omitted)");
                                    c2972a2.mo3674a(stringBuilder5.toString());
                                } else {
                                    r1.f18234b.mo3674a(c4755c.mo4546a(charset));
                                    c2972a2 = r1.f18234b;
                                    stringBuilder5 = new StringBuilder();
                                    stringBuilder5.append("--> END ");
                                    stringBuilder5.append(a.m14624b());
                                    stringBuilder5.append(" (");
                                    stringBuilder5.append(d.mo913b());
                                    stringBuilder5.append("-byte body)");
                                    c2972a2.mo3674a(stringBuilder5.toString());
                                }
                            } else {
                                c2972a2 = r1.f18234b;
                                stringBuilder5 = new StringBuilder();
                                stringBuilder5.append("--> END ");
                                stringBuilder5.append(a.m14624b());
                                stringBuilder5.append(" (encoded body omitted)");
                                c2972a2.mo3674a(stringBuilder5.toString());
                            }
                        }
                    }
                    c2972a2 = r1.f18234b;
                    stringBuilder5 = new StringBuilder();
                    stringBuilder5.append("--> END ");
                    stringBuilder5.append(a.m14624b());
                    c2972a2.mo3674a(stringBuilder5.toString());
                }
                nanoTime = System.nanoTime();
                a5 = c2982a2.mo3618a(a);
                nanoTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                h = a5.m14017h();
                b2 = h.mo915b();
                if (b2 == -1) {
                    StringBuilder stringBuilder11 = new StringBuilder();
                    stringBuilder11.append(b2);
                    stringBuilder11.append("-byte");
                    stringBuilder6 = stringBuilder11.toString();
                } else {
                    stringBuilder6 = "unknown-length";
                }
                C2972a c2972a5 = r1.f18234b;
                stringBuilder = new StringBuilder();
                stringBuilder.append("<-- ");
                stringBuilder.append(a5.m14012c());
                if (a5.m14014e().isEmpty()) {
                    StringBuilder stringBuilder12 = new StringBuilder();
                    stringBuilder12.append(' ');
                    stringBuilder12.append(a5.m14014e());
                    stringBuilder7 = stringBuilder12.toString();
                } else {
                    stringBuilder7 = "";
                }
                stringBuilder.append(stringBuilder7);
                stringBuilder.append(' ');
                stringBuilder.append(a5.m14010a().m14623a());
                stringBuilder.append(" (");
                stringBuilder.append(nanoTime);
                stringBuilder.append("ms");
                if (obj != null) {
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(", ");
                    stringBuilder4.append(stringBuilder6);
                    stringBuilder4.append(" body");
                    stringBuilder8 = stringBuilder4.toString();
                } else {
                    stringBuilder8 = "";
                }
                stringBuilder.append(stringBuilder8);
                stringBuilder.append(')');
                c2972a5.mo3674a(stringBuilder.toString());
                if (obj != null) {
                    g = a5.m14016g();
                    a6 = g.m14546a();
                    for (i2 = 0; i2 < a6; i2++) {
                        C2972a c2972a6 = r1.f18234b;
                        StringBuilder stringBuilder13 = new StringBuilder();
                        stringBuilder13.append(g.m14547a(i2));
                        stringBuilder13.append(": ");
                        stringBuilder13.append(g.m14549b(i2));
                        c2972a6.mo3674a(stringBuilder13.toString());
                    }
                    if (obj3 != null) {
                        if (!C2924e.m14165d(a5)) {
                            if (m23901a(a5.m14016g())) {
                                C4394e c3 = h.mo916c();
                                c3.mo4552b(Long.MAX_VALUE);
                                c2 = c3.mo4553c();
                                C4914k c4914k2 = null;
                                if ("gzip".equalsIgnoreCase(g.m14548a("Content-Encoding"))) {
                                    obj = null;
                                } else {
                                    obj = Long.valueOf(c2.m27502b());
                                    try {
                                        c4914k = new C4914k(c2.m27549u());
                                        try {
                                            c2 = new C4755c();
                                            c2.mo4545a(c4914k);
                                            c4914k.close();
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c4914k2 = c4914k;
                                            if (c4914k2 != null) {
                                                c4914k2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (c4914k2 != null) {
                                            c4914k2.close();
                                        }
                                        throw th;
                                    }
                                }
                                charset2 = f18233a;
                                a7 = h.mo914a();
                                if (a7 != null) {
                                    charset2 = a7.m14562a(f18233a);
                                }
                                if (m23902a(c2)) {
                                    r1.f18234b.mo3674a("");
                                    c2972a3 = r1.f18234b;
                                    stringBuilder9 = new StringBuilder();
                                    stringBuilder9.append("<-- END HTTP (binary ");
                                    stringBuilder9.append(c2.m27502b());
                                    stringBuilder9.append("-byte body omitted)");
                                    c2972a3.mo3674a(stringBuilder9.toString());
                                    return a5;
                                }
                                if (b2 != 0) {
                                    r1.f18234b.mo3674a("");
                                    r1.f18234b.mo3674a(c2.m27549u().mo4546a(charset2));
                                }
                                if (obj == null) {
                                    C2972a c2972a7 = r1.f18234b;
                                    stringBuilder4 = new StringBuilder();
                                    stringBuilder4.append("<-- END HTTP (");
                                    stringBuilder4.append(c2.m27502b());
                                    stringBuilder4.append("-byte, ");
                                    stringBuilder4.append(obj);
                                    stringBuilder4.append("-gzipped-byte body)");
                                    c2972a7.mo3674a(stringBuilder4.toString());
                                } else {
                                    c2972a3 = r1.f18234b;
                                    stringBuilder9 = new StringBuilder();
                                    stringBuilder9.append("<-- END HTTP (");
                                    stringBuilder9.append(c2.m27502b());
                                    stringBuilder9.append("-byte body)");
                                    c2972a3.mo3674a(stringBuilder9.toString());
                                }
                            } else {
                                r1.f18234b.mo3674a("<-- END HTTP (encoded body omitted)");
                            }
                        }
                    }
                    r1.f18234b.mo3674a("<-- END HTTP");
                }
                return a5;
            }
        }
        obj = 1;
        d = a.m14627d();
        if (d != null) {
            obj2 = null;
        }
        b = c2982a.mo3620b();
        stringBuilder = new StringBuilder();
        stringBuilder.append("--> ");
        stringBuilder.append(a.m14624b());
        stringBuilder.append(' ');
        stringBuilder.append(a.m14623a());
        if (b == null) {
            stringBuilder2 = "";
        } else {
            StringBuilder stringBuilder102 = new StringBuilder();
            stringBuilder102.append(" ");
            stringBuilder102.append(b.mo3635a());
            stringBuilder2 = stringBuilder102.toString();
        }
        stringBuilder.append(stringBuilder2);
        stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(" (");
        stringBuilder.append(d.mo913b());
        stringBuilder.append("-byte body)");
        stringBuilder2 = stringBuilder.toString();
        r1.f18234b.mo3674a(stringBuilder2);
        if (obj != null) {
            if (obj2 != null) {
                if (d.mo911a() != null) {
                    c2972a = r1.f18234b;
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Content-Type: ");
                    stringBuilder3.append(d.mo911a());
                    c2972a.mo3674a(stringBuilder3.toString());
                }
                if (d.mo913b() != -1) {
                    c2972a = r1.f18234b;
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Content-Length: ");
                    stringBuilder3.append(d.mo913b());
                    c2972a.mo3674a(stringBuilder3.toString());
                }
            }
            c = a.m14626c();
            a2 = c.m14546a();
            for (i = 0; i < a2; i++) {
                a3 = c.m14547a(i);
                C2972a c2972a42 = r1.f18234b;
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(a3);
                stringBuilder4.append(": ");
                stringBuilder4.append(c.m14549b(i));
                c2972a42.mo3674a(stringBuilder4.toString());
            }
            if (obj3 != null) {
                if (obj2 == null) {
                    if (m23901a(a.m14626c())) {
                        c4755c = new C4755c();
                        d.mo912a(c4755c);
                        charset = f18233a;
                        a4 = d.mo911a();
                        if (a4 != null) {
                            charset = a4.m14562a(f18233a);
                        }
                        r1.f18234b.mo3674a("");
                        if (m23902a(c4755c)) {
                            c2972a2 = r1.f18234b;
                            stringBuilder5 = new StringBuilder();
                            stringBuilder5.append("--> END ");
                            stringBuilder5.append(a.m14624b());
                            stringBuilder5.append(" (binary ");
                            stringBuilder5.append(d.mo913b());
                            stringBuilder5.append("-byte body omitted)");
                            c2972a2.mo3674a(stringBuilder5.toString());
                        } else {
                            r1.f18234b.mo3674a(c4755c.mo4546a(charset));
                            c2972a2 = r1.f18234b;
                            stringBuilder5 = new StringBuilder();
                            stringBuilder5.append("--> END ");
                            stringBuilder5.append(a.m14624b());
                            stringBuilder5.append(" (");
                            stringBuilder5.append(d.mo913b());
                            stringBuilder5.append("-byte body)");
                            c2972a2.mo3674a(stringBuilder5.toString());
                        }
                    } else {
                        c2972a2 = r1.f18234b;
                        stringBuilder5 = new StringBuilder();
                        stringBuilder5.append("--> END ");
                        stringBuilder5.append(a.m14624b());
                        stringBuilder5.append(" (encoded body omitted)");
                        c2972a2.mo3674a(stringBuilder5.toString());
                    }
                }
            }
            c2972a2 = r1.f18234b;
            stringBuilder5 = new StringBuilder();
            stringBuilder5.append("--> END ");
            stringBuilder5.append(a.m14624b());
            c2972a2.mo3674a(stringBuilder5.toString());
        }
        nanoTime = System.nanoTime();
        try {
            a5 = c2982a2.mo3618a(a);
            nanoTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            h = a5.m14017h();
            b2 = h.mo915b();
            if (b2 == -1) {
                stringBuilder6 = "unknown-length";
            } else {
                StringBuilder stringBuilder112 = new StringBuilder();
                stringBuilder112.append(b2);
                stringBuilder112.append("-byte");
                stringBuilder6 = stringBuilder112.toString();
            }
            C2972a c2972a52 = r1.f18234b;
            stringBuilder = new StringBuilder();
            stringBuilder.append("<-- ");
            stringBuilder.append(a5.m14012c());
            if (a5.m14014e().isEmpty()) {
                StringBuilder stringBuilder122 = new StringBuilder();
                stringBuilder122.append(' ');
                stringBuilder122.append(a5.m14014e());
                stringBuilder7 = stringBuilder122.toString();
            } else {
                stringBuilder7 = "";
            }
            stringBuilder.append(stringBuilder7);
            stringBuilder.append(' ');
            stringBuilder.append(a5.m14010a().m14623a());
            stringBuilder.append(" (");
            stringBuilder.append(nanoTime);
            stringBuilder.append("ms");
            if (obj != null) {
                stringBuilder8 = "";
            } else {
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(", ");
                stringBuilder4.append(stringBuilder6);
                stringBuilder4.append(" body");
                stringBuilder8 = stringBuilder4.toString();
            }
            stringBuilder.append(stringBuilder8);
            stringBuilder.append(')');
            c2972a52.mo3674a(stringBuilder.toString());
            if (obj != null) {
                g = a5.m14016g();
                a6 = g.m14546a();
                for (i2 = 0; i2 < a6; i2++) {
                    C2972a c2972a62 = r1.f18234b;
                    StringBuilder stringBuilder132 = new StringBuilder();
                    stringBuilder132.append(g.m14547a(i2));
                    stringBuilder132.append(": ");
                    stringBuilder132.append(g.m14549b(i2));
                    c2972a62.mo3674a(stringBuilder132.toString());
                }
                if (obj3 != null) {
                    if (!C2924e.m14165d(a5)) {
                        if (m23901a(a5.m14016g())) {
                            C4394e c32 = h.mo916c();
                            c32.mo4552b(Long.MAX_VALUE);
                            c2 = c32.mo4553c();
                            C4914k c4914k22 = null;
                            if ("gzip".equalsIgnoreCase(g.m14548a("Content-Encoding"))) {
                                obj = null;
                            } else {
                                obj = Long.valueOf(c2.m27502b());
                                c4914k = new C4914k(c2.m27549u());
                                c2 = new C4755c();
                                c2.mo4545a(c4914k);
                                c4914k.close();
                            }
                            charset2 = f18233a;
                            a7 = h.mo914a();
                            if (a7 != null) {
                                charset2 = a7.m14562a(f18233a);
                            }
                            if (m23902a(c2)) {
                                if (b2 != 0) {
                                    r1.f18234b.mo3674a("");
                                    r1.f18234b.mo3674a(c2.m27549u().mo4546a(charset2));
                                }
                                if (obj == null) {
                                    c2972a3 = r1.f18234b;
                                    stringBuilder9 = new StringBuilder();
                                    stringBuilder9.append("<-- END HTTP (");
                                    stringBuilder9.append(c2.m27502b());
                                    stringBuilder9.append("-byte body)");
                                    c2972a3.mo3674a(stringBuilder9.toString());
                                } else {
                                    C2972a c2972a72 = r1.f18234b;
                                    stringBuilder4 = new StringBuilder();
                                    stringBuilder4.append("<-- END HTTP (");
                                    stringBuilder4.append(c2.m27502b());
                                    stringBuilder4.append("-byte, ");
                                    stringBuilder4.append(obj);
                                    stringBuilder4.append("-gzipped-byte body)");
                                    c2972a72.mo3674a(stringBuilder4.toString());
                                }
                            } else {
                                r1.f18234b.mo3674a("");
                                c2972a3 = r1.f18234b;
                                stringBuilder9 = new StringBuilder();
                                stringBuilder9.append("<-- END HTTP (binary ");
                                stringBuilder9.append(c2.m27502b());
                                stringBuilder9.append("-byte body omitted)");
                                c2972a3.mo3674a(stringBuilder9.toString());
                                return a5;
                            }
                        }
                        r1.f18234b.mo3674a("<-- END HTTP (encoded body omitted)");
                    }
                }
                r1.f18234b.mo3674a("<-- END HTTP");
            }
            return a5;
        } catch (Exception e) {
            Exception exception = e;
            C2972a c2972a8 = r1.f18234b;
            stringBuilder9 = new StringBuilder();
            stringBuilder9.append("<-- HTTP FAILED: ");
            stringBuilder9.append(exception);
            c2972a8.mo3674a(stringBuilder9.toString());
            throw exception;
        }
    }

    /* renamed from: a */
    static boolean m23902a(okio.C4755c r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r7 = new okio.c;	 Catch:{ EOFException -> 0x0040 }
        r7.<init>();	 Catch:{ EOFException -> 0x0040 }
        r1 = r8.m27502b();	 Catch:{ EOFException -> 0x0040 }
        r3 = 64;	 Catch:{ EOFException -> 0x0040 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ EOFException -> 0x0040 }
        if (r5 >= 0) goto L_0x0016;	 Catch:{ EOFException -> 0x0040 }
    L_0x0010:
        r1 = r8.m27502b();	 Catch:{ EOFException -> 0x0040 }
        r5 = r1;	 Catch:{ EOFException -> 0x0040 }
        goto L_0x0017;	 Catch:{ EOFException -> 0x0040 }
    L_0x0016:
        r5 = r3;	 Catch:{ EOFException -> 0x0040 }
    L_0x0017:
        r3 = 0;	 Catch:{ EOFException -> 0x0040 }
        r1 = r8;	 Catch:{ EOFException -> 0x0040 }
        r2 = r7;	 Catch:{ EOFException -> 0x0040 }
        r1.m27496a(r2, r3, r5);	 Catch:{ EOFException -> 0x0040 }
        r8 = 0;	 Catch:{ EOFException -> 0x0040 }
    L_0x001f:
        r1 = 16;	 Catch:{ EOFException -> 0x0040 }
        if (r8 >= r1) goto L_0x003e;	 Catch:{ EOFException -> 0x0040 }
    L_0x0023:
        r1 = r7.mo4557e();	 Catch:{ EOFException -> 0x0040 }
        if (r1 == 0) goto L_0x002a;	 Catch:{ EOFException -> 0x0040 }
    L_0x0029:
        goto L_0x003e;	 Catch:{ EOFException -> 0x0040 }
    L_0x002a:
        r1 = r7.m27546r();	 Catch:{ EOFException -> 0x0040 }
        r2 = java.lang.Character.isISOControl(r1);	 Catch:{ EOFException -> 0x0040 }
        if (r2 == 0) goto L_0x003b;	 Catch:{ EOFException -> 0x0040 }
    L_0x0034:
        r1 = java.lang.Character.isWhitespace(r1);	 Catch:{ EOFException -> 0x0040 }
        if (r1 != 0) goto L_0x003b;
    L_0x003a:
        return r0;
    L_0x003b:
        r8 = r8 + 1;
        goto L_0x001f;
    L_0x003e:
        r8 = 1;
        return r8;
    L_0x0040:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.a(okio.c):boolean");
    }

    /* renamed from: a */
    private boolean m23901a(C2981s c2981s) {
        c2981s = c2981s.m14548a("Content-Encoding");
        return (c2981s == null || c2981s.equalsIgnoreCase("identity") || c2981s.equalsIgnoreCase("gzip") != null) ? null : true;
    }
}
