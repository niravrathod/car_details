package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v4.content.p014a.C0388c;
import android.support.v4.p017f.C0420f;
import android.support.v4.p017f.C3131a;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParser;

public abstract class Transition implements Cloneable {
    /* renamed from: g */
    private static final int[] f927g = new int[]{2, 1, 3, 4};
    /* renamed from: h */
    private static final PathMotion f928h = new C30801();
    /* renamed from: z */
    private static ThreadLocal<C3131a<Animator, C0260a>> f929z = new ThreadLocal();
    /* renamed from: A */
    private ViewGroup f930A = null;
    /* renamed from: B */
    private ArrayList<Animator> f931B = new ArrayList();
    /* renamed from: C */
    private int f932C = 0;
    /* renamed from: D */
    private boolean f933D = false;
    /* renamed from: E */
    private boolean f934E = false;
    /* renamed from: F */
    private ArrayList<C0262c> f935F = null;
    /* renamed from: G */
    private ArrayList<Animator> f936G = new ArrayList();
    /* renamed from: H */
    private C0261b f937H;
    /* renamed from: I */
    private C3131a<String, String> f938I;
    /* renamed from: J */
    private PathMotion f939J = f928h;
    /* renamed from: a */
    long f940a = -1;
    /* renamed from: b */
    ArrayList<Integer> f941b = new ArrayList();
    /* renamed from: c */
    ArrayList<View> f942c = new ArrayList();
    /* renamed from: d */
    TransitionSet f943d = null;
    /* renamed from: e */
    boolean f944e = false;
    /* renamed from: f */
    af f945f;
    /* renamed from: i */
    private String f946i = getClass().getName();
    /* renamed from: j */
    private long f947j = -1;
    /* renamed from: k */
    private TimeInterpolator f948k = null;
    /* renamed from: l */
    private ArrayList<String> f949l = null;
    /* renamed from: m */
    private ArrayList<Class> f950m = null;
    /* renamed from: n */
    private ArrayList<Integer> f951n = null;
    /* renamed from: o */
    private ArrayList<View> f952o = null;
    /* renamed from: p */
    private ArrayList<Class> f953p = null;
    /* renamed from: q */
    private ArrayList<String> f954q = null;
    /* renamed from: r */
    private ArrayList<Integer> f955r = null;
    /* renamed from: s */
    private ArrayList<View> f956s = null;
    /* renamed from: t */
    private ArrayList<Class> f957t = null;
    /* renamed from: u */
    private ai f958u = new ai();
    /* renamed from: v */
    private ai f959v = new ai();
    /* renamed from: w */
    private int[] f960w = f927g;
    /* renamed from: x */
    private ArrayList<ah> f961x;
    /* renamed from: y */
    private ArrayList<ah> f962y;

    /* renamed from: android.support.transition.Transition$3 */
    class C02593 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ Transition f921a;

        C02593(Transition transition) {
            this.f921a = transition;
        }

