package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.p018a.C0532b;
import android.support.v4.view.p018a.C0532b.C0531c;
import android.support.v7.widget.LinearLayoutManager.C0757a;
import android.support.v7.widget.LinearLayoutManager.C0758b;
import android.support.v7.widget.LinearLayoutManager.C0759c;
import android.support.v7.widget.RecyclerView.C0783i;
import android.support.v7.widget.RecyclerView.C0783i.C0781a;
import android.support.v7.widget.RecyclerView.C0790o;
import android.support.v7.widget.RecyclerView.C0795s;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    /* renamed from: a */
    boolean f18581a = null;
    /* renamed from: b */
    int f18582b = -1;
    /* renamed from: c */
    int[] f18583c;
    /* renamed from: d */
    View[] f18584d;
    /* renamed from: e */
    final SparseIntArray f18585e = new SparseIntArray();
    /* renamed from: f */
    final SparseIntArray f18586f = new SparseIntArray();
    /* renamed from: g */
    C0755b f18587g = new C3243a();
    /* renamed from: h */
    final Rect f18588h = new Rect();

    /* renamed from: android.support.v7.widget.GridLayoutManager$b */
    public static abstract class C0755b {
        /* renamed from: a */
        final SparseIntArray f2416a = new SparseIntArray();
        /* renamed from: b */
        private boolean f2417b = false;

        /* renamed from: a */
        public abstract int mo664a(int i);

        /* renamed from: a */
        public void m2898a() {
            this.f2416a.clear();
        }

        /* renamed from: b */
        int m2900b(int i, int i2) {
            if (!this.f2417b) {
                return mo665a(i, i2);
            }
            int i3 = this.f2416a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            i2 = mo665a(i, i2);
            this.f2416a.put(i, i2);
            return i2;
        }

        /* renamed from: a */
        public int mo665a(int i, int i2) {
            int a = mo664a(i);
            if (a == i2) {
                return 0;
            }
            int b;
            int a2;
            int a3;
            if (this.f2417b && this.f2416a.size() > 0) {
                b = m2899b(i);
                if (b >= 0) {
                    a2 = this.f2416a.get(b) + mo664a(b);
                    b++;
                    while (b < i) {
                        a3 = mo664a(b);
                        a2 += a3;
                        if (a2 == i2) {
                            a2 = 0;
                        } else if (a2 > i2) {
                            a2 = a3;
                        }
                        b++;
                    }
                    if (a + a2 > i2) {
                        return a2;
                    }
                    return 0;
                }
            }
            b = 0;
            a2 = 0;
            while (b < i) {
                a3 = mo664a(b);
                a2 += a3;
                if (a2 == i2) {
                    a2 = 0;
                } else if (a2 > i2) {
                    a2 = a3;
                }
                b++;
            }
            if (a + a2 > i2) {
                return 0;
            }
            return a2;
        }

        /* renamed from: b */
        int m2899b(int i) {
            int size = this.f2416a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f2416a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            i2--;
            return (i2 < 0 || i2 >= this.f2416a.size()) ? -1 : this.f2416a.keyAt(i2);
        }

        /* renamed from: c */
        public int m2901c(int i, int i2) {
            int a = mo664a(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int a2 = mo664a(i5);
                i3 += a2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = a2;
                }
            }
            return i3 + a > i2 ? i4 + 1 : i4;
        }
    }

    public static class LayoutParams extends android.support.v7.widget.RecyclerView.LayoutParams {
        /* renamed from: a */
        int f13745a = -1;
        /* renamed from: b */
        int f13746b = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int m16324a() {
            return this.f13745a;
        }

        /* renamed from: b */
        public int m16325b() {
            return this.f13746b;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$a */
    public static final class C3243a extends C0755b {
        /* renamed from: a */
        public int mo664a(int i) {
            return 1;
        }

        /* renamed from: a */
        public int mo665a(int i, int i2) {
            return i % i2;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m24558a(C0783i.m3016a(context, attributeSet, i, i2).f2485b);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        m24558a(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        m24558a(i);
    }

    /* renamed from: a */
    public void mo3857a(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo3857a(false);
    }

    /* renamed from: a */
    public int mo741a(C0790o c0790o, C0795s c0795s) {
        if (this.i == 0) {
            return this.f18582b;
        }
        if (c0795s.m3249e() < 1) {
            return null;
        }
        return m24540a(c0790o, c0795s, c0795s.m3249e() - 1) + 1;
    }

    /* renamed from: b */
    public int mo751b(C0790o c0790o, C0795s c0795s) {
        if (this.i == 1) {
            return this.f18582b;
        }
        if (c0795s.m3249e() < 1) {
            return null;
        }
        return m24540a(c0790o, c0795s, c0795s.m3249e() - 1) + 1;
    }

    /* renamed from: a */
    public void mo745a(C0790o c0790o, C0795s c0795s, View view, C0532b c0532b) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            c0790o = m24540a(c0790o, c0795s, layoutParams2.m2942f());
            boolean z;
            if (this.i == null) {
                c0795s = layoutParams2.m16324a();
                int b = layoutParams2.m16325b();
                z = this.f18582b > 1 && layoutParams2.m16325b() == this.f18582b;
                c0532b.m1966b(C0531c.m1949a(c0795s, b, c0790o, 1, z, false));
            } else {
                int a = layoutParams2.m16324a();
                int b2 = layoutParams2.m16325b();
                z = this.f18582b > 1 && layoutParams2.m16325b() == this.f18582b;
                c0532b.m1966b(C0531c.m1949a(c0790o, 1, a, b2, z, false));
            }
            return;
        }
        super.m3069a(view, c0532b);
    }

    /* renamed from: c */
    public void mo681c(C0790o c0790o, C0795s c0795s) {
        if (c0795s.m3245a()) {
            m24537N();
        }
        super.mo681c(c0790o, c0795s);
        m24536M();
    }

    /* renamed from: a */
    public void mo672a(C0795s c0795s) {
        super.mo672a(c0795s);
        this.f18581a = null;
    }

    /* renamed from: M */
    private void m24536M() {
        this.f18585e.clear();
        this.f18586f.clear();
    }

    /* renamed from: N */
    private void m24537N() {
        int w = m3154w();
        for (int i = 0; i < w; i++) {
            LayoutParams layoutParams = (LayoutParams) m3137j(i).getLayoutParams();
            int f = layoutParams.m2942f();
            this.f18585e.put(f, layoutParams.m16325b());
            this.f18586f.put(f, layoutParams.m16324a());
        }
    }

    /* renamed from: a */
    public void mo747a(RecyclerView recyclerView, int i, int i2) {
        this.f18587g.m2898a();
    }

    /* renamed from: a */
    public void mo746a(RecyclerView recyclerView) {
        this.f18587g.m2898a();
    }

    /* renamed from: b */
    public void mo752b(RecyclerView recyclerView, int i, int i2) {
        this.f18587g.m2898a();
    }

    /* renamed from: a */
    public void mo749a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f18587g.m2898a();
    }

    /* renamed from: a */
    public void mo748a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f18587g.m2898a();
    }

    /* renamed from: a */
    public android.support.v7.widget.RecyclerView.LayoutParams mo667a() {
        if (this.i == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: a */
    public android.support.v7.widget.RecyclerView.LayoutParams mo742a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    public android.support.v7.widget.RecyclerView.LayoutParams mo743a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    public boolean mo750a(android.support.v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: O */
    private void m24538O() {
        int z;
        if (m16398g() == 1) {
            z = (m3157z() - m3028D()) - m3026B();
        } else {
            z = (m3025A() - m3029E()) - m3027C();
        }
        m24549n(z);
    }

    /* renamed from: a */
    public void mo744a(Rect rect, int i, int i2) {
        if (this.f18583c == null) {
            super.mo744a(rect, i, i2);
        }
        int B = m3026B() + m3028D();
        int C = m3027C() + m3029E();
        if (this.i == 1) {
            rect = C0783i.m3014a(i2, (int) rect.height() + C, m3033I());
            i = C0783i.m3014a(i, this.f18583c[this.f18583c.length - 1] + B, m3032H());
        } else {
            i = C0783i.m3014a(i, (int) rect.width() + B, m3032H());
            rect = C0783i.m3014a(i2, (int) this.f18583c[this.f18583c.length - 1] + C, m3033I());
        }
        m3130g(i, rect);
    }

    /* renamed from: n */
    private void m24549n(int i) {
        this.f18583c = m24545a(this.f18583c, this.f18582b, i);
    }

    /* renamed from: a */
    static int[] m24545a(int[] iArr, int i, int i2) {
        int i3 = 1;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        i2 %= i;
        int i6 = 0;
        while (i3 <= i) {
            int i7;
            i4 += i2;
            if (i4 <= 0 || i - i4 >= i2) {
                i7 = i5;
            } else {
                i7 = i5 + 1;
                i4 -= i;
            }
            i6 += i7;
            iArr[i3] = i6;
            i3++;
        }
        return iArr;
    }

    /* renamed from: a */
    int mo3852a(int i, int i2) {
        if (this.i == 1 && m16402h()) {
            return this.f18583c[this.f18582b - i] - this.f18583c[(this.f18582b - i) - i2];
        }
        return this.f18583c[i2 + i] - this.f18583c[i];
    }

    /* renamed from: a */
    void mo3854a(C0790o c0790o, C0795s c0795s, C0757a c0757a, int i) {
        super.mo3854a(c0790o, c0795s, c0757a, i);
        m24538O();
        if (c0795s.m3249e() > 0 && !c0795s.m3245a()) {
            m24547b(c0790o, c0795s, c0757a, i);
        }
        m24539P();
    }

    /* renamed from: P */
    private void m24539P() {
        if (this.f18584d == null || this.f18584d.length != this.f18582b) {
            this.f18584d = new View[this.f18582b];
        }
    }

    /* renamed from: a */
    public int mo666a(int i, C0790o c0790o, C0795s c0795s) {
        m24538O();
        m24539P();
        return super.mo666a(i, c0790o, c0795s);
    }

    /* renamed from: b */
    public int mo677b(int i, C0790o c0790o, C0795s c0795s) {
        m24538O();
        m24539P();
        return super.mo677b(i, c0790o, c0795s);
    }

    /* renamed from: b */
    private void m24547b(C0790o c0790o, C0795s c0795s, C0757a c0757a, int i) {
        i = i == 1 ? 1 : 0;
        int b = m24546b(c0790o, c0795s, c0757a.f2439b);
        if (i != 0) {
            while (b > 0 && c0757a.f2439b > 0) {
                c0757a.f2439b--;
                b = m24546b(c0790o, c0795s, c0757a.f2439b);
            }
            return;
        }
        i = c0795s.m3249e() - 1;
        int i2 = c0757a.f2439b;
        while (i2 < i) {
            int i3 = i2 + 1;
            int b2 = m24546b(c0790o, c0795s, i3);
            if (b2 <= b) {
                break;
            }
            i2 = i3;
            b = b2;
        }
        c0757a.f2439b = i2;
    }

    /* renamed from: a */
    View mo3853a(C0790o c0790o, C0795s c0795s, int i, int i2, int i3) {
        m16403i();
        int c = this.j.mo770c();
        int d = this.j.mo772d();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View j = m3137j(i);
            int d2 = m3110d(j);
            if (d2 >= 0 && d2 < i3) {
                if (m24546b(c0790o, c0795s, d2) == 0) {
                    if (!((android.support.v7.widget.RecyclerView.LayoutParams) j.getLayoutParams()).m2940d()) {
                        if (this.j.mo767a(j) < d) {
                            if (this.j.mo769b(j) >= c) {
                                return j;
                            }
                        }
                        if (view == null) {
                            view = j;
                        }
                    } else if (view2 == null) {
                        view2 = j;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* renamed from: a */
    private int m24540a(C0790o c0790o, C0795s c0795s, int i) {
        if (c0795s.m3245a() == null) {
            return this.f18587g.m2901c(i, this.f18582b);
        }
        c0790o = c0790o.m3195b(i);
        if (c0790o != -1) {
            return this.f18587g.m2901c(c0790o, this.f18582b);
        }
        c0795s = new StringBuilder();
        c0795s.append("Cannot find span size for pre layout position. ");
        c0795s.append(i);
        Log.w("GridLayoutManager", c0795s.toString());
        return null;
    }

    /* renamed from: b */
    private int m24546b(C0790o c0790o, C0795s c0795s, int i) {
        if (c0795s.m3245a() == null) {
            return this.f18587g.m2900b(i, this.f18582b);
        }
        c0795s = this.f18586f.get(i, -1);
        if (c0795s != -1) {
            return c0795s;
        }
        c0790o = c0790o.m3195b(i);
        if (c0790o != -1) {
            return this.f18587g.m2900b(c0790o, this.f18582b);
        }
        c0795s = new StringBuilder();
        c0795s.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        c0795s.append(i);
        Log.w("GridLayoutManager", c0795s.toString());
        return null;
    }

    /* renamed from: c */
    private int m24548c(C0790o c0790o, C0795s c0795s, int i) {
        if (c0795s.m3245a() == null) {
            return this.f18587g.mo664a(i);
        }
        c0795s = this.f18585e.get(i, -1);
        if (c0795s != -1) {
            return c0795s;
        }
        c0790o = c0790o.m3195b(i);
        if (c0790o != -1) {
            return this.f18587g.mo664a(c0790o);
        }
        c0795s = new StringBuilder();
        c0795s.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        c0795s.append(i);
        Log.w("GridLayoutManager", c0795s.toString());
        return 1;
    }

    /* renamed from: a */
    void mo3856a(C0795s c0795s, C0759c c0759c, C0781a c0781a) {
        int i = this.f18582b;
        for (int i2 = 0; i2 < this.f18582b && c0759c.m2937a(c0795s) && i > 0; i2++) {
            int i3 = c0759c.f2450d;
            c0781a.mo762b(i3, Math.max(0, c0759c.f2453g));
            i -= this.f18587g.mo664a(i3);
            c0759c.f2450d += c0759c.f2451e;
        }
    }

    /* renamed from: a */
    void mo3855a(C0790o c0790o, C0795s c0795s, C0759c c0759c, C0758b c0758b) {
        C0790o c0790o2 = c0790o;
        C0795s c0795s2 = c0795s;
        C0759c c0759c2 = c0759c;
        C0758b c0758b2 = c0758b;
        int i = this.j.mo780i();
        Object obj = i != 1073741824 ? 1 : null;
        int i2 = m3154w() > 0 ? r6.f18583c[r6.f18582b] : 0;
        if (obj != null) {
            m24538O();
        }
        boolean z = c0759c2.f2451e == 1;
        int i3 = r6.f18582b;
        if (!z) {
            i3 = m24546b(c0790o2, c0795s2, c0759c2.f2450d) + m24548c(c0790o2, c0795s2, c0759c2.f2450d);
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < r6.f18582b && c0759c2.m2937a(c0795s2) && i3 > 0) {
            int i6 = c0759c2.f2450d;
            int c = m24548c(c0790o2, c0795s2, i6);
            if (c <= r6.f18582b) {
                i3 -= c;
                if (i3 < 0) {
                    break;
                }
                View a = c0759c2.m2934a(c0790o2);
                if (a == null) {
                    break;
                }
                i4 += c;
                r6.f18584d[i5] = a;
                i5++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Item at position ");
                stringBuilder.append(i6);
                stringBuilder.append(" requires ");
                stringBuilder.append(c);
                stringBuilder.append(" spans but GridLayoutManager has only ");
                stringBuilder.append(r6.f18582b);
                stringBuilder.append(" spans.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i5 == 0) {
            c0758b2.f2444b = true;
            return;
        }
        int e;
        float f = 0.0f;
        int i7 = i5;
        m24542a(c0790o, c0795s, i5, i4, z);
        int i8 = 0;
        for (i3 = 0; i3 < i7; i3++) {
            boolean z2;
            View view = r6.f18584d[i3];
            if (c0759c2.f2457k != null) {
                z2 = false;
                if (z) {
                    m3063a(view);
                } else {
                    m3064a(view, 0);
                }
            } else if (z) {
                m3093b(view);
                z2 = false;
            } else {
                z2 = false;
                m3094b(view, 0);
            }
            m3095b(view, r6.f18588h);
            m24544a(view, i, z2);
            i6 = r6.j.mo775e(view);
            if (i6 > i8) {
                i8 = i6;
            }
            float f2 = (((float) r6.j.mo777f(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).f13746b);
            if (f2 > f) {
                f = f2;
            }
        }
        if (obj != null) {
            m24541a(f, i2);
            i8 = 0;
            for (i3 = 0; i3 < i7; i3++) {
                view = r6.f18584d[i3];
                m24544a(view, 1073741824, true);
                e = r6.j.mo775e(view);
                if (e > i8) {
                    i8 = e;
                }
            }
        }
        for (i3 = 0; i3 < i7; i3++) {
            view = r6.f18584d[i3];
            if (r6.j.mo775e(view) != i8) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                Rect rect = layoutParams.d;
                i5 = ((rect.top + rect.bottom) + layoutParams.topMargin) + layoutParams.bottomMargin;
                i = ((rect.left + rect.right) + layoutParams.leftMargin) + layoutParams.rightMargin;
                i4 = mo3852a(layoutParams.f13745a, layoutParams.f13746b);
                if (r6.i == 1) {
                    i6 = C0783i.m3015a(i4, 1073741824, i, layoutParams.width, false);
                    i4 = MeasureSpec.makeMeasureSpec(i8 - i5, 1073741824);
                } else {
                    i = MeasureSpec.makeMeasureSpec(i8 - i, 1073741824);
                    i4 = C0783i.m3015a(i4, 1073741824, i5, layoutParams.height, false);
                    i6 = i;
                }
                m24543a(view, i6, i4, true);
            }
        }
        c = 0;
        c0758b2.f2443a = i8;
        if (r6.i == 1) {
            if (c0759c2.f2452f == -1) {
                i3 = c0759c2.f2448b;
                i6 = i3;
                e = i3 - i8;
            } else {
                i3 = c0759c2.f2448b;
                e = i3;
                i6 = i8 + i3;
            }
            i3 = 0;
            i8 = 0;
        } else if (c0759c2.f2452f == -1) {
            i3 = c0759c2.f2448b;
            e = 0;
            i6 = 0;
            int i9 = i3 - i8;
            i8 = i3;
            i3 = i9;
        } else {
            i3 = c0759c2.f2448b;
            i8 += i3;
            e = 0;
            i6 = 0;
        }
        while (c < i7) {
            int i10;
            int f3;
            int i11;
            View view2 = r6.f18584d[c];
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (r6.i != 1) {
                e = m3027C() + r6.f18583c[layoutParams2.f13745a];
                i6 = r6.j.mo777f(view2) + e;
            } else if (m16402h()) {
                i3 = m3026B() + r6.f18583c[r6.f18582b - layoutParams2.f13745a];
                i10 = i3;
                f3 = i3 - r6.j.mo777f(view2);
                i2 = e;
                i11 = i6;
                m3066a(view2, f3, i2, i10, i11);
                if (!layoutParams2.m2940d() || layoutParams2.m2941e()) {
                    c0758b2.f2445c = true;
                }
                c0758b2.f2446d |= view2.hasFocusable();
                c++;
                i3 = f3;
                e = i2;
                i8 = i10;
                i6 = i11;
            } else {
                i3 = m3026B() + r6.f18583c[layoutParams2.f13745a];
                i8 = r6.j.mo777f(view2) + i3;
            }
            f3 = i3;
            i10 = i8;
            i2 = e;
            i11 = i6;
            m3066a(view2, f3, i2, i10, i11);
            if (layoutParams2.m2940d()) {
            }
            c0758b2.f2445c = true;
            c0758b2.f2446d |= view2.hasFocusable();
            c++;
            i3 = f3;
            e = i2;
            i8 = i10;
            i6 = i11;
        }
        Arrays.fill(r6.f18584d, null);
    }

    /* renamed from: a */
    private void m24544a(View view, int i, boolean z) {
        int a;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.d;
        int i2 = ((rect.top + rect.bottom) + layoutParams.topMargin) + layoutParams.bottomMargin;
        int i3 = ((rect.left + rect.right) + layoutParams.leftMargin) + layoutParams.rightMargin;
        int a2 = mo3852a(layoutParams.f13745a, layoutParams.f13746b);
        if (this.i == 1) {
            i = C0783i.m3015a(a2, i, i3, layoutParams.width, false);
            a = C0783i.m3015a(this.j.mo776f(), m3156y(), i2, layoutParams.height, true);
        } else {
            i = C0783i.m3015a(a2, i, i2, layoutParams.height, false);
            int a3 = C0783i.m3015a(this.j.mo776f(), m3155x(), i3, layoutParams.width, true);
            a = i;
            i = a3;
        }
        m24543a(view, i, a, z);
    }

    /* renamed from: a */
    private void m24541a(float f, int i) {
        m24549n(Math.max(Math.round(f * ((float) this.f18582b)), i));
    }

    /* renamed from: a */
    private void m24543a(View view, int i, int i2, boolean z) {
        android.support.v7.widget.RecyclerView.LayoutParams layoutParams = (android.support.v7.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z = m3083a(view, i, i2, layoutParams);
        } else {
            z = m3097b(view, i, i2, layoutParams);
        }
        if (z) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m24542a(C0790o c0790o, C0795s c0795s, int i, int i2, boolean z) {
        i2 = -1;
        int i3 = 0;
        if (z) {
            i2 = i;
            i = 0;
            z = true;
        } else {
            i--;
            z = true;
        }
        while (i != i2) {
            View view = this.f18584d[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f13746b = m24548c(c0790o, c0795s, m3110d(view));
            layoutParams.f13745a = i3;
            i3 += layoutParams.f13746b;
            i += z;
        }
    }

    /* renamed from: a */
    public void m24558a(int i) {
        if (i != this.f18582b) {
            this.f18581a = true;
            if (i >= 1) {
                this.f18582b = i;
                this.f18587g.m2898a();
                m3147p();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Span count should be at least 1. Provided ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public View mo668a(View view, int i, C0790o c0790o, C0795s c0795s) {
        GridLayoutManager gridLayoutManager = this;
        C0790o c0790o2 = c0790o;
        C0795s c0795s2 = c0795s;
        View e = m3117e(view);
        View view2 = null;
        if (e == null) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) e.getLayoutParams();
        int i2 = layoutParams.f13745a;
        int i3 = layoutParams.f13745a + layoutParams.f13746b;
        if (super.mo668a(view, i, c0790o, c0795s) == null) {
            return null;
        }
        int w;
        int i4;
        int i5;
        View view3;
        if (((m16399g(i) == 1) != gridLayoutManager.k ? 1 : null) != null) {
            w = m3154w() - 1;
            i4 = -1;
            i5 = -1;
        } else {
            i4 = m3154w();
            w = 0;
            i5 = 1;
        }
        boolean z = gridLayoutManager.i == 1 && m16402h();
        int a = m24540a(c0790o2, c0795s2, w);
        View view4 = null;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1;
        while (w != i4) {
            int a2 = m24540a(c0790o2, c0795s2, w);
            View j = m3137j(w);
            if (j == e) {
                break;
            }
            View view5;
            int i10;
            int i11;
            if (!j.hasFocusable() || a2 == a) {
                LayoutParams layoutParams2 = (LayoutParams) j.getLayoutParams();
                int i12 = layoutParams2.f13745a;
                view5 = e;
                i10 = i4;
                int i13 = layoutParams2.f13745a + layoutParams2.f13746b;
                if (j.hasFocusable() && i12 == i2 && i13 == i3) {
                    return j;
                }
                Object obj;
                if (!(j.hasFocusable() && view2 == null) && (j.hasFocusable() || view4 != null)) {
                    i4 = Math.min(i13, i3) - Math.max(i12, i2);
                    if (j.hasFocusable()) {
                        if (i4 <= i7) {
                            if (i4 == i7) {
                                if (z == (i12 > i6)) {
                                }
                            }
                        }
                    } else if (view2 == null) {
                        i11 = i6;
                        view3 = view4;
                        boolean z2 = false;
                        if (m3085a(j, false, true)) {
                            i6 = i8;
                            if (i4 > i6) {
                                i4 = i9;
                                obj = 1;
                                if (obj != null) {
                                    if (j.hasFocusable()) {
                                        i7 = Math.min(i13, i3) - Math.max(i12, i2);
                                        i8 = i6;
                                        i9 = i4;
                                        view4 = view3;
                                        i6 = layoutParams2.f13745a;
                                        view2 = j;
                                    } else {
                                        view4 = j;
                                        i8 = Math.min(i13, i3) - Math.max(i12, i2);
                                        i9 = layoutParams2.f13745a;
                                        i6 = i11;
                                    }
                                    w += i5;
                                    e = view5;
                                    i4 = i10;
                                    c0790o2 = c0790o;
                                    c0795s2 = c0795s;
                                }
                            } else {
                                if (i4 == i6) {
                                    i4 = i9;
                                    if (i12 > i4) {
                                        z2 = true;
                                    }
                                    if (z == z2) {
                                        obj = 1;
                                        if (obj != null) {
                                            if (j.hasFocusable()) {
                                                view4 = j;
                                                i8 = Math.min(i13, i3) - Math.max(i12, i2);
                                                i9 = layoutParams2.f13745a;
                                                i6 = i11;
                                            } else {
                                                i7 = Math.min(i13, i3) - Math.max(i12, i2);
                                                i8 = i6;
                                                i9 = i4;
                                                view4 = view3;
                                                i6 = layoutParams2.f13745a;
                                                view2 = j;
                                            }
                                            w += i5;
                                            e = view5;
                                            i4 = i10;
                                            c0790o2 = c0790o;
                                            c0795s2 = c0795s;
                                        }
                                    }
                                    obj = null;
                                    if (obj != null) {
                                        if (j.hasFocusable()) {
                                            i7 = Math.min(i13, i3) - Math.max(i12, i2);
                                            i8 = i6;
                                            i9 = i4;
                                            view4 = view3;
                                            i6 = layoutParams2.f13745a;
                                            view2 = j;
                                        } else {
                                            view4 = j;
                                            i8 = Math.min(i13, i3) - Math.max(i12, i2);
                                            i9 = layoutParams2.f13745a;
                                            i6 = i11;
                                        }
                                        w += i5;
                                        e = view5;
                                        i4 = i10;
                                        c0790o2 = c0790o;
                                        c0795s2 = c0795s;
                                    }
                                }
                                i4 = i9;
                                obj = null;
                                if (obj != null) {
                                    if (j.hasFocusable()) {
                                        view4 = j;
                                        i8 = Math.min(i13, i3) - Math.max(i12, i2);
                                        i9 = layoutParams2.f13745a;
                                        i6 = i11;
                                    } else {
                                        i7 = Math.min(i13, i3) - Math.max(i12, i2);
                                        i8 = i6;
                                        i9 = i4;
                                        view4 = view3;
                                        i6 = layoutParams2.f13745a;
                                        view2 = j;
                                    }
                                    w += i5;
                                    e = view5;
                                    i4 = i10;
                                    c0790o2 = c0790o;
                                    c0795s2 = c0795s;
                                }
                            }
                        }
                        i6 = i8;
                        i4 = i9;
                        obj = null;
                        if (obj != null) {
                            if (j.hasFocusable()) {
                                i7 = Math.min(i13, i3) - Math.max(i12, i2);
                                i8 = i6;
                                i9 = i4;
                                view4 = view3;
                                i6 = layoutParams2.f13745a;
                                view2 = j;
                            } else {
                                view4 = j;
                                i8 = Math.min(i13, i3) - Math.max(i12, i2);
                                i9 = layoutParams2.f13745a;
                                i6 = i11;
                            }
                            w += i5;
                            e = view5;
                            i4 = i10;
                            c0790o2 = c0790o;
                            c0795s2 = c0795s;
                        }
                    }
                    i11 = i6;
                    view3 = view4;
                    i6 = i8;
                    i4 = i9;
                    obj = null;
                    if (obj != null) {
                        if (j.hasFocusable()) {
                            view4 = j;
                            i8 = Math.min(i13, i3) - Math.max(i12, i2);
                            i9 = layoutParams2.f13745a;
                            i6 = i11;
                        } else {
                            i7 = Math.min(i13, i3) - Math.max(i12, i2);
                            i8 = i6;
                            i9 = i4;
                            view4 = view3;
                            i6 = layoutParams2.f13745a;
                            view2 = j;
                        }
                        w += i5;
                        e = view5;
                        i4 = i10;
                        c0790o2 = c0790o;
                        c0795s2 = c0795s;
                    }
                }
                i11 = i6;
                view3 = view4;
                i6 = i8;
                i4 = i9;
                obj = 1;
                if (obj != null) {
                    if (j.hasFocusable()) {
                        i7 = Math.min(i13, i3) - Math.max(i12, i2);
                        i8 = i6;
                        i9 = i4;
                        view4 = view3;
                        i6 = layoutParams2.f13745a;
                        view2 = j;
                    } else {
                        view4 = j;
                        i8 = Math.min(i13, i3) - Math.max(i12, i2);
                        i9 = layoutParams2.f13745a;
                        i6 = i11;
                    }
                    w += i5;
                    e = view5;
                    i4 = i10;
                    c0790o2 = c0790o;
                    c0795s2 = c0795s;
                }
            } else if (view2 != null) {
                break;
            } else {
                view5 = e;
                i11 = i6;
                view3 = view4;
                i10 = i4;
                i6 = i8;
                i4 = i9;
            }
            i8 = i6;
            i9 = i4;
            i6 = i11;
            view4 = view3;
            w += i5;
            e = view5;
            i4 = i10;
            c0790o2 = c0790o;
            c0795s2 = c0795s;
        }
        view3 = view4;
        if (view2 == null) {
            view2 = view3;
        }
        return view2;
    }

    /* renamed from: b */
    public boolean mo678b() {
        return this.n == null && !this.f18581a;
    }
}
