package com.facebook.ads.internal.view.component.p112a;

import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.adapters.p082a.C1731h;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.component.C2013a;

/* renamed from: com.facebook.ads.internal.view.component.a.c */
public final class C2008c {
    /* renamed from: a */
    private static final int f6190a = C1936w.f5933a.heightPixels;
    /* renamed from: b */
    private static final int f6191b = C1936w.f5933a.widthPixels;

    /* renamed from: a */
    private static float m7536a(C1731h c1731h) {
        int h = c1731h.m6553c().m6510h();
        int i = c1731h.m6553c().m6511i();
        return i > 0 ? ((float) h) / ((float) i) : -1.0f;
    }

    /* renamed from: a */
    private static int m7537a(int i) {
        return (f6190a - i) - ((C1936w.m7326a(16) + (C2013a.f6216a * 2)) + (C3851e.a * 2));
    }

    /* renamed from: a */
    public static C2007b m7538a(C2011d c2011d) {
        C2007b c3850a;
        boolean z = true;
        C1727d a = c2011d.m7569k() == 1 ? c2011d.m7565g().m6543b().m6481a() : c2011d.m7565g().m6543b().m6482b();
        C1731h c1731h = (C1731h) c2011d.m7565g().m6545d().get(0);
        double a2 = (double) C2008c.m7536a(c1731h);
        if (C2008c.m7541a(c2011d.m7569k(), c2011d.m7568j(), a2)) {
            if (c2011d.m7569k() != 2) {
                z = false;
            }
            c3850a = new C3850a(c2011d, a, z);
        } else {
            c3850a = new C3851e(c2011d, C2008c.m7539a(a2), a);
        }
        c3850a.mo1435a(c1731h, c2011d.m7565g().m6544c(), a2);
        return c3850a;
    }

    /* renamed from: a */
    private static boolean m7539a(double d) {
        return d < 0.9d;
    }

    /* renamed from: a */
    private static boolean m7540a(double d, int i) {
        return C2008c.m7537a(i) < C2008c.m7542b(d);
    }

    /* renamed from: a */
    private static boolean m7541a(int i, int i2, double d) {
        if (i != 2) {
            if (!C2008c.m7540a(d, i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m7542b(double d) {
        double d2 = (double) (f6191b - (C3851e.a * 2));
        Double.isNaN(d2);
        return (int) (d2 / d);
    }
}
