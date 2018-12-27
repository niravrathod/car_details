package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.C2933c;

/* renamed from: okhttp3.r */
public final class C2979r {
    /* renamed from: a */
    private final TlsVersion f12596a;
    /* renamed from: b */
    private final C2909h f12597b;
    /* renamed from: c */
    private final List<Certificate> f12598c;
    /* renamed from: d */
    private final List<Certificate> f12599d;

    private C2979r(TlsVersion tlsVersion, C2909h c2909h, List<Certificate> list, List<Certificate> list2) {
        this.f12596a = tlsVersion;
        this.f12597b = c2909h;
        this.f12598c = list;
        this.f12599d = list2;
    }

    /* renamed from: a */
    public static okhttp3.C2979r m14530a(javax.net.ssl.SSLSession r4) {
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
        r0 = r4.getCipherSuite();
        if (r0 == 0) goto L_0x0042;
    L_0x0006:
        r0 = okhttp3.C2909h.m14084a(r0);
        r1 = r4.getProtocol();
        if (r1 == 0) goto L_0x003a;
    L_0x0010:
        r1 = okhttp3.TlsVersion.m13978a(r1);
        r2 = r4.getPeerCertificates();	 Catch:{ SSLPeerUnverifiedException -> 0x0019 }
        goto L_0x001a;
    L_0x0019:
        r2 = 0;
    L_0x001a:
        if (r2 == 0) goto L_0x0021;
    L_0x001c:
        r2 = okhttp3.internal.C2933c.m14191a(r2);
        goto L_0x0025;
    L_0x0021:
        r2 = java.util.Collections.emptyList();
    L_0x0025:
        r4 = r4.getLocalCertificates();
        if (r4 == 0) goto L_0x0030;
    L_0x002b:
        r4 = okhttp3.internal.C2933c.m14191a(r4);
        goto L_0x0034;
    L_0x0030:
        r4 = java.util.Collections.emptyList();
    L_0x0034:
        r3 = new okhttp3.r;
        r3.<init>(r1, r0, r2, r4);
        return r3;
    L_0x003a:
        r4 = new java.lang.IllegalStateException;
        r0 = "tlsVersion == null";
        r4.<init>(r0);
        throw r4;
    L_0x0042:
        r4 = new java.lang.IllegalStateException;
        r0 = "cipherSuite == null";
        r4.<init>(r0);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.r.a(javax.net.ssl.SSLSession):okhttp3.r");
    }

    /* renamed from: a */
    public static C2979r m14531a(TlsVersion tlsVersion, C2909h c2909h, List<Certificate> list, List<Certificate> list2) {
        if (tlsVersion == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (c2909h != null) {
            return new C2979r(tlsVersion, c2909h, C2933c.m14190a((List) list), C2933c.m14190a((List) list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    /* renamed from: a */
    public TlsVersion m14532a() {
        return this.f12596a;
    }

    /* renamed from: b */
    public C2909h m14533b() {
        return this.f12597b;
    }

    /* renamed from: c */
    public List<Certificate> m14534c() {
        return this.f12598c;
    }

    /* renamed from: d */
    public List<Certificate> m14535d() {
        return this.f12599d;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = false;
        if (!(obj instanceof C2979r)) {
            return false;
        }
        C2979r c2979r = (C2979r) obj;
        if (this.f12596a.equals(c2979r.f12596a) && this.f12597b.equals(c2979r.f12597b) && this.f12598c.equals(c2979r.f12598c) && this.f12599d.equals(c2979r.f12599d) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((((527 + this.f12596a.hashCode()) * 31) + this.f12597b.hashCode()) * 31) + this.f12598c.hashCode()) * 31) + this.f12599d.hashCode();
    }
}
