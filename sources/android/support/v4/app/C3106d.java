package android.support.v4.app;

import android.support.v4.app.C0334l.C0331a;
import android.support.v4.app.C3112m.C0345g;
import android.support.v4.app.Fragment.C0311b;
import android.support.v4.p017f.C0419e;
import android.support.v4.view.C0560r;
import android.util.Log;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.d */
final class C3106d extends C0347q implements C0331a, C0345g {
    /* renamed from: a */
    final C3112m f13118a;
    /* renamed from: b */
    ArrayList<C0326a> f13119b = new ArrayList();
    /* renamed from: c */
    int f13120c;
    /* renamed from: d */
    int f13121d;
    /* renamed from: e */
    int f13122e;
    /* renamed from: f */
    int f13123f;
    /* renamed from: g */
    int f13124g;
    /* renamed from: h */
    int f13125h;
    /* renamed from: i */
    boolean f13126i;
    /* renamed from: j */
    boolean f13127j = true;
    /* renamed from: k */
    String f13128k;
    /* renamed from: l */
    boolean f13129l;
    /* renamed from: m */
    int f13130m = -1;
    /* renamed from: n */
    int f13131n;
    /* renamed from: o */
    CharSequence f13132o;
    /* renamed from: p */
    int f13133p;
    /* renamed from: q */
    CharSequence f13134q;
    /* renamed from: r */
    ArrayList<String> f13135r;
    /* renamed from: s */
    ArrayList<String> f13136s;
    /* renamed from: t */
    boolean f13137t = false;
    /* renamed from: u */
    ArrayList<Runnable> f13138u;

    /* renamed from: android.support.v4.app.d$a */
    static final class C0326a {
        /* renamed from: a */
        int f1142a;
        /* renamed from: b */
        Fragment f1143b;
        /* renamed from: c */
        int f1144c;
        /* renamed from: d */
        int f1145d;
        /* renamed from: e */
        int f1146e;
        /* renamed from: f */
        int f1147f;

        C0326a() {
        }

