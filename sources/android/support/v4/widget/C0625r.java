package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.C0560r;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.r */
public class C0625r {
    /* renamed from: v */
    private static final Interpolator f1972v = new C06221();
    /* renamed from: a */
    private int f1973a;
    /* renamed from: b */
    private int f1974b;
    /* renamed from: c */
    private int f1975c = -1;
    /* renamed from: d */
    private float[] f1976d;
    /* renamed from: e */
    private float[] f1977e;
    /* renamed from: f */
    private float[] f1978f;
    /* renamed from: g */
    private float[] f1979g;
    /* renamed from: h */
    private int[] f1980h;
    /* renamed from: i */
    private int[] f1981i;
    /* renamed from: j */
    private int[] f1982j;
    /* renamed from: k */
    private int f1983k;
    /* renamed from: l */
    private VelocityTracker f1984l;
    /* renamed from: m */
    private float f1985m;
    /* renamed from: n */
    private float f1986n;
    /* renamed from: o */
    private int f1987o;
    /* renamed from: p */
    private int f1988p;
    /* renamed from: q */
    private OverScroller f1989q;
    /* renamed from: r */
    private final C0624a f1990r;
    /* renamed from: s */
    private View f1991s;
    /* renamed from: t */
    private boolean f1992t;
    /* renamed from: u */
    private final ViewGroup f1993u;
    /* renamed from: w */
    private final Runnable f1994w = new C06232(this);

    /* renamed from: android.support.v4.widget.r$1 */
    static class C06221 implements Interpolator {
        public float getInterpolation(float f) {
            f -= 1.0f;
            return ((((f * f) * f) * f) * f) + 1.0f;
        }

        C06221() {
        }
    }

    /* renamed from: android.support.v4.widget.r$2 */
    class C06232 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0625r f1971a;

        C06232(C0625r c0625r) {
            this.f1971a = c0625r;
        }

