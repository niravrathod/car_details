package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.C2933c;
import okio.ByteString;
import okio.C2995s;
import okio.C4394e;
import okio.C4755c;
import okio.C4905m;

/* renamed from: okhttp3.internal.http2.b */
final class C2953b {
    /* renamed from: a */
    static final C2950a[] f12462a = new C2950a[]{new C2950a(C2950a.f12440f, ""), new C2950a(C2950a.f12437c, "GET"), new C2950a(C2950a.f12437c, "POST"), new C2950a(C2950a.f12438d, "/"), new C2950a(C2950a.f12438d, "/index.html"), new C2950a(C2950a.f12439e, "http"), new C2950a(C2950a.f12439e, "https"), new C2950a(C2950a.f12436b, "200"), new C2950a(C2950a.f12436b, "204"), new C2950a(C2950a.f12436b, "206"), new C2950a(C2950a.f12436b, "304"), new C2950a(C2950a.f12436b, "400"), new C2950a(C2950a.f12436b, "404"), new C2950a(C2950a.f12436b, "500"), new C2950a("accept-charset", ""), new C2950a("accept-encoding", "gzip, deflate"), new C2950a("accept-language", ""), new C2950a("accept-ranges", ""), new C2950a("accept", ""), new C2950a("access-control-allow-origin", ""), new C2950a("age", ""), new C2950a("allow", ""), new C2950a("authorization", ""), new C2950a("cache-control", ""), new C2950a("content-disposition", ""), new C2950a("content-encoding", ""), new C2950a("content-language", ""), new C2950a("content-length", ""), new C2950a("content-location", ""), new C2950a("content-range", ""), new C2950a("content-type", ""), new C2950a("cookie", ""), new C2950a("date", ""), new C2950a("etag", ""), new C2950a("expect", ""), new C2950a("expires", ""), new C2950a("from", ""), new C2950a("host", ""), new C2950a("if-match", ""), new C2950a("if-modified-since", ""), new C2950a("if-none-match", ""), new C2950a("if-range", ""), new C2950a("if-unmodified-since", ""), new C2950a("last-modified", ""), new C2950a("link", ""), new C2950a("location", ""), new C2950a("max-forwards", ""), new C2950a("proxy-authenticate", ""), new C2950a("proxy-authorization", ""), new C2950a("range", ""), new C2950a("referer", ""), new C2950a("refresh", ""), new C2950a("retry-after", ""), new C2950a("server", ""), new C2950a("set-cookie", ""), new C2950a("strict-transport-security", ""), new C2950a("transfer-encoding", ""), new C2950a("user-agent", ""), new C2950a("vary", ""), new C2950a("via", ""), new C2950a("www-authenticate", "")};
    /* renamed from: b */
    static final Map<ByteString, Integer> f12463b = C2953b.m14324a();

    /* renamed from: okhttp3.internal.http2.b$a */
    static final class C2951a {
        /* renamed from: a */
        C2950a[] f12444a;
        /* renamed from: b */
        int f12445b;
        /* renamed from: c */
        int f12446c;
        /* renamed from: d */
        int f12447d;
        /* renamed from: e */
        private final List<C2950a> f12448e;
        /* renamed from: f */
        private final C4394e f12449f;
        /* renamed from: g */
        private final int f12450g;
        /* renamed from: h */
        private int f12451h;

        C2951a(int i, C2995s c2995s) {
            this(i, i, c2995s);
        }

        C2951a(int i, int i2, C2995s c2995s) {
            this.f12448e = new ArrayList();
            this.f12444a = new C2950a[8];
            this.f12445b = this.f12444a.length - 1;
            this.f12446c = 0;
            this.f12447d = 0;
            this.f12450g = i;
            this.f12451h = i2;
            this.f12449f = C4905m.a(c2995s);
        }

        /* renamed from: d */
        private void m14303d() {
            if (this.f12451h >= this.f12447d) {
                return;
            }
            if (this.f12451h == 0) {
                m14305e();
            } else {
                m14299a(this.f12447d - this.f12451h);
            }
        }

        /* renamed from: e */
        private void m14305e() {
            Arrays.fill(this.f12444a, null);
            this.f12445b = this.f12444a.length - 1;
            this.f12446c = 0;
            this.f12447d = 0;
        }

