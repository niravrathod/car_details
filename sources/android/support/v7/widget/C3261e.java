package android.support.v7.widget;

import android.support.v4.p017f.C0431k.C0430a;
import android.support.v4.p017f.C0431k.C3133b;
import android.support.v7.widget.RecyclerView.C0798v;
import android.support.v7.widget.ah.C0840a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.e */
class C3261e implements C0840a {
    /* renamed from: a */
    final ArrayList<C0858b> f13965a;
    /* renamed from: b */
    final ArrayList<C0858b> f13966b;
    /* renamed from: c */
    final C0857a f13967c;
    /* renamed from: d */
    Runnable f13968d;
    /* renamed from: e */
    final boolean f13969e;
    /* renamed from: f */
    final ah f13970f;
    /* renamed from: g */
    private C0430a<C0858b> f13971g;
    /* renamed from: h */
    private int f13972h;

    /* renamed from: android.support.v7.widget.e$a */
    interface C0857a {
        /* renamed from: a */
        C0798v mo722a(int i);

        /* renamed from: a */
        void mo723a(int i, int i2);

        /* renamed from: a */
        void mo724a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo725a(C0858b c0858b);

        /* renamed from: b */
        void mo726b(int i, int i2);

        /* renamed from: b */
        void mo727b(C0858b c0858b);

        /* renamed from: c */
        void mo728c(int i, int i2);

        /* renamed from: d */
        void mo729d(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.e$b */
    static class C0858b {
        /* renamed from: a */
        int f2911a;
        /* renamed from: b */
        int f2912b;
        /* renamed from: c */
        Object f2913c;
        /* renamed from: d */
        int f2914d;

        C0858b(int i, int i2, int i3, Object obj) {
            this.f2911a = i;
            this.f2912b = i2;
            this.f2914d = i3;
            this.f2913c = obj;
        }

        /* renamed from: a */
        String m3644a() {
            int i = this.f2911a;
            if (i == 4) {
                return "up";
            }
            if (i == 8) {
                return "mv";
            }
            switch (i) {
                case 1:
                    return "add";
                case 2:
                    return "rm";
                default:
                    return "??";
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append("[");
            stringBuilder.append(m3644a());
            stringBuilder.append(",s:");
            stringBuilder.append(this.f2912b);
            stringBuilder.append("c:");
            stringBuilder.append(this.f2914d);
            stringBuilder.append(",p:");
            stringBuilder.append(this.f2913c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C0858b c0858b = (C0858b) obj;
                    if (this.f2911a != c0858b.f2911a) {
                        return false;
                    }
                    if (this.f2911a == 8 && Math.abs(this.f2914d - this.f2912b) == 1 && this.f2914d == c0858b.f2912b && this.f2912b == c0858b.f2914d) {
                        return true;
                    }
                    if (this.f2914d != c0858b.f2914d || this.f2912b != c0858b.f2912b) {
                        return false;
                    }
                    if (this.f2913c != null) {
                        if (this.f2913c.equals(c0858b.f2913c) == null) {
                            return false;
                        }
                    } else if (c0858b.f2913c != null) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f2911a * 31) + this.f2912b) * 31) + this.f2914d;
        }
    }

    C3261e(C0857a c0857a) {
        this(c0857a, false);
    }

    C3261e(C0857a c0857a, boolean z) {
        this.f13971g = new C3133b(30);
        this.f13965a = new ArrayList();
        this.f13966b = new ArrayList();
        this.f13972h = 0;
        this.f13967c = c0857a;
        this.f13969e = z;
        this.f13970f = new ah(this);
    }

    /* renamed from: a */
    void m16820a() {
        m16823a(this.f13965a);
        m16823a(this.f13966b);
        this.f13972h = 0;
    }

    /* renamed from: b */
    void m16828b() {
        this.f13970f.m3469a(this.f13965a);
        int size = this.f13965a.size();
        for (int i = 0; i < size; i++) {
            C0858b c0858b = (C0858b) this.f13965a.get(i);
            int i2 = c0858b.f2911a;
            if (i2 == 4) {
                m16813d(c0858b);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        m16816f(c0858b);
                        break;
                    case 2:
                        m16811c(c0858b);
                        break;
                    default:
                        break;
                }
            } else {
                m16810b(c0858b);
            }
            if (this.f13968d != null) {
                this.f13968d.run();
            }
        }
        this.f13965a.clear();
    }

    /* renamed from: c */
    void m16831c() {
        int size = this.f13966b.size();
        for (int i = 0; i < size; i++) {
            this.f13967c.mo727b((C0858b) this.f13966b.get(i));
        }
        m16823a(this.f13966b);
        this.f13972h = 0;
    }

    /* renamed from: b */
    private void m16810b(C0858b c0858b) {
        m16817g(c0858b);
    }

