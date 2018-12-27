package okhttp3.internal.p155a;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.C2902d;
import okhttp3.C2981s.C2980a;
import okhttp3.C2990y;
import okhttp3.aa;
import okhttp3.aa.C2896a;
import okhttp3.internal.C2920a;
import okhttp3.internal.p156b.C2923d;
import okhttp3.internal.p156b.C2924e;

/* renamed from: okhttp3.internal.a.c */
public final class C2913c {
    @Nullable
    /* renamed from: a */
    public final C2990y f12299a;
    @Nullable
    /* renamed from: b */
    public final aa f12300b;

    /* renamed from: okhttp3.internal.a.c$a */
    public static class C2912a {
        /* renamed from: a */
        final long f12287a;
        /* renamed from: b */
        final C2990y f12288b;
        /* renamed from: c */
        final aa f12289c;
        /* renamed from: d */
        private Date f12290d;
        /* renamed from: e */
        private String f12291e;
        /* renamed from: f */
        private Date f12292f;
        /* renamed from: g */
        private String f12293g;
        /* renamed from: h */
        private Date f12294h;
        /* renamed from: i */
        private long f12295i;
        /* renamed from: j */
        private long f12296j;
        /* renamed from: k */
        private String f12297k;
        /* renamed from: l */
        private int f12298l = -1;

