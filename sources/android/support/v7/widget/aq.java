package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.C0779f;
import android.support.v7.widget.RecyclerView.C0779f.C0778c;
import android.support.v7.widget.RecyclerView.C0798v;

public abstract class aq extends C0779f {
    /* renamed from: h */
    boolean f13941h = true;

    /* renamed from: a */
    public abstract boolean mo3868a(C0798v c0798v);

    /* renamed from: a */
    public abstract boolean mo3869a(C0798v c0798v, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo3870a(C0798v c0798v, C0798v c0798v2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo3873b(C0798v c0798v);

    /* renamed from: c */
    public void m16738c(C0798v c0798v, boolean z) {
    }

    /* renamed from: d */
    public void m16740d(C0798v c0798v, boolean z) {
    }

    /* renamed from: o */
    public void m16748o(C0798v c0798v) {
    }

    /* renamed from: p */
    public void m16749p(C0798v c0798v) {
    }

    /* renamed from: q */
    public void m16750q(C0798v c0798v) {
    }

    /* renamed from: r */
    public void m16751r(C0798v c0798v) {
    }

    /* renamed from: s */
    public void m16752s(C0798v c0798v) {
    }

    /* renamed from: t */
    public void m16753t(C0798v c0798v) {
    }

    /* renamed from: h */
    public boolean mo785h(C0798v c0798v) {
        if (this.f13941h) {
            if (c0798v.m3295n() == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo781a(C0798v c0798v, C0778c c0778c, C0778c c0778c2) {
        int i = c0778c.f2474a;
        int i2 = c0778c.f2475b;
        c0778c = c0798v.f2560a;
        int left = c0778c2 == null ? c0778c.getLeft() : c0778c2.f2474a;
        int top = c0778c2 == null ? c0778c.getTop() : c0778c2.f2475b;
        if (c0798v.m3298q() != null || (i == left && i2 == top)) {
            return mo3868a(c0798v);
        }
        c0778c.layout(left, top, c0778c.getWidth() + left, c0778c.getHeight() + top);
        return mo3869a(c0798v, i, i2, left, top);
    }

    /* renamed from: b */
    public boolean mo783b(C0798v c0798v, C0778c c0778c, C0778c c0778c2) {
        if (c0778c == null || (c0778c.f2474a == c0778c2.f2474a && c0778c.f2475b == c0778c2.f2475b)) {
            return mo3873b(c0798v);
        }
        return mo3869a(c0798v, c0778c.f2474a, c0778c.f2475b, c0778c2.f2474a, c0778c2.f2475b);
    }

    /* renamed from: c */
    public boolean mo784c(C0798v c0798v, C0778c c0778c, C0778c c0778c2) {
        if (c0778c.f2474a == c0778c2.f2474a) {
            if (c0778c.f2475b == c0778c2.f2475b) {
                m16743j(c0798v);
                return null;
            }
        }
        return mo3869a(c0798v, c0778c.f2474a, c0778c.f2475b, c0778c2.f2474a, c0778c2.f2475b);
    }

    /* renamed from: a */
    public boolean mo782a(C0798v c0798v, C0798v c0798v2, C0778c c0778c, C0778c c0778c2) {
        int i;
        int i2;
        int i3 = c0778c.f2474a;
        int i4 = c0778c.f2475b;
        if (c0798v2.h_()) {
            c0778c2 = c0778c.f2474a;
            i = c0778c.f2475b;
            i2 = c0778c2;
        } else {
            i2 = c0778c2.f2474a;
            i = c0778c2.f2475b;
        }
        return mo3870a(c0798v, c0798v2, i3, i4, i2, i);
    }

    /* renamed from: i */
    public final void m16742i(C0798v c0798v) {
        m16749p(c0798v);
        m3000f(c0798v);
    }

    /* renamed from: j */
    public final void m16743j(C0798v c0798v) {
        m16753t(c0798v);
        m3000f(c0798v);
    }

    /* renamed from: k */
    public final void m16744k(C0798v c0798v) {
        m16751r(c0798v);
        m3000f(c0798v);
    }

    /* renamed from: a */
    public final void m16729a(C0798v c0798v, boolean z) {
        m16740d(c0798v, z);
        m3000f(c0798v);
    }

    /* renamed from: l */
    public final void m16745l(C0798v c0798v) {
        m16748o(c0798v);
    }

    /* renamed from: m */
    public final void m16746m(C0798v c0798v) {
        m16752s(c0798v);
    }

    /* renamed from: n */
    public final void m16747n(C0798v c0798v) {
        m16750q(c0798v);
    }

    /* renamed from: b */
    public final void m16735b(C0798v c0798v, boolean z) {
        m16738c(c0798v, z);
    }
}