    /* renamed from: c */
    private void m16811c(C0858b c0858b) {
        int i = c0858b.f2912b;
        int i2 = c0858b.f2912b + c0858b.f2914d;
        int i3 = c0858b.f2912b;
        int i4 = 0;
        Object obj = -1;
        while (i3 < i2) {
            Object obj2;
            if (this.f13967c.mo722a(i3) == null) {
                if (!m16814d(i3)) {
                    if (obj == 1) {
                        m16817g(mo822a(2, i, i4, null));
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    obj2 = null;
                    if (obj == null) {
                        i3 -= i4;
                        i2 -= i4;
                        i4 = 1;
                    } else {
                        i4++;
                    }
                    i3++;
                    obj = obj2;
                }
            }
            if (obj == null) {
                m16815e(mo822a(2, i, i4, null));
                obj = 1;
            } else {
                obj = null;
            }
            obj2 = 1;
            if (obj == null) {
                i4++;
            } else {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            }
            i3++;
            obj = obj2;
        }
        if (i4 != c0858b.f2914d) {
            mo823a(c0858b);
            c0858b = mo822a(2, i, i4, null);
        }
        if (obj == null) {
            m16815e(c0858b);
        } else {
            m16817g(c0858b);
        }
    }

    /* renamed from: d */
    private void m16813d(C0858b c0858b) {
        int i = c0858b.f2912b;
        int i2 = c0858b.f2912b + c0858b.f2914d;
        Object obj = -1;
        int i3 = i;
        i = 0;
        for (int i4 = c0858b.f2912b; i4 < i2; i4++) {
            if (this.f13967c.mo722a(i4) == null) {
                if (!m16814d(i4)) {
                    if (obj == 1) {
                        m16817g(mo822a(4, i3, i, c0858b.f2913c));
                        i3 = i4;
                        i = 0;
                    }
                    obj = null;
                    i++;
                }
            }
            if (obj == null) {
                m16815e(mo822a(4, i3, i, c0858b.f2913c));
                i3 = i4;
                i = 0;
            }
            obj = 1;
            i++;
        }
        if (i != c0858b.f2914d) {
            Object obj2 = c0858b.f2913c;
            mo823a(c0858b);
            c0858b = mo822a(4, i3, i, obj2);
        }
        if (obj == null) {
            m16815e(c0858b);
        } else {
            m16817g(c0858b);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    private void m16815e(android.support.v7.widget.C3261e.C0858b r13) {
        /*
        r12 = this;
        r0 = r13.f2911a;
        r1 = 1;
        if (r0 == r1) goto L_0x008d;
    L_0x0005:
        r0 = r13.f2911a;
        r2 = 8;
        if (r0 == r2) goto L_0x008d;
    L_0x000b:
        r0 = r13.f2912b;
        r2 = r13.f2911a;
        r0 = r12.m16812d(r0, r2);
        r2 = r13.f2912b;
        r3 = r13.f2911a;
        r4 = 2;
        r5 = 4;
        r6 = 0;
        if (r3 == r4) goto L_0x0037;
    L_0x001c:
        if (r3 != r5) goto L_0x0020;
    L_0x001e:
        r3 = 1;
        goto L_0x0038;
    L_0x0020:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "op should be remove or update.";
        r1.append(r2);
        r1.append(r13);
        r13 = r1.toString();
        r0.<init>(r13);
        throw r0;
    L_0x0037:
        r3 = 0;
    L_0x0038:
        r7 = r0;
        r8 = r2;
        r0 = 1;
        r2 = 1;
    L_0x003c:
        r9 = r13.f2914d;
        if (r0 >= r9) goto L_0x0079;
    L_0x0040:
        r9 = r13.f2912b;
        r10 = r3 * r0;
        r9 = r9 + r10;
        r10 = r13.f2911a;
        r9 = r12.m16812d(r9, r10);
        r10 = r13.f2911a;
        if (r10 == r4) goto L_0x0059;
    L_0x004f:
        if (r10 == r5) goto L_0x0053;
    L_0x0051:
        r10 = 0;
        goto L_0x005c;
    L_0x0053:
        r10 = r7 + 1;
        if (r9 != r10) goto L_0x0051;
    L_0x0057:
        r10 = 1;
        goto L_0x005c;
    L_0x0059:
        if (r9 != r7) goto L_0x0051;
    L_0x005b:
        goto L_0x0057;
    L_0x005c:
        if (r10 == 0) goto L_0x0061;
    L_0x005e:
        r2 = r2 + 1;
        goto L_0x0076;
    L_0x0061:
        r10 = r13.f2911a;
        r11 = r13.f2913c;
        r7 = r12.mo822a(r10, r7, r2, r11);
        r12.m16822a(r7, r8);
        r12.mo823a(r7);
        r7 = r13.f2911a;
        if (r7 != r5) goto L_0x0074;
    L_0x0073:
        r8 = r8 + r2;
    L_0x0074:
        r7 = r9;
        r2 = 1;
    L_0x0076:
        r0 = r0 + 1;
        goto L_0x003c;
    L_0x0079:
        r0 = r13.f2913c;
        r12.mo823a(r13);
        if (r2 <= 0) goto L_0x008c;
    L_0x0080:
        r13 = r13.f2911a;
        r13 = r12.mo822a(r13, r7, r2, r0);
        r12.m16822a(r13, r8);
        r12.mo823a(r13);
    L_0x008c:
        return;
    L_0x008d:
        r13 = new java.lang.IllegalArgumentException;
        r0 = "should not dispatch add or move for pre layout";
        r13.<init>(r0);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.e.e(android.support.v7.widget.e$b):void");
    }

    /* renamed from: a */
    void m16822a(C0858b c0858b, int i) {
        this.f13967c.mo725a(c0858b);
        int i2 = c0858b.f2911a;
        if (i2 == 2) {
            this.f13967c.mo723a(i, c0858b.f2914d);
        } else if (i2 == 4) {
            this.f13967c.mo724a(i, c0858b.f2914d, c0858b.f2913c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: d */
    private int m16812d(int i, int i2) {
        for (int size = this.f13966b.size() - 1; size >= 0; size--) {
            C0858b c0858b = (C0858b) this.f13966b.get(size);
            if (c0858b.f2911a == 8) {
                int i3;
                int i4;
                if (c0858b.f2912b < c0858b.f2914d) {
                    i3 = c0858b.f2912b;
                    i4 = c0858b.f2914d;
                } else {
                    i3 = c0858b.f2914d;
                    i4 = c0858b.f2912b;
                }
                if (i < i3 || i > r4) {
                    if (i < c0858b.f2912b) {
                        if (i2 == 1) {
                            c0858b.f2912b++;
                            c0858b.f2914d++;
                        } else if (i2 == 2) {
                            c0858b.f2912b--;
                            c0858b.f2914d--;
                        }
                    }
                } else if (i3 == c0858b.f2912b) {
                    if (i2 == 1) {
                        c0858b.f2914d++;
                    } else if (i2 == 2) {
                        c0858b.f2914d--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0858b.f2912b++;
                    } else if (i2 == 2) {
                        c0858b.f2912b--;
                    }
                    i--;
                }
            } else if (c0858b.f2912b <= i) {
                if (c0858b.f2911a == 1) {
                    i -= c0858b.f2914d;
                } else if (c0858b.f2911a == 2) {
                    i += c0858b.f2914d;
                }
            } else if (i2 == 1) {
                c0858b.f2912b++;
            } else if (i2 == 2) {
                c0858b.f2912b--;
            }
        }
        for (i2 = this.f13966b.size() - 1; i2 >= 0; i2--) {
            C0858b c0858b2 = (C0858b) this.f13966b.get(i2);
            if (c0858b2.f2911a == 8) {
                if (c0858b2.f2914d == c0858b2.f2912b || c0858b2.f2914d < 0) {
                    this.f13966b.remove(i2);
                    mo823a(c0858b2);
                }
            } else if (c0858b2.f2914d <= 0) {
                this.f13966b.remove(i2);
                mo823a(c0858b2);
            }
        }
        return i;
    }

    /* renamed from: d */
    private boolean m16814d(int i) {
        int size = this.f13966b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0858b c0858b = (C0858b) this.f13966b.get(i2);
            if (c0858b.f2911a == 8) {
                if (m16818a(c0858b.f2914d, i2 + 1) == i) {
                    return true;
                }
            } else if (c0858b.f2911a == 1) {
                int i3 = c0858b.f2912b + c0858b.f2914d;
                for (int i4 = c0858b.f2912b; i4 < i3; i4++) {
                    if (m16818a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m16816f(C0858b c0858b) {
        m16817g(c0858b);
    }

    /* renamed from: g */
    private void m16817g(C0858b c0858b) {
        this.f13966b.add(c0858b);
        int i = c0858b.f2911a;
        if (i == 4) {
            this.f13967c.mo724a(c0858b.f2912b, c0858b.f2914d, c0858b.f2913c);
        } else if (i != 8) {
            switch (i) {
                case 1:
                    this.f13967c.mo728c(c0858b.f2912b, c0858b.f2914d);
                    return;
                case 2:
                    this.f13967c.mo726b(c0858b.f2912b, c0858b.f2914d);
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown update op type for ");
                    stringBuilder.append(c0858b);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } else {
            this.f13967c.mo729d(c0858b.f2912b, c0858b.f2914d);
        }
    }

    /* renamed from: d */
    boolean m16833d() {
        return this.f13965a.size() > 0;
    }

    /* renamed from: a */
    boolean m16824a(int i) {
        return (i & this.f13972h) != 0;
    }

    /* renamed from: b */
    int m16827b(int i) {
        return m16818a(i, 0);
    }

    /* renamed from: a */
    int m16818a(int i, int i2) {
        int size = this.f13966b.size();
        while (i2 < size) {
            C0858b c0858b = (C0858b) this.f13966b.get(i2);
            if (c0858b.f2911a == 8) {
                if (c0858b.f2912b == i) {
                    i = c0858b.f2914d;
                } else {
                    if (c0858b.f2912b < i) {
                        i--;
                    }
                    if (c0858b.f2914d <= i) {
                        i++;
                    }
                }
            } else if (c0858b.f2912b > i) {
                continue;
            } else if (c0858b.f2911a == 2) {
                if (i < c0858b.f2912b + c0858b.f2914d) {
                    return -1;
                }
                i -= c0858b.f2914d;
            } else if (c0858b.f2911a == 1) {
                i += c0858b.f2914d;
            }
            i2++;
        }
        return i;
    }

    /* renamed from: a */
    boolean m16826a(int i, int i2, Object obj) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f13965a.add(mo822a(4, i, i2, obj));
        this.f13972h |= 4;
        if (this.f13965a.size() == 1) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    boolean m16829b(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f13965a.add(mo822a(1, i, i2, null));
        this.f13972h |= 1;
        if (this.f13965a.size() == 1) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    boolean m16832c(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f13965a.add(mo822a(2, i, i2, null));
        this.f13972h |= 2;
        if (this.f13965a.size() == 1) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    boolean m16825a(int i, int i2, int i3) {
        boolean z = false;
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f13965a.add(mo822a(8, i, i2, null));
            this.f13972h |= 8;
            if (this.f13965a.size() == 1) {
                z = true;
            }
            return z;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: e */
    void m16834e() {
        m16831c();
        int size = this.f13965a.size();
        for (int i = 0; i < size; i++) {
            C0858b c0858b = (C0858b) this.f13965a.get(i);
            int i2 = c0858b.f2911a;
            if (i2 == 4) {
                this.f13967c.mo727b(c0858b);
                this.f13967c.mo724a(c0858b.f2912b, c0858b.f2914d, c0858b.f2913c);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        this.f13967c.mo727b(c0858b);
                        this.f13967c.mo728c(c0858b.f2912b, c0858b.f2914d);
                        break;
                    case 2:
                        this.f13967c.mo727b(c0858b);
                        this.f13967c.mo723a(c0858b.f2912b, c0858b.f2914d);
                        break;
                    default:
                        break;
                }
            } else {
                this.f13967c.mo727b(c0858b);
                this.f13967c.mo729d(c0858b.f2912b, c0858b.f2914d);
            }
            if (this.f13968d != null) {
                this.f13968d.run();
            }
        }
        m16823a(this.f13965a);
        this.f13972h = 0;
    }

    /* renamed from: c */
    public int m16830c(int i) {
        int size = this.f13965a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0858b c0858b = (C0858b) this.f13965a.get(i2);
            int i3 = c0858b.f2911a;
            if (i3 != 8) {
                switch (i3) {
                    case 1:
                        if (c0858b.f2912b > i) {
                            break;
                        }
                        i += c0858b.f2914d;
                        break;
                    case 2:
                        if (c0858b.f2912b <= i) {
                            if (c0858b.f2912b + c0858b.f2914d <= i) {
                                i -= c0858b.f2914d;
                                break;
                            }
                            return -1;
                        }
                        continue;
                    default:
                        break;
                }
            } else if (c0858b.f2912b == i) {
                i = c0858b.f2914d;
            } else {
                if (c0858b.f2912b < i) {
                    i--;
                }
                if (c0858b.f2914d <= i) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: f */
    boolean m16835f() {
        return (this.f13966b.isEmpty() || this.f13965a.isEmpty()) ? false : true;
    }

    /* renamed from: a */
    public C0858b mo822a(int i, int i2, int i3, Object obj) {
        C0858b c0858b = (C0858b) this.f13971g.mo338a();
        if (c0858b == null) {
            return new C0858b(i, i2, i3, obj);
        }
        c0858b.f2911a = i;
        c0858b.f2912b = i2;
        c0858b.f2914d = i3;
        c0858b.f2913c = obj;
        return c0858b;
    }

    /* renamed from: a */
    public void mo823a(C0858b c0858b) {
        if (!this.f13969e) {
            c0858b.f2913c = null;
            this.f13971g.mo339a(c0858b);
        }
    }

    /* renamed from: a */
    void m16823a(List<C0858b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo823a((C0858b) list.get(i));
        }
        list.clear();
    }
}
