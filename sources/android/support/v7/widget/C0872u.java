package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.C0798v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.u */
class C0872u {
    /* renamed from: a */
    final C0871b f2973a;
    /* renamed from: b */
    final C0870a f2974b = new C0870a();
    /* renamed from: c */
    final List<View> f2975c = new ArrayList();

    /* renamed from: android.support.v7.widget.u$a */
    static class C0870a {
        /* renamed from: a */
        long f2971a = 0;
        /* renamed from: b */
        C0870a f2972b;

        C0870a() {
        }

        /* renamed from: a */
        void m3784a(int i) {
            if (i >= 64) {
                m3782b();
                this.f2972b.m3784a(i - 64);
                return;
            }
            this.f2971a |= 1 << i;
        }

        /* renamed from: b */
        private void m3782b() {
            if (this.f2972b == null) {
                this.f2972b = new C0870a();
            }
        }

        /* renamed from: b */
        void m3786b(int i) {
            if (i < 64) {
                this.f2971a &= (1 << i) ^ -1;
            } else if (this.f2972b != null) {
                this.f2972b.m3786b(i - 64);
            }
        }

        /* renamed from: c */
        boolean m3787c(int i) {
            if (i >= 64) {
                m3782b();
                return this.f2972b.m3787c(i - 64);
            }
            return (this.f2971a & (1 << i)) != 0 ? 1 : 0;
        }

        /* renamed from: a */
        void m3783a() {
            this.f2971a = 0;
            if (this.f2972b != null) {
                this.f2972b.m3783a();
            }
        }

        /* renamed from: a */
        void m3785a(int i, boolean z) {
            if (i >= 64) {
                m3782b();
                this.f2972b.m3785a(i - 64, z);
                return;
            }
            boolean z2 = (this.f2971a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            this.f2971a = (this.f2971a & j) | (((j ^ -1) & this.f2971a) << 1);
            if (z) {
                m3784a(i);
            } else {
                m3786b(i);
            }
            if (z2 || this.f2972b != 0) {
                m3782b();
                this.f2972b.m3785a(0, z2);
            }
        }

        /* renamed from: d */
        boolean m3788d(int i) {
            if (i >= 64) {
                m3782b();
                return this.f2972b.m3788d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f2971a & j) != 0;
            this.f2971a &= j ^ -1;
            j--;
            this.f2971a = (this.f2971a & j) | Long.rotateRight((j ^ -1) & this.f2971a, 1);
            if (this.f2972b != 0) {
                if (this.f2972b.m3787c(0) != 0) {
                    m3784a(63);
                }
                this.f2972b.m3788d(0);
            }
            return z;
        }

        /* renamed from: e */
        int m3789e(int i) {
            if (this.f2972b == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f2971a);
                }
                return Long.bitCount(this.f2971a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f2971a & ((1 << i) - 1));
            } else {
                return this.f2972b.m3789e(i - 64) + Long.bitCount(this.f2971a);
            }
        }

