package okhttp3;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.C2933c;

/* renamed from: okhttp3.k */
public final class C2969k {
    /* renamed from: a */
    public static final C2969k f12547a = new C2968a(true).m14453a(f12550h).m14452a(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m14450a(true).m14454a();
    /* renamed from: b */
    public static final C2969k f12548b = new C2968a(f12547a).m14452a(TlsVersion.TLS_1_0).m14450a(true).m14454a();
    /* renamed from: c */
    public static final C2969k f12549c = new C2968a(false).m14454a();
    /* renamed from: h */
    private static final C2909h[] f12550h = new C2909h[]{C2909h.aX, C2909h.bb, C2909h.aY, C2909h.bc, C2909h.bi, C2909h.bh, C2909h.aI, C2909h.aJ, C2909h.ag, C2909h.ah, C2909h.f12239E, C2909h.f12243I, C2909h.f12269i};
    /* renamed from: d */
    final boolean f12551d;
    /* renamed from: e */
    final boolean f12552e;
    @Nullable
    /* renamed from: f */
    final String[] f12553f;
    @Nullable
    /* renamed from: g */
    final String[] f12554g;

    /* renamed from: okhttp3.k$a */
    public static final class C2968a {
        /* renamed from: a */
        boolean f12543a;
        @Nullable
        /* renamed from: b */
        String[] f12544b;
        @Nullable
        /* renamed from: c */
        String[] f12545c;
        /* renamed from: d */
        boolean f12546d;

        C2968a(boolean z) {
            this.f12543a = z;
        }

        public C2968a(C2969k c2969k) {
            this.f12543a = c2969k.f12551d;
            this.f12544b = c2969k.f12553f;
            this.f12545c = c2969k.f12554g;
            this.f12546d = c2969k.f12552e;
        }

        /* renamed from: a */
        public C2968a m14453a(C2909h... c2909hArr) {
            if (this.f12543a) {
                String[] strArr = new String[c2909hArr.length];
                for (int i = 0; i < c2909hArr.length; i++) {
                    strArr[i] = c2909hArr[i].bj;
                }
                return m14451a(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: a */
        public C2968a m14451a(String... strArr) {
            if (!this.f12543a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f12544b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: a */
        public C2968a m14452a(TlsVersion... tlsVersionArr) {
            if (this.f12543a) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i = 0; i < tlsVersionArr.length; i++) {
                    strArr[i] = tlsVersionArr[i].javaName;
                }
                return m14455b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: b */
        public C2968a m14455b(String... strArr) {
            if (!this.f12543a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f12545c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: a */
        public C2968a m14450a(boolean z) {
            if (this.f12543a) {
                this.f12546d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: a */
        public C2969k m14454a() {
            return new C2969k(this);
        }
    }

    C2969k(C2968a c2968a) {
        this.f12551d = c2968a.f12543a;
        this.f12553f = c2968a.f12544b;
        this.f12554g = c2968a.f12545c;
        this.f12552e = c2968a.f12546d;
    }

    /* renamed from: a */
    public boolean m14458a() {
        return this.f12551d;
    }

    @Nullable
    /* renamed from: b */
    public List<C2909h> m14460b() {
        return this.f12553f != null ? C2909h.m14083a(this.f12553f) : null;
    }

    @Nullable
    /* renamed from: c */
    public List<TlsVersion> m14461c() {
        return this.f12554g != null ? TlsVersion.m13977a(this.f12554g) : null;
    }

    /* renamed from: d */
    public boolean m14462d() {
        return this.f12552e;
    }

    /* renamed from: a */
    void m14457a(SSLSocket sSLSocket, boolean z) {
        z = m14456b(sSLSocket, z);
        if (z.f12554g != null) {
            sSLSocket.setEnabledProtocols(z.f12554g);
        }
        if (z.f12553f != null) {
            sSLSocket.setEnabledCipherSuites(z.f12553f);
        }
    }

    /* renamed from: b */
    private C2969k m14456b(SSLSocket sSLSocket, boolean z) {
        String[] a;
        String[] a2;
        if (this.f12553f != null) {
            a = C2933c.m14200a(C2909h.f12261a, sSLSocket.getEnabledCipherSuites(), this.f12553f);
        } else {
            a = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f12554g != null) {
            a2 = C2933c.m14200a(C2933c.f12359h, sSLSocket.getEnabledProtocols(), this.f12554g);
        } else {
            a2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        boolean a3 = C2933c.m14183a(C2909h.f12261a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && !a3) {
            a = C2933c.m14201a(a, supportedCipherSuites[a3]);
        }
        return new C2968a(this).m14451a(a).m14455b(a2).m14454a();
    }

    /* renamed from: a */
    public boolean m14459a(SSLSocket sSLSocket) {
        if (!this.f12551d) {
            return false;
        }
        if (this.f12554g != null && !C2933c.m14204b(C2933c.f12359h, this.f12554g, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f12553f == null || C2933c.m14204b(C2909h.f12261a, this.f12553f, sSLSocket.getEnabledCipherSuites()) != null) {
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C2969k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2969k c2969k = (C2969k) obj;
        if (this.f12551d != c2969k.f12551d) {
            return false;
        }
        return !this.f12551d || (Arrays.equals(this.f12553f, c2969k.f12553f) && Arrays.equals(this.f12554g, c2969k.f12554g) && this.f12552e == c2969k.f12552e);
    }

    public int hashCode() {
        return this.f12551d ? ((((527 + Arrays.hashCode(this.f12553f)) * 31) + Arrays.hashCode(this.f12554g)) * 31) + (this.f12552e ^ 1) : 17;
    }

    public String toString() {
        if (!this.f12551d) {
            return "ConnectionSpec()";
        }
        String obj = this.f12553f != null ? m14460b().toString() : "[all enabled]";
        String obj2 = this.f12554g != null ? m14461c().toString() : "[all enabled]";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConnectionSpec(cipherSuites=");
        stringBuilder.append(obj);
        stringBuilder.append(", tlsVersions=");
        stringBuilder.append(obj2);
        stringBuilder.append(", supportsTlsExtensions=");
        stringBuilder.append(this.f12552e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
