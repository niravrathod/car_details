package com.google.gson.internal;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    /* renamed from: a */
    static final /* synthetic */ boolean f11157a = (LinkedTreeMap.class.desiredAssertionStatus() ^ 1);
    /* renamed from: b */
    private static final Comparator<Comparable> f11158b = new C26331();
    Comparator<? super K> comparator;
    private C2634a entrySet;
    final C2637d<K, V> header;
    private C2635b keySet;
    int modCount;
    C2637d<K, V> root;
    int size;

    /* renamed from: com.google.gson.internal.LinkedTreeMap$1 */
    static class C26331 implements Comparator<Comparable> {
        C26331() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m12914a((Comparable) obj, (Comparable) obj2);
        }

        /* renamed from: a */
        public int m12914a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$a */
    class C2634a extends AbstractSet<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ LinkedTreeMap f11143a;

        /* renamed from: com.google.gson.internal.LinkedTreeMap$a$1 */
        class C42141 extends C2636c<Entry<K, V>> {
            /* renamed from: a */
            final /* synthetic */ C2634a f17779a;

            C42141(C2634a c2634a) {
                this.f17779a = c2634a;
                super(c2634a.f11143a);
            }

            public /* synthetic */ Object next() {
                return m23136a();
            }

            /* renamed from: a */
            public Entry<K, V> m23136a() {
                return m12915b();
            }
        }

        C2634a(LinkedTreeMap linkedTreeMap) {
            this.f11143a = linkedTreeMap;
        }

        public int size() {
            return this.f11143a.size;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C42141(this);
        }

        public boolean contains(Object obj) {
            return (!(obj instanceof Entry) || this.f11143a.m12925a((Entry) obj) == null) ? null : true;
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C2637d a = this.f11143a.m12925a((Entry) obj);
            if (a == null) {
                return false;
            }
            this.f11143a.m12926a(a, true);
            return true;
        }

        public void clear() {
            this.f11143a.clear();
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$b */
    final class C2635b extends AbstractSet<K> {
        /* renamed from: a */
        final /* synthetic */ LinkedTreeMap f11144a;

        /* renamed from: com.google.gson.internal.LinkedTreeMap$b$1 */
        class C42151 extends C2636c<K> {
            /* renamed from: a */
            final /* synthetic */ C2635b f17780a;

            C42151(C2635b c2635b) {
                this.f17780a = c2635b;
                super(c2635b.f11144a);
            }

            public K next() {
                return m12915b().f11154f;
            }
        }

        C2635b(LinkedTreeMap linkedTreeMap) {
            this.f11144a = linkedTreeMap;
        }

        public int size() {
            return this.f11144a.size;
        }

        public Iterator<K> iterator() {
            return new C42151(this);
        }

        public boolean contains(Object obj) {
            return this.f11144a.containsKey(obj);
        }

        public boolean remove(Object obj) {
            return this.f11144a.m12927b(obj) != null ? true : null;
        }

        public void clear() {
            this.f11144a.clear();
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$c */
    private abstract class C2636c<T> implements Iterator<T> {
        /* renamed from: b */
        C2637d<K, V> f11145b = this.f11148e.header.f11152d;
        /* renamed from: c */
        C2637d<K, V> f11146c = null;
        /* renamed from: d */
        int f11147d = this.f11148e.modCount;
        /* renamed from: e */
        final /* synthetic */ LinkedTreeMap f11148e;

        C2636c(LinkedTreeMap linkedTreeMap) {
            this.f11148e = linkedTreeMap;
        }

        public final boolean hasNext() {
            return this.f11145b != this.f11148e.header;
        }

        /* renamed from: b */
        final C2637d<K, V> m12915b() {
            C2637d<K, V> c2637d = this.f11145b;
            if (c2637d == this.f11148e.header) {
                throw new NoSuchElementException();
            } else if (this.f11148e.modCount == this.f11147d) {
                this.f11145b = c2637d.f11152d;
                this.f11146c = c2637d;
                return c2637d;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final void remove() {
            if (this.f11146c != null) {
                this.f11148e.m12926a(this.f11146c, true);
                this.f11146c = null;
                this.f11147d = this.f11148e.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$d */
    static final class C2637d<K, V> implements Entry<K, V> {
        /* renamed from: a */
        C2637d<K, V> f11149a;
        /* renamed from: b */
        C2637d<K, V> f11150b;
        /* renamed from: c */
        C2637d<K, V> f11151c;
        /* renamed from: d */
        C2637d<K, V> f11152d;
        /* renamed from: e */
        C2637d<K, V> f11153e;
        /* renamed from: f */
        final K f11154f;
        /* renamed from: g */
        V f11155g;
        /* renamed from: h */
        int f11156h;

        C2637d() {
            this.f11154f = null;
            this.f11153e = this;
            this.f11152d = this;
        }

        C2637d(C2637d<K, V> c2637d, K k, C2637d<K, V> c2637d2, C2637d<K, V> c2637d3) {
            this.f11149a = c2637d;
            this.f11154f = k;
            this.f11156h = 1;
            this.f11152d = c2637d2;
            this.f11153e = c2637d3;
            c2637d3.f11152d = this;
            c2637d2.f11153e = this;
        }

        public K getKey() {
            return this.f11154f;
        }

        public V getValue() {
            return this.f11155g;
        }

        public V setValue(V v) {
            V v2 = this.f11155g;
            this.f11155g = v;
            return v2;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
            r3 = this;
            r0 = r4 instanceof java.util.Map.Entry;
            r1 = 0;
            if (r0 == 0) goto L_0x0037;
        L_0x0005:
            r4 = (java.util.Map.Entry) r4;
            r0 = r3.f11154f;
            if (r0 != 0) goto L_0x0012;
        L_0x000b:
            r0 = r4.getKey();
            if (r0 != 0) goto L_0x0036;
        L_0x0011:
            goto L_0x001e;
        L_0x0012:
            r0 = r3.f11154f;
            r2 = r4.getKey();
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0036;
        L_0x001e:
            r0 = r3.f11155g;
            if (r0 != 0) goto L_0x0029;
        L_0x0022:
            r4 = r4.getValue();
            if (r4 != 0) goto L_0x0036;
        L_0x0028:
            goto L_0x0035;
        L_0x0029:
            r0 = r3.f11155g;
            r4 = r4.getValue();
            r4 = r0.equals(r4);
            if (r4 == 0) goto L_0x0036;
        L_0x0035:
            r1 = 1;
        L_0x0036:
            return r1;
        L_0x0037:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.d.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 0;
            int hashCode = this.f11154f == null ? 0 : this.f11154f.hashCode();
            if (this.f11155g != null) {
                i = this.f11155g.hashCode();
            }
            return hashCode ^ i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f11154f);
            stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
            stringBuilder.append(this.f11155g);
            return stringBuilder.toString();
        }

        /* renamed from: a */
        public C2637d<K, V> m12916a() {
            C2637d<K, V> c2637d = this;
            for (C2637d<K, V> c2637d2 = this.f11150b; c2637d2 != null; c2637d2 = c2637d2.f11150b) {
                c2637d = c2637d2;
            }
            return c2637d;
        }

        /* renamed from: b */
        public C2637d<K, V> m12917b() {
            C2637d<K, V> c2637d = this;
            for (C2637d<K, V> c2637d2 = this.f11151c; c2637d2 != null; c2637d2 = c2637d2.f11151c) {
                c2637d = c2637d2;
            }
            return c2637d;
        }
    }

    public LinkedTreeMap() {
        this(f11158b);
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.header = new C2637d();
        if (comparator == null) {
            comparator = f11158b;
        }
        this.comparator = comparator;
    }

    public int size() {
        return this.size;
    }

    public V get(Object obj) {
        obj = m12923a(obj);
        return obj != null ? obj.f11155g : null;
    }

    public boolean containsKey(Object obj) {
        return m12923a(obj) != null ? true : null;
    }

    public V put(K k, V v) {
        if (k != null) {
            k = m12924a((Object) k, true);
            V v2 = k.f11155g;
            k.f11155g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C2637d c2637d = this.header;
        c2637d.f11153e = c2637d;
        c2637d.f11152d = c2637d;
    }

    public V remove(Object obj) {
        obj = m12927b(obj);
        return obj != null ? obj.f11155g : null;
    }

    /* renamed from: a */
    C2637d<K, V> m12924a(K k, boolean z) {
        int compareTo;
        Comparator comparator = this.comparator;
        C2637d c2637d = this.root;
        if (c2637d != null) {
            Comparable comparable = comparator == f11158b ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    compareTo = comparable.compareTo(c2637d.f11154f);
                } else {
                    compareTo = comparator.compare(k, c2637d.f11154f);
                }
                if (compareTo == 0) {
                    return c2637d;
                }
                C2637d c2637d2;
                if (compareTo < 0) {
                    c2637d2 = c2637d.f11150b;
                } else {
                    c2637d2 = c2637d.f11151c;
                }
                if (c2637d2 == null) {
                    break;
                }
                c2637d = c2637d2;
            }
        } else {
            compareTo = 0;
        }
        if (!z) {
            return null;
        }
        C2637d<K, V> c2637d3;
        z = this.header;
        if (c2637d == null) {
            if (comparator == f11158b) {
                if (!(k instanceof Comparable)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(k.getClass().getName());
                    stringBuilder.append(" is not Comparable");
                    throw new ClassCastException(stringBuilder.toString());
                }
            }
            c2637d3 = new C2637d(c2637d, k, z, z.f11153e);
            this.root = c2637d3;
        } else {
            c2637d3 = new C2637d(c2637d, k, z, z.f11153e);
            if (compareTo < 0) {
                c2637d.f11150b = c2637d3;
            } else {
                c2637d.f11151c = c2637d3;
            }
            m12922b(c2637d, true);
        }
        this.size += 1;
        this.modCount += 1;
        return c2637d3;
    }

    /* renamed from: a */
    com.google.gson.internal.LinkedTreeMap.C2637d<K, V> m12923a(java.lang.Object r3) {
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
        r2 = this;
        r0 = 0;
        if (r3 == 0) goto L_0x000a;
    L_0x0003:
        r1 = 0;
        r3 = r2.m12924a(r3, r1);	 Catch:{ ClassCastException -> 0x0009 }
        goto L_0x000b;
    L_0x0009:
        return r0;
    L_0x000a:
        r3 = r0;
    L_0x000b:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.a(java.lang.Object):com.google.gson.internal.LinkedTreeMap$d<K, V>");
    }

    /* renamed from: a */
    C2637d<K, V> m12925a(Entry<?, ?> entry) {
        C2637d<K, V> a = m12923a(entry.getKey());
        entry = (a == null || m12920a(a.f11155g, entry.getValue()) == null) ? null : true;
        return entry != null ? a : null;
    }

    /* renamed from: a */
    private boolean m12920a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    void m12926a(C2637d<K, V> c2637d, boolean z) {
        if (z) {
            c2637d.f11153e.f11152d = c2637d.f11152d;
            c2637d.f11152d.f11153e = c2637d.f11153e;
        }
        C2637d c2637d2 = c2637d.f11150b;
        C2637d c2637d3 = c2637d.f11151c;
        C2637d c2637d4 = c2637d.f11149a;
        int i = 0;
        if (!c2637d2 != false || c2637d3 == null) {
            if (c2637d2 == true) {
                m12919a((C2637d) c2637d, c2637d2);
                c2637d.f11150b = null;
            } else if (c2637d3 != null) {
                m12919a((C2637d) c2637d, c2637d3);
                c2637d.f11151c = null;
            } else {
                m12919a((C2637d) c2637d, null);
            }
            m12922b(c2637d4, false);
            this.size--;
            this.modCount++;
            return;
        }
        int i2;
        c2637d2 = c2637d2.f11156h > c2637d3.f11156h ? c2637d2.m12917b() : c2637d3.m12916a();
        m12926a(c2637d2, false);
        c2637d3 = c2637d.f11150b;
        if (c2637d3 != null) {
            i2 = c2637d3.f11156h;
            c2637d2.f11150b = c2637d3;
            c2637d3.f11149a = c2637d2;
            c2637d.f11150b = null;
        } else {
            i2 = 0;
        }
        c2637d3 = c2637d.f11151c;
        if (c2637d3 != null) {
            i = c2637d3.f11156h;
            c2637d2.f11151c = c2637d3;
            c2637d3.f11149a = c2637d2;
            c2637d.f11151c = null;
        }
        c2637d2.f11156h = Math.max(i2, i) + 1;
        m12919a((C2637d) c2637d, c2637d2);
    }

    /* renamed from: b */
    C2637d<K, V> m12927b(Object obj) {
        C2637d a = m12923a(obj);
        if (a != null) {
            m12926a(a, true);
        }
        return a;
    }

    /* renamed from: a */
    private void m12919a(C2637d<K, V> c2637d, C2637d<K, V> c2637d2) {
        C2637d c2637d3 = c2637d.f11149a;
        c2637d.f11149a = null;
        if (c2637d2 != null) {
            c2637d2.f11149a = c2637d3;
        }
        if (c2637d3 == null) {
            this.root = c2637d2;
        } else if (c2637d3.f11150b == c2637d) {
            c2637d3.f11150b = c2637d2;
        } else {
            if (!f11157a) {
                if (c2637d3.f11151c != c2637d) {
                    throw new AssertionError();
                }
            }
            c2637d3.f11151c = c2637d2;
        }
    }

    /* renamed from: b */
    private void m12922b(C2637d<K, V> c2637d, boolean z) {
        C2637d c2637d2;
        while (c2637d2 != null) {
            C2637d c2637d3 = c2637d2.f11150b;
            C2637d c2637d4 = c2637d2.f11151c;
            int i = 0;
            int i2 = c2637d3 != null ? c2637d3.f11156h : 0;
            int i3 = c2637d4 != null ? c2637d4.f11156h : 0;
            int i4 = i2 - i3;
            C2637d c2637d5;
            if (i4 == -2) {
                c2637d3 = c2637d4.f11150b;
                c2637d5 = c2637d4.f11151c;
                i2 = c2637d5 != null ? c2637d5.f11156h : 0;
                if (c2637d3 != null) {
                    i = c2637d3.f11156h;
                }
                i -= i2;
                if (i != -1) {
                    if (i != 0 || z) {
                        if (!f11157a) {
                            if (i != 1) {
                                throw new AssertionError();
                            }
                        }
                        m12921b(c2637d4);
                        m12918a(c2637d2);
                        if (z) {
                            return;
                        }
                    }
                }
                m12918a(c2637d2);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                c2637d4 = c2637d3.f11150b;
                c2637d5 = c2637d3.f11151c;
                i2 = c2637d5 != null ? c2637d5.f11156h : 0;
                if (c2637d4 != null) {
                    i = c2637d4.f11156h;
                }
                i -= i2;
                if (i != 1) {
                    if (i != 0 || z) {
                        if (!f11157a) {
                            if (i != -1) {
                                throw new AssertionError();
                            }
                        }
                        m12918a(c2637d3);
                        m12921b(c2637d2);
                        if (z) {
                            return;
                        }
                    }
                }
                m12921b(c2637d2);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                c2637d2.f11156h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                if (!(f11157a || i4 == -1)) {
                    if (i4 != 1) {
                        throw new AssertionError();
                    }
                }
                c2637d2.f11156h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            c2637d2 = c2637d2.f11149a;
        }
    }

    /* renamed from: a */
    private void m12918a(C2637d<K, V> c2637d) {
        C2637d c2637d2 = c2637d.f11150b;
        C2637d c2637d3 = c2637d.f11151c;
        C2637d c2637d4 = c2637d3.f11150b;
        C2637d c2637d5 = c2637d3.f11151c;
        c2637d.f11151c = c2637d4;
        if (c2637d4 != null) {
            c2637d4.f11149a = c2637d;
        }
        m12919a((C2637d) c2637d, c2637d3);
        c2637d3.f11150b = c2637d;
        c2637d.f11149a = c2637d3;
        int i = 0;
        c2637d.f11156h = Math.max(c2637d2 != null ? c2637d2.f11156h : 0, c2637d4 != null ? c2637d4.f11156h : 0) + 1;
        c2637d = c2637d.f11156h;
        if (c2637d5 != null) {
            i = c2637d5.f11156h;
        }
        c2637d3.f11156h = Math.max(c2637d, i) + 1;
    }

    /* renamed from: b */
    private void m12921b(C2637d<K, V> c2637d) {
        C2637d c2637d2 = c2637d.f11150b;
        C2637d c2637d3 = c2637d.f11151c;
        C2637d c2637d4 = c2637d2.f11150b;
        C2637d c2637d5 = c2637d2.f11151c;
        c2637d.f11150b = c2637d5;
        if (c2637d5 != null) {
            c2637d5.f11149a = c2637d;
        }
        m12919a((C2637d) c2637d, c2637d2);
        c2637d2.f11151c = c2637d;
        c2637d.f11149a = c2637d2;
        int i = 0;
        c2637d.f11156h = Math.max(c2637d3 != null ? c2637d3.f11156h : 0, c2637d5 != null ? c2637d5.f11156h : 0) + 1;
        c2637d = c2637d.f11156h;
        if (c2637d4 != null) {
            i = c2637d4.f11156h;
        }
        c2637d2.f11156h = Math.max(c2637d, i) + 1;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set c2634a = new C2634a(this);
        this.entrySet = c2634a;
        return c2634a;
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set c2635b = new C2635b(this);
        this.keySet = c2635b;
        return c2635b;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }
}
