package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0038s;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.C0334l.C0331a;
import android.support.v4.app.C0334l.C0332b;
import android.support.v4.app.C0334l.C0333c;
import android.support.v4.app.Fragment.C0311b;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.p017f.C0416b;
import android.support.v4.p017f.C0418d;
import android.support.v4.p017f.C0419e;
import android.support.v4.p017f.C0429j;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.app.m */
final class C3112m extends C0334l implements Factory2 {
    /* renamed from: F */
    static final Interpolator f13155F = new DecelerateInterpolator(2.5f);
    /* renamed from: G */
    static final Interpolator f13156G = new DecelerateInterpolator(1.5f);
    /* renamed from: H */
    static final Interpolator f13157H = new AccelerateInterpolator(2.5f);
    /* renamed from: I */
    static final Interpolator f13158I = new AccelerateInterpolator(1.5f);
    /* renamed from: a */
    static boolean f13159a = false;
    /* renamed from: q */
    static Field f13160q;
    /* renamed from: A */
    Bundle f13161A = null;
    /* renamed from: B */
    SparseArray<Parcelable> f13162B = null;
    /* renamed from: C */
    ArrayList<C3111i> f13163C;
    /* renamed from: D */
    C0346n f13164D;
    /* renamed from: E */
    Runnable f13165E = new C03351(this);
    /* renamed from: J */
    private final CopyOnWriteArrayList<C0429j<C0332b, Boolean>> f13166J = new CopyOnWriteArrayList();
    /* renamed from: b */
    ArrayList<C0345g> f13167b;
    /* renamed from: c */
    boolean f13168c;
    /* renamed from: d */
    int f13169d = 0;
    /* renamed from: e */
    final ArrayList<Fragment> f13170e = new ArrayList();
    /* renamed from: f */
    SparseArray<Fragment> f13171f;
    /* renamed from: g */
    ArrayList<C3106d> f13172g;
    /* renamed from: h */
    ArrayList<Fragment> f13173h;
    /* renamed from: i */
    ArrayList<C3106d> f13174i;
    /* renamed from: j */
    ArrayList<Integer> f13175j;
    /* renamed from: k */
    ArrayList<C0333c> f13176k;
    /* renamed from: l */
    int f13177l = 0;
    /* renamed from: m */
    C3107k f13178m;
    /* renamed from: n */
    C0329i f13179n;
    /* renamed from: o */
    Fragment f13180o;
    /* renamed from: p */
    Fragment f13181p;
    /* renamed from: r */
    boolean f13182r;
    /* renamed from: s */
    boolean f13183s;
    /* renamed from: t */
    boolean f13184t;
    /* renamed from: u */
    boolean f13185u;
    /* renamed from: v */
    String f13186v;
    /* renamed from: w */
    boolean f13187w;
    /* renamed from: x */
    ArrayList<C3106d> f13188x;
    /* renamed from: y */
    ArrayList<Boolean> f13189y;
    /* renamed from: z */
    ArrayList<Fragment> f13190z;

    /* renamed from: android.support.v4.app.m$1 */
    class C03351 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3112m f1153a;

        C03351(C3112m c3112m) {
            this.f1153a = c3112m;
        }

