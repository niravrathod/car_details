package android.support.v7.widget;

import android.support.v4.os.C0509c;
import android.support.v7.widget.RecyclerView.C0783i;
import android.support.v7.widget.RecyclerView.C0783i.C0781a;
import android.support.v7.widget.RecyclerView.C0790o;
import android.support.v7.widget.RecyclerView.C0798v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class ad implements Runnable {
    /* renamed from: a */
    static final ThreadLocal<ad> f2769a = new ThreadLocal();
    /* renamed from: e */
    static Comparator<C0839b> f2770e = new C08381();
    /* renamed from: b */
    ArrayList<RecyclerView> f2771b = new ArrayList();
    /* renamed from: c */
    long f2772c;
    /* renamed from: d */
    long f2773d;
    /* renamed from: f */
    private ArrayList<C0839b> f2774f = new ArrayList();

    /* renamed from: android.support.v7.widget.ad$1 */
    static class C08381 implements Comparator<C0839b> {
        C08381() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m3448a((C0839b) obj, (C0839b) obj2);
        }

        /* renamed from: a */
        public int m3448a(C0839b c0839b, C0839b c0839b2) {
            int i = 1;
            if ((c0839b.f2767d == null ? 1 : null) != (c0839b2.f2767d == null ? 1 : null)) {
                if (c0839b.f2767d != null) {
                    i = -1;
                }
                return i;
            } else if (c0839b.f2764a != c0839b2.f2764a) {
                if (c0839b.f2764a != null) {
                    i = -1;
                }
                return i;
            } else {
                int i2 = c0839b2.f2765b - c0839b.f2765b;
                if (i2 != 0) {
                    return i2;
                }
                c0839b = c0839b.f2766c - c0839b2.f2766c;
                if (c0839b != null) {
                    return c0839b;
                }
                return 0;
            }
        }
    }

    /* renamed from: android.support.v7.widget.ad$b */
    static class C0839b {
        /* renamed from: a */
        public boolean f2764a;
        /* renamed from: b */
        public int f2765b;
        /* renamed from: c */
        public int f2766c;
        /* renamed from: d */
        public RecyclerView f2767d;
        /* renamed from: e */
        public int f2768e;

        C0839b() {
        }

        /* renamed from: a */
        public void m3449a() {
            this.f2764a = false;
            this.f2765b = 0;
            this.f2766c = 0;
            this.f2767d = null;
            this.f2768e = 0;
        }
    }

    /* renamed from: android.support.v7.widget.ad$a */
    static class C3255a implements C0781a {
        /* renamed from: a */
        int f13928a;
        /* renamed from: b */
        int f13929b;
        /* renamed from: c */
        int[] f13930c;
        /* renamed from: d */
        int f13931d;

        C3255a() {
        }

        /* renamed from: a */
        void m16675a(int i, int i2) {
            this.f13928a = i;
            this.f13929b = i2;
        }

        /* renamed from: a */
        void m16676a(RecyclerView recyclerView, boolean z) {
            this.f13931d = 0;
            if (this.f13930c != null) {
                Arrays.fill(this.f13930c, -1);
            }
            C0783i c0783i = recyclerView.f18626m;
            if (recyclerView.f18625l != null && c0783i != null && c0783i.m3148q()) {
                if (z) {
                    if (!recyclerView.f18618e.m16833d()) {
                        c0783i.mo670a(recyclerView.f18625l.mo91a(), (C0781a) this);
                    }
                } else if (!recyclerView.m24707v()) {
                    c0783i.mo669a(this.f13928a, this.f13929b, recyclerView.f18603C, (C0781a) this);
                }
                if (this.f13931d > c0783i.f2504x) {
                    c0783i.f2504x = this.f13931d;
                    c0783i.f2505y = z;
                    recyclerView.f18617d.m3197b();
                }
            }
        }

        /* renamed from: b */
        public void mo762b(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f13931d * 2;
                if (this.f13930c == null) {
                    this.f13930c = new int[4];
                    Arrays.fill(this.f13930c, -1);
                } else if (i3 >= this.f13930c.length) {
                    Object obj = this.f13930c;
                    this.f13930c = new int[(i3 * 2)];
                    System.arraycopy(obj, 0, this.f13930c, 0, obj.length);
                }
                this.f13930c[i3] = i;
                this.f13930c[i3 + 1] = i2;
                this.f13931d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: a */
        boolean m16677a(int i) {
            if (this.f13930c != null) {
                int i2 = this.f13931d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f13930c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        void m16674a() {
            if (this.f13930c != null) {
                Arrays.fill(this.f13930c, -1);
            }
            this.f13931d = 0;
        }
    }

    ad() {
    }

    /* renamed from: a */
    public void m3457a(RecyclerView recyclerView) {
        this.f2771b.add(recyclerView);
    }

    /* renamed from: b */
    public void m3459b(RecyclerView recyclerView) {
        this.f2771b.remove(recyclerView);
    }

    /* renamed from: a */
    void m3458a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f2772c == 0) {
            this.f2772c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f18602B.m16675a(i, i2);
    }

    /* renamed from: a */
    private void m3451a() {
        int i;
        int size = this.f2771b.size();
        int i2 = 0;
        for (i = 0; i < size; i++) {
            RecyclerView recyclerView = (RecyclerView) this.f2771b.get(i);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f18602B.m16676a(recyclerView, false);
                i2 += recyclerView.f18602B.f13931d;
            }
        }
        this.f2774f.ensureCapacity(i2);
        i2 = 0;
        for (i = 0; i < size; i++) {
            recyclerView = (RecyclerView) this.f2771b.get(i);
            if (recyclerView.getWindowVisibility() == 0) {
                C3255a c3255a = recyclerView.f18602B;
                int abs = Math.abs(c3255a.f13928a) + Math.abs(c3255a.f13929b);
                int i3 = i2;
                for (i2 = 0; i2 < c3255a.f13931d * 2; i2 += 2) {
                    C0839b c0839b;
                    if (i3 >= this.f2774f.size()) {
                        c0839b = new C0839b();
                        this.f2774f.add(c0839b);
                    } else {
                        c0839b = (C0839b) this.f2774f.get(i3);
                    }
                    int i4 = c3255a.f13930c[i2 + 1];
                    c0839b.f2764a = i4 <= abs;
                    c0839b.f2765b = abs;
                    c0839b.f2766c = i4;
                    c0839b.f2767d = recyclerView;
                    c0839b.f2768e = c3255a.f13930c[i2];
                    i3++;
                }
                i2 = i3;
            }
        }
        Collections.sort(this.f2774f, f2770e);
    }

    /* renamed from: a */
    static boolean m3454a(RecyclerView recyclerView, int i) {
        int c = recyclerView.f18619f.m3813c();
        for (int i2 = 0; i2 < c; i2++) {
            C0798v e = RecyclerView.m24617e(recyclerView.f18619f.m3816d(i2));
            if (e.f2562c == i && !e.m3295n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C0798v m3450a(RecyclerView recyclerView, int i, long j) {
        if (m3454a(recyclerView, i)) {
            return null;
        }
        C0790o c0790o = recyclerView.f18617d;
        try {
            recyclerView.m24695l();
            C0798v a = c0790o.m3182a(i, false, j);
            if (a != null) {
                if (a.m3297p() == null || a.m3295n() != null) {
                    c0790o.m3192a(a, false);
                } else {
                    c0790o.m3193a(a.f2560a);
                }
            }
            recyclerView.m24658b(false);
            return a;
        } catch (Throwable th) {
            recyclerView.m24658b(false);
        }
    }

    /* renamed from: a */
    private void m3452a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f18636w && recyclerView.f18619f.m3813c() != 0) {
                recyclerView.m24662c();
            }
            C3255a c3255a = recyclerView.f18602B;
            c3255a.m16676a(recyclerView, true);
            if (c3255a.f13931d != 0) {
                try {
                    C0509c.m1881a("RV Nested Prefetch");
                    recyclerView.f18603C.m3244a(recyclerView.f18625l);
                    for (int i = 0; i < c3255a.f13931d * 2; i += 2) {
                        m3450a(recyclerView, c3255a.f13930c[i], j);
                    }
                } finally {
                    C0509c.m1880a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m3453a(C0839b c0839b, long j) {
        c0839b = m3450a(c0839b.f2767d, c0839b.f2768e, c0839b.f2764a ? Long.MAX_VALUE : j);
        if (c0839b != null && c0839b.f2561b != null && c0839b.m3297p() && !c0839b.m3295n()) {
            m3452a((RecyclerView) c0839b.f2561b.get(), j);
        }
    }

    /* renamed from: b */
    private void m3455b(long j) {
        int i = 0;
        while (i < this.f2774f.size()) {
            C0839b c0839b = (C0839b) this.f2774f.get(i);
            if (c0839b.f2767d != null) {
                m3453a(c0839b, j);
                c0839b.m3449a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    void m3456a(long j) {
        m3451a();
        m3455b(j);
    }

    public void run() {
        try {
            C0509c.m1881a("RV Prefetch");
            if (!this.f2771b.isEmpty()) {
                int size = this.f2771b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f2771b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j == 0) {
                    this.f2772c = 0;
                    C0509c.m1880a();
                    return;
                }
                m3456a(TimeUnit.MILLISECONDS.toNanos(j) + this.f2773d);
                this.f2772c = 0;
                C0509c.m1880a();
            }
        } finally {
            this.f2772c = 0;
            C0509c.m1880a();
        }
    }
}
