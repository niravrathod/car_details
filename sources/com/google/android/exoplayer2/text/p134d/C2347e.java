package com.google.android.exoplayer2.text.p134d;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.p126c.C2163a;

/* renamed from: com.google.android.exoplayer2.text.d.e */
final class C2347e {
    /* renamed from: a */
    private String f7440a;
    /* renamed from: b */
    private int f7441b;
    /* renamed from: c */
    private boolean f7442c;
    /* renamed from: d */
    private int f7443d;
    /* renamed from: e */
    private boolean f7444e;
    /* renamed from: f */
    private int f7445f = -1;
    /* renamed from: g */
    private int f7446g = -1;
    /* renamed from: h */
    private int f7447h = -1;
    /* renamed from: i */
    private int f7448i = -1;
    /* renamed from: j */
    private int f7449j = -1;
    /* renamed from: k */
    private float f7450k;
    /* renamed from: l */
    private String f7451l;
    /* renamed from: m */
    private C2347e f7452m;
    /* renamed from: n */
    private Alignment f7453n;

    /* renamed from: a */
    public int m8565a() {
        if (this.f7447h == -1 && this.f7448i == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f7447h == 1 ? 1 : 0;
        if (this.f7448i == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: b */
    public boolean m8575b() {
        return this.f7445f == 1;
    }

    /* renamed from: a */
    public C2347e m8571a(boolean z) {
        C2163a.m7918b(this.f7452m == null);
        this.f7445f = z;
        return this;
    }

    /* renamed from: c */
    public boolean m8578c() {
        return this.f7446g == 1;
    }

    /* renamed from: b */
    public C2347e m8574b(boolean z) {
        C2163a.m7918b(this.f7452m == null);
        this.f7446g = z;
        return this;
    }

    /* renamed from: c */
    public C2347e m8577c(boolean z) {
        C2163a.m7918b(this.f7452m == null);
        this.f7447h = z;
        return this;
    }

    /* renamed from: d */
    public C2347e m8579d(boolean z) {
        C2163a.m7918b(this.f7452m == null);
        this.f7448i = z;
        return this;
    }

    /* renamed from: d */
    public String m8580d() {
        return this.f7440a;
    }

    /* renamed from: a */
    public C2347e m8570a(String str) {
        C2163a.m7918b(this.f7452m == null);
        this.f7440a = str;
        return this;
    }

    /* renamed from: e */
    public int m8581e() {
        if (this.f7442c) {
            return this.f7441b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: a */
    public C2347e m8567a(int i) {
        C2163a.m7918b(this.f7452m == null);
        this.f7441b = i;
        this.f7442c = true;
        return this;
    }

    /* renamed from: f */
    public boolean m8582f() {
        return this.f7442c;
    }

    /* renamed from: g */
    public int m8583g() {
        if (this.f7444e) {
            return this.f7443d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: b */
    public C2347e m8572b(int i) {
        this.f7443d = i;
        this.f7444e = true;
        return this;
    }

    /* renamed from: h */
    public boolean m8584h() {
        return this.f7444e;
    }

    /* renamed from: a */
    public C2347e m8569a(C2347e c2347e) {
        return m8564a(c2347e, true);
    }

    /* renamed from: a */
    private C2347e m8564a(C2347e c2347e, boolean z) {
        if (c2347e != null) {
            if (!this.f7442c && c2347e.f7442c) {
                m8567a(c2347e.f7441b);
            }
            if (this.f7447h == -1) {
                this.f7447h = c2347e.f7447h;
            }
            if (this.f7448i == -1) {
                this.f7448i = c2347e.f7448i;
            }
            if (this.f7440a == null) {
                this.f7440a = c2347e.f7440a;
            }
            if (this.f7445f == -1) {
                this.f7445f = c2347e.f7445f;
            }
            if (this.f7446g == -1) {
                this.f7446g = c2347e.f7446g;
            }
            if (this.f7453n == null) {
                this.f7453n = c2347e.f7453n;
            }
            if (this.f7449j == -1) {
                this.f7449j = c2347e.f7449j;
                this.f7450k = c2347e.f7450k;
            }
            if (z && !this.f7444e && c2347e.f7444e) {
                m8572b(c2347e.f7443d);
            }
        }
        return this;
    }

    /* renamed from: b */
    public C2347e m8573b(String str) {
        this.f7451l = str;
        return this;
    }

    /* renamed from: i */
    public String m8585i() {
        return this.f7451l;
    }

    /* renamed from: j */
    public Alignment m8586j() {
        return this.f7453n;
    }

    /* renamed from: a */
    public C2347e m8568a(Alignment alignment) {
        this.f7453n = alignment;
        return this;
    }

    /* renamed from: a */
    public C2347e m8566a(float f) {
        this.f7450k = f;
        return this;
    }

    /* renamed from: c */
    public C2347e m8576c(int i) {
        this.f7449j = i;
        return this;
    }

    /* renamed from: k */
    public int m8587k() {
        return this.f7449j;
    }

    /* renamed from: l */
    public float m8588l() {
        return this.f7450k;
    }
}
