package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p006b.C0070a.C0067a;
import android.support.p006b.C0070a.C0068b;
import android.support.p006b.C0070a.C0069c;
import android.support.v4.content.C0389b;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.p013c.C0373a;
import android.support.v4.p017f.C0428i;
import android.support.v4.p017f.C0431k.C0430a;
import android.support.v4.p017f.C0431k.C4435c;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0543c;
import android.support.v4.view.C0553m;
import android.support.v4.view.C0554n;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0571z;
import android.support.v4.view.C3168l;
import android.support.v4.widget.C0610h;
import android.support.v4.widget.C0626s;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C3168l {
    /* renamed from: a */
    static final String f18337a;
    /* renamed from: b */
    static final Class<?>[] f18338b = new Class[]{Context.class, AttributeSet.class};
    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f18339c = new ThreadLocal();
    /* renamed from: d */
    static final Comparator<View> f18340d;
    /* renamed from: f */
    private static final C0430a<Rect> f18341f = new C4435c(12);
    /* renamed from: e */
    OnHierarchyChangeListener f18342e;
    /* renamed from: g */
    private final List<View> f18343g;
    /* renamed from: h */
    private final C0610h<View> f18344h;
    /* renamed from: i */
    private final List<View> f18345i;
    /* renamed from: j */
    private final List<View> f18346j;
    /* renamed from: k */
    private final int[] f18347k;
    /* renamed from: l */
    private Paint f18348l;
    /* renamed from: m */
    private boolean f18349m;
    /* renamed from: n */
    private boolean f18350n;
    /* renamed from: o */
    private int[] f18351o;
    /* renamed from: p */
    private View f18352p;
    /* renamed from: q */
    private View f18353q;
    /* renamed from: r */
    private C0166e f18354r;
    /* renamed from: s */
    private boolean f18355s;
    /* renamed from: t */
    private C0571z f18356t;
    /* renamed from: u */
    private boolean f18357u;
    /* renamed from: v */
    private Drawable f18358v;
    /* renamed from: w */
    private C0554n f18359w;
    /* renamed from: x */
    private final C0553m f18360x;

    public static abstract class Behavior<V extends View> {
        /* renamed from: a */
        public C0571z m537a(CoordinatorLayout coordinatorLayout, V v, C0571z c0571z) {
            return c0571z;
        }

        /* renamed from: a */
        public void mo123a(C0165d c0165d) {
        }

        /* renamed from: a */
        public void mo110a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        @Deprecated
        /* renamed from: a */
        public void m541a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo111a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public boolean mo112a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3730a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo124a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo4593a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo113a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo4594a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo114a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean m552a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo115a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        @Deprecated
        /* renamed from: b */
        public void m556b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: b */
        public boolean mo117b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo125b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: c */
        public int m560c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: c */
        public void m561c() {
        }

        @Deprecated
        /* renamed from: c */
        public void mo118c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: d */
        public float m563d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: d */
        public void m564d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: e */
        public boolean m565e(CoordinatorLayout coordinatorLayout, V v) {
            return m563d(coordinatorLayout, v) > null ? true : null;
        }

        /* renamed from: a */
        public boolean mo4588a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            return i2 == 0 ? mo115a(coordinatorLayout, (View) v, view, view2, i) : null;
        }

        /* renamed from: b */
        public void m557b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                m556b(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: a */
        public void mo4584a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo118c(coordinatorLayout, v, view);
            }
        }

        /* renamed from: a */
        public void mo4585a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                m541a(coordinatorLayout, (View) v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo4586a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo111a(coordinatorLayout, (View) v, view, i, i2, iArr);
            }
        }

        /* renamed from: b */
        public Parcelable mo116b(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$a */
    public interface C0162a {
        /* renamed from: a */
        Behavior m569a();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.design.widget.CoordinatorLayout$b */
    public @interface C0163b {
        /* renamed from: a */
        Class<? extends Behavior> m570a();
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$c */
    private class C0164c implements OnHierarchyChangeListener {
        /* renamed from: a */
        final /* synthetic */ CoordinatorLayout f596a;

        C0164c(CoordinatorLayout coordinatorLayout) {
            this.f596a = coordinatorLayout;
        }

        public void onChildViewAdded(View view, View view2) {
            if (this.f596a.f18342e != null) {
                this.f596a.f18342e.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            this.f596a.m24120a(2);
            if (this.f596a.f18342e != null) {
                this.f596a.f18342e.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$d */
    public static class C0165d extends MarginLayoutParams {
        /* renamed from: a */
        Behavior f597a;
        /* renamed from: b */
        boolean f598b = false;
        /* renamed from: c */
        public int f599c = 0;
        /* renamed from: d */
        public int f600d = 0;
        /* renamed from: e */
        public int f601e = -1;
        /* renamed from: f */
        int f602f = -1;
        /* renamed from: g */
        public int f603g = 0;
        /* renamed from: h */
        public int f604h = 0;
        /* renamed from: i */
        int f605i;
        /* renamed from: j */
        int f606j;
        /* renamed from: k */
        View f607k;
        /* renamed from: l */
        View f608l;
        /* renamed from: m */
        final Rect f609m = new Rect();
        /* renamed from: n */
        Object f610n;
        /* renamed from: o */
        private boolean f611o;
        /* renamed from: p */
        private boolean f612p;
        /* renamed from: q */
        private boolean f613q;
        /* renamed from: r */
        private boolean f614r;

        public C0165d(int i, int i2) {
            super(i, i2);
        }

        C0165d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0069c.CoordinatorLayout_Layout);
            this.f599c = obtainStyledAttributes.getInteger(C0069c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f602f = obtainStyledAttributes.getResourceId(C0069c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f600d = obtainStyledAttributes.getInteger(C0069c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f601e = obtainStyledAttributes.getInteger(C0069c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f603g = obtainStyledAttributes.getInt(C0069c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f604h = obtainStyledAttributes.getInt(C0069c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f598b = obtainStyledAttributes.hasValue(C0069c.CoordinatorLayout_Layout_layout_behavior);
            if (this.f598b) {
                this.f597a = CoordinatorLayout.m24093a(context, attributeSet, obtainStyledAttributes.getString(C0069c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            if (this.f597a != null) {
                this.f597a.mo123a(this);
            }
        }

        public C0165d(C0165d c0165d) {
            super(c0165d);
        }

        public C0165d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0165d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int m574a() {
            return this.f602f;
        }

        /* renamed from: b */
        public Behavior m582b() {
            return this.f597a;
        }

        /* renamed from: a */
        public void m578a(Behavior behavior) {
            if (this.f597a != behavior) {
                if (this.f597a != null) {
                    this.f597a.m561c();
                }
                this.f597a = behavior;
                this.f610n = null;
                this.f598b = true;
                if (behavior != null) {
                    behavior.mo123a(this);
                }
            }
        }

        /* renamed from: a */
        void m577a(Rect rect) {
            this.f609m.set(rect);
        }

        /* renamed from: c */
        Rect m585c() {
            return this.f609m;
        }

        /* renamed from: d */
        boolean m586d() {
            return this.f607k == null && this.f602f != -1;
        }

        /* renamed from: e */
        boolean m587e() {
            if (this.f597a == null) {
                this.f611o = false;
            }
            return this.f611o;
        }

        /* renamed from: a */
        boolean m580a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f611o) {
                return true;
            }
            coordinatorLayout = (this.f597a != null ? this.f597a.m565e(coordinatorLayout, view) : null) | this.f611o;
            this.f611o = coordinatorLayout;
            return coordinatorLayout;
        }

        /* renamed from: f */
        void m588f() {
            this.f611o = false;
        }

        /* renamed from: a */
        void m575a(int i) {
            m576a(i, false);
        }

        /* renamed from: a */
        void m576a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f612p = z;
                    return;
                case 1:
                    this.f613q = z;
                    return;
                default:
                    return;
            }
        }

        /* renamed from: b */
        boolean m584b(int i) {
            switch (i) {
                case 0:
                    return this.f612p;
                case 1:
                    return this.f613q;
                default:
                    return false;
            }
        }

        /* renamed from: g */
        boolean m589g() {
            return this.f614r;
        }

        /* renamed from: a */
        void m579a(boolean z) {
            this.f614r = z;
        }

        /* renamed from: h */
        void m590h() {
            this.f614r = false;
        }

        /* renamed from: a */
        boolean m581a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (!(view2 == this.f608l || m572a(view2, C0560r.m2193e(coordinatorLayout)))) {
                if (this.f597a == null || this.f597a.mo4594a(coordinatorLayout, view, view2) == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: b */
        View m583b(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f602f == -1) {
                this.f608l = null;
                this.f607k = null;
                return null;
            }
            if (this.f607k == null || !m573b(view, coordinatorLayout)) {
                m571a(view, coordinatorLayout);
            }
            return this.f607k;
        }

        /* renamed from: a */
        private void m571a(View view, CoordinatorLayout coordinatorLayout) {
            this.f607k = coordinatorLayout.findViewById(this.f602f);
            if (this.f607k != null) {
                if (this.f607k != coordinatorLayout) {
                    View view2 = this.f607k;
                    View parent = this.f607k.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode() != null) {
                            this.f608l = null;
                            this.f607k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f608l = view2;
                } else if (coordinatorLayout.isInEditMode() != null) {
                    this.f608l = null;
                    this.f607k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f608l = null;
                this.f607k = null;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not find CoordinatorLayout descendant view with id ");
                stringBuilder.append(coordinatorLayout.getResources().getResourceName(this.f602f));
                stringBuilder.append(" to anchor view ");
                stringBuilder.append(view);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        /* renamed from: b */
        private boolean m573b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f607k.getId() != this.f602f) {
                return false;
            }
            View view2 = this.f607k;
            View parent = this.f607k.getParent();
            while (parent != coordinatorLayout) {
                if (parent != null) {
                    if (parent != view) {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                        parent = parent.getParent();
                    }
                }
                this.f608l = null;
                this.f607k = null;
                return false;
            }
            this.f608l = view2;
            return true;
        }

        /* renamed from: a */
        private boolean m572a(View view, int i) {
            view = C0543c.m2037a(((C0165d) view.getLayoutParams()).f603g, i);
            return (view == null || (C0543c.m2037a(this.f604h, i) & view) != view) ? null : true;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$e */
    class C0166e implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ CoordinatorLayout f615a;

        C0166e(CoordinatorLayout coordinatorLayout) {
            this.f615a = coordinatorLayout;
        }

        public boolean onPreDraw() {
            this.f615a.m24120a(0);
            return true;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$f */
    static class C0167f implements Comparator<View> {
        C0167f() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m591a((View) obj, (View) obj2);
        }

        /* renamed from: a */
        public int m591a(View view, View view2) {
            view = C0560r.m2213y(view);
            view2 = C0560r.m2213y(view2);
            if (view > view2) {
                return -1;
            }
            return view < view2 ? 1 : null;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$1 */
    class C30501 implements C0554n {
        /* renamed from: a */
        final /* synthetic */ CoordinatorLayout f12880a;

        C30501(CoordinatorLayout coordinatorLayout) {
            this.f12880a = coordinatorLayout;
        }

        /* renamed from: a */
        public C0571z mo88a(View view, C0571z c0571z) {
            return this.f12880a.m24118a(c0571z);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C01611();
        /* renamed from: a */
        SparseArray<Parcelable> f12881a;

        /* renamed from: android.support.design.widget.CoordinatorLayout$SavedState$1 */
        static class C01611 implements ClassLoaderCreator<SavedState> {
            C01611() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m566a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m567a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m568a(i);
            }

            /* renamed from: a */
            public SavedState m567a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m566a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m568a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            parcel = parcel.readParcelableArray(classLoader);
            this.f12881a = new SparseArray(readInt);
            for (classLoader = null; classLoader < readInt; classLoader++) {
                this.f12881a.append(iArr[classLoader], parcel[classLoader]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int size = this.f12881a != null ? this.f12881a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f12881a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f12881a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: c */
    private static int m24105c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m24106d(int i) {
        return i == 0 ? 8388661 : i;
    }

    /* renamed from: e */
    private static int m24108e(int i) {
        return i == 0 ? 17 : i;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m24139d();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m24115a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m24117a(layoutParams);
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f18337a = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f18340d = new C0167f();
        } else {
            f18340d = null;
        }
    }

    /* renamed from: e */
    private static Rect m24109e() {
        Rect rect = (Rect) f18341f.mo338a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: a */
    private static void m24094a(Rect rect) {
        rect.setEmpty();
        f18341f.mo339a(rect);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0067a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18343g = new ArrayList();
        this.f18344h = new C0610h();
        this.f18345i = new ArrayList();
        this.f18346j = new ArrayList();
        this.f18347k = new int[2];
        this.f18360x = new C0553m(this);
        int i2 = 0;
        if (i == 0) {
            attributeSet = context.obtainStyledAttributes(attributeSet, C0069c.CoordinatorLayout, 0, C0068b.Widget_Support_CoordinatorLayout);
        } else {
            attributeSet = context.obtainStyledAttributes(attributeSet, C0069c.CoordinatorLayout, i, 0);
        }
        i = attributeSet.getResourceId(C0069c.CoordinatorLayout_keylines, 0);
        if (i != 0) {
            context = context.getResources();
            this.f18351o = context.getIntArray(i);
            context = context.getDisplayMetrics().density;
            i = this.f18351o.length;
            while (i2 < i) {
                this.f18351o[i2] = (int) (((float) this.f18351o[i2]) * context);
                i2++;
            }
        }
        this.f18358v = attributeSet.getDrawable(C0069c.CoordinatorLayout_statusBarBackground);
        attributeSet.recycle();
        m24114g();
        super.setOnHierarchyChangeListener(new C0164c(this));
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f18342e = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m24100a(false);
        if (this.f18355s) {
            if (this.f18354r == null) {
                this.f18354r = new C0166e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f18354r);
        }
        if (this.f18356t == null && C0560r.m2205q(this)) {
            C0560r.m2204p(this);
        }
        this.f18350n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m24100a(false);
        if (this.f18355s && this.f18354r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f18354r);
        }
        if (this.f18353q != null) {
            onStopNestedScroll(this.f18353q);
        }
        this.f18350n = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        if (this.f18358v != drawable) {
            Drawable drawable2 = null;
            if (this.f18358v != null) {
                this.f18358v.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f18358v = drawable2;
            if (this.f18358v != null) {
                if (this.f18358v.isStateful() != null) {
                    this.f18358v.setState(getDrawableState());
                }
                C0295a.m1056b(this.f18358v, C0560r.m2193e(this));
                this.f18358v.setVisible(getVisibility() == 0, false);
                this.f18358v.setCallback(this);
            }
            C0560r.m2189c(this);
        }
    }

    public Drawable getStatusBarBackground() {
        return this.f18358v;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f18358v;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = 0 | drawable.setState(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.f18358v) {
                return null;
            }
        }
        return true;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f18358v != null && this.f18358v.isVisible() != z) {
            this.f18358v.setVisible(z, false);
        }
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0389b.m1429a(getContext(), i) : 0);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    /* renamed from: a */
    final C0571z m24118a(C0571z c0571z) {
        if (C0428i.m1569a(this.f18356t, c0571z)) {
            return c0571z;
        }
        this.f18356t = c0571z;
        boolean z = true;
        boolean z2 = c0571z != null && c0571z.m2253b() > 0;
        this.f18357u = z2;
        if (this.f18357u || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        c0571z = m24103b(c0571z);
        requestLayout();
        return c0571z;
    }

    public final C0571z getLastWindowInsets() {
        return this.f18356t;
    }

    /* renamed from: a */
    private void m24100a(boolean z) {
        boolean childCount = getChildCount();
        for (boolean z2 = false; z2 < childCount; z2++) {
            View childAt = getChildAt(z2);
            Behavior b = ((C0165d) childAt.getLayoutParams()).m582b();
            if (b != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    b.mo113a(this, childAt, obtain);
                } else {
                    b.mo117b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (z = false; z < childCount; z++) {
            ((C0165d) getChildAt(z).getLayoutParams()).m588f();
        }
        this.f18352p = false;
        this.f18349m = false;
    }

    /* renamed from: a */
    private void m24099a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        if (f18340d != null) {
            Collections.sort(list, f18340d);
        }
    }

    /* renamed from: a */
    private boolean m24101a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f18345i;
        m24099a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        Object obj = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C0165d c0165d = (C0165d) view.getLayoutParams();
            Behavior b = c0165d.m582b();
            if ((z || r8 != null) && actionMasked != 0) {
                if (b != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i) {
                        case 0:
                            b.mo113a(r0, view, motionEvent3);
                            break;
                        case 1:
                            b.mo117b(r0, view, motionEvent3);
                            break;
                        default:
                            break;
                    }
                }
            } else {
                if (!(z || b == null)) {
                    switch (i) {
                        case 0:
                            z = b.mo113a(r0, view, motionEvent2);
                            break;
                        case 1:
                            z = b.mo117b(r0, view, motionEvent2);
                            break;
                        default:
                            break;
                    }
                    if (z) {
                        r0.f18352p = view;
                    }
                }
                boolean e = c0165d.m587e();
                boolean a = c0165d.m580a(r0, view);
                obj = (!a || e) ? null : 1;
                if (a && obj == null) {
                    list.clear();
                    return z;
                }
            }
        }
        list.clear();
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m24100a(true);
        }
        motionEvent = m24101a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m24100a(true);
        }
        return motionEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean b;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        boolean a;
        Behavior b2;
        if (this.f18352p == null) {
            a = m24101a(motionEvent3, 1);
            if (a) {
                b2 = ((C0165d) r0.f18352p.getLayoutParams()).m582b();
                if (b2 != null) {
                    b = b2.mo117b(r0, r0.f18352p, motionEvent3);
                    motionEvent2 = null;
                    if (r0.f18352p != null) {
                        b |= super.onTouchEvent(motionEvent);
                    } else if (a) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        super.onTouchEvent(motionEvent2);
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    if (actionMasked == 1 || actionMasked == 3) {
                        m24100a(false);
                    }
                    return b;
                }
            }
        }
        a = false;
        b2 = ((C0165d) r0.f18352p.getLayoutParams()).m582b();
        if (b2 != null) {
            b = b2.mo117b(r0, r0.f18352p, motionEvent3);
            motionEvent2 = null;
            if (r0.f18352p != null) {
                b |= super.onTouchEvent(motionEvent);
            } else if (a) {
                long uptimeMillis2 = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            m24100a(false);
            return b;
        }
        b = false;
        motionEvent2 = null;
        if (r0.f18352p != null) {
            b |= super.onTouchEvent(motionEvent);
        } else if (a) {
            long uptimeMillis22 = SystemClock.uptimeMillis();
            motionEvent2 = MotionEvent.obtain(uptimeMillis22, uptimeMillis22, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEvent2);
        }
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        m24100a(false);
        return b;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f18349m) {
            m24100a(false);
            this.f18349m = true;
        }
    }

    /* renamed from: b */
    private int m24102b(int i) {
        if (this.f18351o == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No keylines defined for ");
            stringBuilder.append(this);
            stringBuilder.append(" - attempted index lookup ");
            stringBuilder.append(i);
            Log.e("CoordinatorLayout", stringBuilder.toString());
            return 0;
        }
        if (i >= 0) {
            if (i < this.f18351o.length) {
                return this.f18351o[i];
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Keyline index ");
        stringBuilder.append(i);
        stringBuilder.append(" out of range for ");
        stringBuilder.append(this);
        Log.e("CoordinatorLayout", stringBuilder.toString());
        return 0;
    }

    /* renamed from: a */
    static Behavior m24093a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(str);
            str = stringBuilder.toString();
        } else if (str.indexOf(46) < 0) {
            if (!TextUtils.isEmpty(f18337a)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f18337a);
                stringBuilder2.append('.');
                stringBuilder2.append(str);
                str = stringBuilder2.toString();
            }
        }
        try {
            Map map = (Map) f18339c.get();
            if (map == null) {
                map = new HashMap();
                f18339c.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f18338b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Context context2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not inflate Behavior subclass ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString(), context2);
        }
    }

    /* renamed from: a */
    C0165d m24116a(View view) {
        C0165d c0165d = (C0165d) view.getLayoutParams();
        if (!c0165d.f598b) {
            if (view instanceof C0162a) {
                Behavior a = ((C0162a) view).m569a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0165d.m578a(a);
                c0165d.f598b = true;
            } else {
                C0163b c0163b = null;
                for (view = view.getClass(); view != null; view = view.getSuperclass()) {
                    c0163b = (C0163b) view.getAnnotation(C0163b.class);
                    if (c0163b != null) {
                        break;
                    }
                }
                if (c0163b != null) {
                    try {
                        c0165d.m578a((Behavior) c0163b.m570a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (View view2) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Default behavior class ");
                        stringBuilder.append(c0163b.m570a().getName());
                        stringBuilder.append(" could not be instantiated. Did you forget");
                        stringBuilder.append(" a default constructor?");
                        Log.e("CoordinatorLayout", stringBuilder.toString(), view2);
                    }
                }
                c0165d.f598b = true;
            }
        }
        return c0165d;
    }

    /* renamed from: f */
    private void m24112f() {
        this.f18343g.clear();
        this.f18344h.m2441a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childAt = getChildAt(i);
            C0165d a = m24116a((View) childAt);
            a.m583b(this, (View) childAt);
            this.f18344h.m2442a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    Object childAt2 = getChildAt(i2);
                    if (a.m581a(this, childAt, childAt2)) {
                        if (!this.f18344h.m2445b(childAt2)) {
                            this.f18344h.m2442a(childAt2);
                        }
                        this.f18344h.m2443a(childAt2, childAt);
                    }
                }
            }
        }
        this.f18343g.addAll(this.f18344h.m2444b());
        Collections.reverse(this.f18343g);
    }

    /* renamed from: a */
    void m24126a(View view, Rect rect) {
        C0626s.m2535b(this, view, rect);
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: a */
    public void m24122a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    protected void onMeasure(int i, int i2) {
        int a;
        CoordinatorLayout coordinatorLayout = this;
        m24112f();
        m24119a();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int e = C0560r.m2193e(this);
        Object obj = e == 1 ? 1 : null;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = paddingLeft + paddingRight;
        int i4 = paddingTop + paddingBottom;
        paddingTop = getSuggestedMinimumWidth();
        paddingBottom = getSuggestedMinimumHeight();
        Object obj2 = (coordinatorLayout.f18356t == null || !C0560r.m2205q(this)) ? null : 1;
        int size3 = coordinatorLayout.f18343g.size();
        int i5 = paddingTop;
        int i6 = paddingBottom;
        int i7 = 0;
        int i8 = 0;
        while (i8 < size3) {
            int i9;
            int i10;
            View view = (View) coordinatorLayout.f18343g.get(i8);
            if (view.getVisibility() == 8) {
                i9 = i8;
                i10 = size3;
            } else {
                int max;
                int i11;
                Behavior b;
                C0165d c0165d;
                int i12;
                int i13;
                int i14;
                C0165d c0165d2 = (C0165d) view.getLayoutParams();
                if (c0165d2.f601e < 0 || mode == 0) {
                    i9 = i6;
                } else {
                    paddingTop = m24102b(c0165d2.f601e);
                    a = C0543c.m2037a(m24106d(c0165d2.f599c), e) & 7;
                    i9 = i6;
                    if ((a == 3 && obj == null) || (a == 5 && obj != null)) {
                        max = Math.max(0, (size - paddingRight) - paddingTop);
                        if (obj2 != null) {
                        }
                        a = i;
                        i11 = i2;
                        b = c0165d2.m582b();
                        if (b != null) {
                            c0165d = c0165d2;
                            i12 = i7;
                            i13 = i5;
                            i10 = size3;
                            i14 = i9;
                            i9 = i8;
                        } else {
                            c0165d = c0165d2;
                            i14 = i9;
                            i12 = i7;
                            i13 = i5;
                            i9 = i8;
                            i10 = size3;
                            if (!b.mo3730a(this, view, a, max, i11, 0)) {
                            }
                            c0165d2 = c0165d;
                            paddingTop = Math.max(i13, ((i3 + view.getMeasuredWidth()) + c0165d2.leftMargin) + c0165d2.rightMargin);
                            paddingBottom = Math.max(i14, ((i4 + view.getMeasuredHeight()) + c0165d2.topMargin) + c0165d2.bottomMargin);
                            i5 = paddingTop;
                            i7 = View.combineMeasuredStates(i12, view.getMeasuredState());
                            i6 = paddingBottom;
                        }
                        m24122a(view, a, max, i11, 0);
                        c0165d2 = c0165d;
                        paddingTop = Math.max(i13, ((i3 + view.getMeasuredWidth()) + c0165d2.leftMargin) + c0165d2.rightMargin);
                        paddingBottom = Math.max(i14, ((i4 + view.getMeasuredHeight()) + c0165d2.topMargin) + c0165d2.bottomMargin);
                        i5 = paddingTop;
                        i7 = View.combineMeasuredStates(i12, view.getMeasuredState());
                        i6 = paddingBottom;
                    } else if ((a == 5 && obj == null) || (a == 3 && obj != null)) {
                        max = Math.max(0, paddingTop - paddingLeft);
                        if (obj2 != null || C0560r.m2205q(view)) {
                            a = i;
                            i11 = i2;
                        } else {
                            i6 = coordinatorLayout.f18356t.m2253b() + coordinatorLayout.f18356t.m2255d();
                            a = MeasureSpec.makeMeasureSpec(size - (coordinatorLayout.f18356t.m2251a() + coordinatorLayout.f18356t.m2254c()), mode);
                            i11 = MeasureSpec.makeMeasureSpec(size2 - i6, mode2);
                        }
                        b = c0165d2.m582b();
                        if (b != null) {
                            c0165d = c0165d2;
                            i14 = i9;
                            i12 = i7;
                            i13 = i5;
                            i9 = i8;
                            i10 = size3;
                            if (b.mo3730a(this, view, a, max, i11, 0)) {
                            }
                            c0165d2 = c0165d;
                            paddingTop = Math.max(i13, ((i3 + view.getMeasuredWidth()) + c0165d2.leftMargin) + c0165d2.rightMargin);
                            paddingBottom = Math.max(i14, ((i4 + view.getMeasuredHeight()) + c0165d2.topMargin) + c0165d2.bottomMargin);
                            i5 = paddingTop;
                            i7 = View.combineMeasuredStates(i12, view.getMeasuredState());
                            i6 = paddingBottom;
                        } else {
                            c0165d = c0165d2;
                            i12 = i7;
                            i13 = i5;
                            i10 = size3;
                            i14 = i9;
                            i9 = i8;
                        }
                        m24122a(view, a, max, i11, 0);
                        c0165d2 = c0165d;
                        paddingTop = Math.max(i13, ((i3 + view.getMeasuredWidth()) + c0165d2.leftMargin) + c0165d2.rightMargin);
                        paddingBottom = Math.max(i14, ((i4 + view.getMeasuredHeight()) + c0165d2.topMargin) + c0165d2.bottomMargin);
                        i5 = paddingTop;
                        i7 = View.combineMeasuredStates(i12, view.getMeasuredState());
                        i6 = paddingBottom;
                    }
                }
                max = 0;
                if (obj2 != null) {
                }
                a = i;
                i11 = i2;
                b = c0165d2.m582b();
                if (b != null) {
                    c0165d = c0165d2;
                    i14 = i9;
                    i12 = i7;
                    i13 = i5;
                    i9 = i8;
                    i10 = size3;
                    if (b.mo3730a(this, view, a, max, i11, 0)) {
                    }
                    c0165d2 = c0165d;
                    paddingTop = Math.max(i13, ((i3 + view.getMeasuredWidth()) + c0165d2.leftMargin) + c0165d2.rightMargin);
                    paddingBottom = Math.max(i14, ((i4 + view.getMeasuredHeight()) + c0165d2.topMargin) + c0165d2.bottomMargin);
                    i5 = paddingTop;
                    i7 = View.combineMeasuredStates(i12, view.getMeasuredState());
                    i6 = paddingBottom;
                } else {
                    c0165d = c0165d2;
                    i12 = i7;
                    i13 = i5;
                    i10 = size3;
                    i14 = i9;
                    i9 = i8;
                }
                m24122a(view, a, max, i11, 0);
                c0165d2 = c0165d;
                paddingTop = Math.max(i13, ((i3 + view.getMeasuredWidth()) + c0165d2.leftMargin) + c0165d2.rightMargin);
                paddingBottom = Math.max(i14, ((i4 + view.getMeasuredHeight()) + c0165d2.topMargin) + c0165d2.bottomMargin);
                i5 = paddingTop;
                i7 = View.combineMeasuredStates(i12, view.getMeasuredState());
                i6 = paddingBottom;
            }
            i8 = i9 + 1;
            size3 = i10;
        }
        a = i7;
        setMeasuredDimension(View.resolveSizeAndState(i5, i, -16777216 & a), View.resolveSizeAndState(i6, i2, a << 16));
    }

    /* renamed from: b */
    private C0571z m24103b(C0571z c0571z) {
        if (c0571z.m2257f()) {
            return c0571z;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0560r.m2205q(childAt)) {
                Behavior b = ((C0165d) childAt.getLayoutParams()).m582b();
                if (b != null) {
                    c0571z = b.m537a(this, childAt, c0571z);
                    if (c0571z.m2257f()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return c0571z;
    }

    /* renamed from: a */
    public void m24121a(View view, int i) {
        C0165d c0165d = (C0165d) view.getLayoutParams();
        if (c0165d.m586d()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (c0165d.f607k != null) {
            m24098a(view, c0165d.f607k, i);
        } else if (c0165d.f601e >= 0) {
            m24104b(view, c0165d.f601e, i);
        } else {
            m24107d(view, i);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int e = C0560r.m2193e(this);
        i = this.f18343g.size();
        for (i2 = 0; i2 < i; i2++) {
            View view = (View) this.f18343g.get(i2);
            if (view.getVisibility() != 8) {
                i4 = ((C0165d) view.getLayoutParams()).m582b();
                if (i4 == 0 || i4.mo112a(this, view, e) == 0) {
                    m24121a(view, e);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f18357u && this.f18358v != null) {
            int b = this.f18356t != null ? this.f18356t.m2253b() : 0;
            if (b > 0) {
                this.f18358v.setBounds(0, 0, getWidth(), b);
                this.f18358v.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m24114g();
    }

    /* renamed from: b */
    void m24133b(View view, Rect rect) {
        ((C0165d) view.getLayoutParams()).m577a(rect);
    }

    /* renamed from: c */
    void m24138c(View view, Rect rect) {
        rect.set(((C0165d) view.getLayoutParams()).m585c());
    }

    /* renamed from: a */
    void m24127a(View view, boolean z, Rect rect) {
        if (!view.isLayoutRequested()) {
            if (view.getVisibility() != 8) {
                if (z) {
                    m24126a(view, rect);
                } else {
                    rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
                return;
            }
        }
        rect.setEmpty();
    }

    /* renamed from: a */
    private void m24096a(View view, int i, Rect rect, Rect rect2, C0165d c0165d, int i2, int i3) {
        view = C0543c.m2037a(m24108e(c0165d.f599c), i);
        i = C0543c.m2037a(m24105c(c0165d.f600d), i);
        c0165d = view & 7;
        view &= 112;
        int i4 = i & 7;
        i &= 112;
        if (i4 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i4 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i == 16) {
            i = rect.top + (rect.height() / 2);
        } else if (i != 80) {
            i = rect.top;
        } else {
            i = rect.bottom;
        }
        if (c0165d == 1) {
            i4 -= i2 / 2;
        } else if (c0165d != 5) {
            i4 -= i2;
        }
        if (view == 16) {
            i -= i3 / 2;
        } else if (view != 80) {
            i -= i3;
        }
        rect2.set(i4, i, i2 + i4, i3 + i);
    }

    /* renamed from: a */
    private void m24095a(C0165d c0165d, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        width = Math.max(getPaddingLeft() + c0165d.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - c0165d.rightMargin));
        c0165d = Math.max(getPaddingTop() + c0165d.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - c0165d.bottomMargin));
        rect.set(width, c0165d, i + width, i2 + c0165d);
    }

    /* renamed from: a */
    void m24125a(View view, int i, Rect rect, Rect rect2) {
        C0165d c0165d = (C0165d) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m24096a(view, i, rect, rect2, c0165d, measuredWidth, measuredHeight);
        m24095a(c0165d, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    private void m24098a(View view, View view2, int i) {
        C0165d c0165d = (C0165d) view.getLayoutParams();
        Rect e = m24109e();
        Rect e2 = m24109e();
        try {
            m24126a(view2, e);
            m24125a(view, i, e, e2);
            view.layout(e2.left, e2.top, e2.right, e2.bottom);
        } finally {
            m24094a(e);
            m24094a(e2);
        }
    }

    /* renamed from: b */
    private void m24104b(View view, int i, int i2) {
        C0165d c0165d = (C0165d) view.getLayoutParams();
        int a = C0543c.m2037a(m24106d(c0165d.f599c), i2);
        int i3 = a & 7;
        a &= 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        i = m24102b(i) - measuredWidth;
        i2 = 0;
        if (i3 == 1) {
            i += measuredWidth / 2;
        } else if (i3 == 5) {
            i += measuredWidth;
        }
        if (a == 16) {
            i2 = 0 + (measuredHeight / 2);
        } else if (a == 80) {
            i2 = measuredHeight + 0;
        }
        i = Math.max(getPaddingLeft() + c0165d.leftMargin, Math.min(i, ((width - getPaddingRight()) - measuredWidth) - c0165d.rightMargin));
        i2 = Math.max(getPaddingTop() + c0165d.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight) - c0165d.bottomMargin));
        view.layout(i, i2, measuredWidth + i, measuredHeight + i2);
    }

    /* renamed from: d */
    private void m24107d(View view, int i) {
        C0165d c0165d = (C0165d) view.getLayoutParams();
        Rect e = m24109e();
        e.set(getPaddingLeft() + c0165d.leftMargin, getPaddingTop() + c0165d.topMargin, (getWidth() - getPaddingRight()) - c0165d.rightMargin, (getHeight() - getPaddingBottom()) - c0165d.bottomMargin);
        if (!(this.f18356t == null || !C0560r.m2205q(this) || C0560r.m2205q(view))) {
            e.left += this.f18356t.m2251a();
            e.top += this.f18356t.m2253b();
            e.right -= this.f18356t.m2254c();
            e.bottom -= this.f18356t.m2255d();
        }
        Rect e2 = m24109e();
        C0543c.m2038a(m24105c(c0165d.f599c), view.getMeasuredWidth(), view.getMeasuredHeight(), e, e2, i);
        view.layout(e2.left, e2.top, e2.right, e2.bottom);
        m24094a(e);
        m24094a(e2);
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        C0165d c0165d = (C0165d) view.getLayoutParams();
        if (c0165d.f597a != null) {
            float d = c0165d.f597a.m563d(this, view);
            if (d > 0.0f) {
                if (this.f18348l == null) {
                    this.f18348l = new Paint();
                }
                this.f18348l.setColor(c0165d.f597a.m560c(this, view));
                this.f18348l.setAlpha(C0373a.m1375a(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f18348l);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: a */
    final void m24120a(int i) {
        int i2 = i;
        int e = C0560r.m2193e(this);
        int size = this.f18343g.size();
        Rect e2 = m24109e();
        Rect e3 = m24109e();
        Rect e4 = m24109e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) r0.f18343g.get(i3);
            C0165d c0165d = (C0165d) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                int a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (c0165d.f608l == ((View) r0.f18343g.get(i4))) {
                        m24132b(view, e);
                    }
                }
                m24127a(view, true, e3);
                if (!(c0165d.f603g == 0 || e3.isEmpty())) {
                    a = C0543c.m2037a(c0165d.f603g, e);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        e2.top = Math.max(e2.top, e3.bottom);
                    } else if (i5 == 80) {
                        e2.bottom = Math.max(e2.bottom, getHeight() - e3.top);
                    }
                    a &= 7;
                    if (a == 3) {
                        e2.left = Math.max(e2.left, e3.right);
                    } else if (a == 5) {
                        e2.right = Math.max(e2.right, getWidth() - e3.left);
                    }
                }
                if (c0165d.f604h != 0 && view.getVisibility() == 0) {
                    m24097a(view, e2, e);
                }
                if (i2 != 2) {
                    m24138c(view, e4);
                    if (!e4.equals(e3)) {
                        m24133b(view, e3);
                    }
                }
                for (a = i3 + 1; a < size; a++) {
                    View view2 = (View) r0.f18343g.get(a);
                    C0165d c0165d2 = (C0165d) view2.getLayoutParams();
                    Behavior b = c0165d2.m582b();
                    if (b != null && b.mo4594a(r0, view2, view)) {
                        if (i2 == 0 && c0165d2.m589g()) {
                            c0165d2.m590h();
                        } else {
                            boolean b2;
                            if (i2 != 2) {
                                b2 = b.mo125b(r0, view2, view);
                            } else {
                                b.m564d(r0, view2, view);
                                b2 = true;
                            }
                            if (i2 == 1) {
                                c0165d2.m579a(b2);
                            }
                        }
                    }
                }
            }
        }
        m24094a(e2);
        m24094a(e3);
        m24094a(e4);
    }

    /* renamed from: a */
    private void m24097a(View view, Rect rect, int i) {
        if (C0560r.m2212x(view) && view.getWidth() > 0) {
            if (view.getHeight() > 0) {
                C0165d c0165d = (C0165d) view.getLayoutParams();
                Behavior b = c0165d.m582b();
                Rect e = m24109e();
                Rect e2 = m24109e();
                e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                if (b == null || !b.mo124a(this, view, e)) {
                    e.set(e2);
                } else if (!e2.contains(e)) {
                    rect = new StringBuilder();
                    rect.append("Rect should be within the child's bounds. Rect:");
                    rect.append(e.toShortString());
                    rect.append(" | Bounds:");
                    rect.append(e2.toShortString());
                    throw new IllegalArgumentException(rect.toString());
                }
                m24094a(e2);
                if (e.isEmpty()) {
                    m24094a(e);
                    return;
                }
                int i2;
                Object obj;
                int height;
                i = C0543c.m2037a(c0165d.f604h, i);
                if ((i & 48) == 48) {
                    i2 = (e.top - c0165d.topMargin) - c0165d.f606j;
                    if (i2 < rect.top) {
                        m24113f(view, rect.top - i2);
                        obj = 1;
                        if ((i & 80) == 80) {
                            height = ((getHeight() - e.bottom) - c0165d.bottomMargin) + c0165d.f606j;
                            if (height < rect.bottom) {
                                m24113f(view, height - rect.bottom);
                                obj = 1;
                            }
                        }
                        if (obj == null) {
                            m24113f(view, 0);
                        }
                        if ((i & 3) == 3) {
                            i2 = (e.left - c0165d.leftMargin) - c0165d.f605i;
                            if (i2 < rect.left) {
                                m24110e(view, rect.left - i2);
                                obj = 1;
                                if ((i & 5) == 5) {
                                    i = ((getWidth() - e.right) - c0165d.rightMargin) + c0165d.f605i;
                                    if (i < rect.right) {
                                        m24110e(view, i - rect.right);
                                        obj = 1;
                                    }
                                }
                                if (obj == null) {
                                    m24110e(view, 0);
                                }
                                m24094a(e);
                            }
                        }
                        obj = null;
                        if ((i & 5) == 5) {
                            i = ((getWidth() - e.right) - c0165d.rightMargin) + c0165d.f605i;
                            if (i < rect.right) {
                                m24110e(view, i - rect.right);
                                obj = 1;
                            }
                        }
                        if (obj == null) {
                            m24110e(view, 0);
                        }
                        m24094a(e);
                    }
                }
                obj = null;
                if ((i & 80) == 80) {
                    height = ((getHeight() - e.bottom) - c0165d.bottomMargin) + c0165d.f606j;
                    if (height < rect.bottom) {
                        m24113f(view, height - rect.bottom);
                        obj = 1;
                    }
                }
                if (obj == null) {
                    m24113f(view, 0);
                }
                if ((i & 3) == 3) {
                    i2 = (e.left - c0165d.leftMargin) - c0165d.f605i;
                    if (i2 < rect.left) {
                        m24110e(view, rect.left - i2);
                        obj = 1;
                        if ((i & 5) == 5) {
                            i = ((getWidth() - e.right) - c0165d.rightMargin) + c0165d.f605i;
                            if (i < rect.right) {
                                m24110e(view, i - rect.right);
                                obj = 1;
                            }
                        }
                        if (obj == null) {
                            m24110e(view, 0);
                        }
                        m24094a(e);
                    }
                }
                obj = null;
                if ((i & 5) == 5) {
                    i = ((getWidth() - e.right) - c0165d.rightMargin) + c0165d.f605i;
                    if (i < rect.right) {
                        m24110e(view, i - rect.right);
                        obj = 1;
                    }
                }
                if (obj == null) {
                    m24110e(view, 0);
                }
                m24094a(e);
            }
        }
    }

    /* renamed from: e */
    private void m24110e(View view, int i) {
        C0165d c0165d = (C0165d) view.getLayoutParams();
        if (c0165d.f605i != i) {
            C0560r.m2192d(view, i - c0165d.f605i);
            c0165d.f605i = i;
        }
    }

    /* renamed from: f */
    private void m24113f(View view, int i) {
        C0165d c0165d = (C0165d) view.getLayoutParams();
        if (c0165d.f606j != i) {
            C0560r.m2190c(view, i - c0165d.f606j);
            c0165d.f606j = i;
        }
    }

    /* renamed from: b */
    public void m24131b(View view) {
        List c = this.f18344h.m2446c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                Behavior b = ((C0165d) view2.getLayoutParams()).m582b();
                if (b != null) {
                    b.mo125b(this, view2, view);
                }
            }
        }
    }

    /* renamed from: c */
    public List<View> m24135c(View view) {
        view = this.f18344h.m2447d(view);
        this.f18346j.clear();
        if (view != null) {
            this.f18346j.addAll(view);
        }
        return this.f18346j;
    }

    /* renamed from: d */
    public List<View> m24140d(View view) {
        view = this.f18344h.m2446c(view);
        this.f18346j.clear();
        if (view != null) {
            this.f18346j.addAll(view);
        }
        return this.f18346j;
    }

    final List<View> getDependencySortedChildren() {
        m24112f();
        return Collections.unmodifiableList(this.f18343g);
    }

    /* renamed from: a */
    void m24119a() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (m24111e(getChildAt(i))) {
                z = true;
                break;
            }
        }
        if (z == this.f18355s) {
            return;
        }
        if (z) {
            m24130b();
        } else {
            m24136c();
        }
    }

    /* renamed from: e */
    private boolean m24111e(View view) {
        return this.f18344h.m2448e(view);
    }

    /* renamed from: b */
    void m24130b() {
        if (this.f18350n) {
            if (this.f18354r == null) {
                this.f18354r = new C0166e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f18354r);
        }
        this.f18355s = true;
    }

    /* renamed from: c */
    void m24136c() {
        if (this.f18350n && this.f18354r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f18354r);
        }
        this.f18355s = false;
    }

    /* renamed from: b */
    void m24132b(View view, int i) {
        CoordinatorLayout coordinatorLayout = this;
        View view2 = view;
        C0165d c0165d = (C0165d) view.getLayoutParams();
        if (c0165d.f607k != null) {
            Rect e = m24109e();
            Rect e2 = m24109e();
            Rect e3 = m24109e();
            m24126a(c0165d.f607k, e);
            boolean z = false;
            m24127a(view2, false, e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m24096a(view, i, e, e3, c0165d, measuredWidth, measuredHeight);
            if (!(e3.left == e2.left && e3.top == e2.top)) {
                z = true;
            }
            m24095a(c0165d, e3, measuredWidth, i2);
            int i3 = e3.left - e2.left;
            int i4 = e3.top - e2.top;
            if (i3 != 0) {
                C0560r.m2192d(view2, i3);
            }
            if (i4 != 0) {
                C0560r.m2190c(view2, i4);
            }
            if (z) {
                Behavior b = c0165d.m582b();
                if (b != null) {
                    b.mo125b(coordinatorLayout, view2, c0165d.f607k);
                }
            }
            m24094a(e);
            m24094a(e2);
            m24094a(e3);
        }
    }

    /* renamed from: a */
    public boolean m24128a(View view, int i, int i2) {
        Rect e = m24109e();
        m24126a(view, e);
        try {
            view = e.contains(i, i2);
            return view;
        } finally {
            m24094a(e);
        }
    }

    /* renamed from: a */
    public C0165d m24115a(AttributeSet attributeSet) {
        return new C0165d(getContext(), attributeSet);
    }

    /* renamed from: a */
    protected C0165d m24117a(LayoutParams layoutParams) {
        if (layoutParams instanceof C0165d) {
            return new C0165d((C0165d) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0165d((MarginLayoutParams) layoutParams);
        }
        return new C0165d(layoutParams);
    }

    /* renamed from: d */
    protected C0165d m24139d() {
        return new C0165d(-2, -2);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (!(layoutParams instanceof C0165d) || super.checkLayoutParams(layoutParams) == null) ? null : true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo3727a(view, view2, i, 0);
    }

    /* renamed from: a */
    public boolean mo3727a(View view, View view2, int i, int i2) {
        CoordinatorLayout coordinatorLayout;
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            coordinatorLayout = this;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0165d c0165d = (C0165d) childAt.getLayoutParams();
                Behavior b = c0165d.m582b();
                if (b != null) {
                    boolean a = b.mo4588a(this, childAt, view, view2, i, i2);
                    boolean z2 = z | a;
                    c0165d.m576a(i3, a);
                    z = z2;
                } else {
                    c0165d.m576a(i3, false);
                }
            }
        }
        coordinatorLayout = this;
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo3728b(view, view2, i, 0);
    }

    /* renamed from: b */
    public void mo3728b(View view, View view2, int i, int i2) {
        this.f18360x.m2084a(view, view2, i, i2);
        this.f18353q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0165d c0165d = (C0165d) childAt.getLayoutParams();
            if (c0165d.m584b(i2)) {
                Behavior b = c0165d.m582b();
                if (b != null) {
                    b.m557b(this, childAt, view, view2, i, i2);
                }
            }
        }
    }

    public void onStopNestedScroll(View view) {
        mo3729c(view, 0);
    }

    /* renamed from: c */
    public void mo3729c(View view, int i) {
        this.f18360x.m2082a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0165d c0165d = (C0165d) childAt.getLayoutParams();
            if (c0165d.m584b(i)) {
                Behavior b = c0165d.m582b();
                if (b != null) {
                    b.mo4584a(this, childAt, view, i);
                }
                c0165d.m575a(i);
                c0165d.m590h();
            }
        }
        this.f18353q = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo3725a(view, i, i2, i3, i4, 0);
    }

    /* renamed from: a */
    public void mo3725a(View view, int i, int i2, int i3, int i4, int i5) {
        CoordinatorLayout coordinatorLayout = this;
        int childCount = getChildCount();
        Object obj = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i5;
            } else {
                C0165d c0165d = (C0165d) childAt.getLayoutParams();
                if (c0165d.m584b(i5)) {
                    Behavior b = c0165d.m582b();
                    if (b != null) {
                        b.mo4585a(this, childAt, view, i, i2, i3, i4, i5);
                        obj = 1;
                    }
                }
            }
        }
        if (obj != null) {
            m24120a(1);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo3726a(view, i, i2, iArr, 0);
    }

    /* renamed from: a */
    public void mo3726a(View view, int i, int i2, int[] iArr, int i3) {
        CoordinatorLayout coordinatorLayout = this;
        int childCount = getChildCount();
        Object obj = null;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0165d c0165d = (C0165d) childAt.getLayoutParams();
                if (c0165d.m584b(i3)) {
                    Behavior b = c0165d.m582b();
                    if (b != null) {
                        int max;
                        int max2;
                        int[] iArr2 = coordinatorLayout.f18347k;
                        coordinatorLayout.f18347k[1] = 0;
                        iArr2[0] = 0;
                        b.mo4586a(this, childAt, view, i, i2, coordinatorLayout.f18347k, i3);
                        if (i > 0) {
                            max = Math.max(i4, coordinatorLayout.f18347k[0]);
                        } else {
                            max = Math.min(i4, coordinatorLayout.f18347k[0]);
                        }
                        if (i2 > 0) {
                            max2 = Math.max(i5, coordinatorLayout.f18347k[1]);
                        } else {
                            max2 = Math.min(i5, coordinatorLayout.f18347k[1]);
                        }
                        i4 = max;
                        i5 = max2;
                        obj = 1;
                    }
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (obj != null) {
            m24120a(1);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0165d c0165d = (C0165d) childAt.getLayoutParams();
                if (c0165d.m584b(0)) {
                    Behavior b = c0165d.m582b();
                    if (b != null) {
                        z2 |= b.m552a(this, childAt, view, f, f2, z);
                    }
                }
            }
        }
        if (z2) {
            m24120a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0165d c0165d = (C0165d) childAt.getLayoutParams();
                if (c0165d.m584b(0)) {
                    Behavior b = c0165d.m582b();
                    if (b != null) {
                        z |= b.mo114a(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    public int getNestedScrollAxes() {
        return this.f18360x.m2080a();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.m1885a());
            parcelable = savedState.f12881a;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                Behavior b = m24116a(childAt).m582b();
                if (!(id == -1 || b == null)) {
                    Parcelable parcelable2 = (Parcelable) parcelable.get(id);
                    if (parcelable2 != null) {
                        b.mo110a(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior b = ((C0165d) childAt.getLayoutParams()).m582b();
            if (!(id == -1 || b == null)) {
                Parcelable b2 = b.mo116b(this, childAt);
                if (b2 != null) {
                    sparseArray.append(id, b2);
                }
            }
        }
        savedState.f12881a = sparseArray;
        return savedState;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior b = ((C0165d) view.getLayoutParams()).m582b();
        if (b == null || !b.mo4593a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* renamed from: g */
    private void m24114g() {
        if (VERSION.SDK_INT >= 21) {
            if (C0560r.m2205q(this)) {
                if (this.f18359w == null) {
                    this.f18359w = new C30501(this);
                }
                C0560r.m2176a((View) this, this.f18359w);
                setSystemUiVisibility(1280);
            } else {
                C0560r.m2176a((View) this, null);
            }
        }
    }
}
