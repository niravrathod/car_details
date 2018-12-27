package com.bumptech.glide.p055g.p056a;

/* renamed from: com.bumptech.glide.g.a.c */
public abstract class C1170c {

    /* renamed from: com.bumptech.glide.g.a.c$a */
    private static class C3376a extends C1170c {
        /* renamed from: a */
        private volatile boolean f14245a;

        C3376a() {
            super();
        }

        /* renamed from: b */
        public void mo957b() {
            if (this.f14245a) {
                throw new IllegalStateException("Already released");
            }
        }

        /* renamed from: a */
        public void mo956a(boolean z) {
            this.f14245a = z;
        }
    }

    /* renamed from: a */
    abstract void mo956a(boolean z);

    /* renamed from: b */
    public abstract void mo957b();

    /* renamed from: a */
    public static C1170c m4851a() {
        return new C3376a();
    }

    private C1170c() {
    }
}
