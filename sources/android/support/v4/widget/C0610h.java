package android.support.v4.widget;

import android.support.v4.p017f.C0431k.C0430a;
import android.support.v4.p017f.C0431k.C3133b;
import android.support.v4.p017f.C0433m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.widget.h */
public final class C0610h<T> {
    /* renamed from: a */
    private final C0430a<ArrayList<T>> f1957a = new C3133b(10);
    /* renamed from: b */
    private final C0433m<T, ArrayList<T>> f1958b = new C0433m();
    /* renamed from: c */
    private final ArrayList<T> f1959c = new ArrayList();
    /* renamed from: d */
    private final HashSet<T> f1960d = new HashSet();

    /* renamed from: a */
    public void m2442a(T t) {
        if (!this.f1958b.containsKey(t)) {
            this.f1958b.put(t, null);
        }
    }

    /* renamed from: b */
    public boolean m2445b(T t) {
        return this.f1958b.containsKey(t);
    }

    /* renamed from: a */
    public void m2443a(T t, T t2) {
        if (this.f1958b.containsKey(t) && this.f1958b.containsKey(t2)) {
            ArrayList arrayList = (ArrayList) this.f1958b.get(t);
            if (arrayList == null) {
                arrayList = m2440c();
                this.f1958b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    /* renamed from: c */
    public List m2446c(T t) {
        return (List) this.f1958b.get(t);
    }

    /* renamed from: d */
    public List<T> m2447d(T t) {
        int size = this.f1958b.size();
        List<T> list = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1958b.m1586c(i);
            if (arrayList != null && arrayList.contains(t)) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(this.f1958b.m1585b(i));
            }
        }
        return list;
    }

    /* renamed from: e */
    public boolean m2448e(T t) {
        int size = this.f1958b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1958b.m1586c(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m2441a() {
        int size = this.f1958b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1958b.m1586c(i);
            if (arrayList != null) {
                m2439a(arrayList);
            }
        }
        this.f1958b.clear();
    }

    /* renamed from: b */
    public ArrayList<T> m2444b() {
        this.f1959c.clear();
        this.f1960d.clear();
        int size = this.f1958b.size();
        for (int i = 0; i < size; i++) {
            m2438a(this.f1958b.m1585b(i), this.f1959c, this.f1960d);
        }
        return this.f1959c;
    }

    /* renamed from: a */
    private void m2438a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (hashSet.contains(t)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(t);
            ArrayList arrayList2 = (ArrayList) this.f1958b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m2438a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
        }
    }

    /* renamed from: c */
    private ArrayList<T> m2440c() {
        ArrayList<T> arrayList = (ArrayList) this.f1957a.mo338a();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    /* renamed from: a */
    private void m2439a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1957a.mo339a(arrayList);
    }
}
