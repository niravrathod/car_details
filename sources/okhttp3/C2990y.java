package okhttp3;

import java.util.List;
import javax.annotation.Nullable;
import okhttp3.C2981s.C2980a;
import okhttp3.internal.p156b.C2925f;

/* renamed from: okhttp3.y */
public final class C2990y {
    /* renamed from: a */
    final HttpUrl f12674a;
    /* renamed from: b */
    final String f12675b;
    /* renamed from: c */
    final C2981s f12676c;
    @Nullable
    /* renamed from: d */
    final C2991z f12677d;
    /* renamed from: e */
    final Object f12678e;
    /* renamed from: f */
    private volatile C2902d f12679f;

    /* renamed from: okhttp3.y$a */
    public static class C2989a {
        /* renamed from: a */
        HttpUrl f12669a;
        /* renamed from: b */
        String f12670b;
        /* renamed from: c */
        C2980a f12671c;
        /* renamed from: d */
        C2991z f12672d;
        /* renamed from: e */
        Object f12673e;

        public C2989a() {
            this.f12670b = "GET";
            this.f12671c = new C2980a();
        }

        C2989a(C2990y c2990y) {
            this.f12669a = c2990y.f12674a;
            this.f12670b = c2990y.f12675b;
            this.f12672d = c2990y.f12677d;
            this.f12673e = c2990y.f12678e;
            this.f12671c = c2990y.f12676c.m14552c();
        }

        /* renamed from: a */
        public C2989a m14611a(HttpUrl httpUrl) {
            if (httpUrl != null) {
                this.f12669a = httpUrl;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: a */
        public C2989a m14608a(String str) {
            if (str != null) {
                StringBuilder stringBuilder;
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("http:");
                    stringBuilder.append(str.substring(3));
                    str = stringBuilder.toString();
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("https:");
                        stringBuilder.append(str.substring(4));
                        str = stringBuilder.toString();
                    }
                }
                HttpUrl e = HttpUrl.m13959e(str);
                if (e != null) {
                    return m14611a(e);
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("unexpected url: ");
                stringBuilder2.append(str);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: a */
        public C2989a m14609a(String str, String str2) {
            this.f12671c.m14543c(str, str2);
            return this;
        }

        /* renamed from: b */
        public C2989a m14617b(String str, String str2) {
            this.f12671c.m14538a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C2989a m14616b(String str) {
            this.f12671c.m14540b(str);
            return this;
        }

        /* renamed from: a */
        public C2989a m14613a(C2981s c2981s) {
            this.f12671c = c2981s.m14552c();
            return this;
        }

        /* renamed from: a */
        public C2989a m14612a(C2902d c2902d) {
            String c2902d2 = c2902d.toString();
            if (c2902d2.isEmpty()) {
                return m14616b("Cache-Control");
            }
            return m14609a("Cache-Control", c2902d2);
        }

        /* renamed from: a */
        public C2989a m14607a() {
            return m14610a("GET", null);
        }

        /* renamed from: b */
        public C2989a m14615b() {
            return m14610a("HEAD", null);
        }

        /* renamed from: a */
        public C2989a m14614a(C2991z c2991z) {
            return m14610a("POST", c2991z);
        }

        /* renamed from: b */
        public C2989a m14618b(@Nullable C2991z c2991z) {
            return m14610a("DELETE", c2991z);
        }

        /* renamed from: c */
        public C2989a m14619c(C2991z c2991z) {
            return m14610a("PUT", c2991z);
        }

        /* renamed from: d */
        public C2989a m14621d(C2991z c2991z) {
            return m14610a("PATCH", c2991z);
        }

        /* renamed from: a */
        public C2989a m14610a(String str, @Nullable C2991z c2991z) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() != 0) {
                StringBuilder stringBuilder;
                if (c2991z != null) {
                    if (!C2925f.m14169c(str)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("method ");
                        stringBuilder.append(str);
                        stringBuilder.append(" must not have a request body.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                if (c2991z == null) {
                    if (C2925f.m14168b(str)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("method ");
                        stringBuilder.append(str);
                        stringBuilder.append(" must have a request body.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                this.f12670b = str;
                this.f12672d = c2991z;
                return this;
            } else {
                throw new IllegalArgumentException("method.length() == 0");
            }
        }

        /* renamed from: c */
        public C2990y m14620c() {
            if (this.f12669a != null) {
                return new C2990y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    C2990y(C2989a c2989a) {
        this.f12674a = c2989a.f12669a;
        this.f12675b = c2989a.f12670b;
        this.f12676c = c2989a.f12671c.m14539a();
        this.f12677d = c2989a.f12672d;
        this.f12678e = c2989a.f12673e != null ? c2989a.f12673e : this;
    }

    /* renamed from: a */
    public HttpUrl m14623a() {
        return this.f12674a;
    }

    /* renamed from: b */
    public String m14624b() {
        return this.f12675b;
    }

    /* renamed from: c */
    public C2981s m14626c() {
        return this.f12676c;
    }

    @Nullable
    /* renamed from: a */
    public String m14622a(String str) {
        return this.f12676c.m14548a(str);
    }

    /* renamed from: b */
    public List<String> m14625b(String str) {
        return this.f12676c.m14550b(str);
    }

    @Nullable
    /* renamed from: d */
    public C2991z m14627d() {
        return this.f12677d;
    }

    /* renamed from: e */
    public C2989a m14628e() {
        return new C2989a(this);
    }

    /* renamed from: f */
    public C2902d m14629f() {
        C2902d c2902d = this.f12679f;
        if (c2902d != null) {
            return c2902d;
        }
        c2902d = C2902d.m14058a(this.f12676c);
        this.f12679f = c2902d;
        return c2902d;
    }

    /* renamed from: g */
    public boolean m14630g() {
        return this.f12674a.m13963c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{method=");
        stringBuilder.append(this.f12675b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f12674a);
        stringBuilder.append(", tag=");
        stringBuilder.append(this.f12678e != this ? this.f12678e : null);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