        /* renamed from: a */
        private int m14299a(int i) {
            int i2 = 0;
            if (i > 0) {
                for (int length = this.f12444a.length - 1; length >= this.f12445b && i > 0; length--) {
                    i -= this.f12444a[length].f12443i;
                    this.f12447d -= this.f12444a[length].f12443i;
                    this.f12446c--;
                    i2++;
                }
                System.arraycopy(this.f12444a, this.f12445b + 1, this.f12444a, (this.f12445b + 1) + i2, this.f12446c);
                this.f12445b += i2;
            }
            return i2;
        }

        /* renamed from: a */
        void m14313a() {
            while (!this.f12449f.mo4557e()) {
                int h = this.f12449f.mo4560h() & 255;
                if (h == 128) {
                    throw new IOException("index == 0");
                } else if ((h & 128) == 128) {
                    m14301b(m14312a(h, 127) - 1);
                } else if (h == 64) {
                    m14309g();
                } else if ((h & 64) == 64) {
                    m14306e(m14312a(h, 63) - 1);
                } else if ((h & 32) == 32) {
                    this.f12451h = m14312a(h, 31);
                    if (this.f12451h < 0 || this.f12451h > this.f12450g) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid dynamic table size update ");
                        stringBuilder.append(this.f12451h);
                        throw new IOException(stringBuilder.toString());
                    }
                    m14303d();
                } else {
                    if (h != 16) {
                        if (h != 0) {
                            m14304d(m14312a(h, 15) - 1);
                        }
                    }
                    m14308f();
                }
            }
        }

        /* renamed from: b */
        public List<C2950a> m14314b() {
            List arrayList = new ArrayList(this.f12448e);
            this.f12448e.clear();
            return arrayList;
        }

