package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0143a.C0133b;
import android.support.design.C0143a.C0141j;
import android.support.design.C0143a.C0142k;
import android.support.design.widget.CoordinatorLayout.C0163b;
import android.support.design.widget.CoordinatorLayout.C0165d;
import android.support.v4.p013c.C0373a;
import android.support.v4.p017f.C0428i;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0554n;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0571z;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@C0163b(a = Behavior.class)
public class AppBarLayout extends LinearLayout {
    /* renamed from: a */
    private int f549a;
    /* renamed from: b */
    private int f550b;
    /* renamed from: c */
    private int f551c;
    /* renamed from: d */
    private boolean f552d;
    /* renamed from: e */
    private int f553e;
    /* renamed from: f */
    private C0571z f554f;
    /* renamed from: g */
    private List<C0153a> f555g;
    /* renamed from: h */
    private boolean f556h;
    /* renamed from: i */
    private boolean f557i;
    /* renamed from: j */
    private int[] f558j;

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        /* renamed from: a */
        int f547a = 1;
        /* renamed from: b */
        Interpolator f548b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            attributeSet = context.obtainStyledAttributes(attributeSet, C0142k.AppBarLayout_Layout);
            this.f547a = attributeSet.getInt(C0142k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (attributeSet.hasValue(C0142k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f548b = AnimationUtils.loadInterpolator(context, attributeSet.getResourceId(C0142k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            attributeSet.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int m490a() {
            return this.f547a;
        }

        /* renamed from: b */
        public Interpolator m491b() {
            return this.f548b;
        }

        /* renamed from: c */
        boolean m492c() {
            return (this.f547a & 1) == 1 && (this.f547a & 10) != 0;
        }
    }

    /* renamed from: android.support.design.widget.AppBarLayout$a */
    public interface C0153a {
        /* renamed from: a */
        void mo120a(AppBarLayout appBarLayout, int i);
    }

    /* renamed from: android.support.design.widget.AppBarLayout$1 */
    class C30441 implements C0554n {
        /* renamed from: a */
        final /* synthetic */ AppBarLayout f12847a;

        C30441(AppBarLayout appBarLayout) {
            this.f12847a = appBarLayout;
        }

        /* renamed from: a */
        public C0571z mo88a(View view, C0571z c0571z) {
            return this.f12847a.m501a(c0571z);
        }
    }

    public static class Behavior extends HeaderBehavior<AppBarLayout> {
        /* renamed from: b */
        private int f20815b;
        /* renamed from: c */
        private ValueAnimator f20816c;
        /* renamed from: d */
        private int f20817d = -1;
        /* renamed from: e */
        private boolean f20818e;
        /* renamed from: f */
        private float f20819f;
        /* renamed from: g */
        private WeakReference<View> f20820g;
        /* renamed from: h */
        private C0152a f20821h;

        /* renamed from: android.support.design.widget.AppBarLayout$Behavior$a */
        public static abstract class C0152a {
            /* renamed from: a */
            public abstract boolean m489a(AppBarLayout appBarLayout);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Creator<SavedState> CREATOR = new C01511();
            /* renamed from: a */
            int f12848a;
            /* renamed from: b */
            float f12849b;
            /* renamed from: c */
            boolean f12850c;

            /* renamed from: android.support.design.widget.AppBarLayout$Behavior$SavedState$1 */
            static class C01511 implements ClassLoaderCreator<SavedState> {
                C01511() {
                }

                public /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m486a(parcel);
                }

                public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return m487a(parcel, classLoader);
                }

                public /* synthetic */ Object[] newArray(int i) {
                    return m488a(i);
                }

                /* renamed from: a */
                public SavedState m487a(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                /* renamed from: a */
                public SavedState m486a(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                /* renamed from: a */
                public SavedState[] m488a(int i) {
                    return new SavedState[i];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f12848a = parcel.readInt();
                this.f12849b = parcel.readFloat();
                this.f12850c = parcel.readByte() != null ? true : null;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f12848a);
                parcel.writeFloat(this.f12849b);
                parcel.writeByte((byte) this.f12850c);
            }
        }

        /* renamed from: a */
        private static boolean m27562a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: a */
        /* synthetic */ int mo4582a(View view) {
            return m27594c((AppBarLayout) view);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo4589b() {
            return super.mo4589b();
        }

        /* renamed from: c */
        /* synthetic */ boolean mo4591c(View view) {
            return m27582a((AppBarLayout) view);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean m27585a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            coordinatorLayout = ((i & 2) == null || appBarLayout.m507c() == null || coordinatorLayout.getHeight() - view.getHeight() > appBarLayout.getHeight()) ? null : true;
            if (!(coordinatorLayout == null || this.f20816c == null)) {
                this.f20816c.cancel();
            }
            this.f20820g = null;
            return coordinatorLayout;
        }

        /* renamed from: a */
        public void m27575a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            if (i2 != 0) {
                int i4;
                int downNestedPreScrollRange;
                if (i2 < 0) {
                    view = -appBarLayout.getTotalScrollRange();
                    i4 = view;
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + view;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i4 != downNestedPreScrollRange) {
                    iArr[1] = m24148b(coordinatorLayout, appBarLayout, i2, i4, downNestedPreScrollRange);
                }
            }
        }

        /* renamed from: a */
        public void m27574a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                m24148b(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: a */
        public void m27573a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (i == 0) {
                m27565c(coordinatorLayout, appBarLayout);
            }
            this.f20820g = new WeakReference(view);
        }

        /* renamed from: a */
        private void m27559a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int round;
            int abs = Math.abs(mo4580a() - i);
            f = Math.abs(f);
            if (f > 0.0f) {
                round = Math.round((((float) abs) / f) * 1000.0f) * 3;
            } else {
                round = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            m27560a(coordinatorLayout, appBarLayout, i, round);
        }

        /* renamed from: a */
        private void m27560a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i, int i2) {
            if (mo4580a() == i) {
                if (!(this.f20816c == null || this.f20816c.isRunning() == null)) {
                    this.f20816c.cancel();
                }
                return;
            }
            if (this.f20816c == null) {
                this.f20816c = new ValueAnimator();
                this.f20816c.setInterpolator(C0189a.f703e);
                this.f20816c.addUpdateListener(new AnimatorUpdateListener(this) {
                    /* renamed from: c */
                    final /* synthetic */ Behavior f546c;

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f546c.a_(coordinatorLayout, appBarLayout, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                this.f20816c.cancel();
            }
            this.f20816c.setDuration((long) Math.min(i2, 600));
            this.f20816c.setIntValues(new int[]{r0, i});
            this.f20816c.start();
        }

        /* renamed from: a */
        private int m27558a(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -i;
                if (childAt.getTop() <= i3 && childAt.getBottom() >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c */
        private void m27565c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int a = mo4580a();
            int a2 = m27558a(appBarLayout, a);
            if (a2 >= 0) {
                View childAt = appBarLayout.getChildAt(a2);
                int a3 = ((LayoutParams) childAt.getLayoutParams()).m490a();
                if ((a3 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (a2 == appBarLayout.getChildCount() - 1) {
                        i2 += appBarLayout.getTopInset();
                    }
                    if (m27562a(a3, 2)) {
                        i2 += C0560r.m2198j(childAt);
                    } else if (m27562a(a3, 5)) {
                        int j = C0560r.m2198j(childAt) + i2;
                        if (a < j) {
                            i = j;
                        } else {
                            i2 = j;
                        }
                    }
                    if (a < (i2 + i) / 2) {
                        i = i2;
                    }
                    m27559a(coordinatorLayout, appBarLayout, C0373a.m1375a(i, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: a */
        public boolean m27584a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((C0165d) appBarLayout.getLayoutParams()).height != -2) {
                return super.mo3730a(coordinatorLayout, (View) appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.m24122a((View) appBarLayout, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean m27583a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            i = super.mo112a(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            if (this.f20817d >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(this.f20817d);
                int i2 = -childAt.getBottom();
                if (this.f20818e) {
                    i2 += C0560r.m2198j(childAt) + appBarLayout.getTopInset();
                } else {
                    i2 += Math.round(((float) childAt.getHeight()) * this.f20819f);
                }
                a_(coordinatorLayout, appBarLayout, i2);
            } else if (pendingAction != 0) {
                Object obj = (pendingAction & 4) != 0 ? 1 : null;
                if ((pendingAction & 2) != 0) {
                    pendingAction = -appBarLayout.getUpNestedPreScrollRange();
                    if (obj != null) {
                        m27559a(coordinatorLayout, appBarLayout, pendingAction, 0.0f);
                    } else {
                        a_(coordinatorLayout, appBarLayout, pendingAction);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (obj != null) {
                        m27559a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.m508d();
            this.f20817d = -1;
            mo4587a(C0373a.m1375a(mo4589b(), -appBarLayout.getTotalScrollRange(), 0));
            m27561a(coordinatorLayout, appBarLayout, mo4589b(), 0, true);
            appBarLayout.m502a(mo4589b());
            return i;
        }

        /* renamed from: a */
        boolean m27582a(AppBarLayout appBarLayout) {
            if (this.f20821h != null) {
                return this.f20821h.m489a(appBarLayout);
            }
            boolean z = true;
            if (this.f20820g == null) {
                return true;
            }
            View view = (View) this.f20820g.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1) != null) {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        void m27571a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m27565c(coordinatorLayout, appBarLayout);
        }

        /* renamed from: b */
        int m27590b(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        /* renamed from: c */
        int m27594c(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* renamed from: a */
        int m27568a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int a = mo4580a();
            int i4 = 0;
            if (i2 == 0 || a < i2 || a > i3) {
                this.f20815b = 0;
            } else {
                int a2 = C0373a.m1375a(i, i2, i3);
                if (a != a2) {
                    i = appBarLayout.m506b() != 0 ? m27563b(appBarLayout, a2) : a2;
                    i2 = mo4587a(i);
                    i4 = a - a2;
                    this.f20815b = a2 - i;
                    if (i2 == 0 && appBarLayout.m506b() != 0) {
                        coordinatorLayout.m24131b((View) appBarLayout);
                    }
                    appBarLayout.m502a(mo4589b());
                    m27561a(coordinatorLayout, appBarLayout, a2, a2 < a ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* renamed from: b */
        private int m27563b(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = appBarLayout.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator b = layoutParams.m491b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else {
                    if (b != null) {
                        childCount = layoutParams.m490a();
                        if ((childCount & 1) != 0) {
                            i2 = 0 + ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin);
                            if ((childCount & 2) != 0) {
                                i2 -= C0560r.m2198j(childAt);
                            }
                        }
                        if (C0560r.m2205q(childAt)) {
                            i2 -= appBarLayout.getTopInset();
                        }
                        if (i2 > 0) {
                            appBarLayout = (float) i2;
                            return Integer.signum(i) * (childAt.getTop() + Math.round(appBarLayout * b.getInterpolation(((float) (abs - childAt.getTop())) / appBarLayout)));
                        }
                    }
                    return i;
                }
            }
            return i;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        private void m27561a(android.support.design.widget.CoordinatorLayout r6, android.support.design.widget.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
            r5 = this;
            r0 = m27564c(r7, r8);
            if (r0 == 0) goto L_0x0058;
        L_0x0006:
            r1 = r0.getLayoutParams();
            r1 = (android.support.design.widget.AppBarLayout.LayoutParams) r1;
            r1 = r1.m490a();
            r2 = r1 & 1;
            r3 = 0;
            if (r2 == 0) goto L_0x0041;
        L_0x0015:
            r2 = android.support.v4.view.C0560r.m2198j(r0);
            r4 = 1;
            if (r9 <= 0) goto L_0x002f;
        L_0x001c:
            r9 = r1 & 12;
            if (r9 == 0) goto L_0x002f;
        L_0x0020:
            r8 = -r8;
            r9 = r0.getBottom();
            r9 = r9 - r2;
            r0 = r7.getTopInset();
            r9 = r9 - r0;
            if (r8 < r9) goto L_0x0041;
        L_0x002d:
            r3 = 1;
            goto L_0x0041;
        L_0x002f:
            r9 = r1 & 2;
            if (r9 == 0) goto L_0x0041;
        L_0x0033:
            r8 = -r8;
            r9 = r0.getBottom();
            r9 = r9 - r2;
            r0 = r7.getTopInset();
            r9 = r9 - r0;
            if (r8 < r9) goto L_0x0041;
        L_0x0040:
            goto L_0x002d;
        L_0x0041:
            r8 = r7.m504a(r3);
            r9 = android.os.Build.VERSION.SDK_INT;
            r0 = 11;
            if (r9 < r0) goto L_0x0058;
        L_0x004b:
            if (r10 != 0) goto L_0x0055;
        L_0x004d:
            if (r8 == 0) goto L_0x0058;
        L_0x004f:
            r6 = r5.m27566d(r6, r7);
            if (r6 == 0) goto L_0x0058;
        L_0x0055:
            r7.jumpDrawablesToCurrentState();
        L_0x0058:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.Behavior.a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: d */
        private boolean m27566d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            coordinatorLayout = coordinatorLayout.m24140d((View) appBarLayout);
            appBarLayout = coordinatorLayout.size();
            boolean z = false;
            for (int i = 0; i < appBarLayout; i++) {
                android.support.design.widget.CoordinatorLayout.Behavior b = ((C0165d) ((View) coordinatorLayout.get(i)).getLayoutParams()).m582b();
                if (b instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) b).m24161d() != null) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }

        /* renamed from: c */
        private static View m27564c(AppBarLayout appBarLayout, int i) {
            i = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (i >= childAt.getTop() && i <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        int mo4580a() {
            return mo4589b() + this.f20815b;
        }

        /* renamed from: b */
        public Parcelable m27592b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            coordinatorLayout = super.mo116b(coordinatorLayout, appBarLayout);
            int b = mo4589b();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b > 0 || bottom < 0) {
                    i++;
                } else {
                    Parcelable savedState = new SavedState(coordinatorLayout);
                    savedState.f12848a = i;
                    if (bottom == C0560r.m2198j(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    savedState.f12850c = z;
                    savedState.f12849b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return coordinatorLayout;
        }

        /* renamed from: a */
        public void m27572a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo110a(coordinatorLayout, (View) appBarLayout, savedState.m1885a());
                this.f20817d = savedState.f12848a;
                this.f20819f = savedState.f12849b;
                this.f20818e = savedState.f12850c;
                return;
            }
            super.mo110a(coordinatorLayout, (View) appBarLayout, parcelable);
            this.f20817d = -1;
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo3730a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo3730a(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo4589b() {
            return super.mo4589b();
        }

        /* renamed from: b */
        /* synthetic */ View mo4596b(List list) {
            return m27599a(list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, C0142k.ScrollingViewBehavior_Layout);
            m24158b((int) context.getDimensionPixelSize(C0142k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            context.recycle();
        }

        /* renamed from: a */
        public boolean mo4594a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: b */
        public boolean mo125b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m27597e(coordinatorLayout, view, view2);
            return null;
        }

        /* renamed from: a */
        public boolean mo4593a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = m27599a(coordinatorLayout.m24135c(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                view = this.a;
                view.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (view.contains(rect) == null) {
                    a.setExpanded(false, z ^ 1);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        private void m27597e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            coordinatorLayout = ((C0165d) view2.getLayoutParams()).m582b();
            if (coordinatorLayout instanceof Behavior) {
                C0560r.m2190c(view, (((view2.getBottom() - view.getTop()) + ((Behavior) coordinatorLayout).f20815b) + m24154a()) - m24160c(view2));
            }
        }

        /* renamed from: a */
        float mo4592a(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                view = m27596a(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + view <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                totalScrollRange -= downNestedPreScrollRange;
                if (totalScrollRange != 0) {
                    return (((float) view) / ((float) totalScrollRange)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: a */
        private static int m27596a(AppBarLayout appBarLayout) {
            appBarLayout = ((C0165d) appBarLayout.getLayoutParams()).m582b();
            return appBarLayout instanceof Behavior ? ((Behavior) appBarLayout).mo4580a() : null;
        }

        /* renamed from: a */
        AppBarLayout m27599a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: b */
        int mo4595b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo4595b(view);
        }
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m498a();
    }

    /* renamed from: generateDefaultLayoutParams */
    protected /* synthetic */ android.widget.LinearLayout.LayoutParams m30381generateDefaultLayoutParams() {
        return m498a();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m499a(attributeSet);
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m500a(layoutParams);
    }

    /* renamed from: generateLayoutParams */
    public /* synthetic */ android.widget.LinearLayout.LayoutParams m30382generateLayoutParams(AttributeSet attributeSet) {
        return m499a(attributeSet);
    }

    /* renamed from: generateLayoutParams */
    protected /* synthetic */ android.widget.LinearLayout.LayoutParams m30383generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m500a(layoutParams);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f549a = -1;
        this.f550b = -1;
        this.f551c = -1;
        this.f553e = 0;
        setOrientation(1);
        C0219m.m807a(context);
        if (VERSION.SDK_INT >= 21) {
            C0222p.m815a(this);
            C0222p.m817a(this, attributeSet, 0, C0141j.Widget_Design_AppBarLayout);
        }
        context = context.obtainStyledAttributes(attributeSet, C0142k.AppBarLayout, 0, C0141j.Widget_Design_AppBarLayout);
        C0560r.m2174a((View) this, context.getDrawable(C0142k.AppBarLayout_android_background));
        if (context.hasValue(C0142k.AppBarLayout_expanded) != null) {
            m494a(context.getBoolean(C0142k.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && context.hasValue(C0142k.AppBarLayout_elevation) != null) {
            C0222p.m816a(this, (float) context.getDimensionPixelSize(C0142k.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (context.hasValue(C0142k.AppBarLayout_android_keyboardNavigationCluster) != null) {
                setKeyboardNavigationCluster(context.getBoolean(C0142k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (context.hasValue(C0142k.AppBarLayout_android_touchscreenBlocksFocus) != null) {
                setTouchscreenBlocksFocus(context.getBoolean(C0142k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        context.recycle();
        C0560r.m2176a((View) this, new C30441(this));
    }

    /* renamed from: a */
    public void m503a(C0153a c0153a) {
        if (this.f555g == null) {
            this.f555g = new ArrayList();
        }
        if (c0153a != null && !this.f555g.contains(c0153a)) {
            this.f555g.add(c0153a);
        }
    }

    /* renamed from: b */
    public void m505b(C0153a c0153a) {
        if (this.f555g != null && c0153a != null) {
            this.f555g.remove(c0153a);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m497f();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m497f();
        z = false;
        this.f552d = false;
        boolean childCount = getChildCount();
        while (z < childCount) {
            if (((LayoutParams) getChildAt(z).getLayoutParams()).m491b() != 0) {
                this.f552d = true;
                break;
            }
            z++;
        }
        m496e();
    }

    /* renamed from: e */
    private void m496e() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).m492c()) {
                z = true;
                break;
            }
        }
        m495b(z);
    }

    /* renamed from: f */
    private void m497f() {
        this.f549a = -1;
        this.f550b = -1;
        this.f551c = -1;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setExpanded(boolean z) {
        setExpanded(z, C0560r.m2212x(this));
    }

    public void setExpanded(boolean z, boolean z2) {
        m494a(z, z2, true);
    }

    /* renamed from: a */
    private void m494a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        z = (z ? true : true) | (z2 ? true : false);
        if (z3) {
            i = 8;
        }
        this.f553e = z | i;
        requestLayout();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: a */
    protected LayoutParams m498a() {
        return new LayoutParams(-1, -2);
    }

    /* renamed from: a */
    public LayoutParams m499a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    protected LayoutParams m500a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
            return new LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: b */
    boolean m506b() {
        return this.f552d;
    }

    public final int getTotalScrollRange() {
        if (this.f549a != -1) {
            return this.f549a;
        }
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = layoutParams.f547a;
            if ((i3 & 1) == 0) {
                break;
            }
            i += (measuredHeight + layoutParams.topMargin) + layoutParams.bottomMargin;
            if ((i3 & 2) != 0) {
                i -= C0560r.m2198j(childAt);
                break;
            }
        }
        childCount = Math.max(0, i - getTopInset());
        this.f549a = childCount;
        return childCount;
    }

    /* renamed from: c */
    boolean m507c() {
        return getTotalScrollRange() != 0;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    int getDownNestedPreScrollRange() {
        if (this.f550b != -1) {
            return this.f550b;
        }
        int childCount;
        int i = 0;
        for (childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = layoutParams.f547a;
            if ((i2 & 5) == 5) {
                i += layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i2 & 8) != 0) {
                    i += C0560r.m2198j(childAt);
                } else if ((i2 & 2) != 0) {
                    i += measuredHeight - C0560r.m2198j(childAt);
                } else {
                    i += measuredHeight - getTopInset();
                }
            } else if (i > 0) {
                break;
            }
        }
        childCount = Math.max(0, i);
        this.f550b = childCount;
        return childCount;
    }

    int getDownNestedScrollRange() {
        if (this.f551c != -1) {
            return this.f551c;
        }
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + (layoutParams.topMargin + layoutParams.bottomMargin);
            int i3 = layoutParams.f547a;
            if ((i3 & 1) == 0) {
                break;
            }
            i += measuredHeight;
            if ((i3 & 2) != 0) {
                i -= C0560r.m2198j(childAt) + getTopInset();
                break;
            }
        }
        childCount = Math.max(0, i);
        this.f551c = childCount;
        return childCount;
    }

    /* renamed from: a */
    void m502a(int i) {
        if (this.f555g != null) {
            int size = this.f555g.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0153a c0153a = (C0153a) this.f555g.get(i2);
                if (c0153a != null) {
                    c0153a.mo120a(this, i);
                }
            }
        }
    }

    final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int j = C0560r.m2198j(this);
        if (j != 0) {
            return (j * 2) + topInset;
        }
        j = getChildCount();
        j = j >= 1 ? C0560r.m2198j(getChildAt(j - 1)) : 0;
        if (j != 0) {
            return (j * 2) + topInset;
        }
        return getHeight() / 3;
    }

    protected int[] onCreateDrawableState(int i) {
        if (this.f558j == null) {
            this.f558j = new int[2];
        }
        int[] iArr = this.f558j;
        i = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f556h ? C0133b.state_collapsible : -C0133b.state_collapsible;
        int i2 = (this.f556h && this.f557i) ? C0133b.state_collapsed : -C0133b.state_collapsed;
        iArr[1] = i2;
        return mergeDrawableStates(i, iArr);
    }

    /* renamed from: b */
    private boolean m495b(boolean z) {
        if (this.f556h == z) {
            return false;
        }
        this.f556h = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: a */
    boolean m504a(boolean z) {
        if (this.f557i == z) {
            return false;
        }
        this.f557i = z;
        refreshDrawableState();
        return true;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C0222p.m816a(this, f);
        }
    }

    int getPendingAction() {
        return this.f553e;
    }

    /* renamed from: d */
    void m508d() {
        this.f553e = 0;
    }

    final int getTopInset() {
        return this.f554f != null ? this.f554f.m2253b() : 0;
    }

    /* renamed from: a */
    C0571z m501a(C0571z c0571z) {
        C0571z c0571z2 = C0560r.m2205q(this) ? c0571z : null;
        if (!C0428i.m1569a(this.f554f, c0571z2)) {
            this.f554f = c0571z2;
            m497f();
        }
        return c0571z;
    }
}
