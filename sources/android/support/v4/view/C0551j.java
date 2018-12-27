package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.j */
public class C0551j {
    /* renamed from: a */
    private ViewParent f1753a;
    /* renamed from: b */
    private ViewParent f1754b;
    /* renamed from: c */
    private final View f1755c;
    /* renamed from: d */
    private boolean f1756d;
    /* renamed from: e */
    private int[] f1757e;

    public C0551j(View view) {
        this.f1755c = view;
    }

    /* renamed from: a */
    public void m2066a(boolean z) {
        if (this.f1756d) {
            C0560r.m2211w(this.f1755c);
        }
        this.f1756d = z;
    }

    /* renamed from: a */
    public boolean m2067a() {
        return this.f1756d;
    }

    /* renamed from: b */
    public boolean m2076b() {
        return m2070a(0);
    }

    /* renamed from: a */
    public boolean m2070a(int i) {
        return m2065d(i) != 0;
    }

    /* renamed from: b */
    public boolean m2077b(int i) {
        return m2071a(i, 0);
    }

    /* renamed from: a */
    public boolean m2071a(int i, int i2) {
        if (m2070a(i2)) {
            return true;
        }
        if (m2067a()) {
            View view = this.f1755c;
            for (ViewParent parent = this.f1755c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0565u.m2232a(parent, view, this.f1755c, i, i2)) {
                    m2064a(i2, parent);
                    C0565u.m2233b(parent, view, this.f1755c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m2078c() {
        m2079c(0);
    }

    /* renamed from: c */
    public void m2079c(int i) {
        ViewParent d = m2065d(i);
        if (d != null) {
            C0565u.m2227a(d, this.f1755c, i);
            m2064a(i, null);
        }
    }

    /* renamed from: a */
    public boolean m2072a(int i, int i2, int i3, int i4, int[] iArr) {
        return m2073a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean m2073a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        C0551j c0551j = this;
        int[] iArr2 = iArr;
        if (m2067a()) {
            ViewParent d = m2065d(i5);
            if (d == null) {
                return false;
            }
            int i6;
            int i7;
            if (i == 0 && i2 == 0 && i3 == 0) {
                if (i4 == 0) {
                    if (iArr2 != null) {
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                    }
                }
            }
            if (iArr2 != null) {
                c0551j.f1755c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i7 = iArr2[1];
            } else {
                i6 = 0;
                i7 = 0;
            }
            C0565u.m2228a(d, c0551j.f1755c, i, i2, i3, i4, i5);
            if (iArr2 != null) {
                c0551j.f1755c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i7;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2074a(int i, int i2, int[] iArr, int[] iArr2) {
        return m2075a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean m2075a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (m2067a()) {
            ViewParent d = m2065d(i3);
            if (d == null) {
                return false;
            }
            int i4;
            int i5;
            boolean z = true;
            if (i == 0) {
                if (i2 == 0) {
                    if (iArr2 != null) {
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                    }
                }
            }
            if (iArr2 != null) {
                this.f1755c.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                if (this.f1757e == null) {
                    this.f1757e = new int[2];
                }
                iArr = this.f1757e;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C0565u.m2229a(d, this.f1755c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f1755c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr[0] == 0) {
                if (iArr[1] == 0) {
                    z = false;
                }
            }
            return z;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2069a(float f, float f2, boolean z) {
        if (m2067a()) {
            ViewParent d = m2065d(0);
            if (d != null) {
                return C0565u.m2231a(d, this.f1755c, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2068a(float f, float f2) {
        if (m2067a()) {
            ViewParent d = m2065d(0);
            if (d != null) {
                return C0565u.m2230a(d, this.f1755c, f, f2);
            }
        }
        return false;
    }

    /* renamed from: d */
    private ViewParent m2065d(int i) {
        switch (i) {
            case 0:
                return this.f1753a;
            case 1:
                return this.f1754b;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private void m2064a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f1753a = viewParent;
                return;
            case 1:
                this.f1754b = viewParent;
                return;
            default:
                return;
        }
    }
}
