package com.facebook.ads.internal.p083b;

import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.b.c */
public class C1764c implements Serializable {
    /* renamed from: a */
    private C1763a f5329a;
    /* renamed from: b */
    private C1763a f5330b;

    /* renamed from: com.facebook.ads.internal.b.c$a */
    public static class C1763a implements Serializable {
        /* renamed from: a */
        private double f5318a;
        /* renamed from: b */
        private double f5319b;
        /* renamed from: c */
        private double f5320c;
        /* renamed from: d */
        private double f5321d;
        /* renamed from: e */
        private double f5322e;
        /* renamed from: f */
        private double f5323f;
        /* renamed from: g */
        private double f5324g;
        /* renamed from: h */
        private int f5325h;
        /* renamed from: i */
        private double f5326i;
        /* renamed from: j */
        private double f5327j;
        /* renamed from: k */
        private double f5328k;

        public C1763a(double d) {
            this.f5322e = d;
        }

        /* renamed from: a */
        public void m6648a() {
            this.f5318a = 0.0d;
            this.f5320c = 0.0d;
            this.f5321d = 0.0d;
            this.f5323f = 0.0d;
            this.f5325h = 0;
            this.f5326i = 0.0d;
            this.f5327j = 1.0d;
            this.f5328k = 0.0d;
        }

        /* renamed from: a */
        public void m6649a(double d, double d2) {
            this.f5325h++;
            this.f5326i += d;
            this.f5320c = d2;
            this.f5328k += d2 * d;
            this.f5318a = this.f5328k / this.f5326i;
            this.f5327j = Math.min(this.f5327j, d2);
            this.f5323f = Math.max(this.f5323f, d2);
            if (d2 >= this.f5322e) {
                this.f5321d += d;
                this.f5319b += d;
                this.f5324g = Math.max(this.f5324g, this.f5319b);
                return;
            }
            this.f5319b = 0.0d;
        }

        /* renamed from: b */
        public void m6650b() {
            this.f5319b = 0.0d;
        }

        /* renamed from: c */
        public double m6651c() {
            return this.f5325h == 0 ? 0.0d : this.f5327j;
        }

        /* renamed from: d */
        public double m6652d() {
            return this.f5318a;
        }

        /* renamed from: e */
        public double m6653e() {
            return this.f5323f;
        }

        /* renamed from: f */
        public double m6654f() {
            return this.f5326i;
        }

        /* renamed from: g */
        public double m6655g() {
            return this.f5321d;
        }

        /* renamed from: h */
        public double m6656h() {
            return this.f5324g;
        }
    }

    public C1764c() {
        this(0.5d, 0.5d);
    }

    public C1764c(double d) {
        this(d, 0.5d);
    }

    public C1764c(double d, double d2) {
        this.f5329a = new C1763a(d);
        this.f5330b = new C1763a(d2);
        m6657a();
    }

    /* renamed from: a */
    void m6657a() {
        this.f5329a.m6648a();
        this.f5330b.m6648a();
    }

    /* renamed from: a */
    void m6658a(double d, double d2) {
        this.f5329a.m6649a(d, d2);
    }

    /* renamed from: b */
    void m6659b() {
        this.f5329a.m6650b();
        this.f5330b.m6650b();
    }

    /* renamed from: b */
    void m6660b(double d, double d2) {
        this.f5330b.m6649a(d, d2);
    }

    /* renamed from: c */
    public C1763a m6661c() {
        return this.f5329a;
    }

    /* renamed from: d */
    public C1763a m6662d() {
        return this.f5330b;
    }
}
