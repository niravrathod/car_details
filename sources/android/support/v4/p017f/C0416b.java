package android.support.v4.p017f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.f.b */
public final class C0416b<E> implements Collection<E>, Set<E> {
    /* renamed from: a */
    private static final int[] f1407a = new int[0];
    /* renamed from: b */
    private static final Object[] f1408b = new Object[0];
    /* renamed from: c */
    private static Object[] f1409c;
    /* renamed from: d */
    private static int f1410d;
    /* renamed from: e */
    private static Object[] f1411e;
    /* renamed from: f */
    private static int f1412f;
    /* renamed from: g */
    private int[] f1413g;
    /* renamed from: h */
    private Object[] f1414h;
    /* renamed from: i */
    private int f1415i;
    /* renamed from: j */
    private C0427h<E, E> f1416j;

    /* renamed from: android.support.v4.f.b$1 */
    class C31321 extends C0427h<E, E> {
        /* renamed from: a */
        final /* synthetic */ C0416b f13234a;

        C31321(C0416b c0416b) {
            this.f13234a = c0416b;
        }

        /* renamed from: a */
        protected int mo329a() {
            return this.f13234a.f1415i;
        }

        /* renamed from: a */
        protected Object mo331a(int i, int i2) {
            return this.f13234a.f1414h[i];
        }

        /* renamed from: a */
        protected int mo330a(Object obj) {
            return this.f13234a.m1525a(obj);
        }

        /* renamed from: b */
        protected int mo335b(Object obj) {
            return this.f13234a.m1525a(obj);
        }

        /* renamed from: b */
        protected Map<E, E> mo336b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: a */
        protected void mo334a(E e, E e2) {
            this.f13234a.add(e);
        }

        /* renamed from: a */
        protected E mo332a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: a */
        protected void mo333a(int i) {
            this.f13234a.m1528c(i);
        }

        /* renamed from: c */
        protected void mo337c() {
            this.f13234a.clear();
        }
    }

