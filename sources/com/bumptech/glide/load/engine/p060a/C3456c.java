package com.bumptech.glide.load.engine.p060a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p055g.C1180j;

/* renamed from: com.bumptech.glide.load.engine.a.c */
class C3456c implements C1236l {
    /* renamed from: a */
    private final C3455b f14394a = new C3455b();
    /* renamed from: b */
    private final C1234h<C3454a, Bitmap> f14395b = new C1234h();

    /* renamed from: com.bumptech.glide.load.engine.a.c$a */
    static class C3454a implements C1237m {
        /* renamed from: a */
        private final C3455b f14390a;
        /* renamed from: b */
        private int f14391b;
        /* renamed from: c */
        private int f14392c;
        /* renamed from: d */
        private Config f14393d;

        public C3454a(C3455b c3455b) {
            this.f14390a = c3455b;
        }

        /* renamed from: a */
        public void m17556a(int i, int i2, Config config) {
            this.f14391b = i;
            this.f14392c = i2;
            this.f14393d = config;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C3454a)) {
                return false;
            }
            C3454a c3454a = (C3454a) obj;
            if (this.f14391b == c3454a.f14391b && this.f14392c == c3454a.f14392c && this.f14393d == c3454a.f14393d) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return (((this.f14391b * 31) + this.f14392c) * 31) + (this.f14393d != null ? this.f14393d.hashCode() : 0);
        }

        public String toString() {
            return C3456c.m17560c(this.f14391b, this.f14392c, this.f14393d);
        }

        /* renamed from: a */
        public void mo994a() {
            this.f14390a.m5029a(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a.c$b */
    static class C3455b extends C1231d<C3454a> {
        /* renamed from: b */
        protected /* synthetic */ C1237m mo995b() {
            return m17557a();
        }

        C3455b() {
        }

        /* renamed from: a */
        C3454a m17558a(int i, int i2, Config config) {
            C3454a c3454a = (C3454a) m5031c();
            c3454a.m17556a(i, i2, config);
            return c3454a;
        }

        /* renamed from: a */
        protected C3454a m17557a() {
            return new C3454a(this);
        }
    }

    C3456c() {
    }

    /* renamed from: a */
    public void mo998a(Bitmap bitmap) {
        this.f14395b.m5046a(this.f14394a.m17558a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: a */
    public Bitmap mo997a(int i, int i2, Config config) {
        return (Bitmap) this.f14395b.m5045a(this.f14394a.m17558a(i, i2, config));
    }

    /* renamed from: a */
    public Bitmap mo996a() {
        return (Bitmap) this.f14395b.m5044a();
    }

    /* renamed from: b */
    public String mo1000b(Bitmap bitmap) {
        return C3456c.m17561d(bitmap);
    }

    /* renamed from: b */
    public String mo999b(int i, int i2, Config config) {
        return C3456c.m17560c(i, i2, config);
    }

    /* renamed from: c */
    public int mo1001c(Bitmap bitmap) {
        return C1180j.m4889a(bitmap);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AttributeStrategy:\n  ");
        stringBuilder.append(this.f14395b);
        return stringBuilder.toString();
    }

    /* renamed from: d */
    private static String m17561d(Bitmap bitmap) {
        return C3456c.m17560c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: c */
    static String m17560c(int i, int i2, Config config) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        stringBuilder.append("], ");
        stringBuilder.append(config);
        return stringBuilder.toString();
    }
}