        /* renamed from: b */
        private void m14301b(int i) {
            if (m14310g(i)) {
                this.f12448e.add(C2953b.f12462a[i]);
                return;
            }
            int c = m14302c(i - C2953b.f12462a.length);
            if (c < 0 || c >= this.f12444a.length) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Header index too large ");
                stringBuilder.append(i + 1);
                throw new IOException(stringBuilder.toString());
            }
            this.f12448e.add(this.f12444a[c]);
        }

        /* renamed from: c */
        private int m14302c(int i) {
            return (this.f12445b + 1) + i;
        }

        /* renamed from: d */
        private void m14304d(int i) {
            this.f12448e.add(new C2950a(m14307f(i), m14315c()));
        }

        /* renamed from: f */
        private void m14308f() {
            this.f12448e.add(new C2950a(C2953b.m14325a(m14315c()), m14315c()));
        }

        /* renamed from: e */
        private void m14306e(int i) {
            m14300a(-1, new C2950a(m14307f(i), m14315c()));
        }

        /* renamed from: g */
        private void m14309g() {
            m14300a(-1, new C2950a(C2953b.m14325a(m14315c()), m14315c()));
        }

        /* renamed from: f */
        private ByteString m14307f(int i) {
            if (m14310g(i)) {
                return C2953b.f12462a[i].f12441g;
            }
            int c = m14302c(i - C2953b.f12462a.length);
            if (c >= 0 && c < this.f12444a.length) {
                return this.f12444a[c].f12441g;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Header index too large ");
            stringBuilder.append(i + 1);
            throw new IOException(stringBuilder.toString());
        }

        /* renamed from: g */
        private boolean m14310g(int i) {
            return i >= 0 && i <= C2953b.f12462a.length - 1;
        }

        /* renamed from: a */
        private void m14300a(int i, C2950a c2950a) {
            this.f12448e.add(c2950a);
            int i2 = c2950a.f12443i;
            if (i != -1) {
                i2 -= this.f12444a[m14302c(i)].f12443i;
            }
            if (i2 > this.f12451h) {
                m14305e();
                return;
            }
            int a = m14299a((this.f12447d + i2) - this.f12451h);
            if (i == -1) {
                if (this.f12446c + 1 > this.f12444a.length) {
                    i = new C2950a[(this.f12444a.length * 2)];
                    System.arraycopy(this.f12444a, 0, i, this.f12444a.length, this.f12444a.length);
                    this.f12445b = this.f12444a.length - 1;
                    this.f12444a = i;
                }
                i = this.f12445b;
                this.f12445b = i - 1;
                this.f12444a[i] = c2950a;
                this.f12446c++;
            } else {
                this.f12444a[i + (m14302c(i) + a)] = c2950a;
            }
            this.f12447d += i2;
        }

        /* renamed from: h */
        private int m14311h() {
            return this.f12449f.mo4560h() & 255;
        }

        /* renamed from: a */
        int m14312a(int i, int i2) {
            i &= i2;
            if (i < i2) {
                return i;
            }
            i = 0;
            while (true) {
                int h = m14311h();
                if ((h & 128) == 0) {
                    return i2 + (h << i);
                }
                i2 += (h & 127) << i;
                i += 7;
            }
        }

        /* renamed from: c */
        ByteString m14315c() {
            int h = m14311h();
            Object obj = (h & 128) == 128 ? 1 : null;
            h = m14312a(h, 127);
            if (obj != null) {
                return ByteString.m14642a(C2963i.m14424a().m14429a(this.f12449f.mo4562h((long) h)));
            }
            return this.f12449f.mo4556d((long) h);
        }
    }

    /* renamed from: okhttp3.internal.http2.b$b */
    static final class C2952b {
        /* renamed from: a */
        int f12452a;
        /* renamed from: b */
        int f12453b;
        /* renamed from: c */
        C2950a[] f12454c;
        /* renamed from: d */
        int f12455d;
        /* renamed from: e */
        int f12456e;
        /* renamed from: f */
        int f12457f;
        /* renamed from: g */
        private final C4755c f12458g;
        /* renamed from: h */
        private final boolean f12459h;
        /* renamed from: i */
        private int f12460i;
        /* renamed from: j */
        private boolean f12461j;

        C2952b(C4755c c4755c) {
            this(4096, true, c4755c);
        }

        C2952b(int i, boolean z, C4755c c4755c) {
            this.f12460i = BaseClientBuilder.API_PRIORITY_OTHER;
            this.f12454c = new C2950a[8];
            this.f12455d = this.f12454c.length - 1;
            this.f12456e = 0;
            this.f12457f = 0;
            this.f12452a = i;
            this.f12453b = i;
            this.f12459h = z;
            this.f12458g = c4755c;
        }

        /* renamed from: a */
        private void m14316a() {
            Arrays.fill(this.f12454c, null);
            this.f12455d = this.f12454c.length - 1;
            this.f12456e = 0;
            this.f12457f = 0;
        }

        /* renamed from: b */
        private int m14318b(int i) {
            int i2 = 0;
            if (i > 0) {
                for (int length = this.f12454c.length - 1; length >= this.f12455d && i > 0; length--) {
                    i -= this.f12454c[length].f12443i;
                    this.f12457f -= this.f12454c[length].f12443i;
                    this.f12456e--;
                    i2++;
                }
                System.arraycopy(this.f12454c, this.f12455d + 1, this.f12454c, (this.f12455d + 1) + i2, this.f12456e);
                Arrays.fill(this.f12454c, this.f12455d + 1, (this.f12455d + 1) + i2, null);
                this.f12455d += i2;
            }
            return i2;
        }

        /* renamed from: a */
        private void m14317a(C2950a c2950a) {
            int i = c2950a.f12443i;
            if (i > this.f12453b) {
                m14316a();
                return;
            }
            m14318b((this.f12457f + i) - this.f12453b);
            if (this.f12456e + 1 > this.f12454c.length) {
                Object obj = new C2950a[(this.f12454c.length * 2)];
                System.arraycopy(this.f12454c, 0, obj, this.f12454c.length, this.f12454c.length);
                this.f12455d = this.f12454c.length - 1;
                this.f12454c = obj;
            }
            int i2 = this.f12455d;
            this.f12455d = i2 - 1;
            this.f12454c[i2] = c2950a;
            this.f12456e++;
            this.f12457f += i;
        }

        /* renamed from: a */
        void m14322a(List<C2950a> list) {
            if (this.f12461j) {
                if (this.f12460i < this.f12453b) {
                    m14321a(this.f12460i, 31, 32);
                }
                this.f12461j = false;
                this.f12460i = BaseClientBuilder.API_PRIORITY_OTHER;
                m14321a(this.f12453b, 31, 32);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int intValue;
                int i2;
                C2950a c2950a = (C2950a) list.get(i);
                ByteString g = c2950a.f12441g.m14659g();
                ByteString byteString = c2950a.f12442h;
                Integer num = (Integer) C2953b.f12463b.get(g);
                if (num != null) {
                    intValue = num.intValue() + 1;
                    if (intValue > 1 && intValue < 8) {
                        if (C2933c.m14197a(C2953b.f12462a[intValue - 1].f12442h, (Object) byteString)) {
                            i2 = intValue;
                        } else if (C2933c.m14197a(C2953b.f12462a[intValue].f12442h, (Object) byteString)) {
                            i2 = intValue;
                            intValue++;
                        }
                    }
                    i2 = intValue;
                    intValue = -1;
                } else {
                    intValue = -1;
                    i2 = -1;
                }
                if (intValue == -1) {
                    int length = this.f12454c.length;
                    for (int i3 = this.f12455d + 1; i3 < length; i3++) {
                        if (C2933c.m14197a(this.f12454c[i3].f12441g, (Object) g)) {
                            if (C2933c.m14197a(this.f12454c[i3].f12442h, (Object) byteString)) {
                                intValue = C2953b.f12462a.length + (i3 - this.f12455d);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i3 - this.f12455d) + C2953b.f12462a.length;
                            }
                        }
                    }
                }
                if (intValue != -1) {
                    m14321a(intValue, 127, 128);
                } else if (i2 == -1) {
                    this.f12458g.m27503b(64);
                    m14323a(g);
                    m14323a(byteString);
                    m14317a(c2950a);
                } else if (!g.m14652a(C2950a.f12435a) || C2950a.f12440f.equals(g)) {
                    m14321a(i2, 63, 64);
                    m14323a(byteString);
                    m14317a(c2950a);
                } else {
                    m14321a(i2, 15, 0);
                    m14323a(byteString);
                }
            }
        }

        /* renamed from: a */
        void m14321a(int i, int i2, int i3) {
            if (i < i2) {
                this.f12458g.m27503b(i | i3);
                return;
            }
            this.f12458g.m27503b(i3 | i2);
            i -= i2;
            while (i >= 128) {
                this.f12458g.m27503b(128 | (i & 127));
                i >>>= 7;
            }
            this.f12458g.m27503b(i);
        }

        /* renamed from: a */
        void m14323a(ByteString byteString) {
            if (!this.f12459h || C2963i.m14424a().m14427a(byteString) >= byteString.m14660h()) {
                m14321a(byteString.m14660h(), 127, 0);
                this.f12458g.m27495a(byteString);
                return;
            }
            Object c4755c = new C4755c();
            C2963i.m14424a().m14428a(byteString, c4755c);
            byteString = c4755c.m27543o();
            m14321a(byteString.m14660h(), 127, 128);
            this.f12458g.m27495a(byteString);
        }

        /* renamed from: a */
        void m14320a(int i) {
            this.f12452a = i;
            i = Math.min(i, 16384);
            if (this.f12453b != i) {
                if (i < this.f12453b) {
                    this.f12460i = Math.min(this.f12460i, i);
                }
                this.f12461j = true;
                this.f12453b = i;
                m14319b();
            }
        }

        /* renamed from: b */
        private void m14319b() {
            if (this.f12453b >= this.f12457f) {
                return;
            }
            if (this.f12453b == 0) {
                m14316a();
            } else {
                m14318b(this.f12457f - this.f12453b);
            }
        }
    }

    /* renamed from: a */
    private static Map<ByteString, Integer> m14324a() {
        Map linkedHashMap = new LinkedHashMap(f12462a.length);
        for (int i = 0; i < f12462a.length; i++) {
            if (!linkedHashMap.containsKey(f12462a[i].f12441g)) {
                linkedHashMap.put(f12462a[i].f12441g, Integer.valueOf(i));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    static ByteString m14325a(ByteString byteString) {
        int h = byteString.m14660h();
        for (int i = 0; i < h; i++) {
            byte a = byteString.m14646a(i);
            if (a >= (byte) 65) {
                if (a <= (byte) 90) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                    stringBuilder.append(byteString.m14647a());
                    throw new IOException(stringBuilder.toString());
                }
            }
        }
        return byteString;
    }
}
