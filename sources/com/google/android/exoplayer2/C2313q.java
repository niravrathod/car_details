package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.q */
public abstract class C2313q {
    /* renamed from: a */
    public static final C2313q f7282a = new C40331();

    /* renamed from: com.google.android.exoplayer2.q$a */
    public static final class C2311a {
        /* renamed from: a */
        public Object f7266a;
        /* renamed from: b */
        public Object f7267b;
        /* renamed from: c */
        public int f7268c;
        /* renamed from: d */
        public long f7269d;
        /* renamed from: e */
        public boolean f7270e;
        /* renamed from: f */
        private long f7271f;

        /* renamed from: a */
        public C2311a m8456a(Object obj, Object obj2, int i, long j, long j2, boolean z) {
            this.f7266a = obj;
            this.f7267b = obj2;
            this.f7268c = i;
            this.f7269d = j;
            this.f7271f = j2;
            this.f7270e = z;
            return this;
        }

        /* renamed from: a */
        public long m8455a() {
            return this.f7269d;
        }

        /* renamed from: b */
        public long m8457b() {
            return C2162b.m7911a(this.f7271f);
        }
    }

    /* renamed from: com.google.android.exoplayer2.q$b */
    public static final class C2312b {
        /* renamed from: a */
        public Object f7272a;
        /* renamed from: b */
        public long f7273b;
        /* renamed from: c */
        public long f7274c;
        /* renamed from: d */
        public boolean f7275d;
        /* renamed from: e */
        public boolean f7276e;
        /* renamed from: f */
        public int f7277f;
        /* renamed from: g */
        public int f7278g;
        /* renamed from: h */
        public long f7279h;
        /* renamed from: i */
        public long f7280i;
        /* renamed from: j */
        public long f7281j;

        /* renamed from: a */
        public C2312b m8459a(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.f7272a = obj;
            this.f7273b = j;
            this.f7274c = j2;
            this.f7275d = z;
            this.f7276e = z2;
            this.f7279h = j3;
            this.f7280i = j4;
            this.f7277f = i;
            this.f7278g = i2;
            this.f7281j = j5;
            return this;
        }

        /* renamed from: a */
        public long m8458a() {
            return this.f7279h;
        }

        /* renamed from: b */
        public long m8460b() {
            return C2162b.m7911a(this.f7280i);
        }

        /* renamed from: c */
        public long m8461c() {
            return this.f7281j;
        }
    }

    /* renamed from: com.google.android.exoplayer2.q$1 */
    static class C40331 extends C2313q {
        /* renamed from: a */
        public int mo1660a(Object obj) {
            return -1;
        }

        /* renamed from: b */
        public int mo1663b() {
            return 0;
        }

        /* renamed from: c */
        public int mo1664c() {
            return 0;
        }

        C40331() {
        }

        /* renamed from: a */
        public C2312b mo1662a(int i, C2312b c2312b, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: a */
        public C2311a mo1661a(int i, C2311a c2311a, boolean z) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public abstract int mo1660a(Object obj);

    /* renamed from: a */
    public abstract C2311a mo1661a(int i, C2311a c2311a, boolean z);

    /* renamed from: a */
    public abstract C2312b mo1662a(int i, C2312b c2312b, boolean z, long j);

    /* renamed from: b */
    public abstract int mo1663b();

    /* renamed from: c */
    public abstract int mo1664c();

    /* renamed from: a */
    public final boolean m8468a() {
        return mo1663b() == 0;
    }

    /* renamed from: a */
    public final C2312b m8465a(int i, C2312b c2312b) {
        return m8466a(i, c2312b, false);
    }

    /* renamed from: a */
    public C2312b m8466a(int i, C2312b c2312b, boolean z) {
        return mo1662a(i, c2312b, z, 0);
    }

    /* renamed from: a */
    public final C2311a m8463a(int i, C2311a c2311a) {
        return mo1661a(i, c2311a, false);
    }
}