    /* renamed from: a */
    private int m1520a(Object obj, int i) {
        int i2 = this.f1415i;
        if (i2 == 0) {
            return -1;
        }
        int a = C0417c.m1530a(this.f1413g, i2, i);
        if (a < 0 || obj.equals(this.f1414h[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1413g[i3] == i) {
            if (obj.equals(this.f1414h[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f1413g[a] == i) {
            if (obj.equals(this.f1414h[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private int m1518a() {
        int i = this.f1415i;
        if (i == 0) {
            return -1;
        }
        int a = C0417c.m1530a(this.f1413g, i, 0);
        if (a < 0 || this.f1414h[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1413g[i2] == 0) {
            if (this.f1414h[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f1413g[a] == 0) {
            if (this.f1414h[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    /* renamed from: d */
    private void m1524d(int i) {
        if (i == 8) {
            synchronized (C0416b.class) {
                if (f1411e != null) {
                    i = f1411e;
                    this.f1414h = i;
                    f1411e = (Object[]) i[0];
                    this.f1413g = (int[]) i[1];
                    i[1] = null;
                    i[0] = null;
                    f1412f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0416b.class) {
                if (f1409c != null) {
                    i = f1409c;
                    this.f1414h = i;
                    f1409c = (Object[]) i[0];
                    this.f1413g = (int[]) i[1];
                    i[1] = null;
                    i[0] = null;
                    f1410d--;
                    return;
                }
            }
        }
        this.f1413g = new int[i];
        this.f1414h = new Object[i];
    }

    /* renamed from: a */
    private static void m1521a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0416b.class) {
                if (f1412f < 10) {
                    objArr[0] = f1411e;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    f1411e = objArr;
                    f1412f += 1;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0416b.class) {
                if (f1410d < 10) {
                    objArr[0] = f1409c;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    f1409c = objArr;
                    f1410d += 1;
                }
            }
        }
    }

    public C0416b() {
        this(0);
    }

    public C0416b(int i) {
        if (i == 0) {
            this.f1413g = f1407a;
            this.f1414h = f1408b;
        } else {
            m1524d(i);
        }
        this.f1415i = 0;
    }

    public void clear() {
        if (this.f1415i != 0) {
            C0416b.m1521a(this.f1413g, this.f1414h, this.f1415i);
            this.f1413g = f1407a;
            this.f1414h = f1408b;
            this.f1415i = 0;
        }
    }

    /* renamed from: a */
    public void m1526a(int i) {
        if (this.f1413g.length < i) {
            Object obj = this.f1413g;
            Object obj2 = this.f1414h;
            m1524d(i);
            if (this.f1415i > 0) {
                System.arraycopy(obj, 0, this.f1413g, 0, this.f1415i);
                System.arraycopy(obj2, 0, this.f1414h, 0, this.f1415i);
            }
            C0416b.m1521a(obj, obj2, this.f1415i);
        }
    }

    public boolean contains(Object obj) {
        return m1525a(obj) >= null ? true : null;
    }

    /* renamed from: a */
    public int m1525a(Object obj) {
        return obj == null ? m1518a() : m1520a(obj, obj.hashCode());
    }

    /* renamed from: b */
    public E m1527b(int i) {
        return this.f1414h[i];
    }

    public boolean isEmpty() {
        return this.f1415i <= 0;
    }

    public boolean add(E e) {
        int a;
        int i;
        if (e == null) {
            a = m1518a();
            i = 0;
        } else {
            a = e.hashCode();
            i = a;
            a = m1520a(e, a);
        }
        if (a >= 0) {
            return false;
        }
        int i2;
        a ^= -1;
        if (this.f1415i >= this.f1413g.length) {
            i2 = 4;
            if (this.f1415i >= 8) {
                i2 = (this.f1415i >> 1) + this.f1415i;
            } else if (this.f1415i >= 4) {
                i2 = 8;
            }
            Object obj = this.f1413g;
            Object obj2 = this.f1414h;
            m1524d(i2);
            if (this.f1413g.length > 0) {
                System.arraycopy(obj, 0, this.f1413g, 0, obj.length);
                System.arraycopy(obj2, 0, this.f1414h, 0, obj2.length);
            }
            C0416b.m1521a(obj, obj2, this.f1415i);
        }
        if (a < this.f1415i) {
            i2 = a + 1;
            System.arraycopy(this.f1413g, a, this.f1413g, i2, this.f1415i - a);
            System.arraycopy(this.f1414h, a, this.f1414h, i2, this.f1415i - a);
        }
        this.f1413g[a] = i;
        this.f1414h[a] = e;
        this.f1415i += 1;
        return true;
    }

    public boolean remove(Object obj) {
        obj = m1525a(obj);
        if (obj < null) {
            return null;
        }
        m1528c(obj);
        return true;
    }

    /* renamed from: c */
    public E m1528c(int i) {
        E e = this.f1414h[i];
        if (this.f1415i <= 1) {
            C0416b.m1521a(this.f1413g, this.f1414h, this.f1415i);
            this.f1413g = f1407a;
            this.f1414h = f1408b;
            this.f1415i = 0;
        } else {
            int i2 = 8;
            int i3;
            if (this.f1413g.length <= 8 || this.f1415i >= this.f1413g.length / 3) {
                this.f1415i--;
                if (i < this.f1415i) {
                    i3 = i + 1;
                    System.arraycopy(this.f1413g, i3, this.f1413g, i, this.f1415i - i);
                    System.arraycopy(this.f1414h, i3, this.f1414h, i, this.f1415i - i);
                }
                this.f1414h[this.f1415i] = null;
            } else {
                if (this.f1415i > 8) {
                    i2 = (this.f1415i >> 1) + this.f1415i;
                }
                Object obj = this.f1413g;
                Object obj2 = this.f1414h;
                m1524d(i2);
                this.f1415i--;
                if (i > 0) {
                    System.arraycopy(obj, 0, this.f1413g, 0, i);
                    System.arraycopy(obj2, 0, this.f1414h, 0, i);
                }
                if (i < this.f1415i) {
                    i3 = i + 1;
                    System.arraycopy(obj, i3, this.f1413g, i, this.f1415i - i);
                    System.arraycopy(obj2, i3, this.f1414h, i, this.f1415i - i);
                }
            }
        }
        return e;
    }

    public int size() {
        return this.f1415i;
    }

    public Object[] toArray() {
        Object obj = new Object[this.f1415i];
        System.arraycopy(this.f1414h, 0, obj, 0, this.f1415i);
        return obj;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1415i) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1415i);
        }
        System.arraycopy(this.f1414h, 0, tArr, 0, this.f1415i);
        if (tArr.length > this.f1415i) {
            tArr[this.f1415i] = null;
        }
        return tArr;
    }

    public boolean equals(java.lang.Object r5) {
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
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof java.util.Set;
        r2 = 0;
        if (r1 == 0) goto L_0x002c;
    L_0x0009:
        r5 = (java.util.Set) r5;
        r1 = r4.size();
        r3 = r5.size();
        if (r1 == r3) goto L_0x0016;
    L_0x0015:
        return r2;
    L_0x0016:
        r1 = 0;
    L_0x0017:
        r3 = r4.f1415i;	 Catch:{ NullPointerException -> 0x002b, ClassCastException -> 0x002a }
        if (r1 >= r3) goto L_0x0029;	 Catch:{ NullPointerException -> 0x002b, ClassCastException -> 0x002a }
    L_0x001b:
        r3 = r4.m1527b(r1);	 Catch:{ NullPointerException -> 0x002b, ClassCastException -> 0x002a }
        r3 = r5.contains(r3);	 Catch:{ NullPointerException -> 0x002b, ClassCastException -> 0x002a }
        if (r3 != 0) goto L_0x0026;
    L_0x0025:
        return r2;
    L_0x0026:
        r1 = r1 + 1;
        goto L_0x0017;
    L_0x0029:
        return r0;
    L_0x002a:
        return r2;
    L_0x002b:
        return r2;
    L_0x002c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int[] iArr = this.f1413g;
        int i = 0;
        for (int i2 = 0; i2 < this.f1415i; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1415i * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1415i; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0416b b = m1527b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private C0427h<E, E> m1522b() {
        if (this.f1416j == null) {
            this.f1416j = new C31321(this);
        }
        return this.f1416j;
    }

    public Iterator<E> iterator() {
        return m1522b().m1567e().iterator();
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return null;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        m1526a(this.f1415i + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1415i - 1; i >= 0; i--) {
            if (!collection.contains(this.f1414h[i])) {
                m1528c(i);
                z = true;
            }
        }
        return z;
    }
}
