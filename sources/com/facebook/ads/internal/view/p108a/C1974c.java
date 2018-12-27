package com.facebook.ads.internal.view.p108a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.a.c */
public class C1974c {
    /* renamed from: a */
    public final String f6091a;
    /* renamed from: b */
    public final long f6092b;
    /* renamed from: c */
    public final long f6093c;
    /* renamed from: d */
    public final long f6094d;
    /* renamed from: e */
    public final long f6095e;
    /* renamed from: f */
    public final long f6096f;
    /* renamed from: g */
    public final long f6097g;
    /* renamed from: h */
    public final long f6098h;

    /* renamed from: com.facebook.ads.internal.view.a.c$a */
    public static class C1973a {
        /* renamed from: a */
        private final String f6083a;
        /* renamed from: b */
        private long f6084b = -1;
        /* renamed from: c */
        private long f6085c = -1;
        /* renamed from: d */
        private long f6086d = -1;
        /* renamed from: e */
        private long f6087e = -1;
        /* renamed from: f */
        private long f6088f = -1;
        /* renamed from: g */
        private long f6089g = -1;
        /* renamed from: h */
        private long f6090h = -1;

        public C1973a(String str) {
            this.f6083a = str;
        }

        /* renamed from: a */
        public C1973a m7452a(long j) {
            this.f6084b = j;
            return this;
        }

        /* renamed from: a */
        public C1974c m7453a() {
            return new C1974c(this.f6083a, this.f6084b, this.f6085c, this.f6086d, this.f6087e, this.f6088f, this.f6089g, this.f6090h);
        }

        /* renamed from: b */
        public C1973a m7454b(long j) {
            this.f6085c = j;
            return this;
        }

        /* renamed from: c */
        public C1973a m7455c(long j) {
            this.f6086d = j;
            return this;
        }

        /* renamed from: d */
        public C1973a m7456d(long j) {
            this.f6087e = j;
            return this;
        }

        /* renamed from: e */
        public C1973a m7457e(long j) {
            this.f6088f = j;
            return this;
        }

        /* renamed from: f */
        public C1973a m7458f(long j) {
            this.f6089g = j;
            return this;
        }

        /* renamed from: g */
        public C1973a m7459g(long j) {
            this.f6090h = j;
            return this;
        }
    }

    private C1974c(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f6091a = str;
        this.f6092b = j;
        this.f6093c = j2;
        this.f6094d = j3;
        this.f6095e = j4;
        this.f6096f = j5;
        this.f6097g = j6;
        this.f6098h = j7;
    }

    /* renamed from: a */
    public Map<String, String> m7460a() {
        Map<String, String> hashMap = new HashMap(7);
        hashMap.put("initial_url", this.f6091a);
        hashMap.put("handler_time_ms", String.valueOf(this.f6092b));
        hashMap.put("load_start_ms", String.valueOf(this.f6093c));
        hashMap.put("response_end_ms", String.valueOf(this.f6094d));
        hashMap.put("dom_content_loaded_ms", String.valueOf(this.f6095e));
        hashMap.put("scroll_ready_ms", String.valueOf(this.f6096f));
        hashMap.put("load_finish_ms", String.valueOf(this.f6097g));
        hashMap.put("session_finish_ms", String.valueOf(this.f6098h));
        return hashMap;
    }
}
