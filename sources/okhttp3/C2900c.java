package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.C2981s.C2980a;
import okhttp3.C2990y.C2989a;
import okhttp3.aa.C2896a;
import okhttp3.internal.p155a.C2911b;
import okhttp3.internal.p155a.C2913c;
import okhttp3.internal.p155a.C2918d;
import okhttp3.internal.p155a.C2918d.C2915a;
import okhttp3.internal.p155a.C2918d.C2917c;
import okhttp3.internal.p155a.C2919f;
import okhttp3.internal.p156b.C2924e;
import okhttp3.internal.p156b.C2927k;
import okhttp3.internal.p158d.C2940a;
import okhttp3.internal.p159e.C2945f;
import okio.ByteString;
import okio.C2994r;
import okio.C2995s;
import okio.C4393d;
import okio.C4394e;
import okio.C4755c;
import okio.C4905m;
import okio.C4910g;
import okio.C4911h;

/* renamed from: okhttp3.c */
public final class C2900c implements Closeable, Flushable {
    /* renamed from: a */
    final C2919f f12197a;
    /* renamed from: b */
    final C2918d f12198b;
    /* renamed from: c */
    int f12199c;
    /* renamed from: d */
    int f12200d;
    /* renamed from: e */
    private int f12201e;
    /* renamed from: f */
    private int f12202f;
    /* renamed from: g */
    private int f12203g;

    /* renamed from: okhttp3.c$c */
    private static final class C2899c {
        /* renamed from: a */
        private static final String f12185a;
        /* renamed from: b */
        private static final String f12186b;
        /* renamed from: c */
        private final String f12187c;
        /* renamed from: d */
        private final C2981s f12188d;
        /* renamed from: e */
        private final String f12189e;
        /* renamed from: f */
        private final Protocol f12190f;
        /* renamed from: g */
        private final int f12191g;
        /* renamed from: h */
        private final String f12192h;
        /* renamed from: i */
        private final C2981s f12193i;
        @Nullable
        /* renamed from: j */
        private final C2979r f12194j;
        /* renamed from: k */
        private final long f12195k;
        /* renamed from: l */
        private final long f12196l;

        static {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C2945f.m14270c().m14282d());
            stringBuilder.append("-Sent-Millis");
            f12185a = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(C2945f.m14270c().m14282d());
            stringBuilder.append("-Received-Millis");
            f12186b = stringBuilder.toString();
        }

        C2899c(C2995s c2995s) {
            try {
                C4394e a = C4905m.a(c2995s);
                this.f12187c = a.mo4576q();
                this.f12189e = a.mo4576q();
                C2980a c2980a = new C2980a();
                int a2 = C2900c.m14045a(a);
                for (int i = 0; i < a2; i++) {
                    c2980a.m14537a(a.mo4576q());
                }
                this.f12188d = c2980a.m14539a();
                C2927k a3 = C2927k.m14175a(a.mo4576q());
                this.f12190f = a3.f12346a;
                this.f12191g = a3.f12347b;
                this.f12192h = a3.f12348c;
                c2980a = new C2980a();
                a2 = C2900c.m14045a(a);
                for (int i2 = 0; i2 < a2; i2++) {
                    c2980a.m14537a(a.mo4576q());
                }
                String c = c2980a.m14542c(f12185a);
                String c2 = c2980a.m14542c(f12186b);
                c2980a.m14540b(f12185a);
                c2980a.m14540b(f12186b);
                long j = 0;
                this.f12195k = c != null ? Long.parseLong(c) : 0;
                if (c2 != null) {
                    j = Long.parseLong(c2);
                }
                this.f12196l = j;
                this.f12193i = c2980a.m14539a();
                if (m14041a()) {
                    String q = a.mo4576q();
                    if (q.length() <= 0) {
                        TlsVersion tlsVersion;
                        C2909h a4 = C2909h.m14084a(a.mo4576q());
                        List a5 = m14039a(a);
                        List a6 = m14039a(a);
                        if (a.mo4557e()) {
                            tlsVersion = TlsVersion.SSL_3_0;
                        } else {
                            tlsVersion = TlsVersion.m13978a(a.mo4576q());
                        }
                        this.f12194j = C2979r.m14531a(tlsVersion, a4, a5, a6);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("expected \"\" but was \"");
                        stringBuilder.append(q);
                        stringBuilder.append("\"");
                        throw new IOException(stringBuilder.toString());
                    }
                }
                this.f12194j = null;
                c2995s.close();
            } catch (Throwable th) {
                c2995s.close();
            }
        }

