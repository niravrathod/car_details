package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.app.C3106d.C0326a;
import android.support.v4.p017f.C3131a;
import android.support.v4.view.C0560r;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.r */
class C0353r {
    /* renamed from: a */
    private static final int[] f1210a = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    /* renamed from: b */
    private static final C0361t f1211b = (VERSION.SDK_INT >= 21 ? new C3115s() : null);
    /* renamed from: c */
    private static final C0361t f1212c = C0353r.m1282b();

    /* renamed from: android.support.v4.app.r$a */
    static class C0352a {
        /* renamed from: a */
        public Fragment f1204a;
        /* renamed from: b */
        public boolean f1205b;
        /* renamed from: c */
        public C3106d f1206c;
        /* renamed from: d */
        public Fragment f1207d;
        /* renamed from: e */
        public boolean f1208e;
        /* renamed from: f */
        public C3106d f1209f;

        C0352a() {
        }
    }

    /* renamed from: b */
    private static android.support.v4.app.C0361t m1282b() {
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
        r0 = "android.support.transition.FragmentTransitionSupport";	 Catch:{ Exception -> 0x0016 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0016 }
        r1 = 0;	 Catch:{ Exception -> 0x0016 }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0016 }
        r0 = r0.getDeclaredConstructor(r2);	 Catch:{ Exception -> 0x0016 }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0016 }
        r0 = r0.newInstance(r1);	 Catch:{ Exception -> 0x0016 }
        r0 = (android.support.v4.app.C0361t) r0;	 Catch:{ Exception -> 0x0016 }
        return r0;
    L_0x0016:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.r.b():android.support.v4.app.t");
    }

    /* renamed from: a */
    static void m1273a(C3112m c3112m, ArrayList<C3106d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (c3112m.f13177l >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C3106d c3106d = (C3106d) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    C0353r.m1289b(c3106d, sparseArray, z);
                } else {
                    C0353r.m1271a(c3106d, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(c3112m.f13178m.m15390i());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C3131a a = C0353r.m1260a(keyAt, (ArrayList) arrayList, (ArrayList) arrayList2, i, i2);
                    C0352a c0352a = (C0352a) sparseArray.valueAt(i4);
                    if (z) {
                        C0353r.m1272a(c3112m, keyAt, c0352a, view, a);
                    } else {
                        C0353r.m1290b(c3112m, keyAt, c0352a, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static C3131a<String, String> m1260a(int i, ArrayList<C3106d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        C3131a<String, String> c3131a = new C3131a();
        for (i3--; i3 >= i2; i3--) {
            C3106d c3106d = (C3106d) arrayList.get(i3);
            if (c3106d.m15364b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i3)).booleanValue();
                if (c3106d.f13135r != null) {
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    int size = c3106d.f13135r.size();
                    if (booleanValue) {
                        arrayList3 = c3106d.f13135r;
                        arrayList4 = c3106d.f13136s;
                    } else {
                        ArrayList arrayList5 = c3106d.f13135r;
                        arrayList3 = c3106d.f13136s;
                        arrayList4 = arrayList5;
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = (String) arrayList4.get(i4);
                        String str2 = (String) arrayList3.get(i4);
                        String str3 = (String) c3131a.remove(str2);
                        if (str3 != null) {
                            c3131a.put(str, str3);
                        } else {
                            c3131a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c3131a;
    }

    /* renamed from: a */
    private static void m1272a(C3112m c3112m, int i, C0352a c0352a, View view, C3131a<String, String> c3131a) {
        C3112m c3112m2 = c3112m;
        C0352a c0352a2 = c0352a;
        View view2 = view;
        View view3 = c3112m2.f13179n.mo260a() ? (ViewGroup) c3112m2.f13179n.mo259a(i) : null;
        if (view3 != null) {
            Fragment fragment = c0352a2.f1204a;
            Fragment fragment2 = c0352a2.f1207d;
            C0361t a = C0353r.m1259a(fragment2, fragment);
            if (a != null) {
                boolean z = c0352a2.f1205b;
                boolean z2 = c0352a2.f1208e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a2 = C0353r.m1264a(a, fragment, z);
                Object b = C0353r.m1285b(a, fragment2, z2);
                Object obj = a2;
                View view4 = view3;
                ArrayList arrayList3 = arrayList2;
                Object a3 = C0353r.m1265a(a, (ViewGroup) view3, view, (C3131a) c3131a, c0352a, arrayList2, arrayList, a2, b);
                Object obj2 = obj;
                if (obj2 == null && a3 == null) {
                    a2 = b;
                    if (a2 == null) {
                        return;
                    }
                }
                a2 = b;
                ArrayList b2 = C0353r.m1287b(a, a2, fragment2, arrayList3, view2);
                ArrayList b3 = C0353r.m1287b(a, obj2, fragment, arrayList, view2);
                C0353r.m1291b(b3, 4);
                Fragment fragment3 = fragment;
                ArrayList arrayList4 = b2;
                Object a4 = C0353r.m1266a(a, obj2, a2, a3, fragment3, z);
                if (a4 != null) {
                    C0353r.m1275a(a, a2, fragment2, arrayList4);
                    ArrayList a5 = a.m1298a(arrayList);
                    a.mo184a(a4, obj2, b3, a2, arrayList4, a3, arrayList);
                    View view5 = view4;
                    a.mo180a((ViewGroup) view5, a4);
                    a.m1300a(view5, arrayList3, arrayList, a5, c3131a);
                    C0353r.m1291b(b3, 0);
                    a.mo186a(a3, arrayList3, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1275a(C0361t c0361t, Object obj, Fragment fragment, final ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            c0361t.mo191b(obj, fragment.getView(), (ArrayList) arrayList);
            aa.m1142a(fragment.mContainer, new Runnable() {
                public void run() {
                    C0353r.m1291b(arrayList, 4);
                }
            });
        }
    }

    /* renamed from: b */
    private static void m1290b(C3112m c3112m, int i, C0352a c0352a, View view, C3131a<String, String> c3131a) {
        C3112m c3112m2 = c3112m;
        C0352a c0352a2 = c0352a;
        View view2 = view;
        Map map = c3131a;
        ViewGroup viewGroup = c3112m2.f13179n.mo260a() ? (ViewGroup) c3112m2.f13179n.mo259a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = c0352a2.f1204a;
            Fragment fragment2 = c0352a2.f1207d;
            C0361t a = C0353r.m1259a(fragment2, fragment);
            if (a != null) {
                Object obj;
                Object obj2;
                Object a2;
                C0361t c0361t;
                ArrayList arrayList;
                boolean z = c0352a2.f1205b;
                boolean z2 = c0352a2.f1208e;
                Object a3 = C0353r.m1264a(a, fragment, z);
                Object b = C0353r.m1285b(a, fragment2, z2);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = arrayList2;
                Object obj3 = b;
                Object obj4 = a3;
                C0361t c0361t2 = a;
                b = C0353r.m1286b(a, viewGroup, view, c3131a, c0352a, arrayList2, arrayList3, a3, obj3);
                Object obj5 = obj4;
                if (obj5 == null && b == null) {
                    obj = obj3;
                    if (obj == null) {
                        return;
                    }
                }
                obj = obj3;
                ArrayList b2 = C0353r.m1287b(c0361t2, obj, fragment2, arrayList4, view2);
                if (b2 != null) {
                    if (!b2.isEmpty()) {
                        obj2 = obj;
                        c0361t2.mo190b(obj5, view2);
                        a2 = C0353r.m1266a(c0361t2, obj5, obj2, b, fragment, c0352a2.f1205b);
                        if (a2 != null) {
                            arrayList4 = new ArrayList();
                            c0361t = c0361t2;
                            c0361t.mo184a(a2, obj5, arrayList4, obj2, b2, b, arrayList3);
                            C0353r.m1274a(c0361t, viewGroup, fragment, view, arrayList3, obj5, arrayList4, obj2, b2);
                            arrayList = arrayList3;
                            c0361t2.m1301a((View) viewGroup, arrayList, map);
                            c0361t2.mo180a(viewGroup, a2);
                            c0361t2.m1303a(viewGroup, arrayList, map);
                        }
                    }
                }
                obj2 = null;
                c0361t2.mo190b(obj5, view2);
                a2 = C0353r.m1266a(c0361t2, obj5, obj2, b, fragment, c0352a2.f1205b);
                if (a2 != null) {
                    arrayList4 = new ArrayList();
                    c0361t = c0361t2;
                    c0361t.mo184a(a2, obj5, arrayList4, obj2, b2, b, arrayList3);
                    C0353r.m1274a(c0361t, viewGroup, fragment, view, arrayList3, obj5, arrayList4, obj2, b2);
                    arrayList = arrayList3;
                    c0361t2.m1301a((View) viewGroup, arrayList, map);
                    c0361t2.mo180a(viewGroup, a2);
                    c0361t2.m1303a(viewGroup, arrayList, map);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1274a(C0361t c0361t, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final C0361t c0361t2 = c0361t;
        final View view2 = view;
        final Fragment fragment2 = fragment;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        Runnable c03492 = new Runnable() {
            public void run() {
                if (obj3 != null) {
                    c0361t2.mo194c(obj3, view2);
                    arrayList5.addAll(C0353r.m1287b(c0361t2, obj3, fragment2, arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        c0361t2.mo192b(obj4, arrayList6, arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        };
        ViewGroup viewGroup2 = viewGroup;
        aa.m1142a(viewGroup, c03492);
    }

    /* renamed from: a */
    private static C0361t m1259a(Fragment fragment, Fragment fragment2) {
        List arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            exitTransition = fragment.getReturnTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            fragment = fragment.getSharedElementReturnTransition();
            if (fragment != null) {
                arrayList.add(fragment);
            }
        }
        if (fragment2 != null) {
            fragment = fragment2.getEnterTransition();
            if (fragment != null) {
                arrayList.add(fragment);
            }
            fragment = fragment2.getReenterTransition();
            if (fragment != null) {
                arrayList.add(fragment);
            }
            fragment = fragment2.getSharedElementEnterTransition();
            if (fragment != null) {
                arrayList.add(fragment);
            }
        }
        if (arrayList.isEmpty() != null) {
            return null;
        }
        if (f1211b != null && C0353r.m1281a(f1211b, arrayList) != null) {
            return f1211b;
        }
        if (f1212c != null && C0353r.m1281a(f1212c, arrayList) != null) {
            return f1212c;
        }
        if (f1211b == null && f1212c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static boolean m1281a(C0361t c0361t, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!c0361t.mo187a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m1263a(C0361t c0361t, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment != null) {
            if (fragment2 != null) {
                if (z) {
                    fragment = fragment2.getSharedElementReturnTransition();
                } else {
                    fragment = fragment.getSharedElementEnterTransition();
                }
                return c0361t.mo193c(c0361t.mo188b(fragment));
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Object m1264a(C0361t c0361t, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        if (z) {
            fragment = fragment.getReenterTransition();
        } else {
            fragment = fragment.getEnterTransition();
        }
        return c0361t.mo188b(fragment);
    }

    /* renamed from: b */
    private static Object m1285b(C0361t c0361t, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        if (z) {
            fragment = fragment.getReturnTransition();
        } else {
            fragment = fragment.getExitTransition();
        }
        return c0361t.mo188b(fragment);
    }

    /* renamed from: a */
    private static Object m1265a(C0361t c0361t, ViewGroup viewGroup, View view, C3131a<String, String> c3131a, C0352a c0352a, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0361t c0361t2 = c0361t;
        View view2 = view;
        C3131a c3131a2 = c3131a;
        C0352a c0352a2 = c0352a;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        Object obj3 = obj;
        Fragment fragment = c0352a2.f1204a;
        Fragment fragment2 = c0352a2.f1207d;
        if (fragment != null) {
            fragment.getView().setVisibility(0);
        }
        if (fragment != null) {
            if (fragment2 != null) {
                Object obj4;
                Object obj5;
                boolean z = c0352a2.f1205b;
                if (c3131a.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = C0353r.m1263a(c0361t2, fragment, fragment2, z);
                }
                C3131a b = C0353r.m1283b(c0361t2, c3131a2, obj4, c0352a2);
                C3131a c = C0353r.m1292c(c0361t2, c3131a2, obj4, c0352a2);
                if (c3131a.isEmpty()) {
                    if (b != null) {
                        b.clear();
                    }
                    if (c != null) {
                        c.clear();
                    }
                    obj5 = null;
                } else {
                    C0353r.m1279a(arrayList3, b, c3131a.keySet());
                    C0353r.m1279a(arrayList4, c, c3131a.values());
                    obj5 = obj4;
                }
                if (obj3 == null && obj2 == null && obj5 == null) {
                    return null;
                }
                Rect rect;
                View view3;
                C0353r.m1288b(fragment, fragment2, z, b, true);
                if (obj5 != null) {
                    arrayList4.add(view2);
                    c0361t2.mo183a(obj5, view2, arrayList3);
                    C0353r.m1276a(c0361t, obj5, obj2, b, c0352a2.f1208e, c0352a2.f1209f);
                    Rect rect2 = new Rect();
                    View b2 = C0353r.m1284b(c, c0352a2, obj3, z);
                    if (b2 != null) {
                        c0361t2.mo181a(obj3, rect2);
                    }
                    rect = rect2;
                    view3 = b2;
                } else {
                    view3 = null;
                    rect = view3;
                }
                final Fragment fragment3 = fragment;
                final Fragment fragment4 = fragment2;
                final boolean z2 = z;
                final C3131a c3131a3 = c;
                c0361t2 = c0361t;
                aa.m1142a(viewGroup, new Runnable() {
                    public void run() {
                        C0353r.m1288b(fragment3, fragment4, z2, c3131a3, false);
                        if (view3 != null) {
                            c0361t2.m1299a(view3, rect);
                        }
                    }
                });
                return obj5;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m1279a(ArrayList<View> arrayList, C3131a<String, View> c3131a, Collection<String> collection) {
        for (int size = c3131a.size() - 1; size >= 0; size--) {
            View view = (View) c3131a.m1586c(size);
            if (collection.contains(C0560r.m2202n(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: b */
    private static Object m1286b(C0361t c0361t, ViewGroup viewGroup, View view, C3131a<String, String> c3131a, C0352a c0352a, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0361t c0361t2 = c0361t;
        C0352a c0352a2 = c0352a;
        ArrayList arrayList3 = arrayList;
        Object obj3 = obj;
        Fragment fragment = c0352a2.f1204a;
        Fragment fragment2 = c0352a2.f1207d;
        if (fragment != null) {
            if (fragment2 != null) {
                C3131a c3131a2;
                Object obj4;
                Object obj5;
                boolean z = c0352a2.f1205b;
                if (c3131a.isEmpty()) {
                    c3131a2 = c3131a;
                    obj4 = null;
                } else {
                    obj4 = C0353r.m1263a(c0361t2, fragment, fragment2, z);
                    c3131a2 = c3131a;
                }
                C3131a b = C0353r.m1283b(c0361t2, c3131a2, obj4, c0352a2);
                if (c3131a.isEmpty()) {
                    obj5 = null;
                } else {
                    arrayList3.addAll(b.values());
                    obj5 = obj4;
                }
                if (obj3 == null && obj2 == null && obj5 == null) {
                    return null;
                }
                Rect rect;
                C0353r.m1288b(fragment, fragment2, z, b, true);
                if (obj5 != null) {
                    rect = new Rect();
                    c0361t2.mo183a(obj5, view, arrayList3);
                    C0353r.m1276a(c0361t, obj5, obj2, b, c0352a2.f1208e, c0352a2.f1209f);
                    if (obj3 != null) {
                        c0361t2.mo181a(obj3, rect);
                    }
                } else {
                    rect = null;
                }
                final C0361t c0361t3 = c0361t;
                final C3131a<String, String> c3131a3 = c3131a;
                final Object obj6 = obj5;
                final C0352a c0352a3 = c0352a;
                C03514 c03514 = r0;
                final ArrayList<View> arrayList4 = arrayList2;
                final View view2 = view;
                final Fragment fragment3 = fragment;
                fragment = fragment2;
                final boolean z2 = z;
                final ArrayList<View> arrayList5 = arrayList;
                obj3 = obj;
                final Rect rect2 = rect;
                C03514 c035142 = new Runnable() {
                    public void run() {
                        C3131a a = C0353r.m1292c(c0361t3, c3131a3, obj6, c0352a3);
                        if (a != null) {
                            arrayList4.addAll(a.values());
                            arrayList4.add(view2);
                        }
                        C0353r.m1288b(fragment3, fragment, z2, a, false);
                        if (obj6 != null) {
                            c0361t3.mo186a(obj6, arrayList5, arrayList4);
                            View a2 = C0353r.m1284b(a, c0352a3, obj3, z2);
                            if (a2 != null) {
                                c0361t3.m1299a(a2, rect2);
                            }
                        }
                    }
                };
                aa.m1142a(viewGroup, c03514);
                return obj5;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static C3131a<String, View> m1283b(C0361t c0361t, C3131a<String, String> c3131a, Object obj, C0352a c0352a) {
        if (!c3131a.isEmpty()) {
            if (obj != null) {
                obj = c0352a.f1207d;
                Map c3131a2 = new C3131a();
                c0361t.m1311a(c3131a2, obj.getView());
                c0361t = c0352a.f1209f;
                if (c0352a.f1208e != null) {
                    obj = obj.getEnterTransitionCallback();
                    c0361t = c0361t.f13136s;
                } else {
                    obj = obj.getExitTransitionCallback();
                    c0361t = c0361t.f13135r;
                }
                c3131a2.m15609a(c0361t);
                if (obj != null) {
                    obj.m1153a(c0361t, c3131a2);
                    for (obj = c0361t.size() - 1; obj >= null; obj--) {
                        String str = (String) c0361t.get(obj);
                        View view = (View) c3131a2.get(str);
                        if (view == null) {
                            c3131a.remove(str);
                        } else if (!str.equals(C0560r.m2202n(view))) {
                            c3131a.put(C0560r.m2202n(view), (String) c3131a.remove(str));
                        }
                    }
                } else {
                    c3131a.m15609a(c3131a2.keySet());
                }
                return c3131a2;
            }
        }
        c3131a.clear();
        return null;
    }

    /* renamed from: c */
    private static C3131a<String, View> m1292c(C0361t c0361t, C3131a<String, String> c3131a, Object obj, C0352a c0352a) {
        Fragment fragment = c0352a.f1204a;
        View view = fragment.getView();
        if (!(c3131a.isEmpty() || obj == null)) {
            if (view != null) {
                C3131a c3131a2 = new C3131a();
                c0361t.m1311a((Map) c3131a2, view);
                c0361t = c0352a.f1206c;
                if (c0352a.f1205b != null) {
                    c0352a = fragment.getExitTransitionCallback();
                    c0361t = c0361t.f13135r;
                } else {
                    c0352a = fragment.getEnterTransitionCallback();
                    c0361t = c0361t.f13136s;
                }
                if (c0361t != null) {
                    c3131a2.m15609a(c0361t);
                    c3131a2.m15609a(c3131a.values());
                }
                if (c0352a != null) {
                    c0352a.m1153a(c0361t, c3131a2);
                    for (c0352a = c0361t.size() - 1; c0352a >= null; c0352a--) {
                        String str = (String) c0361t.get(c0352a);
                        view = (View) c3131a2.get(str);
                        if (view == null) {
                            str = C0353r.m1267a((C3131a) c3131a, str);
                            if (str != null) {
                                c3131a.remove(str);
                            }
                        } else if (!str.equals(C0560r.m2202n(view))) {
                            str = C0353r.m1267a((C3131a) c3131a, str);
                            if (str != null) {
                                c3131a.put(str, C0560r.m2202n(view));
                            }
                        }
                    }
                } else {
                    C0353r.m1277a((C3131a) c3131a, c3131a2);
                }
                return c3131a2;
            }
        }
        c3131a.clear();
        return null;
    }

    /* renamed from: a */
    private static String m1267a(C3131a<String, String> c3131a, String str) {
        int size = c3131a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c3131a.m1586c(i))) {
                return (String) c3131a.m1585b(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static View m1284b(C3131a<String, View> c3131a, C0352a c0352a, Object obj, boolean z) {
        c0352a = c0352a.f1206c;
        if (obj == null || c3131a == null || c0352a.f13135r == null || c0352a.f13135r.isEmpty() != null) {
            return null;
        }
        if (z) {
            c0352a = (String) c0352a.f13135r.get(0);
        } else {
            c0352a = (String) c0352a.f13136s.get(0);
        }
        return (View) c3131a.get(c0352a);
    }

    /* renamed from: a */
    private static void m1276a(C0361t c0361t, Object obj, Object obj2, C3131a<String, View> c3131a, boolean z, C3106d c3106d) {
        if (c3106d.f13135r != null && !c3106d.f13135r.isEmpty()) {
            if (z) {
                z = (String) c3106d.f13136s.get(0);
            } else {
                z = (String) c3106d.f13135r.get(0);
            }
            View view = (View) c3131a.get(z);
            c0361t.mo182a(obj, view);
            if (obj2 != null) {
                c0361t.mo182a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m1277a(C3131a<String, String> c3131a, C3131a<String, View> c3131a2) {
        for (int size = c3131a.size() - 1; size >= 0; size--) {
            if (!c3131a2.containsKey((String) c3131a.m1586c(size))) {
                c3131a.mo3896d(size);
            }
        }
    }

    /* renamed from: b */
    private static void m1288b(Fragment fragment, Fragment fragment2, boolean z, C3131a<String, View> c3131a, boolean z2) {
        if (z) {
            fragment = fragment2.getEnterTransitionCallback();
        } else {
            fragment = fragment.getEnterTransitionCallback();
        }
        if (fragment != null) {
            int i;
            fragment2 = new ArrayList();
            z = new ArrayList();
            int i2 = 0;
            if (c3131a == null) {
                i = 0;
            } else {
                i = c3131a.size();
            }
            while (i2 < i) {
                z.add(c3131a.m1585b(i2));
                fragment2.add(c3131a.m1586c(i2));
                i2++;
            }
            if (z2) {
                fragment.m1152a(z, fragment2, null);
            } else {
                fragment.m1154b(z, fragment2, null);
            }
        }
    }

    /* renamed from: b */
    private static ArrayList<View> m1287b(C0361t c0361t, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View view2 = fragment.getView();
        if (view2 != null) {
            c0361t.m1310a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty() != null) {
            return arrayList2;
        }
        arrayList2.add(view);
        c0361t.mo185a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: b */
    private static void m1291b(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m1266a(C0361t c0361t, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        fragment = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        if (fragment != null) {
            return c0361t.mo179a(obj2, obj, obj3);
        }
        return c0361t.mo189b(obj2, obj, obj3);
    }

    /* renamed from: a */
    public static void m1271a(C3106d c3106d, SparseArray<C0352a> sparseArray, boolean z) {
        int size = c3106d.f13119b.size();
        for (int i = 0; i < size; i++) {
            C0353r.m1270a(c3106d, (C0326a) c3106d.f13119b.get(i), (SparseArray) sparseArray, false, z);
        }
    }

    /* renamed from: b */
    public static void m1289b(C3106d c3106d, SparseArray<C0352a> sparseArray, boolean z) {
        if (c3106d.f13118a.f13179n.mo260a()) {
            for (int size = c3106d.f13119b.size() - 1; size >= 0; size--) {
                C0353r.m1270a(c3106d, (C0326a) c3106d.f13119b.get(size), (SparseArray) sparseArray, true, z);
            }
        }
    }

    /* renamed from: a */
    static boolean m1280a() {
        if (f1211b == null) {
            if (f1212c == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m1270a(android.support.v4.app.C3106d r15, android.support.v4.app.C3106d.C0326a r16, android.util.SparseArray<android.support.v4.app.C0353r.C0352a> r17, boolean r18, boolean r19) {
        /*
        r0 = r15;
        r1 = r16;
        r2 = r17;
        r3 = r18;
        r10 = r1.f1143b;
        if (r10 != 0) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        r11 = r10.mContainerId;
        if (r11 != 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        if (r3 == 0) goto L_0x001a;
    L_0x0013:
        r4 = f1210a;
        r1 = r1.f1142a;
        r1 = r4[r1];
        goto L_0x001c;
    L_0x001a:
        r1 = r1.f1142a;
    L_0x001c:
        r4 = 0;
        r5 = 1;
        if (r1 == r5) goto L_0x007c;
    L_0x0020:
        switch(r1) {
            case 3: goto L_0x0052;
            case 4: goto L_0x003a;
            case 5: goto L_0x0028;
            case 6: goto L_0x0052;
            case 7: goto L_0x007c;
            default: goto L_0x0023;
        };
    L_0x0023:
        r1 = 0;
    L_0x0024:
        r12 = 0;
        r13 = 0;
        goto L_0x008f;
    L_0x0028:
        if (r19 == 0) goto L_0x0037;
    L_0x002a:
        r1 = r10.mHiddenChanged;
        if (r1 == 0) goto L_0x008b;
    L_0x002e:
        r1 = r10.mHidden;
        if (r1 != 0) goto L_0x008b;
    L_0x0032:
        r1 = r10.mAdded;
        if (r1 == 0) goto L_0x008b;
    L_0x0036:
        goto L_0x0089;
    L_0x0037:
        r1 = r10.mHidden;
        goto L_0x008c;
    L_0x003a:
        if (r19 == 0) goto L_0x0049;
    L_0x003c:
        r1 = r10.mHiddenChanged;
        if (r1 == 0) goto L_0x006d;
    L_0x0040:
        r1 = r10.mAdded;
        if (r1 == 0) goto L_0x006d;
    L_0x0044:
        r1 = r10.mHidden;
        if (r1 == 0) goto L_0x006d;
    L_0x0048:
        goto L_0x006b;
    L_0x0049:
        r1 = r10.mAdded;
        if (r1 == 0) goto L_0x006d;
    L_0x004d:
        r1 = r10.mHidden;
        if (r1 != 0) goto L_0x006d;
    L_0x0051:
        goto L_0x0048;
    L_0x0052:
        if (r19 == 0) goto L_0x006f;
    L_0x0054:
        r1 = r10.mAdded;
        if (r1 != 0) goto L_0x006d;
    L_0x0058:
        r1 = r10.mView;
        if (r1 == 0) goto L_0x006d;
    L_0x005c:
        r1 = r10.mView;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x006d;
    L_0x0064:
        r1 = r10.mPostponedAlpha;
        r6 = 0;
        r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r1 < 0) goto L_0x006d;
    L_0x006b:
        r1 = 1;
        goto L_0x0078;
    L_0x006d:
        r1 = 0;
        goto L_0x0078;
    L_0x006f:
        r1 = r10.mAdded;
        if (r1 == 0) goto L_0x006d;
    L_0x0073:
        r1 = r10.mHidden;
        if (r1 != 0) goto L_0x006d;
    L_0x0077:
        goto L_0x006b;
    L_0x0078:
        r13 = r1;
        r1 = 0;
        r12 = 1;
        goto L_0x008f;
    L_0x007c:
        if (r19 == 0) goto L_0x0081;
    L_0x007e:
        r1 = r10.mIsNewlyAdded;
        goto L_0x008c;
    L_0x0081:
        r1 = r10.mAdded;
        if (r1 != 0) goto L_0x008b;
    L_0x0085:
        r1 = r10.mHidden;
        if (r1 != 0) goto L_0x008b;
    L_0x0089:
        r1 = 1;
        goto L_0x008c;
    L_0x008b:
        r1 = 0;
    L_0x008c:
        r4 = r1;
        r1 = 1;
        goto L_0x0024;
    L_0x008f:
        r6 = r2.get(r11);
        r6 = (android.support.v4.app.C0353r.C0352a) r6;
        if (r4 == 0) goto L_0x00a1;
    L_0x0097:
        r6 = android.support.v4.app.C0353r.m1258a(r6, r2, r11);
        r6.f1204a = r10;
        r6.f1205b = r3;
        r6.f1206c = r0;
    L_0x00a1:
        r14 = r6;
        r9 = 0;
        if (r19 != 0) goto L_0x00c9;
    L_0x00a5:
        if (r1 == 0) goto L_0x00c9;
    L_0x00a7:
        if (r14 == 0) goto L_0x00af;
    L_0x00a9:
        r1 = r14.f1207d;
        if (r1 != r10) goto L_0x00af;
    L_0x00ad:
        r14.f1207d = r9;
    L_0x00af:
        r4 = r0.f13118a;
        r1 = r10.mState;
        if (r1 >= r5) goto L_0x00c9;
    L_0x00b5:
        r1 = r4.f13177l;
        if (r1 < r5) goto L_0x00c9;
    L_0x00b9:
        r1 = r0.f13137t;
        if (r1 != 0) goto L_0x00c9;
    L_0x00bd:
        r4.m15493g(r10);
        r6 = 1;
        r7 = 0;
        r8 = 0;
        r1 = 0;
        r5 = r10;
        r9 = r1;
        r4.m15449a(r5, r6, r7, r8, r9);
    L_0x00c9:
        if (r13 == 0) goto L_0x00db;
    L_0x00cb:
        if (r14 == 0) goto L_0x00d1;
    L_0x00cd:
        r1 = r14.f1207d;
        if (r1 != 0) goto L_0x00db;
    L_0x00d1:
        r14 = android.support.v4.app.C0353r.m1258a(r14, r2, r11);
        r14.f1207d = r10;
        r14.f1208e = r3;
        r14.f1209f = r0;
    L_0x00db:
        if (r19 != 0) goto L_0x00e8;
    L_0x00dd:
        if (r12 == 0) goto L_0x00e8;
    L_0x00df:
        if (r14 == 0) goto L_0x00e8;
    L_0x00e1:
        r0 = r14.f1204a;
        if (r0 != r10) goto L_0x00e8;
    L_0x00e5:
        r0 = 0;
        r14.f1204a = r0;
    L_0x00e8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.r.a(android.support.v4.app.d, android.support.v4.app.d$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static C0352a m1258a(C0352a c0352a, SparseArray<C0352a> sparseArray, int i) {
        if (c0352a != null) {
            return c0352a;
        }
        c0352a = new C0352a();
        sparseArray.put(i, c0352a);
        return c0352a;
    }
}
