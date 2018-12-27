package androidx.navigation;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: androidx.navigation.k */
public class C0904k {
    /* renamed from: a */
    private int f3075a;
    /* renamed from: b */
    private int f3076b;
    /* renamed from: c */
    private boolean f3077c;
    /* renamed from: d */
    private int f3078d;
    /* renamed from: e */
    private int f3079e;
    /* renamed from: f */
    private int f3080f;
    /* renamed from: g */
    private int f3081g;

    /* renamed from: androidx.navigation.k$a */
    public static class C0903a {
        /* renamed from: a */
        int f3068a;
        /* renamed from: b */
        int f3069b;
        /* renamed from: c */
        boolean f3070c;
        /* renamed from: d */
        int f3071d = -1;
        /* renamed from: e */
        int f3072e = -1;
        /* renamed from: f */
        int f3073f = -1;
        /* renamed from: g */
        int f3074g = -1;

        /* renamed from: a */
        public C0903a m3938a(boolean z) {
            if (z) {
                this.f3068a |= 1;
            } else {
                this.f3068a &= -2;
            }
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C0903a m3941b(boolean z) {
            if (z) {
                this.f3068a |= 2;
            } else {
                this.f3068a &= -3;
            }
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C0903a m3943c(boolean z) {
            if (z) {
                this.f3068a |= 4;
            } else {
                this.f3068a &= -5;
            }
            return this;
        }

        /* renamed from: a */
        public C0903a m3937a(int i, boolean z) {
            this.f3069b = i;
            this.f3070c = z;
            return this;
        }

        /* renamed from: a */
        public C0903a m3936a(int i) {
            this.f3071d = i;
            return this;
        }

        /* renamed from: b */
        public C0903a m3940b(int i) {
            this.f3072e = i;
            return this;
        }

        /* renamed from: c */
        public C0903a m3942c(int i) {
            this.f3073f = i;
            return this;
        }

        /* renamed from: d */
        public C0903a m3944d(int i) {
            this.f3074g = i;
            return this;
        }

        /* renamed from: a */
        public C0904k m3939a() {
            return new C0904k(this.f3068a, this.f3069b, this.f3070c, this.f3071d, this.f3072e, this.f3073f, this.f3074g);
        }
    }

    /* renamed from: a */
    public static void m3945a(Intent intent, C0904k c0904k) {
        if (c0904k != null) {
            intent.putExtra("android-support-nav:navOptions", c0904k.m3946j());
        }
    }

    C0904k(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        this.f3075a = i;
        this.f3076b = i2;
        this.f3077c = z;
        this.f3078d = i3;
        this.f3079e = i4;
        this.f3080f = i5;
        this.f3081g = i6;
    }

    /* renamed from: a */
    public boolean m3947a() {
        return (this.f3075a & 1) != 0;
    }

    @Deprecated
    /* renamed from: b */
    public boolean m3948b() {
        return (this.f3075a & 2) != 0;
    }

    @Deprecated
    /* renamed from: c */
    public boolean m3949c() {
        return (this.f3075a & 4) != 0;
    }

    /* renamed from: d */
    public int m3950d() {
        return this.f3076b;
    }

    /* renamed from: e */
    public boolean m3951e() {
        return this.f3077c;
    }

    /* renamed from: f */
    public int m3952f() {
        return this.f3078d;
    }

    /* renamed from: g */
    public int m3953g() {
        return this.f3079e;
    }

    /* renamed from: h */
    public int m3954h() {
        return this.f3080f;
    }

    /* renamed from: i */
    public int m3955i() {
        return this.f3081g;
    }

    /* renamed from: j */
    private Bundle m3946j() {
        Bundle bundle = new Bundle();
        bundle.putInt("launchMode", this.f3075a);
        bundle.putInt("popUpTo", this.f3076b);
        bundle.putBoolean("popUpToInclusive", this.f3077c);
        bundle.putInt("enterAnim", this.f3078d);
        bundle.putInt("exitAnim", this.f3079e);
        bundle.putInt("popEnterAnim", this.f3080f);
        bundle.putInt("popExitAnim", this.f3081g);
        return bundle;
    }
}
