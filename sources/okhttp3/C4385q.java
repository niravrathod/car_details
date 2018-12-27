package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.C2933c;
import okio.C4393d;
import okio.C4755c;

/* renamed from: okhttp3.q */
public final class C4385q extends C2991z {
    /* renamed from: a */
    private static final C2984u f18237a = C2984u.m14560a("application/x-www-form-urlencoded");
    /* renamed from: b */
    private final List<String> f18238b;
    /* renamed from: c */
    private final List<String> f18239c;

    /* renamed from: okhttp3.q$a */
    public static final class C2978a {
        /* renamed from: a */
        private final List<String> f12593a;
        /* renamed from: b */
        private final List<String> f12594b;
        /* renamed from: c */
        private final Charset f12595c;

        public C2978a() {
            this(null);
        }

        public C2978a(Charset charset) {
            this.f12593a = new ArrayList();
            this.f12594b = new ArrayList();
            this.f12595c = charset;
        }

        /* renamed from: a */
        public C2978a m14527a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f12593a.add(HttpUrl.m13950a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f12595c));
                this.f12594b.add(HttpUrl.m13950a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f12595c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        /* renamed from: b */
        public C2978a m14529b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f12593a.add(HttpUrl.m13950a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f12595c));
                this.f12594b.add(HttpUrl.m13950a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f12595c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        /* renamed from: a */
        public C4385q m14528a() {
            return new C4385q(this.f12593a, this.f12594b);
        }
    }

    C4385q(List<String> list, List<String> list2) {
        this.f18238b = C2933c.m14190a((List) list);
        this.f18239c = C2933c.m14190a((List) list2);
    }

    /* renamed from: a */
    public C2984u mo911a() {
        return f18237a;
    }

    /* renamed from: b */
    public long mo913b() {
        return m23909a(null, true);
    }

    /* renamed from: a */
    public void mo912a(C4393d c4393d) {
        m23909a(c4393d, false);
    }

    /* renamed from: a */
    private long m23909a(@Nullable C4393d c4393d, boolean z) {
        if (z) {
            c4393d = new C4755c();
        } else {
            c4393d = c4393d.mo4553c();
        }
        int size = this.f18238b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c4393d.m27503b(38);
            }
            c4393d.m27492a((String) this.f18238b.get(i));
            c4393d.m27503b(61);
            c4393d.m27492a((String) this.f18239c.get(i));
        }
        if (!z) {
            return 0;
        }
        long b = c4393d.m27502b();
        c4393d.m27548t();
        return b;
    }
}
