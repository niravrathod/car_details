package com.bumptech.glide.load.p059b;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.p055g.C1178i;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.b.g */
public class C3421g implements C1216c {
    /* renamed from: b */
    private final C1199h f14314b;
    /* renamed from: c */
    private final URL f14315c;
    /* renamed from: d */
    private final String f14316d;
    /* renamed from: e */
    private String f14317e;
    /* renamed from: f */
    private URL f14318f;
    /* renamed from: g */
    private volatile byte[] f14319g;
    /* renamed from: h */
    private int f14320h;

    public C3421g(URL url) {
        this(url, C1199h.f3871b);
    }

    public C3421g(String str) {
        this(str, C1199h.f3871b);
    }

    public C3421g(URL url, C1199h c1199h) {
        this.f14315c = (URL) C1178i.m4880a((Object) url);
        this.f14316d = null;
        this.f14314b = (C1199h) C1178i.m4880a((Object) c1199h);
    }

    public C3421g(String str, C1199h c1199h) {
        this.f14315c = null;
        this.f14316d = C1178i.m4882a(str);
        this.f14314b = (C1199h) C1178i.m4880a((Object) c1199h);
    }

    /* renamed from: a */
    public URL m17442a() {
        return m17439d();
    }

    /* renamed from: d */
    private URL m17439d() {
        if (this.f14318f == null) {
            this.f14318f = new URL(m17440e());
        }
        return this.f14318f;
    }

    /* renamed from: e */
    private String m17440e() {
        if (TextUtils.isEmpty(this.f14317e)) {
            String str = this.f14316d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C1178i.m4880a(this.f14315c)).toString();
            }
            this.f14317e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f14317e;
    }

    /* renamed from: b */
    public Map<String, String> m17444b() {
        return this.f14314b.mo982a();
    }

    /* renamed from: c */
    public String m17445c() {
        return this.f14316d != null ? this.f14316d : ((URL) C1178i.m4880a(this.f14315c)).toString();
    }

    public String toString() {
        return m17445c();
    }

    /* renamed from: a */
    public void mo950a(MessageDigest messageDigest) {
        messageDigest.update(m17441f());
    }

    /* renamed from: f */
    private byte[] m17441f() {
        if (this.f14319g == null) {
            this.f14319g = m17445c().getBytes(a);
        }
        return this.f14319g;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C3421g)) {
            return false;
        }
        C3421g c3421g = (C3421g) obj;
        if (m17445c().equals(c3421g.m17445c()) && this.f14314b.equals(c3421g.f14314b) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        if (this.f14320h == 0) {
            this.f14320h = m17445c().hashCode();
            this.f14320h = (this.f14320h * 31) + this.f14314b.hashCode();
        }
        return this.f14320h;
    }
}