        public C2912a(long j, C2990y c2990y, aa aaVar) {
            this.f12287a = j;
            this.f12288b = c2990y;
            this.f12289c = aaVar;
            if (aaVar != null) {
                this.f12295i = aaVar.m14023n();
                this.f12296j = aaVar.m14024o();
                j = aaVar.m14016g();
                c2990y = j.m14546a();
                for (int i = 0; i < c2990y; i++) {
                    aaVar = j.m14547a(i);
                    String b = j.m14549b(i);
                    if ("Date".equalsIgnoreCase(aaVar)) {
                        this.f12290d = C2923d.m14151a(b);
                        this.f12291e = b;
                    } else if ("Expires".equalsIgnoreCase(aaVar)) {
                        this.f12294h = C2923d.m14151a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(aaVar)) {
                        this.f12292f = C2923d.m14151a(b);
                        this.f12293g = b;
                    } else if ("ETag".equalsIgnoreCase(aaVar)) {
                        this.f12297k = b;
                    } else if ("Age".equalsIgnoreCase(aaVar) != null) {
                        this.f12298l = C2924e.m14160b(b, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public C2913c m14095a() {
            C2913c b = m14091b();
            return (b.f12299a == null || !this.f12288b.m14629f().m14068i()) ? b : new C2913c(null, null);
        }

        /* renamed from: b */
        private C2913c m14091b() {
            if (this.f12289c == null) {
                return new C2913c(this.f12288b, null);
            }
            if (this.f12288b.m14630g() && this.f12289c.m14015f() == null) {
                return new C2913c(this.f12288b, null);
            }
            if (!C2913c.m14096a(this.f12289c, this.f12288b)) {
                return new C2913c(this.f12288b, null);
            }
            C2902d f = this.f12288b.m14629f();
            if (!f.m14060a()) {
                if (!C2912a.m14090a(this.f12288b)) {
                    C2902d m = this.f12289c.m14022m();
                    if (m.m14069j()) {
                        return new C2913c(null, this.f12289c);
                    }
                    String str;
                    String str2;
                    long d = m14093d();
                    long c = m14092c();
                    if (f.m14062c() != -1) {
                        c = Math.min(c, TimeUnit.SECONDS.toMillis((long) f.m14062c()));
                    }
                    long j = 0;
                    long toMillis = f.m14067h() != -1 ? TimeUnit.SECONDS.toMillis((long) f.m14067h()) : 0;
                    if (!(m.m14065f() || f.m14066g() == -1)) {
                        j = TimeUnit.SECONDS.toMillis((long) f.m14066g());
                    }
                    if (!m.m14060a()) {
                        toMillis += d;
                        if (toMillis < j + c) {
                            C2896a i = this.f12289c.m14018i();
                            if (toMillis >= c) {
                                i.m13997a("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (d > 86400000 && m14094e()) {
                                i.m13997a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            return new C2913c(null, i.m14004a());
                        }
                    }
                    if (this.f12297k != null) {
                        str = "If-None-Match";
                        str2 = this.f12297k;
                    } else if (this.f12292f != null) {
                        str = "If-Modified-Since";
                        str2 = this.f12293g;
                    } else if (this.f12290d == null) {
                        return new C2913c(this.f12288b, null);
                    } else {
                        str = "If-Modified-Since";
                        str2 = this.f12291e;
                    }
                    C2980a c2 = this.f12288b.m14626c().m14552c();
                    C2920a.f12341a.mo3685a(c2, str, str2);
                    return new C2913c(this.f12288b.m14628e().m14613a(c2.m14539a()).m14620c(), this.f12289c);
                }
            }
            return new C2913c(this.f12288b, null);
        }

        /* renamed from: c */
        private long m14092c() {
            C2902d m = this.f12289c.m14022m();
            if (m.m14062c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) m.m14062c());
            }
            long j = 0;
            long time;
            if (this.f12294h != null) {
                if (this.f12290d != null) {
                    time = this.f12290d.getTime();
                } else {
                    time = this.f12296j;
                }
                time = this.f12294h.getTime() - time;
                if (time > 0) {
                    j = time;
                }
                return j;
            } else if (this.f12292f == null || this.f12289c.m14010a().m14623a().m13972k() != null) {
                return 0;
            } else {
                if (this.f12290d != null) {
                    time = this.f12290d.getTime();
                } else {
                    time = this.f12295i;
                }
                time -= this.f12292f.getTime();
                if (time > 0) {
                    j = time / 10;
                }
                return j;
            }
        }

        /* renamed from: d */
        private long m14093d() {
            long j = 0;
            if (this.f12290d != null) {
                j = Math.max(0, this.f12296j - this.f12290d.getTime());
            }
            if (this.f12298l != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) this.f12298l));
            }
            return (j + (this.f12296j - this.f12295i)) + (this.f12287a - this.f12296j);
        }

        /* renamed from: e */
        private boolean m14094e() {
            return this.f12289c.m14022m().m14062c() == -1 && this.f12294h == null;
        }

        /* renamed from: a */
        private static boolean m14090a(C2990y c2990y) {
            if (c2990y.m14622a("If-Modified-Since") == null) {
                if (c2990y.m14622a("If-None-Match") == null) {
                    return null;
                }
            }
            return true;
        }
    }

    C2913c(C2990y c2990y, aa aaVar) {
        this.f12299a = c2990y;
        this.f12300b = aaVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static boolean m14096a(okhttp3.aa r3, okhttp3.C2990y r4) {
        /*
        r0 = r3.m14012c();
        r1 = 0;
        switch(r0) {
            case 200: goto L_0x0030;
            case 203: goto L_0x0030;
            case 204: goto L_0x0030;
            case 300: goto L_0x0030;
            case 301: goto L_0x0030;
            case 302: goto L_0x0009;
            case 307: goto L_0x0009;
            case 308: goto L_0x0030;
            case 404: goto L_0x0030;
            case 405: goto L_0x0030;
            case 410: goto L_0x0030;
            case 414: goto L_0x0030;
            case 501: goto L_0x0030;
            default: goto L_0x0008;
        };
    L_0x0008:
        goto L_0x0046;
    L_0x0009:
        r0 = "Expires";
        r0 = r3.m14008a(r0);
        if (r0 != 0) goto L_0x0030;
    L_0x0011:
        r0 = r3.m14022m();
        r0 = r0.m14062c();
        r2 = -1;
        if (r0 != r2) goto L_0x0030;
    L_0x001c:
        r0 = r3.m14022m();
        r0 = r0.m14064e();
        if (r0 != 0) goto L_0x0030;
    L_0x0026:
        r0 = r3.m14022m();
        r0 = r0.m14063d();
        if (r0 == 0) goto L_0x0046;
    L_0x0030:
        r3 = r3.m14022m();
        r3 = r3.m14061b();
        if (r3 != 0) goto L_0x0045;
    L_0x003a:
        r3 = r4.m14629f();
        r3 = r3.m14061b();
        if (r3 != 0) goto L_0x0045;
    L_0x0044:
        r1 = 1;
    L_0x0045:
        return r1;
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.c.a(okhttp3.aa, okhttp3.y):boolean");
    }
}