        public void run() {
            this.f1971a.m2526c(0);
        }
    }

    /* renamed from: android.support.v4.widget.r$a */
    public static abstract class C0624a {
        /* renamed from: a */
        public int mo103a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo104a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo105a(int i) {
        }

        /* renamed from: a */
        public void mo457a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo106a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo107a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public abstract boolean mo108a(View view, int i);

        /* renamed from: b */
        public int mo134b(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo109b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo458b(int i, int i2) {
        }

        /* renamed from: b */
        public void mo135b(View view, int i) {
        }

        /* renamed from: b */
        public boolean mo459b(int i) {
            return false;
        }

        /* renamed from: c */
        public int m2489c(int i) {
            return i;
        }
    }

    /* renamed from: a */
    public static C0625r m2494a(ViewGroup viewGroup, C0624a c0624a) {
        return new C0625r(viewGroup.getContext(), viewGroup, c0624a);
    }

    /* renamed from: a */
    public static C0625r m2493a(ViewGroup viewGroup, float f, C0624a c0624a) {
        viewGroup = C0625r.m2494a(viewGroup, c0624a);
        viewGroup.f1974b = (int) (((float) viewGroup.f1974b) * (1.0f / f));
        return viewGroup;
    }

    private C0625r(Context context, ViewGroup viewGroup, C0624a c0624a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (c0624a != null) {
            this.f1993u = viewGroup;
            this.f1990r = c0624a;
            viewGroup = ViewConfiguration.get(context);
            this.f1987o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f1974b = viewGroup.getScaledTouchSlop();
            this.f1985m = (float) viewGroup.getScaledMaximumFlingVelocity();
            this.f1986n = (float) viewGroup.getScaledMinimumFlingVelocity();
            this.f1989q = new OverScroller(context, f1972v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    public void m2512a(float f) {
        this.f1986n = f;
    }

    /* renamed from: a */
    public int m2511a() {
        return this.f1973a;
    }

    /* renamed from: a */
    public void m2513a(int i) {
        this.f1988p = i;
    }

    /* renamed from: b */
    public int m2519b() {
        return this.f1987o;
    }

    /* renamed from: a */
    public void m2514a(View view, int i) {
        if (view.getParent() == this.f1993u) {
            this.f1991s = view;
            this.f1975c = i;
            this.f1990r.mo135b(view, i);
            m2526c(1);
            return;
        }
        i = new StringBuilder();
        i.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        i.append(this.f1993u);
        i.append(")");
        throw new IllegalArgumentException(i.toString());
    }

    /* renamed from: c */
    public View m2525c() {
        return this.f1991s;
    }

    /* renamed from: d */
    public int m2528d() {
        return this.f1974b;
    }

    /* renamed from: e */
    public void m2531e() {
        this.f1975c = -1;
        m2508g();
        if (this.f1984l != null) {
            this.f1984l.recycle();
            this.f1984l = null;
        }
    }

    /* renamed from: f */
    public void m2532f() {
        m2531e();
        if (this.f1973a == 2) {
            int currX = this.f1989q.getCurrX();
            int currY = this.f1989q.getCurrY();
            this.f1989q.abortAnimation();
            int currX2 = this.f1989q.getCurrX();
            int currY2 = this.f1989q.getCurrY();
            this.f1990r.mo107a(this.f1991s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m2526c(0);
    }

    /* renamed from: a */
    public boolean m2517a(View view, int i, int i2) {
        this.f1991s = view;
        this.f1975c = -1;
        view = m2498a(i, i2, 0, 0);
        if (view == null && this.f1973a == 0 && this.f1991s != 0) {
            this.f1991s = 0;
        }
        return view;
    }

    /* renamed from: a */
    public boolean m2515a(int i, int i2) {
        if (this.f1992t) {
            return m2498a(i, i2, (int) this.f1984l.getXVelocity(this.f1975c), (int) this.f1984l.getYVelocity(this.f1975c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    private boolean m2498a(int i, int i2, int i3, int i4) {
        int left = this.f1991s.getLeft();
        int top = this.f1991s.getTop();
        i -= left;
        i2 -= top;
        if (i == 0 && i2 == 0) {
            this.f1989q.abortAnimation();
            m2526c(0);
            return false;
        }
        this.f1989q.startScroll(left, top, i, i2, m2492a(this.f1991s, i, i2, i3, i4));
        m2526c(2);
        return true;
    }

    /* renamed from: a */
    private int m2492a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        i3 = m2501b(i3, (int) this.f1986n, (int) this.f1985m);
        i4 = m2501b(i4, (int) this.f1986n, (int) this.f1985m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(i3);
        int abs4 = Math.abs(i4);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (i3 != 0) {
            f = (float) abs3;
            f2 = (float) i5;
        } else {
            f = (float) abs;
            f2 = (float) i6;
        }
        f /= f2;
        if (i4 != 0) {
            f3 = (float) abs4;
            f2 = (float) i5;
        } else {
            f3 = (float) abs2;
            f2 = (float) i6;
        }
        f3 /= f2;
        return (int) ((((float) m2491a(i, i3, this.f1990r.mo134b(view))) * f) + (((float) m2491a(i2, i4, this.f1990r.mo103a(view))) * f3));
    }

    /* renamed from: a */
    private int m2491a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f1993u.getWidth();
        float f = (float) (width / 2);
        f += m2500b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f;
        i2 = Math.abs(i2);
        if (i2 > 0) {
            i = Math.round(Math.abs(f / ((float) i2)) * 1148846080) * 4;
        } else {
            i = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1065353216) * 1132462080);
        }
        return Math.min(i, 600);
    }

    /* renamed from: b */
    private int m2501b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    /* renamed from: a */
    private float m2490a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    /* renamed from: b */
    private float m2500b(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: a */
    public boolean m2518a(boolean z) {
        if (this.f1973a == 2) {
            boolean computeScrollOffset = this.f1989q.computeScrollOffset();
            int currX = this.f1989q.getCurrX();
            int currY = this.f1989q.getCurrY();
            int left = currX - this.f1991s.getLeft();
            int top = currY - this.f1991s.getTop();
            if (left != 0) {
                C0560r.m2192d(this.f1991s, left);
            }
            if (top != 0) {
                C0560r.m2190c(this.f1991s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f1990r.mo107a(this.f1991s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f1989q.getFinalX() && currY == this.f1989q.getFinalY()) {
                this.f1989q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f1993u.post(this.f1994w);
                } else {
                    m2526c(0);
                }
            }
        }
        if (this.f1973a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m2495a(float f, float f2) {
        this.f1992t = true;
        this.f1990r.mo106a(this.f1991s, f, f2);
        this.f1992t = false;
        if (this.f1973a == Float.MIN_VALUE) {
            m2526c(0);
        }
    }

    /* renamed from: g */
    private void m2508g() {
        if (this.f1976d != null) {
            Arrays.fill(this.f1976d, 0.0f);
            Arrays.fill(this.f1977e, 0.0f);
            Arrays.fill(this.f1978f, 0.0f);
            Arrays.fill(this.f1979g, 0.0f);
            Arrays.fill(this.f1980h, 0);
            Arrays.fill(this.f1981i, 0);
            Arrays.fill(this.f1982j, 0);
            this.f1983k = 0;
        }
    }

    /* renamed from: e */
    private void m2506e(int i) {
        if (this.f1976d != null) {
            if (m2521b(i)) {
                this.f1976d[i] = 0.0f;
                this.f1977e[i] = 0.0f;
                this.f1978f[i] = 0.0f;
                this.f1979g[i] = 0.0f;
                this.f1980h[i] = 0;
                this.f1981i[i] = 0;
                this.f1982j[i] = 0;
                this.f1983k = ((1 << i) ^ -1) & this.f1983k;
            }
        }
    }

    /* renamed from: f */
    private void m2507f(int i) {
        if (this.f1976d == null || this.f1976d.length <= i) {
            i++;
            Object obj = new float[i];
            Object obj2 = new float[i];
            Object obj3 = new float[i];
            Object obj4 = new float[i];
            Object obj5 = new int[i];
            Object obj6 = new int[i];
            i = new int[i];
            if (this.f1976d != null) {
                System.arraycopy(this.f1976d, 0, obj, 0, this.f1976d.length);
                System.arraycopy(this.f1977e, 0, obj2, 0, this.f1977e.length);
                System.arraycopy(this.f1978f, 0, obj3, 0, this.f1978f.length);
                System.arraycopy(this.f1979g, 0, obj4, 0, this.f1979g.length);
                System.arraycopy(this.f1980h, 0, obj5, 0, this.f1980h.length);
                System.arraycopy(this.f1981i, 0, obj6, 0, this.f1981i.length);
                System.arraycopy(this.f1982j, 0, i, 0, this.f1982j.length);
            }
            this.f1976d = obj;
            this.f1977e = obj2;
            this.f1978f = obj3;
            this.f1979g = obj4;
            this.f1980h = obj5;
            this.f1981i = obj6;
            this.f1982j = i;
        }
    }

    /* renamed from: a */
    private void m2496a(float f, float f2, int i) {
        m2507f(i);
        float[] fArr = this.f1976d;
        this.f1978f[i] = f;
        fArr[i] = f;
        fArr = this.f1977e;
        this.f1979g[i] = f2;
        fArr[i] = f2;
        this.f1980h[i] = m2505e((int) f, (int) f2);
        this.f1983k |= Float.MIN_VALUE << i;
    }

    /* renamed from: c */
    private void m2504c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2509g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1978f[pointerId] = x;
                this.f1979g[pointerId] = y;
            }
        }
    }

    /* renamed from: b */
    public boolean m2521b(int i) {
        return ((1 << i) & this.f1983k) != 0;
    }

    /* renamed from: c */
    void m2526c(int i) {
        this.f1993u.removeCallbacks(this.f1994w);
        if (this.f1973a != i) {
            this.f1973a = i;
            this.f1990r.mo105a(i);
            if (this.f1973a == 0) {
                this.f1991s = 0;
            }
        }
    }

    /* renamed from: b */
    boolean m2523b(View view, int i) {
        if (view == this.f1991s && this.f1975c == i) {
            return true;
        }
        if (view == null || !this.f1990r.mo108a(view, i)) {
            return null;
        }
        this.f1975c = i;
        m2514a(view, i);
        return true;
    }

    /* renamed from: a */
    public boolean m2516a(MotionEvent motionEvent) {
        boolean z;
        C0625r c0625r = this;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2531e();
        }
        if (c0625r.f1984l == null) {
            c0625r.f1984l = VelocityTracker.obtain();
        }
        c0625r.f1984l.addMovement(motionEvent2);
        int pointerId;
        float x;
        switch (actionMasked) {
            case 0:
                float x2 = motionEvent.getX();
                float y = motionEvent.getY();
                z = false;
                pointerId = motionEvent2.getPointerId(0);
                m2496a(x2, y, pointerId);
                View d = m2529d((int) x2, (int) y);
                if (d == c0625r.f1991s && c0625r.f1973a == 2) {
                    m2523b(d, pointerId);
                }
                actionMasked = c0625r.f1980h[pointerId];
                if ((c0625r.f1988p & actionMasked) != 0) {
                    c0625r.f1990r.mo457a(actionMasked & c0625r.f1988p, pointerId);
                    break;
                }
                break;
            case 1:
            case 3:
                m2531e();
                break;
            case 2:
                if (c0625r.f1976d != null) {
                    if (c0625r.f1977e == null) {
                        break;
                    }
                    actionMasked = motionEvent.getPointerCount();
                    for (actionIndex = 0; actionIndex < actionMasked; actionIndex++) {
                        int pointerId2 = motionEvent2.getPointerId(actionIndex);
                        if (m2509g(pointerId2)) {
                            x = motionEvent2.getX(actionIndex);
                            float y2 = motionEvent2.getY(actionIndex);
                            float f = x - c0625r.f1976d[pointerId2];
                            float f2 = y2 - c0625r.f1977e[pointerId2];
                            View d2 = m2529d((int) x, (int) y2);
                            Object obj = (d2 == null || !m2499a(d2, f, f2)) ? null : 1;
                            if (obj != null) {
                                int left = d2.getLeft();
                                int i = (int) f;
                                i = c0625r.f1990r.mo109b(d2, left + i, i);
                                int top = d2.getTop();
                                int i2 = (int) f2;
                                int a = c0625r.f1990r.mo104a(d2, top + i2, i2);
                                i2 = c0625r.f1990r.mo134b(d2);
                                int a2 = c0625r.f1990r.mo103a(d2);
                                if (i2 == 0 || (i2 > 0 && i == left)) {
                                    if (a2 != 0) {
                                        if (a2 > 0 && a == top) {
                                        }
                                    }
                                    m2504c(motionEvent);
                                    break;
                                }
                            }
                            m2502b(f, f2, pointerId2);
                            if (c0625r.f1973a != 1) {
                                if (obj != null && m2523b(d2, pointerId2)) {
                                }
                            }
                            m2504c(motionEvent);
                        }
                    }
                    m2504c(motionEvent);
                }
                break;
            case 5:
                actionMasked = motionEvent2.getPointerId(actionIndex);
                x = motionEvent2.getX(actionIndex);
                float y3 = motionEvent2.getY(actionIndex);
                m2496a(x, y3, actionMasked);
                if (c0625r.f1973a != 0) {
                    if (c0625r.f1973a == 2) {
                        View d3 = m2529d((int) x, (int) y3);
                        if (d3 == c0625r.f1991s) {
                            m2523b(d3, actionMasked);
                            break;
                        }
                    }
                }
                pointerId = c0625r.f1980h[actionMasked];
                if ((c0625r.f1988p & pointerId) != 0) {
                    c0625r.f1990r.mo457a(pointerId & c0625r.f1988p, actionMasked);
                    break;
                }
                break;
            case 6:
                m2506e(motionEvent2.getPointerId(actionIndex));
                break;
        }
        z = false;
        return c0625r.f1973a == 1 ? true : z;
    }

    /* renamed from: b */
    public void m2520b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2531e();
        }
        if (this.f1984l == null) {
            this.f1984l = VelocityTracker.obtain();
        }
        this.f1984l.addMovement(motionEvent);
        int i = 0;
        float y;
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View d = m2529d((int) x, (int) y);
                m2496a(x, y, pointerId);
                m2523b(d, pointerId);
                actionMasked = this.f1980h[pointerId];
                if ((this.f1988p & actionMasked) != 0) {
                    this.f1990r.mo457a(actionMasked & this.f1988p, pointerId);
                    return;
                }
                return;
            case 1:
                if (this.f1973a == 1) {
                    m2510h();
                }
                m2531e();
                return;
            case 2:
                if (this.f1973a != 1) {
                    actionMasked = motionEvent.getPointerCount();
                    while (i < actionMasked) {
                        actionIndex = motionEvent.getPointerId(i);
                        if (m2509g(actionIndex)) {
                            float x2 = motionEvent.getX(i);
                            float y2 = motionEvent.getY(i);
                            float f = x2 - this.f1976d[actionIndex];
                            float f2 = y2 - this.f1977e[actionIndex];
                            m2502b(f, f2, actionIndex);
                            if (this.f1973a != 1) {
                                View d2 = m2529d((int) x2, (int) y2);
                                if (m2499a(d2, f, f2) && m2523b(d2, actionIndex)) {
                                }
                            }
                            m2504c(motionEvent);
                            return;
                        }
                        i++;
                    }
                    m2504c(motionEvent);
                    return;
                } else if (m2509g(this.f1975c)) {
                    actionMasked = motionEvent.findPointerIndex(this.f1975c);
                    y = motionEvent.getX(actionMasked);
                    actionIndex = (int) (y - this.f1978f[this.f1975c]);
                    actionMasked = (int) (motionEvent.getY(actionMasked) - this.f1979g[this.f1975c]);
                    m2503b(this.f1991s.getLeft() + actionIndex, this.f1991s.getTop() + actionMasked, actionIndex, actionMasked);
                    m2504c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.f1973a == 1) {
                    m2495a(0.0f, 0.0f);
                }
                m2531e();
                return;
            case 5:
                actionMasked = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                m2496a(x3, y3, actionMasked);
                if (this.f1973a == 0) {
                    m2523b(m2529d((int) x3, (int) y3), actionMasked);
                    motionEvent = this.f1980h[actionMasked];
                    if ((this.f1988p & motionEvent) != 0) {
                        this.f1990r.mo457a(motionEvent & this.f1988p, actionMasked);
                        return;
                    }
                    return;
                } else if (m2527c((int) x3, (int) y3) != null) {
                    m2523b(this.f1991s, actionMasked);
                    return;
                } else {
                    return;
                }
            case 6:
                actionMasked = motionEvent.getPointerId(actionIndex);
                if (this.f1973a == 1 && actionMasked == this.f1975c) {
                    actionIndex = motionEvent.getPointerCount();
                    while (i < actionIndex) {
                        int pointerId2 = motionEvent.getPointerId(i);
                        if (pointerId2 != this.f1975c) {
                            if (m2529d((int) motionEvent.getX(i), (int) motionEvent.getY(i)) == this.f1991s && m2523b(this.f1991s, pointerId2)) {
                                motionEvent = this.f1975c;
                                if (motionEvent == -1) {
                                    m2510h();
                                }
                            }
                        }
                        i++;
                    }
                    motionEvent = -1;
                    if (motionEvent == -1) {
                        m2510h();
                    }
                }
                m2506e(actionMasked);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m2502b(float f, float f2, int i) {
        int i2 = 1;
        if (!m2497a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m2497a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m2497a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m2497a(f2, f, i, 8) != null) {
            i2 |= 8;
        }
        if (i2 != 0) {
            f = this.f1981i;
            f[i] = f[i] | i2;
            this.f1990r.mo458b(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m2497a(float f, float f2, int i, int i2) {
        f = Math.abs(f);
        f2 = Math.abs(f2);
        boolean z = false;
        if (!((this.f1980h[i] & i2) != i2 || (this.f1988p & i2) == 0 || (this.f1982j[i] & i2) == i2 || (this.f1981i[i] & i2) == i2)) {
            if (f > ((float) this.f1974b) || f2 > ((float) this.f1974b)) {
                if (f >= f2 * 0.5f || this.f1990r.mo459b(i2) == null) {
                    if ((this.f1981i[i] & i2) == null && f > ((float) this.f1974b)) {
                        z = true;
                    }
                    return z;
                }
                f = this.f1982j;
                f[i] = f[i] | i2;
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2499a(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        Object obj = this.f1990r.mo134b(view) > 0 ? 1 : null;
        view = this.f1990r.mo103a(view) > null ? true : null;
        if (obj != null && view != null) {
            if ((f * f) + (f2 * f2) > ((float) (this.f1974b * this.f1974b))) {
                z = true;
            }
            return z;
        } else if (obj != null) {
            if (Math.abs(f) > ((float) this.f1974b)) {
                z = true;
            }
            return z;
        } else if (view == null) {
            return false;
        } else {
            if (Math.abs(f2) > ((float) this.f1974b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: d */
    public boolean m2530d(int i) {
        int length = this.f1976d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m2522b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m2522b(int i, int i2) {
        boolean z = false;
        if (!m2521b(i2)) {
            return false;
        }
        Object obj = (i & 1) == 1 ? 1 : null;
        i = (i & 2) == 2 ? 1 : 0;
        float f = this.f1978f[i2] - this.f1976d[i2];
        float f2 = this.f1979g[i2] - this.f1977e[i2];
        if (obj != null && i != 0) {
            if ((f * f) + (f2 * f2) > ((float) (this.f1974b * this.f1974b))) {
                z = true;
            }
            return z;
        } else if (obj != null) {
            if (Math.abs(f) > ((float) this.f1974b)) {
                z = true;
            }
            return z;
        } else if (i == 0) {
            return false;
        } else {
            if (Math.abs(f2) > ((float) this.f1974b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: h */
    private void m2510h() {
        this.f1984l.computeCurrentVelocity(1000, this.f1985m);
        m2495a(m2490a(this.f1984l.getXVelocity(this.f1975c), this.f1986n, this.f1985m), m2490a(this.f1984l.getYVelocity(this.f1975c), this.f1986n, this.f1985m));
    }

    /* renamed from: b */
    private void m2503b(int i, int i2, int i3, int i4) {
        int left = this.f1991s.getLeft();
        int top = this.f1991s.getTop();
        if (i3 != 0) {
            i = this.f1990r.mo109b(this.f1991s, i, i3);
            C0560r.m2192d(this.f1991s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f1990r.mo104a(this.f1991s, i2, i4);
            C0560r.m2190c(this.f1991s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f1990r.mo107a(this.f1991s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: c */
    public boolean m2527c(int i, int i2) {
        return m2524b(this.f1991s, i, i2);
    }

    /* renamed from: b */
    public boolean m2524b(View view, int i, int i2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public View m2529d(int i, int i2) {
        for (int childCount = this.f1993u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f1993u.getChildAt(this.f1990r.m2489c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return 0;
    }

    /* renamed from: e */
    private int m2505e(int i, int i2) {
        int i3 = i < this.f1993u.getLeft() + this.f1987o ? 1 : 0;
        if (i2 < this.f1993u.getTop() + this.f1987o) {
            i3 |= 4;
        }
        if (i > this.f1993u.getRight() - this.f1987o) {
            i3 |= 2;
        }
        return i2 > this.f1993u.getBottom() - this.f1987o ? i3 | 8 : i3;
    }

    /* renamed from: g */
    private boolean m2509g(int i) {
        if (m2521b(i)) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring pointerId=");
        stringBuilder.append(i);
        stringBuilder.append(" because ACTION_DOWN was not received ");
        stringBuilder.append("for this pointer before ACTION_MOVE. It likely happened because ");
        stringBuilder.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", stringBuilder.toString());
        return false;
    }
}