        public String toString() {
            if (this.f2972b == null) {
                return Long.toBinaryString(this.f2971a);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f2972b.toString());
            stringBuilder.append("xx");
            stringBuilder.append(Long.toBinaryString(this.f2971a));
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v7.widget.u$b */
    interface C0871b {
        /* renamed from: a */
        int mo711a();

        /* renamed from: a */
        int mo712a(View view);

        /* renamed from: a */
        void mo713a(int i);

        /* renamed from: a */
        void mo714a(View view, int i);

        /* renamed from: a */
        void mo715a(View view, int i, LayoutParams layoutParams);

        /* renamed from: b */
        C0798v mo716b(View view);

        /* renamed from: b */
        View mo717b(int i);

        /* renamed from: b */
        void mo718b();

        /* renamed from: c */
        void mo719c(int i);

        /* renamed from: c */
        void mo720c(View view);

        /* renamed from: d */
        void mo721d(View view);
    }

    C0872u(C0871b c0871b) {
        this.f2973a = c0871b;
    }

    /* renamed from: g */
    private void m3802g(View view) {
        this.f2975c.add(view);
        this.f2973a.mo720c(view);
    }

    /* renamed from: h */
    private boolean m3803h(View view) {
        if (!this.f2975c.remove(view)) {
            return null;
        }
        this.f2973a.mo721d(view);
        return true;
    }

    /* renamed from: a */
    void m3809a(View view, boolean z) {
        m3808a(view, -1, z);
    }

    /* renamed from: a */
    void m3808a(View view, int i, boolean z) {
        if (i < 0) {
            i = this.f2973a.mo711a();
        } else {
            i = m3801f(i);
        }
        this.f2974b.m3785a(i, z);
        if (z) {
            m3802g(view);
        }
        this.f2973a.mo714a(view, i);
    }

    /* renamed from: f */
    private int m3801f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f2973a.mo711a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f2974b.m3789e(i2));
            if (e == 0) {
                while (this.f2974b.m3787c(i2) != 0) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    /* renamed from: a */
    void m3806a(View view) {
        int a = this.f2973a.mo712a(view);
        if (a >= 0) {
            if (this.f2974b.m3788d(a)) {
                m3803h(view);
            }
            this.f2973a.mo713a(a);
        }
    }

    /* renamed from: a */
    void m3805a(int i) {
        i = m3801f(i);
        View b = this.f2973a.mo717b(i);
        if (b != null) {
            if (this.f2974b.m3788d(i)) {
                m3803h(b);
            }
            this.f2973a.mo713a(i);
        }
    }

    /* renamed from: b */
    View m3812b(int i) {
        return this.f2973a.mo717b(m3801f(i));
    }

    /* renamed from: a */
    void m3804a() {
        this.f2974b.m3783a();
        for (int size = this.f2975c.size() - 1; size >= 0; size--) {
            this.f2973a.mo721d((View) this.f2975c.get(size));
            this.f2975c.remove(size);
        }
        this.f2973a.mo718b();
    }

    /* renamed from: c */
    View m3814c(int i) {
        int size = this.f2975c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f2975c.get(i2);
            C0798v b = this.f2973a.mo716b(view);
            if (b.i_() == i && !b.m3295n() && !b.m3298q()) {
                return view;
            }
        }
        return 0;
    }

    /* renamed from: a */
    void m3807a(View view, int i, LayoutParams layoutParams, boolean z) {
        if (i < 0) {
            i = this.f2973a.mo711a();
        } else {
            i = m3801f(i);
        }
        this.f2974b.m3785a(i, z);
        if (z) {
            m3802g(view);
        }
        this.f2973a.mo715a(view, i, layoutParams);
    }

    /* renamed from: b */
    int m3810b() {
        return this.f2973a.mo711a() - this.f2975c.size();
    }

    /* renamed from: c */
    int m3813c() {
        return this.f2973a.mo711a();
    }

    /* renamed from: d */
    View m3816d(int i) {
        return this.f2973a.mo717b(i);
    }

    /* renamed from: e */
    void m3818e(int i) {
        i = m3801f(i);
        this.f2974b.m3788d(i);
        this.f2973a.mo719c(i);
    }

    /* renamed from: b */
    int m3811b(View view) {
        view = this.f2973a.mo712a(view);
        if (view == -1 || this.f2974b.m3787c(view)) {
            return -1;
        }
        return view - this.f2974b.m3789e(view);
    }

    /* renamed from: c */
    boolean m3815c(View view) {
        return this.f2975c.contains(view);
    }

    /* renamed from: d */
    void m3817d(View view) {
        int a = this.f2973a.mo712a(view);
        if (a >= 0) {
            this.f2974b.m3784a(a);
            m3802g(view);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("view is not a child, cannot hide ");
        stringBuilder.append(view);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: e */
    void m3819e(View view) {
        int a = this.f2973a.mo712a(view);
        StringBuilder stringBuilder;
        if (a < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("view is not a child, cannot hide ");
            stringBuilder.append(view);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f2974b.m3787c(a)) {
            this.f2974b.m3786b(a);
            m3803h(view);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("trying to unhide a view that was not hidden");
            stringBuilder.append(view);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f2974b.toString());
        stringBuilder.append(", hidden list:");
        stringBuilder.append(this.f2975c.size());
        return stringBuilder.toString();
    }

    /* renamed from: f */
    boolean m3820f(View view) {
        int a = this.f2973a.mo712a(view);
        if (a == -1) {
            m3803h(view);
            return true;
        } else if (!this.f2974b.m3787c(a)) {
            return null;
        } else {
            this.f2974b.m3788d(a);
            m3803h(view);
            this.f2973a.mo713a(a);
            return true;
        }
    }
}
