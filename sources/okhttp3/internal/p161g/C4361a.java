package okhttp3.internal.p161g;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: okhttp3.internal.g.a */
public final class C4361a extends C2947c {
    /* renamed from: a */
    private final C2949e f18166a;

    public C4361a(C2949e c2949e) {
        this.f18166a = c2949e;
    }

    /* renamed from: a */
    public List<Certificate> mo3646a(List<Certificate> list, String str) {
        str = new ArrayDeque(list);
        list = new ArrayList();
        list.add(str.removeFirst());
        Object obj = null;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(list.size() - 1);
            X509Certificate a = this.f18166a.mo3647a(x509Certificate);
            if (a != null) {
                if (list.size() > 1 || !x509Certificate.equals(a)) {
                    list.add(a);
                }
                if (m23851a(a, a)) {
                    return list;
                }
                obj = 1;
            } else {
                Iterator it = str.iterator();
                while (it.hasNext()) {
                    a = (X509Certificate) it.next();
                    if (m23851a(x509Certificate, a)) {
                        it.remove();
                        list.add(a);
                    }
                }
                if (obj != null) {
                    return list;
                }
                str = new StringBuilder();
                str.append("Failed to find a trusted cert that signed ");
                str.append(x509Certificate);
                throw new SSLPeerUnverifiedException(str.toString());
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Certificate chain too long: ");
        stringBuilder.append(list);
        throw new SSLPeerUnverifiedException(stringBuilder.toString());
    }

    /* renamed from: a */
    private boolean m23851a(java.security.cert.X509Certificate r3, java.security.cert.X509Certificate r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r3.getIssuerDN();
        r1 = r4.getSubjectDN();
        r0 = r0.equals(r1);
        r1 = 0;
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r4 = r4.getPublicKey();	 Catch:{ GeneralSecurityException -> 0x0019 }
        r3.verify(r4);	 Catch:{ GeneralSecurityException -> 0x0019 }
        r3 = 1;
        return r3;
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.g.a.a(java.security.cert.X509Certificate, java.security.cert.X509Certificate):boolean");
    }

    public int hashCode() {
        return this.f18166a.hashCode();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4361a) || ((C4361a) obj).f18166a.equals(this.f18166a) == null) {
            z = false;
        }
        return z;
    }
}
