package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: android.support.v4.view.z */
public class C0571z {
    /* renamed from: a */
    private final Object f1788a;

    private C0571z(Object obj) {
        this.f1788a = obj;
    }

    /* renamed from: a */
    public int m2251a() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1788a).getSystemWindowInsetLeft() : 0;
    }

    /* renamed from: b */
    public int m2253b() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1788a).getSystemWindowInsetTop() : 0;
    }

    /* renamed from: c */
    public int m2254c() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1788a).getSystemWindowInsetRight() : 0;
    }

    /* renamed from: d */
    public int m2255d() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1788a).getSystemWindowInsetBottom() : 0;
    }

    /* renamed from: e */
    public boolean m2256e() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1788a).hasSystemWindowInsets() : false;
    }

    /* renamed from: f */
    public boolean m2257f() {
        return VERSION.SDK_INT >= 21 ? ((WindowInsets) this.f1788a).isConsumed() : false;
    }

    /* renamed from: g */
    public C0571z m2258g() {
        return VERSION.SDK_INT >= 20 ? new C0571z(((WindowInsets) this.f1788a).consumeSystemWindowInsets()) : null;
    }

    /* renamed from: a */
    public C0571z m2252a(int i, int i2, int i3, int i4) {
        return VERSION.SDK_INT >= 20 ? new C0571z(((WindowInsets) this.f1788a).replaceSystemWindowInsets(i, i2, i3, i4)) : 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C0571z c0571z = (C0571z) obj;
                if (this.f1788a != null) {
                    z = this.f1788a.equals(c0571z.f1788a);
                } else if (c0571z.f1788a != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f1788a == null ? 0 : this.f1788a.hashCode();
    }

    /* renamed from: a */
    static C0571z m2249a(Object obj) {
        return obj == null ? null : new C0571z(obj);
    }

    /* renamed from: a */
    static Object m2250a(C0571z c0571z) {
        return c0571z == null ? null : c0571z.f1788a;
    }
}
