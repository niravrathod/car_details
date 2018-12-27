package com.bumptech.glide.load.p059b;

import com.bumptech.glide.p055g.C1175f;
import com.bumptech.glide.p055g.C1180j;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.b.m */
public class C1204m<A, B> {
    /* renamed from: a */
    private final C1175f<C1203a<A>, B> f3881a;

    /* renamed from: com.bumptech.glide.load.b.m$a */
    static final class C1203a<A> {
        /* renamed from: a */
        private static final Queue<C1203a<?>> f3877a = C1180j.m4895a(0);
        /* renamed from: b */
        private int f3878b;
        /* renamed from: c */
        private int f3879c;
        /* renamed from: d */
        private A f3880d;

        /* renamed from: a */
        static <A> C1203a<A> m4955a(A a, int i, int i2) {
            C1203a<A> c1203a;
            synchronized (f3877a) {
                c1203a = (C1203a) f3877a.poll();
            }
            if (c1203a == null) {
                c1203a = new C1203a();
            }
            c1203a.m4956b(a, i, i2);
            return c1203a;
        }

        private C1203a() {
        }

        /* renamed from: b */
        private void m4956b(A a, int i, int i2) {
            this.f3880d = a;
            this.f3879c = i;
            this.f3878b = i2;
        }

        /* renamed from: a */
        public void m4957a() {
            synchronized (f3877a) {
                f3877a.offer(this);
            }
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C1203a)) {
                return false;
            }
            C1203a c1203a = (C1203a) obj;
            if (this.f3879c == c1203a.f3879c && this.f3878b == c1203a.f3878b && this.f3880d.equals(c1203a.f3880d) != null) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return (((this.f3878b * 31) + this.f3879c) * 31) + this.f3880d.hashCode();
        }
    }

    public C1204m() {
        this(250);
    }

    public C1204m(long j) {
        this.f3881a = new C1175f<C1203a<A>, B>(this, j) {
            /* renamed from: a */
            final /* synthetic */ C1204m f14329a;

            /* renamed from: a */
            protected void m17461a(C1203a<A> c1203a, B b) {
                c1203a.m4957a();
            }
        };
    }

    /* renamed from: a */
    public B m4958a(A a, int i, int i2) {
        a = C1203a.m4955a(a, i, i2);
        i = this.f3881a.m4873b(a);
        a.m4957a();
        return i;
    }

    /* renamed from: a */
    public void m4959a(A a, int i, int i2, B b) {
        this.f3881a.m4874b(C1203a.m4955a(a, i, i2), b);
    }
}