        C2899c(aa aaVar) {
            this.f12187c = aaVar.m14010a().m14623a().toString();
            this.f12188d = C2924e.m14164c(aaVar);
            this.f12189e = aaVar.m14010a().m14624b();
            this.f12190f = aaVar.m14011b();
            this.f12191g = aaVar.m14012c();
            this.f12192h = aaVar.m14014e();
            this.f12193i = aaVar.m14016g();
            this.f12194j = aaVar.m14015f();
            this.f12195k = aaVar.m14023n();
            this.f12196l = aaVar.m14024o();
        }

        /* renamed from: a */
        public void m14043a(C2915a c2915a) {
            int i = 0;
            C4393d a = C4905m.a(c2915a.m14097a(0));
            a.mo4550b(this.f12187c).mo4568k(10);
            a.mo4550b(this.f12189e).mo4568k(10);
            a.mo4573m((long) this.f12188d.m14546a()).mo4568k(10);
            int a2 = this.f12188d.m14546a();
            for (int i2 = 0; i2 < a2; i2++) {
                a.mo4550b(this.f12188d.m14547a(i2)).mo4550b(": ").mo4550b(this.f12188d.m14549b(i2)).mo4568k(10);
            }
            a.mo4550b(new C2927k(this.f12190f, this.f12191g, this.f12192h).toString()).mo4568k(10);
            a.mo4573m((long) (this.f12193i.m14546a() + 2)).mo4568k(10);
            a2 = this.f12193i.m14546a();
            while (i < a2) {
                a.mo4550b(this.f12193i.m14547a(i)).mo4550b(": ").mo4550b(this.f12193i.m14549b(i)).mo4568k(10);
                i++;
            }
            a.mo4550b(f12185a).mo4550b(": ").mo4573m(this.f12195k).mo4568k(10);
            a.mo4550b(f12186b).mo4550b(": ").mo4573m(this.f12196l).mo4568k(10);
            if (m14041a()) {
                a.mo4568k(10);
                a.mo4550b(this.f12194j.m14533b().m14086a()).mo4568k(10);
                m14040a(a, this.f12194j.m14534c());
                m14040a(a, this.f12194j.m14535d());
                a.mo4550b(this.f12194j.m14532a().m13979a()).mo4568k(10);
            }
            a.close();
        }

        /* renamed from: a */
        private boolean m14041a() {
            return this.f12187c.startsWith("https://");
        }

        /* renamed from: a */
        private List<Certificate> m14039a(C4394e c4394e) {
            int a = C2900c.m14045a(c4394e);
            if (a == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                List<Certificate> arrayList = new ArrayList(a);
                for (int i = 0; i < a; i++) {
                    String q = c4394e.mo4576q();
                    C4755c c4755c = new C4755c();
                    c4755c.m27495a(ByteString.m14643b(q));
                    arrayList.add(instance.generateCertificate(c4755c.mo4558f()));
                }
                return arrayList;
            } catch (C4394e c4394e2) {
                throw new IOException(c4394e2.getMessage());
            }
        }

        /* renamed from: a */
        private void m14040a(C4393d c4393d, List<Certificate> list) {
            try {
                c4393d.mo4573m((long) list.size()).mo4568k(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    c4393d.mo4550b(ByteString.m14642a(((Certificate) list.get(i)).getEncoded()).m14654b()).mo4568k(10);
                }
            } catch (C4393d c4393d2) {
                throw new IOException(c4393d2.getMessage());
            }
        }

