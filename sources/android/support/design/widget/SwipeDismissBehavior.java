package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.v4.view.C0560r;
import android.support.v4.widget.C0625r;
import android.support.v4.widget.C0625r.C0624a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class SwipeDismissBehavior<V extends View> extends Behavior<V> {
    /* renamed from: a */
    private boolean f12914a;
    /* renamed from: b */
    C0625r f12915b;
    /* renamed from: c */
    C0173a f12916c;
    /* renamed from: d */
    int f12917d = 2;
    /* renamed from: e */
    float f12918e = 0.5f;
    /* renamed from: f */
    float f12919f = 0.0f;
    /* renamed from: g */
    float f12920g = 0.5f;
    /* renamed from: h */
    private float f12921h = 0.0f;
    /* renamed from: i */
    private boolean f12922i;
    /* renamed from: j */
    private final C0624a f12923j = new C30551(this);

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$a */
    public interface C0173a {
        /* renamed from: a */
        void mo147a(int i);

        /* renamed from: a */
        void mo148a(View view);
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$b */
    private class C0174b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ SwipeDismissBehavior f621a;
        /* renamed from: b */
        private final View f622b;
        /* renamed from: c */
        private final boolean f623c;

        C0174b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
            this.f621a = swipeDismissBehavior;
            this.f622b = view;
            this.f623c = z;
        }

        public void run() {
            if (this.f621a.f12915b != null && this.f621a.f12915b.m2518a(true)) {
                C0560r.m2178a(this.f622b, (Runnable) this);
            } else if (this.f623c && this.f621a.f12916c != null) {
                this.f621a.f12916c.mo148a(this.f622b);
            }
        }
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$1 */
    class C30551 extends C0624a {
        /* renamed from: a */
        final /* synthetic */ SwipeDismissBehavior f12911a;
        /* renamed from: b */
        private int f12912b;
        /* renamed from: c */
        private int f12913c = -1;

        C30551(SwipeDismissBehavior swipeDismissBehavior) {
            this.f12911a = swipeDismissBehavior;
        }

        /* renamed from: a */
        public boolean mo108a(View view, int i) {
            return (this.f12913c != -1 || this.f12911a.mo3733a(view) == null) ? null : true;
        }

        /* renamed from: b */
        public void mo135b(View view, int i) {
            this.f12913c = i;
            this.f12912b = view.getLeft();
            view = view.getParent();
            if (view != null) {
                view.requestDisallowInterceptTouchEvent(1);
            }
        }

        /* renamed from: a */
        public void mo105a(int i) {
            if (this.f12911a.f12916c != null) {
                this.f12911a.f12916c.mo147a(i);
            }
        }

        /* renamed from: a */
        public void mo106a(View view, float f, float f2) {
            int i;
            this.f12913c = -1;
            f2 = view.getWidth();
            if (m14998a(view, f) != null) {
                i = view.getLeft() < this.f12912b ? this.f12912b - f2 : this.f12912b + f2;
                f2 = Float.MIN_VALUE;
            } else {
                i = this.f12912b;
                f2 = 0.0f;
            }
            if (this.f12911a.f12915b.m2515a(i, view.getTop()) != null) {
                C0560r.m2178a(view, new C0174b(this.f12911a, view, f2));
            } else if (f2 != null && this.f12911a.f12916c != null) {
                this.f12911a.f12916c.mo148a(view);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        private boolean m14998a(android.view.View r6, float r7) {
            /*
            r5 = this;
            r0 = 0;
            r1 = 0;
            r2 = 1;
            r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
            if (r3 == 0) goto L_0x0041;
        L_0x0007:
            r6 = android.support.v4.view.C0560r.m2193e(r6);
            if (r6 != r2) goto L_0x000f;
        L_0x000d:
            r6 = 1;
            goto L_0x0010;
        L_0x000f:
            r6 = 0;
        L_0x0010:
            r3 = r5.f12911a;
            r3 = r3.f12917d;
            r4 = 2;
            if (r3 != r4) goto L_0x0018;
        L_0x0017:
            return r2;
        L_0x0018:
            r3 = r5.f12911a;
            r3 = r3.f12917d;
            if (r3 != 0) goto L_0x002c;
        L_0x001e:
            if (r6 == 0) goto L_0x0026;
        L_0x0020:
            r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
            if (r6 >= 0) goto L_0x002b;
        L_0x0024:
            r1 = 1;
            goto L_0x002b;
        L_0x0026:
            r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
            if (r6 <= 0) goto L_0x002b;
        L_0x002a:
            goto L_0x0024;
        L_0x002b:
            return r1;
        L_0x002c:
            r3 = r5.f12911a;
            r3 = r3.f12917d;
            if (r3 != r2) goto L_0x0040;
        L_0x0032:
            if (r6 == 0) goto L_0x003a;
        L_0x0034:
            r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
            if (r6 <= 0) goto L_0x003f;
        L_0x0038:
            r1 = 1;
            goto L_0x003f;
        L_0x003a:
            r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
            if (r6 >= 0) goto L_0x003f;
        L_0x003e:
            goto L_0x0038;
        L_0x003f:
            return r1;
        L_0x0040:
            return r1;
        L_0x0041:
            r7 = r6.getLeft();
            r0 = r5.f12912b;
            r7 = r7 - r0;
            r6 = r6.getWidth();
            r6 = (float) r6;
            r0 = r5.f12911a;
            r0 = r0.f12918e;
            r6 = r6 * r0;
            r6 = java.lang.Math.round(r6);
            r7 = java.lang.Math.abs(r7);
            if (r7 < r6) goto L_0x005e;
        L_0x005d:
            r1 = 1;
        L_0x005e:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.1.a(android.view.View, float):boolean");
        }

        /* renamed from: b */
        public int mo134b(View view) {
            return view.getWidth();
        }

        /* renamed from: b */
        public int mo109b(View view, int i, int i2) {
            int i3;
            i2 = C0560r.m2193e(view) == 1 ? 1 : 0;
            if (this.f12911a.f12917d == 0) {
                if (i2 != 0) {
                    i2 = this.f12912b - view.getWidth();
                    i3 = this.f12912b;
                } else {
                    i2 = this.f12912b;
                    i3 = view.getWidth() + this.f12912b;
                }
            } else if (this.f12911a.f12917d != 1) {
                i2 = this.f12912b - view.getWidth();
                i3 = view.getWidth() + this.f12912b;
            } else if (i2 != 0) {
                i2 = this.f12912b;
                i3 = view.getWidth() + this.f12912b;
            } else {
                i2 = this.f12912b - view.getWidth();
                i3 = this.f12912b;
            }
            return SwipeDismissBehavior.m15008a(i2, i, i3);
        }

        /* renamed from: a */
        public int mo104a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo107a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f12912b) + (((float) view.getWidth()) * this.f12911a.f12919f);
            float width2 = ((float) this.f12912b) + (((float) view.getWidth()) * this.f12911a.f12920g);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m15007a(0.0f, 1065353216 - SwipeDismissBehavior.m15010b(width, width2, f), 1.0f));
            }
        }
    }

    /* renamed from: b */
    static float m15010b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public boolean mo3733a(View view) {
        return true;
    }

    /* renamed from: a */
    public void m15013a(C0173a c0173a) {
        this.f12916c = c0173a;
    }

    /* renamed from: a */
    public void m15012a(int i) {
        this.f12917d = i;
    }

    /* renamed from: a */
    public void m15011a(float f) {
        this.f12919f = m15007a(0.0f, f, 1.0f);
    }

    /* renamed from: b */
    public void m15016b(float f) {
        this.f12920g = m15007a(0.0f, f, 1.0f);
    }

    /* renamed from: a */
    public boolean mo113a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f12914a;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    this.f12914a = coordinatorLayout.m24128a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                    z = this.f12914a;
                    break;
                case 1:
                    break;
                default:
                    break;
            }
        }
        this.f12914a = false;
        if (!z) {
            return false;
        }
        m15009a((ViewGroup) coordinatorLayout);
        return this.f12915b.m2516a(motionEvent);
    }

    /* renamed from: b */
    public boolean mo117b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f12915b == null) {
            return null;
        }
        this.f12915b.m2520b(motionEvent);
        return true;
    }

    /* renamed from: a */
    private void m15009a(ViewGroup viewGroup) {
        if (this.f12915b == null) {
            if (this.f12922i) {
                viewGroup = C0625r.m2493a(viewGroup, this.f12921h, this.f12923j);
            } else {
                viewGroup = C0625r.m2494a(viewGroup, this.f12923j);
            }
            this.f12915b = viewGroup;
        }
    }

    /* renamed from: a */
    static float m15007a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m15008a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
