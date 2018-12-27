package android.databinding;

import java.util.ArrayList;
import java.util.List;

/* renamed from: android.databinding.c */
public class C0057c<C, T, A> implements Cloneable {
    /* renamed from: a */
    private List<C> f74a;
    /* renamed from: b */
    private long f75b;
    /* renamed from: c */
    private long[] f76c;
    /* renamed from: d */
    private int f77d;
    /* renamed from: e */
    private final C0056a<C, T, A> f78e;

    /* renamed from: android.databinding.c$a */
    public static abstract class C0056a<C, T, A> {
        /* renamed from: a */
        public abstract void mo26a(C c, T t, int i, A a);
    }

    public /* synthetic */ Object clone() {
        return m126a();
    }

    /* renamed from: a */
    public synchronized void m127a(T t, int i, A a) {
        this.f77d++;
        m125c(t, i, a);
        this.f77d--;
        if (this.f77d == null) {
            if (this.f76c != null) {
                for (t = this.f76c.length - 1; t >= null; t--) {
                    long j = this.f76c[t];
                    if (j != 0) {
                        m120a((t + 1) * 64, j);
                        this.f76c[t] = 0;
                    }
                }
            }
            if (this.f75b != 0) {
                m120a(null, this.f75b);
                this.f75b = 0;
            }
        }
    }

    /* renamed from: b */
    private void m124b(T t, int i, A a) {
        m122a(t, i, a, 0, Math.min(64, this.f74a.size()), this.f75b);
    }

    /* renamed from: c */
    private void m125c(T t, int i, A a) {
        int size = this.f74a.size();
        int length = this.f76c == null ? -1 : this.f76c.length - 1;
        m121a(t, i, a, length);
        m122a(t, i, a, (length + 2) * 64, size, 0);
    }

    /* renamed from: a */
    private void m121a(T t, int i, A a, int i2) {
        if (i2 < 0) {
            m124b(t, i, a);
            return;
        }
        long j = this.f76c[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f74a.size(), i3 + 64);
        m121a(t, i, a, i2 - 1);
        m122a(t, i, a, i3, min, j);
    }

    /* renamed from: a */
    private void m122a(T t, int i, A a, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f78e.mo26a(this.f74a.get(i2), t, i, a);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: a */
    private boolean m123a(int i) {
        boolean z = true;
        if (i < 64) {
            if (((1 << i) & this.f75b) == 0) {
                z = false;
            }
            return z;
        } else if (this.f76c == null) {
            return false;
        } else {
            int i2 = (i / 64) - 1;
            if (i2 >= this.f76c.length) {
                return false;
            }
            if (((1 << (i % 64)) & this.f76c[i2]) == 0) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    private void m120a(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f74a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    /* renamed from: a */
    public synchronized C0057c<C, T, A> m126a() {
        C0057c<C, T, A> c0057c;
        CloneNotSupportedException e;
        try {
            c0057c = (C0057c) super.clone();
            try {
                c0057c.f75b = 0;
                c0057c.f76c = null;
                int i = 0;
                c0057c.f77d = 0;
                c0057c.f74a = new ArrayList();
                int size = this.f74a.size();
                while (i < size) {
                    if (!m123a(i)) {
                        c0057c.f74a.add(this.f74a.get(i));
                    }
                    i++;
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return c0057c;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            c0057c = null;
            e = cloneNotSupportedException;
            e.printStackTrace();
            return c0057c;
        }
        return c0057c;
    }
}
