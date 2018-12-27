package com.bumptech.glide.load.engine.p061b;

import android.support.v4.p017f.C0431k.C0430a;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.p055g.C1175f;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.p055g.C1180j;
import com.bumptech.glide.p055g.p056a.C1167a;
import com.bumptech.glide.p055g.p056a.C1167a.C1164a;
import com.bumptech.glide.p055g.p056a.C1167a.C1165c;
import com.bumptech.glide.p055g.p056a.C1170c;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.b.j */
public class C1252j {
    /* renamed from: a */
    private final C1175f<C1216c, String> f3966a = new C1175f(1000);
    /* renamed from: b */
    private final C0430a<C3475a> f3967b = C1167a.m4845b(10, new C34741(this));

    /* renamed from: com.bumptech.glide.load.engine.b.j$1 */
    class C34741 implements C1164a<C3475a> {
        /* renamed from: a */
        final /* synthetic */ C1252j f14438a;

        C34741(C1252j c1252j) {
            this.f14438a = c1252j;
        }

        /* renamed from: b */
        public /* synthetic */ Object mo955b() {
            return m17659a();
        }

        /* renamed from: a */
        public C3475a m17659a() {
            try {
                return new C3475a(MessageDigest.getInstance("SHA-256"));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b.j$a */
    private static final class C3475a implements C1165c {
        /* renamed from: a */
        final MessageDigest f14439a;
        /* renamed from: b */
        private final C1170c f14440b = C1170c.m4851a();

        C3475a(MessageDigest messageDigest) {
            this.f14439a = messageDigest;
        }

        public C1170c e_() {
            return this.f14440b;
        }
    }

    /* renamed from: a */
    public String m5088a(C1216c c1216c) {
        String str;
        synchronized (this.f3966a) {
            str = (String) this.f3966a.m4873b(c1216c);
        }
        if (str == null) {
            str = m5087b(c1216c);
        }
        synchronized (this.f3966a) {
            this.f3966a.m4874b(c1216c, str);
        }
        return str;
    }

    /* renamed from: b */
    private String m5087b(C1216c c1216c) {
        C3475a c3475a = (C3475a) C1178i.m4880a(this.f3967b.mo338a());
        try {
            c1216c.mo950a(c3475a.f14439a);
            c1216c = C1180j.m4892a(c3475a.f14439a.digest());
            return c1216c;
        } finally {
            this.f3967b.mo339a(c3475a);
        }
    }
}
