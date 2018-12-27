package okhttp3.internal.p161g;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: okhttp3.internal.g.b */
public final class C4362b implements C2949e {
    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f18167a = new LinkedHashMap();

    public C4362b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.f18167a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f18167a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public java.security.cert.X509Certificate mo3647a(java.security.cert.X509Certificate r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r5.getIssuerX500Principal();
        r1 = r4.f18167a;
        r0 = r1.get(r0);
        r0 = (java.util.Set) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r0 = r0.iterator();
    L_0x0014:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0028;
    L_0x001a:
        r2 = r0.next();
        r2 = (java.security.cert.X509Certificate) r2;
        r3 = r2.getPublicKey();
        r5.verify(r3);	 Catch:{ Exception -> 0x0014 }
        return r2;
    L_0x0028:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.g.b.a(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4362b) || ((C4362b) obj).f18167a.equals(this.f18167a) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f18167a.hashCode();
    }
}
