package android.support.v7.widget;

import android.view.View;

class be {
    /* renamed from: a */
    final C0848b f2880a;
    /* renamed from: b */
    C0847a f2881b = new C0847a();

    /* renamed from: android.support.v7.widget.be$a */
    static class C0847a {
        /* renamed from: a */
        int f2875a = 0;
        /* renamed from: b */
        int f2876b;
        /* renamed from: c */
        int f2877c;
        /* renamed from: d */
        int f2878d;
        /* renamed from: e */
        int f2879e;

        /* renamed from: a */
        int m3578a(int i, int i2) {
            return i > i2 ? 1 : i == i2 ? 2 : 4;
        }

        C0847a() {
        }

        /* renamed from: a */
        void m3581a(int i, int i2, int i3, int i4) {
            this.f2876b = i;
            this.f2877c = i2;
            this.f2878d = i3;
            this.f2879e = i4;
        }

        /* renamed from: a */
        void m3580a(int i) {
            this.f2875a = i | this.f2875a;
        }

        /* renamed from: a */
        void m3579a() {
            this.f2875a = 0;
        }

        /* renamed from: b */
        boolean m3582b() {
            if ((this.f2875a & 7) != 0 && (this.f2875a & (m3578a(this.f2878d, this.f2876b) << 0)) == 0) {
                return false;
            }
            if ((this.f2875a & 112) != 0 && (this.f2875a & (m3578a(this.f2878d, this.f2877c) << 4)) == 0) {
                return false;
            }
            if ((this.f2875a & 1792) != 0 && (this.f2875a & (m3578a(this.f2879e, this.f2876b) << 8)) == 0) {
                return false;
            }
            if ((this.f2875a & 28672) == 0 || (this.f2875a & (m3578a(this.f2879e, this.f2877c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.be$b */
    interface C0848b {
        /* renamed from: a */
        int mo731a();

        /* renamed from: a */
        int mo732a(View view);

        /* renamed from: a */
        View mo733a(int i);

        /* renamed from: b */
        int mo734b();

        /* renamed from: b */
        int mo735b(View view);
    }

    be(C0848b c0848b) {
        this.f2880a = c0848b;
    }

    /* renamed from: a */
    View m3588a(int i, int i2, int i3, int i4) {
        int a = this.f2880a.mo731a();
        int b = this.f2880a.mo734b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f2880a.mo733a(i);
            this.f2881b.m3581a(a, b, this.f2880a.mo732a(a2), this.f2880a.mo735b(a2));
            if (i3 != 0) {
                this.f2881b.m3579a();
                this.f2881b.m3580a(i3);
                if (this.f2881b.m3582b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f2881b.m3579a();
                this.f2881b.m3580a(i4);
                if (this.f2881b.m3582b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: a */
    boolean m3589a(View view, int i) {
        this.f2881b.m3581a(this.f2880a.mo731a(), this.f2880a.mo734b(), this.f2880a.mo732a(view), this.f2880a.mo735b(view));
        if (i == 0) {
            return null;
        }
        this.f2881b.m3579a();
        this.f2881b.m3580a(i);
        return this.f2881b.m3582b();
    }
}
