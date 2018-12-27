package android.support.design.widget;

import android.content.Context;
import android.support.v4.p013c.C0373a;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    /* renamed from: a */
    OverScroller f18361a;
    /* renamed from: b */
    private Runnable f18362b;
    /* renamed from: c */
    private boolean f18363c;
    /* renamed from: d */
    private int f18364d = -1;
    /* renamed from: e */
    private int f18365e;
    /* renamed from: f */
    private int f18366f = -1;
    /* renamed from: g */
    private VelocityTracker f18367g;

    /* renamed from: android.support.design.widget.HeaderBehavior$a */
    private class C0169a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ HeaderBehavior f616a;
        /* renamed from: b */
        private final CoordinatorLayout f617b;
        /* renamed from: c */
        private final V f618c;

        C0169a(HeaderBehavior headerBehavior, CoordinatorLayout coordinatorLayout, V v) {
            this.f616a = headerBehavior;
            this.f617b = coordinatorLayout;
            this.f618c = v;
        }

        public void run() {
            if (this.f618c != null && this.f616a.f18361a != null) {
                if (this.f616a.f18361a.computeScrollOffset()) {
                    this.f616a.a_(this.f617b, this.f618c, this.f616a.f18361a.getCurrY());
                    C0560r.m2178a(this.f618c, (Runnable) this);
                    return;
                }
                this.f616a.mo4583a(this.f617b, this.f618c);
            }
        }
    }

    /* renamed from: a */
    void mo4583a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: c */
    boolean mo4591c(V v) {
        return false;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo113a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f18366f < 0) {
            this.f18366f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f18363c) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f18363c = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (mo4591c(v) && coordinatorLayout.m24128a((View) v, x, y) != null) {
                    this.f18365e = y;
                    this.f18364d = motionEvent.getPointerId(0);
                    m24141d();
                    break;
                }
            case 1:
            case 3:
                this.f18363c = false;
                this.f18364d = -1;
                if (this.f18367g != null) {
                    this.f18367g.recycle();
                    this.f18367g = null;
                    break;
                }
                break;
            case 2:
                coordinatorLayout = this.f18364d;
                if (coordinatorLayout != -1) {
                    coordinatorLayout = motionEvent.findPointerIndex(coordinatorLayout);
                    if (coordinatorLayout != -1) {
                        coordinatorLayout = (int) motionEvent.getY(coordinatorLayout);
                        if (Math.abs(coordinatorLayout - this.f18365e) > this.f18366f) {
                            this.f18363c = true;
                            this.f18365e = coordinatorLayout;
                            break;
                        }
                    }
                    break;
                }
                break;
                break;
            default:
                break;
        }
        if (this.f18367g != null) {
            this.f18367g.addMovement(motionEvent);
        }
        return this.f18363c;
    }

    /* renamed from: b */
    public boolean mo117b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f18366f < 0) {
            this.f18366f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                y = (int) motionEvent.getY();
                if (coordinatorLayout.m24128a((View) v, (int) motionEvent.getX(), y) != null && mo4591c(v) != null) {
                    this.f18365e = y;
                    this.f18364d = motionEvent.getPointerId(0);
                    m24141d();
                    break;
                }
                return false;
            case 1:
                if (this.f18367g != null) {
                    this.f18367g.addMovement(motionEvent);
                    this.f18367g.computeCurrentVelocity(1000);
                    m24146a(coordinatorLayout, (View) v, -mo4582a(v), 0, this.f18367g.getYVelocity(this.f18364d));
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f18364d);
                if (findPointerIndex != -1) {
                    findPointerIndex = (int) motionEvent.getY(findPointerIndex);
                    y = this.f18365e - findPointerIndex;
                    if (!this.f18363c && Math.abs(y) > this.f18366f) {
                        this.f18363c = true;
                        y = y > 0 ? y - this.f18366f : y + this.f18366f;
                    }
                    int i = y;
                    if (this.f18363c) {
                        this.f18365e = findPointerIndex;
                        m24148b(coordinatorLayout, v, i, mo4590b(v), 0);
                        break;
                    }
                }
                return false;
                break;
            case 3:
                break;
            default:
                break;
        }
        this.f18363c = false;
        this.f18364d = -1;
        if (this.f18367g != null) {
            this.f18367g.recycle();
            this.f18367g = null;
        }
        if (this.f18367g != null) {
            this.f18367g.addMovement(motionEvent);
        }
        return true;
    }

    int a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo4581a(coordinatorLayout, (View) v, i, Integer.MIN_VALUE, (int) BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: a */
    int mo4581a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        V b = mo4589b();
        if (i2 != 0 && b >= i2 && b <= i3) {
            v = C0373a.m1375a(i, i2, i3);
            if (b != v) {
                mo4587a(v);
                return b - v;
            }
        }
        return null;
    }

    /* renamed from: a */
    int mo4580a() {
        return mo4589b();
    }

    /* renamed from: b */
    final int m24148b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo4581a(coordinatorLayout, (View) v, mo4580a() - i, i2, i3);
    }

    /* renamed from: a */
    final boolean m24146a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        if (this.f18362b != null) {
            v.removeCallbacks(r0.f18362b);
            r0.f18362b = null;
        }
        if (r0.f18361a == null) {
            r0.f18361a = new OverScroller(v.getContext());
        }
        r0.f18361a.fling(0, mo4589b(), 0, Math.round(f), 0, 0, i, i2);
        if (r0.f18361a.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            r0.f18362b = new C0169a(this, coordinatorLayout, v);
            C0560r.m2178a((View) v, r0.f18362b);
            return true;
        }
        coordinatorLayout2 = coordinatorLayout;
        mo4583a(coordinatorLayout, v);
        return false;
    }

    /* renamed from: b */
    int mo4590b(V v) {
        return -v.getHeight();
    }

    /* renamed from: a */
    int mo4582a(V v) {
        return v.getHeight();
    }

    /* renamed from: d */
    private void m24141d() {
        if (this.f18367g == null) {
            this.f18367g = VelocityTracker.obtain();
        }
    }
}
