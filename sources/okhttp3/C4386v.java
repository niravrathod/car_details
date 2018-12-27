package okhttp3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import okhttp3.internal.C2933c;
import okio.ByteString;
import okio.C4393d;
import okio.C4755c;

/* renamed from: okhttp3.v */
public final class C4386v extends C2991z {
    /* renamed from: a */
    public static final C2984u f18240a = C2984u.m14560a("multipart/mixed");
    /* renamed from: b */
    public static final C2984u f18241b = C2984u.m14560a("multipart/alternative");
    /* renamed from: c */
    public static final C2984u f18242c = C2984u.m14560a("multipart/digest");
    /* renamed from: d */
    public static final C2984u f18243d = C2984u.m14560a("multipart/parallel");
    /* renamed from: e */
    public static final C2984u f18244e = C2984u.m14560a("multipart/form-data");
    /* renamed from: f */
    private static final byte[] f18245f = new byte[]{(byte) 58, (byte) 32};
    /* renamed from: g */
    private static final byte[] f18246g = new byte[]{(byte) 13, (byte) 10};
    /* renamed from: h */
    private static final byte[] f18247h = new byte[]{(byte) 45, (byte) 45};
    /* renamed from: i */
    private final ByteString f18248i;
    /* renamed from: j */
    private final C2984u f18249j;
    /* renamed from: k */
    private final C2984u f18250k;
    /* renamed from: l */
    private final List<C2986b> f18251l;
    /* renamed from: m */
    private long f18252m = -1;

    /* renamed from: okhttp3.v$a */
    public static final class C2985a {
        /* renamed from: a */
        private final ByteString f12608a;
        /* renamed from: b */
        private C2984u f12609b;
        /* renamed from: c */
        private final List<C2986b> f12610c;

        public C2985a() {
            this(UUID.randomUUID().toString());
        }

        public C2985a(String str) {
            this.f12609b = C4386v.f18240a;
            this.f12610c = new ArrayList();
            this.f12608a = ByteString.m14641a(str);
        }

        /* renamed from: a */
        public C2985a m14565a(C2984u c2984u) {
            if (c2984u == null) {
                throw new NullPointerException("type == null");
            } else if (c2984u.m14561a().equals("multipart")) {
                this.f12609b = c2984u;
                return this;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("multipart != ");
                stringBuilder.append(c2984u);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        public C2985a m14564a(@Nullable C2981s c2981s, C2991z c2991z) {
            return m14566a(C2986b.m14568a(c2981s, c2991z));
        }

        /* renamed from: a */
        public C2985a m14566a(C2986b c2986b) {
            if (c2986b != null) {
                this.f12610c.add(c2986b);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        /* renamed from: a */
        public C4386v m14567a() {
            if (!this.f12610c.isEmpty()) {
                return new C4386v(this.f12608a, this.f12609b, this.f12610c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }

    /* renamed from: okhttp3.v$b */
    public static final class C2986b {
        @Nullable
        /* renamed from: a */
        final C2981s f12611a;
        /* renamed from: b */
        final C2991z f12612b;

        /* renamed from: a */
        public static C2986b m14568a(@Nullable C2981s c2981s, C2991z c2991z) {
            if (c2991z != null) {
                if (c2981s != null) {
                    if (c2981s.m14548a("Content-Type") != null) {
                        throw new IllegalArgumentException("Unexpected header: Content-Type");
                    }
                }
                if (c2981s != null) {
                    if (c2981s.m14548a("Content-Length") != null) {
                        throw new IllegalArgumentException("Unexpected header: Content-Length");
                    }
                }
                return new C2986b(c2981s, c2991z);
            }
            throw new NullPointerException("body == null");
        }

        private C2986b(@Nullable C2981s c2981s, C2991z c2991z) {
            this.f12611a = c2981s;
            this.f12612b = c2991z;
        }
    }

    C4386v(ByteString byteString, C2984u c2984u, List<C2986b> list) {
        this.f18248i = byteString;
        this.f18249j = c2984u;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c2984u);
        stringBuilder.append("; boundary=");
        stringBuilder.append(byteString.m14647a());
        this.f18250k = C2984u.m14560a(stringBuilder.toString());
        this.f18251l = C2933c.m14190a((List) list);
    }

    /* renamed from: a */
    public C2984u mo911a() {
        return this.f18250k;
    }

    /* renamed from: b */
    public long mo913b() {
        long j = this.f18252m;
        if (j != -1) {
            return j;
        }
        j = m23913a(null, true);
        this.f18252m = j;
        return j;
    }

    /* renamed from: a */
    public void mo912a(C4393d c4393d) {
        m23913a(c4393d, false);
    }

    /* renamed from: a */
    private long m23913a(@Nullable C4393d c4393d, boolean z) {
        C4755c c4755c;
        if (z) {
            c4393d = new C4755c();
            c4755c = c4393d;
        } else {
            c4755c = null;
        }
        int size = this.f18251l.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C2986b c2986b = (C2986b) this.f18251l.get(i);
            C2981s c2981s = c2986b.f12611a;
            C2991z c2991z = c2986b.f12612b;
            c4393d.mo4554c(f18247h);
            c4393d.mo4551b(this.f18248i);
            c4393d.mo4554c(f18246g);
            if (c2981s != null) {
                int a = c2981s.m14546a();
                for (int i2 = 0; i2 < a; i2++) {
                    c4393d.mo4550b(c2981s.m14547a(i2)).mo4554c(f18245f).mo4550b(c2981s.m14549b(i2)).mo4554c(f18246g);
                }
            }
            C2984u a2 = c2991z.mo911a();
            if (a2 != null) {
                c4393d.mo4550b("Content-Type: ").mo4550b(a2.toString()).mo4554c(f18246g);
            }
            long b = c2991z.mo913b();
            if (b != -1) {
                c4393d.mo4550b("Content-Length: ").mo4573m(b).mo4554c(f18246g);
            } else if (z) {
                c4755c.m27548t();
                return -1;
            }
            c4393d.mo4554c(f18246g);
            if (z) {
                j += b;
            } else {
                c2991z.mo912a(c4393d);
            }
            c4393d.mo4554c(f18246g);
        }
        c4393d.mo4554c(f18247h);
        c4393d.mo4551b(this.f18248i);
        c4393d.mo4554c(f18247h);
        c4393d.mo4554c(f18246g);
        if (z) {
            j += c4755c.m27502b();
            c4755c.m27548t();
        }
        return j;
    }
}