        public void run() {
            this.f1153a.m15504k();
        }
    }

    /* renamed from: android.support.v4.app.m$b */
    private static class C0340b implements AnimationListener {
        /* renamed from: a */
        private final AnimationListener f1164a;

        private C0340b(AnimationListener animationListener) {
            this.f1164a = animationListener;
        }

        public void onAnimationStart(Animation animation) {
            if (this.f1164a != null) {
                this.f1164a.onAnimationStart(animation);
            }
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f1164a != null) {
                this.f1164a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.f1164a != null) {
                this.f1164a.onAnimationRepeat(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.m$c */
    private static class C0341c {
        /* renamed from: a */
        public final Animation f1165a;
        /* renamed from: b */
        public final Animator f1166b;

        private C0341c(Animation animation) {
            this.f1165a = animation;
            this.f1166b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        private C0341c(Animator animator) {
            this.f1165a = null;
            this.f1166b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.m$d */
    private static class C0342d extends AnimatorListenerAdapter {
        /* renamed from: a */
        View f1167a;

        C0342d(View view) {
            this.f1167a = view;
        }

        public void onAnimationStart(Animator animator) {
            this.f1167a.setLayerType(2, null);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1167a.setLayerType(0, null);
            animator.removeListener(this);
        }
    }

    /* renamed from: android.support.v4.app.m$e */
    private static class C0343e extends AnimationSet implements Runnable {
        /* renamed from: a */
        private final ViewGroup f1168a;
        /* renamed from: b */
        private final View f1169b;
        /* renamed from: c */
        private boolean f1170c;
        /* renamed from: d */
        private boolean f1171d;

        C0343e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1168a = viewGroup;
            this.f1169b = view;
            addAnimation(animation);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            if (this.f1170c) {
                return this.f1171d ^ 1;
            }
            if (super.getTransformation(j, transformation) == null) {
                this.f1170c = true;
                aa.m1142a(this.f1168a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.f1170c) {
                return this.f1171d ^ 1;
            }
            if (super.getTransformation(j, transformation, f) == null) {
                this.f1170c = true;
                aa.m1142a(this.f1168a, this);
            }
            return true;
        }

        public void run() {
            this.f1168a.endViewTransition(this.f1169b);
            this.f1171d = true;
        }
    }

    /* renamed from: android.support.v4.app.m$f */
    static class C0344f {
        /* renamed from: a */
        public static final int[] f1172a = new int[]{16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.app.m$g */
    interface C0345g {
        /* renamed from: a */
        boolean mo275a(ArrayList<C3106d> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.app.m$a */
    private static class C3109a extends C0340b {
        /* renamed from: a */
        View f13147a;

        /* renamed from: android.support.v4.app.m$a$1 */
        class C03391 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C3109a f1163a;

            C03391(C3109a c3109a) {
                this.f1163a = c3109a;
            }

            public void run() {
                this.f1163a.f13147a.setLayerType(0, null);
            }
        }

        C3109a(View view, AnimationListener animationListener) {
            super(animationListener);
            this.f13147a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (!C0560r.m2162A(this.f13147a)) {
                if (VERSION.SDK_INT < 24) {
                    this.f13147a.setLayerType(0, null);
                    super.onAnimationEnd(animation);
                }
            }
            this.f13147a.post(new C03391(this));
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.m$h */
    private class C3110h implements C0345g {
        /* renamed from: a */
        final String f13148a;
        /* renamed from: b */
        final int f13149b;
        /* renamed from: c */
        final int f13150c;
        /* renamed from: d */
        final /* synthetic */ C3112m f13151d;

        C3110h(C3112m c3112m, String str, int i, int i2) {
            this.f13151d = c3112m;
            this.f13148a = str;
            this.f13149b = i;
            this.f13150c = i2;
        }

        /* renamed from: a */
        public boolean mo275a(ArrayList<C3106d> arrayList, ArrayList<Boolean> arrayList2) {
            if (this.f13151d.f13181p != null && this.f13149b < 0 && this.f13148a == null) {
                C0334l peekChildFragmentManager = this.f13151d.f13181p.peekChildFragmentManager();
                if (peekChildFragmentManager != null && peekChildFragmentManager.mo302d()) {
                    return null;
                }
            }
            return this.f13151d.m15463a((ArrayList) arrayList, (ArrayList) arrayList2, this.f13148a, this.f13149b, this.f13150c);
        }
    }

    /* renamed from: android.support.v4.app.m$i */
    static class C3111i implements C0311b {
        /* renamed from: a */
        private final boolean f13152a;
        /* renamed from: b */
        private final C3106d f13153b;
        /* renamed from: c */
        private int f13154c;

        C3111i(C3106d c3106d, boolean z) {
            this.f13152a = z;
            this.f13153b = c3106d;
        }

        /* renamed from: a */
        public void mo286a() {
            this.f13154c--;
            if (this.f13154c == 0) {
                this.f13153b.f13118a.m15402D();
            }
        }

        /* renamed from: b */
        public void mo287b() {
            this.f13154c++;
        }

        /* renamed from: c */
        public boolean m15398c() {
            return this.f13154c == 0;
        }

        /* renamed from: d */
        public void m15399d() {
            int i = this.f13154c > 0 ? 1 : 0;
            C3112m c3112m = this.f13153b.f13118a;
            int size = c3112m.f13170e.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = (Fragment) c3112m.f13170e.get(i2);
                fragment.setOnStartEnterTransitionListener(null);
                if (i != 0 && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.f13153b.f13118a.m15412a(this.f13153b, this.f13152a, i ^ true, true);
        }

        /* renamed from: e */
        public void m15400e() {
            this.f13153b.f13118a.m15412a(this.f13153b, this.f13152a, false, false);
        }
    }

    /* renamed from: b */
    public static int m15424b(int i, boolean z) {
        return i != 4097 ? i != 4099 ? i != 8194 ? -1 : z ? 3 : 4 : z ? 5 : 6 : z ? 1 : 2;
    }

    /* renamed from: e */
    public static int m15431e(int i) {
        return i != 4097 ? i != 4099 ? i != 8194 ? 0 : 4097 : 4099 : 8194;
    }

    /* renamed from: B */
    Factory2 m15435B() {
        return this;
    }

    C3112m() {
    }

    /* renamed from: a */
    static boolean m15421a(C0341c c0341c) {
        if (c0341c.f1165a instanceof AlphaAnimation) {
            return true;
        }
        if (!(c0341c.f1165a instanceof AnimationSet)) {
            return C3112m.m15420a(c0341c.f1166b);
        }
        c0341c = ((AnimationSet) c0341c.f1165a).getAnimations();
        for (int i = 0; i < c0341c.size(); i++) {
            if (c0341c.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m15420a(Animator animator) {
        if (animator == null) {
            return false;
        }
        int i;
        if (animator instanceof ValueAnimator) {
            animator = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : animator) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            animator = ((AnimatorSet) animator).getChildAnimations();
            for (i = 0; i < animator.size(); i++) {
                if (C3112m.m15420a((Animator) animator.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m15422a(View view, C0341c c0341c) {
        boolean z = false;
        if (view != null) {
            if (c0341c != null) {
                if (VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0560r.m2206r(view) != null && C3112m.m15421a(c0341c) != null) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m15417a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0419e("FragmentManager"));
        if (this.f13178m != null) {
            try {
                this.f13178m.mo3743a("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo297a("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: a */
    public C0347q mo292a() {
        return new C3106d(this);
    }

    /* renamed from: b */
    public boolean mo300b() {
        boolean k = m15504k();
        m15404F();
        return k;
    }

    /* renamed from: c */
    public void mo301c() {
        m15457a(new C3110h(this, null, -1, 0), false);
    }

    /* renamed from: d */
    public boolean mo302d() {
        m15401C();
        return m15423a(null, -1, 0);
    }

    /* renamed from: a */
    public void mo293a(int i, int i2) {
        if (i >= 0) {
            m15457a(new C3110h(this, null, i, i2), (boolean) 0);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad id: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    private boolean m15423a(String str, int i, int i2) {
        m15504k();
        m15429c(true);
        if (this.f13181p != null && i < 0 && str == null) {
            C0334l peekChildFragmentManager = this.f13181p.peekChildFragmentManager();
            if (peekChildFragmentManager != null && peekChildFragmentManager.mo302d()) {
                return true;
            }
        }
        str = m15463a(this.f13188x, this.f13189y, str, i, i2);
        if (str != null) {
            this.f13168c = true;
            try {
                m15427b(this.f13188x, this.f13189y);
            } finally {
                m15403E();
            }
        }
        m15505l();
        m15406H();
        return str;
    }

    /* renamed from: e */
    public int mo303e() {
        return this.f13172g != null ? this.f13172g.size() : 0;
    }

    /* renamed from: b */
    public C0331a mo298b(int i) {
        return (C0331a) this.f13172g.get(i);
    }

    /* renamed from: a */
    public void mo296a(C0333c c0333c) {
        if (this.f13176k == null) {
            this.f13176k = new ArrayList();
        }
        this.f13176k.add(c0333c);
    }

    /* renamed from: b */
    public void mo299b(C0333c c0333c) {
        if (this.f13176k != null) {
            this.f13176k.remove(c0333c);
        }
    }

    /* renamed from: a */
    public void mo294a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(fragment);
            stringBuilder.append(" is not currently in the FragmentManager");
            m15417a(new IllegalStateException(stringBuilder.toString()));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    /* renamed from: a */
    public Fragment mo290a(Bundle bundle, String str) {
        bundle = bundle.getInt(str, -1);
        if (bundle == -1) {
            return null;
        }
        Fragment fragment = (Fragment) this.f13171f.get(bundle);
        if (fragment == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment no longer exists for key ");
            stringBuilder.append(str);
            stringBuilder.append(": index ");
            stringBuilder.append(bundle);
            m15417a(new IllegalStateException(stringBuilder.toString()));
        }
        return fragment;
    }

    /* renamed from: f */
    public List<Fragment> mo304f() {
        if (this.f13170e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List<Fragment> list;
        synchronized (this.f13170e) {
            list = (List) this.f13170e.clone();
        }
        return list;
    }

    /* renamed from: a */
    public SavedState mo288a(Fragment fragment) {
        if (fragment.mIndex < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(fragment);
            stringBuilder.append(" is not currently in the FragmentManager");
            m15417a(new IllegalStateException(stringBuilder.toString()));
        }
        SavedState savedState = null;
        if (fragment.mState <= 0) {
            return null;
        }
        fragment = m15511o(fragment);
        if (fragment != null) {
            savedState = new SavedState(fragment);
        }
        return savedState;
    }

    /* renamed from: g */
    public boolean mo305g() {
        return this.f13185u;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.f13180o != null) {
            C0418d.m1535a(this.f13180o, stringBuilder);
        } else {
            C0418d.m1535a(this.f13178m, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo297a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        Fragment fragment;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("    ");
        String stringBuilder2 = stringBuilder.toString();
        if (this.f13171f != null) {
            size = this.f13171f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.f13171f.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        fragment.dump(stringBuilder2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        size = this.f13170e.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (i = 0; i < size; i++) {
                fragment = (Fragment) this.f13170e.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        if (this.f13173h != null) {
            size = this.f13173h.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.f13173h.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        if (this.f13172g != null) {
            size = this.f13172g.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    C3106d c3106d = (C3106d) this.f13172g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c3106d.toString());
                    c3106d.m15354a(stringBuilder2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f13174i != null) {
                fileDescriptor = this.f13174i.size();
                if (fileDescriptor > null) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (strArr = null; strArr < fileDescriptor; strArr++) {
                        C3106d c3106d2 = (C3106d) this.f13174i.get(strArr);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(strArr);
                        printWriter.print(": ");
                        printWriter.println(c3106d2);
                    }
                }
            }
            if (this.f13175j != null && this.f13175j.size() > null) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f13175j.toArray()));
            }
        }
        if (this.f13167b != null) {
            fileDescriptor = this.f13167b.size();
            if (fileDescriptor > null) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i2 = 0; i2 < fileDescriptor; i2++) {
                    C0345g c0345g = (C0345g) this.f13167b.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(c0345g);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f13178m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f13179n);
        if (this.f13180o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f13180o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f13177l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f13183s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f13184t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f13185u);
        if (this.f13182r != null) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f13182r);
        }
        if (this.f13186v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f13186v);
        }
    }

    /* renamed from: a */
    static C0341c m15409a(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f13155F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        Animation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f13156G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0341c(animationSet);
    }

    /* renamed from: a */
    static C0341c m15408a(Context context, float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f13156G);
        alphaAnimation.setDuration(3.08E-43f);
        return new C0341c(alphaAnimation);
    }

    /* renamed from: a */
    android.support.v4.app.C3112m.C0341c m15441a(android.support.v4.app.Fragment r6, int r7, boolean r8, int r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r6.getNextAnim();
        r1 = r6.onCreateAnimation(r7, r8, r0);
        r2 = 0;
        if (r1 == 0) goto L_0x0011;
    L_0x000b:
        r6 = new android.support.v4.app.m$c;
        r6.<init>(r1);
        return r6;
    L_0x0011:
        r6 = r6.onCreateAnimator(r7, r8, r0);
        if (r6 == 0) goto L_0x001d;
    L_0x0017:
        r7 = new android.support.v4.app.m$c;
        r7.<init>(r6);
        return r7;
    L_0x001d:
        if (r0 == 0) goto L_0x0076;
    L_0x001f:
        r6 = r5.f13178m;
        r6 = r6.m15390i();
        r6 = r6.getResources();
        r6 = r6.getResourceTypeName(r0);
        r1 = "anim";
        r6 = r1.equals(r6);
        r1 = 0;
        if (r6 == 0) goto L_0x004c;
    L_0x0036:
        r3 = r5.f13178m;	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        r3 = r3.m15390i();	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r0);	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        if (r3 == 0) goto L_0x0048;	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
    L_0x0042:
        r4 = new android.support.v4.app.m$c;	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        r4.<init>(r3);	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        return r4;
    L_0x0048:
        r1 = 1;
        goto L_0x004c;
    L_0x004a:
        r6 = move-exception;
        throw r6;
    L_0x004c:
        if (r1 != 0) goto L_0x0076;
    L_0x004e:
        r1 = r5.f13178m;	 Catch:{ RuntimeException -> 0x0060 }
        r1 = r1.m15390i();	 Catch:{ RuntimeException -> 0x0060 }
        r1 = android.animation.AnimatorInflater.loadAnimator(r1, r0);	 Catch:{ RuntimeException -> 0x0060 }
        if (r1 == 0) goto L_0x0076;	 Catch:{ RuntimeException -> 0x0060 }
    L_0x005a:
        r3 = new android.support.v4.app.m$c;	 Catch:{ RuntimeException -> 0x0060 }
        r3.<init>(r1);	 Catch:{ RuntimeException -> 0x0060 }
        return r3;
    L_0x0060:
        r1 = move-exception;
        if (r6 != 0) goto L_0x0075;
    L_0x0063:
        r6 = r5.f13178m;
        r6 = r6.m15390i();
        r6 = android.view.animation.AnimationUtils.loadAnimation(r6, r0);
        if (r6 == 0) goto L_0x0076;
    L_0x006f:
        r7 = new android.support.v4.app.m$c;
        r7.<init>(r6);
        return r7;
    L_0x0075:
        throw r1;
    L_0x0076:
        if (r7 != 0) goto L_0x0079;
    L_0x0078:
        return r2;
    L_0x0079:
        r6 = android.support.v4.app.C3112m.m15424b(r7, r8);
        if (r6 >= 0) goto L_0x0080;
    L_0x007f:
        return r2;
    L_0x0080:
        r7 = 1064933786; // 0x3f79999a float:0.975 double:5.26147199E-315;
        r8 = 0;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        switch(r6) {
            case 1: goto L_0x00d4;
            case 2: goto L_0x00c9;
            case 3: goto L_0x00be;
            case 4: goto L_0x00b0;
            case 5: goto L_0x00a5;
            case 6: goto L_0x009a;
            default: goto L_0x0089;
        };
    L_0x0089:
        if (r9 != 0) goto L_0x00e1;
    L_0x008b:
        r6 = r5.f13178m;
        r6 = r6.mo3749e();
        if (r6 == 0) goto L_0x00e1;
    L_0x0093:
        r6 = r5.f13178m;
        r9 = r6.mo3750f();
        goto L_0x00e1;
    L_0x009a:
        r6 = r5.f13178m;
        r6 = r6.m15390i();
        r6 = android.support.v4.app.C3112m.m15408a(r6, r0, r8);
        return r6;
    L_0x00a5:
        r6 = r5.f13178m;
        r6 = r6.m15390i();
        r6 = android.support.v4.app.C3112m.m15408a(r6, r8, r0);
        return r6;
    L_0x00b0:
        r6 = r5.f13178m;
        r6 = r6.m15390i();
        r7 = 1065982362; // 0x3f89999a float:1.075 double:5.26665264E-315;
        r6 = android.support.v4.app.C3112m.m15409a(r6, r0, r7, r0, r8);
        return r6;
    L_0x00be:
        r6 = r5.f13178m;
        r6 = r6.m15390i();
        r6 = android.support.v4.app.C3112m.m15409a(r6, r7, r0, r8, r0);
        return r6;
    L_0x00c9:
        r6 = r5.f13178m;
        r6 = r6.m15390i();
        r6 = android.support.v4.app.C3112m.m15409a(r6, r0, r7, r0, r8);
        return r6;
    L_0x00d4:
        r6 = r5.f13178m;
        r6 = r6.m15390i();
        r7 = 1066401792; // 0x3f900000 float:1.125 double:5.2687249E-315;
        r6 = android.support.v4.app.C3112m.m15409a(r6, r7, r0, r8, r0);
        return r6;
    L_0x00e1:
        if (r9 != 0) goto L_0x00e4;
    L_0x00e3:
        return r2;
    L_0x00e4:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.m.a(android.support.v4.app.Fragment, int, boolean, int):android.support.v4.app.m$c");
    }

    /* renamed from: b */
    public void m15466b(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.f13168c) {
                this.f13187w = true;
                return;
            }
            fragment.mDeferStart = false;
            m15449a(fragment, this.f13177l, 0, 0, false);
        }
    }

    /* renamed from: b */
    private static void m15426b(View view, C0341c c0341c) {
        if (view != null) {
            if (c0341c != null) {
                if (C3112m.m15422a(view, c0341c)) {
                    if (c0341c.f1166b != null) {
                        c0341c.f1166b.addListener(new C0342d(view));
                    } else {
                        AnimationListener a = C3112m.m15410a(c0341c.f1165a);
                        view.setLayerType(2, null);
                        c0341c.f1165a.setAnimationListener(new C3109a(view, a));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static AnimationListener m15410a(Animation animation) {
        try {
            if (f13160q == null) {
                f13160q = Animation.class.getDeclaredField("mListener");
                f13160q.setAccessible(true);
            }
            return (AnimationListener) f13160q.get(animation);
        } catch (Animation animation2) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", animation2);
            return null;
        } catch (Animation animation22) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", animation22);
            return null;
        }
    }

    /* renamed from: c */
    boolean m15481c(int i) {
        return this.f13177l >= i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    void m15449a(android.support.v4.app.Fragment r16, int r17, int r18, int r19, boolean r20) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r15 = this;
        r6 = r15;
        r7 = r16;
        r0 = r7.mAdded;
        r8 = 1;
        if (r0 == 0) goto L_0x0010;
    L_0x0008:
        r0 = r7.mDetached;
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0010;
    L_0x000d:
        r0 = r17;
        goto L_0x0015;
    L_0x0010:
        r0 = r17;
        if (r0 <= r8) goto L_0x0015;
    L_0x0014:
        r0 = 1;
    L_0x0015:
        r1 = r7.mRemoving;
        if (r1 == 0) goto L_0x002b;
    L_0x0019:
        r1 = r7.mState;
        if (r0 <= r1) goto L_0x002b;
    L_0x001d:
        r0 = r7.mState;
        if (r0 != 0) goto L_0x0029;
    L_0x0021:
        r0 = r16.isInBackStack();
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        r0 = 1;
        goto L_0x002b;
    L_0x0029:
        r0 = r7.mState;
    L_0x002b:
        r1 = r7.mDeferStart;
        r9 = 4;
        r10 = 3;
        if (r1 == 0) goto L_0x0039;
    L_0x0031:
        r1 = r7.mState;
        if (r1 >= r9) goto L_0x0039;
    L_0x0035:
        if (r0 <= r10) goto L_0x0039;
    L_0x0037:
        r11 = 3;
        goto L_0x003a;
    L_0x0039:
        r11 = r0;
    L_0x003a:
        r0 = r7.mState;
        r12 = 2;
        r13 = 0;
        r14 = 0;
        if (r0 > r11) goto L_0x02fa;
    L_0x0041:
        r0 = r7.mFromLayout;
        if (r0 == 0) goto L_0x004a;
    L_0x0045:
        r0 = r7.mInLayout;
        if (r0 != 0) goto L_0x004a;
    L_0x0049:
        return;
    L_0x004a:
        r0 = r16.getAnimatingAway();
        if (r0 != 0) goto L_0x0056;
    L_0x0050:
        r0 = r16.getAnimator();
        if (r0 == 0) goto L_0x0069;
    L_0x0056:
        r7.setAnimatingAway(r13);
        r7.setAnimator(r13);
        r2 = r16.getStateAfterAnimating();
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r15;
        r1 = r16;
        r0.m15449a(r1, r2, r3, r4, r5);
    L_0x0069:
        r0 = r7.mState;
        switch(r0) {
            case 0: goto L_0x0070;
            case 1: goto L_0x01af;
            case 2: goto L_0x02ac;
            case 3: goto L_0x02b0;
            case 4: goto L_0x02d2;
            default: goto L_0x006e;
        };
    L_0x006e:
        goto L_0x045f;
    L_0x0070:
        if (r11 <= 0) goto L_0x01af;
    L_0x0072:
        r0 = f13159a;
        if (r0 == 0) goto L_0x008c;
    L_0x0076:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x008c:
        r0 = r7.mSavedFragmentState;
        if (r0 == 0) goto L_0x00e3;
    L_0x0090:
        r0 = r7.mSavedFragmentState;
        r1 = r6.f13178m;
        r1 = r1.m15390i();
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r7.mSavedFragmentState;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r7.mSavedViewState = r0;
        r0 = r7.mSavedFragmentState;
        r1 = "android:target_state";
        r0 = r15.mo290a(r0, r1);
        r7.mTarget = r0;
        r0 = r7.mTarget;
        if (r0 == 0) goto L_0x00c1;
    L_0x00b7:
        r0 = r7.mSavedFragmentState;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r14);
        r7.mTargetRequestCode = r0;
    L_0x00c1:
        r0 = r7.mSavedUserVisibleHint;
        if (r0 == 0) goto L_0x00d0;
    L_0x00c5:
        r0 = r7.mSavedUserVisibleHint;
        r0 = r0.booleanValue();
        r7.mUserVisibleHint = r0;
        r7.mSavedUserVisibleHint = r13;
        goto L_0x00da;
    L_0x00d0:
        r0 = r7.mSavedFragmentState;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r8);
        r7.mUserVisibleHint = r0;
    L_0x00da:
        r0 = r7.mUserVisibleHint;
        if (r0 != 0) goto L_0x00e3;
    L_0x00de:
        r7.mDeferStart = r8;
        if (r11 <= r10) goto L_0x00e3;
    L_0x00e2:
        r11 = 3;
    L_0x00e3:
        r0 = r6.f13178m;
        r7.mHost = r0;
        r0 = r6.f13180o;
        r7.mParentFragment = r0;
        r0 = r6.f13180o;
        if (r0 == 0) goto L_0x00f4;
    L_0x00ef:
        r0 = r6.f13180o;
        r0 = r0.mChildFragmentManager;
        goto L_0x00fa;
    L_0x00f4:
        r0 = r6.f13178m;
        r0 = r0.m15392k();
    L_0x00fa:
        r7.mFragmentManager = r0;
        r0 = r7.mTarget;
        if (r0 == 0) goto L_0x0145;
    L_0x0100:
        r0 = r6.f13171f;
        r1 = r7.mTarget;
        r1 = r1.mIndex;
        r0 = r0.get(r1);
        r1 = r7.mTarget;
        if (r0 != r1) goto L_0x011f;
    L_0x010e:
        r0 = r7.mTarget;
        r0 = r0.mState;
        if (r0 >= r8) goto L_0x0145;
    L_0x0114:
        r1 = r7.mTarget;
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r15;
        r0.m15449a(r1, r2, r3, r4, r5);
        goto L_0x0145;
    L_0x011f:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1.append(r2);
        r1.append(r7);
        r2 = " declared target fragment ";
        r1.append(r2);
        r2 = r7.mTarget;
        r1.append(r2);
        r2 = " that does not belong to this FragmentManager!";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0145:
        r0 = r6.f13178m;
        r0 = r0.m15390i();
        r15.m15450a(r7, r0, r14);
        r7.mCalled = r14;
        r0 = r6.f13178m;
        r0 = r0.m15390i();
        r7.onAttach(r0);
        r0 = r7.mCalled;
        if (r0 == 0) goto L_0x0193;
    L_0x015d:
        r0 = r7.mParentFragment;
        if (r0 != 0) goto L_0x0167;
    L_0x0161:
        r0 = r6.f13178m;
        r0.mo3747b(r7);
        goto L_0x016c;
    L_0x0167:
        r0 = r7.mParentFragment;
        r0.onAttachFragment(r7);
    L_0x016c:
        r0 = r6.f13178m;
        r0 = r0.m15390i();
        r15.m15467b(r7, r0, r14);
        r0 = r7.mIsCreated;
        if (r0 != 0) goto L_0x0189;
    L_0x0179:
        r0 = r7.mSavedFragmentState;
        r15.m15451a(r7, r0, r14);
        r0 = r7.mSavedFragmentState;
        r7.performCreate(r0);
        r0 = r7.mSavedFragmentState;
        r15.m15468b(r7, r0, r14);
        goto L_0x0190;
    L_0x0189:
        r0 = r7.mSavedFragmentState;
        r7.restoreChildFragmentState(r0);
        r7.mState = r8;
    L_0x0190:
        r7.mRetaining = r14;
        goto L_0x01af;
    L_0x0193:
        r0 = new android.support.v4.app.SuperNotCalledException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1.append(r2);
        r1.append(r7);
        r2 = " did not call through to super.onAttach()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x01af:
        r15.m15483d(r16);
        if (r11 <= r8) goto L_0x02ac;
    L_0x01b4:
        r0 = f13159a;
        if (r0 == 0) goto L_0x01ce;
    L_0x01b8:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto ACTIVITY_CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x01ce:
        r0 = r7.mFromLayout;
        if (r0 != 0) goto L_0x0297;
    L_0x01d2:
        r0 = r7.mContainerId;
        if (r0 == 0) goto L_0x0246;
    L_0x01d6:
        r0 = r7.mContainerId;
        r1 = -1;
        if (r0 != r1) goto L_0x01f9;
    L_0x01db:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Cannot create fragment ";
        r1.append(r2);
        r1.append(r7);
        r2 = " for a container view with no id";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r15.m15417a(r0);
    L_0x01f9:
        r0 = r6.f13179n;
        r1 = r7.mContainerId;
        r0 = r0.mo259a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x0247;
    L_0x0205:
        r1 = r7.mRestored;
        if (r1 != 0) goto L_0x0247;
    L_0x0209:
        r1 = r16.getResources();	 Catch:{ NotFoundException -> 0x0214 }
        r2 = r7.mContainerId;	 Catch:{ NotFoundException -> 0x0214 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x0214 }
        goto L_0x0216;
    L_0x0214:
        r1 = "unknown";
    L_0x0216:
        r2 = new java.lang.IllegalArgumentException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "No view found for id 0x";
        r3.append(r4);
        r4 = r7.mContainerId;
        r4 = java.lang.Integer.toHexString(r4);
        r3.append(r4);
        r4 = " (";
        r3.append(r4);
        r3.append(r1);
        r1 = ") for fragment ";
        r3.append(r1);
        r3.append(r7);
        r1 = r3.toString();
        r2.<init>(r1);
        r15.m15417a(r2);
        goto L_0x0247;
    L_0x0246:
        r0 = r13;
    L_0x0247:
        r7.mContainer = r0;
        r1 = r7.mSavedFragmentState;
        r1 = r7.performGetLayoutInflater(r1);
        r2 = r7.mSavedFragmentState;
        r1 = r7.performCreateView(r1, r0, r2);
        r7.mView = r1;
        r1 = r7.mView;
        if (r1 == 0) goto L_0x0295;
    L_0x025b:
        r1 = r7.mView;
        r7.mInnerView = r1;
        r1 = r7.mView;
        r1.setSaveFromParentEnabled(r14);
        if (r0 == 0) goto L_0x026b;
    L_0x0266:
        r1 = r7.mView;
        r0.addView(r1);
    L_0x026b:
        r0 = r7.mHidden;
        if (r0 == 0) goto L_0x0276;
    L_0x026f:
        r0 = r7.mView;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0276:
        r0 = r7.mView;
        r1 = r7.mSavedFragmentState;
        r7.onViewCreated(r0, r1);
        r0 = r7.mView;
        r1 = r7.mSavedFragmentState;
        r15.m15452a(r7, r0, r1, r14);
        r0 = r7.mView;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0291;
    L_0x028c:
        r0 = r7.mContainer;
        if (r0 == 0) goto L_0x0291;
    L_0x0290:
        goto L_0x0292;
    L_0x0291:
        r8 = 0;
    L_0x0292:
        r7.mIsNewlyAdded = r8;
        goto L_0x0297;
    L_0x0295:
        r7.mInnerView = r13;
    L_0x0297:
        r0 = r7.mSavedFragmentState;
        r7.performActivityCreated(r0);
        r0 = r7.mSavedFragmentState;
        r15.m15479c(r7, r0, r14);
        r0 = r7.mView;
        if (r0 == 0) goto L_0x02aa;
    L_0x02a5:
        r0 = r7.mSavedFragmentState;
        r7.restoreViewState(r0);
    L_0x02aa:
        r7.mSavedFragmentState = r13;
    L_0x02ac:
        if (r11 <= r12) goto L_0x02b0;
    L_0x02ae:
        r7.mState = r10;
    L_0x02b0:
        if (r11 <= r10) goto L_0x02d2;
    L_0x02b2:
        r0 = f13159a;
        if (r0 == 0) goto L_0x02cc;
    L_0x02b6:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto STARTED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02cc:
        r16.performStart();
        r15.m15469b(r7, r14);
    L_0x02d2:
        if (r11 <= r9) goto L_0x045f;
    L_0x02d4:
        r0 = f13159a;
        if (r0 == 0) goto L_0x02ee;
    L_0x02d8:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto RESUMED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02ee:
        r16.performResume();
        r15.m15480c(r7, r14);
        r7.mSavedFragmentState = r13;
        r7.mSavedViewState = r13;
        goto L_0x045f;
    L_0x02fa:
        r0 = r7.mState;
        if (r0 <= r11) goto L_0x045f;
    L_0x02fe:
        r0 = r7.mState;
        switch(r0) {
            case 1: goto L_0x03e9;
            case 2: goto L_0x0369;
            case 3: goto L_0x034a;
            case 4: goto L_0x0328;
            case 5: goto L_0x0305;
            default: goto L_0x0303;
        };
    L_0x0303:
        goto L_0x045f;
    L_0x0305:
        r0 = 5;
        if (r11 >= r0) goto L_0x0328;
    L_0x0308:
        r0 = f13159a;
        if (r0 == 0) goto L_0x0322;
    L_0x030c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom RESUMED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0322:
        r16.performPause();
        r15.m15485d(r7, r14);
    L_0x0328:
        if (r11 >= r9) goto L_0x034a;
    L_0x032a:
        r0 = f13159a;
        if (r0 == 0) goto L_0x0344;
    L_0x032e:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STARTED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0344:
        r16.performStop();
        r15.m15489e(r7, r14);
    L_0x034a:
        if (r11 >= r10) goto L_0x0369;
    L_0x034c:
        r0 = f13159a;
        if (r0 == 0) goto L_0x0366;
    L_0x0350:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STOPPED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0366:
        r16.performReallyStop();
    L_0x0369:
        if (r11 >= r12) goto L_0x03e9;
    L_0x036b:
        r0 = f13159a;
        if (r0 == 0) goto L_0x0385;
    L_0x036f:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom ACTIVITY_CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0385:
        r0 = r7.mView;
        if (r0 == 0) goto L_0x0398;
    L_0x0389:
        r0 = r6.f13178m;
        r0 = r0.mo3744a(r7);
        if (r0 == 0) goto L_0x0398;
    L_0x0391:
        r0 = r7.mSavedViewState;
        if (r0 != 0) goto L_0x0398;
    L_0x0395:
        r15.m15510n(r16);
    L_0x0398:
        r16.performDestroyView();
        r15.m15492f(r7, r14);
        r0 = r7.mView;
        if (r0 == 0) goto L_0x03e1;
    L_0x03a2:
        r0 = r7.mContainer;
        if (r0 == 0) goto L_0x03e1;
    L_0x03a6:
        r0 = r7.mContainer;
        r1 = r7.mView;
        r0.endViewTransition(r1);
        r0 = r7.mView;
        r0.clearAnimation();
        r0 = r6.f13177l;
        r1 = 0;
        if (r0 <= 0) goto L_0x03d2;
    L_0x03b7:
        r0 = r6.f13185u;
        if (r0 != 0) goto L_0x03d2;
    L_0x03bb:
        r0 = r7.mView;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x03d2;
    L_0x03c3:
        r0 = r7.mPostponedAlpha;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 < 0) goto L_0x03d2;
    L_0x03c9:
        r0 = r18;
        r2 = r19;
        r0 = r15.m15441a(r7, r0, r14, r2);
        goto L_0x03d3;
    L_0x03d2:
        r0 = r13;
    L_0x03d3:
        r7.mPostponedAlpha = r1;
        if (r0 == 0) goto L_0x03da;
    L_0x03d7:
        r15.m15411a(r7, r0, r11);
    L_0x03da:
        r0 = r7.mContainer;
        r1 = r7.mView;
        r0.removeView(r1);
    L_0x03e1:
        r7.mContainer = r13;
        r7.mView = r13;
        r7.mInnerView = r13;
        r7.mInLayout = r14;
    L_0x03e9:
        if (r11 >= r8) goto L_0x045f;
    L_0x03eb:
        r0 = r6.f13185u;
        if (r0 == 0) goto L_0x0410;
    L_0x03ef:
        r0 = r16.getAnimatingAway();
        if (r0 == 0) goto L_0x0400;
    L_0x03f5:
        r0 = r16.getAnimatingAway();
        r7.setAnimatingAway(r13);
        r0.clearAnimation();
        goto L_0x0410;
    L_0x0400:
        r0 = r16.getAnimator();
        if (r0 == 0) goto L_0x0410;
    L_0x0406:
        r0 = r16.getAnimator();
        r7.setAnimator(r13);
        r0.cancel();
    L_0x0410:
        r0 = r16.getAnimatingAway();
        if (r0 != 0) goto L_0x045b;
    L_0x0416:
        r0 = r16.getAnimator();
        if (r0 == 0) goto L_0x041d;
    L_0x041c:
        goto L_0x045b;
    L_0x041d:
        r0 = f13159a;
        if (r0 == 0) goto L_0x0437;
    L_0x0421:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0437:
        r0 = r7.mRetaining;
        if (r0 != 0) goto L_0x0442;
    L_0x043b:
        r16.performDestroy();
        r15.m15494g(r7, r14);
        goto L_0x0444;
    L_0x0442:
        r7.mState = r14;
    L_0x0444:
        r16.performDetach();
        r15.m15498h(r7, r14);
        if (r20 != 0) goto L_0x045f;
    L_0x044c:
        r0 = r7.mRetaining;
        if (r0 != 0) goto L_0x0454;
    L_0x0450:
        r15.m15497h(r16);
        goto L_0x045f;
    L_0x0454:
        r7.mHost = r13;
        r7.mParentFragment = r13;
        r7.mFragmentManager = r13;
        goto L_0x045f;
    L_0x045b:
        r7.setStateAfterAnimating(r11);
        goto L_0x0460;
    L_0x045f:
        r8 = r11;
    L_0x0460:
        r0 = r7.mState;
        if (r0 == r8) goto L_0x0493;
    L_0x0464:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveToState: Fragment state for ";
        r1.append(r2);
        r1.append(r7);
        r2 = " not updated inline; ";
        r1.append(r2);
        r2 = "expected state ";
        r1.append(r2);
        r1.append(r8);
        r2 = " found ";
        r1.append(r2);
        r2 = r7.mState;
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.w(r0, r1);
        r7.mState = r8;
    L_0x0493:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.m.a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: a */
    private void m15411a(final Fragment fragment, C0341c c0341c, int i) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        if (c0341c.f1165a != 0) {
            Animation c0343e = new C0343e(c0341c.f1165a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            c0343e.setAnimationListener(new C0340b(this, C3112m.m15410a(c0343e)) {
                /* renamed from: c */
                final /* synthetic */ C3112m f13146c;

                /* renamed from: android.support.v4.app.m$2$1 */
                class C03361 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C31082 f1154a;

                    C03361(C31082 c31082) {
                        this.f1154a = c31082;
                    }

                    public void run() {
                        if (fragment.getAnimatingAway() != null) {
                            fragment.setAnimatingAway(null);
                            this.f1154a.f13146c.m15449a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                        }
                    }
                }

                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new C03361(this));
                }
            });
            C3112m.m15426b(view, c0341c);
            fragment.mView.startAnimation(c0343e);
            return;
        }
        i = c0341c.f1166b;
        fragment.setAnimator(c0341c.f1166b);
        i.addListener(new AnimatorListenerAdapter(this) {
            /* renamed from: d */
            final /* synthetic */ C3112m f1158d;

            public void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                animator = fragment.getAnimator();
                fragment.setAnimator(null);
                if (animator != null && viewGroup.indexOfChild(view) < null) {
                    this.f1158d.m15449a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        });
        i.setTarget(fragment.mView);
        C3112m.m15426b(fragment.mView, c0341c);
        i.start();
    }

    /* renamed from: c */
    void m15478c(Fragment fragment) {
        m15449a(fragment, this.f13177l, 0, 0, false);
    }

    /* renamed from: d */
    void m15483d(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.mView = fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            if (fragment.mView != null) {
                fragment.mInnerView = fragment.mView;
                fragment.mView.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                m15452a(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    /* renamed from: e */
    void m15488e(final Fragment fragment) {
        if (fragment.mView != null) {
            C0341c a = m15441a(fragment, fragment.getNextTransition(), fragment.mHidden ^ true, fragment.getNextTransitionStyle());
            if (a == null || a.f1166b == null) {
                if (a != null) {
                    C3112m.m15426b(fragment.mView, a);
                    fragment.mView.startAnimation(a.f1165a);
                    a.f1165a.start();
                }
                int i = (!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8;
                fragment.mView.setVisibility(i);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                a.f1166b.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = fragment.mContainer;
                    final View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    a.f1166b.addListener(new AnimatorListenerAdapter(this) {
                        /* renamed from: d */
                        final /* synthetic */ C3112m f1162d;

                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.mView != null) {
                                fragment.mView.setVisibility(8);
                            }
                        }
                    });
                }
                C3112m.m15426b(fragment.mView, a);
                a.f1166b.start();
            }
        }
        if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
            this.f13182r = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: f */
    void m15491f(Fragment fragment) {
        if (fragment != null) {
            int i = this.f13177l;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            m15449a(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment q = m15433q(fragment);
                if (q != null) {
                    View view = q.mView;
                    ViewGroup viewGroup = fragment.mContainer;
                    i = viewGroup.indexOfChild(view);
                    int indexOfChild = viewGroup.indexOfChild(fragment.mView);
                    if (indexOfChild < i) {
                        viewGroup.removeViewAt(indexOfChild);
                        viewGroup.addView(fragment.mView, i);
                    }
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    if (fragment.mPostponedAlpha > 0.0f) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    C0341c a = m15441a(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (a != null) {
                        C3112m.m15426b(fragment.mView, a);
                        if (a.f1165a != null) {
                            fragment.mView.startAnimation(a.f1165a);
                        } else {
                            a.f1166b.setTarget(fragment.mView);
                            a.f1166b.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                m15488e(fragment);
            }
        }
    }

    /* renamed from: a */
    void m15445a(int i, boolean z) {
        if (this.f13178m == null) {
            if (i != 0) {
                throw new IllegalStateException("No activity");
            }
        }
        if (z || i != this.f13177l) {
            this.f13177l = i;
            if (this.f13171f != 0) {
                int i2;
                i = this.f13170e.size();
                for (i2 = 0; i2 < i; i2++) {
                    m15491f((Fragment) this.f13170e.get(i2));
                }
                i = this.f13171f.size();
                for (i2 = 0; i2 < i; i2++) {
                    Fragment fragment = (Fragment) this.f13171f.valueAt(i2);
                    if (fragment != null && ((fragment.mRemoving || fragment.mDetached) && !fragment.mIsNewlyAdded)) {
                        m15491f(fragment);
                    }
                }
                m15501j();
                if (!(this.f13182r == 0 || this.f13178m == 0 || this.f13177l != 5)) {
                    this.f13178m.mo3748d();
                    this.f13182r = false;
                }
            }
        }
    }

    /* renamed from: j */
    void m15501j() {
        if (this.f13171f != null) {
            for (int i = 0; i < this.f13171f.size(); i++) {
                Fragment fragment = (Fragment) this.f13171f.valueAt(i);
                if (fragment != null) {
                    m15466b(fragment);
                }
            }
        }
    }

    /* renamed from: g */
    void m15493g(Fragment fragment) {
        if (fragment.mIndex < 0) {
            int i = this.f13169d;
            this.f13169d = i + 1;
            fragment.setIndex(i, this.f13180o);
            if (this.f13171f == null) {
                this.f13171f = new SparseArray();
            }
            this.f13171f.put(fragment.mIndex, fragment);
            if (f13159a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Allocated fragment index ");
                stringBuilder.append(fragment);
                Log.v("FragmentManager", stringBuilder.toString());
            }
        }
    }

    /* renamed from: h */
    void m15497h(Fragment fragment) {
        if (fragment.mIndex >= 0) {
            if (f13159a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Freeing fragment index ");
                stringBuilder.append(fragment);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            this.f13171f.put(fragment.mIndex, null);
            fragment.initState();
        }
    }

    /* renamed from: a */
    public void m15453a(Fragment fragment, boolean z) {
        if (f13159a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("add: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        m15493g(fragment);
        if (!fragment.mDetached) {
            if (this.f13170e.contains(fragment)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Fragment already added: ");
                stringBuilder2.append(fragment);
                throw new IllegalStateException(stringBuilder2.toString());
            }
            synchronized (this.f13170e) {
                this.f13170e.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f13182r = true;
            }
            if (z) {
                m15478c(fragment);
            }
        }
    }

    /* renamed from: i */
    public void m15499i(Fragment fragment) {
        if (f13159a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remove: ");
            stringBuilder.append(fragment);
            stringBuilder.append(" nesting=");
            stringBuilder.append(fragment.mBackStackNesting);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        int isInBackStack = fragment.isInBackStack() ^ 1;
        if (!fragment.mDetached || isInBackStack != 0) {
            synchronized (this.f13170e) {
                this.f13170e.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f13182r = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    /* renamed from: j */
    public void m15502j(Fragment fragment) {
        if (f13159a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hide: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    /* renamed from: k */
    public void m15503k(Fragment fragment) {
        if (f13159a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("show: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged ^= 1;
        }
    }

    /* renamed from: l */
    public void m15506l(Fragment fragment) {
        if (f13159a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("detach: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (f13159a) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("remove from detach: ");
                    stringBuilder2.append(fragment);
                    Log.v("FragmentManager", stringBuilder2.toString());
                }
                synchronized (this.f13170e) {
                    this.f13170e.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f13182r = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    /* renamed from: m */
    public void m15508m(Fragment fragment) {
        if (f13159a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("attach: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                if (this.f13170e.contains(fragment)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Fragment already added: ");
                    stringBuilder.append(fragment);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                if (f13159a) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("add from attach: ");
                    stringBuilder.append(fragment);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                synchronized (this.f13170e) {
                    this.f13170e.add(fragment);
                }
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible != null) {
                    this.f13182r = true;
                }
            }
        }
    }

    /* renamed from: a */
    public Fragment mo289a(int i) {
        int size;
        for (size = this.f13170e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f13170e.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        if (this.f13171f != null) {
            for (size = this.f13171f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f13171f.valueAt(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public Fragment mo291a(String str) {
        int size;
        Fragment fragment;
        if (str != null) {
            for (size = this.f13170e.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f13170e.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (!(this.f13171f == null || str == null)) {
            for (size = this.f13171f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f13171f.valueAt(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Fragment m15464b(String str) {
        if (!(this.f13171f == null || str == null)) {
            for (int size = this.f13171f.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f13171f.valueAt(size);
                if (fragment != null) {
                    fragment = fragment.findFragmentByWho(str);
                    if (fragment != null) {
                        return fragment;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    private void m15401C() {
        if (mo307i()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f13186v != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not perform this action inside of ");
            stringBuilder.append(this.f13186v);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: i */
    public boolean mo307i() {
        if (!this.f13183s) {
            if (!this.f13184t) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m15457a(C0345g c0345g, boolean z) {
        if (!z) {
            m15401C();
        }
        synchronized (this) {
            if (!this.f13185u) {
                if (this.f13178m != null) {
                    if (!this.f13167b) {
                        this.f13167b = new ArrayList();
                    }
                    this.f13167b.add(c0345g);
                    m15402D();
                    return;
                }
            }
            if (z) {
                return;
            }
            throw new IllegalStateException("Activity has been destroyed");
        }
    }

    /* renamed from: D */
    private void m15402D() {
        synchronized (this) {
            Object obj = null;
            Object obj2 = (this.f13163C == null || this.f13163C.isEmpty()) ? null : 1;
            if (this.f13167b != null && this.f13167b.size() == 1) {
                obj = 1;
            }
            if (!(obj2 == null && r1 == null)) {
                this.f13178m.m15391j().removeCallbacks(this.f13165E);
                this.f13178m.m15391j().post(this.f13165E);
            }
        }
    }

    /* renamed from: a */
    public int m15436a(C3106d c3106d) {
        synchronized (this) {
            int intValue;
            if (this.f13175j != null) {
                if (this.f13175j.size() > 0) {
                    intValue = ((Integer) this.f13175j.remove(this.f13175j.size() - 1)).intValue();
                    if (f13159a) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Adding back stack index ");
                        stringBuilder.append(intValue);
                        stringBuilder.append(" with ");
                        stringBuilder.append(c3106d);
                        Log.v("FragmentManager", stringBuilder.toString());
                    }
                    this.f13174i.set(intValue, c3106d);
                    return intValue;
                }
            }
            if (this.f13174i == null) {
                this.f13174i = new ArrayList();
            }
            intValue = this.f13174i.size();
            if (f13159a) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Setting back stack index ");
                stringBuilder.append(intValue);
                stringBuilder.append(" to ");
                stringBuilder.append(c3106d);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            this.f13174i.add(c3106d);
            return intValue;
        }
    }

    /* renamed from: a */
    public void m15444a(int i, C3106d c3106d) {
        synchronized (this) {
            if (this.f13174i == null) {
                this.f13174i = new ArrayList();
            }
            int size = this.f13174i.size();
            StringBuilder stringBuilder;
            if (i < size) {
                if (f13159a) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Setting back stack index ");
                    stringBuilder.append(i);
                    stringBuilder.append(" to ");
                    stringBuilder.append(c3106d);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.f13174i.set(i, c3106d);
            } else {
                while (size < i) {
                    this.f13174i.add(null);
                    if (this.f13175j == null) {
                        this.f13175j = new ArrayList();
                    }
                    if (f13159a) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Adding available back stack index ");
                        stringBuilder2.append(size);
                        Log.v("FragmentManager", stringBuilder2.toString());
                    }
                    this.f13175j.add(Integer.valueOf(size));
                    size++;
                }
                if (f13159a) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Adding back stack index ");
                    stringBuilder.append(i);
                    stringBuilder.append(" with ");
                    stringBuilder.append(c3106d);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.f13174i.add(c3106d);
            }
        }
    }

    /* renamed from: d */
    public void m15482d(int i) {
        synchronized (this) {
            this.f13174i.set(i, null);
            if (this.f13175j == null) {
                this.f13175j = new ArrayList();
            }
            if (f13159a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Freeing back stack index ");
                stringBuilder.append(i);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            this.f13175j.add(Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    private void m15429c(boolean z) {
        if (this.f13168c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f13178m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f13178m.m15391j().getLooper()) {
            if (!z) {
                m15401C();
            }
            if (!this.f13188x) {
                this.f13188x = new ArrayList();
                this.f13189y = new ArrayList();
            }
            this.f13168c = true;
            try {
                m15418a(null, null);
            } finally {
                this.f13168c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: b */
    public void m15472b(C0345g c0345g, boolean z) {
        if (!z || (this.f13178m != null && !this.f13185u)) {
            m15429c(z);
            if (c0345g.mo275a(this.f13188x, this.f13189y) != null) {
                this.f13168c = true;
                try {
                    m15427b(this.f13188x, this.f13189y);
                } finally {
                    m15403E();
                }
            }
            m15505l();
            m15406H();
        }
    }

    /* renamed from: E */
    private void m15403E() {
        this.f13168c = false;
        this.f13189y.clear();
        this.f13188x.clear();
    }

    /* renamed from: k */
    public boolean m15504k() {
        m15429c(true);
        boolean z = false;
        while (m15430c(this.f13188x, this.f13189y)) {
            this.f13168c = true;
            try {
                m15427b(this.f13188x, this.f13189y);
                m15403E();
                z = true;
            } catch (Throwable th) {
                m15403E();
                throw th;
            }
        }
        m15505l();
        m15406H();
        return z;
    }

    /* renamed from: a */
    private void m15418a(ArrayList<C3106d> arrayList, ArrayList<Boolean> arrayList2) {
        int size = this.f13163C == null ? 0 : this.f13163C.size();
        int i = 0;
        while (i < size) {
            int indexOf;
            C3111i c3111i = (C3111i) this.f13163C.get(i);
            if (!(arrayList == null || c3111i.f13152a)) {
                indexOf = arrayList.indexOf(c3111i.f13153b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    c3111i.m15400e();
                    i++;
                }
            }
            if (c3111i.m15398c() || (arrayList != null && c3111i.f13153b.m15356a((ArrayList) arrayList, 0, arrayList.size()))) {
                this.f13163C.remove(i);
                i--;
                size--;
                if (!(arrayList == null || c3111i.f13152a)) {
                    indexOf = arrayList.indexOf(c3111i.f13153b);
                    if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        c3111i.m15400e();
                    }
                }
                c3111i.m15399d();
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m15427b(ArrayList<C3106d> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                    throw new IllegalStateException("Internal error with the back stack records");
                }
                m15418a((ArrayList) arrayList, (ArrayList) arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((C3106d) arrayList.get(i)).f13137t) {
                        if (i2 != i) {
                            m15419a((ArrayList) arrayList, (ArrayList) arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C3106d) arrayList.get(i2)).f13137t) {
                                i2++;
                            }
                        }
                        m15419a((ArrayList) arrayList, (ArrayList) arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m15419a((ArrayList) arrayList, (ArrayList) arrayList2, i2, size);
                }
            }
        }
    }

    /* renamed from: a */
    private void m15419a(ArrayList<C3106d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        ArrayList<C3106d> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i;
        int i6 = i2;
        boolean z = ((C3106d) arrayList3.get(i5)).f13137t;
        if (this.f13190z == null) {
            r6.f13190z = new ArrayList();
        } else {
            r6.f13190z.clear();
        }
        r6.f13190z.addAll(r6.f13170e);
        Fragment h = mo306h();
        Object obj = null;
        for (i3 = i5; i3 < i6; i3++) {
            C3106d c3106d = (C3106d) arrayList3.get(i3);
            if (((Boolean) arrayList4.get(i3)).booleanValue()) {
                h = c3106d.m15359b(r6.f13190z, h);
            } else {
                h = c3106d.m15341a(r6.f13190z, h);
            }
            if (obj == null) {
                if (!c3106d.f13126i) {
                    obj = null;
                }
            }
            obj = 1;
        }
        r6.f13190z.clear();
        if (!z) {
            C0353r.m1273a(this, (ArrayList) arrayList, (ArrayList) arrayList2, i, i2, false);
        }
        C3112m.m15428b(arrayList, arrayList2, i, i2);
        if (z) {
            C0416b c0416b = new C0416b();
            m15425b(c0416b);
            i3 = m15407a((ArrayList) arrayList, (ArrayList) arrayList2, i, i2, c0416b);
            m15416a(c0416b);
            i4 = i3;
        } else {
            i4 = i6;
        }
        if (i4 != i5 && z) {
            C0353r.m1273a(this, (ArrayList) arrayList, (ArrayList) arrayList2, i, i4, true);
            m15445a(r6.f13177l, true);
        }
        while (i5 < i6) {
            C3106d c3106d2 = (C3106d) arrayList3.get(i5);
            if (((Boolean) arrayList4.get(i5)).booleanValue() && c3106d2.f13130m >= 0) {
                m15482d(c3106d2.f13130m);
                c3106d2.f13130m = -1;
            }
            c3106d2.m15363b();
            i5++;
        }
        if (obj != null) {
            m15507m();
        }
    }

    /* renamed from: a */
    private void m15416a(C0416b<Fragment> c0416b) {
        int size = c0416b.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) c0416b.m1527b(i);
            if (!fragment.mAdded) {
                View view = fragment.getView();
                fragment.mPostponedAlpha = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: a */
    private int m15407a(ArrayList<C3106d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0416b<Fragment> c0416b) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C3106d c3106d = (C3106d) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            Object obj = (!c3106d.m15373h() || c3106d.m15356a((ArrayList) arrayList, i4 + 1, i2)) ? null : 1;
            if (obj != null) {
                if (this.f13163C == null) {
                    this.f13163C = new ArrayList();
                }
                C0311b c3111i = new C3111i(c3106d, booleanValue);
                this.f13163C.add(c3111i);
                c3106d.m15352a(c3111i);
                if (booleanValue) {
                    c3106d.m15372g();
                } else {
                    c3106d.m15367c(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, c3106d);
                }
                m15425b((C0416b) c0416b);
            }
        }
        return i3;
    }

    /* renamed from: a */
    private void m15412a(C3106d c3106d, boolean z, boolean z2, boolean z3) {
        if (z) {
            c3106d.m15367c(z3);
        } else {
            c3106d.m15372g();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c3106d);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0353r.m1273a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            m15445a(this.f13177l, true);
        }
        if (this.f13171f) {
            z = this.f13171f.size();
            for (boolean z4 = false; z4 < z; z4++) {
                Fragment fragment = (Fragment) this.f13171f.valueAt(z4);
                if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c3106d.m15364b(fragment.mContainerId)) {
                    if (fragment.mPostponedAlpha > 0.0f) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    if (z3) {
                        fragment.mPostponedAlpha = 0.0f;
                    } else {
                        fragment.mPostponedAlpha = -1.0f;
                        fragment.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    /* renamed from: q */
    private Fragment m15433q(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (viewGroup != null) {
            if (view != null) {
                for (fragment = this.f13170e.indexOf(fragment) - 1; fragment >= null; fragment--) {
                    Fragment fragment2 = (Fragment) this.f13170e.get(fragment);
                    if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                        return fragment2;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static void m15428b(ArrayList<C3106d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C3106d c3106d = (C3106d) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                c3106d.m15351a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                c3106d.m15367c(z);
            } else {
                c3106d.m15351a(1);
                c3106d.m15372g();
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m15425b(C0416b<Fragment> c0416b) {
        if (this.f13177l >= 1) {
            int min = Math.min(this.f13177l, 4);
            int size = this.f13170e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f13170e.get(i);
                if (fragment.mState < min) {
                    m15449a(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (!(fragment.mView == null || fragment.mHidden || !fragment.mIsNewlyAdded)) {
                        c0416b.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: F */
    private void m15404F() {
        if (this.f13163C != null) {
            while (!this.f13163C.isEmpty()) {
                ((C3111i) this.f13163C.remove(0)).m15399d();
            }
        }
    }

    /* renamed from: G */
    private void m15405G() {
        int i = 0;
        int size = this.f13171f == null ? 0 : this.f13171f.size();
        while (i < size) {
            Fragment fragment = (Fragment) this.f13171f.valueAt(i);
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    m15449a(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
            i++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private boolean m15430c(java.util.ArrayList<android.support.v4.app.C3106d> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f13167b;	 Catch:{ all -> 0x003c }
        r1 = 0;
        if (r0 == 0) goto L_0x003a;
    L_0x0006:
        r0 = r4.f13167b;	 Catch:{ all -> 0x003c }
        r0 = r0.size();	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x003a;
    L_0x000f:
        r0 = r4.f13167b;	 Catch:{ all -> 0x003c }
        r0 = r0.size();	 Catch:{ all -> 0x003c }
        r2 = 0;
    L_0x0016:
        if (r1 >= r0) goto L_0x0028;
    L_0x0018:
        r3 = r4.f13167b;	 Catch:{ all -> 0x003c }
        r3 = r3.get(r1);	 Catch:{ all -> 0x003c }
        r3 = (android.support.v4.app.C3112m.C0345g) r3;	 Catch:{ all -> 0x003c }
        r3 = r3.mo275a(r5, r6);	 Catch:{ all -> 0x003c }
        r2 = r2 | r3;
        r1 = r1 + 1;
        goto L_0x0016;
    L_0x0028:
        r5 = r4.f13167b;	 Catch:{ all -> 0x003c }
        r5.clear();	 Catch:{ all -> 0x003c }
        r5 = r4.f13178m;	 Catch:{ all -> 0x003c }
        r5 = r5.m15391j();	 Catch:{ all -> 0x003c }
        r6 = r4.f13165E;	 Catch:{ all -> 0x003c }
        r5.removeCallbacks(r6);	 Catch:{ all -> 0x003c }
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        return r2;
    L_0x003a:
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        return r1;
    L_0x003c:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.m.c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: l */
    void m15505l() {
        if (this.f13187w) {
            this.f13187w = false;
            m15501j();
        }
    }

    /* renamed from: m */
    void m15507m() {
        if (this.f13176k != null) {
            for (int i = 0; i < this.f13176k.size(); i++) {
                ((C0333c) this.f13176k.get(i)).mo857a();
            }
        }
    }

    /* renamed from: b */
    void m15470b(C3106d c3106d) {
        if (this.f13172g == null) {
            this.f13172g = new ArrayList();
        }
        this.f13172g.add(c3106d);
    }

    /* renamed from: a */
    boolean m15463a(ArrayList<C3106d> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        if (this.f13172g == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            str = this.f13172g.size() - 1;
            if (str < null) {
                return false;
            }
            arrayList.add(this.f13172g.remove(str));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            int i3;
            if (str == null) {
                if (i < 0) {
                    i3 = -1;
                    if (i3 == this.f13172g.size() - 1) {
                        return false;
                    }
                    for (str = this.f13172g.size() - 1; str > i3; str--) {
                        arrayList.add(this.f13172g.remove(str));
                        arrayList2.add(Boolean.valueOf(true));
                    }
                }
            }
            i3 = this.f13172g.size() - 1;
            while (i3 >= 0) {
                C3106d c3106d = (C3106d) this.f13172g.get(i3);
                if (str == null || !str.equals(c3106d.mo284i())) {
                    if (i >= 0 && i == c3106d.f13130m) {
                        break;
                    }
                    i3--;
                } else {
                    break;
                }
            }
            if (i3 < 0) {
                return false;
            }
            if ((i2 & 1) != 0) {
                i3--;
                while (i3 >= 0) {
                    C3106d c3106d2 = (C3106d) this.f13172g.get(i3);
                    if ((str == null || !str.equals(c3106d2.mo284i())) && (i < 0 || i != c3106d2.f13130m)) {
                        break;
                    }
                    i3--;
                }
            }
            if (i3 == this.f13172g.size() - 1) {
                return false;
            }
            for (str = this.f13172g.size() - 1; str > i3; str--) {
                arrayList.add(this.f13172g.remove(str));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* renamed from: n */
    C0346n m15509n() {
        C3112m.m15415a(this.f13164D);
        return this.f13164D;
    }

    /* renamed from: a */
    private static void m15415a(C0346n c0346n) {
        if (c0346n != null) {
            List<Fragment> a = c0346n.m1239a();
            if (a != null) {
                for (Fragment fragment : a) {
                    fragment.mRetaining = true;
                }
            }
            C0346n<C0346n> b = c0346n.m1240b();
            if (b != null) {
                for (C0346n a2 : b) {
                    C3112m.m15415a(a2);
                }
            }
        }
    }

    /* renamed from: o */
    void m15512o() {
        List list;
        List list2;
        List list3;
        if (this.f13171f != null) {
            list = null;
            list2 = list;
            list3 = list2;
            for (int i = 0; i < this.f13171f.size(); i++) {
                Fragment fragment = (Fragment) this.f13171f.valueAt(i);
                if (fragment != null) {
                    Object obj;
                    if (fragment.mRetainInstance) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(fragment);
                        fragment.mTargetIndex = fragment.mTarget != null ? fragment.mTarget.mIndex : -1;
                        if (f13159a) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("retainNonConfig: keeping retained ");
                            stringBuilder.append(fragment);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                    }
                    if (fragment.mChildFragmentManager != null) {
                        fragment.mChildFragmentManager.m15512o();
                        obj = fragment.mChildFragmentManager.f13164D;
                    } else {
                        obj = fragment.mChildNonConfig;
                    }
                    if (list2 == null && obj != null) {
                        list2 = new ArrayList(this.f13171f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            list2.add(null);
                        }
                    }
                    if (list2 != null) {
                        list2.add(obj);
                    }
                    if (list3 == null && fragment.mViewModelStore != null) {
                        list3 = new ArrayList(this.f13171f.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            list3.add(null);
                        }
                    }
                    if (list3 != null) {
                        list3.add(fragment.mViewModelStore);
                    }
                }
            }
        } else {
            list = null;
            list2 = list;
            list3 = list2;
        }
        if (list == null && list2 == null && list3 == null) {
            this.f13164D = null;
        } else {
            this.f13164D = new C0346n(list, list2, list3);
        }
    }

    /* renamed from: n */
    void m15510n(Fragment fragment) {
        if (fragment.mInnerView != null) {
            if (this.f13162B == null) {
                this.f13162B = new SparseArray();
            } else {
                this.f13162B.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.f13162B);
            if (this.f13162B.size() > 0) {
                fragment.mSavedViewState = this.f13162B;
                this.f13162B = null;
            }
        }
    }

    /* renamed from: o */
    Bundle m15511o(Fragment fragment) {
        Bundle bundle;
        if (this.f13161A == null) {
            this.f13161A = new Bundle();
        }
        fragment.performSaveInstanceState(this.f13161A);
        m15484d(fragment, this.f13161A, false);
        if (this.f13161A.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f13161A;
            this.f13161A = null;
        }
        if (fragment.mView != null) {
            m15510n(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: p */
    Parcelable m15513p() {
        m15404F();
        m15405G();
        m15504k();
        this.f13183s = true;
        BackStackState[] backStackStateArr = null;
        this.f13164D = null;
        if (this.f13171f != null) {
            if (this.f13171f.size() > 0) {
                int i;
                int size = this.f13171f.size();
                FragmentState[] fragmentStateArr = new FragmentState[size];
                Object obj = null;
                for (i = 0; i < size; i++) {
                    Fragment fragment = (Fragment) this.f13171f.valueAt(i);
                    if (fragment != null) {
                        StringBuilder stringBuilder;
                        if (fragment.mIndex < 0) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Failure saving state: active ");
                            stringBuilder2.append(fragment);
                            stringBuilder2.append(" has cleared index: ");
                            stringBuilder2.append(fragment.mIndex);
                            m15417a(new IllegalStateException(stringBuilder2.toString()));
                        }
                        FragmentState fragmentState = new FragmentState(fragment);
                        fragmentStateArr[i] = fragmentState;
                        if (fragment.mState <= 0 || fragmentState.f1105k != null) {
                            fragmentState.f1105k = fragment.mSavedFragmentState;
                        } else {
                            fragmentState.f1105k = m15511o(fragment);
                            if (fragment.mTarget != null) {
                                if (fragment.mTarget.mIndex < 0) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Failure saving state: ");
                                    stringBuilder.append(fragment);
                                    stringBuilder.append(" has target not in fragment manager: ");
                                    stringBuilder.append(fragment.mTarget);
                                    m15417a(new IllegalStateException(stringBuilder.toString()));
                                }
                                if (fragmentState.f1105k == null) {
                                    fragmentState.f1105k = new Bundle();
                                }
                                mo294a(fragmentState.f1105k, "android:target_state", fragment.mTarget);
                                if (fragment.mTargetRequestCode != 0) {
                                    fragmentState.f1105k.putInt("android:target_req_state", fragment.mTargetRequestCode);
                                }
                            }
                        }
                        if (f13159a) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Saved state of ");
                            stringBuilder.append(fragment);
                            stringBuilder.append(": ");
                            stringBuilder.append(fragmentState.f1105k);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                        obj = 1;
                    }
                }
                if (obj == null) {
                    if (f13159a) {
                        Log.v("FragmentManager", "saveAllState: no fragments!");
                    }
                    return null;
                }
                int[] iArr;
                int size2 = this.f13170e.size();
                if (size2 > 0) {
                    iArr = new int[size2];
                    for (i = 0; i < size2; i++) {
                        StringBuilder stringBuilder3;
                        iArr[i] = ((Fragment) this.f13170e.get(i)).mIndex;
                        if (iArr[i] < 0) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Failure saving state: active ");
                            stringBuilder3.append(this.f13170e.get(i));
                            stringBuilder3.append(" has cleared index: ");
                            stringBuilder3.append(iArr[i]);
                            m15417a(new IllegalStateException(stringBuilder3.toString()));
                        }
                        if (f13159a) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("saveAllState: adding fragment #");
                            stringBuilder3.append(i);
                            stringBuilder3.append(": ");
                            stringBuilder3.append(this.f13170e.get(i));
                            Log.v("FragmentManager", stringBuilder3.toString());
                        }
                    }
                } else {
                    iArr = null;
                }
                if (this.f13172g != null) {
                    size2 = this.f13172g.size();
                    if (size2 > 0) {
                        backStackStateArr = new BackStackState[size2];
                        for (int i2 = 0; i2 < size2; i2++) {
                            backStackStateArr[i2] = new BackStackState((C3106d) this.f13172g.get(i2));
                            if (f13159a) {
                                StringBuilder stringBuilder4 = new StringBuilder();
                                stringBuilder4.append("saveAllState: adding back stack #");
                                stringBuilder4.append(i2);
                                stringBuilder4.append(": ");
                                stringBuilder4.append(this.f13172g.get(i2));
                                Log.v("FragmentManager", stringBuilder4.toString());
                            }
                        }
                    }
                }
                Parcelable fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f1090a = fragmentStateArr;
                fragmentManagerState.f1091b = iArr;
                fragmentManagerState.f1092c = backStackStateArr;
                if (this.f13181p != null) {
                    fragmentManagerState.f1093d = this.f13181p.mIndex;
                }
                fragmentManagerState.f1094e = this.f13169d;
                m15512o();
                return fragmentManagerState;
            }
        }
        return null;
    }

    /* renamed from: a */
    void m15448a(Parcelable parcelable, C0346n c0346n) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f1090a != null) {
                List b;
                List c;
                if (c0346n != null) {
                    List a = c0346n.m1239a();
                    b = c0346n.m1240b();
                    c = c0346n.m1241c();
                    int size = a != null ? a.size() : 0;
                    for (int i = 0; i < size; i++) {
                        Fragment fragment = (Fragment) a.get(i);
                        if (f13159a) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("restoreAllState: re-attaching retained ");
                            stringBuilder.append(fragment);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                        int i2 = 0;
                        while (i2 < fragmentManagerState.f1090a.length && fragmentManagerState.f1090a[i2].f1096b != fragment.mIndex) {
                            i2++;
                        }
                        if (i2 == fragmentManagerState.f1090a.length) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Could not find active fragment with index ");
                            stringBuilder2.append(fragment.mIndex);
                            m15417a(new IllegalStateException(stringBuilder2.toString()));
                        }
                        FragmentState fragmentState = fragmentManagerState.f1090a[i2];
                        fragmentState.f1106l = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        fragment.mTarget = null;
                        if (fragmentState.f1105k != null) {
                            fragmentState.f1105k.setClassLoader(this.f13178m.m15390i().getClassLoader());
                            fragment.mSavedViewState = fragmentState.f1105k.getSparseParcelableArray("android:view_state");
                            fragment.mSavedFragmentState = fragmentState.f1105k;
                        }
                    }
                } else {
                    b = null;
                    c = b;
                }
                this.f13171f = new SparseArray(fragmentManagerState.f1090a.length);
                int i3 = 0;
                while (i3 < fragmentManagerState.f1090a.length) {
                    FragmentState fragmentState2 = fragmentManagerState.f1090a[i3];
                    if (fragmentState2 != null) {
                        C0346n c0346n2 = (b == null || i3 >= b.size()) ? null : (C0346n) b.get(i3);
                        C0038s c0038s = (c == null || i3 >= c.size()) ? null : (C0038s) c.get(i3);
                        Fragment a2 = fragmentState2.m1131a(this.f13178m, this.f13179n, this.f13180o, c0346n2, c0038s);
                        if (f13159a) {
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("restoreAllState: active #");
                            stringBuilder3.append(i3);
                            stringBuilder3.append(": ");
                            stringBuilder3.append(a2);
                            Log.v("FragmentManager", stringBuilder3.toString());
                        }
                        this.f13171f.put(a2.mIndex, a2);
                        fragmentState2.f1106l = null;
                    }
                    i3++;
                }
                if (c0346n != null) {
                    c0346n = c0346n.m1239a();
                    i3 = c0346n != null ? c0346n.size() : 0;
                    for (int i4 = 0; i4 < i3; i4++) {
                        Fragment fragment2 = (Fragment) c0346n.get(i4);
                        if (fragment2.mTargetIndex >= 0) {
                            fragment2.mTarget = (Fragment) this.f13171f.get(fragment2.mTargetIndex);
                            if (fragment2.mTarget == null) {
                                StringBuilder stringBuilder4 = new StringBuilder();
                                stringBuilder4.append("Re-attaching retained fragment ");
                                stringBuilder4.append(fragment2);
                                stringBuilder4.append(" target no longer exists: ");
                                stringBuilder4.append(fragment2.mTargetIndex);
                                Log.w("FragmentManager", stringBuilder4.toString());
                            }
                        }
                    }
                }
                this.f13170e.clear();
                if (fragmentManagerState.f1091b != null) {
                    for (c0346n = null; c0346n < fragmentManagerState.f1091b.length; c0346n++) {
                        StringBuilder stringBuilder5;
                        Fragment fragment3 = (Fragment) this.f13171f.get(fragmentManagerState.f1091b[c0346n]);
                        if (fragment3 == null) {
                            stringBuilder5 = new StringBuilder();
                            stringBuilder5.append("No instantiated fragment for index #");
                            stringBuilder5.append(fragmentManagerState.f1091b[c0346n]);
                            m15417a(new IllegalStateException(stringBuilder5.toString()));
                        }
                        fragment3.mAdded = true;
                        if (f13159a) {
                            stringBuilder5 = new StringBuilder();
                            stringBuilder5.append("restoreAllState: added #");
                            stringBuilder5.append(c0346n);
                            stringBuilder5.append(": ");
                            stringBuilder5.append(fragment3);
                            Log.v("FragmentManager", stringBuilder5.toString());
                        }
                        if (this.f13170e.contains(fragment3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.f13170e) {
                            this.f13170e.add(fragment3);
                        }
                    }
                }
                if (fragmentManagerState.f1092c != null) {
                    this.f13172g = new ArrayList(fragmentManagerState.f1092c.length);
                    for (c0346n = null; c0346n < fragmentManagerState.f1092c.length; c0346n++) {
                        C3106d a3 = fragmentManagerState.f1092c[c0346n].m1106a(this);
                        if (f13159a) {
                            StringBuilder stringBuilder6 = new StringBuilder();
                            stringBuilder6.append("restoreAllState: back stack #");
                            stringBuilder6.append(c0346n);
                            stringBuilder6.append(" (index ");
                            stringBuilder6.append(a3.f13130m);
                            stringBuilder6.append("): ");
                            stringBuilder6.append(a3);
                            Log.v("FragmentManager", stringBuilder6.toString());
                            PrintWriter printWriter = new PrintWriter(new C0419e("FragmentManager"));
                            a3.m15355a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f13172g.add(a3);
                        if (a3.f13130m >= 0) {
                            m15444a(a3.f13130m, a3);
                        }
                    }
                } else {
                    this.f13172g = null;
                }
                if (fragmentManagerState.f1093d >= null) {
                    this.f13181p = (Fragment) this.f13171f.get(fragmentManagerState.f1093d);
                }
                this.f13169d = fragmentManagerState.f1094e;
            }
        }
    }

    /* renamed from: H */
    private void m15406H() {
        if (this.f13171f != null) {
            for (int size = this.f13171f.size() - 1; size >= 0; size--) {
                if (this.f13171f.valueAt(size) == null) {
                    this.f13171f.delete(this.f13171f.keyAt(size));
                }
            }
        }
    }

    /* renamed from: a */
    public void m15454a(C3107k c3107k, C0329i c0329i, Fragment fragment) {
        if (this.f13178m == null) {
            this.f13178m = c3107k;
            this.f13179n = c0329i;
            this.f13180o = fragment;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: q */
    public void m15515q() {
        this.f13164D = null;
        int i = 0;
        this.f13183s = false;
        this.f13184t = false;
        int size = this.f13170e.size();
        while (i < size) {
            Fragment fragment = (Fragment) this.f13170e.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
            i++;
        }
    }

    /* renamed from: r */
    public void m15516r() {
        this.f13183s = false;
        this.f13184t = false;
        m15432f(1);
    }

    /* renamed from: s */
    public void m15517s() {
        this.f13183s = false;
        this.f13184t = false;
        m15432f(2);
    }

    /* renamed from: t */
    public void m15518t() {
        this.f13183s = false;
        this.f13184t = false;
        m15432f(4);
    }

    /* renamed from: u */
    public void m15519u() {
        this.f13183s = false;
        this.f13184t = false;
        m15432f(5);
    }

    /* renamed from: v */
    public void m15520v() {
        m15432f(4);
    }

    /* renamed from: w */
    public void m15521w() {
        this.f13184t = true;
        m15432f(3);
    }

    /* renamed from: x */
    public void m15522x() {
        m15432f(2);
    }

    /* renamed from: y */
    public void m15523y() {
        m15432f(1);
    }

    /* renamed from: z */
    public void m15524z() {
        this.f13185u = true;
        m15504k();
        m15432f(0);
        this.f13178m = null;
        this.f13179n = null;
        this.f13180o = null;
    }

    /* renamed from: f */
    private void m15432f(int i) {
        try {
            this.f13168c = true;
            m15445a(i, false);
            m15504k();
        } finally {
            this.f13168c = false;
        }
    }

    /* renamed from: a */
    public void m15459a(boolean z) {
        for (int size = this.f13170e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f13170e.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: b */
    public void m15474b(boolean z) {
        for (int size = this.f13170e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f13170e.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: a */
    public void m15446a(Configuration configuration) {
        for (int i = 0; i < this.f13170e.size(); i++) {
            Fragment fragment = (Fragment) this.f13170e.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: A */
    public void m15434A() {
        for (int i = 0; i < this.f13170e.size(); i++) {
            Fragment fragment = (Fragment) this.f13170e.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* renamed from: a */
    public boolean m15461a(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.f13177l < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.f13170e.size(); i2++) {
            Fragment fragment = (Fragment) this.f13170e.get(i2);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f13173h != null) {
            while (i < this.f13173h.size()) {
                Fragment fragment2 = (Fragment) this.f13173h.get(i);
                if (arrayList == null || arrayList.contains(fragment2) == null) {
                    fragment2.onDestroyOptionsMenu();
                }
                i++;
            }
        }
        this.f13173h = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean m15460a(Menu menu) {
        int i = 0;
        if (this.f13177l < 1) {
            return false;
        }
        boolean z = false;
        while (i < this.f13170e.size()) {
            Fragment fragment = (Fragment) this.f13170e.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
            i++;
        }
        return z;
    }

    /* renamed from: a */
    public boolean m15462a(MenuItem menuItem) {
        if (this.f13177l < 1) {
            return false;
        }
        for (int i = 0; i < this.f13170e.size(); i++) {
            Fragment fragment = (Fragment) this.f13170e.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m15476b(MenuItem menuItem) {
        if (this.f13177l < 1) {
            return false;
        }
        for (int i = 0; i < this.f13170e.size(); i++) {
            Fragment fragment = (Fragment) this.f13170e.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m15473b(Menu menu) {
        if (this.f13177l >= 1) {
            for (int i = 0; i < this.f13170e.size(); i++) {
                Fragment fragment = (Fragment) this.f13170e.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: p */
    public void m15514p(Fragment fragment) {
        if (fragment != null) {
            if (this.f13171f.get(fragment.mIndex) == fragment) {
                if (fragment.mHost != null) {
                    if (fragment.getFragmentManager() == this) {
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(fragment);
            stringBuilder.append(" is not an active fragment of FragmentManager ");
            stringBuilder.append(this);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f13181p = fragment;
    }

    /* renamed from: h */
    public Fragment mo306h() {
        return this.f13181p;
    }

    /* renamed from: a */
    public void mo295a(C0332b c0332b, boolean z) {
        this.f13166J.add(new C0429j(c0332b, Boolean.valueOf(z)));
    }

    /* renamed from: a */
    void m15450a(Fragment fragment, Context context, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15450a(fragment, context, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).m1204a((C0334l) this, fragment, context);
            }
        }
    }

    /* renamed from: b */
    void m15467b(Fragment fragment, Context context, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15467b(fragment, context, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).m1208b((C0334l) this, fragment, context);
            }
        }
    }

    /* renamed from: a */
    void m15451a(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15451a(fragment, bundle, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).m1209b((C0334l) this, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    void m15468b(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15468b(fragment, bundle, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).mo13a((C0334l) this, fragment, bundle);
            }
        }
    }

    /* renamed from: c */
    void m15479c(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15479c(fragment, bundle, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).m1211c(this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    void m15452a(Fragment fragment, View view, Bundle bundle, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15452a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).m1206a(this, fragment, view, bundle);
            }
        }
    }

    /* renamed from: b */
    void m15469b(Fragment fragment, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15469b(fragment, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).mo12a(this, fragment);
            }
        }
    }

    /* renamed from: c */
    void m15480c(Fragment fragment, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15480c(fragment, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).mo14b(this, fragment);
            }
        }
    }

    /* renamed from: d */
    void m15485d(Fragment fragment, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15485d(fragment, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).m1210c(this, fragment);
            }
        }
    }

    /* renamed from: e */
    void m15489e(Fragment fragment, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15489e(fragment, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).m1212d(this, fragment);
            }
        }
    }

    /* renamed from: d */
    void m15484d(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15484d(fragment, bundle, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).m1213d(this, fragment, bundle);
            }
        }
    }

    /* renamed from: f */
    void m15492f(Fragment fragment, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15492f(fragment, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).m1214e(this, fragment);
            }
        }
    }

    /* renamed from: g */
    void m15494g(Fragment fragment, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15494g(fragment, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).m1215f(this, fragment);
            }
        }
    }

    /* renamed from: h */
    void m15498h(Fragment fragment, boolean z) {
        if (this.f13180o != null) {
            C0334l fragmentManager = this.f13180o.getFragmentManager();
            if (fragmentManager instanceof C3112m) {
                ((C3112m) fragmentManager).m15498h(fragment, true);
            }
        }
        Iterator it = this.f13166J.iterator();
        while (it.hasNext()) {
            C0429j c0429j = (C0429j) it.next();
            if (!z || ((Boolean) c0429j.f1443b).booleanValue()) {
                ((C0332b) c0429j.f1442a).m1216g(this, fragment);
            }
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C3112m c3112m = this;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C0344f.f1172a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.isSupportFragmentClass(c3112m.f13178m.m15390i(), str3)) {
            return null;
        }
        Fragment fragment;
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1) {
            if (string == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(attributeSet.getPositionDescription());
                stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                stringBuilder.append(str3);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        Fragment a = resourceId != -1 ? mo289a(resourceId) : null;
        if (a == null && string != null) {
            a = mo291a(string);
        }
        if (a == null && i != -1) {
            a = mo289a(i);
        }
        if (f13159a) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("onCreateView: id=0x");
            stringBuilder2.append(Integer.toHexString(resourceId));
            stringBuilder2.append(" fname=");
            stringBuilder2.append(str3);
            stringBuilder2.append(" existing=");
            stringBuilder2.append(a);
            Log.v("FragmentManager", stringBuilder2.toString());
        }
        if (a == null) {
            Fragment a2 = c3112m.f13179n.mo258a(context2, str3, null);
            a2.mFromLayout = true;
            a2.mFragmentId = resourceId != 0 ? resourceId : i;
            a2.mContainerId = i;
            a2.mTag = string;
            a2.mInLayout = true;
            a2.mFragmentManager = c3112m;
            a2.mHost = c3112m.f13178m;
            a2.onInflate(c3112m.f13178m.m15390i(), attributeSet2, a2.mSavedFragmentState);
            m15453a(a2, true);
            fragment = a2;
        } else if (a.mInLayout) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(attributeSet.getPositionDescription());
            stringBuilder.append(": Duplicate id 0x");
            stringBuilder.append(Integer.toHexString(resourceId));
            stringBuilder.append(", tag ");
            stringBuilder.append(string);
            stringBuilder.append(", or parent id 0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(" with another fragment for ");
            stringBuilder.append(str3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            a.mInLayout = true;
            a.mHost = c3112m.f13178m;
            if (!a.mRetaining) {
                a.onInflate(c3112m.f13178m.m15390i(), attributeSet2, a.mSavedFragmentState);
            }
            fragment = a;
        }
        if (c3112m.f13177l >= 1 || !fragment.mFromLayout) {
            m15478c(fragment);
        } else {
            m15449a(fragment, 1, 0, 0, false);
        }
        if (fragment.mView != null) {
            if (resourceId != 0) {
                fragment.mView.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            return fragment.mView;
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Fragment ");
        stringBuilder3.append(str3);
        stringBuilder3.append(" did not create a view.");
        throw new IllegalStateException(stringBuilder3.toString());
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
