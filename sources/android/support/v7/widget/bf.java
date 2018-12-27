package android.support.v7.widget;

import android.support.v4.p017f.C0420f;
import android.support.v4.p017f.C0431k.C0430a;
import android.support.v4.p017f.C0431k.C3133b;
import android.support.v4.p017f.C3131a;
import android.support.v7.widget.RecyclerView.C0779f.C0778c;
import android.support.v7.widget.RecyclerView.C0798v;

class bf {
    /* renamed from: a */
    final C3131a<C0798v, C0849a> f2886a = new C3131a();
    /* renamed from: b */
    final C0420f<C0798v> f2887b = new C0420f();

    /* renamed from: android.support.v7.widget.bf$a */
    static class C0849a {
        /* renamed from: d */
        static C0430a<C0849a> f2882d = new C3133b(20);
        /* renamed from: a */
        int f2883a;
        /* renamed from: b */
        C0778c f2884b;
        /* renamed from: c */
        C0778c f2885c;

        private C0849a() {
        }

        /* renamed from: a */
        static C0849a m3590a() {
            C0849a c0849a = (C0849a) f2882d.mo338a();
            return c0849a == null ? new C0849a() : c0849a;
        }

        /* renamed from: a */
        static void m3591a(C0849a c0849a) {
            c0849a.f2883a = 0;
            c0849a.f2884b = null;
            c0849a.f2885c = null;
            f2882d.mo339a(c0849a);
        }

        /* renamed from: b */
        static void m3592b() {
            while (f2882d.mo338a() != null) {
            }
        }
    }

    /* renamed from: android.support.v7.widget.bf$b */
    interface C0850b {
        /* renamed from: a */
        void mo707a(C0798v c0798v);

        /* renamed from: a */
        void mo708a(C0798v c0798v, C0778c c0778c, C0778c c0778c2);

        /* renamed from: b */
        void mo709b(C0798v c0798v, C0778c c0778c, C0778c c0778c2);

        /* renamed from: c */
        void mo710c(C0798v c0798v, C0778c c0778c, C0778c c0778c2);
    }

    bf() {
    }

    /* renamed from: a */
    void m3599a() {
        this.f2886a.clear();
        this.f2887b.m1548c();
    }

    /* renamed from: a */
    void m3601a(C0798v c0798v, C0778c c0778c) {
        C0849a c0849a = (C0849a) this.f2886a.get(c0798v);
        if (c0849a == null) {
            c0849a = C0849a.m3590a();
            this.f2886a.put(c0798v, c0849a);
        }
        c0849a.f2884b = c0778c;
        c0849a.f2883a |= 4;
    }

