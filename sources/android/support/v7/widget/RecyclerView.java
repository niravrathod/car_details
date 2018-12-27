package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.os.C0509c;
import android.support.v4.p017f.C0432l;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0549g;
import android.support.v4.view.C0551j;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0561s;
import android.support.v4.view.C3167i;
import android.support.v4.view.p018a.C0528a;
import android.support.v4.view.p018a.C0532b;
import android.support.v4.view.p018a.C0532b.C0530b;
import android.support.v4.view.p018a.C0532b.C0531c;
import android.support.v4.widget.C0612i;
import android.support.v7.p026e.C0693a.C0684a;
import android.support.v7.p026e.C0693a.C0685b;
import android.support.v7.widget.C0872u.C0871b;
import android.support.v7.widget.C3261e.C0857a;
import android.support.v7.widget.C3261e.C0858b;
import android.support.v7.widget.ad.C3255a;
import android.support.v7.widget.be.C0848b;
import android.support.v7.widget.bf.C0850b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements C3167i {
    /* renamed from: I */
    static final Interpolator f18591I = new C07693();
    /* renamed from: J */
    private static final int[] f18592J = new int[]{16843830};
    /* renamed from: K */
    private static final int[] f18593K = new int[]{16842987};
    /* renamed from: L */
    private static final boolean f18594L = (VERSION.SDK_INT < 21);
    /* renamed from: M */
    private static final boolean f18595M = (VERSION.SDK_INT > 15);
    /* renamed from: N */
    private static final boolean f18596N = (VERSION.SDK_INT > 15);
    /* renamed from: O */
    private static final Class<?>[] f18597O = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    /* renamed from: a */
    static final boolean f18598a;
    /* renamed from: b */
    static final boolean f18599b = (VERSION.SDK_INT < 23);
    /* renamed from: c */
    static final boolean f18600c = (VERSION.SDK_INT < 16);
    /* renamed from: A */
    ad f18601A;
    /* renamed from: B */
    C3255a f18602B;
    /* renamed from: C */
    final C0795s f18603C;
    /* renamed from: D */
    boolean f18604D;
    /* renamed from: E */
    boolean f18605E;
    /* renamed from: F */
    boolean f18606F;
    /* renamed from: G */
    ak f18607G;
    /* renamed from: H */
    final List<C0798v> f18608H;
    /* renamed from: P */
    private final C3250q f18609P;
    /* renamed from: Q */
    private SavedState f18610Q;
    /* renamed from: R */
    private final Rect f18611R;
    /* renamed from: S */
    private final ArrayList<C0786l> f18612S;
    /* renamed from: T */
    private C0786l f18613T;
    /* renamed from: U */
    private int f18614U;
    /* renamed from: V */
    private boolean f18615V;
    /* renamed from: W */
    private int f18616W;
    private C0774d aA;
    private final int[] aB;
    private C0551j aC;
    private final int[] aD;
    private final int[] aE;
    private final int[] aF;
    private Runnable aG;
    private final C0850b aH;
    private final AccessibilityManager aa;
    private List<C0784j> ab;
    private int ac;
    private int ad;
    private C0775e ae;
    private EdgeEffect af;
    private EdgeEffect ag;
    private EdgeEffect ah;
    private EdgeEffect ai;
    private int aj;
    private int ak;
    private VelocityTracker al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private C0785k ar;
    private final int as;
    private final int at;
    private float au;
    private float av;
    private boolean aw;
    private C0787m ax;
    private List<C0787m> ay;
    private C0777b az;
    /* renamed from: d */
    final C0790o f18617d;
    /* renamed from: e */
    C3261e f18618e;
    /* renamed from: f */
    C0872u f18619f;
    /* renamed from: g */
    final bf f18620g;
    /* renamed from: h */
    boolean f18621h;
    /* renamed from: i */
    final Runnable f18622i;
    /* renamed from: j */
    final Rect f18623j;
    /* renamed from: k */
    final RectF f18624k;
    /* renamed from: l */
    C0771a f18625l;
    /* renamed from: m */
    C0783i f18626m;
    /* renamed from: n */
    C0791p f18627n;
    /* renamed from: o */
    final ArrayList<C0780h> f18628o;
    /* renamed from: p */
    boolean f18629p;
    /* renamed from: q */
    boolean f18630q;
    /* renamed from: r */
    boolean f18631r;
    /* renamed from: s */
    boolean f18632s;
    /* renamed from: t */
    boolean f18633t;
    /* renamed from: u */
    boolean f18634u;
    /* renamed from: v */
    boolean f18635v;
    /* renamed from: w */
    boolean f18636w;
    /* renamed from: x */
    boolean f18637x;
    /* renamed from: y */
    C0779f f18638y;
    /* renamed from: z */
    final C0797u f18639z;

    /* renamed from: android.support.v7.widget.RecyclerView$1 */
    class C07671 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ RecyclerView f2466a;

        C07671(RecyclerView recyclerView) {
            this.f2466a = recyclerView;
        }

        public void run() {
            if (this.f2466a.f18632s) {
                if (!this.f2466a.isLayoutRequested()) {
                    if (!this.f2466a.f18629p) {
                        this.f2466a.requestLayout();
                    } else if (this.f2466a.f18634u) {
                        this.f2466a.f18633t = true;
                    } else {
                        this.f2466a.m24669d();
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$2 */
    class C07682 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ RecyclerView f2467a;

        C07682(RecyclerView recyclerView) {
            this.f2467a = recyclerView;
        }

        public void run() {
            if (this.f2467a.f18638y != null) {
                this.f2467a.f18638y.mo3867a();
            }
            this.f2467a.f18606F = false;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$3 */
    static class C07693 implements Interpolator {
        public float getInterpolation(float f) {
            f -= 1.0f;
            return ((((f * f) * f) * f) * f) + 1.0f;
        }

        C07693() {
        }
    }

    public static class LayoutParams extends MarginLayoutParams {
        /* renamed from: c */
        C0798v f2468c;
        /* renamed from: d */
        final Rect f2469d = new Rect();
        /* renamed from: e */
        boolean f2470e = true;
        /* renamed from: f */
        boolean f2471f = false;

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

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: c */
        public boolean m2939c() {
            return this.f2468c.m3295n();
        }

        /* renamed from: d */
        public boolean m2940d() {
            return this.f2468c.m3298q();
        }

        /* renamed from: e */
        public boolean m2941e() {
            return this.f2468c.m3305x();
        }

        /* renamed from: f */
        public int m2942f() {
            return this.f2468c.i_();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$a */
    public static abstract class C0771a<VH extends C0798v> {
        /* renamed from: a */
        private final C0772b f2472a = new C0772b();
        /* renamed from: b */
        private boolean f2473b = false;

        /* renamed from: a */
        public abstract int mo91a();

        /* renamed from: a */
        public long mo92a(int i) {
            return -1;
        }

        /* renamed from: a */
        public void mo93a(VH vh) {
        }

        /* renamed from: a */
        public abstract void mo94a(VH vh, int i);

        /* renamed from: a */
        public void m2954a(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public int mo95b(int i) {
            return 0;
        }

        /* renamed from: b */
        public abstract VH mo96b(ViewGroup viewGroup, int i);

        /* renamed from: b */
        public void m2960b(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public boolean m2961b(VH vh) {
            return false;
        }

        /* renamed from: c */
        public void m2964c(VH vh) {
        }

        /* renamed from: d */
        public void m2965d(VH vh) {
        }

        /* renamed from: a */
        public void m2953a(VH vh, int i, List<Object> list) {
            mo94a((C0798v) vh, i);
        }

        /* renamed from: c */
        public final VH m2962c(ViewGroup viewGroup, int i) {
            try {
                C0509c.m1881a("RV CreateView");
                viewGroup = mo96b(viewGroup, i);
                if (viewGroup.f2560a.getParent() == null) {
                    viewGroup.f2565f = i;
                    return viewGroup;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0509c.m1880a();
            }
        }

        /* renamed from: b */
        public final void m2959b(VH vh, int i) {
            vh.f2562c = i;
            if (m2966d()) {
                vh.f2564e = mo92a(i);
            }
            vh.m3278a(1, 519);
            C0509c.m1881a("RV OnBindView");
            m2953a((C0798v) vh, i, vh.m3302u());
            vh.m3301t();
            vh = vh.f2560a.getLayoutParams();
            if ((vh instanceof LayoutParams) != 0) {
                ((LayoutParams) vh).f2470e = true;
            }
            C0509c.m1880a();
        }

        /* renamed from: d */
        public final boolean m2966d() {
            return this.f2473b;
        }

        /* renamed from: a */
        public void m2950a(C0773c c0773c) {
            this.f2472a.registerObserver(c0773c);
        }

        /* renamed from: b */
        public void m2958b(C0773c c0773c) {
            this.f2472a.unregisterObserver(c0773c);
        }

        /* renamed from: e */
        public final void m2967e() {
            this.f2472a.m2968a();
        }

        /* renamed from: a */
        public final void m2949a(int i, int i2, Object obj) {
            this.f2472a.m2970a(i, i2, obj);
        }

        /* renamed from: a */
        public final void m2948a(int i, int i2) {
            this.f2472a.m2972c(i, i2);
        }

        /* renamed from: b */
        public final void m2957b(int i, int i2) {
            this.f2472a.m2969a(i, i2);
        }

        /* renamed from: c */
        public final void m2963c(int i, int i2) {
            this.f2472a.m2971b(i, i2);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$b */
    static class C0772b extends Observable<C0773c> {
        C0772b() {
        }

        /* renamed from: a */
        public void m2968a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0773c) this.mObservers.get(size)).mo736a();
            }
        }

        /* renamed from: a */
        public void m2970a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0773c) this.mObservers.get(size)).mo738a(i, i2, obj);
            }
        }

        /* renamed from: a */
        public void m2969a(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0773c) this.mObservers.get(size)).mo739b(i, i2);
            }
        }

        /* renamed from: b */
        public void m2971b(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0773c) this.mObservers.get(size)).mo740c(i, i2);
            }
        }

        /* renamed from: c */
        public void m2972c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0773c) this.mObservers.get(size)).mo737a(i, i2, 1);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$c */
    public static abstract class C0773c {
        /* renamed from: a */
        public void mo736a() {
        }

        /* renamed from: a */
        public void m2974a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo737a(int i, int i2, int i3) {
        }

        /* renamed from: b */
        public void mo739b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo740c(int i, int i2) {
        }

        /* renamed from: a */
        public void mo738a(int i, int i2, Object obj) {
            m2974a(i, i2);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$d */
    public interface C0774d {
        /* renamed from: a */
        int m2979a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$e */
    public static class C0775e {
        /* renamed from: a */
        protected EdgeEffect m2980a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$f */
    public static abstract class C0779f {
        /* renamed from: a */
        private C0777b f2478a = null;
        /* renamed from: b */
        private ArrayList<C0776a> f2479b = new ArrayList();
        /* renamed from: c */
        private long f2480c = 120;
        /* renamed from: d */
        private long f2481d = 120;
        /* renamed from: e */
        private long f2482e = 250;
        /* renamed from: f */
        private long f2483f = 250;

        /* renamed from: android.support.v7.widget.RecyclerView$f$a */
        public interface C0776a {
            /* renamed from: a */
            void m2981a();
        }

        /* renamed from: android.support.v7.widget.RecyclerView$f$b */
        interface C0777b {
            /* renamed from: a */
            void mo730a(C0798v c0798v);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$f$c */
        public static class C0778c {
            /* renamed from: a */
            public int f2474a;
            /* renamed from: b */
            public int f2475b;
            /* renamed from: c */
            public int f2476c;
            /* renamed from: d */
            public int f2477d;

            /* renamed from: a */
            public C0778c m2983a(C0798v c0798v) {
                return m2984a(c0798v, 0);
            }

            /* renamed from: a */
            public C0778c m2984a(C0798v c0798v, int i) {
                c0798v = c0798v.f2560a;
                this.f2474a = c0798v.getLeft();
                this.f2475b = c0798v.getTop();
                this.f2476c = c0798v.getRight();
                this.f2477d = c0798v.getBottom();
                return this;
            }
        }

        /* renamed from: a */
        public abstract void mo3867a();

        /* renamed from: a */
        public abstract boolean mo781a(C0798v c0798v, C0778c c0778c, C0778c c0778c2);

        /* renamed from: a */
        public abstract boolean mo782a(C0798v c0798v, C0798v c0798v2, C0778c c0778c, C0778c c0778c2);

        /* renamed from: b */
        public abstract boolean mo3872b();

        /* renamed from: b */
        public abstract boolean mo783b(C0798v c0798v, C0778c c0778c, C0778c c0778c2);

        /* renamed from: c */
        public abstract boolean mo784c(C0798v c0798v, C0778c c0778c, C0778c c0778c2);

        /* renamed from: d */
        public abstract void mo3874d();

        /* renamed from: d */
        public abstract void mo3875d(C0798v c0798v);

        /* renamed from: g */
        public void m3002g(C0798v c0798v) {
        }

        /* renamed from: h */
        public boolean mo785h(C0798v c0798v) {
            return true;
        }

        /* renamed from: e */
        public long m2998e() {
            return this.f2482e;
        }

        /* renamed from: f */
        public long m2999f() {
            return this.f2480c;
        }

        /* renamed from: g */
        public long m3001g() {
            return this.f2481d;
        }

        /* renamed from: h */
        public long m3003h() {
            return this.f2483f;
        }

        /* renamed from: a */
        void m2989a(C0777b c0777b) {
            this.f2478a = c0777b;
        }

        /* renamed from: a */
        public C0778c m2987a(C0795s c0795s, C0798v c0798v, int i, List<Object> list) {
            return m3006j().m2983a(c0798v);
        }

        /* renamed from: a */
        public C0778c m2986a(C0795s c0795s, C0798v c0798v) {
            return m3006j().m2983a(c0798v);
        }

        /* renamed from: e */
        static int m2985e(C0798v c0798v) {
            int d = c0798v.f2573n & 14;
            if (c0798v.m3295n()) {
                return 4;
            }
            if ((d & 4) == 0) {
                int f = c0798v.m3287f();
                c0798v = c0798v.m3286e();
                if (!(f == -1 || c0798v == -1 || f == c0798v)) {
                    d |= 2048;
                }
            }
            return d;
        }

        /* renamed from: f */
        public final void m3000f(C0798v c0798v) {
            m3002g(c0798v);
            if (this.f2478a != null) {
                this.f2478a.mo730a(c0798v);
            }
        }

        /* renamed from: a */
        public boolean mo3871a(C0798v c0798v, List<Object> list) {
            return mo785h(c0798v);
        }

        /* renamed from: i */
        public final void m3005i() {
            int size = this.f2479b.size();
            for (int i = 0; i < size; i++) {
                ((C0776a) this.f2479b.get(i)).m2981a();
            }
            this.f2479b.clear();
        }

        /* renamed from: j */
        public C0778c m3006j() {
            return new C0778c();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$h */
    public static abstract class C0780h {
        @Deprecated
        /* renamed from: a */
        public void m3007a(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        /* renamed from: b */
        public void m3011b(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void m3012b(Canvas canvas, RecyclerView recyclerView, C0795s c0795s) {
            m3007a(canvas, recyclerView);
        }

        /* renamed from: a */
        public void mo758a(Canvas canvas, RecyclerView recyclerView, C0795s c0795s) {
            m3011b(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: a */
        public void m3009a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: a */
        public void mo930a(Rect rect, View view, RecyclerView recyclerView, C0795s c0795s) {
            m3009a(rect, ((LayoutParams) view.getLayoutParams()).m2942f(), recyclerView);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$i */
    public static abstract class C0783i {
        /* renamed from: a */
        private final C0848b f2488a = new C32481(this);
        /* renamed from: b */
        private final C0848b f2489b = new C32492(this);
        /* renamed from: c */
        private boolean f2490c = true;
        /* renamed from: d */
        private boolean f2491d = true;
        /* renamed from: e */
        private int f2492e;
        /* renamed from: f */
        private int f2493f;
        /* renamed from: g */
        private int f2494g;
        /* renamed from: h */
        private int f2495h;
        /* renamed from: p */
        C0872u f2496p;
        /* renamed from: q */
        RecyclerView f2497q;
        /* renamed from: r */
        be f2498r = new be(this.f2488a);
        /* renamed from: s */
        be f2499s = new be(this.f2489b);
        /* renamed from: t */
        C0794r f2500t;
        /* renamed from: u */
        boolean f2501u = false;
        /* renamed from: v */
        boolean f2502v = false;
        /* renamed from: w */
        boolean f2503w = false;
        /* renamed from: x */
        int f2504x;
        /* renamed from: y */
        boolean f2505y;

        /* renamed from: android.support.v7.widget.RecyclerView$i$a */
        public interface C0781a {
            /* renamed from: b */
            void mo762b(int i, int i2);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$i$b */
        public static class C0782b {
            /* renamed from: a */
            public int f2484a;
            /* renamed from: b */
            public int f2485b;
            /* renamed from: c */
            public boolean f2486c;
            /* renamed from: d */
            public boolean f2487d;
        }

        /* renamed from: android.support.v7.widget.RecyclerView$i$1 */
        class C32481 implements C0848b {
            /* renamed from: a */
            final /* synthetic */ C0783i f13807a;

            C32481(C0783i c0783i) {
                this.f13807a = c0783i;
            }

            /* renamed from: a */
            public View mo733a(int i) {
                return this.f13807a.m3137j(i);
            }

            /* renamed from: a */
            public int mo731a() {
                return this.f13807a.m3026B();
            }

            /* renamed from: b */
            public int mo734b() {
                return this.f13807a.m3157z() - this.f13807a.m3028D();
            }

            /* renamed from: a */
            public int mo732a(View view) {
                return this.f13807a.m3132h(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: b */
            public int mo735b(View view) {
                return this.f13807a.m3136j(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: android.support.v7.widget.RecyclerView$i$2 */
        class C32492 implements C0848b {
            /* renamed from: a */
            final /* synthetic */ C0783i f13808a;

            C32492(C0783i c0783i) {
                this.f13808a = c0783i;
            }

            /* renamed from: a */
            public View mo733a(int i) {
                return this.f13808a.m3137j(i);
            }

            /* renamed from: a */
            public int mo731a() {
                return this.f13808a.m3027C();
            }

            /* renamed from: b */
            public int mo734b() {
                return this.f13808a.m3025A() - this.f13808a.m3029E();
            }

            /* renamed from: a */
            public int mo732a(View view) {
                return this.f13808a.m3134i(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public int mo735b(View view) {
                return this.f13808a.m3138k(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: a */
        public int mo666a(int i, C0790o c0790o, C0795s c0795s) {
            return 0;
        }

        /* renamed from: a */
        public abstract LayoutParams mo667a();

        /* renamed from: a */
        public View mo668a(View view, int i, C0790o c0790o, C0795s c0795s) {
            return null;
        }

        /* renamed from: a */
        public void mo669a(int i, int i2, C0795s c0795s, C0781a c0781a) {
        }

        /* renamed from: a */
        public void mo670a(int i, C0781a c0781a) {
        }

        /* renamed from: a */
        public void mo671a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void m3049a(C0771a c0771a, C0771a c0771a2) {
        }

        /* renamed from: a */
        public void mo672a(C0795s c0795s) {
        }

        /* renamed from: a */
        public void mo746a(RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo747a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo748a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public boolean mo750a(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: a */
        public boolean m3077a(C0790o c0790o, C0795s c0795s, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean m3082a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: b */
        public int mo677b(int i, C0790o c0790o, C0795s c0795s) {
            return 0;
        }

        /* renamed from: b */
        public void mo752b(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo678b() {
            return false;
        }

        /* renamed from: c */
        public int mo679c(C0795s c0795s) {
            return 0;
        }

        /* renamed from: c */
        public void m3103c(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d */
        public int m3108d(C0790o c0790o, C0795s c0795s) {
            return 0;
        }

        /* renamed from: d */
        public int mo683d(C0795s c0795s) {
            return 0;
        }

        /* renamed from: d */
        public Parcelable mo685d() {
            return null;
        }

        /* renamed from: d */
        public View m3112d(View view, int i) {
            return null;
        }

        /* renamed from: d */
        public void m3114d(RecyclerView recyclerView) {
        }

        /* renamed from: e */
        public int mo686e(C0795s c0795s) {
            return 0;
        }

        /* renamed from: e */
        public void mo687e(int i) {
        }

        @Deprecated
        /* renamed from: e */
        public void m3120e(RecyclerView recyclerView) {
        }

        /* renamed from: e */
        public boolean mo688e() {
            return false;
        }

        /* renamed from: e */
        public boolean m3122e(C0790o c0790o, C0795s c0795s) {
            return false;
        }

        /* renamed from: f */
        public int mo689f(C0795s c0795s) {
            return 0;
        }

        /* renamed from: f */
        public boolean mo690f() {
            return false;
        }

        /* renamed from: g */
        public int mo691g(C0795s c0795s) {
            return 0;
        }

        /* renamed from: h */
        public int mo692h(C0795s c0795s) {
            return 0;
        }

        /* renamed from: l */
        boolean mo693l() {
            return false;
        }

        /* renamed from: m */
        public void mo755m(int i) {
        }

        /* renamed from: v */
        public int m3153v() {
            return -1;
        }

        /* renamed from: b */
        void m3090b(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f2497q = null;
                this.f2496p = null;
                this.f2494g = 0;
                this.f2495h = 0;
            } else {
                this.f2497q = recyclerView;
                this.f2496p = recyclerView.f18619f;
                this.f2494g = recyclerView.getWidth();
                this.f2495h = recyclerView.getHeight();
            }
            this.f2492e = 1073741824;
            this.f2493f = 1073741824;
        }

        /* renamed from: d */
        void m3113d(int i, int i2) {
            this.f2494g = MeasureSpec.getSize(i);
            this.f2492e = MeasureSpec.getMode(i);
            if (this.f2492e == 0 && RecyclerView.f18599b == 0) {
                this.f2494g = 0;
            }
            this.f2495h = MeasureSpec.getSize(i2);
            this.f2493f = MeasureSpec.getMode(i2);
            if (this.f2493f == 0 && RecyclerView.f18599b == 0) {
                this.f2495h = 0;
            }
        }

        /* renamed from: e */
        void m3119e(int i, int i2) {
            int w = m3154w();
            if (w == 0) {
                this.f2497q.m24673e(i, i2);
                return;
            }
            int i3 = BaseClientBuilder.API_PRIORITY_OTHER;
            int i4 = BaseClientBuilder.API_PRIORITY_OTHER;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < w; i7++) {
                View j = m3137j(i7);
                Rect rect = this.f2497q.f18623j;
                m3068a(j, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i4) {
                    i4 = rect.top;
                }
                if (rect.bottom > i6) {
                    i6 = rect.bottom;
                }
            }
            this.f2497q.f18623j.set(i3, i4, i5, i6);
            mo744a(this.f2497q.f18623j, i, i2);
        }

        /* renamed from: a */
        public void mo744a(Rect rect, int i, int i2) {
            m3130g(C0783i.m3014a(i, (rect.width() + m3026B()) + m3028D(), m3032H()), C0783i.m3014a(i2, (rect.height() + m3027C()) + m3029E(), m3033I()));
        }

        /* renamed from: p */
        public void m3147p() {
            if (this.f2497q != null) {
                this.f2497q.requestLayout();
            }
        }

        /* renamed from: a */
        public static int m3014a(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            i = MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : i;
            } else {
                return Math.min(i, Math.max(i2, i3));
            }
        }

        /* renamed from: a */
        public void mo676a(String str) {
            if (this.f2497q != null) {
                this.f2497q.m24643a(str);
            }
        }

        @Deprecated
        /* renamed from: c */
        public void m3106c(boolean z) {
            this.f2503w = z;
        }

        /* renamed from: c */
        public boolean mo682c() {
            return this.f2503w;
        }

        /* renamed from: d */
        public final void m3115d(boolean z) {
            if (z != this.f2491d) {
                this.f2491d = z;
                this.f2504x = false;
                if (this.f2497q) {
                    this.f2497q.f18617d.m3197b();
                }
            }
        }

        /* renamed from: q */
        public final boolean m3148q() {
            return this.f2491d;
        }

        /* renamed from: c */
        void m3102c(RecyclerView recyclerView) {
            this.f2502v = true;
            m3114d(recyclerView);
        }

        /* renamed from: b */
        void m3092b(RecyclerView recyclerView, C0790o c0790o) {
            this.f2502v = false;
            mo673a(recyclerView, c0790o);
        }

        /* renamed from: r */
        public boolean m3149r() {
            return this.f2502v;
        }

        /* renamed from: a */
        public boolean m3086a(Runnable runnable) {
            return this.f2497q != null ? this.f2497q.removeCallbacks(runnable) : null;
        }

        /* renamed from: a */
        public void mo673a(RecyclerView recyclerView, C0790o c0790o) {
            m3120e(recyclerView);
        }

        /* renamed from: s */
        public boolean m3150s() {
            return this.f2497q != null && this.f2497q.f18621h;
        }

        /* renamed from: c */
        public void mo681c(C0790o c0790o, C0795s c0795s) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: a */
        public LayoutParams mo743a(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                return new LayoutParams((MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        /* renamed from: a */
        public LayoutParams mo742a(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* renamed from: a */
        public void mo674a(RecyclerView recyclerView, C0795s c0795s, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: a */
        public void m3055a(C0794r c0794r) {
            if (!(this.f2500t == null || c0794r == this.f2500t || !this.f2500t.m3239h())) {
                this.f2500t.m3237f();
            }
            this.f2500t = c0794r;
            this.f2500t.m3230a(this.f2497q, this);
        }

        /* renamed from: t */
        public boolean m3151t() {
            return this.f2500t != null && this.f2500t.m3239h();
        }

        /* renamed from: u */
        public int m3152u() {
            return C0560r.m2193e(this.f2497q);
        }

        /* renamed from: a */
        public void m3063a(View view) {
            m3064a(view, -1);
        }

        /* renamed from: a */
        public void m3064a(View view, int i) {
            m3020a(view, i, true);
        }

        /* renamed from: b */
        public void m3093b(View view) {
            m3094b(view, -1);
        }

        /* renamed from: b */
        public void m3094b(View view, int i) {
            m3020a(view, i, false);
        }

        /* renamed from: a */
        private void m3020a(View view, int i, boolean z) {
            LayoutParams layoutParams;
            int b;
            C0798v e = RecyclerView.m24617e(view);
            if (!z) {
                if (!e.m3298q()) {
                    this.f2497q.f18620g.m3611f(e);
                    layoutParams = (LayoutParams) view.getLayoutParams();
                    if (!e.m3292k()) {
                        if (e.m3290i()) {
                            if (view.getParent() != this.f2497q) {
                                b = this.f2496p.m3811b(view);
                                if (i == -1) {
                                    i = this.f2496p.m3810b();
                                }
                                if (b != -1) {
                                    z = new StringBuilder();
                                    z.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                                    z.append(this.f2497q.indexOfChild(view));
                                    z.append(this.f2497q.m24628a());
                                    throw new IllegalStateException(z.toString());
                                } else if (b != i) {
                                    this.f2497q.f18626m.m3125f(b, i);
                                }
                            } else {
                                this.f2496p.m3808a(view, i, false);
                                layoutParams.f2470e = true;
                                if (!(this.f2500t == 0 || this.f2500t.m3239h() == 0)) {
                                    this.f2500t.m3233b(view);
                                }
                            }
                            if (layoutParams.f2471f == null) {
                                e.f2560a.invalidate();
                                layoutParams.f2471f = false;
                            }
                        }
                    }
                    if (e.m3290i()) {
                        e.m3293l();
                    } else {
                        e.m3291j();
                    }
                    this.f2496p.m3807a(view, i, view.getLayoutParams(), false);
                    if (layoutParams.f2471f == null) {
                        e.f2560a.invalidate();
                        layoutParams.f2471f = false;
                    }
                }
            }
            this.f2497q.f18620g.m3610e(e);
            layoutParams = (LayoutParams) view.getLayoutParams();
            if (e.m3292k()) {
                if (e.m3290i()) {
                    if (view.getParent() != this.f2497q) {
                        this.f2496p.m3808a(view, i, false);
                        layoutParams.f2470e = true;
                        this.f2500t.m3233b(view);
                    } else {
                        b = this.f2496p.m3811b(view);
                        if (i == -1) {
                            i = this.f2496p.m3810b();
                        }
                        if (b != -1) {
                            z = new StringBuilder();
                            z.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                            z.append(this.f2497q.indexOfChild(view));
                            z.append(this.f2497q.m24628a());
                            throw new IllegalStateException(z.toString());
                        } else if (b != i) {
                            this.f2497q.f18626m.m3125f(b, i);
                        }
                    }
                    if (layoutParams.f2471f == null) {
                        e.f2560a.invalidate();
                        layoutParams.f2471f = false;
                    }
                }
            }
            if (e.m3290i()) {
                e.m3293l();
            } else {
                e.m3291j();
            }
            this.f2496p.m3807a(view, i, view.getLayoutParams(), false);
            if (layoutParams.f2471f == null) {
                e.f2560a.invalidate();
                layoutParams.f2471f = false;
            }
        }

        /* renamed from: c */
        public void m3104c(View view) {
            this.f2496p.m3806a(view);
        }

        /* renamed from: h */
        public void m3133h(int i) {
            if (m3137j(i) != null) {
                this.f2496p.m3805a(i);
            }
        }

        /* renamed from: d */
        public int m3110d(View view) {
            return ((LayoutParams) view.getLayoutParams()).m2942f();
        }

        /* renamed from: e */
        public View m3117e(View view) {
            if (this.f2497q == null) {
                return null;
            }
            view = this.f2497q.m24661c(view);
            if (view == null || this.f2496p.m3815c(view)) {
                return null;
            }
            return view;
        }

        /* renamed from: c */
        public View mo680c(int i) {
            int w = m3154w();
            for (int i2 = 0; i2 < w; i2++) {
                View j = m3137j(i2);
                C0798v e = RecyclerView.m24617e(j);
                if (e != null) {
                    if (e.i_() == i && !e.h_() && (this.f2497q.f18603C.m3245a() || !e.m3298q())) {
                        return j;
                    }
                }
            }
            return 0;
        }

        /* renamed from: i */
        public void m3135i(int i) {
            m3017a(i, m3137j(i));
        }

        /* renamed from: a */
        private void m3017a(int i, View view) {
            this.f2496p.m3818e(i);
        }

        /* renamed from: a */
        public void m3067a(View view, int i, LayoutParams layoutParams) {
            C0798v e = RecyclerView.m24617e(view);
            if (e.m3298q()) {
                this.f2497q.f18620g.m3610e(e);
            } else {
                this.f2497q.f18620g.m3611f(e);
            }
            this.f2496p.m3807a(view, i, layoutParams, e.m3298q());
        }

        /* renamed from: c */
        public void m3105c(View view, int i) {
            m3067a(view, i, (LayoutParams) view.getLayoutParams());
        }

        /* renamed from: f */
        public void m3125f(int i, int i2) {
            View j = m3137j(i);
            if (j != null) {
                m3135i(i);
                m3105c(j, i2);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot move a child from non-existing index:");
            stringBuilder.append(i);
            stringBuilder.append(this.f2497q.toString());
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        /* renamed from: a */
        public void m3070a(View view, C0790o c0790o) {
            m3104c(view);
            c0790o.m3193a(view);
        }

        /* renamed from: a */
        public void m3045a(int i, C0790o c0790o) {
            View j = m3137j(i);
            m3133h(i);
            c0790o.m3193a(j);
        }

        /* renamed from: w */
        public int m3154w() {
            return this.f2496p != null ? this.f2496p.m3810b() : 0;
        }

        /* renamed from: j */
        public View m3137j(int i) {
            return this.f2496p != null ? this.f2496p.m3812b(i) : 0;
        }

        /* renamed from: x */
        public int m3155x() {
            return this.f2492e;
        }

        /* renamed from: y */
        public int m3156y() {
            return this.f2493f;
        }

        /* renamed from: z */
        public int m3157z() {
            return this.f2494g;
        }

        /* renamed from: A */
        public int m3025A() {
            return this.f2495h;
        }

        /* renamed from: B */
        public int m3026B() {
            return this.f2497q != null ? this.f2497q.getPaddingLeft() : 0;
        }

        /* renamed from: C */
        public int m3027C() {
            return this.f2497q != null ? this.f2497q.getPaddingTop() : 0;
        }

        /* renamed from: D */
        public int m3028D() {
            return this.f2497q != null ? this.f2497q.getPaddingRight() : 0;
        }

        /* renamed from: E */
        public int m3029E() {
            return this.f2497q != null ? this.f2497q.getPaddingBottom() : 0;
        }

        /* renamed from: F */
        public View m3030F() {
            if (this.f2497q == null) {
                return null;
            }
            View focusedChild = this.f2497q.getFocusedChild();
            if (focusedChild != null) {
                if (!this.f2496p.m3815c(focusedChild)) {
                    return focusedChild;
                }
            }
            return null;
        }

        /* renamed from: G */
        public int m3031G() {
            C0771a adapter = this.f2497q != null ? this.f2497q.getAdapter() : null;
            return adapter != null ? adapter.mo91a() : 0;
        }

        /* renamed from: k */
        public void mo753k(int i) {
            if (this.f2497q != null) {
                this.f2497q.m24676f(i);
            }
        }

        /* renamed from: l */
        public void mo754l(int i) {
            if (this.f2497q != null) {
                this.f2497q.m24672e(i);
            }
        }

        /* renamed from: a */
        public void m3050a(C0790o c0790o) {
            for (int w = m3154w() - 1; w >= 0; w--) {
                m3019a(c0790o, w, m3137j(w));
            }
        }

        /* renamed from: a */
        private void m3019a(C0790o c0790o, int i, View view) {
            C0798v e = RecyclerView.m24617e(view);
            if (!e.h_()) {
                if (!e.m3295n() || e.m3298q() || this.f2497q.f18625l.m2966d()) {
                    m3135i(i);
                    c0790o.m3205c(view);
                    this.f2497q.f18620g.m3613h(e);
                } else {
                    m3133h(i);
                    c0790o.m3199b(e);
                }
            }
        }

        /* renamed from: b */
        void m3089b(C0790o c0790o) {
            int e = c0790o.m3209e();
            for (int i = e - 1; i >= 0; i--) {
                View e2 = c0790o.m3210e(i);
                C0798v e3 = RecyclerView.m24617e(e2);
                if (!e3.h_()) {
                    e3.m3283a(false);
                    if (e3.m3299r()) {
                        this.f2497q.removeDetachedView(e2, false);
                    }
                    if (this.f2497q.f18638y != null) {
                        this.f2497q.f18638y.mo3875d(e3);
                    }
                    e3.m3283a(true);
                    c0790o.m3200b(e2);
                }
            }
            c0790o.m3212f();
            if (e > 0) {
                this.f2497q.invalidate();
            }
        }

        /* renamed from: a */
        boolean m3083a(View view, int i, int i2, LayoutParams layoutParams) {
            if (this.f2490c && C0783i.m3022b(view.getMeasuredWidth(), i, layoutParams.width) != 0) {
                if (C0783i.m3022b(view.getMeasuredHeight(), i2, layoutParams.height) != null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: b */
        boolean m3097b(View view, int i, int i2, LayoutParams layoutParams) {
            if (!(view.isLayoutRequested() || !this.f2490c || C0783i.m3022b(view.getWidth(), i, layoutParams.width) == 0)) {
                if (C0783i.m3022b(view.getHeight(), i2, layoutParams.height) != null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: b */
        private static boolean m3022b(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            i2 = MeasureSpec.getSize(i2);
            boolean z = false;
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                if (i2 >= i) {
                    z = true;
                }
                return z;
            } else if (mode == 0) {
                return true;
            } else {
                if (mode != 1073741824) {
                    return false;
                }
                if (i2 == i) {
                    z = true;
                }
                return z;
            }
        }

        /* renamed from: a */
        public void m3065a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect j = this.f2497q.m24690j(view);
            i2 += j.top + j.bottom;
            i = C0783i.m3015a(m3157z(), m3155x(), (((m3026B() + m3028D()) + layoutParams.leftMargin) + layoutParams.rightMargin) + (i + (j.left + j.right)), layoutParams.width, mo688e());
            i2 = C0783i.m3015a(m3025A(), m3156y(), (((m3027C() + m3029E()) + layoutParams.topMargin) + layoutParams.bottomMargin) + i2, layoutParams.height, mo690f());
            if (m3097b(view, i, i2, layoutParams)) {
                view.measure(i, i2);
            }
        }

        /* renamed from: a */
        public static int m3015a(int i, int i2, int i3, int i4, boolean z) {
            i -= i3;
            i3 = 0;
            i = Math.max(0, i);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 == Integer.MIN_VALUE || (i2 != 0 && i2 == 1073741824)) {
                            i4 = i;
                        } else {
                            i2 = 0;
                            i4 = 0;
                        }
                        i3 = i2;
                        i = i4;
                        return MeasureSpec.makeMeasureSpec(i, i3);
                    }
                    i = 0;
                    return MeasureSpec.makeMeasureSpec(i, i3);
                }
            } else if (i4 < 0) {
                if (i4 == -1) {
                    i3 = i2;
                } else {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i3 = Integer.MIN_VALUE;
                        }
                    }
                    i = 0;
                }
                return MeasureSpec.makeMeasureSpec(i, i3);
            }
            i = i4;
            i3 = 1073741824;
            return MeasureSpec.makeMeasureSpec(i, i3);
        }

        /* renamed from: f */
        public int m3124f(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f2469d;
            return (view.getMeasuredWidth() + rect.left) + rect.right;
        }

        /* renamed from: g */
        public int m3129g(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f2469d;
            return (view.getMeasuredHeight() + rect.top) + rect.bottom;
        }

        /* renamed from: a */
        public void m3066a(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f2469d;
            view.layout((i + rect.left) + layoutParams.leftMargin, (i2 + rect.top) + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        /* renamed from: a */
        public void m3071a(View view, boolean z, Rect rect) {
            if (z) {
                z = ((LayoutParams) view.getLayoutParams()).f2469d;
                rect.set(-z.left, -z.top, view.getWidth() + z.right, view.getHeight() + z.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f2497q) {
                z = view.getMatrix();
                if (z && !z.isIdentity()) {
                    RectF rectF = this.f2497q.f18624k;
                    rectF.set(rect);
                    z.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void m3068a(View view, Rect rect) {
            RecyclerView.m24607a(view, rect);
        }

        /* renamed from: h */
        public int m3132h(View view) {
            return view.getLeft() - m3145n(view);
        }

        /* renamed from: i */
        public int m3134i(View view) {
            return view.getTop() - m3140l(view);
        }

        /* renamed from: j */
        public int m3136j(View view) {
            return view.getRight() + m3146o(view);
        }

        /* renamed from: k */
        public int m3138k(View view) {
            return view.getBottom() + m3143m(view);
        }

        /* renamed from: b */
        public void m3095b(View view, Rect rect) {
            if (this.f2497q == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.f2497q.m24690j(view));
            }
        }

        /* renamed from: l */
        public int m3140l(View view) {
            return ((LayoutParams) view.getLayoutParams()).f2469d.top;
        }

        /* renamed from: m */
        public int m3143m(View view) {
            return ((LayoutParams) view.getLayoutParams()).f2469d.bottom;
        }

        /* renamed from: n */
        public int m3145n(View view) {
            return ((LayoutParams) view.getLayoutParams()).f2469d.left;
        }

        /* renamed from: o */
        public int m3146o(View view) {
            return ((LayoutParams) view.getLayoutParams()).f2469d.right;
        }

        /* renamed from: b */
        private int[] m3023b(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            recyclerView = new int[2];
            z = m3026B();
            int C = m3027C();
            int z2 = m3157z() - m3028D();
            int A = m3025A() - m3029E();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            view = rect.width() + left;
            rect = rect.height() + top;
            left -= z;
            int min = Math.min(0, left);
            top -= C;
            C = Math.min(0, top);
            view -= z2;
            z2 = Math.max(0, view);
            rect = Math.max(0, rect - A);
            if (m3152u() != 1) {
                if (min == 0) {
                    min = Math.min(left, z2);
                }
                z2 = min;
            } else if (z2 == 0) {
                z2 = Math.max(min, view);
            }
            if (C == 0) {
                C = Math.min(top, rect);
            }
            recyclerView[0] = z2;
            recyclerView[1] = C;
            return recyclerView;
        }

        /* renamed from: a */
        public boolean m3079a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return m3080a(recyclerView, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean m3080a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            view = m3023b(recyclerView, view, rect, z);
            int i = view[0];
            int i2 = view[1];
            if (!z2 || m3024d(recyclerView, i, i2)) {
                if (i == 0) {
                    if (i2 != null) {
                    }
                }
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.m24630a(i, i2);
                }
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public boolean m3085a(View view, boolean z, boolean z2) {
            view = (!this.f2498r.m3589a(view, 24579) || this.f2499s.m3589a(view, 24579) == null) ? null : true;
            return z ? view : view ^ 1;
        }

        /* renamed from: d */
        private boolean m3024d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int B = m3026B();
            int C = m3027C();
            int z = m3157z() - m3028D();
            int A = m3025A() - m3029E();
            Rect rect = this.f2497q.f18623j;
            m3068a(focusedChild, rect);
            if (rect.left - i < z && rect.right - i > B && rect.top - i2 < A) {
                if (rect.bottom - i2 > C) {
                    return true;
                }
            }
            return false;
        }

        @Deprecated
        /* renamed from: a */
        public boolean m3081a(RecyclerView recyclerView, View view, View view2) {
            if (m3151t() == null) {
                if (recyclerView.m24700o() == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: a */
        public boolean m3078a(RecyclerView recyclerView, C0795s c0795s, View view, View view2) {
            return m3081a(recyclerView, view, view2);
        }

        /* renamed from: a */
        public void mo749a(RecyclerView recyclerView, int i, int i2, Object obj) {
            m3103c(recyclerView, i, i2);
        }

        /* renamed from: a */
        public void mo3988a(C0790o c0790o, C0795s c0795s, int i, int i2) {
            this.f2497q.m24673e(i, i2);
        }

        /* renamed from: g */
        public void m3130g(int i, int i2) {
            this.f2497q.setMeasuredDimension(i, i2);
        }

        /* renamed from: H */
        public int m3032H() {
            return C0560r.m2197i(this.f2497q);
        }

        /* renamed from: I */
        public int m3033I() {
            return C0560r.m2198j(this.f2497q);
        }

        /* renamed from: J */
        void m3034J() {
            if (this.f2500t != null) {
                this.f2500t.m3237f();
            }
        }

        /* renamed from: b */
        private void m3021b(C0794r c0794r) {
            if (this.f2500t == c0794r) {
                this.f2500t = null;
            }
        }

        /* renamed from: c */
        public void m3100c(C0790o c0790o) {
            for (int w = m3154w() - 1; w >= 0; w--) {
                if (!RecyclerView.m24617e(m3137j(w)).h_()) {
                    m3045a(w, c0790o);
                }
            }
        }

        /* renamed from: a */
        void m3048a(C0532b c0532b) {
            m3052a(this.f2497q.f18617d, this.f2497q.f18603C, c0532b);
        }

        /* renamed from: a */
        public void m3052a(C0790o c0790o, C0795s c0795s, C0532b c0532b) {
            if (this.f2497q.canScrollVertically(-1) || this.f2497q.canScrollHorizontally(-1)) {
                c0532b.m1954a(8192);
                c0532b.m1991k(true);
            }
            if (this.f2497q.canScrollVertically(1) || this.f2497q.canScrollHorizontally(1)) {
                c0532b.m1954a(4096);
                c0532b.m1991k(true);
            }
            c0532b.m1958a(C0530b.m1948a(mo741a(c0790o, c0795s), mo751b(c0790o, c0795s), m3122e(c0790o, c0795s), m3108d(c0790o, c0795s)));
        }

        /* renamed from: a */
        public void mo675a(AccessibilityEvent accessibilityEvent) {
            m3054a(this.f2497q.f18617d, this.f2497q.f18603C, accessibilityEvent);
        }

        /* renamed from: a */
        public void m3054a(C0790o c0790o, C0795s c0795s, AccessibilityEvent accessibilityEvent) {
            if (this.f2497q != null) {
                if (accessibilityEvent != null) {
                    c0795s = true;
                    if (this.f2497q.canScrollVertically(1) == null && this.f2497q.canScrollVertically(-1) == null && this.f2497q.canScrollHorizontally(-1) == null) {
                        if (this.f2497q.canScrollHorizontally(1) == null) {
                            c0795s = null;
                        }
                    }
                    accessibilityEvent.setScrollable(c0795s);
                    if (this.f2497q.f18625l != null) {
                        accessibilityEvent.setItemCount(this.f2497q.f18625l.mo91a());
                    }
                }
            }
        }

        /* renamed from: a */
        void m3069a(View view, C0532b c0532b) {
            C0798v e = RecyclerView.m24617e(view);
            if (e != null && !e.m3298q() && !this.f2496p.m3815c(e.f2560a)) {
                mo745a(this.f2497q.f18617d, this.f2497q.f18603C, view, c0532b);
            }
        }

        /* renamed from: a */
        public void mo745a(C0790o c0790o, C0795s c0795s, View view, C0532b c0532b) {
            c0532b.m1966b(C0531c.m1949a(mo690f() != null ? m3110d(view) : 0, 1, mo688e() != null ? m3110d(view) : 0, 1, false, false));
        }

        /* renamed from: K */
        public void m3035K() {
            this.f2501u = true;
        }

        /* renamed from: a */
        public int mo741a(C0790o c0790o, C0795s c0795s) {
            c0795s = true;
            if (this.f2497q != null) {
                if (this.f2497q.f18625l != null) {
                    if (mo690f() != null) {
                        c0795s = this.f2497q.f18625l.mo91a();
                    }
                    return c0795s;
                }
            }
            return 1;
        }

        /* renamed from: b */
        public int mo751b(C0790o c0790o, C0795s c0795s) {
            c0795s = true;
            if (this.f2497q != null) {
                if (this.f2497q.f18625l != null) {
                    if (mo688e() != null) {
                        c0795s = this.f2497q.f18625l.mo91a();
                    }
                    return c0795s;
                }
            }
            return 1;
        }

        /* renamed from: a */
        boolean m3074a(int i, Bundle bundle) {
            return m3076a(this.f2497q.f18617d, this.f2497q.f18603C, i, bundle);
        }

        /* renamed from: a */
        public boolean m3076a(C0790o c0790o, C0795s c0795s, int i, Bundle bundle) {
            if (this.f2497q == null) {
                return false;
            }
            if (i == 4096) {
                c0790o = this.f2497q.canScrollVertically(1) != null ? (m3025A() - m3027C()) - m3029E() : null;
                if (this.f2497q.canScrollHorizontally(1) != 0) {
                    i = (m3157z() - m3026B()) - m3028D();
                    if (c0790o != null) {
                    }
                    this.f2497q.scrollBy(i, c0790o);
                    return true;
                }
            } else if (i != 8192) {
                c0790o = null;
            } else {
                c0790o = this.f2497q.canScrollVertically(-1) != null ? -((m3025A() - m3027C()) - m3029E()) : null;
                if (this.f2497q.canScrollHorizontally(-1) != 0) {
                    i = -((m3157z() - m3026B()) - m3028D());
                    if (c0790o != null && i == 0) {
                        return false;
                    }
                    this.f2497q.scrollBy(i, c0790o);
                    return true;
                }
            }
            i = 0;
            if (c0790o != null) {
            }
            this.f2497q.scrollBy(i, c0790o);
            return true;
        }

        /* renamed from: a */
        boolean m3084a(View view, int i, Bundle bundle) {
            return m3077a(this.f2497q.f18617d, this.f2497q.f18603C, view, i, bundle);
        }

        /* renamed from: a */
        public static C0782b m3016a(Context context, AttributeSet attributeSet, int i, int i2) {
            C0782b c0782b = new C0782b();
            context = context.obtainStyledAttributes(attributeSet, C0685b.RecyclerView, i, i2);
            c0782b.f2484a = context.getInt(C0685b.RecyclerView_android_orientation, 1);
            c0782b.f2485b = context.getInt(C0685b.RecyclerView_spanCount, 1);
            c0782b.f2486c = context.getBoolean(C0685b.RecyclerView_reverseLayout, false);
            c0782b.f2487d = context.getBoolean(C0685b.RecyclerView_stackFromEnd, false);
            context.recycle();
            return c0782b;
        }

        /* renamed from: f */
        void m3126f(RecyclerView recyclerView) {
            m3113d(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: L */
        boolean m3036L() {
            int w = m3154w();
            for (int i = 0; i < w; i++) {
                android.view.ViewGroup.LayoutParams layoutParams = m3137j(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$j */
    public interface C0784j {
        /* renamed from: a */
        void mo1224a(View view);

        /* renamed from: b */
        void mo1225b(View view);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$k */
    public static abstract class C0785k {
        /* renamed from: a */
        public abstract boolean mo787a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$l */
    public interface C0786l {
        /* renamed from: a */
        void mo759a(boolean z);

        /* renamed from: a */
        boolean mo760a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo761b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$m */
    public static abstract class C0787m {
        /* renamed from: a */
        public void mo786a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: a */
        public void mo757a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$n */
    public static class C0789n {
        /* renamed from: a */
        SparseArray<C0788a> f2510a = new SparseArray();
        /* renamed from: b */
        private int f2511b = 0;

        /* renamed from: android.support.v7.widget.RecyclerView$n$a */
        static class C0788a {
            /* renamed from: a */
            final ArrayList<C0798v> f2506a = new ArrayList();
            /* renamed from: b */
            int f2507b = 5;
            /* renamed from: c */
            long f2508c = 0;
            /* renamed from: d */
            long f2509d = 0;

            C0788a() {
            }
        }

        /* renamed from: a */
        public void m3169a() {
            for (int i = 0; i < this.f2510a.size(); i++) {
                ((C0788a) this.f2510a.valueAt(i)).f2506a.clear();
            }
        }

        /* renamed from: a */
        public C0798v m3168a(int i) {
            C0788a c0788a = (C0788a) this.f2510a.get(i);
            if (c0788a == null || c0788a.f2506a.isEmpty()) {
                return 0;
            }
            i = c0788a.f2506a;
            return (C0798v) i.remove(i.size() - 1);
        }

        /* renamed from: a */
        public void m3173a(C0798v c0798v) {
            int h = c0798v.m3289h();
            ArrayList arrayList = m3166b(h).f2506a;
            if (((C0788a) this.f2510a.get(h)).f2507b > arrayList.size()) {
                c0798v.m3303v();
                arrayList.add(c0798v);
            }
        }

        /* renamed from: a */
        long m3167a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: a */
        void m3170a(int i, long j) {
            i = m3166b(i);
            i.f2508c = m3167a(i.f2508c, j);
        }

        /* renamed from: b */
        void m3176b(int i, long j) {
            i = m3166b(i);
            i.f2509d = m3167a(i.f2509d, j);
        }

        /* renamed from: a */
        boolean m3174a(int i, long j, long j2) {
            long j3 = m3166b(i).f2508c;
            if (j3 != 0) {
                if (j + j3 >= j2) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        boolean m3177b(int i, long j, long j2) {
            long j3 = m3166b(i).f2509d;
            if (j3 != 0) {
                if (j + j3 >= j2) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        void m3171a(C0771a c0771a) {
            this.f2511b++;
        }

        /* renamed from: b */
        void m3175b() {
            this.f2511b--;
        }

        /* renamed from: a */
        void m3172a(C0771a c0771a, C0771a c0771a2, boolean z) {
            if (c0771a != null) {
                m3175b();
            }
            if (!z && this.f2511b == null) {
                m3169a();
            }
            if (c0771a2 != null) {
                m3171a(c0771a2);
            }
        }

        /* renamed from: b */
        private C0788a m3166b(int i) {
            C0788a c0788a = (C0788a) this.f2510a.get(i);
            if (c0788a != null) {
                return c0788a;
            }
            c0788a = new C0788a();
            this.f2510a.put(i, c0788a);
            return c0788a;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$o */
    public final class C0790o {
        /* renamed from: a */
        final ArrayList<C0798v> f2512a = new ArrayList();
        /* renamed from: b */
        ArrayList<C0798v> f2513b = null;
        /* renamed from: c */
        final ArrayList<C0798v> f2514c = new ArrayList();
        /* renamed from: d */
        int f2515d = 2;
        /* renamed from: e */
        C0789n f2516e;
        /* renamed from: f */
        final /* synthetic */ RecyclerView f2517f;
        /* renamed from: g */
        private final List<C0798v> f2518g = Collections.unmodifiableList(this.f2512a);
        /* renamed from: h */
        private int f2519h = 2;
        /* renamed from: i */
        private C0796t f2520i;

        public C0790o(RecyclerView recyclerView) {
            this.f2517f = recyclerView;
        }

        /* renamed from: a */
        public void m3185a() {
            this.f2512a.clear();
            m3206d();
        }

        /* renamed from: a */
        public void m3186a(int i) {
            this.f2519h = i;
            m3197b();
        }

        /* renamed from: b */
        void m3197b() {
            this.f2515d = this.f2519h + (this.f2517f.f18626m != null ? this.f2517f.f18626m.f2504x : 0);
            for (int size = this.f2514c.size() - 1; size >= 0 && this.f2514c.size() > this.f2515d; size--) {
                m3207d(size);
            }
        }

        /* renamed from: c */
        public List<C0798v> m3202c() {
            return this.f2518g;
        }

        /* renamed from: a */
        boolean m3194a(C0798v c0798v) {
            if (c0798v.m3298q()) {
                return this.f2517f.f18603C.m3245a();
            }
            if (c0798v.f2562c < 0 || c0798v.f2562c >= this.f2517f.f18625l.mo91a()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Inconsistency detected. Invalid view holder adapter position");
                stringBuilder.append(c0798v);
                stringBuilder.append(this.f2517f.m24628a());
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            boolean z = false;
            if (!this.f2517f.f18603C.m3245a() && this.f2517f.f18625l.mo95b(c0798v.f2562c) != c0798v.m3289h()) {
                return false;
            }
            if (!this.f2517f.f18625l.m2966d()) {
                return true;
            }
            if (c0798v.m3288g() == this.f2517f.f18625l.mo92a(c0798v.f2562c)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        private boolean m3179a(C0798v c0798v, int i, int i2, long j) {
            c0798v.f2572m = this.f2517f;
            int h = c0798v.m3289h();
            long nanoTime = this.f2517f.getNanoTime();
            if (j != Long.MAX_VALUE && this.f2516e.m3177b(h, nanoTime, j) == null) {
                return null;
            }
            this.f2517f.f18625l.m2959b(c0798v, i);
            this.f2516e.m3176b(c0798v.m3289h(), this.f2517f.getNanoTime() - nanoTime);
            m3180e(c0798v);
            if (this.f2517f.f18603C.m3245a() != 0) {
                c0798v.f2566g = i2;
            }
            return true;
        }

        /* renamed from: b */
        public int m3195b(int i) {
            if (i < 0 || i >= this.f2517f.f18603C.m3249e()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("invalid position ");
                stringBuilder.append(i);
                stringBuilder.append(". State ");
                stringBuilder.append("item count is ");
                stringBuilder.append(this.f2517f.f18603C.m3249e());
                stringBuilder.append(this.f2517f.m24628a());
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            } else if (this.f2517f.f18603C.m3245a()) {
                return this.f2517f.f18618e.m16827b(i);
            } else {
                return i;
            }
        }

        /* renamed from: c */
        public View m3201c(int i) {
            return m3184a(i, false);
        }

        /* renamed from: a */
        View m3184a(int i, boolean z) {
            return m3182a(i, z, Long.MAX_VALUE).f2560a;
        }

        /* renamed from: a */
        C0798v m3182a(int i, boolean z, long j) {
            C0790o c0790o = this;
            int i2 = i;
            boolean z2 = z;
            if (i2 < 0 || i2 >= c0790o.f2517f.f18603C.m3249e()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid item position ");
                stringBuilder.append(i2);
                stringBuilder.append("(");
                stringBuilder.append(i2);
                stringBuilder.append("). Item count:");
                stringBuilder.append(c0790o.f2517f.f18603C.m3249e());
                stringBuilder.append(c0790o.f2517f.m24628a());
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            C0798v f;
            Object obj;
            C0798v c0798v;
            Object obj2;
            android.view.ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            boolean z3 = true;
            int b;
            if (c0790o.f2517f.f18603C.m3245a()) {
                f = m3211f(i);
                if (f != null) {
                    obj = 1;
                    if (f == null) {
                        f = m3196b(i, z);
                        if (f != null) {
                            if (m3194a(f)) {
                                if (!z2) {
                                    f.m3285b(4);
                                    if (f.m3290i()) {
                                        c0790o.f2517f.removeDetachedView(f.f2560a, false);
                                        f.m3291j();
                                    } else if (f.m3292k()) {
                                        f.m3293l();
                                    }
                                    m3199b(f);
                                }
                                f = null;
                            } else {
                                obj = 1;
                            }
                        }
                    }
                    if (f == null) {
                        b = c0790o.f2517f.f18618e.m16827b(i2);
                        if (b >= 0 || b >= c0790o.f2517f.f18625l.mo91a()) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Inconsistency detected. Invalid item position ");
                            stringBuilder.append(i2);
                            stringBuilder.append("(offset:");
                            stringBuilder.append(b);
                            stringBuilder.append(").");
                            stringBuilder.append("state:");
                            stringBuilder.append(c0790o.f2517f.f18603C.m3249e());
                            stringBuilder.append(c0790o.f2517f.m24628a());
                            throw new IndexOutOfBoundsException(stringBuilder.toString());
                        }
                        int b2 = c0790o.f2517f.f18625l.mo95b(b);
                        if (c0790o.f2517f.f18625l.m2966d()) {
                            f = m3183a(c0790o.f2517f.f18625l.mo92a(b), b2, z2);
                            if (f != null) {
                                f.f2562c = b;
                                obj = 1;
                            }
                        }
                        if (f == null && c0790o.f2520i != null) {
                            View a = c0790o.f2520i.m3250a(c0790o, i2, b2);
                            if (a != null) {
                                f = c0790o.f2517f.m24651b(a);
                                if (f == null) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("getViewForPositionAndType returned a view which does not have a ViewHolder");
                                    stringBuilder.append(c0790o.f2517f.m24628a());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                                } else if (f.h_()) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                                    stringBuilder.append(c0790o.f2517f.m24628a());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                                }
                            }
                        }
                        if (f == null) {
                            f = m3213g().m3168a(b2);
                            if (f != null) {
                                f.m3303v();
                                if (RecyclerView.f18598a) {
                                    m3181f(f);
                                }
                            }
                        }
                        if (f == null) {
                            long nanoTime = c0790o.f2517f.getNanoTime();
                            if (j != Long.MAX_VALUE && !c0790o.f2516e.m3174a(b2, nanoTime, j)) {
                                return null;
                            }
                            C0798v c = c0790o.f2517f.f18625l.m2962c(c0790o.f2517f, b2);
                            if (RecyclerView.f18594L) {
                                RecyclerView k = RecyclerView.m24619k(c.f2560a);
                                if (k != null) {
                                    c.f2561b = new WeakReference(k);
                                }
                            }
                            c0790o.f2516e.m3170a(b2, c0790o.f2517f.getNanoTime() - nanoTime);
                            c0798v = c;
                            obj2 = obj;
                            if (!(obj2 == null || c0790o.f2517f.f18603C.m3245a() || !c0798v.m3284a(8192))) {
                                c0798v.m3278a(0, 8192);
                                if (c0790o.f2517f.f18603C.f2543i) {
                                    c0790o.f2517f.m24641a(c0798v, c0790o.f2517f.f18638y.m2987a(c0790o.f2517f.f18603C, c0798v, C0779f.m2985e(c0798v) | 4096, c0798v.m3302u()));
                                }
                            }
                            if (c0790o.f2517f.f18603C.m3245a() || !c0798v.m3297p()) {
                                if (c0798v.m3297p() && !c0798v.m3296o()) {
                                    if (c0798v.m3295n()) {
                                    }
                                }
                                z2 = m3179a(c0798v, c0790o.f2517f.f18618e.m16827b(i2), i, j);
                                layoutParams = c0798v.f2560a.getLayoutParams();
                                if (layoutParams == null) {
                                    layoutParams2 = (LayoutParams) c0790o.f2517f.generateDefaultLayoutParams();
                                    c0798v.f2560a.setLayoutParams(layoutParams2);
                                } else if (c0790o.f2517f.checkLayoutParams(layoutParams)) {
                                    layoutParams2 = (LayoutParams) c0790o.f2517f.generateLayoutParams(layoutParams);
                                    c0798v.f2560a.setLayoutParams(layoutParams2);
                                } else {
                                    layoutParams2 = (LayoutParams) layoutParams;
                                }
                                layoutParams2.f2468c = c0798v;
                                if (obj2 != null || !r0) {
                                    z3 = false;
                                }
                                layoutParams2.f2471f = z3;
                                return c0798v;
                            }
                            c0798v.f2566g = i2;
                            z2 = false;
                            layoutParams = c0798v.f2560a.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams2 = (LayoutParams) c0790o.f2517f.generateDefaultLayoutParams();
                                c0798v.f2560a.setLayoutParams(layoutParams2);
                            } else if (c0790o.f2517f.checkLayoutParams(layoutParams)) {
                                layoutParams2 = (LayoutParams) layoutParams;
                            } else {
                                layoutParams2 = (LayoutParams) c0790o.f2517f.generateLayoutParams(layoutParams);
                                c0798v.f2560a.setLayoutParams(layoutParams2);
                            }
                            layoutParams2.f2468c = c0798v;
                            if (obj2 != null) {
                            }
                            z3 = false;
                            layoutParams2.f2471f = z3;
                            return c0798v;
                        }
                    }
                    c0798v = f;
                    obj2 = obj;
                    c0798v.m3278a(0, 8192);
                    if (c0790o.f2517f.f18603C.f2543i) {
                        c0790o.f2517f.m24641a(c0798v, c0790o.f2517f.f18638y.m2987a(c0790o.f2517f.f18603C, c0798v, C0779f.m2985e(c0798v) | 4096, c0798v.m3302u()));
                    }
                    if (c0790o.f2517f.f18603C.m3245a()) {
                    }
                    if (c0798v.m3295n()) {
                        z2 = m3179a(c0798v, c0790o.f2517f.f18618e.m16827b(i2), i, j);
                        layoutParams = c0798v.f2560a.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams2 = (LayoutParams) c0790o.f2517f.generateDefaultLayoutParams();
                            c0798v.f2560a.setLayoutParams(layoutParams2);
                        } else if (c0790o.f2517f.checkLayoutParams(layoutParams)) {
                            layoutParams2 = (LayoutParams) c0790o.f2517f.generateLayoutParams(layoutParams);
                            c0798v.f2560a.setLayoutParams(layoutParams2);
                        } else {
                            layoutParams2 = (LayoutParams) layoutParams;
                        }
                        layoutParams2.f2468c = c0798v;
                        if (obj2 != null) {
                        }
                        z3 = false;
                        layoutParams2.f2471f = z3;
                        return c0798v;
                    }
                    z2 = false;
                    layoutParams = c0798v.f2560a.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams2 = (LayoutParams) c0790o.f2517f.generateDefaultLayoutParams();
                        c0798v.f2560a.setLayoutParams(layoutParams2);
                    } else if (c0790o.f2517f.checkLayoutParams(layoutParams)) {
                        layoutParams2 = (LayoutParams) layoutParams;
                    } else {
                        layoutParams2 = (LayoutParams) c0790o.f2517f.generateLayoutParams(layoutParams);
                        c0798v.f2560a.setLayoutParams(layoutParams2);
                    }
                    layoutParams2.f2468c = c0798v;
                    if (obj2 != null) {
                    }
                    z3 = false;
                    layoutParams2.f2471f = z3;
                    return c0798v;
                }
            }
            f = null;
            obj = null;
            if (f == null) {
                f = m3196b(i, z);
                if (f != null) {
                    if (m3194a(f)) {
                        obj = 1;
                    } else {
                        if (z2) {
                            f.m3285b(4);
                            if (f.m3290i()) {
                                c0790o.f2517f.removeDetachedView(f.f2560a, false);
                                f.m3291j();
                            } else if (f.m3292k()) {
                                f.m3293l();
                            }
                            m3199b(f);
                        }
                        f = null;
                    }
                }
            }
            if (f == null) {
                b = c0790o.f2517f.f18618e.m16827b(i2);
                if (b >= 0) {
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Inconsistency detected. Invalid item position ");
                stringBuilder.append(i2);
                stringBuilder.append("(offset:");
                stringBuilder.append(b);
                stringBuilder.append(").");
                stringBuilder.append("state:");
                stringBuilder.append(c0790o.f2517f.f18603C.m3249e());
                stringBuilder.append(c0790o.f2517f.m24628a());
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            c0798v = f;
            obj2 = obj;
            c0798v.m3278a(0, 8192);
            if (c0790o.f2517f.f18603C.f2543i) {
                c0790o.f2517f.m24641a(c0798v, c0790o.f2517f.f18638y.m2987a(c0790o.f2517f.f18603C, c0798v, C0779f.m2985e(c0798v) | 4096, c0798v.m3302u()));
            }
            if (c0790o.f2517f.f18603C.m3245a()) {
            }
            if (c0798v.m3295n()) {
                z2 = m3179a(c0798v, c0790o.f2517f.f18618e.m16827b(i2), i, j);
                layoutParams = c0798v.f2560a.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams2 = (LayoutParams) c0790o.f2517f.generateDefaultLayoutParams();
                    c0798v.f2560a.setLayoutParams(layoutParams2);
                } else if (c0790o.f2517f.checkLayoutParams(layoutParams)) {
                    layoutParams2 = (LayoutParams) c0790o.f2517f.generateLayoutParams(layoutParams);
                    c0798v.f2560a.setLayoutParams(layoutParams2);
                } else {
                    layoutParams2 = (LayoutParams) layoutParams;
                }
                layoutParams2.f2468c = c0798v;
                if (obj2 != null) {
                }
                z3 = false;
                layoutParams2.f2471f = z3;
                return c0798v;
            }
            z2 = false;
            layoutParams = c0798v.f2560a.getLayoutParams();
            if (layoutParams == null) {
                layoutParams2 = (LayoutParams) c0790o.f2517f.generateDefaultLayoutParams();
                c0798v.f2560a.setLayoutParams(layoutParams2);
            } else if (c0790o.f2517f.checkLayoutParams(layoutParams)) {
                layoutParams2 = (LayoutParams) layoutParams;
            } else {
                layoutParams2 = (LayoutParams) c0790o.f2517f.generateLayoutParams(layoutParams);
                c0798v.f2560a.setLayoutParams(layoutParams2);
            }
            layoutParams2.f2468c = c0798v;
            if (obj2 != null) {
            }
            z3 = false;
            layoutParams2.f2471f = z3;
            return c0798v;
        }

        /* renamed from: e */
        private void m3180e(C0798v c0798v) {
            if (this.f2517f.m24699n()) {
                View view = c0798v.f2560a;
                if (C0560r.m2191d(view) == 0) {
                    C0560r.m2167a(view, 1);
                }
                if (!C0560r.m2182a(view)) {
                    c0798v.m3285b(16384);
                    C0560r.m2175a(view, this.f2517f.f18607G.m16728c());
                }
            }
        }

        /* renamed from: f */
        private void m3181f(C0798v c0798v) {
            if (c0798v.f2560a instanceof ViewGroup) {
                m3178a((ViewGroup) c0798v.f2560a, false);
            }
        }

        /* renamed from: a */
        private void m3178a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m3178a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility()) {
                    viewGroup.setVisibility(false);
                    viewGroup.setVisibility(4);
                } else {
                    z = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(z);
                }
            }
        }

        /* renamed from: a */
        public void m3193a(View view) {
            C0798v e = RecyclerView.m24617e(view);
            if (e.m3299r()) {
                this.f2517f.removeDetachedView(view, false);
            }
            if (e.m3290i() != null) {
                e.m3291j();
            } else if (e.m3292k() != null) {
                e.m3293l();
            }
            m3199b(e);
        }

        /* renamed from: d */
        void m3206d() {
            for (int size = this.f2514c.size() - 1; size >= 0; size--) {
                m3207d(size);
            }
            this.f2514c.clear();
            if (RecyclerView.f18594L) {
                this.f2517f.f18602B.m16674a();
            }
        }

        /* renamed from: d */
        void m3207d(int i) {
            m3192a((C0798v) this.f2514c.get(i), true);
            this.f2514c.remove(i);
        }

        /* renamed from: b */
        void m3199b(C0798v c0798v) {
            boolean z = false;
            if (!c0798v.m3290i()) {
                if (c0798v.f2560a.getParent() == null) {
                    if (c0798v.m3299r()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                        stringBuilder.append(c0798v);
                        stringBuilder.append(this.f2517f.m24628a());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else if (c0798v.h_()) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                        stringBuilder2.append(this.f2517f.m24628a());
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    } else {
                        boolean a = c0798v.m3264A();
                        Object obj = (this.f2517f.f18625l != null && a && this.f2517f.f18625l.m2961b(c0798v)) ? 1 : null;
                        if (obj == null) {
                            if (!c0798v.m3304w()) {
                                obj = null;
                                this.f2517f.f18620g.m3612g(c0798v);
                                if (obj == null && !r1 && a) {
                                    c0798v.f2572m = null;
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f2515d <= 0 || c0798v.m3284a(526)) {
                            obj = null;
                        } else {
                            int size = this.f2514c.size();
                            if (size >= this.f2515d && size > 0) {
                                m3207d(0);
                                size--;
                            }
                            if (RecyclerView.f18594L && size > 0 && !this.f2517f.f18602B.m16677a(c0798v.f2562c)) {
                                size--;
                                while (size >= 0) {
                                    if (!this.f2517f.f18602B.m16677a(((C0798v) this.f2514c.get(size)).f2562c)) {
                                        break;
                                    }
                                    size--;
                                }
                                size++;
                            }
                            this.f2514c.add(size, c0798v);
                            obj = 1;
                        }
                        if (obj == null) {
                            m3192a(c0798v, true);
                            z = true;
                        }
                        this.f2517f.f18620g.m3612g(c0798v);
                        if (obj == null) {
                            return;
                        }
                        return;
                    }
                }
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Scrapped or attached views may not be recycled. isScrap:");
            stringBuilder3.append(c0798v.m3290i());
            stringBuilder3.append(" isAttached:");
            if (c0798v.f2560a.getParent() != null) {
                z = true;
            }
            stringBuilder3.append(z);
            stringBuilder3.append(this.f2517f.m24628a());
            throw new IllegalArgumentException(stringBuilder3.toString());
        }

        /* renamed from: a */
        void m3192a(C0798v c0798v, boolean z) {
            RecyclerView.m24615c(c0798v);
            if (c0798v.m3284a(16384)) {
                c0798v.m3278a(0, 16384);
                C0560r.m2175a(c0798v.f2560a, null);
            }
            if (z) {
                m3208d(c0798v);
            }
            c0798v.f2572m = null;
            m3213g().m3173a(c0798v);
        }

        /* renamed from: b */
        void m3200b(View view) {
            C0798v e = RecyclerView.m24617e(view);
            e.f2575q = null;
            e.f2576r = false;
            e.m3293l();
            m3199b(e);
        }

        /* renamed from: c */
        void m3205c(View view) {
            C0798v e = RecyclerView.m24617e(view);
            if (!e.m3284a(12) && e.m3305x()) {
                if (!this.f2517f.m24660b(e)) {
                    if (this.f2513b == null) {
                        this.f2513b = new ArrayList();
                    }
                    e.m3281a(this, true);
                    this.f2513b.add(e);
                    return;
                }
            }
            if (e.m3295n() && !e.m3298q()) {
                if (!this.f2517f.f18625l.m2966d()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                    stringBuilder.append(this.f2517f.m24628a());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            e.m3281a(this, false);
            this.f2512a.add(e);
        }

        /* renamed from: c */
        void m3204c(C0798v c0798v) {
            if (c0798v.f2576r) {
                this.f2513b.remove(c0798v);
            } else {
                this.f2512a.remove(c0798v);
            }
            c0798v.f2575q = null;
            c0798v.f2576r = false;
            c0798v.m3293l();
        }

        /* renamed from: e */
        int m3209e() {
            return this.f2512a.size();
        }

        /* renamed from: e */
        View m3210e(int i) {
            return ((C0798v) this.f2512a.get(i)).f2560a;
        }

        /* renamed from: f */
        void m3212f() {
            this.f2512a.clear();
            if (this.f2513b != null) {
                this.f2513b.clear();
            }
        }

        /* renamed from: f */
        C0798v m3211f(int i) {
            if (this.f2513b != null) {
                int size = this.f2513b.size();
                if (size != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        C0798v c0798v = (C0798v) this.f2513b.get(i3);
                        if (c0798v.m3292k() || c0798v.i_() != i) {
                            i3++;
                        } else {
                            c0798v.m3285b(32);
                            return c0798v;
                        }
                    }
                    if (this.f2517f.f18625l.m2966d()) {
                        i = this.f2517f.f18618e.m16827b(i);
                        if (i > 0 && i < this.f2517f.f18625l.mo91a()) {
                            long a = this.f2517f.f18625l.mo92a(i);
                            while (i2 < size) {
                                C0798v c0798v2 = (C0798v) this.f2513b.get(i2);
                                if (c0798v2.m3292k() || c0798v2.m3288g() != a) {
                                    i2++;
                                } else {
                                    c0798v2.m3285b(32);
                                    return c0798v2;
                                }
                            }
                        }
                    }
                    return null;
                }
            }
            return null;
        }

        /* renamed from: b */
        C0798v m3196b(int i, boolean z) {
            int size = this.f2512a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0798v c0798v = (C0798v) this.f2512a.get(i3);
                if (c0798v.m3292k() || c0798v.i_() != i || c0798v.m3295n() || (!this.f2517f.f18603C.f2540f && c0798v.m3298q())) {
                    i3++;
                } else {
                    c0798v.m3285b(32);
                    return c0798v;
                }
            }
            if (!z) {
                View c = this.f2517f.f18619f.m3814c(i);
                if (c != null) {
                    i = RecyclerView.m24617e(c);
                    this.f2517f.f18619f.m3819e(c);
                    int b = this.f2517f.f18619f.m3811b(c);
                    if (b != true) {
                        this.f2517f.f18619f.m3818e(b);
                        m3205c(c);
                        i.m3285b((int) true);
                        return i;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("layout index should not be -1 after unhiding a view:");
                    stringBuilder.append(i);
                    stringBuilder.append(this.f2517f.m24628a());
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            size = this.f2514c.size();
            while (i2 < size) {
                C0798v c0798v2 = (C0798v) this.f2514c.get(i2);
                if (c0798v2.m3295n() || c0798v2.i_() != i) {
                    i2++;
                } else {
                    if (!z) {
                        this.f2514c.remove(i2);
                    }
                    return c0798v2;
                }
            }
            return 0;
        }

        /* renamed from: a */
        C0798v m3183a(long j, int i, boolean z) {
            int size;
            for (size = this.f2512a.size() - 1; size >= 0; size--) {
                C0798v c0798v = (C0798v) this.f2512a.get(size);
                if (c0798v.m3288g() == j && !c0798v.m3292k()) {
                    if (i == c0798v.m3289h()) {
                        c0798v.m3285b((int) 32);
                        if (c0798v.m3298q() != null && this.f2517f.f18603C.m3245a() == null) {
                            c0798v.m3278a((int) 2, 14);
                        }
                        return c0798v;
                    } else if (!z) {
                        this.f2512a.remove(size);
                        this.f2517f.removeDetachedView(c0798v.f2560a, false);
                        m3200b(c0798v.f2560a);
                    }
                }
            }
            for (size = this.f2514c.size() - 1; size >= 0; size--) {
                C0798v c0798v2 = (C0798v) this.f2514c.get(size);
                if (c0798v2.m3288g() == j) {
                    if (i == c0798v2.m3289h()) {
                        if (!z) {
                            this.f2514c.remove(size);
                        }
                        return c0798v2;
                    } else if (!z) {
                        m3207d(size);
                        return null;
                    }
                }
            }
            return null;
        }

        /* renamed from: d */
        void m3208d(C0798v c0798v) {
            if (this.f2517f.f18627n != null) {
                this.f2517f.f18627n.m3217a(c0798v);
            }
            if (this.f2517f.f18625l != null) {
                this.f2517f.f18625l.mo93a(c0798v);
            }
            if (this.f2517f.f18603C != null) {
                this.f2517f.f18620g.m3612g(c0798v);
            }
        }

        /* renamed from: a */
        void m3189a(C0771a c0771a, C0771a c0771a2, boolean z) {
            m3185a();
            m3213g().m3172a(c0771a, c0771a2, z);
        }

        /* renamed from: a */
        void m3187a(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i5 = i;
                i3 = i2;
                i4 = -1;
            } else {
                i3 = i;
                i5 = i2;
                i4 = 1;
            }
            int size = this.f2514c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0798v c0798v = (C0798v) this.f2514c.get(i6);
                if (c0798v != null && c0798v.f2562c >= r0) {
                    if (c0798v.f2562c <= i3) {
                        if (c0798v.f2562c == i) {
                            c0798v.m3280a(i2 - i, false);
                        } else {
                            c0798v.m3280a(i4, false);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        void m3198b(int i, int i2) {
            int size = this.f2514c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0798v c0798v = (C0798v) this.f2514c.get(i3);
                if (c0798v != null && c0798v.f2562c >= i) {
                    c0798v.m3280a(i2, true);
                }
            }
        }

        /* renamed from: a */
        void m3188a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f2514c.size() - 1; size >= 0; size--) {
                C0798v c0798v = (C0798v) this.f2514c.get(size);
                if (c0798v != null) {
                    if (c0798v.f2562c >= i3) {
                        c0798v.m3280a(-i2, z);
                    } else if (c0798v.f2562c >= i) {
                        c0798v.m3285b(8);
                        m3207d(size);
                    }
                }
            }
        }

        /* renamed from: a */
        void m3191a(C0796t c0796t) {
            this.f2520i = c0796t;
        }

        /* renamed from: a */
        void m3190a(C0789n c0789n) {
            if (this.f2516e != null) {
                this.f2516e.m3175b();
            }
            this.f2516e = c0789n;
            if (c0789n != null) {
                this.f2516e.m3171a(this.f2517f.getAdapter());
            }
        }

        /* renamed from: g */
        C0789n m3213g() {
            if (this.f2516e == null) {
                this.f2516e = new C0789n();
            }
            return this.f2516e;
        }

        /* renamed from: c */
        void m3203c(int i, int i2) {
            i2 += i;
            for (int size = this.f2514c.size() - 1; size >= 0; size--) {
                C0798v c0798v = (C0798v) this.f2514c.get(size);
                if (c0798v != null) {
                    int i3 = c0798v.f2562c;
                    if (i3 >= i && i3 < i2) {
                        c0798v.m3285b(2);
                        m3207d(size);
                    }
                }
            }
        }

        /* renamed from: h */
        void m3214h() {
            int size = this.f2514c.size();
            for (int i = 0; i < size; i++) {
                C0798v c0798v = (C0798v) this.f2514c.get(i);
                if (c0798v != null) {
                    c0798v.m3285b(6);
                    c0798v.m3282a(null);
                }
            }
            if (this.f2517f.f18625l == null || !this.f2517f.f18625l.m2966d()) {
                m3206d();
            }
        }

        /* renamed from: i */
        void m3215i() {
            int i;
            int size = this.f2514c.size();
            for (i = 0; i < size; i++) {
                ((C0798v) this.f2514c.get(i)).m3277a();
            }
            size = this.f2512a.size();
            for (i = 0; i < size; i++) {
                ((C0798v) this.f2512a.get(i)).m3277a();
            }
            if (this.f2513b != null) {
                size = this.f2513b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0798v) this.f2513b.get(i2)).m3277a();
                }
            }
        }

        /* renamed from: j */
        void m3216j() {
            int size = this.f2514c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) ((C0798v) this.f2514c.get(i)).f2560a.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f2470e = true;
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$p */
    public interface C0791p {
        /* renamed from: a */
        void m3217a(C0798v c0798v);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$r */
    public static abstract class C0794r {
        /* renamed from: a */
        private int f2528a = -1;
        /* renamed from: b */
        private RecyclerView f2529b;
        /* renamed from: c */
        private C0783i f2530c;
        /* renamed from: d */
        private boolean f2531d;
        /* renamed from: e */
        private boolean f2532e;
        /* renamed from: f */
        private View f2533f;
        /* renamed from: g */
        private final C0792a f2534g = new C0792a(0, 0);

        /* renamed from: android.support.v7.widget.RecyclerView$r$a */
        public static class C0792a {
            /* renamed from: a */
            private int f2521a;
            /* renamed from: b */
            private int f2522b;
            /* renamed from: c */
            private int f2523c;
            /* renamed from: d */
            private int f2524d;
            /* renamed from: e */
            private Interpolator f2525e;
            /* renamed from: f */
            private boolean f2526f;
            /* renamed from: g */
            private int f2527g;

            public C0792a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public C0792a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2524d = -1;
                this.f2526f = false;
                this.f2527g = 0;
                this.f2521a = i;
                this.f2522b = i2;
                this.f2523c = i3;
                this.f2525e = interpolator;
            }

            /* renamed from: a */
            public void m3219a(int i) {
                this.f2524d = i;
            }

            /* renamed from: a */
            boolean m3222a() {
                return this.f2524d >= 0;
            }

            /* renamed from: a */
            void m3221a(RecyclerView recyclerView) {
                if (this.f2524d >= 0) {
                    int i = this.f2524d;
                    this.f2524d = -1;
                    recyclerView.m24653b(i);
                    this.f2526f = false;
                    return;
                }
                if (this.f2526f) {
                    m3218b();
                    if (this.f2525e != null) {
                        recyclerView.f18639z.m3260a(this.f2521a, this.f2522b, this.f2523c, this.f2525e);
                    } else if (this.f2523c == Integer.MIN_VALUE) {
                        recyclerView.f18639z.m3263b(this.f2521a, this.f2522b);
                    } else {
                        recyclerView.f18639z.m3258a(this.f2521a, this.f2522b, this.f2523c);
                    }
                    this.f2527g++;
                    if (this.f2527g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2526f = false;
                } else {
                    this.f2527g = 0;
                }
            }

            /* renamed from: b */
            private void m3218b() {
                if (this.f2525e != null) {
                    if (this.f2523c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                }
                if (this.f2523c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            public void m3220a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2521a = i;
                this.f2522b = i2;
                this.f2523c = i3;
                this.f2525e = interpolator;
                this.f2526f = true;
            }
        }

        /* renamed from: android.support.v7.widget.RecyclerView$r$b */
        public interface C0793b {
            /* renamed from: d */
            PointF mo684d(int i);
        }

        /* renamed from: a */
        protected abstract void mo763a();

        /* renamed from: a */
        protected abstract void mo764a(int i, int i2, C0795s c0795s, C0792a c0792a);

        /* renamed from: a */
        protected abstract void mo765a(View view, C0795s c0795s, C0792a c0792a);

        /* renamed from: b */
        protected abstract void mo766b();

        /* renamed from: a */
        void m3230a(RecyclerView recyclerView, C0783i c0783i) {
            this.f2529b = recyclerView;
            this.f2530c = c0783i;
            if (this.f2528a != -1) {
                this.f2529b.f18603C.f2550p = this.f2528a;
                this.f2532e = true;
                this.f2531d = true;
                this.f2533f = m3236e(m3240i());
                mo763a();
                this.f2529b.f18639z.m3256a();
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: d */
        public void m3234d(int i) {
            this.f2528a = i;
        }

        /* renamed from: e */
        public C0783i m3235e() {
            return this.f2530c;
        }

        /* renamed from: f */
        protected final void m3237f() {
            if (this.f2532e) {
                this.f2532e = false;
                mo766b();
                this.f2529b.f18603C.f2550p = -1;
                this.f2533f = null;
                this.f2528a = -1;
                this.f2531d = false;
                this.f2530c.m3021b(this);
                this.f2530c = null;
                this.f2529b = null;
            }
        }

        /* renamed from: g */
        public boolean m3238g() {
            return this.f2531d;
        }

        /* renamed from: h */
        public boolean m3239h() {
            return this.f2532e;
        }

        /* renamed from: i */
        public int m3240i() {
            return this.f2528a;
        }

        /* renamed from: a */
        private void m3224a(int i, int i2) {
            RecyclerView recyclerView = this.f2529b;
            if (!this.f2532e || this.f2528a == -1 || recyclerView == null) {
                m3237f();
            }
            this.f2531d = false;
            if (this.f2533f != null) {
                if (m3226a(this.f2533f) == this.f2528a) {
                    mo765a(this.f2533f, recyclerView.f18603C, this.f2534g);
                    this.f2534g.m3221a(recyclerView);
                    m3237f();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2533f = null;
                }
            }
            if (this.f2532e) {
                mo764a(i, i2, recyclerView.f18603C, this.f2534g);
                i = this.f2534g.m3222a();
                this.f2534g.m3221a(recyclerView);
                if (i == 0) {
                    return;
                }
                if (this.f2532e != 0) {
                    this.f2531d = true;
                    recyclerView.f18639z.m3256a();
                    return;
                }
                m3237f();
            }
        }

        /* renamed from: a */
        public int m3226a(View view) {
            return this.f2529b.m24678g(view);
        }

        /* renamed from: j */
        public int m3241j() {
            return this.f2529b.f18626m.m3154w();
        }

        /* renamed from: e */
        public View m3236e(int i) {
            return this.f2529b.f18626m.mo680c(i);
        }

        /* renamed from: b */
        protected void m3233b(View view) {
            if (m3226a(view) == m3240i()) {
                this.f2533f = view;
            }
        }

        /* renamed from: a */
        protected void m3229a(PointF pointF) {
            float sqrt = (float) Math.sqrt((double) ((pointF.x * pointF.x) + (pointF.y * pointF.y)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$s */
    public static class C0795s {
        /* renamed from: a */
        int f2535a = 0;
        /* renamed from: b */
        int f2536b = 0;
        /* renamed from: c */
        int f2537c = 1;
        /* renamed from: d */
        int f2538d = 0;
        /* renamed from: e */
        boolean f2539e = false;
        /* renamed from: f */
        boolean f2540f = false;
        /* renamed from: g */
        boolean f2541g = false;
        /* renamed from: h */
        boolean f2542h = false;
        /* renamed from: i */
        boolean f2543i = false;
        /* renamed from: j */
        boolean f2544j = false;
        /* renamed from: k */
        int f2545k;
        /* renamed from: l */
        long f2546l;
        /* renamed from: m */
        int f2547m;
        /* renamed from: n */
        int f2548n;
        /* renamed from: o */
        int f2549o;
        /* renamed from: p */
        private int f2550p = -1;
        /* renamed from: q */
        private SparseArray<Object> f2551q;

        /* renamed from: a */
        void m3243a(int i) {
            if ((this.f2537c & i) == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Layout state should be one of ");
                stringBuilder.append(Integer.toBinaryString(i));
                stringBuilder.append(" but it is ");
                stringBuilder.append(Integer.toBinaryString(this.f2537c));
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        void m3244a(C0771a c0771a) {
            this.f2537c = 1;
            this.f2538d = c0771a.mo91a();
            this.f2540f = false;
            this.f2541g = false;
            this.f2542h = false;
        }

        /* renamed from: a */
        public boolean m3245a() {
            return this.f2540f;
        }

        /* renamed from: b */
        public boolean m3246b() {
            return this.f2544j;
        }

        /* renamed from: c */
        public int m3247c() {
            return this.f2550p;
        }

        /* renamed from: d */
        public boolean m3248d() {
            return this.f2550p != -1;
        }

        /* renamed from: e */
        public int m3249e() {
            return this.f2540f ? this.f2535a - this.f2536b : this.f2538d;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("State{mTargetPosition=");
            stringBuilder.append(this.f2550p);
            stringBuilder.append(", mData=");
            stringBuilder.append(this.f2551q);
            stringBuilder.append(", mItemCount=");
            stringBuilder.append(this.f2538d);
            stringBuilder.append(", mIsMeasuring=");
            stringBuilder.append(this.f2542h);
            stringBuilder.append(", mPreviousLayoutItemCount=");
            stringBuilder.append(this.f2535a);
            stringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            stringBuilder.append(this.f2536b);
            stringBuilder.append(", mStructureChanged=");
            stringBuilder.append(this.f2539e);
            stringBuilder.append(", mInPreLayout=");
            stringBuilder.append(this.f2540f);
            stringBuilder.append(", mRunSimpleAnimations=");
            stringBuilder.append(this.f2543i);
            stringBuilder.append(", mRunPredictiveAnimations=");
            stringBuilder.append(this.f2544j);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$t */
    public static abstract class C0796t {
        /* renamed from: a */
        public abstract View m3250a(C0790o c0790o, int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$u */
    class C0797u implements Runnable {
        /* renamed from: a */
        Interpolator f2552a = RecyclerView.f18591I;
        /* renamed from: b */
        final /* synthetic */ RecyclerView f2553b;
        /* renamed from: c */
        private int f2554c;
        /* renamed from: d */
        private int f2555d;
        /* renamed from: e */
        private OverScroller f2556e;
        /* renamed from: f */
        private boolean f2557f = false;
        /* renamed from: g */
        private boolean f2558g = false;

        C0797u(RecyclerView recyclerView) {
            this.f2553b = recyclerView;
            this.f2556e = new OverScroller(recyclerView.getContext(), RecyclerView.f18591I);
        }

        public void run() {
            if (this.f2553b.f18626m == null) {
                m3262b();
                return;
            }
            m3254c();
            r0.f2553b.m24669d();
            OverScroller overScroller = r0.f2556e;
            C0794r c0794r = r0.f2553b.f18626m.f2500t;
            if (overScroller.computeScrollOffset()) {
                int a;
                int i;
                int b;
                int i2;
                int e;
                int[] a2 = r0.f2553b.aE;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - r0.f2554c;
                int i4 = currY - r0.f2555d;
                r0.f2554c = currX;
                r0.f2555d = currY;
                if (r0.f2553b.m24647a(i3, i4, a2, null, 1)) {
                    i3 -= a2[0];
                    i4 -= a2[1];
                }
                if (r0.f2553b.f18625l != null) {
                    r0.f2553b.m24671e();
                    r0.f2553b.m24695l();
                    C0509c.m1881a("RV Scroll");
                    r0.f2553b.m24640a(r0.f2553b.f18603C);
                    if (i3 != 0) {
                        a = r0.f2553b.f18626m.mo666a(i3, r0.f2553b.f18617d, r0.f2553b.f18603C);
                        i = i3 - a;
                    } else {
                        a = 0;
                        i = 0;
                    }
                    if (i4 != 0) {
                        b = r0.f2553b.f18626m.mo677b(i4, r0.f2553b.f18617d, r0.f2553b.f18603C);
                        i2 = i4 - b;
                    } else {
                        b = 0;
                        i2 = 0;
                    }
                    C0509c.m1880a();
                    r0.f2553b.m24708w();
                    r0.f2553b.m24697m();
                    r0.f2553b.m24644a(false);
                    if (!(c0794r == null || c0794r.m3238g() || !c0794r.m3239h())) {
                        e = r0.f2553b.f18603C.m3249e();
                        if (e == 0) {
                            c0794r.m3237f();
                        } else if (c0794r.m3240i() >= e) {
                            c0794r.m3234d(e - 1);
                            c0794r.m3224a(i3 - i, i4 - i2);
                        } else {
                            c0794r.m3224a(i3 - i, i4 - i2);
                        }
                    }
                } else {
                    a = 0;
                    i = 0;
                    b = 0;
                    i2 = 0;
                }
                if (!r0.f2553b.f18628o.isEmpty()) {
                    r0.f2553b.invalidate();
                }
                if (r0.f2553b.getOverScrollMode() != 2) {
                    r0.f2553b.m24664c(i3, i4);
                }
                if (!(r0.f2553b.m24645a(a, b, i, i2, null, 1) || (i == 0 && i2 == 0))) {
                    int i5;
                    e = (int) overScroller.getCurrVelocity();
                    if (i != currX) {
                        if (i < 0) {
                            i5 = -e;
                        } else if (i > 0) {
                            i5 = e;
                        }
                        if (i2 != currY) {
                            if (i2 < 0) {
                                e = -e;
                            } else if (i2 > 0) {
                            }
                            if (r0.f2553b.getOverScrollMode() != 2) {
                                r0.f2553b.m24670d(i5, e);
                            }
                            if ((i5 != 0 || i == currX || overScroller.getFinalX() == 0) && (e != 0 || i2 == currY || overScroller.getFinalY() == 0)) {
                                overScroller.abortAnimation();
                            }
                        }
                        e = 0;
                        if (r0.f2553b.getOverScrollMode() != 2) {
                            r0.f2553b.m24670d(i5, e);
                        }
                        overScroller.abortAnimation();
                    }
                    i5 = 0;
                    if (i2 != currY) {
                        if (i2 < 0) {
                            e = -e;
                        } else if (i2 > 0) {
                        }
                        if (r0.f2553b.getOverScrollMode() != 2) {
                            r0.f2553b.m24670d(i5, e);
                        }
                        overScroller.abortAnimation();
                    }
                    e = 0;
                    if (r0.f2553b.getOverScrollMode() != 2) {
                        r0.f2553b.m24670d(i5, e);
                    }
                    overScroller.abortAnimation();
                }
                if (!(a == 0 && b == 0)) {
                    r0.f2553b.m24688i(a, b);
                }
                if (!r0.f2553b.awakenScrollBars()) {
                    r0.f2553b.invalidate();
                }
                Object obj = (i4 != 0 && r0.f2553b.f18626m.mo690f() && b == i4) ? 1 : null;
                Object obj2 = (i3 != 0 && r0.f2553b.f18626m.mo688e() && a == i3) ? 1 : null;
                if (!(i3 == 0 && i4 == 0) && obj2 == null) {
                    if (obj == null) {
                        obj2 = null;
                        if (!overScroller.isFinished()) {
                            if (obj2 == null || r0.f2553b.m24692j(1)) {
                                m3256a();
                                if (r0.f2553b.f18601A != null) {
                                    r0.f2553b.f18601A.m3458a(r0.f2553b, i3, i4);
                                }
                            }
                        }
                        r0.f2553b.setScrollState(0);
                        if (RecyclerView.f18594L) {
                            r0.f2553b.f18602B.m16674a();
                        }
                        r0.f2553b.m24687i(1);
                    }
                }
                obj2 = 1;
                if (overScroller.isFinished()) {
                    if (obj2 == null) {
                    }
                    m3256a();
                    if (r0.f2553b.f18601A != null) {
                        r0.f2553b.f18601A.m3458a(r0.f2553b, i3, i4);
                    }
                }
                r0.f2553b.setScrollState(0);
                if (RecyclerView.f18594L) {
                    r0.f2553b.f18602B.m16674a();
                }
                r0.f2553b.m24687i(1);
            }
            if (c0794r != null) {
                if (c0794r.m3238g()) {
                    c0794r.m3224a(0, 0);
                }
                if (!r0.f2558g) {
                    c0794r.m3237f();
                }
            }
            m3255d();
        }

        /* renamed from: c */
        private void m3254c() {
            this.f2558g = false;
            this.f2557f = true;
        }

        /* renamed from: d */
        private void m3255d() {
            this.f2557f = false;
            if (this.f2558g) {
                m3256a();
            }
        }

        /* renamed from: a */
        void m3256a() {
            if (this.f2557f) {
                this.f2558g = true;
                return;
            }
            this.f2553b.removeCallbacks(this);
            C0560r.m2178a(this.f2553b, (Runnable) this);
        }

        /* renamed from: a */
        public void m3257a(int i, int i2) {
            this.f2553b.setScrollState(2);
            this.f2555d = 0;
            this.f2554c = 0;
            this.f2556e.fling(0, 0, i, i2, Integer.MIN_VALUE, BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, BaseClientBuilder.API_PRIORITY_OTHER);
            m3256a();
        }

        /* renamed from: b */
        public void m3263b(int i, int i2) {
            m3259a(i, i2, 0, 0);
        }

        /* renamed from: a */
        public void m3259a(int i, int i2, int i3, int i4) {
            m3258a(i, i2, m3253b(i, i2, i3, i4));
        }

        /* renamed from: a */
        private float m3251a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: b */
        private int m3253b(int i, int i2, int i3, int i4) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            Object obj = abs > abs2 ? 1 : null;
            i3 = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            i = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            i2 = obj != null ? this.f2553b.getWidth() : this.f2553b.getHeight();
            i4 = i2 / 2;
            i2 = (float) i2;
            i4 = (float) i4;
            i4 += m3251a(Math.min(1.0f, (((float) i) * 1065353216) / i2)) * i4;
            if (i3 > 0) {
                i = Math.round(Math.abs(i4 / ((float) i3)) * 1148846080) * 4;
            } else {
                if (obj == null) {
                    abs = abs2;
                }
                i = (int) (((((float) abs) / i2) + 1065353216) * 1133903872);
            }
            return Math.min(i, 2000);
        }

        /* renamed from: a */
        public void m3258a(int i, int i2, int i3) {
            m3260a(i, i2, i3, RecyclerView.f18591I);
        }

        /* renamed from: a */
        public void m3261a(int i, int i2, Interpolator interpolator) {
            int b = m3253b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.f18591I;
            }
            m3260a(i, i2, b, interpolator);
        }

        /* renamed from: a */
        public void m3260a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f2552a != interpolator) {
                this.f2552a = interpolator;
                this.f2556e = new OverScroller(this.f2553b.getContext(), interpolator);
            }
            this.f2553b.setScrollState(2);
            this.f2555d = 0;
            this.f2554c = 0;
            this.f2556e.startScroll(0, 0, i, i2, i3);
            if (VERSION.SDK_INT < 23) {
                this.f2556e.computeScrollOffset();
            }
            m3256a();
        }

        /* renamed from: b */
        public void m3262b() {
            this.f2553b.removeCallbacks(this);
            this.f2556e.abortAnimation();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$v */
    public static abstract class C0798v {
        /* renamed from: o */
        private static final List<Object> f2559o = Collections.EMPTY_LIST;
        /* renamed from: a */
        public final View f2560a;
        /* renamed from: b */
        WeakReference<RecyclerView> f2561b;
        /* renamed from: c */
        int f2562c = -1;
        /* renamed from: d */
        int f2563d = -1;
        /* renamed from: e */
        long f2564e = -1;
        /* renamed from: f */
        int f2565f = -1;
        /* renamed from: g */
        int f2566g = -1;
        /* renamed from: h */
        C0798v f2567h = null;
        /* renamed from: i */
        C0798v f2568i = null;
        /* renamed from: j */
        List<Object> f2569j = null;
        /* renamed from: k */
        List<Object> f2570k = null;
        /* renamed from: l */
        int f2571l = -1;
        /* renamed from: m */
        RecyclerView f2572m;
        /* renamed from: n */
        private int f2573n;
        /* renamed from: p */
        private int f2574p = 0;
        /* renamed from: q */
        private C0790o f2575q = null;
        /* renamed from: r */
        private boolean f2576r = false;
        /* renamed from: s */
        private int f2577s = 0;

        public C0798v(View view) {
            if (view != null) {
                this.f2560a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: a */
        void m3279a(int i, int i2, boolean z) {
            m3285b(8);
            m3280a(i2, z);
            this.f2562c = i;
        }

        /* renamed from: a */
        void m3280a(int i, boolean z) {
            if (this.f2563d == -1) {
                this.f2563d = this.f2562c;
            }
            if (this.f2566g == -1) {
                this.f2566g = this.f2562c;
            }
            if (z) {
                this.f2566g += i;
            }
            this.f2562c += i;
            if (this.f2560a.getLayoutParams() != 0) {
                ((LayoutParams) this.f2560a.getLayoutParams()).f2470e = true;
            }
        }

        /* renamed from: a */
        void m3277a() {
            this.f2563d = -1;
            this.f2566g = -1;
        }

        void g_() {
            if (this.f2563d == -1) {
                this.f2563d = this.f2562c;
            }
        }

        boolean h_() {
            return (this.f2573n & 128) != 0;
        }

        public final int i_() {
            return this.f2566g == -1 ? this.f2562c : this.f2566g;
        }

        /* renamed from: e */
        public final int m3286e() {
            if (this.f2572m == null) {
                return -1;
            }
            return this.f2572m.m24666d(this);
        }

        /* renamed from: f */
        public final int m3287f() {
            return this.f2563d;
        }

        /* renamed from: g */
        public final long m3288g() {
            return this.f2564e;
        }

        /* renamed from: h */
        public final int m3289h() {
            return this.f2565f;
        }

        /* renamed from: i */
        boolean m3290i() {
            return this.f2575q != null;
        }

        /* renamed from: j */
        void m3291j() {
            this.f2575q.m3204c(this);
        }

        /* renamed from: k */
        boolean m3292k() {
            return (this.f2573n & 32) != 0;
        }

        /* renamed from: l */
        void m3293l() {
            this.f2573n &= -33;
        }

        /* renamed from: m */
        void m3294m() {
            this.f2573n &= -257;
        }

        /* renamed from: a */
        void m3281a(C0790o c0790o, boolean z) {
            this.f2575q = c0790o;
            this.f2576r = z;
        }

        /* renamed from: n */
        boolean m3295n() {
            return (this.f2573n & 4) != 0;
        }

        /* renamed from: o */
        boolean m3296o() {
            return (this.f2573n & 2) != 0;
        }

        /* renamed from: p */
        boolean m3297p() {
            return (this.f2573n & 1) != 0;
        }

        /* renamed from: q */
        boolean m3298q() {
            return (this.f2573n & 8) != 0;
        }

        /* renamed from: a */
        boolean m3284a(int i) {
            return (i & this.f2573n) != 0;
        }

        /* renamed from: r */
        boolean m3299r() {
            return (this.f2573n & 256) != 0;
        }

        /* renamed from: s */
        boolean m3300s() {
            if ((this.f2573n & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
                if (!m3295n()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        void m3278a(int i, int i2) {
            this.f2573n = (i & i2) | (this.f2573n & (i2 ^ -1));
        }

        /* renamed from: b */
        void m3285b(int i) {
            this.f2573n = i | this.f2573n;
        }

        /* renamed from: a */
        void m3282a(Object obj) {
            if (obj == null) {
                m3285b(1024);
            } else if ((1024 & this.f2573n) == 0) {
                mo1439y();
                this.f2569j.add(obj);
            }
        }

        /* renamed from: y */
        private void mo1439y() {
            if (this.f2569j == null) {
                this.f2569j = new ArrayList();
                this.f2570k = Collections.unmodifiableList(this.f2569j);
            }
        }

        /* renamed from: t */
        void m3301t() {
            if (this.f2569j != null) {
                this.f2569j.clear();
            }
            this.f2573n &= -1025;
        }

        /* renamed from: u */
        List<Object> m3302u() {
            if ((this.f2573n & 1024) != 0) {
                return f2559o;
            }
            if (this.f2569j != null) {
                if (this.f2569j.size() != 0) {
                    return this.f2570k;
                }
            }
            return f2559o;
        }

        /* renamed from: v */
        void m3303v() {
            this.f2573n = 0;
            this.f2562c = -1;
            this.f2563d = -1;
            this.f2564e = -1;
            this.f2566g = -1;
            this.f2574p = 0;
            this.f2567h = null;
            this.f2568i = null;
            m3301t();
            this.f2577s = 0;
            this.f2571l = -1;
            RecyclerView.m24615c(this);
        }

        /* renamed from: a */
        private void m3267a(RecyclerView recyclerView) {
            if (this.f2571l != -1) {
                this.f2577s = this.f2571l;
            } else {
                this.f2577s = C0560r.m2191d(this.f2560a);
            }
            recyclerView.m24648a(this, 4);
        }

        /* renamed from: b */
        private void m3271b(RecyclerView recyclerView) {
            recyclerView.m24648a(this, this.f2577s);
            this.f2577s = null;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewHolder{");
            stringBuilder.append(Integer.toHexString(hashCode()));
            stringBuilder.append(" position=");
            stringBuilder.append(this.f2562c);
            stringBuilder.append(" id=");
            stringBuilder.append(this.f2564e);
            stringBuilder.append(", oldPos=");
            stringBuilder.append(this.f2563d);
            stringBuilder.append(", pLpos:");
            stringBuilder.append(this.f2566g);
            StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
            if (m3290i()) {
                stringBuilder2.append(" scrap ");
                stringBuilder2.append(this.f2576r ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m3295n()) {
                stringBuilder2.append(" invalid");
            }
            if (!m3297p()) {
                stringBuilder2.append(" unbound");
            }
            if (m3296o()) {
                stringBuilder2.append(" update");
            }
            if (m3298q()) {
                stringBuilder2.append(" removed");
            }
            if (h_()) {
                stringBuilder2.append(" ignored");
            }
            if (m3299r()) {
                stringBuilder2.append(" tmpDetached");
            }
            if (!m3304w()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(" not recyclable(");
                stringBuilder.append(this.f2574p);
                stringBuilder.append(")");
                stringBuilder2.append(stringBuilder.toString());
            }
            if (m3300s()) {
                stringBuilder2.append(" undefined adapter position");
            }
            if (this.f2560a.getParent() == null) {
                stringBuilder2.append(" no parent");
            }
            stringBuilder2.append("}");
            return stringBuilder2.toString();
        }

        /* renamed from: a */
        public final void m3283a(boolean z) {
            this.f2574p = z ? this.f2574p - 1 : this.f2574p + 1;
            if (this.f2574p < 0) {
                this.f2574p = false;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                stringBuilder.append(this);
                Log.e("View", stringBuilder.toString());
            } else if (!z && this.f2574p == 1) {
                this.f2573n |= 16;
            } else if (z && !this.f2574p) {
                this.f2573n &= -17;
            }
        }

        /* renamed from: w */
        public final boolean m3304w() {
            return (this.f2573n & 16) == 0 && !C0560r.m2188b(this.f2560a);
        }

        /* renamed from: z */
        private boolean m3276z() {
            return (this.f2573n & 16) != 0;
        }

        /* renamed from: A */
        private boolean m3264A() {
            return (this.f2573n & 16) == 0 && C0560r.m2188b(this.f2560a);
        }

        /* renamed from: x */
        boolean m3305x() {
            return (this.f2573n & 2) != 0;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$4 */
    class C32444 implements C0850b {
        /* renamed from: a */
        final /* synthetic */ RecyclerView f13802a;

        C32444(RecyclerView recyclerView) {
            this.f13802a = recyclerView;
        }

        /* renamed from: a */
        public void mo708a(C0798v c0798v, C0778c c0778c, C0778c c0778c2) {
            this.f13802a.f18617d.m3204c(c0798v);
            this.f13802a.m24657b(c0798v, c0778c, c0778c2);
        }

        /* renamed from: b */
        public void mo709b(C0798v c0798v, C0778c c0778c, C0778c c0778c2) {
            this.f13802a.m24642a(c0798v, c0778c, c0778c2);
        }

        /* renamed from: c */
        public void mo710c(C0798v c0798v, C0778c c0778c, C0778c c0778c2) {
            c0798v.m3283a(false);
            if (this.f13802a.f18636w) {
                if (this.f13802a.f18638y.mo782a(c0798v, c0798v, c0778c, c0778c2) != null) {
                    this.f13802a.m24701p();
                }
            } else if (this.f13802a.f18638y.mo784c(c0798v, c0778c, c0778c2) != null) {
                this.f13802a.m24701p();
            }
        }

        /* renamed from: a */
        public void mo707a(C0798v c0798v) {
            this.f13802a.f18626m.m3070a(c0798v.f2560a, this.f13802a.f18617d);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$5 */
    class C32455 implements C0871b {
        /* renamed from: a */
        final /* synthetic */ RecyclerView f13803a;

        C32455(RecyclerView recyclerView) {
            this.f13803a = recyclerView;
        }

        /* renamed from: a */
        public int mo711a() {
            return this.f13803a.getChildCount();
        }

        /* renamed from: a */
        public void mo714a(View view, int i) {
            this.f13803a.addView(view, i);
            this.f13803a.m24698m(view);
        }

        /* renamed from: a */
        public int mo712a(View view) {
            return this.f13803a.indexOfChild(view);
        }

        /* renamed from: a */
        public void mo713a(int i) {
            View childAt = this.f13803a.getChildAt(i);
            if (childAt != null) {
                this.f13803a.m24696l(childAt);
                childAt.clearAnimation();
            }
            this.f13803a.removeViewAt(i);
        }

        /* renamed from: b */
        public View mo717b(int i) {
            return this.f13803a.getChildAt(i);
        }

        /* renamed from: b */
        public void mo718b() {
            int a = mo711a();
            for (int i = 0; i < a; i++) {
                View b = mo717b(i);
                this.f13803a.m24696l(b);
                b.clearAnimation();
            }
            this.f13803a.removeAllViews();
        }

        /* renamed from: b */
        public C0798v mo716b(View view) {
            return RecyclerView.m24617e(view);
        }

        /* renamed from: a */
        public void mo715a(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
            C0798v e = RecyclerView.m24617e(view);
            if (e != null) {
                if (!e.m3299r()) {
                    if (!e.h_()) {
                        i = new StringBuilder();
                        i.append("Called attach on a child which is not detached: ");
                        i.append(e);
                        i.append(this.f13803a.m24628a());
                        throw new IllegalArgumentException(i.toString());
                    }
                }
                e.m3294m();
            }
            this.f13803a.attachViewToParent(view, i, layoutParams);
        }

        /* renamed from: c */
        public void mo719c(int i) {
            View b = mo717b(i);
            if (b != null) {
                C0798v e = RecyclerView.m24617e(b);
                if (e != null) {
                    if (e.m3299r()) {
                        if (!e.h_()) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("called detach on an already detached child ");
                            stringBuilder.append(e);
                            stringBuilder.append(this.f13803a.m24628a());
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    e.m3285b(256);
                }
            }
            this.f13803a.detachViewFromParent(i);
        }

        /* renamed from: c */
        public void mo720c(View view) {
            C0798v e = RecyclerView.m24617e(view);
            if (e != null) {
                e.m3267a(this.f13803a);
            }
        }

        /* renamed from: d */
        public void mo721d(View view) {
            view = RecyclerView.m24617e(view);
            if (view != null) {
                view.m3271b(this.f13803a);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$6 */
    class C32466 implements C0857a {
        /* renamed from: a */
        final /* synthetic */ RecyclerView f13804a;

        C32466(RecyclerView recyclerView) {
            this.f13804a = recyclerView;
        }

        /* renamed from: a */
        public C0798v mo722a(int i) {
            i = this.f13804a.m24625a(i, true);
            if (i == 0 || this.f13804a.f18619f.m3815c(i.f2560a)) {
                return null;
            }
            return i;
        }

        /* renamed from: a */
        public void mo723a(int i, int i2) {
            this.f13804a.m24633a(i, i2, true);
            this.f13804a.f18604D = true;
            i = this.f13804a.f18603C;
            i.f2536b += i2;
        }

        /* renamed from: b */
        public void mo726b(int i, int i2) {
            this.f13804a.m24633a(i, i2, false);
            this.f13804a.f18604D = true;
        }

        /* renamed from: a */
        public void mo724a(int i, int i2, Object obj) {
            this.f13804a.m24632a(i, i2, obj);
            this.f13804a.f18605E = true;
        }

        /* renamed from: a */
        public void mo725a(C0858b c0858b) {
            m16468c(c0858b);
        }

        /* renamed from: c */
        void m16468c(C0858b c0858b) {
            int i = c0858b.f2911a;
            if (i == 4) {
                this.f13804a.f18626m.mo749a(this.f13804a, c0858b.f2912b, c0858b.f2914d, c0858b.f2913c);
            } else if (i != 8) {
                switch (i) {
                    case 1:
                        this.f13804a.f18626m.mo747a(this.f13804a, c0858b.f2912b, c0858b.f2914d);
                        return;
                    case 2:
                        this.f13804a.f18626m.mo752b(this.f13804a, c0858b.f2912b, c0858b.f2914d);
                        return;
                    default:
                        return;
                }
            } else {
                this.f13804a.f18626m.mo748a(this.f13804a, c0858b.f2912b, c0858b.f2914d, 1);
            }
        }

        /* renamed from: b */
        public void mo727b(C0858b c0858b) {
            m16468c(c0858b);
        }

        /* renamed from: c */
        public void mo728c(int i, int i2) {
            this.f13804a.m24681g(i, i2);
            this.f13804a.f18604D = true;
        }

        /* renamed from: d */
        public void mo729d(int i, int i2) {
            this.f13804a.m24677f(i, i2);
            this.f13804a.f18604D = true;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C07701();
        /* renamed from: a */
        Parcelable f13805a;

        /* renamed from: android.support.v7.widget.RecyclerView$SavedState$1 */
        static class C07701 implements ClassLoaderCreator<SavedState> {
            C07701() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2943a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m2944a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m2945a(i);
            }

            /* renamed from: a */
            public SavedState m2944a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m2943a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m2945a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C0783i.class.getClassLoader();
            }
            this.f13805a = parcel.readParcelable(classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f13805a, 0);
        }

        /* renamed from: a */
        void m16470a(SavedState savedState) {
            this.f13805a = savedState.f13805a;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$g */
    private class C3247g implements C0777b {
        /* renamed from: a */
        final /* synthetic */ RecyclerView f13806a;

        C3247g(RecyclerView recyclerView) {
            this.f13806a = recyclerView;
        }

        /* renamed from: a */
        public void mo730a(C0798v c0798v) {
            c0798v.m3283a(true);
            if (c0798v.f2567h != null && c0798v.f2568i == null) {
                c0798v.f2567h = null;
            }
            c0798v.f2568i = null;
            if (!c0798v.m3276z() && !this.f13806a.m24649a(c0798v.f2560a) && c0798v.m3299r()) {
                this.f13806a.removeDetachedView(c0798v.f2560a, false);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$q */
    private class C3250q extends C0773c {
        /* renamed from: a */
        final /* synthetic */ RecyclerView f13809a;

        C3250q(RecyclerView recyclerView) {
            this.f13809a = recyclerView;
        }

        /* renamed from: a */
        public void mo736a() {
            this.f13809a.m24643a(null);
            this.f13809a.f18603C.f2539e = true;
            this.f13809a.m24665c(true);
            if (!this.f13809a.f18618e.m16833d()) {
                this.f13809a.requestLayout();
            }
        }

        /* renamed from: a */
        public void mo738a(int i, int i2, Object obj) {
            this.f13809a.m24643a(null);
            if (this.f13809a.f18618e.m16826a(i, i2, obj) != 0) {
                m16485b();
            }
        }

        /* renamed from: b */
        public void mo739b(int i, int i2) {
            this.f13809a.m24643a(null);
            if (this.f13809a.f18618e.m16829b(i, i2) != 0) {
                m16485b();
            }
        }

        /* renamed from: c */
        public void mo740c(int i, int i2) {
            this.f13809a.m24643a(null);
            if (this.f13809a.f18618e.m16832c(i, i2) != 0) {
                m16485b();
            }
        }

        /* renamed from: a */
        public void mo737a(int i, int i2, int i3) {
            this.f13809a.m24643a(null);
            if (this.f13809a.f18618e.m16825a(i, i2, i3) != 0) {
                m16485b();
            }
        }

        /* renamed from: b */
        void m16485b() {
            if (RecyclerView.f18600c && this.f13809a.f18630q && this.f13809a.f18629p) {
                C0560r.m2178a(this.f13809a, this.f13809a.f18622i);
                return;
            }
            this.f13809a.f18635v = true;
            this.f13809a.requestLayout();
        }
    }

    /* renamed from: g */
    public void mo4912g(int i) {
    }

    /* renamed from: h */
    public void m24684h(int i, int i2) {
    }

    /* renamed from: h */
    public void m24685h(View view) {
    }

    /* renamed from: i */
    public void m24689i(View view) {
    }

    static {
        boolean z;
        if (!(VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19)) {
            if (VERSION.SDK_INT != 20) {
                z = false;
                f18598a = z;
            }
        }
        z = true;
        f18598a = z;
        if (VERSION.SDK_INT < 23) {
        }
        if (VERSION.SDK_INT < 16) {
        }
        if (VERSION.SDK_INT < 21) {
        }
        if (VERSION.SDK_INT > 15) {
        }
        if (VERSION.SDK_INT > 15) {
        }
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18609P = new C3250q(this);
        this.f18617d = new C0790o(this);
        this.f18620g = new bf();
        this.f18622i = new C07671(this);
        this.f18623j = new Rect();
        this.f18611R = new Rect();
        this.f18624k = new RectF();
        this.f18628o = new ArrayList();
        this.f18612S = new ArrayList();
        this.f18614U = 0;
        this.f18636w = false;
        this.f18637x = false;
        this.ac = 0;
        this.ad = 0;
        this.ae = new C0775e();
        this.f18638y = new C4472x();
        this.aj = 0;
        this.ak = -1;
        this.au = Float.MIN_VALUE;
        this.av = Float.MIN_VALUE;
        boolean z = true;
        this.aw = true;
        this.f18639z = new C0797u(this);
        this.f18602B = f18594L ? new C3255a() : null;
        this.f18603C = new C0795s();
        this.f18604D = false;
        this.f18605E = false;
        this.az = new C3247g(this);
        this.f18606F = false;
        this.aB = new int[2];
        this.aD = new int[2];
        this.aE = new int[2];
        this.aF = new int[2];
        this.f18608H = new ArrayList();
        this.aG = new C07682(this);
        this.aH = new C32444(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f18593K, i, 0);
            this.f18621h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f18621h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.aq = viewConfiguration.getScaledTouchSlop();
        this.au = C0561s.m2215a(viewConfiguration, context);
        this.av = C0561s.m2216b(viewConfiguration, context);
        this.as = viewConfiguration.getScaledMinimumFlingVelocity();
        this.at = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f18638y.m2989a(this.az);
        m24652b();
        mo4658z();
        if (C0560r.m2191d(this) == 0) {
            C0560r.m2167a((View) this, 1);
        }
        this.aa = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new ak(this));
        if (attributeSet != null) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0685b.RecyclerView, i, 0);
            String string = obtainStyledAttributes.getString(C0685b.RecyclerView_layoutManager);
            if (obtainStyledAttributes.getInt(C0685b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f18631r = obtainStyledAttributes.getBoolean(C0685b.RecyclerView_fastScrollEnabled, false);
            if (this.f18631r) {
                m24634a((StateListDrawable) obtainStyledAttributes.getDrawable(C0685b.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(C0685b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(C0685b.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(C0685b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes.recycle();
            m24601a(context, string, attributeSet, i, 0);
            if (VERSION.SDK_INT >= 21) {
                context = context.obtainStyledAttributes(attributeSet, f18592J, i, 0);
                attributeSet = context.getBoolean(0, true);
                context.recycle();
                z = attributeSet;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: a */
    String m24628a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(super.toString());
        stringBuilder.append(", adapter:");
        stringBuilder.append(this.f18625l);
        stringBuilder.append(", layout:");
        stringBuilder.append(this.f18626m);
        stringBuilder.append(", context:");
        stringBuilder.append(getContext());
        return stringBuilder.toString();
    }

    public ak getCompatAccessibilityDelegate() {
        return this.f18607G;
    }

    public void setAccessibilityDelegateCompat(ak akVar) {
        this.f18607G = akVar;
        C0560r.m2175a((View) this, this.f18607G);
    }

    /* renamed from: a */
    private void m24601a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        if (str != null) {
            str = str.trim();
            if (!str.isEmpty()) {
                str = m24598a(context, str);
                try {
                    ClassLoader classLoader;
                    Constructor constructor;
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = classLoader.loadClass(str).asSubclass(C0783i.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f18597O);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (Context context2) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0783i) constructor.newInstance(objArr));
                } catch (int i3) {
                    i3.initCause(context2);
                    i2 = new StringBuilder();
                    i2.append(attributeSet.getPositionDescription());
                    i2.append(": Error creating LayoutManager ");
                    i2.append(str);
                    throw new IllegalStateException(i2.toString(), i3);
                } catch (Context context22) {
                    i2 = new StringBuilder();
                    i2.append(attributeSet.getPositionDescription());
                    i2.append(": Unable to find LayoutManager ");
                    i2.append(str);
                    throw new IllegalStateException(i2.toString(), context22);
                } catch (Context context222) {
                    i2 = new StringBuilder();
                    i2.append(attributeSet.getPositionDescription());
                    i2.append(": Could not instantiate the LayoutManager: ");
                    i2.append(str);
                    throw new IllegalStateException(i2.toString(), context222);
                } catch (Context context2222) {
                    i2 = new StringBuilder();
                    i2.append(attributeSet.getPositionDescription());
                    i2.append(": Could not instantiate the LayoutManager: ");
                    i2.append(str);
                    throw new IllegalStateException(i2.toString(), context2222);
                } catch (Context context22222) {
                    i2 = new StringBuilder();
                    i2.append(attributeSet.getPositionDescription());
                    i2.append(": Cannot access non-public constructor ");
                    i2.append(str);
                    throw new IllegalStateException(i2.toString(), context22222);
                } catch (Context context222222) {
                    i2 = new StringBuilder();
                    i2.append(attributeSet.getPositionDescription());
                    i2.append(": Class is not a LayoutManager ");
                    i2.append(str);
                    throw new IllegalStateException(i2.toString(), context222222);
                }
            }
        }
    }

    /* renamed from: a */
    private String m24598a(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(str);
            return stringBuilder.toString();
        } else if (str.contains(".") != null) {
            return str;
        } else {
            context = new StringBuilder();
            context.append(RecyclerView.class.getPackage().getName());
            context.append('.');
            context.append(str);
            return context.toString();
        }
    }

    /* renamed from: z */
    private void mo4658z() {
        this.f18619f = new C0872u(new C32455(this));
    }

    /* renamed from: b */
    void m24652b() {
        this.f18618e = new C3261e(new C32466(this));
    }

    public void setHasFixedSize(boolean z) {
        this.f18630q = z;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f18621h) {
            m24694k();
        }
        this.f18621h = z;
        super.setClipToPadding(z);
        if (this.f18632s) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.f18621h;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.aq = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("setScrollingTouchSlop(): bad argument constant ");
                stringBuilder.append(i);
                stringBuilder.append("; using default value");
                Log.w("RecyclerView", stringBuilder.toString());
                break;
        }
        this.aq = viewConfiguration.getScaledTouchSlop();
    }

    public void setAdapter(C0771a c0771a) {
        setLayoutFrozen(false);
        m24602a(c0771a, false, true);
        m24665c(false);
        requestLayout();
    }

    /* renamed from: c */
    void m24662c() {
        if (this.f18638y != null) {
            this.f18638y.mo3874d();
        }
        if (this.f18626m != null) {
            this.f18626m.m3100c(this.f18617d);
            this.f18626m.m3089b(this.f18617d);
        }
        this.f18617d.m3185a();
    }

    /* renamed from: a */
    private void m24602a(C0771a c0771a, boolean z, boolean z2) {
        if (this.f18625l != null) {
            this.f18625l.m2958b(this.f18609P);
            this.f18625l.m2960b(this);
        }
        if (!z || z2) {
            m24662c();
        }
        this.f18618e.m16820a();
        C0771a c0771a2 = this.f18625l;
        this.f18625l = c0771a;
        if (c0771a != null) {
            c0771a.m2950a(this.f18609P);
            c0771a.m2954a(this);
        }
        if (this.f18626m != null) {
            this.f18626m.m3049a(c0771a2, this.f18625l);
        }
        this.f18617d.m3189a(c0771a2, this.f18625l, z);
        this.f18603C.f2539e = true;
    }

    public C0771a getAdapter() {
        return this.f18625l;
    }

    public void setRecyclerListener(C0791p c0791p) {
        this.f18627n = c0791p;
    }

    public int getBaseline() {
        if (this.f18626m != null) {
            return this.f18626m.m3153v();
        }
        return super.getBaseline();
    }

    /* renamed from: a */
    public void m24637a(C0784j c0784j) {
        if (this.ab == null) {
            this.ab = new ArrayList();
        }
        this.ab.add(c0784j);
    }

    public void setLayoutManager(C0783i c0783i) {
        if (c0783i != this.f18626m) {
            m24675f();
            if (this.f18626m != null) {
                if (this.f18638y != null) {
                    this.f18638y.mo3874d();
                }
                this.f18626m.m3100c(this.f18617d);
                this.f18626m.m3089b(this.f18617d);
                this.f18617d.m3185a();
                if (this.f18629p) {
                    this.f18626m.m3092b(this, this.f18617d);
                }
                this.f18626m.m3090b(null);
                this.f18626m = null;
            } else {
                this.f18617d.m3185a();
            }
            this.f18619f.m3804a();
            this.f18626m = c0783i;
            if (c0783i != null) {
                if (c0783i.f2497q == null) {
                    this.f18626m.m3090b(this);
                    if (this.f18629p != null) {
                        this.f18626m.m3102c(this);
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("LayoutManager ");
                    stringBuilder.append(c0783i);
                    stringBuilder.append(" is already attached to a RecyclerView:");
                    stringBuilder.append(c0783i.f2497q.m24628a());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            this.f18617d.m3197b();
            requestLayout();
        }
    }

    public void setOnFlingListener(C0785k c0785k) {
        this.ar = c0785k;
    }

    public C0785k getOnFlingListener() {
        return this.ar;
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (this.f18610Q != null) {
            savedState.m16470a(this.f18610Q);
        } else if (this.f18626m != null) {
            savedState.f13805a = this.f18626m.mo685d();
        } else {
            savedState.f13805a = null;
        }
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f18610Q = (SavedState) parcelable;
            super.onRestoreInstanceState(this.f18610Q.m1885a());
            if (!(this.f18626m == null || this.f18610Q.f13805a == null)) {
                this.f18626m.mo671a(this.f18610Q.f13805a);
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* renamed from: e */
    private void m24618e(C0798v c0798v) {
        View view = c0798v.f2560a;
        Object obj = view.getParent() == this ? 1 : null;
        this.f18617d.m3204c(m24651b(view));
        if (c0798v.m3299r() != null) {
            this.f18619f.m3807a(view, -1, view.getLayoutParams(), true);
        } else if (obj == null) {
            this.f18619f.m3809a(view, true);
        } else {
            this.f18619f.m3817d(view);
        }
    }

    /* renamed from: a */
    boolean m24649a(View view) {
        m24671e();
        boolean f = this.f18619f.m3820f(view);
        if (f) {
            C0798v e = m24617e(view);
            this.f18617d.m3204c(e);
            this.f18617d.m3199b(e);
        }
        m24644a(f ^ 1);
        return f;
    }

    public C0783i getLayoutManager() {
        return this.f18626m;
    }

    public C0789n getRecycledViewPool() {
        return this.f18617d.m3213g();
    }

    public void setRecycledViewPool(C0789n c0789n) {
        this.f18617d.m3190a(c0789n);
    }

    public void setViewCacheExtension(C0796t c0796t) {
        this.f18617d.m3191a(c0796t);
    }

    public void setItemViewCacheSize(int i) {
        this.f18617d.m3186a(i);
    }

    public int getScrollState() {
        return this.aj;
    }

    void setScrollState(int i) {
        if (i != this.aj) {
            this.aj = i;
            if (i != 2) {
                mo4654B();
            }
            m24683h(i);
        }
    }

    /* renamed from: a */
    public void m24636a(C0780h c0780h, int i) {
        if (this.f18626m != null) {
            this.f18626m.mo676a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f18628o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f18628o.add(c0780h);
        } else {
            this.f18628o.add(i, c0780h);
        }
        m24703r();
        requestLayout();
    }

    /* renamed from: a */
    public void m24635a(C0780h c0780h) {
        m24636a(c0780h, -1);
    }

    public int getItemDecorationCount() {
        return this.f18628o.size();
    }

    /* renamed from: b */
    public void m24654b(C0780h c0780h) {
        if (this.f18626m != null) {
            this.f18626m.mo676a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f18628o.remove(c0780h);
        if (this.f18628o.isEmpty() != null) {
            setWillNotDraw(getOverScrollMode() == 2 ? true : null);
        }
        m24703r();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0774d c0774d) {
        if (c0774d != this.aA) {
            this.aA = c0774d;
            setChildrenDrawingOrderEnabled(this.aA != null ? true : null);
        }
    }

    @Deprecated
    public void setOnScrollListener(C0787m c0787m) {
        this.ax = c0787m;
    }

    /* renamed from: a */
    public void m24639a(C0787m c0787m) {
        if (this.ay == null) {
            this.ay = new ArrayList();
        }
        this.ay.add(c0787m);
    }

    /* renamed from: b */
    public void m24656b(C0787m c0787m) {
        if (this.ay != null) {
            this.ay.remove(c0787m);
        }
    }

    /* renamed from: a */
    public void m24629a(int i) {
        if (!this.f18634u) {
            m24675f();
            if (this.f18626m == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            this.f18626m.mo687e(i);
            awakenScrollBars();
        }
    }

    /* renamed from: b */
    void m24653b(int i) {
        if (this.f18626m != null) {
            this.f18626m.mo687e(i);
            awakenScrollBars();
        }
    }

    /* renamed from: c */
    public void m24663c(int i) {
        if (!this.f18634u) {
            if (this.f18626m == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                this.f18626m.mo674a(this, this.f18603C, i);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int i, int i2) {
        if (this.f18626m == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f18634u) {
            boolean e = this.f18626m.mo688e();
            boolean f = this.f18626m.mo690f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                m24646a(i, i2, null);
            }
        }
    }

    /* renamed from: d */
    void m24669d() {
        if (this.f18632s) {
            if (!this.f18636w) {
                if (this.f18618e.m16833d()) {
                    if (this.f18618e.m16824a(4) && !this.f18618e.m16824a(11)) {
                        C0509c.m1881a("RV PartialInvalidate");
                        m24671e();
                        m24695l();
                        this.f18618e.m16828b();
                        if (!this.f18633t) {
                            if (mo4653A()) {
                                m24702q();
                            } else {
                                this.f18618e.m16831c();
                            }
                        }
                        m24644a(true);
                        m24697m();
                        C0509c.m1880a();
                    } else if (this.f18618e.m16833d()) {
                        C0509c.m1881a("RV FullInvalidate");
                        m24702q();
                        C0509c.m1880a();
                    }
                    return;
                }
                return;
            }
        }
        C0509c.m1881a("RV FullInvalidate");
        m24702q();
        C0509c.m1880a();
    }

    /* renamed from: A */
    private boolean mo4653A() {
        int b = this.f18619f.m3810b();
        for (int i = 0; i < b; i++) {
            C0798v e = m24617e(this.f18619f.m3812b(i));
            if (e != null) {
                if (!e.h_()) {
                    if (e.m3305x()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    boolean m24646a(int i, int i2, MotionEvent motionEvent) {
        int a;
        int i3;
        int b;
        int i4;
        m24669d();
        if (this.f18625l != null) {
            m24671e();
            m24695l();
            C0509c.m1881a("RV Scroll");
            m24640a(this.f18603C);
            if (i != 0) {
                a = this.f18626m.mo666a(i, this.f18617d, this.f18603C);
                i3 = i - a;
            } else {
                a = 0;
                i3 = 0;
            }
            if (i2 != 0) {
                b = this.f18626m.mo677b(i2, this.f18617d, this.f18603C);
                i4 = i2 - b;
            } else {
                b = 0;
                i4 = 0;
            }
            C0509c.m1880a();
            m24708w();
            m24697m();
            m24644a(false);
        } else {
            a = 0;
            i3 = 0;
            b = 0;
            i4 = 0;
        }
        if (!this.f18628o.isEmpty()) {
            invalidate();
        }
        if (m24645a(a, b, i3, i4, this.aD, 0)) {
            this.ao -= this.aD[0];
            this.ap -= this.aD[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) this.aD[0], (float) this.aD[1]);
            }
            i = this.aF;
            i[0] = i[0] + this.aD[0];
            i = this.aF;
            i[1] = i[1] + this.aD[1];
        } else if (getOverScrollMode() != 2) {
            if (!(motionEvent == null || C0549g.m2063b(motionEvent, 8194))) {
                m24599a(motionEvent.getX(), (float) i3, motionEvent.getY(), (float) i4);
            }
            m24664c(i, i2);
        }
        if (!(a == 0 && b == 0)) {
            m24688i(a, b);
        }
        if (awakenScrollBars() == 0) {
            invalidate();
        }
        if (a == 0 && b == 0) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollOffset() {
        int i = 0;
        if (this.f18626m == null) {
            return 0;
        }
        if (this.f18626m.mo688e()) {
            i = this.f18626m.mo679c(this.f18603C);
        }
        return i;
    }

    public int computeHorizontalScrollExtent() {
        int i = 0;
        if (this.f18626m == null) {
            return 0;
        }
        if (this.f18626m.mo688e()) {
            i = this.f18626m.mo686e(this.f18603C);
        }
        return i;
    }

    public int computeHorizontalScrollRange() {
        int i = 0;
        if (this.f18626m == null) {
            return 0;
        }
        if (this.f18626m.mo688e()) {
            i = this.f18626m.mo691g(this.f18603C);
        }
        return i;
    }

    public int computeVerticalScrollOffset() {
        int i = 0;
        if (this.f18626m == null) {
            return 0;
        }
        if (this.f18626m.mo690f()) {
            i = this.f18626m.mo683d(this.f18603C);
        }
        return i;
    }

    public int computeVerticalScrollExtent() {
        int i = 0;
        if (this.f18626m == null) {
            return 0;
        }
        if (this.f18626m.mo690f()) {
            i = this.f18626m.mo689f(this.f18603C);
        }
        return i;
    }

    public int computeVerticalScrollRange() {
        int i = 0;
        if (this.f18626m == null) {
            return 0;
        }
        if (this.f18626m.mo690f()) {
            i = this.f18626m.mo692h(this.f18603C);
        }
        return i;
    }

    /* renamed from: e */
    void m24671e() {
        this.f18614U++;
        if (this.f18614U == 1 && !this.f18634u) {
            this.f18633t = false;
        }
    }

    /* renamed from: a */
    void m24644a(boolean z) {
        if (this.f18614U < 1) {
            this.f18614U = 1;
        }
        if (!(z || this.f18634u)) {
            this.f18633t = false;
        }
        if (this.f18614U == 1) {
            if (z && this.f18633t && !this.f18634u && this.f18626m && this.f18625l) {
                m24702q();
            }
            if (!this.f18634u) {
                this.f18633t = false;
            }
        }
        this.f18614U -= true;
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f18634u) {
            m24643a("Do not setLayoutFrozen in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f18634u = true;
                this.f18615V = true;
                m24675f();
                return;
            }
            this.f18634u = false;
            if (!(!this.f18633t || this.f18626m == null || this.f18625l == null)) {
                requestLayout();
            }
            this.f18633t = false;
        }
    }

    /* renamed from: a */
    public void m24630a(int i, int i2) {
        m24631a(i, i2, null);
    }

    /* renamed from: a */
    public void m24631a(int i, int i2, Interpolator interpolator) {
        if (this.f18626m == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f18634u) {
            if (!this.f18626m.mo688e()) {
                i = 0;
            }
            if (!this.f18626m.mo690f()) {
                i2 = 0;
            }
            if (!(i == 0 && i2 == 0)) {
                this.f18639z.m3261a(i, i2, interpolator);
            }
        }
    }

    /* renamed from: b */
    public boolean mo4652b(int i, int i2) {
        int i3 = 0;
        if (this.f18626m == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f18634u) {
            return false;
        } else {
            boolean e = this.f18626m.mo688e();
            boolean f = this.f18626m.mo690f();
            if (!e || Math.abs(i) < this.as) {
                i = 0;
            }
            if (!f || Math.abs(i2) < this.as) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f2 = (float) i;
            float f3 = (float) i2;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z;
                if (!e) {
                    if (!f) {
                        z = false;
                        dispatchNestedFling(f2, f3, z);
                        if (this.ar == null && this.ar.mo787a(i, i2)) {
                            return true;
                        }
                        if (z) {
                            if (e) {
                                i3 = 1;
                            }
                            if (f) {
                                i3 |= 2;
                            }
                            m24693j(i3, 1);
                            this.f18639z.m3257a(Math.max(-this.at, Math.min(i, this.at)), Math.max(-this.at, Math.min(i2, this.at)));
                            return true;
                        }
                    }
                }
                z = true;
                dispatchNestedFling(f2, f3, z);
                if (this.ar == null) {
                }
                if (z) {
                    if (e) {
                        i3 = 1;
                    }
                    if (f) {
                        i3 |= 2;
                    }
                    m24693j(i3, 1);
                    this.f18639z.m3257a(Math.max(-this.at, Math.min(i, this.at)), Math.max(-this.at, Math.min(i2, this.at)));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    public void m24675f() {
        setScrollState(0);
        mo4654B();
    }

    /* renamed from: B */
    private void mo4654B() {
        this.f18639z.m3262b();
        if (this.f18626m != null) {
            this.f18626m.m3034J();
        }
    }

    public int getMinFlingVelocity() {
        return this.as;
    }

    public int getMaxFlingVelocity() {
        return this.at;
    }

    /* renamed from: a */
    private void m24599a(float f, float f2, float f3, float f4) {
        Object obj = 1;
        if (f2 < 0.0f) {
            m24679g();
            C0612i.m2450a(this.af, (-f2) / ((float) getWidth()), 1.0f - (f3 / ((float) getHeight())));
        } else if (f2 > 0.0f) {
            m24682h();
            C0612i.m2450a(this.ah, f2 / ((float) getWidth()), f3 / ((float) getHeight()));
        } else {
            f3 = 0.0f;
            if (f4 < 0.0f) {
                m24686i();
                C0612i.m2450a(this.ag, (-f4) / ((float) getHeight()), f / ((float) getWidth()));
            } else if (f4 <= 0.0f) {
                m24691j();
                C0612i.m2450a(this.ai, f4 / ((float) getHeight()), 1.0f - (f / ((float) getWidth())));
            } else {
                obj = f3;
            }
            if (obj == null || f2 != 0.0f || f4 != 0.0f) {
                C0560r.m2189c(this);
            }
            return;
        }
        f3 = Float.MIN_VALUE;
        if (f4 < 0.0f) {
            m24686i();
            C0612i.m2450a(this.ag, (-f4) / ((float) getHeight()), f / ((float) getWidth()));
        } else if (f4 <= 0.0f) {
            obj = f3;
        } else {
            m24691j();
            C0612i.m2450a(this.ai, f4 / ((float) getHeight()), 1.0f - (f / ((float) getWidth())));
        }
        if (obj == null) {
        }
        C0560r.m2189c(this);
    }

    /* renamed from: C */
    private void mo4655C() {
        int isFinished;
        if (this.af != null) {
            this.af.onRelease();
            isFinished = this.af.isFinished();
        } else {
            isFinished = 0;
        }
        if (this.ag != null) {
            this.ag.onRelease();
            isFinished |= this.ag.isFinished();
        }
        if (this.ah != null) {
            this.ah.onRelease();
            isFinished |= this.ah.isFinished();
        }
        if (this.ai != null) {
            this.ai.onRelease();
            isFinished |= this.ai.isFinished();
        }
        if (isFinished != 0) {
            C0560r.m2189c(this);
        }
    }

    /* renamed from: c */
    void m24664c(int i, int i2) {
        int i3;
        if (this.af == null || this.af.isFinished() || i <= 0) {
            i3 = 0;
        } else {
            this.af.onRelease();
            i3 = this.af.isFinished();
        }
        if (!(this.ah == null || this.ah.isFinished() || i >= 0)) {
            this.ah.onRelease();
            i3 |= this.ah.isFinished();
        }
        if (this.ag != 0 && this.ag.isFinished() == 0 && i2 > 0) {
            this.ag.onRelease();
            i3 |= this.ag.isFinished();
        }
        if (this.ai != 0 && this.ai.isFinished() == 0 && i2 < 0) {
            this.ai.onRelease();
            i3 |= this.ai.isFinished();
        }
        if (i3 != 0) {
            C0560r.m2189c(this);
        }
    }

    /* renamed from: d */
    void m24670d(int i, int i2) {
        if (i < 0) {
            m24679g();
            this.af.onAbsorb(-i);
        } else if (i > 0) {
            m24682h();
            this.ah.onAbsorb(i);
        }
        if (i2 < 0) {
            m24686i();
            this.ag.onAbsorb(-i2);
        } else if (i2 > 0) {
            m24691j();
            this.ai.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C0560r.m2189c(this);
        }
    }

    /* renamed from: g */
    void m24679g() {
        if (this.af == null) {
            this.af = this.ae.m2980a(this, 0);
            if (this.f18621h) {
                this.af.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.af.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: h */
    void m24682h() {
        if (this.ah == null) {
            this.ah = this.ae.m2980a(this, 2);
            if (this.f18621h) {
                this.ah.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.ah.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: i */
    void m24686i() {
        if (this.ag == null) {
            this.ag = this.ae.m2980a(this, 1);
            if (this.f18621h) {
                this.ag.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.ag.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: j */
    void m24691j() {
        if (this.ai == null) {
            this.ai = this.ae.m2980a(this, 3);
            if (this.f18621h) {
                this.ai.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.ai.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: k */
    void m24694k() {
        this.ai = null;
        this.ag = null;
        this.ah = null;
        this.af = null;
    }

    public void setEdgeEffectFactory(C0775e c0775e) {
        C0432l.m1574a(c0775e);
        this.ae = c0775e;
        m24694k();
    }

    public C0775e getEdgeEffectFactory() {
        return this.ae;
    }

    public View focusSearch(View view, int i) {
        View d = this.f18626m.m3112d(view, i);
        if (d != null) {
            return d;
        }
        Object obj = (this.f18625l == null || this.f18626m == null || m24700o() || this.f18634u) ? null : 1;
        FocusFinder instance = FocusFinder.getInstance();
        if (obj == null || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || obj == null) {
                d = findNextFocus;
            } else {
                m24669d();
                if (m24661c(view) == null) {
                    return null;
                }
                m24671e();
                d = this.f18626m.mo668a(view, i, this.f18617d, this.f18603C);
                m24644a(false);
            }
        } else {
            int i2;
            Object obj2;
            if (this.f18626m.mo690f()) {
                i2 = i == 2 ? 130 : 33;
                obj2 = instance.findNextFocus(this, view, i2) == null ? 1 : null;
                if (f18595M) {
                    i = i2;
                }
            } else {
                obj2 = null;
            }
            if (obj2 == null && this.f18626m.mo688e()) {
                i2 = ((this.f18626m.m3152u() == 1 ? 1 : 0) ^ (i == 2 ? 1 : 0)) != 0 ? 66 : 17;
                obj2 = instance.findNextFocus(this, view, i2) == null ? 1 : null;
                if (f18595M) {
                    i = i2;
                }
            }
            if (obj2 != null) {
                m24669d();
                if (m24661c(view) == null) {
                    return null;
                }
                m24671e();
                this.f18626m.mo668a(view, i, this.f18617d, this.f18603C);
                m24644a(false);
            }
            d = instance.findNextFocus(this, view, i);
        }
        if (d == null || d.hasFocusable()) {
            if (!m24611a(view, d, i)) {
                d = super.focusSearch(view, i);
            }
            return d;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m24608a(d, null);
            return view;
        }
    }

    /* renamed from: a */
    private boolean m24611a(View view, View view2, int i) {
        boolean z = false;
        if (view2 != null) {
            if (view2 != this) {
                if (m24661c(view2) == null) {
                    return false;
                }
                if (view == null || m24661c(view) == null) {
                    return true;
                }
                this.f18623j.set(0, 0, view.getWidth(), view.getHeight());
                this.f18611R.set(0, 0, view2.getWidth(), view2.getHeight());
                offsetDescendantRectToMyCoords(view, this.f18623j);
                offsetDescendantRectToMyCoords(view2, this.f18611R);
                view2 = -1;
                view = this.f18626m.m3152u() == 1 ? -1 : true;
                int i2 = ((this.f18623j.left < this.f18611R.left || this.f18623j.right <= this.f18611R.left) && this.f18623j.right < this.f18611R.right) ? 1 : ((this.f18623j.right > this.f18611R.right || this.f18623j.left >= this.f18611R.right) && this.f18623j.left > this.f18611R.left) ? -1 : 0;
                if ((this.f18623j.top < this.f18611R.top || this.f18623j.bottom <= this.f18611R.top) && this.f18623j.bottom < this.f18611R.bottom) {
                    view2 = true;
                } else if ((this.f18623j.bottom <= this.f18611R.bottom && this.f18623j.top < this.f18611R.bottom) || this.f18623j.top <= this.f18611R.top) {
                    view2 = null;
                }
                if (i == 17) {
                    if (i2 < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 33) {
                    if (view2 < null) {
                        z = true;
                    }
                    return z;
                } else if (i == 66) {
                    if (i2 > 0) {
                        z = true;
                    }
                    return z;
                } else if (i != 130) {
                    switch (i) {
                        case 1:
                            if (view2 < null || (view2 == null && i2 * view <= 0)) {
                                z = true;
                            }
                            return z;
                        case 2:
                            if (view2 > null || (view2 == null && i2 * view >= 0)) {
                                z = true;
                            }
                            return z;
                        default:
                            view2 = new StringBuilder();
                            view2.append("Invalid direction: ");
                            view2.append(i);
                            view2.append(m24628a());
                            throw new IllegalArgumentException(view2.toString());
                    }
                } else {
                    if (view2 > null) {
                        z = true;
                    }
                    return z;
                }
            }
        }
        return false;
    }

    public void requestChildFocus(View view, View view2) {
        if (!(this.f18626m.m3078a(this, this.f18603C, view, view2) || view2 == null)) {
            m24608a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* renamed from: a */
    private void m24608a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f18623j.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f2470e) {
                Rect rect = layoutParams2.f2469d;
                Rect rect2 = this.f18623j;
                rect2.left -= rect.left;
                rect2 = this.f18623j;
                rect2.right += rect.right;
                rect2 = this.f18623j;
                rect2.top -= rect.top;
                rect2 = this.f18623j;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f18623j);
            offsetRectIntoDescendantCoords(view, this.f18623j);
        }
        this.f18626m.m3080a(this, view, this.f18623j, this.f18632s ^ 1, view2 == null);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f18626m.m3079a(this, view, rect, z);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (this.f18626m == null || !this.f18626m.m3082a(this, (ArrayList) arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m24700o()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ac = 0;
        boolean z = true;
        this.f18629p = true;
        if (!this.f18632s || isLayoutRequested()) {
            z = false;
        }
        this.f18632s = z;
        if (this.f18626m != null) {
            this.f18626m.m3102c(this);
        }
        this.f18606F = false;
        if (f18594L) {
            this.f18601A = (ad) ad.f2769a.get();
            if (this.f18601A == null) {
                float refreshRate;
                this.f18601A = new ad();
                Display C = C0560r.m2164C(this);
                if (!(isInEditMode() || C == null)) {
                    refreshRate = C.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        this.f18601A.f2773d = (long) (1.0E9f / refreshRate);
                        ad.f2769a.set(this.f18601A);
                    }
                }
                refreshRate = 60.0f;
                this.f18601A.f2773d = (long) (1.0E9f / refreshRate);
                ad.f2769a.set(this.f18601A);
            }
            this.f18601A.m3457a(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f18638y != null) {
            this.f18638y.mo3874d();
        }
        m24675f();
        this.f18629p = false;
        if (this.f18626m != null) {
            this.f18626m.m3092b(this, this.f18617d);
        }
        this.f18608H.clear();
        removeCallbacks(this.aG);
        this.f18620g.m3605b();
        if (f18594L && this.f18601A != null) {
            this.f18601A.m3459b(this);
            this.f18601A = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.f18629p;
    }

    /* renamed from: a */
    void m24643a(String str) {
        if (m24700o()) {
            if (str == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                stringBuilder.append(m24628a());
                throw new IllegalStateException(stringBuilder.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.ad > null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("");
            stringBuilder2.append(m24628a());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(stringBuilder2.toString()));
        }
    }

    /* renamed from: a */
    public void m24638a(C0786l c0786l) {
        this.f18612S.add(c0786l);
    }

    /* renamed from: b */
    public void m24655b(C0786l c0786l) {
        this.f18612S.remove(c0786l);
        if (this.f18613T == c0786l) {
            this.f18613T = null;
        }
    }

    /* renamed from: a */
    private boolean m24610a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f18613T = null;
        }
        int size = this.f18612S.size();
        int i = 0;
        while (i < size) {
            C0786l c0786l = (C0786l) this.f18612S.get(i);
            if (!c0786l.mo760a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f18613T = c0786l;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m24614b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f18613T != null) {
            if (action == 0) {
                this.f18613T = null;
            } else {
                this.f18613T.mo761b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f18613T = null;
                }
                return true;
            }
        }
        if (action != 0) {
            action = this.f18612S.size();
            for (int i = 0; i < action; i++) {
                C0786l c0786l = (C0786l) this.f18612S.get(i);
                if (c0786l.mo760a(this, motionEvent)) {
                    this.f18613T = c0786l;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f18634u) {
            return false;
        }
        if (m24610a(motionEvent)) {
            mo4657E();
            return true;
        } else if (this.f18626m == null) {
            return false;
        } else {
            boolean e = this.f18626m.mo688e();
            boolean f = this.f18626m.mo690f();
            if (this.al == null) {
                this.al = VelocityTracker.obtain();
            }
            this.al.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            switch (actionMasked) {
                case 0:
                    if (this.f18615V) {
                        this.f18615V = false;
                    }
                    this.ak = motionEvent.getPointerId(0);
                    actionMasked = (int) (motionEvent.getX() + 0.5f);
                    this.ao = actionMasked;
                    this.am = actionMasked;
                    motionEvent = (int) (motionEvent.getY() + 1056964608);
                    this.ap = motionEvent;
                    this.an = motionEvent;
                    if (this.aj == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    motionEvent = this.aF;
                    this.aF[1] = 0;
                    motionEvent[0] = null;
                    motionEvent = e ? true : null;
                    if (f) {
                        motionEvent |= 2;
                    }
                    m24693j(motionEvent, 0);
                    break;
                case 1:
                    this.al.clear();
                    m24687i(0);
                    break;
                case 2:
                    actionMasked = motionEvent.findPointerIndex(this.ak);
                    if (actionMasked >= 0) {
                        actionIndex = (int) (motionEvent.getX(actionMasked) + 0.5f);
                        motionEvent = (int) (motionEvent.getY(actionMasked) + 1056964608);
                        if (this.aj != 1) {
                            Object obj;
                            actionMasked = actionIndex - this.am;
                            int i = motionEvent - this.an;
                            if (!e || Math.abs(actionMasked) <= this.aq) {
                                obj = null;
                            } else {
                                this.ao = actionIndex;
                                obj = 1;
                            }
                            if (f && Math.abs(i) > this.aq) {
                                this.ap = motionEvent;
                                obj = 1;
                            }
                            if (obj != null) {
                                setScrollState(1);
                                break;
                            }
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error processing scroll; pointer index for id ");
                    stringBuilder.append(this.ak);
                    stringBuilder.append(" not found. Did any MotionEvents get skipped?");
                    Log.e("RecyclerView", stringBuilder.toString());
                    return false;
                    break;
                case 3:
                    mo4657E();
                    break;
                case 5:
                    this.ak = motionEvent.getPointerId(actionIndex);
                    int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.ao = x;
                    this.am = x;
                    motionEvent = (int) (motionEvent.getY(actionIndex) + 1056964608);
                    this.ap = motionEvent;
                    this.an = motionEvent;
                    break;
                case 6:
                    m24616c(motionEvent);
                    break;
                default:
                    break;
            }
            if (this.aj == 1) {
                z = true;
            }
            return z;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f18612S.size();
        for (int i = 0; i < size; i++) {
            ((C0786l) this.f18612S.get(i)).mo759a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f18634u) {
            if (!this.f18615V) {
                if (m24614b(motionEvent)) {
                    mo4657E();
                    return true;
                } else if (this.f18626m == null) {
                    return false;
                } else {
                    int[] iArr;
                    boolean e = this.f18626m.mo688e();
                    boolean f = this.f18626m.mo690f();
                    if (this.al == null) {
                        this.al = VelocityTracker.obtain();
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    int actionMasked = motionEvent.getActionMasked();
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionMasked == 0) {
                        iArr = this.aF;
                        this.aF[1] = 0;
                        iArr[0] = 0;
                    }
                    obtain.offsetLocation((float) this.aF[0], (float) this.aF[1]);
                    switch (actionMasked) {
                        case 0:
                            this.ak = motionEvent.getPointerId(0);
                            actionMasked = (int) (motionEvent.getX() + 0.5f);
                            this.ao = actionMasked;
                            this.am = actionMasked;
                            motionEvent = (int) (motionEvent.getY() + 1056964608);
                            this.ap = motionEvent;
                            this.an = motionEvent;
                            motionEvent = e ? true : null;
                            if (f) {
                                motionEvent |= 2;
                            }
                            m24693j(motionEvent, 0);
                            break;
                        case 1:
                            this.al.addMovement(obtain);
                            this.al.computeCurrentVelocity(1000, (float) this.at);
                            float f2 = e ? -this.al.getXVelocity(this.ak) : 0.0f;
                            float f3 = f ? -this.al.getYVelocity(this.ak) : 0.0f;
                            if ((f2 == 0.0f && f3 == 0.0f) || mo4652b((int) f2, (int) f3) == null) {
                                setScrollState(0);
                            }
                            mo4656D();
                            z = true;
                            break;
                        case 2:
                            actionMasked = motionEvent.findPointerIndex(this.ak);
                            if (actionMasked >= 0) {
                                actionIndex = (int) (motionEvent.getX(actionMasked) + 0.5f);
                                motionEvent = (int) (motionEvent.getY(actionMasked) + 1056964608);
                                actionMasked = this.ao - actionIndex;
                                int i = this.ap - motionEvent;
                                if (m24647a(actionMasked, i, this.aE, this.aD, 0)) {
                                    actionMasked -= this.aE[0];
                                    i -= this.aE[1];
                                    obtain.offsetLocation((float) this.aD[0], (float) this.aD[1]);
                                    iArr = this.aF;
                                    iArr[0] = iArr[0] + this.aD[0];
                                    iArr = this.aF;
                                    iArr[1] = iArr[1] + this.aD[1];
                                }
                                if (this.aj != 1) {
                                    Object obj;
                                    if (!e || Math.abs(actionMasked) <= this.aq) {
                                        obj = null;
                                    } else {
                                        if (actionMasked > 0) {
                                            actionMasked -= this.aq;
                                        } else {
                                            actionMasked += this.aq;
                                        }
                                        obj = 1;
                                    }
                                    if (f && Math.abs(i) > this.aq) {
                                        if (i > 0) {
                                            i -= this.aq;
                                        } else {
                                            i += this.aq;
                                        }
                                        obj = 1;
                                    }
                                    if (obj != null) {
                                        setScrollState(1);
                                    }
                                }
                                if (this.aj == 1) {
                                    this.ao = actionIndex - this.aD[0];
                                    this.ap = motionEvent - this.aD[1];
                                    if (m24646a(e ? actionMasked : null, f ? i : 0, obtain) != null) {
                                        getParent().requestDisallowInterceptTouchEvent(true);
                                    }
                                    if (!(this.f18601A == null || (actionMasked == 0 && i == 0))) {
                                        this.f18601A.m3458a(this, actionMasked, i);
                                        break;
                                    }
                                }
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Error processing scroll; pointer index for id ");
                            stringBuilder.append(this.ak);
                            stringBuilder.append(" not found. Did any MotionEvents get skipped?");
                            Log.e("RecyclerView", stringBuilder.toString());
                            return false;
                            break;
                        case 3:
                            mo4657E();
                            break;
                        case 5:
                            this.ak = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.ao = x;
                            this.am = x;
                            motionEvent = (int) (motionEvent.getY(actionIndex) + 1056964608);
                            this.ap = motionEvent;
                            this.an = motionEvent;
                            break;
                        case 6:
                            m24616c(motionEvent);
                            break;
                        default:
                            break;
                    }
                    if (!z) {
                        this.al.addMovement(obtain);
                    }
                    obtain.recycle();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    private void mo4656D() {
        if (this.al != null) {
            this.al.clear();
        }
        m24687i(0);
        mo4655C();
    }

    /* renamed from: E */
    private void mo4657E() {
        mo4656D();
        setScrollState(0);
    }

    /* renamed from: c */
    private void m24616c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ak) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.ak = motionEvent.getPointerId(actionIndex);
            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.ao = x;
            this.am = x;
            motionEvent = (int) (motionEvent.getY(actionIndex) + 1056964608);
            this.ap = motionEvent;
            this.an = motionEvent;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!(this.f18626m == null || this.f18634u || motionEvent.getAction() != 8)) {
            float f;
            float axisValue;
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f18626m.mo690f() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f18626m.mo688e()) {
                    axisValue = motionEvent.getAxisValue(10);
                    if (!(f == 0.0f && axisValue == 0.0f)) {
                        m24646a((int) (axisValue * this.au), (int) (f * this.av), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    f = motionEvent.getAxisValue(26);
                    if (this.f18626m.mo690f()) {
                        f = -f;
                    } else if (this.f18626m.mo688e()) {
                        axisValue = f;
                        f = 0.0f;
                        m24646a((int) (axisValue * this.au), (int) (f * this.av), motionEvent);
                    }
                }
                f = 0.0f;
            }
            axisValue = 0.0f;
            m24646a((int) (axisValue * this.au), (int) (f * this.av), motionEvent);
        }
        return false;
    }

    protected void onMeasure(int i, int i2) {
        if (this.f18626m == null) {
            m24673e(i, i2);
            return;
        }
        boolean z = false;
        if (this.f18626m.mo682c()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.f18626m.mo3988a(this.f18617d, this.f18603C, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z) {
                if (this.f18625l != null) {
                    if (this.f18603C.f2537c == 1) {
                        m24595M();
                    }
                    this.f18626m.m3113d(i, i2);
                    this.f18603C.f2542h = true;
                    m24596N();
                    this.f18626m.m3119e(i, i2);
                    if (this.f18626m.mo693l()) {
                        this.f18626m.m3113d(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                        this.f18603C.f2542h = true;
                        m24596N();
                        this.f18626m.m3119e(i, i2);
                    }
                }
            }
        } else if (this.f18630q) {
            this.f18626m.mo3988a(this.f18617d, this.f18603C, i, i2);
        } else {
            if (this.f18635v) {
                m24671e();
                m24695l();
                m24590H();
                m24697m();
                if (this.f18603C.f2544j) {
                    this.f18603C.f2540f = true;
                } else {
                    this.f18618e.m16834e();
                    this.f18603C.f2540f = false;
                }
                this.f18635v = false;
                m24644a(false);
            } else if (this.f18603C.f2544j) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            if (this.f18625l != null) {
                this.f18603C.f2538d = this.f18625l.mo91a();
            } else {
                this.f18603C.f2538d = 0;
            }
            m24671e();
            this.f18626m.mo3988a(this.f18617d, this.f18603C, i, i2);
            m24644a(false);
            this.f18603C.f2540f = false;
        }
    }

    /* renamed from: e */
    void m24673e(int i, int i2) {
        setMeasuredDimension(C0783i.m3014a(i, getPaddingLeft() + getPaddingRight(), C0560r.m2197i(this)), C0783i.m3014a(i2, getPaddingTop() + getPaddingBottom(), C0560r.m2198j(this)));
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m24694k();
        }
    }

    public void setItemAnimator(C0779f c0779f) {
        if (this.f18638y != null) {
            this.f18638y.mo3874d();
            this.f18638y.m2989a(null);
        }
        this.f18638y = c0779f;
        if (this.f18638y != null) {
            this.f18638y.m2989a(this.az);
        }
    }

    /* renamed from: l */
    void m24695l() {
        this.ac++;
    }

    /* renamed from: m */
    void m24697m() {
        m24658b(true);
    }

    /* renamed from: b */
    void m24658b(boolean z) {
        this.ac--;
        if (this.ac < 1) {
            this.ac = 0;
            if (z) {
                m24588F();
                m24709x();
            }
        }
    }

    /* renamed from: n */
    boolean m24699n() {
        return this.aa != null && this.aa.isEnabled();
    }

    /* renamed from: F */
    private void m24588F() {
        int i = this.f18616W;
        this.f18616W = 0;
        if (i != 0 && m24699n()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0528a.m1947a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: o */
    public boolean m24700o() {
        return this.ac > 0;
    }

    /* renamed from: a */
    boolean m24650a(AccessibilityEvent accessibilityEvent) {
        if (!m24700o()) {
            return false;
        }
        accessibilityEvent = accessibilityEvent != null ? C0528a.m1946a(accessibilityEvent) : null;
        if (accessibilityEvent == null) {
            accessibilityEvent = null;
        }
        this.f18616W = accessibilityEvent | this.f18616W;
        return true;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m24650a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public C0779f getItemAnimator() {
        return this.f18638y;
    }

    /* renamed from: p */
    void m24701p() {
        if (!this.f18606F && this.f18629p) {
            C0560r.m2178a((View) this, this.aG);
            this.f18606F = true;
        }
    }

    /* renamed from: G */
    private boolean m24589G() {
        return this.f18638y != null && this.f18626m.mo678b();
    }

    /* renamed from: H */
    private void m24590H() {
        Object obj;
        C0795s c0795s;
        boolean z;
        if (this.f18636w) {
            this.f18618e.m16820a();
            if (this.f18637x) {
                this.f18626m.mo746a(this);
            }
        }
        if (m24589G()) {
            this.f18618e.m16828b();
        } else {
            this.f18618e.m16834e();
        }
        boolean z2 = false;
        if (!this.f18604D) {
            if (!this.f18605E) {
                obj = null;
                c0795s = this.f18603C;
                z = this.f18632s && this.f18638y != null && ((this.f18636w || obj != null || this.f18626m.f2501u) && (!this.f18636w || this.f18625l.m2966d()));
                c0795s.f2543i = z;
                c0795s = this.f18603C;
                if (this.f18603C.f2543i && obj != null && !this.f18636w && m24589G()) {
                    z2 = true;
                }
                c0795s.f2544j = z2;
            }
        }
        obj = 1;
        c0795s = this.f18603C;
        if (!this.f18632s) {
        }
        c0795s.f2543i = z;
        c0795s = this.f18603C;
        z2 = true;
        c0795s.f2544j = z2;
    }

    /* renamed from: q */
    void m24702q() {
        if (this.f18625l == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f18626m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.f18603C.f2542h = false;
            if (this.f18603C.f2537c == 1) {
                m24595M();
                this.f18626m.m3126f(this);
                m24596N();
            } else {
                if (!this.f18618e.m16835f() && this.f18626m.m3157z() == getWidth()) {
                    if (this.f18626m.m3025A() == getHeight()) {
                        this.f18626m.m3126f(this);
                    }
                }
                this.f18626m.m3126f(this);
                m24596N();
            }
            m24597O();
        }
    }

    /* renamed from: I */
    private void m24591I() {
        C0798v c0798v = null;
        View focusedChild = (this.aw && hasFocus() && this.f18625l != null) ? getFocusedChild() : null;
        if (focusedChild != null) {
            c0798v = m24668d(focusedChild);
        }
        if (c0798v == null) {
            m24592J();
            return;
        }
        int i;
        this.f18603C.f2546l = this.f18625l.m2966d() ? c0798v.m3288g() : -1;
        C0795s c0795s = this.f18603C;
        if (this.f18636w) {
            i = -1;
        } else if (c0798v.m3298q()) {
            i = c0798v.f2563d;
        } else {
            i = c0798v.m3286e();
        }
        c0795s.f2545k = i;
        this.f18603C.f2547m = m24621n(c0798v.f2560a);
    }

    /* renamed from: J */
    private void m24592J() {
        this.f18603C.f2546l = -1;
        this.f18603C.f2545k = -1;
        this.f18603C.f2547m = -1;
    }

    /* renamed from: K */
    private View m24593K() {
        int i = this.f18603C.f2545k != -1 ? this.f18603C.f2545k : 0;
        int e = this.f18603C.m3249e();
        int i2 = i;
        while (i2 < e) {
            C0798v d = m24667d(i2);
            if (d == null) {
                break;
            } else if (d.f2560a.hasFocusable()) {
                return d.f2560a;
            } else {
                i2++;
            }
        }
        for (i = Math.min(e, i) - 1; i >= 0; i--) {
            C0798v d2 = m24667d(i);
            if (d2 == null) {
                return null;
            }
            if (d2.f2560a.hasFocusable()) {
                return d2.f2560a;
            }
        }
        return null;
    }

    /* renamed from: L */
    private void m24594L() {
        if (this.aw && this.f18625l != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                View focusedChild;
                if (!isFocused()) {
                    focusedChild = getFocusedChild();
                    if (!f18596N || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f18619f.m3815c(focusedChild)) {
                            return;
                        }
                    } else if (this.f18619f.m3810b() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                C0798v a = (this.f18603C.f2546l == -1 || !this.f18625l.m2966d()) ? null : m24626a(this.f18603C.f2546l);
                if (!(a == null || this.f18619f.m3815c(a.f2560a))) {
                    if (a.f2560a.hasFocusable()) {
                        view = a.f2560a;
                        if (view != null) {
                            if (((long) this.f18603C.f2547m) != -1) {
                                focusedChild = view.findViewById(this.f18603C.f2547m);
                                if (focusedChild != null && focusedChild.isFocusable()) {
                                    focusedChild.requestFocus();
                                }
                            }
                            focusedChild = view;
                            focusedChild.requestFocus();
                        }
                    }
                }
                if (this.f18619f.m3810b() > 0) {
                    view = m24593K();
                }
                if (view != null) {
                    if (((long) this.f18603C.f2547m) != -1) {
                        focusedChild = view.findViewById(this.f18603C.f2547m);
                        focusedChild.requestFocus();
                    }
                    focusedChild = view;
                    focusedChild.requestFocus();
                }
            }
        }
    }

    /* renamed from: n */
    private int m24621n(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* renamed from: a */
    final void m24640a(C0795s c0795s) {
        if (getScrollState() == 2) {
            OverScroller a = this.f18639z.f2556e;
            c0795s.f2548n = a.getFinalX() - a.getCurrX();
            c0795s.f2549o = a.getFinalY() - a.getCurrY();
            return;
        }
        c0795s.f2548n = 0;
        c0795s.f2549o = 0;
    }

    /* renamed from: M */
    private void m24595M() {
        int b;
        boolean z = true;
        this.f18603C.m3243a(1);
        m24640a(this.f18603C);
        this.f18603C.f2542h = false;
        m24671e();
        this.f18620g.m3599a();
        m24695l();
        m24590H();
        m24591I();
        C0795s c0795s = this.f18603C;
        if (!this.f18603C.f2543i || !this.f18605E) {
            z = false;
        }
        c0795s.f2541g = z;
        this.f18605E = false;
        this.f18604D = false;
        this.f18603C.f2540f = this.f18603C.f2544j;
        this.f18603C.f2538d = this.f18625l.mo91a();
        m24609a(this.aB);
        if (this.f18603C.f2543i) {
            b = this.f18619f.m3810b();
            for (int i = 0; i < b; i++) {
                C0798v e = m24617e(this.f18619f.m3812b(i));
                if (!e.h_()) {
                    if (!e.m3295n() || this.f18625l.m2966d()) {
                        this.f18620g.m3601a(e, this.f18638y.m2987a(this.f18603C, e, C0779f.m2985e(e), e.m3302u()));
                        if (!(!this.f18603C.f2541g || !e.m3305x() || e.m3298q() || e.h_() || e.m3295n())) {
                            this.f18620g.m3600a(m24624a(e), e);
                        }
                    }
                }
            }
        }
        if (this.f18603C.f2544j) {
            m24704s();
            boolean z2 = this.f18603C.f2539e;
            this.f18603C.f2539e = false;
            this.f18626m.mo681c(this.f18617d, this.f18603C);
            this.f18603C.f2539e = z2;
            for (b = 0; b < this.f18619f.m3810b(); b++) {
                C0798v e2 = m24617e(this.f18619f.m3812b(b));
                if (!e2.h_()) {
                    if (!this.f18620g.m3609d(e2)) {
                        int e3 = C0779f.m2985e(e2);
                        boolean a = e2.m3284a(8192);
                        if (!a) {
                            e3 |= 4096;
                        }
                        C0778c a2 = this.f18638y.m2987a(this.f18603C, e2, e3, e2.m3302u());
                        if (a) {
                            m24641a(e2, a2);
                        } else {
                            this.f18620g.m3606b(e2, a2);
                        }
                    }
                }
            }
            m24705t();
        } else {
            m24705t();
        }
        m24697m();
        m24644a(false);
        this.f18603C.f2537c = 2;
    }

    /* renamed from: N */
    private void m24596N() {
        m24671e();
        m24695l();
        this.f18603C.m3243a(6);
        this.f18618e.m16834e();
        this.f18603C.f2538d = this.f18625l.mo91a();
        this.f18603C.f2536b = 0;
        this.f18603C.f2540f = false;
        this.f18626m.mo681c(this.f18617d, this.f18603C);
        this.f18603C.f2539e = false;
        this.f18610Q = null;
        C0795s c0795s = this.f18603C;
        boolean z = this.f18603C.f2543i && this.f18638y != null;
        c0795s.f2543i = z;
        this.f18603C.f2537c = 4;
        m24697m();
        m24644a(false);
    }

    /* renamed from: O */
    private void m24597O() {
        this.f18603C.m3243a(4);
        m24671e();
        m24695l();
        this.f18603C.f2537c = 1;
        if (this.f18603C.f2543i) {
            for (int b = this.f18619f.m3810b() - 1; b >= 0; b--) {
                C0798v e = m24617e(this.f18619f.m3812b(b));
                if (!e.h_()) {
                    long a = m24624a(e);
                    C0778c a2 = this.f18638y.m2986a(this.f18603C, e);
                    C0798v a3 = this.f18620g.m3598a(a);
                    if (a3 == null || a3.h_()) {
                        this.f18620g.m3608c(e, a2);
                    } else {
                        boolean a4 = this.f18620g.m3603a(a3);
                        boolean a5 = this.f18620g.m3603a(e);
                        if (a4 && a3 == e) {
                            this.f18620g.m3608c(e, a2);
                        } else {
                            C0778c b2 = this.f18620g.m3604b(a3);
                            this.f18620g.m3608c(e, a2);
                            C0778c c = this.f18620g.m3607c(e);
                            if (b2 == null) {
                                m24600a(a, e, a3);
                            } else {
                                m24603a(a3, e, b2, c, a4, a5);
                            }
                        }
                    }
                }
            }
            this.f18620g.m3602a(this.aH);
        }
        this.f18626m.m3089b(this.f18617d);
        this.f18603C.f2535a = this.f18603C.f2538d;
        this.f18636w = false;
        this.f18637x = false;
        this.f18603C.f2543i = false;
        this.f18603C.f2544j = false;
        this.f18626m.f2501u = false;
        if (this.f18617d.f2513b != null) {
            this.f18617d.f2513b.clear();
        }
        if (this.f18626m.f2505y) {
            this.f18626m.f2504x = 0;
            this.f18626m.f2505y = false;
            this.f18617d.m3197b();
        }
        this.f18626m.mo672a(this.f18603C);
        m24697m();
        m24644a(false);
        this.f18620g.m3599a();
        if (m24620k(this.aB[0], this.aB[1])) {
            m24688i(0, 0);
        }
        m24594L();
        m24592J();
    }

    /* renamed from: a */
    private void m24600a(long j, C0798v c0798v, C0798v c0798v2) {
        StringBuilder stringBuilder;
        int b = this.f18619f.m3810b();
        for (int i = 0; i < b; i++) {
            C0798v e = m24617e(this.f18619f.m3812b(i));
            if (e != c0798v) {
                if (m24624a(e) == j) {
                    if (this.f18625l == null || this.f18625l.m2966d() == null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                        stringBuilder.append(e);
                        stringBuilder.append(" \n View Holder 2:");
                        stringBuilder.append(c0798v);
                        stringBuilder.append(m24628a());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    stringBuilder.append(e);
                    stringBuilder.append(" \n View Holder 2:");
                    stringBuilder.append(c0798v);
                    stringBuilder.append(m24628a());
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        stringBuilder.append(c0798v2);
        stringBuilder.append(" cannot be found but it is necessary for ");
        stringBuilder.append(c0798v);
        stringBuilder.append(m24628a());
        Log.e("RecyclerView", stringBuilder.toString());
    }

    /* renamed from: a */
    void m24641a(C0798v c0798v, C0778c c0778c) {
        c0798v.m3278a(0, 8192);
        if (this.f18603C.f2541g && c0798v.m3305x() && !c0798v.m3298q() && !c0798v.h_()) {
            this.f18620g.m3600a(m24624a(c0798v), c0798v);
        }
        this.f18620g.m3601a(c0798v, c0778c);
    }

    /* renamed from: a */
    private void m24609a(int[] iArr) {
        int b = this.f18619f.m3810b();
        if (b == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < b; i3++) {
            C0798v e = m24617e(this.f18619f.m3812b(i3));
            if (!e.h_()) {
                int i_ = e.i_();
                if (i_ < i) {
                    i = i_;
                }
                if (i_ > i2) {
                    i2 = i_;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: k */
    private boolean m24620k(int i, int i2) {
        m24609a(this.aB);
        return (this.aB[0] == i && this.aB[1] == i2) ? false : true;
    }

    protected void removeDetachedView(View view, boolean z) {
        C0798v e = m24617e(view);
        if (e != null) {
            if (e.m3299r()) {
                e.m3294m();
            } else if (!e.h_()) {
                z = new StringBuilder();
                z.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                z.append(e);
                z.append(m24628a());
                throw new IllegalArgumentException(z.toString());
            }
        }
        view.clearAnimation();
        m24696l(view);
        super.removeDetachedView(view, z);
    }

    /* renamed from: a */
    long m24624a(C0798v c0798v) {
        return this.f18625l.m2966d() ? c0798v.m3288g() : (long) c0798v.f2562c;
    }

    /* renamed from: a */
    void m24642a(C0798v c0798v, C0778c c0778c, C0778c c0778c2) {
        c0798v.m3283a(false);
        if (this.f18638y.mo783b(c0798v, c0778c, c0778c2) != null) {
            m24701p();
        }
    }

    /* renamed from: b */
    void m24657b(C0798v c0798v, C0778c c0778c, C0778c c0778c2) {
        m24618e(c0798v);
        c0798v.m3283a(false);
        if (this.f18638y.mo781a(c0798v, c0778c, c0778c2) != null) {
            m24701p();
        }
    }

    /* renamed from: a */
    private void m24603a(C0798v c0798v, C0798v c0798v2, C0778c c0778c, C0778c c0778c2, boolean z, boolean z2) {
        c0798v.m3283a(false);
        if (z) {
            m24618e(c0798v);
        }
        if (c0798v != c0798v2) {
            if (z2) {
                m24618e(c0798v2);
            }
            c0798v.f2567h = c0798v2;
            m24618e(c0798v);
            this.f18617d.m3204c(c0798v);
            c0798v2.m3283a(false);
            c0798v2.f2568i = c0798v;
        }
        if (this.f18638y.mo782a(c0798v, c0798v2, c0778c, c0778c2) != null) {
            m24701p();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0509c.m1881a("RV OnLayout");
        m24702q();
        C0509c.m1880a();
        this.f18632s = true;
    }

    public void requestLayout() {
        if (this.f18614U != 0 || this.f18634u) {
            this.f18633t = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: r */
    void m24703r() {
        int c = this.f18619f.m3813c();
        for (int i = 0; i < c; i++) {
            ((LayoutParams) this.f18619f.m3816d(i).getLayoutParams()).f2470e = true;
        }
        this.f18617d.m3216j();
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int size = this.f18628o.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ((C0780h) this.f18628o.get(i3)).mo758a(canvas, this, this.f18603C);
        }
        if (this.af == null || this.af.isFinished()) {
            i = 0;
        } else {
            size = canvas.save();
            i = this.f18621h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i), 0.0f);
            i = (this.af == null || !this.af.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(size);
        }
        if (!(this.ag == null || this.ag.isFinished())) {
            size = canvas.save();
            if (this.f18621h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            int i4 = (this.ag == null || !this.ag.draw(canvas)) ? 0 : 1;
            i |= i4;
            canvas.restoreToCount(size);
        }
        if (!(this.ah == null || this.ah.isFinished())) {
            size = canvas.save();
            i4 = getWidth();
            int paddingTop = this.f18621h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-i4));
            i4 = (this.ah == null || !this.ah.draw(canvas)) ? 0 : 1;
            i |= i4;
            canvas.restoreToCount(size);
        }
        if (this.ai == null || this.ai.isFinished()) {
            i2 = i;
        } else {
            size = canvas.save();
            canvas.rotate(180.0f);
            if (this.f18621h) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            if (this.ai != null && this.ai.draw(canvas)) {
                i2 = 1;
            }
            i2 |= i;
            canvas.restoreToCount(size);
        }
        if (i2 == 0 && this.f18638y != null && this.f18628o.size() > null && this.f18638y.mo3872b() != null) {
            i2 = 1;
        }
        if (i2 != 0) {
            C0560r.m2189c(this);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f18628o.size();
        for (int i = 0; i < size; i++) {
            ((C0780h) this.f18628o.get(i)).m3012b(canvas, this, this.f18603C);
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (!(layoutParams instanceof LayoutParams) || this.f18626m.mo750a((LayoutParams) layoutParams) == null) ? null : true;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.f18626m != null) {
            return this.f18626m.mo667a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(m24628a());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.f18626m != null) {
            return this.f18626m.mo742a(getContext(), attributeSet);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(m24628a());
        throw new IllegalStateException(stringBuilder.toString());
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.f18626m != null) {
            return this.f18626m.mo743a(layoutParams);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(m24628a());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: s */
    void m24704s() {
        int c = this.f18619f.m3813c();
        for (int i = 0; i < c; i++) {
            C0798v e = m24617e(this.f18619f.m3816d(i));
            if (!e.h_()) {
                e.g_();
            }
        }
    }

    /* renamed from: t */
    void m24705t() {
        int c = this.f18619f.m3813c();
        for (int i = 0; i < c; i++) {
            C0798v e = m24617e(this.f18619f.m3816d(i));
            if (!e.h_()) {
                e.m3277a();
            }
        }
        this.f18617d.m3215i();
    }

    /* renamed from: f */
    void m24677f(int i, int i2) {
        int i3;
        int i4;
        int c = this.f18619f.m3813c();
        int i5;
        if (i < i2) {
            i5 = i;
            i3 = i2;
            i4 = -1;
        } else {
            i3 = i;
            i5 = i2;
            i4 = 1;
        }
        for (int i6 = 0; i6 < c; i6++) {
            C0798v e = m24617e(this.f18619f.m3816d(i6));
            if (e != null && e.f2562c >= r2) {
                if (e.f2562c <= i3) {
                    if (e.f2562c == i) {
                        e.m3280a(i2 - i, false);
                    } else {
                        e.m3280a(i4, false);
                    }
                    this.f18603C.f2539e = true;
                }
            }
        }
        this.f18617d.m3187a(i, i2);
        requestLayout();
    }

    /* renamed from: g */
    void m24681g(int i, int i2) {
        int c = this.f18619f.m3813c();
        for (int i3 = 0; i3 < c; i3++) {
            C0798v e = m24617e(this.f18619f.m3816d(i3));
            if (!(e == null || e.h_() || e.f2562c < i)) {
                e.m3280a(i2, false);
                this.f18603C.f2539e = true;
            }
        }
        this.f18617d.m3198b(i, i2);
        requestLayout();
    }

    /* renamed from: a */
    void m24633a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int c = this.f18619f.m3813c();
        for (int i4 = 0; i4 < c; i4++) {
            C0798v e = m24617e(this.f18619f.m3816d(i4));
            if (!(e == null || e.h_())) {
                if (e.f2562c >= i3) {
                    e.m3280a(-i2, z);
                    this.f18603C.f2539e = true;
                } else if (e.f2562c >= i) {
                    e.m3279a(i - 1, -i2, z);
                    this.f18603C.f2539e = true;
                }
            }
        }
        this.f18617d.m3188a(i, i2, z);
        requestLayout();
    }

    /* renamed from: a */
    void m24632a(int i, int i2, Object obj) {
        int c = this.f18619f.m3813c();
        int i3 = i + i2;
        for (int i4 = 0; i4 < c; i4++) {
            View d = this.f18619f.m3816d(i4);
            C0798v e = m24617e(d);
            if (e != null) {
                if (!e.h_()) {
                    if (e.f2562c >= i && e.f2562c < i3) {
                        e.m3285b(2);
                        e.m3282a(obj);
                        ((LayoutParams) d.getLayoutParams()).f2470e = true;
                    }
                }
            }
        }
        this.f18617d.m3203c(i, i2);
    }

    /* renamed from: b */
    boolean m24660b(C0798v c0798v) {
        if (this.f18638y != null) {
            if (this.f18638y.mo3871a(c0798v, c0798v.m3302u()) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: c */
    void m24665c(boolean z) {
        this.f18637x = z | this.f18637x;
        this.f18636w = true;
        m24706u();
    }

    /* renamed from: u */
    void m24706u() {
        int c = this.f18619f.m3813c();
        for (int i = 0; i < c; i++) {
            C0798v e = m24617e(this.f18619f.m3816d(i));
            if (!(e == null || e.h_())) {
                e.m3285b(6);
            }
        }
        m24703r();
        this.f18617d.m3214h();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.aw;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.aw = z;
    }

    /* renamed from: b */
    public C0798v m24651b(View view) {
        Object parent = view.getParent();
        if (parent != null) {
            if (parent != this) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("View ");
                stringBuilder.append(view);
                stringBuilder.append(" is not a direct child of ");
                stringBuilder.append(this);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return m24617e(view);
    }

    /* renamed from: c */
    public View m24661c(View view) {
        View parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return parent == this ? view : null;
    }

    /* renamed from: d */
    public C0798v m24668d(View view) {
        view = m24661c(view);
        if (view == null) {
            return null;
        }
        return m24651b(view);
    }

    /* renamed from: e */
    static C0798v m24617e(View view) {
        return view == null ? null : ((LayoutParams) view.getLayoutParams()).f2468c;
    }

    /* renamed from: f */
    public int m24674f(View view) {
        view = m24617e(view);
        return view != null ? view.m3286e() : -1;
    }

    /* renamed from: g */
    public int m24678g(View view) {
        view = m24617e(view);
        return view != null ? view.i_() : -1;
    }

    /* renamed from: d */
    public C0798v m24667d(int i) {
        C0798v c0798v = null;
        if (this.f18636w) {
            return null;
        }
        int c = this.f18619f.m3813c();
        for (int i2 = 0; i2 < c; i2++) {
            C0798v e = m24617e(this.f18619f.m3816d(i2));
            if (!(e == null || e.m3298q() || m24666d(e) != i)) {
                if (!this.f18619f.m3815c(e.f2560a)) {
                    return e;
                }
                c0798v = e;
            }
        }
        return c0798v;
    }

    /* renamed from: a */
    C0798v m24625a(int i, boolean z) {
        int c = this.f18619f.m3813c();
        C0798v c0798v = null;
        for (int i2 = 0; i2 < c; i2++) {
            C0798v e = m24617e(this.f18619f.m3816d(i2));
            if (!(e == null || e.m3298q())) {
                if (z) {
                    if (e.f2562c != i) {
                    }
                } else if (e.i_() != i) {
                }
                if (!this.f18619f.m3815c(e.f2560a)) {
                    return e;
                }
                c0798v = e;
            }
        }
        return c0798v;
    }

    /* renamed from: a */
    public C0798v m24626a(long j) {
        C0798v c0798v = null;
        if (this.f18625l != null) {
            if (this.f18625l.m2966d()) {
                int c = this.f18619f.m3813c();
                for (int i = 0; i < c; i++) {
                    C0798v e = m24617e(this.f18619f.m3816d(i));
                    if (!(e == null || e.m3298q() || e.m3288g() != j)) {
                        if (!this.f18619f.m3815c(e.f2560a)) {
                            return e;
                        }
                        c0798v = e;
                    }
                }
                return c0798v;
            }
        }
        return null;
    }

    /* renamed from: a */
    public View m24627a(float f, float f2) {
        for (int b = this.f18619f.m3810b() - 1; b >= 0; b--) {
            View b2 = this.f18619f.m3812b(b);
            float translationX = b2.getTranslationX();
            float translationY = b2.getTranslationY();
            if (f >= ((float) b2.getLeft()) + translationX && f <= ((float) b2.getRight()) + translationX && f2 >= ((float) b2.getTop()) + translationY && f2 <= ((float) b2.getBottom()) + translationY) {
                return b2;
            }
        }
        return 0.0f;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e */
    public void m24672e(int i) {
        int b = this.f18619f.m3810b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f18619f.m3812b(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: f */
    public void m24676f(int i) {
        int b = this.f18619f.m3810b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f18619f.m3812b(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: a */
    static void m24607a(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f2469d;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, (view.getRight() + rect2.right) + layoutParams.rightMargin, (view.getBottom() + rect2.bottom) + layoutParams.bottomMargin);
    }

    /* renamed from: j */
    Rect m24690j(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f2470e) {
            return layoutParams.f2469d;
        }
        if (this.f18603C.m3245a() && (layoutParams.m2941e() || layoutParams.m2939c())) {
            return layoutParams.f2469d;
        }
        Rect rect = layoutParams.f2469d;
        rect.set(0, 0, 0, 0);
        int size = this.f18628o.size();
        for (int i = 0; i < size; i++) {
            this.f18623j.set(0, 0, 0, 0);
            ((C0780h) this.f18628o.get(i)).mo930a(this.f18623j, view, this, this.f18603C);
            rect.left += this.f18623j.left;
            rect.top += this.f18623j.top;
            rect.right += this.f18623j.right;
            rect.bottom += this.f18623j.bottom;
        }
        layoutParams.f2470e = false;
        return rect;
    }

    /* renamed from: i */
    void m24688i(int i, int i2) {
        this.ad++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        m24684h(i, i2);
        if (this.ax != null) {
            this.ax.mo757a(this, i, i2);
        }
        if (this.ay != null) {
            for (scrollX = this.ay.size() - 1; scrollX >= 0; scrollX--) {
                ((C0787m) this.ay.get(scrollX)).mo757a(this, i, i2);
            }
        }
        this.ad--;
    }

    /* renamed from: h */
    void m24683h(int i) {
        if (this.f18626m != null) {
            this.f18626m.mo755m(i);
        }
        mo4912g(i);
        if (this.ax != null) {
            this.ax.mo786a(this, i);
        }
        if (this.ay != null) {
            for (int size = this.ay.size() - 1; size >= 0; size--) {
                ((C0787m) this.ay.get(size)).mo786a(this, i);
            }
        }
    }

    /* renamed from: v */
    public boolean m24707v() {
        if (this.f18632s && !this.f18636w) {
            if (!this.f18618e.m16833d()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    void m24708w() {
        int b = this.f18619f.m3810b();
        for (int i = 0; i < b; i++) {
            View b2 = this.f18619f.m3812b(i);
            C0798v b3 = m24651b(b2);
            if (!(b3 == null || b3.f2568i == null)) {
                View view = b3.f2568i.f2560a;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: k */
    static RecyclerView m24619k(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView k = m24619k(viewGroup.getChildAt(i));
            if (k != null) {
                return k;
            }
        }
        return null;
    }

    /* renamed from: c */
    static void m24615c(C0798v c0798v) {
        if (c0798v.f2561b != null) {
            View view = (View) c0798v.f2561b.get();
            while (view != null) {
                if (view != c0798v.f2560a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            c0798v.f2561b = null;
        }
    }

    long getNanoTime() {
        return f18594L ? System.nanoTime() : 0;
    }

    /* renamed from: l */
    void m24696l(View view) {
        C0798v e = m24617e(view);
        m24689i(view);
        if (!(this.f18625l == null || e == null)) {
            this.f18625l.m2965d(e);
        }
        if (this.ab != null) {
            for (int size = this.ab.size() - 1; size >= 0; size--) {
                ((C0784j) this.ab.get(size)).mo1225b(view);
            }
        }
    }

    /* renamed from: m */
    void m24698m(View view) {
        C0798v e = m24617e(view);
        m24685h(view);
        if (!(this.f18625l == null || e == null)) {
            this.f18625l.m2964c(e);
        }
        if (this.ab != null) {
            for (int size = this.ab.size() - 1; size >= 0; size--) {
                ((C0784j) this.ab.get(size)).mo1224a(view);
            }
        }
    }

    /* renamed from: a */
    boolean m24648a(C0798v c0798v, int i) {
        if (m24700o()) {
            c0798v.f2571l = i;
            this.f18608H.add(c0798v);
            return null;
        }
        C0560r.m2167a(c0798v.f2560a, i);
        return true;
    }

    /* renamed from: x */
    void m24709x() {
        for (int size = this.f18608H.size() - 1; size >= 0; size--) {
            C0798v c0798v = (C0798v) this.f18608H.get(size);
            if (c0798v.f2560a.getParent() == this) {
                if (!c0798v.h_()) {
                    int i = c0798v.f2571l;
                    if (i != -1) {
                        C0560r.m2167a(c0798v.f2560a, i);
                        c0798v.f2571l = -1;
                    }
                }
            }
        }
        this.f18608H.clear();
    }

    /* renamed from: d */
    int m24666d(C0798v c0798v) {
        if (!c0798v.m3284a(524)) {
            if (c0798v.m3297p()) {
                return this.f18618e.m16830c(c0798v.f2562c);
            }
        }
        return -1;
    }

    /* renamed from: a */
    void m24634a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            drawable = new StringBuilder();
            drawable.append("Trying to set fast scroller without both required drawables.");
            drawable.append(m24628a());
            throw new IllegalArgumentException(drawable.toString());
        }
        Resources resources = getContext().getResources();
        aa aaVar = new aa(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0684a.fastscroll_default_thickness), resources.getDimensionPixelSize(C0684a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0684a.fastscroll_margin));
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m2066a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m2067a();
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m2077b(i);
    }

    /* renamed from: j */
    public boolean m24693j(int i, int i2) {
        return getScrollingChildHelper().m2071a(i, i2);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().m2078c();
    }

    /* renamed from: i */
    public void m24687i(int i) {
        getScrollingChildHelper().m2079c(i);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m2076b();
    }

    /* renamed from: j */
    public boolean m24692j(int i) {
        return getScrollingChildHelper().m2070a(i);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m2072a(i, i2, i3, i4, iArr);
    }

    /* renamed from: a */
    public boolean m24645a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m2073a(i, i2, i3, i4, iArr, i5);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m2074a(i, i2, iArr, iArr2);
    }

    /* renamed from: a */
    public boolean m24647a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m2075a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m2069a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m2068a(f, f2);
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.aA == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return this.aA.m2979a(i, i2);
    }

    private C0551j getScrollingChildHelper() {
        if (this.aC == null) {
            this.aC = new C0551j(this);
        }
        return this.aC;
    }
}
