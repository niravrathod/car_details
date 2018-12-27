package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0563t;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.support.v4.app.t */
public abstract class C0361t {
    /* renamed from: a */
    public abstract Object mo179a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public abstract void mo180a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo181a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo182a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo183a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo184a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo185a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo186a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo187a(Object obj);

    /* renamed from: b */
    public abstract Object mo188b(Object obj);

    /* renamed from: b */
    public abstract Object mo189b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo190b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo191b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo192b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo193c(Object obj);

    /* renamed from: c */
    public abstract void mo194c(Object obj, View view);

    /* renamed from: a */
    protected void m1299a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    ArrayList<String> m1298a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(C0560r.m2202n(view));
            C0560r.m2180a(view, null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    void m1300a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String n = C0560r.m2202n(view2);
            arrayList4.add(n);
            if (n != null) {
                C0560r.m2180a(view2, null);
                String str = (String) map.get(n);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        C0560r.m2180a((View) arrayList2.get(i2), n);
                        break;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        aa.m1142a(view, new Runnable(this) {
            /* renamed from: f */
            final /* synthetic */ C0361t f1232f;

            public void run() {
                for (int i = 0; i < size; i++) {
                    C0560r.m2180a((View) arrayList5.get(i), (String) arrayList6.get(i));
                    C0560r.m2180a((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        });
    }

    /* renamed from: a */
    void m1310a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0563t.m2219a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m1310a((ArrayList) arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: a */
    void m1311a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String n = C0560r.m2202n(view);
            if (n != null) {
                map.put(n, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m1311a((Map) map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    void m1301a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        aa.m1142a(view, new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C0361t f1235c;

            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String n = C0560r.m2202n(view);
                    if (n != null) {
                        C0560r.m2180a(view, C0361t.m1293a(map, n));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    void m1303a(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        aa.m1142a(viewGroup, new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C0361t f1238c;

            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    C0560r.m2180a(view, (String) map.get(C0560r.m2202n(view)));
                }
            }
        });
    }

    /* renamed from: a */
    protected static void m1294a(List<View> list, View view) {
        int size = list.size();
        if (!C0361t.m1296a((List) list, view, size)) {
            list.add(view);
            for (view = size; view < list.size(); view++) {
                View view2 = (View) list.get(view);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (!C0361t.m1296a((List) list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m1296a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static boolean m1295a(List list) {
        if (list != null) {
            if (list.isEmpty() == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    static String m1293a(Map<String, String> map, String str) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }
}