        /* renamed from: a */
        public boolean m14044a(C2990y c2990y, aa aaVar) {
            return (this.f12187c.equals(c2990y.m14623a().toString()) && this.f12189e.equals(c2990y.m14624b()) && C2924e.m14159a(aaVar, this.f12188d, c2990y) != null) ? true : null;
        }

        /* renamed from: a */
        public aa m14042a(C2917c c2917c) {
            String a = this.f12193i.m14548a("Content-Type");
            String a2 = this.f12193i.m14548a("Content-Length");
            return new C2896a().m14003a(new C2989a().m14608a(this.f12187c).m14610a(this.f12189e, null).m14613a(this.f12188d).m14620c()).m13998a(this.f12190f).m13994a(this.f12191g).m13996a(this.f12192h).m14002a(this.f12193i).m14000a(new C4340b(c2917c, a, a2)).m14001a(this.f12194j).m13995a(this.f12195k).m14005b(this.f12196l).m14004a();
        }
    }

    /* renamed from: okhttp3.c$1 */
    class C43381 implements C2919f {
        /* renamed from: a */
        final /* synthetic */ C2900c f18079a;

        C43381(C2900c c2900c) {
            this.f18079a = c2900c;
        }

        /* renamed from: a */
        public aa mo3607a(C2990y c2990y) {
            return this.f18079a.m14048a(c2990y);
        }

        /* renamed from: a */
        public C2911b mo3608a(aa aaVar) {
            return this.f18079a.m14049a(aaVar);
        }

        /* renamed from: b */
        public void mo3612b(C2990y c2990y) {
            this.f18079a.m14053b(c2990y);
        }

        /* renamed from: a */
        public void mo3610a(aa aaVar, aa aaVar2) {
            this.f18079a.m14051a(aaVar, aaVar2);
        }

        /* renamed from: a */
        public void mo3609a() {
            this.f18079a.m14050a();
        }

        /* renamed from: a */
        public void mo3611a(C2913c c2913c) {
            this.f18079a.m14052a(c2913c);
        }
    }

    /* renamed from: okhttp3.c$a */
    private final class C4339a implements C2911b {
        /* renamed from: a */
        boolean f18080a;
        /* renamed from: b */
        final /* synthetic */ C2900c f18081b;
        /* renamed from: c */
        private final C2915a f18082c;
        /* renamed from: d */
        private C2994r f18083d;
        /* renamed from: e */
        private C2994r f18084e;

        C4339a(final C2900c c2900c, final C2915a c2915a) {
            this.f18081b = c2900c;
            this.f18082c = c2915a;
            this.f18083d = c2915a.m14097a(1);
            this.f18084e = new C4910g(this, this.f18083d) {
                /* renamed from: c */
                final /* synthetic */ C4339a f20794c;

                public void close() {
                    synchronized (this.f20794c.f18081b) {
                        if (this.f20794c.f18080a) {
                            return;
                        }
                        this.f20794c.f18080a = true;
                        C2900c c2900c = this.f20794c.f18081b;
                        c2900c.f12199c++;
                        super.close();
                        c2915a.m14099b();
                    }
                }
            };
        }

        /* renamed from: a */
        public void mo3613a() {
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
            r4 = this;
            r0 = r4.f18081b;
            monitor-enter(r0);
            r1 = r4.f18080a;	 Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0009;	 Catch:{ all -> 0x001f }
        L_0x0007:
            monitor-exit(r0);	 Catch:{ all -> 0x001f }
            return;	 Catch:{ all -> 0x001f }
        L_0x0009:
            r1 = 1;	 Catch:{ all -> 0x001f }
            r4.f18080a = r1;	 Catch:{ all -> 0x001f }
            r2 = r4.f18081b;	 Catch:{ all -> 0x001f }
            r3 = r2.f12200d;	 Catch:{ all -> 0x001f }
            r3 = r3 + r1;	 Catch:{ all -> 0x001f }
            r2.f12200d = r3;	 Catch:{ all -> 0x001f }
            monitor-exit(r0);	 Catch:{ all -> 0x001f }
            r0 = r4.f18083d;
            okhttp3.internal.C2933c.m14194a(r0);
            r0 = r4.f18082c;	 Catch:{ IOException -> 0x001e }
            r0.m14100c();	 Catch:{ IOException -> 0x001e }
        L_0x001e:
            return;
        L_0x001f:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x001f }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.c.a.a():void");
        }

        /* renamed from: b */
        public C2994r mo3614b() {
            return this.f18084e;
        }
    }

    /* renamed from: okhttp3.c$b */
    private static class C4340b extends ab {
        /* renamed from: a */
        final C2917c f18085a;
        /* renamed from: b */
        private final C4394e f18086b;
        @Nullable
        /* renamed from: c */
        private final String f18087c;
        @Nullable
        /* renamed from: d */
        private final String f18088d;

        C4340b(final C2917c c2917c, String str, String str2) {
            this.f18085a = c2917c;
            this.f18087c = str;
            this.f18088d = str2;
            this.f18086b = C4905m.a(new C4911h(this, c2917c.m14106a(1)) {
                /* renamed from: b */
                final /* synthetic */ C4340b f20796b;

                public void close() {
                    c2917c.close();
                    super.close();
                }
            });
        }

        /* renamed from: a */
        public C2984u mo914a() {
            return this.f18087c != null ? C2984u.m14560a(this.f18087c) : null;
        }

        /* renamed from: b */
        public long mo915b() {
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
            r4 = this;
            r0 = -1;
            r2 = r4.f18088d;	 Catch:{ NumberFormatException -> 0x000e }
            if (r2 == 0) goto L_0x000d;	 Catch:{ NumberFormatException -> 0x000e }
        L_0x0006:
            r2 = r4.f18088d;	 Catch:{ NumberFormatException -> 0x000e }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x000e }
            r0 = r2;
        L_0x000d:
            return r0;
        L_0x000e:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.c.b.b():long");
        }

        /* renamed from: c */
        public C4394e mo916c() {
            return this.f18086b;
        }
    }

    public C2900c(File file, long j) {
        this(file, j, C2940a.f12402a);
    }

    C2900c(File file, long j, C2940a c2940a) {
        this.f12197a = new C43381(this);
        this.f12198b = C2918d.m14107a(c2940a, file, 201105, 2, j);
    }

    /* renamed from: a */
    public static String m14046a(HttpUrl httpUrl) {
        return ByteString.m14641a(httpUrl.toString()).m14655c().m14658f();
    }

    @javax.annotation.Nullable
    /* renamed from: a */
    okhttp3.aa m14048a(okhttp3.C2990y r5) {
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
        r0 = r5.m14623a();
        r0 = okhttp3.C2900c.m14046a(r0);
        r1 = 0;
        r2 = r4.f12198b;	 Catch:{ IOException -> 0x0033 }
        r0 = r2.m14115a(r0);	 Catch:{ IOException -> 0x0033 }
        if (r0 != 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        r2 = new okhttp3.c$c;	 Catch:{ IOException -> 0x002f }
        r3 = 0;	 Catch:{ IOException -> 0x002f }
        r3 = r0.m14106a(r3);	 Catch:{ IOException -> 0x002f }
        r2.<init>(r3);	 Catch:{ IOException -> 0x002f }
        r0 = r2.m14042a(r0);
        r5 = r2.m14044a(r5, r0);
        if (r5 != 0) goto L_0x002e;
    L_0x0026:
        r5 = r0.m14017h();
        okhttp3.internal.C2933c.m14194a(r5);
        return r1;
    L_0x002e:
        return r0;
    L_0x002f:
        okhttp3.internal.C2933c.m14194a(r0);
        return r1;
    L_0x0033:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.c.a(okhttp3.y):okhttp3.aa");
    }

    @javax.annotation.Nullable
    /* renamed from: a */
    okhttp3.internal.p155a.C2911b m14049a(okhttp3.aa r4) {
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
        r0 = r4.m14010a();
        r0 = r0.m14624b();
        r1 = r4.m14010a();
        r1 = r1.m14624b();
        r1 = okhttp3.internal.p156b.C2925f.m14167a(r1);
        r2 = 0;
        if (r1 == 0) goto L_0x001f;
    L_0x0017:
        r4 = r4.m14010a();	 Catch:{ IOException -> 0x001e }
        r3.m14053b(r4);	 Catch:{ IOException -> 0x001e }
    L_0x001e:
        return r2;
    L_0x001f:
        r1 = "GET";
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0028;
    L_0x0027:
        return r2;
    L_0x0028:
        r0 = okhttp3.internal.p156b.C2924e.m14161b(r4);
        if (r0 == 0) goto L_0x002f;
    L_0x002e:
        return r2;
    L_0x002f:
        r0 = new okhttp3.c$c;
        r0.<init>(r4);
        r1 = r3.f12198b;	 Catch:{ IOException -> 0x0052 }
        r4 = r4.m14010a();	 Catch:{ IOException -> 0x0052 }
        r4 = r4.m14623a();	 Catch:{ IOException -> 0x0052 }
        r4 = okhttp3.C2900c.m14046a(r4);	 Catch:{ IOException -> 0x0052 }
        r4 = r1.m14119b(r4);	 Catch:{ IOException -> 0x0052 }
        if (r4 != 0) goto L_0x0049;
    L_0x0048:
        return r2;
    L_0x0049:
        r0.m14043a(r4);	 Catch:{ IOException -> 0x0053 }
        r0 = new okhttp3.c$a;	 Catch:{ IOException -> 0x0053 }
        r0.<init>(r3, r4);	 Catch:{ IOException -> 0x0053 }
        return r0;
    L_0x0052:
        r4 = r2;
    L_0x0053:
        r3.m14047a(r4);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.c.a(okhttp3.aa):okhttp3.internal.a.b");
    }

    /* renamed from: b */
    void m14053b(C2990y c2990y) {
        this.f12198b.m14122c(C2900c.m14046a(c2990y.m14623a()));
    }

    /* renamed from: a */
    void m14051a(okhttp3.aa r2, okhttp3.aa r3) {
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
        r1 = this;
        r0 = new okhttp3.c$c;
        r0.<init>(r3);
        r2 = r2.m14017h();
        r2 = (okhttp3.C2900c.C4340b) r2;
        r2 = r2.f18085a;
        r2 = r2.m14105a();	 Catch:{ IOException -> 0x001a }
        if (r2 == 0) goto L_0x001e;
    L_0x0013:
        r0.m14043a(r2);	 Catch:{ IOException -> 0x001b }
        r2.m14099b();	 Catch:{ IOException -> 0x001b }
        goto L_0x001e;
    L_0x001a:
        r2 = 0;
    L_0x001b:
        r1.m14047a(r2);
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.c.a(okhttp3.aa, okhttp3.aa):void");
    }

    /* renamed from: a */
    private void m14047a(@javax.annotation.Nullable okhttp3.internal.p155a.C2918d.C2915a r1) {
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
        r0 = this;
        if (r1 == 0) goto L_0x0005;
    L_0x0002:
        r1.m14100c();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.c.a(okhttp3.internal.a.d$a):void");
    }

    public void flush() {
        this.f12198b.flush();
    }

    public void close() {
        this.f12198b.close();
    }

    /* renamed from: a */
    synchronized void m14052a(C2913c c2913c) {
        this.f12203g++;
        if (c2913c.f12299a != null) {
            this.f12201e++;
        } else if (c2913c.f12300b != null) {
            this.f12202f++;
        }
    }

    /* renamed from: a */
    synchronized void m14050a() {
        this.f12202f++;
    }

    /* renamed from: a */
    static int m14045a(C4394e c4394e) {
        try {
            long m = c4394e.mo4572m();
            c4394e = c4394e.mo4576q();
            if (m >= 0 && m <= 2147483647L && c4394e.isEmpty()) {
                return (int) m;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected an int but was \"");
            stringBuilder.append(m);
            stringBuilder.append(c4394e);
            stringBuilder.append("\"");
            throw new IOException(stringBuilder.toString());
        } catch (C4394e c4394e2) {
            throw new IOException(c4394e2.getMessage());
        }
    }
}
