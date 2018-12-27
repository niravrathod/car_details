package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.C2933c;
import okhttp3.internal.p161g.C2947c;
import okio.ByteString;

/* renamed from: okhttp3.g */
public final class C2907g {
    /* renamed from: a */
    public static final C2907g f12232a = new C2905a().m14074a();
    /* renamed from: b */
    private final Set<C2906b> f12233b;
    @Nullable
    /* renamed from: c */
    private final C2947c f12234c;

    /* renamed from: okhttp3.g$a */
    public static final class C2905a {
        /* renamed from: a */
        private final List<C2906b> f12227a = new ArrayList();

        /* renamed from: a */
        public C2907g m14074a() {
            return new C2907g(new LinkedHashSet(this.f12227a), null);
        }
    }

    /* renamed from: okhttp3.g$b */
    static final class C2906b {
        /* renamed from: a */
        final String f12228a;
        /* renamed from: b */
        final String f12229b;
        /* renamed from: c */
        final String f12230c;
        /* renamed from: d */
        final ByteString f12231d;

        /* renamed from: a */
        boolean m14075a(String str) {
            if (!this.f12228a.startsWith("*.")) {
                return str.equals(this.f12229b);
            }
            int indexOf = str.indexOf(46);
            boolean z = true;
            if ((str.length() - indexOf) - 1 == this.f12229b.length()) {
                if (str.regionMatches(false, indexOf + 1, this.f12229b, 0, this.f12229b.length()) != null) {
                    return z;
                }
            }
            z = false;
            return z;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2906b) {
                C2906b c2906b = (C2906b) obj;
                if (this.f12228a.equals(c2906b.f12228a) && this.f12230c.equals(c2906b.f12230c) && this.f12231d.equals(c2906b.f12231d) != null) {
                    return true;
                }
            }
            return null;
        }

        public int hashCode() {
            return ((((527 + this.f12228a.hashCode()) * 31) + this.f12230c.hashCode()) * 31) + this.f12231d.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f12230c);
            stringBuilder.append(this.f12231d.m14654b());
            return stringBuilder.toString();
        }
    }

    C2907g(Set<C2906b> set, @Nullable C2947c c2947c) {
        this.f12233b = set;
        this.f12234c = c2947c;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2907g) {
            C2907g c2907g = (C2907g) obj;
            if (C2933c.m14197a(this.f12234c, c2907g.f12234c) && this.f12233b.equals(c2907g.f12233b) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((this.f12234c != null ? this.f12234c.hashCode() : 0) * 31) + this.f12233b.hashCode();
    }

    /* renamed from: a */
    public void m14081a(String str, List<Certificate> list) {
        List a = m14079a(str);
        if (!a.isEmpty()) {
            int i;
            if (this.f12234c != null) {
                list = this.f12234c.mo3646a(list, str);
            }
            int size = list.size();
            for (i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = a.size();
                Object obj = null;
                Object obj2 = obj;
                for (int i2 = 0; i2 < size2; i2++) {
                    C2906b c2906b = (C2906b) a.get(i2);
                    if (c2906b.f12230c.equals("sha256/")) {
                        if (obj == null) {
                            obj = C2907g.m14078b(x509Certificate);
                        }
                        if (c2906b.f12231d.equals(obj)) {
                            return;
                        }
                    } else if (c2906b.f12230c.equals("sha1/")) {
                        if (obj2 == null) {
                            obj2 = C2907g.m14077a(x509Certificate);
                        }
                        if (c2906b.f12231d.equals(obj2)) {
                            return;
                        }
                    } else {
                        list = new StringBuilder();
                        list.append("unsupported hashAlgorithm: ");
                        list.append(c2906b.f12230c);
                        throw new AssertionError(list.toString());
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Certificate pinning failure!");
            stringBuilder.append("\n  Peer certificate chain:");
            i = list.size();
            for (int i3 = 0; i3 < i; i3++) {
                Certificate certificate = (X509Certificate) list.get(i3);
                stringBuilder.append("\n    ");
                stringBuilder.append(C2907g.m14076a(certificate));
                stringBuilder.append(": ");
                stringBuilder.append(certificate.getSubjectDN().getName());
            }
            stringBuilder.append("\n  Pinned certificates for ");
            stringBuilder.append(str);
            stringBuilder.append(":");
            str = a.size();
            for (int i4 = 0; i4 < str; i4++) {
                C2906b c2906b2 = (C2906b) a.get(i4);
                stringBuilder.append("\n    ");
                stringBuilder.append(c2906b2);
            }
            throw new SSLPeerUnverifiedException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    List<C2906b> m14079a(String str) {
        List<C2906b> emptyList = Collections.emptyList();
        for (C2906b c2906b : this.f12233b) {
            if (c2906b.m14075a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(c2906b);
            }
        }
        return emptyList;
    }

    /* renamed from: a */
    C2907g m14080a(@Nullable C2947c c2947c) {
        if (C2933c.m14197a(this.f12234c, (Object) c2947c)) {
            return this;
        }
        return new C2907g(this.f12233b, c2947c);
    }

    /* renamed from: a */
    public static String m14076a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sha256/");
            stringBuilder.append(C2907g.m14078b((X509Certificate) certificate).m14654b());
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: a */
    static ByteString m14077a(X509Certificate x509Certificate) {
        return ByteString.m14642a(x509Certificate.getPublicKey().getEncoded()).m14656d();
    }

    /* renamed from: b */
    static ByteString m14078b(X509Certificate x509Certificate) {
        return ByteString.m14642a(x509Certificate.getPublicKey().getEncoded()).m14657e();
    }
}