        public void onAnimationEnd(Animator animator) {
            this.f921a.m960k();
            animator.removeListener(this);
        }
    }

    /* renamed from: android.support.transition.Transition$a */
    private static class C0260a {
        /* renamed from: a */
        View f922a;
        /* renamed from: b */
        String f923b;
        /* renamed from: c */
        ah f924c;
        /* renamed from: d */
        be f925d;
        /* renamed from: e */
        Transition f926e;

        C0260a(View view, String str, Transition transition, be beVar, ah ahVar) {
            this.f922a = view;
            this.f923b = str;
            this.f924c = ahVar;
            this.f925d = beVar;
            this.f926e = transition;
        }
    }

    /* renamed from: android.support.transition.Transition$b */
    public static abstract class C0261b {
        /* renamed from: a */
        public abstract Rect mo174a(Transition transition);
    }

    /* renamed from: android.support.transition.Transition$c */
    public interface C0262c {
        /* renamed from: a */
        void mo175a(Transition transition);

        /* renamed from: b */
        void mo176b(Transition transition);

        /* renamed from: c */
        void mo177c(Transition transition);

        /* renamed from: d */
        void mo178d(Transition transition);
    }

    /* renamed from: android.support.transition.Transition$1 */
    static class C30801 extends PathMotion {
        C30801() {
        }

        /* renamed from: a */
        public Path mo172a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: a */
    private static boolean mo200a(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: a */
    public Animator mo97a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo98a(ah ahVar);

    /* renamed from: a */
    public String[] mo173a() {
        return null;
    }

    /* renamed from: b */
    public abstract void mo99b(ah ahVar);

    public /* synthetic */ Object clone() {
        return mo214n();
    }

    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f977c);
        XmlPullParser xmlPullParser = (XmlResourceParser) attributeSet;
        long a = (long) C0388c.m1421a(obtainStyledAttributes, xmlPullParser, "duration", 1, -1);
        if (a >= 0) {
            mo197a(a);
        }
        long a2 = (long) C0388c.m1421a(obtainStyledAttributes, xmlPullParser, "startDelay", 2, -1);
        if (a2 > 0) {
            mo205b(a2);
        }
        int c = C0388c.m1428c(obtainStyledAttributes, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            mo198a(AnimationUtils.loadInterpolator(context, c));
        }
        String a3 = C0388c.m1423a(obtainStyledAttributes, xmlPullParser, "matchOrder", 3);
        if (a3 != null) {
            m937a(m921b(a3));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private static int[] m921b(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        str = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (FacebookAdapter.KEY_ID.equalsIgnoreCase(trim)) {
                str[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                str[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                str[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                str[i] = 4;
            } else if (trim.isEmpty()) {
                trim = new int[(str.length - 1)];
                System.arraycopy(str, 0, trim, 0, i);
                i--;
                str = trim;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown match type in matchOrder: '");
                stringBuilder.append(trim);
                stringBuilder.append("'");
                throw new InflateException(stringBuilder.toString());
            }
            i++;
        }
        return str;
    }

    /* renamed from: a */
    public Transition mo197a(long j) {
        this.f940a = j;
        return this;
    }

    /* renamed from: b */
    public long m940b() {
        return this.f940a;
    }

    /* renamed from: b */
    public Transition mo205b(long j) {
        this.f947j = j;
        return this;
    }

    /* renamed from: c */
    public long m947c() {
        return this.f947j;
    }

    /* renamed from: a */
    public Transition mo198a(TimeInterpolator timeInterpolator) {
        this.f948k = timeInterpolator;
        return this;
    }

    /* renamed from: d */
    public TimeInterpolator m950d() {
        return this.f948k;
    }

    /* renamed from: a */
    public void m937a(int... iArr) {
        if (iArr != null) {
            if (iArr.length != 0) {
                int i = 0;
                while (i < iArr.length) {
                    if (!mo200a(iArr[i])) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    } else if (m919a(iArr, i)) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    } else {
                        i++;
                    }
                }
                this.f960w = (int[]) iArr.clone();
                return;
            }
        }
        this.f960w = f927g;
    }

    /* renamed from: a */
    private static boolean m919a(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return 1;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m913a(C3131a<View, ah> c3131a, C3131a<View, ah> c3131a2) {
        for (int size = c3131a.size() - 1; size >= 0; size--) {
            View view = (View) c3131a.m1585b(size);
            if (view != null && m946b(view)) {
                ah ahVar = (ah) c3131a2.remove(view);
                if (!(ahVar == null || ahVar.f995b == null || !m946b(ahVar.f995b))) {
                    this.f961x.add((ah) c3131a.mo3896d(size));
                    this.f962y.add(ahVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m915a(C3131a<View, ah> c3131a, C3131a<View, ah> c3131a2, C0420f<View> c0420f, C0420f<View> c0420f2) {
        int b = c0420f.m1542b();
        for (int i = 0; i < b; i++) {
            View view = (View) c0420f.m1547c(i);
            if (view != null && m946b(view)) {
                View view2 = (View) c0420f2.m1539a(c0420f.m1543b(i));
                if (view2 != null && m946b(view2)) {
                    ah ahVar = (ah) c3131a.get(view);
                    ah ahVar2 = (ah) c3131a2.get(view2);
                    if (!(ahVar == null || ahVar2 == null)) {
                        this.f961x.add(ahVar);
                        this.f962y.add(ahVar2);
                        c3131a.remove(view);
                        c3131a2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m916a(C3131a<View, ah> c3131a, C3131a<View, ah> c3131a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = (View) sparseArray.valueAt(i);
            if (view != null && m946b(view)) {
                View view2 = (View) sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && m946b(view2)) {
                    ah ahVar = (ah) c3131a.get(view);
                    ah ahVar2 = (ah) c3131a2.get(view2);
                    if (!(ahVar == null || ahVar2 == null)) {
                        this.f961x.add(ahVar);
                        this.f962y.add(ahVar2);
                        c3131a.remove(view);
                        c3131a2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m914a(C3131a<View, ah> c3131a, C3131a<View, ah> c3131a2, C3131a<String, View> c3131a3, C3131a<String, View> c3131a4) {
        int size = c3131a3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) c3131a3.m1586c(i);
            if (view != null && m946b(view)) {
                View view2 = (View) c3131a4.get(c3131a3.m1585b(i));
                if (view2 != null && m946b(view2)) {
                    ah ahVar = (ah) c3131a.get(view);
                    ah ahVar2 = (ah) c3131a2.get(view2);
                    if (!(ahVar == null || ahVar2 == null)) {
                        this.f961x.add(ahVar);
                        this.f962y.add(ahVar2);
                        c3131a.remove(view);
                        c3131a2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m920b(C3131a<View, ah> c3131a, C3131a<View, ah> c3131a2) {
        for (int i = 0; i < c3131a.size(); i++) {
            ah ahVar = (ah) c3131a.m1586c(i);
            if (m946b(ahVar.f995b)) {
                this.f961x.add(ahVar);
                this.f962y.add(null);
            }
        }
        for (int i2 = 0; i2 < c3131a2.size(); i2++) {
            ah ahVar2 = (ah) c3131a2.m1586c(i2);
            if (m946b(ahVar2.f995b)) {
                this.f962y.add(ahVar2);
                this.f961x.add(null);
            }
        }
    }

    /* renamed from: a */
    private void m911a(ai aiVar, ai aiVar2) {
        C3131a c3131a = new C3131a(aiVar.f997a);
        C3131a c3131a2 = new C3131a(aiVar2.f997a);
        for (int i : this.f960w) {
            switch (i) {
                case 1:
                    m913a(c3131a, c3131a2);
                    break;
                case 2:
                    m914a(c3131a, c3131a2, aiVar.f1000d, aiVar2.f1000d);
                    break;
                case 3:
                    m916a(c3131a, c3131a2, aiVar.f998b, aiVar2.f998b);
                    break;
                case 4:
                    m915a(c3131a, c3131a2, aiVar.f999c, aiVar2.f999c);
                    break;
                default:
                    break;
            }
        }
        m920b(c3131a, c3131a2);
    }

    /* renamed from: a */
    protected void mo204a(ViewGroup viewGroup, ai aiVar, ai aiVar2, ArrayList<ah> arrayList, ArrayList<ah> arrayList2) {
        Transition transition = this;
        ViewGroup viewGroup2 = viewGroup;
        C3131a p = mo215p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i = 0;
        while (i < size) {
            int i2;
            int i3;
            ah ahVar = (ah) arrayList.get(i);
            ah ahVar2 = (ah) arrayList2.get(i);
            if (!(ahVar == null || ahVar.f996c.contains(transition))) {
                ahVar = null;
            }
            if (!(ahVar2 == null || ahVar2.f996c.contains(transition))) {
                ahVar2 = null;
            }
            if (!(ahVar == null && ahVar2 == null)) {
                Object obj;
                Animator a;
                View view;
                String[] a2;
                ah ahVar3;
                Animator animator;
                ah ahVar4;
                Object obj2;
                long a3;
                long j2;
                if (!(ahVar == null || ahVar2 == null)) {
                    if (!mo218a(ahVar, ahVar2)) {
                        obj = null;
                        if (obj != null) {
                            a = mo97a(viewGroup2, ahVar, ahVar2);
                            if (a != null) {
                                if (ahVar2 == null) {
                                    view = ahVar2.f995b;
                                    a2 = mo173a();
                                    if (view != null || a2 == null || a2.length <= 0) {
                                        i2 = size;
                                        i3 = i;
                                        a = a;
                                        ahVar3 = null;
                                    } else {
                                        ahVar3 = new ah();
                                        ahVar3.f995b = view;
                                        animator = a;
                                        i2 = size;
                                        ahVar4 = (ah) aiVar2.f997a.get(view);
                                        if (ahVar4 != null) {
                                            size = 0;
                                            while (size < a2.length) {
                                                i3 = i;
                                                ah ahVar5 = ahVar4;
                                                ahVar3.f994a.put(a2[size], ahVar4.f994a.get(a2[size]));
                                                size++;
                                                i = i3;
                                                ahVar4 = ahVar5;
                                                ArrayList<ah> arrayList3 = arrayList2;
                                            }
                                        }
                                        i3 = i;
                                        int size2 = p.size();
                                        for (int i4 = 0; i4 < size2; i4++) {
                                            C0260a c0260a = (C0260a) p.get((Animator) p.m1585b(i4));
                                            if (c0260a.f924c != null && c0260a.f922a == view && c0260a.f923b.equals(m964o()) && c0260a.f924c.equals(ahVar3)) {
                                                a = null;
                                                break;
                                            }
                                        }
                                        a = animator;
                                    }
                                    obj2 = a;
                                    ahVar4 = ahVar3;
                                } else {
                                    animator = a;
                                    i2 = size;
                                    i3 = i;
                                    view = ahVar.f995b;
                                    obj2 = animator;
                                    ahVar4 = null;
                                }
                                if (obj2 == null) {
                                    if (transition.f945f != null) {
                                        a3 = transition.f945f.mo3736a(viewGroup2, transition, ahVar, ahVar2);
                                        sparseIntArray.put(transition.f936G.size(), (int) a3);
                                        j = Math.min(a3, j);
                                    }
                                    j2 = j;
                                    p.put(obj2, new C0260a(view, m964o(), this, au.m1007b(viewGroup), ahVar4));
                                    transition.f936G.add(obj2);
                                    j = j2;
                                }
                                i = i3 + 1;
                                size = i2;
                            }
                        }
                    }
                }
                obj = 1;
                if (obj != null) {
                    a = mo97a(viewGroup2, ahVar, ahVar2);
                    if (a != null) {
                        if (ahVar2 == null) {
                            animator = a;
                            i2 = size;
                            i3 = i;
                            view = ahVar.f995b;
                            obj2 = animator;
                            ahVar4 = null;
                        } else {
                            view = ahVar2.f995b;
                            a2 = mo173a();
                            if (view != null) {
                            }
                            i2 = size;
                            i3 = i;
                            a = a;
                            ahVar3 = null;
                            obj2 = a;
                            ahVar4 = ahVar3;
                        }
                        if (obj2 == null) {
                            if (transition.f945f != null) {
                                a3 = transition.f945f.mo3736a(viewGroup2, transition, ahVar, ahVar2);
                                sparseIntArray.put(transition.f936G.size(), (int) a3);
                                j = Math.min(a3, j);
                            }
                            j2 = j;
                            p.put(obj2, new C0260a(view, m964o(), this, au.m1007b(viewGroup), ahVar4));
                            transition.f936G.add(obj2);
                            j = j2;
                        }
                        i = i3 + 1;
                        size = i2;
                    }
                }
            }
            i2 = size;
            i3 = i;
            i = i3 + 1;
            size = i2;
        }
        if (j != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator2 = (Animator) transition.f936G.get(sparseIntArray.keyAt(i5));
                animator2.setStartDelay((((long) sparseIntArray.valueAt(i5)) - j) + animator2.getStartDelay());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    boolean m946b(android.view.View r6) {
        /*
        r5 = this;
        r0 = r6.getId();
        r1 = r5.f951n;
        r2 = 0;
        if (r1 == 0) goto L_0x0016;
    L_0x0009:
        r1 = r5.f951n;
        r3 = java.lang.Integer.valueOf(r0);
        r1 = r1.contains(r3);
        if (r1 == 0) goto L_0x0016;
    L_0x0015:
        return r2;
    L_0x0016:
        r1 = r5.f952o;
        if (r1 == 0) goto L_0x0023;
    L_0x001a:
        r1 = r5.f952o;
        r1 = r1.contains(r6);
        if (r1 == 0) goto L_0x0023;
    L_0x0022:
        return r2;
    L_0x0023:
        r1 = r5.f953p;
        if (r1 == 0) goto L_0x0042;
    L_0x0027:
        r1 = r5.f953p;
        r1 = r1.size();
        r3 = 0;
    L_0x002e:
        if (r3 >= r1) goto L_0x0042;
    L_0x0030:
        r4 = r5.f953p;
        r4 = r4.get(r3);
        r4 = (java.lang.Class) r4;
        r4 = r4.isInstance(r6);
        if (r4 == 0) goto L_0x003f;
    L_0x003e:
        return r2;
    L_0x003f:
        r3 = r3 + 1;
        goto L_0x002e;
    L_0x0042:
        r1 = r5.f954q;
        if (r1 == 0) goto L_0x0059;
    L_0x0046:
        r1 = android.support.v4.view.C0560r.m2202n(r6);
        if (r1 == 0) goto L_0x0059;
    L_0x004c:
        r1 = r5.f954q;
        r3 = android.support.v4.view.C0560r.m2202n(r6);
        r1 = r1.contains(r3);
        if (r1 == 0) goto L_0x0059;
    L_0x0058:
        return r2;
    L_0x0059:
        r1 = r5.f941b;
        r1 = r1.size();
        r3 = 1;
        if (r1 != 0) goto L_0x0083;
    L_0x0062:
        r1 = r5.f942c;
        r1 = r1.size();
        if (r1 != 0) goto L_0x0083;
    L_0x006a:
        r1 = r5.f950m;
        if (r1 == 0) goto L_0x0076;
    L_0x006e:
        r1 = r5.f950m;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0083;
    L_0x0076:
        r1 = r5.f949l;
        if (r1 == 0) goto L_0x0082;
    L_0x007a:
        r1 = r5.f949l;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0083;
    L_0x0082:
        return r3;
    L_0x0083:
        r1 = r5.f941b;
        r0 = java.lang.Integer.valueOf(r0);
        r0 = r1.contains(r0);
        if (r0 != 0) goto L_0x00c9;
    L_0x008f:
        r0 = r5.f942c;
        r0 = r0.contains(r6);
        if (r0 == 0) goto L_0x0098;
    L_0x0097:
        goto L_0x00c9;
    L_0x0098:
        r0 = r5.f949l;
        if (r0 == 0) goto L_0x00a9;
    L_0x009c:
        r0 = r5.f949l;
        r1 = android.support.v4.view.C0560r.m2202n(r6);
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x00a9;
    L_0x00a8:
        return r3;
    L_0x00a9:
        r0 = r5.f950m;
        if (r0 == 0) goto L_0x00c8;
    L_0x00ad:
        r0 = 0;
    L_0x00ae:
        r1 = r5.f950m;
        r1 = r1.size();
        if (r0 >= r1) goto L_0x00c8;
    L_0x00b6:
        r1 = r5.f950m;
        r1 = r1.get(r0);
        r1 = (java.lang.Class) r1;
        r1 = r1.isInstance(r6);
        if (r1 == 0) goto L_0x00c5;
    L_0x00c4:
        return r3;
    L_0x00c5:
        r0 = r0 + 1;
        goto L_0x00ae;
    L_0x00c8:
        return r2;
    L_0x00c9:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.Transition.b(android.view.View):boolean");
    }

    /* renamed from: p */
    private static C3131a<Animator, C0260a> mo215p() {
        C3131a<Animator, C0260a> c3131a = (C3131a) f929z.get();
        if (c3131a != null) {
            return c3131a;
        }
        c3131a = new C3131a();
        f929z.set(c3131a);
        return c3131a;
    }

    /* renamed from: e */
    protected void mo211e() {
        m959j();
        C3131a p = mo215p();
        Iterator it = this.f936G.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p.containsKey(animator)) {
                m959j();
                m910a(animator, p);
            }
        }
        this.f936G.clear();
        m960k();
    }

    /* renamed from: a */
    private void m910a(Animator animator, final C3131a<Animator, C0260a> c3131a) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter(this) {
                /* renamed from: b */
                final /* synthetic */ Transition f920b;

                public void onAnimationStart(Animator animator) {
                    this.f920b.f931B.add(animator);
                }

                public void onAnimationEnd(Animator animator) {
                    c3131a.remove(animator);
                    this.f920b.f931B.remove(animator);
                }
            });
            m930a(animator);
        }
    }

    /* renamed from: c */
    public Transition mo207c(View view) {
        this.f942c.add(view);
        return this;
    }

    /* renamed from: d */
    public Transition mo210d(View view) {
        this.f942c.remove(view);
        return this;
    }

    /* renamed from: f */
    public List<Integer> m954f() {
        return this.f941b;
    }

    /* renamed from: g */
    public List<View> m956g() {
        return this.f942c;
    }

    /* renamed from: h */
    public List<String> m957h() {
        return this.f949l;
    }

    /* renamed from: i */
    public List<Class> m958i() {
        return this.f950m;
    }

    /* renamed from: a */
    void m936a(ViewGroup viewGroup, boolean z) {
        m945b(z);
        if ((this.f941b.size() > 0 || this.f942c.size() > 0) && (this.f949l == null || this.f949l.isEmpty())) {
            int i;
            View view;
            if (this.f950m != null) {
                if (this.f950m.isEmpty()) {
                }
            }
            for (i = 0; i < this.f941b.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f941b.get(i)).intValue());
                if (findViewById != null) {
                    ah ahVar = new ah();
                    ahVar.f995b = findViewById;
                    if (z) {
                        mo98a(ahVar);
                    } else {
                        mo99b(ahVar);
                    }
                    ahVar.f996c.add(this);
                    mo208c(ahVar);
                    if (z) {
                        m912a(this.f958u, findViewById, ahVar);
                    } else {
                        m912a(this.f959v, findViewById, ahVar);
                    }
                }
            }
            for (viewGroup = null; viewGroup < this.f942c.size(); viewGroup++) {
                view = (View) this.f942c.get(viewGroup);
                ah ahVar2 = new ah();
                ahVar2.f995b = view;
                if (z) {
                    mo98a(ahVar2);
                } else {
                    mo99b(ahVar2);
                }
                ahVar2.f996c.add(this);
                mo208c(ahVar2);
                if (z) {
                    m912a(this.f958u, view, ahVar2);
                } else {
                    m912a(this.f959v, view, ahVar2);
                }
            }
            if (!z && this.f938I != null) {
                viewGroup = this.f938I.size();
                z = new ArrayList(viewGroup);
                for (i = 0; i < viewGroup; i++) {
                    z.add(this.f958u.f1000d.remove((String) this.f938I.m1585b(i)));
                }
                for (int i2 = 0; i2 < viewGroup; i2++) {
                    view = (View) z.get(i2);
                    if (view != null) {
                        this.f958u.f1000d.put((String) this.f938I.m1586c(i2), view);
                    }
                }
                return;
            }
        }
        m922c(viewGroup, z);
        if (!z) {
        }
    }

    /* renamed from: a */
    private static void m912a(ai aiVar, View view, ah ahVar) {
        aiVar.f997a.put(view, ahVar);
        ahVar = view.getId();
        if (ahVar >= null) {
            if (aiVar.f998b.indexOfKey(ahVar) >= 0) {
                aiVar.f998b.put(ahVar, null);
            } else {
                aiVar.f998b.put(ahVar, view);
            }
        }
        ahVar = C0560r.m2202n(view);
        if (ahVar != null) {
            if (aiVar.f1000d.containsKey(ahVar)) {
                aiVar.f1000d.put(ahVar, null);
            } else {
                aiVar.f1000d.put(ahVar, view);
            }
        }
        if ((view.getParent() instanceof ListView) != null) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (aiVar.f999c.m1546c(itemIdAtPosition) >= null) {
                    view = (View) aiVar.f999c.m1539a(itemIdAtPosition);
                    if (view != null) {
                        C0560r.m2181a(view, (boolean) null);
                        aiVar.f999c.m1545b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0560r.m2181a(view, true);
                aiVar.f999c.m1545b(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: b */
    void m945b(boolean z) {
        if (z) {
            this.f958u.f997a.clear();
            this.f958u.f998b.clear();
            this.f958u.f999c.m1548c();
            return;
        }
        this.f959v.f997a.clear();
        this.f959v.f998b.clear();
        this.f959v.f999c.m1548c();
    }

    /* renamed from: c */
    private void m922c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            if (this.f951n != null && this.f951n.contains(Integer.valueOf(id))) {
                return;
            }
            if (this.f952o == null || !this.f952o.contains(view)) {
                int size;
                if (this.f953p != null) {
                    size = this.f953p.size();
                    int i = 0;
                    while (i < size) {
                        if (!((Class) this.f953p.get(i)).isInstance(view)) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    ah ahVar = new ah();
                    ahVar.f995b = view;
                    if (z) {
                        mo98a(ahVar);
                    } else {
                        mo99b(ahVar);
                    }
                    ahVar.f996c.add(this);
                    mo208c(ahVar);
                    if (z) {
                        m912a(this.f958u, view, ahVar);
                    } else {
                        m912a(this.f959v, view, ahVar);
                    }
                }
                if ((view instanceof ViewGroup) && (this.f955r == null || !this.f955r.contains(Integer.valueOf(id)))) {
                    if (this.f956s == null || !this.f956s.contains(view)) {
                        if (this.f957t != null) {
                            id = this.f957t.size();
                            size = 0;
                            while (size < id) {
                                if (!((Class) this.f957t.get(size)).isInstance(view)) {
                                    size++;
                                } else {
                                    return;
                                }
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                            m922c(viewGroup.getChildAt(i2), z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public ah m928a(View view, boolean z) {
        if (this.f943d != null) {
            return this.f943d.m928a(view, z);
        }
        return (ah) (z ? this.f958u : this.f959v).f997a.get(view);
    }

    /* renamed from: b */
    ah m943b(View view, boolean z) {
        if (this.f943d != null) {
            return this.f943d.m943b(view, z);
        }
        ArrayList arrayList = z ? this.f961x : this.f962y;
        ah ahVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            ah ahVar2 = (ah) arrayList.get(i2);
            if (ahVar2 == null) {
                return null;
            }
            if (ahVar2.f995b == view) {
                i = i2;
                break;
            }
        }
        if (i >= 0) {
            ahVar = (ah) (z ? this.f962y : this.f961x).get(i);
        }
        return ahVar;
    }

    /* renamed from: e */
    public void mo212e(View view) {
        if (!this.f934E) {
            C3131a p = mo215p();
            int size = p.size();
            view = au.m1007b(view);
            for (size--; size >= 0; size--) {
                C0260a c0260a = (C0260a) p.m1586c(size);
                if (c0260a.f922a != null && view.equals(c0260a.f925d)) {
                    C0265a.m965a((Animator) p.m1585b(size));
                }
            }
            if (this.f935F != null && this.f935F.size() > null) {
                ArrayList arrayList = (ArrayList) this.f935F.clone();
                int size2 = arrayList.size();
                for (size = 0; size < size2; size++) {
                    ((C0262c) arrayList.get(size)).mo176b(this);
                }
            }
            this.f933D = true;
        }
    }

    /* renamed from: f */
    public void mo213f(View view) {
        if (this.f933D) {
            if (!this.f934E) {
                C3131a p = mo215p();
                int size = p.size();
                view = au.m1007b(view);
                for (size--; size >= 0; size--) {
                    C0260a c0260a = (C0260a) p.m1586c(size);
                    if (c0260a.f922a != null && view.equals(c0260a.f925d)) {
                        C0265a.m967b((Animator) p.m1585b(size));
                    }
                }
                if (this.f935F != null && this.f935F.size() > null) {
                    ArrayList arrayList = (ArrayList) this.f935F.clone();
                    int size2 = arrayList.size();
                    for (size = 0; size < size2; size++) {
                        ((C0262c) arrayList.get(size)).mo177c(this);
                    }
                }
            }
            this.f933D = false;
        }
    }

    /* renamed from: a */
    void m934a(ViewGroup viewGroup) {
        this.f961x = new ArrayList();
        this.f962y = new ArrayList();
        m911a(this.f958u, this.f959v);
        C3131a p = mo215p();
        int size = p.size();
        be b = au.m1007b(viewGroup);
        for (size--; size >= 0; size--) {
            Animator animator = (Animator) p.m1585b(size);
            if (animator != null) {
                C0260a c0260a = (C0260a) p.get(animator);
                if (!(c0260a == null || c0260a.f922a == null || !b.equals(c0260a.f925d))) {
                    ah ahVar = c0260a.f924c;
                    View view = c0260a.f922a;
                    ah a = m928a(view, true);
                    ah b2 = m943b(view, true);
                    Object obj = (!(a == null && b2 == null) && c0260a.f926e.mo218a(ahVar, b2)) ? 1 : null;
                    if (obj != null) {
                        if (!animator.isRunning()) {
                            if (!animator.isStarted()) {
                                p.remove(animator);
                            }
                        }
                        animator.cancel();
                    }
                }
            }
        }
        mo204a(viewGroup, this.f958u, this.f959v, this.f961x, this.f962y);
        mo211e();
    }

    /* renamed from: a */
    public boolean mo218a(ah ahVar, ah ahVar2) {
        if (ahVar == null || ahVar2 == null) {
            return false;
        }
        String[] a = mo173a();
        if (a != null) {
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!m918a(ahVar, ahVar2, a[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a2 : ahVar.f994a.keySet()) {
            if (m918a(ahVar, ahVar2, a2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: a */
    private static boolean m918a(ah ahVar, ah ahVar2, String str) {
        ahVar = ahVar.f994a.get(str);
        ahVar2 = ahVar2.f994a.get(str);
        if (ahVar == null && ahVar2 == null) {
            return null;
        }
        if (ahVar == null) {
            return true;
        }
        if (ahVar2 == null) {
            return true;
        }
        return 1 ^ ahVar.equals(ahVar2);
    }

    /* renamed from: a */
    protected void m930a(Animator animator) {
        if (animator == null) {
            m960k();
            return;
        }
        if (m940b() >= 0) {
            animator.setDuration(m940b());
        }
        if (m947c() >= 0) {
            animator.setStartDelay(m947c());
        }
        if (m950d() != null) {
            animator.setInterpolator(m950d());
        }
        animator.addListener(new C02593(this));
        animator.start();
    }

    /* renamed from: j */
    protected void m959j() {
        if (this.f932C == 0) {
            if (this.f935F != null && this.f935F.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f935F.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0262c) arrayList.get(i)).mo178d(this);
                }
            }
            this.f934E = false;
        }
        this.f932C++;
    }

    /* renamed from: k */
    protected void m960k() {
        this.f932C--;
        if (this.f932C == 0) {
            int i;
            View view;
            if (this.f935F != null && this.f935F.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f935F.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0262c) arrayList.get(i2)).mo175a(this);
                }
            }
            for (i = 0; i < this.f958u.f999c.m1542b(); i++) {
                view = (View) this.f958u.f999c.m1547c(i);
                if (view != null) {
                    C0560r.m2181a(view, false);
                }
            }
            for (i = 0; i < this.f959v.f999c.m1542b(); i++) {
                view = (View) this.f959v.f999c.m1547c(i);
                if (view != null) {
                    C0560r.m2181a(view, false);
                }
            }
            this.f934E = true;
        }
    }

    /* renamed from: a */
    public Transition mo199a(C0262c c0262c) {
        if (this.f935F == null) {
            this.f935F = new ArrayList();
        }
        this.f935F.add(c0262c);
        return this;
    }

    /* renamed from: b */
    public Transition mo206b(C0262c c0262c) {
        if (this.f935F == null) {
            return this;
        }
        this.f935F.remove(c0262c);
        if (this.f935F.size() == null) {
            this.f935F = null;
        }
        return this;
    }

    /* renamed from: l */
    public PathMotion m961l() {
        return this.f939J;
    }

    /* renamed from: a */
    public void mo202a(C0261b c0261b) {
        this.f937H = c0261b;
    }

    /* renamed from: m */
    public Rect m962m() {
        if (this.f937H == null) {
            return null;
        }
        return this.f937H.mo174a(this);
    }

    /* renamed from: a */
    public void mo203a(af afVar) {
        this.f945f = afVar;
    }

    /* renamed from: c */
    void mo208c(ah ahVar) {
        if (!(this.f945f == null || ahVar.f994a.isEmpty())) {
            String[] a = this.f945f.mo237a();
            if (a != null) {
                Object obj = null;
                for (Object containsKey : a) {
                    if (!ahVar.f994a.containsKey(containsKey)) {
                        break;
                    }
                }
                obj = 1;
                if (obj == null) {
                    this.f945f.mo236a(ahVar);
                }
            }
        }
    }

    public String toString() {
        return mo201a("");
    }

    /* renamed from: n */
    public android.support.transition.Transition mo214n() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = 0;
        r1 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1 = (android.support.transition.Transition) r1;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2 = new java.util.ArrayList;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2.<init>();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f936G = r2;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2 = new android.support.transition.ai;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2.<init>();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f958u = r2;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2 = new android.support.transition.ai;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2.<init>();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f959v = r2;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f961x = r0;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f962y = r0;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        return r1;
    L_0x0021:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.Transition.n():android.support.transition.Transition");
    }

    /* renamed from: o */
    public String m964o() {
        return this.f946i;
    }

    /* renamed from: a */
    String mo201a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(": ");
        str = stringBuilder.toString();
        if (this.f940a != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dur(");
            stringBuilder.append(this.f940a);
            stringBuilder.append(") ");
            str = stringBuilder.toString();
        }
        if (this.f947j != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dly(");
            stringBuilder.append(this.f947j);
            stringBuilder.append(") ");
            str = stringBuilder.toString();
        }
        if (this.f948k != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("interp(");
            stringBuilder.append(this.f948k);
            stringBuilder.append(") ");
            str = stringBuilder.toString();
        }
        if (this.f941b.size() <= 0 && this.f942c.size() <= 0) {
            return str;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("tgts(");
        str = stringBuilder.toString();
        if (this.f941b.size() > 0) {
            String str2 = str;
            for (str = null; str < this.f941b.size(); str++) {
                StringBuilder stringBuilder2;
                if (str > null) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str2);
                    stringBuilder2.append(", ");
                    str2 = stringBuilder2.toString();
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str2);
                stringBuilder2.append(this.f941b.get(str));
                str2 = stringBuilder2.toString();
            }
            str = str2;
        }
        if (this.f942c.size() > 0) {
            for (int i = 0; i < this.f942c.size(); i++) {
                if (i > 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(", ");
                    str = stringBuilder.toString();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(this.f942c.get(i));
                str = stringBuilder.toString();
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
