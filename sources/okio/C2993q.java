package okio;

import javax.annotation.Nullable;

/* renamed from: okio.q */
final class C2993q {
    @Nullable
    /* renamed from: a */
    static C2992p f12691a;
    /* renamed from: b */
    static long f12692b;

    private C2993q() {
    }

    /* renamed from: a */
    static C2992p m14668a() {
        synchronized (C2993q.class) {
            if (f12691a != null) {
                C2992p c2992p = f12691a;
                f12691a = c2992p.f12689f;
                c2992p.f12689f = null;
                f12692b -= 8192;
                return c2992p;
            }
            return new C2992p();
        }
    }

    /* renamed from: a */
    static void m14669a(C2992p c2992p) {
        if (c2992p.f12689f != null || c2992p.f12690g != null) {
            throw new IllegalArgumentException();
        } else if (!c2992p.f12687d) {
            synchronized (C2993q.class) {
                if (f12692b + 8192 > 65536) {
                    return;
                }
                f12692b += 8192;
                c2992p.f12689f = f12691a;
                c2992p.f12686c = 0;
                c2992p.f12685b = 0;
                f12691a = c2992p;
            }
        }
    }
}