        C0326a(int i, Fragment fragment) {
            this.f1142a = i;
            this.f1143b = fragment;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f13130m >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f13130m);
        }
        if (this.f13128k != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f13128k);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void m15354a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m15355a(str, printWriter, true);
    }

    /* renamed from: a */
    public void m15355a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f13128k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f13130m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f13129l);
            if (this.f13124g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f13124g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f13125h));
            }
            if (!(this.f13120c == 0 && this.f13121d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f13120c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f13121d));
            }
            if (!(this.f13122e == 0 && this.f13123f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f13122e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f13123f));
            }
            if (!(this.f13131n == 0 && this.f13132o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f13131n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f13132o);
            }
            if (!(this.f13133p == 0 && this.f13134q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f13133p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f13134q);
            }
        }
        if (!this.f13119b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("    ");
            stringBuilder.toString();
            int size = this.f13119b.size();
            for (int i = 0; i < size; i++) {
                String str2;
                C0326a c0326a = (C0326a) this.f13119b.get(i);
                switch (c0326a.f1142a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("cmd=");
                        stringBuilder2.append(c0326a.f1142a);
                        str2 = stringBuilder2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0326a.f1143b);
                if (z) {
                    if (!(c0326a.f1144c == 0 && c0326a.f1145d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0326a.f1144c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0326a.f1145d));
                    }
                    if (c0326a.f1146e != 0 || c0326a.f1147f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0326a.f1146e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0326a.f1147f));
                    }
                }
            }
        }
    }

    public C3106d(C3112m c3112m) {
        this.f13118a = c3112m;
    }

    /* renamed from: a */
    void m15353a(C0326a c0326a) {
        this.f13119b.add(c0326a);
        c0326a.f1144c = this.f13120c;
        c0326a.f1145d = this.f13121d;
        c0326a.f1146e = this.f13122e;
        c0326a.f1147f = this.f13123f;
    }

    /* renamed from: a */
    public C0347q mo271a(Fragment fragment, String str) {
        m15339a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0347q mo268a(int i, Fragment fragment) {
        m15339a(i, fragment, null, 1);
        return this;
    }

    /* renamed from: a */
    public C0347q mo269a(int i, Fragment fragment, String str) {
        m15339a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    private void m15339a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            fragment = new StringBuilder();
            fragment.append("Fragment ");
            fragment.append(cls.getCanonicalName());
            fragment.append(" must be a public static class to be  properly recreated from");
            fragment.append(" instance state.");
            throw new IllegalStateException(fragment.toString());
        }
        fragment.mFragmentManager = this.f13118a;
        if (str != null) {
            if (fragment.mTag != null) {
                if (!str.equals(fragment.mTag)) {
                    i2 = new StringBuilder();
                    i2.append("Can't change tag of fragment ");
                    i2.append(fragment);
                    i2.append(": was ");
                    i2.append(fragment.mTag);
                    i2.append(" now ");
                    i2.append(str);
                    throw new IllegalStateException(i2.toString());
                }
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i != -1) {
                if (fragment.mFragmentId != null) {
                    if (fragment.mFragmentId != i) {
                        i2 = new StringBuilder();
                        i2.append("Can't change container ID of fragment ");
                        i2.append(fragment);
                        i2.append(": was ");
                        i2.append(fragment.mFragmentId);
                        i2.append(" now ");
                        i2.append(i);
                        throw new IllegalStateException(i2.toString());
                    }
                }
                fragment.mFragmentId = i;
                fragment.mContainerId = i;
            } else {
                i2 = new StringBuilder();
                i2.append("Can't add fragment ");
                i2.append(fragment);
                i2.append(" with tag ");
                i2.append(str);
                i2.append(" to container view with no id");
                throw new IllegalArgumentException(i2.toString());
            }
        }
        m15353a(new C0326a(i2, fragment));
    }

    /* renamed from: b */
    public C0347q mo276b(int i, Fragment fragment) {
        return m15361b(i, fragment, null);
    }

    /* renamed from: b */
    public C0347q m15361b(int i, Fragment fragment, String str) {
        if (i != 0) {
            m15339a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: a */
    public C0347q mo270a(Fragment fragment) {
        m15353a(new C0326a(3, fragment));
        return this;
    }

    /* renamed from: b */
    public C0347q mo277b(Fragment fragment) {
        m15353a(new C0326a(6, fragment));
        return this;
    }

    /* renamed from: c */
    public C0347q mo279c(Fragment fragment) {
        m15353a(new C0326a(7, fragment));
        return this;
    }

    /* renamed from: d */
    public C0347q mo281d(Fragment fragment) {
        m15353a(new C0326a(8, fragment));
        return this;
    }

    /* renamed from: a */
    public C0347q mo267a(int i, int i2, int i3, int i4) {
        this.f13120c = i;
        this.f13121d = i2;
        this.f13122e = i3;
        this.f13123f = i4;
        return this;
    }

    /* renamed from: a */
    public C0347q mo272a(View view, String str) {
        if (C0353r.m1280a()) {
            view = C0560r.m2202n(view);
            if (view != null) {
                if (this.f13135r == null) {
                    this.f13135r = new ArrayList();
                    this.f13136s = new ArrayList();
                } else if (this.f13136s.contains(str)) {
                    r0 = new StringBuilder();
                    r0.append("A shared element with the target name '");
                    r0.append(str);
                    r0.append("' has already been added to the transaction.");
                    throw new IllegalArgumentException(r0.toString());
                } else if (this.f13135r.contains(view)) {
                    r0 = new StringBuilder();
                    r0.append("A shared element with the source name '");
                    r0.append(view);
                    r0.append(" has already been added to the transaction.");
                    throw new IllegalArgumentException(r0.toString());
                }
                this.f13135r.add(view);
                this.f13136s.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    /* renamed from: a */
    public C0347q mo273a(String str) {
        if (this.f13127j) {
            this.f13126i = true;
            this.f13128k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: a */
    public C0347q m15342a() {
        if (this.f13126i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f13127j = false;
        return this;
    }

    /* renamed from: a */
    void m15351a(int i) {
        if (this.f13126i) {
            if (C3112m.f13159a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Bump nesting in ");
                stringBuilder.append(this);
                stringBuilder.append(" by ");
                stringBuilder.append(i);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            int size = this.f13119b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0326a c0326a = (C0326a) this.f13119b.get(i2);
                if (c0326a.f1143b != null) {
                    Fragment fragment = c0326a.f1143b;
                    fragment.mBackStackNesting += i;
                    if (C3112m.f13159a) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Bump nesting of ");
                        stringBuilder2.append(c0326a.f1143b);
                        stringBuilder2.append(" to ");
                        stringBuilder2.append(c0326a.f1143b.mBackStackNesting);
                        Log.v("FragmentManager", stringBuilder2.toString());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void m15363b() {
        if (this.f13138u != null) {
            int size = this.f13138u.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) this.f13138u.get(i)).run();
            }
            this.f13138u = null;
        }
    }

    /* renamed from: c */
    public int mo278c() {
        return m15358b(false);
    }

    /* renamed from: d */
    public int mo280d() {
        return m15358b(true);
    }

    /* renamed from: e */
    public void mo282e() {
        m15342a();
        this.f13118a.m15472b((C0345g) this, false);
    }

    /* renamed from: f */
    public void mo283f() {
        m15342a();
        this.f13118a.m15472b((C0345g) this, true);
    }

    /* renamed from: a */
    public C0347q mo274a(boolean z) {
        this.f13137t = z;
        return this;
    }

    /* renamed from: b */
    int m15358b(boolean z) {
        if (this.f13129l) {
            throw new IllegalStateException("commit already called");
        }
        if (C3112m.f13159a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Commit: ");
            stringBuilder.append(this);
            Log.v("FragmentManager", stringBuilder.toString());
            PrintWriter printWriter = new PrintWriter(new C0419e("FragmentManager"));
            m15354a("  ", null, printWriter, null);
            printWriter.close();
        }
        this.f13129l = true;
        if (this.f13126i) {
            this.f13130m = this.f13118a.m15436a(this);
        } else {
            this.f13130m = -1;
        }
        this.f13118a.m15457a((C0345g) this, z);
        return this.f13130m;
    }

    /* renamed from: a */
    public boolean mo275a(ArrayList<C3106d> arrayList, ArrayList<Boolean> arrayList2) {
        if (C3112m.f13159a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Run: ");
            stringBuilder.append(this);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(null));
        if (this.f13126i != null) {
            this.f13118a.m15470b(this);
        }
        return true;
    }

    /* renamed from: b */
    boolean m15364b(int i) {
        int size = this.f13119b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0326a c0326a = (C0326a) this.f13119b.get(i2);
            int i3 = c0326a.f1143b != null ? c0326a.f1143b.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    boolean m15356a(ArrayList<C3106d> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f13119b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0326a c0326a = (C0326a) this.f13119b.get(i4);
            int i5 = c0326a.f1143b != null ? c0326a.f1143b.mContainerId : 0;
            if (!(i5 == 0 || i5 == r3)) {
                for (i3 = i; i3 < i2; i3++) {
                    C3106d c3106d = (C3106d) arrayList.get(i3);
                    int size2 = c3106d.f13119b.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        C0326a c0326a2 = (C0326a) c3106d.f13119b.get(i6);
                        if ((c0326a2.f1143b != null ? c0326a2.f1143b.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: g */
    void m15372g() {
        int size = this.f13119b.size();
        for (int i = 0; i < size; i++) {
            C0326a c0326a = (C0326a) this.f13119b.get(i);
            Fragment fragment = c0326a.f1143b;
            if (fragment != null) {
                fragment.setNextTransition(this.f13124g, this.f13125h);
            }
            int i2 = c0326a.f1142a;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        fragment.setNextAnim(c0326a.f1145d);
                        this.f13118a.m15499i(fragment);
                        break;
                    case 4:
                        fragment.setNextAnim(c0326a.f1145d);
                        this.f13118a.m15502j(fragment);
                        break;
                    case 5:
                        fragment.setNextAnim(c0326a.f1144c);
                        this.f13118a.m15503k(fragment);
                        break;
                    case 6:
                        fragment.setNextAnim(c0326a.f1145d);
                        this.f13118a.m15506l(fragment);
                        break;
                    case 7:
                        fragment.setNextAnim(c0326a.f1144c);
                        this.f13118a.m15508m(fragment);
                        break;
                    case 8:
                        this.f13118a.m15514p(fragment);
                        break;
                    case 9:
                        this.f13118a.m15514p(null);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown cmd: ");
                        stringBuilder.append(c0326a.f1142a);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            fragment.setNextAnim(c0326a.f1144c);
            this.f13118a.m15453a(fragment, false);
            if (!(this.f13137t || c0326a.f1142a == 1 || fragment == null)) {
                this.f13118a.m15491f(fragment);
            }
        }
        if (!this.f13137t) {
            this.f13118a.m15445a(this.f13118a.f13177l, true);
        }
    }

    /* renamed from: c */
    void m15367c(boolean z) {
        for (int size = this.f13119b.size() - 1; size >= 0; size--) {
            C0326a c0326a = (C0326a) this.f13119b.get(size);
            Fragment fragment = c0326a.f1143b;
            if (fragment != null) {
                fragment.setNextTransition(C3112m.m15431e(this.f13124g), this.f13125h);
            }
            int i = c0326a.f1142a;
            if (i != 1) {
                switch (i) {
                    case 3:
                        fragment.setNextAnim(c0326a.f1146e);
                        this.f13118a.m15453a(fragment, false);
                        break;
                    case 4:
                        fragment.setNextAnim(c0326a.f1146e);
                        this.f13118a.m15503k(fragment);
                        break;
                    case 5:
                        fragment.setNextAnim(c0326a.f1147f);
                        this.f13118a.m15502j(fragment);
                        break;
                    case 6:
                        fragment.setNextAnim(c0326a.f1146e);
                        this.f13118a.m15508m(fragment);
                        break;
                    case 7:
                        fragment.setNextAnim(c0326a.f1147f);
                        this.f13118a.m15506l(fragment);
                        break;
                    case 8:
                        this.f13118a.m15514p(null);
                        break;
                    case 9:
                        this.f13118a.m15514p(fragment);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown cmd: ");
                        stringBuilder.append(c0326a.f1142a);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            fragment.setNextAnim(c0326a.f1147f);
            this.f13118a.m15499i(fragment);
            if (!(this.f13137t || c0326a.f1142a == 3 || fragment == null)) {
                this.f13118a.m15491f(fragment);
            }
        }
        if (!this.f13137t && z) {
            this.f13118a.m15445a(this.f13118a.f13177l, true);
        }
    }

    /* renamed from: a */
    Fragment m15341a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        fragment = null;
        while (fragment < this.f13119b.size()) {
            C0326a c0326a = (C0326a) this.f13119b.get(fragment);
            switch (c0326a.f1142a) {
                case 1:
                case 7:
                    arrayList.add(c0326a.f1143b);
                    break;
                case 2:
                    Fragment fragment3 = c0326a.f1143b;
                    int i = fragment3.mContainerId;
                    Fragment fragment4 = fragment2;
                    int i2 = fragment;
                    fragment = null;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.mContainerId == i) {
                            if (fragment5 == fragment3) {
                                fragment = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f13119b.add(i2, new C0326a(9, fragment5));
                                    i2++;
                                    fragment4 = null;
                                }
                                C0326a c0326a2 = new C0326a(3, fragment5);
                                c0326a2.f1144c = c0326a.f1144c;
                                c0326a2.f1146e = c0326a.f1146e;
                                c0326a2.f1145d = c0326a.f1145d;
                                c0326a2.f1147f = c0326a.f1147f;
                                this.f13119b.add(i2, c0326a2);
                                arrayList.remove(fragment5);
                                i2++;
                            }
                        }
                    }
                    if (fragment != null) {
                        this.f13119b.remove(i2);
                        i2--;
                    } else {
                        c0326a.f1142a = 1;
                        arrayList.add(fragment3);
                    }
                    fragment = i2;
                    fragment2 = fragment4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(c0326a.f1143b);
                    if (c0326a.f1143b != fragment2) {
                        break;
                    }
                    this.f13119b.add(fragment, new C0326a(9, c0326a.f1143b));
                    fragment++;
                    fragment2 = null;
                    break;
                case 8:
                    this.f13119b.add(fragment, new C0326a(9, fragment2));
                    fragment++;
                    fragment2 = c0326a.f1143b;
                    break;
                default:
                    break;
            }
            fragment += 1;
        }
        return fragment2;
    }

    /* renamed from: b */
    Fragment m15359b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.f13119b.size(); i++) {
            C0326a c0326a = (C0326a) this.f13119b.get(i);
            int i2 = c0326a.f1142a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c0326a.f1143b;
                            break;
                        default:
                            break;
                    }
                }
                arrayList.add(c0326a.f1143b);
            }
            arrayList.remove(c0326a.f1143b);
        }
        return fragment;
    }

    /* renamed from: h */
    boolean m15373h() {
        for (int i = 0; i < this.f13119b.size(); i++) {
            if (C3106d.m15340b((C0326a) this.f13119b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    void m15352a(C0311b c0311b) {
        for (int i = 0; i < this.f13119b.size(); i++) {
            C0326a c0326a = (C0326a) this.f13119b.get(i);
            if (C3106d.m15340b(c0326a)) {
                c0326a.f1143b.setOnStartEnterTransitionListener(c0311b);
            }
        }
    }

    /* renamed from: b */
    private static boolean m15340b(C0326a c0326a) {
        c0326a = c0326a.f1143b;
        return (c0326a == null || !c0326a.mAdded || c0326a.mView == null || c0326a.mDetached || c0326a.mHidden || c0326a.isPostponed() == null) ? null : true;
    }

    /* renamed from: i */
    public String mo284i() {
        return this.f13128k;
    }
}