    /* renamed from: a */
    boolean m3603a(C0798v c0798v) {
        C0849a c0849a = (C0849a) this.f2886a.get(c0798v);
        if (c0849a == null || (c0849a.f2883a & 1) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    C0778c m3604b(C0798v c0798v) {
        return m3597a(c0798v, 4);
    }

    /* renamed from: c */
    C0778c m3607c(C0798v c0798v) {
        return m3597a(c0798v, 8);
    }

    /* renamed from: a */
    private C0778c m3597a(C0798v c0798v, int i) {
        c0798v = this.f2886a.m1579a((Object) c0798v);
        if (c0798v < null) {
            return null;
        }
        C0849a c0849a = (C0849a) this.f2886a.m1586c(c0798v);
        if (c0849a == null || (c0849a.f2883a & i) == 0) {
            return null;
        }
        c0849a.f2883a &= i ^ -1;
        if (i == 4) {
            i = c0849a.f2884b;
        } else if (i == 8) {
            i = c0849a.f2885c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((c0849a.f2883a & 12) == 0) {
            this.f2886a.mo3896d(c0798v);
            C0849a.m3591a(c0849a);
        }
        return i;
    }

    /* renamed from: a */
    void m3600a(long j, C0798v c0798v) {
        this.f2887b.m1545b(j, c0798v);
    }

    /* renamed from: b */
    void m3606b(C0798v c0798v, C0778c c0778c) {
        C0849a c0849a = (C0849a) this.f2886a.get(c0798v);
        if (c0849a == null) {
            c0849a = C0849a.m3590a();
            this.f2886a.put(c0798v, c0849a);
        }
        c0849a.f2883a |= 2;
        c0849a.f2884b = c0778c;
    }

    /* renamed from: d */
    boolean m3609d(C0798v c0798v) {
        C0849a c0849a = (C0849a) this.f2886a.get(c0798v);
        return (c0849a == null || (c0849a.f2883a & 4) == null) ? null : true;
    }

    /* renamed from: a */
    C0798v m3598a(long j) {
        return (C0798v) this.f2887b.m1539a(j);
    }

    /* renamed from: c */
    void m3608c(C0798v c0798v, C0778c c0778c) {
        C0849a c0849a = (C0849a) this.f2886a.get(c0798v);
        if (c0849a == null) {
            c0849a = C0849a.m3590a();
            this.f2886a.put(c0798v, c0849a);
        }
        c0849a.f2885c = c0778c;
        c0849a.f2883a |= 8;
    }

    /* renamed from: e */
    void m3610e(C0798v c0798v) {
        C0849a c0849a = (C0849a) this.f2886a.get(c0798v);
        if (c0849a == null) {
            c0849a = C0849a.m3590a();
            this.f2886a.put(c0798v, c0849a);
        }
        r0.f2883a |= 1;
    }

    /* renamed from: f */
    void m3611f(C0798v c0798v) {
        C0849a c0849a = (C0849a) this.f2886a.get(c0798v);
        if (c0849a != null) {
            c0849a.f2883a &= -2;
        }
    }

    /* renamed from: a */
    void m3602a(C0850b c0850b) {
        for (int size = this.f2886a.size() - 1; size >= 0; size--) {
            C0798v c0798v = (C0798v) this.f2886a.m1585b(size);
            C0849a c0849a = (C0849a) this.f2886a.mo3896d(size);
            if ((c0849a.f2883a & 3) == 3) {
                c0850b.mo707a(c0798v);
            } else if ((c0849a.f2883a & 1) != 0) {
                if (c0849a.f2884b == null) {
                    c0850b.mo707a(c0798v);
                } else {
                    c0850b.mo708a(c0798v, c0849a.f2884b, c0849a.f2885c);
                }
            } else if ((c0849a.f2883a & 14) == 14) {
                c0850b.mo709b(c0798v, c0849a.f2884b, c0849a.f2885c);
            } else if ((c0849a.f2883a & 12) == 12) {
                c0850b.mo710c(c0798v, c0849a.f2884b, c0849a.f2885c);
            } else if ((c0849a.f2883a & 4) != 0) {
                c0850b.mo708a(c0798v, c0849a.f2884b, null);
            } else if ((c0849a.f2883a & 8) != 0) {
                c0850b.mo709b(c0798v, c0849a.f2884b, c0849a.f2885c);
            } else {
                int i = c0849a.f2883a;
            }
            C0849a.m3591a(c0849a);
        }
    }

    /* renamed from: g */
    void m3612g(C0798v c0798v) {
        for (int b = this.f2887b.m1542b() - 1; b >= 0; b--) {
            if (c0798v == this.f2887b.m1547c(b)) {
                this.f2887b.m1541a(b);
                break;
            }
        }
        C0849a c0849a = (C0849a) this.f2886a.remove(c0798v);
        if (c0849a != null) {
            C0849a.m3591a(c0849a);
        }
    }

    /* renamed from: b */
    void m3605b() {
        C0849a.m3592b();
    }

    /* renamed from: h */
    public void m3613h(C0798v c0798v) {
        m3611f(c0798v);
    }
}
