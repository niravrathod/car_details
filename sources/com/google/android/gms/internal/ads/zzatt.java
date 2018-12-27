package com.google.android.gms.internal.ads;

@zzaer
public final class zzatt {
    /* renamed from: a */
    public final int f9018a;
    /* renamed from: b */
    public final int f9019b;
    /* renamed from: c */
    private final int f9020c;

    /* renamed from: a */
    public static zzatt m10130a(zzjo zzjo) {
        if (zzjo.f20230d) {
            return new zzatt(3, 0, 0);
        }
        if (zzjo.f20235i) {
            return new zzatt(2, 0, 0);
        }
        if (zzjo.f20234h) {
            return m10128a();
        }
        return m10129a(zzjo.f20232f, zzjo.f20229c);
    }

    /* renamed from: a */
    public static zzatt m10128a() {
        return new zzatt(0, 0, 0);
    }

    /* renamed from: a */
    public static zzatt m10129a(int i, int i2) {
        return new zzatt(1, i, i2);
    }

    /* renamed from: b */
    public static zzatt m10131b() {
        return new zzatt(4, 0, 0);
    }

    /* renamed from: c */
    public static zzatt m10132c() {
        return new zzatt(5, 0, 0);
    }

    private zzatt(int i, int i2, int i3) {
        this.f9020c = i;
        this.f9019b = i2;
        this.f9018a = i3;
    }

    /* renamed from: d */
    public final boolean m10133d() {
        return this.f9020c == 2;
    }

    /* renamed from: e */
    public final boolean m10134e() {
        return this.f9020c == 3;
    }

    /* renamed from: f */
    public final boolean m10135f() {
        return this.f9020c == 0;
    }

    /* renamed from: g */
    public final boolean m10136g() {
        return this.f9020c == 4;
    }

    /* renamed from: h */
    public final boolean m10137h() {
        return this.f9020c == 5;
    }
}
