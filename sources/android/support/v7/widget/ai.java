package android.support.v7.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView.C0783i;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.View;

public abstract class ai {
    /* renamed from: a */
    protected final C0783i f2785a;
    /* renamed from: b */
    final Rect f2786b;
    /* renamed from: c */
    private int f2787c;

    /* renamed from: a */
    public abstract int mo767a(View view);

    /* renamed from: a */
    public abstract void mo768a(int i);

    /* renamed from: b */
    public abstract int mo769b(View view);

    /* renamed from: c */
    public abstract int mo770c();

    /* renamed from: c */
    public abstract int mo771c(View view);

    /* renamed from: d */
    public abstract int mo772d();

    /* renamed from: d */
    public abstract int mo773d(View view);

    /* renamed from: e */
    public abstract int mo774e();

    /* renamed from: e */
    public abstract int mo775e(View view);

    /* renamed from: f */
    public abstract int mo776f();

    /* renamed from: f */
    public abstract int mo777f(View view);

    /* renamed from: g */
    public abstract int mo778g();

    /* renamed from: h */
    public abstract int mo779h();

    /* renamed from: i */
    public abstract int mo780i();

    private ai(C0783i c0783i) {
        this.f2787c = Integer.MIN_VALUE;
        this.f2786b = new Rect();
        this.f2785a = c0783i;
    }

    /* renamed from: a */
    public void m3476a() {
        this.f2787c = mo776f();
    }

    /* renamed from: b */
    public int m3478b() {
        return Integer.MIN_VALUE == this.f2787c ? 0 : mo776f() - this.f2787c;
    }

    /* renamed from: a */
    public static ai m3473a(C0783i c0783i, int i) {
        switch (i) {
            case 0:
                return m3472a(c0783i);
            case 1:
                return m3474b(c0783i);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    /* renamed from: a */
    public static ai m3472a(C0783i c0783i) {
        return new ai(c0783i) {
            /* renamed from: d */
            public int mo772d() {
                return this.a.m3157z() - this.a.m3028D();
            }

            /* renamed from: e */
            public int mo774e() {
                return this.a.m3157z();
            }

            /* renamed from: a */
            public void mo768a(int i) {
                this.a.mo753k(i);
            }

            /* renamed from: c */
            public int mo770c() {
                return this.a.m3026B();
            }

            /* renamed from: e */
            public int mo775e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return (this.a.m3124f(view) + layoutParams.leftMargin) + layoutParams.rightMargin;
            }

            /* renamed from: f */
            public int mo777f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return (this.a.m3129g(view) + layoutParams.topMargin) + layoutParams.bottomMargin;
            }

            /* renamed from: b */
            public int mo769b(View view) {
                return this.a.m3136j(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: a */
            public int mo767a(View view) {
                return this.a.m3132h(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo771c(View view) {
                this.a.m3071a(view, true, this.b);
                return this.b.right;
            }

            /* renamed from: d */
            public int mo773d(View view) {
                this.a.m3071a(view, true, this.b);
                return this.b.left;
            }

            /* renamed from: f */
            public int mo776f() {
                return (this.a.m3157z() - this.a.m3026B()) - this.a.m3028D();
            }

            /* renamed from: g */
            public int mo778g() {
                return this.a.m3028D();
            }

            /* renamed from: h */
            public int mo779h() {
                return this.a.m3155x();
            }

            /* renamed from: i */
            public int mo780i() {
                return this.a.m3156y();
            }
        };
    }

    /* renamed from: b */
    public static ai m3474b(C0783i c0783i) {
        return new ai(c0783i) {
            /* renamed from: d */
            public int mo772d() {
                return this.a.m3025A() - this.a.m3029E();
            }

            /* renamed from: e */
            public int mo774e() {
                return this.a.m3025A();
            }

            /* renamed from: a */
            public void mo768a(int i) {
                this.a.mo754l(i);
            }

            /* renamed from: c */
            public int mo770c() {
                return this.a.m3027C();
            }

            /* renamed from: e */
            public int mo775e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return (this.a.m3129g(view) + layoutParams.topMargin) + layoutParams.bottomMargin;
            }

            /* renamed from: f */
            public int mo777f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return (this.a.m3124f(view) + layoutParams.leftMargin) + layoutParams.rightMargin;
            }

            /* renamed from: b */
            public int mo769b(View view) {
                return this.a.m3138k(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: a */
            public int mo767a(View view) {
                return this.a.m3134i(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo771c(View view) {
                this.a.m3071a(view, true, this.b);
                return this.b.bottom;
            }

            /* renamed from: d */
            public int mo773d(View view) {
                this.a.m3071a(view, true, this.b);
                return this.b.top;
            }

            /* renamed from: f */
            public int mo776f() {
                return (this.a.m3025A() - this.a.m3027C()) - this.a.m3029E();
            }

            /* renamed from: g */
            public int mo778g() {
                return this.a.m3029E();
            }

            /* renamed from: h */
            public int mo779h() {
                return this.a.m3156y();
            }

            /* renamed from: i */
            public int mo780i() {
                return this.a.m3155x();
            }
        };
    }
}
