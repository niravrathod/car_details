package com.facebook.ads.internal.p086e;

/* renamed from: com.facebook.ads.internal.e.f */
abstract class C1790f<T> {
    /* renamed from: a */
    private C1789a f5408a;

    /* renamed from: com.facebook.ads.internal.e.f$a */
    public enum C1789a {
        UNKNOWN(9000, "An unknown error has occurred."),
        DATABASE_SELECT(3001, "Failed to read from database."),
        DATABASE_INSERT(3002, "Failed to insert row into database."),
        DATABASE_UPDATE(3003, "Failed to update row in database."),
        DATABASE_DELETE(3004, "Failed to delete row from database.");
        
        /* renamed from: f */
        private final int f5406f;
        /* renamed from: g */
        private final String f5407g;

        private C1789a(int i, String str) {
            this.f5406f = i;
            this.f5407g = str;
        }

        /* renamed from: a */
        public int m6727a() {
            return this.f5406f;
        }

        /* renamed from: b */
        public String m6728b() {
            return this.f5407g;
        }
    }

    C1790f() {
    }

    /* renamed from: a */
    protected void m6729a(C1789a c1789a) {
        this.f5408a = c1789a;
    }

    /* renamed from: b */
    abstract T mo3976b();

    /* renamed from: c */
    public C1789a m6731c() {
        return this.f5408a;
    }
}
