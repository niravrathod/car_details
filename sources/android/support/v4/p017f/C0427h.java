package android.support.v4.p017f;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: android.support.v4.f.h */
abstract class C0427h<K, V> {
    /* renamed from: b */
    C0423b f1439b;
    /* renamed from: c */
    C0424c f1440c;
    /* renamed from: d */
    C0426e f1441d;

    /* renamed from: android.support.v4.f.h$a */
    final class C0422a<T> implements Iterator<T> {
        /* renamed from: a */
        final int f1427a;
        /* renamed from: b */
        int f1428b;
        /* renamed from: c */
        int f1429c;
        /* renamed from: d */
        boolean f1430d = false;
        /* renamed from: e */
        final /* synthetic */ C0427h f1431e;

        C0422a(C0427h c0427h, int i) {
            this.f1431e = c0427h;
            this.f1427a = i;
            this.f1428b = c0427h.mo329a();
        }

        public boolean hasNext() {
            return this.f1429c < this.f1428b;
        }

        public T next() {
            if (hasNext()) {
                T a = this.f1431e.mo331a(this.f1429c, this.f1427a);
                this.f1429c++;
                this.f1430d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1430d) {
                this.f1429c--;
                this.f1428b--;
                this.f1430d = false;
                this.f1431e.mo333a(this.f1429c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: android.support.v4.f.h$b */
    final class C0423b implements Set<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ C0427h f1432a;

        C0423b(C0427h c0427h) {
            this.f1432a = c0427h;
        }

        public /* synthetic */ boolean add(Object obj) {
            return m1549a((Entry) obj);
        }

        /* renamed from: a */
        public boolean m1549a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = this.f1432a.mo329a();
            for (Entry entry : collection) {
                this.f1432a.mo334a(entry.getKey(), entry.getValue());
            }
            return a != this.f1432a.mo329a() ? true : null;
        }

        public void clear() {
            this.f1432a.mo337c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = this.f1432a.mo330a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0417c.m1532a(this.f1432a.mo331a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return null;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return this.f1432a.mo329a() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C0425d(this.f1432a);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f1432a.mo329a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return C0427h.m1552a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = this.f1432a.mo329a() - 1; a >= 0; a--) {
                int i2;
                int i3;
                Object a2 = this.f1432a.mo331a(a, 0);
                Object a3 = this.f1432a.mo331a(a, 1);
                if (a2 == null) {
                    i2 = 0;
                } else {
                    i2 = a2.hashCode();
                }
                if (a3 == null) {
                    i3 = 0;
                } else {
                    i3 = a3.hashCode();
                }
                i += i2 ^ i3;
            }
            return i;
        }
    }

    /* renamed from: android.support.v4.f.h$c */
    final class C0424c implements Set<K> {
        /* renamed from: a */
        final /* synthetic */ C0427h f1433a;

        C0424c(C0427h c0427h) {
            this.f1433a = c0427h;
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f1433a.mo337c();
        }

        public boolean contains(Object obj) {
            return this.f1433a.mo330a(obj) >= null ? true : null;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0427h.m1551a(this.f1433a.mo336b(), (Collection) collection);
        }

        public boolean isEmpty() {
            return this.f1433a.mo329a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0422a(this.f1433a, 0);
        }

        public boolean remove(Object obj) {
            int a = this.f1433a.mo330a(obj);
            if (a < null) {
                return null;
            }
            this.f1433a.mo333a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0427h.m1553b(this.f1433a.mo336b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0427h.m1554c(this.f1433a.mo336b(), collection);
        }

        public int size() {
            return this.f1433a.mo329a();
        }

        public Object[] toArray() {
            return this.f1433a.m1564b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f1433a.m1561a((Object[]) tArr, 0);
        }

        public boolean equals(Object obj) {
            return C0427h.m1552a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = this.f1433a.mo329a() - 1; a >= 0; a--) {
                int i2;
                Object a2 = this.f1433a.mo331a(a, 0);
                if (a2 == null) {
                    i2 = 0;
                } else {
                    i2 = a2.hashCode();
                }
                i += i2;
            }
            return i;
        }
    }

    /* renamed from: android.support.v4.f.h$d */
    final class C0425d implements Iterator<Entry<K, V>>, Entry<K, V> {
        /* renamed from: a */
        int f1434a;
        /* renamed from: b */
        int f1435b;
        /* renamed from: c */
        boolean f1436c = false;
        /* renamed from: d */
        final /* synthetic */ C0427h f1437d;

        public /* synthetic */ Object next() {
            return m1550a();
        }

        C0425d(C0427h c0427h) {
            this.f1437d = c0427h;
            this.f1434a = c0427h.mo329a() - 1;
            this.f1435b = -1;
        }

        public boolean hasNext() {
            return this.f1435b < this.f1434a;
        }

        /* renamed from: a */
        public Entry<K, V> m1550a() {
            if (hasNext()) {
                this.f1435b++;
                this.f1436c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1436c) {
                this.f1437d.mo333a(this.f1435b);
                this.f1435b--;
                this.f1434a--;
                this.f1436c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public K getKey() {
            if (this.f1436c) {
                return this.f1437d.mo331a(this.f1435b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f1436c) {
                return this.f1437d.mo331a(this.f1435b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V setValue(V v) {
            if (this.f1436c) {
                return this.f1437d.mo332a(this.f1435b, (Object) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object obj) {
            if (this.f1436c) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (C0417c.m1532a(entry.getKey(), this.f1437d.mo331a(this.f1435b, 0)) && C0417c.m1532a(entry.getValue(), this.f1437d.mo331a(this.f1435b, 1)) != null) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public int hashCode() {
            if (this.f1436c) {
                int i;
                int i2 = 0;
                Object a = this.f1437d.mo331a(this.f1435b, 0);
                Object a2 = this.f1437d.mo331a(this.f1435b, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 != null) {
                    i2 = a2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getKey());
            stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
            stringBuilder.append(getValue());
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v4.f.h$e */
    final class C0426e implements Collection<V> {
        /* renamed from: a */
        final /* synthetic */ C0427h f1438a;

        C0426e(C0427h c0427h) {
            this.f1438a = c0427h;
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f1438a.mo337c();
        }

        public boolean contains(Object obj) {
            return this.f1438a.mo335b(obj) >= null ? true : null;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return null;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return this.f1438a.mo329a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0422a(this.f1438a, 1);
        }

        public boolean remove(Object obj) {
            int b = this.f1438a.mo335b(obj);
            if (b < null) {
                return null;
            }
            this.f1438a.mo333a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int a = this.f1438a.mo329a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(this.f1438a.mo331a(i, 1))) {
                    this.f1438a.mo333a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int a = this.f1438a.mo329a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(this.f1438a.mo331a(i, 1))) {
                    this.f1438a.mo333a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return this.f1438a.mo329a();
        }

        public Object[] toArray() {
            return this.f1438a.m1564b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f1438a.m1561a((Object[]) tArr, 1);
        }
    }

    /* renamed from: a */
    protected abstract int mo329a();

    /* renamed from: a */
    protected abstract int mo330a(Object obj);

    /* renamed from: a */
    protected abstract Object mo331a(int i, int i2);

    /* renamed from: a */
    protected abstract V mo332a(int i, V v);

    /* renamed from: a */
    protected abstract void mo333a(int i);

    /* renamed from: a */
    protected abstract void mo334a(K k, V v);

    /* renamed from: b */
    protected abstract int mo335b(Object obj);

    /* renamed from: b */
    protected abstract Map<K, V> mo336b();

    /* renamed from: c */
    protected abstract void mo337c();

    C0427h() {
    }

    /* renamed from: a */
    public static <K, V> boolean m1551a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m1553b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size() ? true : null;
    }

    /* renamed from: c */
    public static <K, V> boolean m1554c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size() ? true : null;
    }

    /* renamed from: b */
    public Object[] m1564b(int i) {
        int a = mo329a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo331a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public <T> T[] m1561a(T[] tArr, int i) {
        int a = mo329a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo331a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = 0;
        }
        return tArr;
    }

    /* renamed from: a */
    public static <T> boolean m1552a(java.util.Set<T> r4, java.lang.Object r5) {
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
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof java.util.Set;
        r2 = 0;
        if (r1 == 0) goto L_0x0020;
    L_0x0009:
        r5 = (java.util.Set) r5;
        r1 = r4.size();	 Catch:{ NullPointerException -> 0x001f, ClassCastException -> 0x001e }
        r3 = r5.size();	 Catch:{ NullPointerException -> 0x001f, ClassCastException -> 0x001e }
        if (r1 != r3) goto L_0x001c;	 Catch:{ NullPointerException -> 0x001f, ClassCastException -> 0x001e }
    L_0x0015:
        r4 = r4.containsAll(r5);	 Catch:{ NullPointerException -> 0x001f, ClassCastException -> 0x001e }
        if (r4 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001d;
    L_0x001c:
        r0 = 0;
    L_0x001d:
        return r0;
    L_0x001e:
        return r2;
    L_0x001f:
        return r2;
    L_0x0020:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.h.a(java.util.Set, java.lang.Object):boolean");
    }

    /* renamed from: d */
    public Set<Entry<K, V>> m1566d() {
        if (this.f1439b == null) {
            this.f1439b = new C0423b(this);
        }
        return this.f1439b;
    }

    /* renamed from: e */
    public Set<K> m1567e() {
        if (this.f1440c == null) {
            this.f1440c = new C0424c(this);
        }
        return this.f1440c;
    }

    /* renamed from: f */
    public Collection<V> m1568f() {
        if (this.f1441d == null) {
            this.f1441d = new C0426e(this);
        }
        return this.f1441d;
    }
}
