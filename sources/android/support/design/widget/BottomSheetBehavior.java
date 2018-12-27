package android.support.design.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0143a.C0135d;
import android.support.design.C0143a.C0142k;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.v4.p013c.C0373a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0560r;
import android.support.v4.widget.C0625r;
import android.support.v4.widget.C0625r.C0624a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends Behavior<V> {
    /* renamed from: a */
    int f12855a;
    /* renamed from: b */
    int f12856b;
    /* renamed from: c */
    boolean f12857c;
    /* renamed from: d */
    int f12858d = 4;
    /* renamed from: e */
    C0625r f12859e;
    /* renamed from: f */
    int f12860f;
    /* renamed from: g */
    WeakReference<V> f12861g;
    /* renamed from: h */
    WeakReference<View> f12862h;
    /* renamed from: i */
    int f12863i;
    /* renamed from: j */
    boolean f12864j;
    /* renamed from: k */
    private float f12865k;
    /* renamed from: l */
    private int f12866l;
    /* renamed from: m */
    private boolean f12867m;
    /* renamed from: n */
    private int f12868n;
    /* renamed from: o */
    private boolean f12869o;
    /* renamed from: p */
    private boolean f12870p;
    /* renamed from: q */
    private int f12871q;
    /* renamed from: r */
    private boolean f12872r;
    /* renamed from: s */
    private C0158a f12873s;
    /* renamed from: t */
    private VelocityTracker f12874t;
    /* renamed from: u */
    private int f12875u;
    /* renamed from: v */
    private final C0624a f12876v = new C30461(this);

    /* renamed from: android.support.design.widget.BottomSheetBehavior$a */
    public static abstract class C0158a {
        /* renamed from: a */
        public abstract void m522a(View view, float f);

        /* renamed from: a */
        public abstract void m523a(View view, int i);
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$b */
    private class C0159b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ BottomSheetBehavior f567a;
        /* renamed from: b */
        private final View f568b;
        /* renamed from: c */
        private final int f569c;

        C0159b(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
            this.f567a = bottomSheetBehavior;
            this.f568b = view;
            this.f569c = i;
        }

        public void run() {
            if (this.f567a.f12859e == null || !this.f567a.f12859e.m2518a(true)) {
                this.f567a.m14947b(this.f569c);
            } else {
                C0560r.m2178a(this.f568b, (Runnable) this);
            }
        }
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$1 */
    class C30461 extends C0624a {
        /* renamed from: a */
        final /* synthetic */ BottomSheetBehavior f12853a;

        C30461(BottomSheetBehavior bottomSheetBehavior) {
            this.f12853a = bottomSheetBehavior;
        }

        /* renamed from: a */
        public boolean mo108a(View view, int i) {
            boolean z = true;
            if (this.f12853a.f12858d == 1 || this.f12853a.f12864j) {
                return false;
            }
            if (this.f12853a.f12858d == 3 && this.f12853a.f12863i == i) {
                View view2 = (View) this.f12853a.f12862h.get();
                if (!(view2 == null || view2.canScrollVertically(-1) == 0)) {
                    return false;
                }
            }
            if (this.f12853a.f12861g == 0 || this.f12853a.f12861g.get() != view) {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        public void mo107a(View view, int i, int i2, int i3, int i4) {
            this.f12853a.m14950c(i2);
        }

        /* renamed from: a */
        public void mo105a(int i) {
            if (i == 1) {
                this.f12853a.m14947b(1);
            }
        }

        /* renamed from: a */
        public void mo106a(View view, float f, float f2) {
            int i;
            int i2 = 3;
            if (f2 < 0.0f) {
                i = this.f12853a.f12855a;
            } else if (this.f12853a.f12857c && this.f12853a.m14945a(view, f2)) {
                i = this.f12853a.f12860f;
                i2 = 5;
            } else {
                int i3;
                if (f2 == 0.0f) {
                    f2 = view.getTop();
                    if (Math.abs(f2 - this.f12853a.f12855a) < Math.abs(f2 - this.f12853a.f12856b)) {
                        i = this.f12853a.f12855a;
                    } else {
                        i3 = this.f12853a.f12856b;
                    }
                } else {
                    i3 = this.f12853a.f12856b;
                }
                i = i3;
                i2 = 4;
            }
            if (this.f12853a.f12859e.m2515a(view.getLeft(), i) != null) {
                this.f12853a.m14947b((int) 2.8E-45f);
                C0560r.m2178a(view, new C0159b(this.f12853a, view, i2));
                return;
            }
            this.f12853a.m14947b(i2);
        }

        /* renamed from: a */
        public int mo104a(View view, int i, int i2) {
            return C0373a.m1375a(i, this.f12853a.f12855a, this.f12853a.f12857c != 0 ? this.f12853a.f12860f : this.f12853a.f12856b);
        }

        /* renamed from: b */
        public int mo109b(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: a */
        public int mo103a(View view) {
            if (this.f12853a.f12857c != null) {
                return this.f12853a.f12860f - this.f12853a.f12855a;
            }
            return this.f12853a.f12856b - this.f12853a.f12855a;
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C01571();
        /* renamed from: a */
        final int f12854a;

        /* renamed from: android.support.design.widget.BottomSheetBehavior$SavedState$1 */
        static class C01571 implements ClassLoaderCreator<SavedState> {
            C01571() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m519a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m520a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m521a(i);
            }

            /* renamed from: a */
            public SavedState m520a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m519a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m521a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12854a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f12854a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12854a);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        attributeSet = context.obtainStyledAttributes(attributeSet, C0142k.BottomSheetBehavior_Layout);
        TypedValue peekValue = attributeSet.peekValue(C0142k.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || peekValue.data != -1) {
            m14937a(attributeSet.getDimensionPixelSize(C0142k.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            m14937a(peekValue.data);
        }
        m14940a(attributeSet.getBoolean(C0142k.BottomSheetBehavior_Layout_behavior_hideable, false));
        m14948b(attributeSet.getBoolean(C0142k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        attributeSet.recycle();
        this.f12865k = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: b */
    public Parcelable mo116b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo116b(coordinatorLayout, v), this.f12858d);
    }

    /* renamed from: a */
    public void mo110a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo110a(coordinatorLayout, (View) v, savedState.m1885a());
        if (savedState.f12854a != 1) {
            if (savedState.f12854a != 2) {
                this.f12858d = savedState.f12854a;
                return;
            }
        }
        this.f12858d = 4;
    }

    /* renamed from: a */
    public boolean mo112a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C0560r.m2205q(coordinatorLayout) && !C0560r.m2205q(v)) {
            C0560r.m2187b((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.m24121a((View) v, i);
        this.f12860f = coordinatorLayout.getHeight();
        if (this.f12867m != 0) {
            if (this.f12868n == 0) {
                this.f12868n = coordinatorLayout.getResources().getDimensionPixelSize(C0135d.design_bottom_sheet_peek_height_min);
            }
            i = Math.max(this.f12868n, this.f12860f - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i = this.f12866l;
        }
        this.f12855a = Math.max(0, this.f12860f - v.getHeight());
        this.f12856b = Math.max(this.f12860f - i, this.f12855a);
        if (this.f12858d == 3) {
            C0560r.m2190c(v, this.f12855a);
        } else if (this.f12857c != 0 && this.f12858d == 5) {
            C0560r.m2190c(v, this.f12860f);
        } else if (this.f12858d == 4) {
            C0560r.m2190c(v, this.f12856b);
        } else if (this.f12858d == 1 || this.f12858d == 2) {
            C0560r.m2190c(v, top - v.getTop());
        }
        if (this.f12859e == 0) {
            this.f12859e = C0625r.m2494a((ViewGroup) coordinatorLayout, this.f12876v);
        }
        this.f12861g = new WeakReference(v);
        this.f12862h = new WeakReference(m14936a((View) v));
        return true;
    }

    /* renamed from: a */
    public boolean mo113a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m14934a();
            }
            if (this.f12874t == null) {
                this.f12874t = VelocityTracker.obtain();
            }
            this.f12874t.addMovement(motionEvent);
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        int x = (int) motionEvent.getX();
                        this.f12875u = (int) motionEvent.getY();
                        View view = this.f12862h != null ? (View) this.f12862h.get() : null;
                        if (view != null && coordinatorLayout.m24128a(view, x, this.f12875u)) {
                            this.f12863i = motionEvent.getPointerId(motionEvent.getActionIndex());
                            this.f12864j = true;
                        }
                        v = (this.f12863i == -1 && coordinatorLayout.m24128a((View) v, x, this.f12875u) == null) ? true : null;
                        this.f12870p = v;
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
            this.f12864j = false;
            this.f12863i = -1;
            if (this.f12870p != null) {
                this.f12870p = false;
                return false;
            }
            if (this.f12870p == null && this.f12859e.m2516a(motionEvent) != null) {
                return true;
            }
            View view2 = (View) this.f12862h.get();
            if (actionMasked == 2 && view2 != null && !this.f12870p && this.f12858d != 1 && coordinatorLayout.m24128a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) == null && Math.abs(((float) this.f12875u) - motionEvent.getY()) > ((float) this.f12859e.m2528d())) {
                z = true;
            }
            return z;
        }
        this.f12870p = true;
        return false;
    }

    /* renamed from: b */
    public boolean mo117b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown() == null) {
            return null;
        }
        coordinatorLayout = motionEvent.getActionMasked();
        if (this.f12858d == 1 && coordinatorLayout == null) {
            return true;
        }
        if (this.f12859e != null) {
            this.f12859e.m2520b(motionEvent);
        }
        if (coordinatorLayout == null) {
            m14934a();
        }
        if (this.f12874t == null) {
            this.f12874t = VelocityTracker.obtain();
        }
        this.f12874t.addMovement(motionEvent);
        if (coordinatorLayout == 2 && this.f12870p == null && Math.abs(((float) this.f12875u) - motionEvent.getY()) > ((float) this.f12859e.m2528d())) {
            this.f12859e.m2514a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return this.f12870p ^ 1;
    }

    /* renamed from: a */
    public boolean mo115a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f12871q = 0;
        this.f12872r = false;
        if ((i & 2) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo111a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f12862h.get())) {
            coordinatorLayout = v.getTop();
            i = coordinatorLayout - i2;
            if (i2 > 0) {
                if (i < this.f12855a) {
                    iArr[1] = coordinatorLayout - this.f12855a;
                    C0560r.m2190c(v, -iArr[1]);
                    m14947b(3);
                } else {
                    iArr[1] = i2;
                    C0560r.m2190c(v, -i2);
                    m14947b(1);
                }
            } else if (i2 < 0 && view.canScrollVertically(-1) == null) {
                if (i > this.f12856b) {
                    if (this.f12857c == null) {
                        iArr[1] = coordinatorLayout - this.f12856b;
                        C0560r.m2190c(v, -iArr[1]);
                        m14947b(4);
                    }
                }
                iArr[1] = i2;
                C0560r.m2190c(v, -i2);
                m14947b(1);
            }
            m14950c(v.getTop());
            this.f12871q = i2;
            this.f12872r = true;
        }
    }

    /* renamed from: c */
    public void mo118c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i = 3;
        if (v.getTop() == this.f12855a) {
            m14947b(3);
            return;
        }
        if (this.f12862h != null && view == this.f12862h.get()) {
            if (this.f12872r != null) {
                int i2;
                if (this.f12871q > null) {
                    i2 = this.f12855a;
                } else if (this.f12857c == null || m14945a(v, m14935b()) == null) {
                    if (this.f12871q == null) {
                        coordinatorLayout = v.getTop();
                        if (Math.abs(coordinatorLayout - this.f12855a) < Math.abs(coordinatorLayout - this.f12856b)) {
                            i2 = this.f12855a;
                        } else {
                            i2 = this.f12856b;
                        }
                    } else {
                        i2 = this.f12856b;
                    }
                    i = 4;
                } else {
                    i2 = this.f12860f;
                    i = 5;
                }
                if (this.f12859e.m2517a((View) v, v.getLeft(), i2) != null) {
                    m14947b(2);
                    C0560r.m2178a((View) v, new C0159b(this, v, i));
                } else {
                    m14947b(i);
                }
                this.f12872r = null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo114a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return (view != this.f12862h.get() || (this.f12858d == 3 && super.mo114a(coordinatorLayout, (View) v, view, f, f2) == null)) ? null : true;
    }

    /* renamed from: a */
    public final void m14937a(int i) {
        boolean z = true;
        if (i != -1) {
            if (!this.f12867m) {
                if (this.f12866l != i) {
                }
            }
            this.f12867m = false;
            this.f12866l = Math.max(0, i);
            this.f12856b = this.f12860f - i;
            if (!z) {
            }
        } else if (this.f12867m == 0) {
            this.f12867m = true;
            if (!z && this.f12858d == 4 && this.f12861g != 0) {
                View view = (View) this.f12861g.get();
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z = false;
        if (!z) {
        }
    }

    /* renamed from: a */
    public void m14940a(boolean z) {
        this.f12857c = z;
    }

    /* renamed from: b */
    public void m14948b(boolean z) {
        this.f12869o = z;
    }

    /* renamed from: b */
    void m14947b(int i) {
        if (this.f12858d != i) {
            this.f12858d = i;
            View view = (View) this.f12861g.get();
            if (!(view == null || this.f12873s == null)) {
                this.f12873s.m523a(view, i);
            }
        }
    }

    /* renamed from: a */
    private void m14934a() {
        this.f12863i = -1;
        if (this.f12874t != null) {
            this.f12874t.recycle();
            this.f12874t = null;
        }
    }

    /* renamed from: a */
    boolean m14945a(View view, float f) {
        boolean z = true;
        if (this.f12869o) {
            return true;
        }
        if (view.getTop() < this.f12856b) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f12856b)) / ((float) this.f12866l) <= 0.5f) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    View m14936a(View view) {
        if (C0560r.m2210v(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = m14936a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private float m14935b() {
        this.f12874t.computeCurrentVelocity(1000, this.f12865k);
        return this.f12874t.getYVelocity(this.f12863i);
    }

    /* renamed from: c */
    void m14950c(int i) {
        View view = (View) this.f12861g.get();
        if (view != null && this.f12873s != null) {
            if (i > this.f12856b) {
                this.f12873s.m522a(view, ((float) (this.f12856b - i)) / ((float) (this.f12860f - this.f12856b)));
            } else {
                this.f12873s.m522a(view, ((float) (this.f12856b - i)) / ((float) (this.f12856b - this.f12855a)));
            }
        }
    }
}
